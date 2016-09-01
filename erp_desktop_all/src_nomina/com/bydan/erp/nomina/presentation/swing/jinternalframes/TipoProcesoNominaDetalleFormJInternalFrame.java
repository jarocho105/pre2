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
import com.bydan.erp.nomina.util.TipoProcesoNominaConstantesFunciones;

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
public class TipoProcesoNominaDetalleFormJInternalFrame extends TipoProcesoNominaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoProcesoNomina;
	
	protected JMenuBar jmenuBarDetalleTipoProcesoNomina;
	
	protected JMenu jmenuDetalleTipoProcesoNomina;
	protected JMenu jmenuDetalleArchivoTipoProcesoNomina;
	protected JMenu jmenuDetalleAccionesTipoProcesoNomina;
	protected JMenu jmenuDetalleDatosTipoProcesoNomina;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoProcesoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProcesoNomina;	
	protected GridBagConstraints gridBagConstraintsTipoProcesoNomina;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoProcesoNominaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoProcesoNomina;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoProcesoNominaSessionBean tipoprocesonominaSessionBean;
	
	
	
		
	
	public TipoProcesoNominaLogic tipoprocesonominaLogic;
	
	public JScrollPane jScrollPanelDatosTipoProcesoNomina;
	public JScrollPane jScrollPanelDatosEdicionTipoProcesoNomina;
	public JScrollPane jScrollPanelDatosGeneralTipoProcesoNomina;
	
	protected JPanel jPanelCamposTipoProcesoNomina;    
	protected JPanel jPanelCamposOcultosTipoProcesoNomina;    	
	protected JPanel jPanelAccionesTipoProcesoNomina;
	protected JPanel jPanelAccionesFormularioTipoProcesoNomina;
    
	
	
	protected Integer iXPanelCamposTipoProcesoNomina=0;
	protected Integer iYPanelCamposTipoProcesoNomina=0;
	
	protected Integer iXPanelCamposOcultosTipoProcesoNomina=0;
	protected Integer iYPanelCamposOcultosTipoProcesoNomina=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoProcesoNomina;
	public JButton jButtonModificarTipoProcesoNomina;
	public JButton jButtonActualizarTipoProcesoNomina;
    public JButton jButtonEliminarTipoProcesoNomina;
	public JButton jButtonCancelarTipoProcesoNomina;
    public JButton jButtonGuardarCambiosTipoProcesoNomina;
	public JButton jButtonGuardarCambiosTablaTipoProcesoNomina;
	protected JButton jButtonCerrarTipoProcesoNomina;
	
	
	protected JButton jButtonProcesarInformacionTipoProcesoNomina;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoProcesoNomina;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoProcesoNomina;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoProcesoNomina;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProcesoNomina;
	protected JButton jButtonModificarToolBarTipoProcesoNomina;
	protected JButton jButtonActualizarToolBarTipoProcesoNomina;
    protected JButton jButtonEliminarToolBarTipoProcesoNomina;
	protected JButton jButtonCancelarToolBarTipoProcesoNomina;
    protected JButton jButtonGuardarCambiosToolBarTipoProcesoNomina;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoProcesoNomina;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProcesoNomina;
	protected JButton jButtonCerrarToolBarTipoProcesoNomina;
	
	protected JButton jButtonProcesarInformacionToolBarTipoProcesoNomina;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProcesoNomina;
	protected JMenuItem jMenuItemModificarTipoProcesoNomina;
	protected JMenuItem jMenuItemActualizarTipoProcesoNomina;
    protected JMenuItem jMenuItemEliminarTipoProcesoNomina;
	protected JMenuItem jMenuItemCancelarTipoProcesoNomina;
    protected JMenuItem jMenuItemGuardarCambiosTipoProcesoNomina;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProcesoNomina;
	protected JMenuItem jMenuItemCerrarTipoProcesoNomina;
	protected JMenuItem jMenuItemDetalleCerrarTipoProcesoNomina;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProcesoNomina;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoProcesoNomina;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProcesoNomina;
	protected JMenuItem jMenuItemMostrarOcultarTipoProcesoNomina;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProcesoNomina;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProcesoNomina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProcesoNomina;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoProcesoNomina;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoProcesoNomina;
	public JLabel jLabelIdTipoProcesoNomina;
	public JTextFieldMe jTextFieldidTipoProcesoNomina;
	public JButton jButtonidTipoProcesoNominaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoProcesoNomina;
	public JLabel jLabelcodigoTipoProcesoNomina;
	public JTextField jTextFieldcodigoTipoProcesoNomina;
	public JButton jButtoncodigoTipoProcesoNominaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoProcesoNomina;
	public JLabel jLabelnombreTipoProcesoNomina;
	public JTextArea jTextAreanombreTipoProcesoNomina;
	public JScrollPane jscrollPanenombreTipoProcesoNomina;
	public JButton jButtonnombreTipoProcesoNominaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoProcesoNomina;
	
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
	
	public TipoProcesoNominaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoProcesoNomina=new JPanel();
				this.jPanelAccionesFormularioTipoProcesoNomina=new JPanel();
				this.jmenuBarDetalleTipoProcesoNomina=new JMenuBar();
				this.jTtoolBarDetalleTipoProcesoNomina=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoNominaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoProcesoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoProcesoNominaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoProcesoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoNominaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProcesoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoNominaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProcesoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoNominaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProcesoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoProcesoNomina() {
		return this.jButtonActualizarToolBarTipoProcesoNomina;
	}
	
	public JButton getjButtonEliminarToolBarTipoProcesoNomina() {
		return this.jButtonEliminarToolBarTipoProcesoNomina;
	}
	
	public JButton getjButtonCancelarToolBarTipoProcesoNomina() {
		return this.jButtonCancelarToolBarTipoProcesoNomina;
	}		
	
	public JButton getjButtonProcesarInformacionTipoProcesoNomina() {
		return this.jButtonProcesarInformacionTipoProcesoNomina;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProcesoNomina)	{
		this.jButtonProcesarInformacionTipoProcesoNomina = jButtonProcesarInformacionTipoProcesoNomina;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProcesoNomina() {
		return this.jComboBoxTiposAccionesTipoProcesoNomina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProcesoNomina(
			JComboBox jComboBoxTiposRelacionesTipoProcesoNomina) {
		this.jComboBoxTiposRelacionesTipoProcesoNomina = jComboBoxTiposRelacionesTipoProcesoNomina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProcesoNomina(
			JComboBox jComboBoxTiposAccionesTipoProcesoNomina) {
		this.jComboBoxTiposAccionesTipoProcesoNomina = jComboBoxTiposAccionesTipoProcesoNomina;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoProcesoNomina() {
		return this.jComboBoxTiposAccionesFormularioTipoProcesoNomina;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoProcesoNomina(
			JComboBox jComboBoxTiposAccionesFormularioTipoProcesoNomina) {
		this.jComboBoxTiposAccionesFormularioTipoProcesoNomina = jComboBoxTiposAccionesFormularioTipoProcesoNomina;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoprocesonominaSessionBean=new TipoProcesoNominaSessionBean();
		
		this.tipoprocesonominaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprocesonominaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprocesonominaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProcesoNominaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProcesoNominaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProcesoNominaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Proceso Nomina MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoProcesoNominaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoProcesoNomina= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoProcesoNomina=new JButtonMe();
				this.jButtonModificarToolBarTipoProcesoNomina=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoProcesoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoProcesoNomina,this.jTtoolBarDetalleTipoProcesoNomina,
							"actualizar","actualizar","Actualizar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoProcesoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoProcesoNomina,this.jTtoolBarDetalleTipoProcesoNomina,
							"eliminar","eliminar","Eliminar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoProcesoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoProcesoNomina,this.jTtoolBarDetalleTipoProcesoNomina,
							"cancelar","cancelar","Cancelar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoProcesoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoProcesoNomina,this.jTtoolBarDetalleTipoProcesoNomina,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoProcesoNomina,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoProcesoNomina,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoProcesoNomina,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoProcesoNomina=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoProcesoNomina=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoProcesoNomina=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoProcesoNomina=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoProcesoNomina=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProcesoNomina= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProcesoNomina.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProcesoNomina,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoProcesoNomina= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoProcesoNomina.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoProcesoNomina,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoProcesoNomina= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoProcesoNomina.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoProcesoNomina,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoProcesoNomina= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoProcesoNomina.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoProcesoNomina,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoProcesoNomina= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoProcesoNomina.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoProcesoNomina,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoProcesoNomina= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProcesoNomina.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProcesoNomina,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProcesoNomina= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProcesoNomina.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProcesoNomina,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoProcesoNomina= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoProcesoNomina.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoProcesoNomina,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProcesoNomina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProcesoNomina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProcesoNomina,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProcesoNomina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProcesoNomina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProcesoNomina,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoProcesoNomina.add(this.jMenuItemDetalleCerrarTipoProcesoNomina);
		
		this.jmenuDetalleAccionesTipoProcesoNomina.add(this.jMenuItemActualizarTipoProcesoNomina);
		this.jmenuDetalleAccionesTipoProcesoNomina.add(this.jMenuItemEliminarTipoProcesoNomina);
		this.jmenuDetalleAccionesTipoProcesoNomina.add(this.jMenuItemCancelarTipoProcesoNomina);		
		
		//this.jmenuDetalleDatosTipoProcesoNomina.add(this.jMenuItemDetalleAbrirOrderByTipoProcesoNomina);				
		this.jmenuDetalleDatosTipoProcesoNomina.add(this.jMenuItemDetalleMostarOcultarTipoProcesoNomina);				
				
		//this.jmenuDetalleAccionesTipoProcesoNomina.add(this.jMenuItemGuardarCambiosTipoProcesoNomina);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoProcesoNomina.add(this.jmenuDetalleArchivoTipoProcesoNomina);		
		this.jmenuBarDetalleTipoProcesoNomina.add(this.jmenuDetalleAccionesTipoProcesoNomina);		
		this.jmenuBarDetalleTipoProcesoNomina.add(this.jmenuDetalleDatosTipoProcesoNomina);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoProcesoNomina);				
	}
	
	
	public void inicializarElementosCamposTipoProcesoNomina() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoProcesoNomina = new JLabelMe();
		jLabelIdTipoProcesoNomina.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoProcesoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProcesoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProcesoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoProcesoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoProcesoNomina = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoProcesoNomina.setToolTipText(TipoProcesoNominaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoProcesoNomina= new GridBagLayout();

		this.jPanelidTipoProcesoNomina.setLayout(this.gridaBagLayoutTipoProcesoNomina);

		jTextFieldidTipoProcesoNomina = new JTextFieldMe();
		jTextFieldidTipoProcesoNomina.setText("Id");

		jTextFieldidTipoProcesoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoProcesoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoProcesoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoProcesoNomina = new JLabelMe();
		this.jLabelcodigoTipoProcesoNomina.setText(""+TipoProcesoNominaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoProcesoNomina.setToolTipText("Codigo");
		this.jLabelcodigoTipoProcesoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoProcesoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoProcesoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoProcesoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoProcesoNomina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoProcesoNomina.setToolTipText(TipoProcesoNominaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoProcesoNomina = new GridBagLayout();
		this.jPanelcodigoTipoProcesoNomina.setLayout(this.gridaBagLayoutTipoProcesoNomina);


		jTextFieldcodigoTipoProcesoNomina= new JTextFieldMe();

		jTextFieldcodigoTipoProcesoNomina.setEnabled(false);
		jTextFieldcodigoTipoProcesoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoProcesoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoProcesoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoProcesoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoProcesoNominaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoProcesoNominaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoProcesoNominaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoProcesoNominaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoProcesoNominaBusqueda.setText("U");
		this.jButtoncodigoTipoProcesoNominaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoProcesoNominaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoProcesoNominaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoProcesoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoProcesoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoProcesoNominaBusqueda"));

		if(this.tipoprocesonominaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoProcesoNominaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoProcesoNomina = new JLabelMe();
		this.jLabelnombreTipoProcesoNomina.setText(""+TipoProcesoNominaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoProcesoNomina.setToolTipText("Nombre");
		this.jLabelnombreTipoProcesoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProcesoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProcesoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoProcesoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoProcesoNomina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoProcesoNomina.setToolTipText(TipoProcesoNominaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoProcesoNomina = new GridBagLayout();
		this.jPanelnombreTipoProcesoNomina.setLayout(this.gridaBagLayoutTipoProcesoNomina);


		jTextAreanombreTipoProcesoNomina= new JTextAreaMe();
		jTextAreanombreTipoProcesoNomina.setEnabled(false);
		jTextAreanombreTipoProcesoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProcesoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProcesoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProcesoNomina.setLineWrap(true);
		jTextAreanombreTipoProcesoNomina.setWrapStyleWord(true);
		jTextAreanombreTipoProcesoNomina.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoProcesoNomina.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoProcesoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoProcesoNomina = new JScrollPane(jTextAreanombreTipoProcesoNomina);
		jscrollPanenombreTipoProcesoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoProcesoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoProcesoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoProcesoNominaBusqueda= new JButtonMe();
		this.jButtonnombreTipoProcesoNominaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProcesoNominaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProcesoNominaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoProcesoNominaBusqueda.setText("U");
		this.jButtonnombreTipoProcesoNominaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoProcesoNominaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoProcesoNominaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoProcesoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoProcesoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoProcesoNominaBusqueda"));

		if(this.tipoprocesonominaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoProcesoNominaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoProcesoNomina() {
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
		//this.jInternalFrameDetalleTipoProcesoNomina = new TipoProcesoNominaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Proceso Nomina DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProcesoNomina= new GridBagLayout();
		

		
		String sToolTipTipoProcesoNomina="";
		sToolTipTipoProcesoNomina=TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProcesoNomina+="(Nomina.TipoProcesoNomina)";
		}
		
		if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProcesoNomina+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoProcesoNomina = new JButtonMe();
		this.jButtonModificarTipoProcesoNomina = new JButtonMe();
        this.jButtonActualizarTipoProcesoNomina = new JButtonMe();
        this.jButtonEliminarTipoProcesoNomina = new JButtonMe();
        this.jButtonCancelarTipoProcesoNomina = new JButtonMe();
        this.jButtonGuardarCambiosTipoProcesoNomina = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoProcesoNomina = new JButtonMe();
		this.jButtonCerrarTipoProcesoNomina = new JButtonMe();
		
		this.jScrollPanelDatosTipoProcesoNomina = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoProcesoNomina = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoProcesoNomina = new JScrollPane();
				
		
		
		this.jPanelCamposTipoProcesoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoProcesoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoProcesoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoProcesoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Proceso Nomina";
		
		if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proceso Nominaes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProcesoNomina.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoProcesoNomina.setName("jPanelCamposTipoProcesoNomina"); 

		this.jPanelCamposOcultosTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoProcesoNomina.setName("jPanelCamposOcultosTipoProcesoNomina"); 

        this.jPanelAccionesTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProcesoNomina.setToolTipText("Acciones");
        this.jPanelAccionesTipoProcesoNomina.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoProcesoNomina.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoProcesoNomina.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoProcesoNomina.setText("Nuevo");
		this.jButtonModificarTipoProcesoNomina.setText("Editar");
        this.jButtonActualizarTipoProcesoNomina.setText("Actualizar");
        this.jButtonEliminarTipoProcesoNomina.setText("Eliminar");
        this.jButtonCancelarTipoProcesoNomina.setText("Cancelar");
        this.jButtonGuardarCambiosTipoProcesoNomina.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoProcesoNomina.setText("Guardar");
		this.jButtonCerrarTipoProcesoNomina.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProcesoNomina,"nuevo_button","Nuevo",this.tipoprocesonominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoProcesoNomina,"modificar_button","Editar",this.tipoprocesonominaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoProcesoNomina,"actualizar_button","Actualizar",this.tipoprocesonominaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoProcesoNomina,"eliminar_button","Eliminar",this.tipoprocesonominaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoProcesoNomina,"cancelar_button","Cancelar",this.tipoprocesonominaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoProcesoNomina,"guardarcambios_button","Guardar",this.tipoprocesonominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProcesoNomina,"guardarcambiostabla_button","Guardar",this.tipoprocesonominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProcesoNomina,"cerrar_button","Salir",this.tipoprocesonominaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoProcesoNomina.setToolTipText("Nuevo"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoProcesoNomina.setToolTipText("Editar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoProcesoNomina.setToolTipText("Actualizar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoProcesoNomina.setToolTipText("Eliminar)"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoProcesoNomina.setToolTipText("Cancelar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoProcesoNomina.setToolTipText("Guardar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoProcesoNomina.setToolTipText("Guardar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProcesoNomina.setToolTipText("Salir"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProcesoNomina";
		inputMap = this.jButtonNuevoTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProcesoNomina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProcesoNomina"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoProcesoNomina";
		inputMap = this.jButtonActualizarTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoProcesoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoProcesoNomina"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoProcesoNomina";
		inputMap = this.jButtonEliminarTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoProcesoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoProcesoNomina"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoProcesoNomina";
		inputMap = this.jButtonCancelarTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoProcesoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoProcesoNomina"));
		
		//CERRAR		
		sMapKey = "CerrarTipoProcesoNomina";
		inputMap = this.jButtonCerrarTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProcesoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProcesoNomina"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProcesoNomina";
		inputMap = this.jButtonGuardarCambiosTablaTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProcesoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProcesoNomina"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoProcesoNomina = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoProcesoNomina.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoProcesoNomina.setToolTipText("Nuevo TipoProcesoNomina");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoProcesoNomina = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoProcesoNomina.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoProcesoNomina.setToolTipText("Sin Cerrar Ventana TipoProcesoNomina");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoProcesoNomina = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoProcesoNomina.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoProcesoNomina.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoProcesoNomina = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProcesoNomina.setText("Accion");
		this.jComboBoxTiposAccionesTipoProcesoNomina.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoProcesoNomina = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoProcesoNomina.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoProcesoNomina.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoProcesoNomina = new JLabelMe();
		
		this.jLabelAccionesTipoProcesoNomina.setText("Acciones");		
		this.jLabelAccionesTipoProcesoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProcesoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProcesoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoProcesoNomina();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoProcesoNomina();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoProcesoNomina=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoProcesoNomina,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoProcesoNomina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProcesoNomina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProcesoNomina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoProcesoNomina.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProcesoNomina.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProcesoNomina.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoProcesoNomina = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoProcesoNomina = new GridBagLayout();
		
		this.jPanelCamposTipoProcesoNomina.setLayout(gridaBagLayoutCamposTipoProcesoNomina);
		this.jPanelCamposOcultosTipoProcesoNomina.setLayout(gridaBagLayoutCamposOcultosTipoProcesoNomina);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoNomina.gridy = 0;
	this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
	this.gridBagConstraintsTipoProcesoNomina.ipadx = 0;
	this.gridBagConstraintsTipoProcesoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoProcesoNomina.add(jLabelIdTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);



	this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoNomina.gridy = 0;
	this.gridBagConstraintsTipoProcesoNomina.gridx = 1;
	this.gridBagConstraintsTipoProcesoNomina.ipadx = 0;
	this.gridBagConstraintsTipoProcesoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoProcesoNomina.add(jTextFieldidTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);


	this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoNomina.gridy = 0;
	this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
	this.gridBagConstraintsTipoProcesoNomina.ipadx = 0;
	this.gridBagConstraintsTipoProcesoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoProcesoNomina.add(jLabelcodigoTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		//this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = 0;
		this.gridBagConstraintsTipoProcesoNomina.gridx = 2;
		this.gridBagConstraintsTipoProcesoNomina.ipadx = 0;
		this.gridBagConstraintsTipoProcesoNomina.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoProcesoNomina.add(jButtoncodigoTipoProcesoNominaBusqueda, this.gridBagConstraintsTipoProcesoNomina);
	}

	this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoNomina.gridy = 0;
	this.gridBagConstraintsTipoProcesoNomina.gridx = 1;
	this.gridBagConstraintsTipoProcesoNomina.ipadx = 0;
	this.gridBagConstraintsTipoProcesoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoProcesoNomina.add(jTextFieldcodigoTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);


	this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoNomina.gridy = 0;
	this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
	this.gridBagConstraintsTipoProcesoNomina.ipadx = 0;
	this.gridBagConstraintsTipoProcesoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoProcesoNomina.add(jLabelnombreTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		//this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = 0;
		this.gridBagConstraintsTipoProcesoNomina.gridx = 2;
		this.gridBagConstraintsTipoProcesoNomina.ipadx = 0;
		this.gridBagConstraintsTipoProcesoNomina.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoProcesoNomina.add(jButtonnombreTipoProcesoNominaBusqueda, this.gridBagConstraintsTipoProcesoNomina);
	}

	this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoNomina.gridy = 0;
	this.gridBagConstraintsTipoProcesoNomina.gridx = 1;
	this.gridBagConstraintsTipoProcesoNomina.ipadx = 0;
	this.gridBagConstraintsTipoProcesoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoProcesoNomina.add(jscrollPanenombreTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProcesoNomina.gridy = iYPanelCamposTipoProcesoNomina;
	this.gridBagConstraintsTipoProcesoNomina.gridx = iXPanelCamposTipoProcesoNomina++;
	this.gridBagConstraintsTipoProcesoNomina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProcesoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProcesoNomina.add(this.jPanelidTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);



	if(iXPanelCamposTipoProcesoNomina % 1==0) {
		iXPanelCamposTipoProcesoNomina=0;
		iYPanelCamposTipoProcesoNomina++;
	}
	this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProcesoNomina.gridy = iYPanelCamposTipoProcesoNomina;
	this.gridBagConstraintsTipoProcesoNomina.gridx = iXPanelCamposTipoProcesoNomina++;
	this.gridBagConstraintsTipoProcesoNomina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProcesoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProcesoNomina.add(this.jPanelcodigoTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);



	if(iXPanelCamposTipoProcesoNomina % 1==0) {
		iXPanelCamposTipoProcesoNomina=0;
		iYPanelCamposTipoProcesoNomina++;
	}
	this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProcesoNomina.gridy = iYPanelCamposTipoProcesoNomina;
	this.gridBagConstraintsTipoProcesoNomina.gridx = iXPanelCamposTipoProcesoNomina++;
	this.gridBagConstraintsTipoProcesoNomina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProcesoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProcesoNomina.add(this.jPanelnombreTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);



	if(iXPanelCamposTipoProcesoNomina % 1==0) {
		iXPanelCamposTipoProcesoNomina=0;
		iYPanelCamposTipoProcesoNomina++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoProcesoNomina= new GridBagLayout();
		this.jPanelAccionesTipoProcesoNomina.setLayout(gridaBagLayoutAccionesTipoProcesoNomina);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoProcesoNomina= new GridBagLayout();
		this.jPanelAccionesFormularioTipoProcesoNomina.setLayout(gridaBagLayoutAccionesFormularioTipoProcesoNomina);
		
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProcesoNomina.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProcesoNomina.add(this.jComboBoxTiposAccionesFormularioTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);

		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProcesoNomina.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProcesoNomina.add(this.jCheckBoxPostAccionNuevoTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoprocesonominaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProcesoNomina.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProcesoNomina.add(this.jCheckBoxPostAccionSinCerrarTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoprocesonominaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProcesoNomina.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProcesoNomina.add(this.jCheckBoxPostAccionSinMensajeTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = 0;
		this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoProcesoNomina.add(this.jButtonModificarTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);							

		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = 0;
		this.gridBagConstraintsTipoProcesoNomina.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoProcesoNomina.add(this.jButtonEliminarTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		
			
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy = 0;		
		this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProcesoNomina.add(this.jButtonActualizarTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);


		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy = 0;		
		this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProcesoNomina.add(this.jButtonGuardarCambiosTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);	
		
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy = 0;		
		this.gridBagConstraintsTipoProcesoNomina.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoProcesoNomina.add(this.jButtonCancelarTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProcesoNomina = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProcesoNomina);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();						
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProcesoNomina.gridx = 0;		
			//this.gridBagConstraintsTipoProcesoNomina.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProcesoNomina.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProcesoNomina.gridx =0;
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProcesoNomina.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoProcesoNominaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoProcesoNomina = new TipoProcesoNominaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Proceso Nomina DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Proceso Nomina DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Proceso Nomina Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoProcesoNominaModel tipoprocesonominaModel=new TipoProcesoNominaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoProcesoNominaModel.TipoProcesoNominaFocusTraversalPolicy tipoprocesonominaFocusTraversalPolicy = tipoprocesonominaModel.new TipoProcesoNominaFocusTraversalPolicy(this);
			
			//tipoprocesonominaFocusTraversalPolicy.settipoprocesonominaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoprocesonominaModel);
			
			
			this.jContentPaneDetalleTipoProcesoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoProcesoNomina = new GridBagLayout();	
			this.jContentPaneDetalleTipoProcesoNomina.setLayout(gridaBagLayoutDetalleTipoProcesoNomina);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProcesoNomina = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
				this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
					
				
				this.jContentPaneDetalleTipoProcesoNomina.add(jTtoolBarDetalleTipoProcesoNomina, gridBagConstraintsTipoProcesoNomina);								
				
}
			
			this.jScrollPanelDatosEdicionTipoProcesoNomina=   new JScrollPane(jContentPaneDetalleTipoProcesoNomina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProcesoNomina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProcesoNomina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProcesoNomina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoProcesoNomina=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProcesoNomina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProcesoNomina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProcesoNomina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
	        
			this.jContentPaneDetalleTipoProcesoNomina.add(jPanelCamposTipoProcesoNomina, gridBagConstraintsTipoProcesoNomina);
			
			
			
			
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
						&& tipoprocesonominaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoprocesonominaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoProcesoNomina= new GridBagConstraints();
						this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
						this.jContentPaneDetalleTipoProcesoNomina.add(this.jTabbedPaneRelacionesTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoProcesoNomina.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoProcesoNomina.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
					this.gridBagConstraintsTipoProcesoNomina.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
					
				
					this.jContentPaneDetalleTipoProcesoNomina.add(jPanelCamposOcultosTipoProcesoNomina, gridBagConstraintsTipoProcesoNomina);
				
					this.jPanelCamposOcultosTipoProcesoNomina.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
	        this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoProcesoNomina.add(this.jPanelAccionesFormularioTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);							
			
			
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
	        this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoProcesoNomina.add(this.jPanelAccionesTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoProcesoNomina);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoProcesoNomina=   new JScrollPane(this.jPanelCamposTipoProcesoNomina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProcesoNomina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProcesoNomina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProcesoNomina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
			this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoProcesoNomina.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);			
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
			
			
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		
			
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoNomina.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoProcesoNomina;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoProcesoNomina;
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
