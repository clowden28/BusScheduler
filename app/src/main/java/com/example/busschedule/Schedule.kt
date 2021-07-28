package database

import androidx.room.ColumnInfo

data class Schedule(
    @PrimaryKey val id: Int
    @NonNull @ColumnInfo(name = "stop_name") val StopName: String,
    @NoNull @columnInfo(name = "arrival_time") val arrivalTime: Int
)
