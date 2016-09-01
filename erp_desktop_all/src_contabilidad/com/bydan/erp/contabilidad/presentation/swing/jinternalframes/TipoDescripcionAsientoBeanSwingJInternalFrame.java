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

import com.bydan.erp.contabilidad.util.TipoDescripcionAsientoConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoDescripcionAsientoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoDescripcionAsientoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoDescripcionAsientoBean;
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
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoDescripcionAsientoBeanSwingJInternalFrame extends TipoDescripcionAsientoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoDescripcionAsientoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoDescripcionAsiento> tipodescripcionasientoValidator = new ClassValidator<TipoDescripcionAsiento>(TipoDescripcionAsiento.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoDescripcionAsiento tipodescripcionasiento;	
	public TipoDescripcionAsiento tipodescripcionasientoAux;
	public TipoDescripcionAsiento tipodescripcionasientoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoDescripcionAsiento tipodescripcionasientoTotales;
	public Long idTipoDescripcionAsientoActual;
	public Long iIdNuevoTipoDescripcionAsiento=0L;
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

	public String sFinalQueryComboModulo="";

	public List<Modulo> modulosForeignKey;

	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Modulo moduloForeignKey;

	public Modulo getmoduloForeignKey() {
		return moduloForeignKey;
	}

	public void setmoduloForeignKey(Modulo moduloForeignKey) {
		this.moduloForeignKey = moduloForeignKey;
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
	
	public Boolean isPermisoTodoTipoDescripcionAsiento;
	public Boolean isPermisoNuevoTipoDescripcionAsiento;
	public Boolean isPermisoActualizarTipoDescripcionAsiento;
	public Boolean isPermisoActualizarOriginalTipoDescripcionAsiento;
	public Boolean isPermisoEliminarTipoDescripcionAsiento;
	public Boolean isPermisoGuardarCambiosTipoDescripcionAsiento;
	public Boolean isPermisoConsultaTipoDescripcionAsiento;
	public Boolean isPermisoBusquedaTipoDescripcionAsiento;
	public Boolean isPermisoReporteTipoDescripcionAsiento;
	public Boolean isPermisoPaginacionMedioTipoDescripcionAsiento;
	public Boolean isPermisoPaginacionAltoTipoDescripcionAsiento;
	public Boolean isPermisoPaginacionTodoTipoDescripcionAsiento;
	public Boolean isPermisoCopiarTipoDescripcionAsiento;
	public Boolean isPermisoVerFormTipoDescripcionAsiento;
	public Boolean isPermisoDuplicarTipoDescripcionAsiento;
	public Boolean isPermisoOrdenTipoDescripcionAsiento;
	
	
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
	
	public TipoDescripcionAsientoParameterReturnGeneral tipodescripcionasientoReturnGeneral;
	public TipoDescripcionAsientoParameterReturnGeneral tipodescripcionasientoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoDescripcionAsiento=false;
	public Boolean esParaAccionDesdeFormularioTipoDescripcionAsiento=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoDescripcionAsientoSessionBeanAdditional tipodescripcionasientoSessionBeanAdditional=null;
	
	public TipoDescripcionAsientoSessionBeanAdditional getTipoDescripcionAsientoSessionBeanAdditional() {
		return this.tipodescripcionasientoSessionBeanAdditional;
	}
	
	public void setTipoDescripcionAsientoSessionBeanAdditional(TipoDescripcionAsientoSessionBeanAdditional tipodescripcionasientoSessionBeanAdditional) {
		try {
			this.tipodescripcionasientoSessionBeanAdditional=tipodescripcionasientoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoDescripcionAsientoBeanSwingJInternalFrameAdditional tipodescripcionasientoBeanSwingJInternalFrameAdditional=null;
	//public class TipoDescripcionAsientoBeanSwingJInternalFrame
	
	public TipoDescripcionAsientoBeanSwingJInternalFrameAdditional getTipoDescripcionAsientoBeanSwingJInternalFrameAdditional() {
		return this.tipodescripcionasientoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoDescripcionAsientoBeanSwingJInternalFrameAdditional(TipoDescripcionAsientoBeanSwingJInternalFrameAdditional tipodescripcionasientoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipodescripcionasientoBeanSwingJInternalFrameAdditional=tipodescripcionasientoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoDescripcionAsientoLogic tipodescripcionasientoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoDescripcionAsiento tipodescripcionasientoBean;
	public TipoDescripcionAsientoConstantesFunciones tipodescripcionasientoConstantesFunciones;
	//public TipoDescripcionAsientoParameterReturnGeneral tipodescripcionasientoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ModuloLogic moduloLogic;
	
	//PARAMETROS
	
	
	//public List<TipoDescripcionAsiento> tipodescripcionasientos;	
	//public List<TipoDescripcionAsiento> tipodescripcionasientosEliminados;
	//public List<TipoDescripcionAsiento> tipodescripcionasientosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoDescripcionAsiento=false;
	public Boolean isVisibilidadCeldaDuplicarTipoDescripcionAsiento=true;
	public Boolean isVisibilidadCeldaCopiarTipoDescripcionAsiento=true;
	public Boolean isVisibilidadCeldaVerFormTipoDescripcionAsiento=true;
	public Boolean isVisibilidadCeldaOrdenTipoDescripcionAsiento=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento=false;
	public Boolean isVisibilidadCeldaModificarTipoDescripcionAsiento=false;
	public Boolean isVisibilidadCeldaActualizarTipoDescripcionAsiento=false;
	public Boolean isVisibilidadCeldaEliminarTipoDescripcionAsiento=false;
	public Boolean isVisibilidadCeldaCancelarTipoDescripcionAsiento=false;
	public Boolean isVisibilidadCeldaGuardarTipoDescripcionAsiento=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	
	public Long getiIdNuevoTipoDescripcionAsiento() {
		return this.iIdNuevoTipoDescripcionAsiento;
	}

	public void setiIdNuevoTipoDescripcionAsiento(Long iIdNuevoTipoDescripcionAsiento) {
		this.iIdNuevoTipoDescripcionAsiento = iIdNuevoTipoDescripcionAsiento;
	}
	
	public Long getidTipoDescripcionAsientoActual() {
		return this.idTipoDescripcionAsientoActual;
	}

	public void setidTipoDescripcionAsientoActual(Long idTipoDescripcionAsientoActual) {
		this.idTipoDescripcionAsientoActual = idTipoDescripcionAsientoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoDescripcionAsiento gettipodescripcionasiento() {
		return this.tipodescripcionasiento;
	}

	public void settipodescripcionasiento(TipoDescripcionAsiento tipodescripcionasiento) {
		this.tipodescripcionasiento = tipodescripcionasiento;
	}
	
	public TipoDescripcionAsiento gettipodescripcionasientoAux() {
		return this.tipodescripcionasientoAux;
	}

	public void settipodescripcionasientoAux(TipoDescripcionAsiento tipodescripcionasientoAux) {
		this.tipodescripcionasientoAux = tipodescripcionasientoAux;
	}				
	
	public TipoDescripcionAsiento gettipodescripcionasientoAnterior() {
		return this.tipodescripcionasientoAnterior;
	}

	public void settipodescripcionasientoAnterior(TipoDescripcionAsiento tipodescripcionasientoAnterior) {
		this.tipodescripcionasientoAnterior = tipodescripcionasientoAnterior;
	}	
	
	public TipoDescripcionAsiento gettipodescripcionasientoTotales() {
		return this.tipodescripcionasientoTotales;
	}

	public void settipodescripcionasientoTotales(TipoDescripcionAsiento tipodescripcionasientoTotales) {
		this.tipodescripcionasientoTotales = tipodescripcionasientoTotales;
	}	
	
	public TipoDescripcionAsiento gettipodescripcionasientoBean() {
		return this.tipodescripcionasientoBean;
	}

	public void settipodescripcionasientoBean(TipoDescripcionAsiento tipodescripcionasientoBean) {
		this.tipodescripcionasientoBean = tipodescripcionasientoBean;
	}	
	
	public TipoDescripcionAsientoParameterReturnGeneral gettipodescripcionasientoReturnGeneral() {
		return this.tipodescripcionasientoReturnGeneral;
	}

	public void settipodescripcionasientoReturnGeneral(TipoDescripcionAsientoParameterReturnGeneral tipodescripcionasientoReturnGeneral) {
		this.tipodescripcionasientoReturnGeneral = tipodescripcionasientoReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoDescripcionAsientoLogic getTipoDescripcionAsientoLogic()	{		
		return tipodescripcionasientoLogic;
	}

	public void setTipoDescripcionAsientoLogic(TipoDescripcionAsientoLogic tipodescripcionasientoLogic) {
		this.tipodescripcionasientoLogic = tipodescripcionasientoLogic;
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
	
	public Boolean getIsEsNuevoTipoDescripcionAsiento() {
		return isEsNuevoTipoDescripcionAsiento;
	}

	public void setIsEsNuevoTipoDescripcionAsiento(Boolean isEsNuevoTipoDescripcionAsiento) {
		this.isEsNuevoTipoDescripcionAsiento = isEsNuevoTipoDescripcionAsiento;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoDescripcionAsiento() {
		return esParaAccionDesdeFormularioTipoDescripcionAsiento;
	}
	
	public void setEsParaAccionDesdeFormularioTipoDescripcionAsiento(Boolean esParaAccionDesdeFormularioTipoDescripcionAsiento) {
		this.esParaAccionDesdeFormularioTipoDescripcionAsiento = esParaAccionDesdeFormularioTipoDescripcionAsiento;
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

			if(this.tipodescripcionasientoSessionBean==null) {
				this.tipodescripcionasientoSessionBean=new TipoDescripcionAsientoSessionBean();
			}

			if(!this.tipodescripcionasientoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipodescripcionasientoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ModuloLogic moduloLogic=new ModuloLogic();

			//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			if(this.tipodescripcionasientoSessionBean==null) {
				this.tipodescripcionasientoSessionBean=new TipoDescripcionAsientoSessionBean();
			}

			if(!this.tipodescripcionasientoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

					moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());

					this.modulosForeignKey=moduloLogic.getModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getEntityWithConnection(tipodescripcionasientoSessionBean.getlidModuloActual());
					this.modulosForeignKey.add(moduloLogic.getModulo());
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

					if(this.tipodescripcionasiento!=null) {
						this.tipodescripcionasiento.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
						this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_empresaTipoDescripcionAsiento.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoDescripcionAsiento.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
						if(this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_empresaTipoDescripcionAsiento.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_empresaTipoDescripcionAsiento.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoDescripcionAsientoGenerico)throws Exception
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
				jComboBoxid_empresaTipoDescripcionAsientoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoDescripcionAsientoGenerico!=null && jComboBoxid_empresaTipoDescripcionAsientoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoDescripcionAsientoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualModuloForeignKey(Long idModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(moduloTemp!=null) {

					if(this.tipodescripcionasiento!=null) {
						this.tipodescripcionasiento.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
						this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_moduloTipoDescripcionAsiento.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloTipoDescripcionAsiento.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
						if(this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_moduloTipoDescripcionAsiento.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_moduloTipoDescripcionAsiento.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdModulo") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento!=null) {
						jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento!=null) {
							//jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento.getItemCount()>0) {
								jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento.setSelectedIndex(0);
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

	public String getActualModuloForeignKeyDescripcion(Long idModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}


			sDescripcion=ModuloConstantesFunciones.getModuloDescripcion(moduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloTipoDescripcionAsientoGenerico)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(moduloTemp!=null) {
				jComboBoxid_moduloTipoDescripcionAsientoGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloTipoDescripcionAsientoGenerico!=null && jComboBoxid_moduloTipoDescripcionAsientoGenerico.getItemCount()>0) {
					jComboBoxid_moduloTipoDescripcionAsientoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoDescripcionAsiento tipodescripcionasiento,JComboBox jComboBoxid_empresaTipoDescripcionAsientoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoDescripcionAsientoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_empresaTipoDescripcionAsiento.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoDescripcionAsientoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipodescripcionasiento.setid_empresa(empresaAux.getId());
				tipodescripcionasiento.setempresa_descripcion(TipoDescripcionAsientoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipodescripcionasiento.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(TipoDescripcionAsiento tipodescripcionasiento,JComboBox jComboBoxid_moduloTipoDescripcionAsientoGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloTipoDescripcionAsientoGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_moduloTipoDescripcionAsiento.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloTipoDescripcionAsientoGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				tipodescripcionasiento.setid_modulo(moduloAux.getId());
				tipodescripcionasiento.setmodulo_descripcion(TipoDescripcionAsientoConstantesFunciones.getModuloDescripcion(moduloAux));
				tipodescripcionasiento.setModulo(moduloAux);			}
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

					if(!TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { 
							this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_empresaTipoDescripcionAsiento.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_empresaTipoDescripcionAsiento.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { 
					}

					if(!TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { 
							this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_moduloTipoDescripcionAsiento.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_moduloTipoDescripcionAsiento.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { 
					}

					if(!TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdModulo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento.addItem(modulo);
							}
						}

						if(!TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
							this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_empresaTipoDescripcionAsiento.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
							this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_empresaTipoDescripcionAsiento.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
							this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_moduloTipoDescripcionAsiento.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
							this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_moduloTipoDescripcionAsiento.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoDescripcionAsiento() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoDescripcionAsientoConstantesFunciones.refrescarForeignKeysDescripcionesTipoDescripcionAsiento(this.tipodescripcionasientoLogic.getTipoDescripcionAsientos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoDescripcionAsientoConstantesFunciones.refrescarForeignKeysDescripcionesTipoDescripcionAsiento(this.tipodescripcionasientos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Modulo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipodescripcionasientoLogic.setTipoDescripcionAsientos(this.tipodescripcionasientos);
			tipodescripcionasientoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoDescripcionAsientoParameterReturnGeneral getTipoDescripcionAsientoParameterGeneral() {
		return this.tipodescripcionasientoParameterGeneral;
	}
	
	public void setTipoDescripcionAsientoParameterGeneral(TipoDescripcionAsientoParameterReturnGeneral tipodescripcionasientoParameterGeneral) {
		this.tipodescripcionasientoParameterGeneral = tipodescripcionasientoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoDescripcionAsiento() {
		return isPermisoTodoTipoDescripcionAsiento;
	}

	public void setIsPermisoTodoTipoDescripcionAsiento(Boolean isPermisoTodoTipoDescripcionAsiento) {
		this.isPermisoTodoTipoDescripcionAsiento = isPermisoTodoTipoDescripcionAsiento;
	}

	public Boolean getIsPermisoNuevoTipoDescripcionAsiento() {
		return isPermisoNuevoTipoDescripcionAsiento;
	}

	public void setIsPermisoNuevoTipoDescripcionAsiento(Boolean isPermisoNuevoTipoDescripcionAsiento) {
		this.isPermisoNuevoTipoDescripcionAsiento = isPermisoNuevoTipoDescripcionAsiento;
	}

	public Boolean getIsPermisoActualizarTipoDescripcionAsiento() {
		return isPermisoActualizarTipoDescripcionAsiento;
	}

	public void setIsPermisoActualizarTipoDescripcionAsiento(Boolean isPermisoActualizarTipoDescripcionAsiento) {
		this.isPermisoActualizarTipoDescripcionAsiento = isPermisoActualizarTipoDescripcionAsiento;
	}

	public Boolean getIsPermisoEliminarTipoDescripcionAsiento() {
		return isPermisoEliminarTipoDescripcionAsiento;
	}

	public void setIsPermisoEliminarTipoDescripcionAsiento(Boolean isPermisoEliminarTipoDescripcionAsiento) {
		this.isPermisoEliminarTipoDescripcionAsiento = isPermisoEliminarTipoDescripcionAsiento;
	}

	public Boolean getIsPermisoGuardarCambiosTipoDescripcionAsiento() {
		return isPermisoGuardarCambiosTipoDescripcionAsiento;
	}

	public void setIsPermisoGuardarCambiosTipoDescripcionAsiento(Boolean isPermisoGuardarCambiosTipoDescripcionAsiento) {
		this.isPermisoGuardarCambiosTipoDescripcionAsiento = isPermisoGuardarCambiosTipoDescripcionAsiento;
	}
	
	public Boolean getIsPermisoConsultaTipoDescripcionAsiento() {
		return isPermisoConsultaTipoDescripcionAsiento;
	}

	public void setIsPermisoConsultaTipoDescripcionAsiento(Boolean isPermisoConsultaTipoDescripcionAsiento) {
		this.isPermisoConsultaTipoDescripcionAsiento = isPermisoConsultaTipoDescripcionAsiento;
	}

	public Boolean getIsPermisoBusquedaTipoDescripcionAsiento() {
		return isPermisoBusquedaTipoDescripcionAsiento;
	}

	public void setIsPermisoBusquedaTipoDescripcionAsiento(Boolean isPermisoBusquedaTipoDescripcionAsiento) {
		this.isPermisoBusquedaTipoDescripcionAsiento = isPermisoBusquedaTipoDescripcionAsiento;
	}

	public Boolean getIsPermisoReporteTipoDescripcionAsiento() {
		return isPermisoReporteTipoDescripcionAsiento;
	}

	public void setIsPermisoReporteTipoDescripcionAsiento(Boolean isPermisoReporteTipoDescripcionAsiento) {
		this.isPermisoReporteTipoDescripcionAsiento = isPermisoReporteTipoDescripcionAsiento;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoDescripcionAsiento() {
		return isPermisoPaginacionMedioTipoDescripcionAsiento;
	}

	public void setIsPermisoPaginacionMedioTipoDescripcionAsiento(Boolean isPermisoPaginacionMedioTipoDescripcionAsiento) {
		this.isPermisoPaginacionMedioTipoDescripcionAsiento = isPermisoPaginacionMedioTipoDescripcionAsiento;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoDescripcionAsiento() {
		return isPermisoPaginacionTodoTipoDescripcionAsiento;
	}

	public void setIsPermisoPaginacionTodoTipoDescripcionAsiento(Boolean isPermisoPaginacionTodoTipoDescripcionAsiento) {
		this.isPermisoPaginacionTodoTipoDescripcionAsiento = isPermisoPaginacionTodoTipoDescripcionAsiento;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoDescripcionAsiento() {
		return isPermisoPaginacionAltoTipoDescripcionAsiento;
	}

	public void setIsPermisoPaginacionAltoTipoDescripcionAsiento(Boolean isPermisoPaginacionAltoTipoDescripcionAsiento) {
		this.isPermisoPaginacionAltoTipoDescripcionAsiento = isPermisoPaginacionAltoTipoDescripcionAsiento;
	}
	
	public Boolean getIsPermisoCopiarTipoDescripcionAsiento() {
		return isPermisoCopiarTipoDescripcionAsiento;
	}

	public void setIsPermisoCopiarTipoDescripcionAsiento(Boolean isPermisoCopiarTipoDescripcionAsiento) {
		this.isPermisoCopiarTipoDescripcionAsiento = isPermisoCopiarTipoDescripcionAsiento;
	}
	
	public Boolean getIsPermisoVerFormTipoDescripcionAsiento() {
		return isPermisoVerFormTipoDescripcionAsiento;
	}

	public void setIsPermisoVerFormTipoDescripcionAsiento(Boolean isPermisoVerFormTipoDescripcionAsiento) {
		this.isPermisoVerFormTipoDescripcionAsiento = isPermisoVerFormTipoDescripcionAsiento;
	}
	
	public Boolean getIsPermisoDuplicarTipoDescripcionAsiento() {
		return isPermisoDuplicarTipoDescripcionAsiento;
	}

	public void setIsPermisoDuplicarTipoDescripcionAsiento(Boolean isPermisoDuplicarTipoDescripcionAsiento) {
		this.isPermisoDuplicarTipoDescripcionAsiento = isPermisoDuplicarTipoDescripcionAsiento;
	}
	
	public Boolean getIsPermisoOrdenTipoDescripcionAsiento() {
		return isPermisoOrdenTipoDescripcionAsiento;
	}

	public void setIsPermisoOrdenTipoDescripcionAsiento(Boolean isPermisoOrdenTipoDescripcionAsiento) {
		this.isPermisoOrdenTipoDescripcionAsiento = isPermisoOrdenTipoDescripcionAsiento;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoDescripcionAsiento() {
		return isVisibilidadCeldaNuevoTipoDescripcionAsiento;
	}

	public void setIsVisibilidadCeldaNuevoTipoDescripcionAsiento(Boolean isVisibilidadCeldaNuevoTipoDescripcionAsiento) {
		this.isVisibilidadCeldaNuevoTipoDescripcionAsiento = isVisibilidadCeldaNuevoTipoDescripcionAsiento;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoDescripcionAsiento() {
		return isVisibilidadCeldaDuplicarTipoDescripcionAsiento;
	}

	public void setIsVisibilidadCeldaDuplicarTipoDescripcionAsiento(Boolean isVisibilidadCeldaDuplicarTipoDescripcionAsiento) {
		this.isVisibilidadCeldaDuplicarTipoDescripcionAsiento = isVisibilidadCeldaDuplicarTipoDescripcionAsiento;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoDescripcionAsiento() {
		return isVisibilidadCeldaCopiarTipoDescripcionAsiento;
	}

	public void setIsVisibilidadCeldaCopiarTipoDescripcionAsiento(Boolean isVisibilidadCeldaCopiarTipoDescripcionAsiento) {
		this.isVisibilidadCeldaCopiarTipoDescripcionAsiento = isVisibilidadCeldaCopiarTipoDescripcionAsiento;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoDescripcionAsiento() {
		return isVisibilidadCeldaVerFormTipoDescripcionAsiento;
	}

	public void setIsVisibilidadCeldaVerFormTipoDescripcionAsiento(Boolean isVisibilidadCeldaVerFormTipoDescripcionAsiento) {
		this.isVisibilidadCeldaVerFormTipoDescripcionAsiento = isVisibilidadCeldaVerFormTipoDescripcionAsiento;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoDescripcionAsiento() {
		return isVisibilidadCeldaOrdenTipoDescripcionAsiento;
	}

	public void setIsVisibilidadCeldaOrdenTipoDescripcionAsiento(Boolean isVisibilidadCeldaOrdenTipoDescripcionAsiento) {
		this.isVisibilidadCeldaOrdenTipoDescripcionAsiento = isVisibilidadCeldaOrdenTipoDescripcionAsiento;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento() {
		return isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento(Boolean isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento) {
		this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento = isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoDescripcionAsiento() {
		return isVisibilidadCeldaModificarTipoDescripcionAsiento;
	}

	public void setIsVisibilidadCeldaModificarTipoDescripcionAsiento(Boolean isVisibilidadCeldaModificarTipoDescripcionAsiento) {
		this.isVisibilidadCeldaModificarTipoDescripcionAsiento = isVisibilidadCeldaModificarTipoDescripcionAsiento;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoDescripcionAsiento() {
		return isVisibilidadCeldaActualizarTipoDescripcionAsiento;
	}

	public void setIsVisibilidadCeldaActualizarTipoDescripcionAsiento(Boolean isVisibilidadCeldaActualizarTipoDescripcionAsiento) {
		this.isVisibilidadCeldaActualizarTipoDescripcionAsiento = isVisibilidadCeldaActualizarTipoDescripcionAsiento;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoDescripcionAsiento() {
		return isVisibilidadCeldaEliminarTipoDescripcionAsiento;
	}

	public void setIsVisibilidadCeldaEliminarTipoDescripcionAsiento(Boolean isVisibilidadCeldaEliminarTipoDescripcionAsiento) {
		this.isVisibilidadCeldaEliminarTipoDescripcionAsiento = isVisibilidadCeldaEliminarTipoDescripcionAsiento;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoDescripcionAsiento() {
		return isVisibilidadCeldaCancelarTipoDescripcionAsiento;
	}

	public void setIsVisibilidadCeldaCancelarTipoDescripcionAsiento(Boolean isVisibilidadCeldaCancelarTipoDescripcionAsiento) {
		this.isVisibilidadCeldaCancelarTipoDescripcionAsiento = isVisibilidadCeldaCancelarTipoDescripcionAsiento;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoDescripcionAsiento() {
		return isVisibilidadCeldaGuardarTipoDescripcionAsiento;
	}

	public void setIsVisibilidadCeldaGuardarTipoDescripcionAsiento(Boolean isVisibilidadCeldaGuardarTipoDescripcionAsiento) {
		this.isVisibilidadCeldaGuardarTipoDescripcionAsiento = isVisibilidadCeldaGuardarTipoDescripcionAsiento;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento() {
		return isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento(Boolean isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento) {
		this.isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento = isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento;
	}
		
	public TipoDescripcionAsientoSessionBean gettipodescripcionasientoSessionBean() {
		return this.tipodescripcionasientoSessionBean;
	}
	
	public void settipodescripcionasientoSessionBean(TipoDescripcionAsientoSessionBean tipodescripcionasientoSessionBean) {
		this.tipodescripcionasientoSessionBean=tipodescripcionasientoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasiento)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipodescripcionasiento,null);
				this.setActualParaGuardarModuloForeignKey(tipodescripcionasiento,null);
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
	
	public void bugActualizarReferenciaActual(TipoDescripcionAsiento tipodescripcionasiento,TipoDescripcionAsiento tipodescripcionasientoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoDescripcionAsiento(tipodescripcionasiento);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipodescripcionasientoAux.setId(tipodescripcionasiento.getId());
		tipodescripcionasientoAux.setVersionRow(tipodescripcionasiento.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoDescripcionAsiento();
		
			int intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(this.tipodescripcionasiento,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipodescripcionasientoValidator.getInvalidValues(this.tipodescripcionasiento);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipodescripcionasientoLogic.setDatosCliente(datosCliente);
			tipodescripcionasientoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipodescripcionasientoAux=new  TipoDescripcionAsiento();
				
				tipodescripcionasientoAux.setIsNew(true);
				tipodescripcionasientoAux.setIsChanged(true);
				
				tipodescripcionasientoAux.setTipoDescripcionAsientoOriginal(this.tipodescripcionasiento);
				
				tipodescripcionasientoAux.setId(this.tipodescripcionasiento.getId());	
				tipodescripcionasientoAux.setVersionRow(this.tipodescripcionasiento.getVersionRow());	
				tipodescripcionasientoAux.setid_empresa(this.tipodescripcionasiento.getid_empresa());	
				tipodescripcionasientoAux.setid_modulo(this.tipodescripcionasiento.getid_modulo());	
				tipodescripcionasientoAux.setcodigo(this.tipodescripcionasiento.getcodigo());	
				tipodescripcionasientoAux.setnombre(this.tipodescripcionasiento.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodescripcionasientoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipodescripcionasientoAux,tipodescripcionasientoLogic.getTipoDescripcionAsientos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodescripcionasientoAux,tipodescripcionasientos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipodescripcionasientoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodescripcionasientoLogic.saveTipoDescripcionAsientos();//WithConnection
						//tipodescripcionasientoLogic.getSetVersionRowTipoDescripcionAsientos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodescripcionasiento,tipodescripcionasientoAux);
					
					this.refrescarForeignKeysDescripcionesTipoDescripcionAsiento();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipodescripcionasientoAux=new  TipoDescripcionAsiento();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado() && this.tipodescripcionasiento.getId()>=0)) {
						
					tipodescripcionasientoAux.setIsNew(false);
				}
				
				tipodescripcionasientoAux.setIsDeleted(false);
			
				tipodescripcionasientoAux.setId(this.tipodescripcionasiento.getId());	
				tipodescripcionasientoAux.setVersionRow(this.tipodescripcionasiento.getVersionRow());	
				tipodescripcionasientoAux.setid_empresa(this.tipodescripcionasiento.getid_empresa());	
				tipodescripcionasientoAux.setid_modulo(this.tipodescripcionasiento.getid_modulo());	
				tipodescripcionasientoAux.setcodigo(this.tipodescripcionasiento.getcodigo());	
				tipodescripcionasientoAux.setnombre(this.tipodescripcionasiento.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodescripcionasientoAux,tipodescripcionasientoLogic.getTipoDescripcionAsientos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodescripcionasientoAux,tipodescripcionasientos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipodescripcionasientoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodescripcionasientoLogic.saveTipoDescripcionAsientos();//WithConnection
						//tipodescripcionasientoLogic.getSetVersionRowTipoDescripcionAsientos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodescripcionasiento,tipodescripcionasientoAux);
					
					this.refrescarForeignKeysDescripcionesTipoDescripcionAsiento();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipodescripcionasientoAux=new  TipoDescripcionAsiento();
				
				tipodescripcionasientoAux.setIsNew(false);
				tipodescripcionasientoAux.setIsChanged(false);
				
				tipodescripcionasientoAux.setIsDeleted(true);
				
				tipodescripcionasientoAux.setId(this.tipodescripcionasiento.getId());	
				tipodescripcionasientoAux.setVersionRow(this.tipodescripcionasiento.getVersionRow());	
				tipodescripcionasientoAux.setid_empresa(this.tipodescripcionasiento.getid_empresa());	
				tipodescripcionasientoAux.setid_modulo(this.tipodescripcionasiento.getid_modulo());	
				tipodescripcionasientoAux.setcodigo(this.tipodescripcionasiento.getcodigo());	
				tipodescripcionasientoAux.setnombre(this.tipodescripcionasiento.getnombre());	
				
				if(this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipodescripcionasientoAux.getId()>=0) {	
						this.tipodescripcionasientosEliminados.add(tipodescripcionasientoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipodescripcionasientoAux,tipodescripcionasientoLogic.getTipoDescripcionAsientos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodescripcionasientoAux,tipodescripcionasientos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipodescripcionasientoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodescripcionasientoLogic.saveTipoDescripcionAsientos();//WithConnection
						//tipodescripcionasientoLogic.getSetVersionRowTipoDescripcionAsientos();//WithConnection
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
					this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().addAll(this.tipodescripcionasientosEliminados);
					
					tipodescripcionasientoLogic.saveTipoDescripcionAsientos();//WithConnection
					//tipodescripcionasientoLogic.getSetVersionRowTipoDescripcionAsientos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoDescripcionAsiento();
				
				this.tipodescripcionasientosEliminados= new ArrayList<TipoDescripcionAsiento>();		
			}
			
			if(this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Descripcion Asiento Contable GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Descripcion Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipodescripcionasiento=tipodescripcionasientoAux;
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
      		//this.finishProcessTipoDescripcionAsiento();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoDescripcionAsiento tipodescripcionasientoLocal) throws Exception {
		
		if(this.tipodescripcionasientoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoDescripcionAsiento tipodescripcionasientoLocal) throws Exception {	
		if(this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipodescripcionasientoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				tipodescripcionasientoLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoDescripcionAsientoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipodescripcionasientoValidator.getInvalidValues(this.tipodescripcionasiento);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoDescripcionAsiento tipodescripcionasiento,List<TipoDescripcionAsiento> tipodescripcionasientos) throws Exception {
		try	{		
			TipoDescripcionAsientoConstantesFunciones.actualizarLista(tipodescripcionasiento,tipodescripcionasientos,this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoDescripcionAsiento tipodescripcionasiento,List<TipoDescripcionAsiento> tipodescripcionasientos) throws Exception {
		try	{			
			TipoDescripcionAsientoConstantesFunciones.actualizarSelectedLista(tipodescripcionasiento,tipodescripcionasientos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoDescripcionAsiento> tipodescripcionasientosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipodescripcionasientosLocal=this.tipodescripcionasientoLogic.getTipoDescripcionAsientos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipodescripcionasientosLocal=this.tipodescripcionasientos;
			}
			//ARCHITECTURE
		
			for(TipoDescripcionAsiento tipodescripcionasientoLocal:tipodescripcionasientosLocal) {
				if(this.permiteMantenimiento(tipodescripcionasientoLocal) && tipodescripcionasientoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoDescripcionAsientoConstantesFunciones.getTipoDescripcionAsientoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoDescripcionAsientoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelid_empresaTipoDescripcionAsiento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDescripcionAsientoConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelid_moduloTipoDescripcionAsiento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDescripcionAsientoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelcodigoTipoDescripcionAsiento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDescripcionAsientoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelnombreTipoDescripcionAsiento,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelid_empresaTipoDescripcionAsiento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelid_moduloTipoDescripcionAsiento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelcodigoTipoDescripcionAsiento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelnombreTipoDescripcionAsiento,"");
		
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
		this.iIdNuevoTipoDescripcionAsiento--;	
		
		
		this.tipodescripcionasientoAux=new TipoDescripcionAsiento();
		
		this.tipodescripcionasientoAux.setId(this.iIdNuevoTipoDescripcionAsiento);
		this.tipodescripcionasientoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().add(this.tipodescripcionasientoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipodescripcionasientos.add(this.tipodescripcionasientoAux);
		}
		//ARCHITECTURE
		
		this.tipodescripcionasiento=this.tipodescripcionasientoAux;
		
		if(TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoDescripcionAsiento(this.tipodescripcionasiento);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDescripcionAsiento(this.tipodescripcionasiento);
		}
				
		//this.setDefaultControlesTipoDescripcionAsiento();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoDescripcionAsiento();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoDescripcionAsiento();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDescripcionAsiento();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDescripcionAsiento(this.tipodescripcionasientoBean,this.tipodescripcionasiento,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipodescripcionasientoSessionBean.getConGuardarRelaciones()) {
			classes=TipoDescripcionAsientoConstantesFunciones.getClassesRelationshipsOfTipoDescripcionAsiento(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipodescripcionasientoReturnGeneral=tipodescripcionasientoLogic.procesarEventosTipoDescripcionAsientosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodescripcionasientoLogic.getTipoDescripcionAsientos(),this.tipodescripcionasiento,this.tipodescripcionasientoParameterGeneral,this.isEsNuevoTipoDescripcionAsiento,classes);//this.tipodescripcionasientoLogic.getTipoDescripcionAsiento()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoDescripcionAsiento(this.tipodescripcionasientoReturnGeneral,this.tipodescripcionasientoBean,false);
		
		if(this.tipodescripcionasientoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDescripcionAsiento(this.tipodescripcionasientoReturnGeneral.getTipoDescripcionAsiento());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoDescripcionAsiento(this.tipodescripcionasientoReturnGeneral.getTipoDescripcionAsiento());
		}
		
		if(this.tipodescripcionasientoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoDescripcionAsiento(this.tipodescripcionasientoReturnGeneral.getTipoDescripcionAsiento(),classes);//this.tipodescripcionasientoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(this.tipodescripcionasiento,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoDescripcionAsiento();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoDescripcionAsiento();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.RecargarFormTipoDescripcionAsiento(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoDescripcionAsiento(false);
						
			if(tipodescripcionasientoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDescripcionAsiento();
			}
			
			this.actualizarVisualTableDatosTipoDescripcionAsiento();
			
			this.jTableDatosTipoDescripcionAsiento.setRowSelectionInterval(this.getIndiceNuevoTipoDescripcionAsiento(), this.getIndiceNuevoTipoDescripcionAsiento());
			
			this.seleccionarFilaTablaTipoDescripcionAsientoActual();
						
			this.actualizarEstadoCeldasBotonesTipoDescripcionAsiento("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoDescripcionAsiento(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTextFieldcodigoTipoDescripcionAsiento.setEnabled(isHabilitar && this.tipodescripcionasientoConstantesFunciones.activarcodigoTipoDescripcionAsiento);
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTextAreanombreTipoDescripcionAsiento.setEnabled(isHabilitar && this.tipodescripcionasientoConstantesFunciones.activarnombreTipoDescripcionAsiento);	
		//
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_empresaTipoDescripcionAsiento.setEnabled(isHabilitar && this.tipodescripcionasientoConstantesFunciones.activarid_empresaTipoDescripcionAsiento);
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_moduloTipoDescripcionAsiento.setEnabled(isHabilitar && this.tipodescripcionasientoConstantesFunciones.activarid_moduloTipoDescripcionAsiento);
	};
	
	public void setDefaultControlesTipoDescripcionAsiento() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoDescripcionAsiento(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipodescripcionasientoSessionBean.setConGuardarRelaciones(true);			
			this.tipodescripcionasientoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTabbedPaneRelacionesTipoDescripcionAsiento.setVisible(true);
			
					
		} else {
			//this.tipodescripcionasientoSessionBean.setConGuardarRelaciones(false);			
			this.tipodescripcionasientoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTabbedPaneRelacionesTipoDescripcionAsiento.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoDescripcionAsiento() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDescripcionAsiento tipodescripcionasientoAux:this.tipodescripcionasientoLogic.getTipoDescripcionAsientos()) {
				if(tipodescripcionasientoAux.getId().equals(this.iIdNuevoTipoDescripcionAsiento)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDescripcionAsiento tipodescripcionasientoAux:this.tipodescripcionasientos) {
				if(tipodescripcionasientoAux.getId().equals(this.iIdNuevoTipoDescripcionAsiento)) {
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
	
	public int getIndiceActualTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasiento,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDescripcionAsiento tipodescripcionasientoAux:this.tipodescripcionasientoLogic.getTipoDescripcionAsientos()) {
				if(tipodescripcionasientoAux.getId().equals(tipodescripcionasiento.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDescripcionAsiento tipodescripcionasientoAux:this.tipodescripcionasientos) {
				if(tipodescripcionasientoAux.getId().equals(tipodescripcionasiento.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasientoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDescripcionAsiento tipodescripcionasientoAux:this.tipodescripcionasientoLogic.getTipoDescripcionAsientos()) {
				if(tipodescripcionasientoAux.getTipoDescripcionAsientoOriginal().getId().equals(tipodescripcionasientoOriginal.getId())) {
					existe=true;
					tipodescripcionasientoOriginal.setId(tipodescripcionasientoAux.getId());
					tipodescripcionasientoOriginal.setVersionRow(tipodescripcionasientoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDescripcionAsiento tipodescripcionasientoAux:this.tipodescripcionasientos) {
				if(tipodescripcionasientoAux.getTipoDescripcionAsientoOriginal().getId().equals(tipodescripcionasientoOriginal.getId())) {
					existe=true;
					tipodescripcionasientoOriginal.setId(tipodescripcionasientoAux.getId());
					tipodescripcionasientoOriginal.setVersionRow(tipodescripcionasientoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoDescripcionAsiento(Boolean esParaCancelar) throws Exception {
		tipodescripcionasientosAux=new ArrayList<TipoDescripcionAsiento>();
		tipodescripcionasientoAux=new TipoDescripcionAsiento();
		
		if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDescripcionAsiento tipodescripcionasientoAux:this.tipodescripcionasientoLogic.getTipoDescripcionAsientos()) {
					if(tipodescripcionasientoAux.getId()<0) {
						tipodescripcionasientosAux.add(tipodescripcionasientoAux);
					}		
				}
				this.iIdNuevoTipoDescripcionAsiento=0L;
				this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().removeAll(tipodescripcionasientosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDescripcionAsiento tipodescripcionasientoAux:this.tipodescripcionasientos) {
					if(tipodescripcionasientoAux.getId()<0) {
						tipodescripcionasientosAux.add(tipodescripcionasientoAux);
					}		
				}
				this.iIdNuevoTipoDescripcionAsiento=0L;
				this.tipodescripcionasientos.removeAll(tipodescripcionasientosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoDescripcionAsiento 
					&& this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().size()>0
					) {
					tipodescripcionasientoAux=this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().get(this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().size() - 1);
				
					if(tipodescripcionasientoAux.getId()<0) {
						this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().remove(tipodescripcionasientoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoDescripcionAsiento && this.tipodescripcionasientos.size()>0) {
					tipodescripcionasientoAux=this.tipodescripcionasientos.get(this.tipodescripcionasientos.size() - 1);
				
					if(tipodescripcionasientoAux.getId()<0) {
						this.tipodescripcionasientos.remove(tipodescripcionasientoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoDescripcionAsiento(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipodescripcionasiento.getId()<0) {
				this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().remove(this.tipodescripcionasiento);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipodescripcionasiento.getId()<0) {
				this.tipodescripcionasientos.remove(this.tipodescripcionasiento);
			}
		}			
	}
	
	public void setEstadosInicialesTipoDescripcionAsiento(List<TipoDescripcionAsiento> tipodescripcionasientosAux) throws Exception {
		TipoDescripcionAsientoConstantesFunciones.setEstadosInicialesTipoDescripcionAsiento(tipodescripcionasientosAux);
	}
	
	public void setEstadosInicialesTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasientoAux) throws Exception {
		TipoDescripcionAsientoConstantesFunciones.setEstadosInicialesTipoDescripcionAsiento(tipodescripcionasientoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoDescripcionAsientoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoDescripcionAsiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoDescripcionAsientoActual()) {
				if(!this.isEsNuevoTipoDescripcionAsiento) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoDescripcionAsiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoDescripcionAsiento=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoDescripcionAsientoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Descripcion Asiento Contable ?", "MANTENIMIENTO DE Tipo Descripcion Asiento Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoDescripcionAsiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoDescripcionAsiento tipodescripcionasiento) throws Exception {
		TipoDescripcionAsientoConstantesFunciones.seleccionarAsignar(this.tipodescripcionasiento,tipodescripcionasiento);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoDescripcionAsiento=this.isPermisoActualizarOriginalTipoDescripcionAsiento;
			
			
			this.seleccionarAsignar(tipodescripcionasiento);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDescripcionAsientoConstantesFunciones.quitarEspaciosTipoDescripcionAsiento(this.tipodescripcionasiento,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoDescripcionAsiento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipodescripcionasientoSessionBean.setsFuncionBusquedaRapida(this.tipodescripcionasientoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoDescripcionAsiento) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoDescripcionAsiento(esParaCancelar);				
				this.cancelarNuevoTipoDescripcionAsiento(esParaCancelar);								
			}
			
			this.tipodescripcionasiento=new TipoDescripcionAsiento();
			
			this.inicializarTipoDescripcionAsiento();
			
			this.actualizarEstadoCeldasBotonesTipoDescripcionAsiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoDescripcionAsiento() throws Exception {
		try {
			TipoDescripcionAsientoConstantesFunciones.inicializarTipoDescripcionAsiento(this.tipodescripcionasiento);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoDescripcionAsientos(String sAccionBusqueda,List<TipoDescripcionAsiento> tipodescripcionasientosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoDescripcionAsiento"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoDescripcionAsientoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoDescripcionAsientoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoDescripcionAsiento"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Descripcion Asiento Contables");		
		parameters.put("busquedapor", TipoDescripcionAsientoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoDescripcionAsiento=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoDescripcionAsientoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoDescripcionAsientoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoDescripcionAsiento=new JRBeanArrayDataSource(TipoDescripcionAsientoJInternalFrame.TraerTipoDescripcionAsientoBeans(tipodescripcionasientosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoDescripcionAsiento);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoDescripcionAsientoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoDescripcionAsientoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoDescripcionAsientoBean.TraerTipoDescripcionAsientoBeans(tipodescripcionasientosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoDescripcionAsientos(sAccionBusqueda,sTipoArchivoReporte,tipodescripcionasientosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoDescripcionAsientos(sAccionBusqueda,sTipoArchivoReporte,tipodescripcionasientosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoDescripcionAsientoActionPerformed(null);
					//this.generarExcelReporteTipoDescripcionAsientos(sAccionBusqueda,sTipoArchivoReporte,tipodescripcionasientosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoDescripcionAsientos(sAccionBusqueda,sTipoArchivoReporte,tipodescripcionasientosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoDescripcionAsientos(sAccionBusqueda,sTipoArchivoReporte,tipodescripcionasientosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoDescripcionAsientos(sAccionBusqueda,sTipoArchivoReporte,tipodescripcionasientosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoDescripcionAsientos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDescripcionAsiento> tipodescripcionasientosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodescripcionasiento";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDescripcionAsientos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDescripcionAsiento("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoDescripcionAsiento tipodescripcionasiento : tipodescripcionasientosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoDescripcionAsientoConstantesFunciones.generarExcelReporteDataTipoDescripcionAsiento("NORMAL",row,workbook,tipodescripcionasiento,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Descripcion Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoDescripcionAsiento(String sTipo,Row row,Workbook workbook) {
		
		TipoDescripcionAsientoConstantesFunciones.generarExcelReporteHeaderTipoDescripcionAsiento(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoDescripcionAsientos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDescripcionAsiento> tipodescripcionasientosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodescripcionasiento_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDescripcionAsientos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoDescripcionAsiento tipodescripcionasiento : tipodescripcionasientosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoDescripcionAsientoConstantesFunciones.getTipoDescripcionAsientoDescripcion(tipodescripcionasiento));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDescripcionAsientoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDescripcionAsientoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodescripcionasiento.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDescripcionAsientoConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDescripcionAsientoConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodescripcionasiento.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDescripcionAsientoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDescripcionAsientoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodescripcionasiento.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDescripcionAsientoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDescripcionAsientoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodescripcionasiento.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Descripcion Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoDescripcionAsientos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDescripcionAsiento> tipodescripcionasientosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoDescripcionAsiento> tipodescripcionasientosRespaldo=null;
		
		classes=TipoDescripcionAsientoConstantesFunciones.getClassesRelationshipsOfTipoDescripcionAsiento(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipodescripcionasientoLogic.setDatosCliente(this.datosCliente);
		this.tipodescripcionasientoLogic.setDatosDeep(this.datosDeep);
		this.tipodescripcionasientoLogic.setIsConDeep(true);
		
		tipodescripcionasientosRespaldo=this.tipodescripcionasientoLogic.getTipoDescripcionAsientos();
		
		this.tipodescripcionasientoLogic.setTipoDescripcionAsientos(tipodescripcionasientosParaReportes);	
		this.tipodescripcionasientoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipodescripcionasientosParaReportes=this.tipodescripcionasientoLogic.getTipoDescripcionAsientos();
		this.tipodescripcionasientoLogic.setTipoDescripcionAsientos(tipodescripcionasientosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodescripcionasiento_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDescripcionAsientos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDescripcionAsiento("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoDescripcionAsiento tipodescripcionasiento : tipodescripcionasientosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoDescripcionAsiento("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoDescripcionAsientoConstantesFunciones.generarExcelReporteDataTipoDescripcionAsiento("NORMAL",row,workbook,tipodescripcionasiento,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoDescripcionAsientoConstantesFunciones.getTipoDescripcionAsientoDescripcion(tipodescripcionasiento));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Descripcion Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoDescripcionAsiento() throws Exception {		
		this.startProcessTipoDescripcionAsiento(true);
	}
	
	public void startProcessTipoDescripcionAsiento(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoDescripcionAsiento ,this.jPanelParametrosReportesTipoDescripcionAsiento, this.jScrollPanelDatosTipoDescripcionAsiento,this.jPanelPaginacionTipoDescripcionAsiento, this.jScrollPanelDatosEdicionTipoDescripcionAsiento, this.jPanelAccionesTipoDescripcionAsiento,this.jPanelAccionesFormularioTipoDescripcionAsiento,this.jmenuBarTipoDescripcionAsiento,this.jmenuBarDetalleTipoDescripcionAsiento,this.jTtoolBarTipoDescripcionAsiento,this.jTtoolBarDetalleTipoDescripcionAsiento);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDescripcionAsiento=this.jTabbedPaneBusquedasTipoDescripcionAsiento; 
		
		final JPanel jPanelParametrosReportesTipoDescripcionAsiento=this.jPanelParametrosReportesTipoDescripcionAsiento;
		//final JScrollPane jScrollPanelDatosTipoDescripcionAsiento=this.jScrollPanelDatosTipoDescripcionAsiento;
		final JTable jTableDatosTipoDescripcionAsiento=this.jTableDatosTipoDescripcionAsiento;		
		final JPanel jPanelPaginacionTipoDescripcionAsiento=this.jPanelPaginacionTipoDescripcionAsiento;
		//final JScrollPane jScrollPanelDatosEdicionTipoDescripcionAsiento=this.jScrollPanelDatosEdicionTipoDescripcionAsiento;
		final JPanel jPanelAccionesTipoDescripcionAsiento=this.jPanelAccionesTipoDescripcionAsiento;
		
		JPanel jPanelCamposAuxiliarTipoDescripcionAsiento=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoDescripcionAsiento=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
			jPanelCamposAuxiliarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jPanelCamposTipoDescripcionAsiento;
			jPanelAccionesFormularioAuxiliarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jPanelAccionesFormularioTipoDescripcionAsiento;
		}
		
		final JPanel jPanelCamposTipoDescripcionAsiento=jPanelCamposAuxiliarTipoDescripcionAsiento;
		final JPanel jPanelAccionesFormularioTipoDescripcionAsiento=jPanelAccionesFormularioAuxiliarTipoDescripcionAsiento;
		
		
		final JMenuBar jmenuBarTipoDescripcionAsiento=this.jmenuBarTipoDescripcionAsiento;
		final JToolBar jTtoolBarTipoDescripcionAsiento=this.jTtoolBarTipoDescripcionAsiento;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoDescripcionAsiento=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDescripcionAsiento=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
			jmenuBarDetalleAuxiliarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jmenuBarDetalleTipoDescripcionAsiento;
			jTtoolBarDetalleAuxiliarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTtoolBarDetalleTipoDescripcionAsiento;
		}
		
		final JMenuBar jmenuBarDetalleTipoDescripcionAsiento=jmenuBarDetalleAuxiliarTipoDescripcionAsiento;
		final JToolBar jTtoolBarDetalleTipoDescripcionAsiento=jTtoolBarDetalleAuxiliarTipoDescripcionAsiento;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDescripcionAsiento;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDescripcionAsiento;
			processRunnable.jTableDatos=jTableDatosTipoDescripcionAsiento;
			processRunnable.jPanelCampos=jPanelCamposTipoDescripcionAsiento;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDescripcionAsiento;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDescripcionAsiento;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDescripcionAsiento;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDescripcionAsiento;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDescripcionAsiento;
			processRunnable.jTtoolBar=jTtoolBarTipoDescripcionAsiento;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDescripcionAsiento;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDescripcionAsiento ,jPanelParametrosReportesTipoDescripcionAsiento,jTableDatosTipoDescripcionAsiento, /*jScrollPanelDatosTipoDescripcionAsiento,*/jPanelCamposTipoDescripcionAsiento,jPanelPaginacionTipoDescripcionAsiento, /*jScrollPanelDatosEdicionTipoDescripcionAsiento,*/ jPanelAccionesTipoDescripcionAsiento,jPanelAccionesFormularioTipoDescripcionAsiento,jmenuBarTipoDescripcionAsiento,jmenuBarDetalleTipoDescripcionAsiento,jTtoolBarTipoDescripcionAsiento,jTtoolBarDetalleTipoDescripcionAsiento);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDescripcionAsiento ,jPanelParametrosReportesTipoDescripcionAsiento, jScrollPanelDatosTipoDescripcionAsiento,jPanelPaginacionTipoDescripcionAsiento, jScrollPanelDatosEdicionTipoDescripcionAsiento, jPanelAccionesTipoDescripcionAsiento,jPanelAccionesFormularioTipoDescripcionAsiento,jmenuBarTipoDescripcionAsiento,jmenuBarDetalleTipoDescripcionAsiento,jTtoolBarTipoDescripcionAsiento,jTtoolBarDetalleTipoDescripcionAsiento);
						
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
	
	public void finishProcessTipoDescripcionAsiento() {// throws Exception 
		this.finishProcessTipoDescripcionAsiento(true);
	}
	
	public void finishProcessTipoDescripcionAsiento(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoDescripcionAsiento ,this.jPanelParametrosReportesTipoDescripcionAsiento, this.jScrollPanelDatosTipoDescripcionAsiento,this.jPanelPaginacionTipoDescripcionAsiento, this.jScrollPanelDatosEdicionTipoDescripcionAsiento, this.jPanelAccionesTipoDescripcionAsiento,this.jPanelAccionesFormularioTipoDescripcionAsiento,this.jmenuBarTipoDescripcionAsiento,this.jmenuBarDetalleTipoDescripcionAsiento,this.jTtoolBarTipoDescripcionAsiento,this.jTtoolBarDetalleTipoDescripcionAsiento);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDescripcionAsiento=this.jTabbedPaneBusquedasTipoDescripcionAsiento; 
		
		final JPanel jPanelParametrosReportesTipoDescripcionAsiento=this.jPanelParametrosReportesTipoDescripcionAsiento;
		//final JScrollPane jScrollPanelDatosTipoDescripcionAsiento=this.jScrollPanelDatosTipoDescripcionAsiento;
		final JTable jTableDatosTipoDescripcionAsiento=this.jTableDatosTipoDescripcionAsiento;		
		final JPanel jPanelPaginacionTipoDescripcionAsiento=this.jPanelPaginacionTipoDescripcionAsiento;
		//final JScrollPane jScrollPanelDatosEdicionTipoDescripcionAsiento=this.jScrollPanelDatosEdicionTipoDescripcionAsiento;
		final JPanel jPanelAccionesTipoDescripcionAsiento=this.jPanelAccionesTipoDescripcionAsiento;
		
		JPanel jPanelCamposAuxiliarTipoDescripcionAsiento=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoDescripcionAsiento=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
			jPanelCamposAuxiliarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jPanelCamposTipoDescripcionAsiento;
			jPanelAccionesFormularioAuxiliarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jPanelAccionesFormularioTipoDescripcionAsiento;
		}
		
		final JPanel jPanelCamposTipoDescripcionAsiento=jPanelCamposAuxiliarTipoDescripcionAsiento;
		final JPanel jPanelAccionesFormularioTipoDescripcionAsiento=jPanelAccionesFormularioAuxiliarTipoDescripcionAsiento;
		
		
		final JMenuBar jmenuBarTipoDescripcionAsiento=this.jmenuBarTipoDescripcionAsiento;		
		final JToolBar jTtoolBarTipoDescripcionAsiento=this.jTtoolBarTipoDescripcionAsiento;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoDescripcionAsiento=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDescripcionAsiento=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
			jmenuBarDetalleAuxiliarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jmenuBarDetalleTipoDescripcionAsiento;
			jTtoolBarDetalleAuxiliarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTtoolBarDetalleTipoDescripcionAsiento;		
		}
		
		final JMenuBar jmenuBarDetalleTipoDescripcionAsiento=jmenuBarDetalleAuxiliarTipoDescripcionAsiento;
		final JToolBar jTtoolBarDetalleTipoDescripcionAsiento=jTtoolBarDetalleAuxiliarTipoDescripcionAsiento;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDescripcionAsiento;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDescripcionAsiento;
			processRunnable.jTableDatos=jTableDatosTipoDescripcionAsiento;
			processRunnable.jPanelCampos=jPanelCamposTipoDescripcionAsiento;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDescripcionAsiento;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDescripcionAsiento;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDescripcionAsiento;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDescripcionAsiento;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDescripcionAsiento;
			processRunnable.jTtoolBar=jTtoolBarTipoDescripcionAsiento;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDescripcionAsiento;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoDescripcionAsiento ,jPanelParametrosReportesTipoDescripcionAsiento, jTableDatosTipoDescripcionAsiento,/*jScrollPanelDatosTipoDescripcionAsiento,*/jPanelCamposTipoDescripcionAsiento,jPanelPaginacionTipoDescripcionAsiento, /*jScrollPanelDatosEdicionTipoDescripcionAsiento,*/ jPanelAccionesTipoDescripcionAsiento,jPanelAccionesFormularioTipoDescripcionAsiento,jmenuBarTipoDescripcionAsiento,jmenuBarDetalleTipoDescripcionAsiento,jTtoolBarTipoDescripcionAsiento,jTtoolBarDetalleTipoDescripcionAsiento));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoDescripcionAsiento(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoDescripcionAsiento(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoDescripcionAsiento(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoDescripcionAsiento(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoDescripcionAsiento,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoDescripcionAsiento,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoDescripcionAsiento(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoDescripcionAsiento,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoDescripcionAsiento,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipodescripcionasientoConstantesFunciones.getsFinalQueryTipoDescripcionAsiento();
		String  finalQueryPaginacionTodos=this.tipodescripcionasientoConstantesFunciones.getsFinalQueryTipoDescripcionAsiento();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoDescripcionAsientoConstantesFunciones.getArrayColumnasGlobalesNoTipoDescripcionAsiento(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoDescripcionAsientoConstantesFunciones.getArrayColumnasGlobalesTipoDescripcionAsiento(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoDescripcionAsientoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipodescripcionasientosEliminados= new ArrayList<TipoDescripcionAsiento>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoDescripcionAsiento();
		
				///*TipoDescripcionAsientoSessionBean*/this.tipodescripcionasientoSessionBean=new TipoDescripcionAsientoSessionBean();
			
			if(this.tipodescripcionasientoSessionBean==null) {
				this.tipodescripcionasientoSessionBean=new TipoDescripcionAsientoSessionBean();
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
					this.iNumeroPaginacion=TipoDescripcionAsientoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoDescripcionAsientoConstantesFunciones.getClassesForeignKeysOfTipoDescripcionAsiento(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipodescripcionasiento."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipodescripcionasientosAux= new ArrayList<TipoDescripcionAsiento>();
			
				
			tipodescripcionasientoLogic.setDatosCliente(this.datosCliente);
			tipodescripcionasientoLogic.setDatosDeep(this.datosDeep);
			tipodescripcionasientoLogic.setIsConDeep(true);
			
			
			tipodescripcionasientoLogic.getTipoDescripcionAsientoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipodescripcionasientoLogic.getTodosTipoDescripcionAsientos(finalQueryGlobal,pagination);
					
					//tipodescripcionasientoLogic.getTodosTipoDescripcionAsientosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipodescripcionasientoLogic.getTipoDescripcionAsientos()==null|| tipodescripcionasientoLogic.getTipoDescripcionAsientos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodescripcionasientosAux= new ArrayList<TipoDescripcionAsiento>();
							tipodescripcionasientosAux.addAll(tipodescripcionasientoLogic.getTipoDescripcionAsientos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodescripcionasientosAux= new ArrayList<TipoDescripcionAsiento>();
							tipodescripcionasientosAux.addAll(tipodescripcionasientos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodescripcionasientoLogic.getTodosTipoDescripcionAsientos(finalQueryGlobal+"",this.pagination);												
							
							//tipodescripcionasientoLogic.getTodosTipoDescripcionAsientosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoDescripcionAsientos("Todos",tipodescripcionasientoLogic.getTipoDescripcionAsientos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodescripcionasientoLogic.setTipoDescripcionAsientos(new ArrayList<TipoDescripcionAsiento>());					
							tipodescripcionasientoLogic.getTipoDescripcionAsientos().addAll(tipodescripcionasientosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodescripcionasientos=new ArrayList<TipoDescripcionAsiento>();
							tipodescripcionasientos.addAll(tipodescripcionasientosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoDescripcionAsiento=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoDescripcionAsiento=this.idActual;
				
				} else if(this.idTipoDescripcionAsientoActual!=null && this.idTipoDescripcionAsientoActual!=0L) {
					idTipoDescripcionAsiento=idTipoDescripcionAsientoActual;
				}
				
					
				this.sDetalleReporte=TipoDescripcionAsientoConstantesFunciones.getDetalleIndicePorId(idTipoDescripcionAsiento);
				
				this.tipodescripcionasientos=new ArrayList<TipoDescripcionAsiento>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipodescripcionasientoLogic.getEntity(idTipoDescripcionAsiento);
					
					//tipodescripcionasientoLogic.getEntityWithConnection(idTipoDescripcionAsiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodescripcionasientoLogic.setTipoDescripcionAsientos(new ArrayList<TipoDescripcionAsiento>());
					tipodescripcionasientoLogic.getTipoDescripcionAsientos().add(tipodescripcionasientoLogic.getTipoDescripcionAsiento());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodescripcionasientos=new ArrayList<TipoDescripcionAsiento>();
					this.tipodescripcionasientos.add(tipodescripcionasiento);
				}
				
				if(tipodescripcionasientoLogic.getTipoDescripcionAsiento()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoDescripcionAsientoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodescripcionasientoLogic.getTipoDescripcionAsientosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDescripcionAsientoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDescripcionAsientoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodescripcionasientoLogic.getTipoDescripcionAsientos()==null||tipodescripcionasientoLogic.getTipoDescripcionAsientos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodescripcionasientos==null|| tipodescripcionasientos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodescripcionasientosAux=new ArrayList<TipoDescripcionAsiento>();
						tipodescripcionasientosAux.addAll(tipodescripcionasientoLogic.getTipoDescripcionAsientos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodescripcionasientosAux=new ArrayList<TipoDescripcionAsiento>();
							tipodescripcionasientosAux.addAll(tipodescripcionasientos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodescripcionasientoLogic.getTipoDescripcionAsientosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDescripcionAsientoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDescripcionAsientoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDescripcionAsientos("FK_IdEmpresa",tipodescripcionasientoLogic.getTipoDescripcionAsientos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDescripcionAsientos("FK_IdEmpresa",tipodescripcionasientos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodescripcionasientoLogic.setTipoDescripcionAsientos(new ArrayList<TipoDescripcionAsiento>());
						tipodescripcionasientoLogic.getTipoDescripcionAsientos().addAll(tipodescripcionasientosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodescripcionasientos=new ArrayList<TipoDescripcionAsiento>();
							tipodescripcionasientos.addAll(tipodescripcionasientosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=TipoDescripcionAsientoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodescripcionasientoLogic.getTipoDescripcionAsientosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDescripcionAsientoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDescripcionAsientoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodescripcionasientoLogic.getTipoDescripcionAsientos()==null||tipodescripcionasientoLogic.getTipoDescripcionAsientos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodescripcionasientos==null|| tipodescripcionasientos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodescripcionasientosAux=new ArrayList<TipoDescripcionAsiento>();
						tipodescripcionasientosAux.addAll(tipodescripcionasientoLogic.getTipoDescripcionAsientos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodescripcionasientosAux=new ArrayList<TipoDescripcionAsiento>();
							tipodescripcionasientosAux.addAll(tipodescripcionasientos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodescripcionasientoLogic.getTipoDescripcionAsientosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDescripcionAsientoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDescripcionAsientoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDescripcionAsientos("FK_IdModulo",tipodescripcionasientoLogic.getTipoDescripcionAsientos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDescripcionAsientos("FK_IdModulo",tipodescripcionasientos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodescripcionasientoLogic.setTipoDescripcionAsientos(new ArrayList<TipoDescripcionAsiento>());
						tipodescripcionasientoLogic.getTipoDescripcionAsientos().addAll(tipodescripcionasientosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodescripcionasientos=new ArrayList<TipoDescripcionAsiento>();
							tipodescripcionasientos.addAll(tipodescripcionasientosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoDescripcionAsiento();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoDescripcionAsiento();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodescripcionasientoLogic.getTipoDescripcionAsientos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodescripcionasientos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodescripcionasientoLogic.getTipoDescripcionAsientos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodescripcionasientos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoDescripcionAsiento tipodescripcionasiento) {
		Boolean permite=true;
		
		if(this.tipodescripcionasiento.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoDescripcionAsientoConstantesFunciones.getOrderByListaTipoDescripcionAsiento();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoDescripcionAsientoConstantesFunciones.getOrderByListaTipoDescripcionAsiento();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDescripcionAsiento tipodescripcionasiento:tipodescripcionasientoLogic.getTipoDescripcionAsientos()) {
				if(tipodescripcionasiento.getsType().equals(Constantes2.S_TOTALES)) {
					tipodescripcionasientoTotales=tipodescripcionasiento;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDescripcionAsiento tipodescripcionasiento:this.tipodescripcionasientos) {
				if(tipodescripcionasiento.getsType().equals(Constantes2.S_TOTALES)) {
					tipodescripcionasientoTotales=tipodescripcionasiento;
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
			this.tipodescripcionasientoAux=new TipoDescripcionAsiento();
			this.tipodescripcionasientoAux.setsType(Constantes2.S_TOTALES);
			this.tipodescripcionasientoAux.setIsNew(false);
			this.tipodescripcionasientoAux.setIsChanged(false);
			this.tipodescripcionasientoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoDescripcionAsientoConstantesFunciones.TotalizarValoresFilaTipoDescripcionAsiento(this.tipodescripcionasientoLogic.getTipoDescripcionAsientos(),this.tipodescripcionasientoAux);
				
				this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().add(this.tipodescripcionasientoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoDescripcionAsientoConstantesFunciones.TotalizarValoresFilaTipoDescripcionAsiento(this.tipodescripcionasientos,this.tipodescripcionasientoAux);
				
				this.tipodescripcionasientos.add(this.tipodescripcionasientoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipodescripcionasientoTotales=new TipoDescripcionAsiento();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().remove(tipodescripcionasientoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodescripcionasientos.remove(tipodescripcionasientoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipodescripcionasientoTotales=new TipoDescripcionAsiento();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDescripcionAsiento tipodescripcionasiento:tipodescripcionasientoLogic.getTipoDescripcionAsientos()) {
				if(tipodescripcionasiento.getsType().equals(Constantes2.S_TOTALES)) {
					tipodescripcionasientoTotales=tipodescripcionasiento;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDescripcionAsientoConstantesFunciones.TotalizarValoresFilaTipoDescripcionAsiento(this.tipodescripcionasientoLogic.getTipoDescripcionAsientos(),tipodescripcionasientoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDescripcionAsiento tipodescripcionasiento:this.tipodescripcionasientos) {
				if(tipodescripcionasiento.getsType().equals(Constantes2.S_TOTALES)) {
					tipodescripcionasientoTotales=tipodescripcionasiento;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDescripcionAsientoConstantesFunciones.TotalizarValoresFilaTipoDescripcionAsiento(this.tipodescripcionasientos,tipodescripcionasientoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoDescripcionAsientosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDescripcionAsientosFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoDescripcionAsientosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodescripcionasientoLogic.getTipoDescripcionAsientosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDescripcionAsientosFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodescripcionasientoLogic.getTipoDescripcionAsientosFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
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
	
	public void inicializarPermisosTipoDescripcionAsiento() {
		this.isPermisoTodoTipoDescripcionAsiento=false;
		this.isPermisoNuevoTipoDescripcionAsiento=false;
		this.isPermisoActualizarTipoDescripcionAsiento=false;
		this.isPermisoActualizarOriginalTipoDescripcionAsiento=false;
		this.isPermisoEliminarTipoDescripcionAsiento=false;
		this.isPermisoGuardarCambiosTipoDescripcionAsiento=false;
		this.isPermisoConsultaTipoDescripcionAsiento=false;
		this.isPermisoBusquedaTipoDescripcionAsiento=false;
		this.isPermisoReporteTipoDescripcionAsiento=false;		
		this.isPermisoOrdenTipoDescripcionAsiento=false;		
		this.isPermisoPaginacionMedioTipoDescripcionAsiento=false;		
		this.isPermisoPaginacionAltoTipoDescripcionAsiento=false;
		this.isPermisoPaginacionTodoTipoDescripcionAsiento=false;
		this.isPermisoCopiarTipoDescripcionAsiento=false;		
		this.isPermisoVerFormTipoDescripcionAsiento=false;		
		this.isPermisoDuplicarTipoDescripcionAsiento=false;		
		this.isPermisoOrdenTipoDescripcionAsiento=false;		
	}
	
	public void setPermisosUsuarioTipoDescripcionAsiento(Boolean isPermiso) {
		this.isPermisoTodoTipoDescripcionAsiento=isPermiso;
		this.isPermisoNuevoTipoDescripcionAsiento=isPermiso;
		this.isPermisoActualizarTipoDescripcionAsiento=isPermiso;
		this.isPermisoActualizarOriginalTipoDescripcionAsiento=isPermiso;
		this.isPermisoEliminarTipoDescripcionAsiento=isPermiso;
		this.isPermisoGuardarCambiosTipoDescripcionAsiento=isPermiso;
		this.isPermisoConsultaTipoDescripcionAsiento=isPermiso;
		this.isPermisoBusquedaTipoDescripcionAsiento=isPermiso;
		this.isPermisoReporteTipoDescripcionAsiento=isPermiso;
		this.isPermisoOrdenTipoDescripcionAsiento=isPermiso;		
		this.isPermisoPaginacionMedioTipoDescripcionAsiento=isPermiso;		
		this.isPermisoPaginacionAltoTipoDescripcionAsiento=isPermiso;		
		this.isPermisoPaginacionTodoTipoDescripcionAsiento=isPermiso;		
		this.isPermisoCopiarTipoDescripcionAsiento=isPermiso;		
		this.isPermisoVerFormTipoDescripcionAsiento=isPermiso;		
		this.isPermisoDuplicarTipoDescripcionAsiento=isPermiso;
		this.isPermisoOrdenTipoDescripcionAsiento=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoDescripcionAsiento(Boolean isPermiso) {
		//this.isPermisoTodoTipoDescripcionAsiento=isPermiso;
		this.isPermisoNuevoTipoDescripcionAsiento=isPermiso;
		this.isPermisoActualizarTipoDescripcionAsiento=isPermiso;
		this.isPermisoActualizarOriginalTipoDescripcionAsiento=isPermiso;
		this.isPermisoEliminarTipoDescripcionAsiento=isPermiso;
		this.isPermisoGuardarCambiosTipoDescripcionAsiento=isPermiso;
		//this.isPermisoConsultaTipoDescripcionAsiento=isPermiso;
		//this.isPermisoBusquedaTipoDescripcionAsiento=isPermiso;
		//this.isPermisoReporteTipoDescripcionAsiento=isPermiso;
		//this.isPermisoOrdenTipoDescripcionAsiento=isPermiso;		
		//this.isPermisoPaginacionMedioTipoDescripcionAsiento=isPermiso;		
		//this.isPermisoPaginacionAltoTipoDescripcionAsiento=isPermiso;		
		//this.isPermisoPaginacionTodoTipoDescripcionAsiento=isPermiso;		
		//this.isPermisoCopiarTipoDescripcionAsiento=isPermiso;		
		//this.isPermisoDuplicarTipoDescripcionAsiento=isPermiso;
		//this.isPermisoOrdenTipoDescripcionAsiento=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoDescripcionAsientoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoDescripcionAsientoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoDescripcionAsiento(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoDescripcionAsientoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoDescripcionAsientoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoDescripcionAsientoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoDescripcionAsientoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoDescripcionAsiento() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoDescripcionAsientoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoDescripcionAsientoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoDescripcionAsiento=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoDescripcionAsiento=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoDescripcionAsiento=this.isPermisoActualizarTipoDescripcionAsiento;
			this.isPermisoEliminarTipoDescripcionAsiento=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoDescripcionAsiento=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoDescripcionAsiento=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoDescripcionAsiento=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoDescripcionAsiento=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoDescripcionAsiento=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDescripcionAsiento=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoDescripcionAsiento=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoDescripcionAsiento=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoDescripcionAsiento=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoDescripcionAsiento=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoDescripcionAsiento=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoDescripcionAsiento=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDescripcionAsiento=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoDescripcionAsiento.setToolTipText(this.jTableDatosTipoDescripcionAsiento.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoDescripcionAsiento(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoDescripcionAsiento(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoDescripcionAsientoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoDescripcionAsientoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoDescripcionAsiento() throws Exception {
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
	public void inicializarCombosForeignKeyTipoDescripcionAsientoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoDescripcionAsientoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoDescripcionAsientoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoDescripcionAsientoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoDescripcionAsientoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoDescripcionAsientoParameterReturnGeneral tipodescripcionasientoReturnGeneral=new TipoDescripcionAsientoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipodescripcionasientoConstantesFunciones.cargarid_empresaTipoDescripcionAsiento)
					 || (this.esRecargarFks && this.tipodescripcionasientoConstantesFunciones.cargarid_empresaTipoDescripcionAsiento)) {

					if(!this.tipodescripcionasientoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipodescripcionasientoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.tipodescripcionasientoConstantesFunciones.cargarid_moduloTipoDescripcionAsiento)
					 || (this.esRecargarFks && this.tipodescripcionasientoConstantesFunciones.cargarid_moduloTipoDescripcionAsiento)) {

					if(!this.tipodescripcionasientoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+tipodescripcionasientoSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipodescripcionasientoReturnGeneral=tipodescripcionasientoLogic.cargarCombosLoteForeignKeyTipoDescripcionAsiento(finalQueryGlobalEmpresa,finalQueryGlobalModulo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipodescripcionasientoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=tipodescripcionasientoReturnGeneral.getmodulosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoDescripcionAsiento()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyModulo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipodescripcionasientoSessionBean==null) {
				this.tipodescripcionasientoSessionBean=new TipoDescripcionAsientoSessionBean();
			}

			if(!this.tipodescripcionasientoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.tipodescripcionasientoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				Modulo modulo=new Modulo();
				ModuloConstantesFunciones.setModuloDescripcion(modulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				modulo.setId(null);

				if(!ModuloConstantesFunciones.ExisteEnLista(this.modulosForeignKey,modulo,true)) {

					this.modulosForeignKey.add(0,modulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoDescripcionAsiento()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoDescripcionAsiento(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoDescripcionAsiento()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDescripcionAsiento();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasiento)throws Exception {	
		try {
			
			this.setActualModuloForeignKey(tipodescripcionasiento.getid_modulo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasiento,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoDescripcionAsiento()throws Exception {	
		try {
			
			this.setActualModuloForeignKey(this.tipodescripcionasientoConstantesFunciones.getid_modulo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDescripcionAsiento()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoDescripcionAsiento()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoDescripcionAsiento()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoDescripcionAsiento()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoDescripcionAsiento()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoDescripcionAsiento(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoDescripcionAsiento()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_empresaTipoDescripcionAsiento!=null && this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_empresaTipoDescripcionAsiento.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_empresaTipoDescripcionAsiento.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_moduloTipoDescripcionAsiento!=null && this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_moduloTipoDescripcionAsiento.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_moduloTipoDescripcionAsiento.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public TipoDescripcionAsientoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoDescripcionAsientoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoDescripcionAsientoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipodescripcionasientoSessionBean=new TipoDescripcionAsientoSessionBean(); 
		this.tipodescripcionasientoConstantesFunciones=new TipoDescripcionAsientoConstantesFunciones(); 
		this.tipodescripcionasientoBean=new TipoDescripcionAsiento();//(this.tipodescripcionasientoConstantesFunciones); 		
		this.tipodescripcionasientoReturnGeneral=new TipoDescripcionAsientoParameterReturnGeneral(); 
		
		this.tipodescripcionasientoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodescripcionasientoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoDescripcionAsientoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoDescripcionAsientoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoDescripcionAsientoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoDescripcionAsiento(true);
			
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
			
			this.tipodescripcionasientoConstantesFunciones=new TipoDescripcionAsientoConstantesFunciones(); 
			this.tipodescripcionasientoBean=new TipoDescripcionAsiento();//this.tipodescripcionasientoConstantesFunciones); 			
			this.tipodescripcionasientoReturnGeneral=new TipoDescripcionAsientoParameterReturnGeneral(); 
		
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Descripcion Asiento Contable Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipodescripcionasiento=new TipoDescripcionAsiento();
			this.tipodescripcionasientos = new ArrayList<TipoDescripcionAsiento>();
			this.tipodescripcionasientosAux = new ArrayList<TipoDescripcionAsiento>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic=new TipoDescripcionAsientoLogic();
				this.tipodescripcionasientoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipodescripcionasientoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipodescripcionasientoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoDescripcionAsiento);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoDescripcionAsiento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDescripcionAsiento);	
					}
					
					if(this.jInternalFrameImportacionTipoDescripcionAsiento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDescripcionAsiento);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoDescripcionAsiento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoDescripcionAsiento);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDescripcionAsiento);
				this.jInternalFrameDetalleFormTipoDescripcionAsiento.setVisible(false);
				this.jInternalFrameDetalleFormTipoDescripcionAsiento.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoDescripcionAsiento!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDescripcionAsiento);
					this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoDescripcionAsiento!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoDescripcionAsiento);
					this.jInternalFrameImportacionTipoDescripcionAsiento.setVisible(false);
					this.jInternalFrameImportacionTipoDescripcionAsiento.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoDescripcionAsiento!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoDescripcionAsiento);
					this.jInternalFrameOrderByTipoDescripcionAsiento.setVisible(false);
					this.jInternalFrameOrderByTipoDescripcionAsiento.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoDescripcionAsientoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoDescripcionAsientoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipodescripcionasientoReturnGeneral=new TipoDescripcionAsientoParameterReturnGeneral();
			
			this.tipodescripcionasientoParameterGeneral=new TipoDescripcionAsientoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipodescripcionasientoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoDescripcionAsientoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDescripcionAsientoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado(),this.tipodescripcionasientoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDescripcionAsientoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado(),this.tipodescripcionasientoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaDuplicarTipoDescripcionAsiento=true;
			this.isVisibilidadCeldaCopiarTipoDescripcionAsiento=true;
			this.isVisibilidadCeldaVerFormTipoDescripcionAsiento=true;
			this.isVisibilidadCeldaOrdenTipoDescripcionAsiento=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaModificarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaActualizarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaEliminarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaCancelarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaGuardarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdModulo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoDescripcionAsiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoDescripcionAsiento();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoDescripcionAsiento(false);
			
			this.setPermisosUsuarioTipoDescripcionAsiento();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado() && this.tipodescripcionasientoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoDescripcionAsientoClasesRelacionadas();
			}
			
			if(this.tipodescripcionasientoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoDescripcionAsientoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoDescripcionAsiento();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoDescripcionAsiento();
			}
			
			if(!this.isPermisoBusquedaTipoDescripcionAsiento) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoDescripcionAsiento.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoDescripcionAsiento,this.isPermisoPaginacionMedioTipoDescripcionAsiento,this.isPermisoPaginacionTodoTipoDescripcionAsiento);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoDescripcionAsientoConstantesFunciones.getTiposSeleccionarTipoDescripcionAsiento());
				
				this.tiposColumnasSelect=TipoDescripcionAsientoConstantesFunciones.getTiposSeleccionarTipoDescripcionAsiento(true);
				
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
			//if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoDescripcionAsiento();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoDescripcionAsiento(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoDescripcionAsiento(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDescripcionAsiento() ;
			
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
			this.moduloLogic=new ModuloLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipodescripcionasientoImplementable= (TipoDescripcionAsientoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDescripcionAsientoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipodescripcionasientoImplementableHome= (TipoDescripcionAsientoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDescripcionAsientoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipodescripcionasientos= new ArrayList<TipoDescripcionAsiento>();
			this.tipodescripcionasientosEliminados= new ArrayList<TipoDescripcionAsiento>();
						
			this.isEsNuevoTipoDescripcionAsiento=false;
			this.esParaAccionDesdeFormularioTipoDescripcionAsiento=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoDescripcionAsiento(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoDescripcionAsiento();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoDescripcionAsientoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoDescripcionAsiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoDescripcionAsiento(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoDescripcionAsiento();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoDescripcionAsiento();
			}
			
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoDescripcionAsiento.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoDescripcionAsiento.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoDescripcionAsiento.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoDescripcionAsiento(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoDescripcionAsiento: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoDescripcionAsiento() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoDescripcionAsiento")) {
				iIndex=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTabbedPaneRelacionesTipoDescripcionAsiento.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTabbedPaneRelacionesTipoDescripcionAsiento.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoDescripcionAsiento();	
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
	
	public void cargarCombosForeignKeyTipoDescripcionAsiento(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoDescripcionAsiento(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoDescripcionAsiento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoDescripcionAsientoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoDescripcionAsiento();
		
		this.cargarCombosFrameForeignKeyTipoDescripcionAsiento();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoDescripcionAsiento();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoDescripcionAsiento();
		}
	}
	
	

	public void cargarCombosForeignKeyModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaModulo(this.modulosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTipoDescripcionAsientoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipodescripcionasientoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
			
			
			if(jTableDatosTipoDescripcionAsiento.getRowCount()>=1) {
				jTableDatosTipoDescripcionAsiento.removeRowSelectionInterval(0, jTableDatosTipoDescripcionAsiento.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoDescripcionAsiento=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoDescripcionAsiento(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoDescripcionAsiento(true);			
			//this.tipodescripcionasiento=new TipoDescripcionAsiento();
			//this.tipodescripcionasiento.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDescripcionAsiento(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDescripcionAsiento() ;
			
			if(TipoDescripcionAsientoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDescripcionAsiento(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipodescripcionasiento);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipodescripcionasiento);				
			
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
			
			if(this.tipodescripcionasientoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoDescripcionAsiento: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoDescripcionAsientoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoDescripcionAsiento> tipodescripcionasientosSeleccionados=new ArrayList<TipoDescripcionAsiento>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoDescripcionAsiento.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoDescripcionAsiento.getSelectedRows().length;			
			}
			
			tipodescripcionasientosSeleccionados=this.getTipoDescripcionAsientosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoDescripcionAsiento--;			
				//TipoDescripcionAsiento tipodescripcionasientoAux= new TipoDescripcionAsiento();			
				//tipodescripcionasientoAux.setId(this.iIdNuevoTipoDescripcionAsiento);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoDescripcionAsiento tipodescripcionasientoOrigen=new TipoDescripcionAsiento();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoDescripcionAsiento tipodescripcionasientoOrigen : tipodescripcionasientosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipodescripcionasientoOrigen =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodescripcionasientoOrigen =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoDescripcionAsiento();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipodescripcionasiento.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoDescripcionAsiento(tipodescripcionasientoOrigen,this.tipodescripcionasiento,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().add(this.tipodescripcionasientoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodescripcionasientos.add(this.tipodescripcionasientoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoDescripcionAsiento(false);
				
				this.jTableDatosTipoDescripcionAsiento.setRowSelectionInterval(this.getIndiceNuevoTipoDescripcionAsiento(), this.getIndiceNuevoTipoDescripcionAsiento());
				
				int iLastRow =  this.jTableDatosTipoDescripcionAsiento.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDescripcionAsiento.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDescripcionAsiento.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDescripcionAsiento(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoDescripcionAsiento> tipodescripcionasientosSeleccionados=new ArrayList<TipoDescripcionAsiento>();									
		
			TipoDescripcionAsiento tipodescripcionasientoOrigen=new TipoDescripcionAsiento();
			TipoDescripcionAsiento tipodescripcionasientoDestino=new TipoDescripcionAsiento();
				
			tipodescripcionasientosSeleccionados=this.getTipoDescripcionAsientosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoDescripcionAsiento.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipodescripcionasientosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoDescripcionAsiento.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodescripcionasientoOrigen =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodescripcionasientoOrigen =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodescripcionasientoDestino =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodescripcionasientoDestino =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipodescripcionasientoOrigen =tipodescripcionasientosSeleccionados.get(0);
				tipodescripcionasientoDestino =tipodescripcionasientosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoDescripcionAsiento(tipodescripcionasientoOrigen,tipodescripcionasientoDestino,true,false);
				
				tipodescripcionasientoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodescripcionasientoDestino,tipodescripcionasientoLogic.getTipoDescripcionAsientos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodescripcionasientoDestino,tipodescripcionasientos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoDescripcionAsiento(false);
				
				//this.jTableDatosTipoDescripcionAsiento.setRowSelectionInterval(this.getIndiceNuevoTipoDescripcionAsiento(), this.getIndiceNuevoTipoDescripcionAsiento());
				
				int iLastRow =  this.jTableDatosTipoDescripcionAsiento.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDescripcionAsiento.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDescripcionAsiento.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDescripcionAsiento(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoDescripcionAsiento.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoDescripcionAsiento.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoDescripcionAsiento.setVisible(!isVisible);
			this.jPanelPaginacionTipoDescripcionAsiento.setVisible(!isVisible);
			this.jPanelAccionesTipoDescripcionAsiento.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoDescripcionAsiento();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoDescripcionAsiento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoDescripcionAsiento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoDescripcionAsiento();
			
			this.abrirFrameOrderByTipoDescripcionAsiento();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoDescripcionAsiento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoDescripcionAsiento(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDescripcionAsiento);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoDescripcionAsiento.isMaximum()) {
					this.jInternalFrameDetalleFormTipoDescripcionAsiento.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoDescripcionAsiento.setSize(this.jInternalFrameDetalleFormTipoDescripcionAsiento.iWidthFormulario,this.jInternalFrameDetalleFormTipoDescripcionAsiento.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoDescripcionAsiento.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoDescripcionAsiento.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoDescripcionAsiento.isMaximum()) {
						this.jInternalFrameDetalleFormTipoDescripcionAsiento.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoDescripcionAsiento.jContentPaneDetalleTipoDescripcionAsiento.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTabbedPaneRelacionesTipoDescripcionAsiento.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoDescripcionAsiento.jContentPaneDetalleTipoDescripcionAsiento.getWidth(),TipoDescripcionAsientoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTabbedPaneRelacionesTipoDescripcionAsiento.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoDescripcionAsiento.jContentPaneDetalleTipoDescripcionAsiento.getWidth(),TipoDescripcionAsientoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTabbedPaneRelacionesTipoDescripcionAsiento.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoDescripcionAsiento.jContentPaneDetalleTipoDescripcionAsiento.getWidth(),TipoDescripcionAsientoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoDescripcionAsiento.setVisible(true);
	        this.jInternalFrameDetalleFormTipoDescripcionAsiento.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoDescripcionAsiento() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoDescripcionAsiento==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoDescripcionAsiento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDescripcionAsiento,false,this);
				} else {
					this.jInternalFrameOrderByTipoDescripcionAsiento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDescripcionAsiento,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoDescripcionAsiento);
				this.jInternalFrameOrderByTipoDescripcionAsiento.setVisible(false);
				this.jInternalFrameOrderByTipoDescripcionAsiento.setSelected(false);
				
				this.jInternalFrameOrderByTipoDescripcionAsiento.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDescripcionAsiento"));
				
				this.inicializarActualizarBindingTablaOrderByTipoDescripcionAsiento();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoDescripcionAsiento() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoDescripcionAsiento==null) {
				
				this.jInternalFrameImportacionTipoDescripcionAsiento=new ImportacionJInternalFrame(TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDescripcionAsiento);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoDescripcionAsiento);
				this.jInternalFrameImportacionTipoDescripcionAsiento.setVisible(false);
				this.jInternalFrameImportacionTipoDescripcionAsiento.setSelected(false);


				this.jInternalFrameImportacionTipoDescripcionAsiento.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDescripcionAsiento"));
				this.jInternalFrameImportacionTipoDescripcionAsiento.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDescripcionAsiento"));
				this.jInternalFrameImportacionTipoDescripcionAsiento.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDescripcionAsiento"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoDescripcionAsiento() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoDescripcionAsiento==null) {
				this.jInternalFrameReporteDinamicoTipoDescripcionAsiento=new ReporteDinamicoJInternalFrame(TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDescripcionAsiento);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDescripcionAsiento);
				this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDescripcionAsiento"));
				this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDescripcionAsiento"));
				this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDescripcionAsiento"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDescripcionAsiento();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoDescripcionAsiento() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDescripcionAsiento);
			
	       	this.jInternalFrameDetalleFormTipoDescripcionAsiento.setVisible(false);
	        this.jInternalFrameDetalleFormTipoDescripcionAsiento.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoDescripcionAsiento.dispose();
			//this.jInternalFrameDetalleFormTipoDescripcionAsiento=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoDescripcionAsiento() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoDescripcionAsiento() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoDescripcionAsiento.setVisible(true);
	        this.jInternalFrameImportacionTipoDescripcionAsiento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoDescripcionAsiento() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoDescripcionAsiento.setVisible(true);
	        this.jInternalFrameOrderByTipoDescripcionAsiento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoDescripcionAsiento() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoDescripcionAsiento.setVisible(false);
	        this.jInternalFrameOrderByTipoDescripcionAsiento.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoDescripcionAsiento() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoDescripcionAsiento() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoDescripcionAsiento.setVisible(false);
	        this.jInternalFrameImportacionTipoDescripcionAsiento.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoDescripcionAsiento(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoDescripcionAsiento(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoDescripcionAsiento(true);
			//this.isEsNuevoTipoDescripcionAsiento=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoDescripcionAsiento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDescripcionAsiento(false) ;
			
			if(tipodescripcionasientoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoDescripcionAsientoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDescripcionAsiento(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDescripcionAsiento(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoDescripcionAsientoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoDescripcionAsiento(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoDescripcionAsiento(true);
			//this.isEsNuevoTipoDescripcionAsiento=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipodescripcionasiento.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoDescripcionAsiento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoDescripcionAsiento(false) ;
			
			if(TipoDescripcionAsientoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDescripcionAsiento(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDescripcionAsiento(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaModulo(List<Modulo> modulosForeignKey)throws Exception{
		TableColumn tableColumnModulo=this.jTableDatosTipoDescripcionAsiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDescripcionAsiento,TipoDescripcionAsientoConstantesFunciones.LABEL_IDMODULO));
		TableCellEditor tableCellEditorModulo =tableColumnModulo.getCellEditor();

		ModuloTableCell moduloTableCellFk=(ModuloTableCell)tableCellEditorModulo;

		if(moduloTableCellFk!=null) {
			moduloTableCellFk.setmodulosForeignKey(modulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoDescripcionAsiento.getSelectedRow();

		//if(intSelectedRow<=0) {
			//moduloTableCellFk.setRowActual(intSelectedRow);
			//moduloTableCellFk.setmodulosForeignKeyActual(modulosForeignKey);
		//}


		if(moduloTableCellFk!=null) {
			moduloTableCellFk.RecargarModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoDescripcionAsiento(false);
			
			//if(!this.isEsNuevoTipoDescripcionAsiento) {								
				int intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(this.tipodescripcionasiento,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);
				
			}
			
			if(this.permiteMantenimiento(this.tipodescripcionasiento)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoDescripcionAsiento=true;
					this.inicializarActualizarBindingTablaTipoDescripcionAsiento(false);
					this.isEsNuevoTipoDescripcionAsiento=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoDescripcionAsiento=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoDescripcionAsiento=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDescripcionAsiento(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDescripcionAsiento(false);
				
				this.habilitarDeshabilitarControlesTipoDescripcionAsiento(false);
			
												
				
				if(TipoDescripcionAsientoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoDescripcionAsiento();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoDescripcionAsientoActionPerformed(evt,tipodescripcionasientoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoDescripcionAsiento(this.tipodescripcionasiento,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoDescripcionAsiento.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipodescripcionasientoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipodescripcionasiento.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoDescripcionAsiento.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDescripcionAsiento.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				this.tipodescripcionasiento.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				this.tipodescripcionasiento.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipodescripcionasiento)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoDescripcionAsientoModel) this.jTableDatosTipoDescripcionAsiento.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoDescripcionAsiento=true;
				this.inicializarActualizarBindingTablaTipoDescripcionAsiento(false);
				this.isEsNuevoTipoDescripcionAsiento=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDescripcionAsiento(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDescripcionAsiento(false);
				
				this.habilitarDeshabilitarControlesTipoDescripcionAsiento(false);
				
				
				
				if(TipoDescripcionAsientoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoDescripcionAsiento();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoDescripcionAsiento.getRowCount()>=1) {
				jTableDatosTipoDescripcionAsiento.removeRowSelectionInterval(0, jTableDatosTipoDescripcionAsiento.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoDescripcionAsiento(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoDescripcionAsiento(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDescripcionAsiento(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDescripcionAsiento(false) ;
			
			this.isEsNuevoTipoDescripcionAsiento=false;
			
			if(TipoDescripcionAsientoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoDescripcionAsiento();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoDescripcionAsiento(false);
				
				//SI ES MANUAL
				if(TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoDescripcionAsiento();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoDescripcionAsiento--;			
			//TipoDescripcionAsiento tipodescripcionasientoAux= new TipoDescripcionAsiento();			
			//tipodescripcionasientoAux.setId(this.iIdNuevoTipoDescripcionAsiento);
			
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoDescripcionAsiento();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);
			
			this.tipodescripcionasiento.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().add(this.tipodescripcionasientoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipodescripcionasientos.add(this.tipodescripcionasientoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoDescripcionAsiento(false);
			
			this.jTableDatosTipoDescripcionAsiento.setRowSelectionInterval(this.getIndiceNuevoTipoDescripcionAsiento(), this.getIndiceNuevoTipoDescripcionAsiento());
			
			int iLastRow =  this.jTableDatosTipoDescripcionAsiento.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoDescripcionAsiento.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoDescripcionAsiento.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoDescripcionAsiento(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoDescripcionAsiento(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDescripcionAsiento(false);
			
			//SI ES MANUAL
			if(TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDescripcionAsiento();
			}
			
			//this.abrirFrameTreeTipoDescripcionAsiento();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Descripcion Asiento ContableS ?", "MANTENIMIENTO DE Tipo Descripcion Asiento Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoDescripcionAsiento.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoDescripcionAsiento();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipodescripcionasientoReturnGeneral=tipodescripcionasientoLogic.procesarImportacionTipoDescripcionAsientosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipodescripcionasientoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoDescripcionAsientoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoDescripcionAsiento.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoDescripcionAsiento.setFileImportacion(this.jInternalFrameImportacionTipoDescripcionAsiento.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoDescripcionAsiento.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoDescripcionAsiento.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoDescripcionAsiento.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoDescripcionAsiento.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoDescripcionAsiento> tipodescripcionasientosSeleccionados=new ArrayList<TipoDescripcionAsiento>();		

		tipodescripcionasientosSeleccionados=this.getTipoDescripcionAsientosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoDescripcionAsientoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoDescripcionAsientoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoDescripcionAsientos("Todos",tipodescripcionasientosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Descripcion Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDescripcionAsientoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDescripcionAsientoConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDescripcionAsientoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDescripcionAsientoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoDescripcionAsientoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoDescripcionAsientoConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case TipoDescripcionAsientoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoDescripcionAsientoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoDescripcionAsientoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoDescripcionAsientoConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case TipoDescripcionAsientoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoDescripcionAsientoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDescripcionAsientoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoDescripcionAsientoConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case TipoDescripcionAsientoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoDescripcionAsientoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoDescripcionAsiento> tipodescripcionasientosSeleccionados=new ArrayList<TipoDescripcionAsiento>();		
		
		tipodescripcionasientosSeleccionados=this.getTipoDescripcionAsientosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodescripcionasiento";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoDescripcionAsientos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoDescripcionAsientoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDescripcionAsientoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoDescripcionAsiento tipodescripcionasiento:tipodescripcionasientosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodescripcionasiento.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDescripcionAsientoConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDescripcionAsientoConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(TipoDescripcionAsiento tipodescripcionasiento:tipodescripcionasientosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodescripcionasiento.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDescripcionAsientoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDescripcionAsientoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoDescripcionAsiento tipodescripcionasiento:tipodescripcionasientosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodescripcionasiento.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDescripcionAsientoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDescripcionAsientoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoDescripcionAsiento tipodescripcionasiento:tipodescripcionasientosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodescripcionasiento.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoDescripcionAsiento(row);				
			//	iRow++;
			//}				
			
			//for(TipoDescripcionAsiento tipodescripcionasientoAux:tipodescripcionasientosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoDescripcionAsiento(tipodescripcionasientoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Descripcion Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipodescripcionasientoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDescripcionAsiento(false);
			
			//SI ES MANUAL
			if(TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDescripcionAsiento();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDescripcionAsiento(false);
			
			//SI ES MANUAL
			if(TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDescripcionAsiento();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDescripcionAsiento(false);
			
			//SI ES MANUAL
			if(TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDescripcionAsiento();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoDescripcionAsiento() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoDescripcionAsiento.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoDescripcionAsiento.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoDescripcionAsiento.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoDescripcionAsiento.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoDescripcionAsiento.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoDescripcionAsiento.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoDescripcionAsiento.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoDescripcionAsiento(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoDescripcionAsiento(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoDescripcionAsiento(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoDescripcionAsiento(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoDescripcionAsiento(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoDescripcionAsiento(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDescripcionAsiento(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoDescripcionAsiento(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoDescripcionAsiento() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoDescripcionAsiento();
		
		this.inicializarActualizarBindingBotonesManualTipoDescripcionAsiento(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDescripcionAsiento();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDescripcionAsiento() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDescripcionAsiento(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDescripcionAsiento(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoDescripcionAsiento.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoDescripcionAsiento.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoDescripcionAsiento.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jCheckBoxPostAccionNuevoTipoDescripcionAsiento.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jCheckBoxPostAccionSinCerrarTipoDescripcionAsiento.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jCheckBoxPostAccionSinMensajeTipoDescripcionAsiento.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoDescripcionAsiento.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoDescripcionAsiento.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoDescripcionAsiento.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
				this.jInternalFrameDetalleFormTipoDescripcionAsiento.jCheckBoxPostAccionNuevoTipoDescripcionAsiento.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoDescripcionAsiento.jCheckBoxPostAccionSinCerrarTipoDescripcionAsiento.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoDescripcionAsiento.jCheckBoxPostAccionSinMensajeTipoDescripcionAsiento.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoDescripcionAsiento.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoDescripcionAsiento.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoDescripcionAsiento.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoDescripcionAsiento!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoDescripcionAsiento.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoDescripcionAsiento.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoDescripcionAsiento.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoDescripcionAsiento.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoDescripcionAsiento!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoDescripcionAsiento.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoDescripcionAsiento.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoDescripcionAsiento(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDescripcionAsiento(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoDescripcionAsiento() throws Exception {
		try	{
			if(TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDescripcionAsiento();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDescripcionAsiento() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDescripcionAsiento() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoDescripcionAsiento.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoDescripcionAsiento.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoDescripcionAsiento.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoDescripcionAsiento.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoDescripcionAsiento.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoDescripcionAsiento.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoDescripcionAsiento.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoDescripcionAsiento.addItem(reporte);
			}
			
			
			if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoDescripcionAsiento.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoDescripcionAsiento.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoDescripcionAsiento.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoDescripcionAsiento.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoDescripcionAsiento.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoDescripcionAsiento.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoDescripcionAsiento.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoDescripcionAsiento.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoDescripcionAsiento.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDescripcionAsiento();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDescripcionAsiento() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDescripcionAsiento!=null) {
				this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDescripcionAsiento!=null) {
				this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoDescripcionAsiento!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoDescripcionAsiento()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento.getSelectedItem()!=null){this.id_moduloFK_IdModulo=((Modulo)this.jComboBoxid_moduloFK_IdModuloTipoDescripcionAsiento.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoDescripcionAsiento(Boolean esInicializar) throws Exception {				
		if(TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDescripcionAsiento();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoDescripcionAsiento() throws Exception {
		this.inicializarActualizarBindingTablaTipoDescripcionAsiento(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoDescripcionAsiento() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoDescripcionAsiento.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoDescripcionAsiento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDescripcionAsiento.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoDescripcionAsientoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoDescripcionAsiento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDescripcionAsiento.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoDescripcionAsientoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoDescripcionAsientoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDescripcionAsientoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoDescripcionAsientoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoDescripcionAsiento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDescripcionAsiento.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoDescripcionAsientoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoDescripcionAsiento.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoDescripcionAsiento(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipodescripcionasientoLogic.getTipoDescripcionAsientos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipodescripcionasientos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoDescripcionAsiento.setModel(new TipoDescripcionAsientoModel(this.tipodescripcionasientoLogic.getTipoDescripcionAsientos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoDescripcionAsiento.setModel(new TipoDescripcionAsientoModel(this.tipodescripcionasientos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoDescripcionAsiento!=null && this.jInternalFrameOrderByTipoDescripcionAsiento.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoDescripcionAsiento();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoDescripcionAsiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDescripcionAsiento,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoDescripcionAsientoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO,tipodescripcionasientoConstantesFunciones.resaltarSeleccionarTipoDescripcionAsiento,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO,tipodescripcionasientoConstantesFunciones.resaltarSeleccionarTipoDescripcionAsiento,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoDescripcionAsiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDescripcionAsiento,TipoDescripcionAsientoConstantesFunciones.LABEL_ID));

		if(this.tipodescripcionasientoConstantesFunciones.mostraridTipoDescripcionAsiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDescripcionAsientoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipodescripcionasientoConstantesFunciones.resaltaridTipoDescripcionAsiento,this.tipodescripcionasientoConstantesFunciones.activaridTipoDescripcionAsiento,this,true,"idTipoDescripcionAsiento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodescripcionasientoConstantesFunciones.resaltaridTipoDescripcionAsiento,this.tipodescripcionasientoConstantesFunciones.activaridTipoDescripcionAsiento,this,true,"idTipoDescripcionAsiento","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDescripcionAsiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDescripcionAsiento,TipoDescripcionAsientoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipodescripcionasientoConstantesFunciones.mostrarid_empresaTipoDescripcionAsiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDescripcionAsientoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipodescripcionasientoConstantesFunciones.resaltarid_empresaTipoDescripcionAsiento,this,this.tipodescripcionasientoConstantesFunciones.activarid_empresaTipoDescripcionAsiento));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipodescripcionasientoConstantesFunciones.resaltarid_empresaTipoDescripcionAsiento,this,this.tipodescripcionasientoConstantesFunciones.activarid_empresaTipoDescripcionAsiento,false,"id_empresaTipoDescripcionAsiento","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDescripcionAsientoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDescripcionAsiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDescripcionAsiento,TipoDescripcionAsientoConstantesFunciones.LABEL_IDMODULO));

		if(this.tipodescripcionasientoConstantesFunciones.mostrarid_moduloTipoDescripcionAsiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDescripcionAsientoConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.tipodescripcionasientoConstantesFunciones.resaltarid_moduloTipoDescripcionAsiento,this,this.tipodescripcionasientoConstantesFunciones.activarid_moduloTipoDescripcionAsiento));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.tipodescripcionasientoConstantesFunciones.resaltarid_moduloTipoDescripcionAsiento,this,this.tipodescripcionasientoConstantesFunciones.activarid_moduloTipoDescripcionAsiento,true,"id_moduloTipoDescripcionAsiento","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDescripcionAsientoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDescripcionAsiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDescripcionAsiento,TipoDescripcionAsientoConstantesFunciones.LABEL_CODIGO));

		if(this.tipodescripcionasientoConstantesFunciones.mostrarcodigoTipoDescripcionAsiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDescripcionAsientoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodescripcionasientoConstantesFunciones.resaltarcodigoTipoDescripcionAsiento,this.tipodescripcionasientoConstantesFunciones.activarcodigoTipoDescripcionAsiento,this,true,"codigoTipoDescripcionAsiento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodescripcionasientoConstantesFunciones.resaltarcodigoTipoDescripcionAsiento,this.tipodescripcionasientoConstantesFunciones.activarcodigoTipoDescripcionAsiento,this,true,"codigoTipoDescripcionAsiento","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDescripcionAsientoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDescripcionAsiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDescripcionAsiento,TipoDescripcionAsientoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipodescripcionasientoConstantesFunciones.mostrarnombreTipoDescripcionAsiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDescripcionAsientoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodescripcionasientoConstantesFunciones.resaltarnombreTipoDescripcionAsiento,this.tipodescripcionasientoConstantesFunciones.activarnombreTipoDescripcionAsiento,this,true,"nombreTipoDescripcionAsiento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodescripcionasientoConstantesFunciones.resaltarnombreTipoDescripcionAsiento,this.tipodescripcionasientoConstantesFunciones.activarnombreTipoDescripcionAsiento,this,true,"nombreTipoDescripcionAsiento","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoDescripcionAsientoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDescripcionAsiento.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDescripcionAsiento.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoDescripcionAsiento && this.isPermisoGuardarCambiosTipoDescripcionAsiento) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoDescripcionAsiento.addColumn(tableColumn);
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
			
			this.jTableDatosTipoDescripcionAsiento.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDescripcionAsiento && this.isPermisoGuardarCambiosTipoDescripcionAsiento) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDescripcionAsiento && this.isPermisoGuardarCambiosTipoDescripcionAsiento) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoDescripcionAsiento.moveColumn(this.jTableDatosTipoDescripcionAsiento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoDescripcionAsiento.moveColumn(this.jTableDatosTipoDescripcionAsiento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoDescripcionAsiento.moveColumn(this.jTableDatosTipoDescripcionAsiento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoDescripcionAsiento.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoDescripcionAsiento.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoDescripcionAsiento,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoDescripcionAsiento.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoDescripcionAsiento.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoDescripcionAsiento.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoDescripcionAsiento.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoDescripcionAsiento.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipodescripcionasientoLogic.getTipoDescripcionAsientos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipodescripcionasientos.size()-1;
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
		//this.jTableDatosTipoDescripcionAsiento.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoDescripcionAsiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoDescripcionAsiento();
			
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
				
				//this.isEsNuevoTipoDescripcionAsiento=false;
					
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
			
				if(this.tipodescripcionasientoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoDescripcionAsiento==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDescripcionAsiento.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDescripcionAsiento.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipodescripcionasiento.getsType().equals("DUPLICADO")
				   || this.tipodescripcionasiento.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoDescripcionAsiento=true;
				
				} else {
					this.isEsNuevoTipoDescripcionAsiento=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipodescripcionasiento.getId()>=0 && !this.tipodescripcionasiento.getIsNew()) {						
						this.isEsNuevoTipoDescripcionAsiento=false;
						
					} else {
						this.isEsNuevoTipoDescripcionAsiento=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoDescripcionAsiento(esRelaciones);						
				
				this.seleccionarTipoDescripcionAsiento(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipodescripcionasiento.getId()<0) {
					this.isEsNuevoTipoDescripcionAsiento=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoDescripcionAsiento(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoDescripcionAsiento(evt,rowIndex);
				}	
				
				if(this.tipodescripcionasientoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoDescripcionAsiento: " + this.dDif); 
					}
				}								
				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoDescripcionAsiento(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipodescripcionasiento)) {
					if(this.tipodescripcionasiento.getId()>0) {
						this.tipodescripcionasiento.setIsDeleted(true);
						
						this.tipodescripcionasientosEliminados.add(this.tipodescripcionasiento);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().remove(this.tipodescripcionasiento);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodescripcionasientos.remove(this.tipodescripcionasiento);				
					}
					
					
					((TipoDescripcionAsientoModel) this.jTableDatosTipoDescripcionAsiento.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDescripcionAsiento(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoDescripcionAsiento(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoDescripcionAsiento) {
			
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDescripcionAsiento.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDescripcionAsiento.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoDescripcionAsiento(this.tipodescripcionasiento);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipodescripcionasientoConstantesFunciones.cargarid_empresaTipoDescripcionAsiento || this.tipodescripcionasientoConstantesFunciones.event_dependid_empresaTipoDescripcionAsiento) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipodescripcionasiento.getid_empresa());
									//this.inicializarActualizarBindingTipoDescripcionAsiento(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipodescripcionasiento.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipodescripcionasiento.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipodescripcionasiento.getid_empresa(),false,"Formulario");

					//Modulo
					if(!this.tipodescripcionasientoConstantesFunciones.cargarid_moduloTipoDescripcionAsiento || this.tipodescripcionasientoConstantesFunciones.event_dependid_moduloTipoDescripcionAsiento) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.tipodescripcionasiento.getid_modulo());
									//this.inicializarActualizarBindingTipoDescripcionAsiento(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(tipodescripcionasiento.getModulo()!=null) {
							this.modulosForeignKey.add(tipodescripcionasiento.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.tipodescripcionasiento.getid_modulo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoDescripcionAsiento("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoDescripcionAsiento(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDescripcionAsiento() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasiento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoDescripcionAsiento(tipodescripcionasiento,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasiento,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoDescripcionAsiento(tipodescripcionasiento);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoDescripcionAsiento(tipodescripcionasiento,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoDescripcionAsiento(tipodescripcionasiento);
	}
	
	public void setVariablesObjetoActualToFormularioTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasiento) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelidTipoDescripcionAsiento.setText(tipodescripcionasiento.getId().toString());
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTextFieldcodigoTipoDescripcionAsiento.setText(tipodescripcionasiento.getcodigo());
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTextAreanombreTipoDescripcionAsiento.setText(tipodescripcionasiento.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoDescripcionAsiento tipodescripcionasientoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipodescripcionasientoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoDescripcionAsiento tipodescripcionasientoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipodescripcionasientoLocal=this.tipodescripcionasiento;
			} else {
				tipodescripcionasientoLocal=this.tipodescripcionasientoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipodescripcionasientoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoDescripcionAsiento(tipodescripcionasientoLocal,true);
					
					if(tipodescripcionasientoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipodescripcionasientoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipodescripcionasientoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasiento,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(tipodescripcionasiento,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(tipodescripcionasiento);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasiento,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(tipodescripcionasiento,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasiento,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelidTipoDescripcionAsiento.getText()==null || this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelidTipoDescripcionAsiento.getText()=="" || this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelidTipoDescripcionAsiento.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelidTipoDescripcionAsiento.setText("0");
			}

			if(conColumnasBase) {tipodescripcionasiento.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelidTipoDescripcionAsiento.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDescripcionAsientoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelIdTipoDescripcionAsiento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodescripcionasiento.setcodigo(this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTextFieldcodigoTipoDescripcionAsiento.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDescripcionAsientoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelcodigoTipoDescripcionAsiento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodescripcionasiento.setnombre(this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTextAreanombreTipoDescripcionAsiento.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDescripcionAsientoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelnombreTipoDescripcionAsiento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasientoBean,TipoDescripcionAsiento tipodescripcionasiento,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipodescripcionasientoBean.getid_modulo()!=null && !tipodescripcionasientoBean.getid_modulo().equals(-1L))) {tipodescripcionasiento.setid_modulo(tipodescripcionasientoBean.getid_modulo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasientoOrigen,TipoDescripcionAsiento tipodescripcionasiento,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodescripcionasientoOrigen.getId()!=null && !tipodescripcionasientoOrigen.getId().equals(0L))) {tipodescripcionasiento.setId(tipodescripcionasientoOrigen.getId());}}
			if(conDefault || (!conDefault && tipodescripcionasientoOrigen.getid_modulo()!=null && !tipodescripcionasientoOrigen.getid_modulo().equals(-1L))) {tipodescripcionasiento.setid_modulo(tipodescripcionasientoOrigen.getid_modulo());}
			if(conDefault || (!conDefault && tipodescripcionasientoOrigen.getcodigo()!=null && !tipodescripcionasientoOrigen.getcodigo().equals(""))) {tipodescripcionasiento.setcodigo(tipodescripcionasientoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipodescripcionasientoOrigen.getnombre()!=null && !tipodescripcionasientoOrigen.getnombre().equals(""))) {tipodescripcionasiento.setnombre(tipodescripcionasientoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasiento) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelidTipoDescripcionAsiento.setText(tipodescripcionasiento.getId().toString());
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTextFieldcodigoTipoDescripcionAsiento.setText(tipodescripcionasiento.getcodigo());
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTextAreanombreTipoDescripcionAsiento.setText(tipodescripcionasiento.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDescripcionAsiento(TipoDescripcionAsientoBean tipodescripcionasientoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelidTipoDescripcionAsiento.setText(tipodescripcionasientoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTextFieldcodigoTipoDescripcionAsiento.setText(tipodescripcionasientoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTextAreanombreTipoDescripcionAsiento.setText(tipodescripcionasientoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoDescripcionAsiento(TipoDescripcionAsientoParameterReturnGeneral tipodescripcionasientoReturnGeneral,TipoDescripcionAsientoBean tipodescripcionasientoBean,Boolean conDefault) throws Exception { 
		try {
			TipoDescripcionAsiento tipodescripcionasientoLocal=new TipoDescripcionAsiento();
			
			tipodescripcionasientoLocal=tipodescripcionasientoReturnGeneral.getTipoDescripcionAsiento();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodescripcionasientoLocal.getId()!=null && !tipodescripcionasientoLocal.getId().equals(0L))) {tipodescripcionasientoBean.setId(tipodescripcionasientoLocal.getId());}}
			if(conDefault || (!conDefault && tipodescripcionasientoLocal.getid_modulo()!=null && !tipodescripcionasientoLocal.getid_modulo().equals(-1L))) {tipodescripcionasientoBean.setid_modulo(tipodescripcionasientoLocal.getid_modulo());}
			if(conDefault || (!conDefault && tipodescripcionasientoLocal.getcodigo()!=null && !tipodescripcionasientoLocal.getcodigo().equals(""))) {tipodescripcionasientoBean.setcodigo(tipodescripcionasientoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipodescripcionasientoLocal.getnombre()!=null && !tipodescripcionasientoLocal.getnombre().equals(""))) {tipodescripcionasientoBean.setnombre(tipodescripcionasientoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoDescripcionAsientoGenerico(Long idTipoDescripcionAsientoSeleccionado,JComboBox jComboBoxTipoDescripcionAsiento,List<TipoDescripcionAsiento> tipodescripcionasientosLocal)throws Exception {
		try {
			TipoDescripcionAsiento  tipodescripcionasientoTemp=null;

			for(TipoDescripcionAsiento tipodescripcionasientoAux:tipodescripcionasientosLocal) {
				if(tipodescripcionasientoAux.getId()!=null && tipodescripcionasientoAux.getId().equals(idTipoDescripcionAsientoSeleccionado)) {
					tipodescripcionasientoTemp=tipodescripcionasientoAux;
					break;
				}
			}

			jComboBoxTipoDescripcionAsiento.setSelectedItem(tipodescripcionasientoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoDescripcionAsientoGenerico(JComboBox jComboBoxTipoDescripcionAsiento,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoDescripcionAsiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDescripcionAsiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoDescripcionAsiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDescripcionAsiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDescripcionAsiento.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoDescripcionAsiento.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDescripcionAsiento.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoDescripcionAsiento.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoDescripcionAsiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoDescripcionAsiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodescripcionasiento=(TipoDescripcionAsiento) tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodescripcionasiento =(TipoDescripcionAsiento) tipodescripcionasientos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipodescripcionasiento.getIsNew() && !tipodescripcionasiento.getIsChanged() && !tipodescripcionasiento.getIsDeleted()) {
				sDescripcion=tipodescripcionasiento.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipodescripcionasiento.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!tipodescripcionasiento.getIsNew() && !tipodescripcionasiento.getIsChanged() && !tipodescripcionasiento.getIsDeleted()) {
				sDescripcion=tipodescripcionasiento.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=tipodescripcionasiento.getmodulo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoDescripcionAsiento tipodescripcionasientoRow=new TipoDescripcionAsiento();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodescripcionasientoRow=(TipoDescripcionAsiento) tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodescripcionasientoRow=(TipoDescripcionAsiento) tipodescripcionasientos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoDescripcionAsiento(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaNuevoTipoDescripcionAsiento && this.isPermisoNuevoTipoDescripcionAsiento));			
			this.jButtonDuplicarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaDuplicarTipoDescripcionAsiento && this.isPermisoDuplicarTipoDescripcionAsiento));			
			this.jButtonCopiarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaCopiarTipoDescripcionAsiento && this.isPermisoCopiarTipoDescripcionAsiento));
			this.jButtonVerFormTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaVerFormTipoDescripcionAsiento && this.isPermisoVerFormTipoDescripcionAsiento));
			
			this.jButtonAbrirOrderByTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaOrdenTipoDescripcionAsiento && this.isPermisoOrdenTipoDescripcionAsiento));			
			
			this.jButtonNuevoRelacionesTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento && this.isPermisoNuevoTipoDescripcionAsiento));			
			this.jButtonNuevoGuardarCambiosTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaNuevoTipoDescripcionAsiento && this.isPermisoNuevoTipoDescripcionAsiento && this.isPermisoGuardarCambiosTipoDescripcionAsiento));
			
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonModificarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaModificarTipoDescripcionAsiento && this.isPermisoActualizarTipoDescripcionAsiento));	
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonActualizarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaActualizarTipoDescripcionAsiento && this.isPermisoActualizarTipoDescripcionAsiento));	
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonEliminarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaEliminarTipoDescripcionAsiento && this.isPermisoEliminarTipoDescripcionAsiento));
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonCancelarTipoDescripcionAsiento.setVisible(this.isVisibilidadCeldaCancelarTipoDescripcionAsiento);							
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonGuardarCambiosTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaGuardarTipoDescripcionAsiento && this.isPermisoGuardarCambiosTipoDescripcionAsiento));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento && this.isPermisoGuardarCambiosTipoDescripcionAsiento));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaNuevoTipoDescripcionAsiento && this.isPermisoNuevoTipoDescripcionAsiento));						
			this.jButtonDuplicarToolBarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaDuplicarTipoDescripcionAsiento && this.isPermisoDuplicarTipoDescripcionAsiento));						
			this.jButtonCopiarToolBarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaCopiarTipoDescripcionAsiento && this.isPermisoCopiarTipoDescripcionAsiento));			
			this.jButtonVerFormToolBarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaVerFormTipoDescripcionAsiento && this.isPermisoVerFormTipoDescripcionAsiento));			
			this.jButtonAbrirOrderByToolBarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaOrdenTipoDescripcionAsiento && this.isPermisoOrdenTipoDescripcionAsiento));
			this.jButtonNuevoRelacionesToolBarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento && this.isPermisoNuevoTipoDescripcionAsiento));			
			this.jButtonNuevoGuardarCambiosToolBarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaNuevoTipoDescripcionAsiento && this.isPermisoNuevoTipoDescripcionAsiento && this.isPermisoGuardarCambiosTipoDescripcionAsiento));			
			
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonModificarToolBarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaModificarTipoDescripcionAsiento && this.isPermisoActualizarTipoDescripcionAsiento));	
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonActualizarToolBarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaActualizarTipoDescripcionAsiento  && this.isPermisoActualizarTipoDescripcionAsiento));	
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonEliminarToolBarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaEliminarTipoDescripcionAsiento && this.isPermisoEliminarTipoDescripcionAsiento));
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonCancelarToolBarTipoDescripcionAsiento.setVisible(this.isVisibilidadCeldaCancelarTipoDescripcionAsiento);				
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonGuardarCambiosToolBarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaGuardarTipoDescripcionAsiento && this.isPermisoGuardarCambiosTipoDescripcionAsiento));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento && this.isPermisoGuardarCambiosTipoDescripcionAsiento));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaNuevoTipoDescripcionAsiento && this.isPermisoNuevoTipoDescripcionAsiento));			
			this.jMenuItemDuplicarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaDuplicarTipoDescripcionAsiento && this.isPermisoDuplicarTipoDescripcionAsiento));			
			this.jMenuItemCopiarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaCopiarTipoDescripcionAsiento && this.isPermisoCopiarTipoDescripcionAsiento));			
			this.jMenuItemVerFormTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaVerFormTipoDescripcionAsiento && this.isPermisoVerFormTipoDescripcionAsiento));			
			this.jMenuItemAbrirOrderByTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaOrdenTipoDescripcionAsiento && this.isPermisoOrdenTipoDescripcionAsiento));			
			//this.jMenuItemMostrarOcultarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaOrdenTipoDescripcionAsiento && this.isPermisoOrdenTipoDescripcionAsiento));
			this.jMenuItemDetalleAbrirOrderByTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaOrdenTipoDescripcionAsiento && this.isPermisoOrdenTipoDescripcionAsiento));			
			//this.jMenuItemDetalleMostrarOcultarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaOrdenTipoDescripcionAsiento && this.isPermisoOrdenTipoDescripcionAsiento));			
			this.jMenuItemNuevoRelacionesTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento && this.isPermisoNuevoTipoDescripcionAsiento));			
			this.jMenuItemNuevoGuardarCambiosTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaNuevoTipoDescripcionAsiento && this.isPermisoNuevoTipoDescripcionAsiento && this.isPermisoGuardarCambiosTipoDescripcionAsiento));									
			
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jMenuItemModificarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaModificarTipoDescripcionAsiento && this.isPermisoActualizarTipoDescripcionAsiento));	
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jMenuItemActualizarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaActualizarTipoDescripcionAsiento && this.isPermisoActualizarTipoDescripcionAsiento));	
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jMenuItemEliminarTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaEliminarTipoDescripcionAsiento && this.isPermisoEliminarTipoDescripcionAsiento));
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jMenuItemCancelarTipoDescripcionAsiento.setVisible(this.isVisibilidadCeldaCancelarTipoDescripcionAsiento);				
			}
			
			this.jMenuItemGuardarCambiosTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaGuardarTipoDescripcionAsiento && this.isPermisoGuardarCambiosTipoDescripcionAsiento));						
			this.jMenuItemGuardarCambiosTablaTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento && this.isPermisoGuardarCambiosTipoDescripcionAsiento));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoDescripcionAsiento=this.jButtonNuevoTipoDescripcionAsiento.isVisible();
			this.isVisibilidadCeldaDuplicarTipoDescripcionAsiento=this.jButtonDuplicarTipoDescripcionAsiento.isVisible();
			this.isVisibilidadCeldaCopiarTipoDescripcionAsiento=this.jButtonCopiarTipoDescripcionAsiento.isVisible();
			this.isVisibilidadCeldaVerFormTipoDescripcionAsiento=this.jButtonVerFormTipoDescripcionAsiento.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoDescripcionAsiento=this.jButtonAbrirOrderByTipoDescripcionAsiento.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento=this.jButtonNuevoRelacionesTipoDescripcionAsiento.isVisible();
			this.isVisibilidadCeldaModificarTipoDescripcionAsiento=this.jButtonModificarTipoDescripcionAsiento.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
			this.isVisibilidadCeldaActualizarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonActualizarTipoDescripcionAsiento.isVisible();
			this.isVisibilidadCeldaEliminarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonEliminarTipoDescripcionAsiento.isVisible();
			this.isVisibilidadCeldaCancelarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonCancelarTipoDescripcionAsiento.isVisible();
			this.isVisibilidadCeldaGuardarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonGuardarCambiosTipoDescripcionAsiento.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento=this.jButtonGuardarCambiosTablaTipoDescripcionAsiento.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoDescripcionAsiento=this.jButtonNuevoToolBarTipoDescripcionAsiento.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento=this.jButtonNuevoRelacionesToolBarTipoDescripcionAsiento.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
			this.isVisibilidadCeldaModificarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonModificarToolBarTipoDescripcionAsiento.isVisible();
			this.isVisibilidadCeldaActualizarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonActualizarToolBarTipoDescripcionAsiento.isVisible();
			this.isVisibilidadCeldaEliminarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonEliminarToolBarTipoDescripcionAsiento.isVisible();
			this.isVisibilidadCeldaCancelarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonCancelarToolBarTipoDescripcionAsiento.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDescripcionAsiento=this.jButtonGuardarCambiosToolBarTipoDescripcionAsiento.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento=this.jButtonGuardarCambiosTablaToolBarTipoDescripcionAsiento.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoDescripcionAsiento=this.jMenuItemNuevoTipoDescripcionAsiento.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento=this.jMenuItemNuevoRelacionesTipoDescripcionAsiento.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
			this.isVisibilidadCeldaModificarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jMenuItemModificarTipoDescripcionAsiento.isVisible();
			this.isVisibilidadCeldaActualizarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jMenuItemActualizarTipoDescripcionAsiento.isVisible();
			this.isVisibilidadCeldaEliminarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jMenuItemEliminarTipoDescripcionAsiento.isVisible();
			this.isVisibilidadCeldaCancelarTipoDescripcionAsiento=this.jInternalFrameDetalleFormTipoDescripcionAsiento.jMenuItemCancelarTipoDescripcionAsiento.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDescripcionAsiento=this.jMenuItemGuardarCambiosTipoDescripcionAsiento.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento=this.jMenuItemGuardarCambiosTablaTipoDescripcionAsiento.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoDescripcionAsiento(Boolean esInicializar) {
		if(TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipodescripcionasientoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDescripcionAsiento();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoDescripcionAsiento(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoDescripcionAsiento() {
		this.jButtonNuevoTipoDescripcionAsiento.setVisible(this.isPermisoNuevoTipoDescripcionAsiento);			
		this.jButtonDuplicarTipoDescripcionAsiento.setVisible(this.isPermisoDuplicarTipoDescripcionAsiento);			
		this.jButtonCopiarTipoDescripcionAsiento.setVisible(this.isPermisoCopiarTipoDescripcionAsiento);			
		this.jButtonVerFormTipoDescripcionAsiento.setVisible(this.isPermisoVerFormTipoDescripcionAsiento);			
		
		this.jButtonAbrirOrderByTipoDescripcionAsiento.setVisible(this.isPermisoOrdenTipoDescripcionAsiento);					
		
		this.jButtonNuevoRelacionesTipoDescripcionAsiento.setVisible(this.isPermisoNuevoTipoDescripcionAsiento);			
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonModificarTipoDescripcionAsiento.setVisible(this.isPermisoActualizarTipoDescripcionAsiento);	
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonActualizarTipoDescripcionAsiento.setVisible(this.isPermisoActualizarTipoDescripcionAsiento);	
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonEliminarTipoDescripcionAsiento.setVisible(this.isPermisoEliminarTipoDescripcionAsiento);
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonCancelarTipoDescripcionAsiento.setVisible(this.isVisibilidadCeldaCancelarTipoDescripcionAsiento);						
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonGuardarCambiosTipoDescripcionAsiento.setVisible(this.isPermisoGuardarCambiosTipoDescripcionAsiento);							
		}
		
		this.jButtonGuardarCambiosTablaTipoDescripcionAsiento.setVisible(this.isPermisoActualizarTipoDescripcionAsiento);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDescripcionAsiento() {
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonModificarTipoDescripcionAsiento.setVisible(this.isPermisoActualizarTipoDescripcionAsiento);	
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonActualizarTipoDescripcionAsiento.setVisible(this.isPermisoActualizarTipoDescripcionAsiento);	
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonEliminarTipoDescripcionAsiento.setVisible(this.isPermisoEliminarTipoDescripcionAsiento);
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonCancelarTipoDescripcionAsiento.setVisible(this.isVisibilidadCeldaCancelarTipoDescripcionAsiento);							
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonGuardarCambiosTipoDescripcionAsiento.setVisible((this.isVisibilidadCeldaGuardarTipoDescripcionAsiento && this.isPermisoGuardarCambiosTipoDescripcionAsiento));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoDescripcionAsiento() {
		if(TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoDescripcionAsiento();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoDescripcionAsiento() {
	}
	
	public void jTableDatosTipoDescripcionAsientoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoDescripcionAsiento(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoDescripcionAsientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(this.gettipodescripcionasiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodescripcionasiento==null) {
						this.tipodescripcionasiento = new TipoDescripcionAsiento();
					}

					this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(this.tipodescripcionasiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);
				}

				if(this.tipodescripcionasiento.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipodescripcionasiento.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDescripcionAsiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoDescripcionAsientoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoDescripcionAsiento(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoDescripcionAsiento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoDescripcionAsiento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(this.gettipodescripcionasiento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipodescripcionasientoLogic.getConnexion());

				if(this.tipodescripcionasiento.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipodescripcionasiento.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoDescripcionAsiento=(TitledBorder)this.jScrollPanelDatosTipoDescripcionAsiento.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoDescripcionAsiento.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoDescripcionAsientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(this.gettipodescripcionasiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodescripcionasiento==null) {
						this.tipodescripcionasiento = new TipoDescripcionAsiento();
					}

					this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(this.tipodescripcionasiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);
				}

				if(this.tipodescripcionasiento.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipodescripcionasiento.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDescripcionAsiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloTipoDescripcionAsientoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebTipoDescripcionAsiento(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoDescripcionAsiento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoDescripcionAsiento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(this.gettipodescripcionasiento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.tipodescripcionasientoLogic.getConnexion());

				if(this.tipodescripcionasiento.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.tipodescripcionasiento.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoDescripcionAsiento=(TitledBorder)this.jScrollPanelDatosTipoDescripcionAsiento.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderTipoDescripcionAsiento.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloTipoDescripcionAsientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(this.gettipodescripcionasiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodescripcionasiento==null) {
						this.tipodescripcionasiento = new TipoDescripcionAsiento();
					}

					this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(this.tipodescripcionasiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);
				}

				if(this.tipodescripcionasiento.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.tipodescripcionasiento.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDescripcionAsiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoDescripcionAsientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(this.gettipodescripcionasiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodescripcionasiento==null) {
						this.tipodescripcionasiento = new TipoDescripcionAsiento();
					}

					this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(this.tipodescripcionasiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);
				}

				if(this.tipodescripcionasiento.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipodescripcionasiento.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDescripcionAsiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoDescripcionAsientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(this.gettipodescripcionasiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodescripcionasiento==null) {
						this.tipodescripcionasiento = new TipoDescripcionAsiento();
					}

					this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(this.tipodescripcionasiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);
				}

				if(this.tipodescripcionasiento.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipodescripcionasiento.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDescripcionAsiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDescripcionAsiento(false,false);

			this.getTipoDescripcionAsientosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoDescripcionAsiento(false);

			//if(TipoDescripcionAsientoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDescripcionAsiento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloTipoDescripcionAsientoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDescripcionAsiento(false,false);

			this.getTipoDescripcionAsientosFK_IdModulo();

			this.inicializarActualizarBindingTipoDescripcionAsiento(false);

			//if(TipoDescripcionAsientoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDescripcionAsiento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodescripcionasientoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoDescripcionAsiento() {
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.dispose();
			this.jInternalFrameDetalleFormTipoDescripcionAsiento=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoDescripcionAsiento!=null) {
			this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.dispose();
			this.jInternalFrameReporteDinamicoTipoDescripcionAsiento=null;
		}
		
		if(this.jInternalFrameImportacionTipoDescripcionAsiento!=null) {
			this.jInternalFrameImportacionTipoDescripcionAsiento.setVisible(false);	    			
			this.jInternalFrameImportacionTipoDescripcionAsiento.dispose();
			this.jInternalFrameImportacionTipoDescripcionAsiento=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoDescripcionAsiento();
			
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoDescripcionAsiento")) {
				jButtonNuevoTipoDescripcionAsientoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoDescripcionAsiento")) {
				jButtonDuplicarTipoDescripcionAsientoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoDescripcionAsiento")) {
				jButtonCopiarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoDescripcionAsiento")) {
				jButtonVerFormTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoDescripcionAsiento")) {
				jButtonNuevoTipoDescripcionAsientoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoDescripcionAsiento")) {
				jButtonDuplicarTipoDescripcionAsientoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoDescripcionAsiento")) {
				jButtonNuevoTipoDescripcionAsientoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoDescripcionAsiento")) {
				jButtonDuplicarTipoDescripcionAsientoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoDescripcionAsiento")) {
				jButtonNuevoTipoDescripcionAsientoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoDescripcionAsiento")) {
				jButtonNuevoTipoDescripcionAsientoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoDescripcionAsiento")) {
				jButtonNuevoTipoDescripcionAsientoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoDescripcionAsiento")) {
				jButtonModificarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoDescripcionAsiento")) {
				jButtonModificarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoDescripcionAsiento")) {
				jButtonModificarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoDescripcionAsiento")) {
				jButtonActualizarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoDescripcionAsiento")) {
				jButtonActualizarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoDescripcionAsiento")) {
				jButtonActualizarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoDescripcionAsiento")) {
				jButtonEliminarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoDescripcionAsiento")) {
				jButtonEliminarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoDescripcionAsiento")) {
				jButtonEliminarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoDescripcionAsiento")) {
				jButtonCancelarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoDescripcionAsiento")) {
				jButtonCancelarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoDescripcionAsiento")) {
				jButtonCancelarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoDescripcionAsiento")) {
				jButtonCerrarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoDescripcionAsiento")) {
				jButtonCerrarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoDescripcionAsiento")) {
				jButtonCerrarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoDescripcionAsiento")) {
				jButtonMostrarOcultarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoDescripcionAsiento")) {
				jButtonCancelarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoDescripcionAsiento")) {
				jButtonGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoDescripcionAsiento")) {
				jButtonGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoDescripcionAsiento")) {
				jButtonCopiarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoDescripcionAsiento")) {
				jButtonVerFormTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoDescripcionAsiento")) {
				jButtonGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoDescripcionAsiento")) {
				jButtonCopiarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoDescripcionAsiento")) {
				jButtonVerFormTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoDescripcionAsiento")) {
				jButtonGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoDescripcionAsiento")) {
				jButtonGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoDescripcionAsiento")) {
				jButtonGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoDescripcionAsiento")) {
				jButtonRecargarInformacionTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoDescripcionAsiento")) {
				jButtonRecargarInformacionTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoDescripcionAsiento")) {
				jButtonRecargarInformacionTipoDescripcionAsientoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoDescripcionAsiento")) {
				jButtonAnterioresTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoDescripcionAsiento")) {
				jButtonAnterioresTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoDescripcionAsiento")) {
				jButtonAnterioresTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoDescripcionAsiento")) {
				jButtonSiguientesTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoDescripcionAsiento")) {
				jButtonSiguientesTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoDescripcionAsiento")) {
				jButtonSiguientesTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoDescripcionAsiento") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoDescripcionAsiento")) {
				jButtonAbrirOrderByTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoDescripcionAsiento") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoDescripcionAsiento")) {
				jButtonMostrarOcultarTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDescripcionAsiento")) {
				jButtonNuevoGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoDescripcionAsiento")) {
				jButtonNuevoGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoDescripcionAsiento")) {
				jButtonNuevoGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoDescripcionAsiento")) {
				jButtonCerrarReporteDinamicoTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoDescripcionAsiento")) {
				jButtonGenerarReporteDinamicoTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoDescripcionAsiento")) {
				
				jButtonGenerarExcelReporteDinamicoTipoDescripcionAsientoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoDescripcionAsiento")) {
				jButtonCerrarImportacionTipoDescripcionAsientoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoDescripcionAsiento")) {
				
				jButtonGenerarImportacionTipoDescripcionAsientoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoDescripcionAsiento")) {
				
				jButtonAbrirImportacionTipoDescripcionAsientoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoDescripcionAsiento")) {
				jComboBoxTiposAccionesTipoDescripcionAsientoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoDescripcionAsiento")) {
				jComboBoxTiposRelacionesTipoDescripcionAsientoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoDescripcionAsiento")) {
				jComboBoxTiposAccionesTipoDescripcionAsientoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoDescripcionAsiento")) {
				
				jComboBoxTiposSeleccionarTipoDescripcionAsientoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoDescripcionAsiento")) {
				jTextFieldValorCampoGeneralTipoDescripcionAsientoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoDescripcionAsiento")) {
				jButtonAbrirOrderByTipoDescripcionAsientoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoDescripcionAsiento")) {
				jButtonAbrirOrderByTipoDescripcionAsientoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoDescripcionAsiento")) {
				jButtonCerrarOrderByTipoDescripcionAsientoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDescripcionAsientoBusqueda")) {
				this.jButtonidTipoDescripcionAsientoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoDescripcionAsientoUpdate")) {
				this.jButtonid_empresaTipoDescripcionAsientoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoDescripcionAsientoBusqueda")) {
				this.jButtonid_empresaTipoDescripcionAsientoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloTipoDescripcionAsientoUpdate")) {
				this.jButtonid_moduloTipoDescripcionAsientoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloTipoDescripcionAsientoBusqueda")) {
				this.jButtonid_moduloTipoDescripcionAsientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDescripcionAsientoBusqueda")) {
				this.jButtoncodigoTipoDescripcionAsientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDescripcionAsientoBusqueda")) {
				this.jButtonnombreTipoDescripcionAsientoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdModuloTipoDescripcionAsiento")) {
				this.jButtonFK_IdModuloTipoDescripcionAsientoActionPerformed(evt);
			}
			
			;
			
			
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoDescripcionAsiento();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDescripcionAsientoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodescripcionasiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodescripcionasiento);
				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
				
				


				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDescripcionAsiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDescripcionAsiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoDescripcionAsiento tipodescripcionasientoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipodescripcionasientoLocal=this.tipodescripcionasiento;
			} else {
				tipodescripcionasientoLocal=this.tipodescripcionasientoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodescripcionasiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodescripcionasiento);
				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
							
				
				


				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDescripcionAsiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDescripcionAsiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDescripcionAsientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoAnterior =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodescripcionasientoAnterior =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
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
			
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
			
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
			
			


			
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDescripcionAsientoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodescripcionasiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodescripcionasiento);
				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
								
						
				


				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDescripcionAsiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDescripcionAsiento.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodescripcionasiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodescripcionasiento);
				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
								
				
				


				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDescripcionAsiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDescripcionAsiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDescripcionAsientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoAnterior =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodescripcionasientoAnterior =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodescripcionasiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodescripcionasiento);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDescripcionAsientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoAnterior =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodescripcionasientoAnterior =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDescripcionAsientoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodescripcionasiento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodescripcionasiento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodescripcionasiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodescripcionasiento);
				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
							
				
				


				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDescripcionAsiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDescripcionAsiento.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDescripcionAsientoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodescripcionasientoAnterior =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodescripcionasientoAnterior =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
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
			
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
			
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
			
			


			
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDescripcionAsientoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodescripcionasiento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodescripcionasiento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodescripcionasiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodescripcionasiento);
				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
								
				
				


				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDescripcionAsiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDescripcionAsiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDescripcionAsientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoAnterior =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodescripcionasientoAnterior =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDescripcionAsientoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodescripcionasiento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodescripcionasiento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDescripcionAsientoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodescripcionasiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodescripcionasiento);
				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoDescripcionAsiento")) {
					jCheckBoxSeleccionarTodosTipoDescripcionAsientoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoDescripcionAsiento")) {
					jCheckBoxSeleccionadosTipoDescripcionAsientoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoDescripcionAsiento")) {
					
				}
				
				


				
				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDescripcionAsiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDescripcionAsiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodescripcionasiento);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipodescripcionasiento);
				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
												
				
				


				
				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDescripcionAsiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDescripcionAsiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDescripcionAsientoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodescripcionasientoAnterior =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodescripcionasientoAnterior =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDescripcionAsientoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodescripcionasiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodescripcionasiento);
				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
				
				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
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
			
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
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
			
			


			
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDescripcionAsientoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodescripcionasiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodescripcionasiento);
				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDescripcionAsiento.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDescripcionAsiento.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodescripcionasiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodescripcionasiento);
				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
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
				
				


				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDescripcionAsiento.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDescripcionAsiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDescripcionAsientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodescripcionasientoAnterior =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodescripcionasientoAnterior =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoDescripcionAsiento")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoDescripcionAsientoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoDescripcionAsiento.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipodescripcionasiento =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipodescripcionasiento);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoDescripcionAsiento")) {
				
				}
				
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoDescripcionAsiento")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoDescripcionAsiento.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoDescripcionAsiento")) {
			
			}
			
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoDescripcionAsiento();
			
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoDescripcionAsiento")) {
				jButtonNuevoTipoDescripcionAsientoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoDescripcionAsiento")) {
				jButtonDuplicarTipoDescripcionAsientoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoDescripcionAsiento")) {
				jButtonCopiarTipoDescripcionAsientoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoDescripcionAsiento")) {
				jButtonVerFormTipoDescripcionAsientoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoDescripcionAsiento")) {
				jButtonNuevoTipoDescripcionAsientoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoDescripcionAsiento")) {
				jButtonModificarTipoDescripcionAsientoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoDescripcionAsiento")) {
				jButtonActualizarTipoDescripcionAsientoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoDescripcionAsiento")) {
				jButtonEliminarTipoDescripcionAsientoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoDescripcionAsiento")) {
				jButtonGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoDescripcionAsiento")) {
				jButtonCancelarTipoDescripcionAsientoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoDescripcionAsiento")) {
				jButtonCerrarTipoDescripcionAsientoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoDescripcionAsiento")) {
				jButtonGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDescripcionAsiento")) {
				jButtonNuevoGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoDescripcionAsiento")) {
				jButtonAbrirOrderByTipoDescripcionAsientoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoDescripcionAsiento")) {
				jButtonRecargarInformacionTipoDescripcionAsientoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoDescripcionAsiento")) {
				jButtonAnterioresTipoDescripcionAsientoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoDescripcionAsiento")) {
				jButtonSiguientesTipoDescripcionAsientoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDescripcionAsientoBusqueda")) {
				this.jButtonidTipoDescripcionAsientoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoDescripcionAsientoUpdate")) {
				this.jButtonid_empresaTipoDescripcionAsientoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoDescripcionAsientoBusqueda")) {
				this.jButtonid_empresaTipoDescripcionAsientoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloTipoDescripcionAsientoUpdate")) {
				this.jButtonid_moduloTipoDescripcionAsientoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloTipoDescripcionAsientoBusqueda")) {
				this.jButtonid_moduloTipoDescripcionAsientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDescripcionAsientoBusqueda")) {
				this.jButtoncodigoTipoDescripcionAsientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDescripcionAsientoBusqueda")) {
				this.jButtonnombreTipoDescripcionAsientoBusquedaActionPerformed(evt);
			}
			
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoDescripcionAsiento();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoDescripcionAsiento")) {
				closingInternalFrameTipoDescripcionAsiento();
				
			} else if(sTipo.equals("jButtonCancelarTipoDescripcionAsiento")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoDescripcionAsiento = (JInternalFrameBase)evt.getSource();
	            	
	            TipoDescripcionAsientoBeanSwingJInternalFrame jInternalFrameParent=(TipoDescripcionAsientoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDescripcionAsiento.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoDescripcionAsientoActionPerformed(null);
			}
			
			TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodescripcionasiento,new Object(),this.tipodescripcionasientoParameterGeneral,this.tipodescripcionasientoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoDescripcionAsiento(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoDescripcionAsiento(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoDescripcionAsiento(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipodescripcionasiento)) {
			if(!esControlTabla) {
				if(TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(this.tipodescripcionasiento,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);			
				}
				
				if(this.tipodescripcionasientoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoDescripcionAsiento(this.tipodescripcionasiento,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodescripcionasientoReturnGeneral=tipodescripcionasientoLogic.procesarEventosTipoDescripcionAsientosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodescripcionasientoLogic.getTipoDescripcionAsientos(),this.tipodescripcionasiento,this.tipodescripcionasientoParameterGeneral,this.isEsNuevoTipoDescripcionAsiento,classes);//this.tipodescripcionasientoLogic.getTipoDescripcionAsiento()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoDescripcionAsiento(this.tipodescripcionasientoReturnGeneral,this.tipodescripcionasientoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipodescripcionasientoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoDescripcionAsiento(classes,this.tipodescripcionasientoReturnGeneral,this.tipodescripcionasientoBean,false);
					}
						
					if(this.tipodescripcionasientoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoDescripcionAsiento(this.tipodescripcionasientoReturnGeneral.getTipoDescripcionAsiento());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoDescripcionAsiento(this.tipodescripcionasientoReturnGeneral.getTipoDescripcionAsiento());	
					}
						
					if(this.tipodescripcionasientoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoDescripcionAsiento(this.tipodescripcionasientoReturnGeneral.getTipoDescripcionAsiento(),classes);//this.tipodescripcionasientoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoDescripcionAsiento(this.tipodescripcionasiento,classes);//this.tipodescripcionasientoBean);									
				}
			
				if(TipoDescripcionAsientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoDescripcionAsiento(this.tipodescripcionasiento,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDescripcionAsiento(this.tipodescripcionasiento);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipodescripcionasientoAnterior!=null) {
						this.tipodescripcionasiento=this.tipodescripcionasientoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodescripcionasientoReturnGeneral=tipodescripcionasientoLogic.procesarEventosTipoDescripcionAsientosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodescripcionasientoLogic.getTipoDescripcionAsientos(),this.tipodescripcionasiento,this.tipodescripcionasientoParameterGeneral,this.isEsNuevoTipoDescripcionAsiento,classes);//this.tipodescripcionasientoLogic.getTipoDescripcionAsiento()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodescripcionasientoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipodescripcionasientoReturnGeneral.getTipoDescripcionAsiento(),tipodescripcionasientoLogic.getTipoDescripcionAsientos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipodescripcionasientoReturnGeneral.getTipoDescripcionAsiento(),this.tipodescripcionasientos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoDescripcionAsiento.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoDescripcionAsiento.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoDescripcionAsiento();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoDescripcionAsiento() throws Exception {
		
		TipoDescripcionAsientoModel tipodescripcionasientoModel=(TipoDescripcionAsientoModel)this.jTableDatosTipoDescripcionAsiento.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodescripcionasientoModel.tipodescripcionasientos=this.tipodescripcionasientoLogic.getTipoDescripcionAsientos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipodescripcionasientoModel.tipodescripcionasientos=this.tipodescripcionasientos;
		}
		
		
		((TipoDescripcionAsientoModel) this.jTableDatosTipoDescripcionAsiento.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoDescripcionAsiento() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipodescripcionasientoAnterior(),this.tipodescripcionasientoLogic.getTipoDescripcionAsientos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipodescripcionasientoAnterior(),this.tipodescripcionasientos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoDescripcionAsiento();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasiento,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
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
										
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodescripcionasiento,new Object(),generalEntityParameterGeneral,this.tipodescripcionasientoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipodescripcionasientoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoDescripcionAsientoConstantesFunciones.getClassesRelationshipsOfTipoDescripcionAsiento(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoDescripcionAsientoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoDescripcionAsiento(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoDescripcionAsiento(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodescripcionasiento,new Object(),generalEntityParameterGeneral,this.tipodescripcionasientoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoDescripcionAsiento(TipoDescripcionAsientoBean tipodescripcionasientoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoDescripcionAsiento(ArrayList<Classe> classes,TipoDescripcionAsientoReturnGeneral tipodescripcionasientoReturnGeneral,TipoDescripcionAsientoBean tipodescripcionasientoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasiento,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipodescripcionasiento)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento = new TipoDescripcionAsientoDetalleFormJInternalFrame(jDesktopPane,this.tipodescripcionasientoSessionBean.getConGuardarRelaciones(),this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDescripcionAsiento);
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.setVisible(false);
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.tipodescripcionasientoLogic=this.tipodescripcionasientoLogic;
		
		this.cargarCombosFrameForeignKeyTipoDescripcionAsiento("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDescripcionAsiento();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDescripcionAsiento();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoDescripcionAsiento("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoDescripcionAsiento();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDescripcionAsiento"));
		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonModificarTipoDescripcionAsiento.addActionListener(new ButtonActionListener(this,"ModificarTipoDescripcionAsiento"));

		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonModificarToolBarTipoDescripcionAsiento.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDescripcionAsiento"));
					
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jMenuItemModificarTipoDescripcionAsiento.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDescripcionAsiento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonActualizarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"ActualizarTipoDescripcionAsiento"));
		
		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonActualizarToolBarTipoDescripcionAsiento.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDescripcionAsiento"));
						
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jMenuItemActualizarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDescripcionAsiento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonEliminarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"EliminarTipoDescripcionAsiento"));
		
		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonEliminarToolBarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDescripcionAsiento"));
								
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jMenuItemEliminarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDescripcionAsiento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonCancelarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"CancelarTipoDescripcionAsiento"));
		
		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonCancelarToolBarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDescripcionAsiento"));
					
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jMenuItemCancelarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDescripcionAsiento"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jMenuItemDetalleCerrarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDescripcionAsiento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonGuardarCambiosToolBarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDescripcionAsiento"));
		
		
		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonGuardarCambiosToolBarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDescripcionAsiento"));
		
		
		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDescripcionAsiento"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonidTipoDescripcionAsientoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDescripcionAsientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonid_empresaTipoDescripcionAsientoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDescripcionAsientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonid_empresaTipoDescripcionAsientoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDescripcionAsientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonid_moduloTipoDescripcionAsientoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTipoDescripcionAsientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonid_moduloTipoDescripcionAsientoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTipoDescripcionAsientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtoncodigoTipoDescripcionAsientoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDescripcionAsientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonnombreTipoDescripcionAsientoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDescripcionAsientoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTabbedPaneRelacionesTipoDescripcionAsiento.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDescripcionAsiento"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoDescripcionAsiento"));
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDescripcionAsiento"));
		}
		
		this.jTableDatosTipoDescripcionAsiento.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoDescripcionAsiento"));
		
		this.jTableDatosTipoDescripcionAsiento.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoDescripcionAsiento"));
		
		this.jButtonNuevoTipoDescripcionAsiento.addActionListener(new ButtonActionListener(this,"NuevoTipoDescripcionAsiento"));
		
		this.jButtonDuplicarTipoDescripcionAsiento.addActionListener(new ButtonActionListener(this,"DuplicarTipoDescripcionAsiento"));
		
		this.jButtonCopiarTipoDescripcionAsiento.addActionListener(new ButtonActionListener(this,"CopiarTipoDescripcionAsiento"));
		
		this.jButtonVerFormTipoDescripcionAsiento.addActionListener(new ButtonActionListener(this,"VerFormTipoDescripcionAsiento"));
		
		
		this.jButtonNuevoToolBarTipoDescripcionAsiento.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoDescripcionAsiento"));
			
		this.jButtonDuplicarToolBarTipoDescripcionAsiento.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoDescripcionAsiento"));
			
		this.jMenuItemNuevoTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoDescripcionAsiento"));
			
		this.jMenuItemDuplicarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoDescripcionAsiento"));		
		
		
		this.jButtonNuevoRelacionesTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoDescripcionAsiento"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoDescripcionAsiento.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoDescripcionAsiento"));
			
		this.jMenuItemNuevoRelacionesTipoDescripcionAsiento.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoDescripcionAsiento"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonModificarTipoDescripcionAsiento.addActionListener(new ButtonActionListener(this,"ModificarTipoDescripcionAsiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonModificarToolBarTipoDescripcionAsiento.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDescripcionAsiento"));
			
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jMenuItemModificarTipoDescripcionAsiento.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDescripcionAsiento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonActualizarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"ActualizarTipoDescripcionAsiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonActualizarToolBarTipoDescripcionAsiento.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDescripcionAsiento"));
				
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jMenuItemActualizarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDescripcionAsiento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonEliminarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"EliminarTipoDescripcionAsiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonEliminarToolBarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDescripcionAsiento"));
						
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jMenuItemEliminarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDescripcionAsiento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonCancelarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"CancelarTipoDescripcionAsiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonCancelarToolBarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDescripcionAsiento"));
			
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jMenuItemCancelarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDescripcionAsiento"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoDescripcionAsiento"));		
		
		
		this.jButtonCerrarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"CerrarTipoDescripcionAsiento"));
		
		
		this.jButtonCerrarToolBarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoDescripcionAsiento"));
			
		this.jMenuItemCerrarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoDescripcionAsiento"));
			
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jMenuItemDetalleCerrarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDescripcionAsiento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonGuardarCambiosTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoDescripcionAsiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonGuardarCambiosToolBarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDescripcionAsiento"));
		}
		
		this.jButtonCopiarToolBarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoDescripcionAsiento"));
			
		this.jButtonVerFormToolBarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoDescripcionAsiento"));
		
		this.jMenuItemGuardarCambiosTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoDescripcionAsiento"));
			
		this.jMenuItemCopiarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoDescripcionAsiento"));		
		
		this.jMenuItemVerFormTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoDescripcionAsiento"));		
		
		
		this.jButtonGuardarCambiosTablaTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDescripcionAsiento"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoDescripcionAsiento"));
			
		this.jMenuItemGuardarCambiosTablaTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDescripcionAsiento"));		
		
		
		
		this.jButtonRecargarInformacionTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoDescripcionAsiento"));
					
		this.jButtonRecargarInformacionToolBarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoDescripcionAsiento"));
		
		this.jMenuItemRecargarInformacionTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoDescripcionAsiento"));		
		
		
		
		this.jButtonAnterioresTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"AnterioresTipoDescripcionAsiento"));
		
		
		this.jButtonAnterioresToolBarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoDescripcionAsiento"));
		
		this.jMenuItemAnterioresTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoDescripcionAsiento"));		
		
		
		this.jButtonSiguientesTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"SiguientesTipoDescripcionAsiento"));
		
		
		this.jButtonSiguientesToolBarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoDescripcionAsiento"));
			
		this.jMenuItemSiguientesTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoDescripcionAsiento"));
			
		this.jMenuItemAbrirOrderByTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoDescripcionAsiento"));
			
		this.jMenuItemMostrarOcultarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoDescripcionAsiento"));
			
		this.jMenuItemDetalleAbrirOrderByTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoDescripcionAsiento"));
			
		this.jMenuItemDetalleMostarOcultarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoDescripcionAsiento"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoDescripcionAsiento"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoDescripcionAsiento"));
			
		this.jMenuItemNuevoGuardarCambiosTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoDescripcionAsiento"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoDescripcionAsiento.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoDescripcionAsiento"));

		this.jCheckBoxSeleccionadosTipoDescripcionAsiento.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoDescripcionAsiento"));
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDescripcionAsiento"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoDescripcionAsiento"));
			
		this.jComboBoxTiposAccionesTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoDescripcionAsiento"));
					
		this.jComboBoxTiposSeleccionarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoDescripcionAsiento"));
			
		this.jTextFieldValorCampoGeneralTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoDescripcionAsiento"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonidTipoDescripcionAsientoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDescripcionAsientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonid_empresaTipoDescripcionAsientoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDescripcionAsientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonid_empresaTipoDescripcionAsientoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDescripcionAsientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonid_moduloTipoDescripcionAsientoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTipoDescripcionAsientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonid_moduloTipoDescripcionAsientoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTipoDescripcionAsientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtoncodigoTipoDescripcionAsientoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDescripcionAsientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonnombreTipoDescripcionAsientoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDescripcionAsientoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdModuloTipoDescripcionAsiento.addActionListener(new ButtonActionListener(this,"FK_IdModuloTipoDescripcionAsiento"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoDescripcionAsiento!=null) {
				this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDescripcionAsiento"));
				this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDescripcionAsiento"));
				this.jInternalFrameReporteDinamicoTipoDescripcionAsiento.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDescripcionAsiento"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDescripcionAsiento"));				
			//this.jButtonGenerarReporteDinamicoTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDescripcionAsiento"));
			//this.jButtonGenerarExcelReporteDinamicoTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDescripcionAsiento"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoDescripcionAsiento!=null) {
				this.jInternalFrameImportacionTipoDescripcionAsiento.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDescripcionAsiento"));
				this.jInternalFrameImportacionTipoDescripcionAsiento.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDescripcionAsiento"));
				this.jInternalFrameImportacionTipoDescripcionAsiento.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDescripcionAsiento"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoDescripcionAsiento"));
			
			this.jButtonAbrirOrderByToolBarTipoDescripcionAsiento.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoDescripcionAsiento"));			
			
			if(this.jInternalFrameOrderByTipoDescripcionAsiento!=null) {
				this.jInternalFrameOrderByTipoDescripcionAsiento.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDescripcionAsiento"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTabbedPaneRelacionesTipoDescripcionAsiento.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDescripcionAsiento"));
		
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
            		closingInternalFrameTipoDescripcionAsiento();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoDescripcionAsiento = (JInternalFrameBase)event.getSource();
	            	
	            TipoDescripcionAsientoBeanSwingJInternalFrame jInternalFrameParent=(TipoDescripcionAsientoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDescripcionAsiento.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoDescripcionAsientoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoDescripcionAsiento.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoDescripcionAsientoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoDescripcionAsiento.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoDescripcionAsiento.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDescripcionAsientoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDescripcionAsientoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDescripcionAsientoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoDescripcionAsiento";
		inputMap = this.jButtonNuevoTipoDescripcionAsiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoDescripcionAsiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDescripcionAsientoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDescripcionAsientoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDescripcionAsientoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDescripcionAsientoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoDescripcionAsiento";
		inputMap = this.jButtonNuevoRelacionesTipoDescripcionAsiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoDescripcionAsiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDescripcionAsientoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoDescripcionAsiento";
		inputMap = this.jButtonModificarTipoDescripcionAsiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoDescripcionAsiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoDescripcionAsientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoDescripcionAsiento";
		inputMap = this.jButtonActualizarTipoDescripcionAsiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoDescripcionAsiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoDescripcionAsientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoDescripcionAsiento";
		inputMap = this.jButtonEliminarTipoDescripcionAsiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoDescripcionAsiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoDescripcionAsientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoDescripcionAsiento";
		inputMap = this.jButtonCancelarTipoDescripcionAsiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoDescripcionAsiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoDescripcionAsientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoDescripcionAsiento";
		inputMap = this.jButtonCerrarTipoDescripcionAsiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoDescripcionAsiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoDescripcionAsientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonGuardarCambiosTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoDescripcionAsiento";
		inputMap = this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonGuardarCambiosTipoDescripcionAsiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonGuardarCambiosTipoDescripcionAsiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoDescripcionAsiento.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoDescripcionAsientoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoDescripcionAsiento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoDescripcionAsientoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoDescripcionAsiento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoDescripcionAsientoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoDescripcionAsiento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoDescripcionAsientoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonidTipoDescripcionAsientoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDescripcionAsientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonid_empresaTipoDescripcionAsientoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDescripcionAsientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonid_empresaTipoDescripcionAsientoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDescripcionAsientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonid_moduloTipoDescripcionAsientoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTipoDescripcionAsientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonid_moduloTipoDescripcionAsientoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTipoDescripcionAsientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtoncodigoTipoDescripcionAsientoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDescripcionAsientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jButtonnombreTipoDescripcionAsientoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDescripcionAsientoBusqueda"));
		
		
		this.jButtonFK_IdModuloTipoDescripcionAsiento.addActionListener(new ButtonActionListener(this,"FK_IdModuloTipoDescripcionAsiento"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoDescripcionAsiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoDescripcionAsientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoDescripcionAsientoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoDescripcionAsiento.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoDescripcionAsiento(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoDescripcionAsiento tipodescripcionasientoAux:this.tipodescripcionasientoLogic.getTipoDescripcionAsientos()) {
					tipodescripcionasientoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDescripcionAsiento tipodescripcionasientoAux:tipodescripcionasientos) {
					tipodescripcionasientoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoDescripcionAsientoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDescripcionAsiento(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDescripcionAsiento tipodescripcionasientoAux:this.tipodescripcionasientoLogic.getTipoDescripcionAsientos()) {
						tipodescripcionasientoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDescripcionAsiento tipodescripcionasientoAux:tipodescripcionasientos) {
						tipodescripcionasientoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoDescripcionAsiento tipodescripcionasientoAux:this.tipodescripcionasientoLogic.getTipoDescripcionAsientos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDescripcionAsiento tipodescripcionasientoAux:tipodescripcionasientos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDescripcionAsiento(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDescripcionAsiento.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDescripcionAsiento.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDescripcionAsiento,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoDescripcionAsientoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDescripcionAsiento(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoDescripcionAsiento.getSelectedRows();
			
			TipoDescripcionAsiento tipodescripcionasientoLocal=new TipoDescripcionAsiento();
			
			//this.seleccionarTodosTipoDescripcionAsiento(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodescripcionasientoLocal =(TipoDescripcionAsiento) this.tipodescripcionasientoLogic.getTipoDescripcionAsientos().toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipodescripcionasientoLocal =(TipoDescripcionAsiento) this.tipodescripcionasientos.toArray()[this.jTableDatosTipoDescripcionAsiento.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipodescripcionasientoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDescripcionAsiento tipodescripcionasientoAux:this.tipodescripcionasientoLogic.getTipoDescripcionAsientos()) {
						tipodescripcionasientoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDescripcionAsiento tipodescripcionasientoAux:tipodescripcionasientos) {
						tipodescripcionasientoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoDescripcionAsiento(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDescripcionAsiento.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDescripcionAsiento.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDescripcionAsiento,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoDescripcionAsientoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoDescripcionAsientoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoDescripcionAsientoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoDescripcionAsiento(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoDescripcionAsiento.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDescripcionAsiento tipodescripcionasientoAux:this.tipodescripcionasientoLogic.getTipoDescripcionAsientos()) {
				
						if(sTipoSeleccionar.equals(TipoDescripcionAsientoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodescripcionasientoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDescripcionAsientoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodescripcionasientoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDescripcionAsiento tipodescripcionasientoAux:tipodescripcionasientos) {
					
						if(sTipoSeleccionar.equals(TipoDescripcionAsientoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodescripcionasientoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDescripcionAsientoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodescripcionasientoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDescripcionAsiento(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoDescripcionAsientoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoDescripcionAsiento(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoDescripcionAsiento=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoDescripcionAsiento.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoDescripcionAsiento) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoDescripcionAsiento(conSplash);
				
					this.generarReporteTipoDescripcionAsientosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDescripcionAsiento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoDescripcionAsientosSeleccionados();
				//this.jComboBoxTiposAccionesTipoDescripcionAsiento.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDescripcionAsientosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoDescripcionAsiento.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDescripcionAsientosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoDescripcionAsiento.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDescripcionAsiento();
				
				this.exportarTipoDescripcionAsientosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDescripcionAsiento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoDescripcionAsientos();
				//this.importarTipoDescripcionAsientos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDescripcionAsiento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDescripcionAsiento();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoDescripcionAsientosSeleccionados();
				//this.jComboBoxTiposAccionesTipoDescripcionAsiento.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Descripcion Asiento Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoDescripcionAsiento();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoDescripcionAsiento)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoDescripcionAsiento(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Descripcion Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDescripcionAsiento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoDescripcionAsientoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoDescripcionAsiento) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoDescripcionAsiento(conSplash);
					
						//this.actualizarParametrosGeneralTipoDescripcionAsiento();
						
						this.generarReporteProcesoAccionTipoDescripcionAsientosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoDescripcionAsiento.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Descripcion Asiento ContableS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Descripcion Asiento Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoDescripcionAsiento();
				
						this.actualizarParametrosGeneralTipoDescripcionAsiento();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipodescripcionasientoReturnGeneral=tipodescripcionasientoLogic.procesarAccionTipoDescripcionAsientosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipodescripcionasientoLogic.getTipoDescripcionAsientos(),this.tipodescripcionasientoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoDescripcionAsientoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoDescripcionAsiento.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoDescripcionAsiento();
					
					TipoDescripcionAsientoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoDescripcionAsientoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoDescripcionAsiento.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoDescripcionAsiento(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoDescripcionAsientoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoDescripcionAsiento();
			
			if(this.jInternalFrameDetalleFormTipoDescripcionAsiento==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoDescripcionAsiento> tipodescripcionasientosSeleccionados=new ArrayList<TipoDescripcionAsiento>();		
			TipoDescripcionAsiento tipodescripcionasiento=new TipoDescripcionAsiento();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoDescripcionAsiento(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoDescripcionAsiento.getSelectedItem();
			
			
			
			
			tipodescripcionasientosSeleccionados=this.getTipoDescripcionAsientosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipodescripcionasientosSeleccionados.size()==1) {
				for(TipoDescripcionAsiento tipodescripcionasientoAux:tipodescripcionasientosSeleccionados) {
					tipodescripcionasiento=tipodescripcionasientoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoDescripcionAsiento();
			
      		//this.finishProcessTipoDescripcionAsiento(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoDescripcionAsientoReturnGeneral() throws Exception {
		if(this.tipodescripcionasientoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipodescripcionasientoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipodescripcionasientoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipodescripcionasientoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipodescripcionasientoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipodescripcionasientoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoDescripcionAsiento(false);
		}
		
		if(this.tipodescripcionasientoReturnGeneral.getConRetornoLista() || this.tipodescripcionasientoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipodescripcionasientoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodescripcionasientoLogic.setTipoDescripcionAsientos(this.tipodescripcionasientoReturnGeneral.getTipoDescripcionAsientos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipodescripcionasientoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodescripcionasientoLogic.setTipoDescripcionAsiento(this.tipodescripcionasientoReturnGeneral.getTipoDescripcionAsiento());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoDescripcionAsiento(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoDescripcionAsiento() throws Exception {
		
		
	}
	
	public ArrayList<TipoDescripcionAsiento> getTipoDescripcionAsientosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoDescripcionAsiento> tipodescripcionasientosSeleccionados=new ArrayList<TipoDescripcionAsiento>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoDescripcionAsiento) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoDescripcionAsiento tipodescripcionasientoAux:tipodescripcionasientoLogic.getTipoDescripcionAsientos()) {
					if(tipodescripcionasientoAux.getIsSelected()) {
						tipodescripcionasientosSeleccionados.add(tipodescripcionasientoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDescripcionAsiento tipodescripcionasientoAux:this.tipodescripcionasientos) {
					if(tipodescripcionasientoAux.getIsSelected()) {
						tipodescripcionasientosSeleccionados.add(tipodescripcionasientoAux);				
					}
				}
			}
			
			if(tipodescripcionasientosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipodescripcionasientosSeleccionados.addAll(this.tipodescripcionasientoLogic.getTipoDescripcionAsientos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipodescripcionasientosSeleccionados.addAll(this.tipodescripcionasientos);				
					}
				}
			}
		} else {
			tipodescripcionasientosSeleccionados.add(this.tipodescripcionasiento);
		}
		
		return tipodescripcionasientosSeleccionados;
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
	
	public void generarReporteTipoDescripcionAsientosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoDescripcionAsientosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoDescripcionAsientosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDescripcionAsientosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDescripcionAsientosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Descripcion Asiento Contable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoDescripcionAsientosSeleccionados() throws Exception {
		ArrayList<TipoDescripcionAsiento> tipodescripcionasientosSeleccionados=new ArrayList<TipoDescripcionAsiento>();		
		
		tipodescripcionasientosSeleccionados=this.getTipoDescripcionAsientosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoDescripcionAsientos("Todos",tipodescripcionasientosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoDescripcionAsientosSeleccionados() throws Exception {
		ArrayList<TipoDescripcionAsiento> tipodescripcionasientosSeleccionados=new ArrayList<TipoDescripcionAsiento>();		
		
		tipodescripcionasientosSeleccionados=this.getTipoDescripcionAsientosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoDescripcionAsientos("Todos",tipodescripcionasientosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoDescripcionAsientosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoDescripcionAsiento> tipodescripcionasientosSeleccionados=new ArrayList<TipoDescripcionAsiento>();
		
		tipodescripcionasientosSeleccionados=this.getTipoDescripcionAsientosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoDescripcionAsientos("Todos",tipodescripcionasientosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoDescripcionAsientosSeleccionados() throws Exception {
		ArrayList<TipoDescripcionAsiento> tipodescripcionasientosSeleccionados=new ArrayList<TipoDescripcionAsiento>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoDescripcionAsiento();
		
		
		tipodescripcionasientosSeleccionados=this.getTipoDescripcionAsientosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoDescripcionAsiento();
		
		
		//this.generarReporteTipoDescripcionAsientos("Todos",tipodescripcionasientosSeleccionados ,tipodescripcionasientoImplementable,tipodescripcionasientoImplementableHome);
	}
	
	public void mostrarImportacionTipoDescripcionAsientos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoDescripcionAsiento();
		
		this.abrirFrameImportacionTipoDescripcionAsiento();		
		
			
		//this.generarReporteTipoDescripcionAsientos("Todos",tipodescripcionasientosSeleccionados ,tipodescripcionasientoImplementable,tipodescripcionasientoImplementableHome);
	}
	
	public void importarTipoDescripcionAsientos() throws Exception {		
	
	}
	
	public void exportarTipoDescripcionAsientosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoDescripcionAsientosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoDescripcionAsientosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoDescripcionAsientosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Descripcion Asiento Contable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoDescripcionAsientosSeleccionados() throws Exception {
		ArrayList<TipoDescripcionAsiento> tipodescripcionasientosSeleccionados=new ArrayList<TipoDescripcionAsiento>();		
		
		tipodescripcionasientosSeleccionados=this.getTipoDescripcionAsientosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodescripcionasiento."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoDescripcionAsiento(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoDescripcionAsiento tipodescripcionasientoAux:tipodescripcionasientosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoDescripcionAsiento(tipodescripcionasientoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipodescripcionasientoAux.setsDetalleGeneralEntityReporte(tipodescripcionasientoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Descripcion Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoDescripcionAsiento(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoDescripcionAsientoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDescripcionAsientoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDescripcionAsientoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDescripcionAsientoConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDescripcionAsientoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDescripcionAsientoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasiento,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipodescripcionasiento.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodescripcionasiento.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodescripcionasiento.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodescripcionasiento.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodescripcionasiento.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodescripcionasiento.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoDescripcionAsientosSeleccionados() throws Exception {
		ArrayList<TipoDescripcionAsiento> tipodescripcionasientosSeleccionados=new ArrayList<TipoDescripcionAsiento>();		
		
		tipodescripcionasientosSeleccionados=this.getTipoDescripcionAsientosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodescripcionasiento.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoDescripcionAsientos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoDescripcionAsiento(row);				
				iRow++;
			}				
			
			for(TipoDescripcionAsiento tipodescripcionasientoAux:tipodescripcionasientosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoDescripcionAsiento(tipodescripcionasientoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Descripcion Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoDescripcionAsientosSeleccionados() throws Exception {
		ArrayList<TipoDescripcionAsiento> tipodescripcionasientosSeleccionados=new ArrayList<TipoDescripcionAsiento>();		
		
		tipodescripcionasientosSeleccionados=this.getTipoDescripcionAsientosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodescripcionasiento.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipodescripcionasientos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipodescripcionasiento");
			//elementRoot.appendChild(element);
		
			for(TipoDescripcionAsiento tipodescripcionasientoAux:tipodescripcionasientosSeleccionados) {
				element = document.createElement("tipodescripcionasiento");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoDescripcionAsiento(tipodescripcionasientoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Descripcion Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoDescripcionAsiento(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDescripcionAsientoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDescripcionAsientoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoDescripcionAsientoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDescripcionAsientoConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDescripcionAsientoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDescripcionAsientoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasiento,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipodescripcionasiento.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodescripcionasiento.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodescripcionasiento.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodescripcionasiento.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodescripcionasiento.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoDescripcionAsiento(TipoDescripcionAsiento tipodescripcionasiento,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoDescripcionAsientoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipodescripcionasiento.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoDescripcionAsientoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipodescripcionasiento.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoDescripcionAsientoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipodescripcionasiento.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementmodulo_descripcion = document.createElement(TipoDescripcionAsientoConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(tipodescripcionasiento.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementcodigo = document.createElement(TipoDescripcionAsientoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipodescripcionasiento.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoDescripcionAsientoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipodescripcionasiento.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoDescripcionAsientosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoDescripcionAsiento> tipodescripcionasientosSeleccionados=new ArrayList<TipoDescripcionAsiento>();
		
		tipodescripcionasientosSeleccionados=this.getTipoDescripcionAsientosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoDescripcionAsiento(tipodescripcionasientosSeleccionados);
		
		this.generarReporteTipoDescripcionAsientos("Todos",tipodescripcionasientosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoDescripcionAsiento(ArrayList<TipoDescripcionAsiento> tipodescripcionasientosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoDescripcionAsiento tipodescripcionasientoAux:tipodescripcionasientosSeleccionados) {
				tipodescripcionasientoAux.setsDetalleGeneralEntityReporte(tipodescripcionasientoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoDescripcionAsientoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipodescripcionasientoAux.setsDescripcionGeneralEntityReporte1(tipodescripcionasientoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoDescripcionAsientoConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					tipodescripcionasientoAux.setsDescripcionGeneralEntityReporte1(tipodescripcionasientoAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoDescripcionAsientoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipodescripcionasientoAux.setsDescripcionGeneralEntityReporte1(tipodescripcionasientoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoDescripcionAsientoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipodescripcionasientoAux.setsDescripcionGeneralEntityReporte1(tipodescripcionasientoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDescripcionAsientoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoDescripcionAsiento(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoDescripcionAsiento=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento=true;
				this.isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento=true;
			}
			
			this.isVisibilidadCeldaModificarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaActualizarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaEliminarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaCancelarTipoDescripcionAsiento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDescripcionAsiento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDescripcionAsiento=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaModificarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaActualizarTipoDescripcionAsiento=true;
			this.isVisibilidadCeldaEliminarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaCancelarTipoDescripcionAsiento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDescripcionAsiento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDescripcionAsiento=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaModificarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaActualizarTipoDescripcionAsiento=true;
			this.isVisibilidadCeldaEliminarTipoDescripcionAsiento=true;
			this.isVisibilidadCeldaCancelarTipoDescripcionAsiento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDescripcionAsiento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDescripcionAsiento=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaModificarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaActualizarTipoDescripcionAsiento=true;
			this.isVisibilidadCeldaEliminarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaCancelarTipoDescripcionAsiento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDescripcionAsiento=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDescripcionAsiento=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoDescripcionAsiento=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento=true;
			this.isVisibilidadCeldaModificarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaActualizarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaEliminarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaCancelarTipoDescripcionAsiento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDescripcionAsiento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDescripcionAsiento=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaActualizarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaEliminarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaCancelarTipoDescripcionAsiento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDescripcionAsiento=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDescripcionAsiento=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaModificarTipoDescripcionAsiento=true;
			this.isVisibilidadCeldaActualizarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaEliminarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaCancelarTipoDescripcionAsiento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDescripcionAsiento=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDescripcionAsiento=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoDescripcionAsientoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoDescripcionAsiento=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento=true;
		} else {
			this.actualizarEstadoPanelsTipoDescripcionAsiento(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoDescripcionAsiento=false;
			//this.isVisibilidadCeldaVerFormTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaDuplicarTipoDescripcionAsiento=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipodescripcionasientoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDescripcionAsiento=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
			if(!tipodescripcionasientoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento=false;												
			}
			
			this.jButtonCerrarTipoDescripcionAsiento.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDescripcionAsiento=false;
		}
		
		if(!this.permiteMantenimiento(this.tipodescripcionasiento)) {
			this.isVisibilidadCeldaActualizarTipoDescripcionAsiento=false;
			this.isVisibilidadCeldaEliminarTipoDescripcionAsiento=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDescripcionAsiento() {
	}
	
	public void actualizarEstadoPanelsTipoDescripcionAsiento(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoDescripcionAsiento!=null) {
				this.jScrollPanelDatosEdicionTipoDescripcionAsiento.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDescripcionAsiento!=null) {
				this.jTabbedPaneBusquedasTipoDescripcionAsiento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDescripcionAsiento!=null) {
				this.jScrollPanelDatosTipoDescripcionAsiento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDescripcionAsiento!=null) {
				this.jPanelPaginacionTipoDescripcionAsiento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDescripcionAsiento!=null) {
				this.jPanelParametrosReportesTipoDescripcionAsiento.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoDescripcionAsiento!=null) {
				this.jScrollPanelDatosEdicionTipoDescripcionAsiento.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDescripcionAsiento!=null) {
				this.jTabbedPaneBusquedasTipoDescripcionAsiento.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoDescripcionAsiento!=null) {
				this.jScrollPanelDatosTipoDescripcionAsiento.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDescripcionAsiento!=null) {
				this.jPanelPaginacionTipoDescripcionAsiento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDescripcionAsiento!=null) {
				this.jPanelParametrosReportesTipoDescripcionAsiento.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoDescripcionAsiento!=null) {
				this.jScrollPanelDatosEdicionTipoDescripcionAsiento.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDescripcionAsiento!=null) {
				this.jTabbedPaneBusquedasTipoDescripcionAsiento.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDescripcionAsiento!=null) {
				this.jScrollPanelDatosTipoDescripcionAsiento.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDescripcionAsiento!=null) {
				this.jPanelPaginacionTipoDescripcionAsiento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDescripcionAsiento!=null) {
				this.jPanelParametrosReportesTipoDescripcionAsiento.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoDescripcionAsiento!=null) {
				this.jScrollPanelDatosEdicionTipoDescripcionAsiento.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDescripcionAsiento!=null) {
				this.jTabbedPaneBusquedasTipoDescripcionAsiento.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDescripcionAsiento!=null) {
				this.jScrollPanelDatosTipoDescripcionAsiento.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDescripcionAsiento!=null) {
				this.jPanelPaginacionTipoDescripcionAsiento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDescripcionAsiento!=null) {
				this.jPanelParametrosReportesTipoDescripcionAsiento.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoDescripcionAsiento!=null) {
				this.jScrollPanelDatosEdicionTipoDescripcionAsiento.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDescripcionAsiento!=null) {
				this.jTabbedPaneBusquedasTipoDescripcionAsiento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDescripcionAsiento!=null) {
				this.jScrollPanelDatosTipoDescripcionAsiento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDescripcionAsiento!=null) {
				this.jPanelPaginacionTipoDescripcionAsiento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDescripcionAsiento!=null) {
				this.jPanelParametrosReportesTipoDescripcionAsiento.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoDescripcionAsiento!=null) {
				this.jScrollPanelDatosEdicionTipoDescripcionAsiento.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDescripcionAsiento!=null) {
				this.jTabbedPaneBusquedasTipoDescripcionAsiento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDescripcionAsiento!=null) {
				this.jScrollPanelDatosTipoDescripcionAsiento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDescripcionAsiento!=null) {
				this.jPanelPaginacionTipoDescripcionAsiento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDescripcionAsiento!=null) {
				this.jPanelParametrosReportesTipoDescripcionAsiento.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoDescripcionAsiento!=null) {
				this.jScrollPanelDatosEdicionTipoDescripcionAsiento.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDescripcionAsiento!=null) {
				this.jTabbedPaneBusquedasTipoDescripcionAsiento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDescripcionAsiento!=null) {
				this.jScrollPanelDatosTipoDescripcionAsiento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDescripcionAsiento!=null) {
				this.jPanelPaginacionTipoDescripcionAsiento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDescripcionAsiento!=null) {
				this.jPanelParametrosReportesTipoDescripcionAsiento.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoDescripcionAsiento!=null) {
					this.jTabbedPaneBusquedasTipoDescripcionAsiento.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoDescripcionAsiento!=null) {
				this.jPanelParametrosReportesTipoDescripcionAsiento.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDescripcionAsiento!=null) {
				this.jTabbedPaneBusquedasTipoDescripcionAsiento.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoDescripcionAsiento!=null) {
				this.jPanelParametrosReportesTipoDescripcionAsiento.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdModulo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasTipoDescripcionAsiento.remove(jPanelFK_IdModuloTipoDescripcionAsiento);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadFK_IdModulo=isParaModulo;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasTipoDescripcionAsiento.remove(jPanelFK_IdModuloTipoDescripcionAsiento);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoDescripcionAsientoSessionBean tipodescripcionasientoSessionBean=new TipoDescripcionAsientoSessionBean();
		
		if(this.tipodescripcionasientoSessionBean==null) {
			this.tipodescripcionasientoSessionBean=new TipoDescripcionAsientoSessionBean();
		}
		
		this.tipodescripcionasientoSessionBean.setsUltimaBusquedaTipoDescripcionAsiento(this.getsAccionBusqueda());
		this.tipodescripcionasientoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipodescripcionasientoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipodescripcionasientoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			tipodescripcionasientoSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoDescripcionAsientoSessionBean tipodescripcionasientoSessionBean=new TipoDescripcionAsientoSessionBean();
		
		if(this.tipodescripcionasientoSessionBean==null) {
			this.tipodescripcionasientoSessionBean=new TipoDescripcionAsientoSessionBean();
		}
		
		if(this.tipodescripcionasientoSessionBean.getsUltimaBusquedaTipoDescripcionAsiento()!=null&&!this.tipodescripcionasientoSessionBean.getsUltimaBusquedaTipoDescripcionAsiento().equals("")) {
			this.setsAccionBusqueda(tipodescripcionasientoSessionBean.getsUltimaBusquedaTipoDescripcionAsiento());
			this.setiNumeroPaginacion(tipodescripcionasientoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipodescripcionasientoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipodescripcionasientoSessionBean.getid_empresa());
				tipodescripcionasientoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(tipodescripcionasientoSessionBean.getid_modulo());
				tipodescripcionasientoSessionBean.setid_modulo(-1L);
			}
		}
		
		this.tipodescripcionasientoSessionBean.setsUltimaBusquedaTipoDescripcionAsiento("");
		this.tipodescripcionasientoSessionBean.setiNumeroPaginacion(TipoDescripcionAsientoConstantesFunciones.INUMEROPAGINACION);
		this.tipodescripcionasientoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoDescripcionAsiento(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoDescripcionAsiento() {
		this.updateBorderResaltarBusquedasFormularioTipoDescripcionAsiento();
		this.updateVisibilidadBusquedasFormularioTipoDescripcionAsiento();
		this.updateHabilitarBusquedasFormularioTipoDescripcionAsiento();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoDescripcionAsiento() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoDescripcionAsiento.getComponents().length>0) {
	

		if(this.tipodescripcionasientoConstantesFunciones.resaltarFK_IdModuloTipoDescripcionAsiento!=null) {
			index= this.jTabbedPaneBusquedasTipoDescripcionAsiento.indexOfComponent(this.jPanelFK_IdModuloTipoDescripcionAsiento);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDescripcionAsiento.getComponent(index);
				jPanel.setBorder(this.tipodescripcionasientoConstantesFunciones.resaltarFK_IdModuloTipoDescripcionAsiento);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoDescripcionAsiento() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoDescripcionAsiento.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDescripcionAsiento.indexOfComponent(this.jPanelFK_IdModuloTipoDescripcionAsiento);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDescripcionAsiento.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodescripcionasientoConstantesFunciones.mostrarFK_IdModuloTipoDescripcionAsiento);
			if(!this.tipodescripcionasientoConstantesFunciones.mostrarFK_IdModuloTipoDescripcionAsiento && index>-1) {
				this.jTabbedPaneBusquedasTipoDescripcionAsiento.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoDescripcionAsiento() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoDescripcionAsiento.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDescripcionAsiento.indexOfComponent(this.jPanelFK_IdModuloTipoDescripcionAsiento);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDescripcionAsiento.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodescripcionasientoConstantesFunciones.activarFK_IdModuloTipoDescripcionAsiento);
				this.jTabbedPaneBusquedasTipoDescripcionAsiento.setEnabledAt(index,this.tipodescripcionasientoConstantesFunciones.activarFK_IdModuloTipoDescripcionAsiento);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoDescripcionAsiento(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdModulo")) {
			index= this.jTabbedPaneBusquedasTipoDescripcionAsiento.indexOfComponent(this.jPanelFK_IdModuloTipoDescripcionAsiento);

			this.jTabbedPaneBusquedasTipoDescripcionAsiento.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDescripcionAsiento.getComponent(index);

			this.tipodescripcionasientoConstantesFunciones.setResaltarFK_IdModuloTipoDescripcionAsiento(resaltar);

			jPanel.setBorder(this.tipodescripcionasientoConstantesFunciones.resaltarFK_IdModuloTipoDescripcionAsiento);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoDescripcionAsiento.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoDescripcionAsiento() throws Exception {

		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoDescripcionAsiento();
		this.updateVisibilidadResaltarControlesFormularioTipoDescripcionAsiento();
		this.updateHabilitarResaltarControlesFormularioTipoDescripcionAsiento();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoDescripcionAsiento() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipodescripcionasientoConstantesFunciones.resaltaridTipoDescripcionAsiento!=null && this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelidTipoDescripcionAsiento.setBorder(this.tipodescripcionasientoConstantesFunciones.resaltaridTipoDescripcionAsiento);}
		if(this.tipodescripcionasientoConstantesFunciones.resaltarid_empresaTipoDescripcionAsiento!=null && this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_empresaTipoDescripcionAsiento.setBorder(this.tipodescripcionasientoConstantesFunciones.resaltarid_empresaTipoDescripcionAsiento);}
		if(this.tipodescripcionasientoConstantesFunciones.resaltarid_moduloTipoDescripcionAsiento!=null && this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_moduloTipoDescripcionAsiento.setBorder(this.tipodescripcionasientoConstantesFunciones.resaltarid_moduloTipoDescripcionAsiento);}
		if(this.tipodescripcionasientoConstantesFunciones.resaltarcodigoTipoDescripcionAsiento!=null && this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTextFieldcodigoTipoDescripcionAsiento.setBorder(this.tipodescripcionasientoConstantesFunciones.resaltarcodigoTipoDescripcionAsiento);}
		if(this.tipodescripcionasientoConstantesFunciones.resaltarnombreTipoDescripcionAsiento!=null && this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTextAreanombreTipoDescripcionAsiento.setBorder(this.tipodescripcionasientoConstantesFunciones.resaltarnombreTipoDescripcionAsiento);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoDescripcionAsiento() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
	
		//this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelidTipoDescripcionAsiento.setVisible(this.tipodescripcionasientoConstantesFunciones.mostraridTipoDescripcionAsiento);
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jPanelidTipoDescripcionAsiento.setVisible(this.tipodescripcionasientoConstantesFunciones.mostraridTipoDescripcionAsiento);
		//this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_empresaTipoDescripcionAsiento.setVisible(this.tipodescripcionasientoConstantesFunciones.mostrarid_empresaTipoDescripcionAsiento);
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jPanelid_empresaTipoDescripcionAsiento.setVisible(this.tipodescripcionasientoConstantesFunciones.mostrarid_empresaTipoDescripcionAsiento);
		//this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_moduloTipoDescripcionAsiento.setVisible(this.tipodescripcionasientoConstantesFunciones.mostrarid_moduloTipoDescripcionAsiento);
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jPanelid_moduloTipoDescripcionAsiento.setVisible(this.tipodescripcionasientoConstantesFunciones.mostrarid_moduloTipoDescripcionAsiento);
		//this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTextFieldcodigoTipoDescripcionAsiento.setVisible(this.tipodescripcionasientoConstantesFunciones.mostrarcodigoTipoDescripcionAsiento);
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jPanelcodigoTipoDescripcionAsiento.setVisible(this.tipodescripcionasientoConstantesFunciones.mostrarcodigoTipoDescripcionAsiento);
		//this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTextAreanombreTipoDescripcionAsiento.setVisible(this.tipodescripcionasientoConstantesFunciones.mostrarnombreTipoDescripcionAsiento);
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jPanelnombreTipoDescripcionAsiento.setVisible(this.tipodescripcionasientoConstantesFunciones.mostrarnombreTipoDescripcionAsiento);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoDescripcionAsiento() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDescripcionAsiento!=null) {
	
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jLabelidTipoDescripcionAsiento.setEnabled(this.tipodescripcionasientoConstantesFunciones.activaridTipoDescripcionAsiento);
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_empresaTipoDescripcionAsiento.setEnabled(this.tipodescripcionasientoConstantesFunciones.activarid_empresaTipoDescripcionAsiento);
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jComboBoxid_moduloTipoDescripcionAsiento.setEnabled(this.tipodescripcionasientoConstantesFunciones.activarid_moduloTipoDescripcionAsiento);
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTextFieldcodigoTipoDescripcionAsiento.setEnabled(this.tipodescripcionasientoConstantesFunciones.activarcodigoTipoDescripcionAsiento);
		this.jInternalFrameDetalleFormTipoDescripcionAsiento.jTextAreanombreTipoDescripcionAsiento.setEnabled(this.tipodescripcionasientoConstantesFunciones.activarnombreTipoDescripcionAsiento);
		}
	}
	
		
}