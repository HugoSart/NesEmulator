package com.ferasdacc.company.nes.cpu;

import static com.ferasdacc.company.Util.changeBit;
import static com.ferasdacc.company.Util.getBit;

/**
 * User: hugo_<br/>
 * Date: 30/03/2018<br/>
 * Time: 03:18<br/>
 */
public class RegisterSet {

    private short pc = 0x0; // Program Counter

    private byte ps = 0x0; // Program Status
    private byte sp = 0x0; // Stack Pointer
    private byte a  = 0x0; // Accumulator
    private byte x  = 0x0; // Index register X
    private byte y  = 0x0; // Index Register Y

    public void resetAll() {
        ps = sp = a = x = 0;
        pc = 0;
    }

    public void setFlag(Flags flag, boolean val) {
        ps = changeBit(ps, flag.ordinal(), val);
    }

    public boolean getFlag(Flags flag) {
        return getBit(ps, flag.ordinal());
    }

    public void setProgramCounter(short value) {
        pc = value;
    }

    public short getProgramCounter() {
        return pc;
    }

    public void incrementProgramCounter() {
        pc++;
    }

    public void setAccumulator(byte value) {
        a = value;
    }

    public byte getAccumulator() {
        return a;
    }

    public void setIndexX(byte value) {
        x = value;
    }

    public byte getIndexX() {
        return x;
    }

    public void setIndexY(byte value) {
        y = value;
    }

    public byte getIndexY() {
        return y;
    }

    public enum Flags {
        C, Z, I, D, B, V, N
    }

}
