package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

        @NotNull
        @Min(1)
        private long id;

        @NotNull
        @Size(min=3, max=20)
        private String carmaker;

        @NotNull
        @Size(min=3, max=20)
        private String carmodel;

        @NotNull
        @Min(1)
        private int caryear;

    public Cars(@NotNull @Size(min = 3, max = 20) String carmaker, @NotNull @Size(min = 3, max = 20) String carmodel, @NotNull @Min(1) int caryear) {
        this.carmaker = carmaker;
        this.carmodel = carmodel;
        this.caryear = caryear;
    }

    public Cars() {
    }


    public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getCarmaker() {
            return carmaker;
        }

        public void setCarmaker(String carmaker) {
            this.carmaker = carmaker;
        }

        public String getCarmodel() {
            return carmodel;
        }

        public void setCarmodel(String carmodel) {
            this.carmodel = carmodel;
        }

        public int getCaryear() {
            return caryear;
        }

        public void setCaryear(int caryear) {
            this.caryear = caryear;
        }
    }
