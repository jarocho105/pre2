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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import java.sql.Time;


import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.puntoventa.util.TurnoPunVenConstantesFunciones;
import com.bydan.erp.puntoventa.util.TurnoPunVenParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.TurnoPunVenParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.TurnoPunVenBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TurnoPunVenBeanSwingJInternalFrame extends TurnoPunVenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TurnoPunVenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TurnoPunVen> turnopunvenValidator = new ClassValidator<TurnoPunVen>(TurnoPunVen.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TurnoPunVen turnopunven;	
	public TurnoPunVen turnopunvenAux;
	public TurnoPunVen turnopunvenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TurnoPunVen turnopunvenTotales;
	public Long idTurnoPunVenActual;
	public Long iIdNuevoTurnoPunVen=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboUsuario="";

	public List<Usuario> usuariosForeignKey;

	public List<Usuario> getusuariosForeignKey() {
		return usuariosForeignKey;
	}

	public void setusuariosForeignKey(List<Usuario> usuariosForeignKey) {
		this.usuariosForeignKey = usuariosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Usuario usuarioForeignKey;

	public Usuario getusuarioForeignKey() {
		return usuarioForeignKey;
	}

	public void setusuarioForeignKey(Usuario usuarioForeignKey) {
		this.usuarioForeignKey = usuarioForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosCajaIngreso=false;

	public Boolean getIsTienePermisosCajaIngreso() {
		return isTienePermisosCajaIngreso;
	}

	public void setIsTienePermisosCajaIngreso(Boolean isTienePermisosCajaIngreso) {
		this.isTienePermisosCajaIngreso= isTienePermisosCajaIngreso;
	}


	public Boolean isTienePermisosCajeroTurno=false;

	public Boolean getIsTienePermisosCajeroTurno() {
		return isTienePermisosCajeroTurno;
	}

	public void setIsTienePermisosCajeroTurno(Boolean isTienePermisosCajeroTurno) {
		this.isTienePermisosCajeroTurno= isTienePermisosCajeroTurno;
	}


	public Boolean isTienePermisosCajaEgreso=false;

	public Boolean getIsTienePermisosCajaEgreso() {
		return isTienePermisosCajaEgreso;
	}

	public void setIsTienePermisosCajaEgreso(Boolean isTienePermisosCajaEgreso) {
		this.isTienePermisosCajaEgreso= isTienePermisosCajaEgreso;
	}

	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoTurnoPunVen;
	public Boolean isPermisoNuevoTurnoPunVen;
	public Boolean isPermisoActualizarTurnoPunVen;
	public Boolean isPermisoActualizarOriginalTurnoPunVen;
	public Boolean isPermisoEliminarTurnoPunVen;
	public Boolean isPermisoGuardarCambiosTurnoPunVen;
	public Boolean isPermisoConsultaTurnoPunVen;
	public Boolean isPermisoBusquedaTurnoPunVen;
	public Boolean isPermisoReporteTurnoPunVen;
	public Boolean isPermisoPaginacionMedioTurnoPunVen;
	public Boolean isPermisoPaginacionAltoTurnoPunVen;
	public Boolean isPermisoPaginacionTodoTurnoPunVen;
	public Boolean isPermisoCopiarTurnoPunVen;
	public Boolean isPermisoVerFormTurnoPunVen;
	public Boolean isPermisoDuplicarTurnoPunVen;
	public Boolean isPermisoOrdenTurnoPunVen;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public TurnoPunVenParameterReturnGeneral turnopunvenReturnGeneral;
	public TurnoPunVenParameterReturnGeneral turnopunvenParameterGeneral;
	
	

	public CajaIngresoLogic cajaingresoLogic=null;

	public CajaIngresoLogic getCajaIngresoLogic() {
		return cajaingresoLogic;
	}

	public void setCajaIngresoLogic(CajaIngresoLogic cajaingresoLogic) {
		this.cajaingresoLogic = cajaingresoLogic;
	}


	public CajeroTurnoLogic cajeroturnoLogic=null;

	public CajeroTurnoLogic getCajeroTurnoLogic() {
		return cajeroturnoLogic;
	}

	public void setCajeroTurnoLogic(CajeroTurnoLogic cajeroturnoLogic) {
		this.cajeroturnoLogic = cajeroturnoLogic;
	}


	public CajaEgresoLogic cajaegresoLogic=null;

	public CajaEgresoLogic getCajaEgresoLogic() {
		return cajaegresoLogic;
	}

	public void setCajaEgresoLogic(CajaEgresoLogic cajaegresoLogic) {
		this.cajaegresoLogic = cajaegresoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTurnoPunVen=false;
	public Boolean esParaAccionDesdeFormularioTurnoPunVen=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TurnoPunVenSessionBeanAdditional turnopunvenSessionBeanAdditional=null;
	
	public TurnoPunVenSessionBeanAdditional getTurnoPunVenSessionBeanAdditional() {
		return this.turnopunvenSessionBeanAdditional;
	}
	
	public void setTurnoPunVenSessionBeanAdditional(TurnoPunVenSessionBeanAdditional turnopunvenSessionBeanAdditional) {
		try {
			this.turnopunvenSessionBeanAdditional=turnopunvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TurnoPunVenBeanSwingJInternalFrameAdditional turnopunvenBeanSwingJInternalFrameAdditional=null;
	//public class TurnoPunVenBeanSwingJInternalFrame
	
	public TurnoPunVenBeanSwingJInternalFrameAdditional getTurnoPunVenBeanSwingJInternalFrameAdditional() {
		return this.turnopunvenBeanSwingJInternalFrameAdditional;
	}
	
	public void setTurnoPunVenBeanSwingJInternalFrameAdditional(TurnoPunVenBeanSwingJInternalFrameAdditional turnopunvenBeanSwingJInternalFrameAdditional) {
		try {
			this.turnopunvenBeanSwingJInternalFrameAdditional=turnopunvenBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TurnoPunVenLogic turnopunvenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TurnoPunVen turnopunvenBean;
	public TurnoPunVenConstantesFunciones turnopunvenConstantesFunciones;
	//public TurnoPunVenParameterReturnGeneral turnopunvenReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public UsuarioLogic usuarioLogic;
	
	//PARAMETROS
	
	
	//public List<TurnoPunVen> turnopunvens;	
	//public List<TurnoPunVen> turnopunvensEliminados;
	//public List<TurnoPunVen> turnopunvensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTurnoPunVen=false;
	public Boolean isVisibilidadCeldaDuplicarTurnoPunVen=true;
	public Boolean isVisibilidadCeldaCopiarTurnoPunVen=true;
	public Boolean isVisibilidadCeldaVerFormTurnoPunVen=true;
	public Boolean isVisibilidadCeldaOrdenTurnoPunVen=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTurnoPunVen=false;
	public Boolean isVisibilidadCeldaModificarTurnoPunVen=false;
	public Boolean isVisibilidadCeldaActualizarTurnoPunVen=false;
	public Boolean isVisibilidadCeldaEliminarTurnoPunVen=false;
	public Boolean isVisibilidadCeldaCancelarTurnoPunVen=false;
	public Boolean isVisibilidadCeldaGuardarTurnoPunVen=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTurnoPunVen=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoTurnoPunVen() {
		return this.iIdNuevoTurnoPunVen;
	}

	public void setiIdNuevoTurnoPunVen(Long iIdNuevoTurnoPunVen) {
		this.iIdNuevoTurnoPunVen = iIdNuevoTurnoPunVen;
	}
	
	public Long getidTurnoPunVenActual() {
		return this.idTurnoPunVenActual;
	}

	public void setidTurnoPunVenActual(Long idTurnoPunVenActual) {
		this.idTurnoPunVenActual = idTurnoPunVenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TurnoPunVen getturnopunven() {
		return this.turnopunven;
	}

	public void setturnopunven(TurnoPunVen turnopunven) {
		this.turnopunven = turnopunven;
	}
	
	public TurnoPunVen getturnopunvenAux() {
		return this.turnopunvenAux;
	}

	public void setturnopunvenAux(TurnoPunVen turnopunvenAux) {
		this.turnopunvenAux = turnopunvenAux;
	}				
	
	public TurnoPunVen getturnopunvenAnterior() {
		return this.turnopunvenAnterior;
	}

	public void setturnopunvenAnterior(TurnoPunVen turnopunvenAnterior) {
		this.turnopunvenAnterior = turnopunvenAnterior;
	}	
	
	public TurnoPunVen getturnopunvenTotales() {
		return this.turnopunvenTotales;
	}

	public void setturnopunvenTotales(TurnoPunVen turnopunvenTotales) {
		this.turnopunvenTotales = turnopunvenTotales;
	}	
	
	public TurnoPunVen getturnopunvenBean() {
		return this.turnopunvenBean;
	}

	public void setturnopunvenBean(TurnoPunVen turnopunvenBean) {
		this.turnopunvenBean = turnopunvenBean;
	}	
	
	public TurnoPunVenParameterReturnGeneral getturnopunvenReturnGeneral() {
		return this.turnopunvenReturnGeneral;
	}

	public void setturnopunvenReturnGeneral(TurnoPunVenParameterReturnGeneral turnopunvenReturnGeneral) {
		this.turnopunvenReturnGeneral = turnopunvenReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_usuarioFK_IdUsuario=-1L;

	public Long getid_usuarioFK_IdUsuario() {
		return this.id_usuarioFK_IdUsuario;
	}

	public void setid_usuarioFK_IdUsuario(Long id_usuarioFK_IdUsuario) {
		this.id_usuarioFK_IdUsuario = id_usuarioFK_IdUsuario;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TurnoPunVenLogic getTurnoPunVenLogic()	{		
		return turnopunvenLogic;
	}

	public void setTurnoPunVenLogic(TurnoPunVenLogic turnopunvenLogic) {
		this.turnopunvenLogic = turnopunvenLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoTurnoPunVen() {
		return isEsNuevoTurnoPunVen;
	}

	public void setIsEsNuevoTurnoPunVen(Boolean isEsNuevoTurnoPunVen) {
		this.isEsNuevoTurnoPunVen = isEsNuevoTurnoPunVen;
	}

	public Boolean getEsParaAccionDesdeFormularioTurnoPunVen() {
		return esParaAccionDesdeFormularioTurnoPunVen;
	}
	
	public void setEsParaAccionDesdeFormularioTurnoPunVen(Boolean esParaAccionDesdeFormularioTurnoPunVen) {
		this.esParaAccionDesdeFormularioTurnoPunVen = esParaAccionDesdeFormularioTurnoPunVen;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.turnopunvenSessionBean==null) {
				this.turnopunvenSessionBean=new TurnoPunVenSessionBean();
			}

			if(!this.turnopunvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(turnopunvenSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.turnopunvenSessionBean==null) {
				this.turnopunvenSessionBean=new TurnoPunVenSessionBean();
			}

			if(!this.turnopunvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(turnopunvenSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosUsuariosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.usuariosForeignKey=new ArrayList<Usuario>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UsuarioLogic usuarioLogic=new UsuarioLogic();

			//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

			if(this.turnopunvenSessionBean==null) {
				this.turnopunvenSessionBean=new TurnoPunVenSessionBean();
			}

			if(!this.turnopunvenSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

					usuarioLogic.getTodosUsuariosWithConnection(sFinalQuery,new Pagination());

					this.usuariosForeignKey=usuarioLogic.getUsuarios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUsuario(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioLogic.getEntityWithConnection(turnopunvenSessionBean.getlidUsuarioActual());
					this.usuariosForeignKey.add(usuarioLogic.getUsuario());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.turnopunven!=null) {
						this.turnopunven.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
						this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_empresaTurnoPunVen.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTurnoPunVen.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
						if(this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_empresaTurnoPunVen.getItemCount()>0) {
							this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_empresaTurnoPunVen.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTurnoPunVenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaTurnoPunVenGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTurnoPunVenGenerico!=null && jComboBoxid_empresaTurnoPunVenGenerico.getItemCount()>0) {
					jComboBoxid_empresaTurnoPunVenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.turnopunven!=null) {
						this.turnopunven.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
						this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_sucursalTurnoPunVen.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalTurnoPunVen.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
						if(this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_sucursalTurnoPunVen.getItemCount()>0) {
							this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_sucursalTurnoPunVen.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalTurnoPunVenGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalTurnoPunVenGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalTurnoPunVenGenerico!=null && jComboBoxid_sucursalTurnoPunVenGenerico.getItemCount()>0) {
					jComboBoxid_sucursalTurnoPunVenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUsuarioForeignKey(Long idUsuarioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(usuarioTemp!=null) {

					if(this.turnopunven!=null) {
						this.turnopunven.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
						this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_usuarioTurnoPunVen.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioTurnoPunVen.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
						if(this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_usuarioTurnoPunVen.getItemCount()>0) {
							this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_usuarioTurnoPunVen.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualUsuarioForeignKeyDescripcion(Long idUsuarioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}


			sDescripcion=UsuarioConstantesFunciones.getUsuarioDescripcion(usuarioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioTurnoPunVenGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(usuarioTemp!=null) {
				jComboBoxid_usuarioTurnoPunVenGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioTurnoPunVenGenerico!=null && jComboBoxid_usuarioTurnoPunVenGenerico.getItemCount()>0) {
					jComboBoxid_usuarioTurnoPunVenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TurnoPunVen turnopunven,JComboBox jComboBoxid_empresaTurnoPunVenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTurnoPunVenGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_empresaTurnoPunVen.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTurnoPunVenGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				turnopunven.setid_empresa(empresaAux.getId());
				turnopunven.setempresa_descripcion(TurnoPunVenConstantesFunciones.getEmpresaDescripcion(empresaAux));
				turnopunven.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(TurnoPunVen turnopunven,JComboBox jComboBoxid_sucursalTurnoPunVenGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalTurnoPunVenGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_sucursalTurnoPunVen.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalTurnoPunVenGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				turnopunven.setid_sucursal(sucursalAux.getId());
				turnopunven.setsucursal_descripcion(TurnoPunVenConstantesFunciones.getSucursalDescripcion(sucursalAux));
				turnopunven.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(TurnoPunVen turnopunven,JComboBox jComboBoxid_usuarioTurnoPunVenGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioTurnoPunVenGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_usuarioTurnoPunVen.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioTurnoPunVenGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				turnopunven.setid_usuario(usuarioAux.getId());
				turnopunven.setusuario_descripcion(TurnoPunVenConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				turnopunven.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { 
							this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_empresaTurnoPunVen.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_empresaTurnoPunVen.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { 
					}

					if(!TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { 
							this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_sucursalTurnoPunVen.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_sucursalTurnoPunVen.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { 
					}

					if(!TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUsuariosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUsuario=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { 
							this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_usuarioTurnoPunVen.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_usuarioTurnoPunVen.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { 
					}

					if(!TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
							this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_empresaTurnoPunVen.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
							this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_empresaTurnoPunVen.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
							this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_sucursalTurnoPunVen.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
							this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_sucursalTurnoPunVen.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameUsuarioForeignKey(Usuario usuario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
							this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_usuarioTurnoPunVen.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
							this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_usuarioTurnoPunVen.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTurnoPunVen() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TurnoPunVenConstantesFunciones.refrescarForeignKeysDescripcionesTurnoPunVen(this.turnopunvenLogic.getTurnoPunVens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TurnoPunVenConstantesFunciones.refrescarForeignKeysDescripcionesTurnoPunVen(this.turnopunvens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Usuario.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//turnopunvenLogic.setTurnoPunVens(this.turnopunvens);
			turnopunvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public TurnoPunVenParameterReturnGeneral getTurnoPunVenParameterGeneral() {
		return this.turnopunvenParameterGeneral;
	}
	
	public void setTurnoPunVenParameterGeneral(TurnoPunVenParameterReturnGeneral turnopunvenParameterGeneral) {
		this.turnopunvenParameterGeneral = turnopunvenParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoTurnoPunVen() {
		return isPermisoTodoTurnoPunVen;
	}

	public void setIsPermisoTodoTurnoPunVen(Boolean isPermisoTodoTurnoPunVen) {
		this.isPermisoTodoTurnoPunVen = isPermisoTodoTurnoPunVen;
	}

	public Boolean getIsPermisoNuevoTurnoPunVen() {
		return isPermisoNuevoTurnoPunVen;
	}

	public void setIsPermisoNuevoTurnoPunVen(Boolean isPermisoNuevoTurnoPunVen) {
		this.isPermisoNuevoTurnoPunVen = isPermisoNuevoTurnoPunVen;
	}

	public Boolean getIsPermisoActualizarTurnoPunVen() {
		return isPermisoActualizarTurnoPunVen;
	}

	public void setIsPermisoActualizarTurnoPunVen(Boolean isPermisoActualizarTurnoPunVen) {
		this.isPermisoActualizarTurnoPunVen = isPermisoActualizarTurnoPunVen;
	}

	public Boolean getIsPermisoEliminarTurnoPunVen() {
		return isPermisoEliminarTurnoPunVen;
	}

	public void setIsPermisoEliminarTurnoPunVen(Boolean isPermisoEliminarTurnoPunVen) {
		this.isPermisoEliminarTurnoPunVen = isPermisoEliminarTurnoPunVen;
	}

	public Boolean getIsPermisoGuardarCambiosTurnoPunVen() {
		return isPermisoGuardarCambiosTurnoPunVen;
	}

	public void setIsPermisoGuardarCambiosTurnoPunVen(Boolean isPermisoGuardarCambiosTurnoPunVen) {
		this.isPermisoGuardarCambiosTurnoPunVen = isPermisoGuardarCambiosTurnoPunVen;
	}
	
	public Boolean getIsPermisoConsultaTurnoPunVen() {
		return isPermisoConsultaTurnoPunVen;
	}

	public void setIsPermisoConsultaTurnoPunVen(Boolean isPermisoConsultaTurnoPunVen) {
		this.isPermisoConsultaTurnoPunVen = isPermisoConsultaTurnoPunVen;
	}

	public Boolean getIsPermisoBusquedaTurnoPunVen() {
		return isPermisoBusquedaTurnoPunVen;
	}

	public void setIsPermisoBusquedaTurnoPunVen(Boolean isPermisoBusquedaTurnoPunVen) {
		this.isPermisoBusquedaTurnoPunVen = isPermisoBusquedaTurnoPunVen;
	}

	public Boolean getIsPermisoReporteTurnoPunVen() {
		return isPermisoReporteTurnoPunVen;
	}

	public void setIsPermisoReporteTurnoPunVen(Boolean isPermisoReporteTurnoPunVen) {
		this.isPermisoReporteTurnoPunVen = isPermisoReporteTurnoPunVen;
	}
	
	public Boolean getIsPermisoPaginacionMedioTurnoPunVen() {
		return isPermisoPaginacionMedioTurnoPunVen;
	}

	public void setIsPermisoPaginacionMedioTurnoPunVen(Boolean isPermisoPaginacionMedioTurnoPunVen) {
		this.isPermisoPaginacionMedioTurnoPunVen = isPermisoPaginacionMedioTurnoPunVen;
	}
	
	public Boolean getIsPermisoPaginacionTodoTurnoPunVen() {
		return isPermisoPaginacionTodoTurnoPunVen;
	}

	public void setIsPermisoPaginacionTodoTurnoPunVen(Boolean isPermisoPaginacionTodoTurnoPunVen) {
		this.isPermisoPaginacionTodoTurnoPunVen = isPermisoPaginacionTodoTurnoPunVen;
	}
	
	public Boolean getIsPermisoPaginacionAltoTurnoPunVen() {
		return isPermisoPaginacionAltoTurnoPunVen;
	}

	public void setIsPermisoPaginacionAltoTurnoPunVen(Boolean isPermisoPaginacionAltoTurnoPunVen) {
		this.isPermisoPaginacionAltoTurnoPunVen = isPermisoPaginacionAltoTurnoPunVen;
	}
	
	public Boolean getIsPermisoCopiarTurnoPunVen() {
		return isPermisoCopiarTurnoPunVen;
	}

	public void setIsPermisoCopiarTurnoPunVen(Boolean isPermisoCopiarTurnoPunVen) {
		this.isPermisoCopiarTurnoPunVen = isPermisoCopiarTurnoPunVen;
	}
	
	public Boolean getIsPermisoVerFormTurnoPunVen() {
		return isPermisoVerFormTurnoPunVen;
	}

	public void setIsPermisoVerFormTurnoPunVen(Boolean isPermisoVerFormTurnoPunVen) {
		this.isPermisoVerFormTurnoPunVen = isPermisoVerFormTurnoPunVen;
	}
	
	public Boolean getIsPermisoDuplicarTurnoPunVen() {
		return isPermisoDuplicarTurnoPunVen;
	}

	public void setIsPermisoDuplicarTurnoPunVen(Boolean isPermisoDuplicarTurnoPunVen) {
		this.isPermisoDuplicarTurnoPunVen = isPermisoDuplicarTurnoPunVen;
	}
	
	public Boolean getIsPermisoOrdenTurnoPunVen() {
		return isPermisoOrdenTurnoPunVen;
	}

	public void setIsPermisoOrdenTurnoPunVen(Boolean isPermisoOrdenTurnoPunVen) {
		this.isPermisoOrdenTurnoPunVen = isPermisoOrdenTurnoPunVen;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoTurnoPunVen() {
		return isVisibilidadCeldaNuevoTurnoPunVen;
	}

	public void setIsVisibilidadCeldaNuevoTurnoPunVen(Boolean isVisibilidadCeldaNuevoTurnoPunVen) {
		this.isVisibilidadCeldaNuevoTurnoPunVen = isVisibilidadCeldaNuevoTurnoPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTurnoPunVen() {
		return isVisibilidadCeldaDuplicarTurnoPunVen;
	}

	public void setIsVisibilidadCeldaDuplicarTurnoPunVen(Boolean isVisibilidadCeldaDuplicarTurnoPunVen) {
		this.isVisibilidadCeldaDuplicarTurnoPunVen = isVisibilidadCeldaDuplicarTurnoPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTurnoPunVen() {
		return isVisibilidadCeldaCopiarTurnoPunVen;
	}

	public void setIsVisibilidadCeldaCopiarTurnoPunVen(Boolean isVisibilidadCeldaCopiarTurnoPunVen) {
		this.isVisibilidadCeldaCopiarTurnoPunVen = isVisibilidadCeldaCopiarTurnoPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTurnoPunVen() {
		return isVisibilidadCeldaVerFormTurnoPunVen;
	}

	public void setIsVisibilidadCeldaVerFormTurnoPunVen(Boolean isVisibilidadCeldaVerFormTurnoPunVen) {
		this.isVisibilidadCeldaVerFormTurnoPunVen = isVisibilidadCeldaVerFormTurnoPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTurnoPunVen() {
		return isVisibilidadCeldaOrdenTurnoPunVen;
	}

	public void setIsVisibilidadCeldaOrdenTurnoPunVen(Boolean isVisibilidadCeldaOrdenTurnoPunVen) {
		this.isVisibilidadCeldaOrdenTurnoPunVen = isVisibilidadCeldaOrdenTurnoPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTurnoPunVen() {
		return isVisibilidadCeldaNuevoRelacionesTurnoPunVen;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTurnoPunVen(Boolean isVisibilidadCeldaNuevoRelacionesTurnoPunVen) {
		this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen = isVisibilidadCeldaNuevoRelacionesTurnoPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTurnoPunVen() {
		return isVisibilidadCeldaModificarTurnoPunVen;
	}

	public void setIsVisibilidadCeldaModificarTurnoPunVen(Boolean isVisibilidadCeldaModificarTurnoPunVen) {
		this.isVisibilidadCeldaModificarTurnoPunVen = isVisibilidadCeldaModificarTurnoPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTurnoPunVen() {
		return isVisibilidadCeldaActualizarTurnoPunVen;
	}

	public void setIsVisibilidadCeldaActualizarTurnoPunVen(Boolean isVisibilidadCeldaActualizarTurnoPunVen) {
		this.isVisibilidadCeldaActualizarTurnoPunVen = isVisibilidadCeldaActualizarTurnoPunVen;
	}

	public Boolean getIsVisibilidadCeldaEliminarTurnoPunVen() {
		return isVisibilidadCeldaEliminarTurnoPunVen;
	}

	public void setIsVisibilidadCeldaEliminarTurnoPunVen(Boolean isVisibilidadCeldaEliminarTurnoPunVen) {
		this.isVisibilidadCeldaEliminarTurnoPunVen = isVisibilidadCeldaEliminarTurnoPunVen;
	}

	public Boolean getIsVisibilidadCeldaCancelarTurnoPunVen() {
		return isVisibilidadCeldaCancelarTurnoPunVen;
	}

	public void setIsVisibilidadCeldaCancelarTurnoPunVen(Boolean isVisibilidadCeldaCancelarTurnoPunVen) {
		this.isVisibilidadCeldaCancelarTurnoPunVen = isVisibilidadCeldaCancelarTurnoPunVen;
	}

	public Boolean getIsVisibilidadCeldaGuardarTurnoPunVen() {
		return isVisibilidadCeldaGuardarTurnoPunVen;
	}

	public void setIsVisibilidadCeldaGuardarTurnoPunVen(Boolean isVisibilidadCeldaGuardarTurnoPunVen) {
		this.isVisibilidadCeldaGuardarTurnoPunVen = isVisibilidadCeldaGuardarTurnoPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTurnoPunVen() {
		return isVisibilidadCeldaGuardarCambiosTurnoPunVen;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTurnoPunVen(Boolean isVisibilidadCeldaGuardarCambiosTurnoPunVen) {
		this.isVisibilidadCeldaGuardarCambiosTurnoPunVen = isVisibilidadCeldaGuardarCambiosTurnoPunVen;
	}
		
	public TurnoPunVenSessionBean getturnopunvenSessionBean() {
		return this.turnopunvenSessionBean;
	}
	
	public void setturnopunvenSessionBean(TurnoPunVenSessionBean turnopunvenSessionBean) {
		this.turnopunvenSessionBean=turnopunvenSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(TurnoPunVen turnopunven)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(turnopunven,null);
				this.setActualParaGuardarSucursalForeignKey(turnopunven,null);
				this.setActualParaGuardarUsuarioForeignKey(turnopunven,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(TurnoPunVen turnopunven,TurnoPunVen turnopunvenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTurnoPunVen(turnopunven);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		turnopunvenAux.setId(turnopunven.getId());
		turnopunvenAux.setVersionRow(turnopunven.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTurnoPunVen();
		
			int intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TurnoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTurnoPunVen(this.turnopunven,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = turnopunvenValidator.getInvalidValues(this.turnopunven);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			turnopunvenLogic.setDatosCliente(datosCliente);
			turnopunvenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				turnopunvenAux=new  TurnoPunVen();
				
				turnopunvenAux.setIsNew(true);
				turnopunvenAux.setIsChanged(true);
				
				turnopunvenAux.setTurnoPunVenOriginal(this.turnopunven);
				
				turnopunvenAux.setId(this.turnopunven.getId());	
				turnopunvenAux.setVersionRow(this.turnopunven.getVersionRow());	
				turnopunvenAux.setid_empresa(this.turnopunven.getid_empresa());	
				turnopunvenAux.setid_sucursal(this.turnopunven.getid_sucursal());	
				turnopunvenAux.setid_usuario(this.turnopunven.getid_usuario());	
				turnopunvenAux.setnombre(this.turnopunven.getnombre());	
				turnopunvenAux.sethora_inicio(this.turnopunven.gethora_inicio());	
				turnopunvenAux.sethora_fin(this.turnopunven.gethora_fin());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.turnopunvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.turnopunvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(turnopunvenAux,turnopunvenLogic.getTurnoPunVens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(turnopunvenAux,turnopunvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.turnopunvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.turnopunvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						turnopunvenLogic.saveTurnoPunVens();//WithConnection
						//turnopunvenLogic.getSetVersionRowTurnoPunVens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.turnopunven,turnopunvenAux);
					
					this.refrescarForeignKeysDescripcionesTurnoPunVen();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.turnopunvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoLogic.getCajaIngresos().addAll(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresosEliminados);
							this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos().addAll(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnosEliminados);
							this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoLogic.getCajaEgresos().addAll(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresos.addAll(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresosEliminados);
							this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnos.addAll(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnosEliminados);
							this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresos.addAll(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								turnopunvenLogic.saveTurnoPunVenRelaciones(turnopunvenAux,this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoLogic.getCajaIngresos(),this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos(),this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoLogic.getCajaEgresos());//WithConnection
								//turnopunvenLogic.getSetVersionRowTurnoPunVens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.turnopunven,turnopunvenAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoLogic.setCajaIngresos(new ArrayList<CajaIngreso>());
							this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.setCajeroTurnos(new ArrayList<CajeroTurno>());
							this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoLogic.setCajaEgresos(new ArrayList<CajaEgreso>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresos= new ArrayList<CajaIngreso>();
							this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnos= new ArrayList<CajeroTurno>();
							this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresos= new ArrayList<CajaEgreso>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.quitarFilaTotales();}
							turnopunvenAux.setCajaIngresos(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoLogic.getCajaIngresos());

							if(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.quitarFilaTotales();}
							turnopunvenAux.setCajeroTurnos(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos());

							if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.quitarFilaTotales();}
							turnopunvenAux.setCajaEgresos(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoLogic.getCajaEgresos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.turnopunvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.turnopunvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(turnopunvenAux,turnopunvenLogic.getTurnoPunVens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(turnopunvenAux,turnopunvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.turnopunven,turnopunvenAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				turnopunvenAux=new  TurnoPunVen();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.turnopunvenSessionBean.getEsGuardarRelacionado() 
					|| (this.turnopunvenSessionBean.getEsGuardarRelacionado() && this.turnopunven.getId()>=0)) {
						
					turnopunvenAux.setIsNew(false);
				}
				
				turnopunvenAux.setIsDeleted(false);
			
				turnopunvenAux.setId(this.turnopunven.getId());	
				turnopunvenAux.setVersionRow(this.turnopunven.getVersionRow());	
				turnopunvenAux.setid_empresa(this.turnopunven.getid_empresa());	
				turnopunvenAux.setid_sucursal(this.turnopunven.getid_sucursal());	
				turnopunvenAux.setid_usuario(this.turnopunven.getid_usuario());	
				turnopunvenAux.setnombre(this.turnopunven.getnombre());	
				turnopunvenAux.sethora_inicio(this.turnopunven.gethora_inicio());	
				turnopunvenAux.sethora_fin(this.turnopunven.gethora_fin());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(turnopunvenAux,turnopunvenLogic.getTurnoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(turnopunvenAux,turnopunvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.turnopunvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.turnopunvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						turnopunvenLogic.saveTurnoPunVens();//WithConnection
						//turnopunvenLogic.getSetVersionRowTurnoPunVens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.turnopunven,turnopunvenAux);
					
					this.refrescarForeignKeysDescripcionesTurnoPunVen();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.turnopunvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoLogic.getCajaIngresos().addAll(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresosEliminados);
							this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos().addAll(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnosEliminados);
							this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoLogic.getCajaEgresos().addAll(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresos.addAll(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresosEliminados);
							this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnos.addAll(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnosEliminados);
							this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresos.addAll(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								turnopunvenLogic.saveTurnoPunVenRelaciones(turnopunvenAux,this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoLogic.getCajaIngresos(),this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos(),this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoLogic.getCajaEgresos());//WithConnection
								//turnopunvenLogic.getSetVersionRowTurnoPunVens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.turnopunven,turnopunvenAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoLogic.setCajaIngresos(new ArrayList<CajaIngreso>());
							this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.setCajeroTurnos(new ArrayList<CajeroTurno>());
							this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoLogic.setCajaEgresos(new ArrayList<CajaEgreso>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresos= new ArrayList<CajaIngreso>();
							this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnos= new ArrayList<CajeroTurno>();
							this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresos= new ArrayList<CajaEgreso>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.quitarFilaTotales();}
							turnopunvenAux.setCajaIngresos(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoLogic.getCajaIngresos());

							if(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.quitarFilaTotales();}
							turnopunvenAux.setCajeroTurnos(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos());

							if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.quitarFilaTotales();}
							turnopunvenAux.setCajaEgresos(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoLogic.getCajaEgresos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.turnopunvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.turnopunvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(turnopunvenAux,turnopunvenLogic.getTurnoPunVens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(turnopunvenAux,turnopunvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.turnopunven,turnopunvenAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				turnopunvenAux=new  TurnoPunVen();
				
				turnopunvenAux.setIsNew(false);
				turnopunvenAux.setIsChanged(false);
				
				turnopunvenAux.setIsDeleted(true);
				
				turnopunvenAux.setId(this.turnopunven.getId());	
				turnopunvenAux.setVersionRow(this.turnopunven.getVersionRow());	
				turnopunvenAux.setid_empresa(this.turnopunven.getid_empresa());	
				turnopunvenAux.setid_sucursal(this.turnopunven.getid_sucursal());	
				turnopunvenAux.setid_usuario(this.turnopunven.getid_usuario());	
				turnopunvenAux.setnombre(this.turnopunven.getnombre());	
				turnopunvenAux.sethora_inicio(this.turnopunven.gethora_inicio());	
				turnopunvenAux.sethora_fin(this.turnopunven.gethora_fin());	
				
				if(this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.turnopunvenAux.getId()>=0) {	
						this.turnopunvensEliminados.add(turnopunvenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(turnopunvenAux,turnopunvenLogic.getTurnoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(turnopunvenAux,turnopunvens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.turnopunvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.turnopunvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						turnopunvenLogic.saveTurnoPunVens();//WithConnection
						//turnopunvenLogic.getSetVersionRowTurnoPunVens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.turnopunvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoLogic.getCajaIngresos().addAll(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresosEliminados);
							this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos().addAll(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnosEliminados);
							this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoLogic.getCajaEgresos().addAll(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresos.addAll(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresosEliminados);
							this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnos.addAll(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnosEliminados);
							this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresos.addAll(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaIngreso.cajaingresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jInternalFrameDetalleFormCajaEgreso.cajaegresodetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								turnopunvenLogic.saveTurnoPunVenRelaciones(turnopunvenAux,this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoLogic.getCajaIngresos(),this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos(),this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoLogic.getCajaEgresos());//WithConnection
								//turnopunvenLogic.getSetVersionRowTurnoPunVens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoLogic.setCajaIngresos(new ArrayList<CajaIngreso>());
							this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.setCajeroTurnos(new ArrayList<CajeroTurno>());
							this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoLogic.setCajaEgresos(new ArrayList<CajaEgreso>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresos= new ArrayList<CajaIngreso>();
							this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnos= new ArrayList<CajeroTurno>();
							this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresos= new ArrayList<CajaEgreso>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.quitarFilaTotales();}
							turnopunvenAux.setCajaIngresos(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoLogic.getCajaIngresos());

							if(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.quitarFilaTotales();}
							turnopunvenAux.setCajeroTurnos(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos());

							if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.quitarFilaTotales();}
							turnopunvenAux.setCajaEgresos(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoLogic.getCajaEgresos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.turnopunvenSessionBean.getEstaModoGuardarRelaciones() 
								|| this.turnopunvenSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(turnopunvenAux,turnopunvenLogic.getTurnoPunVens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(turnopunvenAux,turnopunvens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.getTurnoPunVens().addAll(this.turnopunvensEliminados);
					
					turnopunvenLogic.saveTurnoPunVens();//WithConnection
					//turnopunvenLogic.getSetVersionRowTurnoPunVens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTurnoPunVen();
				
				this.turnopunvensEliminados= new ArrayList<TurnoPunVen>();		
			}
			
			if(this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.turnopunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Turno Pun Ven GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Turno Pun Ven",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.turnopunven=turnopunvenAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessTurnoPunVen();
      	}
		
	}	
	
	public void actualizarRelaciones(TurnoPunVen turnopunvenLocal) throws Exception {
		
		if(this.turnopunvenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				turnopunvenLocal.setCajaIngresos(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoLogic.getCajaIngresos());
				turnopunvenLocal.setCajeroTurnos(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos());
				turnopunvenLocal.setCajaEgresos(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoLogic.getCajaEgresos());
			
			} else {
			
				turnopunvenLocal.setCajaIngresos(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresos);
				turnopunvenLocal.setCajeroTurnos(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnos);
				turnopunvenLocal.setCajaEgresos(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TurnoPunVen turnopunvenLocal) throws Exception {	
		if(this.turnopunvenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				turnopunvenLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				turnopunvenLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				turnopunvenLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTurnoPunVenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = turnopunvenValidator.getInvalidValues(this.turnopunven);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TurnoPunVen turnopunven,List<TurnoPunVen> turnopunvens) throws Exception {
		try	{		
			TurnoPunVenConstantesFunciones.actualizarLista(turnopunven,turnopunvens,this.turnopunvenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TurnoPunVen turnopunven,List<TurnoPunVen> turnopunvens) throws Exception {
		try	{			
			TurnoPunVenConstantesFunciones.actualizarSelectedLista(turnopunven,turnopunvens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TurnoPunVen> turnopunvensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				turnopunvensLocal=this.turnopunvenLogic.getTurnoPunVens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				turnopunvensLocal=this.turnopunvens;
			}
			//ARCHITECTURE
		
			for(TurnoPunVen turnopunvenLocal:turnopunvensLocal) {
				if(this.permiteMantenimiento(turnopunvenLocal) && turnopunvenLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+TurnoPunVenConstantesFunciones.getTurnoPunVenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TurnoPunVenConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurnoPunVen.jLabelid_empresaTurnoPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoPunVenConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurnoPunVen.jLabelid_sucursalTurnoPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoPunVenConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurnoPunVen.jLabelid_usuarioTurnoPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoPunVenConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurnoPunVen.jLabelnombreTurnoPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoPunVenConstantesFunciones.HORAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurnoPunVen.jLabelhora_inicioTurnoPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoPunVenConstantesFunciones.HORAFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurnoPunVen.jLabelhora_finTurnoPunVen,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurnoPunVen.jLabelid_empresaTurnoPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurnoPunVen.jLabelid_sucursalTurnoPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurnoPunVen.jLabelid_usuarioTurnoPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurnoPunVen.jLabelnombreTurnoPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurnoPunVen.jLabelhora_inicioTurnoPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurnoPunVen.jLabelhora_finTurnoPunVen,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("CajaIngreso")) {
			if(this.turnopunven==null) {
				this.turnopunven= new TurnoPunVen();
			}

			if(this.turnopunvenSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTurnoPunVen
				this.setVariablesFormularioToObjetoActualTurnoPunVen(this.turnopunven,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);

				this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.getcajaingreso().setTurnoPunVen(this.turnopunven);
			}

			return;
		}
		 else  if(sTipo.equals("CajeroTurno")) {
			if(this.turnopunven==null) {
				this.turnopunven= new TurnoPunVen();
			}

			if(this.turnopunvenSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTurnoPunVen
				this.setVariablesFormularioToObjetoActualTurnoPunVen(this.turnopunven,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);

				this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.getcajeroturno().setTurnoPunVen(this.turnopunven);
			}

			return;
		}
		 else  if(sTipo.equals("CajaEgreso")) {
			if(this.turnopunven==null) {
				this.turnopunven= new TurnoPunVen();
			}

			if(this.turnopunvenSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTurnoPunVen
				this.setVariablesFormularioToObjetoActualTurnoPunVen(this.turnopunven,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);

				this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.getcajaegreso().setTurnoPunVen(this.turnopunven);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTurnoPunVen--;	
		
		
		this.turnopunvenAux=new TurnoPunVen();
		
		this.turnopunvenAux.setId(this.iIdNuevoTurnoPunVen);
		this.turnopunvenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.turnopunvenLogic.getTurnoPunVens().add(this.turnopunvenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.turnopunvens.add(this.turnopunvenAux);
		}
		//ARCHITECTURE
		
		this.turnopunven=this.turnopunvenAux;
		
		if(TurnoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTurnoPunVen(this.turnopunven);
			this.setVariablesObjetoActualToFormularioForeignKeyTurnoPunVen(this.turnopunven);
		}
				
		//this.setDefaultControlesTurnoPunVen();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTurnoPunVen();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTurnoPunVen();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTurnoPunVen();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTurnoPunVen(this.turnopunvenBean,this.turnopunven,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TurnoPunVenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.turnopunvenSessionBean.getConGuardarRelaciones()) {
			classes=TurnoPunVenConstantesFunciones.getClassesRelationshipsOfTurnoPunVen(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.turnopunvenReturnGeneral=turnopunvenLogic.procesarEventosTurnoPunVensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.turnopunvenLogic.getTurnoPunVens(),this.turnopunven,this.turnopunvenParameterGeneral,this.isEsNuevoTurnoPunVen,classes);//this.turnopunvenLogic.getTurnoPunVen()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTurnoPunVen(this.turnopunvenReturnGeneral,this.turnopunvenBean,false);
		
		if(this.turnopunvenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTurnoPunVen(this.turnopunvenReturnGeneral.getTurnoPunVen());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTurnoPunVen(this.turnopunvenReturnGeneral.getTurnoPunVen());
		}
		
		if(this.turnopunvenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTurnoPunVen(this.turnopunvenReturnGeneral.getTurnoPunVen(),classes);//this.turnopunvenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTurnoPunVen(this.turnopunven,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTurnoPunVen();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTurnoPunVen();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TurnoPunVenBeanSwingJInternalFrameAdditional.RecargarFormTurnoPunVen(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTurnoPunVen(false);
						
			if(turnopunvenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoSessionBean.getEsGuardarRelacionado() && CajaIngresoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCajaIngresoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.getEsGuardarRelacionado() && CajeroTurnoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCajeroTurnoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoSessionBean.getEsGuardarRelacionado() && CajaEgresoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCajaEgresoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTurnoPunVen();
			}
			
			this.actualizarVisualTableDatosTurnoPunVen();
			
			this.jTableDatosTurnoPunVen.setRowSelectionInterval(this.getIndiceNuevoTurnoPunVen(), this.getIndiceNuevoTurnoPunVen());
			
			this.seleccionarFilaTablaTurnoPunVenActual();
						
			this.actualizarEstadoCeldasBotonesTurnoPunVen("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTurnoPunVen(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTurnoPunVen.jTextFieldnombreTurnoPunVen.setEnabled(isHabilitar && this.turnopunvenConstantesFunciones.activarnombreTurnoPunVen);
		this.jInternalFrameDetalleFormTurnoPunVen.jSpinnerhora_inicioTurnoPunVen.setEnabled(isHabilitar && this.turnopunvenConstantesFunciones.activarhora_inicioTurnoPunVen);
		this.jInternalFrameDetalleFormTurnoPunVen.jSpinnerhora_finTurnoPunVen.setEnabled(isHabilitar && this.turnopunvenConstantesFunciones.activarhora_finTurnoPunVen);	
		//
		this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_empresaTurnoPunVen.setEnabled(isHabilitar && this.turnopunvenConstantesFunciones.activarid_empresaTurnoPunVen);//
		this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_sucursalTurnoPunVen.setEnabled(isHabilitar && this.turnopunvenConstantesFunciones.activarid_sucursalTurnoPunVen);//
		this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_usuarioTurnoPunVen.setEnabled(isHabilitar && this.turnopunvenConstantesFunciones.activarid_usuarioTurnoPunVen);
	};
	
	public void setDefaultControlesTurnoPunVen() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTurnoPunVen(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.turnopunvenSessionBean.setConGuardarRelaciones(true);			
			this.turnopunvenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTurnoPunVen.jTabbedPaneRelacionesTurnoPunVen.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.turnopunvenSessionBean.setConGuardarRelaciones(false);			
			this.turnopunvenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTurnoPunVen.jTabbedPaneRelacionesTurnoPunVen.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTurnoPunVen() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TurnoPunVen turnopunvenAux:this.turnopunvenLogic.getTurnoPunVens()) {
				if(turnopunvenAux.getId().equals(this.iIdNuevoTurnoPunVen)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TurnoPunVen turnopunvenAux:this.turnopunvens) {
				if(turnopunvenAux.getId().equals(this.iIdNuevoTurnoPunVen)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualTurnoPunVen(TurnoPunVen turnopunven,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TurnoPunVen turnopunvenAux:this.turnopunvenLogic.getTurnoPunVens()) {
				if(turnopunvenAux.getId().equals(turnopunven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TurnoPunVen turnopunvenAux:this.turnopunvens) {
				if(turnopunvenAux.getId().equals(turnopunven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalTurnoPunVen(TurnoPunVen turnopunvenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TurnoPunVen turnopunvenAux:this.turnopunvenLogic.getTurnoPunVens()) {
				if(turnopunvenAux.getTurnoPunVenOriginal().getId().equals(turnopunvenOriginal.getId())) {
					existe=true;
					turnopunvenOriginal.setId(turnopunvenAux.getId());
					turnopunvenOriginal.setVersionRow(turnopunvenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TurnoPunVen turnopunvenAux:this.turnopunvens) {
				if(turnopunvenAux.getTurnoPunVenOriginal().getId().equals(turnopunvenOriginal.getId())) {
					existe=true;
					turnopunvenOriginal.setId(turnopunvenAux.getId());
					turnopunvenOriginal.setVersionRow(turnopunvenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTurnoPunVen(Boolean esParaCancelar) throws Exception {
		turnopunvensAux=new ArrayList<TurnoPunVen>();
		turnopunvenAux=new TurnoPunVen();
		
		if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TurnoPunVen turnopunvenAux:this.turnopunvenLogic.getTurnoPunVens()) {
					if(turnopunvenAux.getId()<0) {
						turnopunvensAux.add(turnopunvenAux);
					}		
				}
				this.iIdNuevoTurnoPunVen=0L;
				this.turnopunvenLogic.getTurnoPunVens().removeAll(turnopunvensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TurnoPunVen turnopunvenAux:this.turnopunvens) {
					if(turnopunvenAux.getId()<0) {
						turnopunvensAux.add(turnopunvenAux);
					}		
				}
				this.iIdNuevoTurnoPunVen=0L;
				this.turnopunvens.removeAll(turnopunvensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTurnoPunVen 
					&& this.turnopunvenLogic.getTurnoPunVens().size()>0
					) {
					turnopunvenAux=this.turnopunvenLogic.getTurnoPunVens().get(this.turnopunvenLogic.getTurnoPunVens().size() - 1);
				
					if(turnopunvenAux.getId()<0) {
						this.turnopunvenLogic.getTurnoPunVens().remove(turnopunvenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTurnoPunVen && this.turnopunvens.size()>0) {
					turnopunvenAux=this.turnopunvens.get(this.turnopunvens.size() - 1);
				
					if(turnopunvenAux.getId()<0) {
						this.turnopunvens.remove(turnopunvenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTurnoPunVen(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(turnopunven.getId()<0) {
				this.turnopunvenLogic.getTurnoPunVens().remove(this.turnopunven);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(turnopunven.getId()<0) {
				this.turnopunvens.remove(this.turnopunven);
			}
		}			
	}
	
	public void setEstadosInicialesTurnoPunVen(List<TurnoPunVen> turnopunvensAux) throws Exception {
		TurnoPunVenConstantesFunciones.setEstadosInicialesTurnoPunVen(turnopunvensAux);
	}
	
	public void setEstadosInicialesTurnoPunVen(TurnoPunVen turnopunvenAux) throws Exception {
		TurnoPunVenConstantesFunciones.setEstadosInicialesTurnoPunVen(turnopunvenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTurnoPunVenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTurnoPunVen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTurnoPunVenActual()) {
				if(!this.isEsNuevoTurnoPunVen) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTurnoPunVen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTurnoPunVen=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTurnoPunVenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Turno Pun Ven ?", "MANTENIMIENTO DE Turno Pun Ven", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTurnoPunVen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TurnoPunVen turnopunven) throws Exception {
		TurnoPunVenConstantesFunciones.seleccionarAsignar(this.turnopunven,turnopunven);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTurnoPunVen=this.isPermisoActualizarOriginalTurnoPunVen;
			
			
			this.seleccionarAsignar(turnopunven);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TurnoPunVenConstantesFunciones.quitarEspaciosTurnoPunVen(this.turnopunven,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTurnoPunVen("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.turnopunvenSessionBean.setsFuncionBusquedaRapida(this.turnopunvenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTurnoPunVen) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTurnoPunVen(esParaCancelar);				
				this.cancelarNuevoTurnoPunVen(esParaCancelar);								
			}
			
			this.turnopunven=new TurnoPunVen();
			
			this.inicializarTurnoPunVen();
			
			this.actualizarEstadoCeldasBotonesTurnoPunVen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTurnoPunVen() throws Exception {
		try {
			TurnoPunVenConstantesFunciones.inicializarTurnoPunVen(this.turnopunven);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.turnopunvenLogic.getTurnoPunVens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTurnoPunVens(String sAccionBusqueda,List<TurnoPunVen> turnopunvensParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="TurnoPunVen"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TurnoPunVenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TurnoPunVenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TurnoPunVen"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Turno Pun Venes");		
		parameters.put("busquedapor", TurnoPunVenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(CajaIngreso.class));
			classes.add(new Classe(CajeroTurno.class));
			classes.add(new Classe(CajaEgreso.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TurnoPunVenLogic turnopunvenLogicAuxiliar=new TurnoPunVenLogic();
					turnopunvenLogicAuxiliar.setDatosCliente(turnopunvenLogic.getDatosCliente());				
					turnopunvenLogicAuxiliar.setTurnoPunVens(turnopunvensParaReportes);
					
					turnopunvenLogicAuxiliar.cargarRelacionesLoteForeignKeyTurnoPunVenWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					turnopunvensParaReportes=turnopunvenLogicAuxiliar.getTurnoPunVens();
					
					//turnopunvenLogic.getNewConnexionToDeep();
					
					//for (TurnoPunVen turnopunven:turnopunvensParaReportes) {
					//	turnopunvenLogic.deepLoad(turnopunven, false, DeepLoadType.INCLUDE, classes);
					//}						
					//turnopunvenLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//turnopunvenLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCajaIngreso = AuxiliarReportes.class.getResourceAsStream("CajaIngresoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cajaingreso", reportFileCajaIngreso);

			InputStream reportFileCajeroTurno = AuxiliarReportes.class.getResourceAsStream("CajeroTurnoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cajeroturno", reportFileCajeroTurno);

			InputStream reportFileCajaEgreso = AuxiliarReportes.class.getResourceAsStream("CajaEgresoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cajaegreso", reportFileCajaEgreso);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTurnoPunVen=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TurnoPunVenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TurnoPunVenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTurnoPunVen=new JRBeanArrayDataSource(TurnoPunVenJInternalFrame.TraerTurnoPunVenBeans(turnopunvensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTurnoPunVen);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TurnoPunVenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TurnoPunVenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TurnoPunVenBean.TraerTurnoPunVenBeans(turnopunvensParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteTurnoPunVens(sAccionBusqueda,sTipoArchivoReporte,turnopunvensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTurnoPunVens(sAccionBusqueda,sTipoArchivoReporte,turnopunvensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTurnoPunVenActionPerformed(null);
					//this.generarExcelReporteTurnoPunVens(sAccionBusqueda,sTipoArchivoReporte,turnopunvensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTurnoPunVens(sAccionBusqueda,sTipoArchivoReporte,turnopunvensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTurnoPunVens(sAccionBusqueda,sTipoArchivoReporte,turnopunvensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTurnoPunVens(sAccionBusqueda,sTipoArchivoReporte,turnopunvensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTurnoPunVens(String sAccionBusqueda,String sTipoArchivoReporte,List<TurnoPunVen> turnopunvensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"turnopunven";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TurnoPunVens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTurnoPunVen("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TurnoPunVen turnopunven : turnopunvensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TurnoPunVenConstantesFunciones.generarExcelReporteDataTurnoPunVen("NORMAL",row,workbook,turnopunven,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.turnopunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Turno Pun Ven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTurnoPunVen(String sTipo,Row row,Workbook workbook) {
		
		TurnoPunVenConstantesFunciones.generarExcelReporteHeaderTurnoPunVen(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTurnoPunVens(String sAccionBusqueda,String sTipoArchivoReporte,List<TurnoPunVen> turnopunvensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"turnopunven_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TurnoPunVens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TurnoPunVen turnopunven : turnopunvensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TurnoPunVenConstantesFunciones.getTurnoPunVenDescripcion(turnopunven));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoPunVenConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turnopunven.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoPunVenConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turnopunven.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoPunVenConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turnopunven.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoPunVenConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turnopunven.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoPunVenConstantesFunciones.LABEL_HORAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_HORAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turnopunven.gethora_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoPunVenConstantesFunciones.LABEL_HORAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_HORAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turnopunven.gethora_fin());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.turnopunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Turno Pun Ven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTurnoPunVens(String sAccionBusqueda,String sTipoArchivoReporte,List<TurnoPunVen> turnopunvensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TurnoPunVen> turnopunvensRespaldo=null;
		
		classes=TurnoPunVenConstantesFunciones.getClassesRelationshipsOfTurnoPunVen(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.turnopunvenLogic.setDatosCliente(this.datosCliente);
		this.turnopunvenLogic.setDatosDeep(this.datosDeep);
		this.turnopunvenLogic.setIsConDeep(true);
		
		turnopunvensRespaldo=this.turnopunvenLogic.getTurnoPunVens();
		
		this.turnopunvenLogic.setTurnoPunVens(turnopunvensParaReportes);	
		this.turnopunvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		turnopunvensParaReportes=this.turnopunvenLogic.getTurnoPunVens();
		this.turnopunvenLogic.setTurnoPunVens(turnopunvensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"turnopunven_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TurnoPunVens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTurnoPunVen("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TurnoPunVen turnopunven : turnopunvensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTurnoPunVen("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TurnoPunVenConstantesFunciones.generarExcelReporteDataTurnoPunVen("NORMAL",row,workbook,turnopunven,cellStyleDataAux);
		
			
			


				//CajaIngreso
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CajaIngresoConstantesFunciones.SCLASSWEBTITULO))) {

				if(turnopunven.getCajaIngresos()!=null && turnopunven.getCajaIngresos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CajaIngresoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CajaIngresoConstantesFunciones.generarExcelReporteHeaderCajaIngreso("RELACIONADO",row,workbook);
				}

				if(turnopunven.getCajaIngresos()!=null) {
					i2=0;
					for(CajaIngreso cajaingreso : turnopunven.getCajaIngresos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CajaIngresoConstantesFunciones.generarExcelReporteDataCajaIngreso("RELACIONADO",row,workbook,cajaingreso,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//CajeroTurno
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CajeroTurnoConstantesFunciones.SCLASSWEBTITULO))) {

				if(turnopunven.getCajeroTurnos()!=null && turnopunven.getCajeroTurnos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CajeroTurnoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CajeroTurnoConstantesFunciones.generarExcelReporteHeaderCajeroTurno("RELACIONADO",row,workbook);
				}

				if(turnopunven.getCajeroTurnos()!=null) {
					i2=0;
					for(CajeroTurno cajeroturno : turnopunven.getCajeroTurnos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CajeroTurnoConstantesFunciones.generarExcelReporteDataCajeroTurno("RELACIONADO",row,workbook,cajeroturno,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//CajaEgreso
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CajaEgresoConstantesFunciones.SCLASSWEBTITULO))) {

				if(turnopunven.getCajaEgresos()!=null && turnopunven.getCajaEgresos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CajaEgresoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CajaEgresoConstantesFunciones.generarExcelReporteHeaderCajaEgreso("RELACIONADO",row,workbook);
				}

				if(turnopunven.getCajaEgresos()!=null) {
					i2=0;
					for(CajaEgreso cajaegreso : turnopunven.getCajaEgresos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CajaEgresoConstantesFunciones.generarExcelReporteDataCajaEgreso("RELACIONADO",row,workbook,cajaegreso,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TurnoPunVenConstantesFunciones.getTurnoPunVenDescripcion(turnopunven));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.turnopunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Turno Pun Ven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTurnoPunVen.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTurnoPunVen.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTurnoPunVen.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTurnoPunVen.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTurnoPunVen() throws Exception {		
		this.startProcessTurnoPunVen(true);
	}
	
	public void startProcessTurnoPunVen(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTurnoPunVen ,this.jPanelParametrosReportesTurnoPunVen, this.jScrollPanelDatosTurnoPunVen,this.jPanelPaginacionTurnoPunVen, this.jScrollPanelDatosEdicionTurnoPunVen, this.jPanelAccionesTurnoPunVen,this.jPanelAccionesFormularioTurnoPunVen,this.jmenuBarTurnoPunVen,this.jmenuBarDetalleTurnoPunVen,this.jTtoolBarTurnoPunVen,this.jTtoolBarDetalleTurnoPunVen);		
		
		final JTabbedPane jTabbedPaneBusquedasTurnoPunVen=this.jTabbedPaneBusquedasTurnoPunVen; 
		
		final JPanel jPanelParametrosReportesTurnoPunVen=this.jPanelParametrosReportesTurnoPunVen;
		//final JScrollPane jScrollPanelDatosTurnoPunVen=this.jScrollPanelDatosTurnoPunVen;
		final JTable jTableDatosTurnoPunVen=this.jTableDatosTurnoPunVen;		
		final JPanel jPanelPaginacionTurnoPunVen=this.jPanelPaginacionTurnoPunVen;
		//final JScrollPane jScrollPanelDatosEdicionTurnoPunVen=this.jScrollPanelDatosEdicionTurnoPunVen;
		final JPanel jPanelAccionesTurnoPunVen=this.jPanelAccionesTurnoPunVen;
		
		JPanel jPanelCamposAuxiliarTurnoPunVen=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTurnoPunVen=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
			jPanelCamposAuxiliarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jPanelCamposTurnoPunVen;
			jPanelAccionesFormularioAuxiliarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jPanelAccionesFormularioTurnoPunVen;
		}
		
		final JPanel jPanelCamposTurnoPunVen=jPanelCamposAuxiliarTurnoPunVen;
		final JPanel jPanelAccionesFormularioTurnoPunVen=jPanelAccionesFormularioAuxiliarTurnoPunVen;
		
		
		final JMenuBar jmenuBarTurnoPunVen=this.jmenuBarTurnoPunVen;
		final JToolBar jTtoolBarTurnoPunVen=this.jTtoolBarTurnoPunVen;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTurnoPunVen=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTurnoPunVen=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
			jmenuBarDetalleAuxiliarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jmenuBarDetalleTurnoPunVen;
			jTtoolBarDetalleAuxiliarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jTtoolBarDetalleTurnoPunVen;
		}
		
		final JMenuBar jmenuBarDetalleTurnoPunVen=jmenuBarDetalleAuxiliarTurnoPunVen;
		final JToolBar jTtoolBarDetalleTurnoPunVen=jTtoolBarDetalleAuxiliarTurnoPunVen;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTurnoPunVen;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTurnoPunVen;
			processRunnable.jTableDatos=jTableDatosTurnoPunVen;
			processRunnable.jPanelCampos=jPanelCamposTurnoPunVen;
			processRunnable.jPanelPaginacion=jPanelPaginacionTurnoPunVen;
			processRunnable.jPanelAcciones=jPanelAccionesTurnoPunVen;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTurnoPunVen;
			
			
			processRunnable.jmenuBar=jmenuBarTurnoPunVen;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTurnoPunVen;
			processRunnable.jTtoolBar=jTtoolBarTurnoPunVen;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTurnoPunVen;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTurnoPunVen ,jPanelParametrosReportesTurnoPunVen,jTableDatosTurnoPunVen, /*jScrollPanelDatosTurnoPunVen,*/jPanelCamposTurnoPunVen,jPanelPaginacionTurnoPunVen, /*jScrollPanelDatosEdicionTurnoPunVen,*/ jPanelAccionesTurnoPunVen,jPanelAccionesFormularioTurnoPunVen,jmenuBarTurnoPunVen,jmenuBarDetalleTurnoPunVen,jTtoolBarTurnoPunVen,jTtoolBarDetalleTurnoPunVen);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTurnoPunVen ,jPanelParametrosReportesTurnoPunVen, jScrollPanelDatosTurnoPunVen,jPanelPaginacionTurnoPunVen, jScrollPanelDatosEdicionTurnoPunVen, jPanelAccionesTurnoPunVen,jPanelAccionesFormularioTurnoPunVen,jmenuBarTurnoPunVen,jmenuBarDetalleTurnoPunVen,jTtoolBarTurnoPunVen,jTtoolBarDetalleTurnoPunVen);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessTurnoPunVen() {// throws Exception 
		this.finishProcessTurnoPunVen(true);
	}
	
	public void finishProcessTurnoPunVen(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTurnoPunVen ,this.jPanelParametrosReportesTurnoPunVen, this.jScrollPanelDatosTurnoPunVen,this.jPanelPaginacionTurnoPunVen, this.jScrollPanelDatosEdicionTurnoPunVen, this.jPanelAccionesTurnoPunVen,this.jPanelAccionesFormularioTurnoPunVen,this.jmenuBarTurnoPunVen,this.jmenuBarDetalleTurnoPunVen,this.jTtoolBarTurnoPunVen,this.jTtoolBarDetalleTurnoPunVen);		
		
		final JTabbedPane jTabbedPaneBusquedasTurnoPunVen=this.jTabbedPaneBusquedasTurnoPunVen; 
		
		final JPanel jPanelParametrosReportesTurnoPunVen=this.jPanelParametrosReportesTurnoPunVen;
		//final JScrollPane jScrollPanelDatosTurnoPunVen=this.jScrollPanelDatosTurnoPunVen;
		final JTable jTableDatosTurnoPunVen=this.jTableDatosTurnoPunVen;		
		final JPanel jPanelPaginacionTurnoPunVen=this.jPanelPaginacionTurnoPunVen;
		//final JScrollPane jScrollPanelDatosEdicionTurnoPunVen=this.jScrollPanelDatosEdicionTurnoPunVen;
		final JPanel jPanelAccionesTurnoPunVen=this.jPanelAccionesTurnoPunVen;
		
		JPanel jPanelCamposAuxiliarTurnoPunVen=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTurnoPunVen=new JPanel();
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
			jPanelCamposAuxiliarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jPanelCamposTurnoPunVen;
			jPanelAccionesFormularioAuxiliarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jPanelAccionesFormularioTurnoPunVen;
		}
		
		final JPanel jPanelCamposTurnoPunVen=jPanelCamposAuxiliarTurnoPunVen;
		final JPanel jPanelAccionesFormularioTurnoPunVen=jPanelAccionesFormularioAuxiliarTurnoPunVen;
		
		
		final JMenuBar jmenuBarTurnoPunVen=this.jmenuBarTurnoPunVen;		
		final JToolBar jTtoolBarTurnoPunVen=this.jTtoolBarTurnoPunVen;
				
		JMenuBar jmenuBarDetalleAuxiliarTurnoPunVen=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTurnoPunVen=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
			jmenuBarDetalleAuxiliarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jmenuBarDetalleTurnoPunVen;
			jTtoolBarDetalleAuxiliarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jTtoolBarDetalleTurnoPunVen;		
		}
		
		final JMenuBar jmenuBarDetalleTurnoPunVen=jmenuBarDetalleAuxiliarTurnoPunVen;
		final JToolBar jTtoolBarDetalleTurnoPunVen=jTtoolBarDetalleAuxiliarTurnoPunVen;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTurnoPunVen;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTurnoPunVen;
			processRunnable.jTableDatos=jTableDatosTurnoPunVen;
			processRunnable.jPanelCampos=jPanelCamposTurnoPunVen;
			processRunnable.jPanelPaginacion=jPanelPaginacionTurnoPunVen;
			processRunnable.jPanelAcciones=jPanelAccionesTurnoPunVen;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTurnoPunVen;
			
			
			processRunnable.jmenuBar=jmenuBarTurnoPunVen;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTurnoPunVen;
			processRunnable.jTtoolBar=jTtoolBarTurnoPunVen;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTurnoPunVen;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTurnoPunVen ,jPanelParametrosReportesTurnoPunVen, jTableDatosTurnoPunVen,/*jScrollPanelDatosTurnoPunVen,*/jPanelCamposTurnoPunVen,jPanelPaginacionTurnoPunVen, /*jScrollPanelDatosEdicionTurnoPunVen,*/ jPanelAccionesTurnoPunVen,jPanelAccionesFormularioTurnoPunVen,jmenuBarTurnoPunVen,jmenuBarDetalleTurnoPunVen,jTtoolBarTurnoPunVen,jTtoolBarDetalleTurnoPunVen));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTurnoPunVen(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTurnoPunVen(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTurnoPunVen(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTurnoPunVen(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTurnoPunVen,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTurnoPunVen,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTurnoPunVen(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTurnoPunVen,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTurnoPunVen,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.turnopunvenConstantesFunciones.getsFinalQueryTurnoPunVen();
		String  finalQueryPaginacionTodos=this.turnopunvenConstantesFunciones.getsFinalQueryTurnoPunVen();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=TurnoPunVenConstantesFunciones.getArrayColumnasGlobalesNoTurnoPunVen(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TurnoPunVenConstantesFunciones.getArrayColumnasGlobalesTurnoPunVen(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TurnoPunVenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.turnopunvensEliminados= new ArrayList<TurnoPunVen>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTurnoPunVen();
		
				///*TurnoPunVenSessionBean*/this.turnopunvenSessionBean=new TurnoPunVenSessionBean();
			
			if(this.turnopunvenSessionBean==null) {
				this.turnopunvenSessionBean=new TurnoPunVenSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=TurnoPunVenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TurnoPunVenConstantesFunciones.getClassesForeignKeysOfTurnoPunVen(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/turnopunven."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			turnopunvensAux= new ArrayList<TurnoPunVen>();
			
				
			turnopunvenLogic.setDatosCliente(this.datosCliente);
			turnopunvenLogic.setDatosDeep(this.datosDeep);
			turnopunvenLogic.setIsConDeep(true);
			
			
			turnopunvenLogic.getTurnoPunVenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					turnopunvenLogic.getTodosTurnoPunVens(finalQueryGlobal,pagination);
					
					//turnopunvenLogic.getTodosTurnoPunVensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(turnopunvenLogic.getTurnoPunVens()==null|| turnopunvenLogic.getTurnoPunVens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							turnopunvensAux= new ArrayList<TurnoPunVen>();
							turnopunvensAux.addAll(turnopunvenLogic.getTurnoPunVens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							turnopunvensAux= new ArrayList<TurnoPunVen>();
							turnopunvensAux.addAll(turnopunvens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							turnopunvenLogic.getTodosTurnoPunVens(finalQueryGlobal+"",this.pagination);												
							
							//turnopunvenLogic.getTodosTurnoPunVensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTurnoPunVens("Todos",turnopunvenLogic.getTurnoPunVens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							turnopunvenLogic.setTurnoPunVens(new ArrayList<TurnoPunVen>());					
							turnopunvenLogic.getTurnoPunVens().addAll(turnopunvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							turnopunvens=new ArrayList<TurnoPunVen>();
							turnopunvens.addAll(turnopunvensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTurnoPunVen=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTurnoPunVen=this.idActual;
				
				} else if(this.idTurnoPunVenActual!=null && this.idTurnoPunVenActual!=0L) {
					idTurnoPunVen=idTurnoPunVenActual;
				}
				
					
				this.sDetalleReporte=TurnoPunVenConstantesFunciones.getDetalleIndicePorId(idTurnoPunVen);
				
				this.turnopunvens=new ArrayList<TurnoPunVen>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					turnopunvenLogic.getEntity(idTurnoPunVen);
					
					//turnopunvenLogic.getEntityWithConnection(idTurnoPunVen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					turnopunvenLogic.setTurnoPunVens(new ArrayList<TurnoPunVen>());
					turnopunvenLogic.getTurnoPunVens().add(turnopunvenLogic.getTurnoPunVen());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.turnopunvens=new ArrayList<TurnoPunVen>();
					this.turnopunvens.add(turnopunven);
				}
				
				if(turnopunvenLogic.getTurnoPunVen()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TurnoPunVenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					turnopunvenLogic.getTurnoPunVensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TurnoPunVenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TurnoPunVenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=turnopunvenLogic.getTurnoPunVens()==null||turnopunvenLogic.getTurnoPunVens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=turnopunvens==null|| turnopunvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						turnopunvensAux=new ArrayList<TurnoPunVen>();
						turnopunvensAux.addAll(turnopunvenLogic.getTurnoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							turnopunvensAux=new ArrayList<TurnoPunVen>();
							turnopunvensAux.addAll(turnopunvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							turnopunvenLogic.getTurnoPunVensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TurnoPunVenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TurnoPunVenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTurnoPunVens("FK_IdEmpresa",turnopunvenLogic.getTurnoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTurnoPunVens("FK_IdEmpresa",turnopunvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						turnopunvenLogic.setTurnoPunVens(new ArrayList<TurnoPunVen>());
						turnopunvenLogic.getTurnoPunVens().addAll(turnopunvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							turnopunvens=new ArrayList<TurnoPunVen>();
							turnopunvens.addAll(turnopunvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=TurnoPunVenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					turnopunvenLogic.getTurnoPunVensFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TurnoPunVenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TurnoPunVenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=turnopunvenLogic.getTurnoPunVens()==null||turnopunvenLogic.getTurnoPunVens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=turnopunvens==null|| turnopunvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						turnopunvensAux=new ArrayList<TurnoPunVen>();
						turnopunvensAux.addAll(turnopunvenLogic.getTurnoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							turnopunvensAux=new ArrayList<TurnoPunVen>();
							turnopunvensAux.addAll(turnopunvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							turnopunvenLogic.getTurnoPunVensFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TurnoPunVenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TurnoPunVenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTurnoPunVens("FK_IdSucursal",turnopunvenLogic.getTurnoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTurnoPunVens("FK_IdSucursal",turnopunvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						turnopunvenLogic.setTurnoPunVens(new ArrayList<TurnoPunVen>());
						turnopunvenLogic.getTurnoPunVens().addAll(turnopunvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							turnopunvens=new ArrayList<TurnoPunVen>();
							turnopunvens.addAll(turnopunvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=TurnoPunVenConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					turnopunvenLogic.getTurnoPunVensFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TurnoPunVenConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TurnoPunVenConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=turnopunvenLogic.getTurnoPunVens()==null||turnopunvenLogic.getTurnoPunVens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=turnopunvens==null|| turnopunvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						turnopunvensAux=new ArrayList<TurnoPunVen>();
						turnopunvensAux.addAll(turnopunvenLogic.getTurnoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							turnopunvensAux=new ArrayList<TurnoPunVen>();
							turnopunvensAux.addAll(turnopunvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							turnopunvenLogic.getTurnoPunVensFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TurnoPunVenConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TurnoPunVenConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTurnoPunVens("FK_IdUsuario",turnopunvenLogic.getTurnoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTurnoPunVens("FK_IdUsuario",turnopunvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						turnopunvenLogic.setTurnoPunVens(new ArrayList<TurnoPunVen>());
						turnopunvenLogic.getTurnoPunVens().addAll(turnopunvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							turnopunvens=new ArrayList<TurnoPunVen>();
							turnopunvens.addAll(turnopunvensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTurnoPunVen();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTurnoPunVen();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=turnopunvenLogic.getTurnoPunVens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=turnopunvens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=turnopunvenLogic.getTurnoPunVens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=turnopunvens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TurnoPunVen turnopunven) {
		Boolean permite=true;
		
		if(this.turnopunven.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TurnoPunVenConstantesFunciones.getOrderByListaTurnoPunVen();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TurnoPunVenConstantesFunciones.getOrderByListaTurnoPunVen();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TurnoPunVen turnopunven:turnopunvenLogic.getTurnoPunVens()) {
				if(turnopunven.getsType().equals(Constantes2.S_TOTALES)) {
					turnopunvenTotales=turnopunven;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TurnoPunVen turnopunven:this.turnopunvens) {
				if(turnopunven.getsType().equals(Constantes2.S_TOTALES)) {
					turnopunvenTotales=turnopunven;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.turnopunvenAux=new TurnoPunVen();
			this.turnopunvenAux.setsType(Constantes2.S_TOTALES);
			this.turnopunvenAux.setIsNew(false);
			this.turnopunvenAux.setIsChanged(false);
			this.turnopunvenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TurnoPunVenConstantesFunciones.TotalizarValoresFilaTurnoPunVen(this.turnopunvenLogic.getTurnoPunVens(),this.turnopunvenAux);
				
				this.turnopunvenLogic.getTurnoPunVens().add(this.turnopunvenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TurnoPunVenConstantesFunciones.TotalizarValoresFilaTurnoPunVen(this.turnopunvens,this.turnopunvenAux);
				
				this.turnopunvens.add(this.turnopunvenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		turnopunvenTotales=new TurnoPunVen();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.turnopunvenLogic.getTurnoPunVens().remove(turnopunvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.turnopunvens.remove(turnopunvenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		turnopunvenTotales=new TurnoPunVen();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TurnoPunVen turnopunven:turnopunvenLogic.getTurnoPunVens()) {
				if(turnopunven.getsType().equals(Constantes2.S_TOTALES)) {
					turnopunvenTotales=turnopunven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TurnoPunVenConstantesFunciones.TotalizarValoresFilaTurnoPunVen(this.turnopunvenLogic.getTurnoPunVens(),turnopunvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TurnoPunVen turnopunven:this.turnopunvens) {
				if(turnopunven.getsType().equals(Constantes2.S_TOTALES)) {
					turnopunvenTotales=turnopunven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TurnoPunVenConstantesFunciones.TotalizarValoresFilaTurnoPunVen(this.turnopunvens,turnopunvenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTurnoPunVensFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTurnoPunVensFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTurnoPunVensFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTurnoPunVensFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					turnopunvenLogic.getTurnoPunVensFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTurnoPunVensFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					turnopunvenLogic.getTurnoPunVensFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTurnoPunVensFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					turnopunvenLogic.getTurnoPunVensFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosTurnoPunVen() {
		this.isPermisoTodoTurnoPunVen=false;
		this.isPermisoNuevoTurnoPunVen=false;
		this.isPermisoActualizarTurnoPunVen=false;
		this.isPermisoActualizarOriginalTurnoPunVen=false;
		this.isPermisoEliminarTurnoPunVen=false;
		this.isPermisoGuardarCambiosTurnoPunVen=false;
		this.isPermisoConsultaTurnoPunVen=false;
		this.isPermisoBusquedaTurnoPunVen=false;
		this.isPermisoReporteTurnoPunVen=false;		
		this.isPermisoOrdenTurnoPunVen=false;		
		this.isPermisoPaginacionMedioTurnoPunVen=false;		
		this.isPermisoPaginacionAltoTurnoPunVen=false;
		this.isPermisoPaginacionTodoTurnoPunVen=false;
		this.isPermisoCopiarTurnoPunVen=false;		
		this.isPermisoVerFormTurnoPunVen=false;		
		this.isPermisoDuplicarTurnoPunVen=false;		
		this.isPermisoOrdenTurnoPunVen=false;		
	}
	
	public void setPermisosUsuarioTurnoPunVen(Boolean isPermiso) {
		this.isPermisoTodoTurnoPunVen=isPermiso;
		this.isPermisoNuevoTurnoPunVen=isPermiso;
		this.isPermisoActualizarTurnoPunVen=isPermiso;
		this.isPermisoActualizarOriginalTurnoPunVen=isPermiso;
		this.isPermisoEliminarTurnoPunVen=isPermiso;
		this.isPermisoGuardarCambiosTurnoPunVen=isPermiso;
		this.isPermisoConsultaTurnoPunVen=isPermiso;
		this.isPermisoBusquedaTurnoPunVen=isPermiso;
		this.isPermisoReporteTurnoPunVen=isPermiso;
		this.isPermisoOrdenTurnoPunVen=isPermiso;		
		this.isPermisoPaginacionMedioTurnoPunVen=isPermiso;		
		this.isPermisoPaginacionAltoTurnoPunVen=isPermiso;		
		this.isPermisoPaginacionTodoTurnoPunVen=isPermiso;		
		this.isPermisoCopiarTurnoPunVen=isPermiso;		
		this.isPermisoVerFormTurnoPunVen=isPermiso;		
		this.isPermisoDuplicarTurnoPunVen=isPermiso;
		this.isPermisoOrdenTurnoPunVen=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTurnoPunVen(Boolean isPermiso) {
		//this.isPermisoTodoTurnoPunVen=isPermiso;
		this.isPermisoNuevoTurnoPunVen=isPermiso;
		this.isPermisoActualizarTurnoPunVen=isPermiso;
		this.isPermisoActualizarOriginalTurnoPunVen=isPermiso;
		this.isPermisoEliminarTurnoPunVen=isPermiso;
		this.isPermisoGuardarCambiosTurnoPunVen=isPermiso;
		//this.isPermisoConsultaTurnoPunVen=isPermiso;
		//this.isPermisoBusquedaTurnoPunVen=isPermiso;
		//this.isPermisoReporteTurnoPunVen=isPermiso;
		//this.isPermisoOrdenTurnoPunVen=isPermiso;		
		//this.isPermisoPaginacionMedioTurnoPunVen=isPermiso;		
		//this.isPermisoPaginacionAltoTurnoPunVen=isPermiso;		
		//this.isPermisoPaginacionTodoTurnoPunVen=isPermiso;		
		//this.isPermisoCopiarTurnoPunVen=isPermiso;		
		//this.isPermisoDuplicarTurnoPunVen=isPermiso;
		//this.isPermisoOrdenTurnoPunVen=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTurnoPunVenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CajaIngresoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CajeroTurnoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CajaEgresoConstantesFunciones.SNOMBREOPCION);
		
		if(TurnoPunVenJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCajaIngreso=false;
		this.isTienePermisosCajaIngreso=this.verificarGetPermisosUsuarioOpcionTurnoPunVenClaseRelacionada(this.opcionsRelacionadas,CajaIngresoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCajeroTurno=false;
		this.isTienePermisosCajeroTurno=this.verificarGetPermisosUsuarioOpcionTurnoPunVenClaseRelacionada(this.opcionsRelacionadas,CajeroTurnoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCajaEgreso=false;
		this.isTienePermisosCajaEgreso=this.verificarGetPermisosUsuarioOpcionTurnoPunVenClaseRelacionada(this.opcionsRelacionadas,CajaEgresoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTurnoPunVen(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTurnoPunVenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCajaIngreso=conPermiso;
		this.isTienePermisosCajeroTurno=conPermiso;
		this.isTienePermisosCajaEgreso=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTurnoPunVenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTurnoPunVenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTurnoPunVenClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCajaIngreso && this.jInternalFrameDetalleFormTurnoPunVen!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTurnoPunVen.jTabbedPaneRelacionesTurnoPunVen.remove(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCajeroTurno && this.jInternalFrameDetalleFormTurnoPunVen!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTurnoPunVen.jTabbedPaneRelacionesTurnoPunVen.remove(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCajaEgreso && this.jInternalFrameDetalleFormTurnoPunVen!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTurnoPunVen.jTabbedPaneRelacionesTurnoPunVen.remove(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTurnoPunVen() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TurnoPunVenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TurnoPunVenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTurnoPunVen=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTurnoPunVen=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTurnoPunVen=this.isPermisoActualizarTurnoPunVen;
			this.isPermisoEliminarTurnoPunVen=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTurnoPunVen=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTurnoPunVen=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTurnoPunVen=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTurnoPunVen=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTurnoPunVen=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTurnoPunVen=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTurnoPunVen=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTurnoPunVen=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTurnoPunVen=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTurnoPunVen=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTurnoPunVen=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTurnoPunVen=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTurnoPunVen=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTurnoPunVen.setToolTipText(this.jTableDatosTurnoPunVen.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTurnoPunVen(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTurnoPunVen(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TurnoPunVenJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(TurnoPunVenJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioTurnoPunVen() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCajaIngreso && this.turnopunvenConstantesFunciones.mostrarCajaIngresoTurnoPunVen && !TurnoPunVenConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Caja Ingreso");
			reporte.setsDescripcion("Caja Ingreso");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCajeroTurno && this.turnopunvenConstantesFunciones.mostrarCajeroTurnoTurnoPunVen && !TurnoPunVenConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cajero Turno");
			reporte.setsDescripcion("Cajero Turno");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCajaEgreso && this.turnopunvenConstantesFunciones.mostrarCajaEgresoTurnoPunVen && !TurnoPunVenConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Caja Egreso");
			reporte.setsDescripcion("Caja Egreso");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyTurnoPunVenListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTurnoPunVenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TurnoPunVenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTurnoPunVenListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUsuarioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UsuarioConstantesFunciones.SFINALQUERY;

				this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTurnoPunVenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TurnoPunVenParameterReturnGeneral turnopunvenReturnGeneral=new TurnoPunVenParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.turnopunvenConstantesFunciones.cargarid_empresaTurnoPunVen)
					 || (this.esRecargarFks && this.turnopunvenConstantesFunciones.cargarid_empresaTurnoPunVen)) {

					if(!this.turnopunvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+turnopunvenSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.turnopunvenConstantesFunciones.cargarid_sucursalTurnoPunVen)
					 || (this.esRecargarFks && this.turnopunvenConstantesFunciones.cargarid_sucursalTurnoPunVen)) {

					if(!this.turnopunvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+turnopunvenSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.turnopunvenConstantesFunciones.cargarid_usuarioTurnoPunVen)
					 || (this.esRecargarFks && this.turnopunvenConstantesFunciones.cargarid_usuarioTurnoPunVen)) {

					if(!this.turnopunvenSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+turnopunvenSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				turnopunvenReturnGeneral=turnopunvenLogic.cargarCombosLoteForeignKeyTurnoPunVen(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalUsuario);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=turnopunvenReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=turnopunvenReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=turnopunvenReturnGeneral.getusuariosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTurnoPunVen()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyUsuario();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.turnopunvenSessionBean==null) {
				this.turnopunvenSessionBean=new TurnoPunVenSessionBean();
			}

			if(!this.turnopunvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.turnopunvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {

			if(!this.turnopunvenSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				Usuario usuario=new Usuario();
				UsuarioConstantesFunciones.setUsuarioDescripcion(usuario,Constantes.SMENSAJE_ESCOJA_OPCION);
				usuario.setId(null);

				if(!UsuarioConstantesFunciones.ExisteEnLista(this.usuariosForeignKey,usuario,true)) {

					this.usuariosForeignKey.add(0,usuario);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTurnoPunVen()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTurnoPunVen(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTurnoPunVen()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTurnoPunVen();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTurnoPunVen(TurnoPunVen turnopunven)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTurnoPunVen(TurnoPunVen turnopunven,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTurnoPunVen()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTurnoPunVen()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTurnoPunVen()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTurnoPunVen()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTurnoPunVen()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTurnoPunVen()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTurnoPunVen(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTurnoPunVen()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_empresaTurnoPunVen!=null && this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_empresaTurnoPunVen.getItemCount()>0) {
				this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_empresaTurnoPunVen.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_sucursalTurnoPunVen!=null && this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_sucursalTurnoPunVen.getItemCount()>0) {
				this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_sucursalTurnoPunVen.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_usuarioTurnoPunVen!=null && this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_usuarioTurnoPunVen.getItemCount()>0) {
				this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_usuarioTurnoPunVen.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public TurnoPunVenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TurnoPunVenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TurnoPunVenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.turnopunvenSessionBean=new TurnoPunVenSessionBean(); 
		this.turnopunvenConstantesFunciones=new TurnoPunVenConstantesFunciones(); 
		this.turnopunvenBean=new TurnoPunVen();//(this.turnopunvenConstantesFunciones); 		
		this.turnopunvenReturnGeneral=new TurnoPunVenParameterReturnGeneral(); 
		
		this.turnopunvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.turnopunvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TurnoPunVenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TurnoPunVenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TurnoPunVenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTurnoPunVen(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.turnopunvenConstantesFunciones=new TurnoPunVenConstantesFunciones(); 
			this.turnopunvenBean=new TurnoPunVen();//this.turnopunvenConstantesFunciones); 			
			this.turnopunvenReturnGeneral=new TurnoPunVenParameterReturnGeneral(); 
		
			TurnoPunVenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Turno Pun Ven Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.turnopunven=new TurnoPunVen();
			this.turnopunvens = new ArrayList<TurnoPunVen>();
			this.turnopunvensAux = new ArrayList<TurnoPunVen>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic=new TurnoPunVenLogic();
				this.turnopunvenLogic.getNewConnexionToDeep("");
			}
			
			//this.turnopunvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.turnopunvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTurnoPunVen);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTurnoPunVen!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTurnoPunVen);	
					}
					
					if(this.jInternalFrameImportacionTurnoPunVen!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTurnoPunVen);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTurnoPunVen!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTurnoPunVen);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTurnoPunVen);
				this.jInternalFrameDetalleFormTurnoPunVen.setVisible(false);
				this.jInternalFrameDetalleFormTurnoPunVen.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTurnoPunVen!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTurnoPunVen);
					this.jInternalFrameReporteDinamicoTurnoPunVen.setVisible(false);
					this.jInternalFrameReporteDinamicoTurnoPunVen.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTurnoPunVen!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTurnoPunVen);
					this.jInternalFrameImportacionTurnoPunVen.setVisible(false);
					this.jInternalFrameImportacionTurnoPunVen.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTurnoPunVen!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTurnoPunVen);
					this.jInternalFrameOrderByTurnoPunVen.setVisible(false);
					this.jInternalFrameOrderByTurnoPunVen.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTurnoPunVenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TurnoPunVenConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.turnopunvenReturnGeneral=new TurnoPunVenParameterReturnGeneral();
			
			this.turnopunvenParameterGeneral=new TurnoPunVenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.turnopunvenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(TurnoPunVenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CajaIngresoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CajeroTurnoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CajaEgresoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TurnoPunVenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.turnopunvenSessionBean.getEsGuardarRelacionado(),this.turnopunvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TurnoPunVenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.turnopunvenSessionBean.getEsGuardarRelacionado(),this.turnopunvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoTurnoPunVen=false;
			this.isVisibilidadCeldaDuplicarTurnoPunVen=true;
			this.isVisibilidadCeldaCopiarTurnoPunVen=true;
			this.isVisibilidadCeldaVerFormTurnoPunVen=true;
			this.isVisibilidadCeldaOrdenTurnoPunVen=true;
			this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen=false;
			this.isVisibilidadCeldaModificarTurnoPunVen=false;
			this.isVisibilidadCeldaActualizarTurnoPunVen=false;
			this.isVisibilidadCeldaEliminarTurnoPunVen=false;
			this.isVisibilidadCeldaCancelarTurnoPunVen=false;
			this.isVisibilidadCeldaGuardarTurnoPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosTurnoPunVen=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTurnoPunVen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTurnoPunVen();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTurnoPunVen(false);
			
			this.setPermisosUsuarioTurnoPunVen();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.turnopunvenSessionBean.getEsGuardarRelacionado() 
				|| (this.turnopunvenSessionBean.getEsGuardarRelacionado() && this.turnopunvenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTurnoPunVenClasesRelacionadas();
			}
			
			if(this.turnopunvenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTurnoPunVenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTurnoPunVen();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTurnoPunVen();
			}
			
			if(!this.isPermisoBusquedaTurnoPunVen) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTurnoPunVen.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTurnoPunVen,this.isPermisoPaginacionMedioTurnoPunVen,this.isPermisoPaginacionTodoTurnoPunVen);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TurnoPunVenConstantesFunciones.getTiposSeleccionarTurnoPunVen());
				
				this.tiposColumnasSelect=TurnoPunVenConstantesFunciones.getTiposSeleccionarTurnoPunVen(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTurnoPunVen();				
				//this.tiposRelacionesSelect=TurnoPunVenConstantesFunciones.getTiposRelacionesTurnoPunVen(true);
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTurnoPunVen();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTurnoPunVen(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTurnoPunVen(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTurnoPunVen() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			
			this.cajaingresoLogic=new CajaIngresoLogic();
			this.cajeroturnoLogic=new CajeroTurnoLogic();
			this.cajaegresoLogic=new CajaEgresoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.usuarioLogic=new UsuarioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				turnopunvenImplementable= (TurnoPunVenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TurnoPunVenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				turnopunvenImplementableHome= (TurnoPunVenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TurnoPunVenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.turnopunvens= new ArrayList<TurnoPunVen>();
			this.turnopunvensEliminados= new ArrayList<TurnoPunVen>();
						
			this.isEsNuevoTurnoPunVen=false;
			this.esParaAccionDesdeFormularioTurnoPunVen=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTurnoPunVen(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTurnoPunVen();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TurnoPunVenBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TurnoPunVenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTurnoPunVen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTurnoPunVen(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTurnoPunVen();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTurnoPunVen();
			}
			
			TurnoPunVenBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTurnoPunVen.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTurnoPunVen.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTurnoPunVen.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTurnoPunVen(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TurnoPunVen: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTurnoPunVen() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(CajaIngresoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CajaIngresoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CajeroTurnoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CajeroTurnoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CajaEgresoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CajaEgresoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTurnoPunVen")) {
				iIndex=this.jInternalFrameDetalleFormTurnoPunVen.jTabbedPaneRelacionesTurnoPunVen.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTurnoPunVen.jTabbedPaneRelacionesTurnoPunVen.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();	
				
				

				if(sTitle.equals("Caja Egresos")) {
					if(!CajaEgresoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTurnoPunVen();

						this.cargarParteTabPanelRelacionadaCajaEgreso(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Caja Ingresos")) {
					if(!CajaIngresoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTurnoPunVen();

						this.cargarParteTabPanelRelacionadaCajaIngreso(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Cajero Turnos")) {
					if(!CajeroTurnoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTurnoPunVen();

						this.cargarParteTabPanelRelacionadaCajeroTurno(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTurnoPunVen();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCajaEgreso(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTurnoPunVen.cargarSessionConBeanSwingJInternalFrameCajaEgreso(false,true,iIndex);
		this.jButtonCajaEgresoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCajaEgreso();

		//this.jTabbedPaneRelacionesTurnoPunVen.updateUI();
		//this.jTabbedPaneRelacionesTurnoPunVen.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTurnoPunVen.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCajaIngreso(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTurnoPunVen.cargarSessionConBeanSwingJInternalFrameCajaIngreso(false,true,iIndex);
		this.jButtonCajaIngresoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCajaIngreso();

		//this.jTabbedPaneRelacionesTurnoPunVen.updateUI();
		//this.jTabbedPaneRelacionesTurnoPunVen.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTurnoPunVen.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCajeroTurno(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTurnoPunVen.cargarSessionConBeanSwingJInternalFrameCajeroTurno(false,true,iIndex);
		this.jButtonCajeroTurnoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCajeroTurno();

		//this.jTabbedPaneRelacionesTurnoPunVen.updateUI();
		//this.jTabbedPaneRelacionesTurnoPunVen.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTurnoPunVen.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("CajaIngreso")) {
				int row=this.jTableDatosTurnoPunVen.getSelectedRow();
				jButtonCajaIngresoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("CajeroTurno")) {
				int row=this.jTableDatosTurnoPunVen.getSelectedRow();
				jButtonCajeroTurnoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("CajaEgreso")) {
				int row=this.jTableDatosTurnoPunVen.getSelectedRow();
				jButtonCajaEgresoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Caja Ingreso")) {

					if(this.isTienePermisosCajaIngreso && this.turnopunvenConstantesFunciones.mostrarCajaIngresoTurnoPunVen && !TurnoPunVenConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Caja Ingresos"+"("+CajaIngresoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Caja Ingresos");

						if(turnopunvenConstantesFunciones.resaltarCajaIngresoTurnoPunVen!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(turnopunvenConstantesFunciones.resaltarCajaIngresoTurnoPunVen);
						}

						jmenuItem.setEnabled(this.turnopunvenConstantesFunciones.activarCajaIngresoTurnoPunVen);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CajaIngreso"));

						

						this.jInternalFrameDetalleFormTurnoPunVen.jmenuDetalleTurnoPunVen.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Cajero Turno")) {

					if(this.isTienePermisosCajeroTurno && this.turnopunvenConstantesFunciones.mostrarCajeroTurnoTurnoPunVen && !TurnoPunVenConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cajero Turnos"+"("+CajeroTurnoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cajero Turnos");

						if(turnopunvenConstantesFunciones.resaltarCajeroTurnoTurnoPunVen!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(turnopunvenConstantesFunciones.resaltarCajeroTurnoTurnoPunVen);
						}

						jmenuItem.setEnabled(this.turnopunvenConstantesFunciones.activarCajeroTurnoTurnoPunVen);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CajeroTurno"));

						

						this.jInternalFrameDetalleFormTurnoPunVen.jmenuDetalleTurnoPunVen.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Caja Egreso")) {

					if(this.isTienePermisosCajaEgreso && this.turnopunvenConstantesFunciones.mostrarCajaEgresoTurnoPunVen && !TurnoPunVenConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Caja Egresos"+"("+CajaEgresoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Caja Egresos");

						if(turnopunvenConstantesFunciones.resaltarCajaEgresoTurnoPunVen!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(turnopunvenConstantesFunciones.resaltarCajaEgresoTurnoPunVen);
						}

						jmenuItem.setEnabled(this.turnopunvenConstantesFunciones.activarCajaEgresoTurnoPunVen);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CajaEgreso"));

						

						this.jInternalFrameDetalleFormTurnoPunVen.jmenuDetalleTurnoPunVen.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTurnoPunVen(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTurnoPunVen(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTurnoPunVen(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTurnoPunVenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTurnoPunVen();
		
		this.cargarCombosFrameForeignKeyTurnoPunVen();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTurnoPunVen();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTurnoPunVen();
		}
	}
	
	
	
	public void jButtonNuevoTurnoPunVenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.turnopunvenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTurnoPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
			
			
			if(jTableDatosTurnoPunVen.getRowCount()>=1) {
				jTableDatosTurnoPunVen.removeRowSelectionInterval(0, jTableDatosTurnoPunVen.getRowCount()-1);						
			}
			
			this.isEsNuevoTurnoPunVen=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTurnoPunVen(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTurnoPunVen(true);			
			//this.turnopunven=new TurnoPunVen();
			//this.turnopunven.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTurnoPunVen(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTurnoPunVen() ;
			
			if(TurnoPunVenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTurnoPunVen(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.turnopunven);	
			this.actualizarInformacion("INFO_PADRE",false,this.turnopunven);				
			
			TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
			
			if(this.turnopunvenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TurnoPunVen: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTurnoPunVenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TurnoPunVen> turnopunvensSeleccionados=new ArrayList<TurnoPunVen>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTurnoPunVen.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTurnoPunVen.getSelectedRows().length;			
			}
			
			turnopunvensSeleccionados=this.getTurnoPunVensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTurnoPunVen--;			
				//TurnoPunVen turnopunvenAux= new TurnoPunVen();			
				//turnopunvenAux.setId(this.iIdNuevoTurnoPunVen);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TurnoPunVen turnopunvenOrigen=new TurnoPunVen();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TurnoPunVen turnopunvenOrigen : turnopunvensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							turnopunvenOrigen =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							turnopunvenOrigen =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTurnoPunVen();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.turnopunven.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTurnoPunVen(turnopunvenOrigen,this.turnopunven,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.turnopunvenLogic.getTurnoPunVens().add(this.turnopunvenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.turnopunvens.add(this.turnopunvenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTurnoPunVen(false);
				
				this.jTableDatosTurnoPunVen.setRowSelectionInterval(this.getIndiceNuevoTurnoPunVen(), this.getIndiceNuevoTurnoPunVen());
				
				int iLastRow =  this.jTableDatosTurnoPunVen.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTurnoPunVen.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTurnoPunVen.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTurnoPunVen(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TurnoPunVen> turnopunvensSeleccionados=new ArrayList<TurnoPunVen>();									
		
			TurnoPunVen turnopunvenOrigen=new TurnoPunVen();
			TurnoPunVen turnopunvenDestino=new TurnoPunVen();
				
			turnopunvensSeleccionados=this.getTurnoPunVensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTurnoPunVen.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || turnopunvensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTurnoPunVen.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						turnopunvenOrigen =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						turnopunvenOrigen =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						turnopunvenDestino =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						turnopunvenDestino =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				turnopunvenOrigen =turnopunvensSeleccionados.get(0);
				turnopunvenDestino =turnopunvensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTurnoPunVen(turnopunvenOrigen,turnopunvenDestino,true,false);
				
				turnopunvenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(turnopunvenDestino,turnopunvenLogic.getTurnoPunVens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(turnopunvenDestino,turnopunvens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTurnoPunVen(false);
				
				//this.jTableDatosTurnoPunVen.setRowSelectionInterval(this.getIndiceNuevoTurnoPunVen(), this.getIndiceNuevoTurnoPunVen());
				
				int iLastRow =  this.jTableDatosTurnoPunVen.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTurnoPunVen.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTurnoPunVen.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTurnoPunVen(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTurnoPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTurnoPunVen.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTurnoPunVen.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTurnoPunVen.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTurnoPunVen.setVisible(!isVisible);
			this.jPanelPaginacionTurnoPunVen.setVisible(!isVisible);
			this.jPanelAccionesTurnoPunVen.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTurnoPunVen();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTurnoPunVen();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTurnoPunVen();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTurnoPunVen();
			
			this.abrirFrameOrderByTurnoPunVen();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTurnoPunVen();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTurnoPunVen(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTurnoPunVen);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTurnoPunVen.isMaximum()) {
					this.jInternalFrameDetalleFormTurnoPunVen.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTurnoPunVen.setSize(this.jInternalFrameDetalleFormTurnoPunVen.iWidthFormulario,this.jInternalFrameDetalleFormTurnoPunVen.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTurnoPunVen.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTurnoPunVen.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTurnoPunVen.isMaximum()) {
						this.jInternalFrameDetalleFormTurnoPunVen.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTurnoPunVen.jContentPaneDetalleTurnoPunVen.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTurnoPunVen.jTabbedPaneRelacionesTurnoPunVen.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTurnoPunVen.jContentPaneDetalleTurnoPunVen.getWidth(),TurnoPunVenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTurnoPunVen.jTabbedPaneRelacionesTurnoPunVen.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTurnoPunVen.jContentPaneDetalleTurnoPunVen.getWidth(),TurnoPunVenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTurnoPunVen.jTabbedPaneRelacionesTurnoPunVen.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTurnoPunVen.jContentPaneDetalleTurnoPunVen.getWidth(),TurnoPunVenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CajaEgresoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCajaEgreso();
					}

					if(CajaIngresoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCajaIngreso();
					}

					if(CajeroTurnoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCajeroTurno();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTurnoPunVen.setVisible(true);
	        this.jInternalFrameDetalleFormTurnoPunVen.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTurnoPunVen() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTurnoPunVen==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTurnoPunVen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTurnoPunVen,false,this);
				} else {
					this.jInternalFrameOrderByTurnoPunVen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTurnoPunVen,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTurnoPunVen);
				this.jInternalFrameOrderByTurnoPunVen.setVisible(false);
				this.jInternalFrameOrderByTurnoPunVen.setSelected(false);
				
				this.jInternalFrameOrderByTurnoPunVen.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTurnoPunVen"));
				
				this.inicializarActualizarBindingTablaOrderByTurnoPunVen();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTurnoPunVen() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTurnoPunVen==null) {
				
				this.jInternalFrameImportacionTurnoPunVen=new ImportacionJInternalFrame(TurnoPunVenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTurnoPunVen);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTurnoPunVen);
				this.jInternalFrameImportacionTurnoPunVen.setVisible(false);
				this.jInternalFrameImportacionTurnoPunVen.setSelected(false);


				this.jInternalFrameImportacionTurnoPunVen.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTurnoPunVen"));
				this.jInternalFrameImportacionTurnoPunVen.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTurnoPunVen"));
				this.jInternalFrameImportacionTurnoPunVen.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTurnoPunVen"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTurnoPunVen() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTurnoPunVen==null) {
				this.jInternalFrameReporteDinamicoTurnoPunVen=new ReporteDinamicoJInternalFrame(TurnoPunVenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTurnoPunVen);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTurnoPunVen);
				this.jInternalFrameReporteDinamicoTurnoPunVen.setVisible(false);
				this.jInternalFrameReporteDinamicoTurnoPunVen.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTurnoPunVen.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTurnoPunVen"));
				this.jInternalFrameReporteDinamicoTurnoPunVen.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTurnoPunVen"));
				this.jInternalFrameReporteDinamicoTurnoPunVen.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTurnoPunVen"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTurnoPunVen();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCajaEgreso() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jScrollPanelDatosCajaEgreso.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTurnoPunVen.jContentPaneDetalleTurnoPunVen.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jScrollPanelDatosCajaEgreso.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jScrollPanelDatosCajaEgreso.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.jScrollPanelDatosCajaEgreso.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCajaIngreso() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jScrollPanelDatosCajaIngreso.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTurnoPunVen.jContentPaneDetalleTurnoPunVen.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jScrollPanelDatosCajaIngreso.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jScrollPanelDatosCajaIngreso.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.jScrollPanelDatosCajaIngreso.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCajeroTurno() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.jScrollPanelDatosCajeroTurno.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTurnoPunVen.jContentPaneDetalleTurnoPunVen.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.jScrollPanelDatosCajeroTurno.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.jScrollPanelDatosCajeroTurno.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.jScrollPanelDatosCajeroTurno.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTurnoPunVen() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTurnoPunVen);
			
	       	this.jInternalFrameDetalleFormTurnoPunVen.setVisible(false);
	        this.jInternalFrameDetalleFormTurnoPunVen.setSelected(false);
			
			//this.jInternalFrameDetalleFormTurnoPunVen.dispose();
			//this.jInternalFrameDetalleFormTurnoPunVen=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTurnoPunVen() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTurnoPunVen.setVisible(true);
	        this.jInternalFrameReporteDinamicoTurnoPunVen.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTurnoPunVen() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTurnoPunVen.setVisible(true);
	        this.jInternalFrameImportacionTurnoPunVen.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTurnoPunVen() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTurnoPunVen.setVisible(true);
	        this.jInternalFrameOrderByTurnoPunVen.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTurnoPunVen() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTurnoPunVen.setVisible(false);
	        this.jInternalFrameOrderByTurnoPunVen.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTurnoPunVen() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTurnoPunVen.setVisible(false);
	        this.jInternalFrameReporteDinamicoTurnoPunVen.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTurnoPunVen() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTurnoPunVen.setVisible(false);
	        this.jInternalFrameImportacionTurnoPunVen.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTurnoPunVen(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTurnoPunVen(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTurnoPunVen(true);
			//this.isEsNuevoTurnoPunVen=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTurnoPunVen("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTurnoPunVen(false) ;
			
			if(turnopunvenSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoSessionBean.getEsGuardarRelacionado() && CajaIngresoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCajaIngresoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.getEsGuardarRelacionado() && CajeroTurnoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCajeroTurnoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoSessionBean.getEsGuardarRelacionado() && CajaEgresoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCajaEgresoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TurnoPunVenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTurnoPunVen(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTurnoPunVen(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTurnoPunVenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTurnoPunVen(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTurnoPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTurnoPunVen(true);
			//this.isEsNuevoTurnoPunVen=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.turnopunven.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTurnoPunVen("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTurnoPunVen(false) ;
			
			if(TurnoPunVenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTurnoPunVen(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTurnoPunVen(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	
	public void jButtonActualizarTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTurnoPunVen(false);
			
			//if(!this.isEsNuevoTurnoPunVen) {								
				int intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TurnoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTurnoPunVen(this.turnopunven,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
				
			}
			
			if(this.permiteMantenimiento(this.turnopunven)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTurnoPunVen=true;
					this.inicializarActualizarBindingTablaTurnoPunVen(false);
					this.isEsNuevoTurnoPunVen=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTurnoPunVen=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTurnoPunVen=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTurnoPunVen(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTurnoPunVen(false);
				
				this.habilitarDeshabilitarControlesTurnoPunVen(false);
			
												
				
				if(TurnoPunVenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTurnoPunVen();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTurnoPunVenActionPerformed(evt,turnopunvenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTurnoPunVen(this.turnopunven,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTurnoPunVen.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,turnopunvenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.turnopunven.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TurnoPunVen.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TurnoPunVen.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				this.turnopunven.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				this.turnopunven.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.turnopunven)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TurnoPunVenModel) this.jTableDatosTurnoPunVen.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTurnoPunVen=true;
				this.inicializarActualizarBindingTablaTurnoPunVen(false);
				this.isEsNuevoTurnoPunVen=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTurnoPunVen(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTurnoPunVen(false);
				
				this.habilitarDeshabilitarControlesTurnoPunVen(false);
				
				
				
				if(TurnoPunVenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTurnoPunVen();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTurnoPunVen.getRowCount()>=1) {
				jTableDatosTurnoPunVen.removeRowSelectionInterval(0, jTableDatosTurnoPunVen.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTurnoPunVen(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTurnoPunVen(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTurnoPunVen(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTurnoPunVen(false) ;
			
			this.isEsNuevoTurnoPunVen=false;
			
			if(TurnoPunVenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTurnoPunVen();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTurnoPunVen(false);
				
				//SI ES MANUAL
				if(TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTurnoPunVen();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTurnoPunVen--;			
			//TurnoPunVen turnopunvenAux= new TurnoPunVen();			
			//turnopunvenAux.setId(this.iIdNuevoTurnoPunVen);
			
			if(this.jInternalFrameDetalleFormTurnoPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTurnoPunVen();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
			
			this.turnopunven.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.turnopunvenLogic.getTurnoPunVens().add(this.turnopunvenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.turnopunvens.add(this.turnopunvenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTurnoPunVen(false);
			
			this.jTableDatosTurnoPunVen.setRowSelectionInterval(this.getIndiceNuevoTurnoPunVen(), this.getIndiceNuevoTurnoPunVen());
			
			int iLastRow =  this.jTableDatosTurnoPunVen.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTurnoPunVen.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTurnoPunVen.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTurnoPunVen(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTurnoPunVen(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTurnoPunVen(false);
			
			//SI ES MANUAL
			if(TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTurnoPunVen();
			}
			
			//this.abrirFrameTreeTurnoPunVen();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Turno Pun VenES ?", "MANTENIMIENTO DE Turno Pun Ven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTurnoPunVen.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTurnoPunVen();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.turnopunvenReturnGeneral=turnopunvenLogic.procesarImportacionTurnoPunVensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.turnopunvenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTurnoPunVenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTurnoPunVen.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTurnoPunVen.setFileImportacion(this.jInternalFrameImportacionTurnoPunVen.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTurnoPunVen.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTurnoPunVen.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTurnoPunVen.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTurnoPunVen.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TurnoPunVen> turnopunvensSeleccionados=new ArrayList<TurnoPunVen>();		

		turnopunvensSeleccionados=this.getTurnoPunVensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTurnoPunVen.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTurnoPunVen.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TurnoPunVenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TurnoPunVenBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteTurnoPunVens("Todos",turnopunvensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.turnopunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Turno Pun Ven",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoTurnoPunVen.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTurnoPunVen.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TurnoPunVenConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoPunVenConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoPunVenConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoPunVenConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoPunVenConstantesFunciones.LABEL_HORAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoPunVenConstantesFunciones.LABEL_HORAFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoTurnoPunVen.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTurnoPunVen.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTurnoPunVen.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TurnoPunVenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TurnoPunVenConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case TurnoPunVenConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case TurnoPunVenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TurnoPunVenConstantesFunciones.LABEL_HORAINICIO:
					sNombreCampoCategoria="hora_inicio";
					break;

				case TurnoPunVenConstantesFunciones.LABEL_HORAFIN:
					sNombreCampoCategoria="hora_fin";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTurnoPunVen.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TurnoPunVenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TurnoPunVenConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case TurnoPunVenConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case TurnoPunVenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TurnoPunVenConstantesFunciones.LABEL_HORAINICIO:
					sNombreCampoCategoriaValor="hora_inicio";
					break;

				case TurnoPunVenConstantesFunciones.LABEL_HORAFIN:
					sNombreCampoCategoriaValor="hora_fin";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTurnoPunVen.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTurnoPunVen.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TurnoPunVenConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TurnoPunVenConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case TurnoPunVenConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case TurnoPunVenConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TurnoPunVenConstantesFunciones.LABEL_HORAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_inicio");
					break;

				case TurnoPunVenConstantesFunciones.LABEL_HORAFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_fin");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TurnoPunVen> turnopunvensSeleccionados=new ArrayList<TurnoPunVen>();		
		
		turnopunvensSeleccionados=this.getTurnoPunVensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"turnopunven";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("TurnoPunVens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTurnoPunVen.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTurnoPunVen.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TurnoPunVenConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TurnoPunVen turnopunven:turnopunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turnopunven.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoPunVenConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(TurnoPunVen turnopunven:turnopunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turnopunven.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoPunVenConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(TurnoPunVen turnopunven:turnopunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turnopunven.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoPunVenConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TurnoPunVen turnopunven:turnopunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turnopunven.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoPunVenConstantesFunciones.LABEL_HORAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_HORAINICIO);
					iRow++;

					for(TurnoPunVen turnopunven:turnopunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turnopunven.gethora_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoPunVenConstantesFunciones.LABEL_HORAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_HORAFIN);
					iRow++;

					for(TurnoPunVen turnopunven:turnopunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turnopunven.gethora_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelTurnoPunVen(row);				
			//	iRow++;
			//}				
			
			//for(TurnoPunVen turnopunvenAux:turnopunvensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTurnoPunVen(turnopunvenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.turnopunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Turno Pun Ven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTurnoPunVen(false);
			
			//SI ES MANUAL
			if(TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTurnoPunVen();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTurnoPunVen(false);
			
			//SI ES MANUAL
			if(TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTurnoPunVen();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTurnoPunVen(false);
			
			//SI ES MANUAL
			if(TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTurnoPunVen();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTurnoPunVen() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTurnoPunVen.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTurnoPunVen.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTurnoPunVen.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTurnoPunVen.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTurnoPunVen.setMinimumSize(dimensionMinimum);
		this.jTableDatosTurnoPunVen.setMaximumSize(dimensionMaximum);
		this.jTableDatosTurnoPunVen.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTurnoPunVen(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTurnoPunVen(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTurnoPunVen(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTurnoPunVen(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTurnoPunVen(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTurnoPunVen(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTurnoPunVen(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTurnoPunVen(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TurnoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTurnoPunVen() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTurnoPunVen();
		
		this.inicializarActualizarBindingBotonesManualTurnoPunVen(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTurnoPunVen();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTurnoPunVen() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTurnoPunVen(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTurnoPunVen(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTurnoPunVen.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTurnoPunVen.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTurnoPunVen.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTurnoPunVen.jCheckBoxPostAccionNuevoTurnoPunVen.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTurnoPunVen.jCheckBoxPostAccionSinCerrarTurnoPunVen.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTurnoPunVen.jCheckBoxPostAccionSinMensajeTurnoPunVen.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTurnoPunVen.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTurnoPunVen.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTurnoPunVen.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
				this.jInternalFrameDetalleFormTurnoPunVen.jCheckBoxPostAccionNuevoTurnoPunVen.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTurnoPunVen.jCheckBoxPostAccionSinCerrarTurnoPunVen.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTurnoPunVen.jCheckBoxPostAccionSinMensajeTurnoPunVen.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTurnoPunVen.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTurnoPunVen.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxTiposAccionesFormularioTurnoPunVen.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTurnoPunVen.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTurnoPunVen!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTurnoPunVen.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTurnoPunVen.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTurnoPunVen.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTurnoPunVen.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTurnoPunVen.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTurnoPunVen!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTurnoPunVen.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTurnoPunVen.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTurnoPunVen.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTurnoPunVen(Boolean esInicializar) throws Exception {
		try	{	
			if(TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTurnoPunVen(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTurnoPunVen() throws Exception {
		try	{
			if(TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTurnoPunVen();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTurnoPunVen() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxTiposAccionesFormularioTurnoPunVen.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxTiposAccionesFormularioTurnoPunVen.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTurnoPunVen() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTurnoPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTurnoPunVen.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTurnoPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTurnoPunVen.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTurnoPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTurnoPunVen.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTurnoPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTurnoPunVen.addItem(reporte);
			}
			
			
			if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTurnoPunVen.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTurnoPunVen.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTurnoPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTurnoPunVen.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTurnoPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTurnoPunVen.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxTiposAccionesFormularioTurnoPunVen.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxTiposAccionesFormularioTurnoPunVen.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTurnoPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTurnoPunVen.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTurnoPunVen.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTurnoPunVen();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTurnoPunVen() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTurnoPunVen!=null) {
				this.jInternalFrameReporteDinamicoTurnoPunVen.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTurnoPunVen.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTurnoPunVen!=null) {
				this.jInternalFrameReporteDinamicoTurnoPunVen.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTurnoPunVen.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTurnoPunVen!=null) {
				
				if(this.jInternalFrameReporteDinamicoTurnoPunVen.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTurnoPunVen.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTurnoPunVen.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTurnoPunVen.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTurnoPunVen.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTurnoPunVen.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTurnoPunVen()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTurnoPunVen(Boolean esInicializar) throws Exception {				
		if(TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTurnoPunVen();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTurnoPunVen() throws Exception {
		this.inicializarActualizarBindingTablaTurnoPunVen(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTurnoPunVen() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTurnoPunVen.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTurnoPunVen.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTurnoPunVen.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TurnoPunVenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTurnoPunVen.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTurnoPunVen.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TurnoPunVenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTurnoPunVenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurnoPunVenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TurnoPunVenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTurnoPunVen.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTurnoPunVen.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TurnoPunVenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTurnoPunVen.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTurnoPunVen(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=turnopunvenLogic.getTurnoPunVens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=turnopunvens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TurnoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTurnoPunVen.setModel(new TurnoPunVenModel(this.turnopunvenLogic.getTurnoPunVens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTurnoPunVen.setModel(new TurnoPunVenModel(this.turnopunvens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTurnoPunVen!=null && this.jInternalFrameOrderByTurnoPunVen.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTurnoPunVen();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTurnoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurnoPunVen,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TurnoPunVenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO,turnopunvenConstantesFunciones.resaltarSeleccionarTurnoPunVen,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO,turnopunvenConstantesFunciones.resaltarSeleccionarTurnoPunVen,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTurnoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurnoPunVen,TurnoPunVenConstantesFunciones.LABEL_ID));

		if(this.turnopunvenConstantesFunciones.mostraridTurnoPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoPunVenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.turnopunvenConstantesFunciones.resaltaridTurnoPunVen,this.turnopunvenConstantesFunciones.activaridTurnoPunVen,this,true,"idTurnoPunVen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.turnopunvenConstantesFunciones.resaltaridTurnoPunVen,this.turnopunvenConstantesFunciones.activaridTurnoPunVen,this,true,"idTurnoPunVen","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurnoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurnoPunVen,TurnoPunVenConstantesFunciones.LABEL_IDEMPRESA));

		if(this.turnopunvenConstantesFunciones.mostrarid_empresaTurnoPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoPunVenConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.turnopunvenConstantesFunciones.resaltarid_empresaTurnoPunVen,this,this.turnopunvenConstantesFunciones.activarid_empresaTurnoPunVen));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.turnopunvenConstantesFunciones.resaltarid_empresaTurnoPunVen,this,this.turnopunvenConstantesFunciones.activarid_empresaTurnoPunVen,false,"id_empresaTurnoPunVen","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TurnoPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurnoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurnoPunVen,TurnoPunVenConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.turnopunvenConstantesFunciones.mostrarid_sucursalTurnoPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoPunVenConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.turnopunvenConstantesFunciones.resaltarid_sucursalTurnoPunVen,this,this.turnopunvenConstantesFunciones.activarid_sucursalTurnoPunVen));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.turnopunvenConstantesFunciones.resaltarid_sucursalTurnoPunVen,this,this.turnopunvenConstantesFunciones.activarid_sucursalTurnoPunVen,false,"id_sucursalTurnoPunVen","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TurnoPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurnoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurnoPunVen,TurnoPunVenConstantesFunciones.LABEL_IDUSUARIO));

		if(this.turnopunvenConstantesFunciones.mostrarid_usuarioTurnoPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoPunVenConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.turnopunvenConstantesFunciones.resaltarid_usuarioTurnoPunVen,this,this.turnopunvenConstantesFunciones.activarid_usuarioTurnoPunVen));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.turnopunvenConstantesFunciones.resaltarid_usuarioTurnoPunVen,this,this.turnopunvenConstantesFunciones.activarid_usuarioTurnoPunVen,false,"id_usuarioTurnoPunVen","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TurnoPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurnoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurnoPunVen,TurnoPunVenConstantesFunciones.LABEL_NOMBRE));

		if(this.turnopunvenConstantesFunciones.mostrarnombreTurnoPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoPunVenConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.turnopunvenConstantesFunciones.resaltarnombreTurnoPunVen,this.turnopunvenConstantesFunciones.activarnombreTurnoPunVen,this,true,"nombreTurnoPunVen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.turnopunvenConstantesFunciones.resaltarnombreTurnoPunVen,this.turnopunvenConstantesFunciones.activarnombreTurnoPunVen,this,true,"nombreTurnoPunVen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TurnoPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurnoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurnoPunVen,TurnoPunVenConstantesFunciones.LABEL_HORAINICIO));

		if(this.turnopunvenConstantesFunciones.mostrarhora_inicioTurnoPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoPunVenConstantesFunciones.LABEL_HORAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.turnopunvenConstantesFunciones.resaltarhora_inicioTurnoPunVen,this.turnopunvenConstantesFunciones.activarhora_inicioTurnoPunVen,this,true,"hora_inicioTurnoPunVen","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.turnopunvenConstantesFunciones.resaltarhora_inicioTurnoPunVen,this.turnopunvenConstantesFunciones.activarhora_inicioTurnoPunVen,this,true,"hora_inicioTurnoPunVen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TurnoPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurnoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurnoPunVen,TurnoPunVenConstantesFunciones.LABEL_HORAFIN));

		if(this.turnopunvenConstantesFunciones.mostrarhora_finTurnoPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoPunVenConstantesFunciones.LABEL_HORAFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.turnopunvenConstantesFunciones.resaltarhora_finTurnoPunVen,this.turnopunvenConstantesFunciones.activarhora_finTurnoPunVen,this,true,"hora_finTurnoPunVen","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.turnopunvenConstantesFunciones.resaltarhora_finTurnoPunVen,this.turnopunvenConstantesFunciones.activarhora_finTurnoPunVen,this,true,"hora_finTurnoPunVen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TurnoPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCajaIngreso && this.turnopunvenConstantesFunciones.mostrarCajaIngresoTurnoPunVen && !TurnoPunVenConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Caja Ingresos");
				tableColumn.setHeaderValue("Caja Ingresos");
				tableColumn.setCellRenderer(new CajaIngresoTableCell(turnopunvenConstantesFunciones.resaltarCajaIngresoTurnoPunVen,this,this.turnopunvenConstantesFunciones.activarCajaIngresoTurnoPunVen));
				tableColumn.setCellEditor(new CajaIngresoTableCell(turnopunvenConstantesFunciones.resaltarCajaIngresoTurnoPunVen,this,this.turnopunvenConstantesFunciones.activarCajaIngresoTurnoPunVen));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTurnoPunVen.addColumn(tableColumn);
			}

			if(this.isTienePermisosCajeroTurno && this.turnopunvenConstantesFunciones.mostrarCajeroTurnoTurnoPunVen && !TurnoPunVenConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cajero Turnos");
				tableColumn.setHeaderValue("Cajero Turnos");
				tableColumn.setCellRenderer(new CajeroTurnoTableCell(turnopunvenConstantesFunciones.resaltarCajeroTurnoTurnoPunVen,this,this.turnopunvenConstantesFunciones.activarCajeroTurnoTurnoPunVen));
				tableColumn.setCellEditor(new CajeroTurnoTableCell(turnopunvenConstantesFunciones.resaltarCajeroTurnoTurnoPunVen,this,this.turnopunvenConstantesFunciones.activarCajeroTurnoTurnoPunVen));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTurnoPunVen.addColumn(tableColumn);
			}

			if(this.isTienePermisosCajaEgreso && this.turnopunvenConstantesFunciones.mostrarCajaEgresoTurnoPunVen && !TurnoPunVenConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Caja Egresos");
				tableColumn.setHeaderValue("Caja Egresos");
				tableColumn.setCellRenderer(new CajaEgresoTableCell(turnopunvenConstantesFunciones.resaltarCajaEgresoTurnoPunVen,this,this.turnopunvenConstantesFunciones.activarCajaEgresoTurnoPunVen));
				tableColumn.setCellEditor(new CajaEgresoTableCell(turnopunvenConstantesFunciones.resaltarCajaEgresoTurnoPunVen,this,this.turnopunvenConstantesFunciones.activarCajaEgresoTurnoPunVen));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTurnoPunVen.addColumn(tableColumn);
			}
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.turnopunvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.turnopunvenSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTurnoPunVen.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.turnopunvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.turnopunvenSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTurnoPunVen.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTurnoPunVen && this.isPermisoGuardarCambiosTurnoPunVen) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.turnopunvenSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.turnopunvenSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTurnoPunVen.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.turnopunvenSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTurnoPunVen.addColumn(tableColumn);
				}
			}
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosTurnoPunVen.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTurnoPunVen && this.isPermisoGuardarCambiosTurnoPunVen) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.turnopunvenSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTurnoPunVen && this.isPermisoGuardarCambiosTurnoPunVen) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTurnoPunVen.moveColumn(this.jTableDatosTurnoPunVen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTurnoPunVen.moveColumn(this.jTableDatosTurnoPunVen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.turnopunvenSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTurnoPunVen.moveColumn(this.jTableDatosTurnoPunVen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTurnoPunVen.moveColumn(this.jTableDatosTurnoPunVen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTurnoPunVen.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTurnoPunVen.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTurnoPunVen,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TurnoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTurnoPunVen.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTurnoPunVen.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TurnoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TurnoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTurnoPunVen.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTurnoPunVen.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTurnoPunVen.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=turnopunvenLogic.getTurnoPunVens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=turnopunvens.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosTurnoPunVen.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTurnoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTurnoPunVen();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoTurnoPunVen=false;
					
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
			
				if(this.turnopunvenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTurnoPunVen==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTurnoPunVen.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTurnoPunVen.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.turnopunven.getsType().equals("DUPLICADO")
				   || this.turnopunven.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTurnoPunVen=true;
				
				} else {
					this.isEsNuevoTurnoPunVen=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
					if(this.turnopunven.getId()>=0 && !this.turnopunven.getIsNew()) {						
						this.isEsNuevoTurnoPunVen=false;
						
					} else {
						this.isEsNuevoTurnoPunVen=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTurnoPunVen(esRelaciones);						
				
				this.seleccionarTurnoPunVen(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.turnopunven.getId()<0) {
					this.isEsNuevoTurnoPunVen=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTurnoPunVen(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTurnoPunVen(evt,rowIndex);
				}	
				
				if(this.turnopunvenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TurnoPunVen: " + this.dDif); 
					}
				}								
				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTurnoPunVen(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.turnopunven)) {
					if(this.turnopunven.getId()>0) {
						this.turnopunven.setIsDeleted(true);
						
						this.turnopunvensEliminados.add(this.turnopunven);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.turnopunvenLogic.getTurnoPunVens().remove(this.turnopunven);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.turnopunvens.remove(this.turnopunven);				
					}
					
					
					((TurnoPunVenModel) this.jTableDatosTurnoPunVen.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTurnoPunVen(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTurnoPunVen(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTurnoPunVen) {
			
			if(this.jInternalFrameDetalleFormTurnoPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTurnoPunVen.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTurnoPunVen.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TurnoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTurnoPunVen(this.turnopunven);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.turnopunvenConstantesFunciones.cargarid_empresaTurnoPunVen || this.turnopunvenConstantesFunciones.event_dependid_empresaTurnoPunVen) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.turnopunven.getid_empresa());
									//this.inicializarActualizarBindingTurnoPunVen(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(turnopunven.getEmpresa()!=null) {
							this.empresasForeignKey.add(turnopunven.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.turnopunven.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.turnopunvenConstantesFunciones.cargarid_sucursalTurnoPunVen || this.turnopunvenConstantesFunciones.event_dependid_sucursalTurnoPunVen) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.turnopunven.getid_sucursal());
									//this.inicializarActualizarBindingTurnoPunVen(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(turnopunven.getSucursal()!=null) {
							this.sucursalsForeignKey.add(turnopunven.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.turnopunven.getid_sucursal(),false,"Formulario");

					//Usuario
					if(!this.turnopunvenConstantesFunciones.cargarid_usuarioTurnoPunVen || this.turnopunvenConstantesFunciones.event_dependid_usuarioTurnoPunVen) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.turnopunven.getid_usuario());
									//this.inicializarActualizarBindingTurnoPunVen(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(turnopunven.getUsuario()!=null) {
							this.usuariosForeignKey.add(turnopunven.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.turnopunven.getid_usuario(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTurnoPunVen("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTurnoPunVen(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTurnoPunVen() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTurnoPunVen(TurnoPunVen turnopunven) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTurnoPunVen(turnopunven,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTurnoPunVen(TurnoPunVen turnopunven,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTurnoPunVen(turnopunven);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTurnoPunVen(turnopunven,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTurnoPunVen(turnopunven);
	}
	
	public void setVariablesObjetoActualToFormularioTurnoPunVen(TurnoPunVen turnopunven) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTurnoPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTurnoPunVen.jLabelidTurnoPunVen.setText(turnopunven.getId().toString());
			this.jInternalFrameDetalleFormTurnoPunVen.jTextFieldnombreTurnoPunVen.setText(turnopunven.getnombre());
			this.jInternalFrameDetalleFormTurnoPunVen.jSpinnerhora_inicioTurnoPunVen.setValue(turnopunven.gethora_inicio());
			this.jInternalFrameDetalleFormTurnoPunVen.jSpinnerhora_finTurnoPunVen.setValue(turnopunven.gethora_fin());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TurnoPunVen turnopunvenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,turnopunvenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TurnoPunVen turnopunvenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				turnopunvenLocal=this.turnopunven;
			} else {
				turnopunvenLocal=this.turnopunvenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(turnopunvenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTurnoPunVen(turnopunvenLocal,true);
					
					if(turnopunvenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(turnopunvenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(turnopunvenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTurnoPunVen(TurnoPunVen turnopunven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTurnoPunVen(turnopunven,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(turnopunven);
	}
	
	public void setVariablesFormularioToObjetoActualTurnoPunVen(TurnoPunVen turnopunven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTurnoPunVen(turnopunven,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTurnoPunVen(TurnoPunVen turnopunven,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTurnoPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTurnoPunVen.jLabelidTurnoPunVen.getText()==null || this.jInternalFrameDetalleFormTurnoPunVen.jLabelidTurnoPunVen.getText()=="" || this.jInternalFrameDetalleFormTurnoPunVen.jLabelidTurnoPunVen.getText()=="Id") {
				this.jInternalFrameDetalleFormTurnoPunVen.jLabelidTurnoPunVen.setText("0");
			}

			if(conColumnasBase) {turnopunven.setId(Long.parseLong(this.jInternalFrameDetalleFormTurnoPunVen.jLabelidTurnoPunVen.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoPunVenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurnoPunVen.jLabelIdTurnoPunVen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turnopunven.setnombre(this.jInternalFrameDetalleFormTurnoPunVen.jTextFieldnombreTurnoPunVen.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoPunVenConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurnoPunVen.jLabelnombreTurnoPunVen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turnopunven.sethora_inicio(new Time(((Date)this.jInternalFrameDetalleFormTurnoPunVen.jSpinnerhora_inicioTurnoPunVen.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoPunVenConstantesFunciones.LABEL_HORAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurnoPunVen.jLabelhora_inicioTurnoPunVen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turnopunven.sethora_fin(new Time(((Date)this.jInternalFrameDetalleFormTurnoPunVen.jSpinnerhora_finTurnoPunVen.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoPunVenConstantesFunciones.LABEL_HORAFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurnoPunVen.jLabelhora_finTurnoPunVen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTurnoPunVen(TurnoPunVen turnopunvenBean,TurnoPunVen turnopunven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTurnoPunVen(TurnoPunVen turnopunvenOrigen,TurnoPunVen turnopunven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && turnopunvenOrigen.getId()!=null && !turnopunvenOrigen.getId().equals(0L))) {turnopunven.setId(turnopunvenOrigen.getId());}}
			if(conDefault || (!conDefault && turnopunvenOrigen.getnombre()!=null && !turnopunvenOrigen.getnombre().equals(""))) {turnopunven.setnombre(turnopunvenOrigen.getnombre());}
			if(conDefault || (!conDefault && turnopunvenOrigen.gethora_inicio()!=null && !turnopunvenOrigen.gethora_inicio().equals(new Time((new Date()).getTime())))) {turnopunven.sethora_inicio(turnopunvenOrigen.gethora_inicio());}
			if(conDefault || (!conDefault && turnopunvenOrigen.gethora_fin()!=null && !turnopunvenOrigen.gethora_fin().equals(new Time((new Date()).getTime())))) {turnopunven.sethora_fin(turnopunvenOrigen.gethora_fin());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTurnoPunVen(TurnoPunVen turnopunven) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTurnoPunVen.jLabelidTurnoPunVen.setText(turnopunven.getId().toString());
			this.jInternalFrameDetalleFormTurnoPunVen.jTextFieldnombreTurnoPunVen.setText(turnopunven.getnombre());
			this.jInternalFrameDetalleFormTurnoPunVen.jSpinnerhora_inicioTurnoPunVen.setValue(turnopunven.gethora_inicio());
			this.jInternalFrameDetalleFormTurnoPunVen.jSpinnerhora_finTurnoPunVen.setValue(turnopunven.gethora_fin());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTurnoPunVen(TurnoPunVenBean turnopunvenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTurnoPunVen.jLabelidTurnoPunVen.setText(turnopunvenBean.getId().toString());
			this.jInternalFrameDetalleFormTurnoPunVen.jTextFieldnombreTurnoPunVen.setText(turnopunvenBean.getnombre());
			this.jInternalFrameDetalleFormTurnoPunVen.jSpinnerhora_inicioTurnoPunVen.setValue(turnopunvenBean.gethora_inicio());
			this.jInternalFrameDetalleFormTurnoPunVen.jSpinnerhora_finTurnoPunVen.setValue(turnopunvenBean.gethora_fin());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTurnoPunVen(TurnoPunVenParameterReturnGeneral turnopunvenReturnGeneral,TurnoPunVenBean turnopunvenBean,Boolean conDefault) throws Exception { 
		try {
			TurnoPunVen turnopunvenLocal=new TurnoPunVen();
			
			turnopunvenLocal=turnopunvenReturnGeneral.getTurnoPunVen();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && turnopunvenLocal.getId()!=null && !turnopunvenLocal.getId().equals(0L))) {turnopunvenBean.setId(turnopunvenLocal.getId());}}
			if(conDefault || (!conDefault && turnopunvenLocal.getnombre()!=null && !turnopunvenLocal.getnombre().equals(""))) {turnopunvenBean.setnombre(turnopunvenLocal.getnombre());}
			if(conDefault || (!conDefault && turnopunvenLocal.gethora_inicio()!=null && !turnopunvenLocal.gethora_inicio().equals(new Time((new Date()).getTime())))) {turnopunvenBean.sethora_inicio(turnopunvenLocal.gethora_inicio());}
			if(conDefault || (!conDefault && turnopunvenLocal.gethora_fin()!=null && !turnopunvenLocal.gethora_fin().equals(new Time((new Date()).getTime())))) {turnopunvenBean.sethora_fin(turnopunvenLocal.gethora_fin());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTurnoPunVenGenerico(Long idTurnoPunVenSeleccionado,JComboBox jComboBoxTurnoPunVen,List<TurnoPunVen> turnopunvensLocal)throws Exception {
		try {
			TurnoPunVen  turnopunvenTemp=null;

			for(TurnoPunVen turnopunvenAux:turnopunvensLocal) {
				if(turnopunvenAux.getId()!=null && turnopunvenAux.getId().equals(idTurnoPunVenSeleccionado)) {
					turnopunvenTemp=turnopunvenAux;
					break;
				}
			}

			jComboBoxTurnoPunVen.setSelectedItem(turnopunvenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTurnoPunVenGenerico(JComboBox jComboBoxTurnoPunVen,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxTurnoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTurnoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTurnoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTurnoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTurnoPunVen.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTurnoPunVen.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTurnoPunVen.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTurnoPunVen.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTurnoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTurnoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		if(sTipo.equals("CajaIngreso")) {
			jButtonCajaIngresoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("CajeroTurno")) {
			jButtonCajeroTurnoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("CajaEgreso")) {
			jButtonCajaEgresoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			turnopunven=(TurnoPunVen) turnopunvenLogic.getTurnoPunVens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			turnopunven =(TurnoPunVen) turnopunvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!turnopunven.getIsNew() && !turnopunven.getIsChanged() && !turnopunven.getIsDeleted()) {
				sDescripcion=turnopunven.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=turnopunven.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!turnopunven.getIsNew() && !turnopunven.getIsChanged() && !turnopunven.getIsDeleted()) {
				sDescripcion=turnopunven.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=turnopunven.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!turnopunven.getIsNew() && !turnopunven.getIsChanged() && !turnopunven.getIsDeleted()) {
				sDescripcion=turnopunven.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=turnopunven.getusuario_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TurnoPunVen turnopunvenRow=new TurnoPunVen();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			turnopunvenRow=(TurnoPunVen) turnopunvenLogic.getTurnoPunVens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			turnopunvenRow=(TurnoPunVen) turnopunvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCajaIngresoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TurnoPunVen turnopunven) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTurnoPunVen==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turnopunven = (TurnoPunVen)this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.turnopunven = (TurnoPunVen)this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(turnopunven!=null) {
						this.turnopunven = turnopunven;
					} else {
						this.turnopunven = new TurnoPunVen();
					}
				}

				if(this.isTienePermisosCajaIngreso && this.permiteMantenimiento(this.turnopunven)) {
					CajaIngresoBeanSwingJInternalFrame cajaingresoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFramePopup=new CajaIngresoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cajaingresoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFramePopup;
					} else {
						cajaingresoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame;
					}

					List<TurnoPunVen> turnopunvens=new ArrayList<TurnoPunVen>();
					turnopunvens.add(this.turnopunven);
					if(!esRelacionado) {
						//cajaingresoBeanSwingJInternalFrame.cajaingresoSessionBean.setConGuardarRelaciones(false);
						//cajaingresoBeanSwingJInternalFrame.cajaingresoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cajaingresoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTurnoPunVen.cargarCajaIngresoBeanSwingJInternalFrame(turnopunvens,this.turnopunven,cajaingresoBeanSwingJInternalFrame,/*conInicializar,*/cajaingresoBeanSwingJInternalFrame.cajaingresoSessionBean.getConGuardarRelaciones(),cajaingresoBeanSwingJInternalFrame.cajaingresoSessionBean.getEsGuardarRelacionado());
					cajaingresoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cajaingresoBeanSwingJInternalFrame.actualizarEstadoPanelsCajaIngreso("no_relacionado");

						cajaingresoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CajaIngresoConstantesFunciones.ITAMANIOFILATABLA + (CajaIngresoConstantesFunciones.ITAMANIOFILATABLA/2));

						cajaingresoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTurnoPunVen=(TitledBorder)this.jScrollPanelDatosTurnoPunVen.getBorder();
						TitledBorder titledBorderCajaIngreso=(TitledBorder)cajaingresoBeanSwingJInternalFrame.jScrollPanelDatosCajaIngreso.getBorder();

						titledBorderCajaIngreso.setTitle(titledBorderTurnoPunVen.getTitle() + " -> Caja Ingreso");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cajaingresoBeanSwingJInternalFrame);
						}

						cajaingresoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cajaingresoBeanSwingJInternalFrame);

						cajaingresoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.turnopunvenSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Caja Ingreso",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCajeroTurnoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TurnoPunVen turnopunven) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTurnoPunVen==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turnopunven = (TurnoPunVen)this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.turnopunven = (TurnoPunVen)this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(turnopunven!=null) {
						this.turnopunven = turnopunven;
					} else {
						this.turnopunven = new TurnoPunVen();
					}
				}

				if(this.isTienePermisosCajeroTurno && this.permiteMantenimiento(this.turnopunven)) {
					CajeroTurnoBeanSwingJInternalFrame cajeroturnoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFramePopup=new CajeroTurnoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cajeroturnoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFramePopup;
					} else {
						cajeroturnoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame;
					}

					List<TurnoPunVen> turnopunvens=new ArrayList<TurnoPunVen>();
					turnopunvens.add(this.turnopunven);
					if(!esRelacionado) {
						//cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.setConGuardarRelaciones(false);
						//cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cajeroturnoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTurnoPunVen.cargarCajeroTurnoBeanSwingJInternalFrame(turnopunvens,this.turnopunven,cajeroturnoBeanSwingJInternalFrame,/*conInicializar,*/cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.getConGuardarRelaciones(),cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.getEsGuardarRelacionado());
					cajeroturnoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cajeroturnoBeanSwingJInternalFrame.actualizarEstadoPanelsCajeroTurno("no_relacionado");

						cajeroturnoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CajeroTurnoConstantesFunciones.ITAMANIOFILATABLA + (CajeroTurnoConstantesFunciones.ITAMANIOFILATABLA/2));

						cajeroturnoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTurnoPunVen=(TitledBorder)this.jScrollPanelDatosTurnoPunVen.getBorder();
						TitledBorder titledBorderCajeroTurno=(TitledBorder)cajeroturnoBeanSwingJInternalFrame.jScrollPanelDatosCajeroTurno.getBorder();

						titledBorderCajeroTurno.setTitle(titledBorderTurnoPunVen.getTitle() + " -> Cajero Turno");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cajeroturnoBeanSwingJInternalFrame);
						}

						cajeroturnoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cajeroturnoBeanSwingJInternalFrame);

						cajeroturnoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.turnopunvenSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cajero Turno",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCajaEgresoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TurnoPunVen turnopunven) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTurnoPunVen==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turnopunven = (TurnoPunVen)this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.turnopunven = (TurnoPunVen)this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(turnopunven!=null) {
						this.turnopunven = turnopunven;
					} else {
						this.turnopunven = new TurnoPunVen();
					}
				}

				if(this.isTienePermisosCajaEgreso && this.permiteMantenimiento(this.turnopunven)) {
					CajaEgresoBeanSwingJInternalFrame cajaegresoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFramePopup=new CajaEgresoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cajaegresoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFramePopup;
					} else {
						cajaegresoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame;
					}

					List<TurnoPunVen> turnopunvens=new ArrayList<TurnoPunVen>();
					turnopunvens.add(this.turnopunven);
					if(!esRelacionado) {
						//cajaegresoBeanSwingJInternalFrame.cajaegresoSessionBean.setConGuardarRelaciones(false);
						//cajaegresoBeanSwingJInternalFrame.cajaegresoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cajaegresoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTurnoPunVen.cargarCajaEgresoBeanSwingJInternalFrame(turnopunvens,this.turnopunven,cajaegresoBeanSwingJInternalFrame,/*conInicializar,*/cajaegresoBeanSwingJInternalFrame.cajaegresoSessionBean.getConGuardarRelaciones(),cajaegresoBeanSwingJInternalFrame.cajaegresoSessionBean.getEsGuardarRelacionado());
					cajaegresoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cajaegresoBeanSwingJInternalFrame.actualizarEstadoPanelsCajaEgreso("no_relacionado");

						cajaegresoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CajaEgresoConstantesFunciones.ITAMANIOFILATABLA + (CajaEgresoConstantesFunciones.ITAMANIOFILATABLA/2));

						cajaegresoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTurnoPunVen=(TitledBorder)this.jScrollPanelDatosTurnoPunVen.getBorder();
						TitledBorder titledBorderCajaEgreso=(TitledBorder)cajaegresoBeanSwingJInternalFrame.jScrollPanelDatosCajaEgreso.getBorder();

						titledBorderCajaEgreso.setTitle(titledBorderTurnoPunVen.getTitle() + " -> Caja Egreso");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cajaegresoBeanSwingJInternalFrame);
						}

						cajaegresoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cajaegresoBeanSwingJInternalFrame);

						cajaegresoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.turnopunvenSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Caja Egreso",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTurnoPunVen(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTurnoPunVen.setVisible((this.isVisibilidadCeldaNuevoTurnoPunVen && this.isPermisoNuevoTurnoPunVen));			
			this.jButtonDuplicarTurnoPunVen.setVisible((this.isVisibilidadCeldaDuplicarTurnoPunVen && this.isPermisoDuplicarTurnoPunVen));			
			this.jButtonCopiarTurnoPunVen.setVisible((this.isVisibilidadCeldaCopiarTurnoPunVen && this.isPermisoCopiarTurnoPunVen));
			this.jButtonVerFormTurnoPunVen.setVisible((this.isVisibilidadCeldaVerFormTurnoPunVen && this.isPermisoVerFormTurnoPunVen));
			
			this.jButtonAbrirOrderByTurnoPunVen.setVisible((this.isVisibilidadCeldaOrdenTurnoPunVen && this.isPermisoOrdenTurnoPunVen));			
			
			this.jButtonNuevoRelacionesTurnoPunVen.setVisible((this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen && this.isPermisoNuevoTurnoPunVen));			
			this.jButtonNuevoGuardarCambiosTurnoPunVen.setVisible((this.isVisibilidadCeldaNuevoTurnoPunVen && this.isPermisoNuevoTurnoPunVen && this.isPermisoGuardarCambiosTurnoPunVen));
			
			if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonModificarTurnoPunVen.setVisible((this.isVisibilidadCeldaModificarTurnoPunVen && this.isPermisoActualizarTurnoPunVen));	
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonActualizarTurnoPunVen.setVisible((this.isVisibilidadCeldaActualizarTurnoPunVen && this.isPermisoActualizarTurnoPunVen));	
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonEliminarTurnoPunVen.setVisible((this.isVisibilidadCeldaEliminarTurnoPunVen && this.isPermisoEliminarTurnoPunVen));
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonCancelarTurnoPunVen.setVisible(this.isVisibilidadCeldaCancelarTurnoPunVen);							
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonGuardarCambiosTurnoPunVen.setVisible((this.isVisibilidadCeldaGuardarTurnoPunVen && this.isPermisoGuardarCambiosTurnoPunVen));			
			
			}
						
			this.jButtonGuardarCambiosTablaTurnoPunVen.setVisible((this.isVisibilidadCeldaGuardarCambiosTurnoPunVen && this.isPermisoGuardarCambiosTurnoPunVen));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTurnoPunVen.setVisible((this.isVisibilidadCeldaNuevoTurnoPunVen && this.isPermisoNuevoTurnoPunVen));						
			this.jButtonDuplicarToolBarTurnoPunVen.setVisible((this.isVisibilidadCeldaDuplicarTurnoPunVen && this.isPermisoDuplicarTurnoPunVen));						
			this.jButtonCopiarToolBarTurnoPunVen.setVisible((this.isVisibilidadCeldaCopiarTurnoPunVen && this.isPermisoCopiarTurnoPunVen));			
			this.jButtonVerFormToolBarTurnoPunVen.setVisible((this.isVisibilidadCeldaVerFormTurnoPunVen && this.isPermisoVerFormTurnoPunVen));			
			this.jButtonAbrirOrderByToolBarTurnoPunVen.setVisible((this.isVisibilidadCeldaOrdenTurnoPunVen && this.isPermisoOrdenTurnoPunVen));
			this.jButtonNuevoRelacionesToolBarTurnoPunVen.setVisible((this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen && this.isPermisoNuevoTurnoPunVen));			
			this.jButtonNuevoGuardarCambiosToolBarTurnoPunVen.setVisible((this.isVisibilidadCeldaNuevoTurnoPunVen && this.isPermisoNuevoTurnoPunVen && this.isPermisoGuardarCambiosTurnoPunVen));			
			
			if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonModificarToolBarTurnoPunVen.setVisible((this.isVisibilidadCeldaModificarTurnoPunVen && this.isPermisoActualizarTurnoPunVen));	
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonActualizarToolBarTurnoPunVen.setVisible((this.isVisibilidadCeldaActualizarTurnoPunVen  && this.isPermisoActualizarTurnoPunVen));	
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonEliminarToolBarTurnoPunVen.setVisible((this.isVisibilidadCeldaEliminarTurnoPunVen && this.isPermisoEliminarTurnoPunVen));
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonCancelarToolBarTurnoPunVen.setVisible(this.isVisibilidadCeldaCancelarTurnoPunVen);				
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonGuardarCambiosToolBarTurnoPunVen.setVisible((this.isVisibilidadCeldaGuardarTurnoPunVen && this.isPermisoGuardarCambiosTurnoPunVen));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTurnoPunVen.setVisible((this.isVisibilidadCeldaGuardarCambiosTurnoPunVen && this.isPermisoGuardarCambiosTurnoPunVen));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTurnoPunVen.setVisible((this.isVisibilidadCeldaNuevoTurnoPunVen && this.isPermisoNuevoTurnoPunVen));			
			this.jMenuItemDuplicarTurnoPunVen.setVisible((this.isVisibilidadCeldaDuplicarTurnoPunVen && this.isPermisoDuplicarTurnoPunVen));			
			this.jMenuItemCopiarTurnoPunVen.setVisible((this.isVisibilidadCeldaCopiarTurnoPunVen && this.isPermisoCopiarTurnoPunVen));			
			this.jMenuItemVerFormTurnoPunVen.setVisible((this.isVisibilidadCeldaVerFormTurnoPunVen && this.isPermisoVerFormTurnoPunVen));			
			this.jMenuItemAbrirOrderByTurnoPunVen.setVisible((this.isVisibilidadCeldaOrdenTurnoPunVen && this.isPermisoOrdenTurnoPunVen));			
			//this.jMenuItemMostrarOcultarTurnoPunVen.setVisible((this.isVisibilidadCeldaOrdenTurnoPunVen && this.isPermisoOrdenTurnoPunVen));
			this.jMenuItemDetalleAbrirOrderByTurnoPunVen.setVisible((this.isVisibilidadCeldaOrdenTurnoPunVen && this.isPermisoOrdenTurnoPunVen));			
			//this.jMenuItemDetalleMostrarOcultarTurnoPunVen.setVisible((this.isVisibilidadCeldaOrdenTurnoPunVen && this.isPermisoOrdenTurnoPunVen));			
			this.jMenuItemNuevoRelacionesTurnoPunVen.setVisible((this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen && this.isPermisoNuevoTurnoPunVen));			
			this.jMenuItemNuevoGuardarCambiosTurnoPunVen.setVisible((this.isVisibilidadCeldaNuevoTurnoPunVen && this.isPermisoNuevoTurnoPunVen && this.isPermisoGuardarCambiosTurnoPunVen));									
			
			if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
			this.jInternalFrameDetalleFormTurnoPunVen.jMenuItemModificarTurnoPunVen.setVisible((this.isVisibilidadCeldaModificarTurnoPunVen && this.isPermisoActualizarTurnoPunVen));	
			this.jInternalFrameDetalleFormTurnoPunVen.jMenuItemActualizarTurnoPunVen.setVisible((this.isVisibilidadCeldaActualizarTurnoPunVen && this.isPermisoActualizarTurnoPunVen));	
			this.jInternalFrameDetalleFormTurnoPunVen.jMenuItemEliminarTurnoPunVen.setVisible((this.isVisibilidadCeldaEliminarTurnoPunVen && this.isPermisoEliminarTurnoPunVen));
			this.jInternalFrameDetalleFormTurnoPunVen.jMenuItemCancelarTurnoPunVen.setVisible(this.isVisibilidadCeldaCancelarTurnoPunVen);				
			}
			
			this.jMenuItemGuardarCambiosTurnoPunVen.setVisible((this.isVisibilidadCeldaGuardarTurnoPunVen && this.isPermisoGuardarCambiosTurnoPunVen));						
			this.jMenuItemGuardarCambiosTablaTurnoPunVen.setVisible((this.isVisibilidadCeldaGuardarCambiosTurnoPunVen && this.isPermisoGuardarCambiosTurnoPunVen));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTurnoPunVen=this.jButtonNuevoTurnoPunVen.isVisible();
			this.isVisibilidadCeldaDuplicarTurnoPunVen=this.jButtonDuplicarTurnoPunVen.isVisible();
			this.isVisibilidadCeldaCopiarTurnoPunVen=this.jButtonCopiarTurnoPunVen.isVisible();
			this.isVisibilidadCeldaVerFormTurnoPunVen=this.jButtonVerFormTurnoPunVen.isVisible();
			
			this.isVisibilidadCeldaOrdenTurnoPunVen=this.jButtonAbrirOrderByTurnoPunVen.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen=this.jButtonNuevoRelacionesTurnoPunVen.isVisible();
			this.isVisibilidadCeldaModificarTurnoPunVen=this.jButtonModificarTurnoPunVen.isVisible();
			
			if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
			this.isVisibilidadCeldaActualizarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jButtonActualizarTurnoPunVen.isVisible();
			this.isVisibilidadCeldaEliminarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jButtonEliminarTurnoPunVen.isVisible();
			this.isVisibilidadCeldaCancelarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jButtonCancelarTurnoPunVen.isVisible();
			this.isVisibilidadCeldaGuardarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jButtonGuardarCambiosTurnoPunVen.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTurnoPunVen=this.jButtonGuardarCambiosTablaTurnoPunVen.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTurnoPunVen=this.jButtonNuevoToolBarTurnoPunVen.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen=this.jButtonNuevoRelacionesToolBarTurnoPunVen.isVisible();
			
			if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
			this.isVisibilidadCeldaModificarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jButtonModificarToolBarTurnoPunVen.isVisible();
			this.isVisibilidadCeldaActualizarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jButtonActualizarToolBarTurnoPunVen.isVisible();
			this.isVisibilidadCeldaEliminarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jButtonEliminarToolBarTurnoPunVen.isVisible();
			this.isVisibilidadCeldaCancelarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jButtonCancelarToolBarTurnoPunVen.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTurnoPunVen=this.jButtonGuardarCambiosToolBarTurnoPunVen.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTurnoPunVen=this.jButtonGuardarCambiosTablaToolBarTurnoPunVen.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTurnoPunVen=this.jMenuItemNuevoTurnoPunVen.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen=this.jMenuItemNuevoRelacionesTurnoPunVen.isVisible();
			
			if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
			this.isVisibilidadCeldaModificarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jMenuItemModificarTurnoPunVen.isVisible();
			this.isVisibilidadCeldaActualizarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jMenuItemActualizarTurnoPunVen.isVisible();
			this.isVisibilidadCeldaEliminarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jMenuItemEliminarTurnoPunVen.isVisible();
			this.isVisibilidadCeldaCancelarTurnoPunVen=this.jInternalFrameDetalleFormTurnoPunVen.jMenuItemCancelarTurnoPunVen.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTurnoPunVen=this.jMenuItemGuardarCambiosTurnoPunVen.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTurnoPunVen=this.jMenuItemGuardarCambiosTablaTurnoPunVen.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTurnoPunVen(Boolean esInicializar) {
		if(TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.turnopunvenSessionBean.getConGuardarRelaciones()) {
				//if(this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTurnoPunVen();
			}
			
			this.inicializarActualizarBindingBotonesManualTurnoPunVen(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTurnoPunVen() {
		this.jButtonNuevoTurnoPunVen.setVisible(this.isPermisoNuevoTurnoPunVen);			
		this.jButtonDuplicarTurnoPunVen.setVisible(this.isPermisoDuplicarTurnoPunVen);			
		this.jButtonCopiarTurnoPunVen.setVisible(this.isPermisoCopiarTurnoPunVen);			
		this.jButtonVerFormTurnoPunVen.setVisible(this.isPermisoVerFormTurnoPunVen);			
		
		this.jButtonAbrirOrderByTurnoPunVen.setVisible(this.isPermisoOrdenTurnoPunVen);					
		
		this.jButtonNuevoRelacionesTurnoPunVen.setVisible(this.isPermisoNuevoTurnoPunVen);			
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonModificarTurnoPunVen.setVisible(this.isPermisoActualizarTurnoPunVen);	
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonActualizarTurnoPunVen.setVisible(this.isPermisoActualizarTurnoPunVen);	
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonEliminarTurnoPunVen.setVisible(this.isPermisoEliminarTurnoPunVen);
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonCancelarTurnoPunVen.setVisible(this.isVisibilidadCeldaCancelarTurnoPunVen);						
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonGuardarCambiosTurnoPunVen.setVisible(this.isPermisoGuardarCambiosTurnoPunVen);							
		}
		
		this.jButtonGuardarCambiosTablaTurnoPunVen.setVisible(this.isPermisoActualizarTurnoPunVen);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTurnoPunVen() {
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonModificarTurnoPunVen.setVisible(this.isPermisoActualizarTurnoPunVen);	
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonActualizarTurnoPunVen.setVisible(this.isPermisoActualizarTurnoPunVen);	
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonEliminarTurnoPunVen.setVisible(this.isPermisoEliminarTurnoPunVen);
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonCancelarTurnoPunVen.setVisible(this.isVisibilidadCeldaCancelarTurnoPunVen);							
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonGuardarCambiosTurnoPunVen.setVisible((this.isVisibilidadCeldaGuardarTurnoPunVen && this.isPermisoGuardarCambiosTurnoPunVen));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTurnoPunVen() {
		if(TurnoPunVenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTurnoPunVen();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTurnoPunVen() {
	}
	
	public void jTableDatosTurnoPunVenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTurnoPunVen(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTurnoPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurnoPunVen(this.getturnopunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turnopunven==null) {
						this.turnopunven = new TurnoPunVen();
					}

					this.setVariablesFormularioToObjetoActualTurnoPunVen(this.turnopunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
				}

				if(this.turnopunven.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.turnopunven.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurnoPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTurnoPunVenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTurnoPunVen(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTurnoPunVen.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTurnoPunVen.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTurnoPunVen(this.getturnopunven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.turnopunvenLogic.getConnexion());

				if(this.turnopunven.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.turnopunven.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTurnoPunVen=(TitledBorder)this.jScrollPanelDatosTurnoPunVen.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTurnoPunVen.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTurnoPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurnoPunVen(this.getturnopunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turnopunven==null) {
						this.turnopunven = new TurnoPunVen();
					}

					this.setVariablesFormularioToObjetoActualTurnoPunVen(this.turnopunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
				}

				if(this.turnopunven.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.turnopunven.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurnoPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalTurnoPunVenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebTurnoPunVen(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTurnoPunVen.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTurnoPunVen.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTurnoPunVen(this.getturnopunven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.turnopunvenLogic.getConnexion());

				if(this.turnopunven.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.turnopunven.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTurnoPunVen=(TitledBorder)this.jScrollPanelDatosTurnoPunVen.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderTurnoPunVen.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalTurnoPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurnoPunVen(this.getturnopunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turnopunven==null) {
						this.turnopunven = new TurnoPunVen();
					}

					this.setVariablesFormularioToObjetoActualTurnoPunVen(this.turnopunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
				}

				if(this.turnopunven.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.turnopunven.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurnoPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioTurnoPunVenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebTurnoPunVen(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTurnoPunVen.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTurnoPunVen.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTurnoPunVen(this.getturnopunven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.turnopunvenLogic.getConnexion());

				if(this.turnopunven.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.turnopunven.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTurnoPunVen=(TitledBorder)this.jScrollPanelDatosTurnoPunVen.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderTurnoPunVen.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioTurnoPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurnoPunVen(this.getturnopunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turnopunven==null) {
						this.turnopunven = new TurnoPunVen();
					}

					this.setVariablesFormularioToObjetoActualTurnoPunVen(this.turnopunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
				}

				if(this.turnopunven.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.turnopunven.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurnoPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTurnoPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurnoPunVen(this.getturnopunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turnopunven==null) {
						this.turnopunven = new TurnoPunVen();
					}

					this.setVariablesFormularioToObjetoActualTurnoPunVen(this.turnopunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
				}

				if(this.turnopunven.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.turnopunven.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurnoPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_inicioTurnoPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurnoPunVen(this.getturnopunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turnopunven==null) {
						this.turnopunven = new TurnoPunVen();
					}

					this.setVariablesFormularioToObjetoActualTurnoPunVen(this.turnopunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
				}

				if(this.turnopunven.gethora_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_inicio = "+this.turnopunven.gethora_inicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurnoPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_finTurnoPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurnoPunVen(this.getturnopunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turnopunven==null) {
						this.turnopunven = new TurnoPunVen();
					}

					this.setVariablesFormularioToObjetoActualTurnoPunVen(this.turnopunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);
				}

				if(this.turnopunven.gethora_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_fin = "+this.turnopunven.gethora_fin().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurnoPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTurnoPunVen(false,false);

			this.getTurnoPunVensFK_IdEmpresa();

			this.inicializarActualizarBindingTurnoPunVen(false);

			//if(TurnoPunVenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTurnoPunVen(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTurnoPunVen(false,false);

			this.getTurnoPunVensFK_IdSucursal();

			this.inicializarActualizarBindingTurnoPunVen(false);

			//if(TurnoPunVenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTurnoPunVen(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioTurnoPunVenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTurnoPunVen(false,false);

			this.getTurnoPunVensFK_IdUsuario();

			this.inicializarActualizarBindingTurnoPunVen(false);

			//if(TurnoPunVenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTurnoPunVen(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnopunvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTurnoPunVen() {
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
		

		if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
			this.jInternalFrameDetalleFormTurnoPunVen.setVisible(false);	    			
			this.jInternalFrameDetalleFormTurnoPunVen.dispose();
			this.jInternalFrameDetalleFormTurnoPunVen=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTurnoPunVen!=null) {
			this.jInternalFrameReporteDinamicoTurnoPunVen.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTurnoPunVen.dispose();
			this.jInternalFrameReporteDinamicoTurnoPunVen=null;
		}
		
		if(this.jInternalFrameImportacionTurnoPunVen!=null) {
			this.jInternalFrameImportacionTurnoPunVen.setVisible(false);	    			
			this.jInternalFrameImportacionTurnoPunVen.dispose();
			this.jInternalFrameImportacionTurnoPunVen=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTurnoPunVen();
			
			TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
			
			
			if(sTipo.equals("NuevoTurnoPunVen")) {
				jButtonNuevoTurnoPunVenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTurnoPunVen")) {
				jButtonDuplicarTurnoPunVenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTurnoPunVen")) {
				jButtonCopiarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("VerFormTurnoPunVen")) {
				jButtonVerFormTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTurnoPunVen")) {
				jButtonNuevoTurnoPunVenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTurnoPunVen")) {
				jButtonDuplicarTurnoPunVenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTurnoPunVen")) {
				jButtonNuevoTurnoPunVenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTurnoPunVen")) {
				jButtonDuplicarTurnoPunVenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTurnoPunVen")) {
				jButtonNuevoTurnoPunVenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTurnoPunVen")) {
				jButtonNuevoTurnoPunVenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTurnoPunVen")) {
				jButtonNuevoTurnoPunVenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTurnoPunVen")) {
				jButtonModificarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTurnoPunVen")) {
				jButtonModificarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTurnoPunVen")) {
				jButtonModificarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTurnoPunVen")) {
				jButtonActualizarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTurnoPunVen")) {
				jButtonActualizarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTurnoPunVen")) {
				jButtonActualizarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("EliminarTurnoPunVen")) {
				jButtonEliminarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTurnoPunVen")) {
				jButtonEliminarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTurnoPunVen")) {
				jButtonEliminarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("CancelarTurnoPunVen")) {
				jButtonCancelarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTurnoPunVen")) {
				jButtonCancelarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTurnoPunVen")) {
				jButtonCancelarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("CerrarTurnoPunVen")) {
				jButtonCerrarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTurnoPunVen")) {
				jButtonCerrarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTurnoPunVen")) {
				jButtonCerrarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTurnoPunVen")) {
				jButtonMostrarOcultarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTurnoPunVen")) {
				jButtonCancelarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTurnoPunVen")) {
				jButtonGuardarCambiosTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTurnoPunVen")) {
				jButtonGuardarCambiosTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTurnoPunVen")) {
				jButtonCopiarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTurnoPunVen")) {
				jButtonVerFormTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTurnoPunVen")) {
				jButtonGuardarCambiosTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTurnoPunVen")) {
				jButtonCopiarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTurnoPunVen")) {
				jButtonVerFormTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTurnoPunVen")) {
				jButtonGuardarCambiosTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTurnoPunVen")) {
				jButtonGuardarCambiosTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTurnoPunVen")) {
				jButtonGuardarCambiosTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTurnoPunVen")) {
				jButtonRecargarInformacionTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTurnoPunVen")) {
				jButtonRecargarInformacionTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTurnoPunVen")) {
				jButtonRecargarInformacionTurnoPunVenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTurnoPunVen")) {
				jButtonAnterioresTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTurnoPunVen")) {
				jButtonAnterioresTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTurnoPunVen")) {
				jButtonAnterioresTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTurnoPunVen")) {
				jButtonSiguientesTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTurnoPunVen")) {
				jButtonSiguientesTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTurnoPunVen")) {
				jButtonSiguientesTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTurnoPunVen") || sTipo.equals("MenuItemDetalleAbrirOrderByTurnoPunVen")) {
				jButtonAbrirOrderByTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTurnoPunVen") || sTipo.equals("MenuItemDetalleMostrarOcultarTurnoPunVen")) {
				jButtonMostrarOcultarTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTurnoPunVen")) {
				jButtonNuevoGuardarCambiosTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTurnoPunVen")) {
				jButtonNuevoGuardarCambiosTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTurnoPunVen")) {
				jButtonNuevoGuardarCambiosTurnoPunVenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTurnoPunVen")) {
				jButtonCerrarReporteDinamicoTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTurnoPunVen")) {
				jButtonGenerarReporteDinamicoTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTurnoPunVen")) {
				
				jButtonGenerarExcelReporteDinamicoTurnoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTurnoPunVen")) {
				jButtonCerrarImportacionTurnoPunVenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTurnoPunVen")) {
				
				jButtonGenerarImportacionTurnoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTurnoPunVen")) {
				
				jButtonAbrirImportacionTurnoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTurnoPunVen")) {
				jComboBoxTiposAccionesTurnoPunVenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTurnoPunVen")) {
				jComboBoxTiposRelacionesTurnoPunVenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTurnoPunVen")) {
				jComboBoxTiposAccionesTurnoPunVenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTurnoPunVen")) {
				
				jComboBoxTiposSeleccionarTurnoPunVenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTurnoPunVen")) {
				jTextFieldValorCampoGeneralTurnoPunVenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTurnoPunVen")) {
				jButtonAbrirOrderByTurnoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTurnoPunVen")) {
				jButtonAbrirOrderByTurnoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTurnoPunVen")) {
				jButtonCerrarOrderByTurnoPunVenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTurnoPunVenBusqueda")) {
				this.jButtonidTurnoPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTurnoPunVenUpdate")) {
				this.jButtonid_empresaTurnoPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTurnoPunVenBusqueda")) {
				this.jButtonid_empresaTurnoPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTurnoPunVenUpdate")) {
				this.jButtonid_sucursalTurnoPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTurnoPunVenBusqueda")) {
				this.jButtonid_sucursalTurnoPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioTurnoPunVenUpdate")) {
				this.jButtonid_usuarioTurnoPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioTurnoPunVenBusqueda")) {
				this.jButtonid_usuarioTurnoPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTurnoPunVenBusqueda")) {
				this.jButtonnombreTurnoPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_inicioTurnoPunVenBusqueda")) {
				this.jButtonhora_inicioTurnoPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_finTurnoPunVenBusqueda")) {
				this.jButtonhora_finTurnoPunVenBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTurnoPunVen();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTurnoPunVenActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turnopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turnopunven);
				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
				
				


				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TurnoPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TurnoPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TurnoPunVen turnopunvenLocal=null;
			
			if(!this.getEsControlTabla()) {
				turnopunvenLocal=this.turnopunven;
			} else {
				turnopunvenLocal=this.turnopunvenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turnopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turnopunven);
				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
							
				
				


				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TurnoPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TurnoPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTurnoPunVenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenAnterior =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.turnopunvenAnterior =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTurnoPunVenActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turnopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turnopunven);
				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
								
						
				


				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TurnoPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TurnoPunVen.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turnopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turnopunven);
				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
								
				
				


				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TurnoPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TurnoPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTurnoPunVenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenAnterior =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.turnopunvenAnterior =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turnopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turnopunven);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTurnoPunVenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenAnterior =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.turnopunvenAnterior =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTurnoPunVenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.turnopunven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.turnopunven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turnopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turnopunven);
				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
							
				
				


				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TurnoPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TurnoPunVen.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTurnoPunVenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turnopunvenAnterior =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.turnopunvenAnterior =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTurnoPunVenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.turnopunven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.turnopunven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turnopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turnopunven);
				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
								
				
				


				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TurnoPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TurnoPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTurnoPunVenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenAnterior =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.turnopunvenAnterior =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTurnoPunVenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.turnopunven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.turnopunven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTurnoPunVenActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turnopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turnopunven);
				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTurnoPunVen")) {
					jCheckBoxSeleccionarTodosTurnoPunVenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTurnoPunVen")) {
					jCheckBoxSeleccionadosTurnoPunVenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTurnoPunVen")) {
					
				}
				
				


				
				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TurnoPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TurnoPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.turnopunven);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.turnopunven);
				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
												
				
				


				
				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TurnoPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TurnoPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTurnoPunVenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turnopunvenAnterior =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.turnopunvenAnterior =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTurnoPunVenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turnopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turnopunven);
				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
				
				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTurnoPunVenActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turnopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turnopunven);
				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TurnoPunVen.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TurnoPunVen.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turnopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turnopunven);
				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TurnoPunVen.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TurnoPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTurnoPunVenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnopunvenAnterior =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.turnopunvenAnterior =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTurnoPunVen")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTurnoPunVenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTurnoPunVen.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.turnopunven =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.turnopunven =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.turnopunven);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTurnoPunVen")) {
				
				}
				
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTurnoPunVen")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTurnoPunVen.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTurnoPunVen")) {
			
			}
			
			TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTurnoPunVen();
			
			TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
			
			if(sTipo.equals("NuevoTurnoPunVen")) {
				jButtonNuevoTurnoPunVenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTurnoPunVen")) {
				jButtonDuplicarTurnoPunVenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTurnoPunVen")) {
				jButtonCopiarTurnoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTurnoPunVen")) {
				jButtonVerFormTurnoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTurnoPunVen")) {
				jButtonNuevoTurnoPunVenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTurnoPunVen")) {
				jButtonModificarTurnoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTurnoPunVen")) {
				jButtonActualizarTurnoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTurnoPunVen")) {
				jButtonEliminarTurnoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTurnoPunVen")) {
				jButtonGuardarCambiosTurnoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTurnoPunVen")) {
				jButtonCancelarTurnoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTurnoPunVen")) {
				jButtonCerrarTurnoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTurnoPunVen")) {
				jButtonGuardarCambiosTurnoPunVenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTurnoPunVen")) {
				jButtonNuevoGuardarCambiosTurnoPunVenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTurnoPunVen")) {
				jButtonAbrirOrderByTurnoPunVenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTurnoPunVen")) {
				jButtonRecargarInformacionTurnoPunVenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTurnoPunVen")) {
				jButtonAnterioresTurnoPunVenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTurnoPunVen")) {
				jButtonSiguientesTurnoPunVenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTurnoPunVenBusqueda")) {
				this.jButtonidTurnoPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTurnoPunVenUpdate")) {
				this.jButtonid_empresaTurnoPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTurnoPunVenBusqueda")) {
				this.jButtonid_empresaTurnoPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTurnoPunVenUpdate")) {
				this.jButtonid_sucursalTurnoPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTurnoPunVenBusqueda")) {
				this.jButtonid_sucursalTurnoPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioTurnoPunVenUpdate")) {
				this.jButtonid_usuarioTurnoPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioTurnoPunVenBusqueda")) {
				this.jButtonid_usuarioTurnoPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTurnoPunVenBusqueda")) {
				this.jButtonnombreTurnoPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_inicioTurnoPunVenBusqueda")) {
				this.jButtonhora_inicioTurnoPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_finTurnoPunVenBusqueda")) {
				this.jButtonhora_finTurnoPunVenBusquedaActionPerformed(evt);
			}
			
			TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTurnoPunVen();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTurnoPunVen")) {
				closingInternalFrameTurnoPunVen();
				
			} else if(sTipo.equals("jButtonCancelarTurnoPunVen")) {
				JInternalFrameBase jInternalFrameDetalleFormTurnoPunVen = (JInternalFrameBase)evt.getSource();
	            	
	            TurnoPunVenBeanSwingJInternalFrame jInternalFrameParent=(TurnoPunVenBeanSwingJInternalFrame)jInternalFrameDetalleFormTurnoPunVen.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTurnoPunVenActionPerformed(null);
			}
			
			TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.turnopunven,new Object(),this.turnopunvenParameterGeneral,this.turnopunvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTurnoPunVen(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTurnoPunVen(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTurnoPunVen(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.turnopunven)) {
			if(!esControlTabla) {
				if(TurnoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTurnoPunVen(this.turnopunven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);			
				}
				
				if(this.turnopunvenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTurnoPunVen(this.turnopunven,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.turnopunvenReturnGeneral=turnopunvenLogic.procesarEventosTurnoPunVensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.turnopunvenLogic.getTurnoPunVens(),this.turnopunven,this.turnopunvenParameterGeneral,this.isEsNuevoTurnoPunVen,classes);//this.turnopunvenLogic.getTurnoPunVen()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTurnoPunVen(this.turnopunvenReturnGeneral,this.turnopunvenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.turnopunvenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTurnoPunVen(classes,this.turnopunvenReturnGeneral,this.turnopunvenBean,false);
					}
						
					if(this.turnopunvenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTurnoPunVen(this.turnopunvenReturnGeneral.getTurnoPunVen());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTurnoPunVen(this.turnopunvenReturnGeneral.getTurnoPunVen());	
					}
						
					if(this.turnopunvenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTurnoPunVen(this.turnopunvenReturnGeneral.getTurnoPunVen(),classes);//this.turnopunvenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTurnoPunVen(this.turnopunven,classes);//this.turnopunvenBean);									
				}
			
				if(TurnoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTurnoPunVen(this.turnopunven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTurnoPunVen(this.turnopunven);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.turnopunvenAnterior!=null) {
						this.turnopunven=this.turnopunvenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.turnopunvenReturnGeneral=turnopunvenLogic.procesarEventosTurnoPunVensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.turnopunvenLogic.getTurnoPunVens(),this.turnopunven,this.turnopunvenParameterGeneral,this.isEsNuevoTurnoPunVen,classes);//this.turnopunvenLogic.getTurnoPunVen()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.turnopunvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.turnopunvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.turnopunvenReturnGeneral.getTurnoPunVen(),turnopunvenLogic.getTurnoPunVens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.turnopunvenReturnGeneral.getTurnoPunVen(),this.turnopunvens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTurnoPunVen.repaint();
				
				//((AbstractTableModel) this.jTableDatosTurnoPunVen.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTurnoPunVen();
			}
		}
	}
	
	public void actualizarVisualTableDatosTurnoPunVen() throws Exception {
		
		TurnoPunVenModel turnopunvenModel=(TurnoPunVenModel)this.jTableDatosTurnoPunVen.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			turnopunvenModel.turnopunvens=this.turnopunvenLogic.getTurnoPunVens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			turnopunvenModel.turnopunvens=this.turnopunvens;
		}
		
		
		((TurnoPunVenModel) this.jTableDatosTurnoPunVen.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTurnoPunVen() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getturnopunvenAnterior(),this.turnopunvenLogic.getTurnoPunVens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getturnopunvenAnterior(),this.turnopunvens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTurnoPunVen();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTurnoPunVen(TurnoPunVen turnopunven,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CajaIngreso.class)) {
					this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoLogic.setCajaIngresos(turnopunven.getCajaIngresos());
					this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaIngreso(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CajeroTurno.class)) {
					this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.setCajeroTurnos(turnopunven.getCajeroTurnos());
					this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajeroTurno(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CajaEgreso.class)) {
					this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoLogic.setCajaEgresos(turnopunven.getCajaEgresos());
					this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaEgreso(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.turnopunven,new Object(),generalEntityParameterGeneral,this.turnopunvenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.turnopunvenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TurnoPunVenConstantesFunciones.getClassesRelationshipsOfTurnoPunVen(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TurnoPunVenConstantesFunciones.getClassesRelationshipsFromStringsOfTurnoPunVen(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTurnoPunVen(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TurnoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.turnopunven,new Object(),generalEntityParameterGeneral,this.turnopunvenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTurnoPunVen(TurnoPunVenBean turnopunvenBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CajaIngreso.class)) {
					this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoLogic.setCajaIngresos(turnopunven.getCajaIngresos());
					this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaIngreso(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CajeroTurno.class)) {
					this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.setCajeroTurnos(turnopunven.getCajeroTurnos());
					this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajeroTurno(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CajaEgreso.class)) {
					this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoLogic.setCajaEgresos(turnopunven.getCajaEgresos());
					this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaEgreso(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTurnoPunVen(ArrayList<Classe> classes,TurnoPunVenReturnGeneral turnopunvenReturnGeneral,TurnoPunVenBean turnopunvenBean,Boolean conDefault) throws Exception {
		
			this.turnopunvenBean.setCajaIngresos(turnopunvenReturnGeneral.getTurnoPunVen().getCajaIngresos());
			this.turnopunvenBean.setCajeroTurnos(turnopunvenReturnGeneral.getTurnoPunVen().getCajeroTurnos());
			this.turnopunvenBean.setCajaEgresos(turnopunvenReturnGeneral.getTurnoPunVen().getCajaEgresos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTurnoPunVen(TurnoPunVen turnopunven,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(CajaIngreso.class)) {
					turnopunven.setCajaIngresos(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoBeanSwingJInternalFrame.cajaingresoLogic.getCajaIngresos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CajeroTurno.class)) {
					turnopunven.setCajeroTurnos(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoBeanSwingJInternalFrame.cajeroturnoLogic.getCajeroTurnos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CajaEgreso.class)) {
					turnopunven.setCajaEgresos(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoBeanSwingJInternalFrame.cajaegresoLogic.getCajaEgresos());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.turnopunven)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTurnoPunVen = new TurnoPunVenDetalleFormJInternalFrame(jDesktopPane,this.turnopunvenSessionBean.getConGuardarRelaciones(),this.turnopunvenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTurnoPunVen);
		this.jInternalFrameDetalleFormTurnoPunVen.setVisible(false);
		this.jInternalFrameDetalleFormTurnoPunVen.setSelected(false);						
		
		this.jInternalFrameDetalleFormTurnoPunVen.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTurnoPunVen.turnopunvenLogic=this.turnopunvenLogic;
		
		this.cargarCombosFrameForeignKeyTurnoPunVen("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTurnoPunVen();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTurnoPunVen();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTurnoPunVen("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTurnoPunVen();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTurnoPunVen.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTurnoPunVen"));
		
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonModificarTurnoPunVen.addActionListener(new ButtonActionListener(this,"ModificarTurnoPunVen"));

		
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonModificarToolBarTurnoPunVen.addActionListener(new ButtonActionListener(this,"ModificarToolBarTurnoPunVen"));
					
		this.jInternalFrameDetalleFormTurnoPunVen.jMenuItemModificarTurnoPunVen.addActionListener(new ButtonActionListener(this,"MenuItemModificarTurnoPunVen"));		
		
		
		
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonActualizarTurnoPunVen.addActionListener (new ButtonActionListener(this,"ActualizarTurnoPunVen"));
		
		
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonActualizarToolBarTurnoPunVen.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTurnoPunVen"));
						
		this.jInternalFrameDetalleFormTurnoPunVen.jMenuItemActualizarTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTurnoPunVen"));		
		
		
		
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonEliminarTurnoPunVen.addActionListener (new ButtonActionListener(this,"EliminarTurnoPunVen"));
		
		
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonEliminarToolBarTurnoPunVen.addActionListener (new ButtonActionListener(this,"EliminarToolBarTurnoPunVen"));
								
		this.jInternalFrameDetalleFormTurnoPunVen.jMenuItemEliminarTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTurnoPunVen"));		
		
		
		
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonCancelarTurnoPunVen.addActionListener (new ButtonActionListener(this,"CancelarTurnoPunVen"));
		
		
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonCancelarToolBarTurnoPunVen.addActionListener (new ButtonActionListener(this,"CancelarToolBarTurnoPunVen"));
					
		this.jInternalFrameDetalleFormTurnoPunVen.jMenuItemCancelarTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTurnoPunVen"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTurnoPunVen.jMenuItemDetalleCerrarTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTurnoPunVen"));		
		
		
		
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonGuardarCambiosToolBarTurnoPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTurnoPunVen"));
		
		
		
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonGuardarCambiosToolBarTurnoPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTurnoPunVen"));
		
		
		
		this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxTiposAccionesFormularioTurnoPunVen.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTurnoPunVen"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonidTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"idTurnoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonid_empresaTurnoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTurnoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonid_empresaTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTurnoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonid_sucursalTurnoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTurnoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonid_sucursalTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTurnoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonid_usuarioTurnoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioTurnoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonid_usuarioTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioTurnoPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonnombreTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTurnoPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonhora_inicioTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"hora_inicioTurnoPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonhora_finTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"hora_finTurnoPunVenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTurnoPunVen.jTabbedPaneRelacionesTurnoPunVen.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTurnoPunVen"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTurnoPunVen"));
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurnoPunVen.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTurnoPunVen"));
		}
		
		this.jTableDatosTurnoPunVen.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTurnoPunVen"));
		
		this.jTableDatosTurnoPunVen.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTurnoPunVen"));
		
		this.jButtonNuevoTurnoPunVen.addActionListener(new ButtonActionListener(this,"NuevoTurnoPunVen"));
		
		this.jButtonDuplicarTurnoPunVen.addActionListener(new ButtonActionListener(this,"DuplicarTurnoPunVen"));
		
		this.jButtonCopiarTurnoPunVen.addActionListener(new ButtonActionListener(this,"CopiarTurnoPunVen"));
		
		this.jButtonVerFormTurnoPunVen.addActionListener(new ButtonActionListener(this,"VerFormTurnoPunVen"));
		
		
		this.jButtonNuevoToolBarTurnoPunVen.addActionListener(new ButtonActionListener(this,"NuevoToolBarTurnoPunVen"));
			
		this.jButtonDuplicarToolBarTurnoPunVen.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTurnoPunVen"));
			
		this.jMenuItemNuevoTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTurnoPunVen"));
			
		this.jMenuItemDuplicarTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTurnoPunVen"));		
		
		
		this.jButtonNuevoRelacionesTurnoPunVen.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTurnoPunVen"));
		
		
		this.jButtonNuevoRelacionesToolBarTurnoPunVen.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTurnoPunVen"));
			
		this.jMenuItemNuevoRelacionesTurnoPunVen.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTurnoPunVen"));		
		
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonModificarTurnoPunVen.addActionListener(new ButtonActionListener(this,"ModificarTurnoPunVen"));
		}
		
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonModificarToolBarTurnoPunVen.addActionListener(new ButtonActionListener(this,"ModificarToolBarTurnoPunVen"));
			
			this.jInternalFrameDetalleFormTurnoPunVen.jMenuItemModificarTurnoPunVen.addActionListener(new ButtonActionListener(this,"MenuItemModificarTurnoPunVen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonActualizarTurnoPunVen.addActionListener (new ButtonActionListener(this,"ActualizarTurnoPunVen"));
		}
		
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonActualizarToolBarTurnoPunVen.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTurnoPunVen"));
				
			this.jInternalFrameDetalleFormTurnoPunVen.jMenuItemActualizarTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTurnoPunVen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonEliminarTurnoPunVen.addActionListener (new ButtonActionListener(this,"EliminarTurnoPunVen"));
		}
		
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonEliminarToolBarTurnoPunVen.addActionListener (new ButtonActionListener(this,"EliminarToolBarTurnoPunVen"));
						
			this.jInternalFrameDetalleFormTurnoPunVen.jMenuItemEliminarTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTurnoPunVen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonCancelarTurnoPunVen.addActionListener (new ButtonActionListener(this,"CancelarTurnoPunVen"));
		}
		
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonCancelarToolBarTurnoPunVen.addActionListener (new ButtonActionListener(this,"CancelarToolBarTurnoPunVen"));
			
			this.jInternalFrameDetalleFormTurnoPunVen.jMenuItemCancelarTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTurnoPunVen"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTurnoPunVen.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTurnoPunVen"));		
		
		
		this.jButtonCerrarTurnoPunVen.addActionListener (new ButtonActionListener(this,"CerrarTurnoPunVen"));
		
		
		this.jButtonCerrarToolBarTurnoPunVen.addActionListener (new ButtonActionListener(this,"CerrarToolBarTurnoPunVen"));
			
		this.jMenuItemCerrarTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTurnoPunVen"));
			
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurnoPunVen.jMenuItemDetalleCerrarTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTurnoPunVen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonGuardarCambiosTurnoPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTurnoPunVen"));
		}
		
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurnoPunVen.jButtonGuardarCambiosToolBarTurnoPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTurnoPunVen"));
		}
		
		this.jButtonCopiarToolBarTurnoPunVen.addActionListener (new ButtonActionListener(this,"CopiarToolBarTurnoPunVen"));
			
		this.jButtonVerFormToolBarTurnoPunVen.addActionListener (new ButtonActionListener(this,"VerFormToolBarTurnoPunVen"));
		
		this.jMenuItemGuardarCambiosTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTurnoPunVen"));
			
		this.jMenuItemCopiarTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTurnoPunVen"));		
		
		this.jMenuItemVerFormTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTurnoPunVen"));		
		
		
		this.jButtonGuardarCambiosTablaTurnoPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTurnoPunVen"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTurnoPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTurnoPunVen"));
			
		this.jMenuItemGuardarCambiosTablaTurnoPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTurnoPunVen"));		
		
		
		
		this.jButtonRecargarInformacionTurnoPunVen.addActionListener (new ButtonActionListener(this,"RecargarInformacionTurnoPunVen"));
					
		this.jButtonRecargarInformacionToolBarTurnoPunVen.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTurnoPunVen"));
		
		this.jMenuItemRecargarInformacionTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTurnoPunVen"));		
		
		
		
		this.jButtonAnterioresTurnoPunVen.addActionListener (new ButtonActionListener(this,"AnterioresTurnoPunVen"));
		
		
		this.jButtonAnterioresToolBarTurnoPunVen.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTurnoPunVen"));
		
		this.jMenuItemAnterioresTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTurnoPunVen"));		
		
		
		this.jButtonSiguientesTurnoPunVen.addActionListener (new ButtonActionListener(this,"SiguientesTurnoPunVen"));
		
		
		this.jButtonSiguientesToolBarTurnoPunVen.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTurnoPunVen"));
			
		this.jMenuItemSiguientesTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTurnoPunVen"));
			
		this.jMenuItemAbrirOrderByTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTurnoPunVen"));
			
		this.jMenuItemMostrarOcultarTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTurnoPunVen"));
			
		this.jMenuItemDetalleAbrirOrderByTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTurnoPunVen"));
			
		this.jMenuItemDetalleMostarOcultarTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTurnoPunVen"));		
		
		
		this.jButtonNuevoGuardarCambiosTurnoPunVen.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTurnoPunVen"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTurnoPunVen.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTurnoPunVen"));
			
		this.jMenuItemNuevoGuardarCambiosTurnoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTurnoPunVen"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTurnoPunVen.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTurnoPunVen"));

		this.jCheckBoxSeleccionadosTurnoPunVen.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTurnoPunVen"));
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxTiposAccionesFormularioTurnoPunVen.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTurnoPunVen"));
		}
		
		
		this.jComboBoxTiposRelacionesTurnoPunVen.addActionListener (new ButtonActionListener(this,"TiposRelacionesTurnoPunVen"));
			
		this.jComboBoxTiposAccionesTurnoPunVen.addActionListener (new ButtonActionListener(this,"TiposAccionesTurnoPunVen"));
					
		this.jComboBoxTiposSeleccionarTurnoPunVen.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTurnoPunVen"));
			
		this.jTextFieldValorCampoGeneralTurnoPunVen.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTurnoPunVen"));		
		
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonidTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"idTurnoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonid_empresaTurnoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTurnoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonid_empresaTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTurnoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonid_sucursalTurnoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTurnoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonid_sucursalTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTurnoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonid_usuarioTurnoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioTurnoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonid_usuarioTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioTurnoPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonnombreTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTurnoPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonhora_inicioTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"hora_inicioTurnoPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonhora_finTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"hora_finTurnoPunVenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTurnoPunVen!=null) {
				this.jInternalFrameReporteDinamicoTurnoPunVen.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTurnoPunVen"));
				this.jInternalFrameReporteDinamicoTurnoPunVen.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTurnoPunVen"));
				this.jInternalFrameReporteDinamicoTurnoPunVen.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTurnoPunVen"));
			}
			
			//this.jButtonCerrarReporteDinamicoTurnoPunVen.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTurnoPunVen"));				
			//this.jButtonGenerarReporteDinamicoTurnoPunVen.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTurnoPunVen"));
			//this.jButtonGenerarExcelReporteDinamicoTurnoPunVen.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTurnoPunVen"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTurnoPunVen!=null) {
				this.jInternalFrameImportacionTurnoPunVen.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTurnoPunVen"));
				this.jInternalFrameImportacionTurnoPunVen.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTurnoPunVen"));
				this.jInternalFrameImportacionTurnoPunVen.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTurnoPunVen"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTurnoPunVen.addActionListener (new ButtonActionListener(this,"AbrirOrderByTurnoPunVen"));
			
			this.jButtonAbrirOrderByToolBarTurnoPunVen.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTurnoPunVen"));			
			
			if(this.jInternalFrameOrderByTurnoPunVen!=null) {
				this.jInternalFrameOrderByTurnoPunVen.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTurnoPunVen"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurnoPunVen.jTabbedPaneRelacionesTurnoPunVen.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTurnoPunVen"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameTurnoPunVen();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTurnoPunVen.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTurnoPunVen = (JInternalFrameBase)event.getSource();
	            	
	            TurnoPunVenBeanSwingJInternalFrame jInternalFrameParent=(TurnoPunVenBeanSwingJInternalFrame)jInternalFrameDetalleFormTurnoPunVen.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTurnoPunVenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTurnoPunVen.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTurnoPunVenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTurnoPunVen.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTurnoPunVen.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTurnoPunVenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTurnoPunVenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTurnoPunVenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTurnoPunVen";
		inputMap = this.jButtonNuevoTurnoPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTurnoPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTurnoPunVenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTurnoPunVenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTurnoPunVenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTurnoPunVenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTurnoPunVen";
		inputMap = this.jButtonNuevoRelacionesTurnoPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTurnoPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTurnoPunVenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTurnoPunVen";
		inputMap = this.jButtonModificarTurnoPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTurnoPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTurnoPunVenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTurnoPunVen";
		inputMap = this.jButtonActualizarTurnoPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTurnoPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTurnoPunVenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTurnoPunVen";
		inputMap = this.jButtonEliminarTurnoPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTurnoPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTurnoPunVenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTurnoPunVen";
		inputMap = this.jButtonCancelarTurnoPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTurnoPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTurnoPunVenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTurnoPunVen";
		inputMap = this.jButtonCerrarTurnoPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTurnoPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTurnoPunVenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonGuardarCambiosTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTurnoPunVen";
		inputMap = this.jInternalFrameDetalleFormTurnoPunVen.jButtonGuardarCambiosTurnoPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonGuardarCambiosTurnoPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTurnoPunVenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTurnoPunVen.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTurnoPunVenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTurnoPunVen.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTurnoPunVenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTurnoPunVen.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTurnoPunVenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTurnoPunVen.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTurnoPunVenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonidTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"idTurnoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonid_empresaTurnoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTurnoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonid_empresaTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTurnoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonid_sucursalTurnoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTurnoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonid_sucursalTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTurnoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonid_usuarioTurnoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioTurnoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonid_usuarioTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioTurnoPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonnombreTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTurnoPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonhora_inicioTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"hora_inicioTurnoPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurnoPunVen.jButtonhora_finTurnoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"hora_finTurnoPunVenBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTurnoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTurnoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTurnoPunVenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTurnoPunVen.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTurnoPunVen(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TurnoPunVen turnopunvenAux:this.turnopunvenLogic.getTurnoPunVens()) {
					turnopunvenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TurnoPunVen turnopunvenAux:turnopunvens) {
					turnopunvenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTurnoPunVenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTurnoPunVen(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TurnoPunVen turnopunvenAux:this.turnopunvenLogic.getTurnoPunVens()) {
						turnopunvenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TurnoPunVen turnopunvenAux:turnopunvens) {
						turnopunvenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TurnoPunVen turnopunvenAux:this.turnopunvenLogic.getTurnoPunVens()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TurnoPunVen turnopunvenAux:turnopunvens) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTurnoPunVen(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTurnoPunVen.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTurnoPunVen.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTurnoPunVen,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTurnoPunVenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTurnoPunVen(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTurnoPunVen.getSelectedRows();
			
			TurnoPunVen turnopunvenLocal=new TurnoPunVen();
			
			//this.seleccionarTodosTurnoPunVen(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					turnopunvenLocal =(TurnoPunVen) this.turnopunvenLogic.getTurnoPunVens().toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					turnopunvenLocal =(TurnoPunVen) this.turnopunvens.toArray()[this.jTableDatosTurnoPunVen.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				turnopunvenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TurnoPunVen turnopunvenAux:this.turnopunvenLogic.getTurnoPunVens()) {
						turnopunvenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TurnoPunVen turnopunvenAux:turnopunvens) {
						turnopunvenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTurnoPunVen(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTurnoPunVen.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTurnoPunVen.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTurnoPunVen,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTurnoPunVenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTurnoPunVenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTurnoPunVenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTurnoPunVen(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTurnoPunVen.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TurnoPunVen turnopunvenAux:this.turnopunvenLogic.getTurnoPunVens()) {
				
						if(sTipoSeleccionar.equals(TurnoPunVenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							turnopunvenAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TurnoPunVenConstantesFunciones.LABEL_HORAINICIO)) {
							existe=true;
							turnopunvenAux.sethora_inicio(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoPunVenConstantesFunciones.LABEL_HORAFIN)) {
							existe=true;
							turnopunvenAux.sethora_fin(Time.valueOf(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TurnoPunVen turnopunvenAux:turnopunvens) {
					
						if(sTipoSeleccionar.equals(TurnoPunVenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							turnopunvenAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TurnoPunVenConstantesFunciones.LABEL_HORAINICIO)) {
							existe=true;
							turnopunvenAux.sethora_inicio(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoPunVenConstantesFunciones.LABEL_HORAFIN)) {
							existe=true;
							turnopunvenAux.sethora_fin(Time.valueOf(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTurnoPunVen(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTurnoPunVenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTurnoPunVen(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTurnoPunVen=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTurnoPunVen.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxTiposAccionesFormularioTurnoPunVen.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTurnoPunVen) {				
					conSplash=true;//false;										
					
					//this.startProcessTurnoPunVen(conSplash);
				
					this.generarReporteTurnoPunVensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTurnoPunVen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxTiposAccionesFormularioTurnoPunVen.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTurnoPunVensSeleccionados();
				//this.jComboBoxTiposAccionesTurnoPunVen.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTurnoPunVensSeleccionados(false);
				//this.jComboBoxTiposAccionesTurnoPunVen.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTurnoPunVensSeleccionados(true);
				//this.jComboBoxTiposAccionesTurnoPunVen.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTurnoPunVen();
				
				this.exportarTurnoPunVensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTurnoPunVen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxTiposAccionesFormularioTurnoPunVen.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTurnoPunVens();
				//this.importarTurnoPunVens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTurnoPunVen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxTiposAccionesFormularioTurnoPunVen.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTurnoPunVen();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTurnoPunVensSeleccionados();
				//this.jComboBoxTiposAccionesTurnoPunVen.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Turno Pun Ven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTurnoPunVen();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTurnoPunVen)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTurnoPunVen(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Turno Pun Ven",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTurnoPunVen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxTiposAccionesFormularioTurnoPunVen.setSelectedIndex(0);					
				}	
			} 			
			else if(TurnoPunVenBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTurnoPunVen) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTurnoPunVen(conSplash);
					
						//this.actualizarParametrosGeneralTurnoPunVen();
						
						this.generarReporteProcesoAccionTurnoPunVensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTurnoPunVen.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxTiposAccionesFormularioTurnoPunVen.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TurnoPunVenBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Turno Pun VenES SELECCIONADOS?", "MANTENIMIENTO DE Turno Pun Ven", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTurnoPunVen();
				
						this.actualizarParametrosGeneralTurnoPunVen();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.turnopunvenReturnGeneral=turnopunvenLogic.procesarAccionTurnoPunVensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.turnopunvenLogic.getTurnoPunVens(),this.turnopunvenParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTurnoPunVenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTurnoPunVen.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxTiposAccionesFormularioTurnoPunVen.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTurnoPunVen();
					
					TurnoPunVenBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTurnoPunVenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTurnoPunVen.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxTiposAccionesFormularioTurnoPunVen.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTurnoPunVen(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTurnoPunVenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTurnoPunVen();
			
			if(this.jInternalFrameDetalleFormTurnoPunVen==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TurnoPunVen> turnopunvensSeleccionados=new ArrayList<TurnoPunVen>();		
			TurnoPunVen turnopunven=new TurnoPunVen();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTurnoPunVen(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTurnoPunVen.getSelectedItem();
			
			
			
			
			turnopunvensSeleccionados=this.getTurnoPunVensSeleccionados(true);
			//this.sTipoAccion;
			
			if(turnopunvensSeleccionados.size()==1) {
				for(TurnoPunVen turnopunvenAux:turnopunvensSeleccionados) {
					turnopunven=turnopunvenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Caja Ingreso")) {
					jButtonCajaIngresoActionPerformed(null,rowIndex,true,false,turnopunven);
				}
				else if(this.sTipoRelacion.equals("Cajero Turno")) {
					jButtonCajeroTurnoActionPerformed(null,rowIndex,true,false,turnopunven);
				}
				else if(this.sTipoRelacion.equals("Caja Egreso")) {
					jButtonCajaEgresoActionPerformed(null,rowIndex,true,false,turnopunven);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTurnoPunVen();
			
      		//this.finishProcessTurnoPunVen(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTurnoPunVenReturnGeneral() throws Exception {
		if(this.turnopunvenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.turnopunvenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.turnopunvenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.turnopunvenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.turnopunvenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.turnopunvenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTurnoPunVen(false);
		}
		
		if(this.turnopunvenReturnGeneral.getConRetornoLista() || this.turnopunvenReturnGeneral.getConRetornoObjeto()) {
			if(this.turnopunvenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.turnopunvenLogic.setTurnoPunVens(this.turnopunvenReturnGeneral.getTurnoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.turnopunvenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.turnopunvenLogic.setTurnoPunVen(this.turnopunvenReturnGeneral.getTurnoPunVen());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTurnoPunVen(false);
		}
	}
	
	public void actualizarParametrosGeneralTurnoPunVen() throws Exception {
		
		
	}
	
	public ArrayList<TurnoPunVen> getTurnoPunVensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TurnoPunVen> turnopunvensSeleccionados=new ArrayList<TurnoPunVen>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTurnoPunVen) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TurnoPunVen turnopunvenAux:turnopunvenLogic.getTurnoPunVens()) {
					if(turnopunvenAux.getIsSelected()) {
						turnopunvensSeleccionados.add(turnopunvenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TurnoPunVen turnopunvenAux:this.turnopunvens) {
					if(turnopunvenAux.getIsSelected()) {
						turnopunvensSeleccionados.add(turnopunvenAux);				
					}
				}
			}
			
			if(turnopunvensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						turnopunvensSeleccionados.addAll(this.turnopunvenLogic.getTurnoPunVens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						turnopunvensSeleccionados.addAll(this.turnopunvens);				
					}
				}
			}
		} else {
			turnopunvensSeleccionados.add(this.turnopunven);
		}
		
		return turnopunvensSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteTurnoPunVensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTurnoPunVensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTurnoPunVensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTurnoPunVensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTurnoPunVensSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTurnoPunVensSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Turno Pun Ven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTurnoPunVensSeleccionados() throws Exception {
		ArrayList<TurnoPunVen> turnopunvensSeleccionados=new ArrayList<TurnoPunVen>();		
		
		turnopunvensSeleccionados=this.getTurnoPunVensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTurnoPunVens("Todos",turnopunvensSeleccionados);
		
	}	
	
	public void generarReporteNormalTurnoPunVensSeleccionados() throws Exception {
		ArrayList<TurnoPunVen> turnopunvensSeleccionados=new ArrayList<TurnoPunVen>();		
		
		turnopunvensSeleccionados=this.getTurnoPunVensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTurnoPunVens("Todos",turnopunvensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTurnoPunVensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TurnoPunVen> turnopunvensSeleccionados=new ArrayList<TurnoPunVen>();
		
		turnopunvensSeleccionados=this.getTurnoPunVensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTurnoPunVens("Todos",turnopunvensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTurnoPunVensSeleccionados() throws Exception {
		ArrayList<TurnoPunVen> turnopunvensSeleccionados=new ArrayList<TurnoPunVen>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTurnoPunVen();
		
		
		turnopunvensSeleccionados=this.getTurnoPunVensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTurnoPunVen();
		
		
		//this.generarReporteTurnoPunVens("Todos",turnopunvensSeleccionados ,turnopunvenImplementable,turnopunvenImplementableHome);
	}
	
	public void mostrarImportacionTurnoPunVens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTurnoPunVen();
		
		this.abrirFrameImportacionTurnoPunVen();		
		
			
		//this.generarReporteTurnoPunVens("Todos",turnopunvensSeleccionados ,turnopunvenImplementable,turnopunvenImplementableHome);
	}
	
	public void importarTurnoPunVens() throws Exception {		
	
	}
	
	public void exportarTurnoPunVensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTurnoPunVensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTurnoPunVensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTurnoPunVensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Turno Pun Ven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTurnoPunVensSeleccionados() throws Exception {
		ArrayList<TurnoPunVen> turnopunvensSeleccionados=new ArrayList<TurnoPunVen>();		
		
		turnopunvensSeleccionados=this.getTurnoPunVensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"turnopunven."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTurnoPunVen(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TurnoPunVen turnopunvenAux:turnopunvensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTurnoPunVen(turnopunvenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//turnopunvenAux.setsDetalleGeneralEntityReporte(turnopunvenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.turnopunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Turno Pun Ven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTurnoPunVen(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TurnoPunVenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoPunVenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoPunVenConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoPunVenConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoPunVenConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoPunVenConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoPunVenConstantesFunciones.LABEL_HORAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoPunVenConstantesFunciones.LABEL_HORAFIN;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTurnoPunVen(TurnoPunVen turnopunven,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=turnopunven.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=turnopunven.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=turnopunven.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turnopunven.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turnopunven.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turnopunven.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turnopunven.gethora_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turnopunven.gethora_fin().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTurnoPunVensSeleccionados() throws Exception {
		ArrayList<TurnoPunVen> turnopunvensSeleccionados=new ArrayList<TurnoPunVen>();		
		
		turnopunvensSeleccionados=this.getTurnoPunVensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"turnopunven.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TurnoPunVens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTurnoPunVen(row);				
				iRow++;
			}				
			
			for(TurnoPunVen turnopunvenAux:turnopunvensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTurnoPunVen(turnopunvenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.turnopunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Turno Pun Ven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTurnoPunVensSeleccionados() throws Exception {
		ArrayList<TurnoPunVen> turnopunvensSeleccionados=new ArrayList<TurnoPunVen>();		
		
		turnopunvensSeleccionados=this.getTurnoPunVensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"turnopunven.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("turnopunvens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("turnopunven");
			//elementRoot.appendChild(element);
		
			for(TurnoPunVen turnopunvenAux:turnopunvensSeleccionados) {
				element = document.createElement("turnopunven");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTurnoPunVen(turnopunvenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.turnopunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Turno Pun Ven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTurnoPunVen(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_HORAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoPunVenConstantesFunciones.LABEL_HORAFIN);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTurnoPunVen(TurnoPunVen turnopunven,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(turnopunven.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(turnopunven.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(turnopunven.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(turnopunven.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(turnopunven.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(turnopunven.gethora_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(turnopunven.gethora_fin());				
	}
	
	public void setFilaDatosExportarXmlTurnoPunVen(TurnoPunVen turnopunven,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TurnoPunVenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(turnopunven.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TurnoPunVenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(turnopunven.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TurnoPunVenConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(turnopunven.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(TurnoPunVenConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(turnopunven.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementusuario_descripcion = document.createElement(TurnoPunVenConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(turnopunven.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementnombre = document.createElement(TurnoPunVenConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(turnopunven.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementhora_inicio = document.createElement(TurnoPunVenConstantesFunciones.HORAINICIO);
		elementhora_inicio.appendChild(document.createTextNode(turnopunven.gethora_inicio().toString().trim()));
		element.appendChild(elementhora_inicio);

		Element elementhora_fin = document.createElement(TurnoPunVenConstantesFunciones.HORAFIN);
		elementhora_fin.appendChild(document.createTextNode(turnopunven.gethora_fin().toString().trim()));
		element.appendChild(elementhora_fin);
	}
	
	public void generarReporteGroupGenericoTurnoPunVensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TurnoPunVen> turnopunvensSeleccionados=new ArrayList<TurnoPunVen>();
		
		turnopunvensSeleccionados=this.getTurnoPunVensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoTurnoPunVen(turnopunvensSeleccionados);
		
		this.generarReporteTurnoPunVens("Todos",turnopunvensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTurnoPunVen(ArrayList<TurnoPunVen> turnopunvensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TurnoPunVen turnopunvenAux:turnopunvensSeleccionados) {
				turnopunvenAux.setsDetalleGeneralEntityReporte(turnopunvenAux.toString());
			
				if(sTipoSeleccionar.equals(TurnoPunVenConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					turnopunvenAux.setsDescripcionGeneralEntityReporte1(turnopunvenAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TurnoPunVenConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					turnopunvenAux.setsDescripcionGeneralEntityReporte1(turnopunvenAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TurnoPunVenConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					turnopunvenAux.setsDescripcionGeneralEntityReporte1(turnopunvenAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TurnoPunVenConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					turnopunvenAux.setsDescripcionGeneralEntityReporte1(turnopunvenAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TurnoPunVenConstantesFunciones.LABEL_HORAINICIO)) {
					existe=true;
					turnopunvenAux.setsDescripcionGeneralEntityReporte1(turnopunvenAux.gethora_inicio().toString());
				}
				 else if(sTipoSeleccionar.equals(TurnoPunVenConstantesFunciones.LABEL_HORAFIN)) {
					existe=true;
					turnopunvenAux.setsDescripcionGeneralEntityReporte1(turnopunvenAux.gethora_fin().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTurnoPunVen(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTurnoPunVen=true;
				this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen=true;
				this.isVisibilidadCeldaGuardarCambiosTurnoPunVen=true;
			}
			
			this.isVisibilidadCeldaModificarTurnoPunVen=false;
			this.isVisibilidadCeldaActualizarTurnoPunVen=false;
			this.isVisibilidadCeldaEliminarTurnoPunVen=false;
			this.isVisibilidadCeldaCancelarTurnoPunVen=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTurnoPunVen=true;
				} else {
					this.isVisibilidadCeldaGuardarTurnoPunVen=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTurnoPunVen=false;
			this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosTurnoPunVen=false;
			this.isVisibilidadCeldaModificarTurnoPunVen=false;
			this.isVisibilidadCeldaActualizarTurnoPunVen=true;
			this.isVisibilidadCeldaEliminarTurnoPunVen=false;
			this.isVisibilidadCeldaCancelarTurnoPunVen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTurnoPunVen=true;
				} else {
					this.isVisibilidadCeldaGuardarTurnoPunVen=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTurnoPunVen=false;
			this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosTurnoPunVen=false;
			this.isVisibilidadCeldaModificarTurnoPunVen=false;
			this.isVisibilidadCeldaActualizarTurnoPunVen=true;
			this.isVisibilidadCeldaEliminarTurnoPunVen=true;
			this.isVisibilidadCeldaCancelarTurnoPunVen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTurnoPunVen=true;
				} else {
					this.isVisibilidadCeldaGuardarTurnoPunVen=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTurnoPunVen=false;
			this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosTurnoPunVen=false;
			this.isVisibilidadCeldaModificarTurnoPunVen=false;
			this.isVisibilidadCeldaActualizarTurnoPunVen=true;
			this.isVisibilidadCeldaEliminarTurnoPunVen=false;
			this.isVisibilidadCeldaCancelarTurnoPunVen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTurnoPunVen=false;
				} else {
					this.isVisibilidadCeldaGuardarTurnoPunVen=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTurnoPunVen=true;
			this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen=true;
			this.isVisibilidadCeldaGuardarCambiosTurnoPunVen=true;
			this.isVisibilidadCeldaModificarTurnoPunVen=false;
			this.isVisibilidadCeldaActualizarTurnoPunVen=false;
			this.isVisibilidadCeldaEliminarTurnoPunVen=false;
			this.isVisibilidadCeldaCancelarTurnoPunVen=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTurnoPunVen=true;
				} else {
					this.isVisibilidadCeldaGuardarTurnoPunVen=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTurnoPunVen=false;
			this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosTurnoPunVen=false;
			this.isVisibilidadCeldaActualizarTurnoPunVen=false;
			this.isVisibilidadCeldaEliminarTurnoPunVen=false;
			this.isVisibilidadCeldaCancelarTurnoPunVen=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTurnoPunVen=false;
				} else {
					this.isVisibilidadCeldaGuardarTurnoPunVen=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTurnoPunVen=false;
			this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosTurnoPunVen=false;
			this.isVisibilidadCeldaModificarTurnoPunVen=true;
			this.isVisibilidadCeldaActualizarTurnoPunVen=false;
			this.isVisibilidadCeldaEliminarTurnoPunVen=false;
			this.isVisibilidadCeldaCancelarTurnoPunVen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTurnoPunVen=false;
				} else {
					this.isVisibilidadCeldaGuardarTurnoPunVen=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TurnoPunVenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTurnoPunVen=true;
			this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen=true;
			this.isVisibilidadCeldaGuardarCambiosTurnoPunVen=true;
		} else {
			this.actualizarEstadoPanelsTurnoPunVen(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTurnoPunVen=false;
			//this.isVisibilidadCeldaVerFormTurnoPunVen=false;
			this.isVisibilidadCeldaDuplicarTurnoPunVen=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!turnopunvenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen=false;
		} else {
			this.isVisibilidadCeldaNuevoTurnoPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosTurnoPunVen=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(turnopunvenSessionBean.getEsGuardarRelacionado()) {
			if(!turnopunvenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen=false;												
			}
			
			this.jButtonCerrarTurnoPunVen.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTurnoPunVen=false;
		}
		
		if(!this.permiteMantenimiento(this.turnopunven)) {
			this.isVisibilidadCeldaActualizarTurnoPunVen=false;
			this.isVisibilidadCeldaEliminarTurnoPunVen=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTurnoPunVen() {
		this.isVisibilidadCeldaNuevoTurnoPunVen=false;
		this.isVisibilidadCeldaGuardarCambiosTurnoPunVen=false;
	}
	
	public void actualizarEstadoPanelsTurnoPunVen(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTurnoPunVen!=null) {
				this.jScrollPanelDatosEdicionTurnoPunVen.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTurnoPunVen!=null) {
				this.jTabbedPaneBusquedasTurnoPunVen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTurnoPunVen!=null) {
				this.jScrollPanelDatosTurnoPunVen.setVisible(true);
			}
			
			if(this.jPanelPaginacionTurnoPunVen!=null) {
				this.jPanelPaginacionTurnoPunVen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTurnoPunVen!=null) {
				this.jPanelParametrosReportesTurnoPunVen.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTurnoPunVen!=null) {
				this.jScrollPanelDatosEdicionTurnoPunVen.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTurnoPunVen!=null) {
				this.jTabbedPaneBusquedasTurnoPunVen.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTurnoPunVen!=null) {
				this.jScrollPanelDatosTurnoPunVen.setVisible(false);
			}
			
			if(this.jPanelPaginacionTurnoPunVen!=null) {
				this.jPanelPaginacionTurnoPunVen.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTurnoPunVen!=null) {
				this.jPanelParametrosReportesTurnoPunVen.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTurnoPunVen!=null) {
				this.jScrollPanelDatosEdicionTurnoPunVen.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTurnoPunVen!=null) {
				this.jTabbedPaneBusquedasTurnoPunVen.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTurnoPunVen!=null) {
				this.jScrollPanelDatosTurnoPunVen.setVisible(false);
			}
			
			if(this.jPanelPaginacionTurnoPunVen!=null) {
				this.jPanelPaginacionTurnoPunVen.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTurnoPunVen!=null) {
				this.jPanelParametrosReportesTurnoPunVen.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTurnoPunVen!=null) {
				this.jScrollPanelDatosEdicionTurnoPunVen.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTurnoPunVen!=null) {
				this.jTabbedPaneBusquedasTurnoPunVen.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTurnoPunVen!=null) {
				this.jScrollPanelDatosTurnoPunVen.setVisible(false);
			}
			
			if(this.jPanelPaginacionTurnoPunVen!=null) {
				this.jPanelPaginacionTurnoPunVen.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTurnoPunVen!=null) {
				this.jPanelParametrosReportesTurnoPunVen.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTurnoPunVen!=null) {
				this.jScrollPanelDatosEdicionTurnoPunVen.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTurnoPunVen!=null) {
				this.jTabbedPaneBusquedasTurnoPunVen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTurnoPunVen!=null) {
				this.jScrollPanelDatosTurnoPunVen.setVisible(true);
			}
			
			if(this.jPanelPaginacionTurnoPunVen!=null) {
				this.jPanelPaginacionTurnoPunVen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTurnoPunVen!=null) {
				this.jPanelParametrosReportesTurnoPunVen.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTurnoPunVen!=null) {
				this.jScrollPanelDatosEdicionTurnoPunVen.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTurnoPunVen!=null) {
				this.jTabbedPaneBusquedasTurnoPunVen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTurnoPunVen!=null) {
				this.jScrollPanelDatosTurnoPunVen.setVisible(true);
			}
			
			if(this.jPanelPaginacionTurnoPunVen!=null) {
				this.jPanelPaginacionTurnoPunVen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTurnoPunVen!=null) {
				this.jPanelParametrosReportesTurnoPunVen.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTurnoPunVen!=null) {
				this.jScrollPanelDatosEdicionTurnoPunVen.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTurnoPunVen!=null) {
				this.jTabbedPaneBusquedasTurnoPunVen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTurnoPunVen!=null) {
				this.jScrollPanelDatosTurnoPunVen.setVisible(true);
			}
			
			if(this.jPanelPaginacionTurnoPunVen!=null) {
				this.jPanelPaginacionTurnoPunVen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTurnoPunVen!=null) {
				this.jPanelParametrosReportesTurnoPunVen.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTurnoPunVen!=null) {
					this.jTabbedPaneBusquedasTurnoPunVen.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTurnoPunVen!=null) {
				this.jPanelParametrosReportesTurnoPunVen.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTurnoPunVen!=null) {
				this.jTabbedPaneBusquedasTurnoPunVen.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTurnoPunVen!=null) {
				this.jPanelParametrosReportesTurnoPunVen.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;
		}
		
	}
	
	

	public String registrarSesionTurnoPunVenParaCajaIngresos() throws Exception {
		Boolean isPaginaPopupCajaIngreso=false;

		try {

			if(this.turnopunvenSessionBean==null) {
				this.turnopunvenSessionBean=new TurnoPunVenSessionBean();
			}

			if(this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoSessionBean==null) {
				this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoSessionBean=new CajaIngresoSessionBean();
			}

			this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoSessionBean.setsPathNavegacionActual(turnopunvenSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CajaIngresoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCajaIngreso=this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCajaIngreso(true);
			this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCajaIngreso(TurnoPunVenConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoSessionBean.setisBusquedaDesdeForeignKeySesionTurnoPunVen(true);
			this.jInternalFrameDetalleFormTurnoPunVen.cajaingresoSessionBean.setlidTurnoPunVenActual(this.idTurnoPunVenActual);

			turnopunvenSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTurnoPunVen(true);
			turnopunvenSessionBean.setlIdTurnoPunVenActualForeignKey(this.idTurnoPunVenActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTurnoPunVenParaCajeroTurnos() throws Exception {
		Boolean isPaginaPopupCajeroTurno=false;

		try {

			if(this.turnopunvenSessionBean==null) {
				this.turnopunvenSessionBean=new TurnoPunVenSessionBean();
			}

			if(this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoSessionBean==null) {
				this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
			}

			this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoSessionBean.setsPathNavegacionActual(turnopunvenSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCajeroTurno=this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCajeroTurno(true);
			this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCajeroTurno(TurnoPunVenConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoSessionBean.setisBusquedaDesdeForeignKeySesionTurnoPunVen(true);
			this.jInternalFrameDetalleFormTurnoPunVen.cajeroturnoSessionBean.setlidTurnoPunVenActual(this.idTurnoPunVenActual);

			turnopunvenSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTurnoPunVen(true);
			turnopunvenSessionBean.setlIdTurnoPunVenActualForeignKey(this.idTurnoPunVenActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTurnoPunVenParaCajaEgresos() throws Exception {
		Boolean isPaginaPopupCajaEgreso=false;

		try {

			if(this.turnopunvenSessionBean==null) {
				this.turnopunvenSessionBean=new TurnoPunVenSessionBean();
			}

			if(this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoSessionBean==null) {
				this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoSessionBean=new CajaEgresoSessionBean();
			}

			this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoSessionBean.setsPathNavegacionActual(turnopunvenSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CajaEgresoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCajaEgreso=this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCajaEgreso(true);
			this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCajaEgreso(TurnoPunVenConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoSessionBean.setisBusquedaDesdeForeignKeySesionTurnoPunVen(true);
			this.jInternalFrameDetalleFormTurnoPunVen.cajaegresoSessionBean.setlidTurnoPunVenActual(this.idTurnoPunVenActual);

			turnopunvenSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTurnoPunVen(true);
			turnopunvenSessionBean.setlIdTurnoPunVenActualForeignKey(this.idTurnoPunVenActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TurnoPunVenSessionBean turnopunvenSessionBean=new TurnoPunVenSessionBean();
		
		if(this.turnopunvenSessionBean==null) {
			this.turnopunvenSessionBean=new TurnoPunVenSessionBean();
		}
		
		this.turnopunvenSessionBean.setsUltimaBusquedaTurnoPunVen(this.getsAccionBusqueda());
		this.turnopunvenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.turnopunvenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			turnopunvenSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			turnopunvenSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			turnopunvenSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TurnoPunVenSessionBean turnopunvenSessionBean=new TurnoPunVenSessionBean();
		
		if(this.turnopunvenSessionBean==null) {
			this.turnopunvenSessionBean=new TurnoPunVenSessionBean();
		}
		
		if(this.turnopunvenSessionBean.getsUltimaBusquedaTurnoPunVen()!=null&&!this.turnopunvenSessionBean.getsUltimaBusquedaTurnoPunVen().equals("")) {
			this.setsAccionBusqueda(turnopunvenSessionBean.getsUltimaBusquedaTurnoPunVen());
			this.setiNumeroPaginacion(turnopunvenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(turnopunvenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(turnopunvenSessionBean.getid_empresa());
				turnopunvenSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(turnopunvenSessionBean.getid_sucursal());
				turnopunvenSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(turnopunvenSessionBean.getid_usuario());
				turnopunvenSessionBean.setid_usuario(-1L);
			}
		}
		
		this.turnopunvenSessionBean.setsUltimaBusquedaTurnoPunVen("");
		this.turnopunvenSessionBean.setiNumeroPaginacion(TurnoPunVenConstantesFunciones.INUMEROPAGINACION);
		this.turnopunvenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTurnoPunVen(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTurnoPunVen() {
		this.updateBorderResaltarBusquedasFormularioTurnoPunVen();
		this.updateVisibilidadBusquedasFormularioTurnoPunVen();
		this.updateHabilitarBusquedasFormularioTurnoPunVen();
	}
	
	public void updateBorderResaltarBusquedasFormularioTurnoPunVen() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTurnoPunVen.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTurnoPunVen() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTurnoPunVen.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTurnoPunVen() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTurnoPunVen.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTurnoPunVen(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTurnoPunVen.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioTurnoPunVen() throws Exception {

		if(this.jInternalFrameDetalleFormTurnoPunVen==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTurnoPunVen();
		this.updateVisibilidadResaltarControlesFormularioTurnoPunVen();
		this.updateHabilitarResaltarControlesFormularioTurnoPunVen();
		
	}
	
	public void updateBorderResaltarControlesFormularioTurnoPunVen() throws Exception {
		if(this.jInternalFrameDetalleFormTurnoPunVen==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.turnopunvenConstantesFunciones.resaltaridTurnoPunVen!=null && this.jInternalFrameDetalleFormTurnoPunVen!=null) {this.jInternalFrameDetalleFormTurnoPunVen.jLabelidTurnoPunVen.setBorder(this.turnopunvenConstantesFunciones.resaltaridTurnoPunVen);}
		if(this.turnopunvenConstantesFunciones.resaltarid_empresaTurnoPunVen!=null && this.jInternalFrameDetalleFormTurnoPunVen!=null) {this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_empresaTurnoPunVen.setBorder(this.turnopunvenConstantesFunciones.resaltarid_empresaTurnoPunVen);}
		if(this.turnopunvenConstantesFunciones.resaltarid_sucursalTurnoPunVen!=null && this.jInternalFrameDetalleFormTurnoPunVen!=null) {this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_sucursalTurnoPunVen.setBorder(this.turnopunvenConstantesFunciones.resaltarid_sucursalTurnoPunVen);}
		if(this.turnopunvenConstantesFunciones.resaltarid_usuarioTurnoPunVen!=null && this.jInternalFrameDetalleFormTurnoPunVen!=null) {this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_usuarioTurnoPunVen.setBorder(this.turnopunvenConstantesFunciones.resaltarid_usuarioTurnoPunVen);}
		if(this.turnopunvenConstantesFunciones.resaltarnombreTurnoPunVen!=null && this.jInternalFrameDetalleFormTurnoPunVen!=null) {this.jInternalFrameDetalleFormTurnoPunVen.jTextFieldnombreTurnoPunVen.setBorder(this.turnopunvenConstantesFunciones.resaltarnombreTurnoPunVen);}
		if(this.turnopunvenConstantesFunciones.resaltarhora_inicioTurnoPunVen!=null && this.jInternalFrameDetalleFormTurnoPunVen!=null) {this.jInternalFrameDetalleFormTurnoPunVen.jSpinnerhora_inicioTurnoPunVen.setBorder(this.turnopunvenConstantesFunciones.resaltarhora_inicioTurnoPunVen);}
		if(this.turnopunvenConstantesFunciones.resaltarhora_finTurnoPunVen!=null && this.jInternalFrameDetalleFormTurnoPunVen!=null) {this.jInternalFrameDetalleFormTurnoPunVen.jSpinnerhora_finTurnoPunVen.setBorder(this.turnopunvenConstantesFunciones.resaltarhora_finTurnoPunVen);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTurnoPunVen() throws Exception {		
		if(this.jInternalFrameDetalleFormTurnoPunVen==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
	
		//this.jInternalFrameDetalleFormTurnoPunVen.jLabelidTurnoPunVen.setVisible(this.turnopunvenConstantesFunciones.mostraridTurnoPunVen);
		this.jInternalFrameDetalleFormTurnoPunVen.jPanelidTurnoPunVen.setVisible(this.turnopunvenConstantesFunciones.mostraridTurnoPunVen);
		//this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_empresaTurnoPunVen.setVisible(this.turnopunvenConstantesFunciones.mostrarid_empresaTurnoPunVen);
		this.jInternalFrameDetalleFormTurnoPunVen.jPanelid_empresaTurnoPunVen.setVisible(this.turnopunvenConstantesFunciones.mostrarid_empresaTurnoPunVen);
		//this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_sucursalTurnoPunVen.setVisible(this.turnopunvenConstantesFunciones.mostrarid_sucursalTurnoPunVen);
		this.jInternalFrameDetalleFormTurnoPunVen.jPanelid_sucursalTurnoPunVen.setVisible(this.turnopunvenConstantesFunciones.mostrarid_sucursalTurnoPunVen);
		//this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_usuarioTurnoPunVen.setVisible(this.turnopunvenConstantesFunciones.mostrarid_usuarioTurnoPunVen);
		this.jInternalFrameDetalleFormTurnoPunVen.jPanelid_usuarioTurnoPunVen.setVisible(this.turnopunvenConstantesFunciones.mostrarid_usuarioTurnoPunVen);
		//this.jInternalFrameDetalleFormTurnoPunVen.jTextFieldnombreTurnoPunVen.setVisible(this.turnopunvenConstantesFunciones.mostrarnombreTurnoPunVen);
		this.jInternalFrameDetalleFormTurnoPunVen.jPanelnombreTurnoPunVen.setVisible(this.turnopunvenConstantesFunciones.mostrarnombreTurnoPunVen);
		//this.jInternalFrameDetalleFormTurnoPunVen.jSpinnerhora_inicioTurnoPunVen.setVisible(this.turnopunvenConstantesFunciones.mostrarhora_inicioTurnoPunVen);
		this.jInternalFrameDetalleFormTurnoPunVen.jPanelhora_inicioTurnoPunVen.setVisible(this.turnopunvenConstantesFunciones.mostrarhora_inicioTurnoPunVen);
		//this.jInternalFrameDetalleFormTurnoPunVen.jSpinnerhora_finTurnoPunVen.setVisible(this.turnopunvenConstantesFunciones.mostrarhora_finTurnoPunVen);
		this.jInternalFrameDetalleFormTurnoPunVen.jPanelhora_finTurnoPunVen.setVisible(this.turnopunvenConstantesFunciones.mostrarhora_finTurnoPunVen);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTurnoPunVen() throws Exception {
		if(this.jInternalFrameDetalleFormTurnoPunVen==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTurnoPunVen!=null) {
	
		this.jInternalFrameDetalleFormTurnoPunVen.jLabelidTurnoPunVen.setEnabled(this.turnopunvenConstantesFunciones.activaridTurnoPunVen);
		this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_empresaTurnoPunVen.setEnabled(this.turnopunvenConstantesFunciones.activarid_empresaTurnoPunVen);
		this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_sucursalTurnoPunVen.setEnabled(this.turnopunvenConstantesFunciones.activarid_sucursalTurnoPunVen);
		this.jInternalFrameDetalleFormTurnoPunVen.jComboBoxid_usuarioTurnoPunVen.setEnabled(this.turnopunvenConstantesFunciones.activarid_usuarioTurnoPunVen);
		this.jInternalFrameDetalleFormTurnoPunVen.jTextFieldnombreTurnoPunVen.setEnabled(this.turnopunvenConstantesFunciones.activarnombreTurnoPunVen);
		this.jInternalFrameDetalleFormTurnoPunVen.jSpinnerhora_inicioTurnoPunVen.setEnabled(this.turnopunvenConstantesFunciones.activarhora_inicioTurnoPunVen);
		this.jInternalFrameDetalleFormTurnoPunVen.jSpinnerhora_finTurnoPunVen.setEnabled(this.turnopunvenConstantesFunciones.activarhora_finTurnoPunVen);
		}
	}
	
		
}