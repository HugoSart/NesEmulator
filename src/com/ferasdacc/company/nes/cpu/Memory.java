package com.ferasdacc.company.nes.cpu;

/**
 * User: hugo_<br/>
 * Date: 30/03/2018<br/>
 * Time: 03:19<br/>
 */
public class Memory {

    private byte[] memory = new byte[2048];

    public void reset() {
        for (int i = 0; i < 2048; i++)
            memory[i] = 0x0;
    }

    public byte get(short address) {
        return memory[address];
    }

    public byte write(short address, byte value) {
        byte old = memory[address];
        memory[address] = value;
        return old;
    }

}
