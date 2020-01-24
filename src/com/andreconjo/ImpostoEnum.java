package com.andreconjo;

import com.andreconjo.impostos.ICMS;
import com.andreconjo.impostos.IPI;
import com.andreconjo.impostos.Imposto;

public enum ImpostoEnum {
    ICMS {
        @Override
        public Imposto obtemImposto() {
            return new ICMS();
        }
    },
    IPI{
        @Override
        public Imposto obtemImposto() {
            return new IPI();
        }
    };

    public abstract Imposto obtemImposto();
}
