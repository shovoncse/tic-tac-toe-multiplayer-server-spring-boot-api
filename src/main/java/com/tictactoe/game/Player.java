package com.tictactoe.game;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player")
public class Player {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String name;
 private Long roomId;

 public Player() {
 }

 public Player(String name, Long roomId) {
  this.name = name;
  this.roomId = roomId;
 }

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public Long getRoomId() {
  return roomId;
 }

 public void setRoomId(Long roomId) {
  this.roomId = roomId;
 }

 @Override
 public String toString() {
  return "Player [id=" + id + ", name=" + name + ", roomId=" + roomId + "]";
 }
}
