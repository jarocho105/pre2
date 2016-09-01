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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.TipoCostoGastoImporConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class TipoCostoGastoImporDetalleFormJInternalFrame extends TipoCostoGastoImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCostoGastoImpor;
	
	protected JMenuBar jmenuBarDetalleTipoCostoGastoImpor;
	
	protected JMenu jmenuDetalleTipoCostoGastoImpor;
	protected JMenu jmenuDetalleArchivoTipoCostoGastoImpor;
	protected JMenu jmenuDetalleAccionesTipoCostoGastoImpor;
	protected JMenu jmenuDetalleDatosTipoCostoGastoImpor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCostoGastoImpor;	
	protected GridBagConstraints gridBagConstraintsTipoCostoGastoImpor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCostoGastoImporBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCostoGastoImpor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCostoGastoImporSessionBean tipocostogastoimporSessionBean;
	
	
	
		
	
	public TipoCostoGastoImporLogic tipocostogastoimporLogic;
	
	public JScrollPane jScrollPanelDatosTipoCostoGastoImpor;
	public JScrollPane jScrollPanelDatosEdicionTipoCostoGastoImpor;
	public JScrollPane jScrollPanelDatosGeneralTipoCostoGastoImpor;
	
	protected JPanel jPanelCamposTipoCostoGastoImpor;    
	protected JPanel jPanelCamposOcultosTipoCostoGastoImpor;    	
	protected JPanel jPanelAccionesTipoCostoGastoImpor;
	protected JPanel jPanelAccionesFormularioTipoCostoGastoImpor;
    
	
	
	protected Integer iXPanelCamposTipoCostoGastoImpor=0;
	protected Integer iYPanelCamposTipoCostoGastoImpor=0;
	
	protected Integer iXPanelCamposOcultosTipoCostoGastoImpor=0;
	protected Integer iYPanelCamposOcultosTipoCostoGastoImpor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCostoGastoImpor;
	public JButton jButtonModificarTipoCostoGastoImpor;
	public JButton jButtonActualizarTipoCostoGastoImpor;
    public JButton jButtonEliminarTipoCostoGastoImpor;
	public JButton jButtonCancelarTipoCostoGastoImpor;
    public JButton jButtonGuardarCambiosTipoCostoGastoImpor;
	public JButton jButtonGuardarCambiosTablaTipoCostoGastoImpor;
	protected JButton jButtonCerrarTipoCostoGastoImpor;
	
	
	protected JButton jButtonProcesarInformacionTipoCostoGastoImpor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCostoGastoImpor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCostoGastoImpor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCostoGastoImpor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCostoGastoImpor;
	protected JButton jButtonModificarToolBarTipoCostoGastoImpor;
	protected JButton jButtonActualizarToolBarTipoCostoGastoImpor;
    protected JButton jButtonEliminarToolBarTipoCostoGastoImpor;
	protected JButton jButtonCancelarToolBarTipoCostoGastoImpor;
    protected JButton jButtonGuardarCambiosToolBarTipoCostoGastoImpor;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCostoGastoImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCostoGastoImpor;
	protected JButton jButtonCerrarToolBarTipoCostoGastoImpor;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCostoGastoImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCostoGastoImpor;
	protected JMenuItem jMenuItemModificarTipoCostoGastoImpor;
	protected JMenuItem jMenuItemActualizarTipoCostoGastoImpor;
    protected JMenuItem jMenuItemEliminarTipoCostoGastoImpor;
	protected JMenuItem jMenuItemCancelarTipoCostoGastoImpor;
    protected JMenuItem jMenuItemGuardarCambiosTipoCostoGastoImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCostoGastoImpor;
	protected JMenuItem jMenuItemCerrarTipoCostoGastoImpor;
	protected JMenuItem jMenuItemDetalleCerrarTipoCostoGastoImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCostoGastoImpor;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCostoGastoImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCostoGastoImpor;
	protected JMenuItem jMenuItemMostrarOcultarTipoCostoGastoImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCostoGastoImpor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCostoGastoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCostoGastoImpor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCostoGastoImpor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCostoGastoImpor;
	public JLabel jLabelIdTipoCostoGastoImpor;
	public JTextFieldMe jTextFieldidTipoCostoGastoImpor;
	public JButton jButtonidTipoCostoGastoImporBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoCostoGastoImpor;
	public JLabel jLabelcodigoTipoCostoGastoImpor;
	public JTextField jTextFieldcodigoTipoCostoGastoImpor;
	public JButton jButtoncodigoTipoCostoGastoImporBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCostoGastoImpor;
	public JLabel jLabelnombreTipoCostoGastoImpor;
	public JTextArea jTextAreanombreTipoCostoGastoImpor;
	public JScrollPane jscrollPanenombreTipoCostoGastoImpor;
	public JButton jButtonnombreTipoCostoGastoImporBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCostoGastoImpor;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoCostoGastoImporDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCostoGastoImpor=new JPanel();
				this.jPanelAccionesFormularioTipoCostoGastoImpor=new JPanel();
				this.jmenuBarDetalleTipoCostoGastoImpor=new JMenuBar();
				this.jTtoolBarDetalleTipoCostoGastoImpor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoGastoImporDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCostoGastoImporDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoGastoImporDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoGastoImporDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoGastoImporDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarTipoCostoGastoImpor() {
		return this.jButtonActualizarToolBarTipoCostoGastoImpor;
	}
	
	public JButton getjButtonEliminarToolBarTipoCostoGastoImpor() {
		return this.jButtonEliminarToolBarTipoCostoGastoImpor;
	}
	
	public JButton getjButtonCancelarToolBarTipoCostoGastoImpor() {
		return this.jButtonCancelarToolBarTipoCostoGastoImpor;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCostoGastoImpor() {
		return this.jButtonProcesarInformacionTipoCostoGastoImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCostoGastoImpor)	{
		this.jButtonProcesarInformacionTipoCostoGastoImpor = jButtonProcesarInformacionTipoCostoGastoImpor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCostoGastoImpor() {
		return this.jComboBoxTiposAccionesTipoCostoGastoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCostoGastoImpor(
			JComboBox jComboBoxTiposRelacionesTipoCostoGastoImpor) {
		this.jComboBoxTiposRelacionesTipoCostoGastoImpor = jComboBoxTiposRelacionesTipoCostoGastoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCostoGastoImpor(
			JComboBox jComboBoxTiposAccionesTipoCostoGastoImpor) {
		this.jComboBoxTiposAccionesTipoCostoGastoImpor = jComboBoxTiposAccionesTipoCostoGastoImpor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCostoGastoImpor() {
		return this.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCostoGastoImpor(
			JComboBox jComboBoxTiposAccionesFormularioTipoCostoGastoImpor) {
		this.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor = jComboBoxTiposAccionesFormularioTipoCostoGastoImpor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocostogastoimporSessionBean=new TipoCostoGastoImporSessionBean();
		
		this.tipocostogastoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocostogastoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocostogastoimporSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCostoGastoImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCostoGastoImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCostoGastoImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Costo Gasto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		TipoCostoGastoImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCostoGastoImpor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCostoGastoImpor=new JButtonMe();
				this.jButtonModificarToolBarTipoCostoGastoImpor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCostoGastoImpor,this.jTtoolBarDetalleTipoCostoGastoImpor,
							"actualizar","actualizar","Actualizar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCostoGastoImpor,this.jTtoolBarDetalleTipoCostoGastoImpor,
							"eliminar","eliminar","Eliminar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCostoGastoImpor,this.jTtoolBarDetalleTipoCostoGastoImpor,
							"cancelar","cancelar","Cancelar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCostoGastoImpor,this.jTtoolBarDetalleTipoCostoGastoImpor,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCostoGastoImpor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCostoGastoImpor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCostoGastoImpor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCostoGastoImpor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCostoGastoImpor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCostoGastoImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCostoGastoImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCostoGastoImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCostoGastoImpor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCostoGastoImpor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCostoGastoImpor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCostoGastoImpor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCostoGastoImpor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCostoGastoImpor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCostoGastoImpor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCostoGastoImpor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCostoGastoImpor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCostoGastoImpor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCostoGastoImpor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCostoGastoImpor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCostoGastoImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCostoGastoImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCostoGastoImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCostoGastoImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCostoGastoImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCostoGastoImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCostoGastoImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCostoGastoImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCostoGastoImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCostoGastoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCostoGastoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCostoGastoImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCostoGastoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCostoGastoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCostoGastoImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCostoGastoImpor.add(this.jMenuItemDetalleCerrarTipoCostoGastoImpor);
		
		this.jmenuDetalleAccionesTipoCostoGastoImpor.add(this.jMenuItemActualizarTipoCostoGastoImpor);
		this.jmenuDetalleAccionesTipoCostoGastoImpor.add(this.jMenuItemEliminarTipoCostoGastoImpor);
		this.jmenuDetalleAccionesTipoCostoGastoImpor.add(this.jMenuItemCancelarTipoCostoGastoImpor);		
		
		//this.jmenuDetalleDatosTipoCostoGastoImpor.add(this.jMenuItemDetalleAbrirOrderByTipoCostoGastoImpor);				
		this.jmenuDetalleDatosTipoCostoGastoImpor.add(this.jMenuItemDetalleMostarOcultarTipoCostoGastoImpor);				
				
		//this.jmenuDetalleAccionesTipoCostoGastoImpor.add(this.jMenuItemGuardarCambiosTipoCostoGastoImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCostoGastoImpor.add(this.jmenuDetalleArchivoTipoCostoGastoImpor);		
		this.jmenuBarDetalleTipoCostoGastoImpor.add(this.jmenuDetalleAccionesTipoCostoGastoImpor);		
		this.jmenuBarDetalleTipoCostoGastoImpor.add(this.jmenuDetalleDatosTipoCostoGastoImpor);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCostoGastoImpor);				
	}
	
	
	public void inicializarElementosCamposTipoCostoGastoImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCostoGastoImpor = new JLabelMe();
		jLabelIdTipoCostoGastoImpor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCostoGastoImpor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCostoGastoImpor.setToolTipText(TipoCostoGastoImporConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCostoGastoImpor= new GridBagLayout();

		this.jPanelidTipoCostoGastoImpor.setLayout(this.gridaBagLayoutTipoCostoGastoImpor);

		jTextFieldidTipoCostoGastoImpor = new JTextFieldMe();
		jTextFieldidTipoCostoGastoImpor.setText("Id");

		jTextFieldidTipoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoCostoGastoImpor = new JLabelMe();
		this.jLabelcodigoTipoCostoGastoImpor.setText(""+TipoCostoGastoImporConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoCostoGastoImpor.setToolTipText("Codigo");
		this.jLabelcodigoTipoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoCostoGastoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoCostoGastoImpor.setToolTipText(TipoCostoGastoImporConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoCostoGastoImpor = new GridBagLayout();
		this.jPanelcodigoTipoCostoGastoImpor.setLayout(this.gridaBagLayoutTipoCostoGastoImpor);


		jTextFieldcodigoTipoCostoGastoImpor= new JTextFieldMe();

		jTextFieldcodigoTipoCostoGastoImpor.setEnabled(false);
		jTextFieldcodigoTipoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoCostoGastoImporBusqueda= new JButtonMe();
		this.jButtoncodigoTipoCostoGastoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCostoGastoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCostoGastoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoCostoGastoImporBusqueda.setText("U");
		this.jButtoncodigoTipoCostoGastoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoCostoGastoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoCostoGastoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoCostoGastoImporBusqueda"));

		if(this.tipocostogastoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoCostoGastoImporBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoCostoGastoImpor = new JLabelMe();
		this.jLabelnombreTipoCostoGastoImpor.setText(""+TipoCostoGastoImporConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCostoGastoImpor.setToolTipText("Nombre");
		this.jLabelnombreTipoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCostoGastoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCostoGastoImpor.setToolTipText(TipoCostoGastoImporConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCostoGastoImpor = new GridBagLayout();
		this.jPanelnombreTipoCostoGastoImpor.setLayout(this.gridaBagLayoutTipoCostoGastoImpor);


		jTextAreanombreTipoCostoGastoImpor= new JTextAreaMe();
		jTextAreanombreTipoCostoGastoImpor.setEnabled(false);
		jTextAreanombreTipoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCostoGastoImpor.setLineWrap(true);
		jTextAreanombreTipoCostoGastoImpor.setWrapStyleWord(true);
		jTextAreanombreTipoCostoGastoImpor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoCostoGastoImpor.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoCostoGastoImpor = new JScrollPane(jTextAreanombreTipoCostoGastoImpor);
		jscrollPanenombreTipoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoCostoGastoImporBusqueda= new JButtonMe();
		this.jButtonnombreTipoCostoGastoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCostoGastoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCostoGastoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoCostoGastoImporBusqueda.setText("U");
		this.jButtonnombreTipoCostoGastoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoCostoGastoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoCostoGastoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoCostoGastoImporBusqueda"));

		if(this.tipocostogastoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoCostoGastoImporBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCostoGastoImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleTipoCostoGastoImpor = new TipoCostoGastoImporBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Costo Gasto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCostoGastoImpor= new GridBagLayout();
		

		
		String sToolTipTipoCostoGastoImpor="";
		sToolTipTipoCostoGastoImpor=TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCostoGastoImpor+="(Importaciones.TipoCostoGastoImpor)";
		}
		
		if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCostoGastoImpor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCostoGastoImpor = new JButtonMe();
		this.jButtonModificarTipoCostoGastoImpor = new JButtonMe();
        this.jButtonActualizarTipoCostoGastoImpor = new JButtonMe();
        this.jButtonEliminarTipoCostoGastoImpor = new JButtonMe();
        this.jButtonCancelarTipoCostoGastoImpor = new JButtonMe();
        this.jButtonGuardarCambiosTipoCostoGastoImpor = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCostoGastoImpor = new JButtonMe();
		this.jButtonCerrarTipoCostoGastoImpor = new JButtonMe();
		
		this.jScrollPanelDatosTipoCostoGastoImpor = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCostoGastoImpor = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCostoGastoImpor = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Costo Gasto";
		
		if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costo Gastos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCostoGastoImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCostoGastoImpor.setName("jPanelCamposTipoCostoGastoImpor"); 

		this.jPanelCamposOcultosTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCostoGastoImpor.setName("jPanelCamposOcultosTipoCostoGastoImpor"); 

        this.jPanelAccionesTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCostoGastoImpor.setToolTipText("Acciones");
        this.jPanelAccionesTipoCostoGastoImpor.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCostoGastoImpor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCostoGastoImpor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCostoGastoImpor.setText("Nuevo");
		this.jButtonModificarTipoCostoGastoImpor.setText("Editar");
        this.jButtonActualizarTipoCostoGastoImpor.setText("Actualizar");
        this.jButtonEliminarTipoCostoGastoImpor.setText("Eliminar");
        this.jButtonCancelarTipoCostoGastoImpor.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCostoGastoImpor.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCostoGastoImpor.setText("Guardar");
		this.jButtonCerrarTipoCostoGastoImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCostoGastoImpor,"nuevo_button","Nuevo",this.tipocostogastoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCostoGastoImpor,"modificar_button","Editar",this.tipocostogastoimporSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCostoGastoImpor,"actualizar_button","Actualizar",this.tipocostogastoimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCostoGastoImpor,"eliminar_button","Eliminar",this.tipocostogastoimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCostoGastoImpor,"cancelar_button","Cancelar",this.tipocostogastoimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCostoGastoImpor,"guardarcambios_button","Guardar",this.tipocostogastoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCostoGastoImpor,"guardarcambiostabla_button","Guardar",this.tipocostogastoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCostoGastoImpor,"cerrar_button","Salir",this.tipocostogastoimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCostoGastoImpor.setToolTipText("Nuevo"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCostoGastoImpor.setToolTipText("Editar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCostoGastoImpor.setToolTipText("Actualizar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCostoGastoImpor.setToolTipText("Eliminar)"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCostoGastoImpor.setToolTipText("Cancelar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCostoGastoImpor.setToolTipText("Guardar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCostoGastoImpor.setToolTipText("Guardar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCostoGastoImpor.setToolTipText("Salir"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoTipoCostoGastoImpor";
		inputMap = this.jButtonNuevoTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCostoGastoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCostoGastoImpor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCostoGastoImpor";
		inputMap = this.jButtonActualizarTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCostoGastoImpor"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCostoGastoImpor";
		inputMap = this.jButtonEliminarTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCostoGastoImpor"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCostoGastoImpor";
		inputMap = this.jButtonCancelarTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCostoGastoImpor"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCostoGastoImpor";
		inputMap = this.jButtonCerrarTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCostoGastoImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCostoGastoImpor";
		inputMap = this.jButtonGuardarCambiosTablaTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCostoGastoImpor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCostoGastoImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCostoGastoImpor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCostoGastoImpor.setToolTipText("Nuevo TipoCostoGastoImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCostoGastoImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCostoGastoImpor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCostoGastoImpor.setToolTipText("Sin Cerrar Ventana TipoCostoGastoImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCostoGastoImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCostoGastoImpor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCostoGastoImpor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCostoGastoImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCostoGastoImpor.setText("Accion");
		this.jComboBoxTiposAccionesTipoCostoGastoImpor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCostoGastoImpor = new JLabelMe();
		
		this.jLabelAccionesTipoCostoGastoImpor.setText("Acciones");		
		this.jLabelAccionesTipoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCostoGastoImpor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCostoGastoImpor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCostoGastoImpor=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCostoGastoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCostoGastoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCostoGastoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCostoGastoImpor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCostoGastoImpor = new GridBagLayout();
		
		this.jPanelCamposTipoCostoGastoImpor.setLayout(gridaBagLayoutCamposTipoCostoGastoImpor);
		this.jPanelCamposOcultosTipoCostoGastoImpor.setLayout(gridaBagLayoutCamposOcultosTipoCostoGastoImpor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
	this.gridBagConstraintsTipoCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsTipoCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCostoGastoImpor.add(jLabelIdTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);



	this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsTipoCostoGastoImpor.gridx = 1;
	this.gridBagConstraintsTipoCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsTipoCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCostoGastoImpor.add(jTextFieldidTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);


	this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
	this.gridBagConstraintsTipoCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsTipoCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoCostoGastoImpor.add(jLabelcodigoTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = 2;
		this.gridBagConstraintsTipoCostoGastoImpor.ipadx = 0;
		this.gridBagConstraintsTipoCostoGastoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoCostoGastoImpor.add(jButtoncodigoTipoCostoGastoImporBusqueda, this.gridBagConstraintsTipoCostoGastoImpor);
	}

	this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsTipoCostoGastoImpor.gridx = 1;
	this.gridBagConstraintsTipoCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsTipoCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoCostoGastoImpor.add(jTextFieldcodigoTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);


	this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
	this.gridBagConstraintsTipoCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsTipoCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCostoGastoImpor.add(jLabelnombreTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = 2;
		this.gridBagConstraintsTipoCostoGastoImpor.ipadx = 0;
		this.gridBagConstraintsTipoCostoGastoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCostoGastoImpor.add(jButtonnombreTipoCostoGastoImporBusqueda, this.gridBagConstraintsTipoCostoGastoImpor);
	}

	this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsTipoCostoGastoImpor.gridx = 1;
	this.gridBagConstraintsTipoCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsTipoCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCostoGastoImpor.add(jscrollPanenombreTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCostoGastoImpor.gridy = iYPanelCamposTipoCostoGastoImpor;
	this.gridBagConstraintsTipoCostoGastoImpor.gridx = iXPanelCamposTipoCostoGastoImpor++;
	this.gridBagConstraintsTipoCostoGastoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCostoGastoImpor.add(this.jPanelidTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);



	if(iXPanelCamposTipoCostoGastoImpor % 1==0) {
		iXPanelCamposTipoCostoGastoImpor=0;
		iYPanelCamposTipoCostoGastoImpor++;
	}
	this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCostoGastoImpor.gridy = iYPanelCamposTipoCostoGastoImpor;
	this.gridBagConstraintsTipoCostoGastoImpor.gridx = iXPanelCamposTipoCostoGastoImpor++;
	this.gridBagConstraintsTipoCostoGastoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCostoGastoImpor.add(this.jPanelcodigoTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);



	if(iXPanelCamposTipoCostoGastoImpor % 1==0) {
		iXPanelCamposTipoCostoGastoImpor=0;
		iYPanelCamposTipoCostoGastoImpor++;
	}
	this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCostoGastoImpor.gridy = iYPanelCamposTipoCostoGastoImpor;
	this.gridBagConstraintsTipoCostoGastoImpor.gridx = iXPanelCamposTipoCostoGastoImpor++;
	this.gridBagConstraintsTipoCostoGastoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCostoGastoImpor.add(this.jPanelnombreTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);



	if(iXPanelCamposTipoCostoGastoImpor % 1==0) {
		iXPanelCamposTipoCostoGastoImpor=0;
		iYPanelCamposTipoCostoGastoImpor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCostoGastoImpor= new GridBagLayout();
		this.jPanelAccionesTipoCostoGastoImpor.setLayout(gridaBagLayoutAccionesTipoCostoGastoImpor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCostoGastoImpor= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCostoGastoImpor.setLayout(gridaBagLayoutAccionesFormularioTipoCostoGastoImpor);
		
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCostoGastoImpor.add(this.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);

		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCostoGastoImpor.add(this.jCheckBoxPostAccionNuevoTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocostogastoimporSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCostoGastoImpor.add(this.jCheckBoxPostAccionSinCerrarTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocostogastoimporSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCostoGastoImpor.add(this.jCheckBoxPostAccionSinMensajeTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCostoGastoImpor.add(this.jButtonModificarTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);							

		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsTipoCostoGastoImpor.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCostoGastoImpor.add(this.jButtonEliminarTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		
			
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = 0;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCostoGastoImpor.add(this.jButtonActualizarTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);


		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = 0;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCostoGastoImpor.add(this.jButtonGuardarCambiosTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);	
		
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = 0;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCostoGastoImpor.add(this.jButtonCancelarTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCostoGastoImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCostoGastoImpor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();						
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;		
			//this.gridBagConstraintsTipoCostoGastoImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCostoGastoImpor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCostoGastoImpor.gridx =0;
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCostoGastoImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCostoGastoImporJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCostoGastoImpor = new TipoCostoGastoImporBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Costo Gasto DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Tipo Costo Gasto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Costo Gasto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCostoGastoImporModel tipocostogastoimporModel=new TipoCostoGastoImporModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCostoGastoImporModel.TipoCostoGastoImporFocusTraversalPolicy tipocostogastoimporFocusTraversalPolicy = tipocostogastoimporModel.new TipoCostoGastoImporFocusTraversalPolicy(this);
			
			//tipocostogastoimporFocusTraversalPolicy.settipocostogastoimporJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocostogastoimporModel);
			
			
			this.jContentPaneDetalleTipoCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCostoGastoImpor = new GridBagLayout();	
			this.jContentPaneDetalleTipoCostoGastoImpor.setLayout(gridaBagLayoutDetalleTipoCostoGastoImpor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCostoGastoImpor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
				this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCostoGastoImpor.add(jTtoolBarDetalleTipoCostoGastoImpor, gridBagConstraintsTipoCostoGastoImpor);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCostoGastoImpor=   new JScrollPane(jContentPaneDetalleTipoCostoGastoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCostoGastoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCostoGastoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCostoGastoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCostoGastoImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCostoGastoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCostoGastoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCostoGastoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
	        
			this.jContentPaneDetalleTipoCostoGastoImpor.add(jPanelCamposTipoCostoGastoImpor, gridBagConstraintsTipoCostoGastoImpor);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& tipocostogastoimporSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipocostogastoimporSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCostoGastoImpor= new GridBagConstraints();
						this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
						this.jContentPaneDetalleTipoCostoGastoImpor.add(this.jTabbedPaneRelacionesTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCostoGastoImpor.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCostoGastoImpor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
					this.gridBagConstraintsTipoCostoGastoImpor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCostoGastoImpor.add(jPanelCamposOcultosTipoCostoGastoImpor, gridBagConstraintsTipoCostoGastoImpor);
				
					this.jPanelCamposOcultosTipoCostoGastoImpor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
	        this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCostoGastoImpor.add(this.jPanelAccionesFormularioTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);							
			
			
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
	        this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCostoGastoImpor.add(this.jPanelAccionesTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCostoGastoImpor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCostoGastoImpor=   new JScrollPane(this.jPanelCamposTipoCostoGastoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCostoGastoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCostoGastoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCostoGastoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
			this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCostoGastoImpor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);			
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
			
			
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		
			
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCostoGastoImpor;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCostoGastoImpor;
    } 
	
	
	
	
	
	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
