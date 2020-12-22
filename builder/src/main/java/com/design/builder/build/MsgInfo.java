package com.design.builder.build;

/**
 * @author hoen-T
 */
public class MsgInfo<T> {

    private Integer code;
    private boolean outcome;
    private T t;

    public static MsgInfoBuilder<Object> of() {
        return new MsgInfoBuilder<>();
    }
    public static MsgInfoBuilder<Object> of(Integer code,boolean outcome) {
        return new MsgInfoBuilder<>(code,outcome);
    }

    private MsgInfo(MsgInfoBuilder<T> builder) {
        this.code = builder.code;
        this.t = builder.t;
        this.outcome = builder.outcome;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public boolean isOutcome() {
        return outcome;
    }

    public void setOutcome(boolean outcome) {
        this.outcome = outcome;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static class MsgInfoBuilder<E> {
        private Integer code;
        private boolean outcome;
        private E t;

        public MsgInfoBuilder(Integer code,boolean outcome) {
            this.code = code;
            this.outcome = outcome;
        }
        public MsgInfoBuilder() {
        }

        public MsgInfoBuilder<E> setCode(Integer code) {
            this.code = code;
            return this;
        }

        public MsgInfoBuilder<E> setOutcome(boolean outcome) {
            this.outcome = outcome;
            return this;

        }

        public MsgInfoBuilder<E> setE(E t) {
            this.t = t;
            return this;
        }

        public MsgInfo<E> build() {
            return new MsgInfo<>(this);
        }
    }
}
