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
import com.bydan.erp.nomina.util.NominaConstantesFunciones;

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
public class NominaDetalleFormJInternalFrame extends NominaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleNomina;
	
	protected JMenuBar jmenuBarDetalleNomina;
	
	protected JMenu jmenuDetalleNomina;
	protected JMenu jmenuDetalleArchivoNomina;
	protected JMenu jmenuDetalleAccionesNomina;
	protected JMenu jmenuDetalleDatosNomina;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNomina;	
	protected GridBagConstraints gridBagConstraintsNomina;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected NominaBeanSwingJInternalFrameAdditional jInternalFrameDetalleNomina;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public NominaSessionBean nominaSessionBean;
	
	
	
		
	
	public NominaLogic nominaLogic;
	
	public JScrollPane jScrollPanelDatosNomina;
	public JScrollPane jScrollPanelDatosEdicionNomina;
	public JScrollPane jScrollPanelDatosGeneralNomina;
	
	protected JPanel jPanelCamposNomina;    
	protected JPanel jPanelCamposOcultosNomina;    	
	protected JPanel jPanelAccionesNomina;
	protected JPanel jPanelAccionesFormularioNomina;
    
	
	
	protected Integer iXPanelCamposNomina=0;
	protected Integer iYPanelCamposNomina=0;
	
	protected Integer iXPanelCamposOcultosNomina=0;
	protected Integer iYPanelCamposOcultosNomina=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoNomina;
	public JButton jButtonModificarNomina;
	public JButton jButtonActualizarNomina;
    public JButton jButtonEliminarNomina;
	public JButton jButtonCancelarNomina;
    public JButton jButtonGuardarCambiosNomina;
	public JButton jButtonGuardarCambiosTablaNomina;
	protected JButton jButtonCerrarNomina;
	
	
	protected JButton jButtonProcesarInformacionNomina;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoNomina;
	protected JCheckBox jCheckBoxPostAccionSinCerrarNomina;
	protected JCheckBox jCheckBoxPostAccionSinMensajeNomina;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNomina;
	protected JButton jButtonModificarToolBarNomina;
	protected JButton jButtonActualizarToolBarNomina;
    protected JButton jButtonEliminarToolBarNomina;
	protected JButton jButtonCancelarToolBarNomina;
    protected JButton jButtonGuardarCambiosToolBarNomina;
	protected JButton jButtonGuardarCambiosTablaToolBarNomina;
	protected JButton jButtonMostrarOcultarTablaToolBarNomina;
	protected JButton jButtonCerrarToolBarNomina;
	
	protected JButton jButtonProcesarInformacionToolBarNomina;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNomina;
	protected JMenuItem jMenuItemModificarNomina;
	protected JMenuItem jMenuItemActualizarNomina;
    protected JMenuItem jMenuItemEliminarNomina;
	protected JMenuItem jMenuItemCancelarNomina;
    protected JMenuItem jMenuItemGuardarCambiosNomina;
	protected JMenuItem jMenuItemGuardarCambiosTablaNomina;
	protected JMenuItem jMenuItemCerrarNomina;
	protected JMenuItem jMenuItemDetalleCerrarNomina;
	protected JMenuItem jMenuItemDetalleMostarOcultarNomina;
	
	protected JMenuItem jMenuItemProcesarInformacionNomina;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNomina;
	protected JMenuItem jMenuItemMostrarOcultarNomina;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNomina;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNomina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNomina;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioNomina;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidNomina;
	public JLabel jLabelIdNomina;
	public JLabel jLabelidNomina;
	public JButton jButtonidNominaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoNomina;
	public JLabel jLabelcodigoNomina;
	public JTextField jTextFieldcodigoNomina;
	public JButton jButtoncodigoNominaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesNomina;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public NominaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposNomina=new JPanel();
				this.jPanelAccionesFormularioNomina=new JPanel();
				this.jmenuBarDetalleNomina=new JMenuBar();
				this.jTtoolBarDetalleNomina=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NominaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Nomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public NominaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Nomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NominaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Nomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NominaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Nomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NominaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Nomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarNomina() {
		return this.jButtonActualizarToolBarNomina;
	}
	
	public JButton getjButtonEliminarToolBarNomina() {
		return this.jButtonEliminarToolBarNomina;
	}
	
	public JButton getjButtonCancelarToolBarNomina() {
		return this.jButtonCancelarToolBarNomina;
	}		
	
	public JButton getjButtonProcesarInformacionNomina() {
		return this.jButtonProcesarInformacionNomina;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNomina)	{
		this.jButtonProcesarInformacionNomina = jButtonProcesarInformacionNomina;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNomina() {
		return this.jComboBoxTiposAccionesNomina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNomina(
			JComboBox jComboBoxTiposRelacionesNomina) {
		this.jComboBoxTiposRelacionesNomina = jComboBoxTiposRelacionesNomina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNomina(
			JComboBox jComboBoxTiposAccionesNomina) {
		this.jComboBoxTiposAccionesNomina = jComboBoxTiposAccionesNomina;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioNomina() {
		return this.jComboBoxTiposAccionesFormularioNomina;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioNomina(
			JComboBox jComboBoxTiposAccionesFormularioNomina) {
		this.jComboBoxTiposAccionesFormularioNomina = jComboBoxTiposAccionesFormularioNomina;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.nominaSessionBean=new NominaSessionBean();
		
		this.nominaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.nominaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.nominaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NominaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NominaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NominaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Nomina MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.nominaSessionBean.getEsGuardarRelacionado()) {
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
	
		NominaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleNomina= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarNomina=new JButtonMe();
				this.jButtonModificarToolBarNomina=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarNomina,this.jTtoolBarDetalleNomina,
							"actualizar","actualizar","Actualizar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarNomina,this.jTtoolBarDetalleNomina,
							"eliminar","eliminar","Eliminar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarNomina,this.jTtoolBarDetalleNomina,
							"cancelar","cancelar","Cancelar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarNomina,this.jTtoolBarDetalleNomina,
							"guardarcambios","guardarcambios","Guardar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarNomina,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarNomina,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarNomina,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleNomina=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleNomina=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoNomina=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesNomina=new JMenuMe("Acciones");
		this.jmenuDetalleDatosNomina=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNomina= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNomina.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNomina,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarNomina= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarNomina.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarNomina,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarNomina= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarNomina.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarNomina,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarNomina= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarNomina.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarNomina,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarNomina= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarNomina.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarNomina,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosNomina= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNomina.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNomina,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNomina= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNomina.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNomina,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarNomina= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarNomina.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarNomina,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNomina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNomina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNomina,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNomina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNomina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNomina,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNomina, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoNomina.add(this.jMenuItemDetalleCerrarNomina);
		
		this.jmenuDetalleAccionesNomina.add(this.jMenuItemActualizarNomina);
		this.jmenuDetalleAccionesNomina.add(this.jMenuItemEliminarNomina);
		this.jmenuDetalleAccionesNomina.add(this.jMenuItemCancelarNomina);		
		
		//this.jmenuDetalleDatosNomina.add(this.jMenuItemDetalleAbrirOrderByNomina);				
		this.jmenuDetalleDatosNomina.add(this.jMenuItemDetalleMostarOcultarNomina);				
				
		//this.jmenuDetalleAccionesNomina.add(this.jMenuItemGuardarCambiosNomina);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosNomina, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleNomina.add(this.jmenuDetalleArchivoNomina);		
		this.jmenuBarDetalleNomina.add(this.jmenuDetalleAccionesNomina);		
		this.jmenuBarDetalleNomina.add(this.jmenuDetalleDatosNomina);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleNomina);				
	}
	
	
	public void inicializarElementosCamposNomina() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdNomina = new JLabelMe();
		jLabelIdNomina.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidNomina = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidNomina.setToolTipText(NominaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutNomina= new GridBagLayout();

		this.jPanelidNomina.setLayout(this.gridaBagLayoutNomina);

		jLabelidNomina = new JLabel();
		jLabelidNomina.setText("Id");

		jLabelidNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoNomina = new JLabelMe();
		this.jLabelcodigoNomina.setText(""+NominaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoNomina.setToolTipText("Codigo");
		this.jLabelcodigoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoNomina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoNomina.setToolTipText(NominaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutNomina = new GridBagLayout();
		this.jPanelcodigoNomina.setLayout(this.gridaBagLayoutNomina);


		jTextFieldcodigoNomina= new JTextFieldMe();

		jTextFieldcodigoNomina.setEnabled(false);
		jTextFieldcodigoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoNominaBusqueda= new JButtonMe();
		this.jButtoncodigoNominaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoNominaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoNominaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoNominaBusqueda.setText("U");
		this.jButtoncodigoNominaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoNominaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoNominaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoNominaBusqueda"));

		if(this.nominaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoNominaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysNomina() {
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
		//this.jInternalFrameDetalleNomina = new NominaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Nomina DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNomina= new GridBagLayout();
		

		
		String sToolTipNomina="";
		sToolTipNomina=NominaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNomina+="(Nomina.Nomina)";
		}
		
		if(!this.nominaSessionBean.getEsGuardarRelacionado()) {
			sToolTipNomina+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoNomina = new JButtonMe();
		this.jButtonModificarNomina = new JButtonMe();
        this.jButtonActualizarNomina = new JButtonMe();
        this.jButtonEliminarNomina = new JButtonMe();
        this.jButtonCancelarNomina = new JButtonMe();
        this.jButtonGuardarCambiosNomina = new JButtonMe();
		this.jButtonGuardarCambiosTablaNomina = new JButtonMe();
		this.jButtonCerrarNomina = new JButtonMe();
		
		this.jScrollPanelDatosNomina = new JScrollPane();   
        this.jScrollPanelDatosEdicionNomina = new JScrollPane();
		this.jScrollPanelDatosGeneralNomina = new JScrollPane();
				
		
		
		this.jPanelCamposNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Nomina";
		
		if(!this.nominaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nominas" + this.sPath));
		} else {
			this.jScrollPanelDatosNomina.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposNomina.setName("jPanelCamposNomina"); 

		this.jPanelCamposOcultosNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosNomina.setName("jPanelCamposOcultosNomina"); 

        this.jPanelAccionesNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNomina.setToolTipText("Acciones");
        this.jPanelAccionesNomina.setName("Acciones"); 

		this.jPanelAccionesFormularioNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioNomina.setToolTipText("Acciones");
        this.jPanelAccionesFormularioNomina.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNomina, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposNomina, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosNomina, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoNomina.setText("Nuevo");
		this.jButtonModificarNomina.setText("Editar");
        this.jButtonActualizarNomina.setText("Actualizar");
        this.jButtonEliminarNomina.setText("Eliminar");
        this.jButtonCancelarNomina.setText("Cancelar");
        this.jButtonGuardarCambiosNomina.setText("Guardar");
		this.jButtonGuardarCambiosTablaNomina.setText("Guardar");
		this.jButtonCerrarNomina.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNomina,"nuevo_button","Nuevo",this.nominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarNomina,"modificar_button","Editar",this.nominaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarNomina,"actualizar_button","Actualizar",this.nominaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarNomina,"eliminar_button","Eliminar",this.nominaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarNomina,"cancelar_button","Cancelar",this.nominaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosNomina,"guardarcambios_button","Guardar",this.nominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNomina,"guardarcambiostabla_button","Guardar",this.nominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNomina,"cerrar_button","Salir",this.nominaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoNomina.setToolTipText("Nuevo"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarNomina.setToolTipText("Editar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarNomina.setToolTipText("Actualizar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarNomina.setToolTipText("Eliminar)"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarNomina.setToolTipText("Cancelar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosNomina.setToolTipText("Guardar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaNomina.setToolTipText("Guardar"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNomina.setToolTipText("Salir"+" "+NominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNomina";
		inputMap = this.jButtonNuevoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNomina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNomina"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarNomina";
		inputMap = this.jButtonActualizarNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarNomina"));
		
		//ELIMINAR
		sMapKey = "EliminarNomina";
		inputMap = this.jButtonEliminarNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarNomina"));
		
		//CANCELAR	
		sMapKey = "CancelarNomina";
		inputMap = this.jButtonCancelarNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarNomina"));
		
		//CERRAR		
		sMapKey = "CerrarNomina";
		inputMap = this.jButtonCerrarNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNomina"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNomina";
		inputMap = this.jButtonGuardarCambiosTablaNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNomina"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoNomina = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoNomina.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoNomina.setToolTipText("Nuevo Nomina");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarNomina = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarNomina.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarNomina.setToolTipText("Sin Cerrar Ventana Nomina");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarNomina, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeNomina = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeNomina.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeNomina.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeNomina, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesNomina = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNomina.setText("Accion");
		this.jComboBoxTiposAccionesNomina.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioNomina = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioNomina.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioNomina.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesNomina = new JLabelMe();
		
		this.jLabelAccionesNomina.setText("Acciones");		
		this.jLabelAccionesNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposNomina();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysNomina();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesNomina=new JTabbedPane();
		this.jTabbedPaneRelacionesNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesNomina,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesNomina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNomina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNomina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioNomina.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNomina.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNomina.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioNomina, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposNomina = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosNomina = new GridBagLayout();
		
		this.jPanelCamposNomina.setLayout(gridaBagLayoutCamposNomina);
		this.jPanelCamposOcultosNomina.setLayout(gridaBagLayoutCamposOcultosNomina);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsNomina = new GridBagConstraints();
	this.gridBagConstraintsNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNomina.gridy = 0;
	this.gridBagConstraintsNomina.gridx = 0;
	this.gridBagConstraintsNomina.ipadx = 0;
	this.gridBagConstraintsNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidNomina.add(jLabelIdNomina, this.gridBagConstraintsNomina);



	this.gridBagConstraintsNomina = new GridBagConstraints();
	this.gridBagConstraintsNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNomina.gridy = 0;
	this.gridBagConstraintsNomina.gridx = 1;
	this.gridBagConstraintsNomina.ipadx = 0;
	this.gridBagConstraintsNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidNomina.add(jLabelidNomina, this.gridBagConstraintsNomina);


	this.gridBagConstraintsNomina = new GridBagConstraints();
	this.gridBagConstraintsNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNomina.gridy = 0;
	this.gridBagConstraintsNomina.gridx = 0;
	this.gridBagConstraintsNomina.ipadx = 0;
	this.gridBagConstraintsNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoNomina.add(jLabelcodigoNomina, this.gridBagConstraintsNomina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNomina = new GridBagConstraints();
		//this.gridBagConstraintsNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNomina.gridy = 0;
		this.gridBagConstraintsNomina.gridx = 2;
		this.gridBagConstraintsNomina.ipadx = 0;
		this.gridBagConstraintsNomina.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoNomina.add(jButtoncodigoNominaBusqueda, this.gridBagConstraintsNomina);
	}

	this.gridBagConstraintsNomina = new GridBagConstraints();
	this.gridBagConstraintsNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNomina.gridy = 0;
	this.gridBagConstraintsNomina.gridx = 1;
	this.gridBagConstraintsNomina.ipadx = 0;
	this.gridBagConstraintsNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoNomina.add(jTextFieldcodigoNomina, this.gridBagConstraintsNomina);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsNomina = new GridBagConstraints();
	this.gridBagConstraintsNomina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNomina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNomina.gridy = iYPanelCamposNomina;
	this.gridBagConstraintsNomina.gridx = iXPanelCamposNomina++;
	this.gridBagConstraintsNomina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNomina.add(this.jPanelidNomina, this.gridBagConstraintsNomina);



	if(iXPanelCamposNomina % 1==0) {
		iXPanelCamposNomina=0;
		iYPanelCamposNomina++;
	}
	this.gridBagConstraintsNomina = new GridBagConstraints();
	this.gridBagConstraintsNomina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNomina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNomina.gridy = iYPanelCamposNomina;
	this.gridBagConstraintsNomina.gridx = iXPanelCamposNomina++;
	this.gridBagConstraintsNomina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNomina.add(this.jPanelcodigoNomina, this.gridBagConstraintsNomina);



	if(iXPanelCamposNomina % 1==0) {
		iXPanelCamposNomina=0;
		iYPanelCamposNomina++;
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
			
		GridBagLayout gridaBagLayoutAccionesNomina= new GridBagLayout();
		this.jPanelAccionesNomina.setLayout(gridaBagLayoutAccionesNomina);
		
		GridBagLayout gridaBagLayoutAccionesFormularioNomina= new GridBagLayout();
		this.jPanelAccionesFormularioNomina.setLayout(gridaBagLayoutAccionesFormularioNomina);
		
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNomina.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNomina.add(this.jComboBoxTiposAccionesFormularioNomina, this.gridBagConstraintsNomina);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNomina.gridy = 0;
		this.gridBagConstraintsNomina.gridx = iPosXAccion++;
			
		this.jPanelAccionesNomina.add(this.jButtonModificarNomina, this.gridBagConstraintsNomina);							

		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNomina.gridy = 0;
		this.gridBagConstraintsNomina.gridx =iPosXAccion++;
			
		this.jPanelAccionesNomina.add(this.jButtonEliminarNomina, this.gridBagConstraintsNomina);
		
			
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.gridy = 0;		
		this.gridBagConstraintsNomina.gridx = iPosXAccion++;
		
		this.jPanelAccionesNomina.add(this.jButtonActualizarNomina, this.gridBagConstraintsNomina);


		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.gridy = 0;		
		this.gridBagConstraintsNomina.gridx = iPosXAccion++;
		
		this.jPanelAccionesNomina.add(this.jButtonGuardarCambiosNomina, this.gridBagConstraintsNomina);	
		
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.gridy = 0;		
		this.gridBagConstraintsNomina.gridx =iPosXAccion++;
		
		this.jPanelAccionesNomina.add(this.jButtonCancelarNomina, this.gridBagConstraintsNomina);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNomina = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNomina);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.nominaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNomina = new GridBagConstraints();						
			this.gridBagConstraintsNomina.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNomina.gridx = 0;		
			//this.gridBagConstraintsNomina.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNomina.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNomina.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNomina.gridx =0;
		this.gridBagConstraintsNomina.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNomina.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNomina, this.gridBagConstraintsNomina);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(NominaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleNomina = new NominaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Nomina DATOS");
			
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
			
	        //this.setTitle("[FOR] - Nomina DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Nomina Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			NominaModel nominaModel=new NominaModel(this);
			
			//SI USARA CLASE INTERNA
			//NominaModel.NominaFocusTraversalPolicy nominaFocusTraversalPolicy = nominaModel.new NominaFocusTraversalPolicy(this);
			
			//nominaFocusTraversalPolicy.setnominaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(nominaModel);
			
			
			this.jContentPaneDetalleNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleNomina = new GridBagLayout();	
			this.jContentPaneDetalleNomina.setLayout(gridaBagLayoutDetalleNomina);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNomina = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsNomina = new GridBagConstraints();
				this.gridBagConstraintsNomina.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsNomina.gridx = 0;
					
				
				this.jContentPaneDetalleNomina.add(jTtoolBarDetalleNomina, gridBagConstraintsNomina);								
				
}
			
			this.jScrollPanelDatosEdicionNomina=   new JScrollPane(jContentPaneDetalleNomina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNomina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNomina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNomina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralNomina=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNomina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNomina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNomina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			
			
	        this.gridBagConstraintsNomina.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsNomina.gridx = 0;
	        
			this.jContentPaneDetalleNomina.add(jPanelCamposNomina, gridBagConstraintsNomina);
			
			
			
			
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
						&& nominaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.nominaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsNomina= new GridBagConstraints();
						this.gridBagConstraintsNomina.gridy = iGridyRelaciones++;
						this.gridBagConstraintsNomina.gridx = 0;
						this.jContentPaneDetalleNomina.add(this.jTabbedPaneRelacionesNomina, this.gridBagConstraintsNomina);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesNomina.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosNomina.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsNomina = new GridBagConstraints();
					this.gridBagConstraintsNomina.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsNomina.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsNomina.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsNomina.gridx = 0;
					
				
					this.jContentPaneDetalleNomina.add(jPanelCamposOcultosNomina, gridBagConstraintsNomina);
				
					this.jPanelCamposOcultosNomina.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsNomina.gridx = 0;
	        this.gridBagConstraintsNomina.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleNomina.add(this.jPanelAccionesFormularioNomina, this.gridBagConstraintsNomina);							
			
			
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
	        this.gridBagConstraintsNomina.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsNomina.gridx = 0;
	        
			
			this.jContentPaneDetalleNomina.add(this.jPanelAccionesNomina, this.gridBagConstraintsNomina);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionNomina);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionNomina=   new JScrollPane(this.jPanelCamposNomina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNomina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNomina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNomina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsNomina.gridx = 0;
			this.gridBagConstraintsNomina.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsNomina.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsNomina.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionNomina, this.gridBagConstraintsNomina);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNomina.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioNomina, this.gridBagConstraintsNomina);			
			
			this.gridBagConstraintsNomina = new GridBagConstraints();
			this.gridBagConstraintsNomina.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNomina.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesNomina, this.gridBagConstraintsNomina);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNomina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNomina, this.gridBagConstraintsNomina);
			
			
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNomina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNomina, this.gridBagConstraintsNomina);
		
			
		this.gridBagConstraintsNomina = new GridBagConstraints();
		this.gridBagConstraintsNomina.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNomina.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNomina, this.gridBagConstraintsNomina);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralNomina;//jContentPane;
		
		return jScrollPanelDatosEdicionNomina;
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
