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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.SubSectorConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class SubSectorDetalleFormJInternalFrame extends SubSectorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSubSector;
	
	protected JMenuBar jmenuBarDetalleSubSector;
	
	protected JMenu jmenuDetalleSubSector;
	protected JMenu jmenuDetalleArchivoSubSector;
	protected JMenu jmenuDetalleAccionesSubSector;
	protected JMenu jmenuDetalleDatosSubSector;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSubSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSubSector;	
	protected GridBagConstraints gridBagConstraintsSubSector;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SubSectorBeanSwingJInternalFrameAdditional jInternalFrameDetalleSubSector;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SectorBeanSwingJInternalFrame sectorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sector="";
	
	public SubSectorSessionBean subsectorSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SectorSessionBean sectorSessionBean;	
	
	public SubSectorLogic subsectorLogic;
	
	public JScrollPane jScrollPanelDatosSubSector;
	public JScrollPane jScrollPanelDatosEdicionSubSector;
	public JScrollPane jScrollPanelDatosGeneralSubSector;
	
	protected JPanel jPanelCamposSubSector;    
	protected JPanel jPanelCamposOcultosSubSector;    	
	protected JPanel jPanelAccionesSubSector;
	protected JPanel jPanelAccionesFormularioSubSector;
    
	
	
	protected Integer iXPanelCamposSubSector=0;
	protected Integer iYPanelCamposSubSector=0;
	
	protected Integer iXPanelCamposOcultosSubSector=0;
	protected Integer iYPanelCamposOcultosSubSector=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSubSector;
	public JButton jButtonModificarSubSector;
	public JButton jButtonActualizarSubSector;
    public JButton jButtonEliminarSubSector;
	public JButton jButtonCancelarSubSector;
    public JButton jButtonGuardarCambiosSubSector;
	public JButton jButtonGuardarCambiosTablaSubSector;
	protected JButton jButtonCerrarSubSector;
	
	
	protected JButton jButtonProcesarInformacionSubSector;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSubSector;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSubSector;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSubSector;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSubSector;
	protected JButton jButtonModificarToolBarSubSector;
	protected JButton jButtonActualizarToolBarSubSector;
    protected JButton jButtonEliminarToolBarSubSector;
	protected JButton jButtonCancelarToolBarSubSector;
    protected JButton jButtonGuardarCambiosToolBarSubSector;
	protected JButton jButtonGuardarCambiosTablaToolBarSubSector;
	protected JButton jButtonMostrarOcultarTablaToolBarSubSector;
	protected JButton jButtonCerrarToolBarSubSector;
	
	protected JButton jButtonProcesarInformacionToolBarSubSector;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSubSector;
	protected JMenuItem jMenuItemModificarSubSector;
	protected JMenuItem jMenuItemActualizarSubSector;
    protected JMenuItem jMenuItemEliminarSubSector;
	protected JMenuItem jMenuItemCancelarSubSector;
    protected JMenuItem jMenuItemGuardarCambiosSubSector;
	protected JMenuItem jMenuItemGuardarCambiosTablaSubSector;
	protected JMenuItem jMenuItemCerrarSubSector;
	protected JMenuItem jMenuItemDetalleCerrarSubSector;
	protected JMenuItem jMenuItemDetalleMostarOcultarSubSector;
	
	protected JMenuItem jMenuItemProcesarInformacionSubSector;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSubSector;
	protected JMenuItem jMenuItemMostrarOcultarSubSector;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSubSector;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSubSector;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSubSector;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSubSector;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSubSector;
	public JLabel jLabelIdSubSector;
	public JLabel jLabelidSubSector;
	public JButton jButtonidSubSectorBusqueda= new JButtonMe();

	public JPanel jPanelcodigoSubSector;
	public JLabel jLabelcodigoSubSector;
	public JTextField jTextFieldcodigoSubSector;
	public JButton jButtoncodigoSubSectorBusqueda= new JButtonMe();

	public JPanel jPanelnombreSubSector;
	public JLabel jLabelnombreSubSector;
	public JTextArea jTextAreanombreSubSector;
	public JScrollPane jscrollPanenombreSubSector;
	public JButton jButtonnombreSubSectorBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionSubSector;
	public JLabel jLabeldescripcionSubSector;
	public JTextArea jTextAreadescripcionSubSector;
	public JScrollPane jscrollPanedescripcionSubSector;
	public JButton jButtondescripcionSubSectorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSubSector;
	public JLabel jLabelid_empresaSubSector;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSubSector;
	public JButton jButtonid_empresaSubSector= new JButtonMe();
	public JButton jButtonid_empresaSubSectorUpdate= new JButtonMe();
	public JButton jButtonid_empresaSubSectorBusqueda= new JButtonMe();

	public JPanel jPanelid_sectorSubSector;
	public JLabel jLabelid_sectorSubSector;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sectorSubSector;
	public JButton jButtonid_sectorSubSector= new JButtonMe();
	public JButton jButtonid_sectorSubSectorUpdate= new JButtonMe();
	public JButton jButtonid_sectorSubSectorBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSubSector;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SubSectorDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSubSector=new JPanel();
				this.jPanelAccionesFormularioSubSector=new JPanel();
				this.jmenuBarDetalleSubSector=new JMenuBar();
				this.jTtoolBarDetalleSubSector=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubSectorDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SubSector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SubSectorDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SubSector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubSectorDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubSector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubSectorDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubSector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubSectorDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SubSector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSubSector() {
		return this.jButtonActualizarToolBarSubSector;
	}
	
	public JButton getjButtonEliminarToolBarSubSector() {
		return this.jButtonEliminarToolBarSubSector;
	}
	
	public JButton getjButtonCancelarToolBarSubSector() {
		return this.jButtonCancelarToolBarSubSector;
	}		
	
	public JButton getjButtonProcesarInformacionSubSector() {
		return this.jButtonProcesarInformacionSubSector;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSubSector)	{
		this.jButtonProcesarInformacionSubSector = jButtonProcesarInformacionSubSector;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSubSector() {
		return this.jComboBoxTiposAccionesSubSector;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSubSector(
			JComboBox jComboBoxTiposRelacionesSubSector) {
		this.jComboBoxTiposRelacionesSubSector = jComboBoxTiposRelacionesSubSector;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSubSector(
			JComboBox jComboBoxTiposAccionesSubSector) {
		this.jComboBoxTiposAccionesSubSector = jComboBoxTiposAccionesSubSector;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSubSector() {
		return this.jComboBoxTiposAccionesFormularioSubSector;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSubSector(
			JComboBox jComboBoxTiposAccionesFormularioSubSector) {
		this.jComboBoxTiposAccionesFormularioSubSector = jComboBoxTiposAccionesFormularioSubSector;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.subsectorSessionBean=new SubSectorSessionBean();
		
		this.subsectorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.subsectorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.subsectorSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SubSectorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SubSectorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SubSectorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sector MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {
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
	
		SubSectorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSubSector= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSubSector=new JButtonMe();
				this.jButtonModificarToolBarSubSector=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSubSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSubSector,this.jTtoolBarDetalleSubSector,
							"actualizar","actualizar","Actualizar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSubSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSubSector,this.jTtoolBarDetalleSubSector,
							"eliminar","eliminar","Eliminar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSubSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSubSector,this.jTtoolBarDetalleSubSector,
							"cancelar","cancelar","Cancelar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSubSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSubSector,this.jTtoolBarDetalleSubSector,
							"guardarcambios","guardarcambios","Guardar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSubSector,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSubSector,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSubSector,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSubSector=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSubSector=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSubSector=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSubSector=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSubSector=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSubSector= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSubSector.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSubSector,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSubSector= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSubSector.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSubSector,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSubSector= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSubSector.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSubSector,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSubSector= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSubSector.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSubSector,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSubSector= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSubSector.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSubSector,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSubSector= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSubSector.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSubSector,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSubSector= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSubSector.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSubSector,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSubSector= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSubSector.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSubSector,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSubSector= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSubSector.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSubSector,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSubSector= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSubSector.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSubSector,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSubSector.add(this.jMenuItemDetalleCerrarSubSector);
		
		this.jmenuDetalleAccionesSubSector.add(this.jMenuItemActualizarSubSector);
		this.jmenuDetalleAccionesSubSector.add(this.jMenuItemEliminarSubSector);
		this.jmenuDetalleAccionesSubSector.add(this.jMenuItemCancelarSubSector);		
		
		//this.jmenuDetalleDatosSubSector.add(this.jMenuItemDetalleAbrirOrderBySubSector);				
		this.jmenuDetalleDatosSubSector.add(this.jMenuItemDetalleMostarOcultarSubSector);				
				
		//this.jmenuDetalleAccionesSubSector.add(this.jMenuItemGuardarCambiosSubSector);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSubSector.add(this.jmenuDetalleArchivoSubSector);		
		this.jmenuBarDetalleSubSector.add(this.jmenuDetalleAccionesSubSector);		
		this.jmenuBarDetalleSubSector.add(this.jmenuDetalleDatosSubSector);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSubSector);				
	}
	
	
	public void inicializarElementosCamposSubSector() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSubSector = new JLabelMe();
		jLabelIdSubSector.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSubSector,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSubSector = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSubSector.setToolTipText(SubSectorConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSubSector= new GridBagLayout();

		this.jPanelidSubSector.setLayout(this.gridaBagLayoutSubSector);

		jLabelidSubSector = new JLabel();
		jLabelidSubSector.setText("Id");

		jLabelidSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoSubSector = new JLabelMe();
		this.jLabelcodigoSubSector.setText(""+SubSectorConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoSubSector.setToolTipText("Codigo");
		this.jLabelcodigoSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoSubSector,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoSubSector=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoSubSector.setToolTipText(SubSectorConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutSubSector = new GridBagLayout();
		this.jPanelcodigoSubSector.setLayout(this.gridaBagLayoutSubSector);


		jTextFieldcodigoSubSector= new JTextFieldMe();

		jTextFieldcodigoSubSector.setEnabled(false);
		jTextFieldcodigoSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoSubSector,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoSubSectorBusqueda= new JButtonMe();
		this.jButtoncodigoSubSectorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoSubSectorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoSubSectorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoSubSectorBusqueda.setText("U");
		this.jButtoncodigoSubSectorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoSubSectorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoSubSectorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoSubSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoSubSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoSubSectorBusqueda"));

		if(this.subsectorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoSubSectorBusqueda.setVisible(false);		}


					
		this.jLabelnombreSubSector = new JLabelMe();
		this.jLabelnombreSubSector.setText(""+SubSectorConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreSubSector.setToolTipText("Nombre");
		this.jLabelnombreSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreSubSector,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreSubSector=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreSubSector.setToolTipText(SubSectorConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutSubSector = new GridBagLayout();
		this.jPanelnombreSubSector.setLayout(this.gridaBagLayoutSubSector);


		jTextAreanombreSubSector= new JTextAreaMe();
		jTextAreanombreSubSector.setEnabled(false);
		jTextAreanombreSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSubSector.setLineWrap(true);
		jTextAreanombreSubSector.setWrapStyleWord(true);
		jTextAreanombreSubSector.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreSubSector.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreSubSector,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreSubSector = new JScrollPane(jTextAreanombreSubSector);
		jscrollPanenombreSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreSubSectorBusqueda= new JButtonMe();
		this.jButtonnombreSubSectorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSubSectorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSubSectorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreSubSectorBusqueda.setText("U");
		this.jButtonnombreSubSectorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreSubSectorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreSubSectorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreSubSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreSubSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreSubSectorBusqueda"));

		if(this.subsectorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreSubSectorBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionSubSector = new JLabelMe();
		this.jLabeldescripcionSubSector.setText(""+SubSectorConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionSubSector.setToolTipText("Descripcion");
		this.jLabeldescripcionSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionSubSector,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionSubSector=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionSubSector.setToolTipText(SubSectorConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutSubSector = new GridBagLayout();
		this.jPaneldescripcionSubSector.setLayout(this.gridaBagLayoutSubSector);


		jTextAreadescripcionSubSector= new JTextAreaMe();
		jTextAreadescripcionSubSector.setEnabled(false);
		jTextAreadescripcionSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionSubSector.setLineWrap(true);
		jTextAreadescripcionSubSector.setWrapStyleWord(true);
		jTextAreadescripcionSubSector.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionSubSector.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionSubSector,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionSubSector = new JScrollPane(jTextAreadescripcionSubSector);
		jscrollPanedescripcionSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionSubSectorBusqueda= new JButtonMe();
		this.jButtondescripcionSubSectorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionSubSectorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionSubSectorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionSubSectorBusqueda.setText("U");
		this.jButtondescripcionSubSectorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionSubSectorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionSubSectorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionSubSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionSubSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionSubSectorBusqueda"));

		if(this.subsectorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionSubSectorBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSubSector() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSubSector = new JLabelMe();
		this.jLabelid_empresaSubSector.setText(""+SubSectorConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSubSector.setToolTipText("Empresa");
		this.jLabelid_empresaSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSubSector,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSubSector=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSubSector.setToolTipText(SubSectorConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSubSector = new GridBagLayout();
		this.jPanelid_empresaSubSector.setLayout(this.gridaBagLayoutSubSector);


		jComboBoxid_empresaSubSector= new JComboBoxMe();
		jComboBoxid_empresaSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSubSector,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSubSector.setEnabled(false);

		this.jButtonid_empresaSubSector= new JButtonMe();
		this.jButtonid_empresaSubSector.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSubSector.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSubSector.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSubSector.setText("Buscar");
		this.jButtonid_empresaSubSector.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSubSector.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSubSector,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSubSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSubSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSubSector"));

		this.jButtonid_empresaSubSectorBusqueda= new JButtonMe();
		this.jButtonid_empresaSubSectorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubSectorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubSectorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSubSectorBusqueda.setText("U");
		this.jButtonid_empresaSubSectorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSubSectorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSubSectorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSubSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSubSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSubSectorBusqueda"));

		if(this.subsectorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSubSectorBusqueda.setVisible(false);		}

		this.jButtonid_empresaSubSectorUpdate= new JButtonMe();
		this.jButtonid_empresaSubSectorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubSectorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubSectorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSubSectorUpdate.setText("U");
		this.jButtonid_empresaSubSectorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSubSectorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSubSectorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSubSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSubSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSubSectorUpdate"));



					
		this.jLabelid_sectorSubSector = new JLabelMe();
		this.jLabelid_sectorSubSector.setText(""+SubSectorConstantesFunciones.LABEL_IDSECTOR+" : *");
		this.jLabelid_sectorSubSector.setToolTipText("Sector");
		this.jLabelid_sectorSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sectorSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sectorSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sectorSubSector,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sectorSubSector=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sectorSubSector.setToolTipText(SubSectorConstantesFunciones.LABEL_IDSECTOR);
		this.gridaBagLayoutSubSector = new GridBagLayout();
		this.jPanelid_sectorSubSector.setLayout(this.gridaBagLayoutSubSector);


		jComboBoxid_sectorSubSector= new JComboBoxMe();
		jComboBoxid_sectorSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sectorSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sectorSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sectorSubSector,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sectorSubSector= new JButtonMe();
		this.jButtonid_sectorSubSector.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sectorSubSector.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sectorSubSector.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sectorSubSector.setText("Buscar");
		this.jButtonid_sectorSubSector.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sectorSubSector.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sectorSubSector,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sectorSubSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sectorSubSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sectorSubSector"));

		this.jButtonid_sectorSubSectorBusqueda= new JButtonMe();
		this.jButtonid_sectorSubSectorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sectorSubSectorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sectorSubSectorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sectorSubSectorBusqueda.setText("U");
		this.jButtonid_sectorSubSectorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sectorSubSectorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sectorSubSectorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sectorSubSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sectorSubSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sectorSubSectorBusqueda"));

		if(this.subsectorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sectorSubSectorBusqueda.setVisible(false);		}

		this.jButtonid_sectorSubSectorUpdate= new JButtonMe();
		this.jButtonid_sectorSubSectorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sectorSubSectorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sectorSubSectorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sectorSubSectorUpdate.setText("U");
		this.jButtonid_sectorSubSectorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sectorSubSectorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sectorSubSectorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sectorSubSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sectorSubSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sectorSubSectorUpdate"));



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
		//this.jInternalFrameDetalleSubSector = new SubSectorBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Sector DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSubSector= new GridBagLayout();
		

		
		String sToolTipSubSector="";
		sToolTipSubSector=SubSectorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSubSector+="(Seguridad.SubSector)";
		}
		
		if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {
			sToolTipSubSector+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSubSector = new JButtonMe();
		this.jButtonModificarSubSector = new JButtonMe();
        this.jButtonActualizarSubSector = new JButtonMe();
        this.jButtonEliminarSubSector = new JButtonMe();
        this.jButtonCancelarSubSector = new JButtonMe();
        this.jButtonGuardarCambiosSubSector = new JButtonMe();
		this.jButtonGuardarCambiosTablaSubSector = new JButtonMe();
		this.jButtonCerrarSubSector = new JButtonMe();
		
		this.jScrollPanelDatosSubSector = new JScrollPane();   
        this.jScrollPanelDatosEdicionSubSector = new JScrollPane();
		this.jScrollPanelDatosGeneralSubSector = new JScrollPane();
				
		
		
		this.jPanelCamposSubSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSubSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSubSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSubSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Sector";
		
		if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sectores" + this.sPath));
		} else {
			this.jScrollPanelDatosSubSector.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSubSector.setName("jPanelCamposSubSector"); 

		this.jPanelCamposOcultosSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSubSector.setName("jPanelCamposOcultosSubSector"); 

        this.jPanelAccionesSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSubSector.setToolTipText("Acciones");
        this.jPanelAccionesSubSector.setName("Acciones"); 

		this.jPanelAccionesFormularioSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSubSector.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSubSector.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSubSector, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSubSector, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSubSector, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSubSector, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSubSector, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSubSector, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSubSector.setText("Nuevo");
		this.jButtonModificarSubSector.setText("Editar");
        this.jButtonActualizarSubSector.setText("Actualizar");
        this.jButtonEliminarSubSector.setText("Eliminar");
        this.jButtonCancelarSubSector.setText("Cancelar");
        this.jButtonGuardarCambiosSubSector.setText("Guardar");
		this.jButtonGuardarCambiosTablaSubSector.setText("Guardar");
		this.jButtonCerrarSubSector.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSubSector,"nuevo_button","Nuevo",this.subsectorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSubSector,"modificar_button","Editar",this.subsectorSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSubSector,"actualizar_button","Actualizar",this.subsectorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSubSector,"eliminar_button","Eliminar",this.subsectorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSubSector,"cancelar_button","Cancelar",this.subsectorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSubSector,"guardarcambios_button","Guardar",this.subsectorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSubSector,"guardarcambiostabla_button","Guardar",this.subsectorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSubSector,"cerrar_button","Salir",this.subsectorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSubSector, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSubSector, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSubSector, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSubSector.setToolTipText("Nuevo"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSubSector.setToolTipText("Editar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSubSector.setToolTipText("Actualizar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSubSector.setToolTipText("Eliminar)"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSubSector.setToolTipText("Cancelar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSubSector.setToolTipText("Guardar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSubSector.setToolTipText("Guardar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSubSector.setToolTipText("Salir"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSubSector";
		inputMap = this.jButtonNuevoSubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSubSector.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSubSector"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSubSector";
		inputMap = this.jButtonActualizarSubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSubSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSubSector"));
		
		//ELIMINAR
		sMapKey = "EliminarSubSector";
		inputMap = this.jButtonEliminarSubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSubSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSubSector"));
		
		//CANCELAR	
		sMapKey = "CancelarSubSector";
		inputMap = this.jButtonCancelarSubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSubSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSubSector"));
		
		//CERRAR		
		sMapKey = "CerrarSubSector";
		inputMap = this.jButtonCerrarSubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSubSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSubSector"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSubSector";
		inputMap = this.jButtonGuardarCambiosTablaSubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSubSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSubSector"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSubSector = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSubSector.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSubSector.setToolTipText("Nuevo SubSector");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSubSector, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSubSector = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSubSector.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSubSector.setToolTipText("Sin Cerrar Ventana SubSector");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSubSector, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSubSector = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSubSector.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSubSector.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSubSector, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSubSector = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSubSector.setText("Accion");
		this.jComboBoxTiposAccionesSubSector.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSubSector = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSubSector.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSubSector.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSubSector = new JLabelMe();
		
		this.jLabelAccionesSubSector.setText("Acciones");		
		this.jLabelAccionesSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSubSector();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSubSector();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSubSector=new JTabbedPane();
		this.jTabbedPaneRelacionesSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSubSector,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSubSector.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubSector.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubSector.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSubSector.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSubSector.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSubSector.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSubSector, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSubSector = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSubSector = new GridBagLayout();
		
		this.jPanelCamposSubSector.setLayout(gridaBagLayoutCamposSubSector);
		this.jPanelCamposOcultosSubSector.setLayout(gridaBagLayoutCamposOcultosSubSector);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSubSector = new GridBagConstraints();
	this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubSector.gridy = 0;
	this.gridBagConstraintsSubSector.gridx = 0;
	this.gridBagConstraintsSubSector.ipadx = 0;
	this.gridBagConstraintsSubSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSubSector.add(jLabelIdSubSector, this.gridBagConstraintsSubSector);



	this.gridBagConstraintsSubSector = new GridBagConstraints();
	this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubSector.gridy = 0;
	this.gridBagConstraintsSubSector.gridx = 1;
	this.gridBagConstraintsSubSector.ipadx = 0;
	this.gridBagConstraintsSubSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSubSector.add(jLabelidSubSector, this.gridBagConstraintsSubSector);


	this.gridBagConstraintsSubSector = new GridBagConstraints();
	this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubSector.gridy = 0;
	this.gridBagConstraintsSubSector.gridx = 0;
	this.gridBagConstraintsSubSector.ipadx = 0;
	this.gridBagConstraintsSubSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSubSector.add(jLabelid_empresaSubSector, this.gridBagConstraintsSubSector);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubSector = new GridBagConstraints();
		//this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubSector.gridy = 0;
		this.gridBagConstraintsSubSector.gridx = 2;
		this.gridBagConstraintsSubSector.ipadx = 0;
		this.gridBagConstraintsSubSector.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSubSector.add(jButtonid_empresaSubSectorBusqueda, this.gridBagConstraintsSubSector);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubSector = new GridBagConstraints();
		//this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubSector.gridy = 0;
		this.gridBagConstraintsSubSector.gridx = 3;
		this.gridBagConstraintsSubSector.ipadx = 0;
		this.gridBagConstraintsSubSector.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSubSector.add(jButtonid_empresaSubSectorUpdate, this.gridBagConstraintsSubSector);
	}

	this.gridBagConstraintsSubSector = new GridBagConstraints();
	this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubSector.gridy = 0;
	this.gridBagConstraintsSubSector.gridx = 1;
	this.gridBagConstraintsSubSector.ipadx = 0;
	this.gridBagConstraintsSubSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSubSector.add(jComboBoxid_empresaSubSector, this.gridBagConstraintsSubSector);


	this.gridBagConstraintsSubSector = new GridBagConstraints();
	this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubSector.gridy = 0;
	this.gridBagConstraintsSubSector.gridx = 0;
	this.gridBagConstraintsSubSector.ipadx = 0;
	this.gridBagConstraintsSubSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sectorSubSector.add(jLabelid_sectorSubSector, this.gridBagConstraintsSubSector);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubSector = new GridBagConstraints();
		//this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubSector.gridy = 0;
		this.gridBagConstraintsSubSector.gridx = 2;
		this.gridBagConstraintsSubSector.ipadx = 0;
		this.gridBagConstraintsSubSector.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sectorSubSector.add(jButtonid_sectorSubSectorBusqueda, this.gridBagConstraintsSubSector);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubSector = new GridBagConstraints();
		//this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubSector.gridy = 0;
		this.gridBagConstraintsSubSector.gridx = 3;
		this.gridBagConstraintsSubSector.ipadx = 0;
		this.gridBagConstraintsSubSector.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sectorSubSector.add(jButtonid_sectorSubSectorUpdate, this.gridBagConstraintsSubSector);
	}

	this.gridBagConstraintsSubSector = new GridBagConstraints();
	this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubSector.gridy = 0;
	this.gridBagConstraintsSubSector.gridx = 1;
	this.gridBagConstraintsSubSector.ipadx = 0;
	this.gridBagConstraintsSubSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sectorSubSector.add(jComboBoxid_sectorSubSector, this.gridBagConstraintsSubSector);


	this.gridBagConstraintsSubSector = new GridBagConstraints();
	this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubSector.gridy = 0;
	this.gridBagConstraintsSubSector.gridx = 0;
	this.gridBagConstraintsSubSector.ipadx = 0;
	this.gridBagConstraintsSubSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoSubSector.add(jLabelcodigoSubSector, this.gridBagConstraintsSubSector);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubSector = new GridBagConstraints();
		//this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubSector.gridy = 0;
		this.gridBagConstraintsSubSector.gridx = 2;
		this.gridBagConstraintsSubSector.ipadx = 0;
		this.gridBagConstraintsSubSector.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoSubSector.add(jButtoncodigoSubSectorBusqueda, this.gridBagConstraintsSubSector);
	}

	this.gridBagConstraintsSubSector = new GridBagConstraints();
	this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubSector.gridy = 0;
	this.gridBagConstraintsSubSector.gridx = 1;
	this.gridBagConstraintsSubSector.ipadx = 0;
	this.gridBagConstraintsSubSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoSubSector.add(jTextFieldcodigoSubSector, this.gridBagConstraintsSubSector);


	this.gridBagConstraintsSubSector = new GridBagConstraints();
	this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubSector.gridy = 0;
	this.gridBagConstraintsSubSector.gridx = 0;
	this.gridBagConstraintsSubSector.ipadx = 0;
	this.gridBagConstraintsSubSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreSubSector.add(jLabelnombreSubSector, this.gridBagConstraintsSubSector);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubSector = new GridBagConstraints();
		//this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubSector.gridy = 0;
		this.gridBagConstraintsSubSector.gridx = 2;
		this.gridBagConstraintsSubSector.ipadx = 0;
		this.gridBagConstraintsSubSector.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreSubSector.add(jButtonnombreSubSectorBusqueda, this.gridBagConstraintsSubSector);
	}

	this.gridBagConstraintsSubSector = new GridBagConstraints();
	this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubSector.gridy = 0;
	this.gridBagConstraintsSubSector.gridx = 1;
	this.gridBagConstraintsSubSector.ipadx = 0;
	this.gridBagConstraintsSubSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreSubSector.add(jscrollPanenombreSubSector, this.gridBagConstraintsSubSector);


	this.gridBagConstraintsSubSector = new GridBagConstraints();
	this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubSector.gridy = 0;
	this.gridBagConstraintsSubSector.gridx = 0;
	this.gridBagConstraintsSubSector.ipadx = 0;
	this.gridBagConstraintsSubSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionSubSector.add(jLabeldescripcionSubSector, this.gridBagConstraintsSubSector);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubSector = new GridBagConstraints();
		//this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubSector.gridy = 0;
		this.gridBagConstraintsSubSector.gridx = 2;
		this.gridBagConstraintsSubSector.ipadx = 0;
		this.gridBagConstraintsSubSector.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionSubSector.add(jButtondescripcionSubSectorBusqueda, this.gridBagConstraintsSubSector);
	}

	this.gridBagConstraintsSubSector = new GridBagConstraints();
	this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubSector.gridy = 0;
	this.gridBagConstraintsSubSector.gridx = 1;
	this.gridBagConstraintsSubSector.ipadx = 0;
	this.gridBagConstraintsSubSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionSubSector.add(jscrollPanedescripcionSubSector, this.gridBagConstraintsSubSector);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSubSector = new GridBagConstraints();
	this.gridBagConstraintsSubSector.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubSector.gridy = iYPanelCamposSubSector;
	this.gridBagConstraintsSubSector.gridx = iXPanelCamposSubSector++;
	this.gridBagConstraintsSubSector.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubSector.add(this.jPanelidSubSector, this.gridBagConstraintsSubSector);



	if(iXPanelCamposSubSector % 1==0) {
		iXPanelCamposSubSector=0;
		iYPanelCamposSubSector++;
	}
	this.gridBagConstraintsSubSector = new GridBagConstraints();
	this.gridBagConstraintsSubSector.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubSector.gridy = iYPanelCamposSubSector;
	this.gridBagConstraintsSubSector.gridx = iXPanelCamposSubSector++;
	this.gridBagConstraintsSubSector.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubSector.add(this.jPanelid_sectorSubSector, this.gridBagConstraintsSubSector);



	if(iXPanelCamposSubSector % 1==0) {
		iXPanelCamposSubSector=0;
		iYPanelCamposSubSector++;
	}
	this.gridBagConstraintsSubSector = new GridBagConstraints();
	this.gridBagConstraintsSubSector.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubSector.gridy = iYPanelCamposSubSector;
	this.gridBagConstraintsSubSector.gridx = iXPanelCamposSubSector++;
	this.gridBagConstraintsSubSector.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubSector.add(this.jPanelcodigoSubSector, this.gridBagConstraintsSubSector);



	if(iXPanelCamposSubSector % 1==0) {
		iXPanelCamposSubSector=0;
		iYPanelCamposSubSector++;
	}
	this.gridBagConstraintsSubSector = new GridBagConstraints();
	this.gridBagConstraintsSubSector.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubSector.gridy = iYPanelCamposSubSector;
	this.gridBagConstraintsSubSector.gridx = iXPanelCamposSubSector++;
	this.gridBagConstraintsSubSector.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubSector.add(this.jPanelnombreSubSector, this.gridBagConstraintsSubSector);



	if(iXPanelCamposSubSector % 1==0) {
		iXPanelCamposSubSector=0;
		iYPanelCamposSubSector++;
	}
	this.gridBagConstraintsSubSector = new GridBagConstraints();
	this.gridBagConstraintsSubSector.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubSector.gridy = iYPanelCamposSubSector;
	this.gridBagConstraintsSubSector.gridx = iXPanelCamposSubSector++;
	this.gridBagConstraintsSubSector.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSubSector.add(this.jPaneldescripcionSubSector, this.gridBagConstraintsSubSector);



	if(iXPanelCamposSubSector % 1==0) {
		iXPanelCamposSubSector=0;
		iYPanelCamposSubSector++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSubSector = new GridBagConstraints();
	this.gridBagConstraintsSubSector.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubSector.gridy = iYPanelCamposOcultosSubSector;
	this.gridBagConstraintsSubSector.gridx = iXPanelCamposOcultosSubSector++;
	this.gridBagConstraintsSubSector.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubSector.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSubSector.add(this.jPanelid_empresaSubSector, this.gridBagConstraintsSubSector);



	if(iXPanelCamposOcultosSubSector % 1==0) {
		iXPanelCamposOcultosSubSector=0;
		iYPanelCamposOcultosSubSector++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesSubSector= new GridBagLayout();
		this.jPanelAccionesSubSector.setLayout(gridaBagLayoutAccionesSubSector);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSubSector= new GridBagLayout();
		this.jPanelAccionesFormularioSubSector.setLayout(gridaBagLayoutAccionesFormularioSubSector);
		
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSubSector.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSubSector.add(this.jComboBoxTiposAccionesFormularioSubSector, this.gridBagConstraintsSubSector);

		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSubSector.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSubSector.add(this.jCheckBoxPostAccionNuevoSubSector, this.gridBagConstraintsSubSector);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.subsectorSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSubSector.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSubSector.add(this.jCheckBoxPostAccionSinCerrarSubSector, this.gridBagConstraintsSubSector);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.subsectorSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.subsectorSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSubSector.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSubSector.add(this.jCheckBoxPostAccionSinMensajeSubSector, this.gridBagConstraintsSubSector);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubSector.gridy = 0;
		this.gridBagConstraintsSubSector.gridx = iPosXAccion++;
			
		this.jPanelAccionesSubSector.add(this.jButtonModificarSubSector, this.gridBagConstraintsSubSector);							

		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubSector.gridy = 0;
		this.gridBagConstraintsSubSector.gridx =iPosXAccion++;
			
		this.jPanelAccionesSubSector.add(this.jButtonEliminarSubSector, this.gridBagConstraintsSubSector);
		
			
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy = 0;		
		this.gridBagConstraintsSubSector.gridx = iPosXAccion++;
		
		this.jPanelAccionesSubSector.add(this.jButtonActualizarSubSector, this.gridBagConstraintsSubSector);


		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy = 0;		
		this.gridBagConstraintsSubSector.gridx = iPosXAccion++;
		
		this.jPanelAccionesSubSector.add(this.jButtonGuardarCambiosSubSector, this.gridBagConstraintsSubSector);	
		
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy = 0;		
		this.gridBagConstraintsSubSector.gridx =iPosXAccion++;
		
		this.jPanelAccionesSubSector.add(this.jButtonCancelarSubSector, this.gridBagConstraintsSubSector);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSubSector = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSubSector);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.subsectorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSubSector = new GridBagConstraints();						
			this.gridBagConstraintsSubSector.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSubSector.gridx = 0;		
			//this.gridBagConstraintsSubSector.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubSector.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSubSector.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSubSector.gridx =0;
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSubSector.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSubSector, this.gridBagConstraintsSubSector);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SubSectorJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSubSector = new SubSectorBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Sector DATOS");
			
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
			
	        //this.setTitle("[FOR] - Sector DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sector Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SubSectorModel subsectorModel=new SubSectorModel(this);
			
			//SI USARA CLASE INTERNA
			//SubSectorModel.SubSectorFocusTraversalPolicy subsectorFocusTraversalPolicy = subsectorModel.new SubSectorFocusTraversalPolicy(this);
			
			//subsectorFocusTraversalPolicy.setsubsectorJInternalFrame(this);
			
			this.setFocusTraversalPolicy(subsectorModel);
			
			
			this.jContentPaneDetalleSubSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSubSector = new GridBagLayout();	
			this.jContentPaneDetalleSubSector.setLayout(gridaBagLayoutDetalleSubSector);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSubSector = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSubSector = new GridBagConstraints();
				this.gridBagConstraintsSubSector.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSubSector.gridx = 0;
					
				
				this.jContentPaneDetalleSubSector.add(jTtoolBarDetalleSubSector, gridBagConstraintsSubSector);								
				
}
			
			this.jScrollPanelDatosEdicionSubSector=   new JScrollPane(jContentPaneDetalleSubSector,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSubSector.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubSector.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubSector.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSubSector=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSubSector.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubSector.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubSector.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSubSector.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSubSector.gridx = 0;
	        
			this.jContentPaneDetalleSubSector.add(jPanelCamposSubSector, gridBagConstraintsSubSector);
			
			
			
			
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
						&& subsectorSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.subsectorSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSubSector= new GridBagConstraints();
						this.gridBagConstraintsSubSector.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSubSector.gridx = 0;
						this.jContentPaneDetalleSubSector.add(this.jTabbedPaneRelacionesSubSector, this.gridBagConstraintsSubSector);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSubSector.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSubSector.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSubSector = new GridBagConstraints();
					this.gridBagConstraintsSubSector.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSubSector.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSubSector.gridx = 0;
					
				
					this.jContentPaneDetalleSubSector.add(jPanelCamposOcultosSubSector, gridBagConstraintsSubSector);
				
					this.jPanelCamposOcultosSubSector.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSubSector.gridx = 0;
	        this.gridBagConstraintsSubSector.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSubSector.add(this.jPanelAccionesFormularioSubSector, this.gridBagConstraintsSubSector);							
			
			
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
	        this.gridBagConstraintsSubSector.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSubSector.gridx = 0;
	        
			
			this.jContentPaneDetalleSubSector.add(this.jPanelAccionesSubSector, this.gridBagConstraintsSubSector);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSubSector);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSubSector=   new JScrollPane(this.jPanelCamposSubSector,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSubSector.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubSector.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubSector.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSubSector.gridx = 0;
			this.gridBagConstraintsSubSector.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSubSector.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSubSector, this.gridBagConstraintsSubSector);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSubSector.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSubSector, this.gridBagConstraintsSubSector);			
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSubSector.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSubSector, this.gridBagConstraintsSubSector);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubSector.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSubSector, this.gridBagConstraintsSubSector);
			
			
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubSector.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSubSector, this.gridBagConstraintsSubSector);
		
			
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSubSector.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSubSector, this.gridBagConstraintsSubSector);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSubSector;//jContentPane;
		
		return jScrollPanelDatosEdicionSubSector;
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
