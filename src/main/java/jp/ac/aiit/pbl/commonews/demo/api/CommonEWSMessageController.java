package jp.ac.aiit.pbl.commonews.demo.api;

import jp.ac.aiit.pbl.CommonEWSMessageDecoder;
import jp.ac.aiit.pbl.format.CommonEWSMessage;
import jp.ac.aiit.pbl.format.CommonEWSMessageFormat;
import jp.ac.aiit.pbl.format.sep2020.EWSSeptember2020;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CommonEWSMessageController {
    @GetMapping("/commonews")
    public List<CommonEWSMessageEntity> findAll(){
        CommonEWSMessageEntity commonEWSMessageEntity = new CommonEWSMessageEntity();
        commonEWSMessageEntity.setPreamble("PatternA");
        commonEWSMessageEntity.setMt("MT44");
        CommonEWSMessageEntity commonEWSMessageEntity2 = new CommonEWSMessageEntity();
        commonEWSMessageEntity2.setPreamble("PatternA");
        commonEWSMessageEntity2.setMt("MT44");
        List<CommonEWSMessageEntity> entities = new ArrayList<>();
        entities.add(commonEWSMessageEntity);
        entities.add(commonEWSMessageEntity2);

        return entities;
    }
    @GetMapping("/decode")
    public CommonEWSMessageEntity decode(@RequestParam("qzqsmdata") String qzqsm){
        CommonEWSMessageDecoder commonEWSMessageDecoder = new CommonEWSMessageDecoder(CommonEWSMessageFormat.SEPTEMBER2020);
        CommonEWSMessage message = commonEWSMessageDecoder.decode(qzqsm);
        CommonEWSMessageEntity entity = new CommonEWSMessageEntity();
        entity.setPreamble(message.getPrefix().getPreamble().toString());
        entity.setMt(message.getPrefix().getMessageType().toString());
        entity.setSeverity(message.getSeverity().toString());
        entity.setCountry(message.getCountry().toString());
        return entity;
    }
}
