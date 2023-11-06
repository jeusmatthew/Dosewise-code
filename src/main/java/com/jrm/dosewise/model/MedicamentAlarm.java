package com.jrm.dosewise.model;

import java.time.LocalDateTime;

public class MedicamentAlarm {
    private boolean active = true;
    private String message;
    private LocalDateTime time;

    public void ring() {
        System.out.println("Debes tomar tu medicamento " + message + " a las " + time.getHour() + " horas");
    }

    public void dismiss() {
        System.out.println("Alarma desactivada");
        active = false;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
