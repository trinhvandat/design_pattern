package com.ptit.facade;

public class ClientService {
    public static void main(String[] args) {
        FacadeService.getInstance().order("Dat", (float) 324.444, "Mobile phone");
    }
}
