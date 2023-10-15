package com.example.project01.RoomRepository;

import com.example.project01.RoomModule.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository <Room,Long>{
}
