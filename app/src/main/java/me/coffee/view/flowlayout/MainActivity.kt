package me.coffee.view.flowlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_view.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = listOf(
            "美的空调", "透明皂", "干脆面自营", "小米手机2s", "小米旗舰店",
            "京东自营新疆哈密瓜", "移动电源", "咖啡机",
            "水", "手机", "Java", "0", "苹果笔记本", "电池"

        )

        list.forEach {
            val v = layoutInflater.inflate(R.layout.item_view, fl, false)
            v.label.text = it
            fl.addView(v)
        }
    }
}
