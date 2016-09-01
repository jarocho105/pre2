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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;




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

import com.bydan.erp.tesoreria.util.ParametroTesoreriaConstantesFunciones;
import com.bydan.erp.tesoreria.util.ParametroTesoreriaParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.ParametroTesoreriaParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.ParametroTesoreriaBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
public class ParametroTesoreriaBeanSwingJInternalFrame extends ParametroTesoreriaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParametroTesoreriaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ParametroTesoreria> parametrotesoreriaValidator = new ClassValidator<ParametroTesoreria>(ParametroTesoreria.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ParametroTesoreria parametrotesoreria;	
	public ParametroTesoreria parametrotesoreriaAux;
	public ParametroTesoreria parametrotesoreriaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ParametroTesoreria parametrotesoreriaTotales;
	public Long idParametroTesoreriaActual;
	public Long iIdNuevoParametroTesoreria=0L;
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

	public String sFinalQueryComboTransaccionCobrarPago="";

	public List<Transaccion> transaccioncobrarpagosForeignKey;

	public List<Transaccion> gettransaccioncobrarpagosForeignKey() {
		return transaccioncobrarpagosForeignKey;
	}

	public void settransaccioncobrarpagosForeignKey(List<Transaccion> transaccioncobrarpagosForeignKey) {
		this.transaccioncobrarpagosForeignKey = transaccioncobrarpagosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccioncobrarpagoForeignKey;

	public Transaccion gettransaccioncobrarpagoForeignKey() {
		return transaccioncobrarpagoForeignKey;
	}

	public void settransaccioncobrarpagoForeignKey(Transaccion transaccioncobrarpagoForeignKey) {
		this.transaccioncobrarpagoForeignKey = transaccioncobrarpagoForeignKey;
	}

	public String sFinalQueryComboTransaccionCobrarDebito="";

	public List<Transaccion> transaccioncobrardebitosForeignKey;

	public List<Transaccion> gettransaccioncobrardebitosForeignKey() {
		return transaccioncobrardebitosForeignKey;
	}

	public void settransaccioncobrardebitosForeignKey(List<Transaccion> transaccioncobrardebitosForeignKey) {
		this.transaccioncobrardebitosForeignKey = transaccioncobrardebitosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccioncobrardebitoForeignKey;

	public Transaccion gettransaccioncobrardebitoForeignKey() {
		return transaccioncobrardebitoForeignKey;
	}

	public void settransaccioncobrardebitoForeignKey(Transaccion transaccioncobrardebitoForeignKey) {
		this.transaccioncobrardebitoForeignKey = transaccioncobrardebitoForeignKey;
	}

	public String sFinalQueryComboTransaccionCobrarCredito="";

	public List<Transaccion> transaccioncobrarcreditosForeignKey;

	public List<Transaccion> gettransaccioncobrarcreditosForeignKey() {
		return transaccioncobrarcreditosForeignKey;
	}

	public void settransaccioncobrarcreditosForeignKey(List<Transaccion> transaccioncobrarcreditosForeignKey) {
		this.transaccioncobrarcreditosForeignKey = transaccioncobrarcreditosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccioncobrarcreditoForeignKey;

	public Transaccion gettransaccioncobrarcreditoForeignKey() {
		return transaccioncobrarcreditoForeignKey;
	}

	public void settransaccioncobrarcreditoForeignKey(Transaccion transaccioncobrarcreditoForeignKey) {
		this.transaccioncobrarcreditoForeignKey = transaccioncobrarcreditoForeignKey;
	}

	public String sFinalQueryComboTransaccionPagarPago="";

	public List<Transaccion> transaccionpagarpagosForeignKey;

	public List<Transaccion> gettransaccionpagarpagosForeignKey() {
		return transaccionpagarpagosForeignKey;
	}

	public void settransaccionpagarpagosForeignKey(List<Transaccion> transaccionpagarpagosForeignKey) {
		this.transaccionpagarpagosForeignKey = transaccionpagarpagosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccionpagarpagoForeignKey;

	public Transaccion gettransaccionpagarpagoForeignKey() {
		return transaccionpagarpagoForeignKey;
	}

	public void settransaccionpagarpagoForeignKey(Transaccion transaccionpagarpagoForeignKey) {
		this.transaccionpagarpagoForeignKey = transaccionpagarpagoForeignKey;
	}

	public String sFinalQueryComboTransaccionPagarDebito="";

	public List<Transaccion> transaccionpagardebitosForeignKey;

	public List<Transaccion> gettransaccionpagardebitosForeignKey() {
		return transaccionpagardebitosForeignKey;
	}

	public void settransaccionpagardebitosForeignKey(List<Transaccion> transaccionpagardebitosForeignKey) {
		this.transaccionpagardebitosForeignKey = transaccionpagardebitosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccionpagardebitoForeignKey;

	public Transaccion gettransaccionpagardebitoForeignKey() {
		return transaccionpagardebitoForeignKey;
	}

	public void settransaccionpagardebitoForeignKey(Transaccion transaccionpagardebitoForeignKey) {
		this.transaccionpagardebitoForeignKey = transaccionpagardebitoForeignKey;
	}

	public String sFinalQueryComboTransaccionPagarCredito="";

	public List<Transaccion> transaccionpagarcreditosForeignKey;

	public List<Transaccion> gettransaccionpagarcreditosForeignKey() {
		return transaccionpagarcreditosForeignKey;
	}

	public void settransaccionpagarcreditosForeignKey(List<Transaccion> transaccionpagarcreditosForeignKey) {
		this.transaccionpagarcreditosForeignKey = transaccionpagarcreditosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccionpagarcreditoForeignKey;

	public Transaccion gettransaccionpagarcreditoForeignKey() {
		return transaccionpagarcreditoForeignKey;
	}

	public void settransaccionpagarcreditoForeignKey(Transaccion transaccionpagarcreditoForeignKey) {
		this.transaccionpagarcreditoForeignKey = transaccionpagarcreditoForeignKey;
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
	
	public Boolean isPermisoTodoParametroTesoreria;
	public Boolean isPermisoNuevoParametroTesoreria;
	public Boolean isPermisoActualizarParametroTesoreria;
	public Boolean isPermisoActualizarOriginalParametroTesoreria;
	public Boolean isPermisoEliminarParametroTesoreria;
	public Boolean isPermisoGuardarCambiosParametroTesoreria;
	public Boolean isPermisoConsultaParametroTesoreria;
	public Boolean isPermisoBusquedaParametroTesoreria;
	public Boolean isPermisoReporteParametroTesoreria;
	public Boolean isPermisoPaginacionMedioParametroTesoreria;
	public Boolean isPermisoPaginacionAltoParametroTesoreria;
	public Boolean isPermisoPaginacionTodoParametroTesoreria;
	public Boolean isPermisoCopiarParametroTesoreria;
	public Boolean isPermisoVerFormParametroTesoreria;
	public Boolean isPermisoDuplicarParametroTesoreria;
	public Boolean isPermisoOrdenParametroTesoreria;
	
	
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
	
	public ParametroTesoreriaParameterReturnGeneral parametrotesoreriaReturnGeneral;
	public ParametroTesoreriaParameterReturnGeneral parametrotesoreriaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParametroTesoreria=false;
	public Boolean esParaAccionDesdeFormularioParametroTesoreria=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParametroTesoreriaSessionBeanAdditional parametrotesoreriaSessionBeanAdditional=null;
	
	public ParametroTesoreriaSessionBeanAdditional getParametroTesoreriaSessionBeanAdditional() {
		return this.parametrotesoreriaSessionBeanAdditional;
	}
	
	public void setParametroTesoreriaSessionBeanAdditional(ParametroTesoreriaSessionBeanAdditional parametrotesoreriaSessionBeanAdditional) {
		try {
			this.parametrotesoreriaSessionBeanAdditional=parametrotesoreriaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParametroTesoreriaBeanSwingJInternalFrameAdditional parametrotesoreriaBeanSwingJInternalFrameAdditional=null;
	//public class ParametroTesoreriaBeanSwingJInternalFrame
	
	public ParametroTesoreriaBeanSwingJInternalFrameAdditional getParametroTesoreriaBeanSwingJInternalFrameAdditional() {
		return this.parametrotesoreriaBeanSwingJInternalFrameAdditional;
	}
	
	public void setParametroTesoreriaBeanSwingJInternalFrameAdditional(ParametroTesoreriaBeanSwingJInternalFrameAdditional parametrotesoreriaBeanSwingJInternalFrameAdditional) {
		try {
			this.parametrotesoreriaBeanSwingJInternalFrameAdditional=parametrotesoreriaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParametroTesoreriaLogic parametrotesoreriaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ParametroTesoreria parametrotesoreriaBean;
	public ParametroTesoreriaConstantesFunciones parametrotesoreriaConstantesFunciones;
	//public ParametroTesoreriaParameterReturnGeneral parametrotesoreriaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TransaccionLogic transaccioncobrarpagoLogic;
	public TransaccionLogic transaccioncobrardebitoLogic;
	public TransaccionLogic transaccioncobrarcreditoLogic;
	public TransaccionLogic transaccionpagarpagoLogic;
	public TransaccionLogic transaccionpagardebitoLogic;
	public TransaccionLogic transaccionpagarcreditoLogic;
	
	//PARAMETROS
	
	
	//public List<ParametroTesoreria> parametrotesorerias;	
	//public List<ParametroTesoreria> parametrotesoreriasEliminados;
	//public List<ParametroTesoreria> parametrotesoreriasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParametroTesoreria=false;
	public Boolean isVisibilidadCeldaDuplicarParametroTesoreria=true;
	public Boolean isVisibilidadCeldaCopiarParametroTesoreria=true;
	public Boolean isVisibilidadCeldaVerFormParametroTesoreria=true;
	public Boolean isVisibilidadCeldaOrdenParametroTesoreria=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParametroTesoreria=false;
	public Boolean isVisibilidadCeldaModificarParametroTesoreria=false;
	public Boolean isVisibilidadCeldaActualizarParametroTesoreria=false;
	public Boolean isVisibilidadCeldaEliminarParametroTesoreria=false;
	public Boolean isVisibilidadCeldaCancelarParametroTesoreria=false;
	public Boolean isVisibilidadCeldaGuardarParametroTesoreria=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParametroTesoreria=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTransaccionCobrarCredito=false;
	public Boolean isVisibilidadFK_IdTransaccionCobrarDebito=false;
	public Boolean isVisibilidadFK_IdTransaccionCobrarPago=false;
	public Boolean isVisibilidadFK_IdTransaccionPagarCredito=false;
	public Boolean isVisibilidadFK_IdTransaccionPagarDebito=false;
	public Boolean isVisibilidadFK_IdTransaccionPagarPago=false;
	
	public Long getiIdNuevoParametroTesoreria() {
		return this.iIdNuevoParametroTesoreria;
	}

	public void setiIdNuevoParametroTesoreria(Long iIdNuevoParametroTesoreria) {
		this.iIdNuevoParametroTesoreria = iIdNuevoParametroTesoreria;
	}
	
	public Long getidParametroTesoreriaActual() {
		return this.idParametroTesoreriaActual;
	}

	public void setidParametroTesoreriaActual(Long idParametroTesoreriaActual) {
		this.idParametroTesoreriaActual = idParametroTesoreriaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ParametroTesoreria getparametrotesoreria() {
		return this.parametrotesoreria;
	}

	public void setparametrotesoreria(ParametroTesoreria parametrotesoreria) {
		this.parametrotesoreria = parametrotesoreria;
	}
	
	public ParametroTesoreria getparametrotesoreriaAux() {
		return this.parametrotesoreriaAux;
	}

	public void setparametrotesoreriaAux(ParametroTesoreria parametrotesoreriaAux) {
		this.parametrotesoreriaAux = parametrotesoreriaAux;
	}				
	
	public ParametroTesoreria getparametrotesoreriaAnterior() {
		return this.parametrotesoreriaAnterior;
	}

	public void setparametrotesoreriaAnterior(ParametroTesoreria parametrotesoreriaAnterior) {
		this.parametrotesoreriaAnterior = parametrotesoreriaAnterior;
	}	
	
	public ParametroTesoreria getparametrotesoreriaTotales() {
		return this.parametrotesoreriaTotales;
	}

	public void setparametrotesoreriaTotales(ParametroTesoreria parametrotesoreriaTotales) {
		this.parametrotesoreriaTotales = parametrotesoreriaTotales;
	}	
	
	public ParametroTesoreria getparametrotesoreriaBean() {
		return this.parametrotesoreriaBean;
	}

	public void setparametrotesoreriaBean(ParametroTesoreria parametrotesoreriaBean) {
		this.parametrotesoreriaBean = parametrotesoreriaBean;
	}	
	
	public ParametroTesoreriaParameterReturnGeneral getparametrotesoreriaReturnGeneral() {
		return this.parametrotesoreriaReturnGeneral;
	}

	public void setparametrotesoreriaReturnGeneral(ParametroTesoreriaParameterReturnGeneral parametrotesoreriaReturnGeneral) {
		this.parametrotesoreriaReturnGeneral = parametrotesoreriaReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_transaccion_cobrar_creditoFK_IdTransaccionCobrarCredito=-1L;

	public Long getid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCredito() {
		return this.id_transaccion_cobrar_creditoFK_IdTransaccionCobrarCredito;
	}

	public void setid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCredito(Long id_transaccion_cobrar_creditoFK_IdTransaccionCobrarCredito) {
		this.id_transaccion_cobrar_creditoFK_IdTransaccionCobrarCredito = id_transaccion_cobrar_creditoFK_IdTransaccionCobrarCredito;
	}

	public Long id_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebito=-1L;

	public Long getid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebito() {
		return this.id_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebito;
	}

	public void setid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebito(Long id_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebito) {
		this.id_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebito = id_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebito;
	}

	public Long id_transaccion_cobrar_pagoFK_IdTransaccionCobrarPago=-1L;

	public Long getid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPago() {
		return this.id_transaccion_cobrar_pagoFK_IdTransaccionCobrarPago;
	}

	public void setid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPago(Long id_transaccion_cobrar_pagoFK_IdTransaccionCobrarPago) {
		this.id_transaccion_cobrar_pagoFK_IdTransaccionCobrarPago = id_transaccion_cobrar_pagoFK_IdTransaccionCobrarPago;
	}

	public Long id_transaccion_pagar_creditoFK_IdTransaccionPagarCredito=-1L;

	public Long getid_transaccion_pagar_creditoFK_IdTransaccionPagarCredito() {
		return this.id_transaccion_pagar_creditoFK_IdTransaccionPagarCredito;
	}

	public void setid_transaccion_pagar_creditoFK_IdTransaccionPagarCredito(Long id_transaccion_pagar_creditoFK_IdTransaccionPagarCredito) {
		this.id_transaccion_pagar_creditoFK_IdTransaccionPagarCredito = id_transaccion_pagar_creditoFK_IdTransaccionPagarCredito;
	}

	public Long id_transaccion_pagar_debitoFK_IdTransaccionPagarDebito=-1L;

	public Long getid_transaccion_pagar_debitoFK_IdTransaccionPagarDebito() {
		return this.id_transaccion_pagar_debitoFK_IdTransaccionPagarDebito;
	}

	public void setid_transaccion_pagar_debitoFK_IdTransaccionPagarDebito(Long id_transaccion_pagar_debitoFK_IdTransaccionPagarDebito) {
		this.id_transaccion_pagar_debitoFK_IdTransaccionPagarDebito = id_transaccion_pagar_debitoFK_IdTransaccionPagarDebito;
	}

	public Long id_transaccion_pagar_pagoFK_IdTransaccionPagarPago=-1L;

	public Long getid_transaccion_pagar_pagoFK_IdTransaccionPagarPago() {
		return this.id_transaccion_pagar_pagoFK_IdTransaccionPagarPago;
	}

	public void setid_transaccion_pagar_pagoFK_IdTransaccionPagarPago(Long id_transaccion_pagar_pagoFK_IdTransaccionPagarPago) {
		this.id_transaccion_pagar_pagoFK_IdTransaccionPagarPago = id_transaccion_pagar_pagoFK_IdTransaccionPagarPago;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ParametroTesoreriaLogic getParametroTesoreriaLogic()	{		
		return parametrotesoreriaLogic;
	}

	public void setParametroTesoreriaLogic(ParametroTesoreriaLogic parametrotesoreriaLogic) {
		this.parametrotesoreriaLogic = parametrotesoreriaLogic;
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
	
	public Boolean getIsEsNuevoParametroTesoreria() {
		return isEsNuevoParametroTesoreria;
	}

	public void setIsEsNuevoParametroTesoreria(Boolean isEsNuevoParametroTesoreria) {
		this.isEsNuevoParametroTesoreria = isEsNuevoParametroTesoreria;
	}

	public Boolean getEsParaAccionDesdeFormularioParametroTesoreria() {
		return esParaAccionDesdeFormularioParametroTesoreria;
	}
	
	public void setEsParaAccionDesdeFormularioParametroTesoreria(Boolean esParaAccionDesdeFormularioParametroTesoreria) {
		this.esParaAccionDesdeFormularioParametroTesoreria = esParaAccionDesdeFormularioParametroTesoreria;
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

			if(this.parametrotesoreriaSessionBean==null) {
				this.parametrotesoreriaSessionBean=new ParametroTesoreriaSessionBean();
			}

			if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(parametrotesoreriaSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTransaccionCobrarPagosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccioncobrarpagosForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.parametrotesoreriaSessionBean==null) {
				this.parametrotesoreriaSessionBean=new ParametroTesoreriaSessionBean();
			}

			if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionCobrarPago()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccioncobrarpagoLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccioncobrarpagosForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccionCobrarPago(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(parametrotesoreriaSessionBean.getlidTransaccionCobrarPagoActual());
					this.transaccioncobrarpagosForeignKey.add(transaccionLogic.getTransaccion());
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

	public void cargarCombosTransaccionCobrarDebitosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccioncobrardebitosForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.parametrotesoreriaSessionBean==null) {
				this.parametrotesoreriaSessionBean=new ParametroTesoreriaSessionBean();
			}

			if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionCobrarDebito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccioncobrardebitoLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccioncobrardebitosForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccionCobrarDebito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(parametrotesoreriaSessionBean.getlidTransaccionCobrarDebitoActual());
					this.transaccioncobrardebitosForeignKey.add(transaccionLogic.getTransaccion());
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

	public void cargarCombosTransaccionCobrarCreditosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccioncobrarcreditosForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.parametrotesoreriaSessionBean==null) {
				this.parametrotesoreriaSessionBean=new ParametroTesoreriaSessionBean();
			}

			if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionCobrarCredito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccioncobrarcreditoLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccioncobrarcreditosForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccionCobrarCredito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(parametrotesoreriaSessionBean.getlidTransaccionCobrarCreditoActual());
					this.transaccioncobrarcreditosForeignKey.add(transaccionLogic.getTransaccion());
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

	public void cargarCombosTransaccionPagarPagosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccionpagarpagosForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.parametrotesoreriaSessionBean==null) {
				this.parametrotesoreriaSessionBean=new ParametroTesoreriaSessionBean();
			}

			if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionPagarPago()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccionpagarpagoLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccionpagarpagosForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccionPagarPago(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(parametrotesoreriaSessionBean.getlidTransaccionPagarPagoActual());
					this.transaccionpagarpagosForeignKey.add(transaccionLogic.getTransaccion());
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

	public void cargarCombosTransaccionPagarDebitosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccionpagardebitosForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.parametrotesoreriaSessionBean==null) {
				this.parametrotesoreriaSessionBean=new ParametroTesoreriaSessionBean();
			}

			if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionPagarDebito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccionpagardebitoLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccionpagardebitosForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccionPagarDebito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(parametrotesoreriaSessionBean.getlidTransaccionPagarDebitoActual());
					this.transaccionpagardebitosForeignKey.add(transaccionLogic.getTransaccion());
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

	public void cargarCombosTransaccionPagarCreditosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccionpagarcreditosForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.parametrotesoreriaSessionBean==null) {
				this.parametrotesoreriaSessionBean=new ParametroTesoreriaSessionBean();
			}

			if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionPagarCredito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccionpagarcreditoLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccionpagarcreditosForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccionPagarCredito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(parametrotesoreriaSessionBean.getlidTransaccionPagarCreditoActual());
					this.transaccionpagarcreditosForeignKey.add(transaccionLogic.getTransaccion());
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

					if(this.parametrotesoreria!=null) {
						this.parametrotesoreria.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
						this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_empresaParametroTesoreria.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaParametroTesoreria.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
						if(this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_empresaParametroTesoreria.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_empresaParametroTesoreria.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaParametroTesoreriaGenerico)throws Exception
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
				jComboBoxid_empresaParametroTesoreriaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaParametroTesoreriaGenerico!=null && jComboBoxid_empresaParametroTesoreriaGenerico.getItemCount()>0) {
					jComboBoxid_empresaParametroTesoreriaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionCobrarPagoForeignKey(Long idTransaccionCobrarPagoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccioncobrarpagoTemp=null;

			for(Transaccion transaccioncobrarpagoAux:transaccioncobrarpagosForeignKey) {
				if(transaccioncobrarpagoAux.getId()!=null && transaccioncobrarpagoAux.getId().equals(idTransaccionCobrarPagoSeleccionado)) {
					transaccioncobrarpagoTemp=transaccioncobrarpagoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccioncobrarpagoTemp!=null) {

					if(this.parametrotesoreria!=null) {
						this.parametrotesoreria.setTransaccionCobrarPago(transaccioncobrarpagoTemp);
					}

					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
						this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.setSelectedItem(transaccioncobrarpagoTemp);
					}
				} else {
					//jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.setSelectedItem(transaccioncobrarpagoTemp);
					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
						if(this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTransaccionCobrarPago") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccioncobrarpagoTemp!=null && jComboBoxid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria!=null) {
						jComboBoxid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria.setSelectedItem(transaccioncobrarpagoTemp);
					} else {
						if(jComboBoxid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria!=null) {
							//jComboBoxid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria.setSelectedItem(transaccioncobrarpagoTemp);
							if(jComboBoxid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria.getItemCount()>0) {
								jComboBoxid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria.setSelectedIndex(0);
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

	public String getActualTransaccionCobrarPagoForeignKeyDescripcion(Long idTransaccionCobrarPagoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccioncobrarpagoTemp=null;

			for(Transaccion transaccioncobrarpagoAux:transaccioncobrarpagosForeignKey) {
				if(transaccioncobrarpagoAux.getId()!=null && transaccioncobrarpagoAux.getId().equals(idTransaccionCobrarPagoSeleccionado)) {
					transaccioncobrarpagoTemp=transaccioncobrarpagoAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccioncobrarpagoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionCobrarPagoForeignKeyGenerico(Long idTransaccionCobrarPagoSeleccionado,JComboBox jComboBoxid_transaccion_cobrar_pagoParametroTesoreriaGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccioncobrarpagoTemp=null;

			for(Transaccion transaccioncobrarpagoAux:transaccioncobrarpagosForeignKey) {
				if(transaccioncobrarpagoAux.getId()!=null && transaccioncobrarpagoAux.getId().equals(idTransaccionCobrarPagoSeleccionado)) {
					transaccioncobrarpagoTemp=transaccioncobrarpagoAux;
					break;
				}
			}

			if(transaccioncobrarpagoTemp!=null) {
				jComboBoxid_transaccion_cobrar_pagoParametroTesoreriaGenerico.setSelectedItem(transaccioncobrarpagoTemp);
			} else {
				if(jComboBoxid_transaccion_cobrar_pagoParametroTesoreriaGenerico!=null && jComboBoxid_transaccion_cobrar_pagoParametroTesoreriaGenerico.getItemCount()>0) {
					jComboBoxid_transaccion_cobrar_pagoParametroTesoreriaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionCobrarDebitoForeignKey(Long idTransaccionCobrarDebitoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccioncobrardebitoTemp=null;

			for(Transaccion transaccioncobrardebitoAux:transaccioncobrardebitosForeignKey) {
				if(transaccioncobrardebitoAux.getId()!=null && transaccioncobrardebitoAux.getId().equals(idTransaccionCobrarDebitoSeleccionado)) {
					transaccioncobrardebitoTemp=transaccioncobrardebitoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccioncobrardebitoTemp!=null) {

					if(this.parametrotesoreria!=null) {
						this.parametrotesoreria.setTransaccionCobrarDebito(transaccioncobrardebitoTemp);
					}

					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
						this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.setSelectedItem(transaccioncobrardebitoTemp);
					}
				} else {
					//jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.setSelectedItem(transaccioncobrardebitoTemp);
					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
						if(this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTransaccionCobrarDebito") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccioncobrardebitoTemp!=null && jComboBoxid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria!=null) {
						jComboBoxid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria.setSelectedItem(transaccioncobrardebitoTemp);
					} else {
						if(jComboBoxid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria!=null) {
							//jComboBoxid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria.setSelectedItem(transaccioncobrardebitoTemp);
							if(jComboBoxid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria.getItemCount()>0) {
								jComboBoxid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria.setSelectedIndex(0);
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

	public String getActualTransaccionCobrarDebitoForeignKeyDescripcion(Long idTransaccionCobrarDebitoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccioncobrardebitoTemp=null;

			for(Transaccion transaccioncobrardebitoAux:transaccioncobrardebitosForeignKey) {
				if(transaccioncobrardebitoAux.getId()!=null && transaccioncobrardebitoAux.getId().equals(idTransaccionCobrarDebitoSeleccionado)) {
					transaccioncobrardebitoTemp=transaccioncobrardebitoAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccioncobrardebitoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionCobrarDebitoForeignKeyGenerico(Long idTransaccionCobrarDebitoSeleccionado,JComboBox jComboBoxid_transaccion_cobrar_debitoParametroTesoreriaGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccioncobrardebitoTemp=null;

			for(Transaccion transaccioncobrardebitoAux:transaccioncobrardebitosForeignKey) {
				if(transaccioncobrardebitoAux.getId()!=null && transaccioncobrardebitoAux.getId().equals(idTransaccionCobrarDebitoSeleccionado)) {
					transaccioncobrardebitoTemp=transaccioncobrardebitoAux;
					break;
				}
			}

			if(transaccioncobrardebitoTemp!=null) {
				jComboBoxid_transaccion_cobrar_debitoParametroTesoreriaGenerico.setSelectedItem(transaccioncobrardebitoTemp);
			} else {
				if(jComboBoxid_transaccion_cobrar_debitoParametroTesoreriaGenerico!=null && jComboBoxid_transaccion_cobrar_debitoParametroTesoreriaGenerico.getItemCount()>0) {
					jComboBoxid_transaccion_cobrar_debitoParametroTesoreriaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionCobrarCreditoForeignKey(Long idTransaccionCobrarCreditoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccioncobrarcreditoTemp=null;

			for(Transaccion transaccioncobrarcreditoAux:transaccioncobrarcreditosForeignKey) {
				if(transaccioncobrarcreditoAux.getId()!=null && transaccioncobrarcreditoAux.getId().equals(idTransaccionCobrarCreditoSeleccionado)) {
					transaccioncobrarcreditoTemp=transaccioncobrarcreditoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccioncobrarcreditoTemp!=null) {

					if(this.parametrotesoreria!=null) {
						this.parametrotesoreria.setTransaccionCobrarCredito(transaccioncobrarcreditoTemp);
					}

					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
						this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.setSelectedItem(transaccioncobrarcreditoTemp);
					}
				} else {
					//jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.setSelectedItem(transaccioncobrarcreditoTemp);
					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
						if(this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTransaccionCobrarCredito") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccioncobrarcreditoTemp!=null && jComboBoxid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria!=null) {
						jComboBoxid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria.setSelectedItem(transaccioncobrarcreditoTemp);
					} else {
						if(jComboBoxid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria!=null) {
							//jComboBoxid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria.setSelectedItem(transaccioncobrarcreditoTemp);
							if(jComboBoxid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria.getItemCount()>0) {
								jComboBoxid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria.setSelectedIndex(0);
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

	public String getActualTransaccionCobrarCreditoForeignKeyDescripcion(Long idTransaccionCobrarCreditoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccioncobrarcreditoTemp=null;

			for(Transaccion transaccioncobrarcreditoAux:transaccioncobrarcreditosForeignKey) {
				if(transaccioncobrarcreditoAux.getId()!=null && transaccioncobrarcreditoAux.getId().equals(idTransaccionCobrarCreditoSeleccionado)) {
					transaccioncobrarcreditoTemp=transaccioncobrarcreditoAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccioncobrarcreditoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionCobrarCreditoForeignKeyGenerico(Long idTransaccionCobrarCreditoSeleccionado,JComboBox jComboBoxid_transaccion_cobrar_creditoParametroTesoreriaGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccioncobrarcreditoTemp=null;

			for(Transaccion transaccioncobrarcreditoAux:transaccioncobrarcreditosForeignKey) {
				if(transaccioncobrarcreditoAux.getId()!=null && transaccioncobrarcreditoAux.getId().equals(idTransaccionCobrarCreditoSeleccionado)) {
					transaccioncobrarcreditoTemp=transaccioncobrarcreditoAux;
					break;
				}
			}

			if(transaccioncobrarcreditoTemp!=null) {
				jComboBoxid_transaccion_cobrar_creditoParametroTesoreriaGenerico.setSelectedItem(transaccioncobrarcreditoTemp);
			} else {
				if(jComboBoxid_transaccion_cobrar_creditoParametroTesoreriaGenerico!=null && jComboBoxid_transaccion_cobrar_creditoParametroTesoreriaGenerico.getItemCount()>0) {
					jComboBoxid_transaccion_cobrar_creditoParametroTesoreriaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionPagarPagoForeignKey(Long idTransaccionPagarPagoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccionpagarpagoTemp=null;

			for(Transaccion transaccionpagarpagoAux:transaccionpagarpagosForeignKey) {
				if(transaccionpagarpagoAux.getId()!=null && transaccionpagarpagoAux.getId().equals(idTransaccionPagarPagoSeleccionado)) {
					transaccionpagarpagoTemp=transaccionpagarpagoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccionpagarpagoTemp!=null) {

					if(this.parametrotesoreria!=null) {
						this.parametrotesoreria.setTransaccionPagarPago(transaccionpagarpagoTemp);
					}

					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
						this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_pagoParametroTesoreria.setSelectedItem(transaccionpagarpagoTemp);
					}
				} else {
					//jComboBoxid_transaccion_pagar_pagoParametroTesoreria.setSelectedItem(transaccionpagarpagoTemp);
					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
						if(this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_pagoParametroTesoreria.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_pagoParametroTesoreria.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTransaccionPagarPago") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccionpagarpagoTemp!=null && jComboBoxid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria!=null) {
						jComboBoxid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria.setSelectedItem(transaccionpagarpagoTemp);
					} else {
						if(jComboBoxid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria!=null) {
							//jComboBoxid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria.setSelectedItem(transaccionpagarpagoTemp);
							if(jComboBoxid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria.getItemCount()>0) {
								jComboBoxid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria.setSelectedIndex(0);
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

	public String getActualTransaccionPagarPagoForeignKeyDescripcion(Long idTransaccionPagarPagoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccionpagarpagoTemp=null;

			for(Transaccion transaccionpagarpagoAux:transaccionpagarpagosForeignKey) {
				if(transaccionpagarpagoAux.getId()!=null && transaccionpagarpagoAux.getId().equals(idTransaccionPagarPagoSeleccionado)) {
					transaccionpagarpagoTemp=transaccionpagarpagoAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccionpagarpagoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionPagarPagoForeignKeyGenerico(Long idTransaccionPagarPagoSeleccionado,JComboBox jComboBoxid_transaccion_pagar_pagoParametroTesoreriaGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionpagarpagoTemp=null;

			for(Transaccion transaccionpagarpagoAux:transaccionpagarpagosForeignKey) {
				if(transaccionpagarpagoAux.getId()!=null && transaccionpagarpagoAux.getId().equals(idTransaccionPagarPagoSeleccionado)) {
					transaccionpagarpagoTemp=transaccionpagarpagoAux;
					break;
				}
			}

			if(transaccionpagarpagoTemp!=null) {
				jComboBoxid_transaccion_pagar_pagoParametroTesoreriaGenerico.setSelectedItem(transaccionpagarpagoTemp);
			} else {
				if(jComboBoxid_transaccion_pagar_pagoParametroTesoreriaGenerico!=null && jComboBoxid_transaccion_pagar_pagoParametroTesoreriaGenerico.getItemCount()>0) {
					jComboBoxid_transaccion_pagar_pagoParametroTesoreriaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionPagarDebitoForeignKey(Long idTransaccionPagarDebitoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccionpagardebitoTemp=null;

			for(Transaccion transaccionpagardebitoAux:transaccionpagardebitosForeignKey) {
				if(transaccionpagardebitoAux.getId()!=null && transaccionpagardebitoAux.getId().equals(idTransaccionPagarDebitoSeleccionado)) {
					transaccionpagardebitoTemp=transaccionpagardebitoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccionpagardebitoTemp!=null) {

					if(this.parametrotesoreria!=null) {
						this.parametrotesoreria.setTransaccionPagarDebito(transaccionpagardebitoTemp);
					}

					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
						this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_debitoParametroTesoreria.setSelectedItem(transaccionpagardebitoTemp);
					}
				} else {
					//jComboBoxid_transaccion_pagar_debitoParametroTesoreria.setSelectedItem(transaccionpagardebitoTemp);
					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
						if(this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_debitoParametroTesoreria.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_debitoParametroTesoreria.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTransaccionPagarDebito") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccionpagardebitoTemp!=null && jComboBoxid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria!=null) {
						jComboBoxid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria.setSelectedItem(transaccionpagardebitoTemp);
					} else {
						if(jComboBoxid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria!=null) {
							//jComboBoxid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria.setSelectedItem(transaccionpagardebitoTemp);
							if(jComboBoxid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria.getItemCount()>0) {
								jComboBoxid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria.setSelectedIndex(0);
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

	public String getActualTransaccionPagarDebitoForeignKeyDescripcion(Long idTransaccionPagarDebitoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccionpagardebitoTemp=null;

			for(Transaccion transaccionpagardebitoAux:transaccionpagardebitosForeignKey) {
				if(transaccionpagardebitoAux.getId()!=null && transaccionpagardebitoAux.getId().equals(idTransaccionPagarDebitoSeleccionado)) {
					transaccionpagardebitoTemp=transaccionpagardebitoAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccionpagardebitoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionPagarDebitoForeignKeyGenerico(Long idTransaccionPagarDebitoSeleccionado,JComboBox jComboBoxid_transaccion_pagar_debitoParametroTesoreriaGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionpagardebitoTemp=null;

			for(Transaccion transaccionpagardebitoAux:transaccionpagardebitosForeignKey) {
				if(transaccionpagardebitoAux.getId()!=null && transaccionpagardebitoAux.getId().equals(idTransaccionPagarDebitoSeleccionado)) {
					transaccionpagardebitoTemp=transaccionpagardebitoAux;
					break;
				}
			}

			if(transaccionpagardebitoTemp!=null) {
				jComboBoxid_transaccion_pagar_debitoParametroTesoreriaGenerico.setSelectedItem(transaccionpagardebitoTemp);
			} else {
				if(jComboBoxid_transaccion_pagar_debitoParametroTesoreriaGenerico!=null && jComboBoxid_transaccion_pagar_debitoParametroTesoreriaGenerico.getItemCount()>0) {
					jComboBoxid_transaccion_pagar_debitoParametroTesoreriaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionPagarCreditoForeignKey(Long idTransaccionPagarCreditoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccionpagarcreditoTemp=null;

			for(Transaccion transaccionpagarcreditoAux:transaccionpagarcreditosForeignKey) {
				if(transaccionpagarcreditoAux.getId()!=null && transaccionpagarcreditoAux.getId().equals(idTransaccionPagarCreditoSeleccionado)) {
					transaccionpagarcreditoTemp=transaccionpagarcreditoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccionpagarcreditoTemp!=null) {

					if(this.parametrotesoreria!=null) {
						this.parametrotesoreria.setTransaccionPagarCredito(transaccionpagarcreditoTemp);
					}

					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
						this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_creditoParametroTesoreria.setSelectedItem(transaccionpagarcreditoTemp);
					}
				} else {
					//jComboBoxid_transaccion_pagar_creditoParametroTesoreria.setSelectedItem(transaccionpagarcreditoTemp);
					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
						if(this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_creditoParametroTesoreria.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_creditoParametroTesoreria.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTransaccionPagarCredito") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccionpagarcreditoTemp!=null && jComboBoxid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria!=null) {
						jComboBoxid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria.setSelectedItem(transaccionpagarcreditoTemp);
					} else {
						if(jComboBoxid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria!=null) {
							//jComboBoxid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria.setSelectedItem(transaccionpagarcreditoTemp);
							if(jComboBoxid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria.getItemCount()>0) {
								jComboBoxid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria.setSelectedIndex(0);
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

	public String getActualTransaccionPagarCreditoForeignKeyDescripcion(Long idTransaccionPagarCreditoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccionpagarcreditoTemp=null;

			for(Transaccion transaccionpagarcreditoAux:transaccionpagarcreditosForeignKey) {
				if(transaccionpagarcreditoAux.getId()!=null && transaccionpagarcreditoAux.getId().equals(idTransaccionPagarCreditoSeleccionado)) {
					transaccionpagarcreditoTemp=transaccionpagarcreditoAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccionpagarcreditoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionPagarCreditoForeignKeyGenerico(Long idTransaccionPagarCreditoSeleccionado,JComboBox jComboBoxid_transaccion_pagar_creditoParametroTesoreriaGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionpagarcreditoTemp=null;

			for(Transaccion transaccionpagarcreditoAux:transaccionpagarcreditosForeignKey) {
				if(transaccionpagarcreditoAux.getId()!=null && transaccionpagarcreditoAux.getId().equals(idTransaccionPagarCreditoSeleccionado)) {
					transaccionpagarcreditoTemp=transaccionpagarcreditoAux;
					break;
				}
			}

			if(transaccionpagarcreditoTemp!=null) {
				jComboBoxid_transaccion_pagar_creditoParametroTesoreriaGenerico.setSelectedItem(transaccionpagarcreditoTemp);
			} else {
				if(jComboBoxid_transaccion_pagar_creditoParametroTesoreriaGenerico!=null && jComboBoxid_transaccion_pagar_creditoParametroTesoreriaGenerico.getItemCount()>0) {
					jComboBoxid_transaccion_pagar_creditoParametroTesoreriaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ParametroTesoreria parametrotesoreria,JComboBox jComboBoxid_empresaParametroTesoreriaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaParametroTesoreriaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_empresaParametroTesoreria.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaParametroTesoreriaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				parametrotesoreria.setid_empresa(empresaAux.getId());
				parametrotesoreria.setempresa_descripcion(ParametroTesoreriaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				parametrotesoreria.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionCobrarPagoForeignKey(ParametroTesoreria parametrotesoreria,JComboBox jComboBoxid_transaccion_cobrar_pagoParametroTesoreriaGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccion_cobrar_pagoParametroTesoreriaGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccion_cobrar_pagoParametroTesoreriaGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				parametrotesoreria.setid_transaccion_cobrar_pago(transaccionAux.getId());
				parametrotesoreria.settransaccioncobrarpago_descripcion(ParametroTesoreriaConstantesFunciones.getTransaccionCobrarPagoDescripcion(transaccionAux));
				parametrotesoreria.setTransaccionCobrarPago(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionCobrarDebitoForeignKey(ParametroTesoreria parametrotesoreria,JComboBox jComboBoxid_transaccion_cobrar_debitoParametroTesoreriaGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccion_cobrar_debitoParametroTesoreriaGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccion_cobrar_debitoParametroTesoreriaGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				parametrotesoreria.setid_transaccion_cobrar_debito(transaccionAux.getId());
				parametrotesoreria.settransaccioncobrardebito_descripcion(ParametroTesoreriaConstantesFunciones.getTransaccionCobrarDebitoDescripcion(transaccionAux));
				parametrotesoreria.setTransaccionCobrarDebito(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionCobrarCreditoForeignKey(ParametroTesoreria parametrotesoreria,JComboBox jComboBoxid_transaccion_cobrar_creditoParametroTesoreriaGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccion_cobrar_creditoParametroTesoreriaGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccion_cobrar_creditoParametroTesoreriaGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				parametrotesoreria.setid_transaccion_cobrar_credito(transaccionAux.getId());
				parametrotesoreria.settransaccioncobrarcredito_descripcion(ParametroTesoreriaConstantesFunciones.getTransaccionCobrarCreditoDescripcion(transaccionAux));
				parametrotesoreria.setTransaccionCobrarCredito(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionPagarPagoForeignKey(ParametroTesoreria parametrotesoreria,JComboBox jComboBoxid_transaccion_pagar_pagoParametroTesoreriaGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccion_pagar_pagoParametroTesoreriaGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_pagoParametroTesoreria.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccion_pagar_pagoParametroTesoreriaGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				parametrotesoreria.setid_transaccion_pagar_pago(transaccionAux.getId());
				parametrotesoreria.settransaccionpagarpago_descripcion(ParametroTesoreriaConstantesFunciones.getTransaccionPagarPagoDescripcion(transaccionAux));
				parametrotesoreria.setTransaccionPagarPago(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionPagarDebitoForeignKey(ParametroTesoreria parametrotesoreria,JComboBox jComboBoxid_transaccion_pagar_debitoParametroTesoreriaGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccion_pagar_debitoParametroTesoreriaGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_debitoParametroTesoreria.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccion_pagar_debitoParametroTesoreriaGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				parametrotesoreria.setid_transaccion_pagar_debito(transaccionAux.getId());
				parametrotesoreria.settransaccionpagardebito_descripcion(ParametroTesoreriaConstantesFunciones.getTransaccionPagarDebitoDescripcion(transaccionAux));
				parametrotesoreria.setTransaccionPagarDebito(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionPagarCreditoForeignKey(ParametroTesoreria parametrotesoreria,JComboBox jComboBoxid_transaccion_pagar_creditoParametroTesoreriaGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccion_pagar_creditoParametroTesoreriaGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_creditoParametroTesoreria.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccion_pagar_creditoParametroTesoreriaGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				parametrotesoreria.setid_transaccion_pagar_credito(transaccionAux.getId());
				parametrotesoreria.settransaccionpagarcredito_descripcion(ParametroTesoreriaConstantesFunciones.getTransaccionPagarCreditoDescripcion(transaccionAux));
				parametrotesoreria.setTransaccionPagarCredito(transaccionAux);			}
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

					if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { 
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_empresaParametroTesoreria.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_empresaParametroTesoreria.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { 
					}

					if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionCobrarPagosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { 
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.removeAllItems();

							for(Transaccion transaccioncobrarpago:this.transaccioncobrarpagosForeignKey) {
								this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.addItem(transaccioncobrarpago);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { 
					}

					if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTransaccionCobrarPago") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria.removeAllItems();

							for(Transaccion transaccioncobrarpago:this.transaccioncobrarpagosForeignKey) {
								this.jComboBoxid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria.addItem(transaccioncobrarpago);
							}
						}

						if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionCobrarDebitosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { 
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.removeAllItems();

							for(Transaccion transaccioncobrardebito:this.transaccioncobrardebitosForeignKey) {
								this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.addItem(transaccioncobrardebito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { 
					}

					if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTransaccionCobrarDebito") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria.removeAllItems();

							for(Transaccion transaccioncobrardebito:this.transaccioncobrardebitosForeignKey) {
								this.jComboBoxid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria.addItem(transaccioncobrardebito);
							}
						}

						if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionCobrarCreditosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { 
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.removeAllItems();

							for(Transaccion transaccioncobrarcredito:this.transaccioncobrarcreditosForeignKey) {
								this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.addItem(transaccioncobrarcredito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { 
					}

					if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTransaccionCobrarCredito") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria.removeAllItems();

							for(Transaccion transaccioncobrarcredito:this.transaccioncobrarcreditosForeignKey) {
								this.jComboBoxid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria.addItem(transaccioncobrarcredito);
							}
						}

						if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionPagarPagosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { 
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_pagoParametroTesoreria.removeAllItems();

							for(Transaccion transaccionpagarpago:this.transaccionpagarpagosForeignKey) {
								this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_pagoParametroTesoreria.addItem(transaccionpagarpago);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { 
					}

					if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTransaccionPagarPago") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria.removeAllItems();

							for(Transaccion transaccionpagarpago:this.transaccionpagarpagosForeignKey) {
								this.jComboBoxid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria.addItem(transaccionpagarpago);
							}
						}

						if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionPagarDebitosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { 
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_debitoParametroTesoreria.removeAllItems();

							for(Transaccion transaccionpagardebito:this.transaccionpagardebitosForeignKey) {
								this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_debitoParametroTesoreria.addItem(transaccionpagardebito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { 
					}

					if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTransaccionPagarDebito") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria.removeAllItems();

							for(Transaccion transaccionpagardebito:this.transaccionpagardebitosForeignKey) {
								this.jComboBoxid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria.addItem(transaccionpagardebito);
							}
						}

						if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionPagarCreditosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { 
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_creditoParametroTesoreria.removeAllItems();

							for(Transaccion transaccionpagarcredito:this.transaccionpagarcreditosForeignKey) {
								this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_creditoParametroTesoreria.addItem(transaccionpagarcredito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { 
					}

					if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTransaccionPagarCredito") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria.removeAllItems();

							for(Transaccion transaccionpagarcredito:this.transaccionpagarcreditosForeignKey) {
								this.jComboBoxid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria.addItem(transaccionpagarcredito);
							}
						}

						if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_empresaParametroTesoreria.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_empresaParametroTesoreria.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTransaccionCobrarPagoForeignKey(Transaccion transaccioncobrarpago,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.setSelectedItem(transaccioncobrarpago);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria.setSelectedItem(transaccioncobrarpago);
						} else {
							this.jComboBoxid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccionCobrarDebitoForeignKey(Transaccion transaccioncobrardebito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.setSelectedItem(transaccioncobrardebito);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria.setSelectedItem(transaccioncobrardebito);
						} else {
							this.jComboBoxid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccionCobrarCreditoForeignKey(Transaccion transaccioncobrarcredito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.setSelectedItem(transaccioncobrarcredito);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria.setSelectedItem(transaccioncobrarcredito);
						} else {
							this.jComboBoxid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccionPagarPagoForeignKey(Transaccion transaccionpagarpago,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_pagoParametroTesoreria.setSelectedItem(transaccionpagarpago);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_pagoParametroTesoreria.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria.setSelectedItem(transaccionpagarpago);
						} else {
							this.jComboBoxid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccionPagarDebitoForeignKey(Transaccion transaccionpagardebito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_debitoParametroTesoreria.setSelectedItem(transaccionpagardebito);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_debitoParametroTesoreria.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria.setSelectedItem(transaccionpagardebito);
						} else {
							this.jComboBoxid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccionPagarCreditoForeignKey(Transaccion transaccionpagarcredito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_creditoParametroTesoreria.setSelectedItem(transaccionpagarcredito);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_creditoParametroTesoreria.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria.setSelectedItem(transaccionpagarcredito);
						} else {
							this.jComboBoxid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesParametroTesoreria() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParametroTesoreriaConstantesFunciones.refrescarForeignKeysDescripcionesParametroTesoreria(this.parametrotesoreriaLogic.getParametroTesorerias());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParametroTesoreriaConstantesFunciones.refrescarForeignKeysDescripcionesParametroTesoreria(this.parametrotesorerias);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Transaccion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parametrotesoreriaLogic.setParametroTesorerias(this.parametrotesorerias);
			parametrotesoreriaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParametroTesoreriaParameterReturnGeneral getParametroTesoreriaParameterGeneral() {
		return this.parametrotesoreriaParameterGeneral;
	}
	
	public void setParametroTesoreriaParameterGeneral(ParametroTesoreriaParameterReturnGeneral parametrotesoreriaParameterGeneral) {
		this.parametrotesoreriaParameterGeneral = parametrotesoreriaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParametroTesoreria() {
		return isPermisoTodoParametroTesoreria;
	}

	public void setIsPermisoTodoParametroTesoreria(Boolean isPermisoTodoParametroTesoreria) {
		this.isPermisoTodoParametroTesoreria = isPermisoTodoParametroTesoreria;
	}

	public Boolean getIsPermisoNuevoParametroTesoreria() {
		return isPermisoNuevoParametroTesoreria;
	}

	public void setIsPermisoNuevoParametroTesoreria(Boolean isPermisoNuevoParametroTesoreria) {
		this.isPermisoNuevoParametroTesoreria = isPermisoNuevoParametroTesoreria;
	}

	public Boolean getIsPermisoActualizarParametroTesoreria() {
		return isPermisoActualizarParametroTesoreria;
	}

	public void setIsPermisoActualizarParametroTesoreria(Boolean isPermisoActualizarParametroTesoreria) {
		this.isPermisoActualizarParametroTesoreria = isPermisoActualizarParametroTesoreria;
	}

	public Boolean getIsPermisoEliminarParametroTesoreria() {
		return isPermisoEliminarParametroTesoreria;
	}

	public void setIsPermisoEliminarParametroTesoreria(Boolean isPermisoEliminarParametroTesoreria) {
		this.isPermisoEliminarParametroTesoreria = isPermisoEliminarParametroTesoreria;
	}

	public Boolean getIsPermisoGuardarCambiosParametroTesoreria() {
		return isPermisoGuardarCambiosParametroTesoreria;
	}

	public void setIsPermisoGuardarCambiosParametroTesoreria(Boolean isPermisoGuardarCambiosParametroTesoreria) {
		this.isPermisoGuardarCambiosParametroTesoreria = isPermisoGuardarCambiosParametroTesoreria;
	}
	
	public Boolean getIsPermisoConsultaParametroTesoreria() {
		return isPermisoConsultaParametroTesoreria;
	}

	public void setIsPermisoConsultaParametroTesoreria(Boolean isPermisoConsultaParametroTesoreria) {
		this.isPermisoConsultaParametroTesoreria = isPermisoConsultaParametroTesoreria;
	}

	public Boolean getIsPermisoBusquedaParametroTesoreria() {
		return isPermisoBusquedaParametroTesoreria;
	}

	public void setIsPermisoBusquedaParametroTesoreria(Boolean isPermisoBusquedaParametroTesoreria) {
		this.isPermisoBusquedaParametroTesoreria = isPermisoBusquedaParametroTesoreria;
	}

	public Boolean getIsPermisoReporteParametroTesoreria() {
		return isPermisoReporteParametroTesoreria;
	}

	public void setIsPermisoReporteParametroTesoreria(Boolean isPermisoReporteParametroTesoreria) {
		this.isPermisoReporteParametroTesoreria = isPermisoReporteParametroTesoreria;
	}
	
	public Boolean getIsPermisoPaginacionMedioParametroTesoreria() {
		return isPermisoPaginacionMedioParametroTesoreria;
	}

	public void setIsPermisoPaginacionMedioParametroTesoreria(Boolean isPermisoPaginacionMedioParametroTesoreria) {
		this.isPermisoPaginacionMedioParametroTesoreria = isPermisoPaginacionMedioParametroTesoreria;
	}
	
	public Boolean getIsPermisoPaginacionTodoParametroTesoreria() {
		return isPermisoPaginacionTodoParametroTesoreria;
	}

	public void setIsPermisoPaginacionTodoParametroTesoreria(Boolean isPermisoPaginacionTodoParametroTesoreria) {
		this.isPermisoPaginacionTodoParametroTesoreria = isPermisoPaginacionTodoParametroTesoreria;
	}
	
	public Boolean getIsPermisoPaginacionAltoParametroTesoreria() {
		return isPermisoPaginacionAltoParametroTesoreria;
	}

	public void setIsPermisoPaginacionAltoParametroTesoreria(Boolean isPermisoPaginacionAltoParametroTesoreria) {
		this.isPermisoPaginacionAltoParametroTesoreria = isPermisoPaginacionAltoParametroTesoreria;
	}
	
	public Boolean getIsPermisoCopiarParametroTesoreria() {
		return isPermisoCopiarParametroTesoreria;
	}

	public void setIsPermisoCopiarParametroTesoreria(Boolean isPermisoCopiarParametroTesoreria) {
		this.isPermisoCopiarParametroTesoreria = isPermisoCopiarParametroTesoreria;
	}
	
	public Boolean getIsPermisoVerFormParametroTesoreria() {
		return isPermisoVerFormParametroTesoreria;
	}

	public void setIsPermisoVerFormParametroTesoreria(Boolean isPermisoVerFormParametroTesoreria) {
		this.isPermisoVerFormParametroTesoreria = isPermisoVerFormParametroTesoreria;
	}
	
	public Boolean getIsPermisoDuplicarParametroTesoreria() {
		return isPermisoDuplicarParametroTesoreria;
	}

	public void setIsPermisoDuplicarParametroTesoreria(Boolean isPermisoDuplicarParametroTesoreria) {
		this.isPermisoDuplicarParametroTesoreria = isPermisoDuplicarParametroTesoreria;
	}
	
	public Boolean getIsPermisoOrdenParametroTesoreria() {
		return isPermisoOrdenParametroTesoreria;
	}

	public void setIsPermisoOrdenParametroTesoreria(Boolean isPermisoOrdenParametroTesoreria) {
		this.isPermisoOrdenParametroTesoreria = isPermisoOrdenParametroTesoreria;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParametroTesoreria() {
		return isVisibilidadCeldaNuevoParametroTesoreria;
	}

	public void setIsVisibilidadCeldaNuevoParametroTesoreria(Boolean isVisibilidadCeldaNuevoParametroTesoreria) {
		this.isVisibilidadCeldaNuevoParametroTesoreria = isVisibilidadCeldaNuevoParametroTesoreria;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParametroTesoreria() {
		return isVisibilidadCeldaDuplicarParametroTesoreria;
	}

	public void setIsVisibilidadCeldaDuplicarParametroTesoreria(Boolean isVisibilidadCeldaDuplicarParametroTesoreria) {
		this.isVisibilidadCeldaDuplicarParametroTesoreria = isVisibilidadCeldaDuplicarParametroTesoreria;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParametroTesoreria() {
		return isVisibilidadCeldaCopiarParametroTesoreria;
	}

	public void setIsVisibilidadCeldaCopiarParametroTesoreria(Boolean isVisibilidadCeldaCopiarParametroTesoreria) {
		this.isVisibilidadCeldaCopiarParametroTesoreria = isVisibilidadCeldaCopiarParametroTesoreria;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParametroTesoreria() {
		return isVisibilidadCeldaVerFormParametroTesoreria;
	}

	public void setIsVisibilidadCeldaVerFormParametroTesoreria(Boolean isVisibilidadCeldaVerFormParametroTesoreria) {
		this.isVisibilidadCeldaVerFormParametroTesoreria = isVisibilidadCeldaVerFormParametroTesoreria;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParametroTesoreria() {
		return isVisibilidadCeldaOrdenParametroTesoreria;
	}

	public void setIsVisibilidadCeldaOrdenParametroTesoreria(Boolean isVisibilidadCeldaOrdenParametroTesoreria) {
		this.isVisibilidadCeldaOrdenParametroTesoreria = isVisibilidadCeldaOrdenParametroTesoreria;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParametroTesoreria() {
		return isVisibilidadCeldaNuevoRelacionesParametroTesoreria;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParametroTesoreria(Boolean isVisibilidadCeldaNuevoRelacionesParametroTesoreria) {
		this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria = isVisibilidadCeldaNuevoRelacionesParametroTesoreria;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParametroTesoreria() {
		return isVisibilidadCeldaModificarParametroTesoreria;
	}

	public void setIsVisibilidadCeldaModificarParametroTesoreria(Boolean isVisibilidadCeldaModificarParametroTesoreria) {
		this.isVisibilidadCeldaModificarParametroTesoreria = isVisibilidadCeldaModificarParametroTesoreria;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParametroTesoreria() {
		return isVisibilidadCeldaActualizarParametroTesoreria;
	}

	public void setIsVisibilidadCeldaActualizarParametroTesoreria(Boolean isVisibilidadCeldaActualizarParametroTesoreria) {
		this.isVisibilidadCeldaActualizarParametroTesoreria = isVisibilidadCeldaActualizarParametroTesoreria;
	}

	public Boolean getIsVisibilidadCeldaEliminarParametroTesoreria() {
		return isVisibilidadCeldaEliminarParametroTesoreria;
	}

	public void setIsVisibilidadCeldaEliminarParametroTesoreria(Boolean isVisibilidadCeldaEliminarParametroTesoreria) {
		this.isVisibilidadCeldaEliminarParametroTesoreria = isVisibilidadCeldaEliminarParametroTesoreria;
	}

	public Boolean getIsVisibilidadCeldaCancelarParametroTesoreria() {
		return isVisibilidadCeldaCancelarParametroTesoreria;
	}

	public void setIsVisibilidadCeldaCancelarParametroTesoreria(Boolean isVisibilidadCeldaCancelarParametroTesoreria) {
		this.isVisibilidadCeldaCancelarParametroTesoreria = isVisibilidadCeldaCancelarParametroTesoreria;
	}

	public Boolean getIsVisibilidadCeldaGuardarParametroTesoreria() {
		return isVisibilidadCeldaGuardarParametroTesoreria;
	}

	public void setIsVisibilidadCeldaGuardarParametroTesoreria(Boolean isVisibilidadCeldaGuardarParametroTesoreria) {
		this.isVisibilidadCeldaGuardarParametroTesoreria = isVisibilidadCeldaGuardarParametroTesoreria;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParametroTesoreria() {
		return isVisibilidadCeldaGuardarCambiosParametroTesoreria;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParametroTesoreria(Boolean isVisibilidadCeldaGuardarCambiosParametroTesoreria) {
		this.isVisibilidadCeldaGuardarCambiosParametroTesoreria = isVisibilidadCeldaGuardarCambiosParametroTesoreria;
	}
		
	public ParametroTesoreriaSessionBean getparametrotesoreriaSessionBean() {
		return this.parametrotesoreriaSessionBean;
	}
	
	public void setparametrotesoreriaSessionBean(ParametroTesoreriaSessionBean parametrotesoreriaSessionBean) {
		this.parametrotesoreriaSessionBean=parametrotesoreriaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTransaccionCobrarCredito() {
		return this.isVisibilidadFK_IdTransaccionCobrarCredito;
	}

	public void setisVisibilidadFK_IdTransaccionCobrarCredito(Boolean isVisibilidadFK_IdTransaccionCobrarCredito) {
		this.isVisibilidadFK_IdTransaccionCobrarCredito=isVisibilidadFK_IdTransaccionCobrarCredito;
	}

	public Boolean getisVisibilidadFK_IdTransaccionCobrarDebito() {
		return this.isVisibilidadFK_IdTransaccionCobrarDebito;
	}

	public void setisVisibilidadFK_IdTransaccionCobrarDebito(Boolean isVisibilidadFK_IdTransaccionCobrarDebito) {
		this.isVisibilidadFK_IdTransaccionCobrarDebito=isVisibilidadFK_IdTransaccionCobrarDebito;
	}

	public Boolean getisVisibilidadFK_IdTransaccionCobrarPago() {
		return this.isVisibilidadFK_IdTransaccionCobrarPago;
	}

	public void setisVisibilidadFK_IdTransaccionCobrarPago(Boolean isVisibilidadFK_IdTransaccionCobrarPago) {
		this.isVisibilidadFK_IdTransaccionCobrarPago=isVisibilidadFK_IdTransaccionCobrarPago;
	}

	public Boolean getisVisibilidadFK_IdTransaccionPagarCredito() {
		return this.isVisibilidadFK_IdTransaccionPagarCredito;
	}

	public void setisVisibilidadFK_IdTransaccionPagarCredito(Boolean isVisibilidadFK_IdTransaccionPagarCredito) {
		this.isVisibilidadFK_IdTransaccionPagarCredito=isVisibilidadFK_IdTransaccionPagarCredito;
	}

	public Boolean getisVisibilidadFK_IdTransaccionPagarDebito() {
		return this.isVisibilidadFK_IdTransaccionPagarDebito;
	}

	public void setisVisibilidadFK_IdTransaccionPagarDebito(Boolean isVisibilidadFK_IdTransaccionPagarDebito) {
		this.isVisibilidadFK_IdTransaccionPagarDebito=isVisibilidadFK_IdTransaccionPagarDebito;
	}

	public Boolean getisVisibilidadFK_IdTransaccionPagarPago() {
		return this.isVisibilidadFK_IdTransaccionPagarPago;
	}

	public void setisVisibilidadFK_IdTransaccionPagarPago(Boolean isVisibilidadFK_IdTransaccionPagarPago) {
		this.isVisibilidadFK_IdTransaccionPagarPago=isVisibilidadFK_IdTransaccionPagarPago;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(ParametroTesoreria parametrotesoreria)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(parametrotesoreria,null);
				this.setActualParaGuardarTransaccionCobrarPagoForeignKey(parametrotesoreria,null);
				this.setActualParaGuardarTransaccionCobrarDebitoForeignKey(parametrotesoreria,null);
				this.setActualParaGuardarTransaccionCobrarCreditoForeignKey(parametrotesoreria,null);
				this.setActualParaGuardarTransaccionPagarPagoForeignKey(parametrotesoreria,null);
				this.setActualParaGuardarTransaccionPagarDebitoForeignKey(parametrotesoreria,null);
				this.setActualParaGuardarTransaccionPagarCreditoForeignKey(parametrotesoreria,null);
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
	
	public void bugActualizarReferenciaActual(ParametroTesoreria parametrotesoreria,ParametroTesoreria parametrotesoreriaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParametroTesoreria(parametrotesoreria);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parametrotesoreriaAux.setId(parametrotesoreria.getId());
		parametrotesoreriaAux.setVersionRow(parametrotesoreria.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParametroTesoreria();
		
			int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParametroTesoreria(this.parametrotesoreria,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parametrotesoreriaValidator.getInvalidValues(this.parametrotesoreria);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parametrotesoreriaLogic.setDatosCliente(datosCliente);
			parametrotesoreriaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parametrotesoreriaAux=new  ParametroTesoreria();
				
				parametrotesoreriaAux.setIsNew(true);
				parametrotesoreriaAux.setIsChanged(true);
				
				parametrotesoreriaAux.setParametroTesoreriaOriginal(this.parametrotesoreria);
				
				parametrotesoreriaAux.setId(this.parametrotesoreria.getId());	
				parametrotesoreriaAux.setVersionRow(this.parametrotesoreria.getVersionRow());	
				parametrotesoreriaAux.setid_empresa(this.parametrotesoreria.getid_empresa());	
				parametrotesoreriaAux.setcon_anticipo_orden_compra(this.parametrotesoreria.getcon_anticipo_orden_compra());	
				parametrotesoreriaAux.setpor_lotes(this.parametrotesoreria.getpor_lotes());	
				parametrotesoreriaAux.setid_transaccion_cobrar_pago(this.parametrotesoreria.getid_transaccion_cobrar_pago());	
				parametrotesoreriaAux.setid_transaccion_cobrar_debito(this.parametrotesoreria.getid_transaccion_cobrar_debito());	
				parametrotesoreriaAux.setid_transaccion_cobrar_credito(this.parametrotesoreria.getid_transaccion_cobrar_credito());	
				parametrotesoreriaAux.setid_transaccion_pagar_pago(this.parametrotesoreria.getid_transaccion_pagar_pago());	
				parametrotesoreriaAux.setid_transaccion_pagar_debito(this.parametrotesoreria.getid_transaccion_pagar_debito());	
				parametrotesoreriaAux.setid_transaccion_pagar_credito(this.parametrotesoreria.getid_transaccion_pagar_credito());	
				parametrotesoreriaAux.setdescripcion(this.parametrotesoreria.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrotesoreriaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrotesoreriaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parametrotesoreriaAux,parametrotesoreriaLogic.getParametroTesorerias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrotesoreriaAux,parametrotesorerias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parametrotesoreriaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrotesoreriaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriaLogic.saveParametroTesorerias();//WithConnection
						//parametrotesoreriaLogic.getSetVersionRowParametroTesorerias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrotesoreria,parametrotesoreriaAux);
					
					this.refrescarForeignKeysDescripcionesParametroTesoreria();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrotesoreriaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrotesoreriaLogic.saveParametroTesoreriaRelaciones(parametrotesoreriaAux);//WithConnection
								//parametrotesoreriaLogic.getSetVersionRowParametroTesorerias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametrotesoreria,parametrotesoreriaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametrotesoreriaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametrotesoreriaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametrotesoreriaAux,parametrotesoreriaLogic.getParametroTesorerias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametrotesoreriaAux,parametrotesorerias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametrotesoreria,parametrotesoreriaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parametrotesoreriaAux=new  ParametroTesoreria();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado() 
					|| (this.parametrotesoreriaSessionBean.getEsGuardarRelacionado() && this.parametrotesoreria.getId()>=0)) {
						
					parametrotesoreriaAux.setIsNew(false);
				}
				
				parametrotesoreriaAux.setIsDeleted(false);
			
				parametrotesoreriaAux.setId(this.parametrotesoreria.getId());	
				parametrotesoreriaAux.setVersionRow(this.parametrotesoreria.getVersionRow());	
				parametrotesoreriaAux.setid_empresa(this.parametrotesoreria.getid_empresa());	
				parametrotesoreriaAux.setcon_anticipo_orden_compra(this.parametrotesoreria.getcon_anticipo_orden_compra());	
				parametrotesoreriaAux.setpor_lotes(this.parametrotesoreria.getpor_lotes());	
				parametrotesoreriaAux.setid_transaccion_cobrar_pago(this.parametrotesoreria.getid_transaccion_cobrar_pago());	
				parametrotesoreriaAux.setid_transaccion_cobrar_debito(this.parametrotesoreria.getid_transaccion_cobrar_debito());	
				parametrotesoreriaAux.setid_transaccion_cobrar_credito(this.parametrotesoreria.getid_transaccion_cobrar_credito());	
				parametrotesoreriaAux.setid_transaccion_pagar_pago(this.parametrotesoreria.getid_transaccion_pagar_pago());	
				parametrotesoreriaAux.setid_transaccion_pagar_debito(this.parametrotesoreria.getid_transaccion_pagar_debito());	
				parametrotesoreriaAux.setid_transaccion_pagar_credito(this.parametrotesoreria.getid_transaccion_pagar_credito());	
				parametrotesoreriaAux.setdescripcion(this.parametrotesoreria.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrotesoreriaAux,parametrotesoreriaLogic.getParametroTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrotesoreriaAux,parametrotesorerias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parametrotesoreriaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrotesoreriaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriaLogic.saveParametroTesorerias();//WithConnection
						//parametrotesoreriaLogic.getSetVersionRowParametroTesorerias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrotesoreria,parametrotesoreriaAux);
					
					this.refrescarForeignKeysDescripcionesParametroTesoreria();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrotesoreriaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrotesoreriaLogic.saveParametroTesoreriaRelaciones(parametrotesoreriaAux);//WithConnection
								//parametrotesoreriaLogic.getSetVersionRowParametroTesorerias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametrotesoreria,parametrotesoreriaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametrotesoreriaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametrotesoreriaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametrotesoreriaAux,parametrotesoreriaLogic.getParametroTesorerias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametrotesoreriaAux,parametrotesorerias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametrotesoreria,parametrotesoreriaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parametrotesoreriaAux=new  ParametroTesoreria();
				
				parametrotesoreriaAux.setIsNew(false);
				parametrotesoreriaAux.setIsChanged(false);
				
				parametrotesoreriaAux.setIsDeleted(true);
				
				parametrotesoreriaAux.setId(this.parametrotesoreria.getId());	
				parametrotesoreriaAux.setVersionRow(this.parametrotesoreria.getVersionRow());	
				parametrotesoreriaAux.setid_empresa(this.parametrotesoreria.getid_empresa());	
				parametrotesoreriaAux.setcon_anticipo_orden_compra(this.parametrotesoreria.getcon_anticipo_orden_compra());	
				parametrotesoreriaAux.setpor_lotes(this.parametrotesoreria.getpor_lotes());	
				parametrotesoreriaAux.setid_transaccion_cobrar_pago(this.parametrotesoreria.getid_transaccion_cobrar_pago());	
				parametrotesoreriaAux.setid_transaccion_cobrar_debito(this.parametrotesoreria.getid_transaccion_cobrar_debito());	
				parametrotesoreriaAux.setid_transaccion_cobrar_credito(this.parametrotesoreria.getid_transaccion_cobrar_credito());	
				parametrotesoreriaAux.setid_transaccion_pagar_pago(this.parametrotesoreria.getid_transaccion_pagar_pago());	
				parametrotesoreriaAux.setid_transaccion_pagar_debito(this.parametrotesoreria.getid_transaccion_pagar_debito());	
				parametrotesoreriaAux.setid_transaccion_pagar_credito(this.parametrotesoreria.getid_transaccion_pagar_credito());	
				parametrotesoreriaAux.setdescripcion(this.parametrotesoreria.getdescripcion());	
				
				if(this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parametrotesoreriaAux.getId()>=0) {	
						this.parametrotesoreriasEliminados.add(parametrotesoreriaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parametrotesoreriaAux,parametrotesoreriaLogic.getParametroTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrotesoreriaAux,parametrotesorerias);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parametrotesoreriaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrotesoreriaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriaLogic.saveParametroTesorerias();//WithConnection
						//parametrotesoreriaLogic.getSetVersionRowParametroTesorerias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrotesoreriaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrotesoreriaLogic.saveParametroTesoreriaRelaciones(parametrotesoreriaAux);//WithConnection
								//parametrotesoreriaLogic.getSetVersionRowParametroTesorerias();//WithConnection
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
							if(this.parametrotesoreriaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.parametrotesoreriaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(parametrotesoreriaAux,parametrotesoreriaLogic.getParametroTesorerias());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(parametrotesoreriaAux,parametrotesorerias);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.getParametroTesorerias().addAll(this.parametrotesoreriasEliminados);
					
					parametrotesoreriaLogic.saveParametroTesorerias();//WithConnection
					//parametrotesoreriaLogic.getSetVersionRowParametroTesorerias();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesParametroTesoreria();
				
				this.parametrotesoreriasEliminados= new ArrayList<ParametroTesoreria>();		
			}
			
			if(this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parametro Tesoreria GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Tesoreria",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parametrotesoreria=parametrotesoreriaAux;
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
      		//this.finishProcessParametroTesoreria();
      	}
		
	}	
	
	public void actualizarRelaciones(ParametroTesoreria parametrotesoreriaLocal) throws Exception {
		
		if(this.parametrotesoreriaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ParametroTesoreria parametrotesoreriaLocal) throws Exception {	
		if(this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				parametrotesoreriaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccioncobrarpagoBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccioncobrarpagoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccioncobrarpagoBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccioncobrarpagoBeanSwingJInternalFrameLocal.actualizarLista(transaccioncobrarpagoBeanSwingJInternalFrameLocal.transaccion,this.transaccioncobrarpagosForeignKey);

				transaccioncobrarpagoBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccioncobrarpagoBeanSwingJInternalFrameLocal.transaccion);

				parametrotesoreriaLocal.setTransaccionCobrarPago(transaccioncobrarpagoBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccionCobrarPago();
				this.cargarCombosFrameTransaccionCobrarPagosForeignKey("Formulario");
				this.setActualTransaccionCobrarPagoForeignKey(transaccioncobrarpagoBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccioncobrardebitoBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccioncobrardebitoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccioncobrardebitoBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccioncobrardebitoBeanSwingJInternalFrameLocal.actualizarLista(transaccioncobrardebitoBeanSwingJInternalFrameLocal.transaccion,this.transaccioncobrardebitosForeignKey);

				transaccioncobrardebitoBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccioncobrardebitoBeanSwingJInternalFrameLocal.transaccion);

				parametrotesoreriaLocal.setTransaccionCobrarDebito(transaccioncobrardebitoBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccionCobrarDebito();
				this.cargarCombosFrameTransaccionCobrarDebitosForeignKey("Formulario");
				this.setActualTransaccionCobrarDebitoForeignKey(transaccioncobrardebitoBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccioncobrarcreditoBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccioncobrarcreditoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccioncobrarcreditoBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccioncobrarcreditoBeanSwingJInternalFrameLocal.actualizarLista(transaccioncobrarcreditoBeanSwingJInternalFrameLocal.transaccion,this.transaccioncobrarcreditosForeignKey);

				transaccioncobrarcreditoBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccioncobrarcreditoBeanSwingJInternalFrameLocal.transaccion);

				parametrotesoreriaLocal.setTransaccionCobrarCredito(transaccioncobrarcreditoBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccionCobrarCredito();
				this.cargarCombosFrameTransaccionCobrarCreditosForeignKey("Formulario");
				this.setActualTransaccionCobrarCreditoForeignKey(transaccioncobrarcreditoBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionpagarpagoBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionpagarpagoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionpagarpagoBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionpagarpagoBeanSwingJInternalFrameLocal.actualizarLista(transaccionpagarpagoBeanSwingJInternalFrameLocal.transaccion,this.transaccionpagarpagosForeignKey);

				transaccionpagarpagoBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionpagarpagoBeanSwingJInternalFrameLocal.transaccion);

				parametrotesoreriaLocal.setTransaccionPagarPago(transaccionpagarpagoBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccionPagarPago();
				this.cargarCombosFrameTransaccionPagarPagosForeignKey("Formulario");
				this.setActualTransaccionPagarPagoForeignKey(transaccionpagarpagoBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionpagardebitoBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionpagardebitoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionpagardebitoBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionpagardebitoBeanSwingJInternalFrameLocal.actualizarLista(transaccionpagardebitoBeanSwingJInternalFrameLocal.transaccion,this.transaccionpagardebitosForeignKey);

				transaccionpagardebitoBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionpagardebitoBeanSwingJInternalFrameLocal.transaccion);

				parametrotesoreriaLocal.setTransaccionPagarDebito(transaccionpagardebitoBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccionPagarDebito();
				this.cargarCombosFrameTransaccionPagarDebitosForeignKey("Formulario");
				this.setActualTransaccionPagarDebitoForeignKey(transaccionpagardebitoBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionpagarcreditoBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionpagarcreditoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionpagarcreditoBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionpagarcreditoBeanSwingJInternalFrameLocal.actualizarLista(transaccionpagarcreditoBeanSwingJInternalFrameLocal.transaccion,this.transaccionpagarcreditosForeignKey);

				transaccionpagarcreditoBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionpagarcreditoBeanSwingJInternalFrameLocal.transaccion);

				parametrotesoreriaLocal.setTransaccionPagarCredito(transaccionpagarcreditoBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccionPagarCredito();
				this.cargarCombosFrameTransaccionPagarCreditosForeignKey("Formulario");
				this.setActualTransaccionPagarCreditoForeignKey(transaccionpagarcreditoBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarParametroTesoreriaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parametrotesoreriaValidator.getInvalidValues(this.parametrotesoreria);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ParametroTesoreria parametrotesoreria,List<ParametroTesoreria> parametrotesorerias) throws Exception {
		try	{		
			ParametroTesoreriaConstantesFunciones.actualizarLista(parametrotesoreria,parametrotesorerias,this.parametrotesoreriaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParametroTesoreria parametrotesoreria,List<ParametroTesoreria> parametrotesorerias) throws Exception {
		try	{			
			ParametroTesoreriaConstantesFunciones.actualizarSelectedLista(parametrotesoreria,parametrotesorerias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParametroTesoreria> parametrotesoreriasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parametrotesoreriasLocal=this.parametrotesoreriaLogic.getParametroTesorerias();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parametrotesoreriasLocal=this.parametrotesorerias;
			}
			//ARCHITECTURE
		
			for(ParametroTesoreria parametrotesoreriaLocal:parametrotesoreriasLocal) {
				if(this.permiteMantenimiento(parametrotesoreriaLocal) && parametrotesoreriaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParametroTesoreriaConstantesFunciones.getParametroTesoreriaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParametroTesoreriaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroTesoreria.jLabelid_empresaParametroTesoreria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroTesoreriaConstantesFunciones.CONANTICIPOORDENCOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroTesoreria.jLabelcon_anticipo_orden_compraParametroTesoreria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroTesoreriaConstantesFunciones.PORLOTES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroTesoreria.jLabelpor_lotesParametroTesoreria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroTesoreriaConstantesFunciones.IDTRANSACCIONCOBRARPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroTesoreria.jLabelid_transaccion_cobrar_pagoParametroTesoreria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroTesoreriaConstantesFunciones.IDTRANSACCIONCOBRARDEBITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroTesoreria.jLabelid_transaccion_cobrar_debitoParametroTesoreria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroTesoreriaConstantesFunciones.IDTRANSACCIONCOBRARCREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroTesoreria.jLabelid_transaccion_cobrar_creditoParametroTesoreria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroTesoreriaConstantesFunciones.IDTRANSACCIONPAGARPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroTesoreria.jLabelid_transaccion_pagar_pagoParametroTesoreria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroTesoreriaConstantesFunciones.IDTRANSACCIONPAGARDEBITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroTesoreria.jLabelid_transaccion_pagar_debitoParametroTesoreria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroTesoreriaConstantesFunciones.IDTRANSACCIONPAGARCREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroTesoreria.jLabelid_transaccion_pagar_creditoParametroTesoreria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroTesoreriaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroTesoreria.jLabeldescripcionParametroTesoreria,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroTesoreria.jLabelid_empresaParametroTesoreria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroTesoreria.jLabelcon_anticipo_orden_compraParametroTesoreria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroTesoreria.jLabelpor_lotesParametroTesoreria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroTesoreria.jLabelid_transaccion_cobrar_pagoParametroTesoreria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroTesoreria.jLabelid_transaccion_cobrar_debitoParametroTesoreria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroTesoreria.jLabelid_transaccion_cobrar_creditoParametroTesoreria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroTesoreria.jLabelid_transaccion_pagar_pagoParametroTesoreria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroTesoreria.jLabelid_transaccion_pagar_debitoParametroTesoreria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroTesoreria.jLabelid_transaccion_pagar_creditoParametroTesoreria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroTesoreria.jLabeldescripcionParametroTesoreria,"");
		
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
		this.iIdNuevoParametroTesoreria--;	
		
		
		this.parametrotesoreriaAux=new ParametroTesoreria();
		
		this.parametrotesoreriaAux.setId(this.iIdNuevoParametroTesoreria);
		this.parametrotesoreriaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrotesoreriaLogic.getParametroTesorerias().add(this.parametrotesoreriaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parametrotesorerias.add(this.parametrotesoreriaAux);
		}
		//ARCHITECTURE
		
		this.parametrotesoreria=this.parametrotesoreriaAux;
		
		if(ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParametroTesoreria(this.parametrotesoreria);
			this.setVariablesObjetoActualToFormularioForeignKeyParametroTesoreria(this.parametrotesoreria);
		}
				
		//this.setDefaultControlesParametroTesoreria();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParametroTesoreria();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParametroTesoreria();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroTesoreria();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroTesoreria(this.parametrotesoreriaBean,this.parametrotesoreria,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parametrotesoreriaSessionBean.getConGuardarRelaciones()) {
			classes=ParametroTesoreriaConstantesFunciones.getClassesRelationshipsOfParametroTesoreria(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parametrotesoreriaReturnGeneral=parametrotesoreriaLogic.procesarEventosParametroTesoreriasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrotesoreriaLogic.getParametroTesorerias(),this.parametrotesoreria,this.parametrotesoreriaParameterGeneral,this.isEsNuevoParametroTesoreria,classes);//this.parametrotesoreriaLogic.getParametroTesoreria()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParametroTesoreria(this.parametrotesoreriaReturnGeneral,this.parametrotesoreriaBean,false);
		
		if(this.parametrotesoreriaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParametroTesoreria(this.parametrotesoreriaReturnGeneral.getParametroTesoreria());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParametroTesoreria(this.parametrotesoreriaReturnGeneral.getParametroTesoreria());
		}
		
		if(this.parametrotesoreriaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParametroTesoreria(this.parametrotesoreriaReturnGeneral.getParametroTesoreria(),classes);//this.parametrotesoreriaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParametroTesoreria(this.parametrotesoreria,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParametroTesoreria();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParametroTesoreria();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.RecargarFormParametroTesoreria(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParametroTesoreria(false);
						
			if(parametrotesoreriaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroTesoreria();
			}
			
			this.actualizarVisualTableDatosParametroTesoreria();
			
			this.jTableDatosParametroTesoreria.setRowSelectionInterval(this.getIndiceNuevoParametroTesoreria(), this.getIndiceNuevoParametroTesoreria());
			
			this.seleccionarFilaTablaParametroTesoreriaActual();
						
			this.actualizarEstadoCeldasBotonesParametroTesoreria("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParametroTesoreria(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxcon_anticipo_orden_compraParametroTesoreria.setEnabled(isHabilitar && this.parametrotesoreriaConstantesFunciones.activarcon_anticipo_orden_compraParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxpor_lotesParametroTesoreria.setEnabled(isHabilitar && this.parametrotesoreriaConstantesFunciones.activarpor_lotesParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jTextAreadescripcionParametroTesoreria.setEnabled(isHabilitar && this.parametrotesoreriaConstantesFunciones.activardescripcionParametroTesoreria);	
		//
		this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_empresaParametroTesoreria.setEnabled(isHabilitar && this.parametrotesoreriaConstantesFunciones.activarid_empresaParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.setEnabled(isHabilitar && this.parametrotesoreriaConstantesFunciones.activarid_transaccion_cobrar_pagoParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.setEnabled(isHabilitar && this.parametrotesoreriaConstantesFunciones.activarid_transaccion_cobrar_debitoParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.setEnabled(isHabilitar && this.parametrotesoreriaConstantesFunciones.activarid_transaccion_cobrar_creditoParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_pagoParametroTesoreria.setEnabled(isHabilitar && this.parametrotesoreriaConstantesFunciones.activarid_transaccion_pagar_pagoParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_debitoParametroTesoreria.setEnabled(isHabilitar && this.parametrotesoreriaConstantesFunciones.activarid_transaccion_pagar_debitoParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_creditoParametroTesoreria.setEnabled(isHabilitar && this.parametrotesoreriaConstantesFunciones.activarid_transaccion_pagar_creditoParametroTesoreria);
	};
	
	public void setDefaultControlesParametroTesoreria() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParametroTesoreria(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parametrotesoreriaSessionBean.setConGuardarRelaciones(true);			
			this.parametrotesoreriaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParametroTesoreria.jTabbedPaneRelacionesParametroTesoreria.setVisible(true);
			
					
		} else {
			//this.parametrotesoreriaSessionBean.setConGuardarRelaciones(false);			
			this.parametrotesoreriaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParametroTesoreria.jTabbedPaneRelacionesParametroTesoreria.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoParametroTesoreria() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroTesoreria parametrotesoreriaAux:this.parametrotesoreriaLogic.getParametroTesorerias()) {
				if(parametrotesoreriaAux.getId().equals(this.iIdNuevoParametroTesoreria)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroTesoreria parametrotesoreriaAux:this.parametrotesorerias) {
				if(parametrotesoreriaAux.getId().equals(this.iIdNuevoParametroTesoreria)) {
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
	
	public int getIndiceActualParametroTesoreria(ParametroTesoreria parametrotesoreria,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroTesoreria parametrotesoreriaAux:this.parametrotesoreriaLogic.getParametroTesorerias()) {
				if(parametrotesoreriaAux.getId().equals(parametrotesoreria.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroTesoreria parametrotesoreriaAux:this.parametrotesorerias) {
				if(parametrotesoreriaAux.getId().equals(parametrotesoreria.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParametroTesoreria(ParametroTesoreria parametrotesoreriaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroTesoreria parametrotesoreriaAux:this.parametrotesoreriaLogic.getParametroTesorerias()) {
				if(parametrotesoreriaAux.getParametroTesoreriaOriginal().getId().equals(parametrotesoreriaOriginal.getId())) {
					existe=true;
					parametrotesoreriaOriginal.setId(parametrotesoreriaAux.getId());
					parametrotesoreriaOriginal.setVersionRow(parametrotesoreriaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroTesoreria parametrotesoreriaAux:this.parametrotesorerias) {
				if(parametrotesoreriaAux.getParametroTesoreriaOriginal().getId().equals(parametrotesoreriaOriginal.getId())) {
					existe=true;
					parametrotesoreriaOriginal.setId(parametrotesoreriaAux.getId());
					parametrotesoreriaOriginal.setVersionRow(parametrotesoreriaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParametroTesoreria(Boolean esParaCancelar) throws Exception {
		parametrotesoreriasAux=new ArrayList<ParametroTesoreria>();
		parametrotesoreriaAux=new ParametroTesoreria();
		
		if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroTesoreria parametrotesoreriaAux:this.parametrotesoreriaLogic.getParametroTesorerias()) {
					if(parametrotesoreriaAux.getId()<0) {
						parametrotesoreriasAux.add(parametrotesoreriaAux);
					}		
				}
				this.iIdNuevoParametroTesoreria=0L;
				this.parametrotesoreriaLogic.getParametroTesorerias().removeAll(parametrotesoreriasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroTesoreria parametrotesoreriaAux:this.parametrotesorerias) {
					if(parametrotesoreriaAux.getId()<0) {
						parametrotesoreriasAux.add(parametrotesoreriaAux);
					}		
				}
				this.iIdNuevoParametroTesoreria=0L;
				this.parametrotesorerias.removeAll(parametrotesoreriasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParametroTesoreria 
					&& this.parametrotesoreriaLogic.getParametroTesorerias().size()>0
					) {
					parametrotesoreriaAux=this.parametrotesoreriaLogic.getParametroTesorerias().get(this.parametrotesoreriaLogic.getParametroTesorerias().size() - 1);
				
					if(parametrotesoreriaAux.getId()<0) {
						this.parametrotesoreriaLogic.getParametroTesorerias().remove(parametrotesoreriaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParametroTesoreria && this.parametrotesorerias.size()>0) {
					parametrotesoreriaAux=this.parametrotesorerias.get(this.parametrotesorerias.size() - 1);
				
					if(parametrotesoreriaAux.getId()<0) {
						this.parametrotesorerias.remove(parametrotesoreriaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParametroTesoreria(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parametrotesoreria.getId()<0) {
				this.parametrotesoreriaLogic.getParametroTesorerias().remove(this.parametrotesoreria);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parametrotesoreria.getId()<0) {
				this.parametrotesorerias.remove(this.parametrotesoreria);
			}
		}			
	}
	
	public void setEstadosInicialesParametroTesoreria(List<ParametroTesoreria> parametrotesoreriasAux) throws Exception {
		ParametroTesoreriaConstantesFunciones.setEstadosInicialesParametroTesoreria(parametrotesoreriasAux);
	}
	
	public void setEstadosInicialesParametroTesoreria(ParametroTesoreria parametrotesoreriaAux) throws Exception {
		ParametroTesoreriaConstantesFunciones.setEstadosInicialesParametroTesoreria(parametrotesoreriaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParametroTesoreriaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParametroTesoreria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParametroTesoreriaActual()) {
				if(!this.isEsNuevoParametroTesoreria) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParametroTesoreria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParametroTesoreria=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParametroTesoreriaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parametro Tesoreria ?", "MANTENIMIENTO DE Parametro Tesoreria", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParametroTesoreria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ParametroTesoreria parametrotesoreria) throws Exception {
		ParametroTesoreriaConstantesFunciones.seleccionarAsignar(this.parametrotesoreria,parametrotesoreria);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParametroTesoreria=this.isPermisoActualizarOriginalParametroTesoreria;
			
			
			this.seleccionarAsignar(parametrotesoreria);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroTesoreriaConstantesFunciones.quitarEspaciosParametroTesoreria(this.parametrotesoreria,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParametroTesoreria("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parametrotesoreriaSessionBean.setsFuncionBusquedaRapida(this.parametrotesoreriaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoParametroTesoreria) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParametroTesoreria(esParaCancelar);				
				this.cancelarNuevoParametroTesoreria(esParaCancelar);								
			}
			
			this.parametrotesoreria=new ParametroTesoreria();
			
			this.inicializarParametroTesoreria();
			
			this.actualizarEstadoCeldasBotonesParametroTesoreria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParametroTesoreria() throws Exception {
		try {
			ParametroTesoreriaConstantesFunciones.inicializarParametroTesoreria(this.parametrotesoreria);
			
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
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parametrotesoreriaLogic.getParametroTesorerias().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParametroTesorerias(String sAccionBusqueda,List<ParametroTesoreria> parametrotesoreriasParaReportes) throws Exception {
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
					sPathReporteFinal="ParametroTesoreria"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParametroTesoreriaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParametroTesoreriaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ParametroTesoreria"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parametro Tesorerias");		
		parameters.put("busquedapor", ParametroTesoreriaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParametroTesoreria=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParametroTesoreriaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParametroTesoreriaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParametroTesoreria=new JRBeanArrayDataSource(ParametroTesoreriaJInternalFrame.TraerParametroTesoreriaBeans(parametrotesoreriasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParametroTesoreria);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParametroTesoreriaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParametroTesoreriaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParametroTesoreriaBean.TraerParametroTesoreriaBeans(parametrotesoreriasParaReportes).toArray()));
							
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
				this.generarExcelReporteParametroTesorerias(sAccionBusqueda,sTipoArchivoReporte,parametrotesoreriasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParametroTesorerias(sAccionBusqueda,sTipoArchivoReporte,parametrotesoreriasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParametroTesoreriaActionPerformed(null);
					//this.generarExcelReporteParametroTesorerias(sAccionBusqueda,sTipoArchivoReporte,parametrotesoreriasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParametroTesorerias(sAccionBusqueda,sTipoArchivoReporte,parametrotesoreriasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParametroTesorerias(sAccionBusqueda,sTipoArchivoReporte,parametrotesoreriasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParametroTesorerias(sAccionBusqueda,sTipoArchivoReporte,parametrotesoreriasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParametroTesorerias(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroTesoreria> parametrotesoreriasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrotesoreria";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroTesorerias");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroTesoreria("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ParametroTesoreria parametrotesoreria : parametrotesoreriasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParametroTesoreriaConstantesFunciones.generarExcelReporteDataParametroTesoreria("NORMAL",row,workbook,parametrotesoreria,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Tesoreria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParametroTesoreria(String sTipo,Row row,Workbook workbook) {
		
		ParametroTesoreriaConstantesFunciones.generarExcelReporteHeaderParametroTesoreria(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParametroTesorerias(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroTesoreria> parametrotesoreriasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrotesoreria_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroTesorerias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ParametroTesoreria parametrotesoreria : parametrotesoreriasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParametroTesoreriaConstantesFunciones.getParametroTesoreriaDescripcion(parametrotesoreria));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroTesoreriaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrotesoreria.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroTesoreriaConstantesFunciones.LABEL_CONANTICIPOORDENCOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_CONANTICIPOORDENCOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametrotesoreria.getcon_anticipo_orden_compra()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroTesoreriaConstantesFunciones.LABEL_PORLOTES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_PORLOTES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametrotesoreria.getpor_lotes()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrotesoreria.gettransaccioncobrarpago_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARDEBITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARDEBITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrotesoreria.gettransaccioncobrardebito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARCREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARCREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrotesoreria.gettransaccioncobrarcredito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrotesoreria.gettransaccionpagarpago_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARDEBITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARDEBITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrotesoreria.gettransaccionpagardebito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARCREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARCREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrotesoreria.gettransaccionpagarcredito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroTesoreriaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrotesoreria.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Tesoreria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParametroTesorerias(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroTesoreria> parametrotesoreriasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ParametroTesoreria> parametrotesoreriasRespaldo=null;
		
		classes=ParametroTesoreriaConstantesFunciones.getClassesRelationshipsOfParametroTesoreria(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parametrotesoreriaLogic.setDatosCliente(this.datosCliente);
		this.parametrotesoreriaLogic.setDatosDeep(this.datosDeep);
		this.parametrotesoreriaLogic.setIsConDeep(true);
		
		parametrotesoreriasRespaldo=this.parametrotesoreriaLogic.getParametroTesorerias();
		
		this.parametrotesoreriaLogic.setParametroTesorerias(parametrotesoreriasParaReportes);	
		this.parametrotesoreriaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parametrotesoreriasParaReportes=this.parametrotesoreriaLogic.getParametroTesorerias();
		this.parametrotesoreriaLogic.setParametroTesorerias(parametrotesoreriasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrotesoreria_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroTesorerias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroTesoreria("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ParametroTesoreria parametrotesoreria : parametrotesoreriasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParametroTesoreria("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParametroTesoreriaConstantesFunciones.generarExcelReporteDataParametroTesoreria("NORMAL",row,workbook,parametrotesoreria,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ParametroTesoreriaConstantesFunciones.getParametroTesoreriaDescripcion(parametrotesoreria));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Tesoreria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroTesoreria.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroTesoreria.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroTesoreria.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroTesoreria.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParametroTesoreria() throws Exception {		
		this.startProcessParametroTesoreria(true);
	}
	
	public void startProcessParametroTesoreria(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasParametroTesoreria ,this.jPanelParametrosReportesParametroTesoreria, this.jScrollPanelDatosParametroTesoreria,this.jPanelPaginacionParametroTesoreria, this.jScrollPanelDatosEdicionParametroTesoreria, this.jPanelAccionesParametroTesoreria,this.jPanelAccionesFormularioParametroTesoreria,this.jmenuBarParametroTesoreria,this.jmenuBarDetalleParametroTesoreria,this.jTtoolBarParametroTesoreria,this.jTtoolBarDetalleParametroTesoreria);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroTesoreria=this.jTabbedPaneBusquedasParametroTesoreria; 
		
		final JPanel jPanelParametrosReportesParametroTesoreria=this.jPanelParametrosReportesParametroTesoreria;
		//final JScrollPane jScrollPanelDatosParametroTesoreria=this.jScrollPanelDatosParametroTesoreria;
		final JTable jTableDatosParametroTesoreria=this.jTableDatosParametroTesoreria;		
		final JPanel jPanelPaginacionParametroTesoreria=this.jPanelPaginacionParametroTesoreria;
		//final JScrollPane jScrollPanelDatosEdicionParametroTesoreria=this.jScrollPanelDatosEdicionParametroTesoreria;
		final JPanel jPanelAccionesParametroTesoreria=this.jPanelAccionesParametroTesoreria;
		
		JPanel jPanelCamposAuxiliarParametroTesoreria=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParametroTesoreria=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
			jPanelCamposAuxiliarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jPanelCamposParametroTesoreria;
			jPanelAccionesFormularioAuxiliarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jPanelAccionesFormularioParametroTesoreria;
		}
		
		final JPanel jPanelCamposParametroTesoreria=jPanelCamposAuxiliarParametroTesoreria;
		final JPanel jPanelAccionesFormularioParametroTesoreria=jPanelAccionesFormularioAuxiliarParametroTesoreria;
		
		
		final JMenuBar jmenuBarParametroTesoreria=this.jmenuBarParametroTesoreria;
		final JToolBar jTtoolBarParametroTesoreria=this.jTtoolBarParametroTesoreria;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParametroTesoreria=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroTesoreria=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
			jmenuBarDetalleAuxiliarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jmenuBarDetalleParametroTesoreria;
			jTtoolBarDetalleAuxiliarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jTtoolBarDetalleParametroTesoreria;
		}
		
		final JMenuBar jmenuBarDetalleParametroTesoreria=jmenuBarDetalleAuxiliarParametroTesoreria;
		final JToolBar jTtoolBarDetalleParametroTesoreria=jTtoolBarDetalleAuxiliarParametroTesoreria;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroTesoreria;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroTesoreria;
			processRunnable.jTableDatos=jTableDatosParametroTesoreria;
			processRunnable.jPanelCampos=jPanelCamposParametroTesoreria;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroTesoreria;
			processRunnable.jPanelAcciones=jPanelAccionesParametroTesoreria;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroTesoreria;
			
			
			processRunnable.jmenuBar=jmenuBarParametroTesoreria;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroTesoreria;
			processRunnable.jTtoolBar=jTtoolBarParametroTesoreria;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroTesoreria;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroTesoreria ,jPanelParametrosReportesParametroTesoreria,jTableDatosParametroTesoreria, /*jScrollPanelDatosParametroTesoreria,*/jPanelCamposParametroTesoreria,jPanelPaginacionParametroTesoreria, /*jScrollPanelDatosEdicionParametroTesoreria,*/ jPanelAccionesParametroTesoreria,jPanelAccionesFormularioParametroTesoreria,jmenuBarParametroTesoreria,jmenuBarDetalleParametroTesoreria,jTtoolBarParametroTesoreria,jTtoolBarDetalleParametroTesoreria);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroTesoreria ,jPanelParametrosReportesParametroTesoreria, jScrollPanelDatosParametroTesoreria,jPanelPaginacionParametroTesoreria, jScrollPanelDatosEdicionParametroTesoreria, jPanelAccionesParametroTesoreria,jPanelAccionesFormularioParametroTesoreria,jmenuBarParametroTesoreria,jmenuBarDetalleParametroTesoreria,jTtoolBarParametroTesoreria,jTtoolBarDetalleParametroTesoreria);
						
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
	
	public void finishProcessParametroTesoreria() {// throws Exception 
		this.finishProcessParametroTesoreria(true);
	}
	
	public void finishProcessParametroTesoreria(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasParametroTesoreria ,this.jPanelParametrosReportesParametroTesoreria, this.jScrollPanelDatosParametroTesoreria,this.jPanelPaginacionParametroTesoreria, this.jScrollPanelDatosEdicionParametroTesoreria, this.jPanelAccionesParametroTesoreria,this.jPanelAccionesFormularioParametroTesoreria,this.jmenuBarParametroTesoreria,this.jmenuBarDetalleParametroTesoreria,this.jTtoolBarParametroTesoreria,this.jTtoolBarDetalleParametroTesoreria);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroTesoreria=this.jTabbedPaneBusquedasParametroTesoreria; 
		
		final JPanel jPanelParametrosReportesParametroTesoreria=this.jPanelParametrosReportesParametroTesoreria;
		//final JScrollPane jScrollPanelDatosParametroTesoreria=this.jScrollPanelDatosParametroTesoreria;
		final JTable jTableDatosParametroTesoreria=this.jTableDatosParametroTesoreria;		
		final JPanel jPanelPaginacionParametroTesoreria=this.jPanelPaginacionParametroTesoreria;
		//final JScrollPane jScrollPanelDatosEdicionParametroTesoreria=this.jScrollPanelDatosEdicionParametroTesoreria;
		final JPanel jPanelAccionesParametroTesoreria=this.jPanelAccionesParametroTesoreria;
		
		JPanel jPanelCamposAuxiliarParametroTesoreria=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParametroTesoreria=new JPanel();
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
			jPanelCamposAuxiliarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jPanelCamposParametroTesoreria;
			jPanelAccionesFormularioAuxiliarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jPanelAccionesFormularioParametroTesoreria;
		}
		
		final JPanel jPanelCamposParametroTesoreria=jPanelCamposAuxiliarParametroTesoreria;
		final JPanel jPanelAccionesFormularioParametroTesoreria=jPanelAccionesFormularioAuxiliarParametroTesoreria;
		
		
		final JMenuBar jmenuBarParametroTesoreria=this.jmenuBarParametroTesoreria;		
		final JToolBar jTtoolBarParametroTesoreria=this.jTtoolBarParametroTesoreria;
				
		JMenuBar jmenuBarDetalleAuxiliarParametroTesoreria=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroTesoreria=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
			jmenuBarDetalleAuxiliarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jmenuBarDetalleParametroTesoreria;
			jTtoolBarDetalleAuxiliarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jTtoolBarDetalleParametroTesoreria;		
		}
		
		final JMenuBar jmenuBarDetalleParametroTesoreria=jmenuBarDetalleAuxiliarParametroTesoreria;
		final JToolBar jTtoolBarDetalleParametroTesoreria=jTtoolBarDetalleAuxiliarParametroTesoreria;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroTesoreria;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroTesoreria;
			processRunnable.jTableDatos=jTableDatosParametroTesoreria;
			processRunnable.jPanelCampos=jPanelCamposParametroTesoreria;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroTesoreria;
			processRunnable.jPanelAcciones=jPanelAccionesParametroTesoreria;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroTesoreria;
			
			
			processRunnable.jmenuBar=jmenuBarParametroTesoreria;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroTesoreria;
			processRunnable.jTtoolBar=jTtoolBarParametroTesoreria;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroTesoreria;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParametroTesoreria ,jPanelParametrosReportesParametroTesoreria, jTableDatosParametroTesoreria,/*jScrollPanelDatosParametroTesoreria,*/jPanelCamposParametroTesoreria,jPanelPaginacionParametroTesoreria, /*jScrollPanelDatosEdicionParametroTesoreria,*/ jPanelAccionesParametroTesoreria,jPanelAccionesFormularioParametroTesoreria,jmenuBarParametroTesoreria,jmenuBarDetalleParametroTesoreria,jTtoolBarParametroTesoreria,jTtoolBarDetalleParametroTesoreria));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParametroTesoreria(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParametroTesoreria(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParametroTesoreria(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParametroTesoreria(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParametroTesoreria,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParametroTesoreria,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParametroTesoreria(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParametroTesoreria,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParametroTesoreria,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parametrotesoreriaConstantesFunciones.getsFinalQueryParametroTesoreria();
		String  finalQueryPaginacionTodos=this.parametrotesoreriaConstantesFunciones.getsFinalQueryParametroTesoreria();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParametroTesoreriaConstantesFunciones.getArrayColumnasGlobalesNoParametroTesoreria(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParametroTesoreriaConstantesFunciones.getArrayColumnasGlobalesParametroTesoreria(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParametroTesoreriaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parametrotesoreriasEliminados= new ArrayList<ParametroTesoreria>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParametroTesoreria();
		
				///*ParametroTesoreriaSessionBean*/this.parametrotesoreriaSessionBean=new ParametroTesoreriaSessionBean();
			
			if(this.parametrotesoreriaSessionBean==null) {
				this.parametrotesoreriaSessionBean=new ParametroTesoreriaSessionBean();
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
					this.iNumeroPaginacion=ParametroTesoreriaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParametroTesoreriaConstantesFunciones.getClassesForeignKeysOfParametroTesoreria(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parametrotesoreria."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parametrotesoreriasAux= new ArrayList<ParametroTesoreria>();
			
				
			parametrotesoreriaLogic.setDatosCliente(this.datosCliente);
			parametrotesoreriaLogic.setDatosDeep(this.datosDeep);
			parametrotesoreriaLogic.setIsConDeep(true);
			
			
			parametrotesoreriaLogic.getParametroTesoreriaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parametrotesoreriaLogic.getTodosParametroTesorerias(finalQueryGlobal,pagination);
					
					//parametrotesoreriaLogic.getTodosParametroTesoreriasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parametrotesoreriaLogic.getParametroTesorerias()==null|| parametrotesoreriaLogic.getParametroTesorerias().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrotesoreriasAux= new ArrayList<ParametroTesoreria>();
							parametrotesoreriasAux.addAll(parametrotesoreriaLogic.getParametroTesorerias());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesoreriasAux= new ArrayList<ParametroTesoreria>();
							parametrotesoreriasAux.addAll(parametrotesorerias);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrotesoreriaLogic.getTodosParametroTesorerias(finalQueryGlobal+"",this.pagination);												
							
							//parametrotesoreriaLogic.getTodosParametroTesoreriasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParametroTesorerias("Todos",parametrotesoreriaLogic.getParametroTesorerias() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrotesoreriaLogic.setParametroTesorerias(new ArrayList<ParametroTesoreria>());					
							parametrotesoreriaLogic.getParametroTesorerias().addAll(parametrotesoreriasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesorerias=new ArrayList<ParametroTesoreria>();
							parametrotesorerias.addAll(parametrotesoreriasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParametroTesoreria=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParametroTesoreria=this.idActual;
				
				} else if(this.idParametroTesoreriaActual!=null && this.idParametroTesoreriaActual!=0L) {
					idParametroTesoreria=idParametroTesoreriaActual;
				}
				
					
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndicePorId(idParametroTesoreria);
				
				this.parametrotesorerias=new ArrayList<ParametroTesoreria>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parametrotesoreriaLogic.getEntity(idParametroTesoreria);
					
					//parametrotesoreriaLogic.getEntityWithConnection(idParametroTesoreria);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrotesoreriaLogic.setParametroTesorerias(new ArrayList<ParametroTesoreria>());
					parametrotesoreriaLogic.getParametroTesorerias().add(parametrotesoreriaLogic.getParametroTesoreria());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrotesorerias=new ArrayList<ParametroTesoreria>();
					this.parametrotesorerias.add(parametrotesoreria);
				}
				
				if(parametrotesoreriaLogic.getParametroTesoreria()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrotesoreriaLogic.getParametroTesoreriasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrotesoreriaLogic.getParametroTesorerias()==null||parametrotesoreriaLogic.getParametroTesorerias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrotesorerias==null|| parametrotesorerias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriasAux=new ArrayList<ParametroTesoreria>();
						parametrotesoreriasAux.addAll(parametrotesoreriaLogic.getParametroTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesoreriasAux=new ArrayList<ParametroTesoreria>();
							parametrotesoreriasAux.addAll(parametrotesorerias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrotesoreriaLogic.getParametroTesoreriasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroTesorerias("FK_IdEmpresa",parametrotesoreriaLogic.getParametroTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroTesorerias("FK_IdEmpresa",parametrotesorerias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriaLogic.setParametroTesorerias(new ArrayList<ParametroTesoreria>());
						parametrotesoreriaLogic.getParametroTesorerias().addAll(parametrotesoreriasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesorerias=new ArrayList<ParametroTesoreria>();
							parametrotesorerias.addAll(parametrotesoreriasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTransaccionCobrarCredito")) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionCobrarCredito(id_transaccion_cobrar_creditoFK_IdTransaccionCobrarCredito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrotesoreriaLogic.getParametroTesoreriasFK_IdTransaccionCobrarCredito(finalQueryGlobal,pagination,id_transaccion_cobrar_creditoFK_IdTransaccionCobrarCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionCobrarCredito(id_transaccion_cobrar_creditoFK_IdTransaccionCobrarCredito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionCobrarCredito(id_transaccion_cobrar_creditoFK_IdTransaccionCobrarCredito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrotesoreriaLogic.getParametroTesorerias()==null||parametrotesoreriaLogic.getParametroTesorerias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrotesorerias==null|| parametrotesorerias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriasAux=new ArrayList<ParametroTesoreria>();
						parametrotesoreriasAux.addAll(parametrotesoreriaLogic.getParametroTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesoreriasAux=new ArrayList<ParametroTesoreria>();
							parametrotesoreriasAux.addAll(parametrotesorerias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrotesoreriaLogic.getParametroTesoreriasFK_IdTransaccionCobrarCredito(finalQueryGlobal,pagination,id_transaccion_cobrar_creditoFK_IdTransaccionCobrarCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionCobrarCredito(id_transaccion_cobrar_creditoFK_IdTransaccionCobrarCredito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionCobrarCredito(id_transaccion_cobrar_creditoFK_IdTransaccionCobrarCredito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroTesorerias("FK_IdTransaccionCobrarCredito",parametrotesoreriaLogic.getParametroTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroTesorerias("FK_IdTransaccionCobrarCredito",parametrotesorerias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriaLogic.setParametroTesorerias(new ArrayList<ParametroTesoreria>());
						parametrotesoreriaLogic.getParametroTesorerias().addAll(parametrotesoreriasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesorerias=new ArrayList<ParametroTesoreria>();
							parametrotesorerias.addAll(parametrotesoreriasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTransaccionCobrarDebito")) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionCobrarDebito(id_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrotesoreriaLogic.getParametroTesoreriasFK_IdTransaccionCobrarDebito(finalQueryGlobal,pagination,id_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionCobrarDebito(id_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionCobrarDebito(id_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrotesoreriaLogic.getParametroTesorerias()==null||parametrotesoreriaLogic.getParametroTesorerias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrotesorerias==null|| parametrotesorerias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriasAux=new ArrayList<ParametroTesoreria>();
						parametrotesoreriasAux.addAll(parametrotesoreriaLogic.getParametroTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesoreriasAux=new ArrayList<ParametroTesoreria>();
							parametrotesoreriasAux.addAll(parametrotesorerias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrotesoreriaLogic.getParametroTesoreriasFK_IdTransaccionCobrarDebito(finalQueryGlobal,pagination,id_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionCobrarDebito(id_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionCobrarDebito(id_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroTesorerias("FK_IdTransaccionCobrarDebito",parametrotesoreriaLogic.getParametroTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroTesorerias("FK_IdTransaccionCobrarDebito",parametrotesorerias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriaLogic.setParametroTesorerias(new ArrayList<ParametroTesoreria>());
						parametrotesoreriaLogic.getParametroTesorerias().addAll(parametrotesoreriasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesorerias=new ArrayList<ParametroTesoreria>();
							parametrotesorerias.addAll(parametrotesoreriasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTransaccionCobrarPago")) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionCobrarPago(id_transaccion_cobrar_pagoFK_IdTransaccionCobrarPago);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrotesoreriaLogic.getParametroTesoreriasFK_IdTransaccionCobrarPago(finalQueryGlobal,pagination,id_transaccion_cobrar_pagoFK_IdTransaccionCobrarPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionCobrarPago(id_transaccion_cobrar_pagoFK_IdTransaccionCobrarPago);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionCobrarPago(id_transaccion_cobrar_pagoFK_IdTransaccionCobrarPago);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrotesoreriaLogic.getParametroTesorerias()==null||parametrotesoreriaLogic.getParametroTesorerias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrotesorerias==null|| parametrotesorerias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriasAux=new ArrayList<ParametroTesoreria>();
						parametrotesoreriasAux.addAll(parametrotesoreriaLogic.getParametroTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesoreriasAux=new ArrayList<ParametroTesoreria>();
							parametrotesoreriasAux.addAll(parametrotesorerias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrotesoreriaLogic.getParametroTesoreriasFK_IdTransaccionCobrarPago(finalQueryGlobal,pagination,id_transaccion_cobrar_pagoFK_IdTransaccionCobrarPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionCobrarPago(id_transaccion_cobrar_pagoFK_IdTransaccionCobrarPago);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionCobrarPago(id_transaccion_cobrar_pagoFK_IdTransaccionCobrarPago);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroTesorerias("FK_IdTransaccionCobrarPago",parametrotesoreriaLogic.getParametroTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroTesorerias("FK_IdTransaccionCobrarPago",parametrotesorerias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriaLogic.setParametroTesorerias(new ArrayList<ParametroTesoreria>());
						parametrotesoreriaLogic.getParametroTesorerias().addAll(parametrotesoreriasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesorerias=new ArrayList<ParametroTesoreria>();
							parametrotesorerias.addAll(parametrotesoreriasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTransaccionPagarCredito")) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionPagarCredito(id_transaccion_pagar_creditoFK_IdTransaccionPagarCredito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrotesoreriaLogic.getParametroTesoreriasFK_IdTransaccionPagarCredito(finalQueryGlobal,pagination,id_transaccion_pagar_creditoFK_IdTransaccionPagarCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionPagarCredito(id_transaccion_pagar_creditoFK_IdTransaccionPagarCredito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionPagarCredito(id_transaccion_pagar_creditoFK_IdTransaccionPagarCredito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrotesoreriaLogic.getParametroTesorerias()==null||parametrotesoreriaLogic.getParametroTesorerias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrotesorerias==null|| parametrotesorerias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriasAux=new ArrayList<ParametroTesoreria>();
						parametrotesoreriasAux.addAll(parametrotesoreriaLogic.getParametroTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesoreriasAux=new ArrayList<ParametroTesoreria>();
							parametrotesoreriasAux.addAll(parametrotesorerias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrotesoreriaLogic.getParametroTesoreriasFK_IdTransaccionPagarCredito(finalQueryGlobal,pagination,id_transaccion_pagar_creditoFK_IdTransaccionPagarCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionPagarCredito(id_transaccion_pagar_creditoFK_IdTransaccionPagarCredito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionPagarCredito(id_transaccion_pagar_creditoFK_IdTransaccionPagarCredito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroTesorerias("FK_IdTransaccionPagarCredito",parametrotesoreriaLogic.getParametroTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroTesorerias("FK_IdTransaccionPagarCredito",parametrotesorerias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriaLogic.setParametroTesorerias(new ArrayList<ParametroTesoreria>());
						parametrotesoreriaLogic.getParametroTesorerias().addAll(parametrotesoreriasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesorerias=new ArrayList<ParametroTesoreria>();
							parametrotesorerias.addAll(parametrotesoreriasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTransaccionPagarDebito")) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionPagarDebito(id_transaccion_pagar_debitoFK_IdTransaccionPagarDebito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrotesoreriaLogic.getParametroTesoreriasFK_IdTransaccionPagarDebito(finalQueryGlobal,pagination,id_transaccion_pagar_debitoFK_IdTransaccionPagarDebito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionPagarDebito(id_transaccion_pagar_debitoFK_IdTransaccionPagarDebito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionPagarDebito(id_transaccion_pagar_debitoFK_IdTransaccionPagarDebito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrotesoreriaLogic.getParametroTesorerias()==null||parametrotesoreriaLogic.getParametroTesorerias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrotesorerias==null|| parametrotesorerias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriasAux=new ArrayList<ParametroTesoreria>();
						parametrotesoreriasAux.addAll(parametrotesoreriaLogic.getParametroTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesoreriasAux=new ArrayList<ParametroTesoreria>();
							parametrotesoreriasAux.addAll(parametrotesorerias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrotesoreriaLogic.getParametroTesoreriasFK_IdTransaccionPagarDebito(finalQueryGlobal,pagination,id_transaccion_pagar_debitoFK_IdTransaccionPagarDebito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionPagarDebito(id_transaccion_pagar_debitoFK_IdTransaccionPagarDebito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionPagarDebito(id_transaccion_pagar_debitoFK_IdTransaccionPagarDebito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroTesorerias("FK_IdTransaccionPagarDebito",parametrotesoreriaLogic.getParametroTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroTesorerias("FK_IdTransaccionPagarDebito",parametrotesorerias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriaLogic.setParametroTesorerias(new ArrayList<ParametroTesoreria>());
						parametrotesoreriaLogic.getParametroTesorerias().addAll(parametrotesoreriasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesorerias=new ArrayList<ParametroTesoreria>();
							parametrotesorerias.addAll(parametrotesoreriasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTransaccionPagarPago")) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionPagarPago(id_transaccion_pagar_pagoFK_IdTransaccionPagarPago);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrotesoreriaLogic.getParametroTesoreriasFK_IdTransaccionPagarPago(finalQueryGlobal,pagination,id_transaccion_pagar_pagoFK_IdTransaccionPagarPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionPagarPago(id_transaccion_pagar_pagoFK_IdTransaccionPagarPago);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionPagarPago(id_transaccion_pagar_pagoFK_IdTransaccionPagarPago);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrotesoreriaLogic.getParametroTesorerias()==null||parametrotesoreriaLogic.getParametroTesorerias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrotesorerias==null|| parametrotesorerias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriasAux=new ArrayList<ParametroTesoreria>();
						parametrotesoreriasAux.addAll(parametrotesoreriaLogic.getParametroTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesoreriasAux=new ArrayList<ParametroTesoreria>();
							parametrotesoreriasAux.addAll(parametrotesorerias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrotesoreriaLogic.getParametroTesoreriasFK_IdTransaccionPagarPago(finalQueryGlobal,pagination,id_transaccion_pagar_pagoFK_IdTransaccionPagarPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionPagarPago(id_transaccion_pagar_pagoFK_IdTransaccionPagarPago);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaConstantesFunciones.getDetalleIndiceFK_IdTransaccionPagarPago(id_transaccion_pagar_pagoFK_IdTransaccionPagarPago);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroTesorerias("FK_IdTransaccionPagarPago",parametrotesoreriaLogic.getParametroTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroTesorerias("FK_IdTransaccionPagarPago",parametrotesorerias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriaLogic.setParametroTesorerias(new ArrayList<ParametroTesoreria>());
						parametrotesoreriaLogic.getParametroTesorerias().addAll(parametrotesoreriasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesorerias=new ArrayList<ParametroTesoreria>();
							parametrotesorerias.addAll(parametrotesoreriasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParametroTesoreria();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParametroTesoreria();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrotesoreriaLogic.getParametroTesorerias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrotesorerias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrotesoreriaLogic.getParametroTesorerias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrotesorerias.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ParametroTesoreria parametrotesoreria) {
		Boolean permite=true;
		
		if(this.parametrotesoreria.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParametroTesoreriaConstantesFunciones.getOrderByListaParametroTesoreria();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParametroTesoreriaConstantesFunciones.getOrderByListaParametroTesoreria();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroTesoreria parametrotesoreria:parametrotesoreriaLogic.getParametroTesorerias()) {
				if(parametrotesoreria.getsType().equals(Constantes2.S_TOTALES)) {
					parametrotesoreriaTotales=parametrotesoreria;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroTesoreria parametrotesoreria:this.parametrotesorerias) {
				if(parametrotesoreria.getsType().equals(Constantes2.S_TOTALES)) {
					parametrotesoreriaTotales=parametrotesoreria;
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
			this.parametrotesoreriaAux=new ParametroTesoreria();
			this.parametrotesoreriaAux.setsType(Constantes2.S_TOTALES);
			this.parametrotesoreriaAux.setIsNew(false);
			this.parametrotesoreriaAux.setIsChanged(false);
			this.parametrotesoreriaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParametroTesoreriaConstantesFunciones.TotalizarValoresFilaParametroTesoreria(this.parametrotesoreriaLogic.getParametroTesorerias(),this.parametrotesoreriaAux);
				
				this.parametrotesoreriaLogic.getParametroTesorerias().add(this.parametrotesoreriaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParametroTesoreriaConstantesFunciones.TotalizarValoresFilaParametroTesoreria(this.parametrotesorerias,this.parametrotesoreriaAux);
				
				this.parametrotesorerias.add(this.parametrotesoreriaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parametrotesoreriaTotales=new ParametroTesoreria();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrotesoreriaLogic.getParametroTesorerias().remove(parametrotesoreriaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrotesorerias.remove(parametrotesoreriaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parametrotesoreriaTotales=new ParametroTesoreria();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroTesoreria parametrotesoreria:parametrotesoreriaLogic.getParametroTesorerias()) {
				if(parametrotesoreria.getsType().equals(Constantes2.S_TOTALES)) {
					parametrotesoreriaTotales=parametrotesoreria;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroTesoreriaConstantesFunciones.TotalizarValoresFilaParametroTesoreria(this.parametrotesoreriaLogic.getParametroTesorerias(),parametrotesoreriaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroTesoreria parametrotesoreria:this.parametrotesorerias) {
				if(parametrotesoreria.getsType().equals(Constantes2.S_TOTALES)) {
					parametrotesoreriaTotales=parametrotesoreria;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroTesoreriaConstantesFunciones.TotalizarValoresFilaParametroTesoreria(this.parametrotesorerias,parametrotesoreriaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getParametroTesoreriasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroTesoreriasFK_IdTransaccionCobrarCredito()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccionCobrarCredito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroTesoreriasFK_IdTransaccionCobrarDebito()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccionCobrarDebito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroTesoreriasFK_IdTransaccionCobrarPago()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccionCobrarPago";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroTesoreriasFK_IdTransaccionPagarCredito()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccionPagarCredito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroTesoreriasFK_IdTransaccionPagarDebito()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccionPagarDebito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroTesoreriasFK_IdTransaccionPagarPago()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccionPagarPago";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getParametroTesoreriasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrotesoreriaLogic.getParametroTesoreriasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroTesoreriasFK_IdTransaccionCobrarCredito(String sFinalQuery,Long id_transaccion_cobrar_credito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrotesoreriaLogic.getParametroTesoreriasFK_IdTransaccionCobrarCredito(sFinalQuery,this.pagination,id_transaccion_cobrar_credito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroTesoreriasFK_IdTransaccionCobrarDebito(String sFinalQuery,Long id_transaccion_cobrar_debito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrotesoreriaLogic.getParametroTesoreriasFK_IdTransaccionCobrarDebito(sFinalQuery,this.pagination,id_transaccion_cobrar_debito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroTesoreriasFK_IdTransaccionCobrarPago(String sFinalQuery,Long id_transaccion_cobrar_pago)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrotesoreriaLogic.getParametroTesoreriasFK_IdTransaccionCobrarPago(sFinalQuery,this.pagination,id_transaccion_cobrar_pago);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroTesoreriasFK_IdTransaccionPagarCredito(String sFinalQuery,Long id_transaccion_pagar_credito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrotesoreriaLogic.getParametroTesoreriasFK_IdTransaccionPagarCredito(sFinalQuery,this.pagination,id_transaccion_pagar_credito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroTesoreriasFK_IdTransaccionPagarDebito(String sFinalQuery,Long id_transaccion_pagar_debito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrotesoreriaLogic.getParametroTesoreriasFK_IdTransaccionPagarDebito(sFinalQuery,this.pagination,id_transaccion_pagar_debito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroTesoreriasFK_IdTransaccionPagarPago(String sFinalQuery,Long id_transaccion_pagar_pago)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrotesoreriaLogic.getParametroTesoreriasFK_IdTransaccionPagarPago(sFinalQuery,this.pagination,id_transaccion_pagar_pago);
				
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
	
	public void inicializarPermisosParametroTesoreria() {
		this.isPermisoTodoParametroTesoreria=false;
		this.isPermisoNuevoParametroTesoreria=false;
		this.isPermisoActualizarParametroTesoreria=false;
		this.isPermisoActualizarOriginalParametroTesoreria=false;
		this.isPermisoEliminarParametroTesoreria=false;
		this.isPermisoGuardarCambiosParametroTesoreria=false;
		this.isPermisoConsultaParametroTesoreria=false;
		this.isPermisoBusquedaParametroTesoreria=false;
		this.isPermisoReporteParametroTesoreria=false;		
		this.isPermisoOrdenParametroTesoreria=false;		
		this.isPermisoPaginacionMedioParametroTesoreria=false;		
		this.isPermisoPaginacionAltoParametroTesoreria=false;
		this.isPermisoPaginacionTodoParametroTesoreria=false;
		this.isPermisoCopiarParametroTesoreria=false;		
		this.isPermisoVerFormParametroTesoreria=false;		
		this.isPermisoDuplicarParametroTesoreria=false;		
		this.isPermisoOrdenParametroTesoreria=false;		
	}
	
	public void setPermisosUsuarioParametroTesoreria(Boolean isPermiso) {
		this.isPermisoTodoParametroTesoreria=isPermiso;
		this.isPermisoNuevoParametroTesoreria=isPermiso;
		this.isPermisoActualizarParametroTesoreria=isPermiso;
		this.isPermisoActualizarOriginalParametroTesoreria=isPermiso;
		this.isPermisoEliminarParametroTesoreria=isPermiso;
		this.isPermisoGuardarCambiosParametroTesoreria=isPermiso;
		this.isPermisoConsultaParametroTesoreria=isPermiso;
		this.isPermisoBusquedaParametroTesoreria=isPermiso;
		this.isPermisoReporteParametroTesoreria=isPermiso;
		this.isPermisoOrdenParametroTesoreria=isPermiso;		
		this.isPermisoPaginacionMedioParametroTesoreria=isPermiso;		
		this.isPermisoPaginacionAltoParametroTesoreria=isPermiso;		
		this.isPermisoPaginacionTodoParametroTesoreria=isPermiso;		
		this.isPermisoCopiarParametroTesoreria=isPermiso;		
		this.isPermisoVerFormParametroTesoreria=isPermiso;		
		this.isPermisoDuplicarParametroTesoreria=isPermiso;
		this.isPermisoOrdenParametroTesoreria=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParametroTesoreria(Boolean isPermiso) {
		//this.isPermisoTodoParametroTesoreria=isPermiso;
		this.isPermisoNuevoParametroTesoreria=isPermiso;
		this.isPermisoActualizarParametroTesoreria=isPermiso;
		this.isPermisoActualizarOriginalParametroTesoreria=isPermiso;
		this.isPermisoEliminarParametroTesoreria=isPermiso;
		this.isPermisoGuardarCambiosParametroTesoreria=isPermiso;
		//this.isPermisoConsultaParametroTesoreria=isPermiso;
		//this.isPermisoBusquedaParametroTesoreria=isPermiso;
		//this.isPermisoReporteParametroTesoreria=isPermiso;
		//this.isPermisoOrdenParametroTesoreria=isPermiso;		
		//this.isPermisoPaginacionMedioParametroTesoreria=isPermiso;		
		//this.isPermisoPaginacionAltoParametroTesoreria=isPermiso;		
		//this.isPermisoPaginacionTodoParametroTesoreria=isPermiso;		
		//this.isPermisoCopiarParametroTesoreria=isPermiso;		
		//this.isPermisoDuplicarParametroTesoreria=isPermiso;
		//this.isPermisoOrdenParametroTesoreria=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParametroTesoreriaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ParametroTesoreriaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebParametroTesoreria(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParametroTesoreriaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioParametroTesoreriaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParametroTesoreriaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParametroTesoreriaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioParametroTesoreria() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParametroTesoreriaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParametroTesoreriaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParametroTesoreria=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParametroTesoreria=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParametroTesoreria=this.isPermisoActualizarParametroTesoreria;
			this.isPermisoEliminarParametroTesoreria=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParametroTesoreria=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParametroTesoreria=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParametroTesoreria=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParametroTesoreria=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParametroTesoreria=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroTesoreria=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParametroTesoreria=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParametroTesoreria=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParametroTesoreria=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParametroTesoreria=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParametroTesoreria=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParametroTesoreria=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroTesoreria=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParametroTesoreria.setToolTipText(this.jTableDatosParametroTesoreria.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParametroTesoreria(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParametroTesoreria(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParametroTesoreriaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParametroTesoreriaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParametroTesoreria() throws Exception {
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
	public void inicializarCombosForeignKeyParametroTesoreriaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.transaccioncobrarpagosForeignKey=new ArrayList();
				this.transaccioncobrardebitosForeignKey=new ArrayList();
				this.transaccioncobrarcreditosForeignKey=new ArrayList();
				this.transaccionpagarpagosForeignKey=new ArrayList();
				this.transaccionpagardebitosForeignKey=new ArrayList();
				this.transaccionpagarcreditosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParametroTesoreriaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParametroTesoreriaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParametroTesoreriaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionCobrarPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionCobrarDebitoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionCobrarCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionPagarPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionPagarDebitoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionPagarCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTransaccionCobrarPagoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccioncobrarpagosForeignKey==null||this.transaccioncobrarpagosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				moduloActualAux.setId(ModuloConstantesFuncionesAdditional.LID_MODULO_CUENTAS_POR_COBRAR);

				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,moduloActualAux,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionCobrarPagosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionCobrarDebitoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccioncobrardebitosForeignKey==null||this.transaccioncobrardebitosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				moduloActualAux.setId(ModuloConstantesFuncionesAdditional.LID_MODULO_CUENTAS_POR_COBRAR);

				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,moduloActualAux,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionCobrarDebitosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionCobrarCreditoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccioncobrarcreditosForeignKey==null||this.transaccioncobrarcreditosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				moduloActualAux.setId(ModuloConstantesFuncionesAdditional.LID_MODULO_CUENTAS_POR_COBRAR);

				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,moduloActualAux,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionCobrarCreditosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionPagarPagoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccionpagarpagosForeignKey==null||this.transaccionpagarpagosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				moduloActualAux.setId(ModuloConstantesFuncionesAdditional.LID_MODULO_CUENTAS_POR_PAGAR);

				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,moduloActualAux,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionPagarPagosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionPagarDebitoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccionpagardebitosForeignKey==null||this.transaccionpagardebitosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				moduloActualAux.setId(ModuloConstantesFuncionesAdditional.LID_MODULO_CUENTAS_POR_PAGAR);

				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,moduloActualAux,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionPagarDebitosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionPagarCreditoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccionpagarcreditosForeignKey==null||this.transaccionpagarcreditosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				moduloActualAux.setId(ModuloConstantesFuncionesAdditional.LID_MODULO_CUENTAS_POR_PAGAR);

				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,moduloActualAux,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionPagarCreditosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyParametroTesoreriaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ParametroTesoreriaParameterReturnGeneral parametrotesoreriaReturnGeneral=new ParametroTesoreriaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.parametrotesoreriaConstantesFunciones.cargarid_empresaParametroTesoreria)
					 || (this.esRecargarFks && this.parametrotesoreriaConstantesFunciones.cargarid_empresaParametroTesoreria)) {

					if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+parametrotesoreriaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTransaccionCobrarPago="";

				if(((this.transaccioncobrarpagosForeignKey==null||this.transaccioncobrarpagosForeignKey.size()<=0) && this.parametrotesoreriaConstantesFunciones.cargarid_transaccion_cobrar_pagoParametroTesoreria)
					 || (this.esRecargarFks && this.parametrotesoreriaConstantesFunciones.cargarid_transaccion_cobrar_pagoParametroTesoreria)) {

					if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionCobrarPago()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						moduloActualAux.setId(ModuloConstantesFuncionesAdditional.LID_MODULO_CUENTAS_POR_COBRAR);

						finalQueryGlobalTransaccionCobrarPago=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,moduloActualAux,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccionCobrarPago=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccionCobrarPago, "");
						finalQueryGlobalTransaccionCobrarPago+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccionCobrarPagosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccionCobrarPago=" WHERE " + ConstantesSql.ID + "="+parametrotesoreriaSessionBean.getlidTransaccionCobrarPagoActual();
					}
				} else {
					finalQueryGlobalTransaccionCobrarPago="NONE";
				}


				String finalQueryGlobalTransaccionCobrarDebito="";

				if(((this.transaccioncobrardebitosForeignKey==null||this.transaccioncobrardebitosForeignKey.size()<=0) && this.parametrotesoreriaConstantesFunciones.cargarid_transaccion_cobrar_debitoParametroTesoreria)
					 || (this.esRecargarFks && this.parametrotesoreriaConstantesFunciones.cargarid_transaccion_cobrar_debitoParametroTesoreria)) {

					if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionCobrarDebito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						moduloActualAux.setId(ModuloConstantesFuncionesAdditional.LID_MODULO_CUENTAS_POR_COBRAR);

						finalQueryGlobalTransaccionCobrarDebito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,moduloActualAux,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccionCobrarDebito=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccionCobrarDebito, "");
						finalQueryGlobalTransaccionCobrarDebito+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccionCobrarDebitosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccionCobrarDebito=" WHERE " + ConstantesSql.ID + "="+parametrotesoreriaSessionBean.getlidTransaccionCobrarDebitoActual();
					}
				} else {
					finalQueryGlobalTransaccionCobrarDebito="NONE";
				}


				String finalQueryGlobalTransaccionCobrarCredito="";

				if(((this.transaccioncobrarcreditosForeignKey==null||this.transaccioncobrarcreditosForeignKey.size()<=0) && this.parametrotesoreriaConstantesFunciones.cargarid_transaccion_cobrar_creditoParametroTesoreria)
					 || (this.esRecargarFks && this.parametrotesoreriaConstantesFunciones.cargarid_transaccion_cobrar_creditoParametroTesoreria)) {

					if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionCobrarCredito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						moduloActualAux.setId(ModuloConstantesFuncionesAdditional.LID_MODULO_CUENTAS_POR_COBRAR);

						finalQueryGlobalTransaccionCobrarCredito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,moduloActualAux,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccionCobrarCredito=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccionCobrarCredito, "");
						finalQueryGlobalTransaccionCobrarCredito+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccionCobrarCreditosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccionCobrarCredito=" WHERE " + ConstantesSql.ID + "="+parametrotesoreriaSessionBean.getlidTransaccionCobrarCreditoActual();
					}
				} else {
					finalQueryGlobalTransaccionCobrarCredito="NONE";
				}


				String finalQueryGlobalTransaccionPagarPago="";

				if(((this.transaccionpagarpagosForeignKey==null||this.transaccionpagarpagosForeignKey.size()<=0) && this.parametrotesoreriaConstantesFunciones.cargarid_transaccion_pagar_pagoParametroTesoreria)
					 || (this.esRecargarFks && this.parametrotesoreriaConstantesFunciones.cargarid_transaccion_pagar_pagoParametroTesoreria)) {

					if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionPagarPago()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						moduloActualAux.setId(ModuloConstantesFuncionesAdditional.LID_MODULO_CUENTAS_POR_PAGAR);

						finalQueryGlobalTransaccionPagarPago=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,moduloActualAux,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccionPagarPago=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccionPagarPago, "");
						finalQueryGlobalTransaccionPagarPago+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccionPagarPagosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccionPagarPago=" WHERE " + ConstantesSql.ID + "="+parametrotesoreriaSessionBean.getlidTransaccionPagarPagoActual();
					}
				} else {
					finalQueryGlobalTransaccionPagarPago="NONE";
				}


				String finalQueryGlobalTransaccionPagarDebito="";

				if(((this.transaccionpagardebitosForeignKey==null||this.transaccionpagardebitosForeignKey.size()<=0) && this.parametrotesoreriaConstantesFunciones.cargarid_transaccion_pagar_debitoParametroTesoreria)
					 || (this.esRecargarFks && this.parametrotesoreriaConstantesFunciones.cargarid_transaccion_pagar_debitoParametroTesoreria)) {

					if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionPagarDebito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						moduloActualAux.setId(ModuloConstantesFuncionesAdditional.LID_MODULO_CUENTAS_POR_PAGAR);

						finalQueryGlobalTransaccionPagarDebito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,moduloActualAux,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccionPagarDebito=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccionPagarDebito, "");
						finalQueryGlobalTransaccionPagarDebito+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccionPagarDebitosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccionPagarDebito=" WHERE " + ConstantesSql.ID + "="+parametrotesoreriaSessionBean.getlidTransaccionPagarDebitoActual();
					}
				} else {
					finalQueryGlobalTransaccionPagarDebito="NONE";
				}


				String finalQueryGlobalTransaccionPagarCredito="";

				if(((this.transaccionpagarcreditosForeignKey==null||this.transaccionpagarcreditosForeignKey.size()<=0) && this.parametrotesoreriaConstantesFunciones.cargarid_transaccion_pagar_creditoParametroTesoreria)
					 || (this.esRecargarFks && this.parametrotesoreriaConstantesFunciones.cargarid_transaccion_pagar_creditoParametroTesoreria)) {

					if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionPagarCredito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						moduloActualAux.setId(ModuloConstantesFuncionesAdditional.LID_MODULO_CUENTAS_POR_PAGAR);

						finalQueryGlobalTransaccionPagarCredito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,moduloActualAux,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccionPagarCredito=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccionPagarCredito, "");
						finalQueryGlobalTransaccionPagarCredito+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccionPagarCreditosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccionPagarCredito=" WHERE " + ConstantesSql.ID + "="+parametrotesoreriaSessionBean.getlidTransaccionPagarCreditoActual();
					}
				} else {
					finalQueryGlobalTransaccionPagarCredito="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				parametrotesoreriaReturnGeneral=parametrotesoreriaLogic.cargarCombosLoteForeignKeyParametroTesoreria(finalQueryGlobalEmpresa,finalQueryGlobalTransaccionCobrarPago,finalQueryGlobalTransaccionCobrarDebito,finalQueryGlobalTransaccionCobrarCredito,finalQueryGlobalTransaccionPagarPago,finalQueryGlobalTransaccionPagarDebito,finalQueryGlobalTransaccionPagarCredito);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=parametrotesoreriaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTransaccionCobrarPago.equals("NONE")) {
				this.transaccioncobrarpagosForeignKey=parametrotesoreriaReturnGeneral.gettransaccioncobrarpagosForeignKey();
			}

			if(!finalQueryGlobalTransaccionCobrarDebito.equals("NONE")) {
				this.transaccioncobrardebitosForeignKey=parametrotesoreriaReturnGeneral.gettransaccioncobrardebitosForeignKey();
			}

			if(!finalQueryGlobalTransaccionCobrarCredito.equals("NONE")) {
				this.transaccioncobrarcreditosForeignKey=parametrotesoreriaReturnGeneral.gettransaccioncobrarcreditosForeignKey();
			}

			if(!finalQueryGlobalTransaccionPagarPago.equals("NONE")) {
				this.transaccionpagarpagosForeignKey=parametrotesoreriaReturnGeneral.gettransaccionpagarpagosForeignKey();
			}

			if(!finalQueryGlobalTransaccionPagarDebito.equals("NONE")) {
				this.transaccionpagardebitosForeignKey=parametrotesoreriaReturnGeneral.gettransaccionpagardebitosForeignKey();
			}

			if(!finalQueryGlobalTransaccionPagarCredito.equals("NONE")) {
				this.transaccionpagarcreditosForeignKey=parametrotesoreriaReturnGeneral.gettransaccionpagarcreditosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParametroTesoreria()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTransaccionCobrarPago();
			this.addItemDefectoCombosForeignKeyTransaccionCobrarDebito();
			this.addItemDefectoCombosForeignKeyTransaccionCobrarCredito();
			this.addItemDefectoCombosForeignKeyTransaccionPagarPago();
			this.addItemDefectoCombosForeignKeyTransaccionPagarDebito();
			this.addItemDefectoCombosForeignKeyTransaccionPagarCredito();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.parametrotesoreriaSessionBean==null) {
				this.parametrotesoreriaSessionBean=new ParametroTesoreriaSessionBean();
			}

			if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTransaccionCobrarPago()throws Exception {
		try {

			if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionCobrarPago()) {
				Transaccion transaccioncobrarpago=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccioncobrarpago,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccioncobrarpago.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccioncobrarpagosForeignKey,transaccioncobrarpago,true)) {

					this.transaccioncobrarpagosForeignKey.add(0,transaccioncobrarpago);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccionCobrarDebito()throws Exception {
		try {

			if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionCobrarDebito()) {
				Transaccion transaccioncobrardebito=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccioncobrardebito,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccioncobrardebito.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccioncobrardebitosForeignKey,transaccioncobrardebito,true)) {

					this.transaccioncobrardebitosForeignKey.add(0,transaccioncobrardebito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccionCobrarCredito()throws Exception {
		try {

			if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionCobrarCredito()) {
				Transaccion transaccioncobrarcredito=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccioncobrarcredito,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccioncobrarcredito.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccioncobrarcreditosForeignKey,transaccioncobrarcredito,true)) {

					this.transaccioncobrarcreditosForeignKey.add(0,transaccioncobrarcredito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccionPagarPago()throws Exception {
		try {

			if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionPagarPago()) {
				Transaccion transaccionpagarpago=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccionpagarpago,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccionpagarpago.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccionpagarpagosForeignKey,transaccionpagarpago,true)) {

					this.transaccionpagarpagosForeignKey.add(0,transaccionpagarpago);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccionPagarDebito()throws Exception {
		try {

			if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionPagarDebito()) {
				Transaccion transaccionpagardebito=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccionpagardebito,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccionpagardebito.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccionpagardebitosForeignKey,transaccionpagardebito,true)) {

					this.transaccionpagardebitosForeignKey.add(0,transaccionpagardebito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccionPagarCredito()throws Exception {
		try {

			if(!this.parametrotesoreriaSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionPagarCredito()) {
				Transaccion transaccionpagarcredito=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccionpagarcredito,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccionpagarcredito.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccionpagarcreditosForeignKey,transaccionpagarcredito,true)) {

					this.transaccionpagarcreditosForeignKey.add(0,transaccionpagarcredito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyParametroTesoreria()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParametroTesoreria(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParametroTesoreria()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroTesoreria();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParametroTesoreria(ParametroTesoreria parametrotesoreria)throws Exception {	
		try {
			
			this.setActualTransaccionCobrarPagoForeignKey(parametrotesoreria.getid_transaccion_cobrar_pago(),false,"Formulario");
			this.setActualTransaccionCobrarDebitoForeignKey(parametrotesoreria.getid_transaccion_cobrar_debito(),false,"Formulario");
			this.setActualTransaccionCobrarCreditoForeignKey(parametrotesoreria.getid_transaccion_cobrar_credito(),false,"Formulario");
			this.setActualTransaccionPagarPagoForeignKey(parametrotesoreria.getid_transaccion_pagar_pago(),false,"Formulario");
			this.setActualTransaccionPagarDebitoForeignKey(parametrotesoreria.getid_transaccion_pagar_debito(),false,"Formulario");
			this.setActualTransaccionPagarCreditoForeignKey(parametrotesoreria.getid_transaccion_pagar_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParametroTesoreria(ParametroTesoreria parametrotesoreria,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParametroTesoreria()throws Exception {	
		try {
			
			this.setActualTransaccionCobrarPagoForeignKey(this.parametrotesoreriaConstantesFunciones.getid_transaccion_cobrar_pago(),false,"Formulario");
			this.setActualTransaccionCobrarDebitoForeignKey(this.parametrotesoreriaConstantesFunciones.getid_transaccion_cobrar_debito(),false,"Formulario");
			this.setActualTransaccionCobrarCreditoForeignKey(this.parametrotesoreriaConstantesFunciones.getid_transaccion_cobrar_credito(),false,"Formulario");
			this.setActualTransaccionPagarPagoForeignKey(this.parametrotesoreriaConstantesFunciones.getid_transaccion_pagar_pago(),false,"Formulario");
			this.setActualTransaccionPagarDebitoForeignKey(this.parametrotesoreriaConstantesFunciones.getid_transaccion_pagar_debito(),false,"Formulario");
			this.setActualTransaccionPagarCreditoForeignKey(this.parametrotesoreriaConstantesFunciones.getid_transaccion_pagar_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParametroTesoreria()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParametroTesoreria()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParametroTesoreria()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParametroTesoreria()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParametroTesoreria()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTransaccionCobrarPagosForeignKey("Todos");
			this.cargarCombosFrameTransaccionCobrarDebitosForeignKey("Todos");
			this.cargarCombosFrameTransaccionCobrarCreditosForeignKey("Todos");
			this.cargarCombosFrameTransaccionPagarPagosForeignKey("Todos");
			this.cargarCombosFrameTransaccionPagarDebitosForeignKey("Todos");
			this.cargarCombosFrameTransaccionPagarCreditosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParametroTesoreria(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionCobrarPagosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionCobrarDebitosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionCobrarCreditosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionPagarPagosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionPagarDebitosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionPagarCreditosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParametroTesoreria()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_empresaParametroTesoreria!=null && this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_empresaParametroTesoreria.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_empresaParametroTesoreria.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_pagoParametroTesoreria!=null && this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_debitoParametroTesoreria!=null && this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_creditoParametroTesoreria!=null && this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_pagoParametroTesoreria!=null && this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_pagoParametroTesoreria.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_pagoParametroTesoreria.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_debitoParametroTesoreria!=null && this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_debitoParametroTesoreria.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_debitoParametroTesoreria.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_creditoParametroTesoreria!=null && this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_creditoParametroTesoreria.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_creditoParametroTesoreria.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public ParametroTesoreriaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParametroTesoreriaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroTesoreriaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parametrotesoreriaSessionBean=new ParametroTesoreriaSessionBean(); 
		this.parametrotesoreriaConstantesFunciones=new ParametroTesoreriaConstantesFunciones(); 
		this.parametrotesoreriaBean=new ParametroTesoreria();//(this.parametrotesoreriaConstantesFunciones); 		
		this.parametrotesoreriaReturnGeneral=new ParametroTesoreriaParameterReturnGeneral(); 
		
		this.parametrotesoreriaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrotesoreriaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParametroTesoreriaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParametroTesoreriaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParametroTesoreriaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParametroTesoreria(true);
			
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
			
			this.parametrotesoreriaConstantesFunciones=new ParametroTesoreriaConstantesFunciones(); 
			this.parametrotesoreriaBean=new ParametroTesoreria();//this.parametrotesoreriaConstantesFunciones); 			
			this.parametrotesoreriaReturnGeneral=new ParametroTesoreriaParameterReturnGeneral(); 
		
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Tesoreria Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.parametrotesoreria=new ParametroTesoreria();
			this.parametrotesorerias = new ArrayList<ParametroTesoreria>();
			this.parametrotesoreriasAux = new ArrayList<ParametroTesoreria>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic=new ParametroTesoreriaLogic();
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}
			
			//this.parametrotesoreriaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parametrotesoreriaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParametroTesoreria);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParametroTesoreria!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroTesoreria);	
					}
					
					if(this.jInternalFrameImportacionParametroTesoreria!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroTesoreria);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParametroTesoreria!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParametroTesoreria);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroTesoreria);
				this.jInternalFrameDetalleFormParametroTesoreria.setVisible(false);
				this.jInternalFrameDetalleFormParametroTesoreria.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParametroTesoreria!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroTesoreria);
					this.jInternalFrameReporteDinamicoParametroTesoreria.setVisible(false);
					this.jInternalFrameReporteDinamicoParametroTesoreria.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParametroTesoreria!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParametroTesoreria);
					this.jInternalFrameImportacionParametroTesoreria.setVisible(false);
					this.jInternalFrameImportacionParametroTesoreria.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParametroTesoreria!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParametroTesoreria);
					this.jInternalFrameOrderByParametroTesoreria.setVisible(false);
					this.jInternalFrameOrderByParametroTesoreria.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParametroTesoreriaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParametroTesoreriaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parametrotesoreriaReturnGeneral=new ParametroTesoreriaParameterReturnGeneral();
			
			this.parametrotesoreriaParameterGeneral=new ParametroTesoreriaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parametrotesoreriaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParametroTesoreriaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroTesoreriaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrotesoreriaSessionBean.getEsGuardarRelacionado(),this.parametrotesoreriaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroTesoreriaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrotesoreriaSessionBean.getEsGuardarRelacionado(),this.parametrotesoreriaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParametroTesoreria=false;
			this.isVisibilidadCeldaDuplicarParametroTesoreria=true;
			this.isVisibilidadCeldaCopiarParametroTesoreria=true;
			this.isVisibilidadCeldaVerFormParametroTesoreria=true;
			this.isVisibilidadCeldaOrdenParametroTesoreria=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria=false;
			this.isVisibilidadCeldaModificarParametroTesoreria=false;
			this.isVisibilidadCeldaActualizarParametroTesoreria=false;
			this.isVisibilidadCeldaEliminarParametroTesoreria=false;
			this.isVisibilidadCeldaCancelarParametroTesoreria=false;
			this.isVisibilidadCeldaGuardarParametroTesoreria=false;
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreria=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTransaccionCobrarCredito=true;
			this.isVisibilidadFK_IdTransaccionCobrarDebito=true;
			this.isVisibilidadFK_IdTransaccionCobrarPago=true;
			this.isVisibilidadFK_IdTransaccionPagarCredito=true;
			this.isVisibilidadFK_IdTransaccionPagarDebito=true;
			this.isVisibilidadFK_IdTransaccionPagarPago=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParametroTesoreria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParametroTesoreria();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParametroTesoreria(false);
			
			this.setPermisosUsuarioParametroTesoreria();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado() 
				|| (this.parametrotesoreriaSessionBean.getEsGuardarRelacionado() && this.parametrotesoreriaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParametroTesoreriaClasesRelacionadas();
			}
			
			if(this.parametrotesoreriaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParametroTesoreriaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParametroTesoreria();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParametroTesoreria();
			}
			
			if(!this.isPermisoBusquedaParametroTesoreria) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasParametroTesoreria.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParametroTesoreria,this.isPermisoPaginacionMedioParametroTesoreria,this.isPermisoPaginacionTodoParametroTesoreria);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParametroTesoreriaConstantesFunciones.getTiposSeleccionarParametroTesoreria());
				
				this.tiposColumnasSelect=ParametroTesoreriaConstantesFunciones.getTiposSeleccionarParametroTesoreria(true);
				
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
			//if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParametroTesoreria();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioParametroTesoreria(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioParametroTesoreria(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroTesoreria() ;
			
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
			this.transaccioncobrarpagoLogic=new TransaccionLogic();
			this.transaccioncobrardebitoLogic=new TransaccionLogic();
			this.transaccioncobrarcreditoLogic=new TransaccionLogic();
			this.transaccionpagarpagoLogic=new TransaccionLogic();
			this.transaccionpagardebitoLogic=new TransaccionLogic();
			this.transaccionpagarcreditoLogic=new TransaccionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				parametrotesoreriaImplementable= (ParametroTesoreriaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroTesoreriaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parametrotesoreriaImplementableHome= (ParametroTesoreriaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroTesoreriaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parametrotesorerias= new ArrayList<ParametroTesoreria>();
			this.parametrotesoreriasEliminados= new ArrayList<ParametroTesoreria>();
						
			this.isEsNuevoParametroTesoreria=false;
			this.esParaAccionDesdeFormularioParametroTesoreria=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.transaccioncobrarpagosForeignKey=new ArrayList<Transaccion>() ;
			this.transaccioncobrardebitosForeignKey=new ArrayList<Transaccion>() ;
			this.transaccioncobrarcreditosForeignKey=new ArrayList<Transaccion>() ;
			this.transaccionpagarpagosForeignKey=new ArrayList<Transaccion>() ;
			this.transaccionpagardebitosForeignKey=new ArrayList<Transaccion>() ;
			this.transaccionpagarcreditosForeignKey=new ArrayList<Transaccion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParametroTesoreria(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParametroTesoreria();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParametroTesoreriaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParametroTesoreria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParametroTesoreria(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParametroTesoreria();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParametroTesoreria();
			}
			
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasParametroTesoreria.getTabCount(); i++) {
					this.jTabbedPaneBusquedasParametroTesoreria.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasParametroTesoreria.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParametroTesoreria(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ParametroTesoreria: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParametroTesoreria() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParametroTesoreria")) {
				iIndex=this.jInternalFrameDetalleFormParametroTesoreria.jTabbedPaneRelacionesParametroTesoreria.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParametroTesoreria.jTabbedPaneRelacionesParametroTesoreria.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParametroTesoreria();	
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
	
	public void cargarCombosForeignKeyParametroTesoreria(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParametroTesoreria(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParametroTesoreria(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParametroTesoreriaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParametroTesoreria();
		
		this.cargarCombosFrameForeignKeyParametroTesoreria();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParametroTesoreria();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParametroTesoreria();
		}
	}
	
	

	public void cargarCombosForeignKeyTransaccionCobrarPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionCobrarPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccionCobrarPago();
				this.cargarCombosFrameTransaccionCobrarPagosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccionCobrarPago(this.transaccioncobrarpagosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionCobrarDebito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionCobrarDebitoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccionCobrarDebito();
				this.cargarCombosFrameTransaccionCobrarDebitosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccionCobrarDebito(this.transaccioncobrardebitosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionCobrarCredito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionCobrarCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccionCobrarCredito();
				this.cargarCombosFrameTransaccionCobrarCreditosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccionCobrarCredito(this.transaccioncobrarcreditosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionPagarPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionPagarPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccionPagarPago();
				this.cargarCombosFrameTransaccionPagarPagosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccionPagarPago(this.transaccionpagarpagosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionPagarDebito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionPagarDebitoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccionPagarDebito();
				this.cargarCombosFrameTransaccionPagarDebitosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccionPagarDebito(this.transaccionpagardebitosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionPagarCredito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionPagarCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccionPagarCredito();
				this.cargarCombosFrameTransaccionPagarCreditosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccionPagarCredito(this.transaccionpagarcreditosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoParametroTesoreriaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parametrotesoreriaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParametroTesoreria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
			
			
			if(jTableDatosParametroTesoreria.getRowCount()>=1) {
				jTableDatosParametroTesoreria.removeRowSelectionInterval(0, jTableDatosParametroTesoreria.getRowCount()-1);						
			}
			
			this.isEsNuevoParametroTesoreria=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParametroTesoreria(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParametroTesoreria(true);			
			//this.parametrotesoreria=new ParametroTesoreria();
			//this.parametrotesoreria.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroTesoreria(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroTesoreria() ;
			
			if(ParametroTesoreriaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroTesoreria(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parametrotesoreria);	
			this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreria);				
			
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
			
			if(this.parametrotesoreriaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ParametroTesoreria: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParametroTesoreriaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ParametroTesoreria> parametrotesoreriasSeleccionados=new ArrayList<ParametroTesoreria>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParametroTesoreria.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParametroTesoreria.getSelectedRows().length;			
			}
			
			parametrotesoreriasSeleccionados=this.getParametroTesoreriasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParametroTesoreria--;			
				//ParametroTesoreria parametrotesoreriaAux= new ParametroTesoreria();			
				//parametrotesoreriaAux.setId(this.iIdNuevoParametroTesoreria);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ParametroTesoreria parametrotesoreriaOrigen=new ParametroTesoreria();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ParametroTesoreria parametrotesoreriaOrigen : parametrotesoreriasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parametrotesoreriaOrigen =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesoreriaOrigen =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParametroTesoreria();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parametrotesoreria.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParametroTesoreria(parametrotesoreriaOrigen,this.parametrotesoreria,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrotesoreriaLogic.getParametroTesorerias().add(this.parametrotesoreriaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrotesorerias.add(this.parametrotesoreriaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParametroTesoreria(false);
				
				this.jTableDatosParametroTesoreria.setRowSelectionInterval(this.getIndiceNuevoParametroTesoreria(), this.getIndiceNuevoParametroTesoreria());
				
				int iLastRow =  this.jTableDatosParametroTesoreria.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroTesoreria.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroTesoreria.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroTesoreria(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ParametroTesoreria> parametrotesoreriasSeleccionados=new ArrayList<ParametroTesoreria>();									
		
			ParametroTesoreria parametrotesoreriaOrigen=new ParametroTesoreria();
			ParametroTesoreria parametrotesoreriaDestino=new ParametroTesoreria();
				
			parametrotesoreriasSeleccionados=this.getParametroTesoreriasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParametroTesoreria.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parametrotesoreriasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParametroTesoreria.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriaOrigen =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrotesoreriaOrigen =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriaDestino =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrotesoreriaDestino =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parametrotesoreriaOrigen =parametrotesoreriasSeleccionados.get(0);
				parametrotesoreriaDestino =parametrotesoreriasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParametroTesoreria(parametrotesoreriaOrigen,parametrotesoreriaDestino,true,false);
				
				parametrotesoreriaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrotesoreriaDestino,parametrotesoreriaLogic.getParametroTesorerias());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrotesoreriaDestino,parametrotesorerias);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParametroTesoreria(false);
				
				//this.jTableDatosParametroTesoreria.setRowSelectionInterval(this.getIndiceNuevoParametroTesoreria(), this.getIndiceNuevoParametroTesoreria());
				
				int iLastRow =  this.jTableDatosParametroTesoreria.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroTesoreria.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroTesoreria.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroTesoreria(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroTesoreria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParametroTesoreria.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParametroTesoreria.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasParametroTesoreria.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesParametroTesoreria.setVisible(!isVisible);
			this.jPanelPaginacionParametroTesoreria.setVisible(!isVisible);
			this.jPanelAccionesParametroTesoreria.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParametroTesoreria();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParametroTesoreria();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParametroTesoreria();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParametroTesoreria();
			
			this.abrirFrameOrderByParametroTesoreria();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParametroTesoreria();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParametroTesoreria(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroTesoreria);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParametroTesoreria.isMaximum()) {
					this.jInternalFrameDetalleFormParametroTesoreria.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParametroTesoreria.setSize(this.jInternalFrameDetalleFormParametroTesoreria.iWidthFormulario,this.jInternalFrameDetalleFormParametroTesoreria.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParametroTesoreria.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParametroTesoreria.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParametroTesoreria.isMaximum()) {
						this.jInternalFrameDetalleFormParametroTesoreria.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParametroTesoreria.jContentPaneDetalleParametroTesoreria.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParametroTesoreria.jTabbedPaneRelacionesParametroTesoreria.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParametroTesoreria.jContentPaneDetalleParametroTesoreria.getWidth(),ParametroTesoreriaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroTesoreria.jTabbedPaneRelacionesParametroTesoreria.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParametroTesoreria.jContentPaneDetalleParametroTesoreria.getWidth(),ParametroTesoreriaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroTesoreria.jTabbedPaneRelacionesParametroTesoreria.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParametroTesoreria.jContentPaneDetalleParametroTesoreria.getWidth(),ParametroTesoreriaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParametroTesoreria.setVisible(true);
	        this.jInternalFrameDetalleFormParametroTesoreria.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParametroTesoreria() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParametroTesoreria==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParametroTesoreria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroTesoreria,false,this);
				} else {
					this.jInternalFrameOrderByParametroTesoreria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroTesoreria,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParametroTesoreria);
				this.jInternalFrameOrderByParametroTesoreria.setVisible(false);
				this.jInternalFrameOrderByParametroTesoreria.setSelected(false);
				
				this.jInternalFrameOrderByParametroTesoreria.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroTesoreria"));
				
				this.inicializarActualizarBindingTablaOrderByParametroTesoreria();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParametroTesoreria() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParametroTesoreria==null) {
				
				this.jInternalFrameImportacionParametroTesoreria=new ImportacionJInternalFrame(ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroTesoreria);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParametroTesoreria);
				this.jInternalFrameImportacionParametroTesoreria.setVisible(false);
				this.jInternalFrameImportacionParametroTesoreria.setSelected(false);


				this.jInternalFrameImportacionParametroTesoreria.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroTesoreria"));
				this.jInternalFrameImportacionParametroTesoreria.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroTesoreria"));
				this.jInternalFrameImportacionParametroTesoreria.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroTesoreria"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParametroTesoreria() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParametroTesoreria==null) {
				this.jInternalFrameReporteDinamicoParametroTesoreria=new ReporteDinamicoJInternalFrame(ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroTesoreria);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroTesoreria);
				this.jInternalFrameReporteDinamicoParametroTesoreria.setVisible(false);
				this.jInternalFrameReporteDinamicoParametroTesoreria.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParametroTesoreria.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroTesoreria"));
				this.jInternalFrameReporteDinamicoParametroTesoreria.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroTesoreria"));
				this.jInternalFrameReporteDinamicoParametroTesoreria.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroTesoreria"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroTesoreria();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleParametroTesoreria() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroTesoreria);
			
	       	this.jInternalFrameDetalleFormParametroTesoreria.setVisible(false);
	        this.jInternalFrameDetalleFormParametroTesoreria.setSelected(false);
			
			//this.jInternalFrameDetalleFormParametroTesoreria.dispose();
			//this.jInternalFrameDetalleFormParametroTesoreria=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParametroTesoreria() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParametroTesoreria.setVisible(true);
	        this.jInternalFrameReporteDinamicoParametroTesoreria.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParametroTesoreria() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParametroTesoreria.setVisible(true);
	        this.jInternalFrameImportacionParametroTesoreria.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParametroTesoreria() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParametroTesoreria.setVisible(true);
	        this.jInternalFrameOrderByParametroTesoreria.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParametroTesoreria() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParametroTesoreria.setVisible(false);
	        this.jInternalFrameOrderByParametroTesoreria.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParametroTesoreria() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParametroTesoreria.setVisible(false);
	        this.jInternalFrameReporteDinamicoParametroTesoreria.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParametroTesoreria() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParametroTesoreria.setVisible(false);
	        this.jInternalFrameImportacionParametroTesoreria.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParametroTesoreria(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParametroTesoreria(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParametroTesoreria(true);
			//this.isEsNuevoParametroTesoreria=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParametroTesoreria("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroTesoreria(false) ;
			
			if(parametrotesoreriaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ParametroTesoreriaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroTesoreria(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroTesoreria(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParametroTesoreriaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParametroTesoreria(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroTesoreria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParametroTesoreria(true);
			//this.isEsNuevoParametroTesoreria=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parametrotesoreria.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParametroTesoreria("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParametroTesoreria(false) ;
			
			if(ParametroTesoreriaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroTesoreria(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroTesoreria(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTransaccionCobrarPago(List<Transaccion> transaccioncobrarpagosForeignKey)throws Exception{
		TableColumn tableColumnTransaccionCobrarPago=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARPAGO));
		TableCellEditor tableCellEditorTransaccionCobrarPago =tableColumnTransaccionCobrarPago.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccionCobrarPago;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccioncobrarpagosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroTesoreria.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccioncobrarpagosForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccionCobrarDebito(List<Transaccion> transaccioncobrardebitosForeignKey)throws Exception{
		TableColumn tableColumnTransaccionCobrarDebito=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARDEBITO));
		TableCellEditor tableCellEditorTransaccionCobrarDebito =tableColumnTransaccionCobrarDebito.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccionCobrarDebito;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccioncobrardebitosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroTesoreria.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccioncobrardebitosForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccionCobrarCredito(List<Transaccion> transaccioncobrarcreditosForeignKey)throws Exception{
		TableColumn tableColumnTransaccionCobrarCredito=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARCREDITO));
		TableCellEditor tableCellEditorTransaccionCobrarCredito =tableColumnTransaccionCobrarCredito.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccionCobrarCredito;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccioncobrarcreditosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroTesoreria.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccioncobrarcreditosForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccionPagarPago(List<Transaccion> transaccionpagarpagosForeignKey)throws Exception{
		TableColumn tableColumnTransaccionPagarPago=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARPAGO));
		TableCellEditor tableCellEditorTransaccionPagarPago =tableColumnTransaccionPagarPago.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccionPagarPago;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionpagarpagosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroTesoreria.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionpagarpagosForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccionPagarDebito(List<Transaccion> transaccionpagardebitosForeignKey)throws Exception{
		TableColumn tableColumnTransaccionPagarDebito=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARDEBITO));
		TableCellEditor tableCellEditorTransaccionPagarDebito =tableColumnTransaccionPagarDebito.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccionPagarDebito;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionpagardebitosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroTesoreria.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionpagardebitosForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccionPagarCredito(List<Transaccion> transaccionpagarcreditosForeignKey)throws Exception{
		TableColumn tableColumnTransaccionPagarCredito=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARCREDITO));
		TableCellEditor tableCellEditorTransaccionPagarCredito =tableColumnTransaccionPagarCredito.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccionPagarCredito;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionpagarcreditosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroTesoreria.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionpagarcreditosForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParametroTesoreria(false);
			
			//if(!this.isEsNuevoParametroTesoreria) {								
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParametroTesoreria(this.parametrotesoreria,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
				
			}
			
			if(this.permiteMantenimiento(this.parametrotesoreria)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParametroTesoreria=true;
					this.inicializarActualizarBindingTablaParametroTesoreria(false);
					this.isEsNuevoParametroTesoreria=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParametroTesoreria=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParametroTesoreria=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroTesoreria(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroTesoreria(false);
				
				this.habilitarDeshabilitarControlesParametroTesoreria(false);
			
												
				
				if(ParametroTesoreriaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParametroTesoreria();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParametroTesoreriaActionPerformed(evt,parametrotesoreriaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParametroTesoreria(this.parametrotesoreria,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParametroTesoreria.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parametrotesoreriaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parametrotesoreria.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreria.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreria.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				this.parametrotesoreria.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				this.parametrotesoreria.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parametrotesoreria)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParametroTesoreriaModel) this.jTableDatosParametroTesoreria.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParametroTesoreria=true;
				this.inicializarActualizarBindingTablaParametroTesoreria(false);
				this.isEsNuevoParametroTesoreria=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroTesoreria(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroTesoreria(false);
				
				this.habilitarDeshabilitarControlesParametroTesoreria(false);
				
				
				
				if(ParametroTesoreriaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParametroTesoreria();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParametroTesoreria.getRowCount()>=1) {
				jTableDatosParametroTesoreria.removeRowSelectionInterval(0, jTableDatosParametroTesoreria.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParametroTesoreria(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParametroTesoreria(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroTesoreria(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroTesoreria(false) ;
			
			this.isEsNuevoParametroTesoreria=false;
			
			if(ParametroTesoreriaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParametroTesoreria();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParametroTesoreria(false);
				
				//SI ES MANUAL
				if(ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParametroTesoreria();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParametroTesoreria--;			
			//ParametroTesoreria parametrotesoreriaAux= new ParametroTesoreria();			
			//parametrotesoreriaAux.setId(this.iIdNuevoParametroTesoreria);
			
			if(this.jInternalFrameDetalleFormParametroTesoreria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParametroTesoreria();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
			
			this.parametrotesoreria.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parametrotesoreriaLogic.getParametroTesorerias().add(this.parametrotesoreriaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parametrotesorerias.add(this.parametrotesoreriaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParametroTesoreria(false);
			
			this.jTableDatosParametroTesoreria.setRowSelectionInterval(this.getIndiceNuevoParametroTesoreria(), this.getIndiceNuevoParametroTesoreria());
			
			int iLastRow =  this.jTableDatosParametroTesoreria.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParametroTesoreria.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParametroTesoreria.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParametroTesoreria(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametroTesoreria(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroTesoreria(false);
			
			//SI ES MANUAL
			if(ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroTesoreria();
			}
			
			//this.abrirFrameTreeParametroTesoreria();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Parametro TesoreriaS ?", "MANTENIMIENTO DE Parametro Tesoreria", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParametroTesoreria.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParametroTesoreria();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parametrotesoreriaReturnGeneral=parametrotesoreriaLogic.procesarImportacionParametroTesoreriasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parametrotesoreriaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParametroTesoreriaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParametroTesoreria.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParametroTesoreria.setFileImportacion(this.jInternalFrameImportacionParametroTesoreria.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParametroTesoreria.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParametroTesoreria.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParametroTesoreria.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParametroTesoreria.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ParametroTesoreria> parametrotesoreriasSeleccionados=new ArrayList<ParametroTesoreria>();		

		parametrotesoreriasSeleccionados=this.getParametroTesoreriasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroTesoreria.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroTesoreria.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParametroTesoreriaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParametroTesoreriaBaseDesign.jrxml";
			
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
			
			this.generarReporteParametroTesorerias("Todos",parametrotesoreriasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Tesoreria",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParametroTesoreria.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroTesoreria.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroTesoreriaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_CONANTICIPOORDENCOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nAnticipoOrdenCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nAnticipoOrdenCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nAnticipoOrdenCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nAnticipoOrdenCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_PORLOTES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rLotes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rLotes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rLotes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rLotes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TransaccionCobrarPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TransaccionCobrarPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TransaccionCobrarPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TransaccionCobrarPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARDEBITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TransaccionCobrarDebito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TransaccionCobrarDebito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TransaccionCobrarDebito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TransaccionCobrarDebito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARCREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TransaccionCobrarCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TransaccionCobrarCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TransaccionCobrarCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TransaccionCobrarCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TransaccionPagarPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TransaccionPagarPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TransaccionPagarPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TransaccionPagarPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARDEBITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TransaccionPagarDebito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TransaccionPagarDebito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TransaccionPagarDebito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TransaccionPagarDebito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARCREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TransaccionPagarCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TransaccionPagarCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TransaccionPagarCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TransaccionPagarCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoParametroTesoreria.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParametroTesoreria.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParametroTesoreria.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParametroTesoreriaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_CONANTICIPOORDENCOMPRA:
					sNombreCampoCategoria="con_anticipo_orden_compra";
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_PORLOTES:
					sNombreCampoCategoria="por_lotes";
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARPAGO:
					sNombreCampoCategoria="id_transaccion_cobrar_pago";
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARDEBITO:
					sNombreCampoCategoria="id_transaccion_cobrar_debito";
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARCREDITO:
					sNombreCampoCategoria="id_transaccion_cobrar_credito";
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARPAGO:
					sNombreCampoCategoria="id_transaccion_pagar_pago";
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARDEBITO:
					sNombreCampoCategoria="id_transaccion_pagar_debito";
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARCREDITO:
					sNombreCampoCategoria="id_transaccion_pagar_credito";
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParametroTesoreria.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParametroTesoreriaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_CONANTICIPOORDENCOMPRA:
					sNombreCampoCategoriaValor="con_anticipo_orden_compra";
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_PORLOTES:
					sNombreCampoCategoriaValor="por_lotes";
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARPAGO:
					sNombreCampoCategoriaValor="id_transaccion_cobrar_pago";
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARDEBITO:
					sNombreCampoCategoriaValor="id_transaccion_cobrar_debito";
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARCREDITO:
					sNombreCampoCategoriaValor="id_transaccion_cobrar_credito";
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARPAGO:
					sNombreCampoCategoriaValor="id_transaccion_pagar_pago";
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARDEBITO:
					sNombreCampoCategoriaValor="id_transaccion_pagar_debito";
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARCREDITO:
					sNombreCampoCategoriaValor="id_transaccion_pagar_credito";
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParametroTesoreria.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroTesoreria.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroTesoreriaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_CONANTICIPOORDENCOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anticipo Orden Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_anticipo_orden_compra");
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_PORLOTES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Por Lotes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"por_lotes");
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion_cobrar_pago");
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARDEBITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion Debito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion_cobrar_debito");
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARCREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion_cobrar_credito");
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion Pago.",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion_pagar_pago");
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARDEBITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion Debito.",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion_pagar_debito");
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARCREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion Credito.",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion_pagar_credito");
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ParametroTesoreria> parametrotesoreriasSeleccionados=new ArrayList<ParametroTesoreria>();		
		
		parametrotesoreriasSeleccionados=this.getParametroTesoreriasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrotesoreria";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ParametroTesorerias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParametroTesoreria.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroTesoreria.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParametroTesoreriaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ParametroTesoreria parametrotesoreria:parametrotesoreriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrotesoreria.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_CONANTICIPOORDENCOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_CONANTICIPOORDENCOMPRA);
					iRow++;

					for(ParametroTesoreria parametrotesoreria:parametrotesoreriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrotesoreria.getcon_anticipo_orden_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_PORLOTES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_PORLOTES);
					iRow++;

					for(ParametroTesoreria parametrotesoreria:parametrotesoreriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrotesoreria.getpor_lotes());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARPAGO);
					iRow++;

					for(ParametroTesoreria parametrotesoreria:parametrotesoreriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrotesoreria.gettransaccioncobrarpago_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARDEBITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARDEBITO);
					iRow++;

					for(ParametroTesoreria parametrotesoreria:parametrotesoreriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrotesoreria.gettransaccioncobrardebito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARCREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARCREDITO);
					iRow++;

					for(ParametroTesoreria parametrotesoreria:parametrotesoreriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrotesoreria.gettransaccioncobrarcredito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARPAGO);
					iRow++;

					for(ParametroTesoreria parametrotesoreria:parametrotesoreriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrotesoreria.gettransaccionpagarpago_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARDEBITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARDEBITO);
					iRow++;

					for(ParametroTesoreria parametrotesoreria:parametrotesoreriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrotesoreria.gettransaccionpagardebito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARCREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARCREDITO);
					iRow++;

					for(ParametroTesoreria parametrotesoreria:parametrotesoreriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrotesoreria.gettransaccionpagarcredito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroTesoreriaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ParametroTesoreria parametrotesoreria:parametrotesoreriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrotesoreria.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelParametroTesoreria(row);				
			//	iRow++;
			//}				
			
			//for(ParametroTesoreria parametrotesoreriaAux:parametrotesoreriasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParametroTesoreria(parametrotesoreriaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Tesoreria",JOptionPane.INFORMATION_MESSAGE);
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
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroTesoreria(false);
			
			//SI ES MANUAL
			if(ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroTesoreria();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroTesoreria(false);
			
			//SI ES MANUAL
			if(ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroTesoreria();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroTesoreria(false);
			
			//SI ES MANUAL
			if(ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroTesoreria();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParametroTesoreria() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParametroTesoreria.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParametroTesoreria.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParametroTesoreria.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParametroTesoreria.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParametroTesoreria.setMinimumSize(dimensionMinimum);
		this.jTableDatosParametroTesoreria.setMaximumSize(dimensionMaximum);
		this.jTableDatosParametroTesoreria.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParametroTesoreria(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParametroTesoreria(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParametroTesoreria(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParametroTesoreria(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParametroTesoreria(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParametroTesoreria(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroTesoreria(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParametroTesoreria(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParametroTesoreria() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParametroTesoreria();
		
		this.inicializarActualizarBindingBotonesManualParametroTesoreria(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParametroTesoreria();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroTesoreria() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParametroTesoreria(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParametroTesoreria(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParametroTesoreria.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParametroTesoreria.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParametroTesoreria.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxPostAccionNuevoParametroTesoreria.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxPostAccionSinCerrarParametroTesoreria.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxPostAccionSinMensajeParametroTesoreria.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParametroTesoreria.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParametroTesoreria.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParametroTesoreria.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
				this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxPostAccionNuevoParametroTesoreria.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxPostAccionSinCerrarParametroTesoreria.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxPostAccionSinMensajeParametroTesoreria.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParametroTesoreria.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParametroTesoreria.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxTiposAccionesFormularioParametroTesoreria.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParametroTesoreria.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParametroTesoreria!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroTesoreria.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParametroTesoreria.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParametroTesoreria.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParametroTesoreria.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParametroTesoreria.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParametroTesoreria!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroTesoreria.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParametroTesoreria.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParametroTesoreria.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParametroTesoreria(Boolean esInicializar) throws Exception {
		try	{	
			if(ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParametroTesoreria(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParametroTesoreria() throws Exception {
		try	{
			if(ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroTesoreria();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroTesoreria() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxTiposAccionesFormularioParametroTesoreria.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxTiposAccionesFormularioParametroTesoreria.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroTesoreria() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParametroTesoreria.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParametroTesoreria.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParametroTesoreria.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParametroTesoreria.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParametroTesoreria.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParametroTesoreria.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParametroTesoreria.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParametroTesoreria.addItem(reporte);
			}
			
			
			if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParametroTesoreria.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParametroTesoreria.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParametroTesoreria.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParametroTesoreria.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParametroTesoreria.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParametroTesoreria.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxTiposAccionesFormularioParametroTesoreria.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxTiposAccionesFormularioParametroTesoreria.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParametroTesoreria.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParametroTesoreria.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParametroTesoreria.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroTesoreria();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroTesoreria() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroTesoreria!=null) {
				this.jInternalFrameReporteDinamicoParametroTesoreria.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroTesoreria.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroTesoreria!=null) {
				this.jInternalFrameReporteDinamicoParametroTesoreria.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroTesoreria.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParametroTesoreria!=null) {
				
				if(this.jInternalFrameReporteDinamicoParametroTesoreria.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroTesoreria.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroTesoreria.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParametroTesoreria.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroTesoreria.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroTesoreria.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParametroTesoreria()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria.getSelectedItem()!=null){this.id_transaccion_cobrar_creditoFK_IdTransaccionCobrarCredito=((Transaccion)this.jComboBoxid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCreditoParametroTesoreria.getSelectedItem()).getId();}
		if(this.jComboBoxid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria.getSelectedItem()!=null){this.id_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebito=((Transaccion)this.jComboBoxid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebitoParametroTesoreria.getSelectedItem()).getId();}
		if(this.jComboBoxid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria.getSelectedItem()!=null){this.id_transaccion_cobrar_pagoFK_IdTransaccionCobrarPago=((Transaccion)this.jComboBoxid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPagoParametroTesoreria.getSelectedItem()).getId();}
		if(this.jComboBoxid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria.getSelectedItem()!=null){this.id_transaccion_pagar_creditoFK_IdTransaccionPagarCredito=((Transaccion)this.jComboBoxid_transaccion_pagar_creditoFK_IdTransaccionPagarCreditoParametroTesoreria.getSelectedItem()).getId();}
		if(this.jComboBoxid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria.getSelectedItem()!=null){this.id_transaccion_pagar_debitoFK_IdTransaccionPagarDebito=((Transaccion)this.jComboBoxid_transaccion_pagar_debitoFK_IdTransaccionPagarDebitoParametroTesoreria.getSelectedItem()).getId();}
		if(this.jComboBoxid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria.getSelectedItem()!=null){this.id_transaccion_pagar_pagoFK_IdTransaccionPagarPago=((Transaccion)this.jComboBoxid_transaccion_pagar_pagoFK_IdTransaccionPagarPagoParametroTesoreria.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParametroTesoreria(Boolean esInicializar) throws Exception {				
		if(ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParametroTesoreria();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParametroTesoreria() throws Exception {
		this.inicializarActualizarBindingTablaParametroTesoreria(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParametroTesoreria() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParametroTesoreria.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParametroTesoreria.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroTesoreria.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParametroTesoreriaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParametroTesoreria.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroTesoreria.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParametroTesoreriaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParametroTesoreriaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreriaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParametroTesoreriaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParametroTesoreria.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroTesoreria.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParametroTesoreriaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParametroTesoreria.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParametroTesoreria(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parametrotesoreriaLogic.getParametroTesorerias().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parametrotesorerias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParametroTesoreria.setModel(new ParametroTesoreriaModel(this.parametrotesoreriaLogic.getParametroTesorerias(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParametroTesoreria.setModel(new ParametroTesoreriaModel(this.parametrotesorerias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParametroTesoreria!=null && this.jInternalFrameOrderByParametroTesoreria.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParametroTesoreria();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParametroTesoreriaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO,parametrotesoreriaConstantesFunciones.resaltarSeleccionarParametroTesoreria,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO,parametrotesoreriaConstantesFunciones.resaltarSeleccionarParametroTesoreria,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,ParametroTesoreriaConstantesFunciones.LABEL_ID));

		if(this.parametrotesoreriaConstantesFunciones.mostraridParametroTesoreria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroTesoreriaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametrotesoreriaConstantesFunciones.resaltaridParametroTesoreria,this.parametrotesoreriaConstantesFunciones.activaridParametroTesoreria,this,true,"idParametroTesoreria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrotesoreriaConstantesFunciones.resaltaridParametroTesoreria,this.parametrotesoreriaConstantesFunciones.activaridParametroTesoreria,this,true,"idParametroTesoreria","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,ParametroTesoreriaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.parametrotesoreriaConstantesFunciones.mostrarid_empresaParametroTesoreria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroTesoreriaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.parametrotesoreriaConstantesFunciones.resaltarid_empresaParametroTesoreria,this,this.parametrotesoreriaConstantesFunciones.activarid_empresaParametroTesoreria));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.parametrotesoreriaConstantesFunciones.resaltarid_empresaParametroTesoreria,this,this.parametrotesoreriaConstantesFunciones.activarid_empresaParametroTesoreria,false,"id_empresaParametroTesoreria","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroTesoreriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,ParametroTesoreriaConstantesFunciones.LABEL_CONANTICIPOORDENCOMPRA));

		if(this.parametrotesoreriaConstantesFunciones.mostrarcon_anticipo_orden_compraParametroTesoreria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroTesoreriaConstantesFunciones.LABEL_CONANTICIPOORDENCOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametrotesoreriaConstantesFunciones.resaltarcon_anticipo_orden_compraParametroTesoreria,this.parametrotesoreriaConstantesFunciones.activarcon_anticipo_orden_compraParametroTesoreria));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametrotesoreriaConstantesFunciones.resaltarcon_anticipo_orden_compraParametroTesoreria,this.parametrotesoreriaConstantesFunciones.activarcon_anticipo_orden_compraParametroTesoreria,this,true,"con_anticipo_orden_compraParametroTesoreria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroTesoreriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,ParametroTesoreriaConstantesFunciones.LABEL_PORLOTES));

		if(this.parametrotesoreriaConstantesFunciones.mostrarpor_lotesParametroTesoreria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroTesoreriaConstantesFunciones.LABEL_PORLOTES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametrotesoreriaConstantesFunciones.resaltarpor_lotesParametroTesoreria,this.parametrotesoreriaConstantesFunciones.activarpor_lotesParametroTesoreria));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametrotesoreriaConstantesFunciones.resaltarpor_lotesParametroTesoreria,this.parametrotesoreriaConstantesFunciones.activarpor_lotesParametroTesoreria,this,true,"por_lotesParametroTesoreria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroTesoreriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARPAGO));

		if(this.parametrotesoreriaConstantesFunciones.mostrarid_transaccion_cobrar_pagoParametroTesoreria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARPAGO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccioncobrarpagosForeignKey,this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_cobrar_pagoParametroTesoreria,this,this.parametrotesoreriaConstantesFunciones.activarid_transaccion_cobrar_pagoParametroTesoreria));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccioncobrarpagosForeignKey,this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_cobrar_pagoParametroTesoreria,this,this.parametrotesoreriaConstantesFunciones.activarid_transaccion_cobrar_pagoParametroTesoreria,true,"id_transaccion_cobrar_pagoParametroTesoreria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new ParametroTesoreriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARDEBITO));

		if(this.parametrotesoreriaConstantesFunciones.mostrarid_transaccion_cobrar_debitoParametroTesoreria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARDEBITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccioncobrardebitosForeignKey,this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_cobrar_debitoParametroTesoreria,this,this.parametrotesoreriaConstantesFunciones.activarid_transaccion_cobrar_debitoParametroTesoreria));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccioncobrardebitosForeignKey,this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_cobrar_debitoParametroTesoreria,this,this.parametrotesoreriaConstantesFunciones.activarid_transaccion_cobrar_debitoParametroTesoreria,true,"id_transaccion_cobrar_debitoParametroTesoreria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new ParametroTesoreriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARCREDITO));

		if(this.parametrotesoreriaConstantesFunciones.mostrarid_transaccion_cobrar_creditoParametroTesoreria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARCREDITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccioncobrarcreditosForeignKey,this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_cobrar_creditoParametroTesoreria,this,this.parametrotesoreriaConstantesFunciones.activarid_transaccion_cobrar_creditoParametroTesoreria));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccioncobrarcreditosForeignKey,this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_cobrar_creditoParametroTesoreria,this,this.parametrotesoreriaConstantesFunciones.activarid_transaccion_cobrar_creditoParametroTesoreria,true,"id_transaccion_cobrar_creditoParametroTesoreria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new ParametroTesoreriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARPAGO));

		if(this.parametrotesoreriaConstantesFunciones.mostrarid_transaccion_pagar_pagoParametroTesoreria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARPAGO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccionpagarpagosForeignKey,this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_pagar_pagoParametroTesoreria,this,this.parametrotesoreriaConstantesFunciones.activarid_transaccion_pagar_pagoParametroTesoreria));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccionpagarpagosForeignKey,this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_pagar_pagoParametroTesoreria,this,this.parametrotesoreriaConstantesFunciones.activarid_transaccion_pagar_pagoParametroTesoreria,true,"id_transaccion_pagar_pagoParametroTesoreria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new ParametroTesoreriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARDEBITO));

		if(this.parametrotesoreriaConstantesFunciones.mostrarid_transaccion_pagar_debitoParametroTesoreria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARDEBITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccionpagardebitosForeignKey,this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_pagar_debitoParametroTesoreria,this,this.parametrotesoreriaConstantesFunciones.activarid_transaccion_pagar_debitoParametroTesoreria));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccionpagardebitosForeignKey,this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_pagar_debitoParametroTesoreria,this,this.parametrotesoreriaConstantesFunciones.activarid_transaccion_pagar_debitoParametroTesoreria,true,"id_transaccion_pagar_debitoParametroTesoreria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new ParametroTesoreriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARCREDITO));

		if(this.parametrotesoreriaConstantesFunciones.mostrarid_transaccion_pagar_creditoParametroTesoreria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARCREDITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccionpagarcreditosForeignKey,this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_pagar_creditoParametroTesoreria,this,this.parametrotesoreriaConstantesFunciones.activarid_transaccion_pagar_creditoParametroTesoreria));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccionpagarcreditosForeignKey,this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_pagar_creditoParametroTesoreria,this,this.parametrotesoreriaConstantesFunciones.activarid_transaccion_pagar_creditoParametroTesoreria,true,"id_transaccion_pagar_creditoParametroTesoreria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new ParametroTesoreriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,ParametroTesoreriaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.parametrotesoreriaConstantesFunciones.mostrardescripcionParametroTesoreria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroTesoreriaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametrotesoreriaConstantesFunciones.resaltardescripcionParametroTesoreria,this.parametrotesoreriaConstantesFunciones.activardescripcionParametroTesoreria,this,true,"descripcionParametroTesoreria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrotesoreriaConstantesFunciones.resaltardescripcionParametroTesoreria,this.parametrotesoreriaConstantesFunciones.activardescripcionParametroTesoreria,this,true,"descripcionParametroTesoreria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroTesoreriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroTesoreria.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroTesoreria.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParametroTesoreria && this.isPermisoGuardarCambiosParametroTesoreria) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParametroTesoreria.addColumn(tableColumn);
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
			
			this.jTableDatosParametroTesoreria.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroTesoreria && this.isPermisoGuardarCambiosParametroTesoreria) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroTesoreria && this.isPermisoGuardarCambiosParametroTesoreria) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParametroTesoreria.moveColumn(this.jTableDatosParametroTesoreria.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParametroTesoreria.moveColumn(this.jTableDatosParametroTesoreria.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParametroTesoreria.moveColumn(this.jTableDatosParametroTesoreria.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParametroTesoreria.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParametroTesoreria.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParametroTesoreria,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParametroTesoreria.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParametroTesoreria.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParametroTesoreria.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParametroTesoreria.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParametroTesoreria.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parametrotesoreriaLogic.getParametroTesorerias().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parametrotesorerias.size()-1;
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
		//this.jTableDatosParametroTesoreria.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParametroTesoreria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParametroTesoreria();
			
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
				
				//this.isEsNuevoParametroTesoreria=false;
					
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
			
				if(this.parametrotesoreriaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParametroTesoreria==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroTesoreria.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroTesoreria.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parametrotesoreria.getsType().equals("DUPLICADO")
				   || this.parametrotesoreria.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParametroTesoreria=true;
				
				} else {
					this.isEsNuevoParametroTesoreria=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
					if(this.parametrotesoreria.getId()>=0 && !this.parametrotesoreria.getIsNew()) {						
						this.isEsNuevoParametroTesoreria=false;
						
					} else {
						this.isEsNuevoParametroTesoreria=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParametroTesoreria(esRelaciones);						
				
				this.seleccionarParametroTesoreria(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parametrotesoreria.getId()<0) {
					this.isEsNuevoParametroTesoreria=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParametroTesoreria(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParametroTesoreria(evt,rowIndex);
				}	
				
				if(this.parametrotesoreriaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ParametroTesoreria: " + this.dDif); 
					}
				}								
				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParametroTesoreria(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parametrotesoreria)) {
					if(this.parametrotesoreria.getId()>0) {
						this.parametrotesoreria.setIsDeleted(true);
						
						this.parametrotesoreriasEliminados.add(this.parametrotesoreria);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrotesoreriaLogic.getParametroTesorerias().remove(this.parametrotesoreria);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrotesorerias.remove(this.parametrotesoreria);				
					}
					
					
					((ParametroTesoreriaModel) this.jTableDatosParametroTesoreria.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroTesoreria(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParametroTesoreria(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParametroTesoreria) {
			
			if(this.jInternalFrameDetalleFormParametroTesoreria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroTesoreria.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroTesoreria.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParametroTesoreria(this.parametrotesoreria);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.parametrotesoreriaConstantesFunciones.cargarid_empresaParametroTesoreria || this.parametrotesoreriaConstantesFunciones.event_dependid_empresaParametroTesoreria) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.parametrotesoreria.getid_empresa());
									//this.inicializarActualizarBindingParametroTesoreria(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(parametrotesoreria.getEmpresa()!=null) {
							this.empresasForeignKey.add(parametrotesoreria.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.parametrotesoreria.getid_empresa(),false,"Formulario");

					//TransaccionCobrarPago
					if(!this.parametrotesoreriaConstantesFunciones.cargarid_transaccion_cobrar_pagoParametroTesoreria || this.parametrotesoreriaConstantesFunciones.event_dependid_transaccion_cobrar_pagoParametroTesoreria) {
						//this.cargarCombosTransaccionCobrarPagosForeignKeyLista(" where id="+this.parametrotesoreria.getid_transaccion_cobrar_pago());
									//this.inicializarActualizarBindingParametroTesoreria(false,false);
						this.transaccioncobrarpagosForeignKey=new ArrayList<Transaccion>();

						if(parametrotesoreria.getTransaccionCobrarPago()!=null) {
							this.transaccioncobrarpagosForeignKey.add(parametrotesoreria.getTransaccionCobrarPago());
						}

						this.addItemDefectoCombosForeignKeyTransaccionCobrarPago();
						this.cargarCombosFrameTransaccionCobrarPagosForeignKey("Todos");
					}
					this.setActualTransaccionCobrarPagoForeignKey(this.parametrotesoreria.getid_transaccion_cobrar_pago(),false,"Formulario");

					//TransaccionCobrarDebito
					if(!this.parametrotesoreriaConstantesFunciones.cargarid_transaccion_cobrar_debitoParametroTesoreria || this.parametrotesoreriaConstantesFunciones.event_dependid_transaccion_cobrar_debitoParametroTesoreria) {
						//this.cargarCombosTransaccionCobrarDebitosForeignKeyLista(" where id="+this.parametrotesoreria.getid_transaccion_cobrar_debito());
									//this.inicializarActualizarBindingParametroTesoreria(false,false);
						this.transaccioncobrardebitosForeignKey=new ArrayList<Transaccion>();

						if(parametrotesoreria.getTransaccionCobrarDebito()!=null) {
							this.transaccioncobrardebitosForeignKey.add(parametrotesoreria.getTransaccionCobrarDebito());
						}

						this.addItemDefectoCombosForeignKeyTransaccionCobrarDebito();
						this.cargarCombosFrameTransaccionCobrarDebitosForeignKey("Todos");
					}
					this.setActualTransaccionCobrarDebitoForeignKey(this.parametrotesoreria.getid_transaccion_cobrar_debito(),false,"Formulario");

					//TransaccionCobrarCredito
					if(!this.parametrotesoreriaConstantesFunciones.cargarid_transaccion_cobrar_creditoParametroTesoreria || this.parametrotesoreriaConstantesFunciones.event_dependid_transaccion_cobrar_creditoParametroTesoreria) {
						//this.cargarCombosTransaccionCobrarCreditosForeignKeyLista(" where id="+this.parametrotesoreria.getid_transaccion_cobrar_credito());
									//this.inicializarActualizarBindingParametroTesoreria(false,false);
						this.transaccioncobrarcreditosForeignKey=new ArrayList<Transaccion>();

						if(parametrotesoreria.getTransaccionCobrarCredito()!=null) {
							this.transaccioncobrarcreditosForeignKey.add(parametrotesoreria.getTransaccionCobrarCredito());
						}

						this.addItemDefectoCombosForeignKeyTransaccionCobrarCredito();
						this.cargarCombosFrameTransaccionCobrarCreditosForeignKey("Todos");
					}
					this.setActualTransaccionCobrarCreditoForeignKey(this.parametrotesoreria.getid_transaccion_cobrar_credito(),false,"Formulario");

					//TransaccionPagarPago
					if(!this.parametrotesoreriaConstantesFunciones.cargarid_transaccion_pagar_pagoParametroTesoreria || this.parametrotesoreriaConstantesFunciones.event_dependid_transaccion_pagar_pagoParametroTesoreria) {
						//this.cargarCombosTransaccionPagarPagosForeignKeyLista(" where id="+this.parametrotesoreria.getid_transaccion_pagar_pago());
									//this.inicializarActualizarBindingParametroTesoreria(false,false);
						this.transaccionpagarpagosForeignKey=new ArrayList<Transaccion>();

						if(parametrotesoreria.getTransaccionPagarPago()!=null) {
							this.transaccionpagarpagosForeignKey.add(parametrotesoreria.getTransaccionPagarPago());
						}

						this.addItemDefectoCombosForeignKeyTransaccionPagarPago();
						this.cargarCombosFrameTransaccionPagarPagosForeignKey("Todos");
					}
					this.setActualTransaccionPagarPagoForeignKey(this.parametrotesoreria.getid_transaccion_pagar_pago(),false,"Formulario");

					//TransaccionPagarDebito
					if(!this.parametrotesoreriaConstantesFunciones.cargarid_transaccion_pagar_debitoParametroTesoreria || this.parametrotesoreriaConstantesFunciones.event_dependid_transaccion_pagar_debitoParametroTesoreria) {
						//this.cargarCombosTransaccionPagarDebitosForeignKeyLista(" where id="+this.parametrotesoreria.getid_transaccion_pagar_debito());
									//this.inicializarActualizarBindingParametroTesoreria(false,false);
						this.transaccionpagardebitosForeignKey=new ArrayList<Transaccion>();

						if(parametrotesoreria.getTransaccionPagarDebito()!=null) {
							this.transaccionpagardebitosForeignKey.add(parametrotesoreria.getTransaccionPagarDebito());
						}

						this.addItemDefectoCombosForeignKeyTransaccionPagarDebito();
						this.cargarCombosFrameTransaccionPagarDebitosForeignKey("Todos");
					}
					this.setActualTransaccionPagarDebitoForeignKey(this.parametrotesoreria.getid_transaccion_pagar_debito(),false,"Formulario");

					//TransaccionPagarCredito
					if(!this.parametrotesoreriaConstantesFunciones.cargarid_transaccion_pagar_creditoParametroTesoreria || this.parametrotesoreriaConstantesFunciones.event_dependid_transaccion_pagar_creditoParametroTesoreria) {
						//this.cargarCombosTransaccionPagarCreditosForeignKeyLista(" where id="+this.parametrotesoreria.getid_transaccion_pagar_credito());
									//this.inicializarActualizarBindingParametroTesoreria(false,false);
						this.transaccionpagarcreditosForeignKey=new ArrayList<Transaccion>();

						if(parametrotesoreria.getTransaccionPagarCredito()!=null) {
							this.transaccionpagarcreditosForeignKey.add(parametrotesoreria.getTransaccionPagarCredito());
						}

						this.addItemDefectoCombosForeignKeyTransaccionPagarCredito();
						this.cargarCombosFrameTransaccionPagarCreditosForeignKey("Todos");
					}
					this.setActualTransaccionPagarCreditoForeignKey(this.parametrotesoreria.getid_transaccion_pagar_credito(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParametroTesoreria("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParametroTesoreria(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroTesoreria() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroTesoreria(ParametroTesoreria parametrotesoreria) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParametroTesoreria(parametrotesoreria,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroTesoreria(ParametroTesoreria parametrotesoreria,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParametroTesoreria(parametrotesoreria);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParametroTesoreria(parametrotesoreria,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParametroTesoreria(parametrotesoreria);
	}
	
	public void setVariablesObjetoActualToFormularioParametroTesoreria(ParametroTesoreria parametrotesoreria) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParametroTesoreria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParametroTesoreria.jLabelidParametroTesoreria.setText(parametrotesoreria.getId().toString());
			this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxcon_anticipo_orden_compraParametroTesoreria.setSelected(parametrotesoreria.getcon_anticipo_orden_compra());
			this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxpor_lotesParametroTesoreria.setSelected(parametrotesoreria.getpor_lotes());
			this.jInternalFrameDetalleFormParametroTesoreria.jTextAreadescripcionParametroTesoreria.setText(parametrotesoreria.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ParametroTesoreria parametrotesoreriaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parametrotesoreriaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ParametroTesoreria parametrotesoreriaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parametrotesoreriaLocal=this.parametrotesoreria;
			} else {
				parametrotesoreriaLocal=this.parametrotesoreriaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parametrotesoreriaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParametroTesoreria(parametrotesoreriaLocal,true);
					
					if(parametrotesoreriaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parametrotesoreriaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parametrotesoreriaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParametroTesoreria(ParametroTesoreria parametrotesoreria,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroTesoreria(parametrotesoreria,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(parametrotesoreria);
	}
	
	public void setVariablesFormularioToObjetoActualParametroTesoreria(ParametroTesoreria parametrotesoreria,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroTesoreria(parametrotesoreria,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParametroTesoreria(ParametroTesoreria parametrotesoreria,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParametroTesoreria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParametroTesoreria.jLabelidParametroTesoreria.getText()==null || this.jInternalFrameDetalleFormParametroTesoreria.jLabelidParametroTesoreria.getText()=="" || this.jInternalFrameDetalleFormParametroTesoreria.jLabelidParametroTesoreria.getText()=="Id") {
				this.jInternalFrameDetalleFormParametroTesoreria.jLabelidParametroTesoreria.setText("0");
			}

			if(conColumnasBase) {parametrotesoreria.setId(Long.parseLong(this.jInternalFrameDetalleFormParametroTesoreria.jLabelidParametroTesoreria.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroTesoreriaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroTesoreria.jLabelIdParametroTesoreria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrotesoreria.setcon_anticipo_orden_compra(this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxcon_anticipo_orden_compraParametroTesoreria.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroTesoreriaConstantesFunciones.LABEL_CONANTICIPOORDENCOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroTesoreria.jLabelcon_anticipo_orden_compraParametroTesoreria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrotesoreria.setpor_lotes(this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxpor_lotesParametroTesoreria.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroTesoreriaConstantesFunciones.LABEL_PORLOTES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroTesoreria.jLabelpor_lotesParametroTesoreria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrotesoreria.setdescripcion(this.jInternalFrameDetalleFormParametroTesoreria.jTextAreadescripcionParametroTesoreria.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroTesoreriaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroTesoreria.jLabeldescripcionParametroTesoreria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroTesoreria(ParametroTesoreria parametrotesoreriaBean,ParametroTesoreria parametrotesoreria,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && parametrotesoreriaBean.getid_transaccion_cobrar_pago()!=null && !parametrotesoreriaBean.getid_transaccion_cobrar_pago().equals(-1L))) {parametrotesoreria.setid_transaccion_cobrar_pago(parametrotesoreriaBean.getid_transaccion_cobrar_pago());}
			if(conDefault || (!conDefault && parametrotesoreriaBean.getid_transaccion_cobrar_debito()!=null && !parametrotesoreriaBean.getid_transaccion_cobrar_debito().equals(-1L))) {parametrotesoreria.setid_transaccion_cobrar_debito(parametrotesoreriaBean.getid_transaccion_cobrar_debito());}
			if(conDefault || (!conDefault && parametrotesoreriaBean.getid_transaccion_cobrar_credito()!=null && !parametrotesoreriaBean.getid_transaccion_cobrar_credito().equals(-1L))) {parametrotesoreria.setid_transaccion_cobrar_credito(parametrotesoreriaBean.getid_transaccion_cobrar_credito());}
			if(conDefault || (!conDefault && parametrotesoreriaBean.getid_transaccion_pagar_pago()!=null && !parametrotesoreriaBean.getid_transaccion_pagar_pago().equals(-1L))) {parametrotesoreria.setid_transaccion_pagar_pago(parametrotesoreriaBean.getid_transaccion_pagar_pago());}
			if(conDefault || (!conDefault && parametrotesoreriaBean.getid_transaccion_pagar_debito()!=null && !parametrotesoreriaBean.getid_transaccion_pagar_debito().equals(-1L))) {parametrotesoreria.setid_transaccion_pagar_debito(parametrotesoreriaBean.getid_transaccion_pagar_debito());}
			if(conDefault || (!conDefault && parametrotesoreriaBean.getid_transaccion_pagar_credito()!=null && !parametrotesoreriaBean.getid_transaccion_pagar_credito().equals(-1L))) {parametrotesoreria.setid_transaccion_pagar_credito(parametrotesoreriaBean.getid_transaccion_pagar_credito());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParametroTesoreria(ParametroTesoreria parametrotesoreriaOrigen,ParametroTesoreria parametrotesoreria,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrotesoreriaOrigen.getId()!=null && !parametrotesoreriaOrigen.getId().equals(0L))) {parametrotesoreria.setId(parametrotesoreriaOrigen.getId());}}
			if(conDefault || (!conDefault && parametrotesoreriaOrigen.getcon_anticipo_orden_compra()!=null && !parametrotesoreriaOrigen.getcon_anticipo_orden_compra().equals(false))) {parametrotesoreria.setcon_anticipo_orden_compra(parametrotesoreriaOrigen.getcon_anticipo_orden_compra());}
			if(conDefault || (!conDefault && parametrotesoreriaOrigen.getpor_lotes()!=null && !parametrotesoreriaOrigen.getpor_lotes().equals(false))) {parametrotesoreria.setpor_lotes(parametrotesoreriaOrigen.getpor_lotes());}
			if(conDefault || (!conDefault && parametrotesoreriaOrigen.getid_transaccion_cobrar_pago()!=null && !parametrotesoreriaOrigen.getid_transaccion_cobrar_pago().equals(-1L))) {parametrotesoreria.setid_transaccion_cobrar_pago(parametrotesoreriaOrigen.getid_transaccion_cobrar_pago());}
			if(conDefault || (!conDefault && parametrotesoreriaOrigen.getid_transaccion_cobrar_debito()!=null && !parametrotesoreriaOrigen.getid_transaccion_cobrar_debito().equals(-1L))) {parametrotesoreria.setid_transaccion_cobrar_debito(parametrotesoreriaOrigen.getid_transaccion_cobrar_debito());}
			if(conDefault || (!conDefault && parametrotesoreriaOrigen.getid_transaccion_cobrar_credito()!=null && !parametrotesoreriaOrigen.getid_transaccion_cobrar_credito().equals(-1L))) {parametrotesoreria.setid_transaccion_cobrar_credito(parametrotesoreriaOrigen.getid_transaccion_cobrar_credito());}
			if(conDefault || (!conDefault && parametrotesoreriaOrigen.getid_transaccion_pagar_pago()!=null && !parametrotesoreriaOrigen.getid_transaccion_pagar_pago().equals(-1L))) {parametrotesoreria.setid_transaccion_pagar_pago(parametrotesoreriaOrigen.getid_transaccion_pagar_pago());}
			if(conDefault || (!conDefault && parametrotesoreriaOrigen.getid_transaccion_pagar_debito()!=null && !parametrotesoreriaOrigen.getid_transaccion_pagar_debito().equals(-1L))) {parametrotesoreria.setid_transaccion_pagar_debito(parametrotesoreriaOrigen.getid_transaccion_pagar_debito());}
			if(conDefault || (!conDefault && parametrotesoreriaOrigen.getid_transaccion_pagar_credito()!=null && !parametrotesoreriaOrigen.getid_transaccion_pagar_credito().equals(-1L))) {parametrotesoreria.setid_transaccion_pagar_credito(parametrotesoreriaOrigen.getid_transaccion_pagar_credito());}
			if(conDefault || (!conDefault && parametrotesoreriaOrigen.getdescripcion()!=null && !parametrotesoreriaOrigen.getdescripcion().equals(""))) {parametrotesoreria.setdescripcion(parametrotesoreriaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroTesoreria(ParametroTesoreria parametrotesoreria) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroTesoreria.jLabelidParametroTesoreria.setText(parametrotesoreria.getId().toString());
			this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxcon_anticipo_orden_compraParametroTesoreria.setSelected(parametrotesoreria.getcon_anticipo_orden_compra());
			this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxpor_lotesParametroTesoreria.setSelected(parametrotesoreria.getpor_lotes());
			this.jInternalFrameDetalleFormParametroTesoreria.jTextAreadescripcionParametroTesoreria.setText(parametrotesoreria.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroTesoreria(ParametroTesoreriaBean parametrotesoreriaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroTesoreria.jLabelidParametroTesoreria.setText(parametrotesoreriaBean.getId().toString());
			this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxcon_anticipo_orden_compraParametroTesoreria.setSelected(parametrotesoreriaBean.getcon_anticipo_orden_compra());
			this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxpor_lotesParametroTesoreria.setSelected(parametrotesoreriaBean.getpor_lotes());
			this.jInternalFrameDetalleFormParametroTesoreria.jTextAreadescripcionParametroTesoreria.setText(parametrotesoreriaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParametroTesoreria(ParametroTesoreriaParameterReturnGeneral parametrotesoreriaReturnGeneral,ParametroTesoreriaBean parametrotesoreriaBean,Boolean conDefault) throws Exception { 
		try {
			ParametroTesoreria parametrotesoreriaLocal=new ParametroTesoreria();
			
			parametrotesoreriaLocal=parametrotesoreriaReturnGeneral.getParametroTesoreria();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrotesoreriaLocal.getId()!=null && !parametrotesoreriaLocal.getId().equals(0L))) {parametrotesoreriaBean.setId(parametrotesoreriaLocal.getId());}}
			if(conDefault || (!conDefault && parametrotesoreriaLocal.getcon_anticipo_orden_compra()!=null && !parametrotesoreriaLocal.getcon_anticipo_orden_compra().equals(false))) {parametrotesoreriaBean.setcon_anticipo_orden_compra(parametrotesoreriaLocal.getcon_anticipo_orden_compra());}
			if(conDefault || (!conDefault && parametrotesoreriaLocal.getpor_lotes()!=null && !parametrotesoreriaLocal.getpor_lotes().equals(false))) {parametrotesoreriaBean.setpor_lotes(parametrotesoreriaLocal.getpor_lotes());}
			if(conDefault || (!conDefault && parametrotesoreriaLocal.getid_transaccion_cobrar_pago()!=null && !parametrotesoreriaLocal.getid_transaccion_cobrar_pago().equals(-1L))) {parametrotesoreriaBean.setid_transaccion_cobrar_pago(parametrotesoreriaLocal.getid_transaccion_cobrar_pago());}
			if(conDefault || (!conDefault && parametrotesoreriaLocal.getid_transaccion_cobrar_debito()!=null && !parametrotesoreriaLocal.getid_transaccion_cobrar_debito().equals(-1L))) {parametrotesoreriaBean.setid_transaccion_cobrar_debito(parametrotesoreriaLocal.getid_transaccion_cobrar_debito());}
			if(conDefault || (!conDefault && parametrotesoreriaLocal.getid_transaccion_cobrar_credito()!=null && !parametrotesoreriaLocal.getid_transaccion_cobrar_credito().equals(-1L))) {parametrotesoreriaBean.setid_transaccion_cobrar_credito(parametrotesoreriaLocal.getid_transaccion_cobrar_credito());}
			if(conDefault || (!conDefault && parametrotesoreriaLocal.getid_transaccion_pagar_pago()!=null && !parametrotesoreriaLocal.getid_transaccion_pagar_pago().equals(-1L))) {parametrotesoreriaBean.setid_transaccion_pagar_pago(parametrotesoreriaLocal.getid_transaccion_pagar_pago());}
			if(conDefault || (!conDefault && parametrotesoreriaLocal.getid_transaccion_pagar_debito()!=null && !parametrotesoreriaLocal.getid_transaccion_pagar_debito().equals(-1L))) {parametrotesoreriaBean.setid_transaccion_pagar_debito(parametrotesoreriaLocal.getid_transaccion_pagar_debito());}
			if(conDefault || (!conDefault && parametrotesoreriaLocal.getid_transaccion_pagar_credito()!=null && !parametrotesoreriaLocal.getid_transaccion_pagar_credito().equals(-1L))) {parametrotesoreriaBean.setid_transaccion_pagar_credito(parametrotesoreriaLocal.getid_transaccion_pagar_credito());}
			if(conDefault || (!conDefault && parametrotesoreriaLocal.getdescripcion()!=null && !parametrotesoreriaLocal.getdescripcion().equals(""))) {parametrotesoreriaBean.setdescripcion(parametrotesoreriaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParametroTesoreriaGenerico(Long idParametroTesoreriaSeleccionado,JComboBox jComboBoxParametroTesoreria,List<ParametroTesoreria> parametrotesoreriasLocal)throws Exception {
		try {
			ParametroTesoreria  parametrotesoreriaTemp=null;

			for(ParametroTesoreria parametrotesoreriaAux:parametrotesoreriasLocal) {
				if(parametrotesoreriaAux.getId()!=null && parametrotesoreriaAux.getId().equals(idParametroTesoreriaSeleccionado)) {
					parametrotesoreriaTemp=parametrotesoreriaAux;
					break;
				}
			}

			jComboBoxParametroTesoreria.setSelectedItem(parametrotesoreriaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParametroTesoreriaGenerico(JComboBox jComboBoxParametroTesoreria,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroTesoreria.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParametroTesoreria.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroTesoreria.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParametroTesoreria.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrotesoreria=(ParametroTesoreria) parametrotesoreriaLogic.getParametroTesorerias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrotesoreria =(ParametroTesoreria) parametrotesorerias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!parametrotesoreria.getIsNew() && !parametrotesoreria.getIsChanged() && !parametrotesoreria.getIsDeleted()) {
				sDescripcion=parametrotesoreria.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=parametrotesoreria.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TransaccionCobrarPago")) {
			//sDescripcion=this.getActualTransaccionCobrarPagoForeignKeyDescripcion((Long)value);
			if(!parametrotesoreria.getIsNew() && !parametrotesoreria.getIsChanged() && !parametrotesoreria.getIsDeleted()) {
				sDescripcion=parametrotesoreria.gettransaccioncobrarpago_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionCobrarPagoForeignKeyDescripcion((Long)value);
				sDescripcion=parametrotesoreria.gettransaccioncobrarpago_descripcion();
			}
		}

		if(sTipo.equals("TransaccionCobrarDebito")) {
			//sDescripcion=this.getActualTransaccionCobrarDebitoForeignKeyDescripcion((Long)value);
			if(!parametrotesoreria.getIsNew() && !parametrotesoreria.getIsChanged() && !parametrotesoreria.getIsDeleted()) {
				sDescripcion=parametrotesoreria.gettransaccioncobrardebito_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionCobrarDebitoForeignKeyDescripcion((Long)value);
				sDescripcion=parametrotesoreria.gettransaccioncobrardebito_descripcion();
			}
		}

		if(sTipo.equals("TransaccionCobrarCredito")) {
			//sDescripcion=this.getActualTransaccionCobrarCreditoForeignKeyDescripcion((Long)value);
			if(!parametrotesoreria.getIsNew() && !parametrotesoreria.getIsChanged() && !parametrotesoreria.getIsDeleted()) {
				sDescripcion=parametrotesoreria.gettransaccioncobrarcredito_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionCobrarCreditoForeignKeyDescripcion((Long)value);
				sDescripcion=parametrotesoreria.gettransaccioncobrarcredito_descripcion();
			}
		}

		if(sTipo.equals("TransaccionPagarPago")) {
			//sDescripcion=this.getActualTransaccionPagarPagoForeignKeyDescripcion((Long)value);
			if(!parametrotesoreria.getIsNew() && !parametrotesoreria.getIsChanged() && !parametrotesoreria.getIsDeleted()) {
				sDescripcion=parametrotesoreria.gettransaccionpagarpago_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionPagarPagoForeignKeyDescripcion((Long)value);
				sDescripcion=parametrotesoreria.gettransaccionpagarpago_descripcion();
			}
		}

		if(sTipo.equals("TransaccionPagarDebito")) {
			//sDescripcion=this.getActualTransaccionPagarDebitoForeignKeyDescripcion((Long)value);
			if(!parametrotesoreria.getIsNew() && !parametrotesoreria.getIsChanged() && !parametrotesoreria.getIsDeleted()) {
				sDescripcion=parametrotesoreria.gettransaccionpagardebito_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionPagarDebitoForeignKeyDescripcion((Long)value);
				sDescripcion=parametrotesoreria.gettransaccionpagardebito_descripcion();
			}
		}

		if(sTipo.equals("TransaccionPagarCredito")) {
			//sDescripcion=this.getActualTransaccionPagarCreditoForeignKeyDescripcion((Long)value);
			if(!parametrotesoreria.getIsNew() && !parametrotesoreria.getIsChanged() && !parametrotesoreria.getIsDeleted()) {
				sDescripcion=parametrotesoreria.gettransaccionpagarcredito_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionPagarCreditoForeignKeyDescripcion((Long)value);
				sDescripcion=parametrotesoreria.gettransaccionpagarcredito_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParametroTesoreria parametrotesoreriaRow=new ParametroTesoreria();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrotesoreriaRow=(ParametroTesoreria) parametrotesoreriaLogic.getParametroTesorerias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrotesoreriaRow=(ParametroTesoreria) parametrotesorerias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParametroTesoreria(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParametroTesoreria.setVisible((this.isVisibilidadCeldaNuevoParametroTesoreria && this.isPermisoNuevoParametroTesoreria));			
			this.jButtonDuplicarParametroTesoreria.setVisible((this.isVisibilidadCeldaDuplicarParametroTesoreria && this.isPermisoDuplicarParametroTesoreria));			
			this.jButtonCopiarParametroTesoreria.setVisible((this.isVisibilidadCeldaCopiarParametroTesoreria && this.isPermisoCopiarParametroTesoreria));
			this.jButtonVerFormParametroTesoreria.setVisible((this.isVisibilidadCeldaVerFormParametroTesoreria && this.isPermisoVerFormParametroTesoreria));
			
			this.jButtonAbrirOrderByParametroTesoreria.setVisible((this.isVisibilidadCeldaOrdenParametroTesoreria && this.isPermisoOrdenParametroTesoreria));			
			
			this.jButtonNuevoRelacionesParametroTesoreria.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria && this.isPermisoNuevoParametroTesoreria));			
			this.jButtonNuevoGuardarCambiosParametroTesoreria.setVisible((this.isVisibilidadCeldaNuevoParametroTesoreria && this.isPermisoNuevoParametroTesoreria && this.isPermisoGuardarCambiosParametroTesoreria));
			
			if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonModificarParametroTesoreria.setVisible((this.isVisibilidadCeldaModificarParametroTesoreria && this.isPermisoActualizarParametroTesoreria));	
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonActualizarParametroTesoreria.setVisible((this.isVisibilidadCeldaActualizarParametroTesoreria && this.isPermisoActualizarParametroTesoreria));	
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonEliminarParametroTesoreria.setVisible((this.isVisibilidadCeldaEliminarParametroTesoreria && this.isPermisoEliminarParametroTesoreria));
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonCancelarParametroTesoreria.setVisible(this.isVisibilidadCeldaCancelarParametroTesoreria);							
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonGuardarCambiosParametroTesoreria.setVisible((this.isVisibilidadCeldaGuardarParametroTesoreria && this.isPermisoGuardarCambiosParametroTesoreria));			
			
			}
						
			this.jButtonGuardarCambiosTablaParametroTesoreria.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroTesoreria && this.isPermisoGuardarCambiosParametroTesoreria));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParametroTesoreria.setVisible((this.isVisibilidadCeldaNuevoParametroTesoreria && this.isPermisoNuevoParametroTesoreria));						
			this.jButtonDuplicarToolBarParametroTesoreria.setVisible((this.isVisibilidadCeldaDuplicarParametroTesoreria && this.isPermisoDuplicarParametroTesoreria));						
			this.jButtonCopiarToolBarParametroTesoreria.setVisible((this.isVisibilidadCeldaCopiarParametroTesoreria && this.isPermisoCopiarParametroTesoreria));			
			this.jButtonVerFormToolBarParametroTesoreria.setVisible((this.isVisibilidadCeldaVerFormParametroTesoreria && this.isPermisoVerFormParametroTesoreria));			
			this.jButtonAbrirOrderByToolBarParametroTesoreria.setVisible((this.isVisibilidadCeldaOrdenParametroTesoreria && this.isPermisoOrdenParametroTesoreria));
			this.jButtonNuevoRelacionesToolBarParametroTesoreria.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria && this.isPermisoNuevoParametroTesoreria));			
			this.jButtonNuevoGuardarCambiosToolBarParametroTesoreria.setVisible((this.isVisibilidadCeldaNuevoParametroTesoreria && this.isPermisoNuevoParametroTesoreria && this.isPermisoGuardarCambiosParametroTesoreria));			
			
			if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonModificarToolBarParametroTesoreria.setVisible((this.isVisibilidadCeldaModificarParametroTesoreria && this.isPermisoActualizarParametroTesoreria));	
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonActualizarToolBarParametroTesoreria.setVisible((this.isVisibilidadCeldaActualizarParametroTesoreria  && this.isPermisoActualizarParametroTesoreria));	
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonEliminarToolBarParametroTesoreria.setVisible((this.isVisibilidadCeldaEliminarParametroTesoreria && this.isPermisoEliminarParametroTesoreria));
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonCancelarToolBarParametroTesoreria.setVisible(this.isVisibilidadCeldaCancelarParametroTesoreria);				
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonGuardarCambiosToolBarParametroTesoreria.setVisible((this.isVisibilidadCeldaGuardarParametroTesoreria && this.isPermisoGuardarCambiosParametroTesoreria));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParametroTesoreria.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroTesoreria && this.isPermisoGuardarCambiosParametroTesoreria));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParametroTesoreria.setVisible((this.isVisibilidadCeldaNuevoParametroTesoreria && this.isPermisoNuevoParametroTesoreria));			
			this.jMenuItemDuplicarParametroTesoreria.setVisible((this.isVisibilidadCeldaDuplicarParametroTesoreria && this.isPermisoDuplicarParametroTesoreria));			
			this.jMenuItemCopiarParametroTesoreria.setVisible((this.isVisibilidadCeldaCopiarParametroTesoreria && this.isPermisoCopiarParametroTesoreria));			
			this.jMenuItemVerFormParametroTesoreria.setVisible((this.isVisibilidadCeldaVerFormParametroTesoreria && this.isPermisoVerFormParametroTesoreria));			
			this.jMenuItemAbrirOrderByParametroTesoreria.setVisible((this.isVisibilidadCeldaOrdenParametroTesoreria && this.isPermisoOrdenParametroTesoreria));			
			//this.jMenuItemMostrarOcultarParametroTesoreria.setVisible((this.isVisibilidadCeldaOrdenParametroTesoreria && this.isPermisoOrdenParametroTesoreria));
			this.jMenuItemDetalleAbrirOrderByParametroTesoreria.setVisible((this.isVisibilidadCeldaOrdenParametroTesoreria && this.isPermisoOrdenParametroTesoreria));			
			//this.jMenuItemDetalleMostrarOcultarParametroTesoreria.setVisible((this.isVisibilidadCeldaOrdenParametroTesoreria && this.isPermisoOrdenParametroTesoreria));			
			this.jMenuItemNuevoRelacionesParametroTesoreria.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria && this.isPermisoNuevoParametroTesoreria));			
			this.jMenuItemNuevoGuardarCambiosParametroTesoreria.setVisible((this.isVisibilidadCeldaNuevoParametroTesoreria && this.isPermisoNuevoParametroTesoreria && this.isPermisoGuardarCambiosParametroTesoreria));									
			
			if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
			this.jInternalFrameDetalleFormParametroTesoreria.jMenuItemModificarParametroTesoreria.setVisible((this.isVisibilidadCeldaModificarParametroTesoreria && this.isPermisoActualizarParametroTesoreria));	
			this.jInternalFrameDetalleFormParametroTesoreria.jMenuItemActualizarParametroTesoreria.setVisible((this.isVisibilidadCeldaActualizarParametroTesoreria && this.isPermisoActualizarParametroTesoreria));	
			this.jInternalFrameDetalleFormParametroTesoreria.jMenuItemEliminarParametroTesoreria.setVisible((this.isVisibilidadCeldaEliminarParametroTesoreria && this.isPermisoEliminarParametroTesoreria));
			this.jInternalFrameDetalleFormParametroTesoreria.jMenuItemCancelarParametroTesoreria.setVisible(this.isVisibilidadCeldaCancelarParametroTesoreria);				
			}
			
			this.jMenuItemGuardarCambiosParametroTesoreria.setVisible((this.isVisibilidadCeldaGuardarParametroTesoreria && this.isPermisoGuardarCambiosParametroTesoreria));						
			this.jMenuItemGuardarCambiosTablaParametroTesoreria.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroTesoreria && this.isPermisoGuardarCambiosParametroTesoreria));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParametroTesoreria=this.jButtonNuevoParametroTesoreria.isVisible();
			this.isVisibilidadCeldaDuplicarParametroTesoreria=this.jButtonDuplicarParametroTesoreria.isVisible();
			this.isVisibilidadCeldaCopiarParametroTesoreria=this.jButtonCopiarParametroTesoreria.isVisible();
			this.isVisibilidadCeldaVerFormParametroTesoreria=this.jButtonVerFormParametroTesoreria.isVisible();
			
			this.isVisibilidadCeldaOrdenParametroTesoreria=this.jButtonAbrirOrderByParametroTesoreria.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria=this.jButtonNuevoRelacionesParametroTesoreria.isVisible();
			this.isVisibilidadCeldaModificarParametroTesoreria=this.jButtonModificarParametroTesoreria.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
			this.isVisibilidadCeldaActualizarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jButtonActualizarParametroTesoreria.isVisible();
			this.isVisibilidadCeldaEliminarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jButtonEliminarParametroTesoreria.isVisible();
			this.isVisibilidadCeldaCancelarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jButtonCancelarParametroTesoreria.isVisible();
			this.isVisibilidadCeldaGuardarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jButtonGuardarCambiosParametroTesoreria.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreria=this.jButtonGuardarCambiosTablaParametroTesoreria.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParametroTesoreria=this.jButtonNuevoToolBarParametroTesoreria.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria=this.jButtonNuevoRelacionesToolBarParametroTesoreria.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
			this.isVisibilidadCeldaModificarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jButtonModificarToolBarParametroTesoreria.isVisible();
			this.isVisibilidadCeldaActualizarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jButtonActualizarToolBarParametroTesoreria.isVisible();
			this.isVisibilidadCeldaEliminarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jButtonEliminarToolBarParametroTesoreria.isVisible();
			this.isVisibilidadCeldaCancelarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jButtonCancelarToolBarParametroTesoreria.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroTesoreria=this.jButtonGuardarCambiosToolBarParametroTesoreria.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreria=this.jButtonGuardarCambiosTablaToolBarParametroTesoreria.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParametroTesoreria=this.jMenuItemNuevoParametroTesoreria.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria=this.jMenuItemNuevoRelacionesParametroTesoreria.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
			this.isVisibilidadCeldaModificarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jMenuItemModificarParametroTesoreria.isVisible();
			this.isVisibilidadCeldaActualizarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jMenuItemActualizarParametroTesoreria.isVisible();
			this.isVisibilidadCeldaEliminarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jMenuItemEliminarParametroTesoreria.isVisible();
			this.isVisibilidadCeldaCancelarParametroTesoreria=this.jInternalFrameDetalleFormParametroTesoreria.jMenuItemCancelarParametroTesoreria.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroTesoreria=this.jMenuItemGuardarCambiosParametroTesoreria.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreria=this.jMenuItemGuardarCambiosTablaParametroTesoreria.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParametroTesoreria(Boolean esInicializar) {
		if(ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parametrotesoreriaSessionBean.getConGuardarRelaciones()) {
				//if(this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParametroTesoreria();
			}
			
			this.inicializarActualizarBindingBotonesManualParametroTesoreria(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParametroTesoreria() {
		this.jButtonNuevoParametroTesoreria.setVisible(this.isPermisoNuevoParametroTesoreria);			
		this.jButtonDuplicarParametroTesoreria.setVisible(this.isPermisoDuplicarParametroTesoreria);			
		this.jButtonCopiarParametroTesoreria.setVisible(this.isPermisoCopiarParametroTesoreria);			
		this.jButtonVerFormParametroTesoreria.setVisible(this.isPermisoVerFormParametroTesoreria);			
		
		this.jButtonAbrirOrderByParametroTesoreria.setVisible(this.isPermisoOrdenParametroTesoreria);					
		
		this.jButtonNuevoRelacionesParametroTesoreria.setVisible(this.isPermisoNuevoParametroTesoreria);			
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonModificarParametroTesoreria.setVisible(this.isPermisoActualizarParametroTesoreria);	
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonActualizarParametroTesoreria.setVisible(this.isPermisoActualizarParametroTesoreria);	
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonEliminarParametroTesoreria.setVisible(this.isPermisoEliminarParametroTesoreria);
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonCancelarParametroTesoreria.setVisible(this.isVisibilidadCeldaCancelarParametroTesoreria);						
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonGuardarCambiosParametroTesoreria.setVisible(this.isPermisoGuardarCambiosParametroTesoreria);							
		}
		
		this.jButtonGuardarCambiosTablaParametroTesoreria.setVisible(this.isPermisoActualizarParametroTesoreria);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroTesoreria() {
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonModificarParametroTesoreria.setVisible(this.isPermisoActualizarParametroTesoreria);	
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonActualizarParametroTesoreria.setVisible(this.isPermisoActualizarParametroTesoreria);	
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonEliminarParametroTesoreria.setVisible(this.isPermisoEliminarParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonCancelarParametroTesoreria.setVisible(this.isVisibilidadCeldaCancelarParametroTesoreria);							
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonGuardarCambiosParametroTesoreria.setVisible((this.isVisibilidadCeldaGuardarParametroTesoreria && this.isPermisoGuardarCambiosParametroTesoreria));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParametroTesoreria() {
		if(ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParametroTesoreria();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParametroTesoreria() {
	}
	
	public void jTableDatosParametroTesoreriaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParametroTesoreria(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParametroTesoreriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.getparametrotesoreria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrotesoreria==null) {
						this.parametrotesoreria = new ParametroTesoreria();
					}

					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.parametrotesoreria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
				}

				if(this.parametrotesoreria.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parametrotesoreria.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroTesoreria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaParametroTesoreriaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebParametroTesoreria(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroTesoreria.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroTesoreria.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroTesoreria(this.getparametrotesoreria(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.parametrotesoreriaLogic.getConnexion());

				if(this.parametrotesoreria.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.parametrotesoreria.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroTesoreria=(TitledBorder)this.jScrollPanelDatosParametroTesoreria.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderParametroTesoreria.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaParametroTesoreriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.getparametrotesoreria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrotesoreria==null) {
						this.parametrotesoreria = new ParametroTesoreria();
					}

					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.parametrotesoreria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
				}

				if(this.parametrotesoreria.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.parametrotesoreria.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroTesoreria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_anticipo_orden_compraParametroTesoreriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.getparametrotesoreria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrotesoreria==null) {
						this.parametrotesoreria = new ParametroTesoreria();
					}

					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.parametrotesoreria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
				}

				if(this.parametrotesoreria.getcon_anticipo_orden_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_anticipo_orden_compra = "+this.parametrotesoreria.getcon_anticipo_orden_compra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroTesoreria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpor_lotesParametroTesoreriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.getparametrotesoreria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrotesoreria==null) {
						this.parametrotesoreria = new ParametroTesoreria();
					}

					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.parametrotesoreria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
				}

				if(this.parametrotesoreria.getpor_lotes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where por_lotes = "+this.parametrotesoreria.getpor_lotes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroTesoreria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccion_cobrar_pagoParametroTesoreriaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccioncobrarpago=true;

			idTienePermisotransaccioncobrarpago=this.tienePermisosUsuarioEnPaginaWebParametroTesoreria(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccioncobrarpago) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroTesoreria.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroTesoreria.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroTesoreria(this.getparametrotesoreria(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);

				this.transaccioncobrarpagoBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccioncobrarpagoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccioncobrarpagoBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.parametrotesoreriaLogic.getConnexion());

				if(this.parametrotesoreria.getid_transaccion_cobrar_pago()!=null) {
					this.transaccioncobrarpagoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccioncobrarpagoBeanSwingJInternalFrame.setIdActual(this.parametrotesoreria.getid_transaccion_cobrar_pago());
					this.transaccioncobrarpagoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccioncobrarpagoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccioncobrarpagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccioncobrarpagoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroTesoreria=(TitledBorder)this.jScrollPanelDatosParametroTesoreria.getBorder();
				TitledBorder titledBordertransaccioncobrarpago=(TitledBorder)this.transaccioncobrarpagoBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccioncobrarpago.setTitle(titledBorderParametroTesoreria.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccion_cobrar_pagoParametroTesoreriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.getparametrotesoreria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrotesoreria==null) {
						this.parametrotesoreria = new ParametroTesoreria();
					}

					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.parametrotesoreria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
				}

				if(this.parametrotesoreria.getid_transaccion_cobrar_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion_cobrar_pago = "+this.parametrotesoreria.getid_transaccion_cobrar_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroTesoreria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccion_cobrar_debitoParametroTesoreriaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccioncobrardebito=true;

			idTienePermisotransaccioncobrardebito=this.tienePermisosUsuarioEnPaginaWebParametroTesoreria(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccioncobrardebito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroTesoreria.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroTesoreria.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroTesoreria(this.getparametrotesoreria(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);

				this.transaccioncobrardebitoBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccioncobrardebitoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccioncobrardebitoBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.parametrotesoreriaLogic.getConnexion());

				if(this.parametrotesoreria.getid_transaccion_cobrar_debito()!=null) {
					this.transaccioncobrardebitoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccioncobrardebitoBeanSwingJInternalFrame.setIdActual(this.parametrotesoreria.getid_transaccion_cobrar_debito());
					this.transaccioncobrardebitoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccioncobrardebitoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccioncobrardebitoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccioncobrardebitoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroTesoreria=(TitledBorder)this.jScrollPanelDatosParametroTesoreria.getBorder();
				TitledBorder titledBordertransaccioncobrardebito=(TitledBorder)this.transaccioncobrardebitoBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccioncobrardebito.setTitle(titledBorderParametroTesoreria.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccion_cobrar_debitoParametroTesoreriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.getparametrotesoreria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrotesoreria==null) {
						this.parametrotesoreria = new ParametroTesoreria();
					}

					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.parametrotesoreria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
				}

				if(this.parametrotesoreria.getid_transaccion_cobrar_debito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion_cobrar_debito = "+this.parametrotesoreria.getid_transaccion_cobrar_debito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroTesoreria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccion_cobrar_creditoParametroTesoreriaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccioncobrarcredito=true;

			idTienePermisotransaccioncobrarcredito=this.tienePermisosUsuarioEnPaginaWebParametroTesoreria(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccioncobrarcredito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroTesoreria.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroTesoreria.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroTesoreria(this.getparametrotesoreria(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);

				this.transaccioncobrarcreditoBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccioncobrarcreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccioncobrarcreditoBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.parametrotesoreriaLogic.getConnexion());

				if(this.parametrotesoreria.getid_transaccion_cobrar_credito()!=null) {
					this.transaccioncobrarcreditoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccioncobrarcreditoBeanSwingJInternalFrame.setIdActual(this.parametrotesoreria.getid_transaccion_cobrar_credito());
					this.transaccioncobrarcreditoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccioncobrarcreditoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccioncobrarcreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccioncobrarcreditoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroTesoreria=(TitledBorder)this.jScrollPanelDatosParametroTesoreria.getBorder();
				TitledBorder titledBordertransaccioncobrarcredito=(TitledBorder)this.transaccioncobrarcreditoBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccioncobrarcredito.setTitle(titledBorderParametroTesoreria.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccion_cobrar_creditoParametroTesoreriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.getparametrotesoreria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrotesoreria==null) {
						this.parametrotesoreria = new ParametroTesoreria();
					}

					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.parametrotesoreria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
				}

				if(this.parametrotesoreria.getid_transaccion_cobrar_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion_cobrar_credito = "+this.parametrotesoreria.getid_transaccion_cobrar_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroTesoreria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccion_pagar_pagoParametroTesoreriaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccionpagarpago=true;

			idTienePermisotransaccionpagarpago=this.tienePermisosUsuarioEnPaginaWebParametroTesoreria(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccionpagarpago) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroTesoreria.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroTesoreria.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroTesoreria(this.getparametrotesoreria(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);

				this.transaccionpagarpagoBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionpagarpagoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionpagarpagoBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.parametrotesoreriaLogic.getConnexion());

				if(this.parametrotesoreria.getid_transaccion_pagar_pago()!=null) {
					this.transaccionpagarpagoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionpagarpagoBeanSwingJInternalFrame.setIdActual(this.parametrotesoreria.getid_transaccion_pagar_pago());
					this.transaccionpagarpagoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionpagarpagoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionpagarpagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionpagarpagoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroTesoreria=(TitledBorder)this.jScrollPanelDatosParametroTesoreria.getBorder();
				TitledBorder titledBordertransaccionpagarpago=(TitledBorder)this.transaccionpagarpagoBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccionpagarpago.setTitle(titledBorderParametroTesoreria.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccion_pagar_pagoParametroTesoreriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.getparametrotesoreria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrotesoreria==null) {
						this.parametrotesoreria = new ParametroTesoreria();
					}

					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.parametrotesoreria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
				}

				if(this.parametrotesoreria.getid_transaccion_pagar_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion_pagar_pago = "+this.parametrotesoreria.getid_transaccion_pagar_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroTesoreria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccion_pagar_debitoParametroTesoreriaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccionpagardebito=true;

			idTienePermisotransaccionpagardebito=this.tienePermisosUsuarioEnPaginaWebParametroTesoreria(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccionpagardebito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroTesoreria.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroTesoreria.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroTesoreria(this.getparametrotesoreria(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);

				this.transaccionpagardebitoBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionpagardebitoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionpagardebitoBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.parametrotesoreriaLogic.getConnexion());

				if(this.parametrotesoreria.getid_transaccion_pagar_debito()!=null) {
					this.transaccionpagardebitoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionpagardebitoBeanSwingJInternalFrame.setIdActual(this.parametrotesoreria.getid_transaccion_pagar_debito());
					this.transaccionpagardebitoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionpagardebitoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionpagardebitoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionpagardebitoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroTesoreria=(TitledBorder)this.jScrollPanelDatosParametroTesoreria.getBorder();
				TitledBorder titledBordertransaccionpagardebito=(TitledBorder)this.transaccionpagardebitoBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccionpagardebito.setTitle(titledBorderParametroTesoreria.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccion_pagar_debitoParametroTesoreriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.getparametrotesoreria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrotesoreria==null) {
						this.parametrotesoreria = new ParametroTesoreria();
					}

					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.parametrotesoreria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
				}

				if(this.parametrotesoreria.getid_transaccion_pagar_debito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion_pagar_debito = "+this.parametrotesoreria.getid_transaccion_pagar_debito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroTesoreria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccion_pagar_creditoParametroTesoreriaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccionpagarcredito=true;

			idTienePermisotransaccionpagarcredito=this.tienePermisosUsuarioEnPaginaWebParametroTesoreria(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccionpagarcredito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroTesoreria.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroTesoreria.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroTesoreria(this.getparametrotesoreria(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);

				this.transaccionpagarcreditoBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionpagarcreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionpagarcreditoBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.parametrotesoreriaLogic.getConnexion());

				if(this.parametrotesoreria.getid_transaccion_pagar_credito()!=null) {
					this.transaccionpagarcreditoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionpagarcreditoBeanSwingJInternalFrame.setIdActual(this.parametrotesoreria.getid_transaccion_pagar_credito());
					this.transaccionpagarcreditoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionpagarcreditoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionpagarcreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionpagarcreditoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroTesoreria=(TitledBorder)this.jScrollPanelDatosParametroTesoreria.getBorder();
				TitledBorder titledBordertransaccionpagarcredito=(TitledBorder)this.transaccionpagarcreditoBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccionpagarcredito.setTitle(titledBorderParametroTesoreria.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccion_pagar_creditoParametroTesoreriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.getparametrotesoreria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrotesoreria==null) {
						this.parametrotesoreria = new ParametroTesoreria();
					}

					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.parametrotesoreria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
				}

				if(this.parametrotesoreria.getid_transaccion_pagar_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion_pagar_credito = "+this.parametrotesoreria.getid_transaccion_pagar_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroTesoreria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionParametroTesoreriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.getparametrotesoreria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrotesoreria==null) {
						this.parametrotesoreria = new ParametroTesoreria();
					}

					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.parametrotesoreria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);
				}

				if(this.parametrotesoreria.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.parametrotesoreria.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroTesoreria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroTesoreria(false,false);

			this.getParametroTesoreriasFK_IdEmpresa();

			this.inicializarActualizarBindingParametroTesoreria(false);

			//if(ParametroTesoreriaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroTesoreria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionCobrarCreditoParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroTesoreria(false,false);

			this.getParametroTesoreriasFK_IdTransaccionCobrarCredito();

			this.inicializarActualizarBindingParametroTesoreria(false);

			//if(ParametroTesoreriaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroTesoreria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionCobrarDebitoParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroTesoreria(false,false);

			this.getParametroTesoreriasFK_IdTransaccionCobrarDebito();

			this.inicializarActualizarBindingParametroTesoreria(false);

			//if(ParametroTesoreriaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroTesoreria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionCobrarPagoParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroTesoreria(false,false);

			this.getParametroTesoreriasFK_IdTransaccionCobrarPago();

			this.inicializarActualizarBindingParametroTesoreria(false);

			//if(ParametroTesoreriaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroTesoreria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionPagarCreditoParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroTesoreria(false,false);

			this.getParametroTesoreriasFK_IdTransaccionPagarCredito();

			this.inicializarActualizarBindingParametroTesoreria(false);

			//if(ParametroTesoreriaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroTesoreria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionPagarDebitoParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroTesoreria(false,false);

			this.getParametroTesoreriasFK_IdTransaccionPagarDebito();

			this.inicializarActualizarBindingParametroTesoreria(false);

			//if(ParametroTesoreriaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroTesoreria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionPagarPagoParametroTesoreriaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroTesoreria(false,false);

			this.getParametroTesoreriasFK_IdTransaccionPagarPago();

			this.inicializarActualizarBindingParametroTesoreria(false);

			//if(ParametroTesoreriaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroTesoreria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameParametroTesoreria() {
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
			this.jInternalFrameDetalleFormParametroTesoreria.setVisible(false);	    			
			this.jInternalFrameDetalleFormParametroTesoreria.dispose();
			this.jInternalFrameDetalleFormParametroTesoreria=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParametroTesoreria!=null) {
			this.jInternalFrameReporteDinamicoParametroTesoreria.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParametroTesoreria.dispose();
			this.jInternalFrameReporteDinamicoParametroTesoreria=null;
		}
		
		if(this.jInternalFrameImportacionParametroTesoreria!=null) {
			this.jInternalFrameImportacionParametroTesoreria.setVisible(false);	    			
			this.jInternalFrameImportacionParametroTesoreria.dispose();
			this.jInternalFrameImportacionParametroTesoreria=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParametroTesoreria();
			
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
			
			
			if(sTipo.equals("NuevoParametroTesoreria")) {
				jButtonNuevoParametroTesoreriaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParametroTesoreria")) {
				jButtonDuplicarParametroTesoreriaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParametroTesoreria")) {
				jButtonCopiarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("VerFormParametroTesoreria")) {
				jButtonVerFormParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParametroTesoreria")) {
				jButtonNuevoParametroTesoreriaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParametroTesoreria")) {
				jButtonDuplicarParametroTesoreriaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParametroTesoreria")) {
				jButtonNuevoParametroTesoreriaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParametroTesoreria")) {
				jButtonDuplicarParametroTesoreriaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParametroTesoreria")) {
				jButtonNuevoParametroTesoreriaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParametroTesoreria")) {
				jButtonNuevoParametroTesoreriaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParametroTesoreria")) {
				jButtonNuevoParametroTesoreriaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParametroTesoreria")) {
				jButtonModificarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParametroTesoreria")) {
				jButtonModificarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParametroTesoreria")) {
				jButtonModificarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParametroTesoreria")) {
				jButtonActualizarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParametroTesoreria")) {
				jButtonActualizarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParametroTesoreria")) {
				jButtonActualizarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("EliminarParametroTesoreria")) {
				jButtonEliminarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParametroTesoreria")) {
				jButtonEliminarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParametroTesoreria")) {
				jButtonEliminarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("CancelarParametroTesoreria")) {
				jButtonCancelarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParametroTesoreria")) {
				jButtonCancelarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParametroTesoreria")) {
				jButtonCancelarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("CerrarParametroTesoreria")) {
				jButtonCerrarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParametroTesoreria")) {
				jButtonCerrarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParametroTesoreria")) {
				jButtonCerrarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParametroTesoreria")) {
				jButtonMostrarOcultarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParametroTesoreria")) {
				jButtonCancelarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParametroTesoreria")) {
				jButtonGuardarCambiosParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParametroTesoreria")) {
				jButtonGuardarCambiosParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParametroTesoreria")) {
				jButtonCopiarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParametroTesoreria")) {
				jButtonVerFormParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParametroTesoreria")) {
				jButtonGuardarCambiosParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParametroTesoreria")) {
				jButtonCopiarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParametroTesoreria")) {
				jButtonVerFormParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParametroTesoreria")) {
				jButtonGuardarCambiosParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParametroTesoreria")) {
				jButtonGuardarCambiosParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParametroTesoreria")) {
				jButtonGuardarCambiosParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParametroTesoreria")) {
				jButtonRecargarInformacionParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParametroTesoreria")) {
				jButtonRecargarInformacionParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParametroTesoreria")) {
				jButtonRecargarInformacionParametroTesoreriaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParametroTesoreria")) {
				jButtonAnterioresParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParametroTesoreria")) {
				jButtonAnterioresParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParametroTesoreria")) {
				jButtonAnterioresParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParametroTesoreria")) {
				jButtonSiguientesParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParametroTesoreria")) {
				jButtonSiguientesParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParametroTesoreria")) {
				jButtonSiguientesParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParametroTesoreria") || sTipo.equals("MenuItemDetalleAbrirOrderByParametroTesoreria")) {
				jButtonAbrirOrderByParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParametroTesoreria") || sTipo.equals("MenuItemDetalleMostrarOcultarParametroTesoreria")) {
				jButtonMostrarOcultarParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParametroTesoreria")) {
				jButtonNuevoGuardarCambiosParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParametroTesoreria")) {
				jButtonNuevoGuardarCambiosParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParametroTesoreria")) {
				jButtonNuevoGuardarCambiosParametroTesoreriaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParametroTesoreria")) {
				jButtonCerrarReporteDinamicoParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParametroTesoreria")) {
				jButtonGenerarReporteDinamicoParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParametroTesoreria")) {
				
				jButtonGenerarExcelReporteDinamicoParametroTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParametroTesoreria")) {
				jButtonCerrarImportacionParametroTesoreriaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParametroTesoreria")) {
				
				jButtonGenerarImportacionParametroTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParametroTesoreria")) {
				
				jButtonAbrirImportacionParametroTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParametroTesoreria")) {
				jComboBoxTiposAccionesParametroTesoreriaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParametroTesoreria")) {
				jComboBoxTiposRelacionesParametroTesoreriaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParametroTesoreria")) {
				jComboBoxTiposAccionesParametroTesoreriaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParametroTesoreria")) {
				
				jComboBoxTiposSeleccionarParametroTesoreriaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParametroTesoreria")) {
				jTextFieldValorCampoGeneralParametroTesoreriaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParametroTesoreria")) {
				jButtonAbrirOrderByParametroTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParametroTesoreria")) {
				jButtonAbrirOrderByParametroTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParametroTesoreria")) {
				jButtonCerrarOrderByParametroTesoreriaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroTesoreriaBusqueda")) {
				this.jButtonidParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroTesoreriaUpdate")) {
				this.jButtonid_empresaParametroTesoreriaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroTesoreriaBusqueda")) {
				this.jButtonid_empresaParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_anticipo_orden_compraParametroTesoreriaBusqueda")) {
				this.jButtoncon_anticipo_orden_compraParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("por_lotesParametroTesoreriaBusqueda")) {
				this.jButtonpor_lotesParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_cobrar_pagoParametroTesoreriaUpdate")) {
				this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_cobrar_pagoParametroTesoreriaBusqueda")) {
				this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_cobrar_debitoParametroTesoreriaUpdate")) {
				this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_cobrar_debitoParametroTesoreriaBusqueda")) {
				this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_cobrar_creditoParametroTesoreriaUpdate")) {
				this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_cobrar_creditoParametroTesoreriaBusqueda")) {
				this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_pagar_pagoParametroTesoreriaUpdate")) {
				this.jButtonid_transaccion_pagar_pagoParametroTesoreriaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_pagar_pagoParametroTesoreriaBusqueda")) {
				this.jButtonid_transaccion_pagar_pagoParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_pagar_debitoParametroTesoreriaUpdate")) {
				this.jButtonid_transaccion_pagar_debitoParametroTesoreriaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_pagar_debitoParametroTesoreriaBusqueda")) {
				this.jButtonid_transaccion_pagar_debitoParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_pagar_creditoParametroTesoreriaUpdate")) {
				this.jButtonid_transaccion_pagar_creditoParametroTesoreriaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_pagar_creditoParametroTesoreriaBusqueda")) {
				this.jButtonid_transaccion_pagar_creditoParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionParametroTesoreriaBusqueda")) {
				this.jButtondescripcionParametroTesoreriaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTransaccionCobrarCreditoParametroTesoreria")) {
				this.jButtonFK_IdTransaccionCobrarCreditoParametroTesoreriaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTransaccionCobrarDebitoParametroTesoreria")) {
				this.jButtonFK_IdTransaccionCobrarDebitoParametroTesoreriaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTransaccionCobrarPagoParametroTesoreria")) {
				this.jButtonFK_IdTransaccionCobrarPagoParametroTesoreriaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTransaccionPagarCreditoParametroTesoreria")) {
				this.jButtonFK_IdTransaccionPagarCreditoParametroTesoreriaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTransaccionPagarDebitoParametroTesoreria")) {
				this.jButtonFK_IdTransaccionPagarDebitoParametroTesoreriaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTransaccionPagarPagoParametroTesoreria")) {
				this.jButtonFK_IdTransaccionPagarPagoParametroTesoreriaActionPerformed(evt);
			}
			
			;
			
			
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParametroTesoreria();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroTesoreriaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreria);
				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
				
				


				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ParametroTesoreria parametrotesoreriaLocal=null;
			
			if(!this.getEsControlTabla()) {
				parametrotesoreriaLocal=this.parametrotesoreria;
			} else {
				parametrotesoreriaLocal=this.parametrotesoreriaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreria);
				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
							
				
				


				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroTesoreriaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaAnterior =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrotesoreriaAnterior =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
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
			
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
			
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
			
			


			
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroTesoreriaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreria);
				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
								
						
				


				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreria.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreria);
				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
								
				
				


				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroTesoreriaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaAnterior =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrotesoreriaAnterior =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreria);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroTesoreriaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaAnterior =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrotesoreriaAnterior =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroTesoreriaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreria);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreria);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreria);
				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
							
				
				


				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreria.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroTesoreriaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreriaAnterior =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrotesoreriaAnterior =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
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
			
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
			
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
			
			


			
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroTesoreriaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreria);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreria);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreria);
				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
								
				
				


				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroTesoreriaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaAnterior =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrotesoreriaAnterior =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroTesoreriaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreria);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreria);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroTesoreriaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreria);
				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParametroTesoreria")) {
					jCheckBoxSeleccionarTodosParametroTesoreriaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParametroTesoreria")) {
					jCheckBoxSeleccionadosParametroTesoreriaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParametroTesoreria")) {
					
				}
				
				


				
				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreria);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreria);
				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
												
				
				


				
				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroTesoreriaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreriaAnterior =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrotesoreriaAnterior =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroTesoreriaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreria);
				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
				
				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
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
			
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
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
			
			


			
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroTesoreriaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreria);
				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreria.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreria.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreria);
				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
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
				
				


				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreria.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroTesoreriaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriaAnterior =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrotesoreriaAnterior =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParametroTesoreria")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParametroTesoreriaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParametroTesoreria.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parametrotesoreria =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parametrotesoreria =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parametrotesoreria);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParametroTesoreria")) {
				
				}
				
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParametroTesoreria")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParametroTesoreria.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParametroTesoreria")) {
			
			}
			
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParametroTesoreria();
			
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
			
			if(sTipo.equals("NuevoParametroTesoreria")) {
				jButtonNuevoParametroTesoreriaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParametroTesoreria")) {
				jButtonDuplicarParametroTesoreriaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParametroTesoreria")) {
				jButtonCopiarParametroTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParametroTesoreria")) {
				jButtonVerFormParametroTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParametroTesoreria")) {
				jButtonNuevoParametroTesoreriaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParametroTesoreria")) {
				jButtonModificarParametroTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParametroTesoreria")) {
				jButtonActualizarParametroTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParametroTesoreria")) {
				jButtonEliminarParametroTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParametroTesoreria")) {
				jButtonGuardarCambiosParametroTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParametroTesoreria")) {
				jButtonCancelarParametroTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParametroTesoreria")) {
				jButtonCerrarParametroTesoreriaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParametroTesoreria")) {
				jButtonGuardarCambiosParametroTesoreriaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParametroTesoreria")) {
				jButtonNuevoGuardarCambiosParametroTesoreriaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParametroTesoreria")) {
				jButtonAbrirOrderByParametroTesoreriaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParametroTesoreria")) {
				jButtonRecargarInformacionParametroTesoreriaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParametroTesoreria")) {
				jButtonAnterioresParametroTesoreriaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParametroTesoreria")) {
				jButtonSiguientesParametroTesoreriaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroTesoreriaBusqueda")) {
				this.jButtonidParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroTesoreriaUpdate")) {
				this.jButtonid_empresaParametroTesoreriaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroTesoreriaBusqueda")) {
				this.jButtonid_empresaParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_anticipo_orden_compraParametroTesoreriaBusqueda")) {
				this.jButtoncon_anticipo_orden_compraParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("por_lotesParametroTesoreriaBusqueda")) {
				this.jButtonpor_lotesParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_cobrar_pagoParametroTesoreriaUpdate")) {
				this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_cobrar_pagoParametroTesoreriaBusqueda")) {
				this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_cobrar_debitoParametroTesoreriaUpdate")) {
				this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_cobrar_debitoParametroTesoreriaBusqueda")) {
				this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_cobrar_creditoParametroTesoreriaUpdate")) {
				this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_cobrar_creditoParametroTesoreriaBusqueda")) {
				this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_pagar_pagoParametroTesoreriaUpdate")) {
				this.jButtonid_transaccion_pagar_pagoParametroTesoreriaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_pagar_pagoParametroTesoreriaBusqueda")) {
				this.jButtonid_transaccion_pagar_pagoParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_pagar_debitoParametroTesoreriaUpdate")) {
				this.jButtonid_transaccion_pagar_debitoParametroTesoreriaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_pagar_debitoParametroTesoreriaBusqueda")) {
				this.jButtonid_transaccion_pagar_debitoParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_pagar_creditoParametroTesoreriaUpdate")) {
				this.jButtonid_transaccion_pagar_creditoParametroTesoreriaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_pagar_creditoParametroTesoreriaBusqueda")) {
				this.jButtonid_transaccion_pagar_creditoParametroTesoreriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionParametroTesoreriaBusqueda")) {
				this.jButtondescripcionParametroTesoreriaBusquedaActionPerformed(evt);
			}
			
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParametroTesoreria();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParametroTesoreria")) {
				closingInternalFrameParametroTesoreria();
				
			} else if(sTipo.equals("jButtonCancelarParametroTesoreria")) {
				JInternalFrameBase jInternalFrameDetalleFormParametroTesoreria = (JInternalFrameBase)evt.getSource();
	            	
	            ParametroTesoreriaBeanSwingJInternalFrame jInternalFrameParent=(ParametroTesoreriaBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroTesoreria.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParametroTesoreriaActionPerformed(null);
			}
			
			ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrotesoreria,new Object(),this.parametrotesoreriaParameterGeneral,this.parametrotesoreriaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParametroTesoreria(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParametroTesoreria(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParametroTesoreria(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parametrotesoreria)) {
			if(!esControlTabla) {
				if(ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.parametrotesoreria,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);			
				}
				
				if(this.parametrotesoreriaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParametroTesoreria(this.parametrotesoreria,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrotesoreriaReturnGeneral=parametrotesoreriaLogic.procesarEventosParametroTesoreriasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrotesoreriaLogic.getParametroTesorerias(),this.parametrotesoreria,this.parametrotesoreriaParameterGeneral,this.isEsNuevoParametroTesoreria,classes);//this.parametrotesoreriaLogic.getParametroTesoreria()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParametroTesoreria(this.parametrotesoreriaReturnGeneral,this.parametrotesoreriaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parametrotesoreriaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParametroTesoreria(classes,this.parametrotesoreriaReturnGeneral,this.parametrotesoreriaBean,false);
					}
						
					if(this.parametrotesoreriaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParametroTesoreria(this.parametrotesoreriaReturnGeneral.getParametroTesoreria());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParametroTesoreria(this.parametrotesoreriaReturnGeneral.getParametroTesoreria());	
					}
						
					if(this.parametrotesoreriaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParametroTesoreria(this.parametrotesoreriaReturnGeneral.getParametroTesoreria(),classes);//this.parametrotesoreriaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParametroTesoreria(this.parametrotesoreria,classes);//this.parametrotesoreriaBean);									
				}
			
				if(ParametroTesoreriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParametroTesoreria(this.parametrotesoreria,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreria(this.parametrotesoreria);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parametrotesoreriaAnterior!=null) {
						this.parametrotesoreria=this.parametrotesoreriaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrotesoreriaReturnGeneral=parametrotesoreriaLogic.procesarEventosParametroTesoreriasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrotesoreriaLogic.getParametroTesorerias(),this.parametrotesoreria,this.parametrotesoreriaParameterGeneral,this.isEsNuevoParametroTesoreria,classes);//this.parametrotesoreriaLogic.getParametroTesoreria()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrotesoreriaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrotesoreriaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parametrotesoreriaReturnGeneral.getParametroTesoreria(),parametrotesoreriaLogic.getParametroTesorerias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parametrotesoreriaReturnGeneral.getParametroTesoreria(),this.parametrotesorerias);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParametroTesoreria.repaint();
				
				//((AbstractTableModel) this.jTableDatosParametroTesoreria.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParametroTesoreria();
			}
		}
	}
	
	public void actualizarVisualTableDatosParametroTesoreria() throws Exception {
		
		ParametroTesoreriaModel parametrotesoreriaModel=(ParametroTesoreriaModel)this.jTableDatosParametroTesoreria.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrotesoreriaModel.parametrotesorerias=this.parametrotesoreriaLogic.getParametroTesorerias();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parametrotesoreriaModel.parametrotesorerias=this.parametrotesorerias;
		}
		
		
		((ParametroTesoreriaModel) this.jTableDatosParametroTesoreria.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParametroTesoreria() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparametrotesoreriaAnterior(),this.parametrotesoreriaLogic.getParametroTesorerias());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparametrotesoreriaAnterior(),this.parametrotesorerias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParametroTesoreria();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParametroTesoreria(ParametroTesoreria parametrotesoreria,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
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
										
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrotesoreria,new Object(),generalEntityParameterGeneral,this.parametrotesoreriaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parametrotesoreriaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParametroTesoreriaConstantesFunciones.getClassesRelationshipsOfParametroTesoreria(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParametroTesoreriaConstantesFunciones.getClassesRelationshipsFromStringsOfParametroTesoreria(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParametroTesoreria(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParametroTesoreriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrotesoreria,new Object(),generalEntityParameterGeneral,this.parametrotesoreriaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParametroTesoreria(ParametroTesoreriaBean parametrotesoreriaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParametroTesoreria(ArrayList<Classe> classes,ParametroTesoreriaReturnGeneral parametrotesoreriaReturnGeneral,ParametroTesoreriaBean parametrotesoreriaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParametroTesoreria(ParametroTesoreria parametrotesoreria,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parametrotesoreria)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParametroTesoreria = new ParametroTesoreriaDetalleFormJInternalFrame(jDesktopPane,this.parametrotesoreriaSessionBean.getConGuardarRelaciones(),this.parametrotesoreriaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.setVisible(false);
		this.jInternalFrameDetalleFormParametroTesoreria.setSelected(false);						
		
		this.jInternalFrameDetalleFormParametroTesoreria.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParametroTesoreria.parametrotesoreriaLogic=this.parametrotesoreriaLogic;
		
		this.cargarCombosFrameForeignKeyParametroTesoreria("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroTesoreria();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroTesoreria();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParametroTesoreria("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParametroTesoreria();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParametroTesoreria.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroTesoreria"));
		
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonModificarParametroTesoreria.addActionListener(new ButtonActionListener(this,"ModificarParametroTesoreria"));

		
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonModificarToolBarParametroTesoreria.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroTesoreria"));
					
		this.jInternalFrameDetalleFormParametroTesoreria.jMenuItemModificarParametroTesoreria.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroTesoreria"));		
		
		
		
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonActualizarParametroTesoreria.addActionListener (new ButtonActionListener(this,"ActualizarParametroTesoreria"));
		
		
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonActualizarToolBarParametroTesoreria.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroTesoreria"));
						
		this.jInternalFrameDetalleFormParametroTesoreria.jMenuItemActualizarParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroTesoreria"));		
		
		
		
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonEliminarParametroTesoreria.addActionListener (new ButtonActionListener(this,"EliminarParametroTesoreria"));
		
		
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonEliminarToolBarParametroTesoreria.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroTesoreria"));
								
		this.jInternalFrameDetalleFormParametroTesoreria.jMenuItemEliminarParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroTesoreria"));		
		
		
		
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonCancelarParametroTesoreria.addActionListener (new ButtonActionListener(this,"CancelarParametroTesoreria"));
		
		
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonCancelarToolBarParametroTesoreria.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroTesoreria"));
					
		this.jInternalFrameDetalleFormParametroTesoreria.jMenuItemCancelarParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroTesoreria"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParametroTesoreria.jMenuItemDetalleCerrarParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroTesoreria"));		
		
		
		
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonGuardarCambiosToolBarParametroTesoreria.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroTesoreria"));
		
		
		
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonGuardarCambiosToolBarParametroTesoreria.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroTesoreria"));
		
		
		
		this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxTiposAccionesFormularioParametroTesoreria.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroTesoreria"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonidParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"idParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_empresaParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_empresaParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroTesoreriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtoncon_anticipo_orden_compraParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"con_anticipo_orden_compraParametroTesoreriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonpor_lotesParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"por_lotesParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_cobrar_pagoParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_cobrar_pagoParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_cobrar_pagoParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_cobrar_pagoParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_cobrar_debitoParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_cobrar_debitoParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_cobrar_debitoParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_cobrar_debitoParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_cobrar_creditoParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_cobrar_creditoParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_cobrar_creditoParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_cobrar_creditoParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_pagar_pagoParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_pagar_pagoParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_pagar_pagoParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_pagar_pagoParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_pagar_debitoParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_pagar_debitoParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_pagar_debitoParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_pagar_debitoParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_pagar_creditoParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_pagar_creditoParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_pagar_creditoParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_pagar_creditoParametroTesoreriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtondescripcionParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionParametroTesoreriaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParametroTesoreria.jTabbedPaneRelacionesParametroTesoreria.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroTesoreria"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParametroTesoreria"));
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreria.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroTesoreria"));
		}
		
		this.jTableDatosParametroTesoreria.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParametroTesoreria"));
		
		this.jTableDatosParametroTesoreria.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParametroTesoreria"));
		
		this.jButtonNuevoParametroTesoreria.addActionListener(new ButtonActionListener(this,"NuevoParametroTesoreria"));
		
		this.jButtonDuplicarParametroTesoreria.addActionListener(new ButtonActionListener(this,"DuplicarParametroTesoreria"));
		
		this.jButtonCopiarParametroTesoreria.addActionListener(new ButtonActionListener(this,"CopiarParametroTesoreria"));
		
		this.jButtonVerFormParametroTesoreria.addActionListener(new ButtonActionListener(this,"VerFormParametroTesoreria"));
		
		
		this.jButtonNuevoToolBarParametroTesoreria.addActionListener(new ButtonActionListener(this,"NuevoToolBarParametroTesoreria"));
			
		this.jButtonDuplicarToolBarParametroTesoreria.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParametroTesoreria"));
			
		this.jMenuItemNuevoParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParametroTesoreria"));
			
		this.jMenuItemDuplicarParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParametroTesoreria"));		
		
		
		this.jButtonNuevoRelacionesParametroTesoreria.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParametroTesoreria"));
		
		
		this.jButtonNuevoRelacionesToolBarParametroTesoreria.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParametroTesoreria"));
			
		this.jMenuItemNuevoRelacionesParametroTesoreria.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParametroTesoreria"));		
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonModificarParametroTesoreria.addActionListener(new ButtonActionListener(this,"ModificarParametroTesoreria"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonModificarToolBarParametroTesoreria.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroTesoreria"));
			
			this.jInternalFrameDetalleFormParametroTesoreria.jMenuItemModificarParametroTesoreria.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroTesoreria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonActualizarParametroTesoreria.addActionListener (new ButtonActionListener(this,"ActualizarParametroTesoreria"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonActualizarToolBarParametroTesoreria.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroTesoreria"));
				
			this.jInternalFrameDetalleFormParametroTesoreria.jMenuItemActualizarParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroTesoreria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonEliminarParametroTesoreria.addActionListener (new ButtonActionListener(this,"EliminarParametroTesoreria"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonEliminarToolBarParametroTesoreria.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroTesoreria"));
						
			this.jInternalFrameDetalleFormParametroTesoreria.jMenuItemEliminarParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroTesoreria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonCancelarParametroTesoreria.addActionListener (new ButtonActionListener(this,"CancelarParametroTesoreria"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonCancelarToolBarParametroTesoreria.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroTesoreria"));
			
			this.jInternalFrameDetalleFormParametroTesoreria.jMenuItemCancelarParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroTesoreria"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParametroTesoreria.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParametroTesoreria"));		
		
		
		this.jButtonCerrarParametroTesoreria.addActionListener (new ButtonActionListener(this,"CerrarParametroTesoreria"));
		
		
		this.jButtonCerrarToolBarParametroTesoreria.addActionListener (new ButtonActionListener(this,"CerrarToolBarParametroTesoreria"));
			
		this.jMenuItemCerrarParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParametroTesoreria"));
			
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreria.jMenuItemDetalleCerrarParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroTesoreria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonGuardarCambiosParametroTesoreria.addActionListener (new ButtonActionListener(this,"GuardarCambiosParametroTesoreria"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreria.jButtonGuardarCambiosToolBarParametroTesoreria.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroTesoreria"));
		}
		
		this.jButtonCopiarToolBarParametroTesoreria.addActionListener (new ButtonActionListener(this,"CopiarToolBarParametroTesoreria"));
			
		this.jButtonVerFormToolBarParametroTesoreria.addActionListener (new ButtonActionListener(this,"VerFormToolBarParametroTesoreria"));
		
		this.jMenuItemGuardarCambiosParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParametroTesoreria"));
			
		this.jMenuItemCopiarParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParametroTesoreria"));		
		
		this.jMenuItemVerFormParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParametroTesoreria"));		
		
		
		this.jButtonGuardarCambiosTablaParametroTesoreria.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroTesoreria"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroTesoreria.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParametroTesoreria"));
			
		this.jMenuItemGuardarCambiosTablaParametroTesoreria.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroTesoreria"));		
		
		
		
		this.jButtonRecargarInformacionParametroTesoreria.addActionListener (new ButtonActionListener(this,"RecargarInformacionParametroTesoreria"));
					
		this.jButtonRecargarInformacionToolBarParametroTesoreria.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParametroTesoreria"));
		
		this.jMenuItemRecargarInformacionParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParametroTesoreria"));		
		
		
		
		this.jButtonAnterioresParametroTesoreria.addActionListener (new ButtonActionListener(this,"AnterioresParametroTesoreria"));
		
		
		this.jButtonAnterioresToolBarParametroTesoreria.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParametroTesoreria"));
		
		this.jMenuItemAnterioresParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParametroTesoreria"));		
		
		
		this.jButtonSiguientesParametroTesoreria.addActionListener (new ButtonActionListener(this,"SiguientesParametroTesoreria"));
		
		
		this.jButtonSiguientesToolBarParametroTesoreria.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParametroTesoreria"));
			
		this.jMenuItemSiguientesParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParametroTesoreria"));
			
		this.jMenuItemAbrirOrderByParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParametroTesoreria"));
			
		this.jMenuItemMostrarOcultarParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParametroTesoreria"));
			
		this.jMenuItemDetalleAbrirOrderByParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParametroTesoreria"));
			
		this.jMenuItemDetalleMostarOcultarParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParametroTesoreria"));		
		
		
		this.jButtonNuevoGuardarCambiosParametroTesoreria.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParametroTesoreria"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroTesoreria.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParametroTesoreria"));
			
		this.jMenuItemNuevoGuardarCambiosParametroTesoreria.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParametroTesoreria"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParametroTesoreria.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParametroTesoreria"));

		this.jCheckBoxSeleccionadosParametroTesoreria.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParametroTesoreria"));
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxTiposAccionesFormularioParametroTesoreria.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroTesoreria"));
		}
		
		
		this.jComboBoxTiposRelacionesParametroTesoreria.addActionListener (new ButtonActionListener(this,"TiposRelacionesParametroTesoreria"));
			
		this.jComboBoxTiposAccionesParametroTesoreria.addActionListener (new ButtonActionListener(this,"TiposAccionesParametroTesoreria"));
					
		this.jComboBoxTiposSeleccionarParametroTesoreria.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParametroTesoreria"));
			
		this.jTextFieldValorCampoGeneralParametroTesoreria.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParametroTesoreria"));		
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonidParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"idParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_empresaParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_empresaParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroTesoreriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtoncon_anticipo_orden_compraParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"con_anticipo_orden_compraParametroTesoreriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonpor_lotesParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"por_lotesParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_cobrar_pagoParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_cobrar_pagoParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_cobrar_pagoParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_cobrar_pagoParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_cobrar_debitoParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_cobrar_debitoParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_cobrar_debitoParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_cobrar_debitoParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_cobrar_creditoParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_cobrar_creditoParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_cobrar_creditoParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_cobrar_creditoParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_pagar_pagoParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_pagar_pagoParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_pagar_pagoParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_pagar_pagoParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_pagar_debitoParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_pagar_debitoParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_pagar_debitoParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_pagar_debitoParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_pagar_creditoParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_pagar_creditoParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_pagar_creditoParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_pagar_creditoParametroTesoreriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtondescripcionParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionParametroTesoreriaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTransaccionCobrarCreditoParametroTesoreria.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionCobrarCreditoParametroTesoreria"));

			this.jButtonFK_IdTransaccionCobrarDebitoParametroTesoreria.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionCobrarDebitoParametroTesoreria"));

			this.jButtonFK_IdTransaccionCobrarPagoParametroTesoreria.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionCobrarPagoParametroTesoreria"));

			this.jButtonFK_IdTransaccionPagarCreditoParametroTesoreria.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionPagarCreditoParametroTesoreria"));

			this.jButtonFK_IdTransaccionPagarDebitoParametroTesoreria.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionPagarDebitoParametroTesoreria"));

			this.jButtonFK_IdTransaccionPagarPagoParametroTesoreria.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionPagarPagoParametroTesoreria"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParametroTesoreria!=null) {
				this.jInternalFrameReporteDinamicoParametroTesoreria.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroTesoreria"));
				this.jInternalFrameReporteDinamicoParametroTesoreria.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroTesoreria"));
				this.jInternalFrameReporteDinamicoParametroTesoreria.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroTesoreria"));
			}
			
			//this.jButtonCerrarReporteDinamicoParametroTesoreria.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroTesoreria"));				
			//this.jButtonGenerarReporteDinamicoParametroTesoreria.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroTesoreria"));
			//this.jButtonGenerarExcelReporteDinamicoParametroTesoreria.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroTesoreria"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParametroTesoreria!=null) {
				this.jInternalFrameImportacionParametroTesoreria.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroTesoreria"));
				this.jInternalFrameImportacionParametroTesoreria.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroTesoreria"));
				this.jInternalFrameImportacionParametroTesoreria.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroTesoreria"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParametroTesoreria.addActionListener (new ButtonActionListener(this,"AbrirOrderByParametroTesoreria"));
			
			this.jButtonAbrirOrderByToolBarParametroTesoreria.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParametroTesoreria"));			
			
			if(this.jInternalFrameOrderByParametroTesoreria!=null) {
				this.jInternalFrameOrderByParametroTesoreria.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroTesoreria"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreria.jTabbedPaneRelacionesParametroTesoreria.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroTesoreria"));
		
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
            		closingInternalFrameParametroTesoreria();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParametroTesoreria.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParametroTesoreria = (JInternalFrameBase)event.getSource();
	            	
	            ParametroTesoreriaBeanSwingJInternalFrame jInternalFrameParent=(ParametroTesoreriaBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroTesoreria.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParametroTesoreriaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParametroTesoreria.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParametroTesoreriaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParametroTesoreria.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParametroTesoreria.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroTesoreriaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroTesoreriaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroTesoreriaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParametroTesoreria";
		inputMap = this.jButtonNuevoParametroTesoreria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParametroTesoreria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroTesoreriaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroTesoreriaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroTesoreriaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroTesoreriaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParametroTesoreria";
		inputMap = this.jButtonNuevoRelacionesParametroTesoreria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParametroTesoreria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroTesoreriaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParametroTesoreria";
		inputMap = this.jButtonModificarParametroTesoreria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParametroTesoreria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParametroTesoreriaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParametroTesoreria";
		inputMap = this.jButtonActualizarParametroTesoreria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParametroTesoreria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParametroTesoreriaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParametroTesoreria";
		inputMap = this.jButtonEliminarParametroTesoreria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParametroTesoreria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParametroTesoreriaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParametroTesoreria";
		inputMap = this.jButtonCancelarParametroTesoreria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParametroTesoreria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParametroTesoreriaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParametroTesoreria";
		inputMap = this.jButtonCerrarParametroTesoreria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParametroTesoreria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParametroTesoreriaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonGuardarCambiosParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParametroTesoreria";
		inputMap = this.jInternalFrameDetalleFormParametroTesoreria.jButtonGuardarCambiosParametroTesoreria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonGuardarCambiosParametroTesoreria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParametroTesoreriaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParametroTesoreria.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParametroTesoreriaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParametroTesoreria.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParametroTesoreriaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParametroTesoreria.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParametroTesoreriaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParametroTesoreria.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParametroTesoreriaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonidParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"idParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_empresaParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_empresaParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroTesoreriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtoncon_anticipo_orden_compraParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"con_anticipo_orden_compraParametroTesoreriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonpor_lotesParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"por_lotesParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_cobrar_pagoParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_cobrar_pagoParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_cobrar_pagoParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_cobrar_pagoParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_cobrar_debitoParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_cobrar_debitoParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_cobrar_debitoParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_cobrar_debitoParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_cobrar_creditoParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_cobrar_creditoParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_cobrar_creditoParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_cobrar_creditoParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_pagar_pagoParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_pagar_pagoParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_pagar_pagoParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_pagar_pagoParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_pagar_debitoParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_pagar_debitoParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_pagar_debitoParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_pagar_debitoParametroTesoreriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_pagar_creditoParametroTesoreriaUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_pagar_creditoParametroTesoreriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtonid_transaccion_pagar_creditoParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_pagar_creditoParametroTesoreriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreria.jButtondescripcionParametroTesoreriaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionParametroTesoreriaBusqueda"));
		
		
		this.jButtonFK_IdTransaccionCobrarCreditoParametroTesoreria.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionCobrarCreditoParametroTesoreria"));

		this.jButtonFK_IdTransaccionCobrarDebitoParametroTesoreria.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionCobrarDebitoParametroTesoreria"));

		this.jButtonFK_IdTransaccionCobrarPagoParametroTesoreria.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionCobrarPagoParametroTesoreria"));

		this.jButtonFK_IdTransaccionPagarCreditoParametroTesoreria.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionPagarCreditoParametroTesoreria"));

		this.jButtonFK_IdTransaccionPagarDebitoParametroTesoreria.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionPagarDebitoParametroTesoreria"));

		this.jButtonFK_IdTransaccionPagarPagoParametroTesoreria.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionPagarPagoParametroTesoreria"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParametroTesoreria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParametroTesoreriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParametroTesoreriaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParametroTesoreria.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParametroTesoreria(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ParametroTesoreria parametrotesoreriaAux:this.parametrotesoreriaLogic.getParametroTesorerias()) {
					parametrotesoreriaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroTesoreria parametrotesoreriaAux:parametrotesorerias) {
					parametrotesoreriaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParametroTesoreriaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroTesoreria(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroTesoreria parametrotesoreriaAux:this.parametrotesoreriaLogic.getParametroTesorerias()) {
						parametrotesoreriaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroTesoreria parametrotesoreriaAux:parametrotesorerias) {
						parametrotesoreriaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ParametroTesoreria parametrotesoreriaAux:this.parametrotesoreriaLogic.getParametroTesorerias()) {
					
						if(sTipoSeleccionar.equals(ParametroTesoreriaConstantesFunciones.LABEL_CONANTICIPOORDENCOMPRA)) {
							existe=true;
							parametrotesoreriaAux.setcon_anticipo_orden_compra(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroTesoreriaConstantesFunciones.LABEL_PORLOTES)) {
							existe=true;
							parametrotesoreriaAux.setpor_lotes(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroTesoreria parametrotesoreriaAux:parametrotesorerias) {
						
						if(sTipoSeleccionar.equals(ParametroTesoreriaConstantesFunciones.LABEL_CONANTICIPOORDENCOMPRA)) {
							existe=true;
							parametrotesoreriaAux.setcon_anticipo_orden_compra(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroTesoreriaConstantesFunciones.LABEL_PORLOTES)) {
							existe=true;
							parametrotesoreriaAux.setpor_lotes(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParametroTesoreria(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroTesoreria.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroTesoreria.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParametroTesoreriaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroTesoreria(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParametroTesoreria.getSelectedRows();
			
			ParametroTesoreria parametrotesoreriaLocal=new ParametroTesoreria();
			
			//this.seleccionarTodosParametroTesoreria(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrotesoreriaLocal =(ParametroTesoreria) this.parametrotesoreriaLogic.getParametroTesorerias().toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parametrotesoreriaLocal =(ParametroTesoreria) this.parametrotesorerias.toArray()[this.jTableDatosParametroTesoreria.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parametrotesoreriaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroTesoreria parametrotesoreriaAux:this.parametrotesoreriaLogic.getParametroTesorerias()) {
						parametrotesoreriaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroTesoreria parametrotesoreriaAux:parametrotesorerias) {
						parametrotesoreriaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParametroTesoreria(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroTesoreria.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroTesoreria.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreria,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParametroTesoreriaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParametroTesoreriaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParametroTesoreriaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParametroTesoreria(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParametroTesoreria.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroTesoreria parametrotesoreriaAux:this.parametrotesoreriaLogic.getParametroTesorerias()) {
				
						if(sTipoSeleccionar.equals(ParametroTesoreriaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							parametrotesoreriaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroTesoreria parametrotesoreriaAux:parametrotesorerias) {
					
						if(sTipoSeleccionar.equals(ParametroTesoreriaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							parametrotesoreriaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParametroTesoreria(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParametroTesoreriaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParametroTesoreria(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParametroTesoreria=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParametroTesoreria.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxTiposAccionesFormularioParametroTesoreria.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParametroTesoreria) {				
					conSplash=true;//false;										
					
					//this.startProcessParametroTesoreria(conSplash);
				
					this.generarReporteParametroTesoreriasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroTesoreria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxTiposAccionesFormularioParametroTesoreria.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParametroTesoreriasSeleccionados();
				//this.jComboBoxTiposAccionesParametroTesoreria.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroTesoreriasSeleccionados(false);
				//this.jComboBoxTiposAccionesParametroTesoreria.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroTesoreriasSeleccionados(true);
				//this.jComboBoxTiposAccionesParametroTesoreria.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroTesoreria();
				
				this.exportarParametroTesoreriasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroTesoreria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxTiposAccionesFormularioParametroTesoreria.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParametroTesorerias();
				//this.importarParametroTesorerias();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroTesoreria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxTiposAccionesFormularioParametroTesoreria.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroTesoreria();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParametroTesoreriasSeleccionados();
				//this.jComboBoxTiposAccionesParametroTesoreria.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parametro Tesoreria", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParametroTesoreria();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParametroTesoreria)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParametroTesoreria(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Tesoreria",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroTesoreria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxTiposAccionesFormularioParametroTesoreria.setSelectedIndex(0);					
				}	
			} 			
			else if(ParametroTesoreriaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParametroTesoreria) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParametroTesoreria(conSplash);
					
						//this.actualizarParametrosGeneralParametroTesoreria();
						
						this.generarReporteProcesoAccionParametroTesoreriasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParametroTesoreria.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxTiposAccionesFormularioParametroTesoreria.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParametroTesoreriaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Parametro TesoreriaS SELECCIONADOS?", "MANTENIMIENTO DE Parametro Tesoreria", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParametroTesoreria();
				
						this.actualizarParametrosGeneralParametroTesoreria();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parametrotesoreriaReturnGeneral=parametrotesoreriaLogic.procesarAccionParametroTesoreriasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parametrotesoreriaLogic.getParametroTesorerias(),this.parametrotesoreriaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParametroTesoreriaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroTesoreria.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxTiposAccionesFormularioParametroTesoreria.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParametroTesoreria();
					
					ParametroTesoreriaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParametroTesoreriaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroTesoreria.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxTiposAccionesFormularioParametroTesoreria.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParametroTesoreria(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParametroTesoreriaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParametroTesoreria();
			
			if(this.jInternalFrameDetalleFormParametroTesoreria==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ParametroTesoreria> parametrotesoreriasSeleccionados=new ArrayList<ParametroTesoreria>();		
			ParametroTesoreria parametrotesoreria=new ParametroTesoreria();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParametroTesoreria(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParametroTesoreria.getSelectedItem();
			
			
			
			
			parametrotesoreriasSeleccionados=this.getParametroTesoreriasSeleccionados(true);
			//this.sTipoAccion;
			
			if(parametrotesoreriasSeleccionados.size()==1) {
				for(ParametroTesoreria parametrotesoreriaAux:parametrotesoreriasSeleccionados) {
					parametrotesoreria=parametrotesoreriaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParametroTesoreria();
			
      		//this.finishProcessParametroTesoreria(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParametroTesoreriaReturnGeneral() throws Exception {
		if(this.parametrotesoreriaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parametrotesoreriaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parametrotesoreriaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parametrotesoreriaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parametrotesoreriaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parametrotesoreriaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParametroTesoreria(false);
		}
		
		if(this.parametrotesoreriaReturnGeneral.getConRetornoLista() || this.parametrotesoreriaReturnGeneral.getConRetornoObjeto()) {
			if(this.parametrotesoreriaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrotesoreriaLogic.setParametroTesorerias(this.parametrotesoreriaReturnGeneral.getParametroTesorerias());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parametrotesoreriaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrotesoreriaLogic.setParametroTesoreria(this.parametrotesoreriaReturnGeneral.getParametroTesoreria());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParametroTesoreria(false);
		}
	}
	
	public void actualizarParametrosGeneralParametroTesoreria() throws Exception {
		
		
	}
	
	public ArrayList<ParametroTesoreria> getParametroTesoreriasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParametroTesoreria> parametrotesoreriasSeleccionados=new ArrayList<ParametroTesoreria>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParametroTesoreria) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ParametroTesoreria parametrotesoreriaAux:parametrotesoreriaLogic.getParametroTesorerias()) {
					if(parametrotesoreriaAux.getIsSelected()) {
						parametrotesoreriasSeleccionados.add(parametrotesoreriaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroTesoreria parametrotesoreriaAux:this.parametrotesorerias) {
					if(parametrotesoreriaAux.getIsSelected()) {
						parametrotesoreriasSeleccionados.add(parametrotesoreriaAux);				
					}
				}
			}
			
			if(parametrotesoreriasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parametrotesoreriasSeleccionados.addAll(this.parametrotesoreriaLogic.getParametroTesorerias());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parametrotesoreriasSeleccionados.addAll(this.parametrotesorerias);				
					}
				}
			}
		} else {
			parametrotesoreriasSeleccionados.add(this.parametrotesoreria);
		}
		
		return parametrotesoreriasSeleccionados;
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
	
	public void generarReporteParametroTesoreriasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParametroTesoreriasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParametroTesoreriasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroTesoreriasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroTesoreriasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parametro Tesoreria",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParametroTesoreriasSeleccionados() throws Exception {
		ArrayList<ParametroTesoreria> parametrotesoreriasSeleccionados=new ArrayList<ParametroTesoreria>();		
		
		parametrotesoreriasSeleccionados=this.getParametroTesoreriasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParametroTesorerias("Todos",parametrotesoreriasSeleccionados);
		
	}	
	
	public void generarReporteNormalParametroTesoreriasSeleccionados() throws Exception {
		ArrayList<ParametroTesoreria> parametrotesoreriasSeleccionados=new ArrayList<ParametroTesoreria>();		
		
		parametrotesoreriasSeleccionados=this.getParametroTesoreriasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParametroTesorerias("Todos",parametrotesoreriasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParametroTesoreriasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ParametroTesoreria> parametrotesoreriasSeleccionados=new ArrayList<ParametroTesoreria>();
		
		parametrotesoreriasSeleccionados=this.getParametroTesoreriasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParametroTesorerias("Todos",parametrotesoreriasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParametroTesoreriasSeleccionados() throws Exception {
		ArrayList<ParametroTesoreria> parametrotesoreriasSeleccionados=new ArrayList<ParametroTesoreria>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParametroTesoreria();
		
		
		parametrotesoreriasSeleccionados=this.getParametroTesoreriasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParametroTesoreria();
		
		
		//this.generarReporteParametroTesorerias("Todos",parametrotesoreriasSeleccionados ,parametrotesoreriaImplementable,parametrotesoreriaImplementableHome);
	}
	
	public void mostrarImportacionParametroTesorerias() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParametroTesoreria();
		
		this.abrirFrameImportacionParametroTesoreria();		
		
			
		//this.generarReporteParametroTesorerias("Todos",parametrotesoreriasSeleccionados ,parametrotesoreriaImplementable,parametrotesoreriaImplementableHome);
	}
	
	public void importarParametroTesorerias() throws Exception {		
	
	}
	
	public void exportarParametroTesoreriasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParametroTesoreriasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParametroTesoreriasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParametroTesoreriasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parametro Tesoreria",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParametroTesoreriasSeleccionados() throws Exception {
		ArrayList<ParametroTesoreria> parametrotesoreriasSeleccionados=new ArrayList<ParametroTesoreria>();		
		
		parametrotesoreriasSeleccionados=this.getParametroTesoreriasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrotesoreria."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParametroTesoreria(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ParametroTesoreria parametrotesoreriaAux:parametrotesoreriasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParametroTesoreria(parametrotesoreriaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parametrotesoreriaAux.setsDetalleGeneralEntityReporte(parametrotesoreriaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Tesoreria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParametroTesoreria(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParametroTesoreriaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroTesoreriaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroTesoreriaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroTesoreriaConstantesFunciones.LABEL_CONANTICIPOORDENCOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroTesoreriaConstantesFunciones.LABEL_PORLOTES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARDEBITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARCREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARDEBITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARCREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroTesoreriaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParametroTesoreria(ParametroTesoreria parametrotesoreria,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parametrotesoreria.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrotesoreria.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrotesoreria.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrotesoreria.getcon_anticipo_orden_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrotesoreria.getpor_lotes().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrotesoreria.gettransaccioncobrarpago_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrotesoreria.gettransaccioncobrardebito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrotesoreria.gettransaccioncobrarcredito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrotesoreria.gettransaccionpagarpago_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrotesoreria.gettransaccionpagardebito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrotesoreria.gettransaccionpagarcredito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrotesoreria.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParametroTesoreriasSeleccionados() throws Exception {
		ArrayList<ParametroTesoreria> parametrotesoreriasSeleccionados=new ArrayList<ParametroTesoreria>();		
		
		parametrotesoreriasSeleccionados=this.getParametroTesoreriasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrotesoreria.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ParametroTesorerias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParametroTesoreria(row);				
				iRow++;
			}				
			
			for(ParametroTesoreria parametrotesoreriaAux:parametrotesoreriasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParametroTesoreria(parametrotesoreriaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Tesoreria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParametroTesoreriasSeleccionados() throws Exception {
		ArrayList<ParametroTesoreria> parametrotesoreriasSeleccionados=new ArrayList<ParametroTesoreria>();		
		
		parametrotesoreriasSeleccionados=this.getParametroTesoreriasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrotesoreria.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parametrotesorerias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parametrotesoreria");
			//elementRoot.appendChild(element);
		
			for(ParametroTesoreria parametrotesoreriaAux:parametrotesoreriasSeleccionados) {
				element = document.createElement("parametrotesoreria");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParametroTesoreria(parametrotesoreriaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Tesoreria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParametroTesoreria(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_CONANTICIPOORDENCOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_PORLOTES);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARDEBITO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARCREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARDEBITO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARCREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroTesoreriaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelParametroTesoreria(ParametroTesoreria parametrotesoreria,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parametrotesoreria.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrotesoreria.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrotesoreria.getcon_anticipo_orden_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrotesoreria.getpor_lotes());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrotesoreria.gettransaccioncobrarpago_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrotesoreria.gettransaccioncobrardebito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrotesoreria.gettransaccioncobrarcredito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrotesoreria.gettransaccionpagarpago_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrotesoreria.gettransaccionpagardebito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrotesoreria.gettransaccionpagarcredito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrotesoreria.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlParametroTesoreria(ParametroTesoreria parametrotesoreria,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParametroTesoreriaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parametrotesoreria.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParametroTesoreriaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parametrotesoreria.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ParametroTesoreriaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(parametrotesoreria.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcon_anticipo_orden_compra = document.createElement(ParametroTesoreriaConstantesFunciones.CONANTICIPOORDENCOMPRA);
		elementcon_anticipo_orden_compra.appendChild(document.createTextNode(parametrotesoreria.getcon_anticipo_orden_compra().toString().trim()));
		element.appendChild(elementcon_anticipo_orden_compra);

		Element elementpor_lotes = document.createElement(ParametroTesoreriaConstantesFunciones.PORLOTES);
		elementpor_lotes.appendChild(document.createTextNode(parametrotesoreria.getpor_lotes().toString().trim()));
		element.appendChild(elementpor_lotes);

		Element elementtransaccioncobrarpago_descripcion = document.createElement(ParametroTesoreriaConstantesFunciones.IDTRANSACCIONCOBRARPAGO);
		elementtransaccioncobrarpago_descripcion.appendChild(document.createTextNode(parametrotesoreria.gettransaccioncobrarpago_descripcion()));
		element.appendChild(elementtransaccioncobrarpago_descripcion);

		Element elementtransaccioncobrardebito_descripcion = document.createElement(ParametroTesoreriaConstantesFunciones.IDTRANSACCIONCOBRARDEBITO);
		elementtransaccioncobrardebito_descripcion.appendChild(document.createTextNode(parametrotesoreria.gettransaccioncobrardebito_descripcion()));
		element.appendChild(elementtransaccioncobrardebito_descripcion);

		Element elementtransaccioncobrarcredito_descripcion = document.createElement(ParametroTesoreriaConstantesFunciones.IDTRANSACCIONCOBRARCREDITO);
		elementtransaccioncobrarcredito_descripcion.appendChild(document.createTextNode(parametrotesoreria.gettransaccioncobrarcredito_descripcion()));
		element.appendChild(elementtransaccioncobrarcredito_descripcion);

		Element elementtransaccionpagarpago_descripcion = document.createElement(ParametroTesoreriaConstantesFunciones.IDTRANSACCIONPAGARPAGO);
		elementtransaccionpagarpago_descripcion.appendChild(document.createTextNode(parametrotesoreria.gettransaccionpagarpago_descripcion()));
		element.appendChild(elementtransaccionpagarpago_descripcion);

		Element elementtransaccionpagardebito_descripcion = document.createElement(ParametroTesoreriaConstantesFunciones.IDTRANSACCIONPAGARDEBITO);
		elementtransaccionpagardebito_descripcion.appendChild(document.createTextNode(parametrotesoreria.gettransaccionpagardebito_descripcion()));
		element.appendChild(elementtransaccionpagardebito_descripcion);

		Element elementtransaccionpagarcredito_descripcion = document.createElement(ParametroTesoreriaConstantesFunciones.IDTRANSACCIONPAGARCREDITO);
		elementtransaccionpagarcredito_descripcion.appendChild(document.createTextNode(parametrotesoreria.gettransaccionpagarcredito_descripcion()));
		element.appendChild(elementtransaccionpagarcredito_descripcion);

		Element elementdescripcion = document.createElement(ParametroTesoreriaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(parametrotesoreria.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoParametroTesoreriasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ParametroTesoreria> parametrotesoreriasSeleccionados=new ArrayList<ParametroTesoreria>();
		
		parametrotesoreriasSeleccionados=this.getParametroTesoreriasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParametroTesoreria(parametrotesoreriasSeleccionados);
		
		this.generarReporteParametroTesorerias("Todos",parametrotesoreriasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParametroTesoreria(ArrayList<ParametroTesoreria> parametrotesoreriasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParametroTesoreria parametrotesoreriaAux:parametrotesoreriasSeleccionados) {
				parametrotesoreriaAux.setsDetalleGeneralEntityReporte(parametrotesoreriaAux.toString());
			
				if(sTipoSeleccionar.equals(ParametroTesoreriaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					parametrotesoreriaAux.setsDescripcionGeneralEntityReporte1(parametrotesoreriaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroTesoreriaConstantesFunciones.LABEL_CONANTICIPOORDENCOMPRA)) {
					existe=true;
					parametrotesoreriaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametrotesoreriaAux.getcon_anticipo_orden_compra()));
				}
				 else if(sTipoSeleccionar.equals(ParametroTesoreriaConstantesFunciones.LABEL_PORLOTES)) {
					existe=true;
					parametrotesoreriaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametrotesoreriaAux.getpor_lotes()));
				}
				 else if(sTipoSeleccionar.equals(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARPAGO)) {
					existe=true;
					parametrotesoreriaAux.setsDescripcionGeneralEntityReporte1(parametrotesoreriaAux.gettransaccioncobrarpago_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARDEBITO)) {
					existe=true;
					parametrotesoreriaAux.setsDescripcionGeneralEntityReporte1(parametrotesoreriaAux.gettransaccioncobrardebito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARCREDITO)) {
					existe=true;
					parametrotesoreriaAux.setsDescripcionGeneralEntityReporte1(parametrotesoreriaAux.gettransaccioncobrarcredito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARPAGO)) {
					existe=true;
					parametrotesoreriaAux.setsDescripcionGeneralEntityReporte1(parametrotesoreriaAux.gettransaccionpagarpago_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARDEBITO)) {
					existe=true;
					parametrotesoreriaAux.setsDescripcionGeneralEntityReporte1(parametrotesoreriaAux.gettransaccionpagardebito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARCREDITO)) {
					existe=true;
					parametrotesoreriaAux.setsDescripcionGeneralEntityReporte1(parametrotesoreriaAux.gettransaccionpagarcredito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroTesoreriaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					parametrotesoreriaAux.setsDescripcionGeneralEntityReporte1(parametrotesoreriaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParametroTesoreria(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParametroTesoreria=true;
				this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria=true;
				this.isVisibilidadCeldaGuardarCambiosParametroTesoreria=true;
			}
			
			this.isVisibilidadCeldaModificarParametroTesoreria=false;
			this.isVisibilidadCeldaActualizarParametroTesoreria=false;
			this.isVisibilidadCeldaEliminarParametroTesoreria=false;
			this.isVisibilidadCeldaCancelarParametroTesoreria=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroTesoreria=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroTesoreria=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParametroTesoreria=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria=false;
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreria=false;
			this.isVisibilidadCeldaModificarParametroTesoreria=false;
			this.isVisibilidadCeldaActualizarParametroTesoreria=true;
			this.isVisibilidadCeldaEliminarParametroTesoreria=false;
			this.isVisibilidadCeldaCancelarParametroTesoreria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroTesoreria=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroTesoreria=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParametroTesoreria=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria=false;
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreria=false;
			this.isVisibilidadCeldaModificarParametroTesoreria=false;
			this.isVisibilidadCeldaActualizarParametroTesoreria=true;
			this.isVisibilidadCeldaEliminarParametroTesoreria=true;
			this.isVisibilidadCeldaCancelarParametroTesoreria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroTesoreria=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroTesoreria=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParametroTesoreria=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria=false;
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreria=false;
			this.isVisibilidadCeldaModificarParametroTesoreria=false;
			this.isVisibilidadCeldaActualizarParametroTesoreria=true;
			this.isVisibilidadCeldaEliminarParametroTesoreria=false;
			this.isVisibilidadCeldaCancelarParametroTesoreria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroTesoreria=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroTesoreria=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParametroTesoreria=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria=true;
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreria=true;
			this.isVisibilidadCeldaModificarParametroTesoreria=false;
			this.isVisibilidadCeldaActualizarParametroTesoreria=false;
			this.isVisibilidadCeldaEliminarParametroTesoreria=false;
			this.isVisibilidadCeldaCancelarParametroTesoreria=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroTesoreria=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroTesoreria=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParametroTesoreria=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria=false;
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreria=false;
			this.isVisibilidadCeldaActualizarParametroTesoreria=false;
			this.isVisibilidadCeldaEliminarParametroTesoreria=false;
			this.isVisibilidadCeldaCancelarParametroTesoreria=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroTesoreria=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroTesoreria=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParametroTesoreria=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria=false;
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreria=false;
			this.isVisibilidadCeldaModificarParametroTesoreria=true;
			this.isVisibilidadCeldaActualizarParametroTesoreria=false;
			this.isVisibilidadCeldaEliminarParametroTesoreria=false;
			this.isVisibilidadCeldaCancelarParametroTesoreria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroTesoreria=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroTesoreria=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParametroTesoreriaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParametroTesoreria=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria=true;
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreria=true;
		} else {
			this.actualizarEstadoPanelsParametroTesoreria(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParametroTesoreria=false;
			//this.isVisibilidadCeldaVerFormParametroTesoreria=false;
			this.isVisibilidadCeldaDuplicarParametroTesoreria=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parametrotesoreriaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria=false;
		} else {
			this.isVisibilidadCeldaNuevoParametroTesoreria=false;
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreria=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
			if(!parametrotesoreriaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria=false;												
			}
			
			this.jButtonCerrarParametroTesoreria.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreria=false;
		}
		
		if(!this.permiteMantenimiento(this.parametrotesoreria)) {
			this.isVisibilidadCeldaActualizarParametroTesoreria=false;
			this.isVisibilidadCeldaEliminarParametroTesoreria=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParametroTesoreria() {
	}
	
	public void actualizarEstadoPanelsParametroTesoreria(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParametroTesoreria!=null) {
				this.jScrollPanelDatosEdicionParametroTesoreria.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroTesoreria!=null) {
				this.jTabbedPaneBusquedasParametroTesoreria.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroTesoreria!=null) {
				this.jScrollPanelDatosParametroTesoreria.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroTesoreria!=null) {
				this.jPanelPaginacionParametroTesoreria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroTesoreria!=null) {
				this.jPanelParametrosReportesParametroTesoreria.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParametroTesoreria!=null) {
				this.jScrollPanelDatosEdicionParametroTesoreria.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroTesoreria!=null) {
				this.jTabbedPaneBusquedasParametroTesoreria.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosParametroTesoreria!=null) {
				this.jScrollPanelDatosParametroTesoreria.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroTesoreria!=null) {
				this.jPanelPaginacionParametroTesoreria.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroTesoreria!=null) {
				this.jPanelParametrosReportesParametroTesoreria.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParametroTesoreria!=null) {
				this.jScrollPanelDatosEdicionParametroTesoreria.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroTesoreria!=null) {
				this.jTabbedPaneBusquedasParametroTesoreria.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroTesoreria!=null) {
				this.jScrollPanelDatosParametroTesoreria.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroTesoreria!=null) {
				this.jPanelPaginacionParametroTesoreria.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroTesoreria!=null) {
				this.jPanelParametrosReportesParametroTesoreria.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParametroTesoreria!=null) {
				this.jScrollPanelDatosEdicionParametroTesoreria.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroTesoreria!=null) {
				this.jTabbedPaneBusquedasParametroTesoreria.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroTesoreria!=null) {
				this.jScrollPanelDatosParametroTesoreria.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroTesoreria!=null) {
				this.jPanelPaginacionParametroTesoreria.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroTesoreria!=null) {
				this.jPanelParametrosReportesParametroTesoreria.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParametroTesoreria!=null) {
				this.jScrollPanelDatosEdicionParametroTesoreria.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroTesoreria!=null) {
				this.jTabbedPaneBusquedasParametroTesoreria.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroTesoreria!=null) {
				this.jScrollPanelDatosParametroTesoreria.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroTesoreria!=null) {
				this.jPanelPaginacionParametroTesoreria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroTesoreria!=null) {
				this.jPanelParametrosReportesParametroTesoreria.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParametroTesoreria!=null) {
				this.jScrollPanelDatosEdicionParametroTesoreria.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroTesoreria!=null) {
				this.jTabbedPaneBusquedasParametroTesoreria.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroTesoreria!=null) {
				this.jScrollPanelDatosParametroTesoreria.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroTesoreria!=null) {
				this.jPanelPaginacionParametroTesoreria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroTesoreria!=null) {
				this.jPanelParametrosReportesParametroTesoreria.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParametroTesoreria!=null) {
				this.jScrollPanelDatosEdicionParametroTesoreria.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroTesoreria!=null) {
				this.jTabbedPaneBusquedasParametroTesoreria.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroTesoreria!=null) {
				this.jScrollPanelDatosParametroTesoreria.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroTesoreria!=null) {
				this.jPanelPaginacionParametroTesoreria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroTesoreria!=null) {
				this.jPanelParametrosReportesParametroTesoreria.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasParametroTesoreria!=null) {
					this.jTabbedPaneBusquedasParametroTesoreria.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesParametroTesoreria!=null) {
				this.jPanelParametrosReportesParametroTesoreria.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroTesoreria!=null) {
				this.jTabbedPaneBusquedasParametroTesoreria.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesParametroTesoreria!=null) {
				this.jPanelParametrosReportesParametroTesoreria.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTransaccionCobrarCredito=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTransaccionCobrarCredito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarCreditoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionCobrarDebito=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTransaccionCobrarDebito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarDebitoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionCobrarPago=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTransaccionCobrarPago) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarPagoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarCredito=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTransaccionPagarCredito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarCreditoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarDebito=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTransaccionPagarDebito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarDebitoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarPago=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTransaccionPagarPago) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarPagoParametroTesoreria);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccionCobrarPago(Boolean isParaTransaccionCobrarPago){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionCobrarPagoNegation=!isParaTransaccionCobrarPago;

			this.isVisibilidadFK_IdTransaccionCobrarCredito=isParaTransaccionCobrarPagoNegation;
			if(!this.isVisibilidadFK_IdTransaccionCobrarCredito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarCreditoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionCobrarDebito=isParaTransaccionCobrarPagoNegation;
			if(!this.isVisibilidadFK_IdTransaccionCobrarDebito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarDebitoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionCobrarPago=isParaTransaccionCobrarPago;
			if(!this.isVisibilidadFK_IdTransaccionCobrarPago) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarPagoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarCredito=isParaTransaccionCobrarPagoNegation;
			if(!this.isVisibilidadFK_IdTransaccionPagarCredito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarCreditoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarDebito=isParaTransaccionCobrarPagoNegation;
			if(!this.isVisibilidadFK_IdTransaccionPagarDebito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarDebitoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarPago=isParaTransaccionCobrarPagoNegation;
			if(!this.isVisibilidadFK_IdTransaccionPagarPago) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarPagoParametroTesoreria);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccionCobrarDebito(Boolean isParaTransaccionCobrarDebito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionCobrarDebitoNegation=!isParaTransaccionCobrarDebito;

			this.isVisibilidadFK_IdTransaccionCobrarCredito=isParaTransaccionCobrarDebitoNegation;
			if(!this.isVisibilidadFK_IdTransaccionCobrarCredito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarCreditoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionCobrarDebito=isParaTransaccionCobrarDebito;
			if(!this.isVisibilidadFK_IdTransaccionCobrarDebito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarDebitoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionCobrarPago=isParaTransaccionCobrarDebitoNegation;
			if(!this.isVisibilidadFK_IdTransaccionCobrarPago) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarPagoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarCredito=isParaTransaccionCobrarDebitoNegation;
			if(!this.isVisibilidadFK_IdTransaccionPagarCredito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarCreditoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarDebito=isParaTransaccionCobrarDebitoNegation;
			if(!this.isVisibilidadFK_IdTransaccionPagarDebito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarDebitoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarPago=isParaTransaccionCobrarDebitoNegation;
			if(!this.isVisibilidadFK_IdTransaccionPagarPago) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarPagoParametroTesoreria);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccionCobrarCredito(Boolean isParaTransaccionCobrarCredito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionCobrarCreditoNegation=!isParaTransaccionCobrarCredito;

			this.isVisibilidadFK_IdTransaccionCobrarCredito=isParaTransaccionCobrarCredito;
			if(!this.isVisibilidadFK_IdTransaccionCobrarCredito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarCreditoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionCobrarDebito=isParaTransaccionCobrarCreditoNegation;
			if(!this.isVisibilidadFK_IdTransaccionCobrarDebito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarDebitoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionCobrarPago=isParaTransaccionCobrarCreditoNegation;
			if(!this.isVisibilidadFK_IdTransaccionCobrarPago) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarPagoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarCredito=isParaTransaccionCobrarCreditoNegation;
			if(!this.isVisibilidadFK_IdTransaccionPagarCredito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarCreditoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarDebito=isParaTransaccionCobrarCreditoNegation;
			if(!this.isVisibilidadFK_IdTransaccionPagarDebito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarDebitoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarPago=isParaTransaccionCobrarCreditoNegation;
			if(!this.isVisibilidadFK_IdTransaccionPagarPago) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarPagoParametroTesoreria);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccionPagarPago(Boolean isParaTransaccionPagarPago){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionPagarPagoNegation=!isParaTransaccionPagarPago;

			this.isVisibilidadFK_IdTransaccionCobrarCredito=isParaTransaccionPagarPagoNegation;
			if(!this.isVisibilidadFK_IdTransaccionCobrarCredito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarCreditoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionCobrarDebito=isParaTransaccionPagarPagoNegation;
			if(!this.isVisibilidadFK_IdTransaccionCobrarDebito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarDebitoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionCobrarPago=isParaTransaccionPagarPagoNegation;
			if(!this.isVisibilidadFK_IdTransaccionCobrarPago) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarPagoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarCredito=isParaTransaccionPagarPagoNegation;
			if(!this.isVisibilidadFK_IdTransaccionPagarCredito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarCreditoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarDebito=isParaTransaccionPagarPagoNegation;
			if(!this.isVisibilidadFK_IdTransaccionPagarDebito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarDebitoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarPago=isParaTransaccionPagarPago;
			if(!this.isVisibilidadFK_IdTransaccionPagarPago) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarPagoParametroTesoreria);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccionPagarDebito(Boolean isParaTransaccionPagarDebito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionPagarDebitoNegation=!isParaTransaccionPagarDebito;

			this.isVisibilidadFK_IdTransaccionCobrarCredito=isParaTransaccionPagarDebitoNegation;
			if(!this.isVisibilidadFK_IdTransaccionCobrarCredito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarCreditoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionCobrarDebito=isParaTransaccionPagarDebitoNegation;
			if(!this.isVisibilidadFK_IdTransaccionCobrarDebito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarDebitoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionCobrarPago=isParaTransaccionPagarDebitoNegation;
			if(!this.isVisibilidadFK_IdTransaccionCobrarPago) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarPagoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarCredito=isParaTransaccionPagarDebitoNegation;
			if(!this.isVisibilidadFK_IdTransaccionPagarCredito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarCreditoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarDebito=isParaTransaccionPagarDebito;
			if(!this.isVisibilidadFK_IdTransaccionPagarDebito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarDebitoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarPago=isParaTransaccionPagarDebitoNegation;
			if(!this.isVisibilidadFK_IdTransaccionPagarPago) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarPagoParametroTesoreria);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccionPagarCredito(Boolean isParaTransaccionPagarCredito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionPagarCreditoNegation=!isParaTransaccionPagarCredito;

			this.isVisibilidadFK_IdTransaccionCobrarCredito=isParaTransaccionPagarCreditoNegation;
			if(!this.isVisibilidadFK_IdTransaccionCobrarCredito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarCreditoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionCobrarDebito=isParaTransaccionPagarCreditoNegation;
			if(!this.isVisibilidadFK_IdTransaccionCobrarDebito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarDebitoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionCobrarPago=isParaTransaccionPagarCreditoNegation;
			if(!this.isVisibilidadFK_IdTransaccionCobrarPago) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionCobrarPagoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarCredito=isParaTransaccionPagarCredito;
			if(!this.isVisibilidadFK_IdTransaccionPagarCredito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarCreditoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarDebito=isParaTransaccionPagarCreditoNegation;
			if(!this.isVisibilidadFK_IdTransaccionPagarDebito) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarDebitoParametroTesoreria);}

			this.isVisibilidadFK_IdTransaccionPagarPago=isParaTransaccionPagarCreditoNegation;
			if(!this.isVisibilidadFK_IdTransaccionPagarPago) {this.jTabbedPaneBusquedasParametroTesoreria.remove(jPanelFK_IdTransaccionPagarPagoParametroTesoreria);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParametroTesoreriaSessionBean parametrotesoreriaSessionBean=new ParametroTesoreriaSessionBean();
		
		if(this.parametrotesoreriaSessionBean==null) {
			this.parametrotesoreriaSessionBean=new ParametroTesoreriaSessionBean();
		}
		
		this.parametrotesoreriaSessionBean.setsUltimaBusquedaParametroTesoreria(this.getsAccionBusqueda());
		this.parametrotesoreriaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parametrotesoreriaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			parametrotesoreriaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTransaccionCobrarCredito")) {
			parametrotesoreriaSessionBean.setid_transaccion_cobrar_credito(this.getid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCredito());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTransaccionCobrarDebito")) {
			parametrotesoreriaSessionBean.setid_transaccion_cobrar_debito(this.getid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebito());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTransaccionCobrarPago")) {
			parametrotesoreriaSessionBean.setid_transaccion_cobrar_pago(this.getid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPago());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTransaccionPagarCredito")) {
			parametrotesoreriaSessionBean.setid_transaccion_pagar_credito(this.getid_transaccion_pagar_creditoFK_IdTransaccionPagarCredito());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTransaccionPagarDebito")) {
			parametrotesoreriaSessionBean.setid_transaccion_pagar_debito(this.getid_transaccion_pagar_debitoFK_IdTransaccionPagarDebito());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTransaccionPagarPago")) {
			parametrotesoreriaSessionBean.setid_transaccion_pagar_pago(this.getid_transaccion_pagar_pagoFK_IdTransaccionPagarPago());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParametroTesoreriaSessionBean parametrotesoreriaSessionBean=new ParametroTesoreriaSessionBean();
		
		if(this.parametrotesoreriaSessionBean==null) {
			this.parametrotesoreriaSessionBean=new ParametroTesoreriaSessionBean();
		}
		
		if(this.parametrotesoreriaSessionBean.getsUltimaBusquedaParametroTesoreria()!=null&&!this.parametrotesoreriaSessionBean.getsUltimaBusquedaParametroTesoreria().equals("")) {
			this.setsAccionBusqueda(parametrotesoreriaSessionBean.getsUltimaBusquedaParametroTesoreria());
			this.setiNumeroPaginacion(parametrotesoreriaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parametrotesoreriaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(parametrotesoreriaSessionBean.getid_empresa());
				parametrotesoreriaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTransaccionCobrarCredito")) {
				this.setid_transaccion_cobrar_creditoFK_IdTransaccionCobrarCredito(parametrotesoreriaSessionBean.getid_transaccion_cobrar_credito());
				parametrotesoreriaSessionBean.setid_transaccion_cobrar_credito(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTransaccionCobrarDebito")) {
				this.setid_transaccion_cobrar_debitoFK_IdTransaccionCobrarDebito(parametrotesoreriaSessionBean.getid_transaccion_cobrar_debito());
				parametrotesoreriaSessionBean.setid_transaccion_cobrar_debito(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTransaccionCobrarPago")) {
				this.setid_transaccion_cobrar_pagoFK_IdTransaccionCobrarPago(parametrotesoreriaSessionBean.getid_transaccion_cobrar_pago());
				parametrotesoreriaSessionBean.setid_transaccion_cobrar_pago(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTransaccionPagarCredito")) {
				this.setid_transaccion_pagar_creditoFK_IdTransaccionPagarCredito(parametrotesoreriaSessionBean.getid_transaccion_pagar_credito());
				parametrotesoreriaSessionBean.setid_transaccion_pagar_credito(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTransaccionPagarDebito")) {
				this.setid_transaccion_pagar_debitoFK_IdTransaccionPagarDebito(parametrotesoreriaSessionBean.getid_transaccion_pagar_debito());
				parametrotesoreriaSessionBean.setid_transaccion_pagar_debito(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTransaccionPagarPago")) {
				this.setid_transaccion_pagar_pagoFK_IdTransaccionPagarPago(parametrotesoreriaSessionBean.getid_transaccion_pagar_pago());
				parametrotesoreriaSessionBean.setid_transaccion_pagar_pago(-1L);
			}
		}
		
		this.parametrotesoreriaSessionBean.setsUltimaBusquedaParametroTesoreria("");
		this.parametrotesoreriaSessionBean.setiNumeroPaginacion(ParametroTesoreriaConstantesFunciones.INUMEROPAGINACION);
		this.parametrotesoreriaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParametroTesoreria(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParametroTesoreria() {
		this.updateBorderResaltarBusquedasFormularioParametroTesoreria();
		this.updateVisibilidadBusquedasFormularioParametroTesoreria();
		this.updateHabilitarBusquedasFormularioParametroTesoreria();
	}
	
	public void updateBorderResaltarBusquedasFormularioParametroTesoreria() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasParametroTesoreria.getComponents().length>0) {
	

		if(this.parametrotesoreriaConstantesFunciones.resaltarFK_IdTransaccionCobrarCreditoParametroTesoreria!=null) {
			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionCobrarCreditoParametroTesoreria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);
				jPanel.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarFK_IdTransaccionCobrarCreditoParametroTesoreria);
			}
		}

		if(this.parametrotesoreriaConstantesFunciones.resaltarFK_IdTransaccionCobrarDebitoParametroTesoreria!=null) {
			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionCobrarDebitoParametroTesoreria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);
				jPanel.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarFK_IdTransaccionCobrarDebitoParametroTesoreria);
			}
		}

		if(this.parametrotesoreriaConstantesFunciones.resaltarFK_IdTransaccionCobrarPagoParametroTesoreria!=null) {
			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionCobrarPagoParametroTesoreria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);
				jPanel.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarFK_IdTransaccionCobrarPagoParametroTesoreria);
			}
		}

		if(this.parametrotesoreriaConstantesFunciones.resaltarFK_IdTransaccionPagarCreditoParametroTesoreria!=null) {
			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionPagarCreditoParametroTesoreria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);
				jPanel.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarFK_IdTransaccionPagarCreditoParametroTesoreria);
			}
		}

		if(this.parametrotesoreriaConstantesFunciones.resaltarFK_IdTransaccionPagarDebitoParametroTesoreria!=null) {
			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionPagarDebitoParametroTesoreria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);
				jPanel.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarFK_IdTransaccionPagarDebitoParametroTesoreria);
			}
		}

		if(this.parametrotesoreriaConstantesFunciones.resaltarFK_IdTransaccionPagarPagoParametroTesoreria!=null) {
			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionPagarPagoParametroTesoreria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);
				jPanel.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarFK_IdTransaccionPagarPagoParametroTesoreria);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioParametroTesoreria() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasParametroTesoreria.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionCobrarCreditoParametroTesoreria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarFK_IdTransaccionCobrarCreditoParametroTesoreria);
			if(!this.parametrotesoreriaConstantesFunciones.mostrarFK_IdTransaccionCobrarCreditoParametroTesoreria && index>-1) {
				this.jTabbedPaneBusquedasParametroTesoreria.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionCobrarDebitoParametroTesoreria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarFK_IdTransaccionCobrarDebitoParametroTesoreria);
			if(!this.parametrotesoreriaConstantesFunciones.mostrarFK_IdTransaccionCobrarDebitoParametroTesoreria && index>-1) {
				this.jTabbedPaneBusquedasParametroTesoreria.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionCobrarPagoParametroTesoreria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarFK_IdTransaccionCobrarPagoParametroTesoreria);
			if(!this.parametrotesoreriaConstantesFunciones.mostrarFK_IdTransaccionCobrarPagoParametroTesoreria && index>-1) {
				this.jTabbedPaneBusquedasParametroTesoreria.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionPagarCreditoParametroTesoreria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarFK_IdTransaccionPagarCreditoParametroTesoreria);
			if(!this.parametrotesoreriaConstantesFunciones.mostrarFK_IdTransaccionPagarCreditoParametroTesoreria && index>-1) {
				this.jTabbedPaneBusquedasParametroTesoreria.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionPagarDebitoParametroTesoreria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarFK_IdTransaccionPagarDebitoParametroTesoreria);
			if(!this.parametrotesoreriaConstantesFunciones.mostrarFK_IdTransaccionPagarDebitoParametroTesoreria && index>-1) {
				this.jTabbedPaneBusquedasParametroTesoreria.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionPagarPagoParametroTesoreria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarFK_IdTransaccionPagarPagoParametroTesoreria);
			if(!this.parametrotesoreriaConstantesFunciones.mostrarFK_IdTransaccionPagarPagoParametroTesoreria && index>-1) {
				this.jTabbedPaneBusquedasParametroTesoreria.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioParametroTesoreria() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasParametroTesoreria.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionCobrarCreditoParametroTesoreria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrotesoreriaConstantesFunciones.activarFK_IdTransaccionCobrarCreditoParametroTesoreria);
				this.jTabbedPaneBusquedasParametroTesoreria.setEnabledAt(index,this.parametrotesoreriaConstantesFunciones.activarFK_IdTransaccionCobrarCreditoParametroTesoreria);
			}

			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionCobrarDebitoParametroTesoreria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrotesoreriaConstantesFunciones.activarFK_IdTransaccionCobrarDebitoParametroTesoreria);
				this.jTabbedPaneBusquedasParametroTesoreria.setEnabledAt(index,this.parametrotesoreriaConstantesFunciones.activarFK_IdTransaccionCobrarDebitoParametroTesoreria);
			}

			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionCobrarPagoParametroTesoreria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrotesoreriaConstantesFunciones.activarFK_IdTransaccionCobrarPagoParametroTesoreria);
				this.jTabbedPaneBusquedasParametroTesoreria.setEnabledAt(index,this.parametrotesoreriaConstantesFunciones.activarFK_IdTransaccionCobrarPagoParametroTesoreria);
			}

			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionPagarCreditoParametroTesoreria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrotesoreriaConstantesFunciones.activarFK_IdTransaccionPagarCreditoParametroTesoreria);
				this.jTabbedPaneBusquedasParametroTesoreria.setEnabledAt(index,this.parametrotesoreriaConstantesFunciones.activarFK_IdTransaccionPagarCreditoParametroTesoreria);
			}

			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionPagarDebitoParametroTesoreria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrotesoreriaConstantesFunciones.activarFK_IdTransaccionPagarDebitoParametroTesoreria);
				this.jTabbedPaneBusquedasParametroTesoreria.setEnabledAt(index,this.parametrotesoreriaConstantesFunciones.activarFK_IdTransaccionPagarDebitoParametroTesoreria);
			}

			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionPagarPagoParametroTesoreria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrotesoreriaConstantesFunciones.activarFK_IdTransaccionPagarPagoParametroTesoreria);
				this.jTabbedPaneBusquedasParametroTesoreria.setEnabledAt(index,this.parametrotesoreriaConstantesFunciones.activarFK_IdTransaccionPagarPagoParametroTesoreria);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaParametroTesoreria(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTransaccionCobrarCredito")) {
			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionCobrarCreditoParametroTesoreria);

			this.jTabbedPaneBusquedasParametroTesoreria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);

			this.parametrotesoreriaConstantesFunciones.setResaltarFK_IdTransaccionCobrarCreditoParametroTesoreria(resaltar);

			jPanel.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarFK_IdTransaccionCobrarCreditoParametroTesoreria);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTransaccionCobrarDebito")) {
			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionCobrarDebitoParametroTesoreria);

			this.jTabbedPaneBusquedasParametroTesoreria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);

			this.parametrotesoreriaConstantesFunciones.setResaltarFK_IdTransaccionCobrarDebitoParametroTesoreria(resaltar);

			jPanel.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarFK_IdTransaccionCobrarDebitoParametroTesoreria);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTransaccionCobrarPago")) {
			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionCobrarPagoParametroTesoreria);

			this.jTabbedPaneBusquedasParametroTesoreria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);

			this.parametrotesoreriaConstantesFunciones.setResaltarFK_IdTransaccionCobrarPagoParametroTesoreria(resaltar);

			jPanel.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarFK_IdTransaccionCobrarPagoParametroTesoreria);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTransaccionPagarCredito")) {
			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionPagarCreditoParametroTesoreria);

			this.jTabbedPaneBusquedasParametroTesoreria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);

			this.parametrotesoreriaConstantesFunciones.setResaltarFK_IdTransaccionPagarCreditoParametroTesoreria(resaltar);

			jPanel.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarFK_IdTransaccionPagarCreditoParametroTesoreria);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTransaccionPagarDebito")) {
			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionPagarDebitoParametroTesoreria);

			this.jTabbedPaneBusquedasParametroTesoreria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);

			this.parametrotesoreriaConstantesFunciones.setResaltarFK_IdTransaccionPagarDebitoParametroTesoreria(resaltar);

			jPanel.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarFK_IdTransaccionPagarDebitoParametroTesoreria);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTransaccionPagarPago")) {
			index= this.jTabbedPaneBusquedasParametroTesoreria.indexOfComponent(this.jPanelFK_IdTransaccionPagarPagoParametroTesoreria);

			this.jTabbedPaneBusquedasParametroTesoreria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreria.getComponent(index);

			this.parametrotesoreriaConstantesFunciones.setResaltarFK_IdTransaccionPagarPagoParametroTesoreria(resaltar);

			jPanel.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarFK_IdTransaccionPagarPagoParametroTesoreria);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarParametroTesoreria.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioParametroTesoreria() throws Exception {

		if(this.jInternalFrameDetalleFormParametroTesoreria==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParametroTesoreria();
		this.updateVisibilidadResaltarControlesFormularioParametroTesoreria();
		this.updateHabilitarResaltarControlesFormularioParametroTesoreria();
		
	}
	
	public void updateBorderResaltarControlesFormularioParametroTesoreria() throws Exception {
		if(this.jInternalFrameDetalleFormParametroTesoreria==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parametrotesoreriaConstantesFunciones.resaltaridParametroTesoreria!=null && this.jInternalFrameDetalleFormParametroTesoreria!=null) {this.jInternalFrameDetalleFormParametroTesoreria.jLabelidParametroTesoreria.setBorder(this.parametrotesoreriaConstantesFunciones.resaltaridParametroTesoreria);}
		if(this.parametrotesoreriaConstantesFunciones.resaltarid_empresaParametroTesoreria!=null && this.jInternalFrameDetalleFormParametroTesoreria!=null) {this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_empresaParametroTesoreria.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarid_empresaParametroTesoreria);}
		if(this.parametrotesoreriaConstantesFunciones.resaltarcon_anticipo_orden_compraParametroTesoreria!=null && this.jInternalFrameDetalleFormParametroTesoreria!=null) {this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxcon_anticipo_orden_compraParametroTesoreria.setBorderPainted(true);this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxcon_anticipo_orden_compraParametroTesoreria.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarcon_anticipo_orden_compraParametroTesoreria);}
		if(this.parametrotesoreriaConstantesFunciones.resaltarpor_lotesParametroTesoreria!=null && this.jInternalFrameDetalleFormParametroTesoreria!=null) {this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxpor_lotesParametroTesoreria.setBorderPainted(true);this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxpor_lotesParametroTesoreria.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarpor_lotesParametroTesoreria);}
		if(this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_cobrar_pagoParametroTesoreria!=null && this.jInternalFrameDetalleFormParametroTesoreria!=null) {this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_cobrar_pagoParametroTesoreria);}
		if(this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_cobrar_debitoParametroTesoreria!=null && this.jInternalFrameDetalleFormParametroTesoreria!=null) {this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_cobrar_debitoParametroTesoreria);}
		if(this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_cobrar_creditoParametroTesoreria!=null && this.jInternalFrameDetalleFormParametroTesoreria!=null) {this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_cobrar_creditoParametroTesoreria);}
		if(this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_pagar_pagoParametroTesoreria!=null && this.jInternalFrameDetalleFormParametroTesoreria!=null) {this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_pagoParametroTesoreria.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_pagar_pagoParametroTesoreria);}
		if(this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_pagar_debitoParametroTesoreria!=null && this.jInternalFrameDetalleFormParametroTesoreria!=null) {this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_debitoParametroTesoreria.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_pagar_debitoParametroTesoreria);}
		if(this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_pagar_creditoParametroTesoreria!=null && this.jInternalFrameDetalleFormParametroTesoreria!=null) {this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_creditoParametroTesoreria.setBorder(this.parametrotesoreriaConstantesFunciones.resaltarid_transaccion_pagar_creditoParametroTesoreria);}
		if(this.parametrotesoreriaConstantesFunciones.resaltardescripcionParametroTesoreria!=null && this.jInternalFrameDetalleFormParametroTesoreria!=null) {this.jInternalFrameDetalleFormParametroTesoreria.jTextAreadescripcionParametroTesoreria.setBorder(this.parametrotesoreriaConstantesFunciones.resaltardescripcionParametroTesoreria);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParametroTesoreria() throws Exception {		
		if(this.jInternalFrameDetalleFormParametroTesoreria==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
	
		//this.jInternalFrameDetalleFormParametroTesoreria.jLabelidParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostraridParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jPanelidParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostraridParametroTesoreria);
		//this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_empresaParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarid_empresaParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jPanelid_empresaParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarid_empresaParametroTesoreria);
		//this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxcon_anticipo_orden_compraParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarcon_anticipo_orden_compraParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jPanelcon_anticipo_orden_compraParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarcon_anticipo_orden_compraParametroTesoreria);
		//this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxpor_lotesParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarpor_lotesParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jPanelpor_lotesParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarpor_lotesParametroTesoreria);
		//this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarid_transaccion_cobrar_pagoParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jPanelid_transaccion_cobrar_pagoParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarid_transaccion_cobrar_pagoParametroTesoreria);
		//this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarid_transaccion_cobrar_debitoParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jPanelid_transaccion_cobrar_debitoParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarid_transaccion_cobrar_debitoParametroTesoreria);
		//this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarid_transaccion_cobrar_creditoParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jPanelid_transaccion_cobrar_creditoParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarid_transaccion_cobrar_creditoParametroTesoreria);
		//this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_pagoParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarid_transaccion_pagar_pagoParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jPanelid_transaccion_pagar_pagoParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarid_transaccion_pagar_pagoParametroTesoreria);
		//this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_debitoParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarid_transaccion_pagar_debitoParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jPanelid_transaccion_pagar_debitoParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarid_transaccion_pagar_debitoParametroTesoreria);
		//this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_creditoParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarid_transaccion_pagar_creditoParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jPanelid_transaccion_pagar_creditoParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrarid_transaccion_pagar_creditoParametroTesoreria);
		//this.jInternalFrameDetalleFormParametroTesoreria.jTextAreadescripcionParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrardescripcionParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jPaneldescripcionParametroTesoreria.setVisible(this.parametrotesoreriaConstantesFunciones.mostrardescripcionParametroTesoreria);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParametroTesoreria() throws Exception {
		if(this.jInternalFrameDetalleFormParametroTesoreria==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroTesoreria!=null) {
	
		this.jInternalFrameDetalleFormParametroTesoreria.jLabelidParametroTesoreria.setEnabled(this.parametrotesoreriaConstantesFunciones.activaridParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_empresaParametroTesoreria.setEnabled(this.parametrotesoreriaConstantesFunciones.activarid_empresaParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxcon_anticipo_orden_compraParametroTesoreria.setEnabled(this.parametrotesoreriaConstantesFunciones.activarcon_anticipo_orden_compraParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jCheckBoxpor_lotesParametroTesoreria.setEnabled(this.parametrotesoreriaConstantesFunciones.activarpor_lotesParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.setEnabled(this.parametrotesoreriaConstantesFunciones.activarid_transaccion_cobrar_pagoParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.setEnabled(this.parametrotesoreriaConstantesFunciones.activarid_transaccion_cobrar_debitoParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.setEnabled(this.parametrotesoreriaConstantesFunciones.activarid_transaccion_cobrar_creditoParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_pagoParametroTesoreria.setEnabled(this.parametrotesoreriaConstantesFunciones.activarid_transaccion_pagar_pagoParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_debitoParametroTesoreria.setEnabled(this.parametrotesoreriaConstantesFunciones.activarid_transaccion_pagar_debitoParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jComboBoxid_transaccion_pagar_creditoParametroTesoreria.setEnabled(this.parametrotesoreriaConstantesFunciones.activarid_transaccion_pagar_creditoParametroTesoreria);
		this.jInternalFrameDetalleFormParametroTesoreria.jTextAreadescripcionParametroTesoreria.setEnabled(this.parametrotesoreriaConstantesFunciones.activardescripcionParametroTesoreria);
		}
	}
	
		
}