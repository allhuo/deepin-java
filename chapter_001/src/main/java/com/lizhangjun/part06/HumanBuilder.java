package com.lizhangjun.part06;

public class HumanBuilder {

    private String skin;

    private String hair;

    private String face;

    public HumanBuilder() {
    }

    public static class Builder{
        private HumanBuilder humanBuilder = new HumanBuilder();

        public Builder skin(String skin){
            humanBuilder.skin = skin;
            return this;
        }

        public Builder hair(String hair){
            humanBuilder.hair = hair;
            return this;
        }

        public Builder face(String face){
            humanBuilder.face = face;
            return this;
        }

        public HumanBuilder build(){
            return humanBuilder;
        }
    }

    @Override
    public String toString() {
        return "HumanBuilder{" +
                "skin='" + skin + '\'' +
                ", hair='" + hair + '\'' +
                ", face='" + face + '\'' +
                '}';
    }
}
