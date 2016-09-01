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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.CentroCostoConstantesFunciones;
import com.bydan.erp.contabilidad.util.CentroCostoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.CentroCostoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.CentroCostoBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CentroCostoBeanSwingJInternalFrame extends CentroCostoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CentroCostoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CentroCosto> centrocostoValidator = new ClassValidator<CentroCosto>(CentroCosto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CentroCosto centrocosto;	
	public CentroCosto centrocostoAux;
	public CentroCosto centrocostoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CentroCosto centrocostoTotales;
	public Long idCentroCostoActual;
	public Long iIdNuevoCentroCosto=0L;
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
	
	public Boolean isPermisoTodoCentroCosto;
	public Boolean isPermisoNuevoCentroCosto;
	public Boolean isPermisoActualizarCentroCosto;
	public Boolean isPermisoActualizarOriginalCentroCosto;
	public Boolean isPermisoEliminarCentroCosto;
	public Boolean isPermisoGuardarCambiosCentroCosto;
	public Boolean isPermisoConsultaCentroCosto;
	public Boolean isPermisoBusquedaCentroCosto;
	public Boolean isPermisoReporteCentroCosto;
	public Boolean isPermisoPaginacionMedioCentroCosto;
	public Boolean isPermisoPaginacionAltoCentroCosto;
	public Boolean isPermisoPaginacionTodoCentroCosto;
	public Boolean isPermisoCopiarCentroCosto;
	public Boolean isPermisoVerFormCentroCosto;
	public Boolean isPermisoDuplicarCentroCosto;
	public Boolean isPermisoOrdenCentroCosto;
	
	public List<CentroCosto> centrocostosArbol;
	
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
	
	public CentroCostoParameterReturnGeneral centrocostoReturnGeneral;
	public CentroCostoParameterReturnGeneral centrocostoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCentroCosto=false;
	public Boolean esParaAccionDesdeFormularioCentroCosto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CentroCostoSessionBeanAdditional centrocostoSessionBeanAdditional=null;
	
	public CentroCostoSessionBeanAdditional getCentroCostoSessionBeanAdditional() {
		return this.centrocostoSessionBeanAdditional;
	}
	
	public void setCentroCostoSessionBeanAdditional(CentroCostoSessionBeanAdditional centrocostoSessionBeanAdditional) {
		try {
			this.centrocostoSessionBeanAdditional=centrocostoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CentroCostoBeanSwingJInternalFrameAdditional centrocostoBeanSwingJInternalFrameAdditional=null;
	//public class CentroCostoBeanSwingJInternalFrame
	
	public CentroCostoBeanSwingJInternalFrameAdditional getCentroCostoBeanSwingJInternalFrameAdditional() {
		return this.centrocostoBeanSwingJInternalFrameAdditional;
	}
	
	public void setCentroCostoBeanSwingJInternalFrameAdditional(CentroCostoBeanSwingJInternalFrameAdditional centrocostoBeanSwingJInternalFrameAdditional) {
		try {
			this.centrocostoBeanSwingJInternalFrameAdditional=centrocostoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CentroCostoLogic centrocostoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CentroCosto centrocostoBean;
	public CentroCostoConstantesFunciones centrocostoConstantesFunciones;
	//public CentroCostoParameterReturnGeneral centrocostoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<CentroCosto> centrocostos;	
	//public List<CentroCosto> centrocostosEliminados;
	//public List<CentroCosto> centrocostosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCentroCosto=false;
	public Boolean isVisibilidadCeldaDuplicarCentroCosto=true;
	public Boolean isVisibilidadCeldaCopiarCentroCosto=true;
	public Boolean isVisibilidadCeldaVerFormCentroCosto=true;
	public Boolean isVisibilidadCeldaOrdenCentroCosto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCentroCosto=false;
	public Boolean isVisibilidadCeldaModificarCentroCosto=false;
	public Boolean isVisibilidadCeldaActualizarCentroCosto=false;
	public Boolean isVisibilidadCeldaEliminarCentroCosto=false;
	public Boolean isVisibilidadCeldaCancelarCentroCosto=false;
	public Boolean isVisibilidadCeldaGuardarCentroCosto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCentroCosto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdCentroCosto=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoCentroCosto() {
		return this.iIdNuevoCentroCosto;
	}

	public void setiIdNuevoCentroCosto(Long iIdNuevoCentroCosto) {
		this.iIdNuevoCentroCosto = iIdNuevoCentroCosto;
	}
	
	public Long getidCentroCostoActual() {
		return this.idCentroCostoActual;
	}

	public void setidCentroCostoActual(Long idCentroCostoActual) {
		this.idCentroCostoActual = idCentroCostoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CentroCosto getcentrocosto() {
		return this.centrocosto;
	}

	public void setcentrocosto(CentroCosto centrocosto) {
		this.centrocosto = centrocosto;
	}
	
	public CentroCosto getcentrocostoAux() {
		return this.centrocostoAux;
	}

	public void setcentrocostoAux(CentroCosto centrocostoAux) {
		this.centrocostoAux = centrocostoAux;
	}				
	
	public CentroCosto getcentrocostoAnterior() {
		return this.centrocostoAnterior;
	}

	public void setcentrocostoAnterior(CentroCosto centrocostoAnterior) {
		this.centrocostoAnterior = centrocostoAnterior;
	}	
	
	public CentroCosto getcentrocostoTotales() {
		return this.centrocostoTotales;
	}

	public void setcentrocostoTotales(CentroCosto centrocostoTotales) {
		this.centrocostoTotales = centrocostoTotales;
	}	
	
	public CentroCosto getcentrocostoBean() {
		return this.centrocostoBean;
	}

	public void setcentrocostoBean(CentroCosto centrocostoBean) {
		this.centrocostoBean = centrocostoBean;
	}	
	
	public CentroCostoParameterReturnGeneral getcentrocostoReturnGeneral() {
		return this.centrocostoReturnGeneral;
	}

	public void setcentrocostoReturnGeneral(CentroCostoParameterReturnGeneral centrocostoReturnGeneral) {
		this.centrocostoReturnGeneral = centrocostoReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
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

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CentroCostoLogic getCentroCostoLogic()	{		
		return centrocostoLogic;
	}

	public void setCentroCostoLogic(CentroCostoLogic centrocostoLogic) {
		this.centrocostoLogic = centrocostoLogic;
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
	
	public Boolean getIsEsNuevoCentroCosto() {
		return isEsNuevoCentroCosto;
	}

	public void setIsEsNuevoCentroCosto(Boolean isEsNuevoCentroCosto) {
		this.isEsNuevoCentroCosto = isEsNuevoCentroCosto;
	}

	public Boolean getEsParaAccionDesdeFormularioCentroCosto() {
		return esParaAccionDesdeFormularioCentroCosto;
	}
	
	public void setEsParaAccionDesdeFormularioCentroCosto(Boolean esParaAccionDesdeFormularioCentroCosto) {
		this.esParaAccionDesdeFormularioCentroCosto = esParaAccionDesdeFormularioCentroCosto;
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

			if(this.centrocostoSessionBean==null) {
				this.centrocostoSessionBean=new CentroCostoSessionBean();
			}

			if(!this.centrocostoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(centrocostoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosCentroCostosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.centrocostosForeignKey=new ArrayList<CentroCosto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CentroCosto centrocostoNulo = new CentroCosto();

			CentroCostoLogic centrocostoLogic=new CentroCostoLogic();

			//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

			if(this.centrocostoSessionBean==null) {
				this.centrocostoSessionBean=new CentroCostoSessionBean();
			}

			if(!this.centrocostoSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

					centrocostoLogic.getTodosCentroCostosWithConnection(sFinalQuery,new Pagination());

					this.centrocostosForeignKey=centrocostoLogic.getCentroCostos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.centrocostosForeignKey.add(0, centrocostoNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCentroCosto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getEntityWithConnection(centrocostoSessionBean.getlidCentroCostoActual());
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

					if(this.centrocosto!=null) {
						this.centrocosto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCentroCosto!=null) {
						this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_empresaCentroCosto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCentroCosto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCentroCosto!=null) {
						if(this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_empresaCentroCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_empresaCentroCosto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCentroCostoGenerico)throws Exception
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
				jComboBoxid_empresaCentroCostoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCentroCostoGenerico!=null && jComboBoxid_empresaCentroCostoGenerico.getItemCount()>0) {
					jComboBoxid_empresaCentroCostoGenerico.setSelectedIndex(0);
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

					if(this.centrocosto!=null) {
						this.centrocosto.setCentroCosto(centrocostoTemp);
					}

					if(this.jInternalFrameDetalleFormCentroCosto!=null) {
						this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_centro_costoCentroCosto.setSelectedItem(centrocostoTemp);
					}
				} else {
					//jComboBoxid_centro_costoCentroCosto.setSelectedItem(centrocostoTemp);
					if(this.jInternalFrameDetalleFormCentroCosto!=null) {
						if(this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_centro_costoCentroCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_centro_costoCentroCosto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){
					if(centrocostoTemp!=null && jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto!=null) {
						jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto.setSelectedItem(centrocostoTemp);
					} else {
						if(jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto!=null) {
							//jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto.setSelectedItem(centrocostoTemp);
							if(jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto.getItemCount()>0) {
								jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto.setSelectedIndex(0);
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
	public void setActualCentroCostoForeignKeyGenerico(Long idCentroCostoSeleccionado,JComboBox jComboBoxid_centro_costoCentroCostoGenerico)throws Exception
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
				jComboBoxid_centro_costoCentroCostoGenerico.setSelectedItem(centrocostoTemp);
			} else {
				if(jComboBoxid_centro_costoCentroCostoGenerico!=null && jComboBoxid_centro_costoCentroCostoGenerico.getItemCount()>0) {
					jComboBoxid_centro_costoCentroCostoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CentroCosto centrocosto,JComboBox jComboBoxid_empresaCentroCostoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCentroCostoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_empresaCentroCosto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCentroCostoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				centrocosto.setid_empresa(empresaAux.getId());
				centrocosto.setempresa_descripcion(CentroCostoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				centrocosto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCentroCostoForeignKey(CentroCosto centrocosto,JComboBox jComboBoxid_centro_costoCentroCostoGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoAux=new CentroCosto();

			if(jComboBoxid_centro_costoCentroCostoGenerico==null) {
				centrocostoAux=(CentroCosto)this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_centro_costoCentroCosto.getSelectedItem();
			} else {
				centrocostoAux=(CentroCosto)jComboBoxid_centro_costoCentroCostoGenerico.getSelectedItem();
			}

			if(centrocostoAux!=null) {
				centrocosto.setid_centro_costo(centrocostoAux.getId());
				centrocosto.setcentrocosto_descripcion(CentroCostoConstantesFunciones.getCentroCostoDescripcion(centrocostoAux));
				centrocosto.setCentroCosto(centrocostoAux);			}
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

					if(!CentroCostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCentroCosto!=null) { 
							this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_empresaCentroCosto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_empresaCentroCosto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCentroCosto!=null) { 
					}

					if(!CentroCostoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CentroCostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCentroCosto!=null) { 
							this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_centro_costoCentroCosto.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_centro_costoCentroCosto.addItem(centrocosto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCentroCosto!=null) { 
					}

					if(!CentroCostoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CentroCostoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto.addItem(centrocosto);
							}
						}

						if(!CentroCostoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCentroCosto!=null) {
							this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_empresaCentroCosto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCentroCosto!=null) {
							this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_empresaCentroCosto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCentroCosto!=null) {
							this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_centro_costoCentroCosto.setSelectedItem(centrocosto);
						}
					} else {
						if(this.jInternalFrameDetalleFormCentroCosto!=null) {
							this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_centro_costoCentroCosto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto.setSelectedItem(centrocosto);
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCentroCosto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CentroCostoConstantesFunciones.refrescarForeignKeysDescripcionesCentroCosto(this.centrocostoLogic.getCentroCostos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CentroCostoConstantesFunciones.refrescarForeignKeysDescripcionesCentroCosto(this.centrocostos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(CentroCosto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//centrocostoLogic.setCentroCostos(this.centrocostos);
			centrocostoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CentroCostoParameterReturnGeneral getCentroCostoParameterGeneral() {
		return this.centrocostoParameterGeneral;
	}
	
	public void setCentroCostoParameterGeneral(CentroCostoParameterReturnGeneral centrocostoParameterGeneral) {
		this.centrocostoParameterGeneral = centrocostoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCentroCosto() {
		return isPermisoTodoCentroCosto;
	}

	public void setIsPermisoTodoCentroCosto(Boolean isPermisoTodoCentroCosto) {
		this.isPermisoTodoCentroCosto = isPermisoTodoCentroCosto;
	}

	public Boolean getIsPermisoNuevoCentroCosto() {
		return isPermisoNuevoCentroCosto;
	}

	public void setIsPermisoNuevoCentroCosto(Boolean isPermisoNuevoCentroCosto) {
		this.isPermisoNuevoCentroCosto = isPermisoNuevoCentroCosto;
	}

	public Boolean getIsPermisoActualizarCentroCosto() {
		return isPermisoActualizarCentroCosto;
	}

	public void setIsPermisoActualizarCentroCosto(Boolean isPermisoActualizarCentroCosto) {
		this.isPermisoActualizarCentroCosto = isPermisoActualizarCentroCosto;
	}

	public Boolean getIsPermisoEliminarCentroCosto() {
		return isPermisoEliminarCentroCosto;
	}

	public void setIsPermisoEliminarCentroCosto(Boolean isPermisoEliminarCentroCosto) {
		this.isPermisoEliminarCentroCosto = isPermisoEliminarCentroCosto;
	}

	public Boolean getIsPermisoGuardarCambiosCentroCosto() {
		return isPermisoGuardarCambiosCentroCosto;
	}

	public void setIsPermisoGuardarCambiosCentroCosto(Boolean isPermisoGuardarCambiosCentroCosto) {
		this.isPermisoGuardarCambiosCentroCosto = isPermisoGuardarCambiosCentroCosto;
	}
	
	public Boolean getIsPermisoConsultaCentroCosto() {
		return isPermisoConsultaCentroCosto;
	}

	public void setIsPermisoConsultaCentroCosto(Boolean isPermisoConsultaCentroCosto) {
		this.isPermisoConsultaCentroCosto = isPermisoConsultaCentroCosto;
	}

	public Boolean getIsPermisoBusquedaCentroCosto() {
		return isPermisoBusquedaCentroCosto;
	}

	public void setIsPermisoBusquedaCentroCosto(Boolean isPermisoBusquedaCentroCosto) {
		this.isPermisoBusquedaCentroCosto = isPermisoBusquedaCentroCosto;
	}

	public Boolean getIsPermisoReporteCentroCosto() {
		return isPermisoReporteCentroCosto;
	}

	public void setIsPermisoReporteCentroCosto(Boolean isPermisoReporteCentroCosto) {
		this.isPermisoReporteCentroCosto = isPermisoReporteCentroCosto;
	}
	
	public Boolean getIsPermisoPaginacionMedioCentroCosto() {
		return isPermisoPaginacionMedioCentroCosto;
	}

	public void setIsPermisoPaginacionMedioCentroCosto(Boolean isPermisoPaginacionMedioCentroCosto) {
		this.isPermisoPaginacionMedioCentroCosto = isPermisoPaginacionMedioCentroCosto;
	}
	
	public Boolean getIsPermisoPaginacionTodoCentroCosto() {
		return isPermisoPaginacionTodoCentroCosto;
	}

	public void setIsPermisoPaginacionTodoCentroCosto(Boolean isPermisoPaginacionTodoCentroCosto) {
		this.isPermisoPaginacionTodoCentroCosto = isPermisoPaginacionTodoCentroCosto;
	}
	
	public Boolean getIsPermisoPaginacionAltoCentroCosto() {
		return isPermisoPaginacionAltoCentroCosto;
	}

	public void setIsPermisoPaginacionAltoCentroCosto(Boolean isPermisoPaginacionAltoCentroCosto) {
		this.isPermisoPaginacionAltoCentroCosto = isPermisoPaginacionAltoCentroCosto;
	}
	
	public Boolean getIsPermisoCopiarCentroCosto() {
		return isPermisoCopiarCentroCosto;
	}

	public void setIsPermisoCopiarCentroCosto(Boolean isPermisoCopiarCentroCosto) {
		this.isPermisoCopiarCentroCosto = isPermisoCopiarCentroCosto;
	}
	
	public Boolean getIsPermisoVerFormCentroCosto() {
		return isPermisoVerFormCentroCosto;
	}

	public void setIsPermisoVerFormCentroCosto(Boolean isPermisoVerFormCentroCosto) {
		this.isPermisoVerFormCentroCosto = isPermisoVerFormCentroCosto;
	}
	
	public Boolean getIsPermisoDuplicarCentroCosto() {
		return isPermisoDuplicarCentroCosto;
	}

	public void setIsPermisoDuplicarCentroCosto(Boolean isPermisoDuplicarCentroCosto) {
		this.isPermisoDuplicarCentroCosto = isPermisoDuplicarCentroCosto;
	}
	
	public Boolean getIsPermisoOrdenCentroCosto() {
		return isPermisoOrdenCentroCosto;
	}

	public void setIsPermisoOrdenCentroCosto(Boolean isPermisoOrdenCentroCosto) {
		this.isPermisoOrdenCentroCosto = isPermisoOrdenCentroCosto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCentroCosto() {
		return isVisibilidadCeldaNuevoCentroCosto;
	}

	public void setIsVisibilidadCeldaNuevoCentroCosto(Boolean isVisibilidadCeldaNuevoCentroCosto) {
		this.isVisibilidadCeldaNuevoCentroCosto = isVisibilidadCeldaNuevoCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCentroCosto() {
		return isVisibilidadCeldaDuplicarCentroCosto;
	}

	public void setIsVisibilidadCeldaDuplicarCentroCosto(Boolean isVisibilidadCeldaDuplicarCentroCosto) {
		this.isVisibilidadCeldaDuplicarCentroCosto = isVisibilidadCeldaDuplicarCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCentroCosto() {
		return isVisibilidadCeldaCopiarCentroCosto;
	}

	public void setIsVisibilidadCeldaCopiarCentroCosto(Boolean isVisibilidadCeldaCopiarCentroCosto) {
		this.isVisibilidadCeldaCopiarCentroCosto = isVisibilidadCeldaCopiarCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCentroCosto() {
		return isVisibilidadCeldaVerFormCentroCosto;
	}

	public void setIsVisibilidadCeldaVerFormCentroCosto(Boolean isVisibilidadCeldaVerFormCentroCosto) {
		this.isVisibilidadCeldaVerFormCentroCosto = isVisibilidadCeldaVerFormCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCentroCosto() {
		return isVisibilidadCeldaOrdenCentroCosto;
	}

	public void setIsVisibilidadCeldaOrdenCentroCosto(Boolean isVisibilidadCeldaOrdenCentroCosto) {
		this.isVisibilidadCeldaOrdenCentroCosto = isVisibilidadCeldaOrdenCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCentroCosto() {
		return isVisibilidadCeldaNuevoRelacionesCentroCosto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCentroCosto(Boolean isVisibilidadCeldaNuevoRelacionesCentroCosto) {
		this.isVisibilidadCeldaNuevoRelacionesCentroCosto = isVisibilidadCeldaNuevoRelacionesCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCentroCosto() {
		return isVisibilidadCeldaModificarCentroCosto;
	}

	public void setIsVisibilidadCeldaModificarCentroCosto(Boolean isVisibilidadCeldaModificarCentroCosto) {
		this.isVisibilidadCeldaModificarCentroCosto = isVisibilidadCeldaModificarCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCentroCosto() {
		return isVisibilidadCeldaActualizarCentroCosto;
	}

	public void setIsVisibilidadCeldaActualizarCentroCosto(Boolean isVisibilidadCeldaActualizarCentroCosto) {
		this.isVisibilidadCeldaActualizarCentroCosto = isVisibilidadCeldaActualizarCentroCosto;
	}

	public Boolean getIsVisibilidadCeldaEliminarCentroCosto() {
		return isVisibilidadCeldaEliminarCentroCosto;
	}

	public void setIsVisibilidadCeldaEliminarCentroCosto(Boolean isVisibilidadCeldaEliminarCentroCosto) {
		this.isVisibilidadCeldaEliminarCentroCosto = isVisibilidadCeldaEliminarCentroCosto;
	}

	public Boolean getIsVisibilidadCeldaCancelarCentroCosto() {
		return isVisibilidadCeldaCancelarCentroCosto;
	}

	public void setIsVisibilidadCeldaCancelarCentroCosto(Boolean isVisibilidadCeldaCancelarCentroCosto) {
		this.isVisibilidadCeldaCancelarCentroCosto = isVisibilidadCeldaCancelarCentroCosto;
	}

	public Boolean getIsVisibilidadCeldaGuardarCentroCosto() {
		return isVisibilidadCeldaGuardarCentroCosto;
	}

	public void setIsVisibilidadCeldaGuardarCentroCosto(Boolean isVisibilidadCeldaGuardarCentroCosto) {
		this.isVisibilidadCeldaGuardarCentroCosto = isVisibilidadCeldaGuardarCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCentroCosto() {
		return isVisibilidadCeldaGuardarCambiosCentroCosto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCentroCosto(Boolean isVisibilidadCeldaGuardarCambiosCentroCosto) {
		this.isVisibilidadCeldaGuardarCambiosCentroCosto = isVisibilidadCeldaGuardarCambiosCentroCosto;
	}
		
	public CentroCostoSessionBean getcentrocostoSessionBean() {
		return this.centrocostoSessionBean;
	}
	
	public void setcentrocostoSessionBean(CentroCostoSessionBean centrocostoSessionBean) {
		this.centrocostoSessionBean=centrocostoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
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

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCentroCosto(CentroCosto centrocosto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(centrocosto,null);
				this.setActualParaGuardarCentroCostoForeignKey(centrocosto,null);
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
	
	public void bugActualizarReferenciaActual(CentroCosto centrocosto,CentroCosto centrocostoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCentroCosto(centrocosto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		centrocostoAux.setId(centrocosto.getId());
		centrocostoAux.setVersionRow(centrocosto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCentroCosto();
		
			int intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCentroCosto(this.centrocosto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = centrocostoValidator.getInvalidValues(this.centrocosto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			centrocostoLogic.setDatosCliente(datosCliente);
			centrocostoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				centrocostoAux=new  CentroCosto();
				
				centrocostoAux.setIsNew(true);
				centrocostoAux.setIsChanged(true);
				
				centrocostoAux.setCentroCostoOriginal(this.centrocosto);
				
				centrocostoAux.setId(this.centrocosto.getId());	
				centrocostoAux.setVersionRow(this.centrocosto.getVersionRow());	
				centrocostoAux.setid_empresa(this.centrocosto.getid_empresa());	
				centrocostoAux.setcodigo(this.centrocosto.getcodigo());	
				centrocostoAux.setnombre(this.centrocosto.getnombre());	
				
				if(this.centrocosto.getid_centro_costo()!=null && this.centrocosto.getid_centro_costo()>0L) {
					centrocostoAux.setid_centro_costo(this.centrocosto.getid_centro_costo());
				} else {
					centrocostoAux.setid_centro_costo(null);
				}	
				centrocostoAux.setporcentaje(this.centrocosto.getporcentaje());	
				centrocostoAux.setvalor(this.centrocosto.getvalor());	
				centrocostoAux.setorden(this.centrocosto.getorden());	
				centrocostoAux.setes_final(this.centrocosto.getes_final());	
				centrocostoAux.setdescripcion(this.centrocosto.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.centrocostoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.centrocostoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(centrocostoAux,centrocostoLogic.getCentroCostos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centrocostoAux,centrocostos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.centrocostoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.centrocostoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoLogic.saveCentroCostos();//WithConnection
						//centrocostoLogic.getSetVersionRowCentroCostos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.centrocosto,centrocostoAux);
					
					this.refrescarForeignKeysDescripcionesCentroCosto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				centrocostoAux=new  CentroCosto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.centrocostoSessionBean.getEsGuardarRelacionado() 
					|| (this.centrocostoSessionBean.getEsGuardarRelacionado() && this.centrocosto.getId()>=0)) {
						
					centrocostoAux.setIsNew(false);
				}
				
				centrocostoAux.setIsDeleted(false);
			
				centrocostoAux.setId(this.centrocosto.getId());	
				centrocostoAux.setVersionRow(this.centrocosto.getVersionRow());	
				centrocostoAux.setid_empresa(this.centrocosto.getid_empresa());	
				centrocostoAux.setcodigo(this.centrocosto.getcodigo());	
				centrocostoAux.setnombre(this.centrocosto.getnombre());	
				
				if(this.centrocosto.getid_centro_costo()!=null && this.centrocosto.getid_centro_costo()>0L) {
					centrocostoAux.setid_centro_costo(this.centrocosto.getid_centro_costo());
				} else {
					centrocostoAux.setid_centro_costo(null);
				}	
				centrocostoAux.setporcentaje(this.centrocosto.getporcentaje());	
				centrocostoAux.setvalor(this.centrocosto.getvalor());	
				centrocostoAux.setorden(this.centrocosto.getorden());	
				centrocostoAux.setes_final(this.centrocosto.getes_final());	
				centrocostoAux.setdescripcion(this.centrocosto.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(centrocostoAux,centrocostoLogic.getCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centrocostoAux,centrocostos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.centrocostoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.centrocostoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoLogic.saveCentroCostos();//WithConnection
						//centrocostoLogic.getSetVersionRowCentroCostos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.centrocosto,centrocostoAux);
					
					this.refrescarForeignKeysDescripcionesCentroCosto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				centrocostoAux=new  CentroCosto();
				
				centrocostoAux.setIsNew(false);
				centrocostoAux.setIsChanged(false);
				
				centrocostoAux.setIsDeleted(true);
				
				centrocostoAux.setId(this.centrocosto.getId());	
				centrocostoAux.setVersionRow(this.centrocosto.getVersionRow());	
				centrocostoAux.setid_empresa(this.centrocosto.getid_empresa());	
				centrocostoAux.setcodigo(this.centrocosto.getcodigo());	
				centrocostoAux.setnombre(this.centrocosto.getnombre());	
				
				if(this.centrocosto.getid_centro_costo()!=null && this.centrocosto.getid_centro_costo()>0L) {
					centrocostoAux.setid_centro_costo(this.centrocosto.getid_centro_costo());
				} else {
					centrocostoAux.setid_centro_costo(null);
				}	
				centrocostoAux.setporcentaje(this.centrocosto.getporcentaje());	
				centrocostoAux.setvalor(this.centrocosto.getvalor());	
				centrocostoAux.setorden(this.centrocosto.getorden());	
				centrocostoAux.setes_final(this.centrocosto.getes_final());	
				centrocostoAux.setdescripcion(this.centrocosto.getdescripcion());	
				
				if(this.centrocostoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.centrocostoAux.getId()>=0) {	
						this.centrocostosEliminados.add(centrocostoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(centrocostoAux,centrocostoLogic.getCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centrocostoAux,centrocostos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.centrocostoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.centrocostoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoLogic.saveCentroCostos();//WithConnection
						//centrocostoLogic.getSetVersionRowCentroCostos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.getCentroCostos().addAll(this.centrocostosEliminados);
					
					centrocostoLogic.saveCentroCostos();//WithConnection
					//centrocostoLogic.getSetVersionRowCentroCostos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCentroCosto();
				
				this.centrocostosEliminados= new ArrayList<CentroCosto>();		
			}
			
			if(this.centrocostoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
			//ACTUALIZA ARBOL
			this.getTodosCentroCostoArbol();
			
			//TO_OPTIMIZE POR TIPO FK NO TODOS
			this.inicializarCombosForeignKeyCentroCostoListas();
			
			this.cargarCombosForeignKeyCentroCosto(false);
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Centro Costo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Centro Costo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.centrocosto=centrocostoAux;
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
      		//this.finishProcessCentroCosto();
      	}
		
	}	
	
	public void actualizarRelaciones(CentroCosto centrocostoLocal) throws Exception {
		
		if(this.centrocostoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CentroCosto centrocostoLocal) throws Exception {	
		if(this.centrocostoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				centrocostoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CentroCostoDetalleFormJInternalFrame.class)) {
				CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrameLocal=(CentroCostoBeanSwingJInternalFrame) ((CentroCostoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				centrocostoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCentroCosto(centrocostoBeanSwingJInternalFrameLocal.getcentrocosto(),true);
				centrocostoBeanSwingJInternalFrameLocal.actualizarLista(centrocostoBeanSwingJInternalFrameLocal.centrocosto,this.centrocostosForeignKey);

				centrocostoBeanSwingJInternalFrameLocal.actualizarRelaciones(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				centrocostoLocal.setCentroCosto(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey("Formulario");
				this.setActualCentroCostoForeignKey(centrocostoBeanSwingJInternalFrameLocal.centrocosto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCentroCostoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = centrocostoValidator.getInvalidValues(this.centrocosto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CentroCosto centrocosto,List<CentroCosto> centrocostos) throws Exception {
		try	{		
			CentroCostoConstantesFunciones.actualizarLista(centrocosto,centrocostos,this.centrocostoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CentroCosto centrocosto,List<CentroCosto> centrocostos) throws Exception {
		try	{			
			CentroCostoConstantesFunciones.actualizarSelectedLista(centrocosto,centrocostos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CentroCosto> centrocostosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				centrocostosLocal=this.centrocostoLogic.getCentroCostos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				centrocostosLocal=this.centrocostos;
			}
			//ARCHITECTURE
		
			for(CentroCosto centrocostoLocal:centrocostosLocal) {
				if(this.permiteMantenimiento(centrocostoLocal) && centrocostoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CentroCostoConstantesFunciones.getCentroCostoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CentroCostoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCosto.jLabelid_empresaCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCosto.jLabelcodigoCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCosto.jLabelnombreCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoConstantesFunciones.IDCENTROCOSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCosto.jLabelid_centro_costoCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCosto.jLabelporcentajeCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCosto.jLabelvalorCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoConstantesFunciones.ORDEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCosto.jLabelordenCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoConstantesFunciones.ESFINAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCosto.jLabeles_finalCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCosto.jLabeldescripcionCentroCosto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCosto.jLabelid_empresaCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCosto.jLabelcodigoCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCosto.jLabelnombreCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCosto.jLabelid_centro_costoCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCosto.jLabelporcentajeCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCosto.jLabelvalorCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCosto.jLabelordenCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCosto.jLabeles_finalCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCosto.jLabeldescripcionCentroCosto,"");
		
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
		this.iIdNuevoCentroCosto--;	
		
		
		this.centrocostoAux=new CentroCosto();
		
		this.centrocostoAux.setId(this.iIdNuevoCentroCosto);
		this.centrocostoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.centrocostoLogic.getCentroCostos().add(this.centrocostoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.centrocostos.add(this.centrocostoAux);
		}
		//ARCHITECTURE
		
		this.centrocosto=this.centrocostoAux;
		
		if(CentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCentroCosto(this.centrocosto);
			this.setVariablesObjetoActualToFormularioForeignKeyCentroCosto(this.centrocosto);
		}
				
		//this.setDefaultControlesCentroCosto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCentroCosto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCentroCosto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCentroCosto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCentroCosto(this.centrocostoBean,this.centrocosto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CentroCostoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.centrocostoSessionBean.getConGuardarRelaciones()) {
			classes=CentroCostoConstantesFunciones.getClassesRelationshipsOfCentroCosto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.centrocostoReturnGeneral=centrocostoLogic.procesarEventosCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.centrocostoLogic.getCentroCostos(),this.centrocosto,this.centrocostoParameterGeneral,this.isEsNuevoCentroCosto,classes);//this.centrocostoLogic.getCentroCosto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCentroCosto(this.centrocostoReturnGeneral,this.centrocostoBean,false);
		
		if(this.centrocostoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCentroCosto(this.centrocostoReturnGeneral.getCentroCosto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCentroCosto(this.centrocostoReturnGeneral.getCentroCosto());
		}
		
		if(this.centrocostoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCentroCosto(this.centrocostoReturnGeneral.getCentroCosto(),classes);//this.centrocostoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCentroCosto(this.centrocosto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCentroCosto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCentroCosto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CentroCostoBeanSwingJInternalFrameAdditional.RecargarFormCentroCosto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCentroCosto(false);
						
			if(centrocostoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CentroCostoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCentroCosto();
			}
			
			this.actualizarVisualTableDatosCentroCosto();
			
			this.jTableDatosCentroCosto.setRowSelectionInterval(this.getIndiceNuevoCentroCosto(), this.getIndiceNuevoCentroCosto());
			
			this.seleccionarFilaTablaCentroCostoActual();
						
			this.actualizarEstadoCeldasBotonesCentroCosto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCentroCosto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCentroCosto.jTextFieldcodigoCentroCosto.setEnabled(isHabilitar && this.centrocostoConstantesFunciones.activarcodigoCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jTextAreanombreCentroCosto.setEnabled(isHabilitar && this.centrocostoConstantesFunciones.activarnombreCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jTextFieldporcentajeCentroCosto.setEnabled(isHabilitar && this.centrocostoConstantesFunciones.activarporcentajeCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jTextFieldvalorCentroCosto.setEnabled(isHabilitar && this.centrocostoConstantesFunciones.activarvalorCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jTextFieldordenCentroCosto.setEnabled(isHabilitar && this.centrocostoConstantesFunciones.activarordenCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jCheckBoxes_finalCentroCosto.setEnabled(isHabilitar && this.centrocostoConstantesFunciones.activares_finalCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jTextAreadescripcionCentroCosto.setEnabled(isHabilitar && this.centrocostoConstantesFunciones.activardescripcionCentroCosto);	
		//
		this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_empresaCentroCosto.setEnabled(isHabilitar && this.centrocostoConstantesFunciones.activarid_empresaCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_centro_costoCentroCosto.setEnabled(isHabilitar && this.centrocostoConstantesFunciones.activarid_centro_costoCentroCosto);
	};
	
	public void setDefaultControlesCentroCosto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCentroCosto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.centrocostoSessionBean.setConGuardarRelaciones(true);			
			this.centrocostoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCentroCosto.jTabbedPaneRelacionesCentroCosto.setVisible(true);
			
					
		} else {
			//this.centrocostoSessionBean.setConGuardarRelaciones(false);			
			this.centrocostoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCentroCosto.jTabbedPaneRelacionesCentroCosto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCentroCosto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCosto centrocostoAux:this.centrocostoLogic.getCentroCostos()) {
				if(centrocostoAux.getId().equals(this.iIdNuevoCentroCosto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCosto centrocostoAux:this.centrocostos) {
				if(centrocostoAux.getId().equals(this.iIdNuevoCentroCosto)) {
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
	
	public int getIndiceActualCentroCosto(CentroCosto centrocosto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCosto centrocostoAux:this.centrocostoLogic.getCentroCostos()) {
				if(centrocostoAux.getId().equals(centrocosto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCosto centrocostoAux:this.centrocostos) {
				if(centrocostoAux.getId().equals(centrocosto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCentroCosto(CentroCosto centrocostoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCosto centrocostoAux:this.centrocostoLogic.getCentroCostos()) {
				if(centrocostoAux.getCentroCostoOriginal().getId().equals(centrocostoOriginal.getId())) {
					existe=true;
					centrocostoOriginal.setId(centrocostoAux.getId());
					centrocostoOriginal.setVersionRow(centrocostoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCosto centrocostoAux:this.centrocostos) {
				if(centrocostoAux.getCentroCostoOriginal().getId().equals(centrocostoOriginal.getId())) {
					existe=true;
					centrocostoOriginal.setId(centrocostoAux.getId());
					centrocostoOriginal.setVersionRow(centrocostoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCentroCosto(Boolean esParaCancelar) throws Exception {
		centrocostosAux=new ArrayList<CentroCosto>();
		centrocostoAux=new CentroCosto();
		
		if(!this.centrocostoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CentroCosto centrocostoAux:this.centrocostoLogic.getCentroCostos()) {
					if(centrocostoAux.getId()<0) {
						centrocostosAux.add(centrocostoAux);
					}		
				}
				this.iIdNuevoCentroCosto=0L;
				this.centrocostoLogic.getCentroCostos().removeAll(centrocostosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroCosto centrocostoAux:this.centrocostos) {
					if(centrocostoAux.getId()<0) {
						centrocostosAux.add(centrocostoAux);
					}		
				}
				this.iIdNuevoCentroCosto=0L;
				this.centrocostos.removeAll(centrocostosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCentroCosto 
					&& this.centrocostoLogic.getCentroCostos().size()>0
					) {
					centrocostoAux=this.centrocostoLogic.getCentroCostos().get(this.centrocostoLogic.getCentroCostos().size() - 1);
				
					if(centrocostoAux.getId()<0) {
						this.centrocostoLogic.getCentroCostos().remove(centrocostoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCentroCosto && this.centrocostos.size()>0) {
					centrocostoAux=this.centrocostos.get(this.centrocostos.size() - 1);
				
					if(centrocostoAux.getId()<0) {
						this.centrocostos.remove(centrocostoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCentroCosto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(centrocosto.getId()<0) {
				this.centrocostoLogic.getCentroCostos().remove(this.centrocosto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(centrocosto.getId()<0) {
				this.centrocostos.remove(this.centrocosto);
			}
		}			
	}
	
	public void setEstadosInicialesCentroCosto(List<CentroCosto> centrocostosAux) throws Exception {
		CentroCostoConstantesFunciones.setEstadosInicialesCentroCosto(centrocostosAux);
	}
	
	public void setEstadosInicialesCentroCosto(CentroCosto centrocostoAux) throws Exception {
		CentroCostoConstantesFunciones.setEstadosInicialesCentroCosto(centrocostoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCentroCostoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCentroCostoActual()) {
				if(!this.isEsNuevoCentroCosto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCentroCosto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCentroCostoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Centro Costo ?", "MANTENIMIENTO DE Centro Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CentroCosto centrocosto) throws Exception {
		CentroCostoConstantesFunciones.seleccionarAsignar(this.centrocosto,centrocosto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCentroCosto=this.isPermisoActualizarOriginalCentroCosto;
			
			
			this.seleccionarAsignar(centrocosto);
			
			

			idCentroCostoActual=centrocosto.getid_centro_costo();
			this.seleccionarCentroCostoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CentroCostoConstantesFunciones.quitarEspaciosCentroCosto(this.centrocosto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCentroCosto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.centrocostoSessionBean.setsFuncionBusquedaRapida(this.centrocostoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoCentroCosto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCentroCosto(esParaCancelar);				
				this.cancelarNuevoCentroCosto(esParaCancelar);								
			}
			
			this.centrocosto=new CentroCosto();
			
			this.inicializarCentroCosto();
			
			this.actualizarEstadoCeldasBotonesCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCentroCosto() throws Exception {
		try {
			CentroCostoConstantesFunciones.inicializarCentroCosto(this.centrocosto);
			
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
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.centrocostoLogic.getCentroCostos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCentroCostos(String sAccionBusqueda,List<CentroCosto> centrocostosParaReportes) throws Exception {
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
					sPathReporteFinal="CentroCosto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CentroCostoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CentroCostoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CentroCosto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Centro Costos");		
		parameters.put("busquedapor", CentroCostoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCentroCosto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CentroCostoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CentroCostoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCentroCosto=new JRBeanArrayDataSource(CentroCostoJInternalFrame.TraerCentroCostoBeans(centrocostosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCentroCosto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CentroCostoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CentroCostoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CentroCostoBean.TraerCentroCostoBeans(centrocostosParaReportes).toArray()));
							
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
				this.generarExcelReporteCentroCostos(sAccionBusqueda,sTipoArchivoReporte,centrocostosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCentroCostos(sAccionBusqueda,sTipoArchivoReporte,centrocostosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCentroCostoActionPerformed(null);
					//this.generarExcelReporteCentroCostos(sAccionBusqueda,sTipoArchivoReporte,centrocostosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCentroCostos(sAccionBusqueda,sTipoArchivoReporte,centrocostosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCentroCostos(sAccionBusqueda,sTipoArchivoReporte,centrocostosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCentroCostos(sAccionBusqueda,sTipoArchivoReporte,centrocostosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCentroCostos(String sAccionBusqueda,String sTipoArchivoReporte,List<CentroCosto> centrocostosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocosto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CentroCostos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCentroCosto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CentroCosto centrocosto : centrocostosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CentroCostoConstantesFunciones.generarExcelReporteDataCentroCosto("NORMAL",row,workbook,centrocosto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCentroCosto(String sTipo,Row row,Workbook workbook) {
		
		CentroCostoConstantesFunciones.generarExcelReporteHeaderCentroCosto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCentroCostos(String sAccionBusqueda,String sTipoArchivoReporte,List<CentroCosto> centrocostosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocosto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CentroCostos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CentroCosto centrocosto : centrocostosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CentroCostoConstantesFunciones.getCentroCostoDescripcion(centrocosto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocosto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocosto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocosto.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocosto.getcentrocosto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocosto.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocosto.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoConstantesFunciones.LABEL_ORDEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoConstantesFunciones.LABEL_ORDEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocosto.getorden());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoConstantesFunciones.LABEL_ESFINAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoConstantesFunciones.LABEL_ESFINAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(centrocosto.getes_final()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocosto.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCentroCostos(String sAccionBusqueda,String sTipoArchivoReporte,List<CentroCosto> centrocostosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CentroCosto> centrocostosRespaldo=null;
		
		classes=CentroCostoConstantesFunciones.getClassesRelationshipsOfCentroCosto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.centrocostoLogic.setDatosCliente(this.datosCliente);
		this.centrocostoLogic.setDatosDeep(this.datosDeep);
		this.centrocostoLogic.setIsConDeep(true);
		
		centrocostosRespaldo=this.centrocostoLogic.getCentroCostos();
		
		this.centrocostoLogic.setCentroCostos(centrocostosParaReportes);	
		this.centrocostoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		centrocostosParaReportes=this.centrocostoLogic.getCentroCostos();
		this.centrocostoLogic.setCentroCostos(centrocostosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocosto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CentroCostos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCentroCosto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CentroCosto centrocosto : centrocostosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCentroCosto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CentroCostoConstantesFunciones.generarExcelReporteDataCentroCosto("NORMAL",row,workbook,centrocosto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CentroCostoConstantesFunciones.getCentroCostoDescripcion(centrocosto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCentroCosto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCosto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCentroCosto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCosto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCentroCosto() throws Exception {		
		this.startProcessCentroCosto(true);
	}
	
	public void startProcessCentroCosto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCentroCosto ,this.jPanelParametrosReportesCentroCosto, this.jScrollPanelDatosCentroCosto,this.jPanelPaginacionCentroCosto, this.jScrollPanelDatosEdicionCentroCosto, this.jPanelAccionesCentroCosto,this.jPanelAccionesFormularioCentroCosto,this.jmenuBarCentroCosto,this.jmenuBarDetalleCentroCosto,this.jTtoolBarCentroCosto,this.jTtoolBarDetalleCentroCosto);		
		
		final JTabbedPane jTabbedPaneBusquedasCentroCosto=this.jTabbedPaneBusquedasCentroCosto; 
		
		final JPanel jPanelParametrosReportesCentroCosto=this.jPanelParametrosReportesCentroCosto;
		//final JScrollPane jScrollPanelDatosCentroCosto=this.jScrollPanelDatosCentroCosto;
		final JTable jTableDatosCentroCosto=this.jTableDatosCentroCosto;		
		final JPanel jPanelPaginacionCentroCosto=this.jPanelPaginacionCentroCosto;
		//final JScrollPane jScrollPanelDatosEdicionCentroCosto=this.jScrollPanelDatosEdicionCentroCosto;
		final JPanel jPanelAccionesCentroCosto=this.jPanelAccionesCentroCosto;
		
		JPanel jPanelCamposAuxiliarCentroCosto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCentroCosto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) {
			jPanelCamposAuxiliarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jPanelCamposCentroCosto;
			jPanelAccionesFormularioAuxiliarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jPanelAccionesFormularioCentroCosto;
		}
		
		final JPanel jPanelCamposCentroCosto=jPanelCamposAuxiliarCentroCosto;
		final JPanel jPanelAccionesFormularioCentroCosto=jPanelAccionesFormularioAuxiliarCentroCosto;
		
		
		final JMenuBar jmenuBarCentroCosto=this.jmenuBarCentroCosto;
		final JToolBar jTtoolBarCentroCosto=this.jTtoolBarCentroCosto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCentroCosto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCentroCosto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) {
			jmenuBarDetalleAuxiliarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jmenuBarDetalleCentroCosto;
			jTtoolBarDetalleAuxiliarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jTtoolBarDetalleCentroCosto;
		}
		
		final JMenuBar jmenuBarDetalleCentroCosto=jmenuBarDetalleAuxiliarCentroCosto;
		final JToolBar jTtoolBarDetalleCentroCosto=jTtoolBarDetalleAuxiliarCentroCosto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCentroCosto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCentroCosto;
			processRunnable.jTableDatos=jTableDatosCentroCosto;
			processRunnable.jPanelCampos=jPanelCamposCentroCosto;
			processRunnable.jPanelPaginacion=jPanelPaginacionCentroCosto;
			processRunnable.jPanelAcciones=jPanelAccionesCentroCosto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCentroCosto;
			
			
			processRunnable.jmenuBar=jmenuBarCentroCosto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCentroCosto;
			processRunnable.jTtoolBar=jTtoolBarCentroCosto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCentroCosto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCentroCosto ,jPanelParametrosReportesCentroCosto,jTableDatosCentroCosto, /*jScrollPanelDatosCentroCosto,*/jPanelCamposCentroCosto,jPanelPaginacionCentroCosto, /*jScrollPanelDatosEdicionCentroCosto,*/ jPanelAccionesCentroCosto,jPanelAccionesFormularioCentroCosto,jmenuBarCentroCosto,jmenuBarDetalleCentroCosto,jTtoolBarCentroCosto,jTtoolBarDetalleCentroCosto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCentroCosto ,jPanelParametrosReportesCentroCosto, jScrollPanelDatosCentroCosto,jPanelPaginacionCentroCosto, jScrollPanelDatosEdicionCentroCosto, jPanelAccionesCentroCosto,jPanelAccionesFormularioCentroCosto,jmenuBarCentroCosto,jmenuBarDetalleCentroCosto,jTtoolBarCentroCosto,jTtoolBarDetalleCentroCosto);
						
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
	
	public void finishProcessCentroCosto() {// throws Exception 
		this.finishProcessCentroCosto(true);
	}
	
	public void finishProcessCentroCosto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCentroCosto ,this.jPanelParametrosReportesCentroCosto, this.jScrollPanelDatosCentroCosto,this.jPanelPaginacionCentroCosto, this.jScrollPanelDatosEdicionCentroCosto, this.jPanelAccionesCentroCosto,this.jPanelAccionesFormularioCentroCosto,this.jmenuBarCentroCosto,this.jmenuBarDetalleCentroCosto,this.jTtoolBarCentroCosto,this.jTtoolBarDetalleCentroCosto);		
		
		final JTabbedPane jTabbedPaneBusquedasCentroCosto=this.jTabbedPaneBusquedasCentroCosto; 
		
		final JPanel jPanelParametrosReportesCentroCosto=this.jPanelParametrosReportesCentroCosto;
		//final JScrollPane jScrollPanelDatosCentroCosto=this.jScrollPanelDatosCentroCosto;
		final JTable jTableDatosCentroCosto=this.jTableDatosCentroCosto;		
		final JPanel jPanelPaginacionCentroCosto=this.jPanelPaginacionCentroCosto;
		//final JScrollPane jScrollPanelDatosEdicionCentroCosto=this.jScrollPanelDatosEdicionCentroCosto;
		final JPanel jPanelAccionesCentroCosto=this.jPanelAccionesCentroCosto;
		
		JPanel jPanelCamposAuxiliarCentroCosto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCentroCosto=new JPanel();
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) {
			jPanelCamposAuxiliarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jPanelCamposCentroCosto;
			jPanelAccionesFormularioAuxiliarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jPanelAccionesFormularioCentroCosto;
		}
		
		final JPanel jPanelCamposCentroCosto=jPanelCamposAuxiliarCentroCosto;
		final JPanel jPanelAccionesFormularioCentroCosto=jPanelAccionesFormularioAuxiliarCentroCosto;
		
		
		final JMenuBar jmenuBarCentroCosto=this.jmenuBarCentroCosto;		
		final JToolBar jTtoolBarCentroCosto=this.jTtoolBarCentroCosto;
				
		JMenuBar jmenuBarDetalleAuxiliarCentroCosto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCentroCosto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) {
			jmenuBarDetalleAuxiliarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jmenuBarDetalleCentroCosto;
			jTtoolBarDetalleAuxiliarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jTtoolBarDetalleCentroCosto;		
		}
		
		final JMenuBar jmenuBarDetalleCentroCosto=jmenuBarDetalleAuxiliarCentroCosto;
		final JToolBar jTtoolBarDetalleCentroCosto=jTtoolBarDetalleAuxiliarCentroCosto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCentroCosto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCentroCosto;
			processRunnable.jTableDatos=jTableDatosCentroCosto;
			processRunnable.jPanelCampos=jPanelCamposCentroCosto;
			processRunnable.jPanelPaginacion=jPanelPaginacionCentroCosto;
			processRunnable.jPanelAcciones=jPanelAccionesCentroCosto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCentroCosto;
			
			
			processRunnable.jmenuBar=jmenuBarCentroCosto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCentroCosto;
			processRunnable.jTtoolBar=jTtoolBarCentroCosto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCentroCosto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCentroCosto ,jPanelParametrosReportesCentroCosto, jTableDatosCentroCosto,/*jScrollPanelDatosCentroCosto,*/jPanelCamposCentroCosto,jPanelPaginacionCentroCosto, /*jScrollPanelDatosEdicionCentroCosto,*/ jPanelAccionesCentroCosto,jPanelAccionesFormularioCentroCosto,jmenuBarCentroCosto,jmenuBarDetalleCentroCosto,jTtoolBarCentroCosto,jTtoolBarDetalleCentroCosto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCentroCosto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCentroCosto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCentroCosto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCentroCosto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCentroCosto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCentroCosto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCentroCosto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCentroCosto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCentroCosto,esHabilitar,1,1);
		}
	}
	*/
	
	
	public void getTodosCentroCostoArbol() throws Exception {	
		ArrayList<String> arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral);
		
		String  finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);
		
		this.pagination=new Pagination();
		
		this.pagination.setiFirstResult(-1);
		this.pagination.setiMaxResults(-1);
		
		this.cargarDatosCliente();
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			centrocostoLogic.getTodosCentroCostos(finalQueryGlobal+"",this.pagination);//WithConnection
			this.centrocostosArbol=centrocostoLogic.getCentroCostos();
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
	}
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.centrocostoConstantesFunciones.getsFinalQueryCentroCosto();
		String  finalQueryPaginacionTodos=this.centrocostoConstantesFunciones.getsFinalQueryCentroCosto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CentroCostoConstantesFunciones.getArrayColumnasGlobalesNoCentroCosto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.centrocostosEliminados= new ArrayList<CentroCosto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCentroCosto();
		
				///*CentroCostoSessionBean*/this.centrocostoSessionBean=new CentroCostoSessionBean();
			
			if(this.centrocostoSessionBean==null) {
				this.centrocostoSessionBean=new CentroCostoSessionBean();
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
					this.iNumeroPaginacion=CentroCostoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CentroCostoConstantesFunciones.getClassesForeignKeysOfCentroCosto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/centrocosto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			centrocostosAux= new ArrayList<CentroCosto>();
			
				
			centrocostoLogic.setDatosCliente(this.datosCliente);
			centrocostoLogic.setDatosDeep(this.datosDeep);
			centrocostoLogic.setIsConDeep(true);
			
			
			centrocostoLogic.getCentroCostoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					centrocostoLogic.getTodosCentroCostos(finalQueryGlobal,pagination);
					
					//centrocostoLogic.getTodosCentroCostosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(centrocostoLogic.getCentroCostos()==null|| centrocostoLogic.getCentroCostos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							centrocostosAux= new ArrayList<CentroCosto>();
							centrocostosAux.addAll(centrocostoLogic.getCentroCostos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostosAux= new ArrayList<CentroCosto>();
							centrocostosAux.addAll(centrocostos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							centrocostoLogic.getTodosCentroCostos(finalQueryGlobal+"",this.pagination);												
							
							//centrocostoLogic.getTodosCentroCostosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCentroCostos("Todos",centrocostoLogic.getCentroCostos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							centrocostoLogic.setCentroCostos(new ArrayList<CentroCosto>());					
							centrocostoLogic.getCentroCostos().addAll(centrocostosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostos=new ArrayList<CentroCosto>();
							centrocostos.addAll(centrocostosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCentroCosto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCentroCosto=this.idActual;
				
				} else if(this.idCentroCostoActual!=null && this.idCentroCostoActual!=0L) {
					idCentroCosto=idCentroCostoActual;
				}
				
					
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndicePorId(idCentroCosto);
				
				this.centrocostos=new ArrayList<CentroCosto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					centrocostoLogic.getEntity(idCentroCosto);
					
					//centrocostoLogic.getEntityWithConnection(idCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.setCentroCostos(new ArrayList<CentroCosto>());
					centrocostoLogic.getCentroCostos().add(centrocostoLogic.getCentroCosto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostos=new ArrayList<CentroCosto>();
					this.centrocostos.add(centrocosto);
				}
				
				if(centrocostoLogic.getCentroCosto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centrocostoLogic.getCentroCostosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centrocostoLogic.getCentroCostos()==null||centrocostoLogic.getCentroCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centrocostos==null|| centrocostos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostosAux=new ArrayList<CentroCosto>();
						centrocostosAux.addAll(centrocostoLogic.getCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostosAux=new ArrayList<CentroCosto>();
							centrocostosAux.addAll(centrocostos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centrocostoLogic.getCentroCostosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroCostos("BusquedaPorCodigo",centrocostoLogic.getCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroCostos("BusquedaPorCodigo",centrocostos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoLogic.setCentroCostos(new ArrayList<CentroCosto>());
						centrocostoLogic.getCentroCostos().addAll(centrocostosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostos=new ArrayList<CentroCosto>();
							centrocostos.addAll(centrocostosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centrocostoLogic.getCentroCostosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centrocostoLogic.getCentroCostos()==null||centrocostoLogic.getCentroCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centrocostos==null|| centrocostos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostosAux=new ArrayList<CentroCosto>();
						centrocostosAux.addAll(centrocostoLogic.getCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostosAux=new ArrayList<CentroCosto>();
							centrocostosAux.addAll(centrocostos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centrocostoLogic.getCentroCostosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroCostos("BusquedaPorNombre",centrocostoLogic.getCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroCostos("BusquedaPorNombre",centrocostos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoLogic.setCentroCostos(new ArrayList<CentroCosto>());
						centrocostoLogic.getCentroCostos().addAll(centrocostosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostos=new ArrayList<CentroCosto>();
							centrocostos.addAll(centrocostosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCentroCosto")) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centrocostoLogic.getCentroCostosFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centrocostoLogic.getCentroCostos()==null||centrocostoLogic.getCentroCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centrocostos==null|| centrocostos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostosAux=new ArrayList<CentroCosto>();
						centrocostosAux.addAll(centrocostoLogic.getCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostosAux=new ArrayList<CentroCosto>();
							centrocostosAux.addAll(centrocostos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centrocostoLogic.getCentroCostosFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroCostos("FK_IdCentroCosto",centrocostoLogic.getCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroCostos("FK_IdCentroCosto",centrocostos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoLogic.setCentroCostos(new ArrayList<CentroCosto>());
						centrocostoLogic.getCentroCostos().addAll(centrocostosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostos=new ArrayList<CentroCosto>();
							centrocostos.addAll(centrocostosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centrocostoLogic.getCentroCostosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centrocostoLogic.getCentroCostos()==null||centrocostoLogic.getCentroCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centrocostos==null|| centrocostos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostosAux=new ArrayList<CentroCosto>();
						centrocostosAux.addAll(centrocostoLogic.getCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostosAux=new ArrayList<CentroCosto>();
							centrocostosAux.addAll(centrocostos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centrocostoLogic.getCentroCostosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroCostos("FK_IdEmpresa",centrocostoLogic.getCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroCostos("FK_IdEmpresa",centrocostos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoLogic.setCentroCostos(new ArrayList<CentroCosto>());
						centrocostoLogic.getCentroCostos().addAll(centrocostosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostos=new ArrayList<CentroCosto>();
							centrocostos.addAll(centrocostosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCentroCosto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCentroCosto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=centrocostoLogic.getCentroCostos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=centrocostos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=centrocostoLogic.getCentroCostos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=centrocostos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CentroCosto centrocosto) {
		Boolean permite=true;
		
		if(this.centrocosto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CentroCostoConstantesFunciones.getOrderByListaCentroCosto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CentroCostoConstantesFunciones.getOrderByListaCentroCosto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCosto centrocosto:centrocostoLogic.getCentroCostos()) {
				if(centrocosto.getsType().equals(Constantes2.S_TOTALES)) {
					centrocostoTotales=centrocosto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCosto centrocosto:this.centrocostos) {
				if(centrocosto.getsType().equals(Constantes2.S_TOTALES)) {
					centrocostoTotales=centrocosto;
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
			this.centrocostoAux=new CentroCosto();
			this.centrocostoAux.setsType(Constantes2.S_TOTALES);
			this.centrocostoAux.setIsNew(false);
			this.centrocostoAux.setIsChanged(false);
			this.centrocostoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CentroCostoConstantesFunciones.TotalizarValoresFilaCentroCosto(this.centrocostoLogic.getCentroCostos(),this.centrocostoAux);
				
				this.centrocostoLogic.getCentroCostos().add(this.centrocostoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CentroCostoConstantesFunciones.TotalizarValoresFilaCentroCosto(this.centrocostos,this.centrocostoAux);
				
				this.centrocostos.add(this.centrocostoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		centrocostoTotales=new CentroCosto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.centrocostoLogic.getCentroCostos().remove(centrocostoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.centrocostos.remove(centrocostoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		centrocostoTotales=new CentroCosto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCosto centrocosto:centrocostoLogic.getCentroCostos()) {
				if(centrocosto.getsType().equals(Constantes2.S_TOTALES)) {
					centrocostoTotales=centrocosto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CentroCostoConstantesFunciones.TotalizarValoresFilaCentroCosto(this.centrocostoLogic.getCentroCostos(),centrocostoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCosto centrocosto:this.centrocostos) {
				if(centrocosto.getsType().equals(Constantes2.S_TOTALES)) {
					centrocostoTotales=centrocosto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CentroCostoConstantesFunciones.TotalizarValoresFilaCentroCosto(this.centrocostos,centrocostoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCentroCostosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroCostosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroCostosFK_IdCentroCosto()throws Exception {
		try {
			sAccionBusqueda="FK_IdCentroCosto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroCostosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroCostoPorIdPorEmpresa()throws Exception {
		try {
			sAccionBusqueda="PorIdPorEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getCentroCostosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getCentroCostosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroCostosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getCentroCostosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroCostosFK_IdCentroCosto(String sFinalQuery,Long id_centro_costo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getCentroCostosFK_IdCentroCosto(sFinalQuery,this.pagination,id_centro_costo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroCostosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getCentroCostosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroCostoPorIdPorEmpresa(Long id,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getCentroCostoPorIdPorEmpresa(id,id_empresa);
				
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
	
	public void inicializarPermisosCentroCosto() {
		this.isPermisoTodoCentroCosto=false;
		this.isPermisoNuevoCentroCosto=false;
		this.isPermisoActualizarCentroCosto=false;
		this.isPermisoActualizarOriginalCentroCosto=false;
		this.isPermisoEliminarCentroCosto=false;
		this.isPermisoGuardarCambiosCentroCosto=false;
		this.isPermisoConsultaCentroCosto=false;
		this.isPermisoBusquedaCentroCosto=false;
		this.isPermisoReporteCentroCosto=false;		
		this.isPermisoOrdenCentroCosto=false;		
		this.isPermisoPaginacionMedioCentroCosto=false;		
		this.isPermisoPaginacionAltoCentroCosto=false;
		this.isPermisoPaginacionTodoCentroCosto=false;
		this.isPermisoCopiarCentroCosto=false;		
		this.isPermisoVerFormCentroCosto=false;		
		this.isPermisoDuplicarCentroCosto=false;		
		this.isPermisoOrdenCentroCosto=false;		
	}
	
	public void setPermisosUsuarioCentroCosto(Boolean isPermiso) {
		this.isPermisoTodoCentroCosto=isPermiso;
		this.isPermisoNuevoCentroCosto=isPermiso;
		this.isPermisoActualizarCentroCosto=isPermiso;
		this.isPermisoActualizarOriginalCentroCosto=isPermiso;
		this.isPermisoEliminarCentroCosto=isPermiso;
		this.isPermisoGuardarCambiosCentroCosto=isPermiso;
		this.isPermisoConsultaCentroCosto=isPermiso;
		this.isPermisoBusquedaCentroCosto=isPermiso;
		this.isPermisoReporteCentroCosto=isPermiso;
		this.isPermisoOrdenCentroCosto=isPermiso;		
		this.isPermisoPaginacionMedioCentroCosto=isPermiso;		
		this.isPermisoPaginacionAltoCentroCosto=isPermiso;		
		this.isPermisoPaginacionTodoCentroCosto=isPermiso;		
		this.isPermisoCopiarCentroCosto=isPermiso;		
		this.isPermisoVerFormCentroCosto=isPermiso;		
		this.isPermisoDuplicarCentroCosto=isPermiso;
		this.isPermisoOrdenCentroCosto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCentroCosto(Boolean isPermiso) {
		//this.isPermisoTodoCentroCosto=isPermiso;
		this.isPermisoNuevoCentroCosto=isPermiso;
		this.isPermisoActualizarCentroCosto=isPermiso;
		this.isPermisoActualizarOriginalCentroCosto=isPermiso;
		this.isPermisoEliminarCentroCosto=isPermiso;
		this.isPermisoGuardarCambiosCentroCosto=isPermiso;
		//this.isPermisoConsultaCentroCosto=isPermiso;
		//this.isPermisoBusquedaCentroCosto=isPermiso;
		//this.isPermisoReporteCentroCosto=isPermiso;
		//this.isPermisoOrdenCentroCosto=isPermiso;		
		//this.isPermisoPaginacionMedioCentroCosto=isPermiso;		
		//this.isPermisoPaginacionAltoCentroCosto=isPermiso;		
		//this.isPermisoPaginacionTodoCentroCosto=isPermiso;		
		//this.isPermisoCopiarCentroCosto=isPermiso;		
		//this.isPermisoDuplicarCentroCosto=isPermiso;
		//this.isPermisoOrdenCentroCosto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCentroCostoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCentroCosto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCentroCostoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCentroCostoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCentroCostoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCentroCostoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCentroCosto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.centrocostoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CentroCostoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCentroCosto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCentroCosto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCentroCosto=this.isPermisoActualizarCentroCosto;
			this.isPermisoEliminarCentroCosto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCentroCosto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCentroCosto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCentroCosto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCentroCosto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCentroCosto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCentroCosto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCentroCosto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCentroCosto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCentroCosto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCentroCosto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCentroCosto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCentroCosto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCentroCosto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.centrocostoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCentroCosto.setToolTipText(this.jTableDatosCentroCosto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCentroCosto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCentroCosto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCentroCosto() throws Exception {
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
	public void inicializarCombosForeignKeyCentroCostoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.centrocostosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCentroCostoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CentroCostoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCentroCostoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyCentroCostoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CentroCostoParameterReturnGeneral centrocostoReturnGeneral=new CentroCostoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.centrocostoConstantesFunciones.cargarid_empresaCentroCosto)
					 || (this.esRecargarFks && this.centrocostoConstantesFunciones.cargarid_empresaCentroCosto)) {

					if(!this.centrocostoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+centrocostoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCentroCosto="";

				if(((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0) && this.centrocostoConstantesFunciones.cargarid_centro_costoCentroCosto)
					 || (this.esRecargarFks && this.centrocostoConstantesFunciones.cargarid_centro_costoCentroCosto)) {

					if(!this.centrocostoSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCentroCosto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

						finalQueryGlobalCentroCosto=Funciones.GetFinalQueryAppend(finalQueryGlobalCentroCosto, "");
						finalQueryGlobalCentroCosto+=CentroCostoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCentroCosto=" WHERE " + ConstantesSql.ID + "="+centrocostoSessionBean.getlidCentroCostoActual();
					}
				} else {
					finalQueryGlobalCentroCosto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				centrocostoReturnGeneral=centrocostoLogic.cargarCombosLoteForeignKeyCentroCosto(finalQueryGlobalEmpresa,finalQueryGlobalCentroCosto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=centrocostoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCentroCosto.equals("NONE")) {
				this.centrocostosForeignKey=centrocostoReturnGeneral.getcentrocostosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCentroCosto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCentroCosto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.centrocostoSessionBean==null) {
				this.centrocostoSessionBean=new CentroCostoSessionBean();
			}

			if(!this.centrocostoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCentroCosto()throws Exception {
		try {

			if(!this.centrocostoSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
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
	
	public void initActionsCombosTodosForeignKeyCentroCosto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCentroCosto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCentroCosto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCentroCosto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCentroCosto(CentroCosto centrocosto)throws Exception {	
		try {
			
			this.setActualCentroCostoForeignKey(centrocosto.getid_centro_costo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCentroCosto(CentroCosto centrocosto,String sTipoEvento)throws Exception {	
		try {
			
			

				if(centrocosto.getCentroCosto()!=null && !sTipoEvento.equals("id_centro_costoCentroCosto")) { //sTipoEvento Evita Bucle Infinito

					this.centrocostosForeignKey=new ArrayList<CentroCosto>();
					this.centrocostosForeignKey.add(centrocosto.getCentroCosto());

					this.addItemDefectoCombosForeignKeyCentroCosto();
					this.cargarCombosFrameCentroCostosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCentroCosto()throws Exception {	
		try {
			
			this.setActualCentroCostoForeignKey(this.centrocostoConstantesFunciones.getid_centro_costo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCentroCosto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCentroCosto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCentroCosto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCentroCosto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCentroCosto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameCentroCostosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCentroCosto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCentroCosto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_empresaCentroCosto!=null && this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_empresaCentroCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_empresaCentroCosto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_centro_costoCentroCosto!=null && this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_centro_costoCentroCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_centro_costoCentroCosto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public CentroCostoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CentroCostoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CentroCostoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.centrocostoSessionBean=new CentroCostoSessionBean(); 
		this.centrocostoConstantesFunciones=new CentroCostoConstantesFunciones(); 
		this.centrocostoBean=new CentroCosto();//(this.centrocostoConstantesFunciones); 		
		this.centrocostoReturnGeneral=new CentroCostoParameterReturnGeneral(); 
		
		this.centrocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.centrocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CentroCostoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CentroCostoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CentroCostoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCentroCosto(true);
			
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
			
			this.centrocostoConstantesFunciones=new CentroCostoConstantesFunciones(); 
			this.centrocostoBean=new CentroCosto();//this.centrocostoConstantesFunciones); 			
			this.centrocostoReturnGeneral=new CentroCostoParameterReturnGeneral(); 
		
			CentroCostoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Centro Costo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.centrocosto=new CentroCosto();
			this.centrocostos = new ArrayList<CentroCosto>();
			this.centrocostosAux = new ArrayList<CentroCosto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic=new CentroCostoLogic();
				this.centrocostoLogic.getNewConnexionToDeep("");
			}
			
			//this.centrocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.centrocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCentroCosto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCentroCosto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCentroCosto);	
					}
					
					if(this.jInternalFrameImportacionCentroCosto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCentroCosto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCentroCosto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCentroCosto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCentroCosto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCentroCosto);
				this.jInternalFrameDetalleFormCentroCosto.setVisible(false);
				this.jInternalFrameDetalleFormCentroCosto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCentroCosto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCentroCosto);
					this.jInternalFrameReporteDinamicoCentroCosto.setVisible(false);
					this.jInternalFrameReporteDinamicoCentroCosto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCentroCosto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCentroCosto);
					this.jInternalFrameImportacionCentroCosto.setVisible(false);
					this.jInternalFrameImportacionCentroCosto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCentroCosto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCentroCosto);
					this.jInternalFrameOrderByCentroCosto.setVisible(false);
					this.jInternalFrameOrderByCentroCosto.setSelected(false);				
				}
				
			}
			
			this.centrocostosArbol= new ArrayList<CentroCosto>();
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameTreeCentroCosto);    		
			}
			
			this.jDesktopPane.add(this.jInternalFrameTreeCentroCosto);
			this.jInternalFrameTreeCentroCosto.setVisible(false);
	        this.jInternalFrameTreeCentroCosto.setSelected(false);						
			
			if(!esParaBusquedaForeignKey) {
				this.getTodosCentroCostoArbol();
			}			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCentroCostoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CentroCostoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.centrocostoReturnGeneral=new CentroCostoParameterReturnGeneral();
			
			this.centrocostoParameterGeneral=new CentroCostoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.centrocostoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.centrocostoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.centrocostoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CentroCostoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.centrocostoSessionBean.getEsGuardarRelacionado(),this.centrocostoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CentroCostoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.centrocostoSessionBean.getEsGuardarRelacionado(),this.centrocostoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCentroCosto=false;
			this.isVisibilidadCeldaDuplicarCentroCosto=true;
			this.isVisibilidadCeldaCopiarCentroCosto=true;
			this.isVisibilidadCeldaVerFormCentroCosto=true;
			this.isVisibilidadCeldaOrdenCentroCosto=true;
			this.isVisibilidadCeldaNuevoRelacionesCentroCosto=false;
			this.isVisibilidadCeldaModificarCentroCosto=false;
			this.isVisibilidadCeldaActualizarCentroCosto=false;
			this.isVisibilidadCeldaEliminarCentroCosto=false;
			this.isVisibilidadCeldaCancelarCentroCosto=false;
			this.isVisibilidadCeldaGuardarCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCosto=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdCentroCosto=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCentroCosto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCentroCosto(false);
			
			this.setPermisosUsuarioCentroCosto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.centrocostoSessionBean.getEsGuardarRelacionado() 
				|| (this.centrocostoSessionBean.getEsGuardarRelacionado() && this.centrocostoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCentroCostoClasesRelacionadas();
			}
			
			if(this.centrocostoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCentroCostoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CentroCostoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCentroCosto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCentroCosto();
			}
			
			if(!this.isPermisoBusquedaCentroCosto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCentroCosto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.centrocostoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCentroCosto,this.isPermisoPaginacionMedioCentroCosto,this.isPermisoPaginacionTodoCentroCosto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CentroCostoConstantesFunciones.getTiposSeleccionarCentroCosto());
				
				this.tiposColumnasSelect=CentroCostoConstantesFunciones.getTiposSeleccionarCentroCosto(true);
				
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
			//if(!this.centrocostoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCentroCosto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioCentroCosto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioCentroCosto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCentroCosto() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				centrocostoImplementable= (CentroCostoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CentroCostoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				centrocostoImplementableHome= (CentroCostoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CentroCostoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.centrocostos= new ArrayList<CentroCosto>();
			this.centrocostosEliminados= new ArrayList<CentroCosto>();
						
			this.isEsNuevoCentroCosto=false;
			this.esParaAccionDesdeFormularioCentroCosto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCentroCostoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.centrocostosForeignKey=new ArrayList<CentroCosto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCentroCosto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCentroCosto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.centrocostoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CentroCostoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CentroCostoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCentroCosto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCentroCosto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCentroCosto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCentroCosto();
			}
			
			CentroCostoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCentroCosto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCentroCosto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCentroCosto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCentroCosto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CentroCosto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCentroCosto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCentroCosto")) {
				iIndex=this.jInternalFrameDetalleFormCentroCosto.jTabbedPaneRelacionesCentroCosto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCentroCosto.jTabbedPaneRelacionesCentroCosto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCentroCosto();	
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
	
	public void cargarCombosForeignKeyCentroCosto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCentroCosto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCentroCosto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCentroCostoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCentroCosto();
		
		this.cargarCombosFrameForeignKeyCentroCosto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCentroCosto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCentroCosto();
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
	
	public void jButtonNuevoCentroCostoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.centrocostoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
			
			
			if(jTableDatosCentroCosto.getRowCount()>=1) {
				jTableDatosCentroCosto.removeRowSelectionInterval(0, jTableDatosCentroCosto.getRowCount()-1);						
			}
			
			this.isEsNuevoCentroCosto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCentroCosto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCentroCosto(true);			
			//this.centrocosto=new CentroCosto();
			//this.centrocosto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCentroCosto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroCosto() ;
			
			if(CentroCostoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCentroCosto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.centrocosto);	
			this.actualizarInformacion("INFO_PADRE",false,this.centrocosto);				
			
			CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
			
			if(this.centrocostoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CentroCosto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCentroCostoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CentroCosto> centrocostosSeleccionados=new ArrayList<CentroCosto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCentroCosto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCentroCosto.getSelectedRows().length;			
			}
			
			centrocostosSeleccionados=this.getCentroCostosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCentroCosto--;			
				//CentroCosto centrocostoAux= new CentroCosto();			
				//centrocostoAux.setId(this.iIdNuevoCentroCosto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CentroCosto centrocostoOrigen=new CentroCosto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CentroCosto centrocostoOrigen : centrocostosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							centrocostoOrigen =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostoOrigen =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCentroCosto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.centrocosto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCentroCosto(centrocostoOrigen,this.centrocosto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.centrocostoLogic.getCentroCostos().add(this.centrocostoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.centrocostos.add(this.centrocostoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCentroCosto(false);
				
				this.jTableDatosCentroCosto.setRowSelectionInterval(this.getIndiceNuevoCentroCosto(), this.getIndiceNuevoCentroCosto());
				
				int iLastRow =  this.jTableDatosCentroCosto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCentroCosto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCentroCosto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCentroCosto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CentroCosto> centrocostosSeleccionados=new ArrayList<CentroCosto>();									
		
			CentroCosto centrocostoOrigen=new CentroCosto();
			CentroCosto centrocostoDestino=new CentroCosto();
				
			centrocostosSeleccionados=this.getCentroCostosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCentroCosto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || centrocostosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCentroCosto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoOrigen =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						centrocostoOrigen =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoDestino =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						centrocostoDestino =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				centrocostoOrigen =centrocostosSeleccionados.get(0);
				centrocostoDestino =centrocostosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCentroCosto(centrocostoOrigen,centrocostoDestino,true,false);
				
				centrocostoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(centrocostoDestino,centrocostoLogic.getCentroCostos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centrocostoDestino,centrocostos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCentroCosto(false);
				
				//this.jTableDatosCentroCosto.setRowSelectionInterval(this.getIndiceNuevoCentroCosto(), this.getIndiceNuevoCentroCosto());
				
				int iLastRow =  this.jTableDatosCentroCosto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCentroCosto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCentroCosto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCentroCosto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCentroCosto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCentroCosto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCentroCosto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCentroCosto.setVisible(!isVisible);
			this.jPanelPaginacionCentroCosto.setVisible(!isVisible);
			this.jPanelAccionesCentroCosto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCentroCosto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCentroCosto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCentroCosto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCentroCosto();
			
			this.abrirFrameOrderByCentroCosto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCentroCosto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCentroCosto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCentroCosto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCentroCosto.isMaximum()) {
					this.jInternalFrameDetalleFormCentroCosto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCentroCosto.setSize(this.jInternalFrameDetalleFormCentroCosto.iWidthFormulario,this.jInternalFrameDetalleFormCentroCosto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCentroCosto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCentroCosto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCentroCosto.isMaximum()) {
						this.jInternalFrameDetalleFormCentroCosto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCentroCosto.jContentPaneDetalleCentroCosto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCentroCosto.jTabbedPaneRelacionesCentroCosto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCentroCosto.jContentPaneDetalleCentroCosto.getWidth(),CentroCostoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCentroCosto.jTabbedPaneRelacionesCentroCosto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCentroCosto.jContentPaneDetalleCentroCosto.getWidth(),CentroCostoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCentroCosto.jTabbedPaneRelacionesCentroCosto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCentroCosto.jContentPaneDetalleCentroCosto.getWidth(),CentroCostoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCentroCosto.setVisible(true);
	        this.jInternalFrameDetalleFormCentroCosto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCentroCosto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCentroCosto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCentroCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroCosto,false,this);
				} else {
					this.jInternalFrameOrderByCentroCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroCosto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCentroCosto);
				this.jInternalFrameOrderByCentroCosto.setVisible(false);
				this.jInternalFrameOrderByCentroCosto.setSelected(false);
				
				this.jInternalFrameOrderByCentroCosto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCentroCosto"));
				
				this.inicializarActualizarBindingTablaOrderByCentroCosto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCentroCosto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCentroCosto==null) {
				
				this.jInternalFrameImportacionCentroCosto=new ImportacionJInternalFrame(CentroCostoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCentroCosto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCentroCosto);
				this.jInternalFrameImportacionCentroCosto.setVisible(false);
				this.jInternalFrameImportacionCentroCosto.setSelected(false);


				this.jInternalFrameImportacionCentroCosto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCentroCosto"));
				this.jInternalFrameImportacionCentroCosto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCentroCosto"));
				this.jInternalFrameImportacionCentroCosto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCentroCosto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCentroCosto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCentroCosto==null) {
				this.jInternalFrameReporteDinamicoCentroCosto=new ReporteDinamicoJInternalFrame(CentroCostoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCentroCosto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCentroCosto);
				this.jInternalFrameReporteDinamicoCentroCosto.setVisible(false);
				this.jInternalFrameReporteDinamicoCentroCosto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCentroCosto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCentroCosto"));
				this.jInternalFrameReporteDinamicoCentroCosto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCentroCosto"));
				this.jInternalFrameReporteDinamicoCentroCosto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCentroCosto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCentroCosto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleCentroCosto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCentroCosto);
			
	       	this.jInternalFrameDetalleFormCentroCosto.setVisible(false);
	        this.jInternalFrameDetalleFormCentroCosto.setSelected(false);
			
			//this.jInternalFrameDetalleFormCentroCosto.dispose();
			//this.jInternalFrameDetalleFormCentroCosto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCentroCosto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCentroCosto.setVisible(true);
	        this.jInternalFrameReporteDinamicoCentroCosto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCentroCosto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCentroCosto.setVisible(true);
	        this.jInternalFrameImportacionCentroCosto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCentroCosto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCentroCosto.setVisible(true);
	        this.jInternalFrameOrderByCentroCosto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCentroCosto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCentroCosto.setVisible(false);
	        this.jInternalFrameOrderByCentroCosto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCentroCosto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCentroCosto.setVisible(false);
	        this.jInternalFrameReporteDinamicoCentroCosto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCentroCosto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCentroCosto.setVisible(false);
	        this.jInternalFrameImportacionCentroCosto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	 public void abrirFrameTreeCentroCosto(String sTipoProceso) { //throws Exception	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameTreeCentroCosto);
			
			this.jInternalFrameTreeCentroCosto.setsTipoProceso(sTipoProceso);
			
			if(sTipoProceso.equals("BUSQUEDA_FK")) {
				this.jInternalFrameTreeCentroCosto.sTipoBusqueda="CentroCosto";
			}
			
			this.jInternalFrameTreeCentroCosto.setCentroCostos(this.centrocostosArbol);
			this.jInternalFrameTreeCentroCosto.CargarTreeCentroCosto();
			
	       	this.jInternalFrameTreeCentroCosto.setVisible(true);
	        this.jInternalFrameTreeCentroCosto.setSelected(true);
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			e.getStackTrace();
			//FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
	    }
	}
	
	public void cerrarFrameTreeCentroCosto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameTreeCentroCosto);
			
	       	this.jInternalFrameTreeCentroCosto.setVisible(false);
	        this.jInternalFrameTreeCentroCosto.setSelected(false);
			
			//this.jInternalFrameTreeCentroCosto.dispose();
			//this.jInternalFrameTreeCentroCosto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void jButtonModificarCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCentroCosto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCentroCosto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCentroCosto(true);
			//this.isEsNuevoCentroCosto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCentroCosto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCentroCosto(false) ;
			
			if(centrocostoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CentroCostoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCentroCosto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroCosto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCentroCostoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCentroCosto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCentroCosto(true);
			//this.isEsNuevoCentroCosto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.centrocosto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCentroCosto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCentroCosto(false) ;
			
			if(CentroCostoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCentroCosto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroCosto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CentroCosto")) {
				if(!this.centrocostoConstantesFunciones.cargarid_centro_costoCentroCosto) {
					this.cargarCombosCentroCostosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCentroCosto(false,false);
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
		TableColumn tableColumnCentroCosto=this.jTableDatosCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCosto,CentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO));
		TableCellEditor tableCellEditorCentroCosto =tableColumnCentroCosto.getCellEditor();

		CentroCostoTableCell centrocostoTableCellFk=(CentroCostoTableCell)tableCellEditorCentroCosto;

		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.setcentrocostosForeignKey(centrocostosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCentroCosto.getSelectedRow();

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
	
	public void jButtonActualizarCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCentroCosto(false);
			
			//if(!this.isEsNuevoCentroCosto) {								
				int intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCentroCosto(this.centrocosto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
				
			}
			
			if(this.permiteMantenimiento(this.centrocosto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.centrocostoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCentroCosto=true;
					this.inicializarActualizarBindingTablaCentroCosto(false);
					this.isEsNuevoCentroCosto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCentroCosto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCentroCosto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCentroCosto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCentroCosto(false);
				
				this.habilitarDeshabilitarControlesCentroCosto(false);
			
												
				
				if(CentroCostoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCentroCosto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCentroCostoActionPerformed(evt,centrocostoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCentroCosto(this.centrocosto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCentroCosto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,centrocostoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.centrocosto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CentroCosto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCosto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				this.centrocosto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				this.centrocosto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.centrocosto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.centrocostoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CentroCostoModel) this.jTableDatosCentroCosto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCentroCosto=true;
				this.inicializarActualizarBindingTablaCentroCosto(false);
				this.isEsNuevoCentroCosto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCentroCosto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCentroCosto(false);
				
				this.habilitarDeshabilitarControlesCentroCosto(false);
				
				
				
				if(CentroCostoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCentroCosto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCentroCostoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCentroCosto.getRowCount()>=1) {
				jTableDatosCentroCosto.removeRowSelectionInterval(0, jTableDatosCentroCosto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCentroCosto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCentroCosto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCentroCosto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroCosto(false) ;
			
			this.isEsNuevoCentroCosto=false;
			
			if(CentroCostoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCentroCosto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCentroCosto(false);
				
				//SI ES MANUAL
				if(CentroCostoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCentroCosto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCentroCosto--;			
			//CentroCosto centrocostoAux= new CentroCosto();			
			//centrocostoAux.setId(this.iIdNuevoCentroCosto);
			
			if(this.jInternalFrameDetalleFormCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCentroCosto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
			
			this.centrocosto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.centrocostoLogic.getCentroCostos().add(this.centrocostoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.centrocostos.add(this.centrocostoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCentroCosto(false);
			
			this.jTableDatosCentroCosto.setRowSelectionInterval(this.getIndiceNuevoCentroCosto(), this.getIndiceNuevoCentroCosto());
			
			int iLastRow =  this.jTableDatosCentroCosto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCentroCosto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCentroCosto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCentroCosto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCentroCosto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroCosto(false);
			
			//SI ES MANUAL
			if(CentroCostoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCentroCosto();
			}
			
			//this.abrirFrameTreeCentroCosto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Centro CostoS ?", "MANTENIMIENTO DE Centro Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCentroCosto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCentroCosto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.centrocostoReturnGeneral=centrocostoLogic.procesarImportacionCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.centrocostoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCentroCostoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCentroCosto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCentroCosto.setFileImportacion(this.jInternalFrameImportacionCentroCosto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCentroCosto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCentroCosto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCentroCosto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCentroCosto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CentroCosto> centrocostosSeleccionados=new ArrayList<CentroCosto>();		

		centrocostosSeleccionados=this.getCentroCostosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CentroCostoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CentroCostoBaseDesign.jrxml";
			
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
			
			this.generarReporteCentroCostos("Todos",centrocostosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCentroCosto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCosto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CentroCosto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CentroCosto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CentroCosto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CentroCosto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoConstantesFunciones.LABEL_ORDEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_den_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_den_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_den_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_den_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoConstantesFunciones.LABEL_ESFINAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Final_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Final_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Final_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Final_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCentroCosto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CentroCostoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CentroCostoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoria="id_centro_costo";
					break;

				case CentroCostoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case CentroCostoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case CentroCostoConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoria="orden";
					break;

				case CentroCostoConstantesFunciones.LABEL_ESFINAL:
					sNombreCampoCategoria="es_final";
					break;

				case CentroCostoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CentroCostoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CentroCostoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoriaValor="id_centro_costo";
					break;

				case CentroCostoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case CentroCostoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case CentroCostoConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoriaValor="orden";
					break;

				case CentroCostoConstantesFunciones.LABEL_ESFINAL:
					sNombreCampoCategoriaValor="es_final";
					break;

				case CentroCostoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCentroCosto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCosto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CentroCostoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CentroCostoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Centro Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_centro_costo");
					break;

				case CentroCostoConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case CentroCostoConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case CentroCostoConstantesFunciones.LABEL_ORDEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden",sNombreCampoCategoria,sNombreCampoCategoriaValor,"orden");
					break;

				case CentroCostoConstantesFunciones.LABEL_ESFINAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Final",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_final");
					break;

				case CentroCostoConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoCentroCostoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CentroCosto> centrocostosSeleccionados=new ArrayList<CentroCosto>();		
		
		centrocostosSeleccionados=this.getCentroCostosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocosto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CentroCostos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCentroCosto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCosto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CentroCosto centrocosto:centrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocosto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CentroCosto centrocosto:centrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocosto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CentroCosto centrocosto:centrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocosto.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO);
					iRow++;

					for(CentroCosto centrocosto:centrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocosto.getcentrocosto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(CentroCosto centrocosto:centrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocosto.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(CentroCosto centrocosto:centrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocosto.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoConstantesFunciones.LABEL_ORDEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoConstantesFunciones.LABEL_ORDEN);
					iRow++;

					for(CentroCosto centrocosto:centrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocosto.getorden());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoConstantesFunciones.LABEL_ESFINAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoConstantesFunciones.LABEL_ESFINAL);
					iRow++;

					for(CentroCosto centrocosto:centrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocosto.getes_final());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(CentroCosto centrocosto:centrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocosto.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelCentroCosto(row);				
			//	iRow++;
			//}				
			
			//for(CentroCosto centrocostoAux:centrocostosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCentroCosto(centrocostoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	public void jButtonArbolCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.abrirFrameTreeCentroCosto("BUSQUEDA_NORMAL");
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroCosto(false);
			
			//SI ES MANUAL
			if(CentroCostoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCentroCosto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroCosto(false);
			
			//SI ES MANUAL
			if(CentroCostoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCentroCosto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroCosto(false);
			
			//SI ES MANUAL
			if(CentroCostoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCentroCosto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCentroCosto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCentroCosto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCentroCosto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCentroCosto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCentroCosto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCentroCosto.setMinimumSize(dimensionMinimum);
		this.jTableDatosCentroCosto.setMaximumSize(dimensionMaximum);
		this.jTableDatosCentroCosto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCentroCosto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCentroCosto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCentroCosto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCentroCosto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCentroCosto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.centrocostoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCentroCosto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCentroCosto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCentroCosto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CentroCostoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCentroCosto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCentroCosto();
		
		this.inicializarActualizarBindingBotonesManualCentroCosto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.centrocostoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCentroCosto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCentroCosto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCentroCosto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCentroCosto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCentroCosto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCentroCosto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCentroCosto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCentroCosto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCentroCosto.jCheckBoxPostAccionNuevoCentroCosto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCentroCosto.jCheckBoxPostAccionSinCerrarCentroCosto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCentroCosto.jCheckBoxPostAccionSinMensajeCentroCosto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCentroCosto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCentroCosto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCentroCosto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCentroCosto!=null) {
				this.jInternalFrameDetalleFormCentroCosto.jCheckBoxPostAccionNuevoCentroCosto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCentroCosto.jCheckBoxPostAccionSinCerrarCentroCosto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCentroCosto.jCheckBoxPostAccionSinMensajeCentroCosto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCentroCosto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCentroCosto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCentroCosto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCentroCosto.jComboBoxTiposAccionesFormularioCentroCosto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCentroCosto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCentroCosto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCentroCosto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCentroCosto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCentroCosto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCentroCosto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCentroCosto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCentroCosto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCentroCosto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCentroCosto(Boolean esInicializar) throws Exception {
		try	{	
			if(CentroCostoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCentroCosto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCentroCosto() throws Exception {
		try	{
			if(CentroCostoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCentroCosto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCentroCosto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCentroCosto.jComboBoxTiposAccionesFormularioCentroCosto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCentroCosto.jComboBoxTiposAccionesFormularioCentroCosto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCentroCosto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCentroCosto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCentroCosto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCentroCosto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCentroCosto.addItem(reporte);
			}
			
			
			if(!this.centrocostoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCentroCosto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCentroCosto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCentroCosto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCentroCosto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCentroCosto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCentroCosto.jComboBoxTiposAccionesFormularioCentroCosto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCentroCosto.jComboBoxTiposAccionesFormularioCentroCosto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCentroCosto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCentroCosto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCentroCosto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCentroCosto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCentroCosto!=null) {
				this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCentroCosto!=null) {
				this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCentroCosto!=null) {
				
				if(this.jInternalFrameReporteDinamicoCentroCosto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCentroCosto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCentroCosto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCentroCosto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCentroCosto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCentroCosto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CentroCostoConstantesFunciones.getTiposSeleccionarCentroCosto(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CentroCostoConstantesFunciones.getTiposSeleccionarCentroCosto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCentroCosto.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCentroCosto.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CentroCostoConstantesFunciones.getTiposSeleccionarCentroCosto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCentroCosto.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCentroCosto.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCentroCosto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoCentroCosto.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreCentroCosto.getText();
		if(this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto.getSelectedItem()!=null){this.id_centro_costoFK_IdCentroCosto=((CentroCosto)this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCosto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCentroCosto(Boolean esInicializar) throws Exception {				
		if(CentroCostoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCentroCosto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCentroCosto() throws Exception {
		this.inicializarActualizarBindingTablaCentroCosto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCentroCosto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCentroCosto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCentroCosto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCentroCosto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CentroCostoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCentroCosto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCentroCosto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CentroCostoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCentroCostoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CentroCostoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCentroCosto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCentroCosto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CentroCostoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCentroCosto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCentroCosto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=centrocostoLogic.getCentroCostos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=centrocostos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCentroCosto.setModel(new CentroCostoModel(this.centrocostoLogic.getCentroCostos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCentroCosto.setModel(new CentroCostoModel(this.centrocostos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCentroCosto!=null && this.jInternalFrameOrderByCentroCosto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCentroCosto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCosto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CentroCostoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CentroCostoConstantesFunciones.SCLASSWEBTITULO,centrocostoConstantesFunciones.resaltarSeleccionarCentroCosto,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CentroCostoConstantesFunciones.SCLASSWEBTITULO,centrocostoConstantesFunciones.resaltarSeleccionarCentroCosto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCosto,CentroCostoConstantesFunciones.LABEL_ID));

		if(this.centrocostoConstantesFunciones.mostraridCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostoConstantesFunciones.resaltaridCentroCosto,this.centrocostoConstantesFunciones.activaridCentroCosto,iSizeTabla,this,true,"idCentroCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostoConstantesFunciones.resaltaridCentroCosto,this.centrocostoConstantesFunciones.activaridCentroCosto,this,true,"idCentroCosto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCosto,CentroCostoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.centrocostoConstantesFunciones.mostrarid_empresaCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.centrocostoConstantesFunciones.resaltarid_empresaCentroCosto,this,this.centrocostoConstantesFunciones.activarid_empresaCentroCosto,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.centrocostoConstantesFunciones.resaltarid_empresaCentroCosto,this,this.centrocostoConstantesFunciones.activarid_empresaCentroCosto,false,"id_empresaCentroCosto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCosto,CentroCostoConstantesFunciones.LABEL_CODIGO));

		if(this.centrocostoConstantesFunciones.mostrarcodigoCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.centrocostoConstantesFunciones.resaltarcodigoCentroCosto,this.centrocostoConstantesFunciones.activarcodigoCentroCosto,iSizeTabla,this,true,"codigoCentroCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostoConstantesFunciones.resaltarcodigoCentroCosto,this.centrocostoConstantesFunciones.activarcodigoCentroCosto,this,true,"codigoCentroCosto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCosto,CentroCostoConstantesFunciones.LABEL_NOMBRE));

		if(this.centrocostoConstantesFunciones.mostrarnombreCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.centrocostoConstantesFunciones.resaltarnombreCentroCosto,this.centrocostoConstantesFunciones.activarnombreCentroCosto,iSizeTabla,this,true,"nombreCentroCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostoConstantesFunciones.resaltarnombreCentroCosto,this.centrocostoConstantesFunciones.activarnombreCentroCosto,this,true,"nombreCentroCosto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new CentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCosto,CentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO));

		if(this.centrocostoConstantesFunciones.mostrarid_centro_costoCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CentroCostoTableCell(this.centrocostosForeignKey,this.centrocostoConstantesFunciones.resaltarid_centro_costoCentroCosto,this,this.centrocostoConstantesFunciones.activarid_centro_costoCentroCosto,iSizeTabla));
			tableColumn.setCellEditor(new CentroCostoTableCell(this.centrocostosForeignKey,this.centrocostoConstantesFunciones.resaltarid_centro_costoCentroCosto,this,this.centrocostoConstantesFunciones.activarid_centro_costoCentroCosto,true,"id_centro_costoCentroCosto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new CentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCosto,CentroCostoConstantesFunciones.LABEL_PORCENTAJE));

		if(this.centrocostoConstantesFunciones.mostrarporcentajeCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostoConstantesFunciones.resaltarporcentajeCentroCosto,this.centrocostoConstantesFunciones.activarporcentajeCentroCosto,iSizeTabla,this,true,"porcentajeCentroCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostoConstantesFunciones.resaltarporcentajeCentroCosto,this.centrocostoConstantesFunciones.activarporcentajeCentroCosto,this,true,"porcentajeCentroCosto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCosto,CentroCostoConstantesFunciones.LABEL_VALOR));

		if(this.centrocostoConstantesFunciones.mostrarvalorCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostoConstantesFunciones.resaltarvalorCentroCosto,this.centrocostoConstantesFunciones.activarvalorCentroCosto,iSizeTabla,this,true,"valorCentroCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostoConstantesFunciones.resaltarvalorCentroCosto,this.centrocostoConstantesFunciones.activarvalorCentroCosto,this,true,"valorCentroCosto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCosto,CentroCostoConstantesFunciones.LABEL_ORDEN));

		if(this.centrocostoConstantesFunciones.mostrarordenCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoConstantesFunciones.LABEL_ORDEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostoConstantesFunciones.resaltarordenCentroCosto,this.centrocostoConstantesFunciones.activarordenCentroCosto,iSizeTabla,this,true,"ordenCentroCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostoConstantesFunciones.resaltarordenCentroCosto,this.centrocostoConstantesFunciones.activarordenCentroCosto,this,true,"ordenCentroCosto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCosto,CentroCostoConstantesFunciones.LABEL_ESFINAL));

		if(this.centrocostoConstantesFunciones.mostrares_finalCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoConstantesFunciones.LABEL_ESFINAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.centrocostoConstantesFunciones.resaltares_finalCentroCosto,this.centrocostoConstantesFunciones.activares_finalCentroCosto,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.centrocostoConstantesFunciones.resaltares_finalCentroCosto,this.centrocostoConstantesFunciones.activares_finalCentroCosto,this,true,"es_finalCentroCosto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCosto,CentroCostoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.centrocostoConstantesFunciones.mostrardescripcionCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.centrocostoConstantesFunciones.resaltardescripcionCentroCosto,this.centrocostoConstantesFunciones.activardescripcionCentroCosto,iSizeTabla,this,true,"descripcionCentroCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostoConstantesFunciones.resaltardescripcionCentroCosto,this.centrocostoConstantesFunciones.activardescripcionCentroCosto,this,true,"descripcionCentroCosto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.centrocostoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.centrocostoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.centrocostoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCentroCosto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.centrocostoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.centrocostoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCentroCosto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCentroCosto && this.isPermisoGuardarCambiosCentroCosto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.centrocostoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.centrocostoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCentroCosto.addColumn(tableColumn);
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
			
			this.jTableDatosCentroCosto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCentroCosto && this.isPermisoGuardarCambiosCentroCosto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCentroCosto && this.isPermisoGuardarCambiosCentroCosto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCentroCosto.moveColumn(this.jTableDatosCentroCosto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCentroCosto.moveColumn(this.jTableDatosCentroCosto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCentroCosto.moveColumn(this.jTableDatosCentroCosto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCentroCosto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCentroCosto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCentroCosto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCentroCosto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCentroCosto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCentroCosto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCentroCosto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCentroCosto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=centrocostoLogic.getCentroCostos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=centrocostos.size()-1;
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
		//this.jTableDatosCentroCosto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCentroCosto();
			
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
				
				//this.isEsNuevoCentroCosto=false;
					
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
			
				if(this.centrocostoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCentroCosto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCentroCosto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCentroCosto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.centrocosto.getsType().equals("DUPLICADO")
				   || this.centrocosto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCentroCosto=true;
				
				} else {
					this.isEsNuevoCentroCosto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.centrocostoSessionBean.getEsGuardarRelacionado()) {
					if(this.centrocosto.getId()>=0 && !this.centrocosto.getIsNew()) {						
						this.isEsNuevoCentroCosto=false;
						
					} else {
						this.isEsNuevoCentroCosto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCentroCosto(esRelaciones);						
				
				this.seleccionarCentroCosto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.centrocosto.getId()<0) {
					this.isEsNuevoCentroCosto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCentroCosto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCentroCosto(evt,rowIndex);
				}	
				
				if(this.centrocostoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CentroCosto: " + this.dDif); 
					}
				}								
				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCentroCosto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.centrocosto)) {
					if(this.centrocosto.getId()>0) {
						this.centrocosto.setIsDeleted(true);
						
						this.centrocostosEliminados.add(this.centrocosto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.centrocostoLogic.getCentroCostos().remove(this.centrocosto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.centrocostos.remove(this.centrocosto);				
					}
					
					
					((CentroCostoModel) this.jTableDatosCentroCosto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCentroCosto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCentroCosto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCentroCosto) {
			
			if(this.jInternalFrameDetalleFormCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCentroCosto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCentroCosto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCentroCosto(this.centrocosto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.centrocostoConstantesFunciones.cargarid_empresaCentroCosto || this.centrocostoConstantesFunciones.event_dependid_empresaCentroCosto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.centrocosto.getid_empresa());
									//this.inicializarActualizarBindingCentroCosto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(centrocosto.getEmpresa()!=null) {
							this.empresasForeignKey.add(centrocosto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.centrocosto.getid_empresa(),false,"Formulario");

					//CentroCosto
					if(!this.centrocostoConstantesFunciones.cargarid_centro_costoCentroCosto || this.centrocostoConstantesFunciones.event_dependid_centro_costoCentroCosto) {
						//this.cargarCombosCentroCostosForeignKeyLista(" where id="+this.centrocosto.getid_centro_costo());
									//this.inicializarActualizarBindingCentroCosto(false,false);
						this.centrocostosForeignKey=new ArrayList<CentroCosto>();

						if(centrocosto.getCentroCosto()!=null) {
							this.centrocostosForeignKey.add(centrocosto.getCentroCosto());
						}

						this.addItemDefectoCombosForeignKeyCentroCosto();
						this.cargarCombosFrameCentroCostosForeignKey("Todos");
					}
					this.setActualCentroCostoForeignKey(this.centrocosto.getid_centro_costo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCentroCosto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCentroCosto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCentroCosto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCentroCosto(CentroCosto centrocosto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCentroCosto(centrocosto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCentroCosto(CentroCosto centrocosto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCentroCosto(centrocosto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCentroCosto(centrocosto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCentroCosto(centrocosto);
	}
	
	public void setVariablesObjetoActualToFormularioCentroCosto(CentroCosto centrocosto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCentroCosto.jLabelidCentroCosto.setText(centrocosto.getId().toString());
			this.jInternalFrameDetalleFormCentroCosto.jTextFieldcodigoCentroCosto.setText(centrocosto.getcodigo());
			this.jInternalFrameDetalleFormCentroCosto.jTextAreanombreCentroCosto.setText(centrocosto.getnombre());
			this.jInternalFrameDetalleFormCentroCosto.jTextFieldporcentajeCentroCosto.setText(centrocosto.getporcentaje().toString());
			this.jInternalFrameDetalleFormCentroCosto.jTextFieldvalorCentroCosto.setText(centrocosto.getvalor().toString());
			this.jInternalFrameDetalleFormCentroCosto.jTextFieldordenCentroCosto.setText(centrocosto.getorden().toString());
			this.jInternalFrameDetalleFormCentroCosto.jCheckBoxes_finalCentroCosto.setSelected(centrocosto.getes_final());
			this.jInternalFrameDetalleFormCentroCosto.jTextAreadescripcionCentroCosto.setText(centrocosto.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CentroCosto centrocostoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,centrocostoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CentroCosto centrocostoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				centrocostoLocal=this.centrocosto;
			} else {
				centrocostoLocal=this.centrocostoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(centrocostoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCentroCosto(centrocostoLocal,true);
					
					if(centrocostoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(centrocostoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.centrocostoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(centrocostoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCentroCosto(CentroCosto centrocosto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCentroCosto(centrocosto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(centrocosto);
	}
	
	public void setVariablesFormularioToObjetoActualCentroCosto(CentroCosto centrocosto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCentroCosto(centrocosto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCentroCosto(CentroCosto centrocosto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCentroCosto.jLabelidCentroCosto.getText()==null || this.jInternalFrameDetalleFormCentroCosto.jLabelidCentroCosto.getText()=="" || this.jInternalFrameDetalleFormCentroCosto.jLabelidCentroCosto.getText()=="Id") {
				this.jInternalFrameDetalleFormCentroCosto.jLabelidCentroCosto.setText("0");
			}

			if(conColumnasBase) {centrocosto.setId(Long.parseLong(this.jInternalFrameDetalleFormCentroCosto.jLabelidCentroCosto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCosto.jLabelIdCentroCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocosto.setcodigo(this.jInternalFrameDetalleFormCentroCosto.jTextFieldcodigoCentroCosto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCosto.jLabelcodigoCentroCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocosto.setnombre(this.jInternalFrameDetalleFormCentroCosto.jTextAreanombreCentroCosto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCosto.jLabelnombreCentroCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocosto.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormCentroCosto.jTextFieldporcentajeCentroCosto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCosto.jLabelporcentajeCentroCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocosto.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormCentroCosto.jTextFieldvalorCentroCosto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCosto.jLabelvalorCentroCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocosto.setorden(Integer.parseInt(this.jInternalFrameDetalleFormCentroCosto.jTextFieldordenCentroCosto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoConstantesFunciones.LABEL_ORDEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCosto.jLabelordenCentroCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocosto.setes_final(this.jInternalFrameDetalleFormCentroCosto.jCheckBoxes_finalCentroCosto.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoConstantesFunciones.LABEL_ESFINAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCosto.jLabeles_finalCentroCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocosto.setdescripcion(this.jInternalFrameDetalleFormCentroCosto.jTextAreadescripcionCentroCosto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCosto.jLabeldescripcionCentroCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCentroCosto(CentroCosto centrocostoBean,CentroCosto centrocosto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && centrocostoBean.getid_centro_costo()!=null && !centrocostoBean.getid_centro_costo().equals(null))) {centrocosto.setid_centro_costo(centrocostoBean.getid_centro_costo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCentroCosto(CentroCosto centrocostoOrigen,CentroCosto centrocosto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && centrocostoOrigen.getId()!=null && !centrocostoOrigen.getId().equals(0L))) {centrocosto.setId(centrocostoOrigen.getId());}}
			if(conDefault || (!conDefault && centrocostoOrigen.getcodigo()!=null && !centrocostoOrigen.getcodigo().equals(""))) {centrocosto.setcodigo(centrocostoOrigen.getcodigo());}
			if(conDefault || (!conDefault && centrocostoOrigen.getnombre()!=null && !centrocostoOrigen.getnombre().equals(""))) {centrocosto.setnombre(centrocostoOrigen.getnombre());}
			if(conDefault || (!conDefault && centrocostoOrigen.getid_centro_costo()!=null && !centrocostoOrigen.getid_centro_costo().equals(null))) {centrocosto.setid_centro_costo(centrocostoOrigen.getid_centro_costo());}
			if(conDefault || (!conDefault && centrocostoOrigen.getporcentaje()!=null && !centrocostoOrigen.getporcentaje().equals(0.0))) {centrocosto.setporcentaje(centrocostoOrigen.getporcentaje());}
			if(conDefault || (!conDefault && centrocostoOrigen.getvalor()!=null && !centrocostoOrigen.getvalor().equals(0.0))) {centrocosto.setvalor(centrocostoOrigen.getvalor());}
			if(conDefault || (!conDefault && centrocostoOrigen.getorden()!=null && !centrocostoOrigen.getorden().equals(0))) {centrocosto.setorden(centrocostoOrigen.getorden());}
			if(conDefault || (!conDefault && centrocostoOrigen.getes_final()!=null && !centrocostoOrigen.getes_final().equals(false))) {centrocosto.setes_final(centrocostoOrigen.getes_final());}
			if(conDefault || (!conDefault && centrocostoOrigen.getdescripcion()!=null && !centrocostoOrigen.getdescripcion().equals(""))) {centrocosto.setdescripcion(centrocostoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCentroCosto(CentroCosto centrocosto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCentroCosto.jLabelidCentroCosto.setText(centrocosto.getId().toString());
			this.jInternalFrameDetalleFormCentroCosto.jTextFieldcodigoCentroCosto.setText(centrocosto.getcodigo());
			this.jInternalFrameDetalleFormCentroCosto.jTextAreanombreCentroCosto.setText(centrocosto.getnombre());
			this.jInternalFrameDetalleFormCentroCosto.jTextFieldporcentajeCentroCosto.setText(centrocosto.getporcentaje().toString());
			this.jInternalFrameDetalleFormCentroCosto.jTextFieldvalorCentroCosto.setText(centrocosto.getvalor().toString());
			this.jInternalFrameDetalleFormCentroCosto.jTextFieldordenCentroCosto.setText(centrocosto.getorden().toString());
			this.jInternalFrameDetalleFormCentroCosto.jCheckBoxes_finalCentroCosto.setSelected(centrocosto.getes_final());
			this.jInternalFrameDetalleFormCentroCosto.jTextAreadescripcionCentroCosto.setText(centrocosto.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCentroCosto(CentroCostoBean centrocostoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCentroCosto.jLabelidCentroCosto.setText(centrocostoBean.getId().toString());
			this.jInternalFrameDetalleFormCentroCosto.jTextFieldcodigoCentroCosto.setText(centrocostoBean.getcodigo());
			this.jInternalFrameDetalleFormCentroCosto.jTextAreanombreCentroCosto.setText(centrocostoBean.getnombre());
			this.jInternalFrameDetalleFormCentroCosto.jTextFieldporcentajeCentroCosto.setText(centrocostoBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormCentroCosto.jTextFieldvalorCentroCosto.setText(centrocostoBean.getvalor().toString());
			this.jInternalFrameDetalleFormCentroCosto.jTextFieldordenCentroCosto.setText(centrocostoBean.getorden().toString());
			this.jInternalFrameDetalleFormCentroCosto.jCheckBoxes_finalCentroCosto.setSelected(centrocostoBean.getes_final());
			this.jInternalFrameDetalleFormCentroCosto.jTextAreadescripcionCentroCosto.setText(centrocostoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCentroCosto(CentroCostoParameterReturnGeneral centrocostoReturnGeneral,CentroCostoBean centrocostoBean,Boolean conDefault) throws Exception { 
		try {
			CentroCosto centrocostoLocal=new CentroCosto();
			
			centrocostoLocal=centrocostoReturnGeneral.getCentroCosto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && centrocostoLocal.getId()!=null && !centrocostoLocal.getId().equals(0L))) {centrocostoBean.setId(centrocostoLocal.getId());}}
			if(conDefault || (!conDefault && centrocostoLocal.getcodigo()!=null && !centrocostoLocal.getcodigo().equals(""))) {centrocostoBean.setcodigo(centrocostoLocal.getcodigo());}
			if(conDefault || (!conDefault && centrocostoLocal.getnombre()!=null && !centrocostoLocal.getnombre().equals(""))) {centrocostoBean.setnombre(centrocostoLocal.getnombre());}
			if(conDefault || (!conDefault && centrocostoLocal.getid_centro_costo()!=null && !centrocostoLocal.getid_centro_costo().equals(null))) {centrocostoBean.setid_centro_costo(centrocostoLocal.getid_centro_costo());}
			if(conDefault || (!conDefault && centrocostoLocal.getporcentaje()!=null && !centrocostoLocal.getporcentaje().equals(0.0))) {centrocostoBean.setporcentaje(centrocostoLocal.getporcentaje());}
			if(conDefault || (!conDefault && centrocostoLocal.getvalor()!=null && !centrocostoLocal.getvalor().equals(0.0))) {centrocostoBean.setvalor(centrocostoLocal.getvalor());}
			if(conDefault || (!conDefault && centrocostoLocal.getorden()!=null && !centrocostoLocal.getorden().equals(0))) {centrocostoBean.setorden(centrocostoLocal.getorden());}
			if(conDefault || (!conDefault && centrocostoLocal.getes_final()!=null && !centrocostoLocal.getes_final().equals(false))) {centrocostoBean.setes_final(centrocostoLocal.getes_final());}
			if(conDefault || (!conDefault && centrocostoLocal.getdescripcion()!=null && !centrocostoLocal.getdescripcion().equals(""))) {centrocostoBean.setdescripcion(centrocostoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCentroCostoGenerico(Long idCentroCostoSeleccionado,JComboBox jComboBoxCentroCosto,List<CentroCosto> centrocostosLocal)throws Exception {
		try {
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosLocal) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			jComboBoxCentroCosto.setSelectedItem(centrocostoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCentroCostoGenerico(JComboBox jComboBoxCentroCosto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCentroCosto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCentroCosto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCentroCosto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCentroCosto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
				//AUTOREFERENCIADA
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
				
				jComboBoxCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Arbol"));			
				//AUTOREFERENCIADA
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
			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			centrocosto=(CentroCosto) centrocostoLogic.getCentroCostos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			centrocosto =(CentroCosto) centrocostos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!centrocosto.getIsNew() && !centrocosto.getIsChanged() && !centrocosto.getIsDeleted()) {
				sDescripcion=centrocosto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=centrocosto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("CentroCosto")) {
			//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
			if(!centrocosto.getIsNew() && !centrocosto.getIsChanged() && !centrocosto.getIsDeleted()) {
				sDescripcion=centrocosto.getcentrocosto_descripcion();
			} else {
				//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
				sDescripcion=centrocosto.getcentrocosto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CentroCosto centrocostoRow=new CentroCosto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			centrocostoRow=(CentroCosto) centrocostoLogic.getCentroCostos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			centrocostoRow=(CentroCosto) centrocostos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCentroCosto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCentroCosto.setVisible((this.isVisibilidadCeldaNuevoCentroCosto && this.isPermisoNuevoCentroCosto));			
			this.jButtonDuplicarCentroCosto.setVisible((this.isVisibilidadCeldaDuplicarCentroCosto && this.isPermisoDuplicarCentroCosto));			
			this.jButtonCopiarCentroCosto.setVisible((this.isVisibilidadCeldaCopiarCentroCosto && this.isPermisoCopiarCentroCosto));
			this.jButtonVerFormCentroCosto.setVisible((this.isVisibilidadCeldaVerFormCentroCosto && this.isPermisoVerFormCentroCosto));
			
			this.jButtonAbrirOrderByCentroCosto.setVisible((this.isVisibilidadCeldaOrdenCentroCosto && this.isPermisoOrdenCentroCosto));			
			
			this.jButtonNuevoRelacionesCentroCosto.setVisible((this.isVisibilidadCeldaNuevoRelacionesCentroCosto && this.isPermisoNuevoCentroCosto));			
			this.jButtonNuevoGuardarCambiosCentroCosto.setVisible((this.isVisibilidadCeldaNuevoCentroCosto && this.isPermisoNuevoCentroCosto && this.isPermisoGuardarCambiosCentroCosto));
			
			if(this.jInternalFrameDetalleFormCentroCosto!=null) {
			this.jInternalFrameDetalleFormCentroCosto.jButtonModificarCentroCosto.setVisible((this.isVisibilidadCeldaModificarCentroCosto && this.isPermisoActualizarCentroCosto));	
			this.jInternalFrameDetalleFormCentroCosto.jButtonActualizarCentroCosto.setVisible((this.isVisibilidadCeldaActualizarCentroCosto && this.isPermisoActualizarCentroCosto));	
			this.jInternalFrameDetalleFormCentroCosto.jButtonEliminarCentroCosto.setVisible((this.isVisibilidadCeldaEliminarCentroCosto && this.isPermisoEliminarCentroCosto));
			this.jInternalFrameDetalleFormCentroCosto.jButtonCancelarCentroCosto.setVisible(this.isVisibilidadCeldaCancelarCentroCosto);							
			this.jInternalFrameDetalleFormCentroCosto.jButtonGuardarCambiosCentroCosto.setVisible((this.isVisibilidadCeldaGuardarCentroCosto && this.isPermisoGuardarCambiosCentroCosto));			
			
			}
						
			this.jButtonGuardarCambiosTablaCentroCosto.setVisible((this.isVisibilidadCeldaGuardarCambiosCentroCosto && this.isPermisoGuardarCambiosCentroCosto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCentroCosto.setVisible((this.isVisibilidadCeldaNuevoCentroCosto && this.isPermisoNuevoCentroCosto));						
			this.jButtonDuplicarToolBarCentroCosto.setVisible((this.isVisibilidadCeldaDuplicarCentroCosto && this.isPermisoDuplicarCentroCosto));						
			this.jButtonCopiarToolBarCentroCosto.setVisible((this.isVisibilidadCeldaCopiarCentroCosto && this.isPermisoCopiarCentroCosto));			
			this.jButtonVerFormToolBarCentroCosto.setVisible((this.isVisibilidadCeldaVerFormCentroCosto && this.isPermisoVerFormCentroCosto));			
			this.jButtonAbrirOrderByToolBarCentroCosto.setVisible((this.isVisibilidadCeldaOrdenCentroCosto && this.isPermisoOrdenCentroCosto));
			this.jButtonNuevoRelacionesToolBarCentroCosto.setVisible((this.isVisibilidadCeldaNuevoRelacionesCentroCosto && this.isPermisoNuevoCentroCosto));			
			this.jButtonNuevoGuardarCambiosToolBarCentroCosto.setVisible((this.isVisibilidadCeldaNuevoCentroCosto && this.isPermisoNuevoCentroCosto && this.isPermisoGuardarCambiosCentroCosto));			
			
			if(this.jInternalFrameDetalleFormCentroCosto!=null) {
			this.jInternalFrameDetalleFormCentroCosto.jButtonModificarToolBarCentroCosto.setVisible((this.isVisibilidadCeldaModificarCentroCosto && this.isPermisoActualizarCentroCosto));	
			this.jInternalFrameDetalleFormCentroCosto.jButtonActualizarToolBarCentroCosto.setVisible((this.isVisibilidadCeldaActualizarCentroCosto  && this.isPermisoActualizarCentroCosto));	
			this.jInternalFrameDetalleFormCentroCosto.jButtonEliminarToolBarCentroCosto.setVisible((this.isVisibilidadCeldaEliminarCentroCosto && this.isPermisoEliminarCentroCosto));
			this.jInternalFrameDetalleFormCentroCosto.jButtonCancelarToolBarCentroCosto.setVisible(this.isVisibilidadCeldaCancelarCentroCosto);				
			this.jInternalFrameDetalleFormCentroCosto.jButtonGuardarCambiosToolBarCentroCosto.setVisible((this.isVisibilidadCeldaGuardarCentroCosto && this.isPermisoGuardarCambiosCentroCosto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCentroCosto.setVisible((this.isVisibilidadCeldaGuardarCambiosCentroCosto && this.isPermisoGuardarCambiosCentroCosto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCentroCosto.setVisible((this.isVisibilidadCeldaNuevoCentroCosto && this.isPermisoNuevoCentroCosto));			
			this.jMenuItemDuplicarCentroCosto.setVisible((this.isVisibilidadCeldaDuplicarCentroCosto && this.isPermisoDuplicarCentroCosto));			
			this.jMenuItemCopiarCentroCosto.setVisible((this.isVisibilidadCeldaCopiarCentroCosto && this.isPermisoCopiarCentroCosto));			
			this.jMenuItemVerFormCentroCosto.setVisible((this.isVisibilidadCeldaVerFormCentroCosto && this.isPermisoVerFormCentroCosto));			
			this.jMenuItemAbrirOrderByCentroCosto.setVisible((this.isVisibilidadCeldaOrdenCentroCosto && this.isPermisoOrdenCentroCosto));			
			//this.jMenuItemMostrarOcultarCentroCosto.setVisible((this.isVisibilidadCeldaOrdenCentroCosto && this.isPermisoOrdenCentroCosto));
			this.jMenuItemDetalleAbrirOrderByCentroCosto.setVisible((this.isVisibilidadCeldaOrdenCentroCosto && this.isPermisoOrdenCentroCosto));			
			//this.jMenuItemDetalleMostrarOcultarCentroCosto.setVisible((this.isVisibilidadCeldaOrdenCentroCosto && this.isPermisoOrdenCentroCosto));			
			this.jMenuItemNuevoRelacionesCentroCosto.setVisible((this.isVisibilidadCeldaNuevoRelacionesCentroCosto && this.isPermisoNuevoCentroCosto));			
			this.jMenuItemNuevoGuardarCambiosCentroCosto.setVisible((this.isVisibilidadCeldaNuevoCentroCosto && this.isPermisoNuevoCentroCosto && this.isPermisoGuardarCambiosCentroCosto));									
			
			if(this.jInternalFrameDetalleFormCentroCosto!=null) {
			this.jInternalFrameDetalleFormCentroCosto.jMenuItemModificarCentroCosto.setVisible((this.isVisibilidadCeldaModificarCentroCosto && this.isPermisoActualizarCentroCosto));	
			this.jInternalFrameDetalleFormCentroCosto.jMenuItemActualizarCentroCosto.setVisible((this.isVisibilidadCeldaActualizarCentroCosto && this.isPermisoActualizarCentroCosto));	
			this.jInternalFrameDetalleFormCentroCosto.jMenuItemEliminarCentroCosto.setVisible((this.isVisibilidadCeldaEliminarCentroCosto && this.isPermisoEliminarCentroCosto));
			this.jInternalFrameDetalleFormCentroCosto.jMenuItemCancelarCentroCosto.setVisible(this.isVisibilidadCeldaCancelarCentroCosto);				
			}
			
			this.jMenuItemGuardarCambiosCentroCosto.setVisible((this.isVisibilidadCeldaGuardarCentroCosto && this.isPermisoGuardarCambiosCentroCosto));						
			this.jMenuItemGuardarCambiosTablaCentroCosto.setVisible((this.isVisibilidadCeldaGuardarCambiosCentroCosto && this.isPermisoGuardarCambiosCentroCosto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCentroCosto=this.jButtonNuevoCentroCosto.isVisible();
			this.isVisibilidadCeldaDuplicarCentroCosto=this.jButtonDuplicarCentroCosto.isVisible();
			this.isVisibilidadCeldaCopiarCentroCosto=this.jButtonCopiarCentroCosto.isVisible();
			this.isVisibilidadCeldaVerFormCentroCosto=this.jButtonVerFormCentroCosto.isVisible();
			
			this.isVisibilidadCeldaOrdenCentroCosto=this.jButtonAbrirOrderByCentroCosto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCentroCosto=this.jButtonNuevoRelacionesCentroCosto.isVisible();
			this.isVisibilidadCeldaModificarCentroCosto=this.jButtonModificarCentroCosto.isVisible();
			
			if(this.jInternalFrameDetalleFormCentroCosto!=null) {
			this.isVisibilidadCeldaActualizarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jButtonActualizarCentroCosto.isVisible();
			this.isVisibilidadCeldaEliminarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jButtonEliminarCentroCosto.isVisible();
			this.isVisibilidadCeldaCancelarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jButtonCancelarCentroCosto.isVisible();
			this.isVisibilidadCeldaGuardarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jButtonGuardarCambiosCentroCosto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCentroCosto=this.jButtonGuardarCambiosTablaCentroCosto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCentroCosto=this.jButtonNuevoToolBarCentroCosto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCentroCosto=this.jButtonNuevoRelacionesToolBarCentroCosto.isVisible();
			
			if(this.jInternalFrameDetalleFormCentroCosto!=null) {
			this.isVisibilidadCeldaModificarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jButtonModificarToolBarCentroCosto.isVisible();
			this.isVisibilidadCeldaActualizarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jButtonActualizarToolBarCentroCosto.isVisible();
			this.isVisibilidadCeldaEliminarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jButtonEliminarToolBarCentroCosto.isVisible();
			this.isVisibilidadCeldaCancelarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jButtonCancelarToolBarCentroCosto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCentroCosto=this.jButtonGuardarCambiosToolBarCentroCosto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCentroCosto=this.jButtonGuardarCambiosTablaToolBarCentroCosto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCentroCosto=this.jMenuItemNuevoCentroCosto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCentroCosto=this.jMenuItemNuevoRelacionesCentroCosto.isVisible();
			
			if(this.jInternalFrameDetalleFormCentroCosto!=null) {
			this.isVisibilidadCeldaModificarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jMenuItemModificarCentroCosto.isVisible();
			this.isVisibilidadCeldaActualizarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jMenuItemActualizarCentroCosto.isVisible();
			this.isVisibilidadCeldaEliminarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jMenuItemEliminarCentroCosto.isVisible();
			this.isVisibilidadCeldaCancelarCentroCosto=this.jInternalFrameDetalleFormCentroCosto.jMenuItemCancelarCentroCosto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCentroCosto=this.jMenuItemGuardarCambiosCentroCosto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCentroCosto=this.jMenuItemGuardarCambiosTablaCentroCosto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCentroCosto(Boolean esInicializar) {
		if(CentroCostoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.centrocostoSessionBean.getConGuardarRelaciones()) {
				//if(this.centrocostoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCentroCosto();
			}
			
			this.inicializarActualizarBindingBotonesManualCentroCosto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCentroCosto() {
		this.jButtonNuevoCentroCosto.setVisible(this.isPermisoNuevoCentroCosto);			
		this.jButtonDuplicarCentroCosto.setVisible(this.isPermisoDuplicarCentroCosto);			
		this.jButtonCopiarCentroCosto.setVisible(this.isPermisoCopiarCentroCosto);			
		this.jButtonVerFormCentroCosto.setVisible(this.isPermisoVerFormCentroCosto);			
		
		this.jButtonAbrirOrderByCentroCosto.setVisible(this.isPermisoOrdenCentroCosto);					
		
		this.jButtonNuevoRelacionesCentroCosto.setVisible(this.isPermisoNuevoCentroCosto);			
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCosto.jButtonModificarCentroCosto.setVisible(this.isPermisoActualizarCentroCosto);	
			this.jInternalFrameDetalleFormCentroCosto.jButtonActualizarCentroCosto.setVisible(this.isPermisoActualizarCentroCosto);	
			this.jInternalFrameDetalleFormCentroCosto.jButtonEliminarCentroCosto.setVisible(this.isPermisoEliminarCentroCosto);
			this.jInternalFrameDetalleFormCentroCosto.jButtonCancelarCentroCosto.setVisible(this.isVisibilidadCeldaCancelarCentroCosto);						
			this.jInternalFrameDetalleFormCentroCosto.jButtonGuardarCambiosCentroCosto.setVisible(this.isPermisoGuardarCambiosCentroCosto);							
		}
		
		this.jButtonGuardarCambiosTablaCentroCosto.setVisible(this.isPermisoActualizarCentroCosto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCentroCosto() {
		this.jInternalFrameDetalleFormCentroCosto.jButtonModificarCentroCosto.setVisible(this.isPermisoActualizarCentroCosto);	
		this.jInternalFrameDetalleFormCentroCosto.jButtonActualizarCentroCosto.setVisible(this.isPermisoActualizarCentroCosto);	
		this.jInternalFrameDetalleFormCentroCosto.jButtonEliminarCentroCosto.setVisible(this.isPermisoEliminarCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jButtonCancelarCentroCosto.setVisible(this.isVisibilidadCeldaCancelarCentroCosto);							
		this.jInternalFrameDetalleFormCentroCosto.jButtonGuardarCambiosCentroCosto.setVisible((this.isVisibilidadCeldaGuardarCentroCosto && this.isPermisoGuardarCambiosCentroCosto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCentroCosto() {
		if(CentroCostoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCentroCosto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCentroCosto() {
	}
	
	public void jTableDatosCentroCostoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCentroCosto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCosto(this.getcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocosto==null) {
						this.centrocosto = new CentroCosto();
					}

					this.setVariablesFormularioToObjetoActualCentroCosto(this.centrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
				}

				if(this.centrocosto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.centrocosto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCentroCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCentroCosto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCentroCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCentroCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCentroCosto(this.getcentrocosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.centrocostoLogic.getConnexion());

				if(this.centrocosto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.centrocosto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCentroCosto=(TitledBorder)this.jScrollPanelDatosCentroCosto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCentroCosto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCosto(this.getcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocosto==null) {
						this.centrocosto = new CentroCosto();
					}

					this.setVariablesFormularioToObjetoActualCentroCosto(this.centrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
				}

				if(this.centrocosto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.centrocosto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCosto(this.getcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocosto==null) {
						this.centrocosto = new CentroCosto();
					}

					this.setVariablesFormularioToObjetoActualCentroCosto(this.centrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
				}

				if(this.centrocosto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.centrocosto.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCosto(this.getcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocosto==null) {
						this.centrocosto = new CentroCosto();
					}

					this.setVariablesFormularioToObjetoActualCentroCosto(this.centrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
				}

				if(this.centrocosto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.centrocosto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_centro_costoCentroCostoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderCentroCosto=null;
			TitledBorder titledBordercentrocosto=null;

			if(!this.jScrollPanelDatosCentroCosto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCentroCosto=(TitledBorder)this.jScrollPanelDatosCentroCosto.getBorder();
				titledBordercentrocosto=(TitledBorder)this.centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

				titledBordercentrocosto.setTitle(titledBorderCentroCosto.getTitle() + " -> Centro Costo");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_centro_costoCentroCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocentrocosto=true;

			idTienePermisocentrocosto=this.tienePermisosUsuarioEnPaginaWebCentroCosto(CentroCostoConstantesFunciones.CLASSNAME);

			if(idTienePermisocentrocosto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCentroCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCentroCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCentroCosto(this.getcentrocosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);

				this.centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.centrocostoBeanSwingJInternalFrame.getCentroCostoLogic().setConnexion(this.centrocostoLogic.getConnexion());

				if(this.centrocosto.getid_centro_costo()!=null) {
					this.centrocostoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.centrocostoBeanSwingJInternalFrame.setIdActual(this.centrocosto.getid_centro_costo());
					this.centrocostoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroCosto();
				}

				JInternalFrameBase jinternalFrame =this.centrocostoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCentroCosto=(TitledBorder)this.jScrollPanelDatosCentroCosto.getBorder();
				TitledBorder titledBordercentrocosto=(TitledBorder)this.centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

				titledBordercentrocosto.setTitle(titledBorderCentroCosto.getTitle() + " -> Centro Costo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_centro_costoCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCosto(this.getcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocosto==null) {
						this.centrocosto = new CentroCosto();
					}

					this.setVariablesFormularioToObjetoActualCentroCosto(this.centrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
				}

				if(this.centrocosto.getid_centro_costo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_centro_costo = "+this.centrocosto.getid_centro_costo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCosto(this.getcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocosto==null) {
						this.centrocosto = new CentroCosto();
					}

					this.setVariablesFormularioToObjetoActualCentroCosto(this.centrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
				}

				if(this.centrocosto.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.centrocosto.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCosto(this.getcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocosto==null) {
						this.centrocosto = new CentroCosto();
					}

					this.setVariablesFormularioToObjetoActualCentroCosto(this.centrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
				}

				if(this.centrocosto.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.centrocosto.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonordenCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCosto(this.getcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocosto==null) {
						this.centrocosto = new CentroCosto();
					}

					this.setVariablesFormularioToObjetoActualCentroCosto(this.centrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
				}

				if(this.centrocosto.getorden()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where orden = "+this.centrocosto.getorden().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_finalCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCosto(this.getcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocosto==null) {
						this.centrocosto = new CentroCosto();
					}

					this.setVariablesFormularioToObjetoActualCentroCosto(this.centrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
				}

				if(this.centrocosto.getes_final()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_final = "+this.centrocosto.getes_final().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCosto(this.getcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocosto==null) {
						this.centrocosto = new CentroCosto();
					}

					this.setVariablesFormularioToObjetoActualCentroCosto(this.centrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);
				}

				if(this.centrocosto.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.centrocosto.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoCentroCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCosto(false,false);

			this.getCentroCostosBusquedaPorCodigo();

			this.inicializarActualizarBindingCentroCosto(false);

			//if(CentroCostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreCentroCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCosto(false,false);

			this.getCentroCostosBusquedaPorNombre();

			this.inicializarActualizarBindingCentroCosto(false);

			//if(CentroCostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCentroCostoCentroCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCosto(false,false);

			this.getCentroCostosFK_IdCentroCosto();

			this.inicializarActualizarBindingCentroCosto(false);

			//if(CentroCostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCentroCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCosto(false,false);

			this.getCentroCostosFK_IdEmpresa();

			this.inicializarActualizarBindingCentroCosto(false);

			//if(CentroCostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCentroCosto() {
		if(this.jInternalFrameDetalleFormCentroCosto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) {
			this.jInternalFrameDetalleFormCentroCosto.setVisible(false);	    			
			this.jInternalFrameDetalleFormCentroCosto.dispose();
			this.jInternalFrameDetalleFormCentroCosto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCentroCosto!=null) {
			this.jInternalFrameReporteDinamicoCentroCosto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCentroCosto.dispose();
			this.jInternalFrameReporteDinamicoCentroCosto=null;
		}
		
		if(this.jInternalFrameImportacionCentroCosto!=null) {
			this.jInternalFrameImportacionCentroCosto.setVisible(false);	    			
			this.jInternalFrameImportacionCentroCosto.dispose();
			this.jInternalFrameImportacionCentroCosto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	public void closingTreeFrameCentroCosto() {
		
		if(this.jInternalFrameTreeCentroCosto!=null) {
			this.jInternalFrameTreeCentroCosto.setVisible(false);	    			
			this.jInternalFrameTreeCentroCosto.dispose();
			this.jInternalFrameTreeCentroCosto=null;
		}
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCentroCosto();
			
			CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
			
			
			if(sTipo.equals("NuevoCentroCosto")) {
				jButtonNuevoCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCentroCosto")) {
				jButtonDuplicarCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCentroCosto")) {
				jButtonCopiarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("VerFormCentroCosto")) {
				jButtonVerFormCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCentroCosto")) {
				jButtonNuevoCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCentroCosto")) {
				jButtonDuplicarCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCentroCosto")) {
				jButtonNuevoCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCentroCosto")) {
				jButtonDuplicarCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCentroCosto")) {
				jButtonNuevoCentroCostoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCentroCosto")) {
				jButtonNuevoCentroCostoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCentroCosto")) {
				jButtonNuevoCentroCostoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCentroCosto")) {
				jButtonModificarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCentroCosto")) {
				jButtonModificarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCentroCosto")) {
				jButtonModificarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCentroCosto")) {
				jButtonActualizarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCentroCosto")) {
				jButtonActualizarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCentroCosto")) {
				jButtonActualizarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("EliminarCentroCosto")) {
				jButtonEliminarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCentroCosto")) {
				jButtonEliminarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCentroCosto")) {
				jButtonEliminarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CancelarCentroCosto")) {
				jButtonCancelarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCentroCosto")) {
				jButtonCancelarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCentroCosto")) {
				jButtonCancelarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CerrarCentroCosto")) {
				jButtonCerrarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCentroCosto")) {
				jButtonCerrarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCentroCosto")) {
				jButtonCerrarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCentroCosto")) {
				jButtonMostrarOcultarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCentroCosto")) {
				jButtonCancelarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCentroCosto")) {
				jButtonGuardarCambiosCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCentroCosto")) {
				jButtonGuardarCambiosCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCentroCosto")) {
				jButtonCopiarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCentroCosto")) {
				jButtonVerFormCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCentroCosto")) {
				jButtonGuardarCambiosCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCentroCosto")) {
				jButtonCopiarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCentroCosto")) {
				jButtonVerFormCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCentroCosto")) {
				jButtonGuardarCambiosCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCentroCosto")) {
				jButtonGuardarCambiosCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCentroCosto")) {
				jButtonGuardarCambiosCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCentroCosto")) {
				jButtonRecargarInformacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCentroCosto")) {
				jButtonRecargarInformacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCentroCosto")) {
				jButtonRecargarInformacionCentroCostoActionPerformed(evt);
			}
			else if(sTipo.equals("ArbolCentroCosto")) {
				jButtonArbolCentroCostoActionPerformed(evt);
			} 
			else if(sTipo.equals("AnterioresCentroCosto")) {
				jButtonAnterioresCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCentroCosto")) {
				jButtonAnterioresCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCentroCosto")) {
				jButtonAnterioresCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCentroCosto")) {
				jButtonSiguientesCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCentroCosto")) {
				jButtonSiguientesCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCentroCosto")) {
				jButtonSiguientesCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCentroCosto") || sTipo.equals("MenuItemDetalleAbrirOrderByCentroCosto")) {
				jButtonAbrirOrderByCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCentroCosto") || sTipo.equals("MenuItemDetalleMostrarOcultarCentroCosto")) {
				jButtonMostrarOcultarCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCentroCosto")) {
				jButtonNuevoGuardarCambiosCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCentroCosto")) {
				jButtonNuevoGuardarCambiosCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCentroCosto")) {
				jButtonNuevoGuardarCambiosCentroCostoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCentroCosto")) {
				jButtonCerrarReporteDinamicoCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCentroCosto")) {
				jButtonGenerarReporteDinamicoCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCentroCosto")) {
				
				jButtonGenerarExcelReporteDinamicoCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCentroCosto")) {
				jButtonCerrarImportacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCentroCosto")) {
				
				jButtonGenerarImportacionCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCentroCosto")) {
				
				jButtonAbrirImportacionCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCentroCosto")) {
				jComboBoxTiposAccionesCentroCostoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCentroCosto")) {
				jComboBoxTiposRelacionesCentroCostoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCentroCosto")) {
				jComboBoxTiposAccionesCentroCostoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCentroCosto")) {
				
				jComboBoxTiposSeleccionarCentroCostoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCentroCosto")) {
				jTextFieldValorCampoGeneralCentroCostoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCentroCosto")) {
				jButtonAbrirOrderByCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCentroCosto")) {
				jButtonAbrirOrderByCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCentroCosto")) {
				jButtonCerrarOrderByCentroCostoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCentroCostoBusqueda")) {
				this.jButtonidCentroCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCentroCostoUpdate")) {
				this.jButtonid_empresaCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCentroCostoBusqueda")) {
				this.jButtonid_empresaCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCentroCostoBusqueda")) {
				this.jButtoncodigoCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCentroCostoBusqueda")) {
				this.jButtonnombreCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_centro_costoCentroCosto")) {
				this.jButtonid_centro_costoCentroCostoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoArbol")) {
				this.abrirFrameTreeCentroCosto("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoUpdate")) {
				this.jButtonid_centro_costoCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoBusqueda")) {
				this.jButtonid_centro_costoCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeCentroCostoBusqueda")) {
				this.jButtonporcentajeCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorCentroCostoBusqueda")) {
				this.jButtonvalorCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenCentroCostoBusqueda")) {
				this.jButtonordenCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_finalCentroCostoBusqueda")) {
				this.jButtones_finalCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCentroCostoBusqueda")) {
				this.jButtondescripcionCentroCostoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_centro_costoCentroCosto")) {
				this.jButtonid_centro_costoCentroCostoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("BusquedaPorCodigoCentroCosto")) {
				this.jButtonBusquedaPorCodigoCentroCostoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreCentroCosto")) {
				this.jButtonBusquedaPorNombreCentroCostoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCentroCostoCentroCosto")) {
				this.jButtonFK_IdCentroCostoCentroCostoActionPerformed(evt);
			}
			
			;
			
			
			CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCentroCosto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocosto);
				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
				
				


				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CentroCosto centrocostoLocal=null;
			
			if(!this.getEsControlTabla()) {
				centrocostoLocal=this.centrocosto;
			} else {
				centrocostoLocal=this.centrocostoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocosto);
				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
							
				
				


				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoAnterior =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostoAnterior =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
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
			
			CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
			
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
			
			


			
			CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocosto);
				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
								
						
				


				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCosto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocosto);
				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
								
				
				


				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoAnterior =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostoAnterior =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocosto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoAnterior =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostoAnterior =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocosto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.centrocosto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocosto);
				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
							
				
				


				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCosto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostoAnterior =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.centrocostoAnterior =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
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
			
			CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
			
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
			
			


			
			CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocosto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.centrocosto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocosto);
				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
								
				
				


				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoAnterior =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostoAnterior =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocosto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.centrocosto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocosto);
				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCentroCosto")) {
					jCheckBoxSeleccionarTodosCentroCostoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCentroCosto")) {
					jCheckBoxSeleccionadosCentroCostoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCentroCosto")) {
					
				}
				
				


				
				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocosto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.centrocosto);
				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
												
				
				


				
				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostoAnterior =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.centrocostoAnterior =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocosto);
				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
				
				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
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
			
			CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
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
			
			


			
			CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocosto);
				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCosto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCosto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocosto);
				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
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
				
				


				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCosto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoAnterior =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostoAnterior =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCentroCosto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCentroCostoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCentroCosto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.centrocosto =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.centrocosto =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.centrocosto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCentroCosto")) {
				
				}
				
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCentroCosto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCentroCosto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCentroCosto")) {
			
			}
			
			CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCentroCosto();
			
			CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
			
			if(sTipo.equals("NuevoCentroCosto")) {
				jButtonNuevoCentroCostoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCentroCosto")) {
				jButtonDuplicarCentroCostoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCentroCosto")) {
				jButtonCopiarCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCentroCosto")) {
				jButtonVerFormCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCentroCosto")) {
				jButtonNuevoCentroCostoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCentroCosto")) {
				jButtonModificarCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCentroCosto")) {
				jButtonActualizarCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCentroCosto")) {
				jButtonEliminarCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCentroCosto")) {
				jButtonGuardarCambiosCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCentroCosto")) {
				jButtonCancelarCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCentroCosto")) {
				jButtonCerrarCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCentroCosto")) {
				jButtonGuardarCambiosCentroCostoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCentroCosto")) {
				jButtonNuevoGuardarCambiosCentroCostoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCentroCosto")) {
				jButtonAbrirOrderByCentroCostoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCentroCosto")) {
				jButtonRecargarInformacionCentroCostoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCentroCosto")) {
				jButtonAnterioresCentroCostoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCentroCosto")) {
				jButtonSiguientesCentroCostoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCentroCostoBusqueda")) {
				this.jButtonidCentroCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCentroCostoUpdate")) {
				this.jButtonid_empresaCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCentroCostoBusqueda")) {
				this.jButtonid_empresaCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCentroCostoBusqueda")) {
				this.jButtoncodigoCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCentroCostoBusqueda")) {
				this.jButtonnombreCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_centro_costoCentroCosto")) {
				this.jButtonid_centro_costoCentroCostoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoArbol")) {
				this.abrirFrameTreeCentroCosto("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoUpdate")) {
				this.jButtonid_centro_costoCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoBusqueda")) {
				this.jButtonid_centro_costoCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeCentroCostoBusqueda")) {
				this.jButtonporcentajeCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorCentroCostoBusqueda")) {
				this.jButtonvalorCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenCentroCostoBusqueda")) {
				this.jButtonordenCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_finalCentroCostoBusqueda")) {
				this.jButtones_finalCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCentroCostoBusqueda")) {
				this.jButtondescripcionCentroCostoBusquedaActionPerformed(evt);
			}
			
			CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCentroCosto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCentroCosto")) {
				closingInternalFrameCentroCosto();
				
			} else if(sTipo.equals("jButtonCancelarCentroCosto")) {
				JInternalFrameBase jInternalFrameDetalleFormCentroCosto = (JInternalFrameBase)evt.getSource();
	            	
	            CentroCostoBeanSwingJInternalFrame jInternalFrameParent=(CentroCostoBeanSwingJInternalFrame)jInternalFrameDetalleFormCentroCosto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCentroCostoActionPerformed(null);
			}
			
			CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.centrocosto,new Object(),this.centrocostoParameterGeneral,this.centrocostoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCentroCosto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCentroCosto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCentroCosto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.centrocosto)) {
			if(!esControlTabla) {
				if(CentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCentroCosto(this.centrocosto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);			
				}
				
				if(this.centrocostoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCentroCosto(this.centrocosto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.centrocostoReturnGeneral=centrocostoLogic.procesarEventosCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centrocostoLogic.getCentroCostos(),this.centrocosto,this.centrocostoParameterGeneral,this.isEsNuevoCentroCosto,classes);//this.centrocostoLogic.getCentroCosto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCentroCosto(this.centrocostoReturnGeneral,this.centrocostoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.centrocostoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCentroCosto(classes,this.centrocostoReturnGeneral,this.centrocostoBean,false);
					}
						
					if(this.centrocostoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCentroCosto(this.centrocostoReturnGeneral.getCentroCosto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCentroCosto(this.centrocostoReturnGeneral.getCentroCosto());	
					}
						
					if(this.centrocostoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCentroCosto(this.centrocostoReturnGeneral.getCentroCosto(),classes);//this.centrocostoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCentroCosto(this.centrocosto,classes);//this.centrocostoBean);									
				}
			
				if(CentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCentroCosto(this.centrocosto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCosto(this.centrocosto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.centrocostoAnterior!=null) {
						this.centrocosto=this.centrocostoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.centrocostoReturnGeneral=centrocostoLogic.procesarEventosCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centrocostoLogic.getCentroCostos(),this.centrocosto,this.centrocostoParameterGeneral,this.isEsNuevoCentroCosto,classes);//this.centrocostoLogic.getCentroCosto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.centrocostoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.centrocostoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.centrocostoReturnGeneral.getCentroCosto(),centrocostoLogic.getCentroCostos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.centrocostoReturnGeneral.getCentroCosto(),this.centrocostos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCentroCosto.repaint();
				
				//((AbstractTableModel) this.jTableDatosCentroCosto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCentroCosto();
			}
		}
	}
	
	public void actualizarVisualTableDatosCentroCosto() throws Exception {
		
		CentroCostoModel centrocostoModel=(CentroCostoModel)this.jTableDatosCentroCosto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			centrocostoModel.centrocostos=this.centrocostoLogic.getCentroCostos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			centrocostoModel.centrocostos=this.centrocostos;
		}
		
		
		((CentroCostoModel) this.jTableDatosCentroCosto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCentroCosto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcentrocostoAnterior(),this.centrocostoLogic.getCentroCostos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcentrocostoAnterior(),this.centrocostos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCentroCosto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCentroCosto(CentroCosto centrocosto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
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
										
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centrocosto,new Object(),generalEntityParameterGeneral,this.centrocostoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.centrocostoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CentroCostoConstantesFunciones.getClassesRelationshipsOfCentroCosto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CentroCostoConstantesFunciones.getClassesRelationshipsFromStringsOfCentroCosto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCentroCosto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centrocosto,new Object(),generalEntityParameterGeneral,this.centrocostoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCentroCosto(CentroCostoBean centrocostoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCentroCosto(ArrayList<Classe> classes,CentroCostoReturnGeneral centrocostoReturnGeneral,CentroCostoBean centrocostoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCentroCosto(CentroCosto centrocosto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.centrocosto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCentroCosto = new CentroCostoDetalleFormJInternalFrame(jDesktopPane,this.centrocostoSessionBean.getConGuardarRelaciones(),this.centrocostoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.setVisible(false);
		this.jInternalFrameDetalleFormCentroCosto.setSelected(false);						
		
		this.jInternalFrameDetalleFormCentroCosto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCentroCosto.centrocostoLogic=this.centrocostoLogic;
		
		this.cargarCombosFrameForeignKeyCentroCosto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCentroCosto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCentroCosto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCentroCosto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCentroCosto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCentroCosto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCentroCosto"));
		
		this.jInternalFrameDetalleFormCentroCosto.jButtonModificarCentroCosto.addActionListener(new ButtonActionListener(this,"ModificarCentroCosto"));

		
		this.jInternalFrameDetalleFormCentroCosto.jButtonModificarToolBarCentroCosto.addActionListener(new ButtonActionListener(this,"ModificarToolBarCentroCosto"));
					
		this.jInternalFrameDetalleFormCentroCosto.jMenuItemModificarCentroCosto.addActionListener(new ButtonActionListener(this,"MenuItemModificarCentroCosto"));		
		
		
		
		this.jInternalFrameDetalleFormCentroCosto.jButtonActualizarCentroCosto.addActionListener (new ButtonActionListener(this,"ActualizarCentroCosto"));
		
		
		this.jInternalFrameDetalleFormCentroCosto.jButtonActualizarToolBarCentroCosto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCentroCosto"));
						
		this.jInternalFrameDetalleFormCentroCosto.jMenuItemActualizarCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCentroCosto"));		
		
		
		
		this.jInternalFrameDetalleFormCentroCosto.jButtonEliminarCentroCosto.addActionListener (new ButtonActionListener(this,"EliminarCentroCosto"));
		
		
		this.jInternalFrameDetalleFormCentroCosto.jButtonEliminarToolBarCentroCosto.addActionListener (new ButtonActionListener(this,"EliminarToolBarCentroCosto"));
								
		this.jInternalFrameDetalleFormCentroCosto.jMenuItemEliminarCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCentroCosto"));		
		
		
		
		this.jInternalFrameDetalleFormCentroCosto.jButtonCancelarCentroCosto.addActionListener (new ButtonActionListener(this,"CancelarCentroCosto"));
		
		
		this.jInternalFrameDetalleFormCentroCosto.jButtonCancelarToolBarCentroCosto.addActionListener (new ButtonActionListener(this,"CancelarToolBarCentroCosto"));
					
		this.jInternalFrameDetalleFormCentroCosto.jMenuItemCancelarCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCentroCosto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCentroCosto.jMenuItemDetalleCerrarCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCentroCosto"));		
		
		
		
		this.jInternalFrameDetalleFormCentroCosto.jButtonGuardarCambiosToolBarCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCentroCosto"));
		
		
		
		this.jInternalFrameDetalleFormCentroCosto.jButtonGuardarCambiosToolBarCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCentroCosto"));
		
		
		
		this.jInternalFrameDetalleFormCentroCosto.jComboBoxTiposAccionesFormularioCentroCosto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCentroCosto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonidCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"idCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCosto.jButtonid_empresaCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonid_empresaCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtoncodigoCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"codigoCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonnombreCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCentroCostoBusqueda"));
		//jButtonid_centro_costoCentroCosto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_centro_costoCentroCostoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCentroCosto.jButtonid_centro_costoCentroCosto.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCosto"));
		//jButtonid_centro_costoCentroCostoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCentroCosto("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCentroCosto.jButtonid_centro_costoCentroCostoArbol.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCosto.jButtonid_centro_costoCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonid_centro_costoCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonporcentajeCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonvalorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"valorCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonordenCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"ordenCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtones_finalCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"es_finalCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtondescripcionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCentroCostoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCentroCosto.jTabbedPaneRelacionesCentroCosto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCentroCosto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCentroCosto"));
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCosto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCentroCosto"));
		}
		
		this.jTableDatosCentroCosto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCentroCosto"));
		
		this.jTableDatosCentroCosto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCentroCosto"));
		
		this.jButtonNuevoCentroCosto.addActionListener(new ButtonActionListener(this,"NuevoCentroCosto"));
		
		this.jButtonDuplicarCentroCosto.addActionListener(new ButtonActionListener(this,"DuplicarCentroCosto"));
		
		this.jButtonCopiarCentroCosto.addActionListener(new ButtonActionListener(this,"CopiarCentroCosto"));
		
		this.jButtonVerFormCentroCosto.addActionListener(new ButtonActionListener(this,"VerFormCentroCosto"));
		
		
		this.jButtonNuevoToolBarCentroCosto.addActionListener(new ButtonActionListener(this,"NuevoToolBarCentroCosto"));
			
		this.jButtonDuplicarToolBarCentroCosto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCentroCosto"));
			
		this.jMenuItemNuevoCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCentroCosto"));
			
		this.jMenuItemDuplicarCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCentroCosto"));		
		
		
		this.jButtonNuevoRelacionesCentroCosto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCentroCosto"));
		
		
		this.jButtonNuevoRelacionesToolBarCentroCosto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCentroCosto"));
			
		this.jMenuItemNuevoRelacionesCentroCosto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCentroCosto"));		
		
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCosto.jButtonModificarCentroCosto.addActionListener(new ButtonActionListener(this,"ModificarCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCosto.jButtonModificarToolBarCentroCosto.addActionListener(new ButtonActionListener(this,"ModificarToolBarCentroCosto"));
			
			this.jInternalFrameDetalleFormCentroCosto.jMenuItemModificarCentroCosto.addActionListener(new ButtonActionListener(this,"MenuItemModificarCentroCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCentroCosto.jButtonActualizarCentroCosto.addActionListener (new ButtonActionListener(this,"ActualizarCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCosto.jButtonActualizarToolBarCentroCosto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCentroCosto"));
				
			this.jInternalFrameDetalleFormCentroCosto.jMenuItemActualizarCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCentroCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCosto.jButtonEliminarCentroCosto.addActionListener (new ButtonActionListener(this,"EliminarCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCosto.jButtonEliminarToolBarCentroCosto.addActionListener (new ButtonActionListener(this,"EliminarToolBarCentroCosto"));
						
			this.jInternalFrameDetalleFormCentroCosto.jMenuItemEliminarCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCentroCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCosto.jButtonCancelarCentroCosto.addActionListener (new ButtonActionListener(this,"CancelarCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCosto.jButtonCancelarToolBarCentroCosto.addActionListener (new ButtonActionListener(this,"CancelarToolBarCentroCosto"));
			
			this.jInternalFrameDetalleFormCentroCosto.jMenuItemCancelarCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCentroCosto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCentroCosto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCentroCosto"));		
		
		
		this.jButtonCerrarCentroCosto.addActionListener (new ButtonActionListener(this,"CerrarCentroCosto"));
		
		
		this.jButtonCerrarToolBarCentroCosto.addActionListener (new ButtonActionListener(this,"CerrarToolBarCentroCosto"));
			
		this.jMenuItemCerrarCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCentroCosto"));
			
		if(this.jInternalFrameDetalleFormCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCosto.jMenuItemDetalleCerrarCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCentroCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCosto.jButtonGuardarCambiosCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCosto.jButtonGuardarCambiosToolBarCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCentroCosto"));
		}
		
		this.jButtonCopiarToolBarCentroCosto.addActionListener (new ButtonActionListener(this,"CopiarToolBarCentroCosto"));
			
		this.jButtonVerFormToolBarCentroCosto.addActionListener (new ButtonActionListener(this,"VerFormToolBarCentroCosto"));
		
		this.jMenuItemGuardarCambiosCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCentroCosto"));
			
		this.jMenuItemCopiarCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCentroCosto"));		
		
		this.jMenuItemVerFormCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCentroCosto"));		
		
		
		this.jButtonGuardarCambiosTablaCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCentroCosto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCentroCosto"));
			
		this.jMenuItemGuardarCambiosTablaCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCentroCosto"));		
		
		
		
		this.jButtonRecargarInformacionCentroCosto.addActionListener (new ButtonActionListener(this,"RecargarInformacionCentroCosto"));
					
		this.jButtonRecargarInformacionToolBarCentroCosto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCentroCosto"));
		
		this.jMenuItemRecargarInformacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCentroCosto"));		
		
		
		this.jButtonArbolCentroCosto.addActionListener (new ButtonActionListener(this,"ArbolCentroCosto"));
		
		this.jButtonAnterioresCentroCosto.addActionListener (new ButtonActionListener(this,"AnterioresCentroCosto"));
		
		
		this.jButtonAnterioresToolBarCentroCosto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCentroCosto"));
		
		this.jMenuItemAnterioresCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCentroCosto"));		
		
		
		this.jButtonSiguientesCentroCosto.addActionListener (new ButtonActionListener(this,"SiguientesCentroCosto"));
		
		
		this.jButtonSiguientesToolBarCentroCosto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCentroCosto"));
			
		this.jMenuItemSiguientesCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCentroCosto"));
			
		this.jMenuItemAbrirOrderByCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCentroCosto"));
			
		this.jMenuItemMostrarOcultarCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCentroCosto"));
			
		this.jMenuItemDetalleAbrirOrderByCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCentroCosto"));
			
		this.jMenuItemDetalleMostarOcultarCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCentroCosto"));		
		
		
		this.jButtonNuevoGuardarCambiosCentroCosto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCentroCosto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCentroCosto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCentroCosto"));
			
		this.jMenuItemNuevoGuardarCambiosCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCentroCosto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCentroCosto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCentroCosto"));

		this.jCheckBoxSeleccionadosCentroCosto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCentroCosto"));
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCosto.jComboBoxTiposAccionesFormularioCentroCosto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCentroCosto"));
		}
		
		
		this.jComboBoxTiposRelacionesCentroCosto.addActionListener (new ButtonActionListener(this,"TiposRelacionesCentroCosto"));
			
		this.jComboBoxTiposAccionesCentroCosto.addActionListener (new ButtonActionListener(this,"TiposAccionesCentroCosto"));
					
		this.jComboBoxTiposSeleccionarCentroCosto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCentroCosto"));
			
		this.jTextFieldValorCampoGeneralCentroCosto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCentroCosto"));		
		
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonidCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"idCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCosto.jButtonid_empresaCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonid_empresaCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtoncodigoCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"codigoCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonnombreCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCentroCostoBusqueda"));
		//jButtonid_centro_costoCentroCosto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_centro_costoCentroCostoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCentroCosto.jButtonid_centro_costoCentroCosto.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCosto"));
		//jButtonid_centro_costoCentroCostoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCentroCosto("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCentroCosto.jButtonid_centro_costoCentroCostoArbol.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCosto.jButtonid_centro_costoCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonid_centro_costoCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonporcentajeCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonvalorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"valorCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonordenCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"ordenCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtones_finalCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"es_finalCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtondescripcionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCentroCostoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoCentroCosto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoCentroCosto"));

			this.jButtonBusquedaPorNombreCentroCosto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCentroCosto"));

			this.jButtonFK_IdCentroCostoCentroCosto.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoCentroCosto"));

			this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCosto.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCosto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCentroCosto!=null) {
				this.jInternalFrameReporteDinamicoCentroCosto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCentroCosto"));
				this.jInternalFrameReporteDinamicoCentroCosto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCentroCosto"));
				this.jInternalFrameReporteDinamicoCentroCosto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCentroCosto"));
			}
			
			//this.jButtonCerrarReporteDinamicoCentroCosto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCentroCosto"));				
			//this.jButtonGenerarReporteDinamicoCentroCosto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCentroCosto"));
			//this.jButtonGenerarExcelReporteDinamicoCentroCosto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCentroCosto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCentroCosto!=null) {
				this.jInternalFrameImportacionCentroCosto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCentroCosto"));
				this.jInternalFrameImportacionCentroCosto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCentroCosto"));
				this.jInternalFrameImportacionCentroCosto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCentroCosto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCentroCosto.addActionListener (new ButtonActionListener(this,"AbrirOrderByCentroCosto"));
			
			this.jButtonAbrirOrderByToolBarCentroCosto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCentroCosto"));			
			
			if(this.jInternalFrameOrderByCentroCosto!=null) {
				this.jInternalFrameOrderByCentroCosto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCentroCosto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCosto.jTabbedPaneRelacionesCentroCosto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCentroCosto"));
		
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
            		closingInternalFrameCentroCosto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCentroCosto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCentroCosto = (JInternalFrameBase)event.getSource();
	            	
	            CentroCostoBeanSwingJInternalFrame jInternalFrameParent=(CentroCostoBeanSwingJInternalFrame)jInternalFrameDetalleFormCentroCosto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCentroCostoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCentroCosto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCentroCostoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCentroCosto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCentroCosto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCentroCosto";
		inputMap = this.jButtonNuevoCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCentroCostoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCentroCosto";
		inputMap = this.jButtonNuevoRelacionesCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCentroCostoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCentroCosto";
		inputMap = this.jButtonModificarCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCentroCosto";
		inputMap = this.jButtonActualizarCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCentroCosto";
		inputMap = this.jButtonEliminarCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCentroCosto";
		inputMap = this.jButtonCancelarCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCentroCosto";
		inputMap = this.jButtonCerrarCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCentroCosto.jButtonGuardarCambiosCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCentroCosto";
		inputMap = this.jInternalFrameDetalleFormCentroCosto.jButtonGuardarCambiosCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCentroCosto.jButtonGuardarCambiosCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonArbolCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonArbolCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCentroCosto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCentroCostoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCentroCosto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCentroCostoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCentroCosto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCentroCostoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCentroCosto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCentroCostoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonidCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"idCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCosto.jButtonid_empresaCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonid_empresaCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtoncodigoCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"codigoCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonnombreCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCentroCostoBusqueda"));
		//jButtonid_centro_costoCentroCosto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_centro_costoCentroCostoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCentroCosto.jButtonid_centro_costoCentroCosto.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCosto"));
		//jButtonid_centro_costoCentroCostoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCentroCosto("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCentroCosto.jButtonid_centro_costoCentroCostoArbol.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCosto.jButtonid_centro_costoCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonid_centro_costoCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonporcentajeCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonvalorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"valorCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtonordenCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"ordenCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtones_finalCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"es_finalCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCosto.jButtondescripcionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCentroCostoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoCentroCosto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoCentroCosto"));

		this.jButtonBusquedaPorNombreCentroCosto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCentroCosto"));

		this.jButtonFK_IdCentroCostoCentroCosto.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoCentroCosto"));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCosto.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCosto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCentroCostoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCentroCosto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCentroCosto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CentroCosto centrocostoAux:this.centrocostoLogic.getCentroCostos()) {
					centrocostoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroCosto centrocostoAux:centrocostos) {
					centrocostoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCentroCostoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCentroCosto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CentroCosto centrocostoAux:this.centrocostoLogic.getCentroCostos()) {
						centrocostoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CentroCosto centrocostoAux:centrocostos) {
						centrocostoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CentroCosto centrocostoAux:this.centrocostoLogic.getCentroCostos()) {
					
						if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_ESFINAL)) {
							existe=true;
							centrocostoAux.setes_final(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CentroCosto centrocostoAux:centrocostos) {
						
						if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_ESFINAL)) {
							existe=true;
							centrocostoAux.setes_final(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCentroCosto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCentroCosto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCentroCosto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCentroCosto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCentroCostoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCentroCosto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCentroCosto.getSelectedRows();
			
			CentroCosto centrocostoLocal=new CentroCosto();
			
			//this.seleccionarTodosCentroCosto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLocal =(CentroCosto) this.centrocostoLogic.getCentroCostos().toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					centrocostoLocal =(CentroCosto) this.centrocostos.toArray()[this.jTableDatosCentroCosto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				centrocostoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CentroCosto centrocostoAux:this.centrocostoLogic.getCentroCostos()) {
						centrocostoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CentroCosto centrocostoAux:centrocostos) {
						centrocostoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCentroCosto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCentroCosto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCentroCosto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCentroCosto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCentroCostoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCentroCostoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCentroCostoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCentroCosto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCentroCosto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CentroCosto centrocostoAux:this.centrocostoLogic.getCentroCostos()) {
				
						if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							centrocostoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							centrocostoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							centrocostoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							centrocostoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							centrocostoAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							centrocostoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroCosto centrocostoAux:centrocostos) {
					
						if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							centrocostoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							centrocostoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							centrocostoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							centrocostoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							centrocostoAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							centrocostoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCentroCosto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCentroCostoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCentroCosto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCentroCosto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCentroCosto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCentroCosto.jComboBoxTiposAccionesFormularioCentroCosto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCentroCosto) {				
					conSplash=true;//false;										
					
					//this.startProcessCentroCosto(conSplash);
				
					this.generarReporteCentroCostosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroCosto.jComboBoxTiposAccionesFormularioCentroCosto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCentroCostosSeleccionados();
				//this.jComboBoxTiposAccionesCentroCosto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCentroCostosSeleccionados(false);
				//this.jComboBoxTiposAccionesCentroCosto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCentroCostosSeleccionados(true);
				//this.jComboBoxTiposAccionesCentroCosto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCentroCosto();
				
				this.exportarCentroCostosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroCosto.jComboBoxTiposAccionesFormularioCentroCosto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCentroCostos();
				//this.importarCentroCostos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroCosto.jComboBoxTiposAccionesFormularioCentroCosto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCentroCosto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCentroCostosSeleccionados();
				//this.jComboBoxTiposAccionesCentroCosto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Centro Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCentroCosto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCentroCosto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCentroCosto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Centro Costo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroCosto.jComboBoxTiposAccionesFormularioCentroCosto.setSelectedIndex(0);					
				}	
			} 			
			else if(CentroCostoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCentroCosto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCentroCosto(conSplash);
					
						//this.actualizarParametrosGeneralCentroCosto();
						
						this.generarReporteProcesoAccionCentroCostosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCentroCosto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCentroCosto.jComboBoxTiposAccionesFormularioCentroCosto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CentroCostoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Centro CostoS SELECCIONADOS?", "MANTENIMIENTO DE Centro Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCentroCosto();
				
						this.actualizarParametrosGeneralCentroCosto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.centrocostoReturnGeneral=centrocostoLogic.procesarAccionCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.centrocostoLogic.getCentroCostos(),this.centrocostoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCentroCostoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCentroCosto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCentroCosto.jComboBoxTiposAccionesFormularioCentroCosto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCentroCosto();
					
					CentroCostoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCentroCostoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCentroCosto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCentroCosto.jComboBoxTiposAccionesFormularioCentroCosto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCentroCosto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCentroCostoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCentroCosto();
			
			if(this.jInternalFrameDetalleFormCentroCosto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CentroCosto> centrocostosSeleccionados=new ArrayList<CentroCosto>();		
			CentroCosto centrocosto=new CentroCosto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCentroCosto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCentroCosto.getSelectedItem();
			
			
			
			
			centrocostosSeleccionados=this.getCentroCostosSeleccionados(true);
			//this.sTipoAccion;
			
			if(centrocostosSeleccionados.size()==1) {
				for(CentroCosto centrocostoAux:centrocostosSeleccionados) {
					centrocosto=centrocostoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCentroCosto();
			
      		//this.finishProcessCentroCosto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCentroCostoReturnGeneral() throws Exception {
		if(this.centrocostoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.centrocostoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.centrocostoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.centrocostoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.centrocostoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.centrocostoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCentroCosto(false);
		}
		
		if(this.centrocostoReturnGeneral.getConRetornoLista() || this.centrocostoReturnGeneral.getConRetornoObjeto()) {
			if(this.centrocostoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.centrocostoLogic.setCentroCostos(this.centrocostoReturnGeneral.getCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.centrocostoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.centrocostoLogic.setCentroCosto(this.centrocostoReturnGeneral.getCentroCosto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCentroCosto(false);
		}
	}
	
	public void actualizarParametrosGeneralCentroCosto() throws Exception {
		
		
	}
	
	public ArrayList<CentroCosto> getCentroCostosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CentroCosto> centrocostosSeleccionados=new ArrayList<CentroCosto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCentroCosto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CentroCosto centrocostoAux:centrocostoLogic.getCentroCostos()) {
					if(centrocostoAux.getIsSelected()) {
						centrocostosSeleccionados.add(centrocostoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroCosto centrocostoAux:this.centrocostos) {
					if(centrocostoAux.getIsSelected()) {
						centrocostosSeleccionados.add(centrocostoAux);				
					}
				}
			}
			
			if(centrocostosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						centrocostosSeleccionados.addAll(this.centrocostoLogic.getCentroCostos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						centrocostosSeleccionados.addAll(this.centrocostos);				
					}
				}
			}
		} else {
			centrocostosSeleccionados.add(this.centrocosto);
		}
		
		return centrocostosSeleccionados;
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
	
	public void generarReporteCentroCostosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCentroCostosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCentroCostosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCentroCostosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCentroCostosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Centro Costo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCentroCostosSeleccionados() throws Exception {
		ArrayList<CentroCosto> centrocostosSeleccionados=new ArrayList<CentroCosto>();		
		
		centrocostosSeleccionados=this.getCentroCostosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCentroCostos("Todos",centrocostosSeleccionados);
		
	}	
	
	public void generarReporteNormalCentroCostosSeleccionados() throws Exception {
		ArrayList<CentroCosto> centrocostosSeleccionados=new ArrayList<CentroCosto>();		
		
		centrocostosSeleccionados=this.getCentroCostosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCentroCostos("Todos",centrocostosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCentroCostosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CentroCosto> centrocostosSeleccionados=new ArrayList<CentroCosto>();
		
		centrocostosSeleccionados=this.getCentroCostosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCentroCostos("Todos",centrocostosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCentroCostosSeleccionados() throws Exception {
		ArrayList<CentroCosto> centrocostosSeleccionados=new ArrayList<CentroCosto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCentroCosto();
		
		
		centrocostosSeleccionados=this.getCentroCostosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCentroCosto();
		
		
		//this.generarReporteCentroCostos("Todos",centrocostosSeleccionados ,centrocostoImplementable,centrocostoImplementableHome);
	}
	
	public void mostrarImportacionCentroCostos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCentroCosto();
		
		this.abrirFrameImportacionCentroCosto();		
		
			
		//this.generarReporteCentroCostos("Todos",centrocostosSeleccionados ,centrocostoImplementable,centrocostoImplementableHome);
	}
	
	public void importarCentroCostos() throws Exception {		
	
	}
	
	public void exportarCentroCostosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCentroCostosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCentroCostosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCentroCostosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Centro Costo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCentroCostosSeleccionados() throws Exception {
		ArrayList<CentroCosto> centrocostosSeleccionados=new ArrayList<CentroCosto>();		
		
		centrocostosSeleccionados=this.getCentroCostosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocosto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCentroCosto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CentroCosto centrocostoAux:centrocostosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCentroCosto(centrocostoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//centrocostoAux.setsDetalleGeneralEntityReporte(centrocostoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCentroCosto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CentroCostoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoConstantesFunciones.LABEL_ORDEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoConstantesFunciones.LABEL_ESFINAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCentroCosto(CentroCosto centrocosto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=centrocosto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocosto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocosto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocosto.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocosto.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocosto.getcentrocosto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocosto.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocosto.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocosto.getorden().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocosto.getes_final().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocosto.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCentroCostosSeleccionados() throws Exception {
		ArrayList<CentroCosto> centrocostosSeleccionados=new ArrayList<CentroCosto>();		
		
		centrocostosSeleccionados=this.getCentroCostosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocosto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CentroCostos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCentroCosto(row);				
				iRow++;
			}				
			
			for(CentroCosto centrocostoAux:centrocostosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCentroCosto(centrocostoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCentroCostosSeleccionados() throws Exception {
		ArrayList<CentroCosto> centrocostosSeleccionados=new ArrayList<CentroCosto>();		
		
		centrocostosSeleccionados=this.getCentroCostosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocosto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("centrocostos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("centrocosto");
			//elementRoot.appendChild(element);
		
			for(CentroCosto centrocostoAux:centrocostosSeleccionados) {
				element = document.createElement("centrocosto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCentroCosto(centrocostoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCentroCosto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoConstantesFunciones.LABEL_ORDEN);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoConstantesFunciones.LABEL_ESFINAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCentroCosto(CentroCosto centrocosto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(centrocosto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocosto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocosto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocosto.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocosto.getcentrocosto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocosto.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocosto.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocosto.getorden());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocosto.getes_final());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocosto.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlCentroCosto(CentroCosto centrocosto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CentroCostoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(centrocosto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CentroCostoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(centrocosto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CentroCostoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(centrocosto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(CentroCostoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(centrocosto.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(CentroCostoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(centrocosto.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementcentrocosto_descripcion = document.createElement(CentroCostoConstantesFunciones.IDCENTROCOSTO);
		elementcentrocosto_descripcion.appendChild(document.createTextNode(centrocosto.getcentrocosto_descripcion()));
		element.appendChild(elementcentrocosto_descripcion);

		Element elementporcentaje = document.createElement(CentroCostoConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(centrocosto.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementvalor = document.createElement(CentroCostoConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(centrocosto.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementorden = document.createElement(CentroCostoConstantesFunciones.ORDEN);
		elementorden.appendChild(document.createTextNode(centrocosto.getorden().toString().trim()));
		element.appendChild(elementorden);

		Element elementes_final = document.createElement(CentroCostoConstantesFunciones.ESFINAL);
		elementes_final.appendChild(document.createTextNode(centrocosto.getes_final().toString().trim()));
		element.appendChild(elementes_final);

		Element elementdescripcion = document.createElement(CentroCostoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(centrocosto.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoCentroCostosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CentroCosto> centrocostosSeleccionados=new ArrayList<CentroCosto>();
		
		centrocostosSeleccionados=this.getCentroCostosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCentroCosto(centrocostosSeleccionados);
		
		this.generarReporteCentroCostos("Todos",centrocostosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCentroCosto(ArrayList<CentroCosto> centrocostosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CentroCosto centrocostoAux:centrocostosSeleccionados) {
				centrocostoAux.setsDetalleGeneralEntityReporte(centrocostoAux.toString());
			
				if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					centrocostoAux.setsDescripcionGeneralEntityReporte1(centrocostoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					centrocostoAux.setsDescripcionGeneralEntityReporte1(centrocostoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					centrocostoAux.setsDescripcionGeneralEntityReporte1(centrocostoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO)) {
					existe=true;
					centrocostoAux.setsDescripcionGeneralEntityReporte1(centrocostoAux.getcentrocosto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_ORDEN)) {
					existe=true;
					centrocostoAux.setsDescripcionGeneralEntityReporte1(centrocostoAux.getorden().toString());
				}
				 else if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_ESFINAL)) {
					existe=true;
					centrocostoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(centrocostoAux.getes_final()));
				}
				 else if(sTipoSeleccionar.equals(CentroCostoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					centrocostoAux.setsDescripcionGeneralEntityReporte1(centrocostoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCentroCosto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCentroCosto=true;
				this.isVisibilidadCeldaNuevoRelacionesCentroCosto=true;
				this.isVisibilidadCeldaGuardarCambiosCentroCosto=true;
			}
			
			this.isVisibilidadCeldaModificarCentroCosto=false;
			this.isVisibilidadCeldaActualizarCentroCosto=false;
			this.isVisibilidadCeldaEliminarCentroCosto=false;
			this.isVisibilidadCeldaCancelarCentroCosto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroCosto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCosto=false;
			this.isVisibilidadCeldaModificarCentroCosto=false;
			this.isVisibilidadCeldaActualizarCentroCosto=true;
			this.isVisibilidadCeldaEliminarCentroCosto=false;
			this.isVisibilidadCeldaCancelarCentroCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroCosto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCosto=false;
			this.isVisibilidadCeldaModificarCentroCosto=false;
			this.isVisibilidadCeldaActualizarCentroCosto=true;
			this.isVisibilidadCeldaEliminarCentroCosto=true;
			this.isVisibilidadCeldaCancelarCentroCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroCosto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCosto=false;
			this.isVisibilidadCeldaModificarCentroCosto=false;
			this.isVisibilidadCeldaActualizarCentroCosto=true;
			this.isVisibilidadCeldaEliminarCentroCosto=false;
			this.isVisibilidadCeldaCancelarCentroCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCosto=false;
				} else {
					this.isVisibilidadCeldaGuardarCentroCosto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCentroCosto=true;
			this.isVisibilidadCeldaNuevoRelacionesCentroCosto=true;
			this.isVisibilidadCeldaGuardarCambiosCentroCosto=true;
			this.isVisibilidadCeldaModificarCentroCosto=false;
			this.isVisibilidadCeldaActualizarCentroCosto=false;
			this.isVisibilidadCeldaEliminarCentroCosto=false;
			this.isVisibilidadCeldaCancelarCentroCosto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroCosto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCosto=false;
			this.isVisibilidadCeldaActualizarCentroCosto=false;
			this.isVisibilidadCeldaEliminarCentroCosto=false;
			this.isVisibilidadCeldaCancelarCentroCosto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCosto=false;
				} else {
					this.isVisibilidadCeldaGuardarCentroCosto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCosto=false;
			this.isVisibilidadCeldaModificarCentroCosto=true;
			this.isVisibilidadCeldaActualizarCentroCosto=false;
			this.isVisibilidadCeldaEliminarCentroCosto=false;
			this.isVisibilidadCeldaCancelarCentroCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCosto=false;
				} else {
					this.isVisibilidadCeldaGuardarCentroCosto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CentroCostoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCentroCosto=true;
			this.isVisibilidadCeldaNuevoRelacionesCentroCosto=true;
			this.isVisibilidadCeldaGuardarCambiosCentroCosto=true;
		} else {
			this.actualizarEstadoPanelsCentroCosto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCentroCosto=false;
			//this.isVisibilidadCeldaVerFormCentroCosto=false;
			this.isVisibilidadCeldaDuplicarCentroCosto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!centrocostoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCentroCosto=false;
		} else {
			this.isVisibilidadCeldaNuevoCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCosto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(centrocostoSessionBean.getEsGuardarRelacionado()) {
			if(!centrocostoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCentroCosto=false;												
			}
			
			this.jButtonCerrarCentroCosto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCentroCosto=false;
		}
		
		if(!this.permiteMantenimiento(this.centrocosto)) {
			this.isVisibilidadCeldaActualizarCentroCosto=false;
			this.isVisibilidadCeldaEliminarCentroCosto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCentroCosto() {
	}
	
	public void actualizarEstadoPanelsCentroCosto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCentroCosto!=null) {
				this.jScrollPanelDatosEdicionCentroCosto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCosto!=null) {
				this.jTabbedPaneBusquedasCentroCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroCosto!=null) {
				this.jScrollPanelDatosCentroCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroCosto!=null) {
				this.jPanelPaginacionCentroCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroCosto!=null) {
				this.jPanelParametrosReportesCentroCosto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCentroCosto!=null) {
				this.jScrollPanelDatosEdicionCentroCosto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCosto!=null) {
				this.jTabbedPaneBusquedasCentroCosto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCentroCosto!=null) {
				this.jScrollPanelDatosCentroCosto.setVisible(false);
			}
			
			if(this.jPanelPaginacionCentroCosto!=null) {
				this.jPanelPaginacionCentroCosto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCentroCosto!=null) {
				this.jPanelParametrosReportesCentroCosto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCentroCosto!=null) {
				this.jScrollPanelDatosEdicionCentroCosto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCosto!=null) {
				this.jTabbedPaneBusquedasCentroCosto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCentroCosto!=null) {
				this.jScrollPanelDatosCentroCosto.setVisible(false);
			}
			
			if(this.jPanelPaginacionCentroCosto!=null) {
				this.jPanelPaginacionCentroCosto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCentroCosto!=null) {
				this.jPanelParametrosReportesCentroCosto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCentroCosto!=null) {
				this.jScrollPanelDatosEdicionCentroCosto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCosto!=null) {
				this.jTabbedPaneBusquedasCentroCosto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCentroCosto!=null) {
				this.jScrollPanelDatosCentroCosto.setVisible(false);
			}
			
			if(this.jPanelPaginacionCentroCosto!=null) {
				this.jPanelPaginacionCentroCosto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCentroCosto!=null) {
				this.jPanelParametrosReportesCentroCosto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCentroCosto!=null) {
				this.jScrollPanelDatosEdicionCentroCosto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCosto!=null) {
				this.jTabbedPaneBusquedasCentroCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroCosto!=null) {
				this.jScrollPanelDatosCentroCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroCosto!=null) {
				this.jPanelPaginacionCentroCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroCosto!=null) {
				this.jPanelParametrosReportesCentroCosto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCentroCosto!=null) {
				this.jScrollPanelDatosEdicionCentroCosto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCosto!=null) {
				this.jTabbedPaneBusquedasCentroCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroCosto!=null) {
				this.jScrollPanelDatosCentroCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroCosto!=null) {
				this.jPanelPaginacionCentroCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroCosto!=null) {
				this.jPanelParametrosReportesCentroCosto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCentroCosto!=null) {
				this.jScrollPanelDatosEdicionCentroCosto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCosto!=null) {
				this.jTabbedPaneBusquedasCentroCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroCosto!=null) {
				this.jScrollPanelDatosCentroCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroCosto!=null) {
				this.jPanelPaginacionCentroCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroCosto!=null) {
				this.jPanelParametrosReportesCentroCosto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.centrocostoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCentroCosto!=null) {
					this.jTabbedPaneBusquedasCentroCosto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCentroCosto!=null) {
				this.jPanelParametrosReportesCentroCosto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.centrocostoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCosto!=null) {
				this.jTabbedPaneBusquedasCentroCosto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCentroCosto!=null) {
				this.jPanelParametrosReportesCentroCosto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasCentroCosto.remove(jPanelBusquedaPorCodigoCentroCosto);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCentroCosto.remove(jPanelBusquedaPorNombreCentroCosto);}

			this.isVisibilidadFK_IdCentroCosto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasCentroCosto.remove(jPanelFK_IdCentroCostoCentroCosto);}
		}
		
	}

	public void setVisibilidadBusquedasParaCentroCosto(Boolean isParaCentroCosto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCentroCostoNegation=!isParaCentroCosto;

			this.isVisibilidadBusquedaPorCodigo=isParaCentroCostoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasCentroCosto.remove(jPanelBusquedaPorCodigoCentroCosto);}

			this.isVisibilidadBusquedaPorNombre=isParaCentroCostoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCentroCosto.remove(jPanelBusquedaPorNombreCentroCosto);}

			this.isVisibilidadFK_IdCentroCosto=isParaCentroCosto;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasCentroCosto.remove(jPanelFK_IdCentroCostoCentroCosto);}
		}
		
	}
	
	
	
	

	public String registrarSesionCentroCostoParaBusquedaCentroCostos() throws Exception {
		Boolean isPaginaPopupCentroCosto=false;

		try {

			if(centrocostoSessionBean==null) {
				centrocostoSessionBean=new CentroCostoSessionBean();
			}

			if(centrocostoSessionBean==null) {
				centrocostoSessionBean=new CentroCostoSessionBean();
			}

			centrocostoSessionBean.setsPathNavegacionActual(centrocostoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CentroCostoConstantesFunciones.SCLASSWEBTITULO);
			centrocostoSessionBean.setisPermiteRecargarInformacion(false);
			centrocostoSessionBean.setisPaginaPopup(true);
			isPaginaPopupCentroCosto=centrocostoSessionBean.getisPaginaPopup();
			centrocostoSessionBean.setisPaginaPopup(false);
			centrocostoSessionBean.setEstaModoBusqueda(true);
			centrocostoSessionBean.setsFuncionBusquedaRapida("window.opener.centrocostoFuncionGeneral.setCombosCodigoDesdeBusquedaid_centro_costo(TO_REPLACE);");
			centrocostoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCentroCosto(true);
			centrocostoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCentroCosto(CentroCostoConstantesFunciones.SNOMBREOPCION);
			//centrocostoSessionBean.setisBusquedaDesdeForeignKeySesionCentroCosto(true);
			//centrocostoSessionBean.setlidCentroCostoActual(this.idCentroCostoActual);

			centrocostoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCentroCosto(true);
			centrocostoSessionBean.setlIdCentroCostoActualForeignKey(this.idCentroCostoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CentroCostoSessionBean centrocostoSessionBean=new CentroCostoSessionBean();
		
		if(this.centrocostoSessionBean==null) {
			this.centrocostoSessionBean=new CentroCostoSessionBean();
		}
		
		this.centrocostoSessionBean.setsUltimaBusquedaCentroCosto(this.getsAccionBusqueda());
		this.centrocostoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.centrocostoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			centrocostoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			centrocostoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
			centrocostoSessionBean.setid_centro_costo(this.getid_centro_costoFK_IdCentroCosto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			centrocostoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CentroCostoSessionBean centrocostoSessionBean=new CentroCostoSessionBean();
		
		if(this.centrocostoSessionBean==null) {
			this.centrocostoSessionBean=new CentroCostoSessionBean();
		}
		
		if(this.centrocostoSessionBean.getsUltimaBusquedaCentroCosto()!=null&&!this.centrocostoSessionBean.getsUltimaBusquedaCentroCosto().equals("")) {
			this.setsAccionBusqueda(centrocostoSessionBean.getsUltimaBusquedaCentroCosto());
			this.setiNumeroPaginacion(centrocostoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(centrocostoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(centrocostoSessionBean.getcodigo());
				centrocostoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(centrocostoSessionBean.getnombre());
				centrocostoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
				this.setid_centro_costoFK_IdCentroCosto(centrocostoSessionBean.getid_centro_costo());
				centrocostoSessionBean.setid_centro_costo(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(centrocostoSessionBean.getid_empresa());
				centrocostoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.centrocostoSessionBean.setsUltimaBusquedaCentroCosto("");
		this.centrocostoSessionBean.setiNumeroPaginacion(CentroCostoConstantesFunciones.INUMEROPAGINACION);
		this.centrocostoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCentroCosto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCentroCosto() {
		this.updateBorderResaltarBusquedasFormularioCentroCosto();
		this.updateVisibilidadBusquedasFormularioCentroCosto();
		this.updateHabilitarBusquedasFormularioCentroCosto();
	}
	
	public void updateBorderResaltarBusquedasFormularioCentroCosto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCentroCosto.getComponents().length>0) {
	

		if(this.centrocostoConstantesFunciones.resaltarBusquedaPorCodigoCentroCosto!=null) {
			index= this.jTabbedPaneBusquedasCentroCosto.indexOfComponent(this.jPanelBusquedaPorCodigoCentroCosto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCosto.getComponent(index);
				jPanel.setBorder(this.centrocostoConstantesFunciones.resaltarBusquedaPorCodigoCentroCosto);
			}
		}

		if(this.centrocostoConstantesFunciones.resaltarBusquedaPorNombreCentroCosto!=null) {
			index= this.jTabbedPaneBusquedasCentroCosto.indexOfComponent(this.jPanelBusquedaPorNombreCentroCosto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCosto.getComponent(index);
				jPanel.setBorder(this.centrocostoConstantesFunciones.resaltarBusquedaPorNombreCentroCosto);
			}
		}

		if(this.centrocostoConstantesFunciones.resaltarFK_IdCentroCostoCentroCosto!=null) {
			index= this.jTabbedPaneBusquedasCentroCosto.indexOfComponent(this.jPanelFK_IdCentroCostoCentroCosto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCosto.getComponent(index);
				jPanel.setBorder(this.centrocostoConstantesFunciones.resaltarFK_IdCentroCostoCentroCosto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCentroCosto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCentroCosto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCentroCosto.indexOfComponent(this.jPanelBusquedaPorCodigoCentroCosto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCosto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.centrocostoConstantesFunciones.mostrarBusquedaPorCodigoCentroCosto);
			if(!this.centrocostoConstantesFunciones.mostrarBusquedaPorCodigoCentroCosto && index>-1) {
				this.jTabbedPaneBusquedasCentroCosto.remove(index);
			}

			index= this.jTabbedPaneBusquedasCentroCosto.indexOfComponent(this.jPanelBusquedaPorNombreCentroCosto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCosto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.centrocostoConstantesFunciones.mostrarBusquedaPorNombreCentroCosto);
			if(!this.centrocostoConstantesFunciones.mostrarBusquedaPorNombreCentroCosto && index>-1) {
				this.jTabbedPaneBusquedasCentroCosto.remove(index);
			}

			index= this.jTabbedPaneBusquedasCentroCosto.indexOfComponent(this.jPanelFK_IdCentroCostoCentroCosto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCosto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.centrocostoConstantesFunciones.mostrarFK_IdCentroCostoCentroCosto);
			if(!this.centrocostoConstantesFunciones.mostrarFK_IdCentroCostoCentroCosto && index>-1) {
				this.jTabbedPaneBusquedasCentroCosto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCentroCosto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCentroCosto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCentroCosto.indexOfComponent(this.jPanelBusquedaPorCodigoCentroCosto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCosto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.centrocostoConstantesFunciones.activarBusquedaPorCodigoCentroCosto);
				this.jTabbedPaneBusquedasCentroCosto.setEnabledAt(index,this.centrocostoConstantesFunciones.activarBusquedaPorCodigoCentroCosto);
			}

			index= this.jTabbedPaneBusquedasCentroCosto.indexOfComponent(this.jPanelBusquedaPorNombreCentroCosto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCosto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.centrocostoConstantesFunciones.activarBusquedaPorNombreCentroCosto);
				this.jTabbedPaneBusquedasCentroCosto.setEnabledAt(index,this.centrocostoConstantesFunciones.activarBusquedaPorNombreCentroCosto);
			}

			index= this.jTabbedPaneBusquedasCentroCosto.indexOfComponent(this.jPanelFK_IdCentroCostoCentroCosto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCosto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.centrocostoConstantesFunciones.activarFK_IdCentroCostoCentroCosto);
				this.jTabbedPaneBusquedasCentroCosto.setEnabledAt(index,this.centrocostoConstantesFunciones.activarFK_IdCentroCostoCentroCosto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCentroCosto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasCentroCosto.indexOfComponent(this.jPanelBusquedaPorCodigoCentroCosto);

			this.jTabbedPaneBusquedasCentroCosto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCosto.getComponent(index);

			this.centrocostoConstantesFunciones.setResaltarBusquedaPorCodigoCentroCosto(resaltar);

			jPanel.setBorder(this.centrocostoConstantesFunciones.resaltarBusquedaPorCodigoCentroCosto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasCentroCosto.indexOfComponent(this.jPanelBusquedaPorNombreCentroCosto);

			this.jTabbedPaneBusquedasCentroCosto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCosto.getComponent(index);

			this.centrocostoConstantesFunciones.setResaltarBusquedaPorNombreCentroCosto(resaltar);

			jPanel.setBorder(this.centrocostoConstantesFunciones.resaltarBusquedaPorNombreCentroCosto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCentroCosto")) {
			index= this.jTabbedPaneBusquedasCentroCosto.indexOfComponent(this.jPanelFK_IdCentroCostoCentroCosto);

			this.jTabbedPaneBusquedasCentroCosto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCosto.getComponent(index);

			this.centrocostoConstantesFunciones.setResaltarFK_IdCentroCostoCentroCosto(resaltar);

			jPanel.setBorder(this.centrocostoConstantesFunciones.resaltarFK_IdCentroCostoCentroCosto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCentroCosto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCentroCosto() throws Exception {

		if(this.jInternalFrameDetalleFormCentroCosto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCentroCosto();
		this.updateVisibilidadResaltarControlesFormularioCentroCosto();
		this.updateHabilitarResaltarControlesFormularioCentroCosto();
		
	}
	
	public void updateBorderResaltarControlesFormularioCentroCosto() throws Exception {
		if(this.jInternalFrameDetalleFormCentroCosto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.centrocostoConstantesFunciones.resaltaridCentroCosto!=null && this.jInternalFrameDetalleFormCentroCosto!=null) {this.jInternalFrameDetalleFormCentroCosto.jLabelidCentroCosto.setBorder(this.centrocostoConstantesFunciones.resaltaridCentroCosto);}
		if(this.centrocostoConstantesFunciones.resaltarid_empresaCentroCosto!=null && this.jInternalFrameDetalleFormCentroCosto!=null) {this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_empresaCentroCosto.setBorder(this.centrocostoConstantesFunciones.resaltarid_empresaCentroCosto);}
		if(this.centrocostoConstantesFunciones.resaltarcodigoCentroCosto!=null && this.jInternalFrameDetalleFormCentroCosto!=null) {this.jInternalFrameDetalleFormCentroCosto.jTextFieldcodigoCentroCosto.setBorder(this.centrocostoConstantesFunciones.resaltarcodigoCentroCosto);}
		if(this.centrocostoConstantesFunciones.resaltarnombreCentroCosto!=null && this.jInternalFrameDetalleFormCentroCosto!=null) {this.jInternalFrameDetalleFormCentroCosto.jTextAreanombreCentroCosto.setBorder(this.centrocostoConstantesFunciones.resaltarnombreCentroCosto);}
		if(this.centrocostoConstantesFunciones.resaltarid_centro_costoCentroCosto!=null && this.jInternalFrameDetalleFormCentroCosto!=null) {this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_centro_costoCentroCosto.setBorder(this.centrocostoConstantesFunciones.resaltarid_centro_costoCentroCosto);}
		if(this.centrocostoConstantesFunciones.resaltarporcentajeCentroCosto!=null && this.jInternalFrameDetalleFormCentroCosto!=null) {this.jInternalFrameDetalleFormCentroCosto.jTextFieldporcentajeCentroCosto.setBorder(this.centrocostoConstantesFunciones.resaltarporcentajeCentroCosto);}
		if(this.centrocostoConstantesFunciones.resaltarvalorCentroCosto!=null && this.jInternalFrameDetalleFormCentroCosto!=null) {this.jInternalFrameDetalleFormCentroCosto.jTextFieldvalorCentroCosto.setBorder(this.centrocostoConstantesFunciones.resaltarvalorCentroCosto);}
		if(this.centrocostoConstantesFunciones.resaltarordenCentroCosto!=null && this.jInternalFrameDetalleFormCentroCosto!=null) {this.jInternalFrameDetalleFormCentroCosto.jTextFieldordenCentroCosto.setBorder(this.centrocostoConstantesFunciones.resaltarordenCentroCosto);}
		if(this.centrocostoConstantesFunciones.resaltares_finalCentroCosto!=null && this.jInternalFrameDetalleFormCentroCosto!=null) {this.jInternalFrameDetalleFormCentroCosto.jCheckBoxes_finalCentroCosto.setBorderPainted(true);this.jInternalFrameDetalleFormCentroCosto.jCheckBoxes_finalCentroCosto.setBorder(this.centrocostoConstantesFunciones.resaltares_finalCentroCosto);}
		if(this.centrocostoConstantesFunciones.resaltardescripcionCentroCosto!=null && this.jInternalFrameDetalleFormCentroCosto!=null) {this.jInternalFrameDetalleFormCentroCosto.jTextAreadescripcionCentroCosto.setBorder(this.centrocostoConstantesFunciones.resaltardescripcionCentroCosto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCentroCosto() throws Exception {		
		if(this.jInternalFrameDetalleFormCentroCosto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) {
	
		//this.jInternalFrameDetalleFormCentroCosto.jLabelidCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostraridCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jPanelidCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostraridCentroCosto);
		//this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_empresaCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrarid_empresaCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jPanelid_empresaCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrarid_empresaCentroCosto);
		//this.jInternalFrameDetalleFormCentroCosto.jTextFieldcodigoCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrarcodigoCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jPanelcodigoCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrarcodigoCentroCosto);
		//this.jInternalFrameDetalleFormCentroCosto.jTextAreanombreCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrarnombreCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jPanelnombreCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrarnombreCentroCosto);
		//this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_centro_costoCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrarid_centro_costoCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jPanelid_centro_costoCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrarid_centro_costoCentroCosto);
			this.jInternalFrameDetalleFormCentroCosto.jButtonid_centro_costoCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrarid_centro_costoCentroCosto);
		//this.jInternalFrameDetalleFormCentroCosto.jTextFieldporcentajeCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrarporcentajeCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jPanelporcentajeCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrarporcentajeCentroCosto);
		//this.jInternalFrameDetalleFormCentroCosto.jTextFieldvalorCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrarvalorCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jPanelvalorCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrarvalorCentroCosto);
		//this.jInternalFrameDetalleFormCentroCosto.jTextFieldordenCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrarordenCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jPanelordenCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrarordenCentroCosto);
		//this.jInternalFrameDetalleFormCentroCosto.jCheckBoxes_finalCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrares_finalCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jPaneles_finalCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrares_finalCentroCosto);
		//this.jInternalFrameDetalleFormCentroCosto.jTextAreadescripcionCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrardescripcionCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jPaneldescripcionCentroCosto.setVisible(this.centrocostoConstantesFunciones.mostrardescripcionCentroCosto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCentroCosto() throws Exception {
		if(this.jInternalFrameDetalleFormCentroCosto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCentroCosto!=null) {
	
		this.jInternalFrameDetalleFormCentroCosto.jLabelidCentroCosto.setEnabled(this.centrocostoConstantesFunciones.activaridCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_empresaCentroCosto.setEnabled(this.centrocostoConstantesFunciones.activarid_empresaCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jTextFieldcodigoCentroCosto.setEnabled(this.centrocostoConstantesFunciones.activarcodigoCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jTextAreanombreCentroCosto.setEnabled(this.centrocostoConstantesFunciones.activarnombreCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jComboBoxid_centro_costoCentroCosto.setEnabled(this.centrocostoConstantesFunciones.activarid_centro_costoCentroCosto);
			this.jInternalFrameDetalleFormCentroCosto.jButtonid_centro_costoCentroCosto.setEnabled(this.centrocostoConstantesFunciones.activarid_centro_costoCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jTextFieldporcentajeCentroCosto.setEnabled(this.centrocostoConstantesFunciones.activarporcentajeCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jTextFieldvalorCentroCosto.setEnabled(this.centrocostoConstantesFunciones.activarvalorCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jTextFieldordenCentroCosto.setEnabled(this.centrocostoConstantesFunciones.activarordenCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jCheckBoxes_finalCentroCosto.setEnabled(this.centrocostoConstantesFunciones.activares_finalCentroCosto);
		this.jInternalFrameDetalleFormCentroCosto.jTextAreadescripcionCentroCosto.setEnabled(this.centrocostoConstantesFunciones.activardescripcionCentroCosto);
		}
	}
	
		
}