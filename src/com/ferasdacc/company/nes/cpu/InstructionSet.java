package com.ferasdacc.company.nes.cpu;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * User: hugo_<br/>
 * Date: 30/03/2018<br/>
 * Time: 03:26<br/>
 */
public class InstructionSet {

    private Cpu cpu;
    private Instruction[] instructions;

    public InstructionSet(Cpu cpu) {
        this.cpu = cpu;
        instructions = new Instruction[256];

        // Load/Store Operations
        initLDA();

        // TODO: Continute ...
    }

    public Instruction[] get(String mnemonic) {
        List<Instruction> list = new ArrayList<>();
        for (Instruction instruction : instructions)
            if (instruction.mnemonic.equals(mnemonic))
                list.add(instruction);
        return list.toArray(new Instruction[0]);
    }

    public Instruction get(short opcode) {
        if (opcode > 255) throw new RuntimeException("Unknow opcode");
        return instructions[opcode];
    }

    private void initLDA() {
        instructions[0xA9] = new Instruction("LDA") {
            @Override
            public int exec(Objects... objects) {
                return 0;
            }
        };
        instructions[0xA5] = new Instruction("LDA") {
            @Override
            public int exec(Objects... objects) {
                return 0;
            }
        };
        instructions[0xB5] = new Instruction("LDA") {
            @Override
            public int exec(Objects... objects) {
                return 0;
            }
        };
        instructions[0xAD] = new Instruction("LDA") {
            @Override
            public int exec(Objects... objects) {
                return 0;
            }
        };
        instructions[0xBD] = new Instruction("LDA") {
            @Override
            public int exec(Objects... objects) {
                return 0;
            }
        };
        instructions[0xB9] = new Instruction("LDA") {
            @Override
            public int exec(Objects... objects) {
                return 0;
            }
        };
        instructions[0xA1] = new Instruction("LDA") {
            @Override
            public int exec(Objects... objects) {
                return 0;
            }
        };
        instructions[0xB1] = new Instruction("LDA") {
            @Override
            public int exec(Objects... objects) {
                return 0;
            }
        };
    }

}
