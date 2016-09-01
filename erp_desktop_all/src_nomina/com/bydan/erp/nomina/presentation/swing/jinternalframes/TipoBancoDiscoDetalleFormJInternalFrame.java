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



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.TipoBancoDiscoConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class TipoBancoDiscoDetalleFormJInternalFrame extends TipoBancoDiscoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoBancoDisco;
	
	protected JMenuBar jmenuBarDetalleTipoBancoDisco;
	
	protected JMenu jmenuDetalleTipoBancoDisco;
	protected JMenu jmenuDetalleArchivoTipoBancoDisco;
	protected JMenu jmenuDetalleAccionesTipoBancoDisco;
	protected JMenu jmenuDetalleDatosTipoBancoDisco;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoBancoDisco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoBancoDisco;	
	protected GridBagConstraints gridBagConstraintsTipoBancoDisco;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoBancoDiscoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoBancoDisco;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoBancoDiscoSessionBean tipobancodiscoSessionBean;
	
	
	
		
	
	public TipoBancoDiscoLogic tipobancodiscoLogic;
	
	public JScrollPane jScrollPanelDatosTipoBancoDisco;
	public JScrollPane jScrollPanelDatosEdicionTipoBancoDisco;
	public JScrollPane jScrollPanelDatosGeneralTipoBancoDisco;
	
	protected JPanel jPanelCamposTipoBancoDisco;    
	protected JPanel jPanelCamposOcultosTipoBancoDisco;    	
	protected JPanel jPanelAccionesTipoBancoDisco;
	protected JPanel jPanelAccionesFormularioTipoBancoDisco;
    
	
	
	protected Integer iXPanelCamposTipoBancoDisco=0;
	protected Integer iYPanelCamposTipoBancoDisco=0;
	
	protected Integer iXPanelCamposOcultosTipoBancoDisco=0;
	protected Integer iYPanelCamposOcultosTipoBancoDisco=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoBancoDisco;
	public JButton jButtonModificarTipoBancoDisco;
	public JButton jButtonActualizarTipoBancoDisco;
    public JButton jButtonEliminarTipoBancoDisco;
	public JButton jButtonCancelarTipoBancoDisco;
    public JButton jButtonGuardarCambiosTipoBancoDisco;
	public JButton jButtonGuardarCambiosTablaTipoBancoDisco;
	protected JButton jButtonCerrarTipoBancoDisco;
	
	
	protected JButton jButtonProcesarInformacionTipoBancoDisco;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoBancoDisco;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoBancoDisco;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoBancoDisco;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoBancoDisco;
	protected JButton jButtonModificarToolBarTipoBancoDisco;
	protected JButton jButtonActualizarToolBarTipoBancoDisco;
    protected JButton jButtonEliminarToolBarTipoBancoDisco;
	protected JButton jButtonCancelarToolBarTipoBancoDisco;
    protected JButton jButtonGuardarCambiosToolBarTipoBancoDisco;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoBancoDisco;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoBancoDisco;
	protected JButton jButtonCerrarToolBarTipoBancoDisco;
	
	protected JButton jButtonProcesarInformacionToolBarTipoBancoDisco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoBancoDisco;
	protected JMenuItem jMenuItemModificarTipoBancoDisco;
	protected JMenuItem jMenuItemActualizarTipoBancoDisco;
    protected JMenuItem jMenuItemEliminarTipoBancoDisco;
	protected JMenuItem jMenuItemCancelarTipoBancoDisco;
    protected JMenuItem jMenuItemGuardarCambiosTipoBancoDisco;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoBancoDisco;
	protected JMenuItem jMenuItemCerrarTipoBancoDisco;
	protected JMenuItem jMenuItemDetalleCerrarTipoBancoDisco;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoBancoDisco;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoBancoDisco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoBancoDisco;
	protected JMenuItem jMenuItemMostrarOcultarTipoBancoDisco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoBancoDisco;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoBancoDisco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoBancoDisco;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoBancoDisco;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoBancoDisco;
	public JLabel jLabelIdTipoBancoDisco;
	public JTextFieldMe jTextFieldidTipoBancoDisco;
	public JButton jButtonidTipoBancoDiscoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoBancoDisco;
	public JLabel jLabelcodigoTipoBancoDisco;
	public JTextField jTextFieldcodigoTipoBancoDisco;
	public JButton jButtoncodigoTipoBancoDiscoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoBancoDisco;
	public JLabel jLabelnombreTipoBancoDisco;
	public JTextArea jTextAreanombreTipoBancoDisco;
	public JScrollPane jscrollPanenombreTipoBancoDisco;
	public JButton jButtonnombreTipoBancoDiscoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoBancoDisco;
	
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
	
	public TipoBancoDiscoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoBancoDisco=new JPanel();
				this.jPanelAccionesFormularioTipoBancoDisco=new JPanel();
				this.jmenuBarDetalleTipoBancoDisco=new JMenuBar();
				this.jTtoolBarDetalleTipoBancoDisco=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoDiscoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoBancoDisco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoBancoDiscoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoBancoDisco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoDiscoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBancoDisco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoDiscoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBancoDisco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoDiscoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoBancoDisco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoBancoDisco() {
		return this.jButtonActualizarToolBarTipoBancoDisco;
	}
	
	public JButton getjButtonEliminarToolBarTipoBancoDisco() {
		return this.jButtonEliminarToolBarTipoBancoDisco;
	}
	
	public JButton getjButtonCancelarToolBarTipoBancoDisco() {
		return this.jButtonCancelarToolBarTipoBancoDisco;
	}		
	
	public JButton getjButtonProcesarInformacionTipoBancoDisco() {
		return this.jButtonProcesarInformacionTipoBancoDisco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoBancoDisco)	{
		this.jButtonProcesarInformacionTipoBancoDisco = jButtonProcesarInformacionTipoBancoDisco;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoBancoDisco() {
		return this.jComboBoxTiposAccionesTipoBancoDisco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoBancoDisco(
			JComboBox jComboBoxTiposRelacionesTipoBancoDisco) {
		this.jComboBoxTiposRelacionesTipoBancoDisco = jComboBoxTiposRelacionesTipoBancoDisco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoBancoDisco(
			JComboBox jComboBoxTiposAccionesTipoBancoDisco) {
		this.jComboBoxTiposAccionesTipoBancoDisco = jComboBoxTiposAccionesTipoBancoDisco;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoBancoDisco() {
		return this.jComboBoxTiposAccionesFormularioTipoBancoDisco;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoBancoDisco(
			JComboBox jComboBoxTiposAccionesFormularioTipoBancoDisco) {
		this.jComboBoxTiposAccionesFormularioTipoBancoDisco = jComboBoxTiposAccionesFormularioTipoBancoDisco;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipobancodiscoSessionBean=new TipoBancoDiscoSessionBean();
		
		this.tipobancodiscoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipobancodiscoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipobancodiscoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoBancoDiscoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoBancoDiscoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoBancoDiscoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Banco Disco MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoBancoDiscoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoBancoDisco= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoBancoDisco=new JButtonMe();
				this.jButtonModificarToolBarTipoBancoDisco=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoBancoDisco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoBancoDisco,this.jTtoolBarDetalleTipoBancoDisco,
							"actualizar","actualizar","Actualizar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoBancoDisco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoBancoDisco,this.jTtoolBarDetalleTipoBancoDisco,
							"eliminar","eliminar","Eliminar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoBancoDisco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoBancoDisco,this.jTtoolBarDetalleTipoBancoDisco,
							"cancelar","cancelar","Cancelar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoBancoDisco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoBancoDisco,this.jTtoolBarDetalleTipoBancoDisco,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoBancoDisco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoBancoDisco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoBancoDisco,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoBancoDisco=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoBancoDisco=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoBancoDisco=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoBancoDisco=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoBancoDisco=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoBancoDisco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoBancoDisco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoBancoDisco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoBancoDisco= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoBancoDisco.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoBancoDisco,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoBancoDisco= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoBancoDisco.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoBancoDisco,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoBancoDisco= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoBancoDisco.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoBancoDisco,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoBancoDisco= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoBancoDisco.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoBancoDisco,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoBancoDisco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoBancoDisco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoBancoDisco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoBancoDisco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoBancoDisco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoBancoDisco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoBancoDisco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoBancoDisco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoBancoDisco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoBancoDisco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoBancoDisco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoBancoDisco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoBancoDisco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoBancoDisco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoBancoDisco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoBancoDisco.add(this.jMenuItemDetalleCerrarTipoBancoDisco);
		
		this.jmenuDetalleAccionesTipoBancoDisco.add(this.jMenuItemActualizarTipoBancoDisco);
		this.jmenuDetalleAccionesTipoBancoDisco.add(this.jMenuItemEliminarTipoBancoDisco);
		this.jmenuDetalleAccionesTipoBancoDisco.add(this.jMenuItemCancelarTipoBancoDisco);		
		
		//this.jmenuDetalleDatosTipoBancoDisco.add(this.jMenuItemDetalleAbrirOrderByTipoBancoDisco);				
		this.jmenuDetalleDatosTipoBancoDisco.add(this.jMenuItemDetalleMostarOcultarTipoBancoDisco);				
				
		//this.jmenuDetalleAccionesTipoBancoDisco.add(this.jMenuItemGuardarCambiosTipoBancoDisco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoBancoDisco.add(this.jmenuDetalleArchivoTipoBancoDisco);		
		this.jmenuBarDetalleTipoBancoDisco.add(this.jmenuDetalleAccionesTipoBancoDisco);		
		this.jmenuBarDetalleTipoBancoDisco.add(this.jmenuDetalleDatosTipoBancoDisco);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoBancoDisco);				
	}
	
	
	public void inicializarElementosCamposTipoBancoDisco() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoBancoDisco = new JLabelMe();
		jLabelIdTipoBancoDisco.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoBancoDisco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoBancoDisco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoBancoDisco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoBancoDisco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoBancoDisco = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoBancoDisco.setToolTipText(TipoBancoDiscoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoBancoDisco= new GridBagLayout();

		this.jPanelidTipoBancoDisco.setLayout(this.gridaBagLayoutTipoBancoDisco);

		jTextFieldidTipoBancoDisco = new JTextFieldMe();
		jTextFieldidTipoBancoDisco.setText("Id");

		jTextFieldidTipoBancoDisco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoBancoDisco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoBancoDisco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoBancoDisco = new JLabelMe();
		this.jLabelcodigoTipoBancoDisco.setText(""+TipoBancoDiscoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoBancoDisco.setToolTipText("Codigo");
		this.jLabelcodigoTipoBancoDisco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoBancoDisco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoBancoDisco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoBancoDisco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoBancoDisco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoBancoDisco.setToolTipText(TipoBancoDiscoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoBancoDisco = new GridBagLayout();
		this.jPanelcodigoTipoBancoDisco.setLayout(this.gridaBagLayoutTipoBancoDisco);


		jTextFieldcodigoTipoBancoDisco= new JTextFieldMe();

		jTextFieldcodigoTipoBancoDisco.setEnabled(false);
		jTextFieldcodigoTipoBancoDisco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoBancoDisco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoBancoDisco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoBancoDisco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoBancoDiscoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoBancoDiscoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoBancoDiscoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoBancoDiscoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoBancoDiscoBusqueda.setText("U");
		this.jButtoncodigoTipoBancoDiscoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoBancoDiscoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoBancoDiscoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoBancoDisco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoBancoDisco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoBancoDiscoBusqueda"));

		if(this.tipobancodiscoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoBancoDiscoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoBancoDisco = new JLabelMe();
		this.jLabelnombreTipoBancoDisco.setText(""+TipoBancoDiscoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoBancoDisco.setToolTipText("Nombre");
		this.jLabelnombreTipoBancoDisco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoBancoDisco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoBancoDisco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoBancoDisco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoBancoDisco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoBancoDisco.setToolTipText(TipoBancoDiscoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoBancoDisco = new GridBagLayout();
		this.jPanelnombreTipoBancoDisco.setLayout(this.gridaBagLayoutTipoBancoDisco);


		jTextAreanombreTipoBancoDisco= new JTextAreaMe();
		jTextAreanombreTipoBancoDisco.setEnabled(false);
		jTextAreanombreTipoBancoDisco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoBancoDisco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoBancoDisco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoBancoDisco.setLineWrap(true);
		jTextAreanombreTipoBancoDisco.setWrapStyleWord(true);
		jTextAreanombreTipoBancoDisco.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoBancoDisco.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoBancoDisco,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoBancoDisco = new JScrollPane(jTextAreanombreTipoBancoDisco);
		jscrollPanenombreTipoBancoDisco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoBancoDisco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoBancoDisco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoBancoDiscoBusqueda= new JButtonMe();
		this.jButtonnombreTipoBancoDiscoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoBancoDiscoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoBancoDiscoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoBancoDiscoBusqueda.setText("U");
		this.jButtonnombreTipoBancoDiscoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoBancoDiscoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoBancoDiscoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoBancoDisco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoBancoDisco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoBancoDiscoBusqueda"));

		if(this.tipobancodiscoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoBancoDiscoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoBancoDisco() {
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
		//this.jInternalFrameDetalleTipoBancoDisco = new TipoBancoDiscoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Banco Disco DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoBancoDisco= new GridBagLayout();
		

		
		String sToolTipTipoBancoDisco="";
		sToolTipTipoBancoDisco=TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoBancoDisco+="(Nomina.TipoBancoDisco)";
		}
		
		if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoBancoDisco+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoBancoDisco = new JButtonMe();
		this.jButtonModificarTipoBancoDisco = new JButtonMe();
        this.jButtonActualizarTipoBancoDisco = new JButtonMe();
        this.jButtonEliminarTipoBancoDisco = new JButtonMe();
        this.jButtonCancelarTipoBancoDisco = new JButtonMe();
        this.jButtonGuardarCambiosTipoBancoDisco = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoBancoDisco = new JButtonMe();
		this.jButtonCerrarTipoBancoDisco = new JButtonMe();
		
		this.jScrollPanelDatosTipoBancoDisco = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoBancoDisco = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoBancoDisco = new JScrollPane();
				
		
		
		this.jPanelCamposTipoBancoDisco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoBancoDisco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoBancoDisco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoBancoDisco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Banco Disco";
		
		if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Banco Discos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoBancoDisco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoBancoDisco.setName("jPanelCamposTipoBancoDisco"); 

		this.jPanelCamposOcultosTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoBancoDisco.setName("jPanelCamposOcultosTipoBancoDisco"); 

        this.jPanelAccionesTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoBancoDisco.setToolTipText("Acciones");
        this.jPanelAccionesTipoBancoDisco.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoBancoDisco.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoBancoDisco.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoBancoDisco.setText("Nuevo");
		this.jButtonModificarTipoBancoDisco.setText("Editar");
        this.jButtonActualizarTipoBancoDisco.setText("Actualizar");
        this.jButtonEliminarTipoBancoDisco.setText("Eliminar");
        this.jButtonCancelarTipoBancoDisco.setText("Cancelar");
        this.jButtonGuardarCambiosTipoBancoDisco.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoBancoDisco.setText("Guardar");
		this.jButtonCerrarTipoBancoDisco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoBancoDisco,"nuevo_button","Nuevo",this.tipobancodiscoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoBancoDisco,"modificar_button","Editar",this.tipobancodiscoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoBancoDisco,"actualizar_button","Actualizar",this.tipobancodiscoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoBancoDisco,"eliminar_button","Eliminar",this.tipobancodiscoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoBancoDisco,"cancelar_button","Cancelar",this.tipobancodiscoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoBancoDisco,"guardarcambios_button","Guardar",this.tipobancodiscoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoBancoDisco,"guardarcambiostabla_button","Guardar",this.tipobancodiscoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoBancoDisco,"cerrar_button","Salir",this.tipobancodiscoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoBancoDisco.setToolTipText("Nuevo"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoBancoDisco.setToolTipText("Editar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoBancoDisco.setToolTipText("Actualizar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoBancoDisco.setToolTipText("Eliminar)"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoBancoDisco.setToolTipText("Cancelar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoBancoDisco.setToolTipText("Guardar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoBancoDisco.setToolTipText("Guardar"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoBancoDisco.setToolTipText("Salir"+" "+TipoBancoDiscoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoBancoDisco";
		inputMap = this.jButtonNuevoTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoBancoDisco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoBancoDisco"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoBancoDisco";
		inputMap = this.jButtonActualizarTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoBancoDisco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoBancoDisco"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoBancoDisco";
		inputMap = this.jButtonEliminarTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoBancoDisco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoBancoDisco"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoBancoDisco";
		inputMap = this.jButtonCancelarTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoBancoDisco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoBancoDisco"));
		
		//CERRAR		
		sMapKey = "CerrarTipoBancoDisco";
		inputMap = this.jButtonCerrarTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoBancoDisco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoBancoDisco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoBancoDisco";
		inputMap = this.jButtonGuardarCambiosTablaTipoBancoDisco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoBancoDisco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoBancoDisco"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoBancoDisco = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoBancoDisco.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoBancoDisco.setToolTipText("Nuevo TipoBancoDisco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoBancoDisco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoBancoDisco.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoBancoDisco.setToolTipText("Sin Cerrar Ventana TipoBancoDisco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoBancoDisco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoBancoDisco.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoBancoDisco.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoBancoDisco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoBancoDisco.setText("Accion");
		this.jComboBoxTiposAccionesTipoBancoDisco.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoBancoDisco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoBancoDisco.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoBancoDisco.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoBancoDisco = new JLabelMe();
		
		this.jLabelAccionesTipoBancoDisco.setText("Acciones");		
		this.jLabelAccionesTipoBancoDisco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBancoDisco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBancoDisco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoBancoDisco();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoBancoDisco();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoBancoDisco=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoBancoDisco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoBancoDisco,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoBancoDisco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBancoDisco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBancoDisco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoBancoDisco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoBancoDisco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoBancoDisco.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoBancoDisco, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoBancoDisco = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoBancoDisco = new GridBagLayout();
		
		this.jPanelCamposTipoBancoDisco.setLayout(gridaBagLayoutCamposTipoBancoDisco);
		this.jPanelCamposOcultosTipoBancoDisco.setLayout(gridaBagLayoutCamposOcultosTipoBancoDisco);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoDisco.gridy = 0;
	this.gridBagConstraintsTipoBancoDisco.gridx = 0;
	this.gridBagConstraintsTipoBancoDisco.ipadx = 0;
	this.gridBagConstraintsTipoBancoDisco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoBancoDisco.add(jLabelIdTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);



	this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoDisco.gridy = 0;
	this.gridBagConstraintsTipoBancoDisco.gridx = 1;
	this.gridBagConstraintsTipoBancoDisco.ipadx = 0;
	this.gridBagConstraintsTipoBancoDisco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoBancoDisco.add(jTextFieldidTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);


	this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoDisco.gridy = 0;
	this.gridBagConstraintsTipoBancoDisco.gridx = 0;
	this.gridBagConstraintsTipoBancoDisco.ipadx = 0;
	this.gridBagConstraintsTipoBancoDisco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoBancoDisco.add(jLabelcodigoTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		//this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = 0;
		this.gridBagConstraintsTipoBancoDisco.gridx = 2;
		this.gridBagConstraintsTipoBancoDisco.ipadx = 0;
		this.gridBagConstraintsTipoBancoDisco.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoBancoDisco.add(jButtoncodigoTipoBancoDiscoBusqueda, this.gridBagConstraintsTipoBancoDisco);
	}

	this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoDisco.gridy = 0;
	this.gridBagConstraintsTipoBancoDisco.gridx = 1;
	this.gridBagConstraintsTipoBancoDisco.ipadx = 0;
	this.gridBagConstraintsTipoBancoDisco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoBancoDisco.add(jTextFieldcodigoTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);


	this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoDisco.gridy = 0;
	this.gridBagConstraintsTipoBancoDisco.gridx = 0;
	this.gridBagConstraintsTipoBancoDisco.ipadx = 0;
	this.gridBagConstraintsTipoBancoDisco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoBancoDisco.add(jLabelnombreTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		//this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = 0;
		this.gridBagConstraintsTipoBancoDisco.gridx = 2;
		this.gridBagConstraintsTipoBancoDisco.ipadx = 0;
		this.gridBagConstraintsTipoBancoDisco.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoBancoDisco.add(jButtonnombreTipoBancoDiscoBusqueda, this.gridBagConstraintsTipoBancoDisco);
	}

	this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoDisco.gridy = 0;
	this.gridBagConstraintsTipoBancoDisco.gridx = 1;
	this.gridBagConstraintsTipoBancoDisco.ipadx = 0;
	this.gridBagConstraintsTipoBancoDisco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoBancoDisco.add(jscrollPanenombreTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBancoDisco.gridy = iYPanelCamposTipoBancoDisco;
	this.gridBagConstraintsTipoBancoDisco.gridx = iXPanelCamposTipoBancoDisco++;
	this.gridBagConstraintsTipoBancoDisco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBancoDisco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoBancoDisco.add(this.jPanelidTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);



	if(iXPanelCamposTipoBancoDisco % 1==0) {
		iXPanelCamposTipoBancoDisco=0;
		iYPanelCamposTipoBancoDisco++;
	}
	this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBancoDisco.gridy = iYPanelCamposTipoBancoDisco;
	this.gridBagConstraintsTipoBancoDisco.gridx = iXPanelCamposTipoBancoDisco++;
	this.gridBagConstraintsTipoBancoDisco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBancoDisco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoBancoDisco.add(this.jPanelcodigoTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);



	if(iXPanelCamposTipoBancoDisco % 1==0) {
		iXPanelCamposTipoBancoDisco=0;
		iYPanelCamposTipoBancoDisco++;
	}
	this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBancoDisco.gridy = iYPanelCamposTipoBancoDisco;
	this.gridBagConstraintsTipoBancoDisco.gridx = iXPanelCamposTipoBancoDisco++;
	this.gridBagConstraintsTipoBancoDisco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBancoDisco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoBancoDisco.add(this.jPanelnombreTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);



	if(iXPanelCamposTipoBancoDisco % 1==0) {
		iXPanelCamposTipoBancoDisco=0;
		iYPanelCamposTipoBancoDisco++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoBancoDisco= new GridBagLayout();
		this.jPanelAccionesTipoBancoDisco.setLayout(gridaBagLayoutAccionesTipoBancoDisco);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoBancoDisco= new GridBagLayout();
		this.jPanelAccionesFormularioTipoBancoDisco.setLayout(gridaBagLayoutAccionesFormularioTipoBancoDisco);
		
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoBancoDisco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoBancoDisco.add(this.jComboBoxTiposAccionesFormularioTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);

		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoBancoDisco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoBancoDisco.add(this.jCheckBoxPostAccionNuevoTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipobancodiscoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoBancoDisco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoBancoDisco.add(this.jCheckBoxPostAccionSinCerrarTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipobancodiscoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipobancodiscoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoBancoDisco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoBancoDisco.add(this.jCheckBoxPostAccionSinMensajeTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = 0;
		this.gridBagConstraintsTipoBancoDisco.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoBancoDisco.add(this.jButtonModificarTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);							

		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoDisco.gridy = 0;
		this.gridBagConstraintsTipoBancoDisco.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoBancoDisco.add(this.jButtonEliminarTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		
			
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy = 0;		
		this.gridBagConstraintsTipoBancoDisco.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoBancoDisco.add(this.jButtonActualizarTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);


		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy = 0;		
		this.gridBagConstraintsTipoBancoDisco.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoBancoDisco.add(this.jButtonGuardarCambiosTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);	
		
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy = 0;		
		this.gridBagConstraintsTipoBancoDisco.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoBancoDisco.add(this.jButtonCancelarTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoBancoDisco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoBancoDisco);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipobancodiscoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();						
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoBancoDisco.gridx = 0;		
			//this.gridBagConstraintsTipoBancoDisco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoBancoDisco.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoBancoDisco.gridx =0;
		this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoBancoDisco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoBancoDiscoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoBancoDisco = new TipoBancoDiscoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Banco Disco DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Banco Disco DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Banco Disco Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoBancoDiscoModel tipobancodiscoModel=new TipoBancoDiscoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoBancoDiscoModel.TipoBancoDiscoFocusTraversalPolicy tipobancodiscoFocusTraversalPolicy = tipobancodiscoModel.new TipoBancoDiscoFocusTraversalPolicy(this);
			
			//tipobancodiscoFocusTraversalPolicy.settipobancodiscoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipobancodiscoModel);
			
			
			this.jContentPaneDetalleTipoBancoDisco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoBancoDisco = new GridBagLayout();	
			this.jContentPaneDetalleTipoBancoDisco.setLayout(gridaBagLayoutDetalleTipoBancoDisco);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoBancoDisco = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
				this.gridBagConstraintsTipoBancoDisco.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoBancoDisco.gridx = 0;
					
				
				this.jContentPaneDetalleTipoBancoDisco.add(jTtoolBarDetalleTipoBancoDisco, gridBagConstraintsTipoBancoDisco);								
				
}
			
			this.jScrollPanelDatosEdicionTipoBancoDisco=   new JScrollPane(jContentPaneDetalleTipoBancoDisco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoBancoDisco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBancoDisco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBancoDisco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoBancoDisco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoBancoDisco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBancoDisco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBancoDisco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoBancoDisco.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoBancoDisco.gridx = 0;
	        
			this.jContentPaneDetalleTipoBancoDisco.add(jPanelCamposTipoBancoDisco, gridBagConstraintsTipoBancoDisco);
			
			
			
			
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
						&& tipobancodiscoSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipobancodiscoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoBancoDisco= new GridBagConstraints();
						this.gridBagConstraintsTipoBancoDisco.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoBancoDisco.gridx = 0;
						this.jContentPaneDetalleTipoBancoDisco.add(this.jTabbedPaneRelacionesTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoBancoDisco.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoBancoDisco.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
					this.gridBagConstraintsTipoBancoDisco.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoBancoDisco.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoBancoDisco.gridx = 0;
					
				
					this.jContentPaneDetalleTipoBancoDisco.add(jPanelCamposOcultosTipoBancoDisco, gridBagConstraintsTipoBancoDisco);
				
					this.jPanelCamposOcultosTipoBancoDisco.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoBancoDisco.gridx = 0;
	        this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoBancoDisco.add(this.jPanelAccionesFormularioTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);							
			
			
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
	        this.gridBagConstraintsTipoBancoDisco.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoBancoDisco.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoBancoDisco.add(this.jPanelAccionesTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoBancoDisco);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoBancoDisco=   new JScrollPane(this.jPanelCamposTipoBancoDisco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoBancoDisco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBancoDisco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBancoDisco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoBancoDisco.gridx = 0;
			this.gridBagConstraintsTipoBancoDisco.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoBancoDisco.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoBancoDisco.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoBancoDisco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);			
			
			this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoDisco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoBancoDisco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoDisco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
			
			
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoDisco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		
			
		this.gridBagConstraintsTipoBancoDisco = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoDisco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoDisco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoBancoDisco, this.gridBagConstraintsTipoBancoDisco);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoBancoDisco;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoBancoDisco;
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
