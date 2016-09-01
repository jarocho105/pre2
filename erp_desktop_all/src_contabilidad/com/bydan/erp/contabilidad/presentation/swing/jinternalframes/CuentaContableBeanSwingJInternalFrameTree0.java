/*
* ============================================================================
* GNU Lesser General Public License
* ============================================================================
*
* BYDAN - Free Java BYDAN library.
* Copyright (C) 2008 
* 
* This library is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation; either
* version 2.1 of the License, or (at your option) any later version.
* 
* This library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
* Lesser General Public License for more details.
* 
* You should have received a copy of the GNU Lesser General Public
* License along with this library; if not, write to the Free Software
* Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307, USA.
* 
* BYDAN Corporation
*/
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;

import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;

import com.bydan.framework.erp.util.*;
import com.bydan.erp.contabilidad.util.CuentaContableConstantesFunciones;
import com.bydan.erp.contabilidad.business.entity.CuentaContable;

import com.bydan.erp.contabilidad.business.logic.*;
//import com.bydan.erp.contabilidad.service.ejb.interfaces.CuentaContableAdditionable;
//import com.bydan.erp.contabilidad.service.ejb.interfaces.CuentaContableAdditionableHome;
//import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.logic.QueryWhereSelectParameters;
//import com.bydan.framework.erp.business.logic.*;

//import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;

import org.hibernate.collection.PersistentBag;

import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;


import com.bydan.framework.erp.business.entity.DatoGeneral;

//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class CuentaContableBeanSwingJInternalFrameTree0 extends JInternalFrameBase implements TreeSelectionListener //CuentaContableBeanSwingJInternalFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//CONTROL_INICIO
	protected JPanel jPanelTreeCuentaContable;
	public JScrollPane jScrollPaneDatosGeneralCuentaContable;
	public JScrollPane jScrollPaneTreeCuentaContable;
	private JTree treeCuentaContable;
	protected GridBagConstraints gridBagConstraintsCuentaContable;	
	
	protected List<CuentaContable> cuentacontables;	
	CuentaContableLogic cuentacontableLogic;
	CuentaContableLogicAdditional cuentacontableLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  CuentaContableBeanSwingJInternalFrameTree0() throws Exception
	{
		super();
		try 
		{			
			this.cuentacontables= new ArrayList<CuentaContable>();
			
			cuentacontableLogic=new CuentaContableLogic();
			cuentacontableLogicAdditional=new CuentaContableLogicAdditional();
			
			this.initialize();
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public List<CuentaContable> getCuentaContables() throws Exception {			
		return this.cuentacontables;
	}
	
	public void setCuentaContables(List<CuentaContable> newCuentaContables) {
		this.cuentacontables = newCuentaContables;
	}
	
	private void initialize() throws Exception {	
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);				
		
		this.setSize(iWidth,iHeight);
		
		this.setContentPane(this.getJContentPane(iWidth,iHeight));
	
		this.setResizable(true);
	    this.setClosable(true);
	    this.setMaximizable(true);
	    this.iconable=true;
		
		this.setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
		
		if(Constantes.CON_VARIAS_VENTANAS) {
			openFrameCount++;
			
			if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
				openFrameCount=0;
			}
		}
	
	}
	
	public JScrollPane getJContentPane(int iWidth,int iHeight) throws Exception {	
		int iGridyPrincipal=0;
		
		DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode("Arbol");
        this.CargarTreeCuentaContable(defaultMutableTreeNode);
 
        //Create a tree that allows one selection at a time.
        this.treeCuentaContable = new JTree(defaultMutableTreeNode);
        this.treeCuentaContable.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
 
        //Listen for when the selection changes.
        this.treeCuentaContable.addTreeSelectionListener(this);
		
		this.jScrollPaneTreeCuentaContable = new JScrollPane(this.treeCuentaContable);
		
		this.setContentPane(new JPanel());
		this.jPanelTreeCuentaContable = new JPanel();
		this.jScrollPaneDatosGeneralCuentaContable = new JScrollPane();		                 
						
       	
		this.jPanelTreeCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL"));
        this.jPanelTreeCuentaContable.setToolTipText("ARBOL");
        this.jPanelTreeCuentaContable.setName("ARBOL"); 
		
		GridBagLayout gridaBagLayoutPrincipalCuentaContable = new GridBagLayout();		
		this.getContentPane().setLayout(gridaBagLayoutPrincipalCuentaContable);
		
		GridBagLayout gridaBagLayoutTreeCuentaContable= new GridBagLayout();
		this.jPanelTreeCuentaContable.setLayout(gridaBagLayoutTreeCuentaContable);
		
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy = 0;		
		this.gridBagConstraintsCuentaContable.gridx =0;
		
		this.jPanelTreeCuentaContable.add(this.jScrollPaneTreeCuentaContable, this.gridBagConstraintsCuentaContable);
		
		
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContable.gridx = 0;
		//this.gridBagConstraintsCuentaContable.fill =GridBagConstraints.BOTH;
		//this.gridBagConstraintsCuentaContable.anchor=GridBagConstraints.NORTH;
		
		this.getContentPane().add(this.jPanelTreeCuentaContable, this.gridBagConstraintsCuentaContable);
		
		
		this.jScrollPaneDatosGeneralCuentaContable=   new JScrollPane(this.getContentPane(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
		this.jScrollPaneTreeCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL"));
		this.jScrollPaneDatosGeneralCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));
		
		this.jScrollPaneDatosGeneralCuentaContable.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralCuentaContable.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralCuentaContable.setPreferredSize(new Dimension(iWidth,iHeight));
			
		return this.jScrollPaneDatosGeneralCuentaContable;
	}
		
	public void CargarTreeCuentaContable() {
		DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode("Arbol");
		this.CargarTreeCuentaContable(defaultMutableTreeNode);
	}
	
	public void CargarTreeCuentaContable(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootCuentaContable = null;
        DefaultMutableTreeNode defaultMutableTreeNodeCuentaContable = null;
 
        defaultMutableTreeNodeRootCuentaContable = new DefaultMutableTreeNode("Root Arbol");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootCuentaContable);
		
		for(CuentaContable cuentacontable:cuentacontables) {
			defaultMutableTreeNodeCuentaContable = new DefaultMutableTreeNode(cuentacontable);
				
			defaultMutableTreeNodeRootCuentaContable.add(defaultMutableTreeNodeCuentaContable);
		}
	}	
	
	public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.treeCuentaContable.getLastSelectedPathComponent();
 
        if (defaultMutableTreeNode == null) return;
 
        Object userObject = defaultMutableTreeNode.getUserObject();
		
        if (defaultMutableTreeNode.isLeaf()) {
            CuentaContable cuentacontable = (CuentaContable)userObject;
            //displayURL(book.bookURL);
            System.out.print(cuentacontable.getId() + ":  \n    ");            
        } else {
            
        }
        
		System.out.println(userObject.toString());        
    }
	//CONTROL_FUNCION2
}

