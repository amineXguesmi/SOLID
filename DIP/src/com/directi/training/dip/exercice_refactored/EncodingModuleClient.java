package com.directi.training.dip.exercice_refactored;


import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule();
        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase();
    }
}
