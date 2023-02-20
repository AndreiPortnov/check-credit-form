package com.example.checkcreditform.service;

public interface StaticConstant {
    /** Path elements */
    final static String API_CHECK_CLIENT_FORM = "/check-client";

    final static String MYURL = "http://localhost:8081/security-check/credit-limit";

    /** Message element */
    final static String APPROVE = "Проверка прошла успешно, запрос отправлен на просчет";
    final static String NEGATIVE_APPROVE_BLACKLIST = "Кредитоприобретатель в черном списке";
    final static String NEGATIVE_APPROVE_SOLVENCY = "Кредитоприобретатель неплатежеспособен";
    final static String INVALID_PARAMETR = "тип заполнения не соответствует типу поля";
}
