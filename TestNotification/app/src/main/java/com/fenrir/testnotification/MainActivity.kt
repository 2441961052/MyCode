package com.fenrir.testnotification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat

class MainActivity : AppCompatActivity() {
    private val HIGH_CHANNEL_ID: String = "highChannelId"
    private val HIGH_CHANNEL_NAME: String = "紧急通知"
    private val phone  = "123456"
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.create_notification).setOnClickListener {
            val intent = Intent().apply {
                this.action = Intent.ACTION_DIAL
                val uri = Uri.parse("tel:${phone}")
                intent.data= uri
                val flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
            val pendingIntent:PendingIntent = PendingIntent.getActivity(this,0,intent,0)
            //创建通知渠道
            val highChannel = NotificationChannel(
                HIGH_CHANNEL_ID,
                HIGH_CHANNEL_NAME,
                NotificationManager.IMPORTANCE_HIGH
            )
            val mNotificaManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            mNotificaManager.createNotificationChannel(highChannel)

            //设置通知内容
            val builder = NotificationCompat.Builder(this, HIGH_CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_call)
                .setContentTitle("电话")
                .setContentText("你有一条未接电话")
//                .setStyle(
//                    NotificationCompat.BigTextStyle()
//                        .bigText("something here")
//                )
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)


            mNotificaManager.notify(0,builder.build())

        }
    }

}