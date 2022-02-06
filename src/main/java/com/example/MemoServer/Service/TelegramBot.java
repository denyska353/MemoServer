package com.example.MemoServer.Service;

import org.apache.commons.io.FileUtils;   //file saving

import java.io.IOException;
import java.net.URL;
import java.io.InputStream;

import org.telegram.telegrambots.meta.api.methods.GetFile;
import org.springframework.beans.factory.annotation.Autowired;
//import com.example.botdatabased.models.UserCard;
//import com.example.botdatabased.repo.UserCardRepository;
import com.example.MemoServer.Repository.MemoHashRepository;
import com.example.MemoServer.Models.MemoHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.File;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
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
        // MemoHash memoHash;
        // update.getMessage().getText();
        // memoHash = new MemoHash();
        // memoHash.setFolder(update.getMessage().getText());
        // memoHashRepository.save(memoHash);


        if(update.getMessage().hasDocument()) {

            GetFile getFile = new GetFile();
            getFile.setFileId(update.getMessage().getDocument().getFileId());
            try {
                File file;
                InputStream is;
                file = execute(getFile);
                java.io.File localFile = new java.io.File("D:\\meme\\"+update.getMessage().getDocument().getFileName());
                is = new URL(file.getFileUrl(this.getBotToken())).openStream();
                FileUtils.copyInputStreamToFile(is, localFile);
            } catch (TelegramApiException | IOException e) {
                e.printStackTrace();
            }

        }
    System.out.println(update.getMessage().getText());
    }
    }