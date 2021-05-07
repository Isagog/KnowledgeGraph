package com.isagog.service.language;

import java.util.Objects;

class Word {
    private String token;
    private String pos;
    private int index;

    Word(String token, String pos, int index) {
        this.token = token;
        this.pos = pos;
        this.index = index;
    }


    public String getToken() {
        return token;
    }

    public String getPos() {
        return pos;
    }

    public int getIndex() {
        return index;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return index == word.index &&
                token.equals(word.token) &&
                pos.equals(word.pos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, pos, index);
    }

    @Override
    public String toString() {
        return token + " ";
    }
}
