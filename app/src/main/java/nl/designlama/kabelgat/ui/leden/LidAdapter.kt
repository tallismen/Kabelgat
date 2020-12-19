package nl.designlama.kabelgat.ui.leden

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import nl.designlama.kabelgat.R
import nl.designlama.kabelgat.database.entity.Lid

class LidAdapter(private val onClickListener: ClickListener) : RecyclerView.Adapter<LidAdapter.ViewHolder>() {

    var leden: ArrayList<Lid> = arrayListOf()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val naamTextView: TextView = view.findViewById(R.id.naamTextView)
        val lidNummerTextView: TextView = view.findViewById(R.id.lidNummerTextView)

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.leden_recyclerview_item, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        leden[position].let {
            viewHolder.lidNummerTextView.text = it.lidId.toString()
            viewHolder.naamTextView.text = it.naam
        }
    }

    override fun getItemCount() = leden.size

    interface ClickListener {
        fun onDeleteClick(lid: Lid)
        fun onEditClick(lid: Lid)
    }
}
