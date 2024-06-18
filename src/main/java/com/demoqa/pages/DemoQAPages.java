package com.demoqa.pages;

import lombok.*;
import org.testng.annotations.BeforeClass;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
public class DemoQAPages {
    protected TextBoxPage textBoxPage;
    protected AlertPage alertPage;
    protected PracticeFormPage practiceFormPage;
    protected ButtonsPage buttonsPage;
    protected MenuPage menuPage;
    protected ProgressBarPage progressBarPage;
    protected WebTablePage webTablePage;
//    protected SelectPage selectPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        textBoxPage = new TextBoxPage();
        alertPage = new AlertPage();
        practiceFormPage = new PracticeFormPage();
        buttonsPage = new ButtonsPage();
        menuPage = new MenuPage();
        progressBarPage = new ProgressBarPage();
        webTablePage = new WebTablePage();
//        selectPage = new SelectPage();

//    public TextBoxPage textBoxPage = new TextBoxPage();
////    public AlertPage alertPage = new AlertPage();
////    public ButtonsPage buttonsPage = new ButtonsPage();
////    public MenuPage menuPage = new MenuPage();
////    public ProgressBarPage progressBarPage = new ProgressBarPage();
////    public WebTablePage webTablePage = new WebTablePage();
////    public PracticeFormPage practiceFormPage = new PracticeFormPage();
}}
