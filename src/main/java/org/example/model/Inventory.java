package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Inventory {
    private int sold;
    private int string;
    private int pending;
    @JsonProperty("No disponible")
    private int noDisponible;
    private int available;
    private int avalible;
    private int active;
    @JsonProperty("Not Available")
    private int notAvailable;
    private int hola;
    @JsonProperty("on clarification")
    private int onClarification;
    @JsonProperty("pet status in the store")
    private int petStatusInTheStore;
    private int pet001;
    @JsonProperty("SOLD")
    private int sold2;
    private int lemon;
    @JsonProperty("Sold")
    private int sold3;
    private int ok;
    private int oK;
    private int free;
    private int status;
    @JsonProperty("Not available")
    private int notavailable;

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public int getString() {
        return string;
    }

    public void setString(int string) {
        this.string = string;
    }

    public int getPending() {
        return pending;
    }

    public void setPending(int pending) {
        this.pending = pending;
    }

    public int getNoDisponible() {
        return noDisponible;
    }

    public void setNoDisponible(int noDisponible) {
        this.noDisponible = noDisponible;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getAvalible() {
        return avalible;
    }

    public void setAvalible(int avalible) {
        this.avalible = avalible;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getNotAvailable() {
        return notAvailable;
    }

    public void setNotAvailable(int notAvailable) {
        this.notAvailable = notAvailable;
    }

    public int getHola() {
        return hola;
    }

    public void setHola(int hola) {
        this.hola = hola;
    }

    public int getOnClarification() {
        return onClarification;
    }

    public void setOnClarification(int onClarification) {
        this.onClarification = onClarification;
    }

    public int getPetStatusInTheStore() {
        return petStatusInTheStore;
    }

    public void setPetStatusInTheStore(int petStatusInTheStore) {
        this.petStatusInTheStore = petStatusInTheStore;
    }

    public int getPet001() {
        return pet001;
    }

    public void setPet001(int pet001) {
        this.pet001 = pet001;
    }

    public int getSold2() {
        return sold2;
    }

    public void setSold2(int sold2) {
        this.sold2 = sold2;
    }

    public int getLemon() {
        return lemon;
    }

    public void setLemon(int lemon) {
        this.lemon = lemon;
    }

    public int getSold3() {
        return sold3;
    }

    public void setSold3(int sold3) {
        this.sold3 = sold3;
    }

    public int getOk() {
        return ok;
    }

    public void setOk(int ok) {
        this.ok = ok;
    }

    public int getoK() {
        return oK;
    }

    public void setoK(int oK) {
        this.oK = oK;
    }

    public int getFree() {
        return free;
    }

    public void setFree(int free) {
        this.free = free;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getNotavailable() {
        return notavailable;
    }

    public void setNotavailable(int notavailable) {
        this.notavailable = notavailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventory inventory = (Inventory) o;
        return sold == inventory.sold && string == inventory.string && pending == inventory.pending
                && noDisponible == inventory.noDisponible && available == inventory.available
                && avalible == inventory.avalible && active == inventory.active
                && notAvailable == inventory.notAvailable && hola == inventory.hola
                && onClarification == inventory.onClarification && petStatusInTheStore == inventory.petStatusInTheStore
                && pet001 == inventory.pet001 && sold2 == inventory.sold2 && lemon == inventory.lemon
                && sold3 == inventory.sold3 && ok == inventory.ok && oK == inventory.oK && free == inventory.free
                && status == inventory.status && notavailable == inventory.notavailable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sold, string, pending, noDisponible, available, avalible,
                active, notAvailable, hola, onClarification, petStatusInTheStore, pet001,
                sold2, lemon, sold3, ok, oK, free, status, notavailable);
    }
}