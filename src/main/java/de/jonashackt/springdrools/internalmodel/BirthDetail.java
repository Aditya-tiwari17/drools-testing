package de.jonashackt.springdrools.internalmodel;

public class BirthDetail {
    private Integer yearOfBirth;
    private Integer monthOfBirth;
    private Integer dayOfBirth;
    private Float age;

    public BirthDetail() {
    }

    public Integer getYearOfBirth() {
        return this.yearOfBirth;
    }

    public Integer getMonthOfBirth() {
        return this.monthOfBirth;
    }

    public Integer getDayOfBirth() {
        return this.dayOfBirth;
    }

    public Float getAge() {
        return this.age;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setMonthOfBirth(Integer monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setDayOfBirth(Integer dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setAge(Float age) {
        this.age = age;
    }

    public String toString() {
        return "BirthDetail(yearOfBirth=" + this.getYearOfBirth() + ", monthOfBirth=" + this.getMonthOfBirth() + ", dayOfBirth=" + this.getDayOfBirth() + ", age=" + this.getAge() + ")";
    }
}
