package com.ferasdacc.company.nes.cpu;

import java.util.Objects;

/**
 * User: hugo_<br/>
 * Date: 30/03/2018<br/>
 * Time: 01:06<br/>
 */
public abstract class Instruction {

    String mnemonic;

    public Instruction(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public abstract int exec(Objects... objects);

}
