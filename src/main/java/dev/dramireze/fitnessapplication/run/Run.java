package dev.dramireze.fitnessapplication.run;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;


import java.time.LocalDateTime;


@Entity
public class Run {
        @Id
        Integer id;
        @NotEmpty
        String title;
        LocalDateTime startedOn;
        LocalDateTime completedOn;
        @Positive
        Integer miles;
        Location location;

        public Run() {

        }

        public Run(String title) {
                this.title = title;
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public LocalDateTime getStartedOn() {
                return startedOn;
        }

        public void setStartedOn(LocalDateTime startedOn) {
                this.startedOn = startedOn;
        }

        public LocalDateTime getCompletedOn() {
                return completedOn;
        }

        public void setCompletedOn(LocalDateTime completedOn) {
                this.completedOn = completedOn;
        }

        public Integer getMiles() {
                return miles;
        }

        public void setMiles(Integer miles) {
                this.miles = miles;
        }

        public Location getLocation() {
                return location;
        }

        public void setLocation(Location location) {
                this.location = location;
        }

}
