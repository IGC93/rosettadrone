/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE LOCAL_POSITION_NED_COV PACKING
package com.MAVLink.common;

import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
 * The filtered local position (e.g. fused computer vision and accelerometers). Coordinate frame is right-handed, Z-axis down (aeronautical frame, NED / north-east-down convention)
 */
public class msg_local_position_ned_cov extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_LOCAL_POSITION_NED_COV = 64;
    public static final int MAVLINK_MSG_LENGTH = 225;
    private static final long serialVersionUID = MAVLINK_MSG_ID_LOCAL_POSITION_NED_COV;


    /**
     * Timestamp (microseconds since system boot or since UNIX epoch)
     */
    public long time_usec;

    /**
     * X Position
     */
    public float x;

    /**
     * Y Position
     */
    public float y;

    /**
     * Z Position
     */
    public float z;

    /**
     * X Speed (m/s)
     */
    public float vx;

    /**
     * Y Speed (m/s)
     */
    public float vy;

    /**
     * Z Speed (m/s)
     */
    public float vz;

    /**
     * X Acceleration (m/s^2)
     */
    public float ax;

    /**
     * Y Acceleration (m/s^2)
     */
    public float ay;

    /**
     * Z Acceleration (m/s^2)
     */
    public float az;

    /**
     * Covariance matrix upper right triangular (first nine entries are the first ROW, next eight entries are the second row, etc.)
     */
    public float covariance[] = new float[45];

    /**
     * Class id of the estimator this estimate originated from.
     */
    public short estimator_type;


    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_local_position_ned_cov() {
        msgid = MAVLINK_MSG_ID_LOCAL_POSITION_NED_COV;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     */
    public msg_local_position_ned_cov(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_LOCAL_POSITION_NED_COV;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Generates the payload for a mavlink message for a message of this type
     *
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_LOCAL_POSITION_NED_COV;

        packet.payload.putUnsignedLong(time_usec);

        packet.payload.putFloat(x);

        packet.payload.putFloat(y);

        packet.payload.putFloat(z);

        packet.payload.putFloat(vx);

        packet.payload.putFloat(vy);

        packet.payload.putFloat(vz);

        packet.payload.putFloat(ax);

        packet.payload.putFloat(ay);

        packet.payload.putFloat(az);


        for (int i = 0; i < covariance.length; i++) {
            packet.payload.putFloat(covariance[i]);
        }


        packet.payload.putUnsignedByte(estimator_type);

        return packet;
    }

    /**
     * Decode a local_position_ned_cov message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_usec = payload.getUnsignedLong();

        this.x = payload.getFloat();

        this.y = payload.getFloat();

        this.z = payload.getFloat();

        this.vx = payload.getFloat();

        this.vy = payload.getFloat();

        this.vz = payload.getFloat();

        this.ax = payload.getFloat();

        this.ay = payload.getFloat();

        this.az = payload.getFloat();


        for (int i = 0; i < this.covariance.length; i++) {
            this.covariance[i] = payload.getFloat();
        }


        this.estimator_type = payload.getUnsignedByte();

    }

    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_LOCAL_POSITION_NED_COV - sysid:" + sysid + " compid:" + compid + " time_usec:" + time_usec + " x:" + x + " y:" + y + " z:" + z + " vx:" + vx + " vy:" + vy + " vz:" + vz + " ax:" + ax + " ay:" + ay + " az:" + az + " covariance:" + covariance + " estimator_type:" + estimator_type + "";
    }
}
        