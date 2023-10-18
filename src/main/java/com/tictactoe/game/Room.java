package com.tictactoe.game;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "room")
public class Room {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private Long roomId;
 private String player1;
 private String player2;

 public Room() {
 }

 public Room(Long roomId, String player1, String player2) {
  this.roomId = roomId;
  this.player1 = player1;
  this.player2 = player2;
 }

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getPlayer1() {
  return player1;
 }

 public void setPlayer1(String player1) {
  this.player1 = player1;
 }

 public String getPlayer2() {
  return player2;
 }

 public void setPlayer2(String player2) {
  this.player2 = player2;
 }

 public Long getRoomId() {
  return roomId;
 }

 public void setRoomId(Long roomId) {
  this.roomId = roomId;
 }

 @Override
 public String toString() {
  return "Room [id=" + id + ", player1=" + player1 + ", player2=" + player2 + ", roomId=" + roomId + "]";
 }
 
}
