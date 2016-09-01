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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.ProcesoUtilidadesConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class ProcesoUtilidadesDetalleFormJInternalFrame extends ProcesoUtilidadesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoUtilidades;
	
	protected JMenuBar jmenuBarDetalleProcesoUtilidades;
	
	protected JMenu jmenuDetalleProcesoUtilidades;
	protected JMenu jmenuDetalleArchivoProcesoUtilidades;
	protected JMenu jmenuDetalleAccionesProcesoUtilidades;
	protected JMenu jmenuDetalleDatosProcesoUtilidades;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoUtilidades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoUtilidades;	
	protected GridBagConstraints gridBagConstraintsProcesoUtilidades;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoUtilidadesBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoUtilidades;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";
	
	public ProcesoUtilidadesSessionBean procesoutilidadesSessionBean;
	
	
	
	
	public AnioSessionBean anioSessionBean;	
	
	public ProcesoUtilidadesLogic procesoutilidadesLogic;
	
	public JScrollPane jScrollPanelDatosProcesoUtilidades;
	public JScrollPane jScrollPanelDatosEdicionProcesoUtilidades;
	public JScrollPane jScrollPanelDatosGeneralProcesoUtilidades;
	
	protected JPanel jPanelCamposProcesoUtilidades;    
	protected JPanel jPanelCamposOcultosProcesoUtilidades;    	
	protected JPanel jPanelAccionesProcesoUtilidades;
	protected JPanel jPanelAccionesFormularioProcesoUtilidades;
    
	
	
	protected Integer iXPanelCamposProcesoUtilidades=0;
	protected Integer iYPanelCamposProcesoUtilidades=0;
	
	protected Integer iXPanelCamposOcultosProcesoUtilidades=0;
	protected Integer iYPanelCamposOcultosProcesoUtilidades=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoUtilidades;
	public JButton jButtonModificarProcesoUtilidades;
	public JButton jButtonActualizarProcesoUtilidades;
    public JButton jButtonEliminarProcesoUtilidades;
	public JButton jButtonCancelarProcesoUtilidades;
    public JButton jButtonGuardarCambiosProcesoUtilidades;
	public JButton jButtonGuardarCambiosTablaProcesoUtilidades;
	protected JButton jButtonCerrarProcesoUtilidades;
	
	
	protected JButton jButtonProcesarInformacionProcesoUtilidades;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoUtilidades;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoUtilidades;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoUtilidades;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoUtilidades;
	protected JButton jButtonModificarToolBarProcesoUtilidades;
	protected JButton jButtonActualizarToolBarProcesoUtilidades;
    protected JButton jButtonEliminarToolBarProcesoUtilidades;
	protected JButton jButtonCancelarToolBarProcesoUtilidades;
    protected JButton jButtonGuardarCambiosToolBarProcesoUtilidades;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoUtilidades;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoUtilidades;
	protected JButton jButtonCerrarToolBarProcesoUtilidades;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoUtilidades;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoUtilidades;
	protected JMenuItem jMenuItemModificarProcesoUtilidades;
	protected JMenuItem jMenuItemActualizarProcesoUtilidades;
    protected JMenuItem jMenuItemEliminarProcesoUtilidades;
	protected JMenuItem jMenuItemCancelarProcesoUtilidades;
    protected JMenuItem jMenuItemGuardarCambiosProcesoUtilidades;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoUtilidades;
	protected JMenuItem jMenuItemCerrarProcesoUtilidades;
	protected JMenuItem jMenuItemDetalleCerrarProcesoUtilidades;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoUtilidades;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoUtilidades;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoUtilidades;
	protected JMenuItem jMenuItemMostrarOcultarProcesoUtilidades;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoUtilidades;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoUtilidades;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoUtilidades;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoUtilidades;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoUtilidades;
	public JLabel jLabelIdProcesoUtilidades;
	public JLabel jLabelidProcesoUtilidades;
	public JButton jButtonidProcesoUtilidadesBusqueda= new JButtonMe();

	public JPanel jPanelvalorProcesoUtilidades;
	public JLabel jLabelvalorProcesoUtilidades;
	public JTextField jTextFieldvalorProcesoUtilidades;
	public JButton jButtonvalorProcesoUtilidadesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioProcesoUtilidades;
	public JLabel jLabelid_anioProcesoUtilidades;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioProcesoUtilidades;
	public JButton jButtonid_anioProcesoUtilidades= new JButtonMe();
	public JButton jButtonid_anioProcesoUtilidadesUpdate= new JButtonMe();
	public JButton jButtonid_anioProcesoUtilidadesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoUtilidades;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoUtilidadesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoUtilidades=new JPanel();
				this.jPanelAccionesFormularioProcesoUtilidades=new JPanel();
				this.jmenuBarDetalleProcesoUtilidades=new JMenuBar();
				this.jTtoolBarDetalleProcesoUtilidades=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoUtilidadesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoUtilidades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoUtilidadesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoUtilidades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoUtilidadesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoUtilidades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoUtilidadesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoUtilidades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoUtilidadesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoUtilidades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoUtilidades() {
		return this.jButtonActualizarToolBarProcesoUtilidades;
	}
	
	public JButton getjButtonEliminarToolBarProcesoUtilidades() {
		return this.jButtonEliminarToolBarProcesoUtilidades;
	}
	
	public JButton getjButtonCancelarToolBarProcesoUtilidades() {
		return this.jButtonCancelarToolBarProcesoUtilidades;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoUtilidades() {
		return this.jButtonProcesarInformacionProcesoUtilidades;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoUtilidades)	{
		this.jButtonProcesarInformacionProcesoUtilidades = jButtonProcesarInformacionProcesoUtilidades;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoUtilidades() {
		return this.jComboBoxTiposAccionesProcesoUtilidades;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoUtilidades(
			JComboBox jComboBoxTiposRelacionesProcesoUtilidades) {
		this.jComboBoxTiposRelacionesProcesoUtilidades = jComboBoxTiposRelacionesProcesoUtilidades;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoUtilidades(
			JComboBox jComboBoxTiposAccionesProcesoUtilidades) {
		this.jComboBoxTiposAccionesProcesoUtilidades = jComboBoxTiposAccionesProcesoUtilidades;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoUtilidades() {
		return this.jComboBoxTiposAccionesFormularioProcesoUtilidades;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoUtilidades(
			JComboBox jComboBoxTiposAccionesFormularioProcesoUtilidades) {
		this.jComboBoxTiposAccionesFormularioProcesoUtilidades = jComboBoxTiposAccionesFormularioProcesoUtilidades;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesoutilidadesSessionBean=new ProcesoUtilidadesSessionBean();
		
		this.procesoutilidadesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoutilidadesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesoutilidadesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoUtilidadesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoUtilidadesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoUtilidadesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Utilidades MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoUtilidadesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoUtilidades= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoUtilidades=new JButtonMe();
				this.jButtonModificarToolBarProcesoUtilidades=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoUtilidades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoUtilidades,this.jTtoolBarDetalleProcesoUtilidades,
							"actualizar","actualizar","Actualizar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoUtilidades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoUtilidades,this.jTtoolBarDetalleProcesoUtilidades,
							"eliminar","eliminar","Eliminar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoUtilidades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoUtilidades,this.jTtoolBarDetalleProcesoUtilidades,
							"cancelar","cancelar","Cancelar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoUtilidades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoUtilidades,this.jTtoolBarDetalleProcesoUtilidades,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoUtilidades,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoUtilidades,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoUtilidades,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoUtilidades=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoUtilidades=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoUtilidades=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoUtilidades=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoUtilidades=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoUtilidades= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoUtilidades.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoUtilidades,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoUtilidades= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoUtilidades.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoUtilidades,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoUtilidades= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoUtilidades.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoUtilidades,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoUtilidades= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoUtilidades.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoUtilidades,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoUtilidades= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoUtilidades.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoUtilidades,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoUtilidades= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoUtilidades.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoUtilidades,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoUtilidades= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoUtilidades.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoUtilidades,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoUtilidades= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoUtilidades.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoUtilidades,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoUtilidades= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoUtilidades.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoUtilidades,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoUtilidades= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoUtilidades.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoUtilidades,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoUtilidades.add(this.jMenuItemDetalleCerrarProcesoUtilidades);
		
		this.jmenuDetalleAccionesProcesoUtilidades.add(this.jMenuItemActualizarProcesoUtilidades);
		this.jmenuDetalleAccionesProcesoUtilidades.add(this.jMenuItemEliminarProcesoUtilidades);
		this.jmenuDetalleAccionesProcesoUtilidades.add(this.jMenuItemCancelarProcesoUtilidades);		
		
		//this.jmenuDetalleDatosProcesoUtilidades.add(this.jMenuItemDetalleAbrirOrderByProcesoUtilidades);				
		this.jmenuDetalleDatosProcesoUtilidades.add(this.jMenuItemDetalleMostarOcultarProcesoUtilidades);				
				
		//this.jmenuDetalleAccionesProcesoUtilidades.add(this.jMenuItemGuardarCambiosProcesoUtilidades);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoUtilidades.add(this.jmenuDetalleArchivoProcesoUtilidades);		
		this.jmenuBarDetalleProcesoUtilidades.add(this.jmenuDetalleAccionesProcesoUtilidades);		
		this.jmenuBarDetalleProcesoUtilidades.add(this.jmenuDetalleDatosProcesoUtilidades);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoUtilidades);				
	}
	
	
	public void inicializarElementosCamposProcesoUtilidades() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoUtilidades = new JLabelMe();
		jLabelIdProcesoUtilidades.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoUtilidades,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoUtilidades = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoUtilidades.setToolTipText(ProcesoUtilidadesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoUtilidades= new GridBagLayout();

		this.jPanelidProcesoUtilidades.setLayout(this.gridaBagLayoutProcesoUtilidades);

		jLabelidProcesoUtilidades = new JLabel();
		jLabelidProcesoUtilidades.setText("Id");

		jLabelidProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorProcesoUtilidades = new JLabelMe();
		this.jLabelvalorProcesoUtilidades.setText(""+ProcesoUtilidadesConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorProcesoUtilidades.setToolTipText("Valor");
		this.jLabelvalorProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorProcesoUtilidades,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorProcesoUtilidades=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorProcesoUtilidades.setToolTipText(ProcesoUtilidadesConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutProcesoUtilidades = new GridBagLayout();
		this.jPanelvalorProcesoUtilidades.setLayout(this.gridaBagLayoutProcesoUtilidades);


		jTextFieldvalorProcesoUtilidades= new JTextFieldMe();
		jTextFieldvalorProcesoUtilidades.setEnabled(false);
		jTextFieldvalorProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorProcesoUtilidades,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorProcesoUtilidades.setText("0.0");

		this.jButtonvalorProcesoUtilidadesBusqueda= new JButtonMe();
		this.jButtonvalorProcesoUtilidadesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorProcesoUtilidadesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorProcesoUtilidadesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorProcesoUtilidadesBusqueda.setText("U");
		this.jButtonvalorProcesoUtilidadesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorProcesoUtilidadesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorProcesoUtilidadesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorProcesoUtilidades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorProcesoUtilidades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorProcesoUtilidadesBusqueda"));

		if(this.procesoutilidadesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorProcesoUtilidadesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoUtilidades() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_anioProcesoUtilidades = new JLabelMe();
		this.jLabelid_anioProcesoUtilidades.setText(""+ProcesoUtilidadesConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioProcesoUtilidades.setToolTipText("Anio");
		this.jLabelid_anioProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioProcesoUtilidades,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioProcesoUtilidades=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioProcesoUtilidades.setToolTipText(ProcesoUtilidadesConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutProcesoUtilidades = new GridBagLayout();
		this.jPanelid_anioProcesoUtilidades.setLayout(this.gridaBagLayoutProcesoUtilidades);


		jComboBoxid_anioProcesoUtilidades= new JComboBoxMe();
		jComboBoxid_anioProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioProcesoUtilidades,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioProcesoUtilidades= new JButtonMe();
		this.jButtonid_anioProcesoUtilidades.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesoUtilidades.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesoUtilidades.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesoUtilidades.setText("Procesar");
		this.jButtonid_anioProcesoUtilidades.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioProcesoUtilidades.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesoUtilidades,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioProcesoUtilidades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesoUtilidades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesoUtilidades"));

		this.jButtonid_anioProcesoUtilidadesBusqueda= new JButtonMe();
		this.jButtonid_anioProcesoUtilidadesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoUtilidadesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoUtilidadesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProcesoUtilidadesBusqueda.setText("U");
		this.jButtonid_anioProcesoUtilidadesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioProcesoUtilidadesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesoUtilidadesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioProcesoUtilidades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesoUtilidades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesoUtilidadesBusqueda"));

		if(this.procesoutilidadesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioProcesoUtilidadesBusqueda.setVisible(false);		}

		this.jButtonid_anioProcesoUtilidadesUpdate= new JButtonMe();
		this.jButtonid_anioProcesoUtilidadesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoUtilidadesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoUtilidadesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProcesoUtilidadesUpdate.setText("U");
		this.jButtonid_anioProcesoUtilidadesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioProcesoUtilidadesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesoUtilidadesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioProcesoUtilidades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesoUtilidades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesoUtilidadesUpdate"));



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
		//this.jInternalFrameDetalleProcesoUtilidades = new ProcesoUtilidadesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Utilidades DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoUtilidades= new GridBagLayout();
		

		
		String sToolTipProcesoUtilidades="";
		sToolTipProcesoUtilidades=ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoUtilidades+="(Nomina.ProcesoUtilidades)";
		}
		
		if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoUtilidades+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoUtilidades = new JButtonMe();
		this.jButtonModificarProcesoUtilidades = new JButtonMe();
        this.jButtonActualizarProcesoUtilidades = new JButtonMe();
        this.jButtonEliminarProcesoUtilidades = new JButtonMe();
        this.jButtonCancelarProcesoUtilidades = new JButtonMe();
        this.jButtonGuardarCambiosProcesoUtilidades = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoUtilidades = new JButtonMe();
		this.jButtonCerrarProcesoUtilidades = new JButtonMe();
		
		this.jScrollPanelDatosProcesoUtilidades = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoUtilidades = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoUtilidades = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoUtilidades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoUtilidades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoUtilidades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoUtilidades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Utilidades";
		
		if(!this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Utilidadeses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoUtilidades.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoUtilidades.setName("jPanelCamposProcesoUtilidades"); 

		this.jPanelCamposOcultosProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoUtilidades.setName("jPanelCamposOcultosProcesoUtilidades"); 

        this.jPanelAccionesProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoUtilidades.setToolTipText("Acciones");
        this.jPanelAccionesProcesoUtilidades.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoUtilidades.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoUtilidades.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoUtilidades.setText("Nuevo");
		this.jButtonModificarProcesoUtilidades.setText("Editar");
        this.jButtonActualizarProcesoUtilidades.setText("Actualizar");
        this.jButtonEliminarProcesoUtilidades.setText("Eliminar");
        this.jButtonCancelarProcesoUtilidades.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoUtilidades.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoUtilidades.setText("Guardar");
		this.jButtonCerrarProcesoUtilidades.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoUtilidades,"nuevo_button","Nuevo",this.procesoutilidadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoUtilidades,"modificar_button","Editar",this.procesoutilidadesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoUtilidades,"actualizar_button","Actualizar",this.procesoutilidadesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoUtilidades,"eliminar_button","Eliminar",this.procesoutilidadesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoUtilidades,"cancelar_button","Cancelar",this.procesoutilidadesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoUtilidades,"guardarcambios_button","Guardar",this.procesoutilidadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoUtilidades,"guardarcambiostabla_button","Guardar",this.procesoutilidadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoUtilidades,"cerrar_button","Salir",this.procesoutilidadesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoUtilidades.setToolTipText("Nuevo"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoUtilidades.setToolTipText("Editar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoUtilidades.setToolTipText("Actualizar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoUtilidades.setToolTipText("Eliminar)"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoUtilidades.setToolTipText("Cancelar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoUtilidades.setToolTipText("Guardar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoUtilidades.setToolTipText("Guardar"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoUtilidades.setToolTipText("Salir"+" "+ProcesoUtilidadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoUtilidades";
		inputMap = this.jButtonNuevoProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoUtilidades.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoUtilidades"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoUtilidades";
		inputMap = this.jButtonActualizarProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoUtilidades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoUtilidades"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoUtilidades";
		inputMap = this.jButtonEliminarProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoUtilidades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoUtilidades"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoUtilidades";
		inputMap = this.jButtonCancelarProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoUtilidades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoUtilidades"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoUtilidades";
		inputMap = this.jButtonCerrarProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoUtilidades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoUtilidades"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoUtilidades";
		inputMap = this.jButtonGuardarCambiosTablaProcesoUtilidades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoUtilidades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoUtilidades"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoUtilidades = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoUtilidades.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoUtilidades.setToolTipText("Nuevo ProcesoUtilidades");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoUtilidades = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoUtilidades.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoUtilidades.setToolTipText("Sin Cerrar Ventana ProcesoUtilidades");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoUtilidades = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoUtilidades.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoUtilidades.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoUtilidades = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoUtilidades.setText("Accion");
		this.jComboBoxTiposAccionesProcesoUtilidades.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoUtilidades = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoUtilidades.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoUtilidades.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoUtilidades = new JLabelMe();
		
		this.jLabelAccionesProcesoUtilidades.setText("Acciones");		
		this.jLabelAccionesProcesoUtilidades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoUtilidades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoUtilidades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoUtilidades();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoUtilidades();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoUtilidades=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoUtilidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoUtilidades,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoUtilidades.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoUtilidades.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoUtilidades.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoUtilidades.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoUtilidades.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoUtilidades.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoUtilidades, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoUtilidades = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoUtilidades = new GridBagLayout();
		
		this.jPanelCamposProcesoUtilidades.setLayout(gridaBagLayoutCamposProcesoUtilidades);
		this.jPanelCamposOcultosProcesoUtilidades.setLayout(gridaBagLayoutCamposOcultosProcesoUtilidades);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
	this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoUtilidades.gridy = 0;
	this.gridBagConstraintsProcesoUtilidades.gridx = 0;
	this.gridBagConstraintsProcesoUtilidades.ipadx = 0;
	this.gridBagConstraintsProcesoUtilidades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoUtilidades.add(jLabelIdProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);



	this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
	this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoUtilidades.gridy = 0;
	this.gridBagConstraintsProcesoUtilidades.gridx = 1;
	this.gridBagConstraintsProcesoUtilidades.ipadx = 0;
	this.gridBagConstraintsProcesoUtilidades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoUtilidades.add(jLabelidProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);


	this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
	this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoUtilidades.gridy = 0;
	this.gridBagConstraintsProcesoUtilidades.gridx = 0;
	this.gridBagConstraintsProcesoUtilidades.ipadx = 0;
	this.gridBagConstraintsProcesoUtilidades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioProcesoUtilidades.add(jLabelid_anioProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		//this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = 0;
		this.gridBagConstraintsProcesoUtilidades.gridx = 2;
		this.gridBagConstraintsProcesoUtilidades.ipadx = 0;
		this.gridBagConstraintsProcesoUtilidades.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProcesoUtilidades.add(jButtonid_anioProcesoUtilidadesBusqueda, this.gridBagConstraintsProcesoUtilidades);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		//this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = 0;
		this.gridBagConstraintsProcesoUtilidades.gridx = 3;
		this.gridBagConstraintsProcesoUtilidades.ipadx = 0;
		this.gridBagConstraintsProcesoUtilidades.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProcesoUtilidades.add(jButtonid_anioProcesoUtilidadesUpdate, this.gridBagConstraintsProcesoUtilidades);
	}

	this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
	this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoUtilidades.gridy = 0;
	this.gridBagConstraintsProcesoUtilidades.gridx = 1;
	this.gridBagConstraintsProcesoUtilidades.ipadx = 0;
	this.gridBagConstraintsProcesoUtilidades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioProcesoUtilidades.add(jComboBoxid_anioProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);


	this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
	this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoUtilidades.gridy = 0;
	this.gridBagConstraintsProcesoUtilidades.gridx = 0;
	this.gridBagConstraintsProcesoUtilidades.ipadx = 0;
	this.gridBagConstraintsProcesoUtilidades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorProcesoUtilidades.add(jLabelvalorProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		//this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = 0;
		this.gridBagConstraintsProcesoUtilidades.gridx = 2;
		this.gridBagConstraintsProcesoUtilidades.ipadx = 0;
		this.gridBagConstraintsProcesoUtilidades.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorProcesoUtilidades.add(jButtonvalorProcesoUtilidadesBusqueda, this.gridBagConstraintsProcesoUtilidades);
	}

	this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
	this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoUtilidades.gridy = 0;
	this.gridBagConstraintsProcesoUtilidades.gridx = 1;
	this.gridBagConstraintsProcesoUtilidades.ipadx = 0;
	this.gridBagConstraintsProcesoUtilidades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorProcesoUtilidades.add(jTextFieldvalorProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
	this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoUtilidades.gridy = iYPanelCamposProcesoUtilidades;
	this.gridBagConstraintsProcesoUtilidades.gridx = iXPanelCamposProcesoUtilidades++;
	this.gridBagConstraintsProcesoUtilidades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoUtilidades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoUtilidades.add(this.jPanelidProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);



	if(iXPanelCamposProcesoUtilidades % 1==0) {
		iXPanelCamposProcesoUtilidades=0;
		iYPanelCamposProcesoUtilidades++;
	}
	this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
	this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoUtilidades.gridy = iYPanelCamposProcesoUtilidades;
	this.gridBagConstraintsProcesoUtilidades.gridx = iXPanelCamposProcesoUtilidades++;
	this.gridBagConstraintsProcesoUtilidades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoUtilidades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoUtilidades.add(this.jPanelid_anioProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);



	if(iXPanelCamposProcesoUtilidades % 1==0) {
		iXPanelCamposProcesoUtilidades=0;
		iYPanelCamposProcesoUtilidades++;
	}
	this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
	this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoUtilidades.gridy = iYPanelCamposProcesoUtilidades;
	this.gridBagConstraintsProcesoUtilidades.gridx = iXPanelCamposProcesoUtilidades++;
	this.gridBagConstraintsProcesoUtilidades.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoUtilidades.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoUtilidades.add(this.jPanelvalorProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);



	if(iXPanelCamposProcesoUtilidades % 1==0) {
		iXPanelCamposProcesoUtilidades=0;
		iYPanelCamposProcesoUtilidades++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoUtilidades= new GridBagLayout();
		this.jPanelAccionesProcesoUtilidades.setLayout(gridaBagLayoutAccionesProcesoUtilidades);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoUtilidades= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoUtilidades.setLayout(gridaBagLayoutAccionesFormularioProcesoUtilidades);
		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoUtilidades.add(this.jComboBoxTiposAccionesFormularioProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = 0;
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoUtilidades.add(this.jButtonModificarProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);							

		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoUtilidades.gridy = 0;
		this.gridBagConstraintsProcesoUtilidades.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoUtilidades.add(this.jButtonEliminarProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		
			
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.gridy = 0;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoUtilidades.add(this.jButtonActualizarProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);


		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.gridy = 0;		
		this.gridBagConstraintsProcesoUtilidades.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoUtilidades.add(this.jButtonGuardarCambiosProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);	
		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.gridy = 0;		
		this.gridBagConstraintsProcesoUtilidades.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoUtilidades.add(this.jButtonCancelarProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoUtilidades = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoUtilidades);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesoutilidadesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();						
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoUtilidades.gridx = 0;		
			//this.gridBagConstraintsProcesoUtilidades.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoUtilidades.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoUtilidades.gridx =0;
		this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoUtilidades.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoUtilidadesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoUtilidades = new ProcesoUtilidadesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Utilidades DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Utilidades DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Utilidades Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoUtilidadesModel procesoutilidadesModel=new ProcesoUtilidadesModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoUtilidadesModel.ProcesoUtilidadesFocusTraversalPolicy procesoutilidadesFocusTraversalPolicy = procesoutilidadesModel.new ProcesoUtilidadesFocusTraversalPolicy(this);
			
			//procesoutilidadesFocusTraversalPolicy.setprocesoutilidadesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesoutilidadesModel);
			
			
			this.jContentPaneDetalleProcesoUtilidades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoUtilidades = new GridBagLayout();	
			this.jContentPaneDetalleProcesoUtilidades.setLayout(gridaBagLayoutDetalleProcesoUtilidades);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoUtilidades = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
				this.gridBagConstraintsProcesoUtilidades.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoUtilidades.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoUtilidades.add(jTtoolBarDetalleProcesoUtilidades, gridBagConstraintsProcesoUtilidades);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoUtilidades=   new JScrollPane(jContentPaneDetalleProcesoUtilidades,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoUtilidades.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoUtilidades.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoUtilidades.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoUtilidades=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoUtilidades.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoUtilidades.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoUtilidades.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoUtilidades.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoUtilidades.gridx = 0;
	        
			this.jContentPaneDetalleProcesoUtilidades.add(jPanelCamposProcesoUtilidades, gridBagConstraintsProcesoUtilidades);
			
			
			
			
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
						//&& procesoutilidadesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesoutilidadesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoUtilidades= new GridBagConstraints();
						this.gridBagConstraintsProcesoUtilidades.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoUtilidades.gridx = 0;
						this.jContentPaneDetalleProcesoUtilidades.add(this.jTabbedPaneRelacionesProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoUtilidades.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoUtilidades.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
					this.gridBagConstraintsProcesoUtilidades.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoUtilidades.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoUtilidades.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoUtilidades.add(jPanelCamposOcultosProcesoUtilidades, gridBagConstraintsProcesoUtilidades);
				
					this.jPanelCamposOcultosProcesoUtilidades.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoUtilidades.gridx = 0;
	        this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoUtilidades.add(this.jPanelAccionesFormularioProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);							
			
			
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
	        this.gridBagConstraintsProcesoUtilidades.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoUtilidades.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoUtilidades.add(this.jPanelAccionesProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoUtilidades);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoUtilidades=   new JScrollPane(this.jPanelCamposProcesoUtilidades,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoUtilidades.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoUtilidades.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoUtilidades.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoUtilidades.gridx = 0;
			this.gridBagConstraintsProcesoUtilidades.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoUtilidades.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoUtilidades.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoUtilidades.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);			
			
			this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
			this.gridBagConstraintsProcesoUtilidades.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoUtilidades.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoUtilidades.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
			
			
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoUtilidades.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		
			
		this.gridBagConstraintsProcesoUtilidades = new GridBagConstraints();
		this.gridBagConstraintsProcesoUtilidades.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoUtilidades.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoUtilidades, this.gridBagConstraintsProcesoUtilidades);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoUtilidades.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoUtilidades.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoUtilidades.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoUtilidades.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoUtilidades.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoUtilidades.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoUtilidades;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoUtilidades;
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
