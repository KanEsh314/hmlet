package my.com.mdr_tech.hmlet.Tab_Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import my.com.mdr_tech.hmlet.R


/**
 * A simple [Fragment] subclass.
 */
class FlatmatesFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_flatmates, container, false)
    }

}// Required empty public constructor
