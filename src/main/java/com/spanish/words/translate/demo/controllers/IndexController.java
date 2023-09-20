package com.spanish.words.translate.demo.controllers;

import com.spanish.words.translate.demo.WordsMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

@Controller
public class IndexController {
    WordsMapping siema = new WordsMapping();
    private Map<String, String> keyValuePairs;
    public IndexController() throws IOException {
        keyValuePairs = siema.getWords();
    }

    @GetMapping("/keyvalue")
    public String keyValuePage(Model model) {
        Set<Map.Entry<String, String>> entries = keyValuePairs.entrySet();
        model.addAttribute("keyValuePairs", entries);
        return "keyvalue";
    }
}
