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
public class CuentaContableBeanSwingJInternalFrameTree extends JInternalFrameBase implements TreeSelectionListener,TreeModelListener  //CuentaContableBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	
	//CONTROL_INICIO
	protected JPanel jPanelTreeCuentaContable;
	public JScrollPane jScrollPaneDatosGeneralCuentaContable;
	public JScrollPane jScrollPaneTreeCuentaContable;
	private JTree treeCuentaContable;
	protected GridBagConstraints gridBagConstraintsCuentaContable;	
	protected DefaultMutableTreeNode defaultMutableTreeNode;
	protected DefaultTreeModel defaultTreeModel;
	
	protected List<CuentaContable> cuentacontables;	
	CuentaContableLogic cuentacontableLogic;
	CuentaContableLogicAdditional cuentacontableLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  CuentaContableBeanSwingJInternalFrameTree(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
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
        //this.CargarTreeCuentaContable(defaultMutableTreeNode);
 
		this.defaultTreeModel = new DefaultTreeModel(this.defaultMutableTreeNode);
		this.defaultTreeModel.addTreeModelListener(this);
	
        //Create a tree that allows one selection at a time.
        this.treeCuentaContable = new JTree(defaultTreeModel);//(defaultMutableTreeNode);
		
		this.treeCuentaContable.setMinimumSize(new Dimension(iWidth,iHeight));
		this.treeCuentaContable.setMaximumSize(new Dimension(iWidth,iHeight));
		this.treeCuentaContable.setPreferredSize(new Dimension(iWidth,iHeight));
		
        this.treeCuentaContable.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
 
        //Listen for when the selection changes.
        this.treeCuentaContable.addTreeSelectionListener(this);
		
		this.jScrollPaneTreeCuentaContable = new JScrollPane(this.treeCuentaContable);
		
		this.jScrollPaneTreeCuentaContable.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeCuentaContable.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeCuentaContable.setPreferredSize(new Dimension(iWidth,iHeight));
		
		this.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jPanelTreeCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jScrollPaneDatosGeneralCuentaContable = new JScrollPane();		                 
						       	
		//MUCHOS TITULOS
		//this.jPanelTreeCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL"));
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
			
		this.jScrollPaneTreeCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL Cuenta Contables"));		
		//MUCHOS TITULOS
		//this.jScrollPaneDatosGeneralCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));
		
		this.jScrollPaneDatosGeneralCuentaContable.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralCuentaContable.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralCuentaContable.setPreferredSize(new Dimension(iWidth,iHeight));
			
		return this.jScrollPaneDatosGeneralCuentaContable;
	}
		
	public void CargarTreeCuentaContable() {
		//this.defaultMutableTreeNode = new DefaultMutableTreeNode("Arbol");
		
		//INICIALIZA
		this.defaultMutableTreeNode.removeAllChildren();
		
		this.CargarTreeCuentaContable(this.defaultMutableTreeNode);
	}
	
	public void CargarTreeCuentaContable(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootCuentaContable = null;
        DefaultMutableTreeNode defaultMutableTreeNodeCuentaContable = null;
 
        defaultMutableTreeNodeRootCuentaContable = new DefaultMutableTreeNode("Cuenta ContableS");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootCuentaContable);
		
		ArrayList<CuentaContable> cuentacontablesPrimerNivel=this.getPrimerNivelCuentaContables();
		ArrayList<CuentaContable> cuentacontablesHijos=new ArrayList<CuentaContable>();
		
		for(CuentaContable cuentacontable:cuentacontablesPrimerNivel){//cuentacontables) {
			defaultMutableTreeNodeCuentaContable = new DefaultMutableTreeNode(cuentacontable);
			
			cuentacontablesHijos=this.getHijosCuentaContable(cuentacontable);
			
			if(cuentacontablesHijos.size()>0) {
				this.setHijosArbolCuentaContable(cuentacontablesHijos,defaultMutableTreeNodeCuentaContable);
			}
			
			defaultMutableTreeNodeRootCuentaContable.add(defaultMutableTreeNodeCuentaContable);
		}
	}	
	
	public void setHijosArbolCuentaContable(ArrayList<CuentaContable> cuentacontablesAux,DefaultMutableTreeNode defaultMutableTreeNodeCuentaContablePadre) {
		ArrayList<CuentaContable> cuentacontablesHijos=new ArrayList<CuentaContable>();
		DefaultMutableTreeNode defaultMutableTreeNodeCuentaContable = null;
				 
		for(CuentaContable cuentacontable:cuentacontablesAux) {
			defaultMutableTreeNodeCuentaContable = new DefaultMutableTreeNode(cuentacontable);
			
			cuentacontablesHijos=this.getHijosCuentaContable(cuentacontable);
			
			if(cuentacontablesHijos.size()>0) {
				this.setHijosArbolCuentaContable(cuentacontablesHijos,defaultMutableTreeNodeCuentaContable);
			}
			
			defaultMutableTreeNodeCuentaContablePadre.add(defaultMutableTreeNodeCuentaContable);
		}
	}
	
	public ArrayList<CuentaContable> getHijosCuentaContable(CuentaContable cuentacontablePadre) {
		ArrayList<CuentaContable> cuentacontablesAux=new ArrayList<CuentaContable>();
		
		for(CuentaContable cuentacontable:cuentacontables) {
			if(cuentacontable.getid_cuenta_contable()!=null && cuentacontable.getid_cuenta_contable().equals(cuentacontablePadre.getId())) {
				cuentacontablesAux.add(cuentacontable);
			}
		}
		return cuentacontablesAux;
	}
	
	public ArrayList<CuentaContable> getPrimerNivelCuentaContables() {
		ArrayList<CuentaContable> cuentacontablesAux=new ArrayList<CuentaContable>();
		
		for(CuentaContable cuentacontable:cuentacontables) {
			if(cuentacontable.getid_cuenta_contable()==null || cuentacontable.getid_cuenta_contable()<=0) {
				cuentacontablesAux.add(cuentacontable);
			}
		}
		return cuentacontablesAux;
	}
	
	public void CargarTreeCuentaContableTest(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootCuentaContable = null;
        DefaultMutableTreeNode defaultMutableTreeNodeCuentaContable = null;
 
        defaultMutableTreeNodeRootCuentaContable = new DefaultMutableTreeNode("Root Arbol");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootCuentaContable);
		
		for(int i=0;i<10;i++) {
			defaultMutableTreeNodeCuentaContable = new DefaultMutableTreeNode(i);
				
			defaultMutableTreeNodeRootCuentaContable.add(defaultMutableTreeNodeCuentaContable);
		}
		
		//NO NECESARIO
		//this.defaultTreeModel.reload();
	}	
	
	public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.treeCuentaContable.getLastSelectedPathComponent();
 
        if (defaultMutableTreeNode == null) return;
 
        Object userObject = defaultMutableTreeNode.getUserObject();
		
		CuentaContable cuentacontable = (CuentaContable)userObject;
           
        if (defaultMutableTreeNode.isLeaf()) {
            //displayURL(book.bookURL);
            System.out.print(cuentacontable.getId() + ":  \n    ");            
        } else {
            
        }
        
		//this.jInternalFrameParent.setIdActual(cuentacontable.getId());
		
		try {
			//this.jInternalFrameParent.procesarBusqueda("PorId");
			if(this.getsTipoProceso().equals("BUSQUEDA_NORMAL")) {
				this.jInternalFrameParent.buscarPorId(cuentacontable.getId());			
			} else if(this.getsTipoProceso().equals("BUSQUEDA_FK")) {
				this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(cuentacontable.getId(),this.sTipoBusqueda);			
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
        TreePath currentSelection = this.treeCuentaContable.getSelectionPath();
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
        TreePath parentPath = this.treeCuentaContable.getSelectionPath();

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
            this.treeCuentaContable.scrollPathToVisible(new TreePath(childNode.getPath()));
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

