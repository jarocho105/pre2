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



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;



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
import com.bydan.erp.nomina.util.report.ProcesoLiquidacionConstantesFunciones;

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
public class ProcesoLiquidacionDetalleFormJInternalFrame extends ProcesoLiquidacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoLiquidacion;
	
	protected JMenuBar jmenuBarDetalleProcesoLiquidacion;
	
	protected JMenu jmenuDetalleProcesoLiquidacion;
	protected JMenu jmenuDetalleArchivoProcesoLiquidacion;
	protected JMenu jmenuDetalleAccionesProcesoLiquidacion;
	protected JMenu jmenuDetalleDatosProcesoLiquidacion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoLiquidacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoLiquidacion;	
	protected GridBagConstraints gridBagConstraintsProcesoLiquidacion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoLiquidacionBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoLiquidacion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ProcesoLiquidacionSessionBean procesoliquidacionSessionBean;
	
	
	
		
	
	public ProcesoLiquidacionLogic procesoliquidacionLogic;
	
	public JScrollPane jScrollPanelDatosProcesoLiquidacion;
	public JScrollPane jScrollPanelDatosEdicionProcesoLiquidacion;
	public JScrollPane jScrollPanelDatosGeneralProcesoLiquidacion;
	
	protected JPanel jPanelCamposProcesoLiquidacion;    
	protected JPanel jPanelCamposOcultosProcesoLiquidacion;    	
	protected JPanel jPanelAccionesProcesoLiquidacion;
	protected JPanel jPanelAccionesFormularioProcesoLiquidacion;
    
	
	
	protected Integer iXPanelCamposProcesoLiquidacion=0;
	protected Integer iYPanelCamposProcesoLiquidacion=0;
	
	protected Integer iXPanelCamposOcultosProcesoLiquidacion=0;
	protected Integer iYPanelCamposOcultosProcesoLiquidacion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoLiquidacion;
	public JButton jButtonModificarProcesoLiquidacion;
	public JButton jButtonActualizarProcesoLiquidacion;
    public JButton jButtonEliminarProcesoLiquidacion;
	public JButton jButtonCancelarProcesoLiquidacion;
    public JButton jButtonGuardarCambiosProcesoLiquidacion;
	public JButton jButtonGuardarCambiosTablaProcesoLiquidacion;
	protected JButton jButtonCerrarProcesoLiquidacion;
	
	
	protected JButton jButtonProcesarInformacionProcesoLiquidacion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoLiquidacion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoLiquidacion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoLiquidacion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoLiquidacion;
	protected JButton jButtonModificarToolBarProcesoLiquidacion;
	protected JButton jButtonActualizarToolBarProcesoLiquidacion;
    protected JButton jButtonEliminarToolBarProcesoLiquidacion;
	protected JButton jButtonCancelarToolBarProcesoLiquidacion;
    protected JButton jButtonGuardarCambiosToolBarProcesoLiquidacion;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoLiquidacion;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoLiquidacion;
	protected JButton jButtonCerrarToolBarProcesoLiquidacion;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoLiquidacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoLiquidacion;
	protected JMenuItem jMenuItemModificarProcesoLiquidacion;
	protected JMenuItem jMenuItemActualizarProcesoLiquidacion;
    protected JMenuItem jMenuItemEliminarProcesoLiquidacion;
	protected JMenuItem jMenuItemCancelarProcesoLiquidacion;
    protected JMenuItem jMenuItemGuardarCambiosProcesoLiquidacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoLiquidacion;
	protected JMenuItem jMenuItemCerrarProcesoLiquidacion;
	protected JMenuItem jMenuItemDetalleCerrarProcesoLiquidacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoLiquidacion;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoLiquidacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoLiquidacion;
	protected JMenuItem jMenuItemMostrarOcultarProcesoLiquidacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoLiquidacion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoLiquidacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoLiquidacion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoLiquidacion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoLiquidacion;
	public JLabel jLabelIdProcesoLiquidacion;
	public JLabel jLabelidProcesoLiquidacion;
	public JButton jButtonidProcesoLiquidacionBusqueda= new JButtonMe();

	public JPanel jPanelfechaProcesoLiquidacion;
	public JLabel jLabelfechaProcesoLiquidacion;
	//public JFormattedTextField jDateChooserfechaProcesoLiquidacion;

	public JDateChooser jDateChooserfechaProcesoLiquidacion;
	public JButton jButtonfechaProcesoLiquidacionBusqueda= new JButtonMe();

	public JPanel jPaneles_reversarProcesoLiquidacion;
	public JLabel jLabeles_reversarProcesoLiquidacion;
	public JCheckBox jCheckBoxes_reversarProcesoLiquidacion;
	public JButton jButtones_reversarProcesoLiquidacionBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoLiquidacion;
	
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
	
	public ProcesoLiquidacionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoLiquidacion=new JPanel();
				this.jPanelAccionesFormularioProcesoLiquidacion=new JPanel();
				this.jmenuBarDetalleProcesoLiquidacion=new JMenuBar();
				this.jTtoolBarDetalleProcesoLiquidacion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoLiquidacionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoLiquidacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoLiquidacionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoLiquidacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoLiquidacionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoLiquidacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoLiquidacionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoLiquidacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoLiquidacionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoLiquidacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoLiquidacion() {
		return this.jButtonActualizarToolBarProcesoLiquidacion;
	}
	
	public JButton getjButtonEliminarToolBarProcesoLiquidacion() {
		return this.jButtonEliminarToolBarProcesoLiquidacion;
	}
	
	public JButton getjButtonCancelarToolBarProcesoLiquidacion() {
		return this.jButtonCancelarToolBarProcesoLiquidacion;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoLiquidacion() {
		return this.jButtonProcesarInformacionProcesoLiquidacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoLiquidacion)	{
		this.jButtonProcesarInformacionProcesoLiquidacion = jButtonProcesarInformacionProcesoLiquidacion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoLiquidacion() {
		return this.jComboBoxTiposAccionesProcesoLiquidacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoLiquidacion(
			JComboBox jComboBoxTiposRelacionesProcesoLiquidacion) {
		this.jComboBoxTiposRelacionesProcesoLiquidacion = jComboBoxTiposRelacionesProcesoLiquidacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoLiquidacion(
			JComboBox jComboBoxTiposAccionesProcesoLiquidacion) {
		this.jComboBoxTiposAccionesProcesoLiquidacion = jComboBoxTiposAccionesProcesoLiquidacion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoLiquidacion() {
		return this.jComboBoxTiposAccionesFormularioProcesoLiquidacion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoLiquidacion(
			JComboBox jComboBoxTiposAccionesFormularioProcesoLiquidacion) {
		this.jComboBoxTiposAccionesFormularioProcesoLiquidacion = jComboBoxTiposAccionesFormularioProcesoLiquidacion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesoliquidacionSessionBean=new ProcesoLiquidacionSessionBean();
		
		this.procesoliquidacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoliquidacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesoliquidacionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoLiquidacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoLiquidacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoLiquidacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Liquidacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoLiquidacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoLiquidacion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoLiquidacion=new JButtonMe();
				this.jButtonModificarToolBarProcesoLiquidacion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoLiquidacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoLiquidacion,this.jTtoolBarDetalleProcesoLiquidacion,
							"actualizar","actualizar","Actualizar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoLiquidacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoLiquidacion,this.jTtoolBarDetalleProcesoLiquidacion,
							"eliminar","eliminar","Eliminar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoLiquidacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoLiquidacion,this.jTtoolBarDetalleProcesoLiquidacion,
							"cancelar","cancelar","Cancelar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoLiquidacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoLiquidacion,this.jTtoolBarDetalleProcesoLiquidacion,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoLiquidacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoLiquidacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoLiquidacion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoLiquidacion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoLiquidacion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoLiquidacion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoLiquidacion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoLiquidacion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoLiquidacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoLiquidacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoLiquidacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoLiquidacion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoLiquidacion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoLiquidacion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoLiquidacion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoLiquidacion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoLiquidacion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoLiquidacion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoLiquidacion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoLiquidacion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoLiquidacion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoLiquidacion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoLiquidacion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoLiquidacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoLiquidacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoLiquidacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoLiquidacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoLiquidacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoLiquidacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoLiquidacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoLiquidacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoLiquidacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoLiquidacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoLiquidacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoLiquidacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoLiquidacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoLiquidacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoLiquidacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoLiquidacion.add(this.jMenuItemDetalleCerrarProcesoLiquidacion);
		
		this.jmenuDetalleAccionesProcesoLiquidacion.add(this.jMenuItemActualizarProcesoLiquidacion);
		this.jmenuDetalleAccionesProcesoLiquidacion.add(this.jMenuItemEliminarProcesoLiquidacion);
		this.jmenuDetalleAccionesProcesoLiquidacion.add(this.jMenuItemCancelarProcesoLiquidacion);		
		
		//this.jmenuDetalleDatosProcesoLiquidacion.add(this.jMenuItemDetalleAbrirOrderByProcesoLiquidacion);				
		this.jmenuDetalleDatosProcesoLiquidacion.add(this.jMenuItemDetalleMostarOcultarProcesoLiquidacion);				
				
		//this.jmenuDetalleAccionesProcesoLiquidacion.add(this.jMenuItemGuardarCambiosProcesoLiquidacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoLiquidacion.add(this.jmenuDetalleArchivoProcesoLiquidacion);		
		this.jmenuBarDetalleProcesoLiquidacion.add(this.jmenuDetalleAccionesProcesoLiquidacion);		
		this.jmenuBarDetalleProcesoLiquidacion.add(this.jmenuDetalleDatosProcesoLiquidacion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoLiquidacion);				
	}
	
	
	public void inicializarElementosCamposProcesoLiquidacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoLiquidacion = new JLabelMe();
		jLabelIdProcesoLiquidacion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoLiquidacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoLiquidacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoLiquidacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoLiquidacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoLiquidacion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoLiquidacion.setToolTipText(ProcesoLiquidacionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoLiquidacion= new GridBagLayout();

		this.jPanelidProcesoLiquidacion.setLayout(this.gridaBagLayoutProcesoLiquidacion);

		jLabelidProcesoLiquidacion = new JLabel();
		jLabelidProcesoLiquidacion.setText("Id");

		jLabelidProcesoLiquidacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoLiquidacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoLiquidacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaProcesoLiquidacion = new JLabelMe();
		this.jLabelfechaProcesoLiquidacion.setText(""+ProcesoLiquidacionConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaProcesoLiquidacion.setToolTipText("Fecha");
		this.jLabelfechaProcesoLiquidacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProcesoLiquidacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProcesoLiquidacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaProcesoLiquidacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaProcesoLiquidacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaProcesoLiquidacion.setToolTipText(ProcesoLiquidacionConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutProcesoLiquidacion = new GridBagLayout();
		this.jPanelfechaProcesoLiquidacion.setLayout(this.gridaBagLayoutProcesoLiquidacion);


		//jFormattedTextFieldfechaProcesoLiquidacion= new JFormattedTextFieldMe();

		jDateChooserfechaProcesoLiquidacion= new JDateChooser();
		jDateChooserfechaProcesoLiquidacion.setEnabled(false);
		jDateChooserfechaProcesoLiquidacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProcesoLiquidacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProcesoLiquidacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaProcesoLiquidacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaProcesoLiquidacion.setDate(new Date());
		jDateChooserfechaProcesoLiquidacion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaProcesoLiquidacion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaProcesoLiquidacionBusqueda= new JButtonMe();
		this.jButtonfechaProcesoLiquidacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProcesoLiquidacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProcesoLiquidacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaProcesoLiquidacionBusqueda.setText("U");
		this.jButtonfechaProcesoLiquidacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaProcesoLiquidacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaProcesoLiquidacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaProcesoLiquidacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaProcesoLiquidacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaProcesoLiquidacionBusqueda"));

		if(this.procesoliquidacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaProcesoLiquidacionBusqueda.setVisible(false);		}


					
		this.jLabeles_reversarProcesoLiquidacion = new JLabelMe();
		this.jLabeles_reversarProcesoLiquidacion.setText(""+ProcesoLiquidacionConstantesFunciones.LABEL_ESREVERSAR+" : *");
		this.jLabeles_reversarProcesoLiquidacion.setToolTipText("Es Reversar");
		this.jLabeles_reversarProcesoLiquidacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_reversarProcesoLiquidacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_reversarProcesoLiquidacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_reversarProcesoLiquidacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_reversarProcesoLiquidacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_reversarProcesoLiquidacion.setToolTipText(ProcesoLiquidacionConstantesFunciones.LABEL_ESREVERSAR);
		this.gridaBagLayoutProcesoLiquidacion = new GridBagLayout();
		this.jPaneles_reversarProcesoLiquidacion.setLayout(this.gridaBagLayoutProcesoLiquidacion);


		jCheckBoxes_reversarProcesoLiquidacion= new JCheckBoxMe();
		jCheckBoxes_reversarProcesoLiquidacion.setEnabled(false);

		jCheckBoxes_reversarProcesoLiquidacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_reversarProcesoLiquidacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_reversarProcesoLiquidacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_reversarProcesoLiquidacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_reversarProcesoLiquidacionBusqueda= new JButtonMe();
		this.jButtones_reversarProcesoLiquidacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_reversarProcesoLiquidacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_reversarProcesoLiquidacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_reversarProcesoLiquidacionBusqueda.setText("U");
		this.jButtones_reversarProcesoLiquidacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_reversarProcesoLiquidacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_reversarProcesoLiquidacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_reversarProcesoLiquidacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_reversarProcesoLiquidacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_reversarProcesoLiquidacionBusqueda"));

		if(this.procesoliquidacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_reversarProcesoLiquidacionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoLiquidacion() {
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
		//this.jInternalFrameDetalleProcesoLiquidacion = new ProcesoLiquidacionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Liquidacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoLiquidacion= new GridBagLayout();
		

		
		String sToolTipProcesoLiquidacion="";
		sToolTipProcesoLiquidacion=ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoLiquidacion+="(Nomina.ProcesoLiquidacion)";
		}
		
		if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoLiquidacion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoLiquidacion = new JButtonMe();
		this.jButtonModificarProcesoLiquidacion = new JButtonMe();
        this.jButtonActualizarProcesoLiquidacion = new JButtonMe();
        this.jButtonEliminarProcesoLiquidacion = new JButtonMe();
        this.jButtonCancelarProcesoLiquidacion = new JButtonMe();
        this.jButtonGuardarCambiosProcesoLiquidacion = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoLiquidacion = new JButtonMe();
		this.jButtonCerrarProcesoLiquidacion = new JButtonMe();
		
		this.jScrollPanelDatosProcesoLiquidacion = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoLiquidacion = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoLiquidacion = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoLiquidacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoLiquidacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoLiquidacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoLiquidacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Liquidacion";
		
		if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Liquidaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoLiquidacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoLiquidacion.setName("jPanelCamposProcesoLiquidacion"); 

		this.jPanelCamposOcultosProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoLiquidacion.setName("jPanelCamposOcultosProcesoLiquidacion"); 

        this.jPanelAccionesProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoLiquidacion.setToolTipText("Acciones");
        this.jPanelAccionesProcesoLiquidacion.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoLiquidacion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoLiquidacion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoLiquidacion.setText("Nuevo");
		this.jButtonModificarProcesoLiquidacion.setText("Editar");
        this.jButtonActualizarProcesoLiquidacion.setText("Actualizar");
        this.jButtonEliminarProcesoLiquidacion.setText("Eliminar");
        this.jButtonCancelarProcesoLiquidacion.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoLiquidacion.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoLiquidacion.setText("Guardar");
		this.jButtonCerrarProcesoLiquidacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoLiquidacion,"nuevo_button","Nuevo",this.procesoliquidacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoLiquidacion,"modificar_button","Editar",this.procesoliquidacionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoLiquidacion,"actualizar_button","Actualizar",this.procesoliquidacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoLiquidacion,"eliminar_button","Eliminar",this.procesoliquidacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoLiquidacion,"cancelar_button","Cancelar",this.procesoliquidacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoLiquidacion,"guardarcambios_button","Guardar",this.procesoliquidacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoLiquidacion,"guardarcambiostabla_button","Guardar",this.procesoliquidacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoLiquidacion,"cerrar_button","Salir",this.procesoliquidacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoLiquidacion.setToolTipText("Nuevo"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoLiquidacion.setToolTipText("Editar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoLiquidacion.setToolTipText("Actualizar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoLiquidacion.setToolTipText("Eliminar)"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoLiquidacion.setToolTipText("Cancelar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoLiquidacion.setToolTipText("Guardar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoLiquidacion.setToolTipText("Guardar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoLiquidacion.setToolTipText("Salir"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoLiquidacion";
		inputMap = this.jButtonNuevoProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoLiquidacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoLiquidacion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoLiquidacion";
		inputMap = this.jButtonActualizarProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoLiquidacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoLiquidacion"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoLiquidacion";
		inputMap = this.jButtonEliminarProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoLiquidacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoLiquidacion"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoLiquidacion";
		inputMap = this.jButtonCancelarProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoLiquidacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoLiquidacion"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoLiquidacion";
		inputMap = this.jButtonCerrarProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoLiquidacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoLiquidacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoLiquidacion";
		inputMap = this.jButtonGuardarCambiosTablaProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoLiquidacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoLiquidacion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoLiquidacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoLiquidacion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoLiquidacion.setToolTipText("Nuevo ProcesoLiquidacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoLiquidacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoLiquidacion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoLiquidacion.setToolTipText("Sin Cerrar Ventana ProcesoLiquidacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoLiquidacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoLiquidacion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoLiquidacion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoLiquidacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoLiquidacion.setText("Accion");
		this.jComboBoxTiposAccionesProcesoLiquidacion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoLiquidacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoLiquidacion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoLiquidacion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoLiquidacion = new JLabelMe();
		
		this.jLabelAccionesProcesoLiquidacion.setText("Acciones");		
		this.jLabelAccionesProcesoLiquidacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoLiquidacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoLiquidacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoLiquidacion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoLiquidacion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoLiquidacion=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoLiquidacion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoLiquidacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoLiquidacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoLiquidacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoLiquidacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoLiquidacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoLiquidacion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoLiquidacion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoLiquidacion = new GridBagLayout();
		
		this.jPanelCamposProcesoLiquidacion.setLayout(gridaBagLayoutCamposProcesoLiquidacion);
		this.jPanelCamposOcultosProcesoLiquidacion.setLayout(gridaBagLayoutCamposOcultosProcesoLiquidacion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
	this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoLiquidacion.gridy = 0;
	this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
	this.gridBagConstraintsProcesoLiquidacion.ipadx = 0;
	this.gridBagConstraintsProcesoLiquidacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoLiquidacion.add(jLabelIdProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);



	this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
	this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoLiquidacion.gridy = 0;
	this.gridBagConstraintsProcesoLiquidacion.gridx = 1;
	this.gridBagConstraintsProcesoLiquidacion.ipadx = 0;
	this.gridBagConstraintsProcesoLiquidacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoLiquidacion.add(jLabelidProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);


	this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
	this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoLiquidacion.gridy = 0;
	this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
	this.gridBagConstraintsProcesoLiquidacion.ipadx = 0;
	this.gridBagConstraintsProcesoLiquidacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaProcesoLiquidacion.add(jLabelfechaProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		//this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = 0;
		this.gridBagConstraintsProcesoLiquidacion.gridx = 2;
		this.gridBagConstraintsProcesoLiquidacion.ipadx = 0;
		this.gridBagConstraintsProcesoLiquidacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaProcesoLiquidacion.add(jButtonfechaProcesoLiquidacionBusqueda, this.gridBagConstraintsProcesoLiquidacion);
	}

	this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
	this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoLiquidacion.gridy = 0;
	this.gridBagConstraintsProcesoLiquidacion.gridx = 1;
	this.gridBagConstraintsProcesoLiquidacion.ipadx = 0;
	this.gridBagConstraintsProcesoLiquidacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaProcesoLiquidacion.add(jDateChooserfechaProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);


	this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
	this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoLiquidacion.gridy = 0;
	this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
	this.gridBagConstraintsProcesoLiquidacion.ipadx = 0;
	this.gridBagConstraintsProcesoLiquidacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_reversarProcesoLiquidacion.add(jLabeles_reversarProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		//this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = 0;
		this.gridBagConstraintsProcesoLiquidacion.gridx = 2;
		this.gridBagConstraintsProcesoLiquidacion.ipadx = 0;
		this.gridBagConstraintsProcesoLiquidacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_reversarProcesoLiquidacion.add(jButtones_reversarProcesoLiquidacionBusqueda, this.gridBagConstraintsProcesoLiquidacion);
	}

	this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
	this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoLiquidacion.gridy = 0;
	this.gridBagConstraintsProcesoLiquidacion.gridx = 1;
	this.gridBagConstraintsProcesoLiquidacion.ipadx = 0;
	this.gridBagConstraintsProcesoLiquidacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_reversarProcesoLiquidacion.add(jCheckBoxes_reversarProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
	this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoLiquidacion.gridy = iYPanelCamposProcesoLiquidacion;
	this.gridBagConstraintsProcesoLiquidacion.gridx = iXPanelCamposProcesoLiquidacion++;
	this.gridBagConstraintsProcesoLiquidacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoLiquidacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoLiquidacion.add(this.jPanelidProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);



	if(iXPanelCamposProcesoLiquidacion % 1==0) {
		iXPanelCamposProcesoLiquidacion=0;
		iYPanelCamposProcesoLiquidacion++;
	}
	this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
	this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoLiquidacion.gridy = iYPanelCamposProcesoLiquidacion;
	this.gridBagConstraintsProcesoLiquidacion.gridx = iXPanelCamposProcesoLiquidacion++;
	this.gridBagConstraintsProcesoLiquidacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoLiquidacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoLiquidacion.add(this.jPanelfechaProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);



	if(iXPanelCamposProcesoLiquidacion % 1==0) {
		iXPanelCamposProcesoLiquidacion=0;
		iYPanelCamposProcesoLiquidacion++;
	}
	this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
	this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoLiquidacion.gridy = iYPanelCamposProcesoLiquidacion;
	this.gridBagConstraintsProcesoLiquidacion.gridx = iXPanelCamposProcesoLiquidacion++;
	this.gridBagConstraintsProcesoLiquidacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoLiquidacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoLiquidacion.add(this.jPaneles_reversarProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);



	if(iXPanelCamposProcesoLiquidacion % 1==0) {
		iXPanelCamposProcesoLiquidacion=0;
		iYPanelCamposProcesoLiquidacion++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoLiquidacion= new GridBagLayout();
		this.jPanelAccionesProcesoLiquidacion.setLayout(gridaBagLayoutAccionesProcesoLiquidacion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoLiquidacion= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoLiquidacion.setLayout(gridaBagLayoutAccionesFormularioProcesoLiquidacion);
		
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoLiquidacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoLiquidacion.add(this.jComboBoxTiposAccionesFormularioProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = 0;
		this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoLiquidacion.add(this.jButtonModificarProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);							

		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = 0;
		this.gridBagConstraintsProcesoLiquidacion.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoLiquidacion.add(this.jButtonEliminarProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		
			
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.gridy = 0;		
		this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoLiquidacion.add(this.jButtonActualizarProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);


		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.gridy = 0;		
		this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoLiquidacion.add(this.jButtonGuardarCambiosProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);	
		
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.gridy = 0;		
		this.gridBagConstraintsProcesoLiquidacion.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoLiquidacion.add(this.jButtonCancelarProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoLiquidacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoLiquidacion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();						
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoLiquidacion.gridx = 0;		
			//this.gridBagConstraintsProcesoLiquidacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoLiquidacion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoLiquidacion.gridx =0;
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoLiquidacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoLiquidacionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoLiquidacion = new ProcesoLiquidacionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Liquidacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Liquidacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Liquidacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoLiquidacionModel procesoliquidacionModel=new ProcesoLiquidacionModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoLiquidacionModel.ProcesoLiquidacionFocusTraversalPolicy procesoliquidacionFocusTraversalPolicy = procesoliquidacionModel.new ProcesoLiquidacionFocusTraversalPolicy(this);
			
			//procesoliquidacionFocusTraversalPolicy.setprocesoliquidacionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesoliquidacionModel);
			
			
			this.jContentPaneDetalleProcesoLiquidacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoLiquidacion = new GridBagLayout();	
			this.jContentPaneDetalleProcesoLiquidacion.setLayout(gridaBagLayoutDetalleProcesoLiquidacion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoLiquidacion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
				this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoLiquidacion.add(jTtoolBarDetalleProcesoLiquidacion, gridBagConstraintsProcesoLiquidacion);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoLiquidacion=   new JScrollPane(jContentPaneDetalleProcesoLiquidacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoLiquidacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoLiquidacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoLiquidacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoLiquidacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoLiquidacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoLiquidacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoLiquidacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
	        
			this.jContentPaneDetalleProcesoLiquidacion.add(jPanelCamposProcesoLiquidacion, gridBagConstraintsProcesoLiquidacion);
			
			
			
			
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
						//&& procesoliquidacionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesoliquidacionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoLiquidacion= new GridBagConstraints();
						this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
						this.jContentPaneDetalleProcesoLiquidacion.add(this.jTabbedPaneRelacionesProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoLiquidacion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoLiquidacion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
					this.gridBagConstraintsProcesoLiquidacion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoLiquidacion.add(jPanelCamposOcultosProcesoLiquidacion, gridBagConstraintsProcesoLiquidacion);
				
					this.jPanelCamposOcultosProcesoLiquidacion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
	        this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoLiquidacion.add(this.jPanelAccionesFormularioProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);							
			
			
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
	        this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoLiquidacion.add(this.jPanelAccionesProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoLiquidacion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoLiquidacion=   new JScrollPane(this.jPanelCamposProcesoLiquidacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoLiquidacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoLiquidacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoLiquidacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoLiquidacion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);			
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
			
			
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		
			
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoLiquidacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoLiquidacion.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoLiquidacion.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoLiquidacion.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoLiquidacion.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoLiquidacion.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoLiquidacion.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoLiquidacion;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoLiquidacion;
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
