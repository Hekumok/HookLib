package gloomyfolken.hooklib.utils;

import org.objectweb.asm.Opcodes;

import java.util.Arrays;
import java.util.List;

public class OpcodesHelper {
    public static final List<Integer> varStoreOpcodes =
            Arrays.asList(new Integer[]{ Opcodes.ISTORE, Opcodes.LSTORE, Opcodes.FSTORE, Opcodes.DSTORE, Opcodes.ASTORE });

    public static boolean isVarStore(int opcode) {
        return varStoreOpcodes.contains(opcode);
    }
}