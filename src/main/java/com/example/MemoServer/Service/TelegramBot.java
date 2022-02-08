package com.example.MemoServer.Service;

import org.apache.commons.io.FileUtils;   //file saving

import java.io.IOException;
import java.net.URL;
import java.io.InputStream;
import java.util.List;

import org.telegram.telegrambots.meta.api.methods.GetFile;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.springframework.beans.factory.annotation.Autowired;
//import com.example.botdatabased.models.UserCard;
//import com.example.botdatabased.repo.UserCardRepository;
import com.example.MemoServer.Repository.MemoHashRepository;
import com.example.MemoServer.Models.MemoHash;
import org.springframework.stereotype.Component;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.File;
import org.telegram.telegrambots.meta.api.objects.Update;

import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import static org.apache.commons.io.FileUtils.getFile;

@Component
public class TelegramBot extends TelegramLongPollingBot {

    //@Autowired
    // private UserCardRepository userCardRepository;

    @Autowired
    private MemoHashRepository memoHashRepository;

    @Override
    public String getBotUsername() {
        return "Denyska352_test_bot";
    }

    @Override
    public String getBotToken() {
        return "2057909343:AAHtLhsqVuUVLwF1uTaxePnVZdpcaf3bzMY";
    }

    @Override
    public void onUpdateReceived(Update update) {


        MemoHash memoHash;
        if (update.getMessage().hasDocument()) {

            memoHash = new MemoHash();

            GetFile getFile = new GetFile();
            getFile.setFileId(update.getMessage().getDocument().getFileId());
            try {
                File file;
                InputStream is;
                file = execute(getFile);
                java.io.File localFile = new java.io.File("D:\\meme\\" + update.getMessage().getDocument().getFileName());
                is = new URL(file.getFileUrl(this.getBotToken())).openStream();
                FileUtils.copyInputStreamToFile(is, localFile);
                memoHash.setFolder("D:\\meme\\" + update.getMessage().getDocument().getFileName());
                System.out.println(update.getMessage().getCaptionEntities());
                List<MessageEntity> hashTags;
                hashTags = update.getMessage().getCaptionEntities();
                //System.out.println( update.getMessage() );
                for (int i = 0; i < hashTags.size(); ++i) {
                    System.out.println(hashTags.get(i).getText());
                    memoHash.setHash(i, hashTags.get(i).getText());
                }
                memoHashRepository.save(memoHash);
            } catch (TelegramApiException | IOException e) {
                e.printStackTrace();
            }
        } else {
            List<MemoHash> test = memoHashRepository.getAllByHash0OrHash1OrHash2OrHash3OrHash4OrHash5OrHash6OrHash7OrHash8OrHash9OrHash10OrHash11OrHash12OrHash13OrHash14OrHash15("#"+update.getMessage().getText(),"#"+update.getMessage().getText(),"#"+update.getMessage().getText(),"#"+update.getMessage().getText(),"#"+update.getMessage().getText(),"#"+update.getMessage().getText(),"#"+update.getMessage().getText(),"#"+update.getMessage().getText(),"#"+update.getMessage().getText(),"#"+update.getMessage().getText(),"#"+update.getMessage().getText(),"#"+update.getMessage().getText(),"#"+update.getMessage().getText(),"#"+update.getMessage().getText(),"#"+update.getMessage().getText(),"#"+update.getMessage().getText());
            System.out.println(test.size());
            System.out.println(update.getMessage().getText());
        }
    }
}