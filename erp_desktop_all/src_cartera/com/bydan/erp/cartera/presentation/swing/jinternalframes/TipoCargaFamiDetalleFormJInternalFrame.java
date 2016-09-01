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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoCargaFamiConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoCargaFamiDetalleFormJInternalFrame extends TipoCargaFamiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCargaFami;
	
	protected JMenuBar jmenuBarDetalleTipoCargaFami;
	
	protected JMenu jmenuDetalleTipoCargaFami;
	protected JMenu jmenuDetalleArchivoTipoCargaFami;
	protected JMenu jmenuDetalleAccionesTipoCargaFami;
	protected JMenu jmenuDetalleDatosTipoCargaFami;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCargaFami = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCargaFami;	
	protected GridBagConstraints gridBagConstraintsTipoCargaFami;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCargaFamiBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCargaFami;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCargaFamiSessionBean tipocargafamiSessionBean;
	
	

	public CargaFamiliar_NMBeanSwingJInternalFrame cargafamiliar_nmBeanSwingJInternalFrame=null;
	public CargaFamiliar_NMBeanSwingJInternalFrame cargafamiliar_nmBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCargaFamiliar_NM=false;
	public CargaFamiliar_NMSessionBean cargafamiliar_nmSessionBean;

	public CargaFamiliarBeanSwingJInternalFrame cargafamiliarBeanSwingJInternalFrame=null;
	public CargaFamiliarBeanSwingJInternalFrame cargafamiliarBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCargaFamiliar=false;
	public CargaFamiliarSessionBean cargafamiliarSessionBean;
	
		
	
	public TipoCargaFamiLogic tipocargafamiLogic;
	
	public JScrollPane jScrollPanelDatosTipoCargaFami;
	public JScrollPane jScrollPanelDatosEdicionTipoCargaFami;
	public JScrollPane jScrollPanelDatosGeneralTipoCargaFami;
	
	protected JPanel jPanelCamposTipoCargaFami;    
	protected JPanel jPanelCamposOcultosTipoCargaFami;    	
	protected JPanel jPanelAccionesTipoCargaFami;
	protected JPanel jPanelAccionesFormularioTipoCargaFami;
    
	
	
	protected Integer iXPanelCamposTipoCargaFami=0;
	protected Integer iYPanelCamposTipoCargaFami=0;
	
	protected Integer iXPanelCamposOcultosTipoCargaFami=0;
	protected Integer iYPanelCamposOcultosTipoCargaFami=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCargaFami;
	public JButton jButtonModificarTipoCargaFami;
	public JButton jButtonActualizarTipoCargaFami;
    public JButton jButtonEliminarTipoCargaFami;
	public JButton jButtonCancelarTipoCargaFami;
    public JButton jButtonGuardarCambiosTipoCargaFami;
	public JButton jButtonGuardarCambiosTablaTipoCargaFami;
	protected JButton jButtonCerrarTipoCargaFami;
	
	
	protected JButton jButtonProcesarInformacionTipoCargaFami;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCargaFami;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCargaFami;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCargaFami;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCargaFami;
	protected JButton jButtonModificarToolBarTipoCargaFami;
	protected JButton jButtonActualizarToolBarTipoCargaFami;
    protected JButton jButtonEliminarToolBarTipoCargaFami;
	protected JButton jButtonCancelarToolBarTipoCargaFami;
    protected JButton jButtonGuardarCambiosToolBarTipoCargaFami;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCargaFami;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCargaFami;
	protected JButton jButtonCerrarToolBarTipoCargaFami;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCargaFami;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCargaFami;
	protected JMenuItem jMenuItemModificarTipoCargaFami;
	protected JMenuItem jMenuItemActualizarTipoCargaFami;
    protected JMenuItem jMenuItemEliminarTipoCargaFami;
	protected JMenuItem jMenuItemCancelarTipoCargaFami;
    protected JMenuItem jMenuItemGuardarCambiosTipoCargaFami;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCargaFami;
	protected JMenuItem jMenuItemCerrarTipoCargaFami;
	protected JMenuItem jMenuItemDetalleCerrarTipoCargaFami;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCargaFami;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCargaFami;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCargaFami;
	protected JMenuItem jMenuItemMostrarOcultarTipoCargaFami;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCargaFami;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCargaFami;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCargaFami;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCargaFami;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCargaFami;
	public JLabel jLabelIdTipoCargaFami;
	public JTextFieldMe jTextFieldidTipoCargaFami;
	public JButton jButtonidTipoCargaFamiBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoCargaFami;
	public JLabel jLabelcodigoTipoCargaFami;
	public JTextField jTextFieldcodigoTipoCargaFami;
	public JButton jButtoncodigoTipoCargaFamiBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCargaFami;
	public JLabel jLabelnombreTipoCargaFami;
	public JTextArea jTextAreanombreTipoCargaFami;
	public JScrollPane jscrollPanenombreTipoCargaFami;
	public JButton jButtonnombreTipoCargaFamiBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCargaFami;
	
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
	
	public TipoCargaFamiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCargaFami=new JPanel();
				this.jPanelAccionesFormularioTipoCargaFami=new JPanel();
				this.jmenuBarDetalleTipoCargaFami=new JMenuBar();
				this.jTtoolBarDetalleTipoCargaFami=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCargaFamiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCargaFami No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCargaFamiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCargaFami No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCargaFamiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCargaFami No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCargaFamiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCargaFami No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCargaFamiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCargaFami No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCargaFami() {
		return this.jButtonActualizarToolBarTipoCargaFami;
	}
	
	public JButton getjButtonEliminarToolBarTipoCargaFami() {
		return this.jButtonEliminarToolBarTipoCargaFami;
	}
	
	public JButton getjButtonCancelarToolBarTipoCargaFami() {
		return this.jButtonCancelarToolBarTipoCargaFami;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCargaFami() {
		return this.jButtonProcesarInformacionTipoCargaFami;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCargaFami)	{
		this.jButtonProcesarInformacionTipoCargaFami = jButtonProcesarInformacionTipoCargaFami;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCargaFami() {
		return this.jComboBoxTiposAccionesTipoCargaFami;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCargaFami(
			JComboBox jComboBoxTiposRelacionesTipoCargaFami) {
		this.jComboBoxTiposRelacionesTipoCargaFami = jComboBoxTiposRelacionesTipoCargaFami;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCargaFami(
			JComboBox jComboBoxTiposAccionesTipoCargaFami) {
		this.jComboBoxTiposAccionesTipoCargaFami = jComboBoxTiposAccionesTipoCargaFami;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCargaFami() {
		return this.jComboBoxTiposAccionesFormularioTipoCargaFami;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCargaFami(
			JComboBox jComboBoxTiposAccionesFormularioTipoCargaFami) {
		this.jComboBoxTiposAccionesFormularioTipoCargaFami = jComboBoxTiposAccionesFormularioTipoCargaFami;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocargafamiSessionBean=new TipoCargaFamiSessionBean();
		
		this.tipocargafamiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocargafamiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocargafamiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
		//this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCargaFamiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCargaFamiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCargaFamiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Carga Fami MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCargaFamiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCargaFami= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCargaFami=new JButtonMe();
				this.jButtonModificarToolBarTipoCargaFami=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCargaFami=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCargaFami,this.jTtoolBarDetalleTipoCargaFami,
							"actualizar","actualizar","Actualizar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCargaFami=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCargaFami,this.jTtoolBarDetalleTipoCargaFami,
							"eliminar","eliminar","Eliminar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCargaFami=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCargaFami,this.jTtoolBarDetalleTipoCargaFami,
							"cancelar","cancelar","Cancelar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCargaFami=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCargaFami,this.jTtoolBarDetalleTipoCargaFami,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCargaFami,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCargaFami,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCargaFami,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCargaFami=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCargaFami=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCargaFami=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCargaFami=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCargaFami=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCargaFami= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCargaFami.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCargaFami,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCargaFami= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCargaFami.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCargaFami,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCargaFami= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCargaFami.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCargaFami,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCargaFami= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCargaFami.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCargaFami,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCargaFami= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCargaFami.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCargaFami,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCargaFami= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCargaFami.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCargaFami,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCargaFami= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCargaFami.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCargaFami,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCargaFami= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCargaFami.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCargaFami,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCargaFami= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCargaFami.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCargaFami,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCargaFami= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCargaFami.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCargaFami,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCargaFami.add(this.jMenuItemDetalleCerrarTipoCargaFami);
		
		this.jmenuDetalleAccionesTipoCargaFami.add(this.jMenuItemActualizarTipoCargaFami);
		this.jmenuDetalleAccionesTipoCargaFami.add(this.jMenuItemEliminarTipoCargaFami);
		this.jmenuDetalleAccionesTipoCargaFami.add(this.jMenuItemCancelarTipoCargaFami);		
		
		//this.jmenuDetalleDatosTipoCargaFami.add(this.jMenuItemDetalleAbrirOrderByTipoCargaFami);				
		this.jmenuDetalleDatosTipoCargaFami.add(this.jMenuItemDetalleMostarOcultarTipoCargaFami);				
				
		//this.jmenuDetalleAccionesTipoCargaFami.add(this.jMenuItemGuardarCambiosTipoCargaFami);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCargaFami.add(this.jmenuDetalleArchivoTipoCargaFami);		
		this.jmenuBarDetalleTipoCargaFami.add(this.jmenuDetalleAccionesTipoCargaFami);		
		this.jmenuBarDetalleTipoCargaFami.add(this.jmenuDetalleDatosTipoCargaFami);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoCargaFami.add(this.jmenuDetalleTipoCargaFami);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCargaFami);				
	}
	
	
	public void inicializarElementosCamposTipoCargaFami() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCargaFami = new JLabelMe();
		jLabelIdTipoCargaFami.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCargaFami.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCargaFami.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCargaFami.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCargaFami,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCargaFami = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCargaFami.setToolTipText(TipoCargaFamiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCargaFami= new GridBagLayout();

		this.jPanelidTipoCargaFami.setLayout(this.gridaBagLayoutTipoCargaFami);

		jTextFieldidTipoCargaFami = new JTextFieldMe();
		jTextFieldidTipoCargaFami.setText("Id");

		jTextFieldidTipoCargaFami.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCargaFami.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCargaFami.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoCargaFami = new JLabelMe();
		this.jLabelcodigoTipoCargaFami.setText(""+TipoCargaFamiConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoCargaFami.setToolTipText("Codigo");
		this.jLabelcodigoTipoCargaFami.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCargaFami.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCargaFami.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoCargaFami,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoCargaFami=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoCargaFami.setToolTipText(TipoCargaFamiConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoCargaFami = new GridBagLayout();
		this.jPanelcodigoTipoCargaFami.setLayout(this.gridaBagLayoutTipoCargaFami);


		jTextFieldcodigoTipoCargaFami= new JTextFieldMe();

		jTextFieldcodigoTipoCargaFami.setEnabled(false);
		jTextFieldcodigoTipoCargaFami.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCargaFami.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCargaFami.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoCargaFami,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoCargaFamiBusqueda= new JButtonMe();
		this.jButtoncodigoTipoCargaFamiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCargaFamiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCargaFamiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoCargaFamiBusqueda.setText("U");
		this.jButtoncodigoTipoCargaFamiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoCargaFamiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoCargaFamiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoCargaFami.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoCargaFami.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoCargaFamiBusqueda"));

		if(this.tipocargafamiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoCargaFamiBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoCargaFami = new JLabelMe();
		this.jLabelnombreTipoCargaFami.setText(""+TipoCargaFamiConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCargaFami.setToolTipText("Nombre");
		this.jLabelnombreTipoCargaFami.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCargaFami.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCargaFami.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCargaFami,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCargaFami=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCargaFami.setToolTipText(TipoCargaFamiConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCargaFami = new GridBagLayout();
		this.jPanelnombreTipoCargaFami.setLayout(this.gridaBagLayoutTipoCargaFami);


		jTextAreanombreTipoCargaFami= new JTextAreaMe();
		jTextAreanombreTipoCargaFami.setEnabled(false);
		jTextAreanombreTipoCargaFami.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCargaFami.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCargaFami.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCargaFami.setLineWrap(true);
		jTextAreanombreTipoCargaFami.setWrapStyleWord(true);
		jTextAreanombreTipoCargaFami.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoCargaFami.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoCargaFami,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoCargaFami = new JScrollPane(jTextAreanombreTipoCargaFami);
		jscrollPanenombreTipoCargaFami.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCargaFami.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCargaFami.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoCargaFamiBusqueda= new JButtonMe();
		this.jButtonnombreTipoCargaFamiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCargaFamiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCargaFamiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoCargaFamiBusqueda.setText("U");
		this.jButtonnombreTipoCargaFamiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoCargaFamiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoCargaFamiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoCargaFami.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoCargaFami.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoCargaFamiBusqueda"));

		if(this.tipocargafamiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoCargaFamiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCargaFami() {
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
		//this.jInternalFrameDetalleTipoCargaFami = new TipoCargaFamiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Carga Fami DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCargaFami= new GridBagLayout();
		

		
		String sToolTipTipoCargaFami="";
		sToolTipTipoCargaFami=TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCargaFami+="(Cartera.TipoCargaFami)";
		}
		
		if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCargaFami+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCargaFami = new JButtonMe();
		this.jButtonModificarTipoCargaFami = new JButtonMe();
        this.jButtonActualizarTipoCargaFami = new JButtonMe();
        this.jButtonEliminarTipoCargaFami = new JButtonMe();
        this.jButtonCancelarTipoCargaFami = new JButtonMe();
        this.jButtonGuardarCambiosTipoCargaFami = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCargaFami = new JButtonMe();
		this.jButtonCerrarTipoCargaFami = new JButtonMe();
		
		this.jScrollPanelDatosTipoCargaFami = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCargaFami = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCargaFami = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCargaFami = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCargaFami = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCargaFami = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCargaFami = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Carga Fami";
		
		if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Carga Famis" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCargaFami.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCargaFami.setName("jPanelCamposTipoCargaFami"); 

		this.jPanelCamposOcultosTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCargaFami.setName("jPanelCamposOcultosTipoCargaFami"); 

        this.jPanelAccionesTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCargaFami.setToolTipText("Acciones");
        this.jPanelAccionesTipoCargaFami.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCargaFami.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCargaFami.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCargaFami, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCargaFami, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCargaFami, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCargaFami, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCargaFami, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCargaFami, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCargaFami.setText("Nuevo");
		this.jButtonModificarTipoCargaFami.setText("Editar");
        this.jButtonActualizarTipoCargaFami.setText("Actualizar");
        this.jButtonEliminarTipoCargaFami.setText("Eliminar");
        this.jButtonCancelarTipoCargaFami.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCargaFami.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCargaFami.setText("Guardar");
		this.jButtonCerrarTipoCargaFami.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCargaFami,"nuevo_button","Nuevo",this.tipocargafamiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCargaFami,"modificar_button","Editar",this.tipocargafamiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCargaFami,"actualizar_button","Actualizar",this.tipocargafamiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCargaFami,"eliminar_button","Eliminar",this.tipocargafamiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCargaFami,"cancelar_button","Cancelar",this.tipocargafamiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCargaFami,"guardarcambios_button","Guardar",this.tipocargafamiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCargaFami,"guardarcambiostabla_button","Guardar",this.tipocargafamiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCargaFami,"cerrar_button","Salir",this.tipocargafamiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCargaFami.setToolTipText("Nuevo"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCargaFami.setToolTipText("Editar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCargaFami.setToolTipText("Actualizar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCargaFami.setToolTipText("Eliminar)"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCargaFami.setToolTipText("Cancelar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCargaFami.setToolTipText("Guardar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCargaFami.setToolTipText("Guardar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCargaFami.setToolTipText("Salir"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCargaFami";
		inputMap = this.jButtonNuevoTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCargaFami.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCargaFami"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCargaFami";
		inputMap = this.jButtonActualizarTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCargaFami.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCargaFami"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCargaFami";
		inputMap = this.jButtonEliminarTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCargaFami.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCargaFami"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCargaFami";
		inputMap = this.jButtonCancelarTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCargaFami.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCargaFami"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCargaFami";
		inputMap = this.jButtonCerrarTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCargaFami.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCargaFami"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCargaFami";
		inputMap = this.jButtonGuardarCambiosTablaTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCargaFami.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCargaFami"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCargaFami = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCargaFami.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCargaFami.setToolTipText("Nuevo TipoCargaFami");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCargaFami, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCargaFami = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCargaFami.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCargaFami.setToolTipText("Sin Cerrar Ventana TipoCargaFami");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCargaFami = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCargaFami.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCargaFami.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCargaFami, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCargaFami = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCargaFami.setText("Accion");
		this.jComboBoxTiposAccionesTipoCargaFami.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCargaFami = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCargaFami.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCargaFami.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCargaFami = new JLabelMe();
		
		this.jLabelAccionesTipoCargaFami.setText("Acciones");		
		this.jLabelAccionesTipoCargaFami.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCargaFami.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCargaFami.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCargaFami();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCargaFami();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCargaFami=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCargaFami,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCargaFami.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCargaFami.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCargaFami.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCargaFami.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCargaFami.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCargaFami.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCargaFami, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCargaFami = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCargaFami = new GridBagLayout();
		
		this.jPanelCamposTipoCargaFami.setLayout(gridaBagLayoutCamposTipoCargaFami);
		this.jPanelCamposOcultosTipoCargaFami.setLayout(gridaBagLayoutCamposOcultosTipoCargaFami);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
	this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCargaFami.gridy = 0;
	this.gridBagConstraintsTipoCargaFami.gridx = 0;
	this.gridBagConstraintsTipoCargaFami.ipadx = 0;
	this.gridBagConstraintsTipoCargaFami.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCargaFami.add(jLabelIdTipoCargaFami, this.gridBagConstraintsTipoCargaFami);



	this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
	this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCargaFami.gridy = 0;
	this.gridBagConstraintsTipoCargaFami.gridx = 1;
	this.gridBagConstraintsTipoCargaFami.ipadx = 0;
	this.gridBagConstraintsTipoCargaFami.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCargaFami.add(jTextFieldidTipoCargaFami, this.gridBagConstraintsTipoCargaFami);


	this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
	this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCargaFami.gridy = 0;
	this.gridBagConstraintsTipoCargaFami.gridx = 0;
	this.gridBagConstraintsTipoCargaFami.ipadx = 0;
	this.gridBagConstraintsTipoCargaFami.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoCargaFami.add(jLabelcodigoTipoCargaFami, this.gridBagConstraintsTipoCargaFami);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		//this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargaFami.gridy = 0;
		this.gridBagConstraintsTipoCargaFami.gridx = 2;
		this.gridBagConstraintsTipoCargaFami.ipadx = 0;
		this.gridBagConstraintsTipoCargaFami.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoCargaFami.add(jButtoncodigoTipoCargaFamiBusqueda, this.gridBagConstraintsTipoCargaFami);
	}

	this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
	this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCargaFami.gridy = 0;
	this.gridBagConstraintsTipoCargaFami.gridx = 1;
	this.gridBagConstraintsTipoCargaFami.ipadx = 0;
	this.gridBagConstraintsTipoCargaFami.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoCargaFami.add(jTextFieldcodigoTipoCargaFami, this.gridBagConstraintsTipoCargaFami);


	this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
	this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCargaFami.gridy = 0;
	this.gridBagConstraintsTipoCargaFami.gridx = 0;
	this.gridBagConstraintsTipoCargaFami.ipadx = 0;
	this.gridBagConstraintsTipoCargaFami.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCargaFami.add(jLabelnombreTipoCargaFami, this.gridBagConstraintsTipoCargaFami);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		//this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargaFami.gridy = 0;
		this.gridBagConstraintsTipoCargaFami.gridx = 2;
		this.gridBagConstraintsTipoCargaFami.ipadx = 0;
		this.gridBagConstraintsTipoCargaFami.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCargaFami.add(jButtonnombreTipoCargaFamiBusqueda, this.gridBagConstraintsTipoCargaFami);
	}

	this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
	this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCargaFami.gridy = 0;
	this.gridBagConstraintsTipoCargaFami.gridx = 1;
	this.gridBagConstraintsTipoCargaFami.ipadx = 0;
	this.gridBagConstraintsTipoCargaFami.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCargaFami.add(jscrollPanenombreTipoCargaFami, this.gridBagConstraintsTipoCargaFami);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
	this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCargaFami.gridy = iYPanelCamposTipoCargaFami;
	this.gridBagConstraintsTipoCargaFami.gridx = iXPanelCamposTipoCargaFami++;
	this.gridBagConstraintsTipoCargaFami.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCargaFami.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCargaFami.add(this.jPanelidTipoCargaFami, this.gridBagConstraintsTipoCargaFami);



	if(iXPanelCamposTipoCargaFami % 1==0) {
		iXPanelCamposTipoCargaFami=0;
		iYPanelCamposTipoCargaFami++;
	}
	this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
	this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCargaFami.gridy = iYPanelCamposTipoCargaFami;
	this.gridBagConstraintsTipoCargaFami.gridx = iXPanelCamposTipoCargaFami++;
	this.gridBagConstraintsTipoCargaFami.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCargaFami.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCargaFami.add(this.jPanelcodigoTipoCargaFami, this.gridBagConstraintsTipoCargaFami);



	if(iXPanelCamposTipoCargaFami % 1==0) {
		iXPanelCamposTipoCargaFami=0;
		iYPanelCamposTipoCargaFami++;
	}
	this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
	this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCargaFami.gridy = iYPanelCamposTipoCargaFami;
	this.gridBagConstraintsTipoCargaFami.gridx = iXPanelCamposTipoCargaFami++;
	this.gridBagConstraintsTipoCargaFami.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCargaFami.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCargaFami.add(this.jPanelnombreTipoCargaFami, this.gridBagConstraintsTipoCargaFami);



	if(iXPanelCamposTipoCargaFami % 1==0) {
		iXPanelCamposTipoCargaFami=0;
		iYPanelCamposTipoCargaFami++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCargaFami= new GridBagLayout();
		this.jPanelAccionesTipoCargaFami.setLayout(gridaBagLayoutAccionesTipoCargaFami);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCargaFami= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCargaFami.setLayout(gridaBagLayoutAccionesFormularioTipoCargaFami);
		
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCargaFami.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCargaFami.add(this.jComboBoxTiposAccionesFormularioTipoCargaFami, this.gridBagConstraintsTipoCargaFami);

		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCargaFami.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCargaFami.add(this.jCheckBoxPostAccionNuevoTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocargafamiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCargaFami.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCargaFami.add(this.jCheckBoxPostAccionSinCerrarTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocargafamiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCargaFami.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCargaFami.add(this.jCheckBoxPostAccionSinMensajeTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargaFami.gridy = 0;
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCargaFami.add(this.jButtonModificarTipoCargaFami, this.gridBagConstraintsTipoCargaFami);							

		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargaFami.gridy = 0;
		this.gridBagConstraintsTipoCargaFami.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCargaFami.add(this.jButtonEliminarTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		
			
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy = 0;		
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCargaFami.add(this.jButtonActualizarTipoCargaFami, this.gridBagConstraintsTipoCargaFami);


		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy = 0;		
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCargaFami.add(this.jButtonGuardarCambiosTipoCargaFami, this.gridBagConstraintsTipoCargaFami);	
		
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy = 0;		
		this.gridBagConstraintsTipoCargaFami.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCargaFami.add(this.jButtonCancelarTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCargaFami = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCargaFami);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();						
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCargaFami.gridx = 0;		
			//this.gridBagConstraintsTipoCargaFami.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCargaFami.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCargaFami.gridx =0;
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCargaFami.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCargaFamiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCargaFami = new TipoCargaFamiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Carga Fami DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Carga Fami DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Carga Fami Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCargaFamiModel tipocargafamiModel=new TipoCargaFamiModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCargaFamiModel.TipoCargaFamiFocusTraversalPolicy tipocargafamiFocusTraversalPolicy = tipocargafamiModel.new TipoCargaFamiFocusTraversalPolicy(this);
			
			//tipocargafamiFocusTraversalPolicy.settipocargafamiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocargafamiModel);
			
			
			this.jContentPaneDetalleTipoCargaFami = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCargaFami = new GridBagLayout();	
			this.jContentPaneDetalleTipoCargaFami.setLayout(gridaBagLayoutDetalleTipoCargaFami);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCargaFami = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
				this.gridBagConstraintsTipoCargaFami.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCargaFami.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCargaFami.add(jTtoolBarDetalleTipoCargaFami, gridBagConstraintsTipoCargaFami);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCargaFami=   new JScrollPane(jContentPaneDetalleTipoCargaFami,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCargaFami.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCargaFami.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCargaFami.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCargaFami=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCargaFami.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCargaFami.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCargaFami.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCargaFami.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCargaFami.gridx = 0;
	        
			this.jContentPaneDetalleTipoCargaFami.add(jPanelCamposTipoCargaFami, gridBagConstraintsTipoCargaFami);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& tipocargafamiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCargaFamiliar(this.puedeCargarPorParteCargaFamiliar,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCargaFamiliar_NM(this.puedeCargarPorParteCargaFamiliar_NM,false,-1);
					
					if(this.tipocargafamiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCargaFami= new GridBagConstraints();
						this.gridBagConstraintsTipoCargaFami.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCargaFami.gridx = 0;
						this.jContentPaneDetalleTipoCargaFami.add(this.jTabbedPaneRelacionesTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCargaFami.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCargaFamiliar(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCargaFamiliar_NM(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCargaFami.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
					this.gridBagConstraintsTipoCargaFami.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCargaFami.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCargaFami.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCargaFami.add(jPanelCamposOcultosTipoCargaFami, gridBagConstraintsTipoCargaFami);
				
					this.jPanelCamposOcultosTipoCargaFami.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsTipoCargaFami.gridx = 0;
	        this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCargaFami.add(this.jPanelAccionesFormularioTipoCargaFami, this.gridBagConstraintsTipoCargaFami);							
			
			
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
	        this.gridBagConstraintsTipoCargaFami.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsTipoCargaFami.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCargaFami.add(this.jPanelAccionesTipoCargaFami, this.gridBagConstraintsTipoCargaFami);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCargaFami);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCargaFami=   new JScrollPane(this.jPanelCamposTipoCargaFami,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCargaFami.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCargaFami.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCargaFami.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCargaFami.gridx = 0;
			this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCargaFami.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCargaFami.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCargaFami, this.gridBagConstraintsTipoCargaFami);			
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCargaFami.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCargaFami, this.gridBagConstraintsTipoCargaFami);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCargaFami.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
			
			
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCargaFami.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		
			
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCargaFami.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCargaFami;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCargaFami;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCargaFamiliar(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
		this.cargafamiliarSessionBean.setConGuardarRelaciones(false);
		this.cargafamiliarSessionBean.setEsGuardarRelacionado(true);

		this.cargafamiliarBeanSwingJInternalFrame=null;//new CargaFamiliarBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cargafamiliarBeanSwingJInternalFramePopup=new CargaFamiliarBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cargafamiliarBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {

				CargaFamiliarJInternalFrame.STIPO_TAMANIO_GENERAL=TipoCargaFamiJInternalFrame.STIPO_TAMANIO_GENERAL;
				CargaFamiliarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoCargaFamiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cargafamiliarSessionBean.setEsGuardarRelacionado(true);

				this.cargafamiliarBeanSwingJInternalFrame=new CargaFamiliarBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cargafamiliarBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cargafamiliarBeanSwingJInternalFrame.setcargafamiliarSessionBean(this.cargafamiliarSessionBean);

				//this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
				//this.gridBagConstraintsTipoCargaFami.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoCargaFami.gridx = 0;
				//this.jContentPaneDetalleTipoCargaFami.add(this.cargafamiliarBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoCargaFami);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoCargaFami.add("Carga Familiares",this.cargafamiliarBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoCargaFami.setComponentAt(iIndexTab,this.cargafamiliarBeanSwingJInternalFrame.getContentPane());
				}

				//CargaFamiliarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cargafamiliarSessionBean.setEsGuardarRelacionado(false);
				this.cargafamiliarBeanSwingJInternalFrame=null;//new CargaFamiliarBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCargaFamiliar) {
					this.jTabbedPaneRelacionesTipoCargaFami.add("Carga Familiares",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCargaFamiliar_NM(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
		this.cargafamiliar_nmSessionBean.setConGuardarRelaciones(false);
		this.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(true);

		this.cargafamiliar_nmBeanSwingJInternalFrame=null;//new CargaFamiliar_NMBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cargafamiliar_nmBeanSwingJInternalFramePopup=new CargaFamiliar_NMBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cargafamiliar_nmBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {

				CargaFamiliar_NMJInternalFrame.STIPO_TAMANIO_GENERAL=TipoCargaFamiJInternalFrame.STIPO_TAMANIO_GENERAL;
				CargaFamiliar_NMJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoCargaFamiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(true);

				this.cargafamiliar_nmBeanSwingJInternalFrame=new CargaFamiliar_NMBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cargafamiliar_nmBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cargafamiliar_nmBeanSwingJInternalFrame.setcargafamiliar_nmSessionBean(this.cargafamiliar_nmSessionBean);

				//this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
				//this.gridBagConstraintsTipoCargaFami.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoCargaFami.gridx = 0;
				//this.jContentPaneDetalleTipoCargaFami.add(this.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoCargaFami);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoCargaFami.add("Carga Familiar_ N Mes",this.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoCargaFami.setComponentAt(iIndexTab,this.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane());
				}

				//CargaFamiliar_NMJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(false);
				this.cargafamiliar_nmBeanSwingJInternalFrame=null;//new CargaFamiliar_NMBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCargaFamiliar_NM) {
					this.jTabbedPaneRelacionesTipoCargaFami.add("Carga Familiar_ N Mes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCargaFamiliar_NMBeanSwingJInternalFrame(List<TipoCargaFami> tipocargafamis,TipoCargaFami tipocargafami,CargaFamiliar_NMBeanSwingJInternalFrame cargafamiliar_nmBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cargafamiliar_nmBeanSwingJInternalFrame=new CargaFamiliar_NMBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cargafamiliar_nmBeanSwingJInternalFrame.getCargaFamiliar_NMLogic().setConnexion(this.tipocargafamiLogic.getConnexion());

					cargafamiliar_nmBeanSwingJInternalFrame.settipocargafamisForeignKey(tipocargafamis);
					cargafamiliar_nmBeanSwingJInternalFrame.settipocargafamiForeignKey(tipocargafami);
					cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setisBusquedaDesdeForeignKeySesionTipoCargaFami(true);
					cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setlidTipoCargaFamiActual(tipocargafami.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cargafamiliar_nmBeanSwingJInternalFrame.cargarCombosForeignKeyCargaFamiliar_NM(cargafamiliar_nmBeanSwingJInternalFrame.isCargarCombosDependencia);
					cargafamiliar_nmBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoCargaFami(true);
					cargafamiliar_nmBeanSwingJInternalFrame.setid_tipo_carga_famiFK_IdTipoCargaFami(tipocargafami.getId());

					if(!this.conCargarFormDetalle) {
						cargafamiliar_nmBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cargafamiliar_nmBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoCargaFamiForeignKey(tipocargafami,1,false,true,true);
					cargafamiliar_nmBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cargafamiliar_nmBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoCargaFami");
					cargafamiliar_nmBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoCargaFami");
					cargafamiliar_nmBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar_NM(true);
					cargafamiliar_nmBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCargaFamiliar_NM("n",cargafamiliar_nmBeanSwingJInternalFrame.isGuardarCambiosEnLote, cargafamiliar_nmBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cargafamiliar_nmBeanSwingJInternalFrame.setAutoscrolls(true);
					cargafamiliar_nmBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cargafamiliar_nmBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar_NM("relacionado");
					} else {
						cargafamiliar_nmBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar_NM("no_relacionado");
					}

					cargafamiliar_nmBeanSwingJInternalFrame.getjButtonRecargarInformacionCargaFamiliar_NM().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCargaFamiliarBeanSwingJInternalFrame(List<TipoCargaFami> tipocargafamis,TipoCargaFami tipocargafami,CargaFamiliarBeanSwingJInternalFrame cargafamiliarBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cargafamiliarBeanSwingJInternalFrame=new CargaFamiliarBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cargafamiliarBeanSwingJInternalFrame.getCargaFamiliarLogic().setConnexion(this.tipocargafamiLogic.getConnexion());

					cargafamiliarBeanSwingJInternalFrame.settipocargafamisForeignKey(tipocargafamis);
					cargafamiliarBeanSwingJInternalFrame.settipocargafamiForeignKey(tipocargafami);
					cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setisBusquedaDesdeForeignKeySesionTipoCargaFami(true);
					cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setlidTipoCargaFamiActual(tipocargafami.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cargafamiliarBeanSwingJInternalFrame.cargarCombosForeignKeyCargaFamiliar(cargafamiliarBeanSwingJInternalFrame.isCargarCombosDependencia);
					cargafamiliarBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoCargaFami(true);
					cargafamiliarBeanSwingJInternalFrame.setid_tipo_carga_famiFK_IdTipoCargaFami(tipocargafami.getId());

					if(!this.conCargarFormDetalle) {
						cargafamiliarBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cargafamiliarBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoCargaFamiForeignKey(tipocargafami,1,false,true,true);
					cargafamiliarBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cargafamiliarBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoCargaFami");
					cargafamiliarBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoCargaFami");
					cargafamiliarBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar(true);
					cargafamiliarBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCargaFamiliar("n",cargafamiliarBeanSwingJInternalFrame.isGuardarCambiosEnLote, cargafamiliarBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cargafamiliarBeanSwingJInternalFrame.setAutoscrolls(true);
					cargafamiliarBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cargafamiliarBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar("relacionado");
					} else {
						cargafamiliarBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar("no_relacionado");
					}

					cargafamiliarBeanSwingJInternalFrame.getjButtonRecargarInformacionCargaFamiliar().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
