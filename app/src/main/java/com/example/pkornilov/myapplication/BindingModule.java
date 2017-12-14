package com.example.pkornilov.myapplication;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.v4.app.Fragment;

import com.example.pkornilov.myapplication.Presenter.FragmentPresenter;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by p.kornilov on 13.12.2017.
 */

@Module//(subcomponents = {MainActivityFragmentSubcomponent.class})
public abstract class BindingModule {
/*    @Binds
    @IntoMap
    @FragmentKey(MainActivityFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindMainActivityFragmentInjectorFactory(MainActivityFragmentSubcomponent.Builder builder);*/

    @Binds
    @IntoMap
    @ViewModelKey(FragmentPresenter.class)
    abstract ViewModel bindViewModelFactorya(FragmentPresenter viewModel);

    @Binds abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);

}
