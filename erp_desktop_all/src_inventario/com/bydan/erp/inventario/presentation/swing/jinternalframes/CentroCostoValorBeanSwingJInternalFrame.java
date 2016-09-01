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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.CentroCostoValorConstantesFunciones;
import com.bydan.erp.inventario.util.CentroCostoValorParameterReturnGeneral;
//import com.bydan.erp.inventario.util.CentroCostoValorParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.CentroCostoValorBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CentroCostoValorBeanSwingJInternalFrame extends CentroCostoValorJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CentroCostoValorBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CentroCostoValor> centrocostovalorValidator = new ClassValidator<CentroCostoValor>(CentroCostoValor.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CentroCostoValor centrocostovalor;	
	public CentroCostoValor centrocostovalorAux;
	public CentroCostoValor centrocostovalorAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CentroCostoValor centrocostovalorTotales;
	public Long idCentroCostoValorActual;
	public Long iIdNuevoCentroCostoValor=0L;
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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboCentroCosto="";

	public List<CentroCosto> centrocostosForeignKey;

	public List<CentroCosto> getcentrocostosForeignKey() {
		return centrocostosForeignKey;
	}

	public void setcentrocostosForeignKey(List<CentroCosto> centrocostosForeignKey) {
		this.centrocostosForeignKey = centrocostosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CentroCosto centrocostoForeignKey;

	public CentroCosto getcentrocostoForeignKey() {
		return centrocostoForeignKey;
	}

	public void setcentrocostoForeignKey(CentroCosto centrocostoForeignKey) {
		this.centrocostoForeignKey = centrocostoForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idCentroCostoActual=0L;

	public Long getidCentroCostoActual() {
		return idCentroCostoActual;
	}

	public void setidCentroCostoActual(Long idCentroCostoActual) {
		this.idCentroCostoActual= idCentroCostoActual;
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
	
	public Boolean isPermisoTodoCentroCostoValor;
	public Boolean isPermisoNuevoCentroCostoValor;
	public Boolean isPermisoActualizarCentroCostoValor;
	public Boolean isPermisoActualizarOriginalCentroCostoValor;
	public Boolean isPermisoEliminarCentroCostoValor;
	public Boolean isPermisoGuardarCambiosCentroCostoValor;
	public Boolean isPermisoConsultaCentroCostoValor;
	public Boolean isPermisoBusquedaCentroCostoValor;
	public Boolean isPermisoReporteCentroCostoValor;
	public Boolean isPermisoPaginacionMedioCentroCostoValor;
	public Boolean isPermisoPaginacionAltoCentroCostoValor;
	public Boolean isPermisoPaginacionTodoCentroCostoValor;
	public Boolean isPermisoCopiarCentroCostoValor;
	public Boolean isPermisoVerFormCentroCostoValor;
	public Boolean isPermisoDuplicarCentroCostoValor;
	public Boolean isPermisoOrdenCentroCostoValor;
	
	
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
	
	public CentroCostoValorParameterReturnGeneral centrocostovalorReturnGeneral;
	public CentroCostoValorParameterReturnGeneral centrocostovalorParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCentroCostoValor=false;
	public Boolean esParaAccionDesdeFormularioCentroCostoValor=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CentroCostoValorSessionBeanAdditional centrocostovalorSessionBeanAdditional=null;
	
	public CentroCostoValorSessionBeanAdditional getCentroCostoValorSessionBeanAdditional() {
		return this.centrocostovalorSessionBeanAdditional;
	}
	
	public void setCentroCostoValorSessionBeanAdditional(CentroCostoValorSessionBeanAdditional centrocostovalorSessionBeanAdditional) {
		try {
			this.centrocostovalorSessionBeanAdditional=centrocostovalorSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CentroCostoValorBeanSwingJInternalFrameAdditional centrocostovalorBeanSwingJInternalFrameAdditional=null;
	//public class CentroCostoValorBeanSwingJInternalFrame
	
	public CentroCostoValorBeanSwingJInternalFrameAdditional getCentroCostoValorBeanSwingJInternalFrameAdditional() {
		return this.centrocostovalorBeanSwingJInternalFrameAdditional;
	}
	
	public void setCentroCostoValorBeanSwingJInternalFrameAdditional(CentroCostoValorBeanSwingJInternalFrameAdditional centrocostovalorBeanSwingJInternalFrameAdditional) {
		try {
			this.centrocostovalorBeanSwingJInternalFrameAdditional=centrocostovalorBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CentroCostoValorLogic centrocostovalorLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CentroCostoValor centrocostovalorBean;
	public CentroCostoValorConstantesFunciones centrocostovalorConstantesFunciones;
	//public CentroCostoValorParameterReturnGeneral centrocostovalorReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public CentroCostoLogic centrocostoLogic;
	
	//PARAMETROS
	
	
	//public List<CentroCostoValor> centrocostovalors;	
	//public List<CentroCostoValor> centrocostovalorsEliminados;
	//public List<CentroCostoValor> centrocostovalorsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCentroCostoValor=false;
	public Boolean isVisibilidadCeldaDuplicarCentroCostoValor=true;
	public Boolean isVisibilidadCeldaCopiarCentroCostoValor=true;
	public Boolean isVisibilidadCeldaVerFormCentroCostoValor=true;
	public Boolean isVisibilidadCeldaOrdenCentroCostoValor=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCentroCostoValor=false;
	public Boolean isVisibilidadCeldaModificarCentroCostoValor=false;
	public Boolean isVisibilidadCeldaActualizarCentroCostoValor=false;
	public Boolean isVisibilidadCeldaEliminarCentroCostoValor=false;
	public Boolean isVisibilidadCeldaCancelarCentroCostoValor=false;
	public Boolean isVisibilidadCeldaGuardarCentroCostoValor=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCentroCostoValor=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdCentroCosto=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoCentroCostoValor() {
		return this.iIdNuevoCentroCostoValor;
	}

	public void setiIdNuevoCentroCostoValor(Long iIdNuevoCentroCostoValor) {
		this.iIdNuevoCentroCostoValor = iIdNuevoCentroCostoValor;
	}
	
	public Long getidCentroCostoValorActual() {
		return this.idCentroCostoValorActual;
	}

	public void setidCentroCostoValorActual(Long idCentroCostoValorActual) {
		this.idCentroCostoValorActual = idCentroCostoValorActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CentroCostoValor getcentrocostovalor() {
		return this.centrocostovalor;
	}

	public void setcentrocostovalor(CentroCostoValor centrocostovalor) {
		this.centrocostovalor = centrocostovalor;
	}
	
	public CentroCostoValor getcentrocostovalorAux() {
		return this.centrocostovalorAux;
	}

	public void setcentrocostovalorAux(CentroCostoValor centrocostovalorAux) {
		this.centrocostovalorAux = centrocostovalorAux;
	}				
	
	public CentroCostoValor getcentrocostovalorAnterior() {
		return this.centrocostovalorAnterior;
	}

	public void setcentrocostovalorAnterior(CentroCostoValor centrocostovalorAnterior) {
		this.centrocostovalorAnterior = centrocostovalorAnterior;
	}	
	
	public CentroCostoValor getcentrocostovalorTotales() {
		return this.centrocostovalorTotales;
	}

	public void setcentrocostovalorTotales(CentroCostoValor centrocostovalorTotales) {
		this.centrocostovalorTotales = centrocostovalorTotales;
	}	
	
	public CentroCostoValor getcentrocostovalorBean() {
		return this.centrocostovalorBean;
	}

	public void setcentrocostovalorBean(CentroCostoValor centrocostovalorBean) {
		this.centrocostovalorBean = centrocostovalorBean;
	}	
	
	public CentroCostoValorParameterReturnGeneral getcentrocostovalorReturnGeneral() {
		return this.centrocostovalorReturnGeneral;
	}

	public void setcentrocostovalorReturnGeneral(CentroCostoValorParameterReturnGeneral centrocostovalorReturnGeneral) {
		this.centrocostovalorReturnGeneral = centrocostovalorReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_centro_costoFK_IdCentroCosto=null;

	public Long getid_centro_costoFK_IdCentroCosto() {
		return this.id_centro_costoFK_IdCentroCosto;
	}

	public void setid_centro_costoFK_IdCentroCosto(Long id_centro_costoFK_IdCentroCosto) {
		this.id_centro_costoFK_IdCentroCosto = id_centro_costoFK_IdCentroCosto;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CentroCostoValorLogic getCentroCostoValorLogic()	{		
		return centrocostovalorLogic;
	}

	public void setCentroCostoValorLogic(CentroCostoValorLogic centrocostovalorLogic) {
		this.centrocostovalorLogic = centrocostovalorLogic;
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
	
	public Boolean getIsEsNuevoCentroCostoValor() {
		return isEsNuevoCentroCostoValor;
	}

	public void setIsEsNuevoCentroCostoValor(Boolean isEsNuevoCentroCostoValor) {
		this.isEsNuevoCentroCostoValor = isEsNuevoCentroCostoValor;
	}

	public Boolean getEsParaAccionDesdeFormularioCentroCostoValor() {
		return esParaAccionDesdeFormularioCentroCostoValor;
	}
	
	public void setEsParaAccionDesdeFormularioCentroCostoValor(Boolean esParaAccionDesdeFormularioCentroCostoValor) {
		this.esParaAccionDesdeFormularioCentroCostoValor = esParaAccionDesdeFormularioCentroCostoValor;
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

			if(this.centrocostovalorSessionBean==null) {
				this.centrocostovalorSessionBean=new CentroCostoValorSessionBean();
			}

			if(!this.centrocostovalorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(centrocostovalorSessionBean.getlidEmpresaActual());
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

			if(this.centrocostovalorSessionBean==null) {
				this.centrocostovalorSessionBean=new CentroCostoValorSessionBean();
			}

			if(!this.centrocostovalorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(centrocostovalorSessionBean.getlidSucursalActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.centrocostovalorSessionBean==null) {
				this.centrocostovalorSessionBean=new CentroCostoValorSessionBean();
			}

			if(!this.centrocostovalorSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(centrocostovalorSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosCentroCostosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.centrocostosForeignKey=new ArrayList<CentroCosto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CentroCostoLogic centrocostoLogic=new CentroCostoLogic();

			//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

			if(this.centrocostovalorSessionBean==null) {
				this.centrocostovalorSessionBean=new CentroCostoValorSessionBean();
			}

			if(!this.centrocostovalorSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

					centrocostoLogic.getTodosCentroCostosWithConnection(sFinalQuery,new Pagination());

					this.centrocostosForeignKey=centrocostoLogic.getCentroCostos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCentroCosto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getEntityWithConnection(centrocostovalorSessionBean.getlidCentroCostoActual());
					this.centrocostosForeignKey.add(centrocostoLogic.getCentroCosto());
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

					if(this.centrocostovalor!=null) {
						this.centrocostovalor.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
						this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_empresaCentroCostoValor.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCentroCostoValor.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
						if(this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_empresaCentroCostoValor.getItemCount()>0) {
							this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_empresaCentroCostoValor.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCentroCostoValorGenerico)throws Exception
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
				jComboBoxid_empresaCentroCostoValorGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCentroCostoValorGenerico!=null && jComboBoxid_empresaCentroCostoValorGenerico.getItemCount()>0) {
					jComboBoxid_empresaCentroCostoValorGenerico.setSelectedIndex(0);
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

					if(this.centrocostovalor!=null) {
						this.centrocostovalor.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
						this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_sucursalCentroCostoValor.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCentroCostoValor.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
						if(this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_sucursalCentroCostoValor.getItemCount()>0) {
							this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_sucursalCentroCostoValor.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCentroCostoValorGenerico)throws Exception
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
				jComboBoxid_sucursalCentroCostoValorGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCentroCostoValorGenerico!=null && jComboBoxid_sucursalCentroCostoValorGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCentroCostoValorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.centrocostovalor!=null) {
						this.centrocostovalor.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
						this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_ejercicioCentroCostoValor.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioCentroCostoValor.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
						if(this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_ejercicioCentroCostoValor.getItemCount()>0) {
							this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_ejercicioCentroCostoValor.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioCentroCostoValorGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioCentroCostoValorGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioCentroCostoValorGenerico!=null && jComboBoxid_ejercicioCentroCostoValorGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioCentroCostoValorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCentroCostoForeignKey(Long idCentroCostoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(centrocostoTemp!=null) {

					if(this.centrocostovalor!=null) {
						this.centrocostovalor.setCentroCosto(centrocostoTemp);
					}

					if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
						this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_centro_costoCentroCostoValor.setSelectedItem(centrocostoTemp);
					}
				} else {
					//jComboBoxid_centro_costoCentroCostoValor.setSelectedItem(centrocostoTemp);
					if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
						if(this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_centro_costoCentroCostoValor.getItemCount()>0) {
							this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_centro_costoCentroCostoValor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){
					if(centrocostoTemp!=null && jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor!=null) {
						jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor.setSelectedItem(centrocostoTemp);
					} else {
						if(jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor!=null) {
							//jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor.setSelectedItem(centrocostoTemp);
							if(jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor.getItemCount()>0) {
								jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualCentroCostoForeignKeyDescripcion(Long idCentroCostoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}


			sDescripcion=CentroCostoConstantesFunciones.getCentroCostoDescripcion(centrocostoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCentroCostoForeignKeyGenerico(Long idCentroCostoSeleccionado,JComboBox jComboBoxid_centro_costoCentroCostoValorGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(centrocostoTemp!=null) {
				jComboBoxid_centro_costoCentroCostoValorGenerico.setSelectedItem(centrocostoTemp);
			} else {
				if(jComboBoxid_centro_costoCentroCostoValorGenerico!=null && jComboBoxid_centro_costoCentroCostoValorGenerico.getItemCount()>0) {
					jComboBoxid_centro_costoCentroCostoValorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CentroCostoValor centrocostovalor,JComboBox jComboBoxid_empresaCentroCostoValorGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCentroCostoValorGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_empresaCentroCostoValor.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCentroCostoValorGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				centrocostovalor.setid_empresa(empresaAux.getId());
				centrocostovalor.setempresa_descripcion(CentroCostoValorConstantesFunciones.getEmpresaDescripcion(empresaAux));
				centrocostovalor.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CentroCostoValor centrocostovalor,JComboBox jComboBoxid_sucursalCentroCostoValorGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCentroCostoValorGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_sucursalCentroCostoValor.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCentroCostoValorGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				centrocostovalor.setid_sucursal(sucursalAux.getId());
				centrocostovalor.setsucursal_descripcion(CentroCostoValorConstantesFunciones.getSucursalDescripcion(sucursalAux));
				centrocostovalor.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(CentroCostoValor centrocostovalor,JComboBox jComboBoxid_ejercicioCentroCostoValorGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioCentroCostoValorGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_ejercicioCentroCostoValor.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioCentroCostoValorGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				centrocostovalor.setid_ejercicio(ejercicioAux.getId());
				centrocostovalor.setejercicio_descripcion(CentroCostoValorConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				centrocostovalor.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCentroCostoForeignKey(CentroCostoValor centrocostovalor,JComboBox jComboBoxid_centro_costoCentroCostoValorGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoAux=new CentroCosto();

			if(jComboBoxid_centro_costoCentroCostoValorGenerico==null) {
				centrocostoAux=(CentroCosto)this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_centro_costoCentroCostoValor.getSelectedItem();
			} else {
				centrocostoAux=(CentroCosto)jComboBoxid_centro_costoCentroCostoValorGenerico.getSelectedItem();
			}

			if(centrocostoAux!=null) {
				centrocostovalor.setid_centro_costo(centrocostoAux.getId());
				centrocostovalor.setcentrocosto_descripcion(CentroCostoValorConstantesFunciones.getCentroCostoDescripcion(centrocostoAux));
				centrocostovalor.setCentroCosto(centrocostoAux);			}
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

					if(!CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { 
							this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_empresaCentroCostoValor.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_empresaCentroCostoValor.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { 
					}

					if(!CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { 
							this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_sucursalCentroCostoValor.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_sucursalCentroCostoValor.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { 
					}

					if(!CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { 
							this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_ejercicioCentroCostoValor.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_ejercicioCentroCostoValor.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { 
					}

					if(!CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCentroCostosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCentroCosto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { 
							this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_centro_costoCentroCostoValor.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_centro_costoCentroCostoValor.addItem(centrocosto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { 
					}

					if(!CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor.addItem(centrocosto);
							}
						}

						if(!CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
							this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_empresaCentroCostoValor.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
							this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_empresaCentroCostoValor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
							this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_sucursalCentroCostoValor.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
							this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_sucursalCentroCostoValor.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
							this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_ejercicioCentroCostoValor.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
							this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_ejercicioCentroCostoValor.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCentroCostoForeignKey(CentroCosto centrocosto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
							this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_centro_costoCentroCostoValor.setSelectedItem(centrocosto);
						}
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
							this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_centro_costoCentroCostoValor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor.setSelectedItem(centrocosto);
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCentroCostoValor() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CentroCostoValorConstantesFunciones.refrescarForeignKeysDescripcionesCentroCostoValor(this.centrocostovalorLogic.getCentroCostoValors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CentroCostoValorConstantesFunciones.refrescarForeignKeysDescripcionesCentroCostoValor(this.centrocostovalors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(CentroCosto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//centrocostovalorLogic.setCentroCostoValors(this.centrocostovalors);
			centrocostovalorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CentroCostoValorParameterReturnGeneral getCentroCostoValorParameterGeneral() {
		return this.centrocostovalorParameterGeneral;
	}
	
	public void setCentroCostoValorParameterGeneral(CentroCostoValorParameterReturnGeneral centrocostovalorParameterGeneral) {
		this.centrocostovalorParameterGeneral = centrocostovalorParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCentroCostoValor() {
		return isPermisoTodoCentroCostoValor;
	}

	public void setIsPermisoTodoCentroCostoValor(Boolean isPermisoTodoCentroCostoValor) {
		this.isPermisoTodoCentroCostoValor = isPermisoTodoCentroCostoValor;
	}

	public Boolean getIsPermisoNuevoCentroCostoValor() {
		return isPermisoNuevoCentroCostoValor;
	}

	public void setIsPermisoNuevoCentroCostoValor(Boolean isPermisoNuevoCentroCostoValor) {
		this.isPermisoNuevoCentroCostoValor = isPermisoNuevoCentroCostoValor;
	}

	public Boolean getIsPermisoActualizarCentroCostoValor() {
		return isPermisoActualizarCentroCostoValor;
	}

	public void setIsPermisoActualizarCentroCostoValor(Boolean isPermisoActualizarCentroCostoValor) {
		this.isPermisoActualizarCentroCostoValor = isPermisoActualizarCentroCostoValor;
	}

	public Boolean getIsPermisoEliminarCentroCostoValor() {
		return isPermisoEliminarCentroCostoValor;
	}

	public void setIsPermisoEliminarCentroCostoValor(Boolean isPermisoEliminarCentroCostoValor) {
		this.isPermisoEliminarCentroCostoValor = isPermisoEliminarCentroCostoValor;
	}

	public Boolean getIsPermisoGuardarCambiosCentroCostoValor() {
		return isPermisoGuardarCambiosCentroCostoValor;
	}

	public void setIsPermisoGuardarCambiosCentroCostoValor(Boolean isPermisoGuardarCambiosCentroCostoValor) {
		this.isPermisoGuardarCambiosCentroCostoValor = isPermisoGuardarCambiosCentroCostoValor;
	}
	
	public Boolean getIsPermisoConsultaCentroCostoValor() {
		return isPermisoConsultaCentroCostoValor;
	}

	public void setIsPermisoConsultaCentroCostoValor(Boolean isPermisoConsultaCentroCostoValor) {
		this.isPermisoConsultaCentroCostoValor = isPermisoConsultaCentroCostoValor;
	}

	public Boolean getIsPermisoBusquedaCentroCostoValor() {
		return isPermisoBusquedaCentroCostoValor;
	}

	public void setIsPermisoBusquedaCentroCostoValor(Boolean isPermisoBusquedaCentroCostoValor) {
		this.isPermisoBusquedaCentroCostoValor = isPermisoBusquedaCentroCostoValor;
	}

	public Boolean getIsPermisoReporteCentroCostoValor() {
		return isPermisoReporteCentroCostoValor;
	}

	public void setIsPermisoReporteCentroCostoValor(Boolean isPermisoReporteCentroCostoValor) {
		this.isPermisoReporteCentroCostoValor = isPermisoReporteCentroCostoValor;
	}
	
	public Boolean getIsPermisoPaginacionMedioCentroCostoValor() {
		return isPermisoPaginacionMedioCentroCostoValor;
	}

	public void setIsPermisoPaginacionMedioCentroCostoValor(Boolean isPermisoPaginacionMedioCentroCostoValor) {
		this.isPermisoPaginacionMedioCentroCostoValor = isPermisoPaginacionMedioCentroCostoValor;
	}
	
	public Boolean getIsPermisoPaginacionTodoCentroCostoValor() {
		return isPermisoPaginacionTodoCentroCostoValor;
	}

	public void setIsPermisoPaginacionTodoCentroCostoValor(Boolean isPermisoPaginacionTodoCentroCostoValor) {
		this.isPermisoPaginacionTodoCentroCostoValor = isPermisoPaginacionTodoCentroCostoValor;
	}
	
	public Boolean getIsPermisoPaginacionAltoCentroCostoValor() {
		return isPermisoPaginacionAltoCentroCostoValor;
	}

	public void setIsPermisoPaginacionAltoCentroCostoValor(Boolean isPermisoPaginacionAltoCentroCostoValor) {
		this.isPermisoPaginacionAltoCentroCostoValor = isPermisoPaginacionAltoCentroCostoValor;
	}
	
	public Boolean getIsPermisoCopiarCentroCostoValor() {
		return isPermisoCopiarCentroCostoValor;
	}

	public void setIsPermisoCopiarCentroCostoValor(Boolean isPermisoCopiarCentroCostoValor) {
		this.isPermisoCopiarCentroCostoValor = isPermisoCopiarCentroCostoValor;
	}
	
	public Boolean getIsPermisoVerFormCentroCostoValor() {
		return isPermisoVerFormCentroCostoValor;
	}

	public void setIsPermisoVerFormCentroCostoValor(Boolean isPermisoVerFormCentroCostoValor) {
		this.isPermisoVerFormCentroCostoValor = isPermisoVerFormCentroCostoValor;
	}
	
	public Boolean getIsPermisoDuplicarCentroCostoValor() {
		return isPermisoDuplicarCentroCostoValor;
	}

	public void setIsPermisoDuplicarCentroCostoValor(Boolean isPermisoDuplicarCentroCostoValor) {
		this.isPermisoDuplicarCentroCostoValor = isPermisoDuplicarCentroCostoValor;
	}
	
	public Boolean getIsPermisoOrdenCentroCostoValor() {
		return isPermisoOrdenCentroCostoValor;
	}

	public void setIsPermisoOrdenCentroCostoValor(Boolean isPermisoOrdenCentroCostoValor) {
		this.isPermisoOrdenCentroCostoValor = isPermisoOrdenCentroCostoValor;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCentroCostoValor() {
		return isVisibilidadCeldaNuevoCentroCostoValor;
	}

	public void setIsVisibilidadCeldaNuevoCentroCostoValor(Boolean isVisibilidadCeldaNuevoCentroCostoValor) {
		this.isVisibilidadCeldaNuevoCentroCostoValor = isVisibilidadCeldaNuevoCentroCostoValor;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCentroCostoValor() {
		return isVisibilidadCeldaDuplicarCentroCostoValor;
	}

	public void setIsVisibilidadCeldaDuplicarCentroCostoValor(Boolean isVisibilidadCeldaDuplicarCentroCostoValor) {
		this.isVisibilidadCeldaDuplicarCentroCostoValor = isVisibilidadCeldaDuplicarCentroCostoValor;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCentroCostoValor() {
		return isVisibilidadCeldaCopiarCentroCostoValor;
	}

	public void setIsVisibilidadCeldaCopiarCentroCostoValor(Boolean isVisibilidadCeldaCopiarCentroCostoValor) {
		this.isVisibilidadCeldaCopiarCentroCostoValor = isVisibilidadCeldaCopiarCentroCostoValor;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCentroCostoValor() {
		return isVisibilidadCeldaVerFormCentroCostoValor;
	}

	public void setIsVisibilidadCeldaVerFormCentroCostoValor(Boolean isVisibilidadCeldaVerFormCentroCostoValor) {
		this.isVisibilidadCeldaVerFormCentroCostoValor = isVisibilidadCeldaVerFormCentroCostoValor;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCentroCostoValor() {
		return isVisibilidadCeldaOrdenCentroCostoValor;
	}

	public void setIsVisibilidadCeldaOrdenCentroCostoValor(Boolean isVisibilidadCeldaOrdenCentroCostoValor) {
		this.isVisibilidadCeldaOrdenCentroCostoValor = isVisibilidadCeldaOrdenCentroCostoValor;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCentroCostoValor() {
		return isVisibilidadCeldaNuevoRelacionesCentroCostoValor;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCentroCostoValor(Boolean isVisibilidadCeldaNuevoRelacionesCentroCostoValor) {
		this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor = isVisibilidadCeldaNuevoRelacionesCentroCostoValor;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCentroCostoValor() {
		return isVisibilidadCeldaModificarCentroCostoValor;
	}

	public void setIsVisibilidadCeldaModificarCentroCostoValor(Boolean isVisibilidadCeldaModificarCentroCostoValor) {
		this.isVisibilidadCeldaModificarCentroCostoValor = isVisibilidadCeldaModificarCentroCostoValor;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCentroCostoValor() {
		return isVisibilidadCeldaActualizarCentroCostoValor;
	}

	public void setIsVisibilidadCeldaActualizarCentroCostoValor(Boolean isVisibilidadCeldaActualizarCentroCostoValor) {
		this.isVisibilidadCeldaActualizarCentroCostoValor = isVisibilidadCeldaActualizarCentroCostoValor;
	}

	public Boolean getIsVisibilidadCeldaEliminarCentroCostoValor() {
		return isVisibilidadCeldaEliminarCentroCostoValor;
	}

	public void setIsVisibilidadCeldaEliminarCentroCostoValor(Boolean isVisibilidadCeldaEliminarCentroCostoValor) {
		this.isVisibilidadCeldaEliminarCentroCostoValor = isVisibilidadCeldaEliminarCentroCostoValor;
	}

	public Boolean getIsVisibilidadCeldaCancelarCentroCostoValor() {
		return isVisibilidadCeldaCancelarCentroCostoValor;
	}

	public void setIsVisibilidadCeldaCancelarCentroCostoValor(Boolean isVisibilidadCeldaCancelarCentroCostoValor) {
		this.isVisibilidadCeldaCancelarCentroCostoValor = isVisibilidadCeldaCancelarCentroCostoValor;
	}

	public Boolean getIsVisibilidadCeldaGuardarCentroCostoValor() {
		return isVisibilidadCeldaGuardarCentroCostoValor;
	}

	public void setIsVisibilidadCeldaGuardarCentroCostoValor(Boolean isVisibilidadCeldaGuardarCentroCostoValor) {
		this.isVisibilidadCeldaGuardarCentroCostoValor = isVisibilidadCeldaGuardarCentroCostoValor;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCentroCostoValor() {
		return isVisibilidadCeldaGuardarCambiosCentroCostoValor;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCentroCostoValor(Boolean isVisibilidadCeldaGuardarCambiosCentroCostoValor) {
		this.isVisibilidadCeldaGuardarCambiosCentroCostoValor = isVisibilidadCeldaGuardarCambiosCentroCostoValor;
	}
		
	public CentroCostoValorSessionBean getcentrocostovalorSessionBean() {
		return this.centrocostovalorSessionBean;
	}
	
	public void setcentrocostovalorSessionBean(CentroCostoValorSessionBean centrocostovalorSessionBean) {
		this.centrocostovalorSessionBean=centrocostovalorSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdCentroCosto() {
		return this.isVisibilidadFK_IdCentroCosto;
	}

	public void setisVisibilidadFK_IdCentroCosto(Boolean isVisibilidadFK_IdCentroCosto) {
		this.isVisibilidadFK_IdCentroCosto=isVisibilidadFK_IdCentroCosto;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(CentroCostoValor centrocostovalor)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(centrocostovalor,null);
				this.setActualParaGuardarSucursalForeignKey(centrocostovalor,null);
				this.setActualParaGuardarEjercicioForeignKey(centrocostovalor,null);
				this.setActualParaGuardarCentroCostoForeignKey(centrocostovalor,null);
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
	
	public void bugActualizarReferenciaActual(CentroCostoValor centrocostovalor,CentroCostoValor centrocostovalorAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCentroCostoValor(centrocostovalor);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		centrocostovalorAux.setId(centrocostovalor.getId());
		centrocostovalorAux.setVersionRow(centrocostovalor.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCentroCostoValor();
		
			int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CentroCostoValorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = centrocostovalorValidator.getInvalidValues(this.centrocostovalor);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			centrocostovalorLogic.setDatosCliente(datosCliente);
			centrocostovalorLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				centrocostovalorAux=new  CentroCostoValor();
				
				centrocostovalorAux.setIsNew(true);
				centrocostovalorAux.setIsChanged(true);
				
				centrocostovalorAux.setCentroCostoValorOriginal(this.centrocostovalor);
				
				centrocostovalorAux.setId(this.centrocostovalor.getId());	
				centrocostovalorAux.setVersionRow(this.centrocostovalor.getVersionRow());	
				centrocostovalorAux.setid_empresa(this.centrocostovalor.getid_empresa());	
				centrocostovalorAux.setid_sucursal(this.centrocostovalor.getid_sucursal());	
				centrocostovalorAux.setid_ejercicio(this.centrocostovalor.getid_ejercicio());	
				centrocostovalorAux.setid_centro_costo(this.centrocostovalor.getid_centro_costo());	
				centrocostovalorAux.setnombre(this.centrocostovalor.getnombre());	
				centrocostovalorAux.setenero(this.centrocostovalor.getenero());	
				centrocostovalorAux.setfebrero(this.centrocostovalor.getfebrero());	
				centrocostovalorAux.setmarzo(this.centrocostovalor.getmarzo());	
				centrocostovalorAux.setabril(this.centrocostovalor.getabril());	
				centrocostovalorAux.setmayo(this.centrocostovalor.getmayo());	
				centrocostovalorAux.setjunio(this.centrocostovalor.getjunio());	
				centrocostovalorAux.setjulio(this.centrocostovalor.getjulio());	
				centrocostovalorAux.setagosto(this.centrocostovalor.getagosto());	
				centrocostovalorAux.setseptiembre(this.centrocostovalor.getseptiembre());	
				centrocostovalorAux.setoctubre(this.centrocostovalor.getoctubre());	
				centrocostovalorAux.setnoviembre(this.centrocostovalor.getnoviembre());	
				centrocostovalorAux.setdiciembre(this.centrocostovalor.getdiciembre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.centrocostovalorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.centrocostovalorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(centrocostovalorAux,centrocostovalorLogic.getCentroCostoValors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centrocostovalorAux,centrocostovalors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.centrocostovalorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.centrocostovalorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostovalorLogic.saveCentroCostoValors();//WithConnection
						//centrocostovalorLogic.getSetVersionRowCentroCostoValors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.centrocostovalor,centrocostovalorAux);
					
					this.refrescarForeignKeysDescripcionesCentroCostoValor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.centrocostovalorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								centrocostovalorLogic.saveCentroCostoValorRelaciones(centrocostovalorAux);//WithConnection
								//centrocostovalorLogic.getSetVersionRowCentroCostoValors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.centrocostovalor,centrocostovalorAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.centrocostovalorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.centrocostovalorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(centrocostovalorAux,centrocostovalorLogic.getCentroCostoValors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(centrocostovalorAux,centrocostovalors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.centrocostovalor,centrocostovalorAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				centrocostovalorAux=new  CentroCostoValor();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado() 
					|| (this.centrocostovalorSessionBean.getEsGuardarRelacionado() && this.centrocostovalor.getId()>=0)) {
						
					centrocostovalorAux.setIsNew(false);
				}
				
				centrocostovalorAux.setIsDeleted(false);
			
				centrocostovalorAux.setId(this.centrocostovalor.getId());	
				centrocostovalorAux.setVersionRow(this.centrocostovalor.getVersionRow());	
				centrocostovalorAux.setid_empresa(this.centrocostovalor.getid_empresa());	
				centrocostovalorAux.setid_sucursal(this.centrocostovalor.getid_sucursal());	
				centrocostovalorAux.setid_ejercicio(this.centrocostovalor.getid_ejercicio());	
				centrocostovalorAux.setid_centro_costo(this.centrocostovalor.getid_centro_costo());	
				centrocostovalorAux.setnombre(this.centrocostovalor.getnombre());	
				centrocostovalorAux.setenero(this.centrocostovalor.getenero());	
				centrocostovalorAux.setfebrero(this.centrocostovalor.getfebrero());	
				centrocostovalorAux.setmarzo(this.centrocostovalor.getmarzo());	
				centrocostovalorAux.setabril(this.centrocostovalor.getabril());	
				centrocostovalorAux.setmayo(this.centrocostovalor.getmayo());	
				centrocostovalorAux.setjunio(this.centrocostovalor.getjunio());	
				centrocostovalorAux.setjulio(this.centrocostovalor.getjulio());	
				centrocostovalorAux.setagosto(this.centrocostovalor.getagosto());	
				centrocostovalorAux.setseptiembre(this.centrocostovalor.getseptiembre());	
				centrocostovalorAux.setoctubre(this.centrocostovalor.getoctubre());	
				centrocostovalorAux.setnoviembre(this.centrocostovalor.getnoviembre());	
				centrocostovalorAux.setdiciembre(this.centrocostovalor.getdiciembre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(centrocostovalorAux,centrocostovalorLogic.getCentroCostoValors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centrocostovalorAux,centrocostovalors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.centrocostovalorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.centrocostovalorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostovalorLogic.saveCentroCostoValors();//WithConnection
						//centrocostovalorLogic.getSetVersionRowCentroCostoValors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.centrocostovalor,centrocostovalorAux);
					
					this.refrescarForeignKeysDescripcionesCentroCostoValor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.centrocostovalorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								centrocostovalorLogic.saveCentroCostoValorRelaciones(centrocostovalorAux);//WithConnection
								//centrocostovalorLogic.getSetVersionRowCentroCostoValors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.centrocostovalor,centrocostovalorAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.centrocostovalorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.centrocostovalorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(centrocostovalorAux,centrocostovalorLogic.getCentroCostoValors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(centrocostovalorAux,centrocostovalors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.centrocostovalor,centrocostovalorAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				centrocostovalorAux=new  CentroCostoValor();
				
				centrocostovalorAux.setIsNew(false);
				centrocostovalorAux.setIsChanged(false);
				
				centrocostovalorAux.setIsDeleted(true);
				
				centrocostovalorAux.setId(this.centrocostovalor.getId());	
				centrocostovalorAux.setVersionRow(this.centrocostovalor.getVersionRow());	
				centrocostovalorAux.setid_empresa(this.centrocostovalor.getid_empresa());	
				centrocostovalorAux.setid_sucursal(this.centrocostovalor.getid_sucursal());	
				centrocostovalorAux.setid_ejercicio(this.centrocostovalor.getid_ejercicio());	
				centrocostovalorAux.setid_centro_costo(this.centrocostovalor.getid_centro_costo());	
				centrocostovalorAux.setnombre(this.centrocostovalor.getnombre());	
				centrocostovalorAux.setenero(this.centrocostovalor.getenero());	
				centrocostovalorAux.setfebrero(this.centrocostovalor.getfebrero());	
				centrocostovalorAux.setmarzo(this.centrocostovalor.getmarzo());	
				centrocostovalorAux.setabril(this.centrocostovalor.getabril());	
				centrocostovalorAux.setmayo(this.centrocostovalor.getmayo());	
				centrocostovalorAux.setjunio(this.centrocostovalor.getjunio());	
				centrocostovalorAux.setjulio(this.centrocostovalor.getjulio());	
				centrocostovalorAux.setagosto(this.centrocostovalor.getagosto());	
				centrocostovalorAux.setseptiembre(this.centrocostovalor.getseptiembre());	
				centrocostovalorAux.setoctubre(this.centrocostovalor.getoctubre());	
				centrocostovalorAux.setnoviembre(this.centrocostovalor.getnoviembre());	
				centrocostovalorAux.setdiciembre(this.centrocostovalor.getdiciembre());	
				
				if(this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.centrocostovalorAux.getId()>=0) {	
						this.centrocostovalorsEliminados.add(centrocostovalorAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(centrocostovalorAux,centrocostovalorLogic.getCentroCostoValors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centrocostovalorAux,centrocostovalors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.centrocostovalorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.centrocostovalorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostovalorLogic.saveCentroCostoValors();//WithConnection
						//centrocostovalorLogic.getSetVersionRowCentroCostoValors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.centrocostovalorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								centrocostovalorLogic.saveCentroCostoValorRelaciones(centrocostovalorAux);//WithConnection
								//centrocostovalorLogic.getSetVersionRowCentroCostoValors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.centrocostovalorSessionBean.getEstaModoGuardarRelaciones() 
								|| this.centrocostovalorSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(centrocostovalorAux,centrocostovalorLogic.getCentroCostoValors());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(centrocostovalorAux,centrocostovalors);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getCentroCostoValors().addAll(this.centrocostovalorsEliminados);
					
					centrocostovalorLogic.saveCentroCostoValors();//WithConnection
					//centrocostovalorLogic.getSetVersionRowCentroCostoValors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCentroCostoValor();
				
				this.centrocostovalorsEliminados= new ArrayList<CentroCostoValor>();		
			}
			
			if(this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Centro Costo Valor GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Centro Costo Valor",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.centrocostovalor=centrocostovalorAux;
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
      		//this.finishProcessCentroCostoValor();
      	}
		
	}	
	
	public void actualizarRelaciones(CentroCostoValor centrocostovalorLocal) throws Exception {
		
		if(this.centrocostovalorSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CentroCostoValor centrocostovalorLocal) throws Exception {	
		if(this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				centrocostovalorLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				centrocostovalorLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				centrocostovalorLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CentroCostoDetalleFormJInternalFrame.class)) {
				CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrameLocal=(CentroCostoBeanSwingJInternalFrame) ((CentroCostoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				centrocostoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCentroCosto(centrocostoBeanSwingJInternalFrameLocal.getcentrocosto(),true);
				centrocostoBeanSwingJInternalFrameLocal.actualizarLista(centrocostoBeanSwingJInternalFrameLocal.centrocosto,this.centrocostosForeignKey);

				centrocostoBeanSwingJInternalFrameLocal.actualizarRelaciones(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				centrocostovalorLocal.setCentroCosto(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey("Formulario");
				this.setActualCentroCostoForeignKey(centrocostoBeanSwingJInternalFrameLocal.centrocosto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCentroCostoValorActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = centrocostovalorValidator.getInvalidValues(this.centrocostovalor);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CentroCostoValor centrocostovalor,List<CentroCostoValor> centrocostovalors) throws Exception {
		try	{		
			CentroCostoValorConstantesFunciones.actualizarLista(centrocostovalor,centrocostovalors,this.centrocostovalorSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CentroCostoValor centrocostovalor,List<CentroCostoValor> centrocostovalors) throws Exception {
		try	{			
			CentroCostoValorConstantesFunciones.actualizarSelectedLista(centrocostovalor,centrocostovalors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CentroCostoValor> centrocostovalorsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				centrocostovalorsLocal=this.centrocostovalorLogic.getCentroCostoValors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				centrocostovalorsLocal=this.centrocostovalors;
			}
			//ARCHITECTURE
		
			for(CentroCostoValor centrocostovalorLocal:centrocostovalorsLocal) {
				if(this.permiteMantenimiento(centrocostovalorLocal) && centrocostovalorLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CentroCostoValorConstantesFunciones.getCentroCostoValorLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CentroCostoValorConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelid_empresaCentroCostoValor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoValorConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelid_sucursalCentroCostoValor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoValorConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelid_ejercicioCentroCostoValor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoValorConstantesFunciones.IDCENTROCOSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelid_centro_costoCentroCostoValor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoValorConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelnombreCentroCostoValor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoValorConstantesFunciones.ENERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabeleneroCentroCostoValor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoValorConstantesFunciones.FEBRERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelfebreroCentroCostoValor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoValorConstantesFunciones.MARZO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelmarzoCentroCostoValor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoValorConstantesFunciones.ABRIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelabrilCentroCostoValor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoValorConstantesFunciones.MAYO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelmayoCentroCostoValor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoValorConstantesFunciones.JUNIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabeljunioCentroCostoValor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoValorConstantesFunciones.JULIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabeljulioCentroCostoValor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoValorConstantesFunciones.AGOSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelagostoCentroCostoValor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoValorConstantesFunciones.SEPTIEMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelseptiembreCentroCostoValor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoValorConstantesFunciones.OCTUBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabeloctubreCentroCostoValor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoValorConstantesFunciones.NOVIEMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelnoviembreCentroCostoValor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoValorConstantesFunciones.DICIEMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabeldiciembreCentroCostoValor,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoValor.jLabelid_empresaCentroCostoValor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoValor.jLabelid_sucursalCentroCostoValor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoValor.jLabelid_ejercicioCentroCostoValor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoValor.jLabelid_centro_costoCentroCostoValor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoValor.jLabelnombreCentroCostoValor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoValor.jLabeleneroCentroCostoValor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoValor.jLabelfebreroCentroCostoValor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoValor.jLabelmarzoCentroCostoValor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoValor.jLabelabrilCentroCostoValor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoValor.jLabelmayoCentroCostoValor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoValor.jLabeljunioCentroCostoValor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoValor.jLabeljulioCentroCostoValor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoValor.jLabelagostoCentroCostoValor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoValor.jLabelseptiembreCentroCostoValor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoValor.jLabeloctubreCentroCostoValor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoValor.jLabelnoviembreCentroCostoValor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoValor.jLabeldiciembreCentroCostoValor,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoCentroCostoValor--;	
		
		
		this.centrocostovalorAux=new CentroCostoValor();
		
		this.centrocostovalorAux.setId(this.iIdNuevoCentroCostoValor);
		this.centrocostovalorAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.centrocostovalorLogic.getCentroCostoValors().add(this.centrocostovalorAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.centrocostovalors.add(this.centrocostovalorAux);
		}
		//ARCHITECTURE
		
		this.centrocostovalor=this.centrocostovalorAux;
		
		if(CentroCostoValorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCentroCostoValor(this.centrocostovalor);
			this.setVariablesObjetoActualToFormularioForeignKeyCentroCostoValor(this.centrocostovalor);
		}
				
		//this.setDefaultControlesCentroCostoValor();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCentroCostoValor();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCentroCostoValor();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCentroCostoValor();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCentroCostoValor(this.centrocostovalorBean,this.centrocostovalor,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CentroCostoValorConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.centrocostovalorSessionBean.getConGuardarRelaciones()) {
			classes=CentroCostoValorConstantesFunciones.getClassesRelationshipsOfCentroCostoValor(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.centrocostovalorReturnGeneral=centrocostovalorLogic.procesarEventosCentroCostoValorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.centrocostovalorLogic.getCentroCostoValors(),this.centrocostovalor,this.centrocostovalorParameterGeneral,this.isEsNuevoCentroCostoValor,classes);//this.centrocostovalorLogic.getCentroCostoValor()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCentroCostoValor(this.centrocostovalorReturnGeneral,this.centrocostovalorBean,false);
		
		if(this.centrocostovalorReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCentroCostoValor(this.centrocostovalorReturnGeneral.getCentroCostoValor());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCentroCostoValor(this.centrocostovalorReturnGeneral.getCentroCostoValor());
		}
		
		if(this.centrocostovalorReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCentroCostoValor(this.centrocostovalorReturnGeneral.getCentroCostoValor(),classes);//this.centrocostovalorBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCentroCostoValor();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCentroCostoValor();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CentroCostoValorBeanSwingJInternalFrameAdditional.RecargarFormCentroCostoValor(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCentroCostoValor(false);
						
			if(centrocostovalorSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCentroCostoValor();
			}
			
			this.actualizarVisualTableDatosCentroCostoValor();
			
			this.jTableDatosCentroCostoValor.setRowSelectionInterval(this.getIndiceNuevoCentroCostoValor(), this.getIndiceNuevoCentroCostoValor());
			
			this.seleccionarFilaTablaCentroCostoValorActual();
						
			this.actualizarEstadoCeldasBotonesCentroCostoValor("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCentroCostoValor(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldnombreCentroCostoValor.setEnabled(isHabilitar && this.centrocostovalorConstantesFunciones.activarnombreCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldeneroCentroCostoValor.setEnabled(isHabilitar && this.centrocostovalorConstantesFunciones.activareneroCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldfebreroCentroCostoValor.setEnabled(isHabilitar && this.centrocostovalorConstantesFunciones.activarfebreroCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldmarzoCentroCostoValor.setEnabled(isHabilitar && this.centrocostovalorConstantesFunciones.activarmarzoCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldabrilCentroCostoValor.setEnabled(isHabilitar && this.centrocostovalorConstantesFunciones.activarabrilCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldmayoCentroCostoValor.setEnabled(isHabilitar && this.centrocostovalorConstantesFunciones.activarmayoCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldjunioCentroCostoValor.setEnabled(isHabilitar && this.centrocostovalorConstantesFunciones.activarjunioCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldjulioCentroCostoValor.setEnabled(isHabilitar && this.centrocostovalorConstantesFunciones.activarjulioCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldagostoCentroCostoValor.setEnabled(isHabilitar && this.centrocostovalorConstantesFunciones.activaragostoCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldseptiembreCentroCostoValor.setEnabled(isHabilitar && this.centrocostovalorConstantesFunciones.activarseptiembreCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldoctubreCentroCostoValor.setEnabled(isHabilitar && this.centrocostovalorConstantesFunciones.activaroctubreCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldnoviembreCentroCostoValor.setEnabled(isHabilitar && this.centrocostovalorConstantesFunciones.activarnoviembreCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFielddiciembreCentroCostoValor.setEnabled(isHabilitar && this.centrocostovalorConstantesFunciones.activardiciembreCentroCostoValor);	
		//
		this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_empresaCentroCostoValor.setEnabled(isHabilitar && this.centrocostovalorConstantesFunciones.activarid_empresaCentroCostoValor);//
		this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_sucursalCentroCostoValor.setEnabled(isHabilitar && this.centrocostovalorConstantesFunciones.activarid_sucursalCentroCostoValor);//
		this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_ejercicioCentroCostoValor.setEnabled(isHabilitar && this.centrocostovalorConstantesFunciones.activarid_ejercicioCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_centro_costoCentroCostoValor.setEnabled(isHabilitar && this.centrocostovalorConstantesFunciones.activarid_centro_costoCentroCostoValor);
	};
	
	public void setDefaultControlesCentroCostoValor() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCentroCostoValor(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.centrocostovalorSessionBean.setConGuardarRelaciones(true);			
			this.centrocostovalorSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCentroCostoValor.jTabbedPaneRelacionesCentroCostoValor.setVisible(true);
			
					
		} else {
			//this.centrocostovalorSessionBean.setConGuardarRelaciones(false);			
			this.centrocostovalorSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCentroCostoValor.jTabbedPaneRelacionesCentroCostoValor.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCentroCostoValor() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCostoValor centrocostovalorAux:this.centrocostovalorLogic.getCentroCostoValors()) {
				if(centrocostovalorAux.getId().equals(this.iIdNuevoCentroCostoValor)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCostoValor centrocostovalorAux:this.centrocostovalors) {
				if(centrocostovalorAux.getId().equals(this.iIdNuevoCentroCostoValor)) {
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
	
	public int getIndiceActualCentroCostoValor(CentroCostoValor centrocostovalor,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCostoValor centrocostovalorAux:this.centrocostovalorLogic.getCentroCostoValors()) {
				if(centrocostovalorAux.getId().equals(centrocostovalor.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCostoValor centrocostovalorAux:this.centrocostovalors) {
				if(centrocostovalorAux.getId().equals(centrocostovalor.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCentroCostoValor(CentroCostoValor centrocostovalorOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCostoValor centrocostovalorAux:this.centrocostovalorLogic.getCentroCostoValors()) {
				if(centrocostovalorAux.getCentroCostoValorOriginal().getId().equals(centrocostovalorOriginal.getId())) {
					existe=true;
					centrocostovalorOriginal.setId(centrocostovalorAux.getId());
					centrocostovalorOriginal.setVersionRow(centrocostovalorAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCostoValor centrocostovalorAux:this.centrocostovalors) {
				if(centrocostovalorAux.getCentroCostoValorOriginal().getId().equals(centrocostovalorOriginal.getId())) {
					existe=true;
					centrocostovalorOriginal.setId(centrocostovalorAux.getId());
					centrocostovalorOriginal.setVersionRow(centrocostovalorAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCentroCostoValor(Boolean esParaCancelar) throws Exception {
		centrocostovalorsAux=new ArrayList<CentroCostoValor>();
		centrocostovalorAux=new CentroCostoValor();
		
		if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CentroCostoValor centrocostovalorAux:this.centrocostovalorLogic.getCentroCostoValors()) {
					if(centrocostovalorAux.getId()<0) {
						centrocostovalorsAux.add(centrocostovalorAux);
					}		
				}
				this.iIdNuevoCentroCostoValor=0L;
				this.centrocostovalorLogic.getCentroCostoValors().removeAll(centrocostovalorsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroCostoValor centrocostovalorAux:this.centrocostovalors) {
					if(centrocostovalorAux.getId()<0) {
						centrocostovalorsAux.add(centrocostovalorAux);
					}		
				}
				this.iIdNuevoCentroCostoValor=0L;
				this.centrocostovalors.removeAll(centrocostovalorsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCentroCostoValor 
					&& this.centrocostovalorLogic.getCentroCostoValors().size()>0
					) {
					centrocostovalorAux=this.centrocostovalorLogic.getCentroCostoValors().get(this.centrocostovalorLogic.getCentroCostoValors().size() - 1);
				
					if(centrocostovalorAux.getId()<0) {
						this.centrocostovalorLogic.getCentroCostoValors().remove(centrocostovalorAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCentroCostoValor && this.centrocostovalors.size()>0) {
					centrocostovalorAux=this.centrocostovalors.get(this.centrocostovalors.size() - 1);
				
					if(centrocostovalorAux.getId()<0) {
						this.centrocostovalors.remove(centrocostovalorAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCentroCostoValor(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(centrocostovalor.getId()<0) {
				this.centrocostovalorLogic.getCentroCostoValors().remove(this.centrocostovalor);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(centrocostovalor.getId()<0) {
				this.centrocostovalors.remove(this.centrocostovalor);
			}
		}			
	}
	
	public void setEstadosInicialesCentroCostoValor(List<CentroCostoValor> centrocostovalorsAux) throws Exception {
		CentroCostoValorConstantesFunciones.setEstadosInicialesCentroCostoValor(centrocostovalorsAux);
	}
	
	public void setEstadosInicialesCentroCostoValor(CentroCostoValor centrocostovalorAux) throws Exception {
		CentroCostoValorConstantesFunciones.setEstadosInicialesCentroCostoValor(centrocostovalorAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCentroCostoValorActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCentroCostoValor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCentroCostoValorActual()) {
				if(!this.isEsNuevoCentroCostoValor) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCentroCostoValor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCentroCostoValor=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCentroCostoValorActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Centro Costo Valor ?", "MANTENIMIENTO DE Centro Costo Valor", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCentroCostoValor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CentroCostoValor centrocostovalor) throws Exception {
		CentroCostoValorConstantesFunciones.seleccionarAsignar(this.centrocostovalor,centrocostovalor);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCentroCostoValor=this.isPermisoActualizarOriginalCentroCostoValor;
			
			
			this.seleccionarAsignar(centrocostovalor);
			
			

			idCentroCostoActual=centrocostovalor.getid_centro_costo();
			this.seleccionarCentroCostoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CentroCostoValorConstantesFunciones.quitarEspaciosCentroCostoValor(this.centrocostovalor,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCentroCostoValor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.centrocostovalorSessionBean.setsFuncionBusquedaRapida(this.centrocostovalorSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarCentroCostoActual() throws Exception {
		try	{
			CentroCosto centrocostoAux=new CentroCosto();

			if(this.idCentroCostoActual != null && this.idCentroCostoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getEntityWithConnection(this.idCentroCostoActual);
					centrocostoAux= centrocostoLogic.getCentroCosto();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				centrocostosForeignKey=new ArrayList<CentroCosto>();
				centrocostosForeignKey.add(centrocostoAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCentroCostoValor) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCentroCostoValor(esParaCancelar);				
				this.cancelarNuevoCentroCostoValor(esParaCancelar);								
			}
			
			this.centrocostovalor=new CentroCostoValor();
			
			this.inicializarCentroCostoValor();
			
			this.actualizarEstadoCeldasBotonesCentroCostoValor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCentroCostoValor() throws Exception {
		try {
			CentroCostoValorConstantesFunciones.inicializarCentroCostoValor(this.centrocostovalor);
			
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
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.centrocostovalorLogic.getCentroCostoValors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCentroCostoValors(String sAccionBusqueda,List<CentroCostoValor> centrocostovalorsParaReportes) throws Exception {
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
					sPathReporteFinal="CentroCostoValor"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CentroCostoValorMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CentroCostoValorMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CentroCostoValor"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Centro Costo Valores");		
		parameters.put("busquedapor", CentroCostoValorConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCentroCostoValor=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CentroCostoValorConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CentroCostoValorConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCentroCostoValor=new JRBeanArrayDataSource(CentroCostoValorJInternalFrame.TraerCentroCostoValorBeans(centrocostovalorsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCentroCostoValor);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CentroCostoValorConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CentroCostoValorConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CentroCostoValorBean.TraerCentroCostoValorBeans(centrocostovalorsParaReportes).toArray()));
							
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
				this.generarExcelReporteCentroCostoValors(sAccionBusqueda,sTipoArchivoReporte,centrocostovalorsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCentroCostoValors(sAccionBusqueda,sTipoArchivoReporte,centrocostovalorsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCentroCostoValorActionPerformed(null);
					//this.generarExcelReporteCentroCostoValors(sAccionBusqueda,sTipoArchivoReporte,centrocostovalorsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCentroCostoValors(sAccionBusqueda,sTipoArchivoReporte,centrocostovalorsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCentroCostoValors(sAccionBusqueda,sTipoArchivoReporte,centrocostovalorsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCentroCostoValors(sAccionBusqueda,sTipoArchivoReporte,centrocostovalorsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCentroCostoValors(String sAccionBusqueda,String sTipoArchivoReporte,List<CentroCostoValor> centrocostovalorsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostovalor";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CentroCostoValors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCentroCostoValor("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CentroCostoValor centrocostovalor : centrocostovalorsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CentroCostoValorConstantesFunciones.generarExcelReporteDataCentroCostoValor("NORMAL",row,workbook,centrocostovalor,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Valor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCentroCostoValor(String sTipo,Row row,Workbook workbook) {
		
		CentroCostoValorConstantesFunciones.generarExcelReporteHeaderCentroCostoValor(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCentroCostoValors(String sAccionBusqueda,String sTipoArchivoReporte,List<CentroCostoValor> centrocostovalorsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostovalor_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CentroCostoValors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CentroCostoValor centrocostovalor : centrocostovalorsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CentroCostoValorConstantesFunciones.getCentroCostoValorDescripcion(centrocostovalor));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoValorConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostovalor.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoValorConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostovalor.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoValorConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostovalor.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoValorConstantesFunciones.LABEL_IDCENTROCOSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_IDCENTROCOSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostovalor.getcentrocosto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoValorConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostovalor.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoValorConstantesFunciones.LABEL_ENERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_ENERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostovalor.getenero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoValorConstantesFunciones.LABEL_FEBRERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_FEBRERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostovalor.getfebrero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoValorConstantesFunciones.LABEL_MARZO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_MARZO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostovalor.getmarzo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoValorConstantesFunciones.LABEL_ABRIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_ABRIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostovalor.getabril());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoValorConstantesFunciones.LABEL_MAYO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_MAYO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostovalor.getmayo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoValorConstantesFunciones.LABEL_JUNIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_JUNIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostovalor.getjunio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoValorConstantesFunciones.LABEL_JULIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_JULIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostovalor.getjulio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoValorConstantesFunciones.LABEL_AGOSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_AGOSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostovalor.getagosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoValorConstantesFunciones.LABEL_SEPTIEMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_SEPTIEMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostovalor.getseptiembre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoValorConstantesFunciones.LABEL_OCTUBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_OCTUBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostovalor.getoctubre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoValorConstantesFunciones.LABEL_NOVIEMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_NOVIEMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostovalor.getnoviembre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoValorConstantesFunciones.LABEL_DICIEMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_DICIEMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostovalor.getdiciembre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Valor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCentroCostoValors(String sAccionBusqueda,String sTipoArchivoReporte,List<CentroCostoValor> centrocostovalorsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CentroCostoValor> centrocostovalorsRespaldo=null;
		
		classes=CentroCostoValorConstantesFunciones.getClassesRelationshipsOfCentroCostoValor(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.centrocostovalorLogic.setDatosCliente(this.datosCliente);
		this.centrocostovalorLogic.setDatosDeep(this.datosDeep);
		this.centrocostovalorLogic.setIsConDeep(true);
		
		centrocostovalorsRespaldo=this.centrocostovalorLogic.getCentroCostoValors();
		
		this.centrocostovalorLogic.setCentroCostoValors(centrocostovalorsParaReportes);	
		this.centrocostovalorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		centrocostovalorsParaReportes=this.centrocostovalorLogic.getCentroCostoValors();
		this.centrocostovalorLogic.setCentroCostoValors(centrocostovalorsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostovalor_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CentroCostoValors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCentroCostoValor("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CentroCostoValor centrocostovalor : centrocostovalorsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCentroCostoValor("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CentroCostoValorConstantesFunciones.generarExcelReporteDataCentroCostoValor("NORMAL",row,workbook,centrocostovalor,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CentroCostoValorConstantesFunciones.getCentroCostoValorDescripcion(centrocostovalor));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Valor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCentroCostoValor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCostoValor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCentroCostoValor.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCostoValor.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCentroCostoValor() throws Exception {		
		this.startProcessCentroCostoValor(true);
	}
	
	public void startProcessCentroCostoValor(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCentroCostoValor ,this.jPanelParametrosReportesCentroCostoValor, this.jScrollPanelDatosCentroCostoValor,this.jPanelPaginacionCentroCostoValor, this.jScrollPanelDatosEdicionCentroCostoValor, this.jPanelAccionesCentroCostoValor,this.jPanelAccionesFormularioCentroCostoValor,this.jmenuBarCentroCostoValor,this.jmenuBarDetalleCentroCostoValor,this.jTtoolBarCentroCostoValor,this.jTtoolBarDetalleCentroCostoValor);		
		
		final JTabbedPane jTabbedPaneBusquedasCentroCostoValor=this.jTabbedPaneBusquedasCentroCostoValor; 
		
		final JPanel jPanelParametrosReportesCentroCostoValor=this.jPanelParametrosReportesCentroCostoValor;
		//final JScrollPane jScrollPanelDatosCentroCostoValor=this.jScrollPanelDatosCentroCostoValor;
		final JTable jTableDatosCentroCostoValor=this.jTableDatosCentroCostoValor;		
		final JPanel jPanelPaginacionCentroCostoValor=this.jPanelPaginacionCentroCostoValor;
		//final JScrollPane jScrollPanelDatosEdicionCentroCostoValor=this.jScrollPanelDatosEdicionCentroCostoValor;
		final JPanel jPanelAccionesCentroCostoValor=this.jPanelAccionesCentroCostoValor;
		
		JPanel jPanelCamposAuxiliarCentroCostoValor=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCentroCostoValor=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
			jPanelCamposAuxiliarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jPanelCamposCentroCostoValor;
			jPanelAccionesFormularioAuxiliarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jPanelAccionesFormularioCentroCostoValor;
		}
		
		final JPanel jPanelCamposCentroCostoValor=jPanelCamposAuxiliarCentroCostoValor;
		final JPanel jPanelAccionesFormularioCentroCostoValor=jPanelAccionesFormularioAuxiliarCentroCostoValor;
		
		
		final JMenuBar jmenuBarCentroCostoValor=this.jmenuBarCentroCostoValor;
		final JToolBar jTtoolBarCentroCostoValor=this.jTtoolBarCentroCostoValor;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCentroCostoValor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCentroCostoValor=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
			jmenuBarDetalleAuxiliarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jmenuBarDetalleCentroCostoValor;
			jTtoolBarDetalleAuxiliarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jTtoolBarDetalleCentroCostoValor;
		}
		
		final JMenuBar jmenuBarDetalleCentroCostoValor=jmenuBarDetalleAuxiliarCentroCostoValor;
		final JToolBar jTtoolBarDetalleCentroCostoValor=jTtoolBarDetalleAuxiliarCentroCostoValor;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCentroCostoValor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCentroCostoValor;
			processRunnable.jTableDatos=jTableDatosCentroCostoValor;
			processRunnable.jPanelCampos=jPanelCamposCentroCostoValor;
			processRunnable.jPanelPaginacion=jPanelPaginacionCentroCostoValor;
			processRunnable.jPanelAcciones=jPanelAccionesCentroCostoValor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCentroCostoValor;
			
			
			processRunnable.jmenuBar=jmenuBarCentroCostoValor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCentroCostoValor;
			processRunnable.jTtoolBar=jTtoolBarCentroCostoValor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCentroCostoValor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCentroCostoValor ,jPanelParametrosReportesCentroCostoValor,jTableDatosCentroCostoValor, /*jScrollPanelDatosCentroCostoValor,*/jPanelCamposCentroCostoValor,jPanelPaginacionCentroCostoValor, /*jScrollPanelDatosEdicionCentroCostoValor,*/ jPanelAccionesCentroCostoValor,jPanelAccionesFormularioCentroCostoValor,jmenuBarCentroCostoValor,jmenuBarDetalleCentroCostoValor,jTtoolBarCentroCostoValor,jTtoolBarDetalleCentroCostoValor);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCentroCostoValor ,jPanelParametrosReportesCentroCostoValor, jScrollPanelDatosCentroCostoValor,jPanelPaginacionCentroCostoValor, jScrollPanelDatosEdicionCentroCostoValor, jPanelAccionesCentroCostoValor,jPanelAccionesFormularioCentroCostoValor,jmenuBarCentroCostoValor,jmenuBarDetalleCentroCostoValor,jTtoolBarCentroCostoValor,jTtoolBarDetalleCentroCostoValor);
						
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
	
	public void finishProcessCentroCostoValor() {// throws Exception 
		this.finishProcessCentroCostoValor(true);
	}
	
	public void finishProcessCentroCostoValor(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCentroCostoValor ,this.jPanelParametrosReportesCentroCostoValor, this.jScrollPanelDatosCentroCostoValor,this.jPanelPaginacionCentroCostoValor, this.jScrollPanelDatosEdicionCentroCostoValor, this.jPanelAccionesCentroCostoValor,this.jPanelAccionesFormularioCentroCostoValor,this.jmenuBarCentroCostoValor,this.jmenuBarDetalleCentroCostoValor,this.jTtoolBarCentroCostoValor,this.jTtoolBarDetalleCentroCostoValor);		
		
		final JTabbedPane jTabbedPaneBusquedasCentroCostoValor=this.jTabbedPaneBusquedasCentroCostoValor; 
		
		final JPanel jPanelParametrosReportesCentroCostoValor=this.jPanelParametrosReportesCentroCostoValor;
		//final JScrollPane jScrollPanelDatosCentroCostoValor=this.jScrollPanelDatosCentroCostoValor;
		final JTable jTableDatosCentroCostoValor=this.jTableDatosCentroCostoValor;		
		final JPanel jPanelPaginacionCentroCostoValor=this.jPanelPaginacionCentroCostoValor;
		//final JScrollPane jScrollPanelDatosEdicionCentroCostoValor=this.jScrollPanelDatosEdicionCentroCostoValor;
		final JPanel jPanelAccionesCentroCostoValor=this.jPanelAccionesCentroCostoValor;
		
		JPanel jPanelCamposAuxiliarCentroCostoValor=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCentroCostoValor=new JPanel();
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
			jPanelCamposAuxiliarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jPanelCamposCentroCostoValor;
			jPanelAccionesFormularioAuxiliarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jPanelAccionesFormularioCentroCostoValor;
		}
		
		final JPanel jPanelCamposCentroCostoValor=jPanelCamposAuxiliarCentroCostoValor;
		final JPanel jPanelAccionesFormularioCentroCostoValor=jPanelAccionesFormularioAuxiliarCentroCostoValor;
		
		
		final JMenuBar jmenuBarCentroCostoValor=this.jmenuBarCentroCostoValor;		
		final JToolBar jTtoolBarCentroCostoValor=this.jTtoolBarCentroCostoValor;
				
		JMenuBar jmenuBarDetalleAuxiliarCentroCostoValor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCentroCostoValor=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
			jmenuBarDetalleAuxiliarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jmenuBarDetalleCentroCostoValor;
			jTtoolBarDetalleAuxiliarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jTtoolBarDetalleCentroCostoValor;		
		}
		
		final JMenuBar jmenuBarDetalleCentroCostoValor=jmenuBarDetalleAuxiliarCentroCostoValor;
		final JToolBar jTtoolBarDetalleCentroCostoValor=jTtoolBarDetalleAuxiliarCentroCostoValor;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCentroCostoValor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCentroCostoValor;
			processRunnable.jTableDatos=jTableDatosCentroCostoValor;
			processRunnable.jPanelCampos=jPanelCamposCentroCostoValor;
			processRunnable.jPanelPaginacion=jPanelPaginacionCentroCostoValor;
			processRunnable.jPanelAcciones=jPanelAccionesCentroCostoValor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCentroCostoValor;
			
			
			processRunnable.jmenuBar=jmenuBarCentroCostoValor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCentroCostoValor;
			processRunnable.jTtoolBar=jTtoolBarCentroCostoValor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCentroCostoValor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCentroCostoValor ,jPanelParametrosReportesCentroCostoValor, jTableDatosCentroCostoValor,/*jScrollPanelDatosCentroCostoValor,*/jPanelCamposCentroCostoValor,jPanelPaginacionCentroCostoValor, /*jScrollPanelDatosEdicionCentroCostoValor,*/ jPanelAccionesCentroCostoValor,jPanelAccionesFormularioCentroCostoValor,jmenuBarCentroCostoValor,jmenuBarDetalleCentroCostoValor,jTtoolBarCentroCostoValor,jTtoolBarDetalleCentroCostoValor));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCentroCostoValor(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCentroCostoValor(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCentroCostoValor(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCentroCostoValor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCentroCostoValor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCentroCostoValor,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCentroCostoValor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCentroCostoValor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCentroCostoValor,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.centrocostovalorConstantesFunciones.getsFinalQueryCentroCostoValor();
		String  finalQueryPaginacionTodos=this.centrocostovalorConstantesFunciones.getsFinalQueryCentroCostoValor();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CentroCostoValorConstantesFunciones.getArrayColumnasGlobalesNoCentroCostoValor(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CentroCostoValorConstantesFunciones.getArrayColumnasGlobalesCentroCostoValor(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CentroCostoValorConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.centrocostovalorsEliminados= new ArrayList<CentroCostoValor>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCentroCostoValor();
		
				///*CentroCostoValorSessionBean*/this.centrocostovalorSessionBean=new CentroCostoValorSessionBean();
			
			if(this.centrocostovalorSessionBean==null) {
				this.centrocostovalorSessionBean=new CentroCostoValorSessionBean();
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
					this.iNumeroPaginacion=CentroCostoValorConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CentroCostoValorConstantesFunciones.getClassesForeignKeysOfCentroCostoValor(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/centrocostovalor."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			centrocostovalorsAux= new ArrayList<CentroCostoValor>();
			
				
			centrocostovalorLogic.setDatosCliente(this.datosCliente);
			centrocostovalorLogic.setDatosDeep(this.datosDeep);
			centrocostovalorLogic.setIsConDeep(true);
			
			
			centrocostovalorLogic.getCentroCostoValorDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					centrocostovalorLogic.getTodosCentroCostoValors(finalQueryGlobal,pagination);
					
					//centrocostovalorLogic.getTodosCentroCostoValorsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(centrocostovalorLogic.getCentroCostoValors()==null|| centrocostovalorLogic.getCentroCostoValors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							centrocostovalorsAux= new ArrayList<CentroCostoValor>();
							centrocostovalorsAux.addAll(centrocostovalorLogic.getCentroCostoValors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostovalorsAux= new ArrayList<CentroCostoValor>();
							centrocostovalorsAux.addAll(centrocostovalors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							centrocostovalorLogic.getTodosCentroCostoValors(finalQueryGlobal+"",this.pagination);												
							
							//centrocostovalorLogic.getTodosCentroCostoValorsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCentroCostoValors("Todos",centrocostovalorLogic.getCentroCostoValors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							centrocostovalorLogic.setCentroCostoValors(new ArrayList<CentroCostoValor>());					
							centrocostovalorLogic.getCentroCostoValors().addAll(centrocostovalorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostovalors=new ArrayList<CentroCostoValor>();
							centrocostovalors.addAll(centrocostovalorsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCentroCostoValor=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCentroCostoValor=this.idActual;
				
				} else if(this.idCentroCostoValorActual!=null && this.idCentroCostoValorActual!=0L) {
					idCentroCostoValor=idCentroCostoValorActual;
				}
				
					
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndicePorId(idCentroCostoValor);
				
				this.centrocostovalors=new ArrayList<CentroCostoValor>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					centrocostovalorLogic.getEntity(idCentroCostoValor);
					
					//centrocostovalorLogic.getEntityWithConnection(idCentroCostoValor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostovalorLogic.setCentroCostoValors(new ArrayList<CentroCostoValor>());
					centrocostovalorLogic.getCentroCostoValors().add(centrocostovalorLogic.getCentroCostoValor());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostovalors=new ArrayList<CentroCostoValor>();
					this.centrocostovalors.add(centrocostovalor);
				}
				
				if(centrocostovalorLogic.getCentroCostoValor()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centrocostovalorLogic.getCentroCostoValorsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centrocostovalorLogic.getCentroCostoValors()==null||centrocostovalorLogic.getCentroCostoValors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centrocostovalors==null|| centrocostovalors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostovalorsAux=new ArrayList<CentroCostoValor>();
						centrocostovalorsAux.addAll(centrocostovalorLogic.getCentroCostoValors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostovalorsAux=new ArrayList<CentroCostoValor>();
							centrocostovalorsAux.addAll(centrocostovalors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centrocostovalorLogic.getCentroCostoValorsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroCostoValors("BusquedaPorNombre",centrocostovalorLogic.getCentroCostoValors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroCostoValors("BusquedaPorNombre",centrocostovalors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostovalorLogic.setCentroCostoValors(new ArrayList<CentroCostoValor>());
						centrocostovalorLogic.getCentroCostoValors().addAll(centrocostovalorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostovalors=new ArrayList<CentroCostoValor>();
							centrocostovalors.addAll(centrocostovalorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCentroCosto")) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centrocostovalorLogic.getCentroCostoValorsFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centrocostovalorLogic.getCentroCostoValors()==null||centrocostovalorLogic.getCentroCostoValors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centrocostovalors==null|| centrocostovalors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostovalorsAux=new ArrayList<CentroCostoValor>();
						centrocostovalorsAux.addAll(centrocostovalorLogic.getCentroCostoValors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostovalorsAux=new ArrayList<CentroCostoValor>();
							centrocostovalorsAux.addAll(centrocostovalors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centrocostovalorLogic.getCentroCostoValorsFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroCostoValors("FK_IdCentroCosto",centrocostovalorLogic.getCentroCostoValors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroCostoValors("FK_IdCentroCosto",centrocostovalors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostovalorLogic.setCentroCostoValors(new ArrayList<CentroCostoValor>());
						centrocostovalorLogic.getCentroCostoValors().addAll(centrocostovalorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostovalors=new ArrayList<CentroCostoValor>();
							centrocostovalors.addAll(centrocostovalorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centrocostovalorLogic.getCentroCostoValorsFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centrocostovalorLogic.getCentroCostoValors()==null||centrocostovalorLogic.getCentroCostoValors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centrocostovalors==null|| centrocostovalors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostovalorsAux=new ArrayList<CentroCostoValor>();
						centrocostovalorsAux.addAll(centrocostovalorLogic.getCentroCostoValors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostovalorsAux=new ArrayList<CentroCostoValor>();
							centrocostovalorsAux.addAll(centrocostovalors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centrocostovalorLogic.getCentroCostoValorsFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroCostoValors("FK_IdEjercicio",centrocostovalorLogic.getCentroCostoValors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroCostoValors("FK_IdEjercicio",centrocostovalors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostovalorLogic.setCentroCostoValors(new ArrayList<CentroCostoValor>());
						centrocostovalorLogic.getCentroCostoValors().addAll(centrocostovalorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostovalors=new ArrayList<CentroCostoValor>();
							centrocostovalors.addAll(centrocostovalorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centrocostovalorLogic.getCentroCostoValorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centrocostovalorLogic.getCentroCostoValors()==null||centrocostovalorLogic.getCentroCostoValors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centrocostovalors==null|| centrocostovalors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostovalorsAux=new ArrayList<CentroCostoValor>();
						centrocostovalorsAux.addAll(centrocostovalorLogic.getCentroCostoValors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostovalorsAux=new ArrayList<CentroCostoValor>();
							centrocostovalorsAux.addAll(centrocostovalors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centrocostovalorLogic.getCentroCostoValorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroCostoValors("FK_IdEmpresa",centrocostovalorLogic.getCentroCostoValors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroCostoValors("FK_IdEmpresa",centrocostovalors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostovalorLogic.setCentroCostoValors(new ArrayList<CentroCostoValor>());
						centrocostovalorLogic.getCentroCostoValors().addAll(centrocostovalorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostovalors=new ArrayList<CentroCostoValor>();
							centrocostovalors.addAll(centrocostovalorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centrocostovalorLogic.getCentroCostoValorsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centrocostovalorLogic.getCentroCostoValors()==null||centrocostovalorLogic.getCentroCostoValors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centrocostovalors==null|| centrocostovalors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostovalorsAux=new ArrayList<CentroCostoValor>();
						centrocostovalorsAux.addAll(centrocostovalorLogic.getCentroCostoValors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostovalorsAux=new ArrayList<CentroCostoValor>();
							centrocostovalorsAux.addAll(centrocostovalors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centrocostovalorLogic.getCentroCostoValorsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoValorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroCostoValors("FK_IdSucursal",centrocostovalorLogic.getCentroCostoValors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroCostoValors("FK_IdSucursal",centrocostovalors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostovalorLogic.setCentroCostoValors(new ArrayList<CentroCostoValor>());
						centrocostovalorLogic.getCentroCostoValors().addAll(centrocostovalorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostovalors=new ArrayList<CentroCostoValor>();
							centrocostovalors.addAll(centrocostovalorsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCentroCostoValor();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCentroCostoValor();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=centrocostovalorLogic.getCentroCostoValors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=centrocostovalors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=centrocostovalorLogic.getCentroCostoValors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=centrocostovalors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CentroCostoValor centrocostovalor) {
		Boolean permite=true;
		
		if(this.centrocostovalor.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CentroCostoValorConstantesFunciones.getOrderByListaCentroCostoValor();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CentroCostoValorConstantesFunciones.getOrderByListaCentroCostoValor();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCostoValor centrocostovalor:centrocostovalorLogic.getCentroCostoValors()) {
				if(centrocostovalor.getsType().equals(Constantes2.S_TOTALES)) {
					centrocostovalorTotales=centrocostovalor;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCostoValor centrocostovalor:this.centrocostovalors) {
				if(centrocostovalor.getsType().equals(Constantes2.S_TOTALES)) {
					centrocostovalorTotales=centrocostovalor;
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
			this.centrocostovalorAux=new CentroCostoValor();
			this.centrocostovalorAux.setsType(Constantes2.S_TOTALES);
			this.centrocostovalorAux.setIsNew(false);
			this.centrocostovalorAux.setIsChanged(false);
			this.centrocostovalorAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CentroCostoValorConstantesFunciones.TotalizarValoresFilaCentroCostoValor(this.centrocostovalorLogic.getCentroCostoValors(),this.centrocostovalorAux);
				
				this.centrocostovalorLogic.getCentroCostoValors().add(this.centrocostovalorAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CentroCostoValorConstantesFunciones.TotalizarValoresFilaCentroCostoValor(this.centrocostovalors,this.centrocostovalorAux);
				
				this.centrocostovalors.add(this.centrocostovalorAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		centrocostovalorTotales=new CentroCostoValor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.centrocostovalorLogic.getCentroCostoValors().remove(centrocostovalorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.centrocostovalors.remove(centrocostovalorTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		centrocostovalorTotales=new CentroCostoValor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCostoValor centrocostovalor:centrocostovalorLogic.getCentroCostoValors()) {
				if(centrocostovalor.getsType().equals(Constantes2.S_TOTALES)) {
					centrocostovalorTotales=centrocostovalor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CentroCostoValorConstantesFunciones.TotalizarValoresFilaCentroCostoValor(this.centrocostovalorLogic.getCentroCostoValors(),centrocostovalorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCostoValor centrocostovalor:this.centrocostovalors) {
				if(centrocostovalor.getsType().equals(Constantes2.S_TOTALES)) {
					centrocostovalorTotales=centrocostovalor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CentroCostoValorConstantesFunciones.TotalizarValoresFilaCentroCostoValor(this.centrocostovalors,centrocostovalorTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCentroCostoValorsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroCostoValorsFK_IdCentroCosto()throws Exception {
		try {
			sAccionBusqueda="FK_IdCentroCosto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroCostoValorsFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroCostoValorsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroCostoValorsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCentroCostoValorsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostovalorLogic.getCentroCostoValorsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroCostoValorsFK_IdCentroCosto(String sFinalQuery,Long id_centro_costo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostovalorLogic.getCentroCostoValorsFK_IdCentroCosto(sFinalQuery,this.pagination,id_centro_costo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroCostoValorsFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostovalorLogic.getCentroCostoValorsFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroCostoValorsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostovalorLogic.getCentroCostoValorsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroCostoValorsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostovalorLogic.getCentroCostoValorsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosCentroCostoValor() {
		this.isPermisoTodoCentroCostoValor=false;
		this.isPermisoNuevoCentroCostoValor=false;
		this.isPermisoActualizarCentroCostoValor=false;
		this.isPermisoActualizarOriginalCentroCostoValor=false;
		this.isPermisoEliminarCentroCostoValor=false;
		this.isPermisoGuardarCambiosCentroCostoValor=false;
		this.isPermisoConsultaCentroCostoValor=false;
		this.isPermisoBusquedaCentroCostoValor=false;
		this.isPermisoReporteCentroCostoValor=false;		
		this.isPermisoOrdenCentroCostoValor=false;		
		this.isPermisoPaginacionMedioCentroCostoValor=false;		
		this.isPermisoPaginacionAltoCentroCostoValor=false;
		this.isPermisoPaginacionTodoCentroCostoValor=false;
		this.isPermisoCopiarCentroCostoValor=false;		
		this.isPermisoVerFormCentroCostoValor=false;		
		this.isPermisoDuplicarCentroCostoValor=false;		
		this.isPermisoOrdenCentroCostoValor=false;		
	}
	
	public void setPermisosUsuarioCentroCostoValor(Boolean isPermiso) {
		this.isPermisoTodoCentroCostoValor=isPermiso;
		this.isPermisoNuevoCentroCostoValor=isPermiso;
		this.isPermisoActualizarCentroCostoValor=isPermiso;
		this.isPermisoActualizarOriginalCentroCostoValor=isPermiso;
		this.isPermisoEliminarCentroCostoValor=isPermiso;
		this.isPermisoGuardarCambiosCentroCostoValor=isPermiso;
		this.isPermisoConsultaCentroCostoValor=isPermiso;
		this.isPermisoBusquedaCentroCostoValor=isPermiso;
		this.isPermisoReporteCentroCostoValor=isPermiso;
		this.isPermisoOrdenCentroCostoValor=isPermiso;		
		this.isPermisoPaginacionMedioCentroCostoValor=isPermiso;		
		this.isPermisoPaginacionAltoCentroCostoValor=isPermiso;		
		this.isPermisoPaginacionTodoCentroCostoValor=isPermiso;		
		this.isPermisoCopiarCentroCostoValor=isPermiso;		
		this.isPermisoVerFormCentroCostoValor=isPermiso;		
		this.isPermisoDuplicarCentroCostoValor=isPermiso;
		this.isPermisoOrdenCentroCostoValor=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCentroCostoValor(Boolean isPermiso) {
		//this.isPermisoTodoCentroCostoValor=isPermiso;
		this.isPermisoNuevoCentroCostoValor=isPermiso;
		this.isPermisoActualizarCentroCostoValor=isPermiso;
		this.isPermisoActualizarOriginalCentroCostoValor=isPermiso;
		this.isPermisoEliminarCentroCostoValor=isPermiso;
		this.isPermisoGuardarCambiosCentroCostoValor=isPermiso;
		//this.isPermisoConsultaCentroCostoValor=isPermiso;
		//this.isPermisoBusquedaCentroCostoValor=isPermiso;
		//this.isPermisoReporteCentroCostoValor=isPermiso;
		//this.isPermisoOrdenCentroCostoValor=isPermiso;		
		//this.isPermisoPaginacionMedioCentroCostoValor=isPermiso;		
		//this.isPermisoPaginacionAltoCentroCostoValor=isPermiso;		
		//this.isPermisoPaginacionTodoCentroCostoValor=isPermiso;		
		//this.isPermisoCopiarCentroCostoValor=isPermiso;		
		//this.isPermisoDuplicarCentroCostoValor=isPermiso;
		//this.isPermisoOrdenCentroCostoValor=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCentroCostoValorClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CentroCostoValorJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebCentroCostoValor(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCentroCostoValorClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCentroCostoValorClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCentroCostoValorClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCentroCostoValorClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCentroCostoValor() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CentroCostoValorJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CentroCostoValorConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCentroCostoValor=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCentroCostoValor=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCentroCostoValor=this.isPermisoActualizarCentroCostoValor;
			this.isPermisoEliminarCentroCostoValor=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCentroCostoValor=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCentroCostoValor=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCentroCostoValor=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCentroCostoValor=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCentroCostoValor=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCentroCostoValor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCentroCostoValor=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCentroCostoValor=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCentroCostoValor=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCentroCostoValor=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCentroCostoValor=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCentroCostoValor=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCentroCostoValor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCentroCostoValor.setToolTipText(this.jTableDatosCentroCostoValor.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCentroCostoValor(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCentroCostoValor(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CentroCostoValorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CentroCostoValorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCentroCostoValor() throws Exception {
		Reporte reporte=null;
		
		
		
		
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
	public void inicializarCombosForeignKeyCentroCostoValorListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.centrocostosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCentroCostoValorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CentroCostoValorJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCentroCostoValorListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCentroCostoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CentroCostoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCentroCostoValorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CentroCostoValorParameterReturnGeneral centrocostovalorReturnGeneral=new CentroCostoValorParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.centrocostovalorConstantesFunciones.cargarid_empresaCentroCostoValor)
					 || (this.esRecargarFks && this.centrocostovalorConstantesFunciones.cargarid_empresaCentroCostoValor)) {

					if(!this.centrocostovalorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+centrocostovalorSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.centrocostovalorConstantesFunciones.cargarid_sucursalCentroCostoValor)
					 || (this.esRecargarFks && this.centrocostovalorConstantesFunciones.cargarid_sucursalCentroCostoValor)) {

					if(!this.centrocostovalorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+centrocostovalorSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.centrocostovalorConstantesFunciones.cargarid_ejercicioCentroCostoValor)
					 || (this.esRecargarFks && this.centrocostovalorConstantesFunciones.cargarid_ejercicioCentroCostoValor)) {

					if(!this.centrocostovalorSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+centrocostovalorSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalCentroCosto="";

				if(((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0) && this.centrocostovalorConstantesFunciones.cargarid_centro_costoCentroCostoValor)
					 || (this.esRecargarFks && this.centrocostovalorConstantesFunciones.cargarid_centro_costoCentroCostoValor)) {

					if(!this.centrocostovalorSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCentroCosto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

						finalQueryGlobalCentroCosto=Funciones.GetFinalQueryAppend(finalQueryGlobalCentroCosto, "");
						finalQueryGlobalCentroCosto+=CentroCostoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCentroCosto=" WHERE " + ConstantesSql.ID + "="+centrocostovalorSessionBean.getlidCentroCostoActual();
					}
				} else {
					finalQueryGlobalCentroCosto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				centrocostovalorReturnGeneral=centrocostovalorLogic.cargarCombosLoteForeignKeyCentroCostoValor(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalCentroCosto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=centrocostovalorReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=centrocostovalorReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=centrocostovalorReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalCentroCosto.equals("NONE")) {
				this.centrocostosForeignKey=centrocostovalorReturnGeneral.getcentrocostosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCentroCostoValor()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyCentroCosto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.centrocostovalorSessionBean==null) {
				this.centrocostovalorSessionBean=new CentroCostoValorSessionBean();
			}

			if(!this.centrocostovalorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.centrocostovalorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.centrocostovalorSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCentroCosto()throws Exception {
		try {

			if(!this.centrocostovalorSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				CentroCosto centrocosto=new CentroCosto();
				CentroCostoConstantesFunciones.setCentroCostoDescripcion(centrocosto,Constantes.SMENSAJE_ESCOJA_OPCION);
				centrocosto.setId(null);

				if(!CentroCostoConstantesFunciones.ExisteEnLista(this.centrocostosForeignKey,centrocosto,true)) {

					this.centrocostosForeignKey.add(0,centrocosto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCentroCostoValor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCentroCostoValor(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCentroCostoValor()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCentroCostoValor();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCentroCostoValor(CentroCostoValor centrocostovalor)throws Exception {	
		try {
			
			this.setActualCentroCostoForeignKey(centrocostovalor.getid_centro_costo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCentroCostoValor(CentroCostoValor centrocostovalor,String sTipoEvento)throws Exception {	
		try {
			
			

				if(centrocostovalor.getCentroCosto()!=null && !sTipoEvento.equals("id_centro_costoCentroCostoValor")) { //sTipoEvento Evita Bucle Infinito

					this.centrocostosForeignKey=new ArrayList<CentroCosto>();
					this.centrocostosForeignKey.add(centrocostovalor.getCentroCosto());

					this.addItemDefectoCombosForeignKeyCentroCosto();
					this.cargarCombosFrameCentroCostosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCentroCostoValor()throws Exception {	
		try {
			
			this.setActualCentroCostoForeignKey(this.centrocostovalorConstantesFunciones.getid_centro_costo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCentroCostoValor()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_ejercicioCentroCostoValor.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCentroCostoValor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCentroCostoValor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCentroCostoValor()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCentroCostoValor()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFrameCentroCostosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCentroCostoValor(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCentroCostoValor()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_empresaCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_empresaCentroCostoValor.getItemCount()>0) {
				this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_empresaCentroCostoValor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_sucursalCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_sucursalCentroCostoValor.getItemCount()>0) {
				this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_sucursalCentroCostoValor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_ejercicioCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_ejercicioCentroCostoValor.getItemCount()>0) {
				this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_ejercicioCentroCostoValor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_centro_costoCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_centro_costoCentroCostoValor.getItemCount()>0) {
				this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_centro_costoCentroCostoValor.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public CentroCostoValorBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CentroCostoValorBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CentroCostoValorBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.centrocostovalorSessionBean=new CentroCostoValorSessionBean(); 
		this.centrocostovalorConstantesFunciones=new CentroCostoValorConstantesFunciones(); 
		this.centrocostovalorBean=new CentroCostoValor();//(this.centrocostovalorConstantesFunciones); 		
		this.centrocostovalorReturnGeneral=new CentroCostoValorParameterReturnGeneral(); 
		
		this.centrocostovalorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.centrocostovalorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CentroCostoValorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CentroCostoValorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CentroCostoValorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCentroCostoValor(true);
			
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
			
			this.centrocostovalorConstantesFunciones=new CentroCostoValorConstantesFunciones(); 
			this.centrocostovalorBean=new CentroCostoValor();//this.centrocostovalorConstantesFunciones); 			
			this.centrocostovalorReturnGeneral=new CentroCostoValorParameterReturnGeneral(); 
		
			CentroCostoValorBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Centro Costo Valor Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.centrocostovalor=new CentroCostoValor();
			this.centrocostovalors = new ArrayList<CentroCostoValor>();
			this.centrocostovalorsAux = new ArrayList<CentroCostoValor>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic=new CentroCostoValorLogic();
				this.centrocostovalorLogic.getNewConnexionToDeep("");
			}
			
			//this.centrocostovalorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.centrocostovalorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCentroCostoValor);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCentroCostoValor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCentroCostoValor);	
					}
					
					if(this.jInternalFrameImportacionCentroCostoValor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCentroCostoValor);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCentroCostoValor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCentroCostoValor);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCentroCostoValor);
				this.jInternalFrameDetalleFormCentroCostoValor.setVisible(false);
				this.jInternalFrameDetalleFormCentroCostoValor.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCentroCostoValor!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCentroCostoValor);
					this.jInternalFrameReporteDinamicoCentroCostoValor.setVisible(false);
					this.jInternalFrameReporteDinamicoCentroCostoValor.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCentroCostoValor!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCentroCostoValor);
					this.jInternalFrameImportacionCentroCostoValor.setVisible(false);
					this.jInternalFrameImportacionCentroCostoValor.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCentroCostoValor!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCentroCostoValor);
					this.jInternalFrameOrderByCentroCostoValor.setVisible(false);
					this.jInternalFrameOrderByCentroCostoValor.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCentroCostoValorActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CentroCostoValorConstantesFunciones.INUMEROPAGINACION;
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
			
			this.centrocostovalorReturnGeneral=new CentroCostoValorParameterReturnGeneral();
			
			this.centrocostovalorParameterGeneral=new CentroCostoValorParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.centrocostovalorLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CentroCostoValorJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CentroCostoValorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.centrocostovalorSessionBean.getEsGuardarRelacionado(),this.centrocostovalorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CentroCostoValorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.centrocostovalorSessionBean.getEsGuardarRelacionado(),this.centrocostovalorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCentroCostoValor=false;
			this.isVisibilidadCeldaDuplicarCentroCostoValor=true;
			this.isVisibilidadCeldaCopiarCentroCostoValor=true;
			this.isVisibilidadCeldaVerFormCentroCostoValor=true;
			this.isVisibilidadCeldaOrdenCentroCostoValor=true;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor=false;
			this.isVisibilidadCeldaModificarCentroCostoValor=false;
			this.isVisibilidadCeldaActualizarCentroCostoValor=false;
			this.isVisibilidadCeldaEliminarCentroCostoValor=false;
			this.isVisibilidadCeldaCancelarCentroCostoValor=false;
			this.isVisibilidadCeldaGuardarCentroCostoValor=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoValor=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdCentroCosto=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCentroCostoValor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCentroCostoValor();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCentroCostoValor(false);
			
			this.setPermisosUsuarioCentroCostoValor();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado() 
				|| (this.centrocostovalorSessionBean.getEsGuardarRelacionado() && this.centrocostovalorSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCentroCostoValorClasesRelacionadas();
			}
			
			if(this.centrocostovalorSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCentroCostoValorClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCentroCostoValor();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCentroCostoValor();
			}
			
			if(!this.isPermisoBusquedaCentroCostoValor) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCentroCostoValor.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCentroCostoValor,this.isPermisoPaginacionMedioCentroCostoValor,this.isPermisoPaginacionTodoCentroCostoValor);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CentroCostoValorConstantesFunciones.getTiposSeleccionarCentroCostoValor());
				
				this.tiposColumnasSelect=CentroCostoValorConstantesFunciones.getTiposSeleccionarCentroCostoValor(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
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
			//if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCentroCostoValor();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioCentroCostoValor(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioCentroCostoValor(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCentroCostoValor() ;
			
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
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.centrocostoLogic=new CentroCostoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				centrocostovalorImplementable= (CentroCostoValorImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CentroCostoValorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				centrocostovalorImplementableHome= (CentroCostoValorImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CentroCostoValorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.centrocostovalors= new ArrayList<CentroCostoValor>();
			this.centrocostovalorsEliminados= new ArrayList<CentroCostoValor>();
						
			this.isEsNuevoCentroCostoValor=false;
			this.esParaAccionDesdeFormularioCentroCostoValor=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCentroCostoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.centrocostosForeignKey=new ArrayList<CentroCosto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCentroCostoValor(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCentroCostoValor();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CentroCostoValorBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CentroCostoValorConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCentroCostoValor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCentroCostoValor(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCentroCostoValor();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCentroCostoValor();
			}
			
			CentroCostoValorBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCentroCostoValor.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCentroCostoValor.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCentroCostoValor.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCentroCostoValor(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CentroCostoValor: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCentroCostoValor() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCentroCostoValor")) {
				iIndex=this.jInternalFrameDetalleFormCentroCostoValor.jTabbedPaneRelacionesCentroCostoValor.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCentroCostoValor.jTabbedPaneRelacionesCentroCostoValor.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCentroCostoValor();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyCentroCostoValor(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCentroCostoValor(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCentroCostoValor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCentroCostoValorListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCentroCostoValor();
		
		this.cargarCombosFrameForeignKeyCentroCostoValor();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCentroCostoValor();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCentroCostoValor();
		}
	}
	
	

	public void cargarCombosForeignKeyCentroCosto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCentroCosto(this.centrocostosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCentroCostoValorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.centrocostovalorSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCentroCostoValor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
			
			
			if(jTableDatosCentroCostoValor.getRowCount()>=1) {
				jTableDatosCentroCostoValor.removeRowSelectionInterval(0, jTableDatosCentroCostoValor.getRowCount()-1);						
			}
			
			this.isEsNuevoCentroCostoValor=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCentroCostoValor(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCentroCostoValor(true);			
			//this.centrocostovalor=new CentroCostoValor();
			//this.centrocostovalor.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCentroCostoValor(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroCostoValor() ;
			
			if(CentroCostoValorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCentroCostoValor(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.centrocostovalor);	
			this.actualizarInformacion("INFO_PADRE",false,this.centrocostovalor);				
			
			CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
			
			if(this.centrocostovalorSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CentroCostoValor: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCentroCostoValorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CentroCostoValor> centrocostovalorsSeleccionados=new ArrayList<CentroCostoValor>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCentroCostoValor.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCentroCostoValor.getSelectedRows().length;			
			}
			
			centrocostovalorsSeleccionados=this.getCentroCostoValorsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCentroCostoValor--;			
				//CentroCostoValor centrocostovalorAux= new CentroCostoValor();			
				//centrocostovalorAux.setId(this.iIdNuevoCentroCostoValor);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CentroCostoValor centrocostovalorOrigen=new CentroCostoValor();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CentroCostoValor centrocostovalorOrigen : centrocostovalorsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							centrocostovalorOrigen =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostovalorOrigen =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCentroCostoValor();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.centrocostovalor.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCentroCostoValor(centrocostovalorOrigen,this.centrocostovalor,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.centrocostovalorLogic.getCentroCostoValors().add(this.centrocostovalorAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.centrocostovalors.add(this.centrocostovalorAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCentroCostoValor(false);
				
				this.jTableDatosCentroCostoValor.setRowSelectionInterval(this.getIndiceNuevoCentroCostoValor(), this.getIndiceNuevoCentroCostoValor());
				
				int iLastRow =  this.jTableDatosCentroCostoValor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCentroCostoValor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCentroCostoValor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCentroCostoValor(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CentroCostoValor> centrocostovalorsSeleccionados=new ArrayList<CentroCostoValor>();									
		
			CentroCostoValor centrocostovalorOrigen=new CentroCostoValor();
			CentroCostoValor centrocostovalorDestino=new CentroCostoValor();
				
			centrocostovalorsSeleccionados=this.getCentroCostoValorsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCentroCostoValor.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || centrocostovalorsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCentroCostoValor.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostovalorOrigen =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						centrocostovalorOrigen =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostovalorDestino =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						centrocostovalorDestino =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				centrocostovalorOrigen =centrocostovalorsSeleccionados.get(0);
				centrocostovalorDestino =centrocostovalorsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCentroCostoValor(centrocostovalorOrigen,centrocostovalorDestino,true,false);
				
				centrocostovalorDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(centrocostovalorDestino,centrocostovalorLogic.getCentroCostoValors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centrocostovalorDestino,centrocostovalors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCentroCostoValor(false);
				
				//this.jTableDatosCentroCostoValor.setRowSelectionInterval(this.getIndiceNuevoCentroCostoValor(), this.getIndiceNuevoCentroCostoValor());
				
				int iLastRow =  this.jTableDatosCentroCostoValor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCentroCostoValor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCentroCostoValor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCentroCostoValor(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCentroCostoValor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCentroCostoValor.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCentroCostoValor.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCentroCostoValor.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCentroCostoValor.setVisible(!isVisible);
			this.jPanelPaginacionCentroCostoValor.setVisible(!isVisible);
			this.jPanelAccionesCentroCostoValor.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCentroCostoValor();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCentroCostoValor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCentroCostoValor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCentroCostoValor();
			
			this.abrirFrameOrderByCentroCostoValor();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCentroCostoValor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCentroCostoValor(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCentroCostoValor);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCentroCostoValor.isMaximum()) {
					this.jInternalFrameDetalleFormCentroCostoValor.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCentroCostoValor.setSize(this.jInternalFrameDetalleFormCentroCostoValor.iWidthFormulario,this.jInternalFrameDetalleFormCentroCostoValor.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCentroCostoValor.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCentroCostoValor.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCentroCostoValor.isMaximum()) {
						this.jInternalFrameDetalleFormCentroCostoValor.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCentroCostoValor.jContentPaneDetalleCentroCostoValor.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCentroCostoValor.jTabbedPaneRelacionesCentroCostoValor.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCentroCostoValor.jContentPaneDetalleCentroCostoValor.getWidth(),CentroCostoValorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCentroCostoValor.jTabbedPaneRelacionesCentroCostoValor.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCentroCostoValor.jContentPaneDetalleCentroCostoValor.getWidth(),CentroCostoValorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCentroCostoValor.jTabbedPaneRelacionesCentroCostoValor.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCentroCostoValor.jContentPaneDetalleCentroCostoValor.getWidth(),CentroCostoValorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCentroCostoValor.setVisible(true);
	        this.jInternalFrameDetalleFormCentroCostoValor.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCentroCostoValor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCentroCostoValor==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCentroCostoValor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroCostoValor,false,this);
				} else {
					this.jInternalFrameOrderByCentroCostoValor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroCostoValor,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCentroCostoValor);
				this.jInternalFrameOrderByCentroCostoValor.setVisible(false);
				this.jInternalFrameOrderByCentroCostoValor.setSelected(false);
				
				this.jInternalFrameOrderByCentroCostoValor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCentroCostoValor"));
				
				this.inicializarActualizarBindingTablaOrderByCentroCostoValor();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCentroCostoValor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCentroCostoValor==null) {
				
				this.jInternalFrameImportacionCentroCostoValor=new ImportacionJInternalFrame(CentroCostoValorConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCentroCostoValor);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCentroCostoValor);
				this.jInternalFrameImportacionCentroCostoValor.setVisible(false);
				this.jInternalFrameImportacionCentroCostoValor.setSelected(false);


				this.jInternalFrameImportacionCentroCostoValor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCentroCostoValor"));
				this.jInternalFrameImportacionCentroCostoValor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCentroCostoValor"));
				this.jInternalFrameImportacionCentroCostoValor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCentroCostoValor"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCentroCostoValor() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCentroCostoValor==null) {
				this.jInternalFrameReporteDinamicoCentroCostoValor=new ReporteDinamicoJInternalFrame(CentroCostoValorConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCentroCostoValor);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCentroCostoValor);
				this.jInternalFrameReporteDinamicoCentroCostoValor.setVisible(false);
				this.jInternalFrameReporteDinamicoCentroCostoValor.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCentroCostoValor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCentroCostoValor"));
				this.jInternalFrameReporteDinamicoCentroCostoValor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCentroCostoValor"));
				this.jInternalFrameReporteDinamicoCentroCostoValor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCentroCostoValor"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCentroCostoValor();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCentroCostoValor() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCentroCostoValor);
			
	       	this.jInternalFrameDetalleFormCentroCostoValor.setVisible(false);
	        this.jInternalFrameDetalleFormCentroCostoValor.setSelected(false);
			
			//this.jInternalFrameDetalleFormCentroCostoValor.dispose();
			//this.jInternalFrameDetalleFormCentroCostoValor=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCentroCostoValor() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCentroCostoValor.setVisible(true);
	        this.jInternalFrameReporteDinamicoCentroCostoValor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCentroCostoValor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCentroCostoValor.setVisible(true);
	        this.jInternalFrameImportacionCentroCostoValor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCentroCostoValor() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCentroCostoValor.setVisible(true);
	        this.jInternalFrameOrderByCentroCostoValor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCentroCostoValor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCentroCostoValor.setVisible(false);
	        this.jInternalFrameOrderByCentroCostoValor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCentroCostoValor() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCentroCostoValor.setVisible(false);
	        this.jInternalFrameReporteDinamicoCentroCostoValor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCentroCostoValor() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCentroCostoValor.setVisible(false);
	        this.jInternalFrameImportacionCentroCostoValor.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCentroCosto(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCentroCosto);
						CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.sTipoBusqueda="CentroCosto";
						}

						centrocostoBeanSwingJInternalFrame.getTodosCentroCostoArbol();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setCentroCostos(centrocostoBeanSwingJInternalFrame.centrocostosArbol);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.CargarTreeCentroCosto();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setVisible(true);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.jInternalFrameParent=this;
						TitledBorder titledBorderCentroCostoValor=(TitledBorder)this.jScrollPanelDatosCentroCostoValor.getBorder();
						TitledBorder titledBorderCentroCosto=(TitledBorder)centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

						titledBorderCentroCosto.setTitle(titledBorderCentroCostoValor.getTitle() + " -> Centro Costo");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,centrocostoBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(centrocostoBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCentroCosto(CentroCostoBeanSwingJInternalFrame jInternalFrameTreeCentroCosto) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCentroCosto);
						jInternalFrameTreeCentroCosto.setVisible(false);
						jInternalFrameTreeCentroCosto.setSelected(false);
						//jInternalFrameTreeCentroCosto.dispose();
						//jInternalFrameTreeCentroCosto=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCentroCostoValor(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCentroCostoValor(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCentroCostoValor(true);
			//this.isEsNuevoCentroCostoValor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCentroCostoValor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCentroCostoValor(false) ;
			
			if(centrocostovalorSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CentroCostoValorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCentroCostoValor(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroCostoValor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCentroCostoValorActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCentroCostoValor(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCentroCostoValor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCentroCostoValor(true);
			//this.isEsNuevoCentroCostoValor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.centrocostovalor.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCentroCostoValor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCentroCostoValor(false) ;
			
			if(CentroCostoValorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCentroCostoValor(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroCostoValor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CentroCosto")) {
				if(!this.centrocostovalorConstantesFunciones.cargarid_centro_costoCentroCostoValor) {
					this.cargarCombosCentroCostosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCentroCostoValor(false,false);
					this.cargarCombosFrameCentroCostosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_centro_costo (id);

				this.recargarComboTablaCentroCosto(this.centrocostosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaCentroCosto(List<CentroCosto> centrocostosForeignKey)throws Exception{
		TableColumn tableColumnCentroCosto=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_IDCENTROCOSTO));
		TableCellEditor tableCellEditorCentroCosto =tableColumnCentroCosto.getCellEditor();

		CentroCostoTableCell centrocostoTableCellFk=(CentroCostoTableCell)tableCellEditorCentroCosto;

		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.setcentrocostosForeignKey(centrocostosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCentroCostoValor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//centrocostoTableCellFk.setRowActual(intSelectedRow);
			//centrocostoTableCellFk.setcentrocostosForeignKeyActual(centrocostosForeignKey);
		//}


		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.RecargarCentroCostosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_centro_costo (Long id) throws Exception {
		this.setActualCentroCostoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCentroCostoValor(false);
			
			//if(!this.isEsNuevoCentroCostoValor) {								
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CentroCostoValorJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				
			}
			
			if(this.permiteMantenimiento(this.centrocostovalor)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCentroCostoValor=true;
					this.inicializarActualizarBindingTablaCentroCostoValor(false);
					this.isEsNuevoCentroCostoValor=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCentroCostoValor=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCentroCostoValor=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCentroCostoValor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCentroCostoValor(false);
				
				this.habilitarDeshabilitarControlesCentroCostoValor(false);
			
												
				
				if(CentroCostoValorJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCentroCostoValor();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCentroCostoValorActionPerformed(evt,centrocostovalorSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCentroCostoValor(this.centrocostovalor,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCentroCostoValor.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,centrocostovalorSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.centrocostovalor.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CentroCostoValor.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoValor.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				this.centrocostovalor.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				this.centrocostovalor.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.centrocostovalor)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CentroCostoValorModel) this.jTableDatosCentroCostoValor.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCentroCostoValor=true;
				this.inicializarActualizarBindingTablaCentroCostoValor(false);
				this.isEsNuevoCentroCostoValor=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCentroCostoValor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCentroCostoValor(false);
				
				this.habilitarDeshabilitarControlesCentroCostoValor(false);
				
				
				
				if(CentroCostoValorJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCentroCostoValor();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCentroCostoValor.getRowCount()>=1) {
				jTableDatosCentroCostoValor.removeRowSelectionInterval(0, jTableDatosCentroCostoValor.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCentroCostoValor(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCentroCostoValor(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCentroCostoValor(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroCostoValor(false) ;
			
			this.isEsNuevoCentroCostoValor=false;
			
			if(CentroCostoValorJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCentroCostoValor();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCentroCostoValor(false);
				
				//SI ES MANUAL
				if(CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCentroCostoValor();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCentroCostoValor--;			
			//CentroCostoValor centrocostovalorAux= new CentroCostoValor();			
			//centrocostovalorAux.setId(this.iIdNuevoCentroCostoValor);
			
			if(this.jInternalFrameDetalleFormCentroCostoValor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCentroCostoValor();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
			
			this.centrocostovalor.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.centrocostovalorLogic.getCentroCostoValors().add(this.centrocostovalorAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.centrocostovalors.add(this.centrocostovalorAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCentroCostoValor(false);
			
			this.jTableDatosCentroCostoValor.setRowSelectionInterval(this.getIndiceNuevoCentroCostoValor(), this.getIndiceNuevoCentroCostoValor());
			
			int iLastRow =  this.jTableDatosCentroCostoValor.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCentroCostoValor.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCentroCostoValor.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCentroCostoValor(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCentroCostoValor(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroCostoValor(false);
			
			//SI ES MANUAL
			if(CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCentroCostoValor();
			}
			
			//this.abrirFrameTreeCentroCostoValor();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Centro Costo ValorES ?", "MANTENIMIENTO DE Centro Costo Valor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCentroCostoValor.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCentroCostoValor();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.centrocostovalorReturnGeneral=centrocostovalorLogic.procesarImportacionCentroCostoValorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.centrocostovalorParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCentroCostoValorReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCentroCostoValor.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCentroCostoValor.setFileImportacion(this.jInternalFrameImportacionCentroCostoValor.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCentroCostoValor.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCentroCostoValor.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCentroCostoValor.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCentroCostoValor.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CentroCostoValor> centrocostovalorsSeleccionados=new ArrayList<CentroCostoValor>();		

		centrocostovalorsSeleccionados=this.getCentroCostoValorsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CentroCostoValorBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CentroCostoValorBaseDesign.jrxml";
			
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
			
			this.generarReporteCentroCostoValors("Todos",centrocostovalorsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Valor",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCentroCostoValor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCostoValor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CentroCostoValorConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoValorConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoValorConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoValorConstantesFunciones.LABEL_IDCENTROCOSTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CentroCosto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CentroCosto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CentroCosto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CentroCosto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoValorConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoValorConstantesFunciones.LABEL_ENERO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoValorConstantesFunciones.LABEL_FEBRERO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_brero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_brero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_brero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_brero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoValorConstantesFunciones.LABEL_MARZO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rzo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rzo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rzo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rzo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoValorConstantesFunciones.LABEL_ABRIL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ril_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ril_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ril_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ril_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoValorConstantesFunciones.LABEL_MAYO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_yo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_yo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_yo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_yo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoValorConstantesFunciones.LABEL_JUNIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoValorConstantesFunciones.LABEL_JULIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoValorConstantesFunciones.LABEL_AGOSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_osto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_osto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_osto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_osto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoValorConstantesFunciones.LABEL_SEPTIEMBRE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ptiembre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ptiembre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ptiembre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ptiembre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoValorConstantesFunciones.LABEL_OCTUBRE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tubre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tubre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tubre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tubre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoValorConstantesFunciones.LABEL_NOVIEMBRE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_viembre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_viembre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_viembre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_viembre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoValorConstantesFunciones.LABEL_DICIEMBRE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ciembre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ciembre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ciembre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ciembre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCentroCostoValor.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CentroCostoValorConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoria="id_centro_costo";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_ENERO:
					sNombreCampoCategoria="enero";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_FEBRERO:
					sNombreCampoCategoria="febrero";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_MARZO:
					sNombreCampoCategoria="marzo";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_ABRIL:
					sNombreCampoCategoria="abril";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_MAYO:
					sNombreCampoCategoria="mayo";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_JUNIO:
					sNombreCampoCategoria="junio";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_JULIO:
					sNombreCampoCategoria="julio";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_AGOSTO:
					sNombreCampoCategoria="agosto";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_SEPTIEMBRE:
					sNombreCampoCategoria="septiembre";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_OCTUBRE:
					sNombreCampoCategoria="octubre";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_NOVIEMBRE:
					sNombreCampoCategoria="noviembre";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_DICIEMBRE:
					sNombreCampoCategoria="diciembre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CentroCostoValorConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoriaValor="id_centro_costo";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_ENERO:
					sNombreCampoCategoriaValor="enero";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_FEBRERO:
					sNombreCampoCategoriaValor="febrero";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_MARZO:
					sNombreCampoCategoriaValor="marzo";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_ABRIL:
					sNombreCampoCategoriaValor="abril";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_MAYO:
					sNombreCampoCategoriaValor="mayo";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_JUNIO:
					sNombreCampoCategoriaValor="junio";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_JULIO:
					sNombreCampoCategoriaValor="julio";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_AGOSTO:
					sNombreCampoCategoriaValor="agosto";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_SEPTIEMBRE:
					sNombreCampoCategoriaValor="septiembre";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_OCTUBRE:
					sNombreCampoCategoriaValor="octubre";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_NOVIEMBRE:
					sNombreCampoCategoriaValor="noviembre";
					break;

				case CentroCostoValorConstantesFunciones.LABEL_DICIEMBRE:
					sNombreCampoCategoriaValor="diciembre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCentroCostoValor.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCostoValor.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CentroCostoValorConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CentroCostoValorConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case CentroCostoValorConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case CentroCostoValorConstantesFunciones.LABEL_IDCENTROCOSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Centro Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_centro_costo");
					break;

				case CentroCostoValorConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CentroCostoValorConstantesFunciones.LABEL_ENERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Enero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"enero");
					break;

				case CentroCostoValorConstantesFunciones.LABEL_FEBRERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Febrero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"febrero");
					break;

				case CentroCostoValorConstantesFunciones.LABEL_MARZO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Marzo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"marzo");
					break;

				case CentroCostoValorConstantesFunciones.LABEL_ABRIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Abril",sNombreCampoCategoria,sNombreCampoCategoriaValor,"abril");
					break;

				case CentroCostoValorConstantesFunciones.LABEL_MAYO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mayo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"mayo");
					break;

				case CentroCostoValorConstantesFunciones.LABEL_JUNIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Junio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"junio");
					break;

				case CentroCostoValorConstantesFunciones.LABEL_JULIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Julio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"julio");
					break;

				case CentroCostoValorConstantesFunciones.LABEL_AGOSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Agosto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"agosto");
					break;

				case CentroCostoValorConstantesFunciones.LABEL_SEPTIEMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Septiembre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"septiembre");
					break;

				case CentroCostoValorConstantesFunciones.LABEL_OCTUBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Octubre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"octubre");
					break;

				case CentroCostoValorConstantesFunciones.LABEL_NOVIEMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Noviembre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"noviembre");
					break;

				case CentroCostoValorConstantesFunciones.LABEL_DICIEMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Diciembre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"diciembre");
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
	
	public void jButtonGenerarExcelReporteDinamicoCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CentroCostoValor> centrocostovalorsSeleccionados=new ArrayList<CentroCostoValor>();		
		
		centrocostovalorsSeleccionados=this.getCentroCostoValorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostovalor";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CentroCostoValors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCentroCostoValor.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCostoValor.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CentroCostoValorConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CentroCostoValor centrocostovalor:centrocostovalorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostovalor.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoValorConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CentroCostoValor centrocostovalor:centrocostovalorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostovalor.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoValorConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(CentroCostoValor centrocostovalor:centrocostovalorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostovalor.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoValorConstantesFunciones.LABEL_IDCENTROCOSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_IDCENTROCOSTO);
					iRow++;

					for(CentroCostoValor centrocostovalor:centrocostovalorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostovalor.getcentrocosto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoValorConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CentroCostoValor centrocostovalor:centrocostovalorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostovalor.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoValorConstantesFunciones.LABEL_ENERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_ENERO);
					iRow++;

					for(CentroCostoValor centrocostovalor:centrocostovalorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostovalor.getenero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoValorConstantesFunciones.LABEL_FEBRERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_FEBRERO);
					iRow++;

					for(CentroCostoValor centrocostovalor:centrocostovalorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostovalor.getfebrero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoValorConstantesFunciones.LABEL_MARZO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_MARZO);
					iRow++;

					for(CentroCostoValor centrocostovalor:centrocostovalorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostovalor.getmarzo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoValorConstantesFunciones.LABEL_ABRIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_ABRIL);
					iRow++;

					for(CentroCostoValor centrocostovalor:centrocostovalorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostovalor.getabril());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoValorConstantesFunciones.LABEL_MAYO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_MAYO);
					iRow++;

					for(CentroCostoValor centrocostovalor:centrocostovalorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostovalor.getmayo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoValorConstantesFunciones.LABEL_JUNIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_JUNIO);
					iRow++;

					for(CentroCostoValor centrocostovalor:centrocostovalorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostovalor.getjunio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoValorConstantesFunciones.LABEL_JULIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_JULIO);
					iRow++;

					for(CentroCostoValor centrocostovalor:centrocostovalorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostovalor.getjulio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoValorConstantesFunciones.LABEL_AGOSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_AGOSTO);
					iRow++;

					for(CentroCostoValor centrocostovalor:centrocostovalorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostovalor.getagosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoValorConstantesFunciones.LABEL_SEPTIEMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_SEPTIEMBRE);
					iRow++;

					for(CentroCostoValor centrocostovalor:centrocostovalorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostovalor.getseptiembre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoValorConstantesFunciones.LABEL_OCTUBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_OCTUBRE);
					iRow++;

					for(CentroCostoValor centrocostovalor:centrocostovalorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostovalor.getoctubre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoValorConstantesFunciones.LABEL_NOVIEMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_NOVIEMBRE);
					iRow++;

					for(CentroCostoValor centrocostovalor:centrocostovalorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostovalor.getnoviembre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoValorConstantesFunciones.LABEL_DICIEMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_DICIEMBRE);
					iRow++;

					for(CentroCostoValor centrocostovalor:centrocostovalorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostovalor.getdiciembre());
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
			//	this.getFilaCabeceraExportarExcelCentroCostoValor(row);				
			//	iRow++;
			//}				
			
			//for(CentroCostoValor centrocostovalorAux:centrocostovalorsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCentroCostoValor(centrocostovalorAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Valor",JOptionPane.INFORMATION_MESSAGE);
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
				this.centrocostovalorLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroCostoValor(false);
			
			//SI ES MANUAL
			if(CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCentroCostoValor();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroCostoValor(false);
			
			//SI ES MANUAL
			if(CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCentroCostoValor();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroCostoValor(false);
			
			//SI ES MANUAL
			if(CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCentroCostoValor();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCentroCostoValor() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCentroCostoValor.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCentroCostoValor.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCentroCostoValor.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCentroCostoValor.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCentroCostoValor.setMinimumSize(dimensionMinimum);
		this.jTableDatosCentroCostoValor.setMaximumSize(dimensionMaximum);
		this.jTableDatosCentroCostoValor.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCentroCostoValor(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCentroCostoValor(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCentroCostoValor(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCentroCostoValor(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCentroCostoValor(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCentroCostoValor(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCentroCostoValor(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCentroCostoValor(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CentroCostoValorJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCentroCostoValor() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCentroCostoValor();
		
		this.inicializarActualizarBindingBotonesManualCentroCostoValor(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCentroCostoValor();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCentroCostoValor() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCentroCostoValor(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCentroCostoValor(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCentroCostoValor.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCentroCostoValor.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCentroCostoValor.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCentroCostoValor.jCheckBoxPostAccionNuevoCentroCostoValor.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCentroCostoValor.jCheckBoxPostAccionSinCerrarCentroCostoValor.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCentroCostoValor.jCheckBoxPostAccionSinMensajeCentroCostoValor.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCentroCostoValor.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCentroCostoValor.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCentroCostoValor.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
				this.jInternalFrameDetalleFormCentroCostoValor.jCheckBoxPostAccionNuevoCentroCostoValor.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCentroCostoValor.jCheckBoxPostAccionSinCerrarCentroCostoValor.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCentroCostoValor.jCheckBoxPostAccionSinMensajeCentroCostoValor.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCentroCostoValor.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCentroCostoValor.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxTiposAccionesFormularioCentroCostoValor.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCentroCostoValor.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCentroCostoValor!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCentroCostoValor.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCentroCostoValor.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCentroCostoValor.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCentroCostoValor.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCentroCostoValor!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCentroCostoValor.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCentroCostoValor.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCentroCostoValor(Boolean esInicializar) throws Exception {
		try	{	
			if(CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCentroCostoValor(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCentroCostoValor() throws Exception {
		try	{
			if(CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCentroCostoValor();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCentroCostoValor() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxTiposAccionesFormularioCentroCostoValor.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxTiposAccionesFormularioCentroCostoValor.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCentroCostoValor() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCentroCostoValor.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCentroCostoValor.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCentroCostoValor.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCentroCostoValor.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCentroCostoValor.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCentroCostoValor.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCentroCostoValor.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCentroCostoValor.addItem(reporte);
			}
			
			
			if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCentroCostoValor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCentroCostoValor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCentroCostoValor.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCentroCostoValor.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCentroCostoValor.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCentroCostoValor.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxTiposAccionesFormularioCentroCostoValor.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxTiposAccionesFormularioCentroCostoValor.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCentroCostoValor.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCentroCostoValor.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCentroCostoValor.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCentroCostoValor();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCentroCostoValor() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCentroCostoValor!=null) {
				this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCentroCostoValor!=null) {
				this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCentroCostoValor!=null) {
				
				if(this.jInternalFrameReporteDinamicoCentroCostoValor.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCentroCostoValor.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCentroCostoValor.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCentroCostoValor.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCentroCostoValor.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCentroCostoValor.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CentroCostoValorConstantesFunciones.getTiposSeleccionarCentroCostoValor(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CentroCostoValorConstantesFunciones.getTiposSeleccionarCentroCostoValor(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCentroCostoValor.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCentroCostoValor.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CentroCostoValorConstantesFunciones.getTiposSeleccionarCentroCostoValor(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCentroCostoValor.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCentroCostoValor.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCentroCostoValor()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextFieldnombreBusquedaPorNombreCentroCostoValor.getText();
		if(this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor.getSelectedItem()!=null){this.id_centro_costoFK_IdCentroCosto=((CentroCosto)this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCentroCostoValor(Boolean esInicializar) throws Exception {				
		if(CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCentroCostoValor();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCentroCostoValor() throws Exception {
		this.inicializarActualizarBindingTablaCentroCostoValor(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCentroCostoValor() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCentroCostoValor.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCentroCostoValor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCentroCostoValor.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCentroCostoValor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCentroCostoValor.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCentroCostoValorOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValorOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCentroCostoValor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCentroCostoValor.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCentroCostoValor.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCentroCostoValor(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=centrocostovalorLogic.getCentroCostoValors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=centrocostovalors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CentroCostoValorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCentroCostoValor.setModel(new CentroCostoValorModel(this.centrocostovalorLogic.getCentroCostoValors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCentroCostoValor.setModel(new CentroCostoValorModel(this.centrocostovalors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCentroCostoValor!=null && this.jInternalFrameOrderByCentroCostoValor.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCentroCostoValor();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO,centrocostovalorConstantesFunciones.resaltarSeleccionarCentroCostoValor,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO,centrocostovalorConstantesFunciones.resaltarSeleccionarCentroCostoValor,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_ID));

		if(this.centrocostovalorConstantesFunciones.mostraridCentroCostoValor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoValorConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostovalorConstantesFunciones.resaltaridCentroCostoValor,this.centrocostovalorConstantesFunciones.activaridCentroCostoValor,iSizeTabla,this,true,"idCentroCostoValor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostovalorConstantesFunciones.resaltaridCentroCostoValor,this.centrocostovalorConstantesFunciones.activaridCentroCostoValor,this,true,"idCentroCostoValor","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_IDEMPRESA));

		if(this.centrocostovalorConstantesFunciones.mostrarid_empresaCentroCostoValor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoValorConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.centrocostovalorConstantesFunciones.resaltarid_empresaCentroCostoValor,this,this.centrocostovalorConstantesFunciones.activarid_empresaCentroCostoValor,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.centrocostovalorConstantesFunciones.resaltarid_empresaCentroCostoValor,this,this.centrocostovalorConstantesFunciones.activarid_empresaCentroCostoValor,false,"id_empresaCentroCostoValor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.centrocostovalorConstantesFunciones.mostrarid_sucursalCentroCostoValor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoValorConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.centrocostovalorConstantesFunciones.resaltarid_sucursalCentroCostoValor,this,this.centrocostovalorConstantesFunciones.activarid_sucursalCentroCostoValor,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.centrocostovalorConstantesFunciones.resaltarid_sucursalCentroCostoValor,this,this.centrocostovalorConstantesFunciones.activarid_sucursalCentroCostoValor,false,"id_sucursalCentroCostoValor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.centrocostovalorConstantesFunciones.mostrarid_ejercicioCentroCostoValor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoValorConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.centrocostovalorConstantesFunciones.resaltarid_ejercicioCentroCostoValor,this,this.centrocostovalorConstantesFunciones.activarid_ejercicioCentroCostoValor,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.centrocostovalorConstantesFunciones.resaltarid_ejercicioCentroCostoValor,this,this.centrocostovalorConstantesFunciones.activarid_ejercicioCentroCostoValor,false,"id_ejercicioCentroCostoValor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_IDCENTROCOSTO));

		if(this.centrocostovalorConstantesFunciones.mostrarid_centro_costoCentroCostoValor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoValorConstantesFunciones.LABEL_IDCENTROCOSTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CentroCostoTableCell(this.centrocostosForeignKey,this.centrocostovalorConstantesFunciones.resaltarid_centro_costoCentroCostoValor,this,this.centrocostovalorConstantesFunciones.activarid_centro_costoCentroCostoValor,iSizeTabla));
			tableColumn.setCellEditor(new CentroCostoTableCell(this.centrocostosForeignKey,this.centrocostovalorConstantesFunciones.resaltarid_centro_costoCentroCostoValor,this,this.centrocostovalorConstantesFunciones.activarid_centro_costoCentroCostoValor,true,"id_centro_costoCentroCostoValor","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_NOMBRE));

		if(this.centrocostovalorConstantesFunciones.mostrarnombreCentroCostoValor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoValorConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.centrocostovalorConstantesFunciones.resaltarnombreCentroCostoValor,this.centrocostovalorConstantesFunciones.activarnombreCentroCostoValor,iSizeTabla,this,true,"nombreCentroCostoValor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostovalorConstantesFunciones.resaltarnombreCentroCostoValor,this.centrocostovalorConstantesFunciones.activarnombreCentroCostoValor,this,true,"nombreCentroCostoValor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_ENERO));

		if(this.centrocostovalorConstantesFunciones.mostrareneroCentroCostoValor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoValorConstantesFunciones.LABEL_ENERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostovalorConstantesFunciones.resaltareneroCentroCostoValor,this.centrocostovalorConstantesFunciones.activareneroCentroCostoValor,iSizeTabla,this,true,"eneroCentroCostoValor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostovalorConstantesFunciones.resaltareneroCentroCostoValor,this.centrocostovalorConstantesFunciones.activareneroCentroCostoValor,this,true,"eneroCentroCostoValor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_FEBRERO));

		if(this.centrocostovalorConstantesFunciones.mostrarfebreroCentroCostoValor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoValorConstantesFunciones.LABEL_FEBRERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostovalorConstantesFunciones.resaltarfebreroCentroCostoValor,this.centrocostovalorConstantesFunciones.activarfebreroCentroCostoValor,iSizeTabla,this,true,"febreroCentroCostoValor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostovalorConstantesFunciones.resaltarfebreroCentroCostoValor,this.centrocostovalorConstantesFunciones.activarfebreroCentroCostoValor,this,true,"febreroCentroCostoValor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_MARZO));

		if(this.centrocostovalorConstantesFunciones.mostrarmarzoCentroCostoValor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoValorConstantesFunciones.LABEL_MARZO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostovalorConstantesFunciones.resaltarmarzoCentroCostoValor,this.centrocostovalorConstantesFunciones.activarmarzoCentroCostoValor,iSizeTabla,this,true,"marzoCentroCostoValor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostovalorConstantesFunciones.resaltarmarzoCentroCostoValor,this.centrocostovalorConstantesFunciones.activarmarzoCentroCostoValor,this,true,"marzoCentroCostoValor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_ABRIL));

		if(this.centrocostovalorConstantesFunciones.mostrarabrilCentroCostoValor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoValorConstantesFunciones.LABEL_ABRIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostovalorConstantesFunciones.resaltarabrilCentroCostoValor,this.centrocostovalorConstantesFunciones.activarabrilCentroCostoValor,iSizeTabla,this,true,"abrilCentroCostoValor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostovalorConstantesFunciones.resaltarabrilCentroCostoValor,this.centrocostovalorConstantesFunciones.activarabrilCentroCostoValor,this,true,"abrilCentroCostoValor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_MAYO));

		if(this.centrocostovalorConstantesFunciones.mostrarmayoCentroCostoValor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoValorConstantesFunciones.LABEL_MAYO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostovalorConstantesFunciones.resaltarmayoCentroCostoValor,this.centrocostovalorConstantesFunciones.activarmayoCentroCostoValor,iSizeTabla,this,true,"mayoCentroCostoValor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostovalorConstantesFunciones.resaltarmayoCentroCostoValor,this.centrocostovalorConstantesFunciones.activarmayoCentroCostoValor,this,true,"mayoCentroCostoValor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_JUNIO));

		if(this.centrocostovalorConstantesFunciones.mostrarjunioCentroCostoValor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoValorConstantesFunciones.LABEL_JUNIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostovalorConstantesFunciones.resaltarjunioCentroCostoValor,this.centrocostovalorConstantesFunciones.activarjunioCentroCostoValor,iSizeTabla,this,true,"junioCentroCostoValor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostovalorConstantesFunciones.resaltarjunioCentroCostoValor,this.centrocostovalorConstantesFunciones.activarjunioCentroCostoValor,this,true,"junioCentroCostoValor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_JULIO));

		if(this.centrocostovalorConstantesFunciones.mostrarjulioCentroCostoValor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoValorConstantesFunciones.LABEL_JULIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostovalorConstantesFunciones.resaltarjulioCentroCostoValor,this.centrocostovalorConstantesFunciones.activarjulioCentroCostoValor,iSizeTabla,this,true,"julioCentroCostoValor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostovalorConstantesFunciones.resaltarjulioCentroCostoValor,this.centrocostovalorConstantesFunciones.activarjulioCentroCostoValor,this,true,"julioCentroCostoValor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_AGOSTO));

		if(this.centrocostovalorConstantesFunciones.mostraragostoCentroCostoValor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoValorConstantesFunciones.LABEL_AGOSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostovalorConstantesFunciones.resaltaragostoCentroCostoValor,this.centrocostovalorConstantesFunciones.activaragostoCentroCostoValor,iSizeTabla,this,true,"agostoCentroCostoValor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostovalorConstantesFunciones.resaltaragostoCentroCostoValor,this.centrocostovalorConstantesFunciones.activaragostoCentroCostoValor,this,true,"agostoCentroCostoValor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_SEPTIEMBRE));

		if(this.centrocostovalorConstantesFunciones.mostrarseptiembreCentroCostoValor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoValorConstantesFunciones.LABEL_SEPTIEMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostovalorConstantesFunciones.resaltarseptiembreCentroCostoValor,this.centrocostovalorConstantesFunciones.activarseptiembreCentroCostoValor,iSizeTabla,this,true,"septiembreCentroCostoValor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostovalorConstantesFunciones.resaltarseptiembreCentroCostoValor,this.centrocostovalorConstantesFunciones.activarseptiembreCentroCostoValor,this,true,"septiembreCentroCostoValor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_OCTUBRE));

		if(this.centrocostovalorConstantesFunciones.mostraroctubreCentroCostoValor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoValorConstantesFunciones.LABEL_OCTUBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostovalorConstantesFunciones.resaltaroctubreCentroCostoValor,this.centrocostovalorConstantesFunciones.activaroctubreCentroCostoValor,iSizeTabla,this,true,"octubreCentroCostoValor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostovalorConstantesFunciones.resaltaroctubreCentroCostoValor,this.centrocostovalorConstantesFunciones.activaroctubreCentroCostoValor,this,true,"octubreCentroCostoValor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_NOVIEMBRE));

		if(this.centrocostovalorConstantesFunciones.mostrarnoviembreCentroCostoValor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoValorConstantesFunciones.LABEL_NOVIEMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostovalorConstantesFunciones.resaltarnoviembreCentroCostoValor,this.centrocostovalorConstantesFunciones.activarnoviembreCentroCostoValor,iSizeTabla,this,true,"noviembreCentroCostoValor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostovalorConstantesFunciones.resaltarnoviembreCentroCostoValor,this.centrocostovalorConstantesFunciones.activarnoviembreCentroCostoValor,this,true,"noviembreCentroCostoValor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,CentroCostoValorConstantesFunciones.LABEL_DICIEMBRE));

		if(this.centrocostovalorConstantesFunciones.mostrardiciembreCentroCostoValor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoValorConstantesFunciones.LABEL_DICIEMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostovalorConstantesFunciones.resaltardiciembreCentroCostoValor,this.centrocostovalorConstantesFunciones.activardiciembreCentroCostoValor,iSizeTabla,this,true,"diciembreCentroCostoValor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostovalorConstantesFunciones.resaltardiciembreCentroCostoValor,this.centrocostovalorConstantesFunciones.activardiciembreCentroCostoValor,this,true,"diciembreCentroCostoValor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroCostoValorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.centrocostovalorSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.centrocostovalorSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCentroCostoValor.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.centrocostovalorSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.centrocostovalorSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCentroCostoValor.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCentroCostoValor && this.isPermisoGuardarCambiosCentroCostoValor) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.centrocostovalorSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.centrocostovalorSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCentroCostoValor.addColumn(tableColumn);
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
			
			this.jTableDatosCentroCostoValor.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCentroCostoValor && this.isPermisoGuardarCambiosCentroCostoValor) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCentroCostoValor && this.isPermisoGuardarCambiosCentroCostoValor) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCentroCostoValor.moveColumn(this.jTableDatosCentroCostoValor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCentroCostoValor.moveColumn(this.jTableDatosCentroCostoValor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCentroCostoValor.moveColumn(this.jTableDatosCentroCostoValor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCentroCostoValor.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCentroCostoValor.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCentroCostoValor,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CentroCostoValorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCentroCostoValor.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCentroCostoValor.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CentroCostoValorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CentroCostoValorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCentroCostoValor.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCentroCostoValor.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCentroCostoValor.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=centrocostovalorLogic.getCentroCostoValors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=centrocostovalors.size()-1;
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
		//this.jTableDatosCentroCostoValor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCentroCostoValor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCentroCostoValor();
			
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
				
				//this.isEsNuevoCentroCostoValor=false;
					
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
			
				if(this.centrocostovalorSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCentroCostoValor==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCentroCostoValor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCentroCostoValor.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.centrocostovalor.getsType().equals("DUPLICADO")
				   || this.centrocostovalor.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCentroCostoValor=true;
				
				} else {
					this.isEsNuevoCentroCostoValor=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
					if(this.centrocostovalor.getId()>=0 && !this.centrocostovalor.getIsNew()) {						
						this.isEsNuevoCentroCostoValor=false;
						
					} else {
						this.isEsNuevoCentroCostoValor=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCentroCostoValor(esRelaciones);						
				
				this.seleccionarCentroCostoValor(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.centrocostovalor.getId()<0) {
					this.isEsNuevoCentroCostoValor=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCentroCostoValor(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCentroCostoValor(evt,rowIndex);
				}	
				
				if(this.centrocostovalorSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CentroCostoValor: " + this.dDif); 
					}
				}								
				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCentroCostoValor(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.centrocostovalor)) {
					if(this.centrocostovalor.getId()>0) {
						this.centrocostovalor.setIsDeleted(true);
						
						this.centrocostovalorsEliminados.add(this.centrocostovalor);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.centrocostovalorLogic.getCentroCostoValors().remove(this.centrocostovalor);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.centrocostovalors.remove(this.centrocostovalor);				
					}
					
					
					((CentroCostoValorModel) this.jTableDatosCentroCostoValor.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCentroCostoValor(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCentroCostoValor(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCentroCostoValor) {
			
			if(this.jInternalFrameDetalleFormCentroCostoValor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCentroCostoValor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCentroCostoValor.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CentroCostoValorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCentroCostoValor(this.centrocostovalor);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.centrocostovalorConstantesFunciones.cargarid_empresaCentroCostoValor || this.centrocostovalorConstantesFunciones.event_dependid_empresaCentroCostoValor) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.centrocostovalor.getid_empresa());
									//this.inicializarActualizarBindingCentroCostoValor(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(centrocostovalor.getEmpresa()!=null) {
							this.empresasForeignKey.add(centrocostovalor.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.centrocostovalor.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.centrocostovalorConstantesFunciones.cargarid_sucursalCentroCostoValor || this.centrocostovalorConstantesFunciones.event_dependid_sucursalCentroCostoValor) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.centrocostovalor.getid_sucursal());
									//this.inicializarActualizarBindingCentroCostoValor(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(centrocostovalor.getSucursal()!=null) {
							this.sucursalsForeignKey.add(centrocostovalor.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.centrocostovalor.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.centrocostovalorConstantesFunciones.cargarid_ejercicioCentroCostoValor || this.centrocostovalorConstantesFunciones.event_dependid_ejercicioCentroCostoValor) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.centrocostovalor.getid_ejercicio());
									//this.inicializarActualizarBindingCentroCostoValor(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(centrocostovalor.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(centrocostovalor.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.centrocostovalor.getid_ejercicio(),false,"Formulario");

					//CentroCosto
					if(!this.centrocostovalorConstantesFunciones.cargarid_centro_costoCentroCostoValor || this.centrocostovalorConstantesFunciones.event_dependid_centro_costoCentroCostoValor) {
						//this.cargarCombosCentroCostosForeignKeyLista(" where id="+this.centrocostovalor.getid_centro_costo());
									//this.inicializarActualizarBindingCentroCostoValor(false,false);
						this.centrocostosForeignKey=new ArrayList<CentroCosto>();

						if(centrocostovalor.getCentroCosto()!=null) {
							this.centrocostosForeignKey.add(centrocostovalor.getCentroCosto());
						}

						this.addItemDefectoCombosForeignKeyCentroCosto();
						this.cargarCombosFrameCentroCostosForeignKey("Todos");
					}
					this.setActualCentroCostoForeignKey(this.centrocostovalor.getid_centro_costo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCentroCostoValor("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCentroCostoValor(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCentroCostoValor() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCentroCostoValor(CentroCostoValor centrocostovalor) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCentroCostoValor(centrocostovalor,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCentroCostoValor(CentroCostoValor centrocostovalor,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCentroCostoValor(centrocostovalor);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCentroCostoValor(centrocostovalor,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCentroCostoValor(centrocostovalor);
	}
	
	public void setVariablesObjetoActualToFormularioCentroCostoValor(CentroCostoValor centrocostovalor) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCentroCostoValor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCentroCostoValor.jLabelidCentroCostoValor.setText(centrocostovalor.getId().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldnombreCentroCostoValor.setText(centrocostovalor.getnombre());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldeneroCentroCostoValor.setText(centrocostovalor.getenero().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldfebreroCentroCostoValor.setText(centrocostovalor.getfebrero().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldmarzoCentroCostoValor.setText(centrocostovalor.getmarzo().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldabrilCentroCostoValor.setText(centrocostovalor.getabril().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldmayoCentroCostoValor.setText(centrocostovalor.getmayo().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldjunioCentroCostoValor.setText(centrocostovalor.getjunio().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldjulioCentroCostoValor.setText(centrocostovalor.getjulio().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldagostoCentroCostoValor.setText(centrocostovalor.getagosto().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldseptiembreCentroCostoValor.setText(centrocostovalor.getseptiembre().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldoctubreCentroCostoValor.setText(centrocostovalor.getoctubre().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldnoviembreCentroCostoValor.setText(centrocostovalor.getnoviembre().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFielddiciembreCentroCostoValor.setText(centrocostovalor.getdiciembre().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CentroCostoValor centrocostovalorLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,centrocostovalorLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CentroCostoValor centrocostovalorLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				centrocostovalorLocal=this.centrocostovalor;
			} else {
				centrocostovalorLocal=this.centrocostovalorAnterior;
			}
		}
		
		if(this.permiteMantenimiento(centrocostovalorLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCentroCostoValor(centrocostovalorLocal,true);
					
					if(centrocostovalorSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(centrocostovalorLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(centrocostovalorLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCentroCostoValor(CentroCostoValor centrocostovalor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCentroCostoValor(centrocostovalor,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(centrocostovalor);
	}
	
	public void setVariablesFormularioToObjetoActualCentroCostoValor(CentroCostoValor centrocostovalor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCentroCostoValor(centrocostovalor,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCentroCostoValor(CentroCostoValor centrocostovalor,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCentroCostoValor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCentroCostoValor.jLabelidCentroCostoValor.getText()==null || this.jInternalFrameDetalleFormCentroCostoValor.jLabelidCentroCostoValor.getText()=="" || this.jInternalFrameDetalleFormCentroCostoValor.jLabelidCentroCostoValor.getText()=="Id") {
				this.jInternalFrameDetalleFormCentroCostoValor.jLabelidCentroCostoValor.setText("0");
			}

			if(conColumnasBase) {centrocostovalor.setId(Long.parseLong(this.jInternalFrameDetalleFormCentroCostoValor.jLabelidCentroCostoValor.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoValorConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelIdCentroCostoValor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocostovalor.setnombre(this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldnombreCentroCostoValor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoValorConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelnombreCentroCostoValor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocostovalor.setenero(Double.parseDouble(this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldeneroCentroCostoValor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoValorConstantesFunciones.LABEL_ENERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabeleneroCentroCostoValor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocostovalor.setfebrero(Double.parseDouble(this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldfebreroCentroCostoValor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoValorConstantesFunciones.LABEL_FEBRERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelfebreroCentroCostoValor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocostovalor.setmarzo(Double.parseDouble(this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldmarzoCentroCostoValor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoValorConstantesFunciones.LABEL_MARZO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelmarzoCentroCostoValor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocostovalor.setabril(Double.parseDouble(this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldabrilCentroCostoValor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoValorConstantesFunciones.LABEL_ABRIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelabrilCentroCostoValor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocostovalor.setmayo(Double.parseDouble(this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldmayoCentroCostoValor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoValorConstantesFunciones.LABEL_MAYO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelmayoCentroCostoValor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocostovalor.setjunio(Double.parseDouble(this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldjunioCentroCostoValor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoValorConstantesFunciones.LABEL_JUNIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabeljunioCentroCostoValor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocostovalor.setjulio(Double.parseDouble(this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldjulioCentroCostoValor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoValorConstantesFunciones.LABEL_JULIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabeljulioCentroCostoValor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocostovalor.setagosto(Double.parseDouble(this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldagostoCentroCostoValor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoValorConstantesFunciones.LABEL_AGOSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelagostoCentroCostoValor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocostovalor.setseptiembre(Double.parseDouble(this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldseptiembreCentroCostoValor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoValorConstantesFunciones.LABEL_SEPTIEMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelseptiembreCentroCostoValor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocostovalor.setoctubre(Double.parseDouble(this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldoctubreCentroCostoValor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoValorConstantesFunciones.LABEL_OCTUBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabeloctubreCentroCostoValor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocostovalor.setnoviembre(Double.parseDouble(this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldnoviembreCentroCostoValor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoValorConstantesFunciones.LABEL_NOVIEMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabelnoviembreCentroCostoValor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocostovalor.setdiciembre(Double.parseDouble(this.jInternalFrameDetalleFormCentroCostoValor.jTextFielddiciembreCentroCostoValor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoValorConstantesFunciones.LABEL_DICIEMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoValor.jLabeldiciembreCentroCostoValor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCentroCostoValor(CentroCostoValor centrocostovalorBean,CentroCostoValor centrocostovalor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && centrocostovalorBean.getid_centro_costo()!=null && !centrocostovalorBean.getid_centro_costo().equals(null))) {centrocostovalor.setid_centro_costo(centrocostovalorBean.getid_centro_costo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCentroCostoValor(CentroCostoValor centrocostovalorOrigen,CentroCostoValor centrocostovalor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && centrocostovalorOrigen.getId()!=null && !centrocostovalorOrigen.getId().equals(0L))) {centrocostovalor.setId(centrocostovalorOrigen.getId());}}
			if(conDefault || (!conDefault && centrocostovalorOrigen.getid_centro_costo()!=null && !centrocostovalorOrigen.getid_centro_costo().equals(null))) {centrocostovalor.setid_centro_costo(centrocostovalorOrigen.getid_centro_costo());}
			if(conDefault || (!conDefault && centrocostovalorOrigen.getnombre()!=null && !centrocostovalorOrigen.getnombre().equals(""))) {centrocostovalor.setnombre(centrocostovalorOrigen.getnombre());}
			if(conDefault || (!conDefault && centrocostovalorOrigen.getenero()!=null && !centrocostovalorOrigen.getenero().equals(0.0))) {centrocostovalor.setenero(centrocostovalorOrigen.getenero());}
			if(conDefault || (!conDefault && centrocostovalorOrigen.getfebrero()!=null && !centrocostovalorOrigen.getfebrero().equals(0.0))) {centrocostovalor.setfebrero(centrocostovalorOrigen.getfebrero());}
			if(conDefault || (!conDefault && centrocostovalorOrigen.getmarzo()!=null && !centrocostovalorOrigen.getmarzo().equals(0.0))) {centrocostovalor.setmarzo(centrocostovalorOrigen.getmarzo());}
			if(conDefault || (!conDefault && centrocostovalorOrigen.getabril()!=null && !centrocostovalorOrigen.getabril().equals(0.0))) {centrocostovalor.setabril(centrocostovalorOrigen.getabril());}
			if(conDefault || (!conDefault && centrocostovalorOrigen.getmayo()!=null && !centrocostovalorOrigen.getmayo().equals(0.0))) {centrocostovalor.setmayo(centrocostovalorOrigen.getmayo());}
			if(conDefault || (!conDefault && centrocostovalorOrigen.getjunio()!=null && !centrocostovalorOrigen.getjunio().equals(0.0))) {centrocostovalor.setjunio(centrocostovalorOrigen.getjunio());}
			if(conDefault || (!conDefault && centrocostovalorOrigen.getjulio()!=null && !centrocostovalorOrigen.getjulio().equals(0.0))) {centrocostovalor.setjulio(centrocostovalorOrigen.getjulio());}
			if(conDefault || (!conDefault && centrocostovalorOrigen.getagosto()!=null && !centrocostovalorOrigen.getagosto().equals(0.0))) {centrocostovalor.setagosto(centrocostovalorOrigen.getagosto());}
			if(conDefault || (!conDefault && centrocostovalorOrigen.getseptiembre()!=null && !centrocostovalorOrigen.getseptiembre().equals(0.0))) {centrocostovalor.setseptiembre(centrocostovalorOrigen.getseptiembre());}
			if(conDefault || (!conDefault && centrocostovalorOrigen.getoctubre()!=null && !centrocostovalorOrigen.getoctubre().equals(0.0))) {centrocostovalor.setoctubre(centrocostovalorOrigen.getoctubre());}
			if(conDefault || (!conDefault && centrocostovalorOrigen.getnoviembre()!=null && !centrocostovalorOrigen.getnoviembre().equals(0.0))) {centrocostovalor.setnoviembre(centrocostovalorOrigen.getnoviembre());}
			if(conDefault || (!conDefault && centrocostovalorOrigen.getdiciembre()!=null && !centrocostovalorOrigen.getdiciembre().equals(0.0))) {centrocostovalor.setdiciembre(centrocostovalorOrigen.getdiciembre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCentroCostoValor(CentroCostoValor centrocostovalor) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCentroCostoValor.jLabelidCentroCostoValor.setText(centrocostovalor.getId().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldnombreCentroCostoValor.setText(centrocostovalor.getnombre());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldeneroCentroCostoValor.setText(centrocostovalor.getenero().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldfebreroCentroCostoValor.setText(centrocostovalor.getfebrero().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldmarzoCentroCostoValor.setText(centrocostovalor.getmarzo().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldabrilCentroCostoValor.setText(centrocostovalor.getabril().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldmayoCentroCostoValor.setText(centrocostovalor.getmayo().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldjunioCentroCostoValor.setText(centrocostovalor.getjunio().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldjulioCentroCostoValor.setText(centrocostovalor.getjulio().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldagostoCentroCostoValor.setText(centrocostovalor.getagosto().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldseptiembreCentroCostoValor.setText(centrocostovalor.getseptiembre().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldoctubreCentroCostoValor.setText(centrocostovalor.getoctubre().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldnoviembreCentroCostoValor.setText(centrocostovalor.getnoviembre().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFielddiciembreCentroCostoValor.setText(centrocostovalor.getdiciembre().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCentroCostoValor(CentroCostoValorBean centrocostovalorBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCentroCostoValor.jLabelidCentroCostoValor.setText(centrocostovalorBean.getId().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldnombreCentroCostoValor.setText(centrocostovalorBean.getnombre());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldeneroCentroCostoValor.setText(centrocostovalorBean.getenero().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldfebreroCentroCostoValor.setText(centrocostovalorBean.getfebrero().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldmarzoCentroCostoValor.setText(centrocostovalorBean.getmarzo().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldabrilCentroCostoValor.setText(centrocostovalorBean.getabril().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldmayoCentroCostoValor.setText(centrocostovalorBean.getmayo().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldjunioCentroCostoValor.setText(centrocostovalorBean.getjunio().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldjulioCentroCostoValor.setText(centrocostovalorBean.getjulio().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldagostoCentroCostoValor.setText(centrocostovalorBean.getagosto().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldseptiembreCentroCostoValor.setText(centrocostovalorBean.getseptiembre().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldoctubreCentroCostoValor.setText(centrocostovalorBean.getoctubre().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldnoviembreCentroCostoValor.setText(centrocostovalorBean.getnoviembre().toString());
			this.jInternalFrameDetalleFormCentroCostoValor.jTextFielddiciembreCentroCostoValor.setText(centrocostovalorBean.getdiciembre().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCentroCostoValor(CentroCostoValorParameterReturnGeneral centrocostovalorReturnGeneral,CentroCostoValorBean centrocostovalorBean,Boolean conDefault) throws Exception { 
		try {
			CentroCostoValor centrocostovalorLocal=new CentroCostoValor();
			
			centrocostovalorLocal=centrocostovalorReturnGeneral.getCentroCostoValor();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && centrocostovalorLocal.getId()!=null && !centrocostovalorLocal.getId().equals(0L))) {centrocostovalorBean.setId(centrocostovalorLocal.getId());}}
			if(conDefault || (!conDefault && centrocostovalorLocal.getid_centro_costo()!=null && !centrocostovalorLocal.getid_centro_costo().equals(null))) {centrocostovalorBean.setid_centro_costo(centrocostovalorLocal.getid_centro_costo());}
			if(conDefault || (!conDefault && centrocostovalorLocal.getnombre()!=null && !centrocostovalorLocal.getnombre().equals(""))) {centrocostovalorBean.setnombre(centrocostovalorLocal.getnombre());}
			if(conDefault || (!conDefault && centrocostovalorLocal.getenero()!=null && !centrocostovalorLocal.getenero().equals(0.0))) {centrocostovalorBean.setenero(centrocostovalorLocal.getenero());}
			if(conDefault || (!conDefault && centrocostovalorLocal.getfebrero()!=null && !centrocostovalorLocal.getfebrero().equals(0.0))) {centrocostovalorBean.setfebrero(centrocostovalorLocal.getfebrero());}
			if(conDefault || (!conDefault && centrocostovalorLocal.getmarzo()!=null && !centrocostovalorLocal.getmarzo().equals(0.0))) {centrocostovalorBean.setmarzo(centrocostovalorLocal.getmarzo());}
			if(conDefault || (!conDefault && centrocostovalorLocal.getabril()!=null && !centrocostovalorLocal.getabril().equals(0.0))) {centrocostovalorBean.setabril(centrocostovalorLocal.getabril());}
			if(conDefault || (!conDefault && centrocostovalorLocal.getmayo()!=null && !centrocostovalorLocal.getmayo().equals(0.0))) {centrocostovalorBean.setmayo(centrocostovalorLocal.getmayo());}
			if(conDefault || (!conDefault && centrocostovalorLocal.getjunio()!=null && !centrocostovalorLocal.getjunio().equals(0.0))) {centrocostovalorBean.setjunio(centrocostovalorLocal.getjunio());}
			if(conDefault || (!conDefault && centrocostovalorLocal.getjulio()!=null && !centrocostovalorLocal.getjulio().equals(0.0))) {centrocostovalorBean.setjulio(centrocostovalorLocal.getjulio());}
			if(conDefault || (!conDefault && centrocostovalorLocal.getagosto()!=null && !centrocostovalorLocal.getagosto().equals(0.0))) {centrocostovalorBean.setagosto(centrocostovalorLocal.getagosto());}
			if(conDefault || (!conDefault && centrocostovalorLocal.getseptiembre()!=null && !centrocostovalorLocal.getseptiembre().equals(0.0))) {centrocostovalorBean.setseptiembre(centrocostovalorLocal.getseptiembre());}
			if(conDefault || (!conDefault && centrocostovalorLocal.getoctubre()!=null && !centrocostovalorLocal.getoctubre().equals(0.0))) {centrocostovalorBean.setoctubre(centrocostovalorLocal.getoctubre());}
			if(conDefault || (!conDefault && centrocostovalorLocal.getnoviembre()!=null && !centrocostovalorLocal.getnoviembre().equals(0.0))) {centrocostovalorBean.setnoviembre(centrocostovalorLocal.getnoviembre());}
			if(conDefault || (!conDefault && centrocostovalorLocal.getdiciembre()!=null && !centrocostovalorLocal.getdiciembre().equals(0.0))) {centrocostovalorBean.setdiciembre(centrocostovalorLocal.getdiciembre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCentroCostoValorGenerico(Long idCentroCostoValorSeleccionado,JComboBox jComboBoxCentroCostoValor,List<CentroCostoValor> centrocostovalorsLocal)throws Exception {
		try {
			CentroCostoValor  centrocostovalorTemp=null;

			for(CentroCostoValor centrocostovalorAux:centrocostovalorsLocal) {
				if(centrocostovalorAux.getId()!=null && centrocostovalorAux.getId().equals(idCentroCostoValorSeleccionado)) {
					centrocostovalorTemp=centrocostovalorAux;
					break;
				}
			}

			jComboBoxCentroCostoValor.setSelectedItem(centrocostovalorTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCentroCostoValorGenerico(JComboBox jComboBoxCentroCostoValor,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCentroCostoValor.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCentroCostoValor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCentroCostoValor.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCentroCostoValor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			centrocostovalor=(CentroCostoValor) centrocostovalorLogic.getCentroCostoValors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			centrocostovalor =(CentroCostoValor) centrocostovalors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!centrocostovalor.getIsNew() && !centrocostovalor.getIsChanged() && !centrocostovalor.getIsDeleted()) {
				sDescripcion=centrocostovalor.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=centrocostovalor.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!centrocostovalor.getIsNew() && !centrocostovalor.getIsChanged() && !centrocostovalor.getIsDeleted()) {
				sDescripcion=centrocostovalor.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=centrocostovalor.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!centrocostovalor.getIsNew() && !centrocostovalor.getIsChanged() && !centrocostovalor.getIsDeleted()) {
				sDescripcion=centrocostovalor.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=centrocostovalor.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("CentroCosto")) {
			//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
			if(!centrocostovalor.getIsNew() && !centrocostovalor.getIsChanged() && !centrocostovalor.getIsDeleted()) {
				sDescripcion=centrocostovalor.getcentrocosto_descripcion();
			} else {
				//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
				sDescripcion=centrocostovalor.getcentrocosto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CentroCostoValor centrocostovalorRow=new CentroCostoValor();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			centrocostovalorRow=(CentroCostoValor) centrocostovalorLogic.getCentroCostoValors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			centrocostovalorRow=(CentroCostoValor) centrocostovalors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCentroCostoValor(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCentroCostoValor.setVisible((this.isVisibilidadCeldaNuevoCentroCostoValor && this.isPermisoNuevoCentroCostoValor));			
			this.jButtonDuplicarCentroCostoValor.setVisible((this.isVisibilidadCeldaDuplicarCentroCostoValor && this.isPermisoDuplicarCentroCostoValor));			
			this.jButtonCopiarCentroCostoValor.setVisible((this.isVisibilidadCeldaCopiarCentroCostoValor && this.isPermisoCopiarCentroCostoValor));
			this.jButtonVerFormCentroCostoValor.setVisible((this.isVisibilidadCeldaVerFormCentroCostoValor && this.isPermisoVerFormCentroCostoValor));
			
			this.jButtonAbrirOrderByCentroCostoValor.setVisible((this.isVisibilidadCeldaOrdenCentroCostoValor && this.isPermisoOrdenCentroCostoValor));			
			
			this.jButtonNuevoRelacionesCentroCostoValor.setVisible((this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor && this.isPermisoNuevoCentroCostoValor));			
			this.jButtonNuevoGuardarCambiosCentroCostoValor.setVisible((this.isVisibilidadCeldaNuevoCentroCostoValor && this.isPermisoNuevoCentroCostoValor && this.isPermisoGuardarCambiosCentroCostoValor));
			
			if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonModificarCentroCostoValor.setVisible((this.isVisibilidadCeldaModificarCentroCostoValor && this.isPermisoActualizarCentroCostoValor));	
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonActualizarCentroCostoValor.setVisible((this.isVisibilidadCeldaActualizarCentroCostoValor && this.isPermisoActualizarCentroCostoValor));	
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonEliminarCentroCostoValor.setVisible((this.isVisibilidadCeldaEliminarCentroCostoValor && this.isPermisoEliminarCentroCostoValor));
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonCancelarCentroCostoValor.setVisible(this.isVisibilidadCeldaCancelarCentroCostoValor);							
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonGuardarCambiosCentroCostoValor.setVisible((this.isVisibilidadCeldaGuardarCentroCostoValor && this.isPermisoGuardarCambiosCentroCostoValor));			
			
			}
						
			this.jButtonGuardarCambiosTablaCentroCostoValor.setVisible((this.isVisibilidadCeldaGuardarCambiosCentroCostoValor && this.isPermisoGuardarCambiosCentroCostoValor));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCentroCostoValor.setVisible((this.isVisibilidadCeldaNuevoCentroCostoValor && this.isPermisoNuevoCentroCostoValor));						
			this.jButtonDuplicarToolBarCentroCostoValor.setVisible((this.isVisibilidadCeldaDuplicarCentroCostoValor && this.isPermisoDuplicarCentroCostoValor));						
			this.jButtonCopiarToolBarCentroCostoValor.setVisible((this.isVisibilidadCeldaCopiarCentroCostoValor && this.isPermisoCopiarCentroCostoValor));			
			this.jButtonVerFormToolBarCentroCostoValor.setVisible((this.isVisibilidadCeldaVerFormCentroCostoValor && this.isPermisoVerFormCentroCostoValor));			
			this.jButtonAbrirOrderByToolBarCentroCostoValor.setVisible((this.isVisibilidadCeldaOrdenCentroCostoValor && this.isPermisoOrdenCentroCostoValor));
			this.jButtonNuevoRelacionesToolBarCentroCostoValor.setVisible((this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor && this.isPermisoNuevoCentroCostoValor));			
			this.jButtonNuevoGuardarCambiosToolBarCentroCostoValor.setVisible((this.isVisibilidadCeldaNuevoCentroCostoValor && this.isPermisoNuevoCentroCostoValor && this.isPermisoGuardarCambiosCentroCostoValor));			
			
			if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonModificarToolBarCentroCostoValor.setVisible((this.isVisibilidadCeldaModificarCentroCostoValor && this.isPermisoActualizarCentroCostoValor));	
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonActualizarToolBarCentroCostoValor.setVisible((this.isVisibilidadCeldaActualizarCentroCostoValor  && this.isPermisoActualizarCentroCostoValor));	
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonEliminarToolBarCentroCostoValor.setVisible((this.isVisibilidadCeldaEliminarCentroCostoValor && this.isPermisoEliminarCentroCostoValor));
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonCancelarToolBarCentroCostoValor.setVisible(this.isVisibilidadCeldaCancelarCentroCostoValor);				
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonGuardarCambiosToolBarCentroCostoValor.setVisible((this.isVisibilidadCeldaGuardarCentroCostoValor && this.isPermisoGuardarCambiosCentroCostoValor));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCentroCostoValor.setVisible((this.isVisibilidadCeldaGuardarCambiosCentroCostoValor && this.isPermisoGuardarCambiosCentroCostoValor));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCentroCostoValor.setVisible((this.isVisibilidadCeldaNuevoCentroCostoValor && this.isPermisoNuevoCentroCostoValor));			
			this.jMenuItemDuplicarCentroCostoValor.setVisible((this.isVisibilidadCeldaDuplicarCentroCostoValor && this.isPermisoDuplicarCentroCostoValor));			
			this.jMenuItemCopiarCentroCostoValor.setVisible((this.isVisibilidadCeldaCopiarCentroCostoValor && this.isPermisoCopiarCentroCostoValor));			
			this.jMenuItemVerFormCentroCostoValor.setVisible((this.isVisibilidadCeldaVerFormCentroCostoValor && this.isPermisoVerFormCentroCostoValor));			
			this.jMenuItemAbrirOrderByCentroCostoValor.setVisible((this.isVisibilidadCeldaOrdenCentroCostoValor && this.isPermisoOrdenCentroCostoValor));			
			//this.jMenuItemMostrarOcultarCentroCostoValor.setVisible((this.isVisibilidadCeldaOrdenCentroCostoValor && this.isPermisoOrdenCentroCostoValor));
			this.jMenuItemDetalleAbrirOrderByCentroCostoValor.setVisible((this.isVisibilidadCeldaOrdenCentroCostoValor && this.isPermisoOrdenCentroCostoValor));			
			//this.jMenuItemDetalleMostrarOcultarCentroCostoValor.setVisible((this.isVisibilidadCeldaOrdenCentroCostoValor && this.isPermisoOrdenCentroCostoValor));			
			this.jMenuItemNuevoRelacionesCentroCostoValor.setVisible((this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor && this.isPermisoNuevoCentroCostoValor));			
			this.jMenuItemNuevoGuardarCambiosCentroCostoValor.setVisible((this.isVisibilidadCeldaNuevoCentroCostoValor && this.isPermisoNuevoCentroCostoValor && this.isPermisoGuardarCambiosCentroCostoValor));									
			
			if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
			this.jInternalFrameDetalleFormCentroCostoValor.jMenuItemModificarCentroCostoValor.setVisible((this.isVisibilidadCeldaModificarCentroCostoValor && this.isPermisoActualizarCentroCostoValor));	
			this.jInternalFrameDetalleFormCentroCostoValor.jMenuItemActualizarCentroCostoValor.setVisible((this.isVisibilidadCeldaActualizarCentroCostoValor && this.isPermisoActualizarCentroCostoValor));	
			this.jInternalFrameDetalleFormCentroCostoValor.jMenuItemEliminarCentroCostoValor.setVisible((this.isVisibilidadCeldaEliminarCentroCostoValor && this.isPermisoEliminarCentroCostoValor));
			this.jInternalFrameDetalleFormCentroCostoValor.jMenuItemCancelarCentroCostoValor.setVisible(this.isVisibilidadCeldaCancelarCentroCostoValor);				
			}
			
			this.jMenuItemGuardarCambiosCentroCostoValor.setVisible((this.isVisibilidadCeldaGuardarCentroCostoValor && this.isPermisoGuardarCambiosCentroCostoValor));						
			this.jMenuItemGuardarCambiosTablaCentroCostoValor.setVisible((this.isVisibilidadCeldaGuardarCambiosCentroCostoValor && this.isPermisoGuardarCambiosCentroCostoValor));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCentroCostoValor=this.jButtonNuevoCentroCostoValor.isVisible();
			this.isVisibilidadCeldaDuplicarCentroCostoValor=this.jButtonDuplicarCentroCostoValor.isVisible();
			this.isVisibilidadCeldaCopiarCentroCostoValor=this.jButtonCopiarCentroCostoValor.isVisible();
			this.isVisibilidadCeldaVerFormCentroCostoValor=this.jButtonVerFormCentroCostoValor.isVisible();
			
			this.isVisibilidadCeldaOrdenCentroCostoValor=this.jButtonAbrirOrderByCentroCostoValor.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor=this.jButtonNuevoRelacionesCentroCostoValor.isVisible();
			this.isVisibilidadCeldaModificarCentroCostoValor=this.jButtonModificarCentroCostoValor.isVisible();
			
			if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
			this.isVisibilidadCeldaActualizarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jButtonActualizarCentroCostoValor.isVisible();
			this.isVisibilidadCeldaEliminarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jButtonEliminarCentroCostoValor.isVisible();
			this.isVisibilidadCeldaCancelarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jButtonCancelarCentroCostoValor.isVisible();
			this.isVisibilidadCeldaGuardarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jButtonGuardarCambiosCentroCostoValor.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCentroCostoValor=this.jButtonGuardarCambiosTablaCentroCostoValor.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCentroCostoValor=this.jButtonNuevoToolBarCentroCostoValor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor=this.jButtonNuevoRelacionesToolBarCentroCostoValor.isVisible();
			
			if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
			this.isVisibilidadCeldaModificarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jButtonModificarToolBarCentroCostoValor.isVisible();
			this.isVisibilidadCeldaActualizarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jButtonActualizarToolBarCentroCostoValor.isVisible();
			this.isVisibilidadCeldaEliminarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jButtonEliminarToolBarCentroCostoValor.isVisible();
			this.isVisibilidadCeldaCancelarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jButtonCancelarToolBarCentroCostoValor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCentroCostoValor=this.jButtonGuardarCambiosToolBarCentroCostoValor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCentroCostoValor=this.jButtonGuardarCambiosTablaToolBarCentroCostoValor.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCentroCostoValor=this.jMenuItemNuevoCentroCostoValor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor=this.jMenuItemNuevoRelacionesCentroCostoValor.isVisible();
			
			if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
			this.isVisibilidadCeldaModificarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jMenuItemModificarCentroCostoValor.isVisible();
			this.isVisibilidadCeldaActualizarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jMenuItemActualizarCentroCostoValor.isVisible();
			this.isVisibilidadCeldaEliminarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jMenuItemEliminarCentroCostoValor.isVisible();
			this.isVisibilidadCeldaCancelarCentroCostoValor=this.jInternalFrameDetalleFormCentroCostoValor.jMenuItemCancelarCentroCostoValor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCentroCostoValor=this.jMenuItemGuardarCambiosCentroCostoValor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCentroCostoValor=this.jMenuItemGuardarCambiosTablaCentroCostoValor.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCentroCostoValor(Boolean esInicializar) {
		if(CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {			
			if(this.centrocostovalorSessionBean.getConGuardarRelaciones()) {
				//if(this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCentroCostoValor();
			}
			
			this.inicializarActualizarBindingBotonesManualCentroCostoValor(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCentroCostoValor() {
		this.jButtonNuevoCentroCostoValor.setVisible(this.isPermisoNuevoCentroCostoValor);			
		this.jButtonDuplicarCentroCostoValor.setVisible(this.isPermisoDuplicarCentroCostoValor);			
		this.jButtonCopiarCentroCostoValor.setVisible(this.isPermisoCopiarCentroCostoValor);			
		this.jButtonVerFormCentroCostoValor.setVisible(this.isPermisoVerFormCentroCostoValor);			
		
		this.jButtonAbrirOrderByCentroCostoValor.setVisible(this.isPermisoOrdenCentroCostoValor);					
		
		this.jButtonNuevoRelacionesCentroCostoValor.setVisible(this.isPermisoNuevoCentroCostoValor);			
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonModificarCentroCostoValor.setVisible(this.isPermisoActualizarCentroCostoValor);	
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonActualizarCentroCostoValor.setVisible(this.isPermisoActualizarCentroCostoValor);	
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonEliminarCentroCostoValor.setVisible(this.isPermisoEliminarCentroCostoValor);
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonCancelarCentroCostoValor.setVisible(this.isVisibilidadCeldaCancelarCentroCostoValor);						
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonGuardarCambiosCentroCostoValor.setVisible(this.isPermisoGuardarCambiosCentroCostoValor);							
		}
		
		this.jButtonGuardarCambiosTablaCentroCostoValor.setVisible(this.isPermisoActualizarCentroCostoValor);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCentroCostoValor() {
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonModificarCentroCostoValor.setVisible(this.isPermisoActualizarCentroCostoValor);	
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonActualizarCentroCostoValor.setVisible(this.isPermisoActualizarCentroCostoValor);	
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonEliminarCentroCostoValor.setVisible(this.isPermisoEliminarCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonCancelarCentroCostoValor.setVisible(this.isVisibilidadCeldaCancelarCentroCostoValor);							
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonGuardarCambiosCentroCostoValor.setVisible((this.isVisibilidadCeldaGuardarCentroCostoValor && this.isPermisoGuardarCambiosCentroCostoValor));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCentroCostoValor() {
		if(CentroCostoValorJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCentroCostoValor();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCentroCostoValor() {
	}
	
	public void jTableDatosCentroCostoValorListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCentroCostoValor(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCentroCostoValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostovalor==null) {
						this.centrocostovalor = new CentroCostoValor();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				}

				if(this.centrocostovalor.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.centrocostovalor.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoValor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCentroCostoValorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCentroCostoValor(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCentroCostoValor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCentroCostoValor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.centrocostovalorLogic.getConnexion());

				if(this.centrocostovalor.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.centrocostovalor.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCentroCostoValor=(TitledBorder)this.jScrollPanelDatosCentroCostoValor.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCentroCostoValor.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCentroCostoValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostovalor==null) {
						this.centrocostovalor = new CentroCostoValor();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				}

				if(this.centrocostovalor.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.centrocostovalor.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoValor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCentroCostoValorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCentroCostoValor(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCentroCostoValor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCentroCostoValor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.centrocostovalorLogic.getConnexion());

				if(this.centrocostovalor.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.centrocostovalor.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCentroCostoValor=(TitledBorder)this.jScrollPanelDatosCentroCostoValor.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCentroCostoValor.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCentroCostoValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostovalor==null) {
						this.centrocostovalor = new CentroCostoValor();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				}

				if(this.centrocostovalor.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.centrocostovalor.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoValor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioCentroCostoValorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebCentroCostoValor(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCentroCostoValor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCentroCostoValor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.centrocostovalorLogic.getConnexion());

				if(this.centrocostovalor.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.centrocostovalor.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCentroCostoValor=(TitledBorder)this.jScrollPanelDatosCentroCostoValor.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderCentroCostoValor.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioCentroCostoValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostovalor==null) {
						this.centrocostovalor = new CentroCostoValor();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				}

				if(this.centrocostovalor.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.centrocostovalor.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoValor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_centro_costoCentroCostoValorActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.centrocostoBeanSwingJInternalFrame.sTipoBusqueda="CentroCosto";

			if(!this.sFinalQueryGeneral_centrocosto.equals("")) {
				this.centrocostoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_centrocosto);
				this.centrocostoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.centrocostoBeanSwingJInternalFrame.procesarBusqueda(this.centrocostoBeanSwingJInternalFrame.sAccionBusqueda);
				this.centrocostoBeanSwingJInternalFrame.inicializarActualizarBindingCentroCosto(false);
			}

			if(!this.sFinalQueryComboCentroCosto.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.centrocostoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderCentroCostoValor=null;
			TitledBorder titledBordercentrocosto=null;

			if(!this.jScrollPanelDatosCentroCostoValor.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCentroCostoValor=(TitledBorder)this.jScrollPanelDatosCentroCostoValor.getBorder();
				titledBordercentrocosto=(TitledBorder)this.centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

				titledBordercentrocosto.setTitle(titledBorderCentroCostoValor.getTitle() + " -> Centro Costo");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_centro_costoCentroCostoValorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocentrocosto=true;

			idTienePermisocentrocosto=this.tienePermisosUsuarioEnPaginaWebCentroCostoValor(CentroCostoConstantesFunciones.CLASSNAME);

			if(idTienePermisocentrocosto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCentroCostoValor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCentroCostoValor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);

				this.centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.centrocostoBeanSwingJInternalFrame.getCentroCostoLogic().setConnexion(this.centrocostovalorLogic.getConnexion());

				if(this.centrocostovalor.getid_centro_costo()!=null) {
					this.centrocostoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.centrocostoBeanSwingJInternalFrame.setIdActual(this.centrocostovalor.getid_centro_costo());
					this.centrocostoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroCosto();
				}

				JInternalFrameBase jinternalFrame =this.centrocostoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCentroCostoValor=(TitledBorder)this.jScrollPanelDatosCentroCostoValor.getBorder();
				TitledBorder titledBordercentrocosto=(TitledBorder)this.centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

				titledBordercentrocosto.setTitle(titledBorderCentroCostoValor.getTitle() + " -> Centro Costo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_centro_costoCentroCostoValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostovalor==null) {
						this.centrocostovalor = new CentroCostoValor();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				}

				if(this.centrocostovalor.getid_centro_costo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_centro_costo = "+this.centrocostovalor.getid_centro_costo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoValor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCentroCostoValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostovalor==null) {
						this.centrocostovalor = new CentroCostoValor();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				}

				if(this.centrocostovalor.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.centrocostovalor.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoValor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoneneroCentroCostoValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostovalor==null) {
						this.centrocostovalor = new CentroCostoValor();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				}

				if(this.centrocostovalor.getenero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where enero = "+this.centrocostovalor.getenero().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoValor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfebreroCentroCostoValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostovalor==null) {
						this.centrocostovalor = new CentroCostoValor();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				}

				if(this.centrocostovalor.getfebrero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where febrero = "+this.centrocostovalor.getfebrero().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoValor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmarzoCentroCostoValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostovalor==null) {
						this.centrocostovalor = new CentroCostoValor();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				}

				if(this.centrocostovalor.getmarzo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where marzo = "+this.centrocostovalor.getmarzo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoValor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonabrilCentroCostoValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostovalor==null) {
						this.centrocostovalor = new CentroCostoValor();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				}

				if(this.centrocostovalor.getabril()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where abril = "+this.centrocostovalor.getabril().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoValor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmayoCentroCostoValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostovalor==null) {
						this.centrocostovalor = new CentroCostoValor();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				}

				if(this.centrocostovalor.getmayo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where mayo = "+this.centrocostovalor.getmayo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoValor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonjunioCentroCostoValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostovalor==null) {
						this.centrocostovalor = new CentroCostoValor();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				}

				if(this.centrocostovalor.getjunio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where junio = "+this.centrocostovalor.getjunio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoValor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonjulioCentroCostoValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostovalor==null) {
						this.centrocostovalor = new CentroCostoValor();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				}

				if(this.centrocostovalor.getjulio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where julio = "+this.centrocostovalor.getjulio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoValor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonagostoCentroCostoValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostovalor==null) {
						this.centrocostovalor = new CentroCostoValor();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				}

				if(this.centrocostovalor.getagosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where agosto = "+this.centrocostovalor.getagosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoValor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonseptiembreCentroCostoValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostovalor==null) {
						this.centrocostovalor = new CentroCostoValor();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				}

				if(this.centrocostovalor.getseptiembre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where septiembre = "+this.centrocostovalor.getseptiembre().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoValor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonoctubreCentroCostoValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostovalor==null) {
						this.centrocostovalor = new CentroCostoValor();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				}

				if(this.centrocostovalor.getoctubre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where octubre = "+this.centrocostovalor.getoctubre().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoValor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnoviembreCentroCostoValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostovalor==null) {
						this.centrocostovalor = new CentroCostoValor();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				}

				if(this.centrocostovalor.getnoviembre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where noviembre = "+this.centrocostovalor.getnoviembre().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoValor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondiciembreCentroCostoValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.getcentrocostovalor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostovalor==null) {
						this.centrocostovalor = new CentroCostoValor();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);
				}

				if(this.centrocostovalor.getdiciembre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where diciembre = "+this.centrocostovalor.getdiciembre().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoValor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCostoValor(false,false);

			this.getCentroCostoValorsBusquedaPorNombre();

			this.inicializarActualizarBindingCentroCostoValor(false);

			//if(CentroCostoValorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCostoValor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCentroCostoCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCostoValor(false,false);

			this.getCentroCostoValorsFK_IdCentroCosto();

			this.inicializarActualizarBindingCentroCostoValor(false);

			//if(CentroCostoValorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCostoValor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCostoValor(false,false);

			this.getCentroCostoValorsFK_IdEjercicio();

			this.inicializarActualizarBindingCentroCostoValor(false);

			//if(CentroCostoValorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCostoValor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCostoValor(false,false);

			this.getCentroCostoValorsFK_IdEmpresa();

			this.inicializarActualizarBindingCentroCostoValor(false);

			//if(CentroCostoValorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCostoValor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCentroCostoValorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCostoValor(false,false);

			this.getCentroCostoValorsFK_IdSucursal();

			this.inicializarActualizarBindingCentroCostoValor(false);

			//if(CentroCostoValorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCostoValor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostovalorLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCentroCostoValor() {
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
			this.jInternalFrameDetalleFormCentroCostoValor.setVisible(false);	    			
			this.jInternalFrameDetalleFormCentroCostoValor.dispose();
			this.jInternalFrameDetalleFormCentroCostoValor=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCentroCostoValor!=null) {
			this.jInternalFrameReporteDinamicoCentroCostoValor.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCentroCostoValor.dispose();
			this.jInternalFrameReporteDinamicoCentroCostoValor=null;
		}
		
		if(this.jInternalFrameImportacionCentroCostoValor!=null) {
			this.jInternalFrameImportacionCentroCostoValor.setVisible(false);	    			
			this.jInternalFrameImportacionCentroCostoValor.dispose();
			this.jInternalFrameImportacionCentroCostoValor=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCentroCostoValor();
			
			CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
			
			
			if(sTipo.equals("NuevoCentroCostoValor")) {
				jButtonNuevoCentroCostoValorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCentroCostoValor")) {
				jButtonDuplicarCentroCostoValorActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCentroCostoValor")) {
				jButtonCopiarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("VerFormCentroCostoValor")) {
				jButtonVerFormCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCentroCostoValor")) {
				jButtonNuevoCentroCostoValorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCentroCostoValor")) {
				jButtonDuplicarCentroCostoValorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCentroCostoValor")) {
				jButtonNuevoCentroCostoValorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCentroCostoValor")) {
				jButtonDuplicarCentroCostoValorActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCentroCostoValor")) {
				jButtonNuevoCentroCostoValorActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCentroCostoValor")) {
				jButtonNuevoCentroCostoValorActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCentroCostoValor")) {
				jButtonNuevoCentroCostoValorActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCentroCostoValor")) {
				jButtonModificarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCentroCostoValor")) {
				jButtonModificarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCentroCostoValor")) {
				jButtonModificarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCentroCostoValor")) {
				jButtonActualizarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCentroCostoValor")) {
				jButtonActualizarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCentroCostoValor")) {
				jButtonActualizarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("EliminarCentroCostoValor")) {
				jButtonEliminarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCentroCostoValor")) {
				jButtonEliminarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCentroCostoValor")) {
				jButtonEliminarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("CancelarCentroCostoValor")) {
				jButtonCancelarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCentroCostoValor")) {
				jButtonCancelarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCentroCostoValor")) {
				jButtonCancelarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("CerrarCentroCostoValor")) {
				jButtonCerrarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCentroCostoValor")) {
				jButtonCerrarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCentroCostoValor")) {
				jButtonCerrarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCentroCostoValor")) {
				jButtonMostrarOcultarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCentroCostoValor")) {
				jButtonCancelarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCentroCostoValor")) {
				jButtonGuardarCambiosCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCentroCostoValor")) {
				jButtonGuardarCambiosCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCentroCostoValor")) {
				jButtonCopiarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCentroCostoValor")) {
				jButtonVerFormCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCentroCostoValor")) {
				jButtonGuardarCambiosCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCentroCostoValor")) {
				jButtonCopiarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCentroCostoValor")) {
				jButtonVerFormCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCentroCostoValor")) {
				jButtonGuardarCambiosCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCentroCostoValor")) {
				jButtonGuardarCambiosCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCentroCostoValor")) {
				jButtonGuardarCambiosCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCentroCostoValor")) {
				jButtonRecargarInformacionCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCentroCostoValor")) {
				jButtonRecargarInformacionCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCentroCostoValor")) {
				jButtonRecargarInformacionCentroCostoValorActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCentroCostoValor")) {
				jButtonAnterioresCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCentroCostoValor")) {
				jButtonAnterioresCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCentroCostoValor")) {
				jButtonAnterioresCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCentroCostoValor")) {
				jButtonSiguientesCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCentroCostoValor")) {
				jButtonSiguientesCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCentroCostoValor")) {
				jButtonSiguientesCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCentroCostoValor") || sTipo.equals("MenuItemDetalleAbrirOrderByCentroCostoValor")) {
				jButtonAbrirOrderByCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCentroCostoValor") || sTipo.equals("MenuItemDetalleMostrarOcultarCentroCostoValor")) {
				jButtonMostrarOcultarCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCentroCostoValor")) {
				jButtonNuevoGuardarCambiosCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCentroCostoValor")) {
				jButtonNuevoGuardarCambiosCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCentroCostoValor")) {
				jButtonNuevoGuardarCambiosCentroCostoValorActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCentroCostoValor")) {
				jButtonCerrarReporteDinamicoCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCentroCostoValor")) {
				jButtonGenerarReporteDinamicoCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCentroCostoValor")) {
				
				jButtonGenerarExcelReporteDinamicoCentroCostoValorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCentroCostoValor")) {
				jButtonCerrarImportacionCentroCostoValorActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCentroCostoValor")) {
				
				jButtonGenerarImportacionCentroCostoValorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCentroCostoValor")) {
				
				jButtonAbrirImportacionCentroCostoValorActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCentroCostoValor")) {
				jComboBoxTiposAccionesCentroCostoValorActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCentroCostoValor")) {
				jComboBoxTiposRelacionesCentroCostoValorActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCentroCostoValor")) {
				jComboBoxTiposAccionesCentroCostoValorActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCentroCostoValor")) {
				
				jComboBoxTiposSeleccionarCentroCostoValorActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCentroCostoValor")) {
				jTextFieldValorCampoGeneralCentroCostoValorActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCentroCostoValor")) {
				jButtonAbrirOrderByCentroCostoValorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCentroCostoValor")) {
				jButtonAbrirOrderByCentroCostoValorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCentroCostoValor")) {
				jButtonCerrarOrderByCentroCostoValorActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCentroCostoValorBusqueda")) {
				this.jButtonidCentroCostoValorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCentroCostoValorUpdate")) {
				this.jButtonid_empresaCentroCostoValorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCentroCostoValorBusqueda")) {
				this.jButtonid_empresaCentroCostoValorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCentroCostoValorUpdate")) {
				this.jButtonid_sucursalCentroCostoValorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCentroCostoValorBusqueda")) {
				this.jButtonid_sucursalCentroCostoValorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioCentroCostoValorUpdate")) {
				this.jButtonid_ejercicioCentroCostoValorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioCentroCostoValorBusqueda")) {
				this.jButtonid_ejercicioCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoValor")) {
				this.jButtonid_centro_costoCentroCostoValorActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoValorArbol")) {
				this.abrirFrameTreeCentroCosto("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoValorUpdate")) {
				this.jButtonid_centro_costoCentroCostoValorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoValorBusqueda")) {
				this.jButtonid_centro_costoCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCentroCostoValorBusqueda")) {
				this.jButtonnombreCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("eneroCentroCostoValorBusqueda")) {
				this.jButtoneneroCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("febreroCentroCostoValorBusqueda")) {
				this.jButtonfebreroCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("marzoCentroCostoValorBusqueda")) {
				this.jButtonmarzoCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("abrilCentroCostoValorBusqueda")) {
				this.jButtonabrilCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("mayoCentroCostoValorBusqueda")) {
				this.jButtonmayoCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("junioCentroCostoValorBusqueda")) {
				this.jButtonjunioCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("julioCentroCostoValorBusqueda")) {
				this.jButtonjulioCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("agostoCentroCostoValorBusqueda")) {
				this.jButtonagostoCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("septiembreCentroCostoValorBusqueda")) {
				this.jButtonseptiembreCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("octubreCentroCostoValorBusqueda")) {
				this.jButtonoctubreCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("noviembreCentroCostoValorBusqueda")) {
				this.jButtonnoviembreCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("diciembreCentroCostoValorBusqueda")) {
				this.jButtondiciembreCentroCostoValorBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_centro_costoCentroCostoValor")) {
				this.jButtonid_centro_costoCentroCostoValorActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("BusquedaPorNombreCentroCostoValor")) {
				this.jButtonBusquedaPorNombreCentroCostoValorActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCentroCostoCentroCostoValor")) {
				this.jButtonFK_IdCentroCostoCentroCostoValorActionPerformed(evt);
			}
			
			;
			
			
			CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCentroCostoValor();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoValorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostovalor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostovalor);
				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
				
				


				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoValor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoValor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CentroCostoValor centrocostovalorLocal=null;
			
			if(!this.getEsControlTabla()) {
				centrocostovalorLocal=this.centrocostovalor;
			} else {
				centrocostovalorLocal=this.centrocostovalorAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostovalor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostovalor);
				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
							
				
				


				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoValor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoValor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoValorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorAnterior =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostovalorAnterior =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
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
			
			CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
			
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
			
			


			
			CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoValorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostovalor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostovalor);
				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
								
						
				


				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoValor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoValor.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostovalor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostovalor);
				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
								
				
				


				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoValor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoValor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoValorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorAnterior =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostovalorAnterior =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostovalor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostovalor);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoValorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorAnterior =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostovalorAnterior =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoValorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostovalor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.centrocostovalor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostovalor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostovalor);
				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
							
				
				


				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoValor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoValor.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoValorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalorAnterior =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.centrocostovalorAnterior =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
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
			
			CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
			
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
			
			


			
			CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoValorActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostovalor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.centrocostovalor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostovalor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostovalor);
				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
								
				
				


				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoValor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoValor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoValorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorAnterior =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostovalorAnterior =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoValorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostovalor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.centrocostovalor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoValorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostovalor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostovalor);
				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCentroCostoValor")) {
					jCheckBoxSeleccionarTodosCentroCostoValorItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCentroCostoValor")) {
					jCheckBoxSeleccionadosCentroCostoValorItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCentroCostoValor")) {
					
				}
				
				


				
				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoValor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoValor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostovalor);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.centrocostovalor);
				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
												
				
				


				
				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoValor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoValor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoValorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostovalorAnterior =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.centrocostovalorAnterior =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoValorActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostovalor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostovalor);
				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
				
				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
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
			
			CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
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
			
			


			
			CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoValorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostovalor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostovalor);
				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoValor.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoValor.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostovalor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostovalor);
				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
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
				
				


				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoValor.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoValor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoValorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostovalorAnterior =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostovalorAnterior =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCentroCostoValor")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCentroCostoValorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCentroCostoValor.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.centrocostovalor =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.centrocostovalor =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.centrocostovalor);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCentroCostoValor")) {
				
				}
				
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCentroCostoValor")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCentroCostoValor.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCentroCostoValor")) {
			
			}
			
			CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCentroCostoValor();
			
			CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
			
			if(sTipo.equals("NuevoCentroCostoValor")) {
				jButtonNuevoCentroCostoValorActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCentroCostoValor")) {
				jButtonDuplicarCentroCostoValorActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCentroCostoValor")) {
				jButtonCopiarCentroCostoValorActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCentroCostoValor")) {
				jButtonVerFormCentroCostoValorActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCentroCostoValor")) {
				jButtonNuevoCentroCostoValorActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCentroCostoValor")) {
				jButtonModificarCentroCostoValorActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCentroCostoValor")) {
				jButtonActualizarCentroCostoValorActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCentroCostoValor")) {
				jButtonEliminarCentroCostoValorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCentroCostoValor")) {
				jButtonGuardarCambiosCentroCostoValorActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCentroCostoValor")) {
				jButtonCancelarCentroCostoValorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCentroCostoValor")) {
				jButtonCerrarCentroCostoValorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCentroCostoValor")) {
				jButtonGuardarCambiosCentroCostoValorActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCentroCostoValor")) {
				jButtonNuevoGuardarCambiosCentroCostoValorActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCentroCostoValor")) {
				jButtonAbrirOrderByCentroCostoValorActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCentroCostoValor")) {
				jButtonRecargarInformacionCentroCostoValorActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCentroCostoValor")) {
				jButtonAnterioresCentroCostoValorActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCentroCostoValor")) {
				jButtonSiguientesCentroCostoValorActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCentroCostoValorBusqueda")) {
				this.jButtonidCentroCostoValorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCentroCostoValorUpdate")) {
				this.jButtonid_empresaCentroCostoValorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCentroCostoValorBusqueda")) {
				this.jButtonid_empresaCentroCostoValorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCentroCostoValorUpdate")) {
				this.jButtonid_sucursalCentroCostoValorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCentroCostoValorBusqueda")) {
				this.jButtonid_sucursalCentroCostoValorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioCentroCostoValorUpdate")) {
				this.jButtonid_ejercicioCentroCostoValorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioCentroCostoValorBusqueda")) {
				this.jButtonid_ejercicioCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoValor")) {
				this.jButtonid_centro_costoCentroCostoValorActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoValorArbol")) {
				this.abrirFrameTreeCentroCosto("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoValorUpdate")) {
				this.jButtonid_centro_costoCentroCostoValorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoValorBusqueda")) {
				this.jButtonid_centro_costoCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCentroCostoValorBusqueda")) {
				this.jButtonnombreCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("eneroCentroCostoValorBusqueda")) {
				this.jButtoneneroCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("febreroCentroCostoValorBusqueda")) {
				this.jButtonfebreroCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("marzoCentroCostoValorBusqueda")) {
				this.jButtonmarzoCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("abrilCentroCostoValorBusqueda")) {
				this.jButtonabrilCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("mayoCentroCostoValorBusqueda")) {
				this.jButtonmayoCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("junioCentroCostoValorBusqueda")) {
				this.jButtonjunioCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("julioCentroCostoValorBusqueda")) {
				this.jButtonjulioCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("agostoCentroCostoValorBusqueda")) {
				this.jButtonagostoCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("septiembreCentroCostoValorBusqueda")) {
				this.jButtonseptiembreCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("octubreCentroCostoValorBusqueda")) {
				this.jButtonoctubreCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("noviembreCentroCostoValorBusqueda")) {
				this.jButtonnoviembreCentroCostoValorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("diciembreCentroCostoValorBusqueda")) {
				this.jButtondiciembreCentroCostoValorBusquedaActionPerformed(evt);
			}
			
			CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCentroCostoValor();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCentroCostoValor")) {
				closingInternalFrameCentroCostoValor();
				
			} else if(sTipo.equals("jButtonCancelarCentroCostoValor")) {
				JInternalFrameBase jInternalFrameDetalleFormCentroCostoValor = (JInternalFrameBase)evt.getSource();
	            	
	            CentroCostoValorBeanSwingJInternalFrame jInternalFrameParent=(CentroCostoValorBeanSwingJInternalFrame)jInternalFrameDetalleFormCentroCostoValor.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCentroCostoValorActionPerformed(null);
			}
			
			CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.centrocostovalor,new Object(),this.centrocostovalorParameterGeneral,this.centrocostovalorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCentroCostoValor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCentroCostoValor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCentroCostoValor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.centrocostovalor)) {
			if(!esControlTabla) {
				if(CentroCostoValorJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);			
				}
				
				if(this.centrocostovalorSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCentroCostoValor(this.centrocostovalor,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.centrocostovalorReturnGeneral=centrocostovalorLogic.procesarEventosCentroCostoValorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centrocostovalorLogic.getCentroCostoValors(),this.centrocostovalor,this.centrocostovalorParameterGeneral,this.isEsNuevoCentroCostoValor,classes);//this.centrocostovalorLogic.getCentroCostoValor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCentroCostoValor(this.centrocostovalorReturnGeneral,this.centrocostovalorBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.centrocostovalorSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCentroCostoValor(classes,this.centrocostovalorReturnGeneral,this.centrocostovalorBean,false);
					}
						
					if(this.centrocostovalorReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCentroCostoValor(this.centrocostovalorReturnGeneral.getCentroCostoValor());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCentroCostoValor(this.centrocostovalorReturnGeneral.getCentroCostoValor());	
					}
						
					if(this.centrocostovalorReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCentroCostoValor(this.centrocostovalorReturnGeneral.getCentroCostoValor(),classes);//this.centrocostovalorBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCentroCostoValor(this.centrocostovalor,classes);//this.centrocostovalorBean);									
				}
			
				if(CentroCostoValorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCentroCostoValor(this.centrocostovalor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoValor(this.centrocostovalor);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.centrocostovalorAnterior!=null) {
						this.centrocostovalor=this.centrocostovalorAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.centrocostovalorReturnGeneral=centrocostovalorLogic.procesarEventosCentroCostoValorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centrocostovalorLogic.getCentroCostoValors(),this.centrocostovalor,this.centrocostovalorParameterGeneral,this.isEsNuevoCentroCostoValor,classes);//this.centrocostovalorLogic.getCentroCostoValor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.centrocostovalorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.centrocostovalorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.centrocostovalorReturnGeneral.getCentroCostoValor(),centrocostovalorLogic.getCentroCostoValors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.centrocostovalorReturnGeneral.getCentroCostoValor(),this.centrocostovalors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCentroCostoValor.repaint();
				
				//((AbstractTableModel) this.jTableDatosCentroCostoValor.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCentroCostoValor();
			}
		}
	}
	
	public void actualizarVisualTableDatosCentroCostoValor() throws Exception {
		
		CentroCostoValorModel centrocostovalorModel=(CentroCostoValorModel)this.jTableDatosCentroCostoValor.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			centrocostovalorModel.centrocostovalors=this.centrocostovalorLogic.getCentroCostoValors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			centrocostovalorModel.centrocostovalors=this.centrocostovalors;
		}
		
		
		((CentroCostoValorModel) this.jTableDatosCentroCostoValor.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCentroCostoValor() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcentrocostovalorAnterior(),this.centrocostovalorLogic.getCentroCostoValors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcentrocostovalorAnterior(),this.centrocostovalors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCentroCostoValor();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCentroCostoValor(CentroCostoValor centrocostovalor,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
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
										
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centrocostovalor,new Object(),generalEntityParameterGeneral,this.centrocostovalorReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.centrocostovalorSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CentroCostoValorConstantesFunciones.getClassesRelationshipsOfCentroCostoValor(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CentroCostoValorConstantesFunciones.getClassesRelationshipsFromStringsOfCentroCostoValor(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCentroCostoValor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CentroCostoValorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centrocostovalor,new Object(),generalEntityParameterGeneral,this.centrocostovalorReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCentroCostoValor(CentroCostoValorBean centrocostovalorBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCentroCostoValor(ArrayList<Classe> classes,CentroCostoValorReturnGeneral centrocostovalorReturnGeneral,CentroCostoValorBean centrocostovalorBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCentroCostoValor(CentroCostoValor centrocostovalor,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.centrocostovalor)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCentroCostoValor = new CentroCostoValorDetalleFormJInternalFrame(jDesktopPane,this.centrocostovalorSessionBean.getConGuardarRelaciones(),this.centrocostovalorSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.setVisible(false);
		this.jInternalFrameDetalleFormCentroCostoValor.setSelected(false);						
		
		this.jInternalFrameDetalleFormCentroCostoValor.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCentroCostoValor.centrocostovalorLogic=this.centrocostovalorLogic;
		
		this.cargarCombosFrameForeignKeyCentroCostoValor("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCentroCostoValor();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCentroCostoValor();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCentroCostoValor("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCentroCostoValor();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCentroCostoValor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCentroCostoValor"));
		
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonModificarCentroCostoValor.addActionListener(new ButtonActionListener(this,"ModificarCentroCostoValor"));

		
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonModificarToolBarCentroCostoValor.addActionListener(new ButtonActionListener(this,"ModificarToolBarCentroCostoValor"));
					
		this.jInternalFrameDetalleFormCentroCostoValor.jMenuItemModificarCentroCostoValor.addActionListener(new ButtonActionListener(this,"MenuItemModificarCentroCostoValor"));		
		
		
		
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonActualizarCentroCostoValor.addActionListener (new ButtonActionListener(this,"ActualizarCentroCostoValor"));
		
		
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonActualizarToolBarCentroCostoValor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCentroCostoValor"));
						
		this.jInternalFrameDetalleFormCentroCostoValor.jMenuItemActualizarCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCentroCostoValor"));		
		
		
		
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonEliminarCentroCostoValor.addActionListener (new ButtonActionListener(this,"EliminarCentroCostoValor"));
		
		
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonEliminarToolBarCentroCostoValor.addActionListener (new ButtonActionListener(this,"EliminarToolBarCentroCostoValor"));
								
		this.jInternalFrameDetalleFormCentroCostoValor.jMenuItemEliminarCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCentroCostoValor"));		
		
		
		
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonCancelarCentroCostoValor.addActionListener (new ButtonActionListener(this,"CancelarCentroCostoValor"));
		
		
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonCancelarToolBarCentroCostoValor.addActionListener (new ButtonActionListener(this,"CancelarToolBarCentroCostoValor"));
					
		this.jInternalFrameDetalleFormCentroCostoValor.jMenuItemCancelarCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCentroCostoValor"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCentroCostoValor.jMenuItemDetalleCerrarCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCentroCostoValor"));		
		
		
		
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonGuardarCambiosToolBarCentroCostoValor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCentroCostoValor"));
		
		
		
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonGuardarCambiosToolBarCentroCostoValor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCentroCostoValor"));
		
		
		
		this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxTiposAccionesFormularioCentroCostoValor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCentroCostoValor"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonidCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"idCentroCostoValorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_empresaCentroCostoValorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoValorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_empresaCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoValorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_sucursalCentroCostoValorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCentroCostoValorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_sucursalCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCentroCostoValorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_ejercicioCentroCostoValorUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioCentroCostoValorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_ejercicioCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioCentroCostoValorBusqueda"));
		//jButtonid_centro_costoCentroCostoValor.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_centro_costoCentroCostoValorActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_centro_costoCentroCostoValor.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoValor"));
		//jButtonid_centro_costoCentroCostoValorArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCentroCosto("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_centro_costoCentroCostoValorArbol.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoValorArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_centro_costoCentroCostoValorUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoValorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_centro_costoCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonnombreCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"nombreCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtoneneroCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"eneroCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonfebreroCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"febreroCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonmarzoCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"marzoCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonabrilCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"abrilCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonmayoCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"mayoCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonjunioCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"junioCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonjulioCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"julioCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonagostoCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"agostoCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonseptiembreCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"septiembreCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonoctubreCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"octubreCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonnoviembreCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"noviembreCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtondiciembreCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"diciembreCentroCostoValorBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCentroCostoValor.jTabbedPaneRelacionesCentroCostoValor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCentroCostoValor"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCentroCostoValor"));
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoValor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCentroCostoValor"));
		}
		
		this.jTableDatosCentroCostoValor.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCentroCostoValor"));
		
		this.jTableDatosCentroCostoValor.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCentroCostoValor"));
		
		this.jButtonNuevoCentroCostoValor.addActionListener(new ButtonActionListener(this,"NuevoCentroCostoValor"));
		
		this.jButtonDuplicarCentroCostoValor.addActionListener(new ButtonActionListener(this,"DuplicarCentroCostoValor"));
		
		this.jButtonCopiarCentroCostoValor.addActionListener(new ButtonActionListener(this,"CopiarCentroCostoValor"));
		
		this.jButtonVerFormCentroCostoValor.addActionListener(new ButtonActionListener(this,"VerFormCentroCostoValor"));
		
		
		this.jButtonNuevoToolBarCentroCostoValor.addActionListener(new ButtonActionListener(this,"NuevoToolBarCentroCostoValor"));
			
		this.jButtonDuplicarToolBarCentroCostoValor.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCentroCostoValor"));
			
		this.jMenuItemNuevoCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCentroCostoValor"));
			
		this.jMenuItemDuplicarCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCentroCostoValor"));		
		
		
		this.jButtonNuevoRelacionesCentroCostoValor.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCentroCostoValor"));
		
		
		this.jButtonNuevoRelacionesToolBarCentroCostoValor.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCentroCostoValor"));
			
		this.jMenuItemNuevoRelacionesCentroCostoValor.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCentroCostoValor"));		
		
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonModificarCentroCostoValor.addActionListener(new ButtonActionListener(this,"ModificarCentroCostoValor"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonModificarToolBarCentroCostoValor.addActionListener(new ButtonActionListener(this,"ModificarToolBarCentroCostoValor"));
			
			this.jInternalFrameDetalleFormCentroCostoValor.jMenuItemModificarCentroCostoValor.addActionListener(new ButtonActionListener(this,"MenuItemModificarCentroCostoValor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonActualizarCentroCostoValor.addActionListener (new ButtonActionListener(this,"ActualizarCentroCostoValor"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonActualizarToolBarCentroCostoValor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCentroCostoValor"));
				
			this.jInternalFrameDetalleFormCentroCostoValor.jMenuItemActualizarCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCentroCostoValor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonEliminarCentroCostoValor.addActionListener (new ButtonActionListener(this,"EliminarCentroCostoValor"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonEliminarToolBarCentroCostoValor.addActionListener (new ButtonActionListener(this,"EliminarToolBarCentroCostoValor"));
						
			this.jInternalFrameDetalleFormCentroCostoValor.jMenuItemEliminarCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCentroCostoValor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonCancelarCentroCostoValor.addActionListener (new ButtonActionListener(this,"CancelarCentroCostoValor"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonCancelarToolBarCentroCostoValor.addActionListener (new ButtonActionListener(this,"CancelarToolBarCentroCostoValor"));
			
			this.jInternalFrameDetalleFormCentroCostoValor.jMenuItemCancelarCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCentroCostoValor"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCentroCostoValor.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCentroCostoValor"));		
		
		
		this.jButtonCerrarCentroCostoValor.addActionListener (new ButtonActionListener(this,"CerrarCentroCostoValor"));
		
		
		this.jButtonCerrarToolBarCentroCostoValor.addActionListener (new ButtonActionListener(this,"CerrarToolBarCentroCostoValor"));
			
		this.jMenuItemCerrarCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCentroCostoValor"));
			
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoValor.jMenuItemDetalleCerrarCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCentroCostoValor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonGuardarCambiosCentroCostoValor.addActionListener (new ButtonActionListener(this,"GuardarCambiosCentroCostoValor"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonGuardarCambiosToolBarCentroCostoValor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCentroCostoValor"));
		}
		
		this.jButtonCopiarToolBarCentroCostoValor.addActionListener (new ButtonActionListener(this,"CopiarToolBarCentroCostoValor"));
			
		this.jButtonVerFormToolBarCentroCostoValor.addActionListener (new ButtonActionListener(this,"VerFormToolBarCentroCostoValor"));
		
		this.jMenuItemGuardarCambiosCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCentroCostoValor"));
			
		this.jMenuItemCopiarCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCentroCostoValor"));		
		
		this.jMenuItemVerFormCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCentroCostoValor"));		
		
		
		this.jButtonGuardarCambiosTablaCentroCostoValor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCentroCostoValor"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCentroCostoValor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCentroCostoValor"));
			
		this.jMenuItemGuardarCambiosTablaCentroCostoValor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCentroCostoValor"));		
		
		
		
		this.jButtonRecargarInformacionCentroCostoValor.addActionListener (new ButtonActionListener(this,"RecargarInformacionCentroCostoValor"));
					
		this.jButtonRecargarInformacionToolBarCentroCostoValor.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCentroCostoValor"));
		
		this.jMenuItemRecargarInformacionCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCentroCostoValor"));		
		
		
		
		this.jButtonAnterioresCentroCostoValor.addActionListener (new ButtonActionListener(this,"AnterioresCentroCostoValor"));
		
		
		this.jButtonAnterioresToolBarCentroCostoValor.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCentroCostoValor"));
		
		this.jMenuItemAnterioresCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCentroCostoValor"));		
		
		
		this.jButtonSiguientesCentroCostoValor.addActionListener (new ButtonActionListener(this,"SiguientesCentroCostoValor"));
		
		
		this.jButtonSiguientesToolBarCentroCostoValor.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCentroCostoValor"));
			
		this.jMenuItemSiguientesCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCentroCostoValor"));
			
		this.jMenuItemAbrirOrderByCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCentroCostoValor"));
			
		this.jMenuItemMostrarOcultarCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCentroCostoValor"));
			
		this.jMenuItemDetalleAbrirOrderByCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCentroCostoValor"));
			
		this.jMenuItemDetalleMostarOcultarCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCentroCostoValor"));		
		
		
		this.jButtonNuevoGuardarCambiosCentroCostoValor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCentroCostoValor"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCentroCostoValor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCentroCostoValor"));
			
		this.jMenuItemNuevoGuardarCambiosCentroCostoValor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCentroCostoValor"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCentroCostoValor.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCentroCostoValor"));

		this.jCheckBoxSeleccionadosCentroCostoValor.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCentroCostoValor"));
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxTiposAccionesFormularioCentroCostoValor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCentroCostoValor"));
		}
		
		
		this.jComboBoxTiposRelacionesCentroCostoValor.addActionListener (new ButtonActionListener(this,"TiposRelacionesCentroCostoValor"));
			
		this.jComboBoxTiposAccionesCentroCostoValor.addActionListener (new ButtonActionListener(this,"TiposAccionesCentroCostoValor"));
					
		this.jComboBoxTiposSeleccionarCentroCostoValor.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCentroCostoValor"));
			
		this.jTextFieldValorCampoGeneralCentroCostoValor.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCentroCostoValor"));		
		
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonidCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"idCentroCostoValorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_empresaCentroCostoValorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoValorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_empresaCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoValorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_sucursalCentroCostoValorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCentroCostoValorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_sucursalCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCentroCostoValorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_ejercicioCentroCostoValorUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioCentroCostoValorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_ejercicioCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioCentroCostoValorBusqueda"));
		//jButtonid_centro_costoCentroCostoValor.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_centro_costoCentroCostoValorActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_centro_costoCentroCostoValor.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoValor"));
		//jButtonid_centro_costoCentroCostoValorArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCentroCosto("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_centro_costoCentroCostoValorArbol.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoValorArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_centro_costoCentroCostoValorUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoValorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_centro_costoCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonnombreCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"nombreCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtoneneroCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"eneroCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonfebreroCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"febreroCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonmarzoCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"marzoCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonabrilCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"abrilCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonmayoCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"mayoCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonjunioCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"junioCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonjulioCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"julioCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonagostoCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"agostoCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonseptiembreCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"septiembreCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonoctubreCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"octubreCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonnoviembreCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"noviembreCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtondiciembreCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"diciembreCentroCostoValorBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreCentroCostoValor.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCentroCostoValor"));

			this.jButtonFK_IdCentroCostoCentroCostoValor.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoCentroCostoValor"));

			this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoValor.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoValor"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCentroCostoValor!=null) {
				this.jInternalFrameReporteDinamicoCentroCostoValor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCentroCostoValor"));
				this.jInternalFrameReporteDinamicoCentroCostoValor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCentroCostoValor"));
				this.jInternalFrameReporteDinamicoCentroCostoValor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCentroCostoValor"));
			}
			
			//this.jButtonCerrarReporteDinamicoCentroCostoValor.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCentroCostoValor"));				
			//this.jButtonGenerarReporteDinamicoCentroCostoValor.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCentroCostoValor"));
			//this.jButtonGenerarExcelReporteDinamicoCentroCostoValor.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCentroCostoValor"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCentroCostoValor!=null) {
				this.jInternalFrameImportacionCentroCostoValor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCentroCostoValor"));
				this.jInternalFrameImportacionCentroCostoValor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCentroCostoValor"));
				this.jInternalFrameImportacionCentroCostoValor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCentroCostoValor"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCentroCostoValor.addActionListener (new ButtonActionListener(this,"AbrirOrderByCentroCostoValor"));
			
			this.jButtonAbrirOrderByToolBarCentroCostoValor.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCentroCostoValor"));			
			
			if(this.jInternalFrameOrderByCentroCostoValor!=null) {
				this.jInternalFrameOrderByCentroCostoValor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCentroCostoValor"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoValor.jTabbedPaneRelacionesCentroCostoValor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCentroCostoValor"));
		
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
            		closingInternalFrameCentroCostoValor();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCentroCostoValor.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCentroCostoValor = (JInternalFrameBase)event.getSource();
	            	
	            CentroCostoValorBeanSwingJInternalFrame jInternalFrameParent=(CentroCostoValorBeanSwingJInternalFrame)jInternalFrameDetalleFormCentroCostoValor.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCentroCostoValorActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCentroCostoValor.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCentroCostoValorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCentroCostoValor.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCentroCostoValor.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoValorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoValorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoValorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCentroCostoValor";
		inputMap = this.jButtonNuevoCentroCostoValor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCentroCostoValor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCentroCostoValorActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoValorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoValorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoValorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCentroCostoValor";
		inputMap = this.jButtonNuevoRelacionesCentroCostoValor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCentroCostoValor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCentroCostoValorActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCentroCostoValor";
		inputMap = this.jButtonModificarCentroCostoValor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCentroCostoValor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCentroCostoValorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCentroCostoValor";
		inputMap = this.jButtonActualizarCentroCostoValor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCentroCostoValor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCentroCostoValorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCentroCostoValor";
		inputMap = this.jButtonEliminarCentroCostoValor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCentroCostoValor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCentroCostoValorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCentroCostoValor";
		inputMap = this.jButtonCancelarCentroCostoValor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCentroCostoValor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCentroCostoValorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCentroCostoValor";
		inputMap = this.jButtonCerrarCentroCostoValor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCentroCostoValor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCentroCostoValorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonGuardarCambiosCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCentroCostoValor";
		inputMap = this.jInternalFrameDetalleFormCentroCostoValor.jButtonGuardarCambiosCentroCostoValor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonGuardarCambiosCentroCostoValor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCentroCostoValorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCentroCostoValor.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCentroCostoValorItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCentroCostoValor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCentroCostoValorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCentroCostoValor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCentroCostoValorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCentroCostoValor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCentroCostoValorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonidCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"idCentroCostoValorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_empresaCentroCostoValorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoValorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_empresaCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoValorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_sucursalCentroCostoValorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCentroCostoValorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_sucursalCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCentroCostoValorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_ejercicioCentroCostoValorUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioCentroCostoValorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_ejercicioCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioCentroCostoValorBusqueda"));
		//jButtonid_centro_costoCentroCostoValor.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_centro_costoCentroCostoValorActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_centro_costoCentroCostoValor.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoValor"));
		//jButtonid_centro_costoCentroCostoValorArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCentroCosto("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_centro_costoCentroCostoValorArbol.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoValorArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_centro_costoCentroCostoValorUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoValorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_centro_costoCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonnombreCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"nombreCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtoneneroCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"eneroCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonfebreroCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"febreroCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonmarzoCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"marzoCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonabrilCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"abrilCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonmayoCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"mayoCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonjunioCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"junioCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonjulioCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"julioCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonagostoCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"agostoCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonseptiembreCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"septiembreCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonoctubreCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"octubreCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtonnoviembreCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"noviembreCentroCostoValorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoValor.jButtondiciembreCentroCostoValorBusqueda.addActionListener(new ButtonActionListener(this,"diciembreCentroCostoValorBusqueda"));
		
		
		this.jButtonBusquedaPorNombreCentroCostoValor.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCentroCostoValor"));

		this.jButtonFK_IdCentroCostoCentroCostoValor.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoCentroCostoValor"));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoValor.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoValor"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCentroCostoValor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCentroCostoValorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCentroCostoValorActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCentroCostoValor.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCentroCostoValor(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CentroCostoValor centrocostovalorAux:this.centrocostovalorLogic.getCentroCostoValors()) {
					centrocostovalorAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroCostoValor centrocostovalorAux:centrocostovalors) {
					centrocostovalorAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCentroCostoValorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCentroCostoValor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CentroCostoValor centrocostovalorAux:this.centrocostovalorLogic.getCentroCostoValors()) {
						centrocostovalorAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CentroCostoValor centrocostovalorAux:centrocostovalors) {
						centrocostovalorAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CentroCostoValor centrocostovalorAux:this.centrocostovalorLogic.getCentroCostoValors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CentroCostoValor centrocostovalorAux:centrocostovalors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCentroCostoValor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCentroCostoValor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCentroCostoValor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCentroCostoValorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCentroCostoValor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCentroCostoValor.getSelectedRows();
			
			CentroCostoValor centrocostovalorLocal=new CentroCostoValor();
			
			//this.seleccionarTodosCentroCostoValor(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostovalorLocal =(CentroCostoValor) this.centrocostovalorLogic.getCentroCostoValors().toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					centrocostovalorLocal =(CentroCostoValor) this.centrocostovalors.toArray()[this.jTableDatosCentroCostoValor.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				centrocostovalorLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CentroCostoValor centrocostovalorAux:this.centrocostovalorLogic.getCentroCostoValors()) {
						centrocostovalorAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CentroCostoValor centrocostovalorAux:centrocostovalors) {
						centrocostovalorAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCentroCostoValor(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCentroCostoValor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCentroCostoValor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoValor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCentroCostoValorItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCentroCostoValorParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCentroCostoValorActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCentroCostoValor(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCentroCostoValor.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CentroCostoValor centrocostovalorAux:this.centrocostovalorLogic.getCentroCostoValors()) {
				
						if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							centrocostovalorAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_ENERO)) {
							existe=true;
							centrocostovalorAux.setenero(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_FEBRERO)) {
							existe=true;
							centrocostovalorAux.setfebrero(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_MARZO)) {
							existe=true;
							centrocostovalorAux.setmarzo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_ABRIL)) {
							existe=true;
							centrocostovalorAux.setabril(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_MAYO)) {
							existe=true;
							centrocostovalorAux.setmayo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_JUNIO)) {
							existe=true;
							centrocostovalorAux.setjunio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_JULIO)) {
							existe=true;
							centrocostovalorAux.setjulio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_AGOSTO)) {
							existe=true;
							centrocostovalorAux.setagosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_SEPTIEMBRE)) {
							existe=true;
							centrocostovalorAux.setseptiembre(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_OCTUBRE)) {
							existe=true;
							centrocostovalorAux.setoctubre(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_NOVIEMBRE)) {
							existe=true;
							centrocostovalorAux.setnoviembre(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_DICIEMBRE)) {
							existe=true;
							centrocostovalorAux.setdiciembre(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroCostoValor centrocostovalorAux:centrocostovalors) {
					
						if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							centrocostovalorAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_ENERO)) {
							existe=true;
							centrocostovalorAux.setenero(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_FEBRERO)) {
							existe=true;
							centrocostovalorAux.setfebrero(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_MARZO)) {
							existe=true;
							centrocostovalorAux.setmarzo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_ABRIL)) {
							existe=true;
							centrocostovalorAux.setabril(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_MAYO)) {
							existe=true;
							centrocostovalorAux.setmayo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_JUNIO)) {
							existe=true;
							centrocostovalorAux.setjunio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_JULIO)) {
							existe=true;
							centrocostovalorAux.setjulio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_AGOSTO)) {
							existe=true;
							centrocostovalorAux.setagosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_SEPTIEMBRE)) {
							existe=true;
							centrocostovalorAux.setseptiembre(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_OCTUBRE)) {
							existe=true;
							centrocostovalorAux.setoctubre(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_NOVIEMBRE)) {
							existe=true;
							centrocostovalorAux.setnoviembre(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_DICIEMBRE)) {
							existe=true;
							centrocostovalorAux.setdiciembre(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCentroCostoValor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCentroCostoValorActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCentroCostoValor(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCentroCostoValor=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCentroCostoValor.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxTiposAccionesFormularioCentroCostoValor.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCentroCostoValor) {				
					conSplash=true;//false;										
					
					//this.startProcessCentroCostoValor(conSplash);
				
					this.generarReporteCentroCostoValorsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroCostoValor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxTiposAccionesFormularioCentroCostoValor.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCentroCostoValorsSeleccionados();
				//this.jComboBoxTiposAccionesCentroCostoValor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCentroCostoValorsSeleccionados(false);
				//this.jComboBoxTiposAccionesCentroCostoValor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCentroCostoValorsSeleccionados(true);
				//this.jComboBoxTiposAccionesCentroCostoValor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCentroCostoValor();
				
				this.exportarCentroCostoValorsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroCostoValor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxTiposAccionesFormularioCentroCostoValor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCentroCostoValors();
				//this.importarCentroCostoValors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroCostoValor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxTiposAccionesFormularioCentroCostoValor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCentroCostoValor();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCentroCostoValorsSeleccionados();
				//this.jComboBoxTiposAccionesCentroCostoValor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Centro Costo Valor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCentroCostoValor();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCentroCostoValor)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCentroCostoValor(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Centro Costo Valor",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroCostoValor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxTiposAccionesFormularioCentroCostoValor.setSelectedIndex(0);					
				}	
			} 			
			else if(CentroCostoValorBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCentroCostoValor) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCentroCostoValor(conSplash);
					
						//this.actualizarParametrosGeneralCentroCostoValor();
						
						this.generarReporteProcesoAccionCentroCostoValorsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCentroCostoValor.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxTiposAccionesFormularioCentroCostoValor.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CentroCostoValorBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Centro Costo ValorES SELECCIONADOS?", "MANTENIMIENTO DE Centro Costo Valor", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCentroCostoValor();
				
						this.actualizarParametrosGeneralCentroCostoValor();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.centrocostovalorReturnGeneral=centrocostovalorLogic.procesarAccionCentroCostoValorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.centrocostovalorLogic.getCentroCostoValors(),this.centrocostovalorParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCentroCostoValorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCentroCostoValor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxTiposAccionesFormularioCentroCostoValor.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCentroCostoValor();
					
					CentroCostoValorBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCentroCostoValorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCentroCostoValor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxTiposAccionesFormularioCentroCostoValor.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCentroCostoValor(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCentroCostoValorActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCentroCostoValor();
			
			if(this.jInternalFrameDetalleFormCentroCostoValor==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CentroCostoValor> centrocostovalorsSeleccionados=new ArrayList<CentroCostoValor>();		
			CentroCostoValor centrocostovalor=new CentroCostoValor();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCentroCostoValor(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCentroCostoValor.getSelectedItem();
			
			
			
			
			centrocostovalorsSeleccionados=this.getCentroCostoValorsSeleccionados(true);
			//this.sTipoAccion;
			
			if(centrocostovalorsSeleccionados.size()==1) {
				for(CentroCostoValor centrocostovalorAux:centrocostovalorsSeleccionados) {
					centrocostovalor=centrocostovalorAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCentroCostoValor();
			
      		//this.finishProcessCentroCostoValor(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCentroCostoValorReturnGeneral() throws Exception {
		if(this.centrocostovalorReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.centrocostovalorReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.centrocostovalorReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.centrocostovalorReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.centrocostovalorReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.centrocostovalorReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCentroCostoValor(false);
		}
		
		if(this.centrocostovalorReturnGeneral.getConRetornoLista() || this.centrocostovalorReturnGeneral.getConRetornoObjeto()) {
			if(this.centrocostovalorReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.centrocostovalorLogic.setCentroCostoValors(this.centrocostovalorReturnGeneral.getCentroCostoValors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.centrocostovalorReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.centrocostovalorLogic.setCentroCostoValor(this.centrocostovalorReturnGeneral.getCentroCostoValor());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCentroCostoValor(false);
		}
	}
	
	public void actualizarParametrosGeneralCentroCostoValor() throws Exception {
		
		
	}
	
	public ArrayList<CentroCostoValor> getCentroCostoValorsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CentroCostoValor> centrocostovalorsSeleccionados=new ArrayList<CentroCostoValor>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCentroCostoValor) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CentroCostoValor centrocostovalorAux:centrocostovalorLogic.getCentroCostoValors()) {
					if(centrocostovalorAux.getIsSelected()) {
						centrocostovalorsSeleccionados.add(centrocostovalorAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroCostoValor centrocostovalorAux:this.centrocostovalors) {
					if(centrocostovalorAux.getIsSelected()) {
						centrocostovalorsSeleccionados.add(centrocostovalorAux);				
					}
				}
			}
			
			if(centrocostovalorsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						centrocostovalorsSeleccionados.addAll(this.centrocostovalorLogic.getCentroCostoValors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						centrocostovalorsSeleccionados.addAll(this.centrocostovalors);				
					}
				}
			}
		} else {
			centrocostovalorsSeleccionados.add(this.centrocostovalor);
		}
		
		return centrocostovalorsSeleccionados;
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
	
	public void generarReporteCentroCostoValorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCentroCostoValorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCentroCostoValorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCentroCostoValorsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCentroCostoValorsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Centro Costo Valor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCentroCostoValorsSeleccionados() throws Exception {
		ArrayList<CentroCostoValor> centrocostovalorsSeleccionados=new ArrayList<CentroCostoValor>();		
		
		centrocostovalorsSeleccionados=this.getCentroCostoValorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCentroCostoValors("Todos",centrocostovalorsSeleccionados);
		
	}	
	
	public void generarReporteNormalCentroCostoValorsSeleccionados() throws Exception {
		ArrayList<CentroCostoValor> centrocostovalorsSeleccionados=new ArrayList<CentroCostoValor>();		
		
		centrocostovalorsSeleccionados=this.getCentroCostoValorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCentroCostoValors("Todos",centrocostovalorsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCentroCostoValorsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CentroCostoValor> centrocostovalorsSeleccionados=new ArrayList<CentroCostoValor>();
		
		centrocostovalorsSeleccionados=this.getCentroCostoValorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCentroCostoValors("Todos",centrocostovalorsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCentroCostoValorsSeleccionados() throws Exception {
		ArrayList<CentroCostoValor> centrocostovalorsSeleccionados=new ArrayList<CentroCostoValor>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCentroCostoValor();
		
		
		centrocostovalorsSeleccionados=this.getCentroCostoValorsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCentroCostoValor();
		
		
		//this.generarReporteCentroCostoValors("Todos",centrocostovalorsSeleccionados ,centrocostovalorImplementable,centrocostovalorImplementableHome);
	}
	
	public void mostrarImportacionCentroCostoValors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCentroCostoValor();
		
		this.abrirFrameImportacionCentroCostoValor();		
		
			
		//this.generarReporteCentroCostoValors("Todos",centrocostovalorsSeleccionados ,centrocostovalorImplementable,centrocostovalorImplementableHome);
	}
	
	public void importarCentroCostoValors() throws Exception {		
	
	}
	
	public void exportarCentroCostoValorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCentroCostoValorsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCentroCostoValorsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCentroCostoValorsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Centro Costo Valor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCentroCostoValorsSeleccionados() throws Exception {
		ArrayList<CentroCostoValor> centrocostovalorsSeleccionados=new ArrayList<CentroCostoValor>();		
		
		centrocostovalorsSeleccionados=this.getCentroCostoValorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostovalor."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCentroCostoValor(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CentroCostoValor centrocostovalorAux:centrocostovalorsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCentroCostoValor(centrocostovalorAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//centrocostovalorAux.setsDetalleGeneralEntityReporte(centrocostovalorAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Valor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCentroCostoValor(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_IDCENTROCOSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_ENERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_FEBRERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_MARZO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_ABRIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_MAYO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_JUNIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_JULIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_AGOSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_SEPTIEMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_OCTUBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_NOVIEMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoValorConstantesFunciones.LABEL_DICIEMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCentroCostoValor(CentroCostoValor centrocostovalor,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=centrocostovalor.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostovalor.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostovalor.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostovalor.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostovalor.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostovalor.getcentrocosto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostovalor.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostovalor.getenero().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostovalor.getfebrero().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostovalor.getmarzo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostovalor.getabril().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostovalor.getmayo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostovalor.getjunio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostovalor.getjulio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostovalor.getagosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostovalor.getseptiembre().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostovalor.getoctubre().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostovalor.getnoviembre().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostovalor.getdiciembre().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCentroCostoValorsSeleccionados() throws Exception {
		ArrayList<CentroCostoValor> centrocostovalorsSeleccionados=new ArrayList<CentroCostoValor>();		
		
		centrocostovalorsSeleccionados=this.getCentroCostoValorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostovalor.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CentroCostoValors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCentroCostoValor(row);				
				iRow++;
			}				
			
			for(CentroCostoValor centrocostovalorAux:centrocostovalorsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCentroCostoValor(centrocostovalorAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Valor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCentroCostoValorsSeleccionados() throws Exception {
		ArrayList<CentroCostoValor> centrocostovalorsSeleccionados=new ArrayList<CentroCostoValor>();		
		
		centrocostovalorsSeleccionados=this.getCentroCostoValorsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostovalor.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("centrocostovalors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("centrocostovalor");
			//elementRoot.appendChild(element);
		
			for(CentroCostoValor centrocostovalorAux:centrocostovalorsSeleccionados) {
				element = document.createElement("centrocostovalor");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCentroCostoValor(centrocostovalorAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Valor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCentroCostoValor(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_IDCENTROCOSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_ENERO);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_FEBRERO);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_MARZO);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_ABRIL);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_MAYO);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_JUNIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_JULIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_AGOSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_SEPTIEMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_OCTUBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_NOVIEMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoValorConstantesFunciones.LABEL_DICIEMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCentroCostoValor(CentroCostoValor centrocostovalor,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostovalor.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostovalor.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostovalor.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostovalor.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostovalor.getcentrocosto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostovalor.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostovalor.getenero());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostovalor.getfebrero());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostovalor.getmarzo());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostovalor.getabril());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostovalor.getmayo());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostovalor.getjunio());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostovalor.getjulio());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostovalor.getagosto());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostovalor.getseptiembre());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostovalor.getoctubre());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostovalor.getnoviembre());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostovalor.getdiciembre());				
	}
	
	public void setFilaDatosExportarXmlCentroCostoValor(CentroCostoValor centrocostovalor,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CentroCostoValorConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(centrocostovalor.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CentroCostoValorConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(centrocostovalor.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CentroCostoValorConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(centrocostovalor.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CentroCostoValorConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(centrocostovalor.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(CentroCostoValorConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(centrocostovalor.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementcentrocosto_descripcion = document.createElement(CentroCostoValorConstantesFunciones.IDCENTROCOSTO);
		elementcentrocosto_descripcion.appendChild(document.createTextNode(centrocostovalor.getcentrocosto_descripcion()));
		element.appendChild(elementcentrocosto_descripcion);

		Element elementnombre = document.createElement(CentroCostoValorConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(centrocostovalor.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementenero = document.createElement(CentroCostoValorConstantesFunciones.ENERO);
		elementenero.appendChild(document.createTextNode(centrocostovalor.getenero().toString().trim()));
		element.appendChild(elementenero);

		Element elementfebrero = document.createElement(CentroCostoValorConstantesFunciones.FEBRERO);
		elementfebrero.appendChild(document.createTextNode(centrocostovalor.getfebrero().toString().trim()));
		element.appendChild(elementfebrero);

		Element elementmarzo = document.createElement(CentroCostoValorConstantesFunciones.MARZO);
		elementmarzo.appendChild(document.createTextNode(centrocostovalor.getmarzo().toString().trim()));
		element.appendChild(elementmarzo);

		Element elementabril = document.createElement(CentroCostoValorConstantesFunciones.ABRIL);
		elementabril.appendChild(document.createTextNode(centrocostovalor.getabril().toString().trim()));
		element.appendChild(elementabril);

		Element elementmayo = document.createElement(CentroCostoValorConstantesFunciones.MAYO);
		elementmayo.appendChild(document.createTextNode(centrocostovalor.getmayo().toString().trim()));
		element.appendChild(elementmayo);

		Element elementjunio = document.createElement(CentroCostoValorConstantesFunciones.JUNIO);
		elementjunio.appendChild(document.createTextNode(centrocostovalor.getjunio().toString().trim()));
		element.appendChild(elementjunio);

		Element elementjulio = document.createElement(CentroCostoValorConstantesFunciones.JULIO);
		elementjulio.appendChild(document.createTextNode(centrocostovalor.getjulio().toString().trim()));
		element.appendChild(elementjulio);

		Element elementagosto = document.createElement(CentroCostoValorConstantesFunciones.AGOSTO);
		elementagosto.appendChild(document.createTextNode(centrocostovalor.getagosto().toString().trim()));
		element.appendChild(elementagosto);

		Element elementseptiembre = document.createElement(CentroCostoValorConstantesFunciones.SEPTIEMBRE);
		elementseptiembre.appendChild(document.createTextNode(centrocostovalor.getseptiembre().toString().trim()));
		element.appendChild(elementseptiembre);

		Element elementoctubre = document.createElement(CentroCostoValorConstantesFunciones.OCTUBRE);
		elementoctubre.appendChild(document.createTextNode(centrocostovalor.getoctubre().toString().trim()));
		element.appendChild(elementoctubre);

		Element elementnoviembre = document.createElement(CentroCostoValorConstantesFunciones.NOVIEMBRE);
		elementnoviembre.appendChild(document.createTextNode(centrocostovalor.getnoviembre().toString().trim()));
		element.appendChild(elementnoviembre);

		Element elementdiciembre = document.createElement(CentroCostoValorConstantesFunciones.DICIEMBRE);
		elementdiciembre.appendChild(document.createTextNode(centrocostovalor.getdiciembre().toString().trim()));
		element.appendChild(elementdiciembre);
	}
	
	public void generarReporteGroupGenericoCentroCostoValorsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CentroCostoValor> centrocostovalorsSeleccionados=new ArrayList<CentroCostoValor>();
		
		centrocostovalorsSeleccionados=this.getCentroCostoValorsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCentroCostoValor(centrocostovalorsSeleccionados);
		
		this.generarReporteCentroCostoValors("Todos",centrocostovalorsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCentroCostoValor(ArrayList<CentroCostoValor> centrocostovalorsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CentroCostoValor centrocostovalorAux:centrocostovalorsSeleccionados) {
				centrocostovalorAux.setsDetalleGeneralEntityReporte(centrocostovalorAux.toString());
			
				if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					centrocostovalorAux.setsDescripcionGeneralEntityReporte1(centrocostovalorAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					centrocostovalorAux.setsDescripcionGeneralEntityReporte1(centrocostovalorAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					centrocostovalorAux.setsDescripcionGeneralEntityReporte1(centrocostovalorAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_IDCENTROCOSTO)) {
					existe=true;
					centrocostovalorAux.setsDescripcionGeneralEntityReporte1(centrocostovalorAux.getcentrocosto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CentroCostoValorConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					centrocostovalorAux.setsDescripcionGeneralEntityReporte1(centrocostovalorAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoValorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCentroCostoValor(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCentroCostoValor=true;
				this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor=true;
				this.isVisibilidadCeldaGuardarCambiosCentroCostoValor=true;
			}
			
			this.isVisibilidadCeldaModificarCentroCostoValor=false;
			this.isVisibilidadCeldaActualizarCentroCostoValor=false;
			this.isVisibilidadCeldaEliminarCentroCostoValor=false;
			this.isVisibilidadCeldaCancelarCentroCostoValor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoValor=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoValor=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCentroCostoValor=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoValor=false;
			this.isVisibilidadCeldaModificarCentroCostoValor=false;
			this.isVisibilidadCeldaActualizarCentroCostoValor=true;
			this.isVisibilidadCeldaEliminarCentroCostoValor=false;
			this.isVisibilidadCeldaCancelarCentroCostoValor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoValor=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoValor=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCentroCostoValor=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoValor=false;
			this.isVisibilidadCeldaModificarCentroCostoValor=false;
			this.isVisibilidadCeldaActualizarCentroCostoValor=true;
			this.isVisibilidadCeldaEliminarCentroCostoValor=true;
			this.isVisibilidadCeldaCancelarCentroCostoValor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoValor=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoValor=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCentroCostoValor=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoValor=false;
			this.isVisibilidadCeldaModificarCentroCostoValor=false;
			this.isVisibilidadCeldaActualizarCentroCostoValor=true;
			this.isVisibilidadCeldaEliminarCentroCostoValor=false;
			this.isVisibilidadCeldaCancelarCentroCostoValor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoValor=false;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoValor=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCentroCostoValor=true;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor=true;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoValor=true;
			this.isVisibilidadCeldaModificarCentroCostoValor=false;
			this.isVisibilidadCeldaActualizarCentroCostoValor=false;
			this.isVisibilidadCeldaEliminarCentroCostoValor=false;
			this.isVisibilidadCeldaCancelarCentroCostoValor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoValor=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoValor=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCentroCostoValor=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoValor=false;
			this.isVisibilidadCeldaActualizarCentroCostoValor=false;
			this.isVisibilidadCeldaEliminarCentroCostoValor=false;
			this.isVisibilidadCeldaCancelarCentroCostoValor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoValor=false;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoValor=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCentroCostoValor=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoValor=false;
			this.isVisibilidadCeldaModificarCentroCostoValor=true;
			this.isVisibilidadCeldaActualizarCentroCostoValor=false;
			this.isVisibilidadCeldaEliminarCentroCostoValor=false;
			this.isVisibilidadCeldaCancelarCentroCostoValor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoValor=false;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoValor=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CentroCostoValorJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCentroCostoValor=true;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor=true;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoValor=true;
		} else {
			this.actualizarEstadoPanelsCentroCostoValor(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCentroCostoValor=false;
			//this.isVisibilidadCeldaVerFormCentroCostoValor=false;
			this.isVisibilidadCeldaDuplicarCentroCostoValor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!centrocostovalorSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor=false;
		} else {
			this.isVisibilidadCeldaNuevoCentroCostoValor=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoValor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(centrocostovalorSessionBean.getEsGuardarRelacionado()) {
			if(!centrocostovalorSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor=false;												
			}
			
			this.jButtonCerrarCentroCostoValor.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoValor=false;
		}
		
		if(!this.permiteMantenimiento(this.centrocostovalor)) {
			this.isVisibilidadCeldaActualizarCentroCostoValor=false;
			this.isVisibilidadCeldaEliminarCentroCostoValor=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCentroCostoValor() {
	}
	
	public void actualizarEstadoPanelsCentroCostoValor(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCentroCostoValor!=null) {
				this.jScrollPanelDatosEdicionCentroCostoValor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoValor!=null) {
				this.jTabbedPaneBusquedasCentroCostoValor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroCostoValor!=null) {
				this.jScrollPanelDatosCentroCostoValor.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroCostoValor!=null) {
				this.jPanelPaginacionCentroCostoValor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroCostoValor!=null) {
				this.jPanelParametrosReportesCentroCostoValor.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCentroCostoValor!=null) {
				this.jScrollPanelDatosEdicionCentroCostoValor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoValor!=null) {
				this.jTabbedPaneBusquedasCentroCostoValor.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCentroCostoValor!=null) {
				this.jScrollPanelDatosCentroCostoValor.setVisible(false);
			}
			
			if(this.jPanelPaginacionCentroCostoValor!=null) {
				this.jPanelPaginacionCentroCostoValor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCentroCostoValor!=null) {
				this.jPanelParametrosReportesCentroCostoValor.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCentroCostoValor!=null) {
				this.jScrollPanelDatosEdicionCentroCostoValor.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoValor!=null) {
				this.jTabbedPaneBusquedasCentroCostoValor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCentroCostoValor!=null) {
				this.jScrollPanelDatosCentroCostoValor.setVisible(false);
			}
			
			if(this.jPanelPaginacionCentroCostoValor!=null) {
				this.jPanelPaginacionCentroCostoValor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCentroCostoValor!=null) {
				this.jPanelParametrosReportesCentroCostoValor.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCentroCostoValor!=null) {
				this.jScrollPanelDatosEdicionCentroCostoValor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoValor!=null) {
				this.jTabbedPaneBusquedasCentroCostoValor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCentroCostoValor!=null) {
				this.jScrollPanelDatosCentroCostoValor.setVisible(false);
			}
			
			if(this.jPanelPaginacionCentroCostoValor!=null) {
				this.jPanelPaginacionCentroCostoValor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCentroCostoValor!=null) {
				this.jPanelParametrosReportesCentroCostoValor.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCentroCostoValor!=null) {
				this.jScrollPanelDatosEdicionCentroCostoValor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoValor!=null) {
				this.jTabbedPaneBusquedasCentroCostoValor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroCostoValor!=null) {
				this.jScrollPanelDatosCentroCostoValor.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroCostoValor!=null) {
				this.jPanelPaginacionCentroCostoValor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroCostoValor!=null) {
				this.jPanelParametrosReportesCentroCostoValor.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCentroCostoValor!=null) {
				this.jScrollPanelDatosEdicionCentroCostoValor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoValor!=null) {
				this.jTabbedPaneBusquedasCentroCostoValor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroCostoValor!=null) {
				this.jScrollPanelDatosCentroCostoValor.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroCostoValor!=null) {
				this.jPanelPaginacionCentroCostoValor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroCostoValor!=null) {
				this.jPanelParametrosReportesCentroCostoValor.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCentroCostoValor!=null) {
				this.jScrollPanelDatosEdicionCentroCostoValor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoValor!=null) {
				this.jTabbedPaneBusquedasCentroCostoValor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroCostoValor!=null) {
				this.jScrollPanelDatosCentroCostoValor.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroCostoValor!=null) {
				this.jPanelPaginacionCentroCostoValor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroCostoValor!=null) {
				this.jPanelParametrosReportesCentroCostoValor.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCentroCostoValor!=null) {
					this.jTabbedPaneBusquedasCentroCostoValor.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCentroCostoValor!=null) {
				this.jPanelParametrosReportesCentroCostoValor.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoValor!=null) {
				this.jTabbedPaneBusquedasCentroCostoValor.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCentroCostoValor!=null) {
				this.jPanelParametrosReportesCentroCostoValor.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCentroCostoValor.remove(jPanelBusquedaPorNombreCentroCostoValor);}

			this.isVisibilidadFK_IdCentroCosto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasCentroCostoValor.remove(jPanelFK_IdCentroCostoCentroCostoValor);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorNombre=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCentroCostoValor.remove(jPanelBusquedaPorNombreCentroCostoValor);}

			this.isVisibilidadFK_IdCentroCosto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasCentroCostoValor.remove(jPanelFK_IdCentroCostoCentroCostoValor);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaPorNombre=isParaEjercicioNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCentroCostoValor.remove(jPanelBusquedaPorNombreCentroCostoValor);}

			this.isVisibilidadFK_IdCentroCosto=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasCentroCostoValor.remove(jPanelFK_IdCentroCostoCentroCostoValor);}
		}
		
	}

	public void setVisibilidadBusquedasParaCentroCosto(Boolean isParaCentroCosto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCentroCostoNegation=!isParaCentroCosto;

			this.isVisibilidadBusquedaPorNombre=isParaCentroCostoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCentroCostoValor.remove(jPanelBusquedaPorNombreCentroCostoValor);}

			this.isVisibilidadFK_IdCentroCosto=isParaCentroCosto;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasCentroCostoValor.remove(jPanelFK_IdCentroCostoCentroCostoValor);}
		}
		
	}
	
	
	
	

	public String registrarSesionCentroCostoValorParaBusquedaCentroCostos() throws Exception {
		Boolean isPaginaPopupCentroCosto=false;

		try {

			if(centrocostovalorSessionBean==null) {
				centrocostovalorSessionBean=new CentroCostoValorSessionBean();
			}

			if(centrocostoSessionBean==null) {
				centrocostoSessionBean=new CentroCostoSessionBean();
			}

			centrocostoSessionBean.setsPathNavegacionActual(centrocostovalorSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CentroCostoConstantesFunciones.SCLASSWEBTITULO);
			centrocostoSessionBean.setisPermiteRecargarInformacion(false);
			centrocostoSessionBean.setisPaginaPopup(true);
			isPaginaPopupCentroCosto=centrocostoSessionBean.getisPaginaPopup();
			centrocostoSessionBean.setisPaginaPopup(false);
			centrocostoSessionBean.setEstaModoBusqueda(true);
			centrocostoSessionBean.setsFuncionBusquedaRapida("window.opener.centrocostovalorFuncionGeneral.setCombosCodigoDesdeBusquedaid_centro_costo(TO_REPLACE);");
			centrocostoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCentroCosto(true);
			centrocostoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCentroCosto(CentroCostoValorConstantesFunciones.SNOMBREOPCION);
			//centrocostoSessionBean.setisBusquedaDesdeForeignKeySesionCentroCostoValor(true);
			//centrocostoSessionBean.setlidCentroCostoValorActual(this.idCentroCostoValorActual);

			centrocostovalorSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCentroCostoValor(true);
			centrocostovalorSessionBean.setlIdCentroCostoValorActualForeignKey(this.idCentroCostoValorActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CentroCostoValorSessionBean centrocostovalorSessionBean=new CentroCostoValorSessionBean();
		
		if(this.centrocostovalorSessionBean==null) {
			this.centrocostovalorSessionBean=new CentroCostoValorSessionBean();
		}
		
		this.centrocostovalorSessionBean.setsUltimaBusquedaCentroCostoValor(this.getsAccionBusqueda());
		this.centrocostovalorSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.centrocostovalorSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			centrocostovalorSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
			centrocostovalorSessionBean.setid_centro_costo(this.getid_centro_costoFK_IdCentroCosto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			centrocostovalorSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			centrocostovalorSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			centrocostovalorSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CentroCostoValorSessionBean centrocostovalorSessionBean=new CentroCostoValorSessionBean();
		
		if(this.centrocostovalorSessionBean==null) {
			this.centrocostovalorSessionBean=new CentroCostoValorSessionBean();
		}
		
		if(this.centrocostovalorSessionBean.getsUltimaBusquedaCentroCostoValor()!=null&&!this.centrocostovalorSessionBean.getsUltimaBusquedaCentroCostoValor().equals("")) {
			this.setsAccionBusqueda(centrocostovalorSessionBean.getsUltimaBusquedaCentroCostoValor());
			this.setiNumeroPaginacion(centrocostovalorSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(centrocostovalorSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(centrocostovalorSessionBean.getnombre());
				centrocostovalorSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
				this.setid_centro_costoFK_IdCentroCosto(centrocostovalorSessionBean.getid_centro_costo());
				centrocostovalorSessionBean.setid_centro_costo(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(centrocostovalorSessionBean.getid_ejercicio());
				centrocostovalorSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(centrocostovalorSessionBean.getid_empresa());
				centrocostovalorSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(centrocostovalorSessionBean.getid_sucursal());
				centrocostovalorSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.centrocostovalorSessionBean.setsUltimaBusquedaCentroCostoValor("");
		this.centrocostovalorSessionBean.setiNumeroPaginacion(CentroCostoValorConstantesFunciones.INUMEROPAGINACION);
		this.centrocostovalorSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCentroCostoValor(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCentroCostoValor() {
		this.updateBorderResaltarBusquedasFormularioCentroCostoValor();
		this.updateVisibilidadBusquedasFormularioCentroCostoValor();
		this.updateHabilitarBusquedasFormularioCentroCostoValor();
	}
	
	public void updateBorderResaltarBusquedasFormularioCentroCostoValor() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCentroCostoValor.getComponents().length>0) {
	

		if(this.centrocostovalorConstantesFunciones.resaltarBusquedaPorNombreCentroCostoValor!=null) {
			index= this.jTabbedPaneBusquedasCentroCostoValor.indexOfComponent(this.jPanelBusquedaPorNombreCentroCostoValor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoValor.getComponent(index);
				jPanel.setBorder(this.centrocostovalorConstantesFunciones.resaltarBusquedaPorNombreCentroCostoValor);
			}
		}

		if(this.centrocostovalorConstantesFunciones.resaltarFK_IdCentroCostoCentroCostoValor!=null) {
			index= this.jTabbedPaneBusquedasCentroCostoValor.indexOfComponent(this.jPanelFK_IdCentroCostoCentroCostoValor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoValor.getComponent(index);
				jPanel.setBorder(this.centrocostovalorConstantesFunciones.resaltarFK_IdCentroCostoCentroCostoValor);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCentroCostoValor() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCentroCostoValor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCentroCostoValor.indexOfComponent(this.jPanelBusquedaPorNombreCentroCostoValor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoValor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.centrocostovalorConstantesFunciones.mostrarBusquedaPorNombreCentroCostoValor);
			if(!this.centrocostovalorConstantesFunciones.mostrarBusquedaPorNombreCentroCostoValor && index>-1) {
				this.jTabbedPaneBusquedasCentroCostoValor.remove(index);
			}

			index= this.jTabbedPaneBusquedasCentroCostoValor.indexOfComponent(this.jPanelFK_IdCentroCostoCentroCostoValor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoValor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.centrocostovalorConstantesFunciones.mostrarFK_IdCentroCostoCentroCostoValor);
			if(!this.centrocostovalorConstantesFunciones.mostrarFK_IdCentroCostoCentroCostoValor && index>-1) {
				this.jTabbedPaneBusquedasCentroCostoValor.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCentroCostoValor() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCentroCostoValor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCentroCostoValor.indexOfComponent(this.jPanelBusquedaPorNombreCentroCostoValor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoValor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.centrocostovalorConstantesFunciones.activarBusquedaPorNombreCentroCostoValor);
				this.jTabbedPaneBusquedasCentroCostoValor.setEnabledAt(index,this.centrocostovalorConstantesFunciones.activarBusquedaPorNombreCentroCostoValor);
			}

			index= this.jTabbedPaneBusquedasCentroCostoValor.indexOfComponent(this.jPanelFK_IdCentroCostoCentroCostoValor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoValor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.centrocostovalorConstantesFunciones.activarFK_IdCentroCostoCentroCostoValor);
				this.jTabbedPaneBusquedasCentroCostoValor.setEnabledAt(index,this.centrocostovalorConstantesFunciones.activarFK_IdCentroCostoCentroCostoValor);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCentroCostoValor(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasCentroCostoValor.indexOfComponent(this.jPanelBusquedaPorNombreCentroCostoValor);

			this.jTabbedPaneBusquedasCentroCostoValor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoValor.getComponent(index);

			this.centrocostovalorConstantesFunciones.setResaltarBusquedaPorNombreCentroCostoValor(resaltar);

			jPanel.setBorder(this.centrocostovalorConstantesFunciones.resaltarBusquedaPorNombreCentroCostoValor);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCentroCosto")) {
			index= this.jTabbedPaneBusquedasCentroCostoValor.indexOfComponent(this.jPanelFK_IdCentroCostoCentroCostoValor);

			this.jTabbedPaneBusquedasCentroCostoValor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoValor.getComponent(index);

			this.centrocostovalorConstantesFunciones.setResaltarFK_IdCentroCostoCentroCostoValor(resaltar);

			jPanel.setBorder(this.centrocostovalorConstantesFunciones.resaltarFK_IdCentroCostoCentroCostoValor);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCentroCostoValor.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCentroCostoValor() throws Exception {

		if(this.jInternalFrameDetalleFormCentroCostoValor==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCentroCostoValor();
		this.updateVisibilidadResaltarControlesFormularioCentroCostoValor();
		this.updateHabilitarResaltarControlesFormularioCentroCostoValor();
		
	}
	
	public void updateBorderResaltarControlesFormularioCentroCostoValor() throws Exception {
		if(this.jInternalFrameDetalleFormCentroCostoValor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.centrocostovalorConstantesFunciones.resaltaridCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor!=null) {this.jInternalFrameDetalleFormCentroCostoValor.jLabelidCentroCostoValor.setBorder(this.centrocostovalorConstantesFunciones.resaltaridCentroCostoValor);}
		if(this.centrocostovalorConstantesFunciones.resaltarid_empresaCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor!=null) {this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_empresaCentroCostoValor.setBorder(this.centrocostovalorConstantesFunciones.resaltarid_empresaCentroCostoValor);}
		if(this.centrocostovalorConstantesFunciones.resaltarid_sucursalCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor!=null) {this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_sucursalCentroCostoValor.setBorder(this.centrocostovalorConstantesFunciones.resaltarid_sucursalCentroCostoValor);}
		if(this.centrocostovalorConstantesFunciones.resaltarid_ejercicioCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor!=null) {this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_ejercicioCentroCostoValor.setBorder(this.centrocostovalorConstantesFunciones.resaltarid_ejercicioCentroCostoValor);}
		if(this.centrocostovalorConstantesFunciones.resaltarid_centro_costoCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor!=null) {this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_centro_costoCentroCostoValor.setBorder(this.centrocostovalorConstantesFunciones.resaltarid_centro_costoCentroCostoValor);}
		if(this.centrocostovalorConstantesFunciones.resaltarnombreCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor!=null) {this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldnombreCentroCostoValor.setBorder(this.centrocostovalorConstantesFunciones.resaltarnombreCentroCostoValor);}
		if(this.centrocostovalorConstantesFunciones.resaltareneroCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor!=null) {this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldeneroCentroCostoValor.setBorder(this.centrocostovalorConstantesFunciones.resaltareneroCentroCostoValor);}
		if(this.centrocostovalorConstantesFunciones.resaltarfebreroCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor!=null) {this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldfebreroCentroCostoValor.setBorder(this.centrocostovalorConstantesFunciones.resaltarfebreroCentroCostoValor);}
		if(this.centrocostovalorConstantesFunciones.resaltarmarzoCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor!=null) {this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldmarzoCentroCostoValor.setBorder(this.centrocostovalorConstantesFunciones.resaltarmarzoCentroCostoValor);}
		if(this.centrocostovalorConstantesFunciones.resaltarabrilCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor!=null) {this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldabrilCentroCostoValor.setBorder(this.centrocostovalorConstantesFunciones.resaltarabrilCentroCostoValor);}
		if(this.centrocostovalorConstantesFunciones.resaltarmayoCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor!=null) {this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldmayoCentroCostoValor.setBorder(this.centrocostovalorConstantesFunciones.resaltarmayoCentroCostoValor);}
		if(this.centrocostovalorConstantesFunciones.resaltarjunioCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor!=null) {this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldjunioCentroCostoValor.setBorder(this.centrocostovalorConstantesFunciones.resaltarjunioCentroCostoValor);}
		if(this.centrocostovalorConstantesFunciones.resaltarjulioCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor!=null) {this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldjulioCentroCostoValor.setBorder(this.centrocostovalorConstantesFunciones.resaltarjulioCentroCostoValor);}
		if(this.centrocostovalorConstantesFunciones.resaltaragostoCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor!=null) {this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldagostoCentroCostoValor.setBorder(this.centrocostovalorConstantesFunciones.resaltaragostoCentroCostoValor);}
		if(this.centrocostovalorConstantesFunciones.resaltarseptiembreCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor!=null) {this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldseptiembreCentroCostoValor.setBorder(this.centrocostovalorConstantesFunciones.resaltarseptiembreCentroCostoValor);}
		if(this.centrocostovalorConstantesFunciones.resaltaroctubreCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor!=null) {this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldoctubreCentroCostoValor.setBorder(this.centrocostovalorConstantesFunciones.resaltaroctubreCentroCostoValor);}
		if(this.centrocostovalorConstantesFunciones.resaltarnoviembreCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor!=null) {this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldnoviembreCentroCostoValor.setBorder(this.centrocostovalorConstantesFunciones.resaltarnoviembreCentroCostoValor);}
		if(this.centrocostovalorConstantesFunciones.resaltardiciembreCentroCostoValor!=null && this.jInternalFrameDetalleFormCentroCostoValor!=null) {this.jInternalFrameDetalleFormCentroCostoValor.jTextFielddiciembreCentroCostoValor.setBorder(this.centrocostovalorConstantesFunciones.resaltardiciembreCentroCostoValor);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCentroCostoValor() throws Exception {		
		if(this.jInternalFrameDetalleFormCentroCostoValor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
	
		//this.jInternalFrameDetalleFormCentroCostoValor.jLabelidCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostraridCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jPanelidCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostraridCentroCostoValor);
		//this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_empresaCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarid_empresaCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jPanelid_empresaCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarid_empresaCentroCostoValor);
		//this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_sucursalCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarid_sucursalCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jPanelid_sucursalCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarid_sucursalCentroCostoValor);
		//this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_ejercicioCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarid_ejercicioCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jPanelid_ejercicioCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarid_ejercicioCentroCostoValor);
		//this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_centro_costoCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarid_centro_costoCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jPanelid_centro_costoCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarid_centro_costoCentroCostoValor);
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_centro_costoCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarid_centro_costoCentroCostoValor);
		//this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldnombreCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarnombreCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jPanelnombreCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarnombreCentroCostoValor);
		//this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldeneroCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrareneroCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jPaneleneroCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrareneroCentroCostoValor);
		//this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldfebreroCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarfebreroCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jPanelfebreroCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarfebreroCentroCostoValor);
		//this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldmarzoCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarmarzoCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jPanelmarzoCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarmarzoCentroCostoValor);
		//this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldabrilCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarabrilCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jPanelabrilCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarabrilCentroCostoValor);
		//this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldmayoCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarmayoCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jPanelmayoCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarmayoCentroCostoValor);
		//this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldjunioCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarjunioCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jPaneljunioCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarjunioCentroCostoValor);
		//this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldjulioCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarjulioCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jPaneljulioCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarjulioCentroCostoValor);
		//this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldagostoCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostraragostoCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jPanelagostoCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostraragostoCentroCostoValor);
		//this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldseptiembreCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarseptiembreCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jPanelseptiembreCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarseptiembreCentroCostoValor);
		//this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldoctubreCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostraroctubreCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jPaneloctubreCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostraroctubreCentroCostoValor);
		//this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldnoviembreCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarnoviembreCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jPanelnoviembreCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrarnoviembreCentroCostoValor);
		//this.jInternalFrameDetalleFormCentroCostoValor.jTextFielddiciembreCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrardiciembreCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jPaneldiciembreCentroCostoValor.setVisible(this.centrocostovalorConstantesFunciones.mostrardiciembreCentroCostoValor);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCentroCostoValor() throws Exception {
		if(this.jInternalFrameDetalleFormCentroCostoValor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCentroCostoValor!=null) {
	
		this.jInternalFrameDetalleFormCentroCostoValor.jLabelidCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activaridCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_empresaCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activarid_empresaCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_sucursalCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activarid_sucursalCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_ejercicioCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activarid_ejercicioCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jComboBoxid_centro_costoCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activarid_centro_costoCentroCostoValor);
			this.jInternalFrameDetalleFormCentroCostoValor.jButtonid_centro_costoCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activarid_centro_costoCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldnombreCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activarnombreCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldeneroCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activareneroCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldfebreroCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activarfebreroCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldmarzoCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activarmarzoCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldabrilCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activarabrilCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldmayoCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activarmayoCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldjunioCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activarjunioCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldjulioCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activarjulioCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldagostoCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activaragostoCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldseptiembreCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activarseptiembreCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldoctubreCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activaroctubreCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFieldnoviembreCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activarnoviembreCentroCostoValor);
		this.jInternalFrameDetalleFormCentroCostoValor.jTextFielddiciembreCentroCostoValor.setEnabled(this.centrocostovalorConstantesFunciones.activardiciembreCentroCostoValor);
		}
	}
	
		
}