/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyhelper;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Clint
 */
public class ClintsFileWriter extends FileWriter{
    
    public ClintsFileWriter(String string) throws IOException {
        super(string);
    }
    
}
