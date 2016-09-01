/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.nomina.presentation.swing.jinternalframes;

import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;

import com.bydan.framework.erp.util.*;
import com.bydan.erp.nomina.util.CargoConstantesFunciones;
import com.bydan.erp.nomina.business.entity.Cargo;

import com.bydan.erp.nomina.business.logic.*;


//import com.bydan.erp.nomina.business.entity.*;
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

//import org.hibernate.collection.PersistentBag;

import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.*;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.MutableTreeNode;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;


import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityReturnGeneral;


//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class CargoBeanSwingJInternalFrameTree extends JInternalFrameBase implements TreeSelectionListener,TreeModelListener  //CargoBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	
	//CONTROL_INICIO
	protected JPanel jPanelTreeCargo;
	public JScrollPane jScrollPaneDatosGeneralCargo;
	public JScrollPane jScrollPaneTreeCargo;
	private JTree treeCargo;
	protected GridBagConstraints gridBagConstraintsCargo;	
	protected DefaultMutableTreeNode defaultMutableTreeNode;
	protected DefaultTreeModel defaultTreeModel;
	
	protected List<Cargo> cargos;	
	CargoLogic cargoLogic;
	CargoLogicAdditional cargoLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  CargoBeanSwingJInternalFrameTree(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			this.cargos= new ArrayList<Cargo>();
			
			cargoLogic=new CargoLogic();
			cargoLogicAdditional=new CargoLogicAdditional();
			
			this.initialize();
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public List<Cargo> getCargos() throws Exception {			
		return this.cargos;
	}
	
	public void setCargos(List<Cargo> newCargos) {
		this.cargos = newCargos;
	}
	
	private void initialize() throws Exception {	
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			
		int iWidth=(screenSize.width-screenSize.width/3);
		int iHeight=(screenSize.height-screenSize.height/2);		
		
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
		
		this.defaultMutableTreeNode = new DefaultMutableTreeNode("ARBOL");
        //this.CargarTreeCargo(defaultMutableTreeNode);
 
		this.defaultTreeModel = new DefaultTreeModel(this.defaultMutableTreeNode);
		this.defaultTreeModel.addTreeModelListener(this);
	
        //Create a tree that allows one selection at a time.
        this.treeCargo = new JTree(defaultTreeModel);//(defaultMutableTreeNode);
		
		this.treeCargo.setMinimumSize(new Dimension(iWidth,iHeight));
		this.treeCargo.setMaximumSize(new Dimension(iWidth,iHeight));
		this.treeCargo.setPreferredSize(new Dimension(iWidth,iHeight));
		
        this.treeCargo.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
 
        //Listen for when the selection changes.
        this.treeCargo.addTreeSelectionListener(this);
		
		this.jScrollPaneTreeCargo = new JScrollPane(this.treeCargo);
		
		this.jScrollPaneTreeCargo.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeCargo.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeCargo.setPreferredSize(new Dimension(iWidth,iHeight));
		
		this.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jPanelTreeCargo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jScrollPaneDatosGeneralCargo = new JScrollPane();		                 
						       	
		//MUCHOS TITULOS
		//this.jPanelTreeCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL"));
        this.jPanelTreeCargo.setToolTipText("ARBOL");
        this.jPanelTreeCargo.setName("ARBOL"); 
		
		GridBagLayout gridaBagLayoutPrincipalCargo = new GridBagLayout();		
		this.getContentPane().setLayout(gridaBagLayoutPrincipalCargo);
		
		GridBagLayout gridaBagLayoutTreeCargo= new GridBagLayout();
		this.jPanelTreeCargo.setLayout(gridaBagLayoutTreeCargo);
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy = 0;		
		this.gridBagConstraintsCargo.gridx =0;
		
		this.jPanelTreeCargo.add(this.jScrollPaneTreeCargo, this.gridBagConstraintsCargo);
		
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargo.gridx = 0;
		//this.gridBagConstraintsCargo.fill =GridBagConstraints.BOTH;
		//this.gridBagConstraintsCargo.anchor=GridBagConstraints.NORTH;
		
		this.getContentPane().add(this.jPanelTreeCargo, this.gridBagConstraintsCargo);
		
		
		this.jScrollPaneDatosGeneralCargo=   new JScrollPane(this.getContentPane(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
		this.jScrollPaneTreeCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL Cargos"));		
		//MUCHOS TITULOS
		//this.jScrollPaneDatosGeneralCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));
		
		this.jScrollPaneDatosGeneralCargo.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralCargo.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralCargo.setPreferredSize(new Dimension(iWidth,iHeight));
			
		return this.jScrollPaneDatosGeneralCargo;
	}
		
	public void CargarTreeCargo() {
		//this.defaultMutableTreeNode = new DefaultMutableTreeNode("Arbol");
		
		//INICIALIZA
		this.defaultMutableTreeNode.removeAllChildren();
		
		this.CargarTreeCargo(this.defaultMutableTreeNode);
	}
	
	public void CargarTreeCargo(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootCargo = null;
        DefaultMutableTreeNode defaultMutableTreeNodeCargo = null;
 
        defaultMutableTreeNodeRootCargo = new DefaultMutableTreeNode("CargoS");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootCargo);
		
		ArrayList<Cargo> cargosPrimerNivel=this.getPrimerNivelCargos();
		ArrayList<Cargo> cargosHijos=new ArrayList<Cargo>();
		
		for(Cargo cargo:cargosPrimerNivel){//cargos) {
			defaultMutableTreeNodeCargo = new DefaultMutableTreeNode(cargo);
			
			cargosHijos=this.getHijosCargo(cargo);
			
			if(cargosHijos.size()>0) {
				this.setHijosArbolCargo(cargosHijos,defaultMutableTreeNodeCargo);
			}
			
			defaultMutableTreeNodeRootCargo.add(defaultMutableTreeNodeCargo);
		}
	}	
	
	public void setHijosArbolCargo(ArrayList<Cargo> cargosAux,DefaultMutableTreeNode defaultMutableTreeNodeCargoPadre) {
		ArrayList<Cargo> cargosHijos=new ArrayList<Cargo>();
		DefaultMutableTreeNode defaultMutableTreeNodeCargo = null;
				 
		for(Cargo cargo:cargosAux) {
			defaultMutableTreeNodeCargo = new DefaultMutableTreeNode(cargo);
			
			cargosHijos=this.getHijosCargo(cargo);
			
			if(cargosHijos.size()>0) {
				this.setHijosArbolCargo(cargosHijos,defaultMutableTreeNodeCargo);
			}
			
			defaultMutableTreeNodeCargoPadre.add(defaultMutableTreeNodeCargo);
		}
	}
	
	public ArrayList<Cargo> getHijosCargo(Cargo cargoPadre) {
		ArrayList<Cargo> cargosAux=new ArrayList<Cargo>();
		
		for(Cargo cargo:cargos) {
			if(cargo.getid_cargo()!=null && cargo.getid_cargo().equals(cargoPadre.getId())) {
				cargosAux.add(cargo);
			}
		}
		return cargosAux;
	}
	
	public ArrayList<Cargo> getPrimerNivelCargos() {
		ArrayList<Cargo> cargosAux=new ArrayList<Cargo>();
		
		for(Cargo cargo:cargos) {
			if(cargo.getid_cargo()==null || cargo.getid_cargo()<=0) {
				cargosAux.add(cargo);
			}
		}
		return cargosAux;
	}
	
	public void CargarTreeCargoTest(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootCargo = null;
        DefaultMutableTreeNode defaultMutableTreeNodeCargo = null;
 
        defaultMutableTreeNodeRootCargo = new DefaultMutableTreeNode("Root Arbol");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootCargo);
		
		for(int i=0;i<10;i++) {
			defaultMutableTreeNodeCargo = new DefaultMutableTreeNode(i);
				
			defaultMutableTreeNodeRootCargo.add(defaultMutableTreeNodeCargo);
		}
		
		//NO NECESARIO
		//this.defaultTreeModel.reload();
	}	
	
	public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.treeCargo.getLastSelectedPathComponent();
 
        if (defaultMutableTreeNode == null) return;
 
        Object userObject = defaultMutableTreeNode.getUserObject();
		
		Cargo cargo = (Cargo)userObject;
           
        if (defaultMutableTreeNode.isLeaf()) {
            //displayURL(book.bookURL);
            System.out.print(cargo.getId() + ":  \n    ");            
        } else {
            
        }
        
		//this.jInternalFrameParent.setIdActual(cargo.getId());
		
		try {
			//this.jInternalFrameParent.procesarBusqueda("PorId");
			if(this.getsTipoProceso().equals("BUSQUEDA_NORMAL")) {
				this.jInternalFrameParent.buscarPorId(cargo.getId());			
			} else if(this.getsTipoProceso().equals("BUSQUEDA_FK")) {
				this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(cargo.getId(),this.sTipoBusqueda);			
			}
			
			//CERRAR VENTANA
			//this.jDesktopPane.add(this);			
	       	this.setVisible(false);
	        this.setSelected(false);			
			//this.dispose();
			//this=null;
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(userObject.toString());        
    }
	
	 public void clear() {
        this.defaultMutableTreeNode.removeAllChildren();
        this.defaultTreeModel.reload();
    }

	/** Remove the currently selected node. */
    public void removeCurrentNode() {
        TreePath currentSelection = this.treeCargo.getSelectionPath();
        if (currentSelection != null) {
            DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode)
                         (currentSelection.getLastPathComponent());
            MutableTreeNode parent = (MutableTreeNode)(currentNode.getParent());
            if (parent != null) {
                this.defaultTreeModel.removeNodeFromParent(currentNode);
                return;
            }
        } 

        // Either there was no selection, or the root was selected.
        //toolkit.beep();
    }

    /** Add child to the currently selected node. */
    public DefaultMutableTreeNode addObject(Object child) {
        DefaultMutableTreeNode parentNode = null;
        TreePath parentPath = this.treeCargo.getSelectionPath();

        if (parentPath == null) {
            parentNode = this.defaultMutableTreeNode;
        } else {
            parentNode = (DefaultMutableTreeNode)
                         (parentPath.getLastPathComponent());
        }

        return addObject(parentNode, child, true);
    }

    public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,
                                            Object child) {
        return addObject(parent, child, false);
    }

    public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,
                                            Object child, 
                                            boolean shouldBeVisible) {
        DefaultMutableTreeNode childNode = 
                new DefaultMutableTreeNode(child);

        if (parent == null) {
            parent = this.defaultMutableTreeNode;
        }
	
	//It is key to invoke this on the TreeModel, and NOT DefaultMutableTreeNode
        this.defaultTreeModel.insertNodeInto(childNode, parent, 
                                 parent.getChildCount());

        //Make sure the user can see the lovely new node.
        if (shouldBeVisible) {
            this.treeCargo.scrollPathToVisible(new TreePath(childNode.getPath()));
        }
        return childNode;
    }
	
	 public void treeNodesChanged(TreeModelEvent e) {
            DefaultMutableTreeNode node;
            node = (DefaultMutableTreeNode)(e.getTreePath().getLastPathComponent());

            /*
             * If the event lists children, then the changed
             * node is the child of the node we've already
             * gotten.  Otherwise, the changed node and the
             * specified node are the same.
             */

                int index = e.getChildIndices()[0];
                node = (DefaultMutableTreeNode)(node.getChildAt(index));

            System.out.println("The user has finished editing the node.");
            System.out.println("New value: " + node.getUserObject());
        }
        public void treeNodesInserted(TreeModelEvent e) {
        }
        public void treeNodesRemoved(TreeModelEvent e) {
        }
        public void treeStructureChanged(TreeModelEvent e) {
        }
		
	//CONTROL_FUNCION2
}

