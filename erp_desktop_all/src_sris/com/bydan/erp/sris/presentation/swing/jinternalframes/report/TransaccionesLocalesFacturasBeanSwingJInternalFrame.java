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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.sris.util.TransaccionesLocalesFacturasConstantesFunciones;
import com.bydan.erp.sris.util.report.TransaccionesLocalesFacturasParameterReturnGeneral;
//import com.bydan.erp.sris.util.report.TransaccionesLocalesFacturasParameterGeneral;
//import com.bydan.erp.sris.presentation.report.source.report.TransaccionesLocalesFacturasBean;
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

import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.sris.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.sris.util.*;

import com.bydan.erp.sris.util.report.*;
import com.bydan.erp.sris.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.business.entity.report.*;
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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;

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
public class TransaccionesLocalesFacturasBeanSwingJInternalFrame extends TransaccionesLocalesFacturasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TransaccionesLocalesFacturasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TransaccionesLocalesFacturas> transaccioneslocalesfacturasValidator = new ClassValidator<TransaccionesLocalesFacturas>(TransaccionesLocalesFacturas.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TransaccionesLocalesFacturas transaccioneslocalesfacturas;	
	public TransaccionesLocalesFacturas transaccioneslocalesfacturasAux;
	public TransaccionesLocalesFacturas transaccioneslocalesfacturasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TransaccionesLocalesFacturas transaccioneslocalesfacturasTotales;
	public Long idTransaccionesLocalesFacturasActual;
	public Long iIdNuevoTransaccionesLocalesFacturas=0L;
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
	
	public Boolean isPermisoTodoTransaccionesLocalesFacturas;
	public Boolean isPermisoNuevoTransaccionesLocalesFacturas;
	public Boolean isPermisoActualizarTransaccionesLocalesFacturas;
	public Boolean isPermisoActualizarOriginalTransaccionesLocalesFacturas;
	public Boolean isPermisoEliminarTransaccionesLocalesFacturas;
	public Boolean isPermisoGuardarCambiosTransaccionesLocalesFacturas;
	public Boolean isPermisoConsultaTransaccionesLocalesFacturas;
	public Boolean isPermisoBusquedaTransaccionesLocalesFacturas;
	public Boolean isPermisoReporteTransaccionesLocalesFacturas;
	public Boolean isPermisoPaginacionMedioTransaccionesLocalesFacturas;
	public Boolean isPermisoPaginacionAltoTransaccionesLocalesFacturas;
	public Boolean isPermisoPaginacionTodoTransaccionesLocalesFacturas;
	public Boolean isPermisoCopiarTransaccionesLocalesFacturas;
	public Boolean isPermisoVerFormTransaccionesLocalesFacturas;
	public Boolean isPermisoDuplicarTransaccionesLocalesFacturas;
	public Boolean isPermisoOrdenTransaccionesLocalesFacturas;
	
	
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
	
	public TransaccionesLocalesFacturasParameterReturnGeneral transaccioneslocalesfacturasReturnGeneral;
	public TransaccionesLocalesFacturasParameterReturnGeneral transaccioneslocalesfacturasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTransaccionesLocalesFacturas=false;
	public Boolean esParaAccionDesdeFormularioTransaccionesLocalesFacturas=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TransaccionesLocalesFacturasSessionBeanAdditional transaccioneslocalesfacturasSessionBeanAdditional=null;
	
	public TransaccionesLocalesFacturasSessionBeanAdditional getTransaccionesLocalesFacturasSessionBeanAdditional() {
		return this.transaccioneslocalesfacturasSessionBeanAdditional;
	}
	
	public void setTransaccionesLocalesFacturasSessionBeanAdditional(TransaccionesLocalesFacturasSessionBeanAdditional transaccioneslocalesfacturasSessionBeanAdditional) {
		try {
			this.transaccioneslocalesfacturasSessionBeanAdditional=transaccioneslocalesfacturasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional transaccioneslocalesfacturasBeanSwingJInternalFrameAdditional=null;
	//public class TransaccionesLocalesFacturasBeanSwingJInternalFrame
	
	public TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional getTransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional() {
		return this.transaccioneslocalesfacturasBeanSwingJInternalFrameAdditional;
	}
	
	public void setTransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional(TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional transaccioneslocalesfacturasBeanSwingJInternalFrameAdditional) {
		try {
			this.transaccioneslocalesfacturasBeanSwingJInternalFrameAdditional=transaccioneslocalesfacturasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TransaccionesLocalesFacturasLogic transaccioneslocalesfacturasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TransaccionesLocalesFacturas transaccioneslocalesfacturasBean;
	public TransaccionesLocalesFacturasConstantesFunciones transaccioneslocalesfacturasConstantesFunciones;
	//public TransaccionesLocalesFacturasParameterReturnGeneral transaccioneslocalesfacturasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EjercicioLogic ejercicioLogic;
	
	//PARAMETROS
	
	
	//public List<TransaccionesLocalesFacturas> transaccioneslocalesfacturass;	
	//public List<TransaccionesLocalesFacturas> transaccioneslocalesfacturassEliminados;
	//public List<TransaccionesLocalesFacturas> transaccioneslocalesfacturassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTransaccionesLocalesFacturas=false;
	public Boolean isVisibilidadCeldaDuplicarTransaccionesLocalesFacturas=true;
	public Boolean isVisibilidadCeldaCopiarTransaccionesLocalesFacturas=true;
	public Boolean isVisibilidadCeldaVerFormTransaccionesLocalesFacturas=true;
	public Boolean isVisibilidadCeldaOrdenTransaccionesLocalesFacturas=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas=false;
	public Boolean isVisibilidadCeldaModificarTransaccionesLocalesFacturas=false;
	public Boolean isVisibilidadCeldaActualizarTransaccionesLocalesFacturas=false;
	public Boolean isVisibilidadCeldaEliminarTransaccionesLocalesFacturas=false;
	public Boolean isVisibilidadCeldaCancelarTransaccionesLocalesFacturas=false;
	public Boolean isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas=false;	
	
	
	public Boolean isVisibilidadBusquedaTransaccionesLocalesFacturas=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTransaccionesLocalesFacturas() {
		return this.iIdNuevoTransaccionesLocalesFacturas;
	}

	public void setiIdNuevoTransaccionesLocalesFacturas(Long iIdNuevoTransaccionesLocalesFacturas) {
		this.iIdNuevoTransaccionesLocalesFacturas = iIdNuevoTransaccionesLocalesFacturas;
	}
	
	public Long getidTransaccionesLocalesFacturasActual() {
		return this.idTransaccionesLocalesFacturasActual;
	}

	public void setidTransaccionesLocalesFacturasActual(Long idTransaccionesLocalesFacturasActual) {
		this.idTransaccionesLocalesFacturasActual = idTransaccionesLocalesFacturasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TransaccionesLocalesFacturas gettransaccioneslocalesfacturas() {
		return this.transaccioneslocalesfacturas;
	}

	public void settransaccioneslocalesfacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturas) {
		this.transaccioneslocalesfacturas = transaccioneslocalesfacturas;
	}
	
	public TransaccionesLocalesFacturas gettransaccioneslocalesfacturasAux() {
		return this.transaccioneslocalesfacturasAux;
	}

	public void settransaccioneslocalesfacturasAux(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux) {
		this.transaccioneslocalesfacturasAux = transaccioneslocalesfacturasAux;
	}				
	
	public TransaccionesLocalesFacturas gettransaccioneslocalesfacturasAnterior() {
		return this.transaccioneslocalesfacturasAnterior;
	}

	public void settransaccioneslocalesfacturasAnterior(TransaccionesLocalesFacturas transaccioneslocalesfacturasAnterior) {
		this.transaccioneslocalesfacturasAnterior = transaccioneslocalesfacturasAnterior;
	}	
	
	public TransaccionesLocalesFacturas gettransaccioneslocalesfacturasTotales() {
		return this.transaccioneslocalesfacturasTotales;
	}

	public void settransaccioneslocalesfacturasTotales(TransaccionesLocalesFacturas transaccioneslocalesfacturasTotales) {
		this.transaccioneslocalesfacturasTotales = transaccioneslocalesfacturasTotales;
	}	
	
	public TransaccionesLocalesFacturas gettransaccioneslocalesfacturasBean() {
		return this.transaccioneslocalesfacturasBean;
	}

	public void settransaccioneslocalesfacturasBean(TransaccionesLocalesFacturas transaccioneslocalesfacturasBean) {
		this.transaccioneslocalesfacturasBean = transaccioneslocalesfacturasBean;
	}	
	
	public TransaccionesLocalesFacturasParameterReturnGeneral gettransaccioneslocalesfacturasReturnGeneral() {
		return this.transaccioneslocalesfacturasReturnGeneral;
	}

	public void settransaccioneslocalesfacturasReturnGeneral(TransaccionesLocalesFacturasParameterReturnGeneral transaccioneslocalesfacturasReturnGeneral) {
		this.transaccioneslocalesfacturasReturnGeneral = transaccioneslocalesfacturasReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaTransaccionesLocalesFacturas=-1L;

	public Long getid_ejercicioBusquedaTransaccionesLocalesFacturas() {
		return this.id_ejercicioBusquedaTransaccionesLocalesFacturas;
	}

	public void setid_ejercicioBusquedaTransaccionesLocalesFacturas(Long id_ejercicioBusquedaTransaccionesLocalesFacturas) {
		this.id_ejercicioBusquedaTransaccionesLocalesFacturas = id_ejercicioBusquedaTransaccionesLocalesFacturas;
	}

;
	public Date fecha_desdeBusquedaTransaccionesLocalesFacturas=new Date();

	public Date getfecha_desdeBusquedaTransaccionesLocalesFacturas() {
		return this.fecha_desdeBusquedaTransaccionesLocalesFacturas;
	}

	public void setfecha_desdeBusquedaTransaccionesLocalesFacturas(Date fecha_desdeBusquedaTransaccionesLocalesFacturas) {
		this.fecha_desdeBusquedaTransaccionesLocalesFacturas = fecha_desdeBusquedaTransaccionesLocalesFacturas;
	}

;
	public Date fecha_hastaBusquedaTransaccionesLocalesFacturas=new Date();

	public Date getfecha_hastaBusquedaTransaccionesLocalesFacturas() {
		return this.fecha_hastaBusquedaTransaccionesLocalesFacturas;
	}

	public void setfecha_hastaBusquedaTransaccionesLocalesFacturas(Date fecha_hastaBusquedaTransaccionesLocalesFacturas) {
		this.fecha_hastaBusquedaTransaccionesLocalesFacturas = fecha_hastaBusquedaTransaccionesLocalesFacturas;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TransaccionesLocalesFacturasLogic getTransaccionesLocalesFacturasLogic()	{		
		return transaccioneslocalesfacturasLogic;
	}

	public void setTransaccionesLocalesFacturasLogic(TransaccionesLocalesFacturasLogic transaccioneslocalesfacturasLogic) {
		this.transaccioneslocalesfacturasLogic = transaccioneslocalesfacturasLogic;
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
	
	public Boolean getIsEsNuevoTransaccionesLocalesFacturas() {
		return isEsNuevoTransaccionesLocalesFacturas;
	}

	public void setIsEsNuevoTransaccionesLocalesFacturas(Boolean isEsNuevoTransaccionesLocalesFacturas) {
		this.isEsNuevoTransaccionesLocalesFacturas = isEsNuevoTransaccionesLocalesFacturas;
	}

	public Boolean getEsParaAccionDesdeFormularioTransaccionesLocalesFacturas() {
		return esParaAccionDesdeFormularioTransaccionesLocalesFacturas;
	}
	
	public void setEsParaAccionDesdeFormularioTransaccionesLocalesFacturas(Boolean esParaAccionDesdeFormularioTransaccionesLocalesFacturas) {
		this.esParaAccionDesdeFormularioTransaccionesLocalesFacturas = esParaAccionDesdeFormularioTransaccionesLocalesFacturas;
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

			if(this.transaccioneslocalesfacturasSessionBean==null) {
				this.transaccioneslocalesfacturasSessionBean=new TransaccionesLocalesFacturasSessionBean();
			}

			if(!this.transaccioneslocalesfacturasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(transaccioneslocalesfacturasSessionBean.getlidEmpresaActual());
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

			if(this.transaccioneslocalesfacturasSessionBean==null) {
				this.transaccioneslocalesfacturasSessionBean=new TransaccionesLocalesFacturasSessionBean();
			}

			if(!this.transaccioneslocalesfacturasSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(transaccioneslocalesfacturasSessionBean.getlidEjercicioActual());
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

					if(this.transaccioneslocalesfacturas!=null) {
						this.transaccioneslocalesfacturas.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
						this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_empresaTransaccionesLocalesFacturas.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTransaccionesLocalesFacturas.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
						if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_empresaTransaccionesLocalesFacturas.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_empresaTransaccionesLocalesFacturas.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTransaccionesLocalesFacturasGenerico)throws Exception
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
				jComboBoxid_empresaTransaccionesLocalesFacturasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTransaccionesLocalesFacturasGenerico!=null && jComboBoxid_empresaTransaccionesLocalesFacturasGenerico.getItemCount()>0) {
					jComboBoxid_empresaTransaccionesLocalesFacturasGenerico.setSelectedIndex(0);
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

					if(this.transaccioneslocalesfacturas!=null) {
						this.transaccioneslocalesfacturas.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
						this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_ejercicioTransaccionesLocalesFacturas.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioTransaccionesLocalesFacturas.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
						if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_ejercicioTransaccionesLocalesFacturas.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_ejercicioTransaccionesLocalesFacturas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaTransaccionesLocalesFacturas") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas!=null) {
						jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas!=null) {
							//jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioTransaccionesLocalesFacturasGenerico)throws Exception
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
				jComboBoxid_ejercicioTransaccionesLocalesFacturasGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioTransaccionesLocalesFacturasGenerico!=null && jComboBoxid_ejercicioTransaccionesLocalesFacturasGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioTransaccionesLocalesFacturasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TransaccionesLocalesFacturas transaccioneslocalesfacturas,JComboBox jComboBoxid_empresaTransaccionesLocalesFacturasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTransaccionesLocalesFacturasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_empresaTransaccionesLocalesFacturas.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTransaccionesLocalesFacturasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				transaccioneslocalesfacturas.setid_empresa(empresaAux.getId());
				transaccioneslocalesfacturas.setempresa_descripcion(TransaccionesLocalesFacturasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				transaccioneslocalesfacturas.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(TransaccionesLocalesFacturas transaccioneslocalesfacturas,JComboBox jComboBoxid_ejercicioTransaccionesLocalesFacturasGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioTransaccionesLocalesFacturasGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_ejercicioTransaccionesLocalesFacturas.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioTransaccionesLocalesFacturasGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				transaccioneslocalesfacturas.setid_ejercicio(ejercicioAux.getId());
				transaccioneslocalesfacturas.setejercicio_descripcion(TransaccionesLocalesFacturasConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				transaccioneslocalesfacturas.setEjercicio(ejercicioAux);			}
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

					if(!TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { 
							this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_empresaTransaccionesLocalesFacturas.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_empresaTransaccionesLocalesFacturas.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { 
					}

					if(!TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { 
							this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_ejercicioTransaccionesLocalesFacturas.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_ejercicioTransaccionesLocalesFacturas.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { 
					}

					if(!TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaTransaccionesLocalesFacturas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.addItem(ejercicio);
							}
						}

						if(!TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
							this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_empresaTransaccionesLocalesFacturas.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
							this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_empresaTransaccionesLocalesFacturas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
							this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_ejercicioTransaccionesLocalesFacturas.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
							this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_ejercicioTransaccionesLocalesFacturas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTransaccionesLocalesFacturas() throws Exception {
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
		
	public TransaccionesLocalesFacturasParameterReturnGeneral getTransaccionesLocalesFacturasParameterGeneral() {
		return this.transaccioneslocalesfacturasParameterGeneral;
	}
	
	public void setTransaccionesLocalesFacturasParameterGeneral(TransaccionesLocalesFacturasParameterReturnGeneral transaccioneslocalesfacturasParameterGeneral) {
		this.transaccioneslocalesfacturasParameterGeneral = transaccioneslocalesfacturasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTransaccionesLocalesFacturas() {
		return isPermisoTodoTransaccionesLocalesFacturas;
	}

	public void setIsPermisoTodoTransaccionesLocalesFacturas(Boolean isPermisoTodoTransaccionesLocalesFacturas) {
		this.isPermisoTodoTransaccionesLocalesFacturas = isPermisoTodoTransaccionesLocalesFacturas;
	}

	public Boolean getIsPermisoNuevoTransaccionesLocalesFacturas() {
		return isPermisoNuevoTransaccionesLocalesFacturas;
	}

	public void setIsPermisoNuevoTransaccionesLocalesFacturas(Boolean isPermisoNuevoTransaccionesLocalesFacturas) {
		this.isPermisoNuevoTransaccionesLocalesFacturas = isPermisoNuevoTransaccionesLocalesFacturas;
	}

	public Boolean getIsPermisoActualizarTransaccionesLocalesFacturas() {
		return isPermisoActualizarTransaccionesLocalesFacturas;
	}

	public void setIsPermisoActualizarTransaccionesLocalesFacturas(Boolean isPermisoActualizarTransaccionesLocalesFacturas) {
		this.isPermisoActualizarTransaccionesLocalesFacturas = isPermisoActualizarTransaccionesLocalesFacturas;
	}

	public Boolean getIsPermisoEliminarTransaccionesLocalesFacturas() {
		return isPermisoEliminarTransaccionesLocalesFacturas;
	}

	public void setIsPermisoEliminarTransaccionesLocalesFacturas(Boolean isPermisoEliminarTransaccionesLocalesFacturas) {
		this.isPermisoEliminarTransaccionesLocalesFacturas = isPermisoEliminarTransaccionesLocalesFacturas;
	}

	public Boolean getIsPermisoGuardarCambiosTransaccionesLocalesFacturas() {
		return isPermisoGuardarCambiosTransaccionesLocalesFacturas;
	}

	public void setIsPermisoGuardarCambiosTransaccionesLocalesFacturas(Boolean isPermisoGuardarCambiosTransaccionesLocalesFacturas) {
		this.isPermisoGuardarCambiosTransaccionesLocalesFacturas = isPermisoGuardarCambiosTransaccionesLocalesFacturas;
	}
	
	public Boolean getIsPermisoConsultaTransaccionesLocalesFacturas() {
		return isPermisoConsultaTransaccionesLocalesFacturas;
	}

	public void setIsPermisoConsultaTransaccionesLocalesFacturas(Boolean isPermisoConsultaTransaccionesLocalesFacturas) {
		this.isPermisoConsultaTransaccionesLocalesFacturas = isPermisoConsultaTransaccionesLocalesFacturas;
	}

	public Boolean getIsPermisoBusquedaTransaccionesLocalesFacturas() {
		return isPermisoBusquedaTransaccionesLocalesFacturas;
	}

	public void setIsPermisoBusquedaTransaccionesLocalesFacturas(Boolean isPermisoBusquedaTransaccionesLocalesFacturas) {
		this.isPermisoBusquedaTransaccionesLocalesFacturas = isPermisoBusquedaTransaccionesLocalesFacturas;
	}

	public Boolean getIsPermisoReporteTransaccionesLocalesFacturas() {
		return isPermisoReporteTransaccionesLocalesFacturas;
	}

	public void setIsPermisoReporteTransaccionesLocalesFacturas(Boolean isPermisoReporteTransaccionesLocalesFacturas) {
		this.isPermisoReporteTransaccionesLocalesFacturas = isPermisoReporteTransaccionesLocalesFacturas;
	}
	
	public Boolean getIsPermisoPaginacionMedioTransaccionesLocalesFacturas() {
		return isPermisoPaginacionMedioTransaccionesLocalesFacturas;
	}

	public void setIsPermisoPaginacionMedioTransaccionesLocalesFacturas(Boolean isPermisoPaginacionMedioTransaccionesLocalesFacturas) {
		this.isPermisoPaginacionMedioTransaccionesLocalesFacturas = isPermisoPaginacionMedioTransaccionesLocalesFacturas;
	}
	
	public Boolean getIsPermisoPaginacionTodoTransaccionesLocalesFacturas() {
		return isPermisoPaginacionTodoTransaccionesLocalesFacturas;
	}

	public void setIsPermisoPaginacionTodoTransaccionesLocalesFacturas(Boolean isPermisoPaginacionTodoTransaccionesLocalesFacturas) {
		this.isPermisoPaginacionTodoTransaccionesLocalesFacturas = isPermisoPaginacionTodoTransaccionesLocalesFacturas;
	}
	
	public Boolean getIsPermisoPaginacionAltoTransaccionesLocalesFacturas() {
		return isPermisoPaginacionAltoTransaccionesLocalesFacturas;
	}

	public void setIsPermisoPaginacionAltoTransaccionesLocalesFacturas(Boolean isPermisoPaginacionAltoTransaccionesLocalesFacturas) {
		this.isPermisoPaginacionAltoTransaccionesLocalesFacturas = isPermisoPaginacionAltoTransaccionesLocalesFacturas;
	}
	
	public Boolean getIsPermisoCopiarTransaccionesLocalesFacturas() {
		return isPermisoCopiarTransaccionesLocalesFacturas;
	}

	public void setIsPermisoCopiarTransaccionesLocalesFacturas(Boolean isPermisoCopiarTransaccionesLocalesFacturas) {
		this.isPermisoCopiarTransaccionesLocalesFacturas = isPermisoCopiarTransaccionesLocalesFacturas;
	}
	
	public Boolean getIsPermisoVerFormTransaccionesLocalesFacturas() {
		return isPermisoVerFormTransaccionesLocalesFacturas;
	}

	public void setIsPermisoVerFormTransaccionesLocalesFacturas(Boolean isPermisoVerFormTransaccionesLocalesFacturas) {
		this.isPermisoVerFormTransaccionesLocalesFacturas = isPermisoVerFormTransaccionesLocalesFacturas;
	}
	
	public Boolean getIsPermisoDuplicarTransaccionesLocalesFacturas() {
		return isPermisoDuplicarTransaccionesLocalesFacturas;
	}

	public void setIsPermisoDuplicarTransaccionesLocalesFacturas(Boolean isPermisoDuplicarTransaccionesLocalesFacturas) {
		this.isPermisoDuplicarTransaccionesLocalesFacturas = isPermisoDuplicarTransaccionesLocalesFacturas;
	}
	
	public Boolean getIsPermisoOrdenTransaccionesLocalesFacturas() {
		return isPermisoOrdenTransaccionesLocalesFacturas;
	}

	public void setIsPermisoOrdenTransaccionesLocalesFacturas(Boolean isPermisoOrdenTransaccionesLocalesFacturas) {
		this.isPermisoOrdenTransaccionesLocalesFacturas = isPermisoOrdenTransaccionesLocalesFacturas;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTransaccionesLocalesFacturas() {
		return isVisibilidadCeldaNuevoTransaccionesLocalesFacturas;
	}

	public void setIsVisibilidadCeldaNuevoTransaccionesLocalesFacturas(Boolean isVisibilidadCeldaNuevoTransaccionesLocalesFacturas) {
		this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas = isVisibilidadCeldaNuevoTransaccionesLocalesFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTransaccionesLocalesFacturas() {
		return isVisibilidadCeldaDuplicarTransaccionesLocalesFacturas;
	}

	public void setIsVisibilidadCeldaDuplicarTransaccionesLocalesFacturas(Boolean isVisibilidadCeldaDuplicarTransaccionesLocalesFacturas) {
		this.isVisibilidadCeldaDuplicarTransaccionesLocalesFacturas = isVisibilidadCeldaDuplicarTransaccionesLocalesFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTransaccionesLocalesFacturas() {
		return isVisibilidadCeldaCopiarTransaccionesLocalesFacturas;
	}

	public void setIsVisibilidadCeldaCopiarTransaccionesLocalesFacturas(Boolean isVisibilidadCeldaCopiarTransaccionesLocalesFacturas) {
		this.isVisibilidadCeldaCopiarTransaccionesLocalesFacturas = isVisibilidadCeldaCopiarTransaccionesLocalesFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTransaccionesLocalesFacturas() {
		return isVisibilidadCeldaVerFormTransaccionesLocalesFacturas;
	}

	public void setIsVisibilidadCeldaVerFormTransaccionesLocalesFacturas(Boolean isVisibilidadCeldaVerFormTransaccionesLocalesFacturas) {
		this.isVisibilidadCeldaVerFormTransaccionesLocalesFacturas = isVisibilidadCeldaVerFormTransaccionesLocalesFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTransaccionesLocalesFacturas() {
		return isVisibilidadCeldaOrdenTransaccionesLocalesFacturas;
	}

	public void setIsVisibilidadCeldaOrdenTransaccionesLocalesFacturas(Boolean isVisibilidadCeldaOrdenTransaccionesLocalesFacturas) {
		this.isVisibilidadCeldaOrdenTransaccionesLocalesFacturas = isVisibilidadCeldaOrdenTransaccionesLocalesFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas() {
		return isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas(Boolean isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas) {
		this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas = isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTransaccionesLocalesFacturas() {
		return isVisibilidadCeldaModificarTransaccionesLocalesFacturas;
	}

	public void setIsVisibilidadCeldaModificarTransaccionesLocalesFacturas(Boolean isVisibilidadCeldaModificarTransaccionesLocalesFacturas) {
		this.isVisibilidadCeldaModificarTransaccionesLocalesFacturas = isVisibilidadCeldaModificarTransaccionesLocalesFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTransaccionesLocalesFacturas() {
		return isVisibilidadCeldaActualizarTransaccionesLocalesFacturas;
	}

	public void setIsVisibilidadCeldaActualizarTransaccionesLocalesFacturas(Boolean isVisibilidadCeldaActualizarTransaccionesLocalesFacturas) {
		this.isVisibilidadCeldaActualizarTransaccionesLocalesFacturas = isVisibilidadCeldaActualizarTransaccionesLocalesFacturas;
	}

	public Boolean getIsVisibilidadCeldaEliminarTransaccionesLocalesFacturas() {
		return isVisibilidadCeldaEliminarTransaccionesLocalesFacturas;
	}

	public void setIsVisibilidadCeldaEliminarTransaccionesLocalesFacturas(Boolean isVisibilidadCeldaEliminarTransaccionesLocalesFacturas) {
		this.isVisibilidadCeldaEliminarTransaccionesLocalesFacturas = isVisibilidadCeldaEliminarTransaccionesLocalesFacturas;
	}

	public Boolean getIsVisibilidadCeldaCancelarTransaccionesLocalesFacturas() {
		return isVisibilidadCeldaCancelarTransaccionesLocalesFacturas;
	}

	public void setIsVisibilidadCeldaCancelarTransaccionesLocalesFacturas(Boolean isVisibilidadCeldaCancelarTransaccionesLocalesFacturas) {
		this.isVisibilidadCeldaCancelarTransaccionesLocalesFacturas = isVisibilidadCeldaCancelarTransaccionesLocalesFacturas;
	}

	public Boolean getIsVisibilidadCeldaGuardarTransaccionesLocalesFacturas() {
		return isVisibilidadCeldaGuardarTransaccionesLocalesFacturas;
	}

	public void setIsVisibilidadCeldaGuardarTransaccionesLocalesFacturas(Boolean isVisibilidadCeldaGuardarTransaccionesLocalesFacturas) {
		this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas = isVisibilidadCeldaGuardarTransaccionesLocalesFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas() {
		return isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas(Boolean isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas) {
		this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas = isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas;
	}
		
	public TransaccionesLocalesFacturasSessionBean gettransaccioneslocalesfacturasSessionBean() {
		return this.transaccioneslocalesfacturasSessionBean;
	}
	
	public void settransaccioneslocalesfacturasSessionBean(TransaccionesLocalesFacturasSessionBean transaccioneslocalesfacturasSessionBean) {
		this.transaccioneslocalesfacturasSessionBean=transaccioneslocalesfacturasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaTransaccionesLocalesFacturas() {
		return this.isVisibilidadBusquedaTransaccionesLocalesFacturas;
	}

	public void setisVisibilidadBusquedaTransaccionesLocalesFacturas(Boolean isVisibilidadBusquedaTransaccionesLocalesFacturas) {
		this.isVisibilidadBusquedaTransaccionesLocalesFacturas=isVisibilidadBusquedaTransaccionesLocalesFacturas;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturas)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(transaccioneslocalesfacturas,null);
				this.setActualParaGuardarEjercicioForeignKey(transaccioneslocalesfacturas,null);
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
	
	public void bugActualizarReferenciaActual(TransaccionesLocalesFacturas transaccioneslocalesfacturas,TransaccionesLocalesFacturas transaccioneslocalesfacturasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTransaccionesLocalesFacturas(transaccioneslocalesfacturas);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		transaccioneslocalesfacturasAux.setId(transaccioneslocalesfacturas.getId());
		transaccioneslocalesfacturasAux.setVersionRow(transaccioneslocalesfacturas.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(TransaccionesLocalesFacturas transaccioneslocalesfacturasLocal) throws Exception {
		
		if(this.transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TransaccionesLocalesFacturas transaccioneslocalesfacturasLocal) throws Exception {	
		if(this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				transaccioneslocalesfacturasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				transaccioneslocalesfacturasLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTransaccionesLocalesFacturasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = transaccioneslocalesfacturasValidator.getInvalidValues(this.transaccioneslocalesfacturas);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TransaccionesLocalesFacturas transaccioneslocalesfacturas,List<TransaccionesLocalesFacturas> transaccioneslocalesfacturass) throws Exception {
	}		
	
	public void actualizarSelectedLista(TransaccionesLocalesFacturas transaccioneslocalesfacturas,List<TransaccionesLocalesFacturas> transaccioneslocalesfacturass) throws Exception {
		try	{			
			TransaccionesLocalesFacturasConstantesFunciones.actualizarSelectedLista(transaccioneslocalesfacturas,transaccioneslocalesfacturass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TransaccionesLocalesFacturas> transaccioneslocalesfacturassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				transaccioneslocalesfacturassLocal=this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				transaccioneslocalesfacturassLocal=this.transaccioneslocalesfacturass;
			}
			//ARCHITECTURE
		
			for(TransaccionesLocalesFacturas transaccioneslocalesfacturasLocal:transaccioneslocalesfacturassLocal) {
				if(this.permiteMantenimiento(transaccioneslocalesfacturasLocal) && transaccioneslocalesfacturasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TransaccionesLocalesFacturasConstantesFunciones.getTransaccionesLocalesFacturasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TransaccionesLocalesFacturasConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelnombre_completo_clienteTransaccionesLocalesFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionesLocalesFacturasConstantesFunciones.TOTALIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabeltotal_ivaTransaccionesLocalesFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionesLocalesFacturasConstantesFunciones.TOTALSINIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabeltotal_sin_ivaTransaccionesLocalesFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionesLocalesFacturasConstantesFunciones.TOTALDESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabeltotal_descuentoTransaccionesLocalesFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionesLocalesFacturasConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabeltotalTransaccionesLocalesFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionesLocalesFacturasConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelivaTransaccionesLocalesFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionesLocalesFacturasConstantesFunciones.RUCCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelruc_clienteTransaccionesLocalesFacturas,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelnombre_completo_clienteTransaccionesLocalesFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabeltotal_ivaTransaccionesLocalesFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabeltotal_sin_ivaTransaccionesLocalesFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabeltotal_descuentoTransaccionesLocalesFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabeltotalTransaccionesLocalesFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelivaTransaccionesLocalesFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelruc_clienteTransaccionesLocalesFacturas,"");
		
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
		this.iIdNuevoTransaccionesLocalesFacturas--;	
		
		
		this.transaccioneslocalesfacturasAux=new TransaccionesLocalesFacturas();
		
		this.transaccioneslocalesfacturasAux.setId(this.iIdNuevoTransaccionesLocalesFacturas);
		this.transaccioneslocalesfacturasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().add(this.transaccioneslocalesfacturasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.transaccioneslocalesfacturass.add(this.transaccioneslocalesfacturasAux);
		}
		//ARCHITECTURE
		
		this.transaccioneslocalesfacturas=this.transaccioneslocalesfacturasAux;
		
		if(TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
			this.setVariablesObjetoActualToFormularioForeignKeyTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
		}
				
		//this.setDefaultControlesTransaccionesLocalesFacturas();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTransaccionesLocalesFacturas();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTransaccionesLocalesFacturas();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransaccionesLocalesFacturas();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturasBean,this.transaccioneslocalesfacturas,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTransaccionesLocalesFacturas(this.transaccioneslocalesfacturasReturnGeneral,this.transaccioneslocalesfacturasBean,false);
		
		if(this.transaccioneslocalesfacturasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTransaccionesLocalesFacturas(this.transaccioneslocalesfacturasReturnGeneral.getTransaccionesLocalesFacturas());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTransaccionesLocalesFacturas(this.transaccioneslocalesfacturasReturnGeneral.getTransaccionesLocalesFacturas());
		}
		
		if(this.transaccioneslocalesfacturasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTransaccionesLocalesFacturas(this.transaccioneslocalesfacturasReturnGeneral.getTransaccionesLocalesFacturas(),classes);//this.transaccioneslocalesfacturasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTransaccionesLocalesFacturas();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTransaccionesLocalesFacturas();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.RecargarFormTransaccionesLocalesFacturas(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
						
			if(transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransaccionesLocalesFacturas();
			}
			
			this.actualizarVisualTableDatosTransaccionesLocalesFacturas();
			
			this.jTableDatosTransaccionesLocalesFacturas.setRowSelectionInterval(this.getIndiceNuevoTransaccionesLocalesFacturas(), this.getIndiceNuevoTransaccionesLocalesFacturas());
			
			this.seleccionarFilaTablaTransaccionesLocalesFacturasActual();
						
			this.actualizarEstadoCeldasBotonesTransaccionesLocalesFacturas("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTransaccionesLocalesFacturas(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jDateChooserfecha_desdeTransaccionesLocalesFacturas.setEnabled(isHabilitar && this.transaccioneslocalesfacturasConstantesFunciones.activarfecha_desdeTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jDateChooserfecha_hastaTransaccionesLocalesFacturas.setEnabled(isHabilitar && this.transaccioneslocalesfacturasConstantesFunciones.activarfecha_hastaTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextAreanombre_completo_clienteTransaccionesLocalesFacturas.setEnabled(isHabilitar && this.transaccioneslocalesfacturasConstantesFunciones.activarnombre_completo_clienteTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_ivaTransaccionesLocalesFacturas.setEnabled(isHabilitar && this.transaccioneslocalesfacturasConstantesFunciones.activartotal_ivaTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas.setEnabled(isHabilitar && this.transaccioneslocalesfacturasConstantesFunciones.activartotal_sin_ivaTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_descuentoTransaccionesLocalesFacturas.setEnabled(isHabilitar && this.transaccioneslocalesfacturasConstantesFunciones.activartotal_descuentoTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotalTransaccionesLocalesFacturas.setEnabled(isHabilitar && this.transaccioneslocalesfacturasConstantesFunciones.activartotalTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldivaTransaccionesLocalesFacturas.setEnabled(isHabilitar && this.transaccioneslocalesfacturasConstantesFunciones.activarivaTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldruc_clienteTransaccionesLocalesFacturas.setEnabled(isHabilitar && this.transaccioneslocalesfacturasConstantesFunciones.activarruc_clienteTransaccionesLocalesFacturas);	
		//
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_empresaTransaccionesLocalesFacturas.setEnabled(isHabilitar && this.transaccioneslocalesfacturasConstantesFunciones.activarid_empresaTransaccionesLocalesFacturas);//
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_ejercicioTransaccionesLocalesFacturas.setEnabled(isHabilitar && this.transaccioneslocalesfacturasConstantesFunciones.activarid_ejercicioTransaccionesLocalesFacturas);
	};
	
	public void setDefaultControlesTransaccionesLocalesFacturas() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTransaccionesLocalesFacturas(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.transaccioneslocalesfacturasSessionBean.setConGuardarRelaciones(true);			
			this.transaccioneslocalesfacturasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTabbedPaneRelacionesTransaccionesLocalesFacturas.setVisible(true);
			
					
		} else {
			//this.transaccioneslocalesfacturasSessionBean.setConGuardarRelaciones(false);			
			this.transaccioneslocalesfacturasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTabbedPaneRelacionesTransaccionesLocalesFacturas.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTransaccionesLocalesFacturas() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass()) {
				if(transaccioneslocalesfacturasAux.getId().equals(this.iIdNuevoTransaccionesLocalesFacturas)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:this.transaccioneslocalesfacturass) {
				if(transaccioneslocalesfacturasAux.getId().equals(this.iIdNuevoTransaccionesLocalesFacturas)) {
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
	
	public int getIndiceActualTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturas,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass()) {
				if(transaccioneslocalesfacturasAux.getId().equals(transaccioneslocalesfacturas.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:this.transaccioneslocalesfacturass) {
				if(transaccioneslocalesfacturasAux.getId().equals(transaccioneslocalesfacturas.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass()) {
				if(transaccioneslocalesfacturasAux.getTransaccionesLocalesFacturasOriginal().getId().equals(transaccioneslocalesfacturasOriginal.getId())) {
					existe=true;
					transaccioneslocalesfacturasOriginal.setId(transaccioneslocalesfacturasAux.getId());
					transaccioneslocalesfacturasOriginal.setVersionRow(transaccioneslocalesfacturasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:this.transaccioneslocalesfacturass) {
				if(transaccioneslocalesfacturasAux.getTransaccionesLocalesFacturasOriginal().getId().equals(transaccioneslocalesfacturasOriginal.getId())) {
					existe=true;
					transaccioneslocalesfacturasOriginal.setId(transaccioneslocalesfacturasAux.getId());
					transaccioneslocalesfacturasOriginal.setVersionRow(transaccioneslocalesfacturasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTransaccionesLocalesFacturas(Boolean esParaCancelar) throws Exception {
		transaccioneslocalesfacturassAux=new ArrayList<TransaccionesLocalesFacturas>();
		transaccioneslocalesfacturasAux=new TransaccionesLocalesFacturas();
		
		if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass()) {
					if(transaccioneslocalesfacturasAux.getId()<0) {
						transaccioneslocalesfacturassAux.add(transaccioneslocalesfacturasAux);
					}		
				}
				this.iIdNuevoTransaccionesLocalesFacturas=0L;
				this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().removeAll(transaccioneslocalesfacturassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:this.transaccioneslocalesfacturass) {
					if(transaccioneslocalesfacturasAux.getId()<0) {
						transaccioneslocalesfacturassAux.add(transaccioneslocalesfacturasAux);
					}		
				}
				this.iIdNuevoTransaccionesLocalesFacturas=0L;
				this.transaccioneslocalesfacturass.removeAll(transaccioneslocalesfacturassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTransaccionesLocalesFacturas 
					&& this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().size()>0
					) {
					transaccioneslocalesfacturasAux=this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().get(this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().size() - 1);
				
					if(transaccioneslocalesfacturasAux.getId()<0) {
						this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().remove(transaccioneslocalesfacturasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTransaccionesLocalesFacturas && this.transaccioneslocalesfacturass.size()>0) {
					transaccioneslocalesfacturasAux=this.transaccioneslocalesfacturass.get(this.transaccioneslocalesfacturass.size() - 1);
				
					if(transaccioneslocalesfacturasAux.getId()<0) {
						this.transaccioneslocalesfacturass.remove(transaccioneslocalesfacturasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTransaccionesLocalesFacturas(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(transaccioneslocalesfacturas.getId()<0) {
				this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().remove(this.transaccioneslocalesfacturas);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(transaccioneslocalesfacturas.getId()<0) {
				this.transaccioneslocalesfacturass.remove(this.transaccioneslocalesfacturas);
			}
		}			
	}
	
	public void setEstadosInicialesTransaccionesLocalesFacturas(List<TransaccionesLocalesFacturas> transaccioneslocalesfacturassAux) throws Exception {
		TransaccionesLocalesFacturasConstantesFunciones.setEstadosInicialesTransaccionesLocalesFacturas(transaccioneslocalesfacturassAux);
	}
	
	public void setEstadosInicialesTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux) throws Exception {
		TransaccionesLocalesFacturasConstantesFunciones.setEstadosInicialesTransaccionesLocalesFacturas(transaccioneslocalesfacturasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTransaccionesLocalesFacturasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTransaccionesLocalesFacturas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTransaccionesLocalesFacturasActual()) {
				if(!this.isEsNuevoTransaccionesLocalesFacturas) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTransaccionesLocalesFacturas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTransaccionesLocalesFacturas=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTransaccionesLocalesFacturasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Transacciones Locales Facturas ?", "MANTENIMIENTO DE Transacciones Locales Facturas", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTransaccionesLocalesFacturas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TransaccionesLocalesFacturas transaccioneslocalesfacturas) throws Exception {
		TransaccionesLocalesFacturasConstantesFunciones.seleccionarAsignar(this.transaccioneslocalesfacturas,transaccioneslocalesfacturas);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTransaccionesLocalesFacturas=this.isPermisoActualizarOriginalTransaccionesLocalesFacturas;
			
			
			this.seleccionarAsignar(transaccioneslocalesfacturas);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesTransaccionesLocalesFacturas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.transaccioneslocalesfacturasSessionBean.setsFuncionBusquedaRapida(this.transaccioneslocalesfacturasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTransaccionesLocalesFacturas) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTransaccionesLocalesFacturas(esParaCancelar);				
				this.cancelarNuevoTransaccionesLocalesFacturas(esParaCancelar);								
			}
			
			this.transaccioneslocalesfacturas=new TransaccionesLocalesFacturas();
			
			this.inicializarTransaccionesLocalesFacturas();
			
			this.actualizarEstadoCeldasBotonesTransaccionesLocalesFacturas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTransaccionesLocalesFacturas() throws Exception {
		try {
			TransaccionesLocalesFacturasConstantesFunciones.inicializarTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
			
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
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTransaccionesLocalesFacturass(String sAccionBusqueda,List<TransaccionesLocalesFacturas> transaccioneslocalesfacturassParaReportes) throws Exception {
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
					sPathReporteFinal="TransaccionesLocalesFacturas"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TransaccionesLocalesFacturasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TransaccionesLocalesFacturasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TransaccionesLocalesFacturas"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Transacciones Locales Facturases");		
		parameters.put("busquedapor", TransaccionesLocalesFacturasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTransaccionesLocalesFacturas=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TransaccionesLocalesFacturasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TransaccionesLocalesFacturasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTransaccionesLocalesFacturas=new JRBeanArrayDataSource(TransaccionesLocalesFacturasJInternalFrame.TraerTransaccionesLocalesFacturasBeans(transaccioneslocalesfacturassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTransaccionesLocalesFacturas);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TransaccionesLocalesFacturasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TransaccionesLocalesFacturasBean.TraerTransaccionesLocalesFacturasBeans(transaccioneslocalesfacturassParaReportes).toArray()));
							
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
				this.generarExcelReporteTransaccionesLocalesFacturass(sAccionBusqueda,sTipoArchivoReporte,transaccioneslocalesfacturassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTransaccionesLocalesFacturass(sAccionBusqueda,sTipoArchivoReporte,transaccioneslocalesfacturassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTransaccionesLocalesFacturasActionPerformed(null);
					//this.generarExcelReporteTransaccionesLocalesFacturass(sAccionBusqueda,sTipoArchivoReporte,transaccioneslocalesfacturassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTransaccionesLocalesFacturass(sAccionBusqueda,sTipoArchivoReporte,transaccioneslocalesfacturassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTransaccionesLocalesFacturass(sAccionBusqueda,sTipoArchivoReporte,transaccioneslocalesfacturassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTransaccionesLocalesFacturass(sAccionBusqueda,sTipoArchivoReporte,transaccioneslocalesfacturassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTransaccionesLocalesFacturass(String sAccionBusqueda,String sTipoArchivoReporte,List<TransaccionesLocalesFacturas> transaccioneslocalesfacturassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioneslocalesfacturas";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TransaccionesLocalesFacturass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransaccionesLocalesFacturas("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TransaccionesLocalesFacturas transaccioneslocalesfacturas : transaccioneslocalesfacturassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TransaccionesLocalesFacturasConstantesFunciones.generarExcelReporteDataTransaccionesLocalesFacturas("NORMAL",row,workbook,transaccioneslocalesfacturas,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transacciones Locales Facturas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTransaccionesLocalesFacturas(String sTipo,Row row,Workbook workbook) {
		
		TransaccionesLocalesFacturasConstantesFunciones.generarExcelReporteHeaderTransaccionesLocalesFacturas(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTransaccionesLocalesFacturass(String sAccionBusqueda,String sTipoArchivoReporte,List<TransaccionesLocalesFacturas> transaccioneslocalesfacturassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioneslocalesfacturas_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TransaccionesLocalesFacturass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TransaccionesLocalesFacturas transaccioneslocalesfacturas : transaccioneslocalesfacturassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.getTransaccionesLocalesFacturasDescripcion(transaccioneslocalesfacturas));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesfacturas.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesfacturas.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesfacturas.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesfacturas.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesfacturas.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesfacturas.gettotal_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALSINIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALSINIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesfacturas.gettotal_sin_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALDESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALDESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesfacturas.gettotal_descuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesfacturas.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesfacturas.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionesLocalesFacturasConstantesFunciones.LABEL_RUCCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_RUCCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioneslocalesfacturas.getruc_cliente());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transacciones Locales Facturas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTransaccionesLocalesFacturass(String sAccionBusqueda,String sTipoArchivoReporte,List<TransaccionesLocalesFacturas> transaccioneslocalesfacturassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TransaccionesLocalesFacturas> transaccioneslocalesfacturassRespaldo=null;
		
		classes=TransaccionesLocalesFacturasConstantesFunciones.getClassesRelationshipsOfTransaccionesLocalesFacturas(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.transaccioneslocalesfacturasLogic.setDatosCliente(this.datosCliente);
		this.transaccioneslocalesfacturasLogic.setDatosDeep(this.datosDeep);
		this.transaccioneslocalesfacturasLogic.setIsConDeep(true);
		
		transaccioneslocalesfacturassRespaldo=this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass();
		
		this.transaccioneslocalesfacturasLogic.setTransaccionesLocalesFacturass(transaccioneslocalesfacturassParaReportes);	
		this.transaccioneslocalesfacturasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		transaccioneslocalesfacturassParaReportes=this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass();
		this.transaccioneslocalesfacturasLogic.setTransaccionesLocalesFacturass(transaccioneslocalesfacturassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioneslocalesfacturas_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TransaccionesLocalesFacturass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransaccionesLocalesFacturas("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TransaccionesLocalesFacturas transaccioneslocalesfacturas : transaccioneslocalesfacturassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTransaccionesLocalesFacturas("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TransaccionesLocalesFacturasConstantesFunciones.generarExcelReporteDataTransaccionesLocalesFacturas("NORMAL",row,workbook,transaccioneslocalesfacturas,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.getTransaccionesLocalesFacturasDescripcion(transaccioneslocalesfacturas));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transacciones Locales Facturas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTransaccionesLocalesFacturas() throws Exception {		
		this.startProcessTransaccionesLocalesFacturas(true);
	}
	
	public void startProcessTransaccionesLocalesFacturas(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTransaccionesLocalesFacturas ,this.jPanelParametrosReportesTransaccionesLocalesFacturas, this.jScrollPanelDatosTransaccionesLocalesFacturas,this.jPanelPaginacionTransaccionesLocalesFacturas, this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas, this.jPanelAccionesTransaccionesLocalesFacturas,this.jPanelAccionesFormularioTransaccionesLocalesFacturas,this.jmenuBarTransaccionesLocalesFacturas,this.jmenuBarDetalleTransaccionesLocalesFacturas,this.jTtoolBarTransaccionesLocalesFacturas,this.jTtoolBarDetalleTransaccionesLocalesFacturas);		
		
		final JTabbedPane jTabbedPaneBusquedasTransaccionesLocalesFacturas=this.jTabbedPaneBusquedasTransaccionesLocalesFacturas; 
		
		final JPanel jPanelParametrosReportesTransaccionesLocalesFacturas=this.jPanelParametrosReportesTransaccionesLocalesFacturas;
		//final JScrollPane jScrollPanelDatosTransaccionesLocalesFacturas=this.jScrollPanelDatosTransaccionesLocalesFacturas;
		final JTable jTableDatosTransaccionesLocalesFacturas=this.jTableDatosTransaccionesLocalesFacturas;		
		final JPanel jPanelPaginacionTransaccionesLocalesFacturas=this.jPanelPaginacionTransaccionesLocalesFacturas;
		//final JScrollPane jScrollPanelDatosEdicionTransaccionesLocalesFacturas=this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas;
		final JPanel jPanelAccionesTransaccionesLocalesFacturas=this.jPanelAccionesTransaccionesLocalesFacturas;
		
		JPanel jPanelCamposAuxiliarTransaccionesLocalesFacturas=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTransaccionesLocalesFacturas=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
			jPanelCamposAuxiliarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jPanelCamposTransaccionesLocalesFacturas;
			jPanelAccionesFormularioAuxiliarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jPanelAccionesFormularioTransaccionesLocalesFacturas;
		}
		
		final JPanel jPanelCamposTransaccionesLocalesFacturas=jPanelCamposAuxiliarTransaccionesLocalesFacturas;
		final JPanel jPanelAccionesFormularioTransaccionesLocalesFacturas=jPanelAccionesFormularioAuxiliarTransaccionesLocalesFacturas;
		
		
		final JMenuBar jmenuBarTransaccionesLocalesFacturas=this.jmenuBarTransaccionesLocalesFacturas;
		final JToolBar jTtoolBarTransaccionesLocalesFacturas=this.jTtoolBarTransaccionesLocalesFacturas;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTransaccionesLocalesFacturas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransaccionesLocalesFacturas=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
			jmenuBarDetalleAuxiliarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jmenuBarDetalleTransaccionesLocalesFacturas;
			jTtoolBarDetalleAuxiliarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTtoolBarDetalleTransaccionesLocalesFacturas;
		}
		
		final JMenuBar jmenuBarDetalleTransaccionesLocalesFacturas=jmenuBarDetalleAuxiliarTransaccionesLocalesFacturas;
		final JToolBar jTtoolBarDetalleTransaccionesLocalesFacturas=jTtoolBarDetalleAuxiliarTransaccionesLocalesFacturas;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransaccionesLocalesFacturas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransaccionesLocalesFacturas;
			processRunnable.jTableDatos=jTableDatosTransaccionesLocalesFacturas;
			processRunnable.jPanelCampos=jPanelCamposTransaccionesLocalesFacturas;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransaccionesLocalesFacturas;
			processRunnable.jPanelAcciones=jPanelAccionesTransaccionesLocalesFacturas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransaccionesLocalesFacturas;
			
			
			processRunnable.jmenuBar=jmenuBarTransaccionesLocalesFacturas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransaccionesLocalesFacturas;
			processRunnable.jTtoolBar=jTtoolBarTransaccionesLocalesFacturas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransaccionesLocalesFacturas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransaccionesLocalesFacturas ,jPanelParametrosReportesTransaccionesLocalesFacturas,jTableDatosTransaccionesLocalesFacturas, /*jScrollPanelDatosTransaccionesLocalesFacturas,*/jPanelCamposTransaccionesLocalesFacturas,jPanelPaginacionTransaccionesLocalesFacturas, /*jScrollPanelDatosEdicionTransaccionesLocalesFacturas,*/ jPanelAccionesTransaccionesLocalesFacturas,jPanelAccionesFormularioTransaccionesLocalesFacturas,jmenuBarTransaccionesLocalesFacturas,jmenuBarDetalleTransaccionesLocalesFacturas,jTtoolBarTransaccionesLocalesFacturas,jTtoolBarDetalleTransaccionesLocalesFacturas);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransaccionesLocalesFacturas ,jPanelParametrosReportesTransaccionesLocalesFacturas, jScrollPanelDatosTransaccionesLocalesFacturas,jPanelPaginacionTransaccionesLocalesFacturas, jScrollPanelDatosEdicionTransaccionesLocalesFacturas, jPanelAccionesTransaccionesLocalesFacturas,jPanelAccionesFormularioTransaccionesLocalesFacturas,jmenuBarTransaccionesLocalesFacturas,jmenuBarDetalleTransaccionesLocalesFacturas,jTtoolBarTransaccionesLocalesFacturas,jTtoolBarDetalleTransaccionesLocalesFacturas);
						
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
	
	public void finishProcessTransaccionesLocalesFacturas() {// throws Exception 
		this.finishProcessTransaccionesLocalesFacturas(true);
	}
	
	public void finishProcessTransaccionesLocalesFacturas(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTransaccionesLocalesFacturas ,this.jPanelParametrosReportesTransaccionesLocalesFacturas, this.jScrollPanelDatosTransaccionesLocalesFacturas,this.jPanelPaginacionTransaccionesLocalesFacturas, this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas, this.jPanelAccionesTransaccionesLocalesFacturas,this.jPanelAccionesFormularioTransaccionesLocalesFacturas,this.jmenuBarTransaccionesLocalesFacturas,this.jmenuBarDetalleTransaccionesLocalesFacturas,this.jTtoolBarTransaccionesLocalesFacturas,this.jTtoolBarDetalleTransaccionesLocalesFacturas);		
		
		final JTabbedPane jTabbedPaneBusquedasTransaccionesLocalesFacturas=this.jTabbedPaneBusquedasTransaccionesLocalesFacturas; 
		
		final JPanel jPanelParametrosReportesTransaccionesLocalesFacturas=this.jPanelParametrosReportesTransaccionesLocalesFacturas;
		//final JScrollPane jScrollPanelDatosTransaccionesLocalesFacturas=this.jScrollPanelDatosTransaccionesLocalesFacturas;
		final JTable jTableDatosTransaccionesLocalesFacturas=this.jTableDatosTransaccionesLocalesFacturas;		
		final JPanel jPanelPaginacionTransaccionesLocalesFacturas=this.jPanelPaginacionTransaccionesLocalesFacturas;
		//final JScrollPane jScrollPanelDatosEdicionTransaccionesLocalesFacturas=this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas;
		final JPanel jPanelAccionesTransaccionesLocalesFacturas=this.jPanelAccionesTransaccionesLocalesFacturas;
		
		JPanel jPanelCamposAuxiliarTransaccionesLocalesFacturas=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTransaccionesLocalesFacturas=new JPanel();
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
			jPanelCamposAuxiliarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jPanelCamposTransaccionesLocalesFacturas;
			jPanelAccionesFormularioAuxiliarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jPanelAccionesFormularioTransaccionesLocalesFacturas;
		}
		
		final JPanel jPanelCamposTransaccionesLocalesFacturas=jPanelCamposAuxiliarTransaccionesLocalesFacturas;
		final JPanel jPanelAccionesFormularioTransaccionesLocalesFacturas=jPanelAccionesFormularioAuxiliarTransaccionesLocalesFacturas;
		
		
		final JMenuBar jmenuBarTransaccionesLocalesFacturas=this.jmenuBarTransaccionesLocalesFacturas;		
		final JToolBar jTtoolBarTransaccionesLocalesFacturas=this.jTtoolBarTransaccionesLocalesFacturas;
				
		JMenuBar jmenuBarDetalleAuxiliarTransaccionesLocalesFacturas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransaccionesLocalesFacturas=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
			jmenuBarDetalleAuxiliarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jmenuBarDetalleTransaccionesLocalesFacturas;
			jTtoolBarDetalleAuxiliarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTtoolBarDetalleTransaccionesLocalesFacturas;		
		}
		
		final JMenuBar jmenuBarDetalleTransaccionesLocalesFacturas=jmenuBarDetalleAuxiliarTransaccionesLocalesFacturas;
		final JToolBar jTtoolBarDetalleTransaccionesLocalesFacturas=jTtoolBarDetalleAuxiliarTransaccionesLocalesFacturas;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransaccionesLocalesFacturas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransaccionesLocalesFacturas;
			processRunnable.jTableDatos=jTableDatosTransaccionesLocalesFacturas;
			processRunnable.jPanelCampos=jPanelCamposTransaccionesLocalesFacturas;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransaccionesLocalesFacturas;
			processRunnable.jPanelAcciones=jPanelAccionesTransaccionesLocalesFacturas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransaccionesLocalesFacturas;
			
			
			processRunnable.jmenuBar=jmenuBarTransaccionesLocalesFacturas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransaccionesLocalesFacturas;
			processRunnable.jTtoolBar=jTtoolBarTransaccionesLocalesFacturas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransaccionesLocalesFacturas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTransaccionesLocalesFacturas ,jPanelParametrosReportesTransaccionesLocalesFacturas, jTableDatosTransaccionesLocalesFacturas,/*jScrollPanelDatosTransaccionesLocalesFacturas,*/jPanelCamposTransaccionesLocalesFacturas,jPanelPaginacionTransaccionesLocalesFacturas, /*jScrollPanelDatosEdicionTransaccionesLocalesFacturas,*/ jPanelAccionesTransaccionesLocalesFacturas,jPanelAccionesFormularioTransaccionesLocalesFacturas,jmenuBarTransaccionesLocalesFacturas,jmenuBarDetalleTransaccionesLocalesFacturas,jTtoolBarTransaccionesLocalesFacturas,jTtoolBarDetalleTransaccionesLocalesFacturas));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTransaccionesLocalesFacturas(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTransaccionesLocalesFacturas(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTransaccionesLocalesFacturas(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTransaccionesLocalesFacturas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTransaccionesLocalesFacturas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTransaccionesLocalesFacturas,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTransaccionesLocalesFacturas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTransaccionesLocalesFacturas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTransaccionesLocalesFacturas,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.transaccioneslocalesfacturasConstantesFunciones.getsFinalQueryTransaccionesLocalesFacturas();
		String  finalQueryPaginacionTodos=this.transaccioneslocalesfacturasConstantesFunciones.getsFinalQueryTransaccionesLocalesFacturas();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TransaccionesLocalesFacturasConstantesFunciones.getArrayColumnasGlobalesNoTransaccionesLocalesFacturas(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TransaccionesLocalesFacturasConstantesFunciones.getArrayColumnasGlobalesTransaccionesLocalesFacturas(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TransaccionesLocalesFacturasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.transaccioneslocalesfacturassEliminados= new ArrayList<TransaccionesLocalesFacturas>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTransaccionesLocalesFacturas();
		
				///*TransaccionesLocalesFacturasSessionBean*/this.transaccioneslocalesfacturasSessionBean=new TransaccionesLocalesFacturasSessionBean();
			
			if(this.transaccioneslocalesfacturasSessionBean==null) {
				this.transaccioneslocalesfacturasSessionBean=new TransaccionesLocalesFacturasSessionBean();
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
					this.iNumeroPaginacion=TransaccionesLocalesFacturasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TransaccionesLocalesFacturasConstantesFunciones.getClassesForeignKeysOfTransaccionesLocalesFacturas(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/transaccioneslocalesfacturas."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			transaccioneslocalesfacturassAux= new ArrayList<TransaccionesLocalesFacturas>();
			
				
			transaccioneslocalesfacturasLogic.setDatosCliente(this.datosCliente);
			transaccioneslocalesfacturasLogic.setDatosDeep(this.datosDeep);
			transaccioneslocalesfacturasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaTransaccionesLocalesFacturas")) {
				this.sDetalleReporte=TransaccionesLocalesFacturasConstantesFunciones.getDetalleIndiceBusquedaTransaccionesLocalesFacturas(id_ejercicioBusquedaTransaccionesLocalesFacturas,fecha_desdeBusquedaTransaccionesLocalesFacturas,fecha_hastaBusquedaTransaccionesLocalesFacturas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturassBusquedaTransaccionesLocalesFacturas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaTransaccionesLocalesFacturas,fecha_desdeBusquedaTransaccionesLocalesFacturas,fecha_hastaBusquedaTransaccionesLocalesFacturas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionesLocalesFacturasConstantesFunciones.getDetalleIndiceBusquedaTransaccionesLocalesFacturas(id_ejercicioBusquedaTransaccionesLocalesFacturas,fecha_desdeBusquedaTransaccionesLocalesFacturas,fecha_hastaBusquedaTransaccionesLocalesFacturas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionesLocalesFacturasConstantesFunciones.getDetalleIndiceBusquedaTransaccionesLocalesFacturas(id_ejercicioBusquedaTransaccionesLocalesFacturas,fecha_desdeBusquedaTransaccionesLocalesFacturas,fecha_hastaBusquedaTransaccionesLocalesFacturas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass()==null||transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccioneslocalesfacturass==null|| transaccioneslocalesfacturass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioneslocalesfacturassAux=new ArrayList<TransaccionesLocalesFacturas>();
						transaccioneslocalesfacturassAux.addAll(transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioneslocalesfacturassAux=new ArrayList<TransaccionesLocalesFacturas>();
							transaccioneslocalesfacturassAux.addAll(transaccioneslocalesfacturass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturassBusquedaTransaccionesLocalesFacturas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaTransaccionesLocalesFacturas,fecha_desdeBusquedaTransaccionesLocalesFacturas,fecha_hastaBusquedaTransaccionesLocalesFacturas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionesLocalesFacturasConstantesFunciones.getDetalleIndiceBusquedaTransaccionesLocalesFacturas(id_ejercicioBusquedaTransaccionesLocalesFacturas,fecha_desdeBusquedaTransaccionesLocalesFacturas,fecha_hastaBusquedaTransaccionesLocalesFacturas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionesLocalesFacturasConstantesFunciones.getDetalleIndiceBusquedaTransaccionesLocalesFacturas(id_ejercicioBusquedaTransaccionesLocalesFacturas,fecha_desdeBusquedaTransaccionesLocalesFacturas,fecha_hastaBusquedaTransaccionesLocalesFacturas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccionesLocalesFacturass("BusquedaTransaccionesLocalesFacturas",transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccionesLocalesFacturass("BusquedaTransaccionesLocalesFacturas",transaccioneslocalesfacturass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioneslocalesfacturasLogic.setTransaccionesLocalesFacturass(new ArrayList<TransaccionesLocalesFacturas>());
						transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().addAll(transaccioneslocalesfacturassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioneslocalesfacturass=new ArrayList<TransaccionesLocalesFacturas>();
							transaccioneslocalesfacturass.addAll(transaccioneslocalesfacturassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTransaccionesLocalesFacturas();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTransaccionesLocalesFacturas();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccioneslocalesfacturass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccioneslocalesfacturass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TransaccionesLocalesFacturas transaccioneslocalesfacturas) {
		Boolean permite=true;
		
		if(this.transaccioneslocalesfacturas.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TransaccionesLocalesFacturasConstantesFunciones.getOrderByListaTransaccionesLocalesFacturas();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TransaccionesLocalesFacturasConstantesFunciones.getOrderByListaTransaccionesLocalesFacturas();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionesLocalesFacturas transaccioneslocalesfacturas:transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass()) {
				if(transaccioneslocalesfacturas.getsType().equals(Constantes2.S_TOTALES)) {
					transaccioneslocalesfacturasTotales=transaccioneslocalesfacturas;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionesLocalesFacturas transaccioneslocalesfacturas:this.transaccioneslocalesfacturass) {
				if(transaccioneslocalesfacturas.getsType().equals(Constantes2.S_TOTALES)) {
					transaccioneslocalesfacturasTotales=transaccioneslocalesfacturas;
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
			this.transaccioneslocalesfacturasAux=new TransaccionesLocalesFacturas();
			this.transaccioneslocalesfacturasAux.setsType(Constantes2.S_TOTALES);
			this.transaccioneslocalesfacturasAux.setIsNew(false);
			this.transaccioneslocalesfacturasAux.setIsChanged(false);
			this.transaccioneslocalesfacturasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//TransaccionesLocalesFacturasConstantesFunciones.TotalizarValoresFilaTransaccionesLocalesFacturas(this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass(),this.transaccioneslocalesfacturasAux);
				
				//this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().add(this.transaccioneslocalesfacturasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TransaccionesLocalesFacturasConstantesFunciones.TotalizarValoresFilaTransaccionesLocalesFacturas(this.transaccioneslocalesfacturass,this.transaccioneslocalesfacturasAux);
				
				this.transaccioneslocalesfacturass.add(this.transaccioneslocalesfacturasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		transaccioneslocalesfacturasTotales=new TransaccionesLocalesFacturas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().remove(transaccioneslocalesfacturasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transaccioneslocalesfacturass.remove(transaccioneslocalesfacturasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		transaccioneslocalesfacturasTotales=new TransaccionesLocalesFacturas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionesLocalesFacturas transaccioneslocalesfacturas:transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass()) {
				if(transaccioneslocalesfacturas.getsType().equals(Constantes2.S_TOTALES)) {
					transaccioneslocalesfacturasTotales=transaccioneslocalesfacturas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransaccionesLocalesFacturasConstantesFunciones.TotalizarValoresFilaTransaccionesLocalesFacturas(this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass(),transaccioneslocalesfacturasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionesLocalesFacturas transaccioneslocalesfacturas:this.transaccioneslocalesfacturass) {
				if(transaccioneslocalesfacturas.getsType().equals(Constantes2.S_TOTALES)) {
					transaccioneslocalesfacturasTotales=transaccioneslocalesfacturas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransaccionesLocalesFacturasConstantesFunciones.TotalizarValoresFilaTransaccionesLocalesFacturas(this.transaccioneslocalesfacturass,transaccioneslocalesfacturasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTransaccionesLocalesFacturassBusquedaTransaccionesLocalesFacturas()throws Exception {
		try {
			sAccionBusqueda="BusquedaTransaccionesLocalesFacturas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionesLocalesFacturassFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionesLocalesFacturassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTransaccionesLocalesFacturassBusquedaTransaccionesLocalesFacturas(String sFinalQuery,Long id_ejercicio,Date fecha_desde,Date fecha_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturassBusquedaTransaccionesLocalesFacturas(sFinalQuery,this.pagination,id_ejercicio,fecha_desde,fecha_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionesLocalesFacturassFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturassFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionesLocalesFacturassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosTransaccionesLocalesFacturas() {
		this.isPermisoTodoTransaccionesLocalesFacturas=false;
		this.isPermisoNuevoTransaccionesLocalesFacturas=false;
		this.isPermisoActualizarTransaccionesLocalesFacturas=false;
		this.isPermisoActualizarOriginalTransaccionesLocalesFacturas=false;
		this.isPermisoEliminarTransaccionesLocalesFacturas=false;
		this.isPermisoGuardarCambiosTransaccionesLocalesFacturas=false;
		this.isPermisoConsultaTransaccionesLocalesFacturas=true;
		this.isPermisoBusquedaTransaccionesLocalesFacturas=true;
		this.isPermisoReporteTransaccionesLocalesFacturas=true;
		this.isPermisoOrdenTransaccionesLocalesFacturas=false;		
		this.isPermisoPaginacionMedioTransaccionesLocalesFacturas=false;		
		this.isPermisoPaginacionAltoTransaccionesLocalesFacturas=false;		
		this.isPermisoPaginacionTodoTransaccionesLocalesFacturas=false;		
		this.isPermisoCopiarTransaccionesLocalesFacturas=false;		
		this.isPermisoVerFormTransaccionesLocalesFacturas=false;		
		this.isPermisoDuplicarTransaccionesLocalesFacturas=false;
		this.isPermisoOrdenTransaccionesLocalesFacturas=false;
	}
	
	public void setPermisosUsuarioTransaccionesLocalesFacturas(Boolean isPermiso) {
		this.isPermisoTodoTransaccionesLocalesFacturas=isPermiso;
		this.isPermisoNuevoTransaccionesLocalesFacturas=isPermiso;
		this.isPermisoActualizarTransaccionesLocalesFacturas=isPermiso;
		this.isPermisoActualizarOriginalTransaccionesLocalesFacturas=isPermiso;
		this.isPermisoEliminarTransaccionesLocalesFacturas=isPermiso;
		this.isPermisoGuardarCambiosTransaccionesLocalesFacturas=isPermiso;
		this.isPermisoConsultaTransaccionesLocalesFacturas=isPermiso;
		this.isPermisoBusquedaTransaccionesLocalesFacturas=isPermiso;
		this.isPermisoReporteTransaccionesLocalesFacturas=isPermiso;
		this.isPermisoOrdenTransaccionesLocalesFacturas=isPermiso;		
		this.isPermisoPaginacionMedioTransaccionesLocalesFacturas=isPermiso;		
		this.isPermisoPaginacionAltoTransaccionesLocalesFacturas=isPermiso;		
		this.isPermisoPaginacionTodoTransaccionesLocalesFacturas=isPermiso;		
		this.isPermisoCopiarTransaccionesLocalesFacturas=isPermiso;		
		this.isPermisoVerFormTransaccionesLocalesFacturas=isPermiso;		
		this.isPermisoDuplicarTransaccionesLocalesFacturas=isPermiso;
		this.isPermisoOrdenTransaccionesLocalesFacturas=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTransaccionesLocalesFacturas(Boolean isPermiso) {
		//this.isPermisoTodoTransaccionesLocalesFacturas=isPermiso;
		this.isPermisoNuevoTransaccionesLocalesFacturas=isPermiso;
		this.isPermisoActualizarTransaccionesLocalesFacturas=isPermiso;
		this.isPermisoActualizarOriginalTransaccionesLocalesFacturas=isPermiso;
		this.isPermisoEliminarTransaccionesLocalesFacturas=isPermiso;
		this.isPermisoGuardarCambiosTransaccionesLocalesFacturas=isPermiso;
		//this.isPermisoConsultaTransaccionesLocalesFacturas=isPermiso;
		//this.isPermisoBusquedaTransaccionesLocalesFacturas=isPermiso;
		//this.isPermisoReporteTransaccionesLocalesFacturas=isPermiso;
		//this.isPermisoOrdenTransaccionesLocalesFacturas=isPermiso;		
		//this.isPermisoPaginacionMedioTransaccionesLocalesFacturas=isPermiso;		
		//this.isPermisoPaginacionAltoTransaccionesLocalesFacturas=isPermiso;		
		//this.isPermisoPaginacionTodoTransaccionesLocalesFacturas=isPermiso;		
		//this.isPermisoCopiarTransaccionesLocalesFacturas=isPermiso;		
		//this.isPermisoDuplicarTransaccionesLocalesFacturas=isPermiso;
		//this.isPermisoOrdenTransaccionesLocalesFacturas=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTransaccionesLocalesFacturasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TransaccionesLocalesFacturasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTransaccionesLocalesFacturas(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTransaccionesLocalesFacturasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTransaccionesLocalesFacturasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTransaccionesLocalesFacturasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTransaccionesLocalesFacturasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTransaccionesLocalesFacturas() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TransaccionesLocalesFacturasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TransaccionesLocalesFacturasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTransaccionesLocalesFacturas=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTransaccionesLocalesFacturas=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTransaccionesLocalesFacturas=this.isPermisoActualizarTransaccionesLocalesFacturas;
			this.isPermisoEliminarTransaccionesLocalesFacturas=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTransaccionesLocalesFacturas=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTransaccionesLocalesFacturas=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTransaccionesLocalesFacturas=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTransaccionesLocalesFacturas=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTransaccionesLocalesFacturas=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransaccionesLocalesFacturas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTransaccionesLocalesFacturas=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTransaccionesLocalesFacturas=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTransaccionesLocalesFacturas=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTransaccionesLocalesFacturas=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTransaccionesLocalesFacturas=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTransaccionesLocalesFacturas=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransaccionesLocalesFacturas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTransaccionesLocalesFacturas.setToolTipText(this.jTableDatosTransaccionesLocalesFacturas.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTransaccionesLocalesFacturas(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTransaccionesLocalesFacturas(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TransaccionesLocalesFacturasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TransaccionesLocalesFacturasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTransaccionesLocalesFacturas() throws Exception {
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
	public void inicializarCombosForeignKeyTransaccionesLocalesFacturasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTransaccionesLocalesFacturasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TransaccionesLocalesFacturasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyTransaccionesLocalesFacturas()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEjercicio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.transaccioneslocalesfacturasSessionBean==null) {
				this.transaccioneslocalesfacturasSessionBean=new TransaccionesLocalesFacturasSessionBean();
			}

			if(!this.transaccioneslocalesfacturasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.transaccioneslocalesfacturasSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
	
	public void initActionsCombosTodosForeignKeyTransaccionesLocalesFacturas()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTransaccionesLocalesFacturas(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTransaccionesLocalesFacturas()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransaccionesLocalesFacturas();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturas)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturas,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTransaccionesLocalesFacturas()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTransaccionesLocalesFacturas()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_ejercicioTransaccionesLocalesFacturas.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTransaccionesLocalesFacturas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTransaccionesLocalesFacturas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTransaccionesLocalesFacturas()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTransaccionesLocalesFacturas()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTransaccionesLocalesFacturas(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTransaccionesLocalesFacturas()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_empresaTransaccionesLocalesFacturas!=null && this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_empresaTransaccionesLocalesFacturas.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_empresaTransaccionesLocalesFacturas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_ejercicioTransaccionesLocalesFacturas!=null && this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_ejercicioTransaccionesLocalesFacturas.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_ejercicioTransaccionesLocalesFacturas.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public TransaccionesLocalesFacturasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TransaccionesLocalesFacturasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TransaccionesLocalesFacturasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.transaccioneslocalesfacturasSessionBean=new TransaccionesLocalesFacturasSessionBean(); 
		this.transaccioneslocalesfacturasConstantesFunciones=new TransaccionesLocalesFacturasConstantesFunciones(); 
		this.transaccioneslocalesfacturasBean=new TransaccionesLocalesFacturas();//(this.transaccioneslocalesfacturasConstantesFunciones); 		
		this.transaccioneslocalesfacturasReturnGeneral=new TransaccionesLocalesFacturasParameterReturnGeneral(); 
		
		this.transaccioneslocalesfacturasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccioneslocalesfacturasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TransaccionesLocalesFacturasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TransaccionesLocalesFacturasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TransaccionesLocalesFacturasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTransaccionesLocalesFacturas(true);
			
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
			
			this.transaccioneslocalesfacturasConstantesFunciones=new TransaccionesLocalesFacturasConstantesFunciones(); 
			this.transaccioneslocalesfacturasBean=new TransaccionesLocalesFacturas();//this.transaccioneslocalesfacturasConstantesFunciones); 			
			this.transaccioneslocalesfacturasReturnGeneral=new TransaccionesLocalesFacturasParameterReturnGeneral(); 
		
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transacciones Locales Facturas Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.transaccioneslocalesfacturas=new TransaccionesLocalesFacturas();
			this.transaccioneslocalesfacturass = new ArrayList<TransaccionesLocalesFacturas>();
			this.transaccioneslocalesfacturassAux = new ArrayList<TransaccionesLocalesFacturas>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic=new TransaccionesLocalesFacturasLogic();
				this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
			}
			
			//this.transaccioneslocalesfacturasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.transaccioneslocalesfacturasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas);	
					}
					
					if(this.jInternalFrameImportacionTransaccionesLocalesFacturas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransaccionesLocalesFacturas);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTransaccionesLocalesFacturas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTransaccionesLocalesFacturas);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas);
				this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.setVisible(false);
				this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas);
					this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.setVisible(false);
					this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTransaccionesLocalesFacturas!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTransaccionesLocalesFacturas);
					this.jInternalFrameImportacionTransaccionesLocalesFacturas.setVisible(false);
					this.jInternalFrameImportacionTransaccionesLocalesFacturas.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTransaccionesLocalesFacturas!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTransaccionesLocalesFacturas);
					this.jInternalFrameOrderByTransaccionesLocalesFacturas.setVisible(false);
					this.jInternalFrameOrderByTransaccionesLocalesFacturas.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTransaccionesLocalesFacturasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TransaccionesLocalesFacturasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.transaccioneslocalesfacturasReturnGeneral=new TransaccionesLocalesFacturasParameterReturnGeneral();
			
			this.transaccioneslocalesfacturasParameterGeneral=new TransaccionesLocalesFacturasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.transaccioneslocalesfacturasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TransaccionesLocalesFacturasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransaccionesLocalesFacturasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado(),this.transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransaccionesLocalesFacturasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado(),this.transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaDuplicarTransaccionesLocalesFacturas=true;
			this.isVisibilidadCeldaCopiarTransaccionesLocalesFacturas=true;
			this.isVisibilidadCeldaVerFormTransaccionesLocalesFacturas=true;
			this.isVisibilidadCeldaOrdenTransaccionesLocalesFacturas=true;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaModificarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaActualizarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaEliminarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaCancelarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas=false;
			
			
			this.isVisibilidadBusquedaTransaccionesLocalesFacturas=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTransaccionesLocalesFacturas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTransaccionesLocalesFacturas();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTransaccionesLocalesFacturas(false);
			
			this.setPermisosUsuarioTransaccionesLocalesFacturas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado() 
				|| (this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado() && this.transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTransaccionesLocalesFacturasClasesRelacionadas();
			}
			
			if(this.transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTransaccionesLocalesFacturasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTransaccionesLocalesFacturas();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTransaccionesLocalesFacturas();
			}
			
			if(!this.isPermisoBusquedaTransaccionesLocalesFacturas) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TransaccionesLocalesFacturasConstantesFunciones.getTiposSeleccionarTransaccionesLocalesFacturas());
				
				this.tiposColumnasSelect=TransaccionesLocalesFacturasConstantesFunciones.getTiposSeleccionarTransaccionesLocalesFacturas(true);
				
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
			//if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTransaccionesLocalesFacturas();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioTransaccionesLocalesFacturas(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioTransaccionesLocalesFacturas(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionesLocalesFacturas() ;
			
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
			this.ejercicioLogic=new EjercicioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				transaccioneslocalesfacturasImplementable= (TransaccionesLocalesFacturasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransaccionesLocalesFacturasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				transaccioneslocalesfacturasImplementableHome= (TransaccionesLocalesFacturasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransaccionesLocalesFacturasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.transaccioneslocalesfacturass= new ArrayList<TransaccionesLocalesFacturas>();
			this.transaccioneslocalesfacturassEliminados= new ArrayList<TransaccionesLocalesFacturas>();
						
			this.isEsNuevoTransaccionesLocalesFacturas=false;
			this.esParaAccionDesdeFormularioTransaccionesLocalesFacturas=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTransaccionesLocalesFacturas(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTransaccionesLocalesFacturas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TransaccionesLocalesFacturasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTransaccionesLocalesFacturas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTransaccionesLocalesFacturas(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTransaccionesLocalesFacturas();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTransaccionesLocalesFacturas();
			}
			
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTransaccionesLocalesFacturas(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TransaccionesLocalesFacturas: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTransaccionesLocalesFacturas() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTransaccionesLocalesFacturas")) {
				iIndex=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTabbedPaneRelacionesTransaccionesLocalesFacturas.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTabbedPaneRelacionesTransaccionesLocalesFacturas.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTransaccionesLocalesFacturas();	
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
	
	public void cargarCombosForeignKeyTransaccionesLocalesFacturas(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTransaccionesLocalesFacturas(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTransaccionesLocalesFacturas(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTransaccionesLocalesFacturasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTransaccionesLocalesFacturas();
		
		this.cargarCombosFrameForeignKeyTransaccionesLocalesFacturas();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTransaccionesLocalesFacturas();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTransaccionesLocalesFacturas();
		}
	}
	
	
	
	public void jButtonNuevoTransaccionesLocalesFacturasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
			
			
			if(jTableDatosTransaccionesLocalesFacturas.getRowCount()>=1) {
				jTableDatosTransaccionesLocalesFacturas.removeRowSelectionInterval(0, jTableDatosTransaccionesLocalesFacturas.getRowCount()-1);						
			}
			
			this.isEsNuevoTransaccionesLocalesFacturas=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTransaccionesLocalesFacturas(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTransaccionesLocalesFacturas(true);			
			//this.transaccioneslocalesfacturas=new TransaccionesLocalesFacturas();
			//this.transaccioneslocalesfacturas.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransaccionesLocalesFacturas(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionesLocalesFacturas() ;
			
			if(TransaccionesLocalesFacturasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransaccionesLocalesFacturas(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.transaccioneslocalesfacturas);	
			this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesfacturas);				
			
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
			
			if(this.transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TransaccionesLocalesFacturas: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTransaccionesLocalesFacturasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TransaccionesLocalesFacturas> transaccioneslocalesfacturassSeleccionados=new ArrayList<TransaccionesLocalesFacturas>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTransaccionesLocalesFacturas.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTransaccionesLocalesFacturas.getSelectedRows().length;			
			}
			
			transaccioneslocalesfacturassSeleccionados=this.getTransaccionesLocalesFacturassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTransaccionesLocalesFacturas--;			
				//TransaccionesLocalesFacturas transaccioneslocalesfacturasAux= new TransaccionesLocalesFacturas();			
				//transaccioneslocalesfacturasAux.setId(this.iIdNuevoTransaccionesLocalesFacturas);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TransaccionesLocalesFacturas transaccioneslocalesfacturasOrigen=new TransaccionesLocalesFacturas();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TransaccionesLocalesFacturas transaccioneslocalesfacturasOrigen : transaccioneslocalesfacturassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							transaccioneslocalesfacturasOrigen =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioneslocalesfacturasOrigen =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTransaccionesLocalesFacturas();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.transaccioneslocalesfacturas.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTransaccionesLocalesFacturas(transaccioneslocalesfacturasOrigen,this.transaccioneslocalesfacturas,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().add(this.transaccioneslocalesfacturasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesfacturass.add(this.transaccioneslocalesfacturasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTransaccionesLocalesFacturas(false);
				
				this.jTableDatosTransaccionesLocalesFacturas.setRowSelectionInterval(this.getIndiceNuevoTransaccionesLocalesFacturas(), this.getIndiceNuevoTransaccionesLocalesFacturas());
				
				int iLastRow =  this.jTableDatosTransaccionesLocalesFacturas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransaccionesLocalesFacturas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransaccionesLocalesFacturas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransaccionesLocalesFacturas(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TransaccionesLocalesFacturas> transaccioneslocalesfacturassSeleccionados=new ArrayList<TransaccionesLocalesFacturas>();									
		
			TransaccionesLocalesFacturas transaccioneslocalesfacturasOrigen=new TransaccionesLocalesFacturas();
			TransaccionesLocalesFacturas transaccioneslocalesfacturasDestino=new TransaccionesLocalesFacturas();
				
			transaccioneslocalesfacturassSeleccionados=this.getTransaccionesLocalesFacturassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTransaccionesLocalesFacturas.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || transaccioneslocalesfacturassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTransaccionesLocalesFacturas.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioneslocalesfacturasOrigen =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transaccioneslocalesfacturasOrigen =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioneslocalesfacturasDestino =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transaccioneslocalesfacturasDestino =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				transaccioneslocalesfacturasOrigen =transaccioneslocalesfacturassSeleccionados.get(0);
				transaccioneslocalesfacturasDestino =transaccioneslocalesfacturassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTransaccionesLocalesFacturas(transaccioneslocalesfacturasOrigen,transaccioneslocalesfacturasDestino,true,false);
				
				transaccioneslocalesfacturasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(transaccioneslocalesfacturasDestino,transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transaccioneslocalesfacturasDestino,transaccioneslocalesfacturass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTransaccionesLocalesFacturas(false);
				
				//this.jTableDatosTransaccionesLocalesFacturas.setRowSelectionInterval(this.getIndiceNuevoTransaccionesLocalesFacturas(), this.getIndiceNuevoTransaccionesLocalesFacturas());
				
				int iLastRow =  this.jTableDatosTransaccionesLocalesFacturas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransaccionesLocalesFacturas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransaccionesLocalesFacturas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransaccionesLocalesFacturas(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTransaccionesLocalesFacturas.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTransaccionesLocalesFacturas.setVisible(!isVisible);
			this.jPanelPaginacionTransaccionesLocalesFacturas.setVisible(!isVisible);
			this.jPanelAccionesTransaccionesLocalesFacturas.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTransaccionesLocalesFacturas();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTransaccionesLocalesFacturas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTransaccionesLocalesFacturas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTransaccionesLocalesFacturas();
			
			this.abrirFrameOrderByTransaccionesLocalesFacturas();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTransaccionesLocalesFacturas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTransaccionesLocalesFacturas(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransaccionesLocalesFacturas);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.isMaximum()) {
					this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.setSize(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.iWidthFormulario,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.isMaximum()) {
						this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jContentPaneDetalleTransaccionesLocalesFacturas.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTabbedPaneRelacionesTransaccionesLocalesFacturas.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jContentPaneDetalleTransaccionesLocalesFacturas.getWidth(),TransaccionesLocalesFacturasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTabbedPaneRelacionesTransaccionesLocalesFacturas.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jContentPaneDetalleTransaccionesLocalesFacturas.getWidth(),TransaccionesLocalesFacturasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTabbedPaneRelacionesTransaccionesLocalesFacturas.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jContentPaneDetalleTransaccionesLocalesFacturas.getWidth(),TransaccionesLocalesFacturasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.setVisible(true);
	        this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTransaccionesLocalesFacturas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTransaccionesLocalesFacturas==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTransaccionesLocalesFacturas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionesLocalesFacturas,false,this);
				} else {
					this.jInternalFrameOrderByTransaccionesLocalesFacturas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionesLocalesFacturas,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTransaccionesLocalesFacturas);
				this.jInternalFrameOrderByTransaccionesLocalesFacturas.setVisible(false);
				this.jInternalFrameOrderByTransaccionesLocalesFacturas.setSelected(false);
				
				this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransaccionesLocalesFacturas"));
				
				this.inicializarActualizarBindingTablaOrderByTransaccionesLocalesFacturas();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTransaccionesLocalesFacturas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTransaccionesLocalesFacturas==null) {
				
				this.jInternalFrameImportacionTransaccionesLocalesFacturas=new ImportacionJInternalFrame(TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransaccionesLocalesFacturas);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTransaccionesLocalesFacturas);
				this.jInternalFrameImportacionTransaccionesLocalesFacturas.setVisible(false);
				this.jInternalFrameImportacionTransaccionesLocalesFacturas.setSelected(false);


				this.jInternalFrameImportacionTransaccionesLocalesFacturas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransaccionesLocalesFacturas"));
				this.jInternalFrameImportacionTransaccionesLocalesFacturas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransaccionesLocalesFacturas"));
				this.jInternalFrameImportacionTransaccionesLocalesFacturas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransaccionesLocalesFacturas"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTransaccionesLocalesFacturas() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas==null) {
				this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas=new ReporteDinamicoJInternalFrame(TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas);
				this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.setVisible(false);
				this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransaccionesLocalesFacturas"));
				this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransaccionesLocalesFacturas"));
				this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransaccionesLocalesFacturas"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransaccionesLocalesFacturas();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTransaccionesLocalesFacturas() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransaccionesLocalesFacturas);
			
	       	this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.setVisible(false);
	        this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.setSelected(false);
			
			//this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.dispose();
			//this.jInternalFrameDetalleFormTransaccionesLocalesFacturas=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTransaccionesLocalesFacturas() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.setVisible(true);
	        this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTransaccionesLocalesFacturas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTransaccionesLocalesFacturas.setVisible(true);
	        this.jInternalFrameImportacionTransaccionesLocalesFacturas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTransaccionesLocalesFacturas() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.setVisible(true);
	        this.jInternalFrameOrderByTransaccionesLocalesFacturas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTransaccionesLocalesFacturas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.setVisible(false);
	        this.jInternalFrameOrderByTransaccionesLocalesFacturas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTransaccionesLocalesFacturas() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.setVisible(false);
	        this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTransaccionesLocalesFacturas() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTransaccionesLocalesFacturas.setVisible(false);
	        this.jInternalFrameImportacionTransaccionesLocalesFacturas.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTransaccionesLocalesFacturas(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTransaccionesLocalesFacturas(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTransaccionesLocalesFacturas(true);
			//this.isEsNuevoTransaccionesLocalesFacturas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTransaccionesLocalesFacturas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransaccionesLocalesFacturas(false) ;
			
			if(transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TransaccionesLocalesFacturasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransaccionesLocalesFacturas(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionesLocalesFacturas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTransaccionesLocalesFacturasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTransaccionesLocalesFacturas(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTransaccionesLocalesFacturas(true);
			//this.isEsNuevoTransaccionesLocalesFacturas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.transaccioneslocalesfacturas.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTransaccionesLocalesFacturas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTransaccionesLocalesFacturas(false) ;
			
			if(TransaccionesLocalesFacturasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransaccionesLocalesFacturas(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionesLocalesFacturas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	
	public void jButtonActualizarTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTransaccionesLocalesFacturas(false);
			
			//if(!this.isEsNuevoTransaccionesLocalesFacturas) {								
				int intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
				
			}
			
			if(this.permiteMantenimiento(this.transaccioneslocalesfacturas)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTransaccionesLocalesFacturas=true;
					this.inicializarActualizarBindingTablaTransaccionesLocalesFacturas(false);
					this.isEsNuevoTransaccionesLocalesFacturas=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTransaccionesLocalesFacturas=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTransaccionesLocalesFacturas=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransaccionesLocalesFacturas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransaccionesLocalesFacturas(false);
				
				this.habilitarDeshabilitarControlesTransaccionesLocalesFacturas(false);
			
												
				
				if(TransaccionesLocalesFacturasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTransaccionesLocalesFacturas();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTransaccionesLocalesFacturasActionPerformed(evt,transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTransaccionesLocalesFacturas.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.transaccioneslocalesfacturas.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesFacturas.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesFacturas.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				this.transaccioneslocalesfacturas.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				this.transaccioneslocalesfacturas.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.transaccioneslocalesfacturas)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TransaccionesLocalesFacturasModel) this.jTableDatosTransaccionesLocalesFacturas.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTransaccionesLocalesFacturas=true;
				this.inicializarActualizarBindingTablaTransaccionesLocalesFacturas(false);
				this.isEsNuevoTransaccionesLocalesFacturas=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransaccionesLocalesFacturas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransaccionesLocalesFacturas(false);
				
				this.habilitarDeshabilitarControlesTransaccionesLocalesFacturas(false);
				
				
				
				if(TransaccionesLocalesFacturasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTransaccionesLocalesFacturas();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTransaccionesLocalesFacturas.getRowCount()>=1) {
				jTableDatosTransaccionesLocalesFacturas.removeRowSelectionInterval(0, jTableDatosTransaccionesLocalesFacturas.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTransaccionesLocalesFacturas(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTransaccionesLocalesFacturas(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransaccionesLocalesFacturas(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionesLocalesFacturas(false) ;
			
			this.isEsNuevoTransaccionesLocalesFacturas=false;
			
			if(TransaccionesLocalesFacturasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTransaccionesLocalesFacturas();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
				
				//SI ES MANUAL
				if(TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTransaccionesLocalesFacturas();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTransaccionesLocalesFacturas--;			
			//TransaccionesLocalesFacturas transaccioneslocalesfacturasAux= new TransaccionesLocalesFacturas();			
			//transaccioneslocalesfacturasAux.setId(this.iIdNuevoTransaccionesLocalesFacturas);
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTransaccionesLocalesFacturas();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
			
			this.transaccioneslocalesfacturas.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().add(this.transaccioneslocalesfacturasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.transaccioneslocalesfacturass.add(this.transaccioneslocalesfacturasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTransaccionesLocalesFacturas(false);
			
			this.jTableDatosTransaccionesLocalesFacturas.setRowSelectionInterval(this.getIndiceNuevoTransaccionesLocalesFacturas(), this.getIndiceNuevoTransaccionesLocalesFacturas());
			
			int iLastRow =  this.jTableDatosTransaccionesLocalesFacturas.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTransaccionesLocalesFacturas.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTransaccionesLocalesFacturas.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTransaccionesLocalesFacturas(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
			
			//SI ES MANUAL
			if(TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransaccionesLocalesFacturas();
			}
			
			//this.abrirFrameTreeTransaccionesLocalesFacturas();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTransaccionesLocalesFacturas.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTransaccionesLocalesFacturas.setFileImportacion(this.jInternalFrameImportacionTransaccionesLocalesFacturas.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTransaccionesLocalesFacturas.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTransaccionesLocalesFacturas.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTransaccionesLocalesFacturas.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTransaccionesLocalesFacturas.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TransaccionesLocalesFacturas> transaccioneslocalesfacturassSeleccionados=new ArrayList<TransaccionesLocalesFacturas>();		

		transaccioneslocalesfacturassSeleccionados=this.getTransaccionesLocalesFacturassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TransaccionesLocalesFacturasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TransaccionesLocalesFacturasBaseDesign.jrxml";
			
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
			
			this.generarReporteTransaccionesLocalesFacturass("Todos",transaccioneslocalesfacturassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transacciones Locales Facturas",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALSINIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talSinIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talSinIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talSinIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talSinIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALDESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talDescuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talDescuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talDescuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talDescuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_RUCCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cCliente_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALIVA:
					sNombreCampoCategoria="total_iva";
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALSINIVA:
					sNombreCampoCategoria="total_sin_iva";
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALDESCUENTO:
					sNombreCampoCategoria="total_descuento";
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_RUCCLIENTE:
					sNombreCampoCategoria="ruc_cliente";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALIVA:
					sNombreCampoCategoriaValor="total_iva";
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALSINIVA:
					sNombreCampoCategoriaValor="total_sin_iva";
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALDESCUENTO:
					sNombreCampoCategoriaValor="total_descuento";
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_RUCCLIENTE:
					sNombreCampoCategoriaValor="ruc_cliente";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_iva");
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALSINIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Sin Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_sin_iva");
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALDESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_descuento");
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_RUCCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc_cliente");
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
	
	public void jButtonGenerarExcelReporteDinamicoTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TransaccionesLocalesFacturas> transaccioneslocalesfacturassSeleccionados=new ArrayList<TransaccionesLocalesFacturas>();		
		
		transaccioneslocalesfacturassSeleccionados=this.getTransaccionesLocalesFacturassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioneslocalesfacturas";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TransaccionesLocalesFacturass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TransaccionesLocalesFacturas transaccioneslocalesfacturas:transaccioneslocalesfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesfacturas.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(TransaccionesLocalesFacturas transaccioneslocalesfacturas:transaccioneslocalesfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesfacturas.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(TransaccionesLocalesFacturas transaccioneslocalesfacturas:transaccioneslocalesfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesfacturas.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(TransaccionesLocalesFacturas transaccioneslocalesfacturas:transaccioneslocalesfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesfacturas.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(TransaccionesLocalesFacturas transaccioneslocalesfacturas:transaccioneslocalesfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesfacturas.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALIVA);
					iRow++;

					for(TransaccionesLocalesFacturas transaccioneslocalesfacturas:transaccioneslocalesfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesfacturas.gettotal_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALSINIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALSINIVA);
					iRow++;

					for(TransaccionesLocalesFacturas transaccioneslocalesfacturas:transaccioneslocalesfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesfacturas.gettotal_sin_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALDESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALDESCUENTO);
					iRow++;

					for(TransaccionesLocalesFacturas transaccioneslocalesfacturas:transaccioneslocalesfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesfacturas.gettotal_descuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(TransaccionesLocalesFacturas transaccioneslocalesfacturas:transaccioneslocalesfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesfacturas.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IVA);
					iRow++;

					for(TransaccionesLocalesFacturas transaccioneslocalesfacturas:transaccioneslocalesfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesfacturas.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionesLocalesFacturasConstantesFunciones.LABEL_RUCCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_RUCCLIENTE);
					iRow++;

					for(TransaccionesLocalesFacturas transaccioneslocalesfacturas:transaccioneslocalesfacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioneslocalesfacturas.getruc_cliente());
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
			//	this.getFilaCabeceraExportarExcelTransaccionesLocalesFacturas(row);				
			//	iRow++;
			//}				
			
			//for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:transaccioneslocalesfacturassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTransaccionesLocalesFacturas(transaccioneslocalesfacturasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transacciones Locales Facturas",JOptionPane.INFORMATION_MESSAGE);
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
				this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
			
			//SI ES MANUAL
			if(TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransaccionesLocalesFacturas();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
			
			//SI ES MANUAL
			if(TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransaccionesLocalesFacturas();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
			
			//SI ES MANUAL
			if(TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransaccionesLocalesFacturas();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTransaccionesLocalesFacturas() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTransaccionesLocalesFacturas.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTransaccionesLocalesFacturas.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTransaccionesLocalesFacturas.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTransaccionesLocalesFacturas.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTransaccionesLocalesFacturas.setMinimumSize(dimensionMinimum);
		this.jTableDatosTransaccionesLocalesFacturas.setMaximumSize(dimensionMaximum);
		this.jTableDatosTransaccionesLocalesFacturas.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTransaccionesLocalesFacturas(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTransaccionesLocalesFacturas(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTransaccionesLocalesFacturas(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTransaccionesLocalesFacturas(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTransaccionesLocalesFacturas(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTransaccionesLocalesFacturas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionesLocalesFacturas(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTransaccionesLocalesFacturas(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTransaccionesLocalesFacturas() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTransaccionesLocalesFacturas();
		
		this.inicializarActualizarBindingBotonesManualTransaccionesLocalesFacturas(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTransaccionesLocalesFacturas();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionesLocalesFacturas() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTransaccionesLocalesFacturas(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTransaccionesLocalesFacturas(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTransaccionesLocalesFacturas.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTransaccionesLocalesFacturas.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jCheckBoxPostAccionNuevoTransaccionesLocalesFacturas.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jCheckBoxPostAccionSinCerrarTransaccionesLocalesFacturas.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jCheckBoxPostAccionSinMensajeTransaccionesLocalesFacturas.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTransaccionesLocalesFacturas.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTransaccionesLocalesFacturas.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
				this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jCheckBoxPostAccionNuevoTransaccionesLocalesFacturas.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jCheckBoxPostAccionSinCerrarTransaccionesLocalesFacturas.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jCheckBoxPostAccionSinMensajeTransaccionesLocalesFacturas.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTransaccionesLocalesFacturas.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTransaccionesLocalesFacturas.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTransaccionesLocalesFacturas.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTransaccionesLocalesFacturas.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTransaccionesLocalesFacturas.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTransaccionesLocalesFacturas.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTransaccionesLocalesFacturas.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTransaccionesLocalesFacturas(Boolean esInicializar) throws Exception {
		try	{	
			if(TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTransaccionesLocalesFacturas(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionesLocalesFacturas() throws Exception {
		try	{
			if(TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTransaccionesLocalesFacturas();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransaccionesLocalesFacturas() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTransaccionesLocalesFacturas() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTransaccionesLocalesFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTransaccionesLocalesFacturas.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTransaccionesLocalesFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTransaccionesLocalesFacturas.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTransaccionesLocalesFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTransaccionesLocalesFacturas.addItem(reporte);
			}
			
			
			if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTransaccionesLocalesFacturas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTransaccionesLocalesFacturas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTransaccionesLocalesFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTransaccionesLocalesFacturas.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTransaccionesLocalesFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTransaccionesLocalesFacturas.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTransaccionesLocalesFacturas.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransaccionesLocalesFacturas();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransaccionesLocalesFacturas() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas!=null) {
				this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas!=null) {
				this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas!=null) {
				
				if(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TransaccionesLocalesFacturasConstantesFunciones.getTiposSeleccionarTransaccionesLocalesFacturas(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TransaccionesLocalesFacturasConstantesFunciones.getTiposSeleccionarTransaccionesLocalesFacturas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TransaccionesLocalesFacturasConstantesFunciones.getTiposSeleccionarTransaccionesLocalesFacturas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTransaccionesLocalesFacturas()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.getSelectedItem()!=null){this.id_ejercicioBusquedaTransaccionesLocalesFacturas=((Ejercicio)this.jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.getSelectedItem()).getId();}
		this.fecha_desdeBusquedaTransaccionesLocalesFacturas=new Date(this.jDateChooserfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.getDate().getTime());
		this.fecha_hastaBusquedaTransaccionesLocalesFacturas=new Date(this.jDateChooserfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTransaccionesLocalesFacturas(Boolean esInicializar) throws Exception {				
		if(TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTransaccionesLocalesFacturas();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTransaccionesLocalesFacturas() throws Exception {
		this.inicializarActualizarBindingTablaTransaccionesLocalesFacturas(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTransaccionesLocalesFacturas() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TransaccionesLocalesFacturasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TransaccionesLocalesFacturasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTransaccionesLocalesFacturasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesFacturasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TransaccionesLocalesFacturasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TransaccionesLocalesFacturasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTransaccionesLocalesFacturas(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=transaccioneslocalesfacturass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTransaccionesLocalesFacturas.setModel(new TransaccionesLocalesFacturasModel(this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTransaccionesLocalesFacturas.setModel(new TransaccionesLocalesFacturasModel(this.transaccioneslocalesfacturass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTransaccionesLocalesFacturas!=null && this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTransaccionesLocalesFacturas();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTransaccionesLocalesFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesFacturas,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TransaccionesLocalesFacturasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO,transaccioneslocalesfacturasConstantesFunciones.resaltarSeleccionarTransaccionesLocalesFacturas,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO,transaccioneslocalesfacturasConstantesFunciones.resaltarSeleccionarTransaccionesLocalesFacturas,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTransaccionesLocalesFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesFacturas,TransaccionesLocalesFacturasConstantesFunciones.LABEL_ID));

		if(this.transaccioneslocalesfacturasConstantesFunciones.mostraridTransaccionesLocalesFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionesLocalesFacturasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transaccioneslocalesfacturasConstantesFunciones.resaltaridTransaccionesLocalesFacturas,this.transaccioneslocalesfacturasConstantesFunciones.activaridTransaccionesLocalesFacturas,iSizeTabla,this,true,"idTransaccionesLocalesFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioneslocalesfacturasConstantesFunciones.resaltaridTransaccionesLocalesFacturas,this.transaccioneslocalesfacturasConstantesFunciones.activaridTransaccionesLocalesFacturas,this,true,"idTransaccionesLocalesFacturas","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionesLocalesFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesFacturas,TransaccionesLocalesFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.transaccioneslocalesfacturasConstantesFunciones.mostrarnombre_completo_clienteTransaccionesLocalesFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionesLocalesFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transaccioneslocalesfacturasConstantesFunciones.resaltarnombre_completo_clienteTransaccionesLocalesFacturas,this.transaccioneslocalesfacturasConstantesFunciones.activarnombre_completo_clienteTransaccionesLocalesFacturas,iSizeTabla,this,true,"nombre_completo_clienteTransaccionesLocalesFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioneslocalesfacturasConstantesFunciones.resaltarnombre_completo_clienteTransaccionesLocalesFacturas,this.transaccioneslocalesfacturasConstantesFunciones.activarnombre_completo_clienteTransaccionesLocalesFacturas,this,true,"nombre_completo_clienteTransaccionesLocalesFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransaccionesLocalesFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionesLocalesFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesFacturas,TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALIVA));

		if(this.transaccioneslocalesfacturasConstantesFunciones.mostrartotal_ivaTransaccionesLocalesFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transaccioneslocalesfacturasConstantesFunciones.resaltartotal_ivaTransaccionesLocalesFacturas,this.transaccioneslocalesfacturasConstantesFunciones.activartotal_ivaTransaccionesLocalesFacturas,iSizeTabla,this,true,"total_ivaTransaccionesLocalesFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioneslocalesfacturasConstantesFunciones.resaltartotal_ivaTransaccionesLocalesFacturas,this.transaccioneslocalesfacturasConstantesFunciones.activartotal_ivaTransaccionesLocalesFacturas,this,true,"total_ivaTransaccionesLocalesFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TransaccionesLocalesFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionesLocalesFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesFacturas,TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALSINIVA));

		if(this.transaccioneslocalesfacturasConstantesFunciones.mostrartotal_sin_ivaTransaccionesLocalesFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALSINIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transaccioneslocalesfacturasConstantesFunciones.resaltartotal_sin_ivaTransaccionesLocalesFacturas,this.transaccioneslocalesfacturasConstantesFunciones.activartotal_sin_ivaTransaccionesLocalesFacturas,iSizeTabla,this,true,"total_sin_ivaTransaccionesLocalesFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioneslocalesfacturasConstantesFunciones.resaltartotal_sin_ivaTransaccionesLocalesFacturas,this.transaccioneslocalesfacturasConstantesFunciones.activartotal_sin_ivaTransaccionesLocalesFacturas,this,true,"total_sin_ivaTransaccionesLocalesFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TransaccionesLocalesFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionesLocalesFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesFacturas,TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALDESCUENTO));

		if(this.transaccioneslocalesfacturasConstantesFunciones.mostrartotal_descuentoTransaccionesLocalesFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALDESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transaccioneslocalesfacturasConstantesFunciones.resaltartotal_descuentoTransaccionesLocalesFacturas,this.transaccioneslocalesfacturasConstantesFunciones.activartotal_descuentoTransaccionesLocalesFacturas,iSizeTabla,this,true,"total_descuentoTransaccionesLocalesFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioneslocalesfacturasConstantesFunciones.resaltartotal_descuentoTransaccionesLocalesFacturas,this.transaccioneslocalesfacturasConstantesFunciones.activartotal_descuentoTransaccionesLocalesFacturas,this,true,"total_descuentoTransaccionesLocalesFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TransaccionesLocalesFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionesLocalesFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesFacturas,TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTAL));

		if(this.transaccioneslocalesfacturasConstantesFunciones.mostrartotalTransaccionesLocalesFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transaccioneslocalesfacturasConstantesFunciones.resaltartotalTransaccionesLocalesFacturas,this.transaccioneslocalesfacturasConstantesFunciones.activartotalTransaccionesLocalesFacturas,iSizeTabla,this,true,"totalTransaccionesLocalesFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioneslocalesfacturasConstantesFunciones.resaltartotalTransaccionesLocalesFacturas,this.transaccioneslocalesfacturasConstantesFunciones.activartotalTransaccionesLocalesFacturas,this,true,"totalTransaccionesLocalesFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TransaccionesLocalesFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionesLocalesFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesFacturas,TransaccionesLocalesFacturasConstantesFunciones.LABEL_IVA));

		if(this.transaccioneslocalesfacturasConstantesFunciones.mostrarivaTransaccionesLocalesFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionesLocalesFacturasConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transaccioneslocalesfacturasConstantesFunciones.resaltarivaTransaccionesLocalesFacturas,this.transaccioneslocalesfacturasConstantesFunciones.activarivaTransaccionesLocalesFacturas,iSizeTabla,this,true,"ivaTransaccionesLocalesFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioneslocalesfacturasConstantesFunciones.resaltarivaTransaccionesLocalesFacturas,this.transaccioneslocalesfacturasConstantesFunciones.activarivaTransaccionesLocalesFacturas,this,true,"ivaTransaccionesLocalesFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TransaccionesLocalesFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionesLocalesFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesFacturas,TransaccionesLocalesFacturasConstantesFunciones.LABEL_RUCCLIENTE));

		if(this.transaccioneslocalesfacturasConstantesFunciones.mostrarruc_clienteTransaccionesLocalesFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionesLocalesFacturasConstantesFunciones.LABEL_RUCCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transaccioneslocalesfacturasConstantesFunciones.resaltarruc_clienteTransaccionesLocalesFacturas,this.transaccioneslocalesfacturasConstantesFunciones.activarruc_clienteTransaccionesLocalesFacturas,iSizeTabla,this,true,"ruc_clienteTransaccionesLocalesFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioneslocalesfacturasConstantesFunciones.resaltarruc_clienteTransaccionesLocalesFacturas,this.transaccioneslocalesfacturasConstantesFunciones.activarruc_clienteTransaccionesLocalesFacturas,this,true,"ruc_clienteTransaccionesLocalesFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransaccionesLocalesFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransaccionesLocalesFacturas.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransaccionesLocalesFacturas.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTransaccionesLocalesFacturas && this.isPermisoGuardarCambiosTransaccionesLocalesFacturas) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTransaccionesLocalesFacturas.addColumn(tableColumn);
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
			
			this.jTableDatosTransaccionesLocalesFacturas.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransaccionesLocalesFacturas && this.isPermisoGuardarCambiosTransaccionesLocalesFacturas) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransaccionesLocalesFacturas && this.isPermisoGuardarCambiosTransaccionesLocalesFacturas) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTransaccionesLocalesFacturas.moveColumn(this.jTableDatosTransaccionesLocalesFacturas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTransaccionesLocalesFacturas.moveColumn(this.jTableDatosTransaccionesLocalesFacturas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTransaccionesLocalesFacturas.moveColumn(this.jTableDatosTransaccionesLocalesFacturas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTransaccionesLocalesFacturas.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTransaccionesLocalesFacturas.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTransaccionesLocalesFacturas,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTransaccionesLocalesFacturas.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTransaccionesLocalesFacturas.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTransaccionesLocalesFacturas.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTransaccionesLocalesFacturas.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTransaccionesLocalesFacturas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=transaccioneslocalesfacturass.size()-1;
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
		//this.jTableDatosTransaccionesLocalesFacturas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTransaccionesLocalesFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTransaccionesLocalesFacturas();
			
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
				
				//this.isEsNuevoTransaccionesLocalesFacturas=false;
					
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
			
				if(this.transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransaccionesLocalesFacturas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.transaccioneslocalesfacturas.getsType().equals("DUPLICADO")
				   || this.transaccioneslocalesfacturas.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTransaccionesLocalesFacturas=true;
				
				} else {
					this.isEsNuevoTransaccionesLocalesFacturas=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
					if(this.transaccioneslocalesfacturas.getId()>=0 && !this.transaccioneslocalesfacturas.getIsNew()) {						
						this.isEsNuevoTransaccionesLocalesFacturas=false;
						
					} else {
						this.isEsNuevoTransaccionesLocalesFacturas=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTransaccionesLocalesFacturas(esRelaciones);						
				
				this.seleccionarTransaccionesLocalesFacturas(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.transaccioneslocalesfacturas.getId()<0) {
					this.isEsNuevoTransaccionesLocalesFacturas=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTransaccionesLocalesFacturas(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTransaccionesLocalesFacturas(evt,rowIndex);
				}	
				
				if(this.transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TransaccionesLocalesFacturas: " + this.dDif); 
					}
				}								
				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTransaccionesLocalesFacturas(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.transaccioneslocalesfacturas)) {
					if(this.transaccioneslocalesfacturas.getId()>0) {
						this.transaccioneslocalesfacturas.setIsDeleted(true);
						
						this.transaccioneslocalesfacturassEliminados.add(this.transaccioneslocalesfacturas);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().remove(this.transaccioneslocalesfacturas);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesfacturass.remove(this.transaccioneslocalesfacturas);				
					}
					
					
					((TransaccionesLocalesFacturasModel) this.jTableDatosTransaccionesLocalesFacturas.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTransaccionesLocalesFacturas(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTransaccionesLocalesFacturas(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTransaccionesLocalesFacturas) {
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransaccionesLocalesFacturas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTransaccionesLocalesFacturas("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTransaccionesLocalesFacturas(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransaccionesLocalesFacturas() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturas) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTransaccionesLocalesFacturas(transaccioneslocalesfacturas,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturas,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTransaccionesLocalesFacturas(transaccioneslocalesfacturas);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTransaccionesLocalesFacturas(transaccioneslocalesfacturas,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTransaccionesLocalesFacturas(transaccioneslocalesfacturas);
	}
	
	public void setVariablesObjetoActualToFormularioTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturas) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelidTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturas.getId().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextAreanombre_completo_clienteTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturas.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_ivaTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturas.gettotal_iva().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturas.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_descuentoTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturas.gettotal_descuento().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotalTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturas.gettotal().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldivaTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturas.getiva().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldruc_clienteTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturas.getruc_cliente());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TransaccionesLocalesFacturas transaccioneslocalesfacturasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,transaccioneslocalesfacturasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TransaccionesLocalesFacturas transaccioneslocalesfacturasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				transaccioneslocalesfacturasLocal=this.transaccioneslocalesfacturas;
			} else {
				transaccioneslocalesfacturasLocal=this.transaccioneslocalesfacturasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(transaccioneslocalesfacturasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTransaccionesLocalesFacturas(transaccioneslocalesfacturasLocal,true);
					
					if(transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(transaccioneslocalesfacturasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(transaccioneslocalesfacturasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(transaccioneslocalesfacturas,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(transaccioneslocalesfacturas);
	}
	
	public void setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(transaccioneslocalesfacturas,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturas,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelidTransaccionesLocalesFacturas.getText()==null || this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelidTransaccionesLocalesFacturas.getText()=="" || this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelidTransaccionesLocalesFacturas.getText()=="Id") {
				this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelidTransaccionesLocalesFacturas.setText("0");
			}

			if(conColumnasBase) {transaccioneslocalesfacturas.setId(Long.parseLong(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelidTransaccionesLocalesFacturas.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionesLocalesFacturasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelIdTransaccionesLocalesFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccioneslocalesfacturas.setnombre_completo_cliente(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextAreanombre_completo_clienteTransaccionesLocalesFacturas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionesLocalesFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelnombre_completo_clienteTransaccionesLocalesFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccioneslocalesfacturas.settotal_iva(Double.parseDouble(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_ivaTransaccionesLocalesFacturas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabeltotal_ivaTransaccionesLocalesFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccioneslocalesfacturas.settotal_sin_iva(Double.parseDouble(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALSINIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabeltotal_sin_ivaTransaccionesLocalesFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccioneslocalesfacturas.settotal_descuento(Double.parseDouble(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_descuentoTransaccionesLocalesFacturas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALDESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabeltotal_descuentoTransaccionesLocalesFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccioneslocalesfacturas.settotal(Double.parseDouble(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotalTransaccionesLocalesFacturas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabeltotalTransaccionesLocalesFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccioneslocalesfacturas.setiva(Double.parseDouble(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldivaTransaccionesLocalesFacturas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionesLocalesFacturasConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelivaTransaccionesLocalesFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccioneslocalesfacturas.setruc_cliente(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldruc_clienteTransaccionesLocalesFacturas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionesLocalesFacturasConstantesFunciones.LABEL_RUCCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelruc_clienteTransaccionesLocalesFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturasBean,TransaccionesLocalesFacturas transaccioneslocalesfacturas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturasOrigen,TransaccionesLocalesFacturas transaccioneslocalesfacturas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transaccioneslocalesfacturasOrigen.getId()!=null && !transaccioneslocalesfacturasOrigen.getId().equals(0L))) {transaccioneslocalesfacturas.setId(transaccioneslocalesfacturasOrigen.getId());}}
			if(conDefault || (!conDefault && transaccioneslocalesfacturasOrigen.getfecha_desde()!=null && !transaccioneslocalesfacturasOrigen.getfecha_desde().equals(new Date()))) {transaccioneslocalesfacturas.setfecha_desde(transaccioneslocalesfacturasOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && transaccioneslocalesfacturasOrigen.getfecha_hasta()!=null && !transaccioneslocalesfacturasOrigen.getfecha_hasta().equals(new Date()))) {transaccioneslocalesfacturas.setfecha_hasta(transaccioneslocalesfacturasOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && transaccioneslocalesfacturasOrigen.getnombre_completo_cliente()!=null && !transaccioneslocalesfacturasOrigen.getnombre_completo_cliente().equals(""))) {transaccioneslocalesfacturas.setnombre_completo_cliente(transaccioneslocalesfacturasOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && transaccioneslocalesfacturasOrigen.gettotal_iva()!=null && !transaccioneslocalesfacturasOrigen.gettotal_iva().equals(0.0))) {transaccioneslocalesfacturas.settotal_iva(transaccioneslocalesfacturasOrigen.gettotal_iva());}
			if(conDefault || (!conDefault && transaccioneslocalesfacturasOrigen.gettotal_sin_iva()!=null && !transaccioneslocalesfacturasOrigen.gettotal_sin_iva().equals(0.0))) {transaccioneslocalesfacturas.settotal_sin_iva(transaccioneslocalesfacturasOrigen.gettotal_sin_iva());}
			if(conDefault || (!conDefault && transaccioneslocalesfacturasOrigen.gettotal_descuento()!=null && !transaccioneslocalesfacturasOrigen.gettotal_descuento().equals(0.0))) {transaccioneslocalesfacturas.settotal_descuento(transaccioneslocalesfacturasOrigen.gettotal_descuento());}
			if(conDefault || (!conDefault && transaccioneslocalesfacturasOrigen.gettotal()!=null && !transaccioneslocalesfacturasOrigen.gettotal().equals(0.0))) {transaccioneslocalesfacturas.settotal(transaccioneslocalesfacturasOrigen.gettotal());}
			if(conDefault || (!conDefault && transaccioneslocalesfacturasOrigen.getiva()!=null && !transaccioneslocalesfacturasOrigen.getiva().equals(0.0))) {transaccioneslocalesfacturas.setiva(transaccioneslocalesfacturasOrigen.getiva());}
			if(conDefault || (!conDefault && transaccioneslocalesfacturasOrigen.getruc_cliente()!=null && !transaccioneslocalesfacturasOrigen.getruc_cliente().equals(""))) {transaccioneslocalesfacturas.setruc_cliente(transaccioneslocalesfacturasOrigen.getruc_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturas) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelidTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturas.getId().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextAreanombre_completo_clienteTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturas.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_ivaTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturas.gettotal_iva().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturas.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_descuentoTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturas.gettotal_descuento().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotalTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturas.gettotal().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldivaTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturas.getiva().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldruc_clienteTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturas.getruc_cliente());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransaccionesLocalesFacturas(TransaccionesLocalesFacturasBean transaccioneslocalesfacturasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelidTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturasBean.getId().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextAreanombre_completo_clienteTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturasBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_ivaTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturasBean.gettotal_iva().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturasBean.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_descuentoTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturasBean.gettotal_descuento().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotalTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturasBean.gettotal().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldivaTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturasBean.getiva().toString());
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldruc_clienteTransaccionesLocalesFacturas.setText(transaccioneslocalesfacturasBean.getruc_cliente());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTransaccionesLocalesFacturas(TransaccionesLocalesFacturasParameterReturnGeneral transaccioneslocalesfacturasReturnGeneral,TransaccionesLocalesFacturasBean transaccioneslocalesfacturasBean,Boolean conDefault) throws Exception { 
		try {
			TransaccionesLocalesFacturas transaccioneslocalesfacturasLocal=new TransaccionesLocalesFacturas();
			
			transaccioneslocalesfacturasLocal=transaccioneslocalesfacturasReturnGeneral.getTransaccionesLocalesFacturas();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transaccioneslocalesfacturasLocal.getId()!=null && !transaccioneslocalesfacturasLocal.getId().equals(0L))) {transaccioneslocalesfacturasBean.setId(transaccioneslocalesfacturasLocal.getId());}}
			if(conDefault || (!conDefault && transaccioneslocalesfacturasLocal.getnombre_completo_cliente()!=null && !transaccioneslocalesfacturasLocal.getnombre_completo_cliente().equals(""))) {transaccioneslocalesfacturasBean.setnombre_completo_cliente(transaccioneslocalesfacturasLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && transaccioneslocalesfacturasLocal.gettotal_iva()!=null && !transaccioneslocalesfacturasLocal.gettotal_iva().equals(0.0))) {transaccioneslocalesfacturasBean.settotal_iva(transaccioneslocalesfacturasLocal.gettotal_iva());}
			if(conDefault || (!conDefault && transaccioneslocalesfacturasLocal.gettotal_sin_iva()!=null && !transaccioneslocalesfacturasLocal.gettotal_sin_iva().equals(0.0))) {transaccioneslocalesfacturasBean.settotal_sin_iva(transaccioneslocalesfacturasLocal.gettotal_sin_iva());}
			if(conDefault || (!conDefault && transaccioneslocalesfacturasLocal.gettotal_descuento()!=null && !transaccioneslocalesfacturasLocal.gettotal_descuento().equals(0.0))) {transaccioneslocalesfacturasBean.settotal_descuento(transaccioneslocalesfacturasLocal.gettotal_descuento());}
			if(conDefault || (!conDefault && transaccioneslocalesfacturasLocal.gettotal()!=null && !transaccioneslocalesfacturasLocal.gettotal().equals(0.0))) {transaccioneslocalesfacturasBean.settotal(transaccioneslocalesfacturasLocal.gettotal());}
			if(conDefault || (!conDefault && transaccioneslocalesfacturasLocal.getiva()!=null && !transaccioneslocalesfacturasLocal.getiva().equals(0.0))) {transaccioneslocalesfacturasBean.setiva(transaccioneslocalesfacturasLocal.getiva());}
			if(conDefault || (!conDefault && transaccioneslocalesfacturasLocal.getruc_cliente()!=null && !transaccioneslocalesfacturasLocal.getruc_cliente().equals(""))) {transaccioneslocalesfacturasBean.setruc_cliente(transaccioneslocalesfacturasLocal.getruc_cliente());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTransaccionesLocalesFacturasGenerico(Long idTransaccionesLocalesFacturasSeleccionado,JComboBox jComboBoxTransaccionesLocalesFacturas,List<TransaccionesLocalesFacturas> transaccioneslocalesfacturassLocal)throws Exception {
		try {
			TransaccionesLocalesFacturas  transaccioneslocalesfacturasTemp=null;

			for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:transaccioneslocalesfacturassLocal) {
				if(transaccioneslocalesfacturasAux.getId()!=null && transaccioneslocalesfacturasAux.getId().equals(idTransaccionesLocalesFacturasSeleccionado)) {
					transaccioneslocalesfacturasTemp=transaccioneslocalesfacturasAux;
					break;
				}
			}

			jComboBoxTransaccionesLocalesFacturas.setSelectedItem(transaccioneslocalesfacturasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTransaccionesLocalesFacturasGenerico(JComboBox jComboBoxTransaccionesLocalesFacturas,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTransaccionesLocalesFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransaccionesLocalesFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTransaccionesLocalesFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransaccionesLocalesFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransaccionesLocalesFacturas.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTransaccionesLocalesFacturas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransaccionesLocalesFacturas.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTransaccionesLocalesFacturas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTransaccionesLocalesFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTransaccionesLocalesFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transaccioneslocalesfacturas=(TransaccionesLocalesFacturas) transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) transaccioneslocalesfacturass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!transaccioneslocalesfacturas.getIsNew() && !transaccioneslocalesfacturas.getIsChanged() && !transaccioneslocalesfacturas.getIsDeleted()) {
				sDescripcion=transaccioneslocalesfacturas.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=transaccioneslocalesfacturas.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!transaccioneslocalesfacturas.getIsNew() && !transaccioneslocalesfacturas.getIsChanged() && !transaccioneslocalesfacturas.getIsDeleted()) {
				sDescripcion=transaccioneslocalesfacturas.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=transaccioneslocalesfacturas.getejercicio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TransaccionesLocalesFacturas transaccioneslocalesfacturasRow=new TransaccionesLocalesFacturas();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transaccioneslocalesfacturasRow=(TransaccionesLocalesFacturas) transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transaccioneslocalesfacturasRow=(TransaccionesLocalesFacturas) transaccioneslocalesfacturass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTransaccionesLocalesFacturas(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas && this.isPermisoNuevoTransaccionesLocalesFacturas));			
			this.jButtonDuplicarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaDuplicarTransaccionesLocalesFacturas && this.isPermisoDuplicarTransaccionesLocalesFacturas));			
			this.jButtonCopiarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaCopiarTransaccionesLocalesFacturas && this.isPermisoCopiarTransaccionesLocalesFacturas));
			this.jButtonVerFormTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaVerFormTransaccionesLocalesFacturas && this.isPermisoVerFormTransaccionesLocalesFacturas));
			
			this.jButtonAbrirOrderByTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaOrdenTransaccionesLocalesFacturas && this.isPermisoOrdenTransaccionesLocalesFacturas));			
			
			this.jButtonNuevoRelacionesTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas && this.isPermisoNuevoTransaccionesLocalesFacturas));			
			this.jButtonNuevoGuardarCambiosTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas && this.isPermisoNuevoTransaccionesLocalesFacturas && this.isPermisoGuardarCambiosTransaccionesLocalesFacturas));
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonModificarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaModificarTransaccionesLocalesFacturas && this.isPermisoActualizarTransaccionesLocalesFacturas));	
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonActualizarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaActualizarTransaccionesLocalesFacturas && this.isPermisoActualizarTransaccionesLocalesFacturas));	
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonEliminarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaEliminarTransaccionesLocalesFacturas && this.isPermisoEliminarTransaccionesLocalesFacturas));
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonCancelarTransaccionesLocalesFacturas.setVisible(this.isVisibilidadCeldaCancelarTransaccionesLocalesFacturas);							
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonGuardarCambiosTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas && this.isPermisoGuardarCambiosTransaccionesLocalesFacturas));			
			
			}
						
			this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas && this.isPermisoGuardarCambiosTransaccionesLocalesFacturas));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas && this.isPermisoNuevoTransaccionesLocalesFacturas));						
			this.jButtonDuplicarToolBarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaDuplicarTransaccionesLocalesFacturas && this.isPermisoDuplicarTransaccionesLocalesFacturas));						
			this.jButtonCopiarToolBarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaCopiarTransaccionesLocalesFacturas && this.isPermisoCopiarTransaccionesLocalesFacturas));			
			this.jButtonVerFormToolBarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaVerFormTransaccionesLocalesFacturas && this.isPermisoVerFormTransaccionesLocalesFacturas));			
			this.jButtonAbrirOrderByToolBarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaOrdenTransaccionesLocalesFacturas && this.isPermisoOrdenTransaccionesLocalesFacturas));
			this.jButtonNuevoRelacionesToolBarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas && this.isPermisoNuevoTransaccionesLocalesFacturas));			
			this.jButtonNuevoGuardarCambiosToolBarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas && this.isPermisoNuevoTransaccionesLocalesFacturas && this.isPermisoGuardarCambiosTransaccionesLocalesFacturas));			
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonModificarToolBarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaModificarTransaccionesLocalesFacturas && this.isPermisoActualizarTransaccionesLocalesFacturas));	
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonActualizarToolBarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaActualizarTransaccionesLocalesFacturas  && this.isPermisoActualizarTransaccionesLocalesFacturas));	
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonEliminarToolBarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaEliminarTransaccionesLocalesFacturas && this.isPermisoEliminarTransaccionesLocalesFacturas));
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonCancelarToolBarTransaccionesLocalesFacturas.setVisible(this.isVisibilidadCeldaCancelarTransaccionesLocalesFacturas);				
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonGuardarCambiosToolBarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas && this.isPermisoGuardarCambiosTransaccionesLocalesFacturas));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas && this.isPermisoGuardarCambiosTransaccionesLocalesFacturas));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas && this.isPermisoNuevoTransaccionesLocalesFacturas));			
			this.jMenuItemDuplicarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaDuplicarTransaccionesLocalesFacturas && this.isPermisoDuplicarTransaccionesLocalesFacturas));			
			this.jMenuItemCopiarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaCopiarTransaccionesLocalesFacturas && this.isPermisoCopiarTransaccionesLocalesFacturas));			
			this.jMenuItemVerFormTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaVerFormTransaccionesLocalesFacturas && this.isPermisoVerFormTransaccionesLocalesFacturas));			
			this.jMenuItemAbrirOrderByTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaOrdenTransaccionesLocalesFacturas && this.isPermisoOrdenTransaccionesLocalesFacturas));			
			//this.jMenuItemMostrarOcultarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaOrdenTransaccionesLocalesFacturas && this.isPermisoOrdenTransaccionesLocalesFacturas));
			this.jMenuItemDetalleAbrirOrderByTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaOrdenTransaccionesLocalesFacturas && this.isPermisoOrdenTransaccionesLocalesFacturas));			
			//this.jMenuItemDetalleMostrarOcultarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaOrdenTransaccionesLocalesFacturas && this.isPermisoOrdenTransaccionesLocalesFacturas));			
			this.jMenuItemNuevoRelacionesTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas && this.isPermisoNuevoTransaccionesLocalesFacturas));			
			this.jMenuItemNuevoGuardarCambiosTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas && this.isPermisoNuevoTransaccionesLocalesFacturas && this.isPermisoGuardarCambiosTransaccionesLocalesFacturas));									
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jMenuItemModificarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaModificarTransaccionesLocalesFacturas && this.isPermisoActualizarTransaccionesLocalesFacturas));	
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jMenuItemActualizarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaActualizarTransaccionesLocalesFacturas && this.isPermisoActualizarTransaccionesLocalesFacturas));	
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jMenuItemEliminarTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaEliminarTransaccionesLocalesFacturas && this.isPermisoEliminarTransaccionesLocalesFacturas));
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jMenuItemCancelarTransaccionesLocalesFacturas.setVisible(this.isVisibilidadCeldaCancelarTransaccionesLocalesFacturas);				
			}
			
			this.jMenuItemGuardarCambiosTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas && this.isPermisoGuardarCambiosTransaccionesLocalesFacturas));						
			this.jMenuItemGuardarCambiosTablaTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas && this.isPermisoGuardarCambiosTransaccionesLocalesFacturas));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas=this.jButtonNuevoTransaccionesLocalesFacturas.isVisible();
			this.isVisibilidadCeldaDuplicarTransaccionesLocalesFacturas=this.jButtonDuplicarTransaccionesLocalesFacturas.isVisible();
			this.isVisibilidadCeldaCopiarTransaccionesLocalesFacturas=this.jButtonCopiarTransaccionesLocalesFacturas.isVisible();
			this.isVisibilidadCeldaVerFormTransaccionesLocalesFacturas=this.jButtonVerFormTransaccionesLocalesFacturas.isVisible();
			
			this.isVisibilidadCeldaOrdenTransaccionesLocalesFacturas=this.jButtonAbrirOrderByTransaccionesLocalesFacturas.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas=this.jButtonNuevoRelacionesTransaccionesLocalesFacturas.isVisible();
			this.isVisibilidadCeldaModificarTransaccionesLocalesFacturas=this.jButtonModificarTransaccionesLocalesFacturas.isVisible();
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
			this.isVisibilidadCeldaActualizarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonActualizarTransaccionesLocalesFacturas.isVisible();
			this.isVisibilidadCeldaEliminarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonEliminarTransaccionesLocalesFacturas.isVisible();
			this.isVisibilidadCeldaCancelarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonCancelarTransaccionesLocalesFacturas.isVisible();
			this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonGuardarCambiosTransaccionesLocalesFacturas.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas=this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas=this.jButtonNuevoToolBarTransaccionesLocalesFacturas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas=this.jButtonNuevoRelacionesToolBarTransaccionesLocalesFacturas.isVisible();
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
			this.isVisibilidadCeldaModificarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonModificarToolBarTransaccionesLocalesFacturas.isVisible();
			this.isVisibilidadCeldaActualizarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonActualizarToolBarTransaccionesLocalesFacturas.isVisible();
			this.isVisibilidadCeldaEliminarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonEliminarToolBarTransaccionesLocalesFacturas.isVisible();
			this.isVisibilidadCeldaCancelarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonCancelarToolBarTransaccionesLocalesFacturas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=this.jButtonGuardarCambiosToolBarTransaccionesLocalesFacturas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas=this.jButtonGuardarCambiosTablaToolBarTransaccionesLocalesFacturas.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas=this.jMenuItemNuevoTransaccionesLocalesFacturas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas=this.jMenuItemNuevoRelacionesTransaccionesLocalesFacturas.isVisible();
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
			this.isVisibilidadCeldaModificarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jMenuItemModificarTransaccionesLocalesFacturas.isVisible();
			this.isVisibilidadCeldaActualizarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jMenuItemActualizarTransaccionesLocalesFacturas.isVisible();
			this.isVisibilidadCeldaEliminarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jMenuItemEliminarTransaccionesLocalesFacturas.isVisible();
			this.isVisibilidadCeldaCancelarTransaccionesLocalesFacturas=this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jMenuItemCancelarTransaccionesLocalesFacturas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=this.jMenuItemGuardarCambiosTransaccionesLocalesFacturas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas=this.jMenuItemGuardarCambiosTablaTransaccionesLocalesFacturas.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTransaccionesLocalesFacturas(Boolean esInicializar) {
		if(TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones()) {
				//if(this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTransaccionesLocalesFacturas();
			}
			
			this.inicializarActualizarBindingBotonesManualTransaccionesLocalesFacturas(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTransaccionesLocalesFacturas() {
		this.jButtonNuevoTransaccionesLocalesFacturas.setVisible(this.isPermisoNuevoTransaccionesLocalesFacturas);			
		this.jButtonDuplicarTransaccionesLocalesFacturas.setVisible(this.isPermisoDuplicarTransaccionesLocalesFacturas);			
		this.jButtonCopiarTransaccionesLocalesFacturas.setVisible(this.isPermisoCopiarTransaccionesLocalesFacturas);			
		this.jButtonVerFormTransaccionesLocalesFacturas.setVisible(this.isPermisoVerFormTransaccionesLocalesFacturas);			
		
		this.jButtonAbrirOrderByTransaccionesLocalesFacturas.setVisible(this.isPermisoOrdenTransaccionesLocalesFacturas);					
		
		this.jButtonNuevoRelacionesTransaccionesLocalesFacturas.setVisible(this.isPermisoNuevoTransaccionesLocalesFacturas);			
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonModificarTransaccionesLocalesFacturas.setVisible(this.isPermisoActualizarTransaccionesLocalesFacturas);	
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonActualizarTransaccionesLocalesFacturas.setVisible(this.isPermisoActualizarTransaccionesLocalesFacturas);	
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonEliminarTransaccionesLocalesFacturas.setVisible(this.isPermisoEliminarTransaccionesLocalesFacturas);
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonCancelarTransaccionesLocalesFacturas.setVisible(this.isVisibilidadCeldaCancelarTransaccionesLocalesFacturas);						
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonGuardarCambiosTransaccionesLocalesFacturas.setVisible(this.isPermisoGuardarCambiosTransaccionesLocalesFacturas);							
		}
		
		this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas.setVisible(this.isPermisoActualizarTransaccionesLocalesFacturas);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTransaccionesLocalesFacturas() {
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonModificarTransaccionesLocalesFacturas.setVisible(this.isPermisoActualizarTransaccionesLocalesFacturas);	
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonActualizarTransaccionesLocalesFacturas.setVisible(this.isPermisoActualizarTransaccionesLocalesFacturas);	
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonEliminarTransaccionesLocalesFacturas.setVisible(this.isPermisoEliminarTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonCancelarTransaccionesLocalesFacturas.setVisible(this.isVisibilidadCeldaCancelarTransaccionesLocalesFacturas);							
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonGuardarCambiosTransaccionesLocalesFacturas.setVisible((this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas && this.isPermisoGuardarCambiosTransaccionesLocalesFacturas));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTransaccionesLocalesFacturas() {
		if(TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTransaccionesLocalesFacturas();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTransaccionesLocalesFacturas() {
	}
	
	public void jTableDatosTransaccionesLocalesFacturasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTransaccionesLocalesFacturas(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTransaccionesLocalesFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.gettransaccioneslocalesfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesfacturas==null) {
						this.transaccioneslocalesfacturas = new TransaccionesLocalesFacturas();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
				}

				if(this.transaccioneslocalesfacturas.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.transaccioneslocalesfacturas.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTransaccionesLocalesFacturasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTransaccionesLocalesFacturas(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccionesLocalesFacturas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccionesLocalesFacturas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.gettransaccioneslocalesfacturas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.transaccioneslocalesfacturasLogic.getConnexion());

				if(this.transaccioneslocalesfacturas.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.transaccioneslocalesfacturas.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccionesLocalesFacturas=(TitledBorder)this.jScrollPanelDatosTransaccionesLocalesFacturas.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTransaccionesLocalesFacturas.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTransaccionesLocalesFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.gettransaccioneslocalesfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesfacturas==null) {
						this.transaccioneslocalesfacturas = new TransaccionesLocalesFacturas();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
				}

				if(this.transaccioneslocalesfacturas.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.transaccioneslocalesfacturas.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioTransaccionesLocalesFacturasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebTransaccionesLocalesFacturas(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccionesLocalesFacturas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccionesLocalesFacturas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.gettransaccioneslocalesfacturas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.transaccioneslocalesfacturasLogic.getConnexion());

				if(this.transaccioneslocalesfacturas.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.transaccioneslocalesfacturas.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccionesLocalesFacturas=(TitledBorder)this.jScrollPanelDatosTransaccionesLocalesFacturas.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderTransaccionesLocalesFacturas.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioTransaccionesLocalesFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.gettransaccioneslocalesfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesfacturas==null) {
						this.transaccioneslocalesfacturas = new TransaccionesLocalesFacturas();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
				}

				if(this.transaccioneslocalesfacturas.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.transaccioneslocalesfacturas.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeTransaccionesLocalesFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.gettransaccioneslocalesfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesfacturas==null) {
						this.transaccioneslocalesfacturas = new TransaccionesLocalesFacturas();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
				}

				if(this.transaccioneslocalesfacturas.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.transaccioneslocalesfacturas.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaTransaccionesLocalesFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.gettransaccioneslocalesfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesfacturas==null) {
						this.transaccioneslocalesfacturas = new TransaccionesLocalesFacturas();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
				}

				if(this.transaccioneslocalesfacturas.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.transaccioneslocalesfacturas.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteTransaccionesLocalesFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.gettransaccioneslocalesfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesfacturas==null) {
						this.transaccioneslocalesfacturas = new TransaccionesLocalesFacturas();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
				}

				if(this.transaccioneslocalesfacturas.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.transaccioneslocalesfacturas.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_ivaTransaccionesLocalesFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.gettransaccioneslocalesfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesfacturas==null) {
						this.transaccioneslocalesfacturas = new TransaccionesLocalesFacturas();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
				}

				if(this.transaccioneslocalesfacturas.gettotal_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_iva = "+this.transaccioneslocalesfacturas.gettotal_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_sin_ivaTransaccionesLocalesFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.gettransaccioneslocalesfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesfacturas==null) {
						this.transaccioneslocalesfacturas = new TransaccionesLocalesFacturas();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
				}

				if(this.transaccioneslocalesfacturas.gettotal_sin_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_sin_iva = "+this.transaccioneslocalesfacturas.gettotal_sin_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_descuentoTransaccionesLocalesFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.gettransaccioneslocalesfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesfacturas==null) {
						this.transaccioneslocalesfacturas = new TransaccionesLocalesFacturas();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
				}

				if(this.transaccioneslocalesfacturas.gettotal_descuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_descuento = "+this.transaccioneslocalesfacturas.gettotal_descuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalTransaccionesLocalesFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.gettransaccioneslocalesfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesfacturas==null) {
						this.transaccioneslocalesfacturas = new TransaccionesLocalesFacturas();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
				}

				if(this.transaccioneslocalesfacturas.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.transaccioneslocalesfacturas.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaTransaccionesLocalesFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.gettransaccioneslocalesfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesfacturas==null) {
						this.transaccioneslocalesfacturas = new TransaccionesLocalesFacturas();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
				}

				if(this.transaccioneslocalesfacturas.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.transaccioneslocalesfacturas.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonruc_clienteTransaccionesLocalesFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.gettransaccioneslocalesfacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioneslocalesfacturas==null) {
						this.transaccioneslocalesfacturas = new TransaccionesLocalesFacturas();
					}

					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);
				}

				if(this.transaccioneslocalesfacturas.getruc_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc_cliente like '%"+this.transaccioneslocalesfacturas.getruc_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false,false);

			this.getTransaccionesLocalesFacturassBusquedaTransaccionesLocalesFacturas();

			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);

			//if(TransaccionesLocalesFacturasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionesLocalesFacturas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false,false);

			this.getTransaccionesLocalesFacturassFK_IdEjercicio();

			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);

			//if(TransaccionesLocalesFacturasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionesLocalesFacturas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTransaccionesLocalesFacturasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false,false);

			this.getTransaccionesLocalesFacturassFK_IdEmpresa();

			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);

			//if(TransaccionesLocalesFacturasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionesLocalesFacturas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioneslocalesfacturasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTransaccionesLocalesFacturas() {
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.setVisible(false);	    			
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.dispose();
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas!=null) {
			this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.dispose();
			this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas=null;
		}
		
		if(this.jInternalFrameImportacionTransaccionesLocalesFacturas!=null) {
			this.jInternalFrameImportacionTransaccionesLocalesFacturas.setVisible(false);	    			
			this.jInternalFrameImportacionTransaccionesLocalesFacturas.dispose();
			this.jInternalFrameImportacionTransaccionesLocalesFacturas=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTransaccionesLocalesFacturas();
			
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
			
			
			if(sTipo.equals("NuevoTransaccionesLocalesFacturas")) {
				jButtonNuevoTransaccionesLocalesFacturasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTransaccionesLocalesFacturas")) {
				jButtonDuplicarTransaccionesLocalesFacturasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTransaccionesLocalesFacturas")) {
				jButtonCopiarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("VerFormTransaccionesLocalesFacturas")) {
				jButtonVerFormTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTransaccionesLocalesFacturas")) {
				jButtonNuevoTransaccionesLocalesFacturasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTransaccionesLocalesFacturas")) {
				jButtonDuplicarTransaccionesLocalesFacturasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTransaccionesLocalesFacturas")) {
				jButtonNuevoTransaccionesLocalesFacturasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTransaccionesLocalesFacturas")) {
				jButtonDuplicarTransaccionesLocalesFacturasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTransaccionesLocalesFacturas")) {
				jButtonNuevoTransaccionesLocalesFacturasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTransaccionesLocalesFacturas")) {
				jButtonNuevoTransaccionesLocalesFacturasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTransaccionesLocalesFacturas")) {
				jButtonNuevoTransaccionesLocalesFacturasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTransaccionesLocalesFacturas")) {
				jButtonModificarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTransaccionesLocalesFacturas")) {
				jButtonModificarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTransaccionesLocalesFacturas")) {
				jButtonModificarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTransaccionesLocalesFacturas")) {
				jButtonActualizarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTransaccionesLocalesFacturas")) {
				jButtonActualizarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTransaccionesLocalesFacturas")) {
				jButtonActualizarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("EliminarTransaccionesLocalesFacturas")) {
				jButtonEliminarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTransaccionesLocalesFacturas")) {
				jButtonEliminarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTransaccionesLocalesFacturas")) {
				jButtonEliminarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("CancelarTransaccionesLocalesFacturas")) {
				jButtonCancelarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTransaccionesLocalesFacturas")) {
				jButtonCancelarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTransaccionesLocalesFacturas")) {
				jButtonCancelarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("CerrarTransaccionesLocalesFacturas")) {
				jButtonCerrarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTransaccionesLocalesFacturas")) {
				jButtonCerrarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTransaccionesLocalesFacturas")) {
				jButtonCerrarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTransaccionesLocalesFacturas")) {
				jButtonMostrarOcultarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTransaccionesLocalesFacturas")) {
				jButtonCancelarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTransaccionesLocalesFacturas")) {
				jButtonGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTransaccionesLocalesFacturas")) {
				jButtonGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTransaccionesLocalesFacturas")) {
				jButtonCopiarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTransaccionesLocalesFacturas")) {
				jButtonVerFormTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTransaccionesLocalesFacturas")) {
				jButtonGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTransaccionesLocalesFacturas")) {
				jButtonCopiarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTransaccionesLocalesFacturas")) {
				jButtonVerFormTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTransaccionesLocalesFacturas")) {
				jButtonGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTransaccionesLocalesFacturas")) {
				jButtonGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTransaccionesLocalesFacturas")) {
				jButtonGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTransaccionesLocalesFacturas")) {
				jButtonRecargarInformacionTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTransaccionesLocalesFacturas")) {
				jButtonRecargarInformacionTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTransaccionesLocalesFacturas")) {
				jButtonRecargarInformacionTransaccionesLocalesFacturasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTransaccionesLocalesFacturas")) {
				jButtonAnterioresTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTransaccionesLocalesFacturas")) {
				jButtonAnterioresTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTransaccionesLocalesFacturas")) {
				jButtonAnterioresTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTransaccionesLocalesFacturas")) {
				jButtonSiguientesTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTransaccionesLocalesFacturas")) {
				jButtonSiguientesTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTransaccionesLocalesFacturas")) {
				jButtonSiguientesTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTransaccionesLocalesFacturas") || sTipo.equals("MenuItemDetalleAbrirOrderByTransaccionesLocalesFacturas")) {
				jButtonAbrirOrderByTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTransaccionesLocalesFacturas") || sTipo.equals("MenuItemDetalleMostrarOcultarTransaccionesLocalesFacturas")) {
				jButtonMostrarOcultarTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTransaccionesLocalesFacturas")) {
				jButtonNuevoGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTransaccionesLocalesFacturas")) {
				jButtonNuevoGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTransaccionesLocalesFacturas")) {
				jButtonNuevoGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTransaccionesLocalesFacturas")) {
				jButtonCerrarReporteDinamicoTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTransaccionesLocalesFacturas")) {
				jButtonGenerarReporteDinamicoTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTransaccionesLocalesFacturas")) {
				
				jButtonGenerarExcelReporteDinamicoTransaccionesLocalesFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTransaccionesLocalesFacturas")) {
				jButtonCerrarImportacionTransaccionesLocalesFacturasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTransaccionesLocalesFacturas")) {
				
				jButtonGenerarImportacionTransaccionesLocalesFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTransaccionesLocalesFacturas")) {
				
				jButtonAbrirImportacionTransaccionesLocalesFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTransaccionesLocalesFacturas")) {
				jComboBoxTiposAccionesTransaccionesLocalesFacturasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTransaccionesLocalesFacturas")) {
				jComboBoxTiposRelacionesTransaccionesLocalesFacturasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTransaccionesLocalesFacturas")) {
				jComboBoxTiposAccionesTransaccionesLocalesFacturasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTransaccionesLocalesFacturas")) {
				
				jComboBoxTiposSeleccionarTransaccionesLocalesFacturasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTransaccionesLocalesFacturas")) {
				jTextFieldValorCampoGeneralTransaccionesLocalesFacturasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTransaccionesLocalesFacturas")) {
				jButtonAbrirOrderByTransaccionesLocalesFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTransaccionesLocalesFacturas")) {
				jButtonAbrirOrderByTransaccionesLocalesFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTransaccionesLocalesFacturas")) {
				jButtonCerrarOrderByTransaccionesLocalesFacturasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransaccionesLocalesFacturasBusqueda")) {
				this.jButtonidTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTransaccionesLocalesFacturasUpdate")) {
				this.jButtonid_empresaTransaccionesLocalesFacturasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTransaccionesLocalesFacturasBusqueda")) {
				this.jButtonid_empresaTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioTransaccionesLocalesFacturasUpdate")) {
				this.jButtonid_ejercicioTransaccionesLocalesFacturasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioTransaccionesLocalesFacturasBusqueda")) {
				this.jButtonid_ejercicioTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeTransaccionesLocalesFacturasBusqueda")) {
				this.jButtonfecha_desdeTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaTransaccionesLocalesFacturasBusqueda")) {
				this.jButtonfecha_hastaTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteTransaccionesLocalesFacturasBusqueda")) {
				this.jButtonnombre_completo_clienteTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_ivaTransaccionesLocalesFacturasBusqueda")) {
				this.jButtontotal_ivaTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_sin_ivaTransaccionesLocalesFacturasBusqueda")) {
				this.jButtontotal_sin_ivaTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_descuentoTransaccionesLocalesFacturasBusqueda")) {
				this.jButtontotal_descuentoTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalTransaccionesLocalesFacturasBusqueda")) {
				this.jButtontotalTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaTransaccionesLocalesFacturasBusqueda")) {
				this.jButtonivaTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_clienteTransaccionesLocalesFacturasBusqueda")) {
				this.jButtonruc_clienteTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas")) {
				this.jButtonBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturasActionPerformed(evt);
			}
			
			;
			
			
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTransaccionesLocalesFacturas();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionesLocalesFacturasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesfacturas);
				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
				
				


				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TransaccionesLocalesFacturas transaccioneslocalesfacturasLocal=null;
			
			if(!this.getEsControlTabla()) {
				transaccioneslocalesfacturasLocal=this.transaccioneslocalesfacturas;
			} else {
				transaccioneslocalesfacturasLocal=this.transaccioneslocalesfacturasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesfacturas);
				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
							
				
				


				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionesLocalesFacturasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasAnterior =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioneslocalesfacturasAnterior =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
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
			
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
			
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
			
			


			
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionesLocalesFacturasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesfacturas);
				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
								
						
				


				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesFacturas.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesfacturas);
				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
								
				
				


				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionesLocalesFacturasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasAnterior =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioneslocalesfacturasAnterior =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesfacturas);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionesLocalesFacturasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasAnterior =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioneslocalesfacturasAnterior =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionesLocalesFacturasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesfacturas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesfacturas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesfacturas);
				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
							
				
				


				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesFacturas.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionesLocalesFacturasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesfacturasAnterior =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transaccioneslocalesfacturasAnterior =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
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
			
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
			
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
			
			


			
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionesLocalesFacturasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesfacturas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesfacturas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesfacturas);
				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
								
				
				


				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionesLocalesFacturasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasAnterior =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioneslocalesfacturasAnterior =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionesLocalesFacturasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesfacturas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesfacturas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionesLocalesFacturasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesfacturas);
				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTransaccionesLocalesFacturas")) {
					jCheckBoxSeleccionarTodosTransaccionesLocalesFacturasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTransaccionesLocalesFacturas")) {
					jCheckBoxSeleccionadosTransaccionesLocalesFacturasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTransaccionesLocalesFacturas")) {
					
				}
				
				


				
				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesfacturas);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesfacturas);
				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
												
				
				


				
				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionesLocalesFacturasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioneslocalesfacturasAnterior =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transaccioneslocalesfacturasAnterior =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionesLocalesFacturasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesfacturas);
				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
				
				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
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
			
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
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
			
			


			
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionesLocalesFacturasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesfacturas);
				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesFacturas.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesFacturas.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioneslocalesfacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioneslocalesfacturas);
				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
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
				
				


				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionesLocalesFacturas.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionesLocalesFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionesLocalesFacturasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioneslocalesfacturasAnterior =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioneslocalesfacturasAnterior =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTransaccionesLocalesFacturas")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTransaccionesLocalesFacturasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTransaccionesLocalesFacturas.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.transaccioneslocalesfacturas =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.transaccioneslocalesfacturas);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTransaccionesLocalesFacturas")) {
				
				}
				
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTransaccionesLocalesFacturas")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTransaccionesLocalesFacturas.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTransaccionesLocalesFacturas")) {
			
			}
			
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTransaccionesLocalesFacturas();
			
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
			
			if(sTipo.equals("NuevoTransaccionesLocalesFacturas")) {
				jButtonNuevoTransaccionesLocalesFacturasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTransaccionesLocalesFacturas")) {
				jButtonDuplicarTransaccionesLocalesFacturasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTransaccionesLocalesFacturas")) {
				jButtonCopiarTransaccionesLocalesFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTransaccionesLocalesFacturas")) {
				jButtonVerFormTransaccionesLocalesFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTransaccionesLocalesFacturas")) {
				jButtonNuevoTransaccionesLocalesFacturasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTransaccionesLocalesFacturas")) {
				jButtonModificarTransaccionesLocalesFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTransaccionesLocalesFacturas")) {
				jButtonActualizarTransaccionesLocalesFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTransaccionesLocalesFacturas")) {
				jButtonEliminarTransaccionesLocalesFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTransaccionesLocalesFacturas")) {
				jButtonGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTransaccionesLocalesFacturas")) {
				jButtonCancelarTransaccionesLocalesFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTransaccionesLocalesFacturas")) {
				jButtonCerrarTransaccionesLocalesFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTransaccionesLocalesFacturas")) {
				jButtonGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTransaccionesLocalesFacturas")) {
				jButtonNuevoGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTransaccionesLocalesFacturas")) {
				jButtonAbrirOrderByTransaccionesLocalesFacturasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTransaccionesLocalesFacturas")) {
				jButtonRecargarInformacionTransaccionesLocalesFacturasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTransaccionesLocalesFacturas")) {
				jButtonAnterioresTransaccionesLocalesFacturasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTransaccionesLocalesFacturas")) {
				jButtonSiguientesTransaccionesLocalesFacturasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransaccionesLocalesFacturasBusqueda")) {
				this.jButtonidTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTransaccionesLocalesFacturasUpdate")) {
				this.jButtonid_empresaTransaccionesLocalesFacturasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTransaccionesLocalesFacturasBusqueda")) {
				this.jButtonid_empresaTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioTransaccionesLocalesFacturasUpdate")) {
				this.jButtonid_ejercicioTransaccionesLocalesFacturasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioTransaccionesLocalesFacturasBusqueda")) {
				this.jButtonid_ejercicioTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeTransaccionesLocalesFacturasBusqueda")) {
				this.jButtonfecha_desdeTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaTransaccionesLocalesFacturasBusqueda")) {
				this.jButtonfecha_hastaTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteTransaccionesLocalesFacturasBusqueda")) {
				this.jButtonnombre_completo_clienteTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_ivaTransaccionesLocalesFacturasBusqueda")) {
				this.jButtontotal_ivaTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_sin_ivaTransaccionesLocalesFacturasBusqueda")) {
				this.jButtontotal_sin_ivaTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_descuentoTransaccionesLocalesFacturasBusqueda")) {
				this.jButtontotal_descuentoTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalTransaccionesLocalesFacturasBusqueda")) {
				this.jButtontotalTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaTransaccionesLocalesFacturasBusqueda")) {
				this.jButtonivaTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_clienteTransaccionesLocalesFacturasBusqueda")) {
				this.jButtonruc_clienteTransaccionesLocalesFacturasBusquedaActionPerformed(evt);
			}
			
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTransaccionesLocalesFacturas();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTransaccionesLocalesFacturas")) {
				closingInternalFrameTransaccionesLocalesFacturas();
				
			} else if(sTipo.equals("jButtonCancelarTransaccionesLocalesFacturas")) {
				JInternalFrameBase jInternalFrameDetalleFormTransaccionesLocalesFacturas = (JInternalFrameBase)evt.getSource();
	            	
	            TransaccionesLocalesFacturasBeanSwingJInternalFrame jInternalFrameParent=(TransaccionesLocalesFacturasBeanSwingJInternalFrame)jInternalFrameDetalleFormTransaccionesLocalesFacturas.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTransaccionesLocalesFacturasActionPerformed(null);
			}
			
			TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transaccioneslocalesfacturas,new Object(),this.transaccioneslocalesfacturasParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTransaccionesLocalesFacturas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTransaccionesLocalesFacturas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTransaccionesLocalesFacturas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.transaccioneslocalesfacturas)) {
			if(!esControlTabla) {
				if(TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);			
				}
				
				if(this.transaccioneslocalesfacturasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTransaccionesLocalesFacturas(this.transaccioneslocalesfacturasReturnGeneral,this.transaccioneslocalesfacturasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.transaccioneslocalesfacturasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTransaccionesLocalesFacturas(classes,this.transaccioneslocalesfacturasReturnGeneral,this.transaccioneslocalesfacturasBean,false);
					}
						
					if(this.transaccioneslocalesfacturasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTransaccionesLocalesFacturas(this.transaccioneslocalesfacturasReturnGeneral.getTransaccionesLocalesFacturas());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTransaccionesLocalesFacturas(this.transaccioneslocalesfacturasReturnGeneral.getTransaccionesLocalesFacturas());	
					}
						
					if(this.transaccioneslocalesfacturasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTransaccionesLocalesFacturas(this.transaccioneslocalesfacturasReturnGeneral.getTransaccionesLocalesFacturas(),classes);//this.transaccioneslocalesfacturasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,classes);//this.transaccioneslocalesfacturasBean);									
				}
			
				if(TransaccionesLocalesFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionesLocalesFacturas(this.transaccioneslocalesfacturas);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.transaccioneslocalesfacturasAnterior!=null) {
						this.transaccioneslocalesfacturas=this.transaccioneslocalesfacturasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.transaccioneslocalesfacturasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.transaccioneslocalesfacturasReturnGeneral.getTransaccionesLocalesFacturas(),transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.transaccioneslocalesfacturasReturnGeneral.getTransaccionesLocalesFacturas(),this.transaccioneslocalesfacturass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTransaccionesLocalesFacturas.repaint();
				
				//((AbstractTableModel) this.jTableDatosTransaccionesLocalesFacturas.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTransaccionesLocalesFacturas();
			}
		}
	}
	
	public void actualizarVisualTableDatosTransaccionesLocalesFacturas() throws Exception {
		
		TransaccionesLocalesFacturasModel transaccioneslocalesfacturasModel=(TransaccionesLocalesFacturasModel)this.jTableDatosTransaccionesLocalesFacturas.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transaccioneslocalesfacturasModel.transaccioneslocalesfacturass=this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			transaccioneslocalesfacturasModel.transaccioneslocalesfacturass=this.transaccioneslocalesfacturass;
		}
		
		
		((TransaccionesLocalesFacturasModel) this.jTableDatosTransaccionesLocalesFacturas.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTransaccionesLocalesFacturas() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettransaccioneslocalesfacturasAnterior(),this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettransaccioneslocalesfacturasAnterior(),this.transaccioneslocalesfacturass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTransaccionesLocalesFacturas();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturas,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
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
										
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccioneslocalesfacturas,new Object(),generalEntityParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TransaccionesLocalesFacturasConstantesFunciones.getClassesRelationshipsOfTransaccionesLocalesFacturas(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TransaccionesLocalesFacturasConstantesFunciones.getClassesRelationshipsFromStringsOfTransaccionesLocalesFacturas(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTransaccionesLocalesFacturas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccioneslocalesfacturas,new Object(),generalEntityParameterGeneral,this.transaccioneslocalesfacturasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTransaccionesLocalesFacturas(TransaccionesLocalesFacturasBean transaccioneslocalesfacturasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTransaccionesLocalesFacturas(ArrayList<Classe> classes,TransaccionesLocalesFacturasReturnGeneral transaccioneslocalesfacturasReturnGeneral,TransaccionesLocalesFacturasBean transaccioneslocalesfacturasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturas,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.transaccioneslocalesfacturas)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas = new TransaccionesLocalesFacturasDetalleFormJInternalFrame(jDesktopPane,this.transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones(),this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.setVisible(false);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.setSelected(false);						
		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.transaccioneslocalesfacturasLogic=this.transaccioneslocalesfacturasLogic;
		
		this.cargarCombosFrameForeignKeyTransaccionesLocalesFacturas("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTransaccionesLocalesFacturas();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransaccionesLocalesFacturas();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTransaccionesLocalesFacturas("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTransaccionesLocalesFacturas();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransaccionesLocalesFacturas"));
		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonModificarTransaccionesLocalesFacturas.addActionListener(new ButtonActionListener(this,"ModificarTransaccionesLocalesFacturas"));

		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonModificarToolBarTransaccionesLocalesFacturas.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransaccionesLocalesFacturas"));
					
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jMenuItemModificarTransaccionesLocalesFacturas.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransaccionesLocalesFacturas"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonActualizarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"ActualizarTransaccionesLocalesFacturas"));
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonActualizarToolBarTransaccionesLocalesFacturas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransaccionesLocalesFacturas"));
						
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jMenuItemActualizarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransaccionesLocalesFacturas"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonEliminarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"EliminarTransaccionesLocalesFacturas"));
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonEliminarToolBarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransaccionesLocalesFacturas"));
								
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jMenuItemEliminarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransaccionesLocalesFacturas"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonCancelarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"CancelarTransaccionesLocalesFacturas"));
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonCancelarToolBarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransaccionesLocalesFacturas"));
					
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jMenuItemCancelarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransaccionesLocalesFacturas"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jMenuItemDetalleCerrarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransaccionesLocalesFacturas"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonGuardarCambiosToolBarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransaccionesLocalesFacturas"));
		
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonGuardarCambiosToolBarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransaccionesLocalesFacturas"));
		
		
		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransaccionesLocalesFacturas"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonidTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"idTransaccionesLocalesFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonid_empresaTransaccionesLocalesFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionesLocalesFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonid_empresaTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionesLocalesFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonid_ejercicioTransaccionesLocalesFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioTransaccionesLocalesFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonid_ejercicioTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonfecha_desdeTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonfecha_hastaTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonnombre_completo_clienteTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtontotal_ivaTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtontotal_sin_ivaTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtontotal_descuentoTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"total_descuentoTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtontotalTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"totalTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonivaTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"ivaTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonruc_clienteTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"ruc_clienteTransaccionesLocalesFacturasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTabbedPaneRelacionesTransaccionesLocalesFacturas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransaccionesLocalesFacturas"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTransaccionesLocalesFacturas"));
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransaccionesLocalesFacturas"));
		}
		
		this.jTableDatosTransaccionesLocalesFacturas.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTransaccionesLocalesFacturas"));
		
		this.jTableDatosTransaccionesLocalesFacturas.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTransaccionesLocalesFacturas"));
		
		this.jButtonNuevoTransaccionesLocalesFacturas.addActionListener(new ButtonActionListener(this,"NuevoTransaccionesLocalesFacturas"));
		
		this.jButtonDuplicarTransaccionesLocalesFacturas.addActionListener(new ButtonActionListener(this,"DuplicarTransaccionesLocalesFacturas"));
		
		this.jButtonCopiarTransaccionesLocalesFacturas.addActionListener(new ButtonActionListener(this,"CopiarTransaccionesLocalesFacturas"));
		
		this.jButtonVerFormTransaccionesLocalesFacturas.addActionListener(new ButtonActionListener(this,"VerFormTransaccionesLocalesFacturas"));
		
		
		this.jButtonNuevoToolBarTransaccionesLocalesFacturas.addActionListener(new ButtonActionListener(this,"NuevoToolBarTransaccionesLocalesFacturas"));
			
		this.jButtonDuplicarToolBarTransaccionesLocalesFacturas.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTransaccionesLocalesFacturas"));
			
		this.jMenuItemNuevoTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTransaccionesLocalesFacturas"));
			
		this.jMenuItemDuplicarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTransaccionesLocalesFacturas"));		
		
		
		this.jButtonNuevoRelacionesTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTransaccionesLocalesFacturas"));
		
		
		this.jButtonNuevoRelacionesToolBarTransaccionesLocalesFacturas.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTransaccionesLocalesFacturas"));
			
		this.jMenuItemNuevoRelacionesTransaccionesLocalesFacturas.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTransaccionesLocalesFacturas"));		
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonModificarTransaccionesLocalesFacturas.addActionListener(new ButtonActionListener(this,"ModificarTransaccionesLocalesFacturas"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonModificarToolBarTransaccionesLocalesFacturas.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransaccionesLocalesFacturas"));
			
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jMenuItemModificarTransaccionesLocalesFacturas.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransaccionesLocalesFacturas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonActualizarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"ActualizarTransaccionesLocalesFacturas"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonActualizarToolBarTransaccionesLocalesFacturas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransaccionesLocalesFacturas"));
				
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jMenuItemActualizarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransaccionesLocalesFacturas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonEliminarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"EliminarTransaccionesLocalesFacturas"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonEliminarToolBarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransaccionesLocalesFacturas"));
						
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jMenuItemEliminarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransaccionesLocalesFacturas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonCancelarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"CancelarTransaccionesLocalesFacturas"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonCancelarToolBarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransaccionesLocalesFacturas"));
			
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jMenuItemCancelarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransaccionesLocalesFacturas"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTransaccionesLocalesFacturas"));		
		
		
		this.jButtonCerrarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"CerrarTransaccionesLocalesFacturas"));
		
		
		this.jButtonCerrarToolBarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"CerrarToolBarTransaccionesLocalesFacturas"));
			
		this.jMenuItemCerrarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTransaccionesLocalesFacturas"));
			
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jMenuItemDetalleCerrarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransaccionesLocalesFacturas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonGuardarCambiosTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTransaccionesLocalesFacturas"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonGuardarCambiosToolBarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransaccionesLocalesFacturas"));
		}
		
		this.jButtonCopiarToolBarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"CopiarToolBarTransaccionesLocalesFacturas"));
			
		this.jButtonVerFormToolBarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"VerFormToolBarTransaccionesLocalesFacturas"));
		
		this.jMenuItemGuardarCambiosTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTransaccionesLocalesFacturas"));
			
		this.jMenuItemCopiarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTransaccionesLocalesFacturas"));		
		
		this.jMenuItemVerFormTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTransaccionesLocalesFacturas"));		
		
		
		this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransaccionesLocalesFacturas"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTransaccionesLocalesFacturas"));
			
		this.jMenuItemGuardarCambiosTablaTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransaccionesLocalesFacturas"));		
		
		
		
		this.jButtonRecargarInformacionTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"RecargarInformacionTransaccionesLocalesFacturas"));
					
		this.jButtonRecargarInformacionToolBarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTransaccionesLocalesFacturas"));
		
		this.jMenuItemRecargarInformacionTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTransaccionesLocalesFacturas"));		
		
		
		
		this.jButtonAnterioresTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"AnterioresTransaccionesLocalesFacturas"));
		
		
		this.jButtonAnterioresToolBarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTransaccionesLocalesFacturas"));
		
		this.jMenuItemAnterioresTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTransaccionesLocalesFacturas"));		
		
		
		this.jButtonSiguientesTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"SiguientesTransaccionesLocalesFacturas"));
		
		
		this.jButtonSiguientesToolBarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTransaccionesLocalesFacturas"));
			
		this.jMenuItemSiguientesTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTransaccionesLocalesFacturas"));
			
		this.jMenuItemAbrirOrderByTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTransaccionesLocalesFacturas"));
			
		this.jMenuItemMostrarOcultarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTransaccionesLocalesFacturas"));
			
		this.jMenuItemDetalleAbrirOrderByTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTransaccionesLocalesFacturas"));
			
		this.jMenuItemDetalleMostarOcultarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTransaccionesLocalesFacturas"));		
		
		
		this.jButtonNuevoGuardarCambiosTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTransaccionesLocalesFacturas"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTransaccionesLocalesFacturas"));
			
		this.jMenuItemNuevoGuardarCambiosTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTransaccionesLocalesFacturas"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTransaccionesLocalesFacturas"));

		this.jCheckBoxSeleccionadosTransaccionesLocalesFacturas.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTransaccionesLocalesFacturas"));
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransaccionesLocalesFacturas"));
		}
		
		
		this.jComboBoxTiposRelacionesTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"TiposRelacionesTransaccionesLocalesFacturas"));
			
		this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"TiposAccionesTransaccionesLocalesFacturas"));
					
		this.jComboBoxTiposSeleccionarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTransaccionesLocalesFacturas"));
			
		this.jTextFieldValorCampoGeneralTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTransaccionesLocalesFacturas"));		
		
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonidTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"idTransaccionesLocalesFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonid_empresaTransaccionesLocalesFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionesLocalesFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonid_empresaTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionesLocalesFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonid_ejercicioTransaccionesLocalesFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioTransaccionesLocalesFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonid_ejercicioTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonfecha_desdeTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonfecha_hastaTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonnombre_completo_clienteTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtontotal_ivaTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtontotal_sin_ivaTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtontotal_descuentoTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"total_descuentoTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtontotalTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"totalTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonivaTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"ivaTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonruc_clienteTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"ruc_clienteTransaccionesLocalesFacturasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.addActionListener(new ButtonActionListener(this,"BusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas!=null) {
				this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransaccionesLocalesFacturas"));
				this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransaccionesLocalesFacturas"));
				this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransaccionesLocalesFacturas"));
			}
			
			//this.jButtonCerrarReporteDinamicoTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransaccionesLocalesFacturas"));				
			//this.jButtonGenerarReporteDinamicoTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransaccionesLocalesFacturas"));
			//this.jButtonGenerarExcelReporteDinamicoTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransaccionesLocalesFacturas"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTransaccionesLocalesFacturas!=null) {
				this.jInternalFrameImportacionTransaccionesLocalesFacturas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransaccionesLocalesFacturas"));
				this.jInternalFrameImportacionTransaccionesLocalesFacturas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransaccionesLocalesFacturas"));
				this.jInternalFrameImportacionTransaccionesLocalesFacturas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransaccionesLocalesFacturas"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"AbrirOrderByTransaccionesLocalesFacturas"));
			
			this.jButtonAbrirOrderByToolBarTransaccionesLocalesFacturas.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTransaccionesLocalesFacturas"));			
			
			if(this.jInternalFrameOrderByTransaccionesLocalesFacturas!=null) {
				this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransaccionesLocalesFacturas"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTabbedPaneRelacionesTransaccionesLocalesFacturas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransaccionesLocalesFacturas"));
		
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
            		closingInternalFrameTransaccionesLocalesFacturas();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTransaccionesLocalesFacturas = (JInternalFrameBase)event.getSource();
	            	
	            TransaccionesLocalesFacturasBeanSwingJInternalFrame jInternalFrameParent=(TransaccionesLocalesFacturasBeanSwingJInternalFrame)jInternalFrameDetalleFormTransaccionesLocalesFacturas.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTransaccionesLocalesFacturasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTransaccionesLocalesFacturas.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTransaccionesLocalesFacturasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTransaccionesLocalesFacturas.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTransaccionesLocalesFacturas.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionesLocalesFacturasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionesLocalesFacturasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionesLocalesFacturasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTransaccionesLocalesFacturas";
		inputMap = this.jButtonNuevoTransaccionesLocalesFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTransaccionesLocalesFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransaccionesLocalesFacturasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionesLocalesFacturasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionesLocalesFacturasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionesLocalesFacturasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTransaccionesLocalesFacturas";
		inputMap = this.jButtonNuevoRelacionesTransaccionesLocalesFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTransaccionesLocalesFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransaccionesLocalesFacturasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTransaccionesLocalesFacturas";
		inputMap = this.jButtonModificarTransaccionesLocalesFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTransaccionesLocalesFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTransaccionesLocalesFacturasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTransaccionesLocalesFacturas";
		inputMap = this.jButtonActualizarTransaccionesLocalesFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTransaccionesLocalesFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTransaccionesLocalesFacturasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTransaccionesLocalesFacturas";
		inputMap = this.jButtonEliminarTransaccionesLocalesFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTransaccionesLocalesFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTransaccionesLocalesFacturasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTransaccionesLocalesFacturas";
		inputMap = this.jButtonCancelarTransaccionesLocalesFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTransaccionesLocalesFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTransaccionesLocalesFacturasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTransaccionesLocalesFacturas";
		inputMap = this.jButtonCerrarTransaccionesLocalesFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTransaccionesLocalesFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTransaccionesLocalesFacturasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonGuardarCambiosTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTransaccionesLocalesFacturas";
		inputMap = this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonGuardarCambiosTransaccionesLocalesFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonGuardarCambiosTransaccionesLocalesFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTransaccionesLocalesFacturasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTransaccionesLocalesFacturasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTransaccionesLocalesFacturas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTransaccionesLocalesFacturasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTransaccionesLocalesFacturas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTransaccionesLocalesFacturasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonidTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"idTransaccionesLocalesFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonid_empresaTransaccionesLocalesFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionesLocalesFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonid_empresaTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionesLocalesFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonid_ejercicioTransaccionesLocalesFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioTransaccionesLocalesFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonid_ejercicioTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonfecha_desdeTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonfecha_hastaTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonnombre_completo_clienteTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtontotal_ivaTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtontotal_sin_ivaTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtontotal_descuentoTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"total_descuentoTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtontotalTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"totalTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonivaTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"ivaTransaccionesLocalesFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jButtonruc_clienteTransaccionesLocalesFacturasBusqueda.addActionListener(new ButtonActionListener(this,"ruc_clienteTransaccionesLocalesFacturasBusqueda"));
		
		
		this.jButtonBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.addActionListener(new ButtonActionListener(this,"BusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTransaccionesLocalesFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTransaccionesLocalesFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTransaccionesLocalesFacturasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTransaccionesLocalesFacturas.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTransaccionesLocalesFacturas(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass()) {
					transaccioneslocalesfacturasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:transaccioneslocalesfacturass) {
					transaccioneslocalesfacturasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTransaccionesLocalesFacturasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass()) {
						transaccioneslocalesfacturasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:transaccioneslocalesfacturass) {
						transaccioneslocalesfacturasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:transaccioneslocalesfacturass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTransaccionesLocalesFacturas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransaccionesLocalesFacturas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransaccionesLocalesFacturas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesFacturas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTransaccionesLocalesFacturasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTransaccionesLocalesFacturas.getSelectedRows();
			
			TransaccionesLocalesFacturas transaccioneslocalesfacturasLocal=new TransaccionesLocalesFacturas();
			
			//this.seleccionarTodosTransaccionesLocalesFacturas(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccioneslocalesfacturasLocal =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					transaccioneslocalesfacturasLocal =(TransaccionesLocalesFacturas) this.transaccioneslocalesfacturass.toArray()[this.jTableDatosTransaccionesLocalesFacturas.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				transaccioneslocalesfacturasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass()) {
						transaccioneslocalesfacturasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:transaccioneslocalesfacturass) {
						transaccioneslocalesfacturasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTransaccionesLocalesFacturas(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransaccionesLocalesFacturas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransaccionesLocalesFacturas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransaccionesLocalesFacturas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTransaccionesLocalesFacturasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTransaccionesLocalesFacturasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTransaccionesLocalesFacturasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTransaccionesLocalesFacturas.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass()) {
				
						if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							transaccioneslocalesfacturasAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							transaccioneslocalesfacturasAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							transaccioneslocalesfacturasAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALIVA)) {
							existe=true;
							transaccioneslocalesfacturasAux.settotal_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALSINIVA)) {
							existe=true;
							transaccioneslocalesfacturasAux.settotal_sin_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALDESCUENTO)) {
							existe=true;
							transaccioneslocalesfacturasAux.settotal_descuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							transaccioneslocalesfacturasAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IVA)) {
							existe=true;
							transaccioneslocalesfacturasAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_RUCCLIENTE)) {
							existe=true;
							transaccioneslocalesfacturasAux.setruc_cliente(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:transaccioneslocalesfacturass) {
					
						if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							transaccioneslocalesfacturasAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							transaccioneslocalesfacturasAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							transaccioneslocalesfacturasAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALIVA)) {
							existe=true;
							transaccioneslocalesfacturasAux.settotal_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALSINIVA)) {
							existe=true;
							transaccioneslocalesfacturasAux.settotal_sin_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALDESCUENTO)) {
							existe=true;
							transaccioneslocalesfacturasAux.settotal_descuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							transaccioneslocalesfacturasAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IVA)) {
							existe=true;
							transaccioneslocalesfacturasAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_RUCCLIENTE)) {
							existe=true;
							transaccioneslocalesfacturasAux.setruc_cliente(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTransaccionesLocalesFacturas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTransaccionesLocalesFacturasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTransaccionesLocalesFacturas=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTransaccionesLocalesFacturas) {				
					conSplash=true;//false;										
					
					//this.startProcessTransaccionesLocalesFacturas(conSplash);
				
					this.generarReporteTransaccionesLocalesFacturassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTransaccionesLocalesFacturassSeleccionados();
				//this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransaccionesLocalesFacturassSeleccionados(false);
				//this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransaccionesLocalesFacturassSeleccionados(true);
				//this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransaccionesLocalesFacturas();
				
				this.exportarTransaccionesLocalesFacturassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTransaccionesLocalesFacturass();
				//this.importarTransaccionesLocalesFacturass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransaccionesLocalesFacturas();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTransaccionesLocalesFacturassSeleccionados();
				//this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Transacciones Locales Facturas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTransaccionesLocalesFacturas();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTransaccionesLocalesFacturas)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTransaccionesLocalesFacturas(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Transacciones Locales Facturas",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.setSelectedIndex(0);					
				}	
			} 			
			else if(TransaccionesLocalesFacturasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTransaccionesLocalesFacturas) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTransaccionesLocalesFacturas(conSplash);
					
						//this.actualizarParametrosGeneralTransaccionesLocalesFacturas();
						
						this.generarReporteProcesoAccionTransaccionesLocalesFacturassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Transacciones Locales FacturasES SELECCIONADOS?", "MANTENIMIENTO DE Transacciones Locales Facturas", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTransaccionesLocalesFacturas();
				
						this.actualizarParametrosGeneralTransaccionesLocalesFacturas();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.transaccioneslocalesfacturasReturnGeneral=transaccioneslocalesfacturasLogic.procesarAccionTransaccionesLocalesFacturassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass(),this.transaccioneslocalesfacturasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTransaccionesLocalesFacturasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTransaccionesLocalesFacturas();
					
					TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTransaccionesLocalesFacturasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTransaccionesLocalesFacturas(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTransaccionesLocalesFacturasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTransaccionesLocalesFacturas();
			
			if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TransaccionesLocalesFacturas> transaccioneslocalesfacturassSeleccionados=new ArrayList<TransaccionesLocalesFacturas>();		
			TransaccionesLocalesFacturas transaccioneslocalesfacturas=new TransaccionesLocalesFacturas();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTransaccionesLocalesFacturas.getSelectedItem();
			
			
			
			
			transaccioneslocalesfacturassSeleccionados=this.getTransaccionesLocalesFacturassSeleccionados(true);
			//this.sTipoAccion;
			
			if(transaccioneslocalesfacturassSeleccionados.size()==1) {
				for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:transaccioneslocalesfacturassSeleccionados) {
					transaccioneslocalesfacturas=transaccioneslocalesfacturasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTransaccionesLocalesFacturas();
			
      		//this.finishProcessTransaccionesLocalesFacturas(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTransaccionesLocalesFacturasReturnGeneral() throws Exception {
		if(this.transaccioneslocalesfacturasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.transaccioneslocalesfacturasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.transaccioneslocalesfacturasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.transaccioneslocalesfacturasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.transaccioneslocalesfacturasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.transaccioneslocalesfacturasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
		}
		
		if(this.transaccioneslocalesfacturasReturnGeneral.getConRetornoLista() || this.transaccioneslocalesfacturasReturnGeneral.getConRetornoObjeto()) {
			if(this.transaccioneslocalesfacturasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.transaccioneslocalesfacturasLogic.setTransaccionesLocalesFacturass(this.transaccioneslocalesfacturasReturnGeneral.getTransaccionesLocalesFacturass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingTransaccionesLocalesFacturas(false);
		}
	}
	
	public void actualizarParametrosGeneralTransaccionesLocalesFacturas() throws Exception {
		
		
	}
	
	public ArrayList<TransaccionesLocalesFacturas> getTransaccionesLocalesFacturassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TransaccionesLocalesFacturas> transaccioneslocalesfacturassSeleccionados=new ArrayList<TransaccionesLocalesFacturas>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTransaccionesLocalesFacturas) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass()) {
					if(transaccioneslocalesfacturasAux.getIsSelected()) {
						transaccioneslocalesfacturassSeleccionados.add(transaccioneslocalesfacturasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:this.transaccioneslocalesfacturass) {
					if(transaccioneslocalesfacturasAux.getIsSelected()) {
						transaccioneslocalesfacturassSeleccionados.add(transaccioneslocalesfacturasAux);				
					}
				}
			}
			
			if(transaccioneslocalesfacturassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						transaccioneslocalesfacturassSeleccionados.addAll(this.transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						transaccioneslocalesfacturassSeleccionados.addAll(this.transaccioneslocalesfacturass);				
					}
				}
			}
		} else {
			transaccioneslocalesfacturassSeleccionados.add(this.transaccioneslocalesfacturas);
		}
		
		return transaccioneslocalesfacturassSeleccionados;
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
	
	public void generarReporteTransaccionesLocalesFacturassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTransaccionesLocalesFacturassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTransaccionesLocalesFacturassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransaccionesLocalesFacturassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransaccionesLocalesFacturassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Transacciones Locales Facturas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTransaccionesLocalesFacturassSeleccionados() throws Exception {
		ArrayList<TransaccionesLocalesFacturas> transaccioneslocalesfacturassSeleccionados=new ArrayList<TransaccionesLocalesFacturas>();		
		
		transaccioneslocalesfacturassSeleccionados=this.getTransaccionesLocalesFacturassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTransaccionesLocalesFacturass("Todos",transaccioneslocalesfacturassSeleccionados);
		
	}	
	
	public void generarReporteNormalTransaccionesLocalesFacturassSeleccionados() throws Exception {
		ArrayList<TransaccionesLocalesFacturas> transaccioneslocalesfacturassSeleccionados=new ArrayList<TransaccionesLocalesFacturas>();		
		
		transaccioneslocalesfacturassSeleccionados=this.getTransaccionesLocalesFacturassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTransaccionesLocalesFacturass("Todos",transaccioneslocalesfacturassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTransaccionesLocalesFacturassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TransaccionesLocalesFacturas> transaccioneslocalesfacturassSeleccionados=new ArrayList<TransaccionesLocalesFacturas>();
		
		transaccioneslocalesfacturassSeleccionados=this.getTransaccionesLocalesFacturassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTransaccionesLocalesFacturass("Todos",transaccioneslocalesfacturassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTransaccionesLocalesFacturassSeleccionados() throws Exception {
		ArrayList<TransaccionesLocalesFacturas> transaccioneslocalesfacturassSeleccionados=new ArrayList<TransaccionesLocalesFacturas>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTransaccionesLocalesFacturas();
		
		
		transaccioneslocalesfacturassSeleccionados=this.getTransaccionesLocalesFacturassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTransaccionesLocalesFacturas();
		
		
		//this.generarReporteTransaccionesLocalesFacturass("Todos",transaccioneslocalesfacturassSeleccionados ,transaccioneslocalesfacturasImplementable,transaccioneslocalesfacturasImplementableHome);
	}
	
	public void mostrarImportacionTransaccionesLocalesFacturass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTransaccionesLocalesFacturas();
		
		this.abrirFrameImportacionTransaccionesLocalesFacturas();		
		
			
		//this.generarReporteTransaccionesLocalesFacturass("Todos",transaccioneslocalesfacturassSeleccionados ,transaccioneslocalesfacturasImplementable,transaccioneslocalesfacturasImplementableHome);
	}
	
	public void importarTransaccionesLocalesFacturass() throws Exception {		
	
	}
	
	public void exportarTransaccionesLocalesFacturassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTransaccionesLocalesFacturassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTransaccionesLocalesFacturassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTransaccionesLocalesFacturassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Transacciones Locales Facturas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTransaccionesLocalesFacturassSeleccionados() throws Exception {
		ArrayList<TransaccionesLocalesFacturas> transaccioneslocalesfacturassSeleccionados=new ArrayList<TransaccionesLocalesFacturas>();		
		
		transaccioneslocalesfacturassSeleccionados=this.getTransaccionesLocalesFacturassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioneslocalesfacturas."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTransaccionesLocalesFacturas(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:transaccioneslocalesfacturassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTransaccionesLocalesFacturas(transaccioneslocalesfacturasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//transaccioneslocalesfacturasAux.setsDetalleGeneralEntityReporte(transaccioneslocalesfacturasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transacciones Locales Facturas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTransaccionesLocalesFacturas(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TransaccionesLocalesFacturasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesFacturasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesFacturasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesFacturasConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALSINIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALDESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesFacturasConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionesLocalesFacturasConstantesFunciones.LABEL_RUCCLIENTE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturas,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=transaccioneslocalesfacturas.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesfacturas.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesfacturas.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesfacturas.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesfacturas.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesfacturas.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesfacturas.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesfacturas.gettotal_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesfacturas.gettotal_sin_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesfacturas.gettotal_descuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesfacturas.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesfacturas.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioneslocalesfacturas.getruc_cliente();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTransaccionesLocalesFacturassSeleccionados() throws Exception {
		ArrayList<TransaccionesLocalesFacturas> transaccioneslocalesfacturassSeleccionados=new ArrayList<TransaccionesLocalesFacturas>();		
		
		transaccioneslocalesfacturassSeleccionados=this.getTransaccionesLocalesFacturassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioneslocalesfacturas.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TransaccionesLocalesFacturass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTransaccionesLocalesFacturas(row);				
				iRow++;
			}				
			
			for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:transaccioneslocalesfacturassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTransaccionesLocalesFacturas(transaccioneslocalesfacturasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transacciones Locales Facturas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTransaccionesLocalesFacturassSeleccionados() throws Exception {
		ArrayList<TransaccionesLocalesFacturas> transaccioneslocalesfacturassSeleccionados=new ArrayList<TransaccionesLocalesFacturas>();		
		
		transaccioneslocalesfacturassSeleccionados=this.getTransaccionesLocalesFacturassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioneslocalesfacturas.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("transaccioneslocalesfacturass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("transaccioneslocalesfacturas");
			//elementRoot.appendChild(element);
		
			for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:transaccioneslocalesfacturassSeleccionados) {
				element = document.createElement("transaccioneslocalesfacturas");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTransaccionesLocalesFacturas(transaccioneslocalesfacturasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transacciones Locales Facturas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTransaccionesLocalesFacturas(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALSINIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALDESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionesLocalesFacturasConstantesFunciones.LABEL_RUCCLIENTE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturas,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesfacturas.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesfacturas.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesfacturas.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesfacturas.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesfacturas.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesfacturas.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesfacturas.gettotal_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesfacturas.gettotal_sin_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesfacturas.gettotal_descuento());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesfacturas.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesfacturas.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioneslocalesfacturas.getruc_cliente());				
	}
	
	public void setFilaDatosExportarXmlTransaccionesLocalesFacturas(TransaccionesLocalesFacturas transaccioneslocalesfacturas,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TransaccionesLocalesFacturasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(transaccioneslocalesfacturas.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TransaccionesLocalesFacturasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(transaccioneslocalesfacturas.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TransaccionesLocalesFacturasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(transaccioneslocalesfacturas.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementejercicio_descripcion = document.createElement(TransaccionesLocalesFacturasConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(transaccioneslocalesfacturas.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementfecha_desde = document.createElement(TransaccionesLocalesFacturasConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(transaccioneslocalesfacturas.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(TransaccionesLocalesFacturasConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(transaccioneslocalesfacturas.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementnombre_completo_cliente = document.createElement(TransaccionesLocalesFacturasConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(transaccioneslocalesfacturas.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementtotal_iva = document.createElement(TransaccionesLocalesFacturasConstantesFunciones.TOTALIVA);
		elementtotal_iva.appendChild(document.createTextNode(transaccioneslocalesfacturas.gettotal_iva().toString().trim()));
		element.appendChild(elementtotal_iva);

		Element elementtotal_sin_iva = document.createElement(TransaccionesLocalesFacturasConstantesFunciones.TOTALSINIVA);
		elementtotal_sin_iva.appendChild(document.createTextNode(transaccioneslocalesfacturas.gettotal_sin_iva().toString().trim()));
		element.appendChild(elementtotal_sin_iva);

		Element elementtotal_descuento = document.createElement(TransaccionesLocalesFacturasConstantesFunciones.TOTALDESCUENTO);
		elementtotal_descuento.appendChild(document.createTextNode(transaccioneslocalesfacturas.gettotal_descuento().toString().trim()));
		element.appendChild(elementtotal_descuento);

		Element elementtotal = document.createElement(TransaccionesLocalesFacturasConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(transaccioneslocalesfacturas.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementiva = document.createElement(TransaccionesLocalesFacturasConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(transaccioneslocalesfacturas.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementruc_cliente = document.createElement(TransaccionesLocalesFacturasConstantesFunciones.RUCCLIENTE);
		elementruc_cliente.appendChild(document.createTextNode(transaccioneslocalesfacturas.getruc_cliente().trim()));
		element.appendChild(elementruc_cliente);
	}
	
	public void generarReporteGroupGenericoTransaccionesLocalesFacturassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TransaccionesLocalesFacturas> transaccioneslocalesfacturassSeleccionados=new ArrayList<TransaccionesLocalesFacturas>();
		
		transaccioneslocalesfacturassSeleccionados=this.getTransaccionesLocalesFacturassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTransaccionesLocalesFacturas(transaccioneslocalesfacturassSeleccionados);
		
		this.generarReporteTransaccionesLocalesFacturass("Todos",transaccioneslocalesfacturassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTransaccionesLocalesFacturas(ArrayList<TransaccionesLocalesFacturas> transaccioneslocalesfacturassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TransaccionesLocalesFacturas transaccioneslocalesfacturasAux:transaccioneslocalesfacturassSeleccionados) {
				transaccioneslocalesfacturasAux.setsDetalleGeneralEntityReporte(transaccioneslocalesfacturasAux.toString());
			
				if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					transaccioneslocalesfacturasAux.setsDescripcionGeneralEntityReporte1(transaccioneslocalesfacturasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					transaccioneslocalesfacturasAux.setsDescripcionGeneralEntityReporte1(transaccioneslocalesfacturasAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					transaccioneslocalesfacturasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(transaccioneslocalesfacturasAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					transaccioneslocalesfacturasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(transaccioneslocalesfacturasAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					transaccioneslocalesfacturasAux.setsDescripcionGeneralEntityReporte1(transaccioneslocalesfacturasAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(TransaccionesLocalesFacturasConstantesFunciones.LABEL_RUCCLIENTE)) {
					existe=true;
					transaccioneslocalesfacturasAux.setsDescripcionGeneralEntityReporte1(transaccioneslocalesfacturasAux.getruc_cliente());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTransaccionesLocalesFacturas(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas=true;
				this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas=true;
				this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas=true;
			}
			
			this.isVisibilidadCeldaModificarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaActualizarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaEliminarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaCancelarTransaccionesLocalesFacturas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaModificarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaActualizarTransaccionesLocalesFacturas=true;
			this.isVisibilidadCeldaEliminarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaCancelarTransaccionesLocalesFacturas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaModificarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaActualizarTransaccionesLocalesFacturas=true;
			this.isVisibilidadCeldaEliminarTransaccionesLocalesFacturas=true;
			this.isVisibilidadCeldaCancelarTransaccionesLocalesFacturas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaModificarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaActualizarTransaccionesLocalesFacturas=true;
			this.isVisibilidadCeldaEliminarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaCancelarTransaccionesLocalesFacturas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=false;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas=true;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas=true;
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas=true;
			this.isVisibilidadCeldaModificarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaActualizarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaEliminarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaCancelarTransaccionesLocalesFacturas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaActualizarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaEliminarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaCancelarTransaccionesLocalesFacturas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=false;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaModificarTransaccionesLocalesFacturas=true;
			this.isVisibilidadCeldaActualizarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaEliminarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaCancelarTransaccionesLocalesFacturas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=false;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TransaccionesLocalesFacturasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas=true;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas=true;
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas=true;
		} else {
			this.actualizarEstadoPanelsTransaccionesLocalesFacturas(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTransaccionesLocalesFacturas=false;
			//this.isVisibilidadCeldaVerFormTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaDuplicarTransaccionesLocalesFacturas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas=false;
		} else {
			this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
			if(!transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas=false;												
			}
			
			this.jButtonCerrarTransaccionesLocalesFacturas.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas=false;
		}
		
		if(!this.permiteMantenimiento(this.transaccioneslocalesfacturas)) {
			this.isVisibilidadCeldaActualizarTransaccionesLocalesFacturas=false;
			this.isVisibilidadCeldaEliminarTransaccionesLocalesFacturas=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoTransaccionesLocalesFacturas=false;
		this.isVisibilidadCeldaNuevoRelacionesTransaccionesLocalesFacturas=false;
		this.isVisibilidadCeldaGuardarCambiosTransaccionesLocalesFacturas=false;
		//this.isVisibilidadCeldaModificarTransaccionesLocalesFacturas=true;
		this.isVisibilidadCeldaActualizarTransaccionesLocalesFacturas=false;
		this.isVisibilidadCeldaEliminarTransaccionesLocalesFacturas=false;
		//this.isVisibilidadCeldaCancelarTransaccionesLocalesFacturas=true;			
		this.isVisibilidadCeldaGuardarTransaccionesLocalesFacturas=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTransaccionesLocalesFacturas() {
	}
	
	public void actualizarEstadoPanelsTransaccionesLocalesFacturas(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas!=null) {
				this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionesLocalesFacturas!=null) {
				this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionesLocalesFacturas!=null) {
				this.jScrollPanelDatosTransaccionesLocalesFacturas.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionesLocalesFacturas!=null) {
				this.jPanelPaginacionTransaccionesLocalesFacturas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionesLocalesFacturas!=null) {
				this.jPanelParametrosReportesTransaccionesLocalesFacturas.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas!=null) {
				this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionesLocalesFacturas!=null) {
				this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTransaccionesLocalesFacturas!=null) {
				this.jScrollPanelDatosTransaccionesLocalesFacturas.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransaccionesLocalesFacturas!=null) {
				this.jPanelPaginacionTransaccionesLocalesFacturas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransaccionesLocalesFacturas!=null) {
				this.jPanelParametrosReportesTransaccionesLocalesFacturas.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas!=null) {
				this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionesLocalesFacturas!=null) {
				this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionesLocalesFacturas!=null) {
				this.jScrollPanelDatosTransaccionesLocalesFacturas.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransaccionesLocalesFacturas!=null) {
				this.jPanelPaginacionTransaccionesLocalesFacturas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransaccionesLocalesFacturas!=null) {
				this.jPanelParametrosReportesTransaccionesLocalesFacturas.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas!=null) {
				this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionesLocalesFacturas!=null) {
				this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionesLocalesFacturas!=null) {
				this.jScrollPanelDatosTransaccionesLocalesFacturas.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransaccionesLocalesFacturas!=null) {
				this.jPanelPaginacionTransaccionesLocalesFacturas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransaccionesLocalesFacturas!=null) {
				this.jPanelParametrosReportesTransaccionesLocalesFacturas.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas!=null) {
				this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionesLocalesFacturas!=null) {
				this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionesLocalesFacturas!=null) {
				this.jScrollPanelDatosTransaccionesLocalesFacturas.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionesLocalesFacturas!=null) {
				this.jPanelPaginacionTransaccionesLocalesFacturas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionesLocalesFacturas!=null) {
				this.jPanelParametrosReportesTransaccionesLocalesFacturas.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas!=null) {
				this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionesLocalesFacturas!=null) {
				this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionesLocalesFacturas!=null) {
				this.jScrollPanelDatosTransaccionesLocalesFacturas.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionesLocalesFacturas!=null) {
				this.jPanelPaginacionTransaccionesLocalesFacturas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionesLocalesFacturas!=null) {
				this.jPanelParametrosReportesTransaccionesLocalesFacturas.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas!=null) {
				this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionesLocalesFacturas!=null) {
				this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionesLocalesFacturas!=null) {
				this.jScrollPanelDatosTransaccionesLocalesFacturas.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionesLocalesFacturas!=null) {
				this.jPanelPaginacionTransaccionesLocalesFacturas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionesLocalesFacturas!=null) {
				this.jPanelParametrosReportesTransaccionesLocalesFacturas.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTransaccionesLocalesFacturas!=null) {
					this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTransaccionesLocalesFacturas!=null) {
				this.jPanelParametrosReportesTransaccionesLocalesFacturas.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionesLocalesFacturas!=null) {
				this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTransaccionesLocalesFacturas!=null) {
				this.jPanelParametrosReportesTransaccionesLocalesFacturas.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaTransaccionesLocalesFacturas=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaTransaccionesLocalesFacturas) {this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.remove(jPanelBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaTransaccionesLocalesFacturas=isParaEjercicio;
			if(!this.isVisibilidadBusquedaTransaccionesLocalesFacturas) {this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.remove(jPanelBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTransaccionesLocalesFacturas(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTransaccionesLocalesFacturas() {
		this.updateBorderResaltarBusquedasFormularioTransaccionesLocalesFacturas();
		this.updateVisibilidadBusquedasFormularioTransaccionesLocalesFacturas();
		this.updateHabilitarBusquedasFormularioTransaccionesLocalesFacturas();
	}
	
	public void updateBorderResaltarBusquedasFormularioTransaccionesLocalesFacturas() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.getComponents().length>0) {
	

		if(this.transaccioneslocalesfacturasConstantesFunciones.resaltarBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas!=null) {
			index= this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.indexOfComponent(this.jPanelBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.getComponent(index);
				jPanel.setBorder(this.transaccioneslocalesfacturasConstantesFunciones.resaltarBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTransaccionesLocalesFacturas() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.indexOfComponent(this.jPanelBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrarBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas);
			if(!this.transaccioneslocalesfacturasConstantesFunciones.mostrarBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas && index>-1) {
				this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTransaccionesLocalesFacturas() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.indexOfComponent(this.jPanelBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transaccioneslocalesfacturasConstantesFunciones.activarBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas);
				this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setEnabledAt(index,this.transaccioneslocalesfacturasConstantesFunciones.activarBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTransaccionesLocalesFacturas(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaTransaccionesLocalesFacturas")) {
			index= this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.indexOfComponent(this.jPanelBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas);

			this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.getComponent(index);

			this.transaccioneslocalesfacturasConstantesFunciones.setResaltarBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas(resaltar);

			jPanel.setBorder(this.transaccioneslocalesfacturasConstantesFunciones.resaltarBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTransaccionesLocalesFacturas.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTransaccionesLocalesFacturas() throws Exception {

		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTransaccionesLocalesFacturas();
		this.updateVisibilidadResaltarControlesFormularioTransaccionesLocalesFacturas();
		this.updateHabilitarResaltarControlesFormularioTransaccionesLocalesFacturas();
		
	}
	
	public void updateBorderResaltarControlesFormularioTransaccionesLocalesFacturas() throws Exception {
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.transaccioneslocalesfacturasConstantesFunciones.resaltaridTransaccionesLocalesFacturas!=null && this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelidTransaccionesLocalesFacturas.setBorder(this.transaccioneslocalesfacturasConstantesFunciones.resaltaridTransaccionesLocalesFacturas);}
		if(this.transaccioneslocalesfacturasConstantesFunciones.resaltarid_empresaTransaccionesLocalesFacturas!=null && this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_empresaTransaccionesLocalesFacturas.setBorder(this.transaccioneslocalesfacturasConstantesFunciones.resaltarid_empresaTransaccionesLocalesFacturas);}
		if(this.transaccioneslocalesfacturasConstantesFunciones.resaltarid_ejercicioTransaccionesLocalesFacturas!=null && this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_ejercicioTransaccionesLocalesFacturas.setBorder(this.transaccioneslocalesfacturasConstantesFunciones.resaltarid_ejercicioTransaccionesLocalesFacturas);}
		if(this.transaccioneslocalesfacturasConstantesFunciones.resaltarfecha_desdeTransaccionesLocalesFacturas!=null && this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jDateChooserfecha_desdeTransaccionesLocalesFacturas.setBorder(this.transaccioneslocalesfacturasConstantesFunciones.resaltarfecha_desdeTransaccionesLocalesFacturas);}
		if(this.transaccioneslocalesfacturasConstantesFunciones.resaltarfecha_hastaTransaccionesLocalesFacturas!=null && this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jDateChooserfecha_hastaTransaccionesLocalesFacturas.setBorder(this.transaccioneslocalesfacturasConstantesFunciones.resaltarfecha_hastaTransaccionesLocalesFacturas);}
		if(this.transaccioneslocalesfacturasConstantesFunciones.resaltarnombre_completo_clienteTransaccionesLocalesFacturas!=null && this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextAreanombre_completo_clienteTransaccionesLocalesFacturas.setBorder(this.transaccioneslocalesfacturasConstantesFunciones.resaltarnombre_completo_clienteTransaccionesLocalesFacturas);}
		if(this.transaccioneslocalesfacturasConstantesFunciones.resaltartotal_ivaTransaccionesLocalesFacturas!=null && this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_ivaTransaccionesLocalesFacturas.setBorder(this.transaccioneslocalesfacturasConstantesFunciones.resaltartotal_ivaTransaccionesLocalesFacturas);}
		if(this.transaccioneslocalesfacturasConstantesFunciones.resaltartotal_sin_ivaTransaccionesLocalesFacturas!=null && this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas.setBorder(this.transaccioneslocalesfacturasConstantesFunciones.resaltartotal_sin_ivaTransaccionesLocalesFacturas);}
		if(this.transaccioneslocalesfacturasConstantesFunciones.resaltartotal_descuentoTransaccionesLocalesFacturas!=null && this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_descuentoTransaccionesLocalesFacturas.setBorder(this.transaccioneslocalesfacturasConstantesFunciones.resaltartotal_descuentoTransaccionesLocalesFacturas);}
		if(this.transaccioneslocalesfacturasConstantesFunciones.resaltartotalTransaccionesLocalesFacturas!=null && this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotalTransaccionesLocalesFacturas.setBorder(this.transaccioneslocalesfacturasConstantesFunciones.resaltartotalTransaccionesLocalesFacturas);}
		if(this.transaccioneslocalesfacturasConstantesFunciones.resaltarivaTransaccionesLocalesFacturas!=null && this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldivaTransaccionesLocalesFacturas.setBorder(this.transaccioneslocalesfacturasConstantesFunciones.resaltarivaTransaccionesLocalesFacturas);}
		if(this.transaccioneslocalesfacturasConstantesFunciones.resaltarruc_clienteTransaccionesLocalesFacturas!=null && this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldruc_clienteTransaccionesLocalesFacturas.setBorder(this.transaccioneslocalesfacturasConstantesFunciones.resaltarruc_clienteTransaccionesLocalesFacturas);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTransaccionesLocalesFacturas() throws Exception {		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
	
		//this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelidTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostraridTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jPanelidTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostraridTransaccionesLocalesFacturas);
		//this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_empresaTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrarid_empresaTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jPanelid_empresaTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrarid_empresaTransaccionesLocalesFacturas);
		//this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_ejercicioTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrarid_ejercicioTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jPanelid_ejercicioTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrarid_ejercicioTransaccionesLocalesFacturas);
		//this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jDateChooserfecha_desdeTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrarfecha_desdeTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jPanelfecha_desdeTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrarfecha_desdeTransaccionesLocalesFacturas);
		//this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jDateChooserfecha_hastaTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrarfecha_hastaTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jPanelfecha_hastaTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrarfecha_hastaTransaccionesLocalesFacturas);
		//this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextAreanombre_completo_clienteTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrarnombre_completo_clienteTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jPanelnombre_completo_clienteTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrarnombre_completo_clienteTransaccionesLocalesFacturas);
		//this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_ivaTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrartotal_ivaTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jPaneltotal_ivaTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrartotal_ivaTransaccionesLocalesFacturas);
		//this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrartotal_sin_ivaTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jPaneltotal_sin_ivaTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrartotal_sin_ivaTransaccionesLocalesFacturas);
		//this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_descuentoTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrartotal_descuentoTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jPaneltotal_descuentoTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrartotal_descuentoTransaccionesLocalesFacturas);
		//this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotalTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrartotalTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jPaneltotalTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrartotalTransaccionesLocalesFacturas);
		//this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldivaTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrarivaTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jPanelivaTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrarivaTransaccionesLocalesFacturas);
		//this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldruc_clienteTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrarruc_clienteTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jPanelruc_clienteTransaccionesLocalesFacturas.setVisible(this.transaccioneslocalesfacturasConstantesFunciones.mostrarruc_clienteTransaccionesLocalesFacturas);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTransaccionesLocalesFacturas() throws Exception {
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransaccionesLocalesFacturas!=null) {
	
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jLabelidTransaccionesLocalesFacturas.setEnabled(this.transaccioneslocalesfacturasConstantesFunciones.activaridTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_empresaTransaccionesLocalesFacturas.setEnabled(this.transaccioneslocalesfacturasConstantesFunciones.activarid_empresaTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jComboBoxid_ejercicioTransaccionesLocalesFacturas.setEnabled(this.transaccioneslocalesfacturasConstantesFunciones.activarid_ejercicioTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jDateChooserfecha_desdeTransaccionesLocalesFacturas.setEnabled(this.transaccioneslocalesfacturasConstantesFunciones.activarfecha_desdeTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jDateChooserfecha_hastaTransaccionesLocalesFacturas.setEnabled(this.transaccioneslocalesfacturasConstantesFunciones.activarfecha_hastaTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextAreanombre_completo_clienteTransaccionesLocalesFacturas.setEnabled(this.transaccioneslocalesfacturasConstantesFunciones.activarnombre_completo_clienteTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_ivaTransaccionesLocalesFacturas.setEnabled(this.transaccioneslocalesfacturasConstantesFunciones.activartotal_ivaTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas.setEnabled(this.transaccioneslocalesfacturasConstantesFunciones.activartotal_sin_ivaTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotal_descuentoTransaccionesLocalesFacturas.setEnabled(this.transaccioneslocalesfacturasConstantesFunciones.activartotal_descuentoTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldtotalTransaccionesLocalesFacturas.setEnabled(this.transaccioneslocalesfacturasConstantesFunciones.activartotalTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldivaTransaccionesLocalesFacturas.setEnabled(this.transaccioneslocalesfacturasConstantesFunciones.activarivaTransaccionesLocalesFacturas);
		this.jInternalFrameDetalleFormTransaccionesLocalesFacturas.jTextFieldruc_clienteTransaccionesLocalesFacturas.setEnabled(this.transaccioneslocalesfacturasConstantesFunciones.activarruc_clienteTransaccionesLocalesFacturas);
		}
	}
	
		
}