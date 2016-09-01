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

import com.bydan.erp.tesoreria.util.EstadoCuentaBancoConstantesFunciones;
import com.bydan.erp.tesoreria.util.EstadoCuentaBancoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.EstadoCuentaBancoParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.EstadoCuentaBancoBean;
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
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoCuentaBancoBeanSwingJInternalFrame extends EstadoCuentaBancoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoCuentaBancoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoCuentaBanco> estadocuentabancoValidator = new ClassValidator<EstadoCuentaBanco>(EstadoCuentaBanco.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoCuentaBanco estadocuentabanco;	
	public EstadoCuentaBanco estadocuentabancoAux;
	public EstadoCuentaBanco estadocuentabancoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoCuentaBanco estadocuentabancoTotales;
	public Long idEstadoCuentaBancoActual;
	public Long iIdNuevoEstadoCuentaBanco=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoEstadoCuentaBanco;
	public Boolean isPermisoNuevoEstadoCuentaBanco;
	public Boolean isPermisoActualizarEstadoCuentaBanco;
	public Boolean isPermisoActualizarOriginalEstadoCuentaBanco;
	public Boolean isPermisoEliminarEstadoCuentaBanco;
	public Boolean isPermisoGuardarCambiosEstadoCuentaBanco;
	public Boolean isPermisoConsultaEstadoCuentaBanco;
	public Boolean isPermisoBusquedaEstadoCuentaBanco;
	public Boolean isPermisoReporteEstadoCuentaBanco;
	public Boolean isPermisoPaginacionMedioEstadoCuentaBanco;
	public Boolean isPermisoPaginacionAltoEstadoCuentaBanco;
	public Boolean isPermisoPaginacionTodoEstadoCuentaBanco;
	public Boolean isPermisoCopiarEstadoCuentaBanco;
	public Boolean isPermisoVerFormEstadoCuentaBanco;
	public Boolean isPermisoDuplicarEstadoCuentaBanco;
	public Boolean isPermisoOrdenEstadoCuentaBanco;
	
	
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
	
	public EstadoCuentaBancoParameterReturnGeneral estadocuentabancoReturnGeneral;
	public EstadoCuentaBancoParameterReturnGeneral estadocuentabancoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoCuentaBanco=false;
	public Boolean esParaAccionDesdeFormularioEstadoCuentaBanco=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoCuentaBancoLogic estadocuentabancoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoCuentaBanco estadocuentabancoBean;
	public EstadoCuentaBancoConstantesFunciones estadocuentabancoConstantesFunciones;
	//public EstadoCuentaBancoParameterReturnGeneral estadocuentabancoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoCuentaBanco> estadocuentabancos;	
	//public List<EstadoCuentaBanco> estadocuentabancosEliminados;
	//public List<EstadoCuentaBanco> estadocuentabancosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoCuentaBanco=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoCuentaBanco=true;
	public Boolean isVisibilidadCeldaCopiarEstadoCuentaBanco=true;
	public Boolean isVisibilidadCeldaVerFormEstadoCuentaBanco=true;
	public Boolean isVisibilidadCeldaOrdenEstadoCuentaBanco=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco=false;
	public Boolean isVisibilidadCeldaModificarEstadoCuentaBanco=false;
	public Boolean isVisibilidadCeldaActualizarEstadoCuentaBanco=false;
	public Boolean isVisibilidadCeldaEliminarEstadoCuentaBanco=false;
	public Boolean isVisibilidadCeldaCancelarEstadoCuentaBanco=false;
	public Boolean isVisibilidadCeldaGuardarEstadoCuentaBanco=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco=false;	
	
	
	
	public Long getiIdNuevoEstadoCuentaBanco() {
		return this.iIdNuevoEstadoCuentaBanco;
	}

	public void setiIdNuevoEstadoCuentaBanco(Long iIdNuevoEstadoCuentaBanco) {
		this.iIdNuevoEstadoCuentaBanco = iIdNuevoEstadoCuentaBanco;
	}
	
	public Long getidEstadoCuentaBancoActual() {
		return this.idEstadoCuentaBancoActual;
	}

	public void setidEstadoCuentaBancoActual(Long idEstadoCuentaBancoActual) {
		this.idEstadoCuentaBancoActual = idEstadoCuentaBancoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoCuentaBanco getestadocuentabanco() {
		return this.estadocuentabanco;
	}

	public void setestadocuentabanco(EstadoCuentaBanco estadocuentabanco) {
		this.estadocuentabanco = estadocuentabanco;
	}
	
	public EstadoCuentaBanco getestadocuentabancoAux() {
		return this.estadocuentabancoAux;
	}

	public void setestadocuentabancoAux(EstadoCuentaBanco estadocuentabancoAux) {
		this.estadocuentabancoAux = estadocuentabancoAux;
	}				
	
	public EstadoCuentaBanco getestadocuentabancoAnterior() {
		return this.estadocuentabancoAnterior;
	}

	public void setestadocuentabancoAnterior(EstadoCuentaBanco estadocuentabancoAnterior) {
		this.estadocuentabancoAnterior = estadocuentabancoAnterior;
	}	
	
	public EstadoCuentaBanco getestadocuentabancoTotales() {
		return this.estadocuentabancoTotales;
	}

	public void setestadocuentabancoTotales(EstadoCuentaBanco estadocuentabancoTotales) {
		this.estadocuentabancoTotales = estadocuentabancoTotales;
	}	
	
	public EstadoCuentaBanco getestadocuentabancoBean() {
		return this.estadocuentabancoBean;
	}

	public void setestadocuentabancoBean(EstadoCuentaBanco estadocuentabancoBean) {
		this.estadocuentabancoBean = estadocuentabancoBean;
	}	
	
	public EstadoCuentaBancoParameterReturnGeneral getestadocuentabancoReturnGeneral() {
		return this.estadocuentabancoReturnGeneral;
	}

	public void setestadocuentabancoReturnGeneral(EstadoCuentaBancoParameterReturnGeneral estadocuentabancoReturnGeneral) {
		this.estadocuentabancoReturnGeneral = estadocuentabancoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoCuentaBancoLogic getEstadoCuentaBancoLogic()	{		
		return estadocuentabancoLogic;
	}

	public void setEstadoCuentaBancoLogic(EstadoCuentaBancoLogic estadocuentabancoLogic) {
		this.estadocuentabancoLogic = estadocuentabancoLogic;
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
	
	public Boolean getIsEsNuevoEstadoCuentaBanco() {
		return isEsNuevoEstadoCuentaBanco;
	}

	public void setIsEsNuevoEstadoCuentaBanco(Boolean isEsNuevoEstadoCuentaBanco) {
		this.isEsNuevoEstadoCuentaBanco = isEsNuevoEstadoCuentaBanco;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoCuentaBanco() {
		return esParaAccionDesdeFormularioEstadoCuentaBanco;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoCuentaBanco(Boolean esParaAccionDesdeFormularioEstadoCuentaBanco) {
		this.esParaAccionDesdeFormularioEstadoCuentaBanco = esParaAccionDesdeFormularioEstadoCuentaBanco;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoCuentaBanco() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoCuentaBancoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoCuentaBanco(this.estadocuentabancoLogic.getEstadoCuentaBancos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoCuentaBancoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoCuentaBanco(this.estadocuentabancos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadocuentabancoLogic.setEstadoCuentaBancos(this.estadocuentabancos);
			estadocuentabancoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoCuentaBancoParameterReturnGeneral getEstadoCuentaBancoParameterGeneral() {
		return this.estadocuentabancoParameterGeneral;
	}
	
	public void setEstadoCuentaBancoParameterGeneral(EstadoCuentaBancoParameterReturnGeneral estadocuentabancoParameterGeneral) {
		this.estadocuentabancoParameterGeneral = estadocuentabancoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoCuentaBanco() {
		return isPermisoTodoEstadoCuentaBanco;
	}

	public void setIsPermisoTodoEstadoCuentaBanco(Boolean isPermisoTodoEstadoCuentaBanco) {
		this.isPermisoTodoEstadoCuentaBanco = isPermisoTodoEstadoCuentaBanco;
	}

	public Boolean getIsPermisoNuevoEstadoCuentaBanco() {
		return isPermisoNuevoEstadoCuentaBanco;
	}

	public void setIsPermisoNuevoEstadoCuentaBanco(Boolean isPermisoNuevoEstadoCuentaBanco) {
		this.isPermisoNuevoEstadoCuentaBanco = isPermisoNuevoEstadoCuentaBanco;
	}

	public Boolean getIsPermisoActualizarEstadoCuentaBanco() {
		return isPermisoActualizarEstadoCuentaBanco;
	}

	public void setIsPermisoActualizarEstadoCuentaBanco(Boolean isPermisoActualizarEstadoCuentaBanco) {
		this.isPermisoActualizarEstadoCuentaBanco = isPermisoActualizarEstadoCuentaBanco;
	}

	public Boolean getIsPermisoEliminarEstadoCuentaBanco() {
		return isPermisoEliminarEstadoCuentaBanco;
	}

	public void setIsPermisoEliminarEstadoCuentaBanco(Boolean isPermisoEliminarEstadoCuentaBanco) {
		this.isPermisoEliminarEstadoCuentaBanco = isPermisoEliminarEstadoCuentaBanco;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoCuentaBanco() {
		return isPermisoGuardarCambiosEstadoCuentaBanco;
	}

	public void setIsPermisoGuardarCambiosEstadoCuentaBanco(Boolean isPermisoGuardarCambiosEstadoCuentaBanco) {
		this.isPermisoGuardarCambiosEstadoCuentaBanco = isPermisoGuardarCambiosEstadoCuentaBanco;
	}
	
	public Boolean getIsPermisoConsultaEstadoCuentaBanco() {
		return isPermisoConsultaEstadoCuentaBanco;
	}

	public void setIsPermisoConsultaEstadoCuentaBanco(Boolean isPermisoConsultaEstadoCuentaBanco) {
		this.isPermisoConsultaEstadoCuentaBanco = isPermisoConsultaEstadoCuentaBanco;
	}

	public Boolean getIsPermisoBusquedaEstadoCuentaBanco() {
		return isPermisoBusquedaEstadoCuentaBanco;
	}

	public void setIsPermisoBusquedaEstadoCuentaBanco(Boolean isPermisoBusquedaEstadoCuentaBanco) {
		this.isPermisoBusquedaEstadoCuentaBanco = isPermisoBusquedaEstadoCuentaBanco;
	}

	public Boolean getIsPermisoReporteEstadoCuentaBanco() {
		return isPermisoReporteEstadoCuentaBanco;
	}

	public void setIsPermisoReporteEstadoCuentaBanco(Boolean isPermisoReporteEstadoCuentaBanco) {
		this.isPermisoReporteEstadoCuentaBanco = isPermisoReporteEstadoCuentaBanco;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoCuentaBanco() {
		return isPermisoPaginacionMedioEstadoCuentaBanco;
	}

	public void setIsPermisoPaginacionMedioEstadoCuentaBanco(Boolean isPermisoPaginacionMedioEstadoCuentaBanco) {
		this.isPermisoPaginacionMedioEstadoCuentaBanco = isPermisoPaginacionMedioEstadoCuentaBanco;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoCuentaBanco() {
		return isPermisoPaginacionTodoEstadoCuentaBanco;
	}

	public void setIsPermisoPaginacionTodoEstadoCuentaBanco(Boolean isPermisoPaginacionTodoEstadoCuentaBanco) {
		this.isPermisoPaginacionTodoEstadoCuentaBanco = isPermisoPaginacionTodoEstadoCuentaBanco;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoCuentaBanco() {
		return isPermisoPaginacionAltoEstadoCuentaBanco;
	}

	public void setIsPermisoPaginacionAltoEstadoCuentaBanco(Boolean isPermisoPaginacionAltoEstadoCuentaBanco) {
		this.isPermisoPaginacionAltoEstadoCuentaBanco = isPermisoPaginacionAltoEstadoCuentaBanco;
	}
	
	public Boolean getIsPermisoCopiarEstadoCuentaBanco() {
		return isPermisoCopiarEstadoCuentaBanco;
	}

	public void setIsPermisoCopiarEstadoCuentaBanco(Boolean isPermisoCopiarEstadoCuentaBanco) {
		this.isPermisoCopiarEstadoCuentaBanco = isPermisoCopiarEstadoCuentaBanco;
	}
	
	public Boolean getIsPermisoVerFormEstadoCuentaBanco() {
		return isPermisoVerFormEstadoCuentaBanco;
	}

	public void setIsPermisoVerFormEstadoCuentaBanco(Boolean isPermisoVerFormEstadoCuentaBanco) {
		this.isPermisoVerFormEstadoCuentaBanco = isPermisoVerFormEstadoCuentaBanco;
	}
	
	public Boolean getIsPermisoDuplicarEstadoCuentaBanco() {
		return isPermisoDuplicarEstadoCuentaBanco;
	}

	public void setIsPermisoDuplicarEstadoCuentaBanco(Boolean isPermisoDuplicarEstadoCuentaBanco) {
		this.isPermisoDuplicarEstadoCuentaBanco = isPermisoDuplicarEstadoCuentaBanco;
	}
	
	public Boolean getIsPermisoOrdenEstadoCuentaBanco() {
		return isPermisoOrdenEstadoCuentaBanco;
	}

	public void setIsPermisoOrdenEstadoCuentaBanco(Boolean isPermisoOrdenEstadoCuentaBanco) {
		this.isPermisoOrdenEstadoCuentaBanco = isPermisoOrdenEstadoCuentaBanco;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoCuentaBanco() {
		return isVisibilidadCeldaNuevoEstadoCuentaBanco;
	}

	public void setIsVisibilidadCeldaNuevoEstadoCuentaBanco(Boolean isVisibilidadCeldaNuevoEstadoCuentaBanco) {
		this.isVisibilidadCeldaNuevoEstadoCuentaBanco = isVisibilidadCeldaNuevoEstadoCuentaBanco;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoCuentaBanco() {
		return isVisibilidadCeldaDuplicarEstadoCuentaBanco;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoCuentaBanco(Boolean isVisibilidadCeldaDuplicarEstadoCuentaBanco) {
		this.isVisibilidadCeldaDuplicarEstadoCuentaBanco = isVisibilidadCeldaDuplicarEstadoCuentaBanco;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoCuentaBanco() {
		return isVisibilidadCeldaCopiarEstadoCuentaBanco;
	}

	public void setIsVisibilidadCeldaCopiarEstadoCuentaBanco(Boolean isVisibilidadCeldaCopiarEstadoCuentaBanco) {
		this.isVisibilidadCeldaCopiarEstadoCuentaBanco = isVisibilidadCeldaCopiarEstadoCuentaBanco;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoCuentaBanco() {
		return isVisibilidadCeldaVerFormEstadoCuentaBanco;
	}

	public void setIsVisibilidadCeldaVerFormEstadoCuentaBanco(Boolean isVisibilidadCeldaVerFormEstadoCuentaBanco) {
		this.isVisibilidadCeldaVerFormEstadoCuentaBanco = isVisibilidadCeldaVerFormEstadoCuentaBanco;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoCuentaBanco() {
		return isVisibilidadCeldaOrdenEstadoCuentaBanco;
	}

	public void setIsVisibilidadCeldaOrdenEstadoCuentaBanco(Boolean isVisibilidadCeldaOrdenEstadoCuentaBanco) {
		this.isVisibilidadCeldaOrdenEstadoCuentaBanco = isVisibilidadCeldaOrdenEstadoCuentaBanco;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco() {
		return isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco(Boolean isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco = isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoCuentaBanco() {
		return isVisibilidadCeldaModificarEstadoCuentaBanco;
	}

	public void setIsVisibilidadCeldaModificarEstadoCuentaBanco(Boolean isVisibilidadCeldaModificarEstadoCuentaBanco) {
		this.isVisibilidadCeldaModificarEstadoCuentaBanco = isVisibilidadCeldaModificarEstadoCuentaBanco;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoCuentaBanco() {
		return isVisibilidadCeldaActualizarEstadoCuentaBanco;
	}

	public void setIsVisibilidadCeldaActualizarEstadoCuentaBanco(Boolean isVisibilidadCeldaActualizarEstadoCuentaBanco) {
		this.isVisibilidadCeldaActualizarEstadoCuentaBanco = isVisibilidadCeldaActualizarEstadoCuentaBanco;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoCuentaBanco() {
		return isVisibilidadCeldaEliminarEstadoCuentaBanco;
	}

	public void setIsVisibilidadCeldaEliminarEstadoCuentaBanco(Boolean isVisibilidadCeldaEliminarEstadoCuentaBanco) {
		this.isVisibilidadCeldaEliminarEstadoCuentaBanco = isVisibilidadCeldaEliminarEstadoCuentaBanco;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoCuentaBanco() {
		return isVisibilidadCeldaCancelarEstadoCuentaBanco;
	}

	public void setIsVisibilidadCeldaCancelarEstadoCuentaBanco(Boolean isVisibilidadCeldaCancelarEstadoCuentaBanco) {
		this.isVisibilidadCeldaCancelarEstadoCuentaBanco = isVisibilidadCeldaCancelarEstadoCuentaBanco;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoCuentaBanco() {
		return isVisibilidadCeldaGuardarEstadoCuentaBanco;
	}

	public void setIsVisibilidadCeldaGuardarEstadoCuentaBanco(Boolean isVisibilidadCeldaGuardarEstadoCuentaBanco) {
		this.isVisibilidadCeldaGuardarEstadoCuentaBanco = isVisibilidadCeldaGuardarEstadoCuentaBanco;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoCuentaBanco() {
		return isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoCuentaBanco(Boolean isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco) {
		this.isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco = isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco;
	}
		
	public EstadoCuentaBancoSessionBean getestadocuentabancoSessionBean() {
		return this.estadocuentabancoSessionBean;
	}
	
	public void setestadocuentabancoSessionBean(EstadoCuentaBancoSessionBean estadocuentabancoSessionBean) {
		this.estadocuentabancoSessionBean=estadocuentabancoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoCuentaBanco(EstadoCuentaBanco estadocuentabanco)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(EstadoCuentaBanco estadocuentabanco,EstadoCuentaBanco estadocuentabancoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoCuentaBanco(estadocuentabanco);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadocuentabancoAux.setId(estadocuentabanco.getId());
		estadocuentabancoAux.setVersionRow(estadocuentabanco.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoCuentaBanco();
		
			int intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoCuentaBanco(this.estadocuentabanco,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuentaBanco(this.estadocuentabanco);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadocuentabancoValidator.getInvalidValues(this.estadocuentabanco);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadocuentabancoLogic.setDatosCliente(datosCliente);
			estadocuentabancoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadocuentabancoAux=new  EstadoCuentaBanco();
				
				estadocuentabancoAux.setIsNew(true);
				estadocuentabancoAux.setIsChanged(true);
				
				estadocuentabancoAux.setEstadoCuentaBancoOriginal(this.estadocuentabanco);
				
				estadocuentabancoAux.setId(this.estadocuentabanco.getId());	
				estadocuentabancoAux.setVersionRow(this.estadocuentabanco.getVersionRow());	
				estadocuentabancoAux.setcodigo(this.estadocuentabanco.getcodigo());	
				estadocuentabancoAux.setnombre(this.estadocuentabanco.getnombre());	
				estadocuentabancoAux.setes_defecto(this.estadocuentabanco.getes_defecto());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadocuentabancoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadocuentabancoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadocuentabancoAux,estadocuentabancoLogic.getEstadoCuentaBancos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadocuentabancoAux,estadocuentabancos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadocuentabancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadocuentabancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocuentabancoLogic.saveEstadoCuentaBancos();//WithConnection
						//estadocuentabancoLogic.getSetVersionRowEstadoCuentaBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadocuentabanco,estadocuentabancoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadocuentabancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadocuentabancoAux=new  EstadoCuentaBanco();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado() 
					|| (this.estadocuentabancoSessionBean.getEsGuardarRelacionado() && this.estadocuentabanco.getId()>=0)) {
						
					estadocuentabancoAux.setIsNew(false);
				}
				
				estadocuentabancoAux.setIsDeleted(false);
			
				estadocuentabancoAux.setId(this.estadocuentabanco.getId());	
				estadocuentabancoAux.setVersionRow(this.estadocuentabanco.getVersionRow());	
				estadocuentabancoAux.setcodigo(this.estadocuentabanco.getcodigo());	
				estadocuentabancoAux.setnombre(this.estadocuentabanco.getnombre());	
				estadocuentabancoAux.setes_defecto(this.estadocuentabanco.getes_defecto());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadocuentabancoAux,estadocuentabancoLogic.getEstadoCuentaBancos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadocuentabancoAux,estadocuentabancos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadocuentabancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadocuentabancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocuentabancoLogic.saveEstadoCuentaBancos();//WithConnection
						//estadocuentabancoLogic.getSetVersionRowEstadoCuentaBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadocuentabanco,estadocuentabancoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadocuentabancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadocuentabancoAux=new  EstadoCuentaBanco();
				
				estadocuentabancoAux.setIsNew(false);
				estadocuentabancoAux.setIsChanged(false);
				
				estadocuentabancoAux.setIsDeleted(true);
				
				estadocuentabancoAux.setId(this.estadocuentabanco.getId());	
				estadocuentabancoAux.setVersionRow(this.estadocuentabanco.getVersionRow());	
				estadocuentabancoAux.setcodigo(this.estadocuentabanco.getcodigo());	
				estadocuentabancoAux.setnombre(this.estadocuentabanco.getnombre());	
				estadocuentabancoAux.setes_defecto(this.estadocuentabanco.getes_defecto());	
				
				if(this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadocuentabancoAux.getId()>=0) {	
						this.estadocuentabancosEliminados.add(estadocuentabancoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadocuentabancoAux,estadocuentabancoLogic.getEstadoCuentaBancos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadocuentabancoAux,estadocuentabancos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadocuentabancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadocuentabancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocuentabancoLogic.saveEstadoCuentaBancos();//WithConnection
						//estadocuentabancoLogic.getSetVersionRowEstadoCuentaBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadocuentabancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadocuentabancoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadocuentabancoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadocuentabancoAux,estadocuentabancoLogic.getEstadoCuentaBancos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadocuentabancoAux,estadocuentabancos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoLogic.getEstadoCuentaBancos().addAll(this.estadocuentabancosEliminados);
					
					estadocuentabancoLogic.saveEstadoCuentaBancos();//WithConnection
					//estadocuentabancoLogic.getSetVersionRowEstadoCuentaBancos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadocuentabancosEliminados= new ArrayList<EstadoCuentaBanco>();		
			}
			
			if(this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Cuenta Banco GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadocuentabanco=estadocuentabancoAux;
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
      		//this.finishProcessEstadoCuentaBanco();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoCuentaBanco estadocuentabancoLocal) throws Exception {
		
		if(this.estadocuentabancoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoCuentaBanco estadocuentabancoLocal) throws Exception {	
		if(this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoCuentaBancoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadocuentabancoValidator.getInvalidValues(this.estadocuentabanco);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoCuentaBanco estadocuentabanco,List<EstadoCuentaBanco> estadocuentabancos) throws Exception {
		try	{		
			EstadoCuentaBancoConstantesFunciones.actualizarLista(estadocuentabanco,estadocuentabancos,this.estadocuentabancoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoCuentaBanco estadocuentabanco,List<EstadoCuentaBanco> estadocuentabancos) throws Exception {
		try	{			
			EstadoCuentaBancoConstantesFunciones.actualizarSelectedLista(estadocuentabanco,estadocuentabancos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoCuentaBanco> estadocuentabancosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadocuentabancosLocal=this.estadocuentabancoLogic.getEstadoCuentaBancos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadocuentabancosLocal=this.estadocuentabancos;
			}
			//ARCHITECTURE
		
			for(EstadoCuentaBanco estadocuentabancoLocal:estadocuentabancosLocal) {
				if(this.permiteMantenimiento(estadocuentabancoLocal) && estadocuentabancoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoCuentaBancoConstantesFunciones.getEstadoCuentaBancoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoCuentaBancoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCuentaBanco.jLabelcodigoEstadoCuentaBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoCuentaBancoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCuentaBanco.jLabelnombreEstadoCuentaBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoCuentaBancoConstantesFunciones.ESDEFECTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCuentaBanco.jLabeles_defectoEstadoCuentaBanco,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoCuentaBanco.jLabelcodigoEstadoCuentaBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoCuentaBanco.jLabelnombreEstadoCuentaBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoCuentaBanco.jLabeles_defectoEstadoCuentaBanco,"");
		
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
		this.iIdNuevoEstadoCuentaBanco--;	
		
		
		this.estadocuentabancoAux=new EstadoCuentaBanco();
		
		this.estadocuentabancoAux.setId(this.iIdNuevoEstadoCuentaBanco);
		this.estadocuentabancoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadocuentabancoLogic.getEstadoCuentaBancos().add(this.estadocuentabancoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadocuentabancos.add(this.estadocuentabancoAux);
		}
		//ARCHITECTURE
		
		this.estadocuentabanco=this.estadocuentabancoAux;
		
		if(EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoCuentaBanco(this.estadocuentabanco);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoCuentaBanco(this.estadocuentabanco);
		}
				
		//this.setDefaultControlesEstadoCuentaBanco();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoCuentaBanco();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoCuentaBanco();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoCuentaBanco();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoCuentaBanco(this.estadocuentabancoBean,this.estadocuentabanco,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuentaBanco(this.estadocuentabanco);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadocuentabancoSessionBean.getConGuardarRelaciones()) {
			classes=EstadoCuentaBancoConstantesFunciones.getClassesRelationshipsOfEstadoCuentaBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadocuentabancoReturnGeneral=estadocuentabancoLogic.procesarEventosEstadoCuentaBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadocuentabancoLogic.getEstadoCuentaBancos(),this.estadocuentabanco,this.estadocuentabancoParameterGeneral,this.isEsNuevoEstadoCuentaBanco,classes);//this.estadocuentabancoLogic.getEstadoCuentaBanco()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoCuentaBanco(this.estadocuentabancoReturnGeneral,this.estadocuentabancoBean,false);
		
		if(this.estadocuentabancoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoCuentaBanco(this.estadocuentabancoReturnGeneral.getEstadoCuentaBanco());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoCuentaBanco(this.estadocuentabancoReturnGeneral.getEstadoCuentaBanco());
		}
		
		if(this.estadocuentabancoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoCuentaBanco(this.estadocuentabancoReturnGeneral.getEstadoCuentaBanco(),classes);//this.estadocuentabancoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoCuentaBanco(this.estadocuentabanco,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoCuentaBanco();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoCuentaBanco();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoCuentaBanco(false);
						
			if(estadocuentabancoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoCuentaBanco();
			}
			
			this.actualizarVisualTableDatosEstadoCuentaBanco();
			
			this.jTableDatosEstadoCuentaBanco.setRowSelectionInterval(this.getIndiceNuevoEstadoCuentaBanco(), this.getIndiceNuevoEstadoCuentaBanco());
			
			this.seleccionarFilaTablaEstadoCuentaBancoActual();
						
			this.actualizarEstadoCeldasBotonesEstadoCuentaBanco("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoCuentaBanco(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldcodigoEstadoCuentaBanco.setEnabled(isHabilitar && this.estadocuentabancoConstantesFunciones.activarcodigoEstadoCuentaBanco);
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextAreanombreEstadoCuentaBanco.setEnabled(isHabilitar && this.estadocuentabancoConstantesFunciones.activarnombreEstadoCuentaBanco);
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jCheckBoxes_defectoEstadoCuentaBanco.setEnabled(isHabilitar && this.estadocuentabancoConstantesFunciones.activares_defectoEstadoCuentaBanco);	
		
	};
	
	public void setDefaultControlesEstadoCuentaBanco() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoCuentaBanco(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadocuentabancoSessionBean.setConGuardarRelaciones(true);			
			this.estadocuentabancoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jTabbedPaneRelacionesEstadoCuentaBanco.setVisible(true);
			
					
		} else {
			//this.estadocuentabancoSessionBean.setConGuardarRelaciones(false);			
			this.estadocuentabancoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jTabbedPaneRelacionesEstadoCuentaBanco.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEstadoCuentaBanco() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCuentaBanco estadocuentabancoAux:this.estadocuentabancoLogic.getEstadoCuentaBancos()) {
				if(estadocuentabancoAux.getId().equals(this.iIdNuevoEstadoCuentaBanco)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCuentaBanco estadocuentabancoAux:this.estadocuentabancos) {
				if(estadocuentabancoAux.getId().equals(this.iIdNuevoEstadoCuentaBanco)) {
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
	
	public int getIndiceActualEstadoCuentaBanco(EstadoCuentaBanco estadocuentabanco,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCuentaBanco estadocuentabancoAux:this.estadocuentabancoLogic.getEstadoCuentaBancos()) {
				if(estadocuentabancoAux.getId().equals(estadocuentabanco.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCuentaBanco estadocuentabancoAux:this.estadocuentabancos) {
				if(estadocuentabancoAux.getId().equals(estadocuentabanco.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoCuentaBanco(EstadoCuentaBanco estadocuentabancoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCuentaBanco estadocuentabancoAux:this.estadocuentabancoLogic.getEstadoCuentaBancos()) {
				if(estadocuentabancoAux.getEstadoCuentaBancoOriginal().getId().equals(estadocuentabancoOriginal.getId())) {
					existe=true;
					estadocuentabancoOriginal.setId(estadocuentabancoAux.getId());
					estadocuentabancoOriginal.setVersionRow(estadocuentabancoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCuentaBanco estadocuentabancoAux:this.estadocuentabancos) {
				if(estadocuentabancoAux.getEstadoCuentaBancoOriginal().getId().equals(estadocuentabancoOriginal.getId())) {
					existe=true;
					estadocuentabancoOriginal.setId(estadocuentabancoAux.getId());
					estadocuentabancoOriginal.setVersionRow(estadocuentabancoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoCuentaBanco(Boolean esParaCancelar) throws Exception {
		estadocuentabancosAux=new ArrayList<EstadoCuentaBanco>();
		estadocuentabancoAux=new EstadoCuentaBanco();
		
		if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoCuentaBanco estadocuentabancoAux:this.estadocuentabancoLogic.getEstadoCuentaBancos()) {
					if(estadocuentabancoAux.getId()<0) {
						estadocuentabancosAux.add(estadocuentabancoAux);
					}		
				}
				this.iIdNuevoEstadoCuentaBanco=0L;
				this.estadocuentabancoLogic.getEstadoCuentaBancos().removeAll(estadocuentabancosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoCuentaBanco estadocuentabancoAux:this.estadocuentabancos) {
					if(estadocuentabancoAux.getId()<0) {
						estadocuentabancosAux.add(estadocuentabancoAux);
					}		
				}
				this.iIdNuevoEstadoCuentaBanco=0L;
				this.estadocuentabancos.removeAll(estadocuentabancosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoCuentaBanco 
					&& this.estadocuentabancoLogic.getEstadoCuentaBancos().size()>0
					) {
					estadocuentabancoAux=this.estadocuentabancoLogic.getEstadoCuentaBancos().get(this.estadocuentabancoLogic.getEstadoCuentaBancos().size() - 1);
				
					if(estadocuentabancoAux.getId()<0) {
						this.estadocuentabancoLogic.getEstadoCuentaBancos().remove(estadocuentabancoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoCuentaBanco && this.estadocuentabancos.size()>0) {
					estadocuentabancoAux=this.estadocuentabancos.get(this.estadocuentabancos.size() - 1);
				
					if(estadocuentabancoAux.getId()<0) {
						this.estadocuentabancos.remove(estadocuentabancoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoCuentaBanco(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadocuentabanco.getId()<0) {
				this.estadocuentabancoLogic.getEstadoCuentaBancos().remove(this.estadocuentabanco);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadocuentabanco.getId()<0) {
				this.estadocuentabancos.remove(this.estadocuentabanco);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoCuentaBanco(List<EstadoCuentaBanco> estadocuentabancosAux) throws Exception {
		EstadoCuentaBancoConstantesFunciones.setEstadosInicialesEstadoCuentaBanco(estadocuentabancosAux);
	}
	
	public void setEstadosInicialesEstadoCuentaBanco(EstadoCuentaBanco estadocuentabancoAux) throws Exception {
		EstadoCuentaBancoConstantesFunciones.setEstadosInicialesEstadoCuentaBanco(estadocuentabancoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoCuentaBancoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoCuentaBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoCuentaBancoActual()) {
				if(!this.isEsNuevoEstadoCuentaBanco) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoCuentaBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoCuentaBanco=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoCuentaBancoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Cuenta Banco ?", "MANTENIMIENTO DE Estado Cuenta Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoCuentaBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoCuentaBanco estadocuentabanco) throws Exception {
		EstadoCuentaBancoConstantesFunciones.seleccionarAsignar(this.estadocuentabanco,estadocuentabanco);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoCuentaBanco=this.isPermisoActualizarOriginalEstadoCuentaBanco;
			
			
			this.seleccionarAsignar(estadocuentabanco);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoCuentaBancoConstantesFunciones.quitarEspaciosEstadoCuentaBanco(this.estadocuentabanco,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoCuentaBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadocuentabancoSessionBean.setsFuncionBusquedaRapida(this.estadocuentabancoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoCuentaBanco) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoCuentaBanco(esParaCancelar);				
				this.cancelarNuevoEstadoCuentaBanco(esParaCancelar);								
			}
			
			this.estadocuentabanco=new EstadoCuentaBanco();
			
			this.inicializarEstadoCuentaBanco();
			
			this.actualizarEstadoCeldasBotonesEstadoCuentaBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoCuentaBanco() throws Exception {
		try {
			EstadoCuentaBancoConstantesFunciones.inicializarEstadoCuentaBanco(this.estadocuentabanco);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadocuentabancoLogic.getEstadoCuentaBancos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoCuentaBancos(String sAccionBusqueda,List<EstadoCuentaBanco> estadocuentabancosParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoCuentaBanco"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoCuentaBancoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoCuentaBancoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoCuentaBanco"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Cuenta Bancos");		
		parameters.put("busquedapor", EstadoCuentaBancoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoCuentaBanco=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoCuentaBancoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoCuentaBancoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoCuentaBanco=new JRBeanArrayDataSource(EstadoCuentaBancoJInternalFrame.TraerEstadoCuentaBancoBeans(estadocuentabancosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoCuentaBanco);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoCuentaBancoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoCuentaBancoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoCuentaBancoBean.TraerEstadoCuentaBancoBeans(estadocuentabancosParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoCuentaBancos(sAccionBusqueda,sTipoArchivoReporte,estadocuentabancosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoCuentaBancos(sAccionBusqueda,sTipoArchivoReporte,estadocuentabancosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoCuentaBancoActionPerformed(null);
					//this.generarExcelReporteEstadoCuentaBancos(sAccionBusqueda,sTipoArchivoReporte,estadocuentabancosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoCuentaBancos(sAccionBusqueda,sTipoArchivoReporte,estadocuentabancosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoCuentaBancos(sAccionBusqueda,sTipoArchivoReporte,estadocuentabancosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoCuentaBancos(sAccionBusqueda,sTipoArchivoReporte,estadocuentabancosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoCuentaBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoCuentaBanco> estadocuentabancosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocuentabanco";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoCuentaBancos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoCuentaBanco("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoCuentaBanco estadocuentabanco : estadocuentabancosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoCuentaBancoConstantesFunciones.generarExcelReporteDataEstadoCuentaBanco("NORMAL",row,workbook,estadocuentabanco,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoCuentaBanco(String sTipo,Row row,Workbook workbook) {
		
		EstadoCuentaBancoConstantesFunciones.generarExcelReporteHeaderEstadoCuentaBanco(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoCuentaBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoCuentaBanco> estadocuentabancosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocuentabanco_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoCuentaBancos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoCuentaBanco estadocuentabanco : estadocuentabancosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoCuentaBancoConstantesFunciones.getEstadoCuentaBancoDescripcion(estadocuentabanco));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoCuentaBancoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoCuentaBancoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadocuentabanco.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoCuentaBancoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoCuentaBancoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadocuentabanco.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoCuentaBancoConstantesFunciones.LABEL_ESDEFECTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoCuentaBancoConstantesFunciones.LABEL_ESDEFECTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(estadocuentabanco.getes_defecto()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoCuentaBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoCuentaBanco> estadocuentabancosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoCuentaBanco> estadocuentabancosRespaldo=null;
		
		classes=EstadoCuentaBancoConstantesFunciones.getClassesRelationshipsOfEstadoCuentaBanco(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadocuentabancoLogic.setDatosCliente(this.datosCliente);
		this.estadocuentabancoLogic.setDatosDeep(this.datosDeep);
		this.estadocuentabancoLogic.setIsConDeep(true);
		
		estadocuentabancosRespaldo=this.estadocuentabancoLogic.getEstadoCuentaBancos();
		
		this.estadocuentabancoLogic.setEstadoCuentaBancos(estadocuentabancosParaReportes);	
		this.estadocuentabancoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadocuentabancosParaReportes=this.estadocuentabancoLogic.getEstadoCuentaBancos();
		this.estadocuentabancoLogic.setEstadoCuentaBancos(estadocuentabancosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocuentabanco_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoCuentaBancos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoCuentaBanco("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoCuentaBanco estadocuentabanco : estadocuentabancosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoCuentaBanco("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoCuentaBancoConstantesFunciones.generarExcelReporteDataEstadoCuentaBanco("NORMAL",row,workbook,estadocuentabanco,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadoCuentaBancoConstantesFunciones.getEstadoCuentaBancoDescripcion(estadocuentabanco));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoCuentaBanco() throws Exception {		
		this.startProcessEstadoCuentaBanco(true);
	}
	
	public void startProcessEstadoCuentaBanco(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoCuentaBanco, this.jScrollPanelDatosEstadoCuentaBanco,this.jPanelPaginacionEstadoCuentaBanco, this.jScrollPanelDatosEdicionEstadoCuentaBanco, this.jPanelAccionesEstadoCuentaBanco,this.jPanelAccionesFormularioEstadoCuentaBanco,this.jmenuBarEstadoCuentaBanco,this.jmenuBarDetalleEstadoCuentaBanco,this.jTtoolBarEstadoCuentaBanco,this.jTtoolBarDetalleEstadoCuentaBanco);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoCuentaBanco=null; 
		
		final JPanel jPanelParametrosReportesEstadoCuentaBanco=this.jPanelParametrosReportesEstadoCuentaBanco;
		//final JScrollPane jScrollPanelDatosEstadoCuentaBanco=this.jScrollPanelDatosEstadoCuentaBanco;
		final JTable jTableDatosEstadoCuentaBanco=this.jTableDatosEstadoCuentaBanco;		
		final JPanel jPanelPaginacionEstadoCuentaBanco=this.jPanelPaginacionEstadoCuentaBanco;
		//final JScrollPane jScrollPanelDatosEdicionEstadoCuentaBanco=this.jScrollPanelDatosEdicionEstadoCuentaBanco;
		final JPanel jPanelAccionesEstadoCuentaBanco=this.jPanelAccionesEstadoCuentaBanco;
		
		JPanel jPanelCamposAuxiliarEstadoCuentaBanco=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoCuentaBanco=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {
			jPanelCamposAuxiliarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jPanelCamposEstadoCuentaBanco;
			jPanelAccionesFormularioAuxiliarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jPanelAccionesFormularioEstadoCuentaBanco;
		}
		
		final JPanel jPanelCamposEstadoCuentaBanco=jPanelCamposAuxiliarEstadoCuentaBanco;
		final JPanel jPanelAccionesFormularioEstadoCuentaBanco=jPanelAccionesFormularioAuxiliarEstadoCuentaBanco;
		
		
		final JMenuBar jmenuBarEstadoCuentaBanco=this.jmenuBarEstadoCuentaBanco;
		final JToolBar jTtoolBarEstadoCuentaBanco=this.jTtoolBarEstadoCuentaBanco;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoCuentaBanco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoCuentaBanco=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {
			jmenuBarDetalleAuxiliarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jmenuBarDetalleEstadoCuentaBanco;
			jTtoolBarDetalleAuxiliarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jTtoolBarDetalleEstadoCuentaBanco;
		}
		
		final JMenuBar jmenuBarDetalleEstadoCuentaBanco=jmenuBarDetalleAuxiliarEstadoCuentaBanco;
		final JToolBar jTtoolBarDetalleEstadoCuentaBanco=jTtoolBarDetalleAuxiliarEstadoCuentaBanco;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoCuentaBanco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoCuentaBanco;
			processRunnable.jTableDatos=jTableDatosEstadoCuentaBanco;
			processRunnable.jPanelCampos=jPanelCamposEstadoCuentaBanco;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoCuentaBanco;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoCuentaBanco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoCuentaBanco;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoCuentaBanco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoCuentaBanco;
			processRunnable.jTtoolBar=jTtoolBarEstadoCuentaBanco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoCuentaBanco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoCuentaBanco ,jPanelParametrosReportesEstadoCuentaBanco,jTableDatosEstadoCuentaBanco, /*jScrollPanelDatosEstadoCuentaBanco,*/jPanelCamposEstadoCuentaBanco,jPanelPaginacionEstadoCuentaBanco, /*jScrollPanelDatosEdicionEstadoCuentaBanco,*/ jPanelAccionesEstadoCuentaBanco,jPanelAccionesFormularioEstadoCuentaBanco,jmenuBarEstadoCuentaBanco,jmenuBarDetalleEstadoCuentaBanco,jTtoolBarEstadoCuentaBanco,jTtoolBarDetalleEstadoCuentaBanco);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoCuentaBanco, jScrollPanelDatosEstadoCuentaBanco,jPanelPaginacionEstadoCuentaBanco, jScrollPanelDatosEdicionEstadoCuentaBanco, jPanelAccionesEstadoCuentaBanco,jPanelAccionesFormularioEstadoCuentaBanco,jmenuBarEstadoCuentaBanco,jmenuBarDetalleEstadoCuentaBanco,jTtoolBarEstadoCuentaBanco,jTtoolBarDetalleEstadoCuentaBanco);
						
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
	
	public void finishProcessEstadoCuentaBanco() {// throws Exception 
		this.finishProcessEstadoCuentaBanco(true);
	}
	
	public void finishProcessEstadoCuentaBanco(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoCuentaBanco, this.jScrollPanelDatosEstadoCuentaBanco,this.jPanelPaginacionEstadoCuentaBanco, this.jScrollPanelDatosEdicionEstadoCuentaBanco, this.jPanelAccionesEstadoCuentaBanco,this.jPanelAccionesFormularioEstadoCuentaBanco,this.jmenuBarEstadoCuentaBanco,this.jmenuBarDetalleEstadoCuentaBanco,this.jTtoolBarEstadoCuentaBanco,this.jTtoolBarDetalleEstadoCuentaBanco);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoCuentaBanco=null; 
		
		final JPanel jPanelParametrosReportesEstadoCuentaBanco=this.jPanelParametrosReportesEstadoCuentaBanco;
		//final JScrollPane jScrollPanelDatosEstadoCuentaBanco=this.jScrollPanelDatosEstadoCuentaBanco;
		final JTable jTableDatosEstadoCuentaBanco=this.jTableDatosEstadoCuentaBanco;		
		final JPanel jPanelPaginacionEstadoCuentaBanco=this.jPanelPaginacionEstadoCuentaBanco;
		//final JScrollPane jScrollPanelDatosEdicionEstadoCuentaBanco=this.jScrollPanelDatosEdicionEstadoCuentaBanco;
		final JPanel jPanelAccionesEstadoCuentaBanco=this.jPanelAccionesEstadoCuentaBanco;
		
		JPanel jPanelCamposAuxiliarEstadoCuentaBanco=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoCuentaBanco=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {
			jPanelCamposAuxiliarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jPanelCamposEstadoCuentaBanco;
			jPanelAccionesFormularioAuxiliarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jPanelAccionesFormularioEstadoCuentaBanco;
		}
		
		final JPanel jPanelCamposEstadoCuentaBanco=jPanelCamposAuxiliarEstadoCuentaBanco;
		final JPanel jPanelAccionesFormularioEstadoCuentaBanco=jPanelAccionesFormularioAuxiliarEstadoCuentaBanco;
		
		
		final JMenuBar jmenuBarEstadoCuentaBanco=this.jmenuBarEstadoCuentaBanco;		
		final JToolBar jTtoolBarEstadoCuentaBanco=this.jTtoolBarEstadoCuentaBanco;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoCuentaBanco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoCuentaBanco=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {
			jmenuBarDetalleAuxiliarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jmenuBarDetalleEstadoCuentaBanco;
			jTtoolBarDetalleAuxiliarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jTtoolBarDetalleEstadoCuentaBanco;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoCuentaBanco=jmenuBarDetalleAuxiliarEstadoCuentaBanco;
		final JToolBar jTtoolBarDetalleEstadoCuentaBanco=jTtoolBarDetalleAuxiliarEstadoCuentaBanco;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoCuentaBanco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoCuentaBanco;
			processRunnable.jTableDatos=jTableDatosEstadoCuentaBanco;
			processRunnable.jPanelCampos=jPanelCamposEstadoCuentaBanco;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoCuentaBanco;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoCuentaBanco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoCuentaBanco;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoCuentaBanco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoCuentaBanco;
			processRunnable.jTtoolBar=jTtoolBarEstadoCuentaBanco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoCuentaBanco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoCuentaBanco ,jPanelParametrosReportesEstadoCuentaBanco, jTableDatosEstadoCuentaBanco,/*jScrollPanelDatosEstadoCuentaBanco,*/jPanelCamposEstadoCuentaBanco,jPanelPaginacionEstadoCuentaBanco, /*jScrollPanelDatosEdicionEstadoCuentaBanco,*/ jPanelAccionesEstadoCuentaBanco,jPanelAccionesFormularioEstadoCuentaBanco,jmenuBarEstadoCuentaBanco,jmenuBarDetalleEstadoCuentaBanco,jTtoolBarEstadoCuentaBanco,jTtoolBarDetalleEstadoCuentaBanco));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoCuentaBanco(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoCuentaBanco(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoCuentaBanco(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoCuentaBanco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoCuentaBanco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoCuentaBanco,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoCuentaBanco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoCuentaBanco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoCuentaBanco,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadocuentabancoConstantesFunciones.getsFinalQueryEstadoCuentaBanco();
		String  finalQueryPaginacionTodos=this.estadocuentabancoConstantesFunciones.getsFinalQueryEstadoCuentaBanco();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoCuentaBancoConstantesFunciones.getArrayColumnasGlobalesNoEstadoCuentaBanco(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoCuentaBancoConstantesFunciones.getArrayColumnasGlobalesEstadoCuentaBanco(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoCuentaBancoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadocuentabancosEliminados= new ArrayList<EstadoCuentaBanco>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoCuentaBanco();
		
				///*EstadoCuentaBancoSessionBean*/this.estadocuentabancoSessionBean=new EstadoCuentaBancoSessionBean();
			
			if(this.estadocuentabancoSessionBean==null) {
				this.estadocuentabancoSessionBean=new EstadoCuentaBancoSessionBean();
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
					this.iNumeroPaginacion=EstadoCuentaBancoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoCuentaBancoConstantesFunciones.getClassesForeignKeysOfEstadoCuentaBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadocuentabanco."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadocuentabancosAux= new ArrayList<EstadoCuentaBanco>();
			
				
			estadocuentabancoLogic.setDatosCliente(this.datosCliente);
			estadocuentabancoLogic.setDatosDeep(this.datosDeep);
			estadocuentabancoLogic.setIsConDeep(true);
			
			
			estadocuentabancoLogic.getEstadoCuentaBancoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadocuentabancoLogic.getTodosEstadoCuentaBancos(finalQueryGlobal,pagination);
					
					//estadocuentabancoLogic.getTodosEstadoCuentaBancosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadocuentabancoLogic.getEstadoCuentaBancos()==null|| estadocuentabancoLogic.getEstadoCuentaBancos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadocuentabancosAux= new ArrayList<EstadoCuentaBanco>();
							estadocuentabancosAux.addAll(estadocuentabancoLogic.getEstadoCuentaBancos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadocuentabancosAux= new ArrayList<EstadoCuentaBanco>();
							estadocuentabancosAux.addAll(estadocuentabancos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadocuentabancoLogic.getTodosEstadoCuentaBancos(finalQueryGlobal+"",this.pagination);												
							
							//estadocuentabancoLogic.getTodosEstadoCuentaBancosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoCuentaBancos("Todos",estadocuentabancoLogic.getEstadoCuentaBancos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadocuentabancoLogic.setEstadoCuentaBancos(new ArrayList<EstadoCuentaBanco>());					
							estadocuentabancoLogic.getEstadoCuentaBancos().addAll(estadocuentabancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadocuentabancos=new ArrayList<EstadoCuentaBanco>();
							estadocuentabancos.addAll(estadocuentabancosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoCuentaBanco=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoCuentaBanco=this.idActual;
				
				} else if(this.idEstadoCuentaBancoActual!=null && this.idEstadoCuentaBancoActual!=0L) {
					idEstadoCuentaBanco=idEstadoCuentaBancoActual;
				}
				
					
				this.sDetalleReporte=EstadoCuentaBancoConstantesFunciones.getDetalleIndicePorId(idEstadoCuentaBanco);
				
				this.estadocuentabancos=new ArrayList<EstadoCuentaBanco>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadocuentabancoLogic.getEntity(idEstadoCuentaBanco);
					
					//estadocuentabancoLogic.getEntityWithConnection(idEstadoCuentaBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadocuentabancoLogic.setEstadoCuentaBancos(new ArrayList<EstadoCuentaBanco>());
					estadocuentabancoLogic.getEstadoCuentaBancos().add(estadocuentabancoLogic.getEstadoCuentaBanco());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadocuentabancos=new ArrayList<EstadoCuentaBanco>();
					this.estadocuentabancos.add(estadocuentabanco);
				}
				
				if(estadocuentabancoLogic.getEstadoCuentaBanco()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoCuentaBanco();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoCuentaBanco();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadocuentabancoLogic.getEstadoCuentaBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadocuentabancos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadocuentabancoLogic.getEstadoCuentaBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadocuentabancos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoCuentaBanco estadocuentabanco) {
		Boolean permite=true;
		
		if(this.estadocuentabanco.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoCuentaBancoConstantesFunciones.getOrderByListaEstadoCuentaBanco();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoCuentaBancoConstantesFunciones.getOrderByListaEstadoCuentaBanco();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCuentaBanco estadocuentabanco:estadocuentabancoLogic.getEstadoCuentaBancos()) {
				if(estadocuentabanco.getsType().equals(Constantes2.S_TOTALES)) {
					estadocuentabancoTotales=estadocuentabanco;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCuentaBanco estadocuentabanco:this.estadocuentabancos) {
				if(estadocuentabanco.getsType().equals(Constantes2.S_TOTALES)) {
					estadocuentabancoTotales=estadocuentabanco;
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
			this.estadocuentabancoAux=new EstadoCuentaBanco();
			this.estadocuentabancoAux.setsType(Constantes2.S_TOTALES);
			this.estadocuentabancoAux.setIsNew(false);
			this.estadocuentabancoAux.setIsChanged(false);
			this.estadocuentabancoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoCuentaBancoConstantesFunciones.TotalizarValoresFilaEstadoCuentaBanco(this.estadocuentabancoLogic.getEstadoCuentaBancos(),this.estadocuentabancoAux);
				
				this.estadocuentabancoLogic.getEstadoCuentaBancos().add(this.estadocuentabancoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoCuentaBancoConstantesFunciones.TotalizarValoresFilaEstadoCuentaBanco(this.estadocuentabancos,this.estadocuentabancoAux);
				
				this.estadocuentabancos.add(this.estadocuentabancoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadocuentabancoTotales=new EstadoCuentaBanco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadocuentabancoLogic.getEstadoCuentaBancos().remove(estadocuentabancoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadocuentabancos.remove(estadocuentabancoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadocuentabancoTotales=new EstadoCuentaBanco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCuentaBanco estadocuentabanco:estadocuentabancoLogic.getEstadoCuentaBancos()) {
				if(estadocuentabanco.getsType().equals(Constantes2.S_TOTALES)) {
					estadocuentabancoTotales=estadocuentabanco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoCuentaBancoConstantesFunciones.TotalizarValoresFilaEstadoCuentaBanco(this.estadocuentabancoLogic.getEstadoCuentaBancos(),estadocuentabancoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCuentaBanco estadocuentabanco:this.estadocuentabancos) {
				if(estadocuentabanco.getsType().equals(Constantes2.S_TOTALES)) {
					estadocuentabancoTotales=estadocuentabanco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoCuentaBancoConstantesFunciones.TotalizarValoresFilaEstadoCuentaBanco(this.estadocuentabancos,estadocuentabancoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoCuentaBancoPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoCuentaBancoPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadocuentabancoLogic.getEstadoCuentaBancoPorCodigo(codigo);
				
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
	
	public void inicializarPermisosEstadoCuentaBanco() {
		this.isPermisoTodoEstadoCuentaBanco=false;
		this.isPermisoNuevoEstadoCuentaBanco=false;
		this.isPermisoActualizarEstadoCuentaBanco=false;
		this.isPermisoActualizarOriginalEstadoCuentaBanco=false;
		this.isPermisoEliminarEstadoCuentaBanco=false;
		this.isPermisoGuardarCambiosEstadoCuentaBanco=false;
		this.isPermisoConsultaEstadoCuentaBanco=false;
		this.isPermisoBusquedaEstadoCuentaBanco=false;
		this.isPermisoReporteEstadoCuentaBanco=false;		
		this.isPermisoOrdenEstadoCuentaBanco=false;		
		this.isPermisoPaginacionMedioEstadoCuentaBanco=false;		
		this.isPermisoPaginacionAltoEstadoCuentaBanco=false;
		this.isPermisoPaginacionTodoEstadoCuentaBanco=false;
		this.isPermisoCopiarEstadoCuentaBanco=false;		
		this.isPermisoVerFormEstadoCuentaBanco=false;		
		this.isPermisoDuplicarEstadoCuentaBanco=false;		
		this.isPermisoOrdenEstadoCuentaBanco=false;		
	}
	
	public void setPermisosUsuarioEstadoCuentaBanco(Boolean isPermiso) {
		this.isPermisoTodoEstadoCuentaBanco=isPermiso;
		this.isPermisoNuevoEstadoCuentaBanco=isPermiso;
		this.isPermisoActualizarEstadoCuentaBanco=isPermiso;
		this.isPermisoActualizarOriginalEstadoCuentaBanco=isPermiso;
		this.isPermisoEliminarEstadoCuentaBanco=isPermiso;
		this.isPermisoGuardarCambiosEstadoCuentaBanco=isPermiso;
		this.isPermisoConsultaEstadoCuentaBanco=isPermiso;
		this.isPermisoBusquedaEstadoCuentaBanco=isPermiso;
		this.isPermisoReporteEstadoCuentaBanco=isPermiso;
		this.isPermisoOrdenEstadoCuentaBanco=isPermiso;		
		this.isPermisoPaginacionMedioEstadoCuentaBanco=isPermiso;		
		this.isPermisoPaginacionAltoEstadoCuentaBanco=isPermiso;		
		this.isPermisoPaginacionTodoEstadoCuentaBanco=isPermiso;		
		this.isPermisoCopiarEstadoCuentaBanco=isPermiso;		
		this.isPermisoVerFormEstadoCuentaBanco=isPermiso;		
		this.isPermisoDuplicarEstadoCuentaBanco=isPermiso;
		this.isPermisoOrdenEstadoCuentaBanco=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoCuentaBanco(Boolean isPermiso) {
		//this.isPermisoTodoEstadoCuentaBanco=isPermiso;
		this.isPermisoNuevoEstadoCuentaBanco=isPermiso;
		this.isPermisoActualizarEstadoCuentaBanco=isPermiso;
		this.isPermisoActualizarOriginalEstadoCuentaBanco=isPermiso;
		this.isPermisoEliminarEstadoCuentaBanco=isPermiso;
		this.isPermisoGuardarCambiosEstadoCuentaBanco=isPermiso;
		//this.isPermisoConsultaEstadoCuentaBanco=isPermiso;
		//this.isPermisoBusquedaEstadoCuentaBanco=isPermiso;
		//this.isPermisoReporteEstadoCuentaBanco=isPermiso;
		//this.isPermisoOrdenEstadoCuentaBanco=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoCuentaBanco=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoCuentaBanco=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoCuentaBanco=isPermiso;		
		//this.isPermisoCopiarEstadoCuentaBanco=isPermiso;		
		//this.isPermisoDuplicarEstadoCuentaBanco=isPermiso;
		//this.isPermisoOrdenEstadoCuentaBanco=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoCuentaBancoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EstadoCuentaBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoCuentaBanco(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoCuentaBancoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoCuentaBancoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoCuentaBancoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoCuentaBancoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEstadoCuentaBanco() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoCuentaBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoCuentaBancoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoCuentaBanco=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoCuentaBanco=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoCuentaBanco=this.isPermisoActualizarEstadoCuentaBanco;
			this.isPermisoEliminarEstadoCuentaBanco=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoCuentaBanco=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoCuentaBanco=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoCuentaBanco=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoCuentaBanco=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoCuentaBanco=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoCuentaBanco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoCuentaBanco=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoCuentaBanco=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoCuentaBanco=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoCuentaBanco=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoCuentaBanco=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoCuentaBanco=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoCuentaBanco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoCuentaBanco.setToolTipText(this.jTableDatosEstadoCuentaBanco.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoCuentaBanco(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoCuentaBanco(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoCuentaBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoCuentaBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoCuentaBanco() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyEstadoCuentaBancoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoCuentaBancoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoCuentaBancoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoCuentaBancoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoCuentaBancoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoCuentaBanco()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoCuentaBanco()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoCuentaBanco(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoCuentaBanco()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoCuentaBanco();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoCuentaBanco(EstadoCuentaBanco estadocuentabanco)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoCuentaBanco(EstadoCuentaBanco estadocuentabanco,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoCuentaBanco()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoCuentaBanco()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoCuentaBanco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoCuentaBanco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoCuentaBanco()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoCuentaBanco()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoCuentaBanco(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoCuentaBanco()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoCuentaBancoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoCuentaBancoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoCuentaBancoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadocuentabancoSessionBean=new EstadoCuentaBancoSessionBean(); 
		this.estadocuentabancoConstantesFunciones=new EstadoCuentaBancoConstantesFunciones(); 
		this.estadocuentabancoBean=new EstadoCuentaBanco();//(this.estadocuentabancoConstantesFunciones); 		
		this.estadocuentabancoReturnGeneral=new EstadoCuentaBancoParameterReturnGeneral(); 
		
		this.estadocuentabancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadocuentabancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoCuentaBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoCuentaBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoCuentaBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoCuentaBanco(true);
			
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
			
			this.estadocuentabancoConstantesFunciones=new EstadoCuentaBancoConstantesFunciones(); 
			this.estadocuentabancoBean=new EstadoCuentaBanco();//this.estadocuentabancoConstantesFunciones); 			
			this.estadocuentabancoReturnGeneral=new EstadoCuentaBancoParameterReturnGeneral(); 
		
			EstadoCuentaBancoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Cuenta Banco Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadocuentabanco=new EstadoCuentaBanco();
			this.estadocuentabancos = new ArrayList<EstadoCuentaBanco>();
			this.estadocuentabancosAux = new ArrayList<EstadoCuentaBanco>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic=new EstadoCuentaBancoLogic();
				this.estadocuentabancoLogic.getNewConnexionToDeep("");
			}
			
			//this.estadocuentabancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadocuentabancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoCuentaBanco);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoCuentaBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoCuentaBanco);	
					}
					
					if(this.jInternalFrameImportacionEstadoCuentaBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoCuentaBanco);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoCuentaBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoCuentaBanco);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoCuentaBanco);
				this.jInternalFrameDetalleFormEstadoCuentaBanco.setVisible(false);
				this.jInternalFrameDetalleFormEstadoCuentaBanco.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoCuentaBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoCuentaBanco);
					this.jInternalFrameReporteDinamicoEstadoCuentaBanco.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoCuentaBanco.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoCuentaBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoCuentaBanco);
					this.jInternalFrameImportacionEstadoCuentaBanco.setVisible(false);
					this.jInternalFrameImportacionEstadoCuentaBanco.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoCuentaBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoCuentaBanco);
					this.jInternalFrameOrderByEstadoCuentaBanco.setVisible(false);
					this.jInternalFrameOrderByEstadoCuentaBanco.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoCuentaBancoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoCuentaBancoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadocuentabancoReturnGeneral=new EstadoCuentaBancoParameterReturnGeneral();
			
			this.estadocuentabancoParameterGeneral=new EstadoCuentaBancoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadocuentabancoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoCuentaBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoCuentaBancoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadocuentabancoSessionBean.getEsGuardarRelacionado(),this.estadocuentabancoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoCuentaBancoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadocuentabancoSessionBean.getEsGuardarRelacionado(),this.estadocuentabancoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoCuentaBanco=false;
			this.isVisibilidadCeldaDuplicarEstadoCuentaBanco=true;
			this.isVisibilidadCeldaCopiarEstadoCuentaBanco=true;
			this.isVisibilidadCeldaVerFormEstadoCuentaBanco=true;
			this.isVisibilidadCeldaOrdenEstadoCuentaBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco=false;
			this.isVisibilidadCeldaModificarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaActualizarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaEliminarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaCancelarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaGuardarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoCuentaBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoCuentaBanco();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoCuentaBanco(false);
			
			this.setPermisosUsuarioEstadoCuentaBanco();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado() 
				|| (this.estadocuentabancoSessionBean.getEsGuardarRelacionado() && this.estadocuentabancoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoCuentaBancoClasesRelacionadas();
			}
			
			if(this.estadocuentabancoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoCuentaBancoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoCuentaBanco();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoCuentaBanco();
			}
			
			if(!this.isPermisoBusquedaEstadoCuentaBanco) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoCuentaBanco,this.isPermisoPaginacionMedioEstadoCuentaBanco,this.isPermisoPaginacionTodoEstadoCuentaBanco);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoCuentaBancoConstantesFunciones.getTiposSeleccionarEstadoCuentaBanco());
				
				this.tiposColumnasSelect=EstadoCuentaBancoConstantesFunciones.getTiposSeleccionarEstadoCuentaBanco(true);
				
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
			//if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoCuentaBanco();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoCuentaBanco(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoCuentaBanco(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoCuentaBanco() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadocuentabancoImplementable= (EstadoCuentaBancoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoCuentaBancoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadocuentabancoImplementableHome= (EstadoCuentaBancoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoCuentaBancoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadocuentabancos= new ArrayList<EstadoCuentaBanco>();
			this.estadocuentabancosEliminados= new ArrayList<EstadoCuentaBanco>();
						
			this.isEsNuevoEstadoCuentaBanco=false;
			this.esParaAccionDesdeFormularioEstadoCuentaBanco=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoCuentaBanco(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoCuentaBanco();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoCuentaBancoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoCuentaBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoCuentaBanco(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoCuentaBanco();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoCuentaBanco();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoCuentaBanco(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoCuentaBanco: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoCuentaBanco() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoCuentaBanco")) {
				iIndex=this.jInternalFrameDetalleFormEstadoCuentaBanco.jTabbedPaneRelacionesEstadoCuentaBanco.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoCuentaBanco.jTabbedPaneRelacionesEstadoCuentaBanco.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoCuentaBanco();	
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
	
	public void cargarCombosForeignKeyEstadoCuentaBanco(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoCuentaBanco(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoCuentaBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoCuentaBancoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoCuentaBanco();
		
		this.cargarCombosFrameForeignKeyEstadoCuentaBanco();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoCuentaBanco();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoCuentaBanco();
		}
	}
	
	
	
	public void jButtonNuevoEstadoCuentaBancoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadocuentabancoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
			
			
			if(jTableDatosEstadoCuentaBanco.getRowCount()>=1) {
				jTableDatosEstadoCuentaBanco.removeRowSelectionInterval(0, jTableDatosEstadoCuentaBanco.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoCuentaBanco=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoCuentaBanco(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoCuentaBanco(true);			
			//this.estadocuentabanco=new EstadoCuentaBanco();
			//this.estadocuentabanco.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoCuentaBanco(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoCuentaBanco() ;
			
			if(EstadoCuentaBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoCuentaBanco(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadocuentabanco);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadocuentabanco);				
			
			EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
			
			if(this.estadocuentabancoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoCuentaBanco: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoCuentaBancoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoCuentaBanco> estadocuentabancosSeleccionados=new ArrayList<EstadoCuentaBanco>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoCuentaBanco.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoCuentaBanco.getSelectedRows().length;			
			}
			
			estadocuentabancosSeleccionados=this.getEstadoCuentaBancosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoCuentaBanco--;			
				//EstadoCuentaBanco estadocuentabancoAux= new EstadoCuentaBanco();			
				//estadocuentabancoAux.setId(this.iIdNuevoEstadoCuentaBanco);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoCuentaBanco estadocuentabancoOrigen=new EstadoCuentaBanco();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoCuentaBanco estadocuentabancoOrigen : estadocuentabancosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadocuentabancoOrigen =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadocuentabancoOrigen =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoCuentaBanco();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadocuentabanco.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoCuentaBanco(estadocuentabancoOrigen,this.estadocuentabanco,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuentaBanco(this.estadocuentabanco);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadocuentabancoLogic.getEstadoCuentaBancos().add(this.estadocuentabancoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadocuentabancos.add(this.estadocuentabancoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoCuentaBanco(false);
				
				this.jTableDatosEstadoCuentaBanco.setRowSelectionInterval(this.getIndiceNuevoEstadoCuentaBanco(), this.getIndiceNuevoEstadoCuentaBanco());
				
				int iLastRow =  this.jTableDatosEstadoCuentaBanco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoCuentaBanco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoCuentaBanco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoCuentaBanco(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoCuentaBanco> estadocuentabancosSeleccionados=new ArrayList<EstadoCuentaBanco>();									
		
			EstadoCuentaBanco estadocuentabancoOrigen=new EstadoCuentaBanco();
			EstadoCuentaBanco estadocuentabancoDestino=new EstadoCuentaBanco();
				
			estadocuentabancosSeleccionados=this.getEstadoCuentaBancosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoCuentaBanco.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadocuentabancosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoCuentaBanco.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocuentabancoOrigen =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadocuentabancoOrigen =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocuentabancoDestino =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadocuentabancoDestino =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadocuentabancoOrigen =estadocuentabancosSeleccionados.get(0);
				estadocuentabancoDestino =estadocuentabancosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoCuentaBanco(estadocuentabancoOrigen,estadocuentabancoDestino,true,false);
				
				estadocuentabancoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadocuentabancoDestino,estadocuentabancoLogic.getEstadoCuentaBancos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadocuentabancoDestino,estadocuentabancos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoCuentaBanco(false);
				
				//this.jTableDatosEstadoCuentaBanco.setRowSelectionInterval(this.getIndiceNuevoEstadoCuentaBanco(), this.getIndiceNuevoEstadoCuentaBanco());
				
				int iLastRow =  this.jTableDatosEstadoCuentaBanco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoCuentaBanco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoCuentaBanco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoCuentaBanco(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoCuentaBanco.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoCuentaBanco.isVisible();
			
			
			this.jPanelParametrosReportesEstadoCuentaBanco.setVisible(!isVisible);
			this.jPanelPaginacionEstadoCuentaBanco.setVisible(!isVisible);
			this.jPanelAccionesEstadoCuentaBanco.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoCuentaBanco();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoCuentaBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoCuentaBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoCuentaBanco();
			
			this.abrirFrameOrderByEstadoCuentaBanco();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoCuentaBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoCuentaBanco(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoCuentaBanco);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoCuentaBanco.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoCuentaBanco.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoCuentaBanco.setSize(this.jInternalFrameDetalleFormEstadoCuentaBanco.iWidthFormulario,this.jInternalFrameDetalleFormEstadoCuentaBanco.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoCuentaBanco.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoCuentaBanco.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoCuentaBanco.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoCuentaBanco.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoCuentaBanco.jContentPaneDetalleEstadoCuentaBanco.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoCuentaBanco.jTabbedPaneRelacionesEstadoCuentaBanco.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoCuentaBanco.jContentPaneDetalleEstadoCuentaBanco.getWidth(),EstadoCuentaBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoCuentaBanco.jTabbedPaneRelacionesEstadoCuentaBanco.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoCuentaBanco.jContentPaneDetalleEstadoCuentaBanco.getWidth(),EstadoCuentaBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoCuentaBanco.jTabbedPaneRelacionesEstadoCuentaBanco.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoCuentaBanco.jContentPaneDetalleEstadoCuentaBanco.getWidth(),EstadoCuentaBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoCuentaBanco.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoCuentaBanco.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoCuentaBanco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoCuentaBanco==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoCuentaBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoCuentaBanco,false,this);
				} else {
					this.jInternalFrameOrderByEstadoCuentaBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoCuentaBanco,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoCuentaBanco);
				this.jInternalFrameOrderByEstadoCuentaBanco.setVisible(false);
				this.jInternalFrameOrderByEstadoCuentaBanco.setSelected(false);
				
				this.jInternalFrameOrderByEstadoCuentaBanco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoCuentaBanco"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoCuentaBanco();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoCuentaBanco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoCuentaBanco==null) {
				
				this.jInternalFrameImportacionEstadoCuentaBanco=new ImportacionJInternalFrame(EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoCuentaBanco);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoCuentaBanco);
				this.jInternalFrameImportacionEstadoCuentaBanco.setVisible(false);
				this.jInternalFrameImportacionEstadoCuentaBanco.setSelected(false);


				this.jInternalFrameImportacionEstadoCuentaBanco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoCuentaBanco"));
				this.jInternalFrameImportacionEstadoCuentaBanco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoCuentaBanco"));
				this.jInternalFrameImportacionEstadoCuentaBanco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoCuentaBanco"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoCuentaBanco() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoCuentaBanco==null) {
				this.jInternalFrameReporteDinamicoEstadoCuentaBanco=new ReporteDinamicoJInternalFrame(EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoCuentaBanco);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoCuentaBanco);
				this.jInternalFrameReporteDinamicoEstadoCuentaBanco.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoCuentaBanco.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoCuentaBanco"));
				this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoCuentaBanco"));
				this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoCuentaBanco"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoCuentaBanco();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEstadoCuentaBanco() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoCuentaBanco);
			
	       	this.jInternalFrameDetalleFormEstadoCuentaBanco.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoCuentaBanco.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoCuentaBanco.dispose();
			//this.jInternalFrameDetalleFormEstadoCuentaBanco=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoCuentaBanco() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoCuentaBanco.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoCuentaBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoCuentaBanco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoCuentaBanco.setVisible(true);
	        this.jInternalFrameImportacionEstadoCuentaBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoCuentaBanco() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoCuentaBanco.setVisible(true);
	        this.jInternalFrameOrderByEstadoCuentaBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoCuentaBanco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoCuentaBanco.setVisible(false);
	        this.jInternalFrameOrderByEstadoCuentaBanco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoCuentaBanco() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoCuentaBanco.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoCuentaBanco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoCuentaBanco() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoCuentaBanco.setVisible(false);
	        this.jInternalFrameImportacionEstadoCuentaBanco.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoCuentaBanco(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoCuentaBanco(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoCuentaBanco(true);
			//this.isEsNuevoEstadoCuentaBanco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoCuentaBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoCuentaBanco(false) ;
			
			if(estadocuentabancoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EstadoCuentaBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoCuentaBanco(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoCuentaBanco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoCuentaBancoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoCuentaBanco(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoCuentaBanco(true);
			//this.isEsNuevoEstadoCuentaBanco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadocuentabanco.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoCuentaBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoCuentaBanco(false) ;
			
			if(EstadoCuentaBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoCuentaBanco(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoCuentaBanco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoCuentaBanco(false);
			
			//if(!this.isEsNuevoEstadoCuentaBanco) {								
				int intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoCuentaBanco(this.estadocuentabanco,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuentaBanco(this.estadocuentabanco);
				
			}
			
			if(this.permiteMantenimiento(this.estadocuentabanco)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoCuentaBanco=true;
					this.inicializarActualizarBindingTablaEstadoCuentaBanco(false);
					this.isEsNuevoEstadoCuentaBanco=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoCuentaBanco=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoCuentaBanco=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoCuentaBanco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoCuentaBanco(false);
				
				this.habilitarDeshabilitarControlesEstadoCuentaBanco(false);
			
												
				
				if(EstadoCuentaBancoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoCuentaBanco();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoCuentaBancoActionPerformed(evt,estadocuentabancoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoCuentaBanco(this.estadocuentabanco,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoCuentaBanco.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadocuentabancoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadocuentabanco.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoCuentaBanco.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuentaBanco.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				this.estadocuentabanco.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				this.estadocuentabanco.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadocuentabanco)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoCuentaBancoModel) this.jTableDatosEstadoCuentaBanco.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoCuentaBanco=true;
				this.inicializarActualizarBindingTablaEstadoCuentaBanco(false);
				this.isEsNuevoEstadoCuentaBanco=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoCuentaBanco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoCuentaBanco(false);
				
				this.habilitarDeshabilitarControlesEstadoCuentaBanco(false);
				
				
				
				if(EstadoCuentaBancoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoCuentaBanco();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoCuentaBanco.getRowCount()>=1) {
				jTableDatosEstadoCuentaBanco.removeRowSelectionInterval(0, jTableDatosEstadoCuentaBanco.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoCuentaBanco(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoCuentaBanco(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoCuentaBanco(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoCuentaBanco(false) ;
			
			this.isEsNuevoEstadoCuentaBanco=false;
			
			if(EstadoCuentaBancoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoCuentaBanco();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoCuentaBanco(false);
				
				//SI ES MANUAL
				if(EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoCuentaBanco();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoCuentaBanco--;			
			//EstadoCuentaBanco estadocuentabancoAux= new EstadoCuentaBanco();			
			//estadocuentabancoAux.setId(this.iIdNuevoEstadoCuentaBanco);
			
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoCuentaBanco();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuentaBanco(this.estadocuentabanco);
			
			this.estadocuentabanco.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadocuentabancoLogic.getEstadoCuentaBancos().add(this.estadocuentabancoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadocuentabancos.add(this.estadocuentabancoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoCuentaBanco(false);
			
			this.jTableDatosEstadoCuentaBanco.setRowSelectionInterval(this.getIndiceNuevoEstadoCuentaBanco(), this.getIndiceNuevoEstadoCuentaBanco());
			
			int iLastRow =  this.jTableDatosEstadoCuentaBanco.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoCuentaBanco.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoCuentaBanco.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoCuentaBanco(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoCuentaBanco(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoCuentaBanco(false);
			
			//SI ES MANUAL
			if(EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoCuentaBanco();
			}
			
			//this.abrirFrameTreeEstadoCuentaBanco();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Cuenta BancoS ?", "MANTENIMIENTO DE Estado Cuenta Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoCuentaBanco.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoCuentaBanco();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadocuentabancoReturnGeneral=estadocuentabancoLogic.procesarImportacionEstadoCuentaBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadocuentabancoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoCuentaBancoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoCuentaBanco.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoCuentaBanco.setFileImportacion(this.jInternalFrameImportacionEstadoCuentaBanco.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoCuentaBanco.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoCuentaBanco.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoCuentaBanco.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoCuentaBanco.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoCuentaBanco> estadocuentabancosSeleccionados=new ArrayList<EstadoCuentaBanco>();		

		estadocuentabancosSeleccionados=this.getEstadoCuentaBancosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoCuentaBancoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoCuentaBancoBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoCuentaBancos("Todos",estadocuentabancosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoCuentaBancoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoCuentaBancoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoCuentaBancoConstantesFunciones.LABEL_ESDEFECTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Defecto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Defecto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Defecto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Defecto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoCuentaBancoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoCuentaBancoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case EstadoCuentaBancoConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoria="es_defecto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoCuentaBancoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoCuentaBancoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case EstadoCuentaBancoConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoriaValor="es_defecto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoCuentaBancoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoCuentaBancoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case EstadoCuentaBancoConstantesFunciones.LABEL_ESDEFECTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Defecto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_defecto");
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoCuentaBanco> estadocuentabancosSeleccionados=new ArrayList<EstadoCuentaBanco>();		
		
		estadocuentabancosSeleccionados=this.getEstadoCuentaBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocuentabanco";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoCuentaBancos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoCuentaBancoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoCuentaBancoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoCuentaBanco estadocuentabanco:estadocuentabancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadocuentabanco.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoCuentaBancoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoCuentaBancoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoCuentaBanco estadocuentabanco:estadocuentabancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadocuentabanco.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoCuentaBancoConstantesFunciones.LABEL_ESDEFECTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoCuentaBancoConstantesFunciones.LABEL_ESDEFECTO);
					iRow++;

					for(EstadoCuentaBanco estadocuentabanco:estadocuentabancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadocuentabanco.getes_defecto());
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
			//	this.getFilaCabeceraExportarExcelEstadoCuentaBanco(row);				
			//	iRow++;
			//}				
			
			//for(EstadoCuentaBanco estadocuentabancoAux:estadocuentabancosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoCuentaBanco(estadocuentabancoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadocuentabancoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoCuentaBanco(false);
			
			//SI ES MANUAL
			if(EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoCuentaBanco();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoCuentaBanco(false);
			
			//SI ES MANUAL
			if(EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoCuentaBanco();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoCuentaBanco(false);
			
			//SI ES MANUAL
			if(EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoCuentaBanco();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocuentabancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoCuentaBanco() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoCuentaBanco.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoCuentaBanco.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoCuentaBanco.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoCuentaBanco.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoCuentaBanco.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoCuentaBanco.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoCuentaBanco.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoCuentaBanco(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoCuentaBanco(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoCuentaBanco(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoCuentaBanco(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoCuentaBanco(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoCuentaBanco(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoCuentaBanco(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoCuentaBanco(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoCuentaBanco() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoCuentaBanco();
		
		this.inicializarActualizarBindingBotonesManualEstadoCuentaBanco(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoCuentaBanco();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoCuentaBanco() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoCuentaBanco(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoCuentaBanco(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoCuentaBanco.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoCuentaBanco.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoCuentaBanco.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoCuentaBanco.jCheckBoxPostAccionNuevoEstadoCuentaBanco.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoCuentaBanco.jCheckBoxPostAccionSinCerrarEstadoCuentaBanco.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoCuentaBanco.jCheckBoxPostAccionSinMensajeEstadoCuentaBanco.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoCuentaBanco.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoCuentaBanco.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoCuentaBanco.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {
				this.jInternalFrameDetalleFormEstadoCuentaBanco.jCheckBoxPostAccionNuevoEstadoCuentaBanco.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoCuentaBanco.jCheckBoxPostAccionSinCerrarEstadoCuentaBanco.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoCuentaBanco.jCheckBoxPostAccionSinMensajeEstadoCuentaBanco.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoCuentaBanco.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoCuentaBanco.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoCuentaBanco.jComboBoxTiposAccionesFormularioEstadoCuentaBanco.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoCuentaBanco.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoCuentaBanco!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoCuentaBanco.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoCuentaBanco.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoCuentaBanco.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoCuentaBanco.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoCuentaBanco!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoCuentaBanco.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoCuentaBanco.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoCuentaBanco(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoCuentaBanco(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoCuentaBanco() throws Exception {
		try	{
			if(EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoCuentaBanco();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoCuentaBanco() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jComboBoxTiposAccionesFormularioEstadoCuentaBanco.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jComboBoxTiposAccionesFormularioEstadoCuentaBanco.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoCuentaBanco() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoCuentaBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoCuentaBanco.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoCuentaBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoCuentaBanco.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoCuentaBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoCuentaBanco.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoCuentaBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoCuentaBanco.addItem(reporte);
			}
			
			
			if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoCuentaBanco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoCuentaBanco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoCuentaBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoCuentaBanco.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoCuentaBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoCuentaBanco.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoCuentaBanco.jComboBoxTiposAccionesFormularioEstadoCuentaBanco.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoCuentaBanco.jComboBoxTiposAccionesFormularioEstadoCuentaBanco.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoCuentaBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoCuentaBanco.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoCuentaBanco.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoCuentaBanco();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoCuentaBanco() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoCuentaBanco!=null) {
				this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoCuentaBanco!=null) {
				this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoCuentaBanco!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoCuentaBanco()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoCuentaBanco(Boolean esInicializar) throws Exception {				
		if(EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoCuentaBanco();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoCuentaBanco() throws Exception {
		this.inicializarActualizarBindingTablaEstadoCuentaBanco(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoCuentaBanco() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoCuentaBanco.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoCuentaBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoCuentaBanco.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoCuentaBancoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoCuentaBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoCuentaBanco.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoCuentaBancoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoCuentaBancoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCuentaBancoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoCuentaBancoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoCuentaBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoCuentaBanco.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoCuentaBancoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoCuentaBanco.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoCuentaBanco(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadocuentabancoLogic.getEstadoCuentaBancos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadocuentabancos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoCuentaBanco.setModel(new EstadoCuentaBancoModel(this.estadocuentabancoLogic.getEstadoCuentaBancos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoCuentaBanco.setModel(new EstadoCuentaBancoModel(this.estadocuentabancos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoCuentaBanco!=null && this.jInternalFrameOrderByEstadoCuentaBanco.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoCuentaBanco();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoCuentaBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCuentaBanco,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoCuentaBancoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO,estadocuentabancoConstantesFunciones.resaltarSeleccionarEstadoCuentaBanco,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO,estadocuentabancoConstantesFunciones.resaltarSeleccionarEstadoCuentaBanco,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoCuentaBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCuentaBanco,EstadoCuentaBancoConstantesFunciones.LABEL_ID));

		if(this.estadocuentabancoConstantesFunciones.mostraridEstadoCuentaBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoCuentaBancoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadocuentabancoConstantesFunciones.resaltaridEstadoCuentaBanco,this.estadocuentabancoConstantesFunciones.activaridEstadoCuentaBanco,this,true,"idEstadoCuentaBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadocuentabancoConstantesFunciones.resaltaridEstadoCuentaBanco,this.estadocuentabancoConstantesFunciones.activaridEstadoCuentaBanco,this,true,"idEstadoCuentaBanco","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoCuentaBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCuentaBanco,EstadoCuentaBancoConstantesFunciones.LABEL_CODIGO));

		if(this.estadocuentabancoConstantesFunciones.mostrarcodigoEstadoCuentaBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoCuentaBancoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadocuentabancoConstantesFunciones.resaltarcodigoEstadoCuentaBanco,this.estadocuentabancoConstantesFunciones.activarcodigoEstadoCuentaBanco,this,true,"codigoEstadoCuentaBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadocuentabancoConstantesFunciones.resaltarcodigoEstadoCuentaBanco,this.estadocuentabancoConstantesFunciones.activarcodigoEstadoCuentaBanco,this,true,"codigoEstadoCuentaBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoCuentaBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoCuentaBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCuentaBanco,EstadoCuentaBancoConstantesFunciones.LABEL_NOMBRE));

		if(this.estadocuentabancoConstantesFunciones.mostrarnombreEstadoCuentaBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoCuentaBancoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadocuentabancoConstantesFunciones.resaltarnombreEstadoCuentaBanco,this.estadocuentabancoConstantesFunciones.activarnombreEstadoCuentaBanco,this,true,"nombreEstadoCuentaBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadocuentabancoConstantesFunciones.resaltarnombreEstadoCuentaBanco,this.estadocuentabancoConstantesFunciones.activarnombreEstadoCuentaBanco,this,true,"nombreEstadoCuentaBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoCuentaBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoCuentaBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCuentaBanco,EstadoCuentaBancoConstantesFunciones.LABEL_ESDEFECTO));

		if(this.estadocuentabancoConstantesFunciones.mostrares_defectoEstadoCuentaBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoCuentaBancoConstantesFunciones.LABEL_ESDEFECTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.estadocuentabancoConstantesFunciones.resaltares_defectoEstadoCuentaBanco,this.estadocuentabancoConstantesFunciones.activares_defectoEstadoCuentaBanco));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.estadocuentabancoConstantesFunciones.resaltares_defectoEstadoCuentaBanco,this.estadocuentabancoConstantesFunciones.activares_defectoEstadoCuentaBanco,this,true,"es_defectoEstadoCuentaBanco","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EstadoCuentaBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadocuentabancoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadocuentabancoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoCuentaBanco.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadocuentabancoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadocuentabancoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoCuentaBanco.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoCuentaBanco && this.isPermisoGuardarCambiosEstadoCuentaBanco) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadocuentabancoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadocuentabancoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoCuentaBanco.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoCuentaBanco.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoCuentaBanco && this.isPermisoGuardarCambiosEstadoCuentaBanco) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoCuentaBanco && this.isPermisoGuardarCambiosEstadoCuentaBanco) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoCuentaBanco.moveColumn(this.jTableDatosEstadoCuentaBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoCuentaBanco.moveColumn(this.jTableDatosEstadoCuentaBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoCuentaBanco.moveColumn(this.jTableDatosEstadoCuentaBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoCuentaBanco.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoCuentaBanco.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoCuentaBanco,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoCuentaBanco.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoCuentaBanco.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoCuentaBanco.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoCuentaBanco.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoCuentaBanco.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadocuentabancoLogic.getEstadoCuentaBancos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadocuentabancos.size()-1;
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
		//this.jTableDatosEstadoCuentaBanco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoCuentaBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoCuentaBanco();
			
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
				
				//this.isEsNuevoEstadoCuentaBanco=false;
					
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
			
				if(this.estadocuentabancoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoCuentaBanco==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoCuentaBanco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoCuentaBanco.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadocuentabanco.getsType().equals("DUPLICADO")
				   || this.estadocuentabanco.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoCuentaBanco=true;
				
				} else {
					this.isEsNuevoEstadoCuentaBanco=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
					if(this.estadocuentabanco.getId()>=0 && !this.estadocuentabanco.getIsNew()) {						
						this.isEsNuevoEstadoCuentaBanco=false;
						
					} else {
						this.isEsNuevoEstadoCuentaBanco=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoCuentaBanco(esRelaciones);						
				
				this.seleccionarEstadoCuentaBanco(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadocuentabanco.getId()<0) {
					this.isEsNuevoEstadoCuentaBanco=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoCuentaBanco(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoCuentaBanco(evt,rowIndex);
				}	
				
				if(this.estadocuentabancoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoCuentaBanco: " + this.dDif); 
					}
				}								
				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoCuentaBanco(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadocuentabanco)) {
					if(this.estadocuentabanco.getId()>0) {
						this.estadocuentabanco.setIsDeleted(true);
						
						this.estadocuentabancosEliminados.add(this.estadocuentabanco);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadocuentabancoLogic.getEstadoCuentaBancos().remove(this.estadocuentabanco);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadocuentabancos.remove(this.estadocuentabanco);				
					}
					
					
					((EstadoCuentaBancoModel) this.jTableDatosEstadoCuentaBanco.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoCuentaBanco(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoCuentaBanco(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoCuentaBanco) {
			
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoCuentaBanco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoCuentaBanco.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoCuentaBanco(this.estadocuentabanco);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoCuentaBanco("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoCuentaBanco(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoCuentaBanco() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoCuentaBanco(EstadoCuentaBanco estadocuentabanco) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoCuentaBanco(estadocuentabanco,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoCuentaBanco(EstadoCuentaBanco estadocuentabanco,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoCuentaBanco(estadocuentabanco);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoCuentaBanco(estadocuentabanco,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoCuentaBanco(estadocuentabanco);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoCuentaBanco(EstadoCuentaBanco estadocuentabanco) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldidEstadoCuentaBanco.setText(estadocuentabanco.getId().toString());
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldcodigoEstadoCuentaBanco.setText(estadocuentabanco.getcodigo());
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextAreanombreEstadoCuentaBanco.setText(estadocuentabanco.getnombre());
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jCheckBoxes_defectoEstadoCuentaBanco.setSelected(estadocuentabanco.getes_defecto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoCuentaBanco estadocuentabancoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadocuentabancoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoCuentaBanco estadocuentabancoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadocuentabancoLocal=this.estadocuentabanco;
			} else {
				estadocuentabancoLocal=this.estadocuentabancoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadocuentabancoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoCuentaBanco(estadocuentabancoLocal,true);
					
					if(estadocuentabancoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadocuentabancoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadocuentabancoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoCuentaBanco(EstadoCuentaBanco estadocuentabanco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoCuentaBanco(estadocuentabanco,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuentaBanco(estadocuentabanco);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoCuentaBanco(EstadoCuentaBanco estadocuentabanco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoCuentaBanco(estadocuentabanco,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoCuentaBanco(EstadoCuentaBanco estadocuentabanco,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldidEstadoCuentaBanco.getText()==null || this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldidEstadoCuentaBanco.getText()=="" || this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldidEstadoCuentaBanco.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldidEstadoCuentaBanco.setText("0");
			}

			if(conColumnasBase) {estadocuentabanco.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldidEstadoCuentaBanco.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoCuentaBancoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCuentaBanco.jLabelIdEstadoCuentaBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadocuentabanco.setcodigo(this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldcodigoEstadoCuentaBanco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoCuentaBancoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCuentaBanco.jLabelcodigoEstadoCuentaBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadocuentabanco.setnombre(this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextAreanombreEstadoCuentaBanco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoCuentaBancoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCuentaBanco.jLabelnombreEstadoCuentaBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadocuentabanco.setes_defecto(this.jInternalFrameDetalleFormEstadoCuentaBanco.jCheckBoxes_defectoEstadoCuentaBanco.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoCuentaBancoConstantesFunciones.LABEL_ESDEFECTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCuentaBanco.jLabeles_defectoEstadoCuentaBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoCuentaBanco(EstadoCuentaBanco estadocuentabancoBean,EstadoCuentaBanco estadocuentabanco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoCuentaBanco(EstadoCuentaBanco estadocuentabancoOrigen,EstadoCuentaBanco estadocuentabanco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadocuentabancoOrigen.getId()!=null && !estadocuentabancoOrigen.getId().equals(0L))) {estadocuentabanco.setId(estadocuentabancoOrigen.getId());}}
			if(conDefault || (!conDefault && estadocuentabancoOrigen.getcodigo()!=null && !estadocuentabancoOrigen.getcodigo().equals(""))) {estadocuentabanco.setcodigo(estadocuentabancoOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadocuentabancoOrigen.getnombre()!=null && !estadocuentabancoOrigen.getnombre().equals(""))) {estadocuentabanco.setnombre(estadocuentabancoOrigen.getnombre());}
			if(conDefault || (!conDefault && estadocuentabancoOrigen.getes_defecto()!=null && !estadocuentabancoOrigen.getes_defecto().equals(false))) {estadocuentabanco.setes_defecto(estadocuentabancoOrigen.getes_defecto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoCuentaBanco(EstadoCuentaBanco estadocuentabanco) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldidEstadoCuentaBanco.setText(estadocuentabanco.getId().toString());
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldcodigoEstadoCuentaBanco.setText(estadocuentabanco.getcodigo());
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextAreanombreEstadoCuentaBanco.setText(estadocuentabanco.getnombre());
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jCheckBoxes_defectoEstadoCuentaBanco.setSelected(estadocuentabanco.getes_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoCuentaBanco(EstadoCuentaBancoBean estadocuentabancoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldidEstadoCuentaBanco.setText(estadocuentabancoBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldcodigoEstadoCuentaBanco.setText(estadocuentabancoBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextAreanombreEstadoCuentaBanco.setText(estadocuentabancoBean.getnombre());
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jCheckBoxes_defectoEstadoCuentaBanco.setSelected(estadocuentabancoBean.getes_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoCuentaBanco(EstadoCuentaBancoParameterReturnGeneral estadocuentabancoReturnGeneral,EstadoCuentaBancoBean estadocuentabancoBean,Boolean conDefault) throws Exception { 
		try {
			EstadoCuentaBanco estadocuentabancoLocal=new EstadoCuentaBanco();
			
			estadocuentabancoLocal=estadocuentabancoReturnGeneral.getEstadoCuentaBanco();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadocuentabancoLocal.getId()!=null && !estadocuentabancoLocal.getId().equals(0L))) {estadocuentabancoBean.setId(estadocuentabancoLocal.getId());}}
			if(conDefault || (!conDefault && estadocuentabancoLocal.getcodigo()!=null && !estadocuentabancoLocal.getcodigo().equals(""))) {estadocuentabancoBean.setcodigo(estadocuentabancoLocal.getcodigo());}
			if(conDefault || (!conDefault && estadocuentabancoLocal.getnombre()!=null && !estadocuentabancoLocal.getnombre().equals(""))) {estadocuentabancoBean.setnombre(estadocuentabancoLocal.getnombre());}
			if(conDefault || (!conDefault && estadocuentabancoLocal.getes_defecto()!=null && !estadocuentabancoLocal.getes_defecto().equals(false))) {estadocuentabancoBean.setes_defecto(estadocuentabancoLocal.getes_defecto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoCuentaBancoGenerico(Long idEstadoCuentaBancoSeleccionado,JComboBox jComboBoxEstadoCuentaBanco,List<EstadoCuentaBanco> estadocuentabancosLocal)throws Exception {
		try {
			EstadoCuentaBanco  estadocuentabancoTemp=null;

			for(EstadoCuentaBanco estadocuentabancoAux:estadocuentabancosLocal) {
				if(estadocuentabancoAux.getId()!=null && estadocuentabancoAux.getId().equals(idEstadoCuentaBancoSeleccionado)) {
					estadocuentabancoTemp=estadocuentabancoAux;
					break;
				}
			}

			jComboBoxEstadoCuentaBanco.setSelectedItem(estadocuentabancoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoCuentaBancoGenerico(JComboBox jComboBoxEstadoCuentaBanco,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoCuentaBanco.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoCuentaBanco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoCuentaBanco.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoCuentaBanco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadocuentabanco=(EstadoCuentaBanco) estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadocuentabanco =(EstadoCuentaBanco) estadocuentabancos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoCuentaBanco estadocuentabancoRow=new EstadoCuentaBanco();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadocuentabancoRow=(EstadoCuentaBanco) estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadocuentabancoRow=(EstadoCuentaBanco) estadocuentabancos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoCuentaBanco(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaNuevoEstadoCuentaBanco && this.isPermisoNuevoEstadoCuentaBanco));			
			this.jButtonDuplicarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaDuplicarEstadoCuentaBanco && this.isPermisoDuplicarEstadoCuentaBanco));			
			this.jButtonCopiarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaCopiarEstadoCuentaBanco && this.isPermisoCopiarEstadoCuentaBanco));
			this.jButtonVerFormEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaVerFormEstadoCuentaBanco && this.isPermisoVerFormEstadoCuentaBanco));
			
			this.jButtonAbrirOrderByEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaOrdenEstadoCuentaBanco && this.isPermisoOrdenEstadoCuentaBanco));			
			
			this.jButtonNuevoRelacionesEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco && this.isPermisoNuevoEstadoCuentaBanco));			
			this.jButtonNuevoGuardarCambiosEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaNuevoEstadoCuentaBanco && this.isPermisoNuevoEstadoCuentaBanco && this.isPermisoGuardarCambiosEstadoCuentaBanco));
			
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonModificarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaModificarEstadoCuentaBanco && this.isPermisoActualizarEstadoCuentaBanco));	
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonActualizarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaActualizarEstadoCuentaBanco && this.isPermisoActualizarEstadoCuentaBanco));	
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonEliminarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaEliminarEstadoCuentaBanco && this.isPermisoEliminarEstadoCuentaBanco));
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonCancelarEstadoCuentaBanco.setVisible(this.isVisibilidadCeldaCancelarEstadoCuentaBanco);							
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonGuardarCambiosEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaGuardarEstadoCuentaBanco && this.isPermisoGuardarCambiosEstadoCuentaBanco));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco && this.isPermisoGuardarCambiosEstadoCuentaBanco));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaNuevoEstadoCuentaBanco && this.isPermisoNuevoEstadoCuentaBanco));						
			this.jButtonDuplicarToolBarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaDuplicarEstadoCuentaBanco && this.isPermisoDuplicarEstadoCuentaBanco));						
			this.jButtonCopiarToolBarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaCopiarEstadoCuentaBanco && this.isPermisoCopiarEstadoCuentaBanco));			
			this.jButtonVerFormToolBarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaVerFormEstadoCuentaBanco && this.isPermisoVerFormEstadoCuentaBanco));			
			this.jButtonAbrirOrderByToolBarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaOrdenEstadoCuentaBanco && this.isPermisoOrdenEstadoCuentaBanco));
			this.jButtonNuevoRelacionesToolBarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco && this.isPermisoNuevoEstadoCuentaBanco));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaNuevoEstadoCuentaBanco && this.isPermisoNuevoEstadoCuentaBanco && this.isPermisoGuardarCambiosEstadoCuentaBanco));			
			
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonModificarToolBarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaModificarEstadoCuentaBanco && this.isPermisoActualizarEstadoCuentaBanco));	
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonActualizarToolBarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaActualizarEstadoCuentaBanco  && this.isPermisoActualizarEstadoCuentaBanco));	
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonEliminarToolBarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaEliminarEstadoCuentaBanco && this.isPermisoEliminarEstadoCuentaBanco));
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonCancelarToolBarEstadoCuentaBanco.setVisible(this.isVisibilidadCeldaCancelarEstadoCuentaBanco);				
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonGuardarCambiosToolBarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaGuardarEstadoCuentaBanco && this.isPermisoGuardarCambiosEstadoCuentaBanco));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco && this.isPermisoGuardarCambiosEstadoCuentaBanco));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaNuevoEstadoCuentaBanco && this.isPermisoNuevoEstadoCuentaBanco));			
			this.jMenuItemDuplicarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaDuplicarEstadoCuentaBanco && this.isPermisoDuplicarEstadoCuentaBanco));			
			this.jMenuItemCopiarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaCopiarEstadoCuentaBanco && this.isPermisoCopiarEstadoCuentaBanco));			
			this.jMenuItemVerFormEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaVerFormEstadoCuentaBanco && this.isPermisoVerFormEstadoCuentaBanco));			
			this.jMenuItemAbrirOrderByEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaOrdenEstadoCuentaBanco && this.isPermisoOrdenEstadoCuentaBanco));			
			//this.jMenuItemMostrarOcultarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaOrdenEstadoCuentaBanco && this.isPermisoOrdenEstadoCuentaBanco));
			this.jMenuItemDetalleAbrirOrderByEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaOrdenEstadoCuentaBanco && this.isPermisoOrdenEstadoCuentaBanco));			
			//this.jMenuItemDetalleMostrarOcultarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaOrdenEstadoCuentaBanco && this.isPermisoOrdenEstadoCuentaBanco));			
			this.jMenuItemNuevoRelacionesEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco && this.isPermisoNuevoEstadoCuentaBanco));			
			this.jMenuItemNuevoGuardarCambiosEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaNuevoEstadoCuentaBanco && this.isPermisoNuevoEstadoCuentaBanco && this.isPermisoGuardarCambiosEstadoCuentaBanco));									
			
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jMenuItemModificarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaModificarEstadoCuentaBanco && this.isPermisoActualizarEstadoCuentaBanco));	
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jMenuItemActualizarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaActualizarEstadoCuentaBanco && this.isPermisoActualizarEstadoCuentaBanco));	
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jMenuItemEliminarEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaEliminarEstadoCuentaBanco && this.isPermisoEliminarEstadoCuentaBanco));
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jMenuItemCancelarEstadoCuentaBanco.setVisible(this.isVisibilidadCeldaCancelarEstadoCuentaBanco);				
			}
			
			this.jMenuItemGuardarCambiosEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaGuardarEstadoCuentaBanco && this.isPermisoGuardarCambiosEstadoCuentaBanco));						
			this.jMenuItemGuardarCambiosTablaEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco && this.isPermisoGuardarCambiosEstadoCuentaBanco));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoCuentaBanco=this.jButtonNuevoEstadoCuentaBanco.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoCuentaBanco=this.jButtonDuplicarEstadoCuentaBanco.isVisible();
			this.isVisibilidadCeldaCopiarEstadoCuentaBanco=this.jButtonCopiarEstadoCuentaBanco.isVisible();
			this.isVisibilidadCeldaVerFormEstadoCuentaBanco=this.jButtonVerFormEstadoCuentaBanco.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoCuentaBanco=this.jButtonAbrirOrderByEstadoCuentaBanco.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco=this.jButtonNuevoRelacionesEstadoCuentaBanco.isVisible();
			this.isVisibilidadCeldaModificarEstadoCuentaBanco=this.jButtonModificarEstadoCuentaBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {
			this.isVisibilidadCeldaActualizarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonActualizarEstadoCuentaBanco.isVisible();
			this.isVisibilidadCeldaEliminarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonEliminarEstadoCuentaBanco.isVisible();
			this.isVisibilidadCeldaCancelarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonCancelarEstadoCuentaBanco.isVisible();
			this.isVisibilidadCeldaGuardarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonGuardarCambiosEstadoCuentaBanco.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco=this.jButtonGuardarCambiosTablaEstadoCuentaBanco.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoCuentaBanco=this.jButtonNuevoToolBarEstadoCuentaBanco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco=this.jButtonNuevoRelacionesToolBarEstadoCuentaBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {
			this.isVisibilidadCeldaModificarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonModificarToolBarEstadoCuentaBanco.isVisible();
			this.isVisibilidadCeldaActualizarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonActualizarToolBarEstadoCuentaBanco.isVisible();
			this.isVisibilidadCeldaEliminarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonEliminarToolBarEstadoCuentaBanco.isVisible();
			this.isVisibilidadCeldaCancelarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonCancelarToolBarEstadoCuentaBanco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoCuentaBanco=this.jButtonGuardarCambiosToolBarEstadoCuentaBanco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco=this.jButtonGuardarCambiosTablaToolBarEstadoCuentaBanco.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoCuentaBanco=this.jMenuItemNuevoEstadoCuentaBanco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco=this.jMenuItemNuevoRelacionesEstadoCuentaBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {
			this.isVisibilidadCeldaModificarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jMenuItemModificarEstadoCuentaBanco.isVisible();
			this.isVisibilidadCeldaActualizarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jMenuItemActualizarEstadoCuentaBanco.isVisible();
			this.isVisibilidadCeldaEliminarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jMenuItemEliminarEstadoCuentaBanco.isVisible();
			this.isVisibilidadCeldaCancelarEstadoCuentaBanco=this.jInternalFrameDetalleFormEstadoCuentaBanco.jMenuItemCancelarEstadoCuentaBanco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoCuentaBanco=this.jMenuItemGuardarCambiosEstadoCuentaBanco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco=this.jMenuItemGuardarCambiosTablaEstadoCuentaBanco.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoCuentaBanco(Boolean esInicializar) {
		if(EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadocuentabancoSessionBean.getConGuardarRelaciones()) {
				//if(this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoCuentaBanco();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoCuentaBanco(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoCuentaBanco() {
		this.jButtonNuevoEstadoCuentaBanco.setVisible(this.isPermisoNuevoEstadoCuentaBanco);			
		this.jButtonDuplicarEstadoCuentaBanco.setVisible(this.isPermisoDuplicarEstadoCuentaBanco);			
		this.jButtonCopiarEstadoCuentaBanco.setVisible(this.isPermisoCopiarEstadoCuentaBanco);			
		this.jButtonVerFormEstadoCuentaBanco.setVisible(this.isPermisoVerFormEstadoCuentaBanco);			
		
		this.jButtonAbrirOrderByEstadoCuentaBanco.setVisible(this.isPermisoOrdenEstadoCuentaBanco);					
		
		this.jButtonNuevoRelacionesEstadoCuentaBanco.setVisible(this.isPermisoNuevoEstadoCuentaBanco);			
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonModificarEstadoCuentaBanco.setVisible(this.isPermisoActualizarEstadoCuentaBanco);	
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonActualizarEstadoCuentaBanco.setVisible(this.isPermisoActualizarEstadoCuentaBanco);	
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonEliminarEstadoCuentaBanco.setVisible(this.isPermisoEliminarEstadoCuentaBanco);
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonCancelarEstadoCuentaBanco.setVisible(this.isVisibilidadCeldaCancelarEstadoCuentaBanco);						
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonGuardarCambiosEstadoCuentaBanco.setVisible(this.isPermisoGuardarCambiosEstadoCuentaBanco);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoCuentaBanco.setVisible(this.isPermisoActualizarEstadoCuentaBanco);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoCuentaBanco() {
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonModificarEstadoCuentaBanco.setVisible(this.isPermisoActualizarEstadoCuentaBanco);	
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonActualizarEstadoCuentaBanco.setVisible(this.isPermisoActualizarEstadoCuentaBanco);	
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonEliminarEstadoCuentaBanco.setVisible(this.isPermisoEliminarEstadoCuentaBanco);
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonCancelarEstadoCuentaBanco.setVisible(this.isVisibilidadCeldaCancelarEstadoCuentaBanco);							
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonGuardarCambiosEstadoCuentaBanco.setVisible((this.isVisibilidadCeldaGuardarEstadoCuentaBanco && this.isPermisoGuardarCambiosEstadoCuentaBanco));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoCuentaBanco() {
		if(EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoCuentaBanco();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoCuentaBanco() {
	}
	
	public void jTableDatosEstadoCuentaBancoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoCuentaBanco(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoCuentaBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoCuentaBanco(this.getestadocuentabanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuentaBanco(this.estadocuentabanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadocuentabanco==null) {
						this.estadocuentabanco = new EstadoCuentaBanco();
					}

					this.setVariablesFormularioToObjetoActualEstadoCuentaBanco(this.estadocuentabanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuentaBanco(this.estadocuentabanco);
				}

				if(this.estadocuentabanco.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadocuentabanco.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoCuentaBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoCuentaBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoCuentaBanco(this.getestadocuentabanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuentaBanco(this.estadocuentabanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadocuentabanco==null) {
						this.estadocuentabanco = new EstadoCuentaBanco();
					}

					this.setVariablesFormularioToObjetoActualEstadoCuentaBanco(this.estadocuentabanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuentaBanco(this.estadocuentabanco);
				}

				if(this.estadocuentabanco.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadocuentabanco.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoCuentaBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoCuentaBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoCuentaBanco(this.getestadocuentabanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuentaBanco(this.estadocuentabanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadocuentabanco==null) {
						this.estadocuentabanco = new EstadoCuentaBanco();
					}

					this.setVariablesFormularioToObjetoActualEstadoCuentaBanco(this.estadocuentabanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuentaBanco(this.estadocuentabanco);
				}

				if(this.estadocuentabanco.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadocuentabanco.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoCuentaBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_defectoEstadoCuentaBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoCuentaBanco(this.getestadocuentabanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuentaBanco(this.estadocuentabanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadocuentabanco==null) {
						this.estadocuentabanco = new EstadoCuentaBanco();
					}

					this.setVariablesFormularioToObjetoActualEstadoCuentaBanco(this.estadocuentabanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuentaBanco(this.estadocuentabanco);
				}

				if(this.estadocuentabanco.getes_defecto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_defecto = "+this.estadocuentabanco.getes_defecto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoCuentaBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoCuentaBanco() {
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoCuentaBanco.dispose();
			this.jInternalFrameDetalleFormEstadoCuentaBanco=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoCuentaBanco!=null) {
			this.jInternalFrameReporteDinamicoEstadoCuentaBanco.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoCuentaBanco.dispose();
			this.jInternalFrameReporteDinamicoEstadoCuentaBanco=null;
		}
		
		if(this.jInternalFrameImportacionEstadoCuentaBanco!=null) {
			this.jInternalFrameImportacionEstadoCuentaBanco.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoCuentaBanco.dispose();
			this.jInternalFrameImportacionEstadoCuentaBanco=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoCuentaBanco();
			
			EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoCuentaBanco")) {
				jButtonNuevoEstadoCuentaBancoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoCuentaBanco")) {
				jButtonDuplicarEstadoCuentaBancoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoCuentaBanco")) {
				jButtonCopiarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoCuentaBanco")) {
				jButtonVerFormEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoCuentaBanco")) {
				jButtonNuevoEstadoCuentaBancoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoCuentaBanco")) {
				jButtonDuplicarEstadoCuentaBancoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoCuentaBanco")) {
				jButtonNuevoEstadoCuentaBancoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoCuentaBanco")) {
				jButtonDuplicarEstadoCuentaBancoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoCuentaBanco")) {
				jButtonNuevoEstadoCuentaBancoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoCuentaBanco")) {
				jButtonNuevoEstadoCuentaBancoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoCuentaBanco")) {
				jButtonNuevoEstadoCuentaBancoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoCuentaBanco")) {
				jButtonModificarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoCuentaBanco")) {
				jButtonModificarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoCuentaBanco")) {
				jButtonModificarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoCuentaBanco")) {
				jButtonActualizarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoCuentaBanco")) {
				jButtonActualizarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoCuentaBanco")) {
				jButtonActualizarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoCuentaBanco")) {
				jButtonEliminarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoCuentaBanco")) {
				jButtonEliminarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoCuentaBanco")) {
				jButtonEliminarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoCuentaBanco")) {
				jButtonCancelarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoCuentaBanco")) {
				jButtonCancelarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoCuentaBanco")) {
				jButtonCancelarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoCuentaBanco")) {
				jButtonCerrarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoCuentaBanco")) {
				jButtonCerrarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoCuentaBanco")) {
				jButtonCerrarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoCuentaBanco")) {
				jButtonMostrarOcultarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoCuentaBanco")) {
				jButtonCancelarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoCuentaBanco")) {
				jButtonGuardarCambiosEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoCuentaBanco")) {
				jButtonGuardarCambiosEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoCuentaBanco")) {
				jButtonCopiarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoCuentaBanco")) {
				jButtonVerFormEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoCuentaBanco")) {
				jButtonGuardarCambiosEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoCuentaBanco")) {
				jButtonCopiarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoCuentaBanco")) {
				jButtonVerFormEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoCuentaBanco")) {
				jButtonGuardarCambiosEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoCuentaBanco")) {
				jButtonGuardarCambiosEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoCuentaBanco")) {
				jButtonGuardarCambiosEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoCuentaBanco")) {
				jButtonRecargarInformacionEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoCuentaBanco")) {
				jButtonRecargarInformacionEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoCuentaBanco")) {
				jButtonRecargarInformacionEstadoCuentaBancoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoCuentaBanco")) {
				jButtonAnterioresEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoCuentaBanco")) {
				jButtonAnterioresEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoCuentaBanco")) {
				jButtonAnterioresEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoCuentaBanco")) {
				jButtonSiguientesEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoCuentaBanco")) {
				jButtonSiguientesEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoCuentaBanco")) {
				jButtonSiguientesEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoCuentaBanco") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoCuentaBanco")) {
				jButtonAbrirOrderByEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoCuentaBanco") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoCuentaBanco")) {
				jButtonMostrarOcultarEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoCuentaBanco")) {
				jButtonNuevoGuardarCambiosEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoCuentaBanco")) {
				jButtonNuevoGuardarCambiosEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoCuentaBanco")) {
				jButtonNuevoGuardarCambiosEstadoCuentaBancoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoCuentaBanco")) {
				jButtonCerrarReporteDinamicoEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoCuentaBanco")) {
				jButtonGenerarReporteDinamicoEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoCuentaBanco")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoCuentaBanco")) {
				jButtonCerrarImportacionEstadoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoCuentaBanco")) {
				
				jButtonGenerarImportacionEstadoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoCuentaBanco")) {
				
				jButtonAbrirImportacionEstadoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoCuentaBanco")) {
				jComboBoxTiposAccionesEstadoCuentaBancoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoCuentaBanco")) {
				jComboBoxTiposRelacionesEstadoCuentaBancoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoCuentaBanco")) {
				jComboBoxTiposAccionesEstadoCuentaBancoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoCuentaBanco")) {
				
				jComboBoxTiposSeleccionarEstadoCuentaBancoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoCuentaBanco")) {
				jTextFieldValorCampoGeneralEstadoCuentaBancoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoCuentaBanco")) {
				jButtonAbrirOrderByEstadoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoCuentaBanco")) {
				jButtonAbrirOrderByEstadoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoCuentaBanco")) {
				jButtonCerrarOrderByEstadoCuentaBancoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoCuentaBancoBusqueda")) {
				this.jButtonidEstadoCuentaBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoCuentaBancoBusqueda")) {
				this.jButtoncodigoEstadoCuentaBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoCuentaBancoBusqueda")) {
				this.jButtonnombreEstadoCuentaBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoEstadoCuentaBancoBusqueda")) {
				this.jButtones_defectoEstadoCuentaBancoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoCuentaBanco();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCuentaBancoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuentabanco);
				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
				
				


				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuentaBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuentaBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoCuentaBanco estadocuentabancoLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadocuentabancoLocal=this.estadocuentabanco;
			} else {
				estadocuentabancoLocal=this.estadocuentabancoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuentabanco);
				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
							
				
				


				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuentaBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuentaBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCuentaBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoAnterior =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocuentabancoAnterior =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
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
			
			EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
			
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
			
			


			
			EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCuentaBancoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuentabanco);
				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
								
						
				


				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuentaBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuentaBanco.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuentabanco);
				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
								
				
				


				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuentaBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuentaBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCuentaBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoAnterior =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocuentabancoAnterior =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuentabanco);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCuentaBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoAnterior =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocuentabancoAnterior =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCuentaBancoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuentabanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadocuentabanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuentabanco);
				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
							
				
				


				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuentaBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuentaBanco.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCuentaBancoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocuentabancoAnterior =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadocuentabancoAnterior =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
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
			
			EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
			
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
			
			


			
			EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCuentaBancoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuentabanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadocuentabanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuentabanco);
				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
								
				
				


				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuentaBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuentaBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCuentaBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoAnterior =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocuentabancoAnterior =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCuentaBancoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuentabanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadocuentabanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCuentaBancoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuentabanco);
				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoCuentaBanco")) {
					jCheckBoxSeleccionarTodosEstadoCuentaBancoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoCuentaBanco")) {
					jCheckBoxSeleccionadosEstadoCuentaBancoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoCuentaBanco")) {
					
				}
				
				


				
				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuentaBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuentaBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuentabanco);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadocuentabanco);
				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
												
				
				


				
				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuentaBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuentaBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCuentaBancoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocuentabancoAnterior =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadocuentabancoAnterior =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCuentaBancoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuentabanco);
				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
				
				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
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
			
			EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
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
			
			


			
			EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCuentaBancoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuentabanco);
				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuentaBanco.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuentaBanco.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocuentabanco);
				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
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
				
				


				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCuentaBanco.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCuentaBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCuentaBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocuentabancoAnterior =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocuentabancoAnterior =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoCuentaBanco")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoCuentaBancoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoCuentaBanco.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadocuentabanco =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadocuentabanco);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoCuentaBanco")) {
				
				}
				
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoCuentaBanco")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoCuentaBanco.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoCuentaBanco")) {
			
			}
			
			EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoCuentaBanco();
			
			EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoCuentaBanco")) {
				jButtonNuevoEstadoCuentaBancoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoCuentaBanco")) {
				jButtonDuplicarEstadoCuentaBancoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoCuentaBanco")) {
				jButtonCopiarEstadoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoCuentaBanco")) {
				jButtonVerFormEstadoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoCuentaBanco")) {
				jButtonNuevoEstadoCuentaBancoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoCuentaBanco")) {
				jButtonModificarEstadoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoCuentaBanco")) {
				jButtonActualizarEstadoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoCuentaBanco")) {
				jButtonEliminarEstadoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoCuentaBanco")) {
				jButtonGuardarCambiosEstadoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoCuentaBanco")) {
				jButtonCancelarEstadoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoCuentaBanco")) {
				jButtonCerrarEstadoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoCuentaBanco")) {
				jButtonGuardarCambiosEstadoCuentaBancoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoCuentaBanco")) {
				jButtonNuevoGuardarCambiosEstadoCuentaBancoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoCuentaBanco")) {
				jButtonAbrirOrderByEstadoCuentaBancoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoCuentaBanco")) {
				jButtonRecargarInformacionEstadoCuentaBancoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoCuentaBanco")) {
				jButtonAnterioresEstadoCuentaBancoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoCuentaBanco")) {
				jButtonSiguientesEstadoCuentaBancoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoCuentaBancoBusqueda")) {
				this.jButtonidEstadoCuentaBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoCuentaBancoBusqueda")) {
				this.jButtoncodigoEstadoCuentaBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoCuentaBancoBusqueda")) {
				this.jButtonnombreEstadoCuentaBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoEstadoCuentaBancoBusqueda")) {
				this.jButtones_defectoEstadoCuentaBancoBusquedaActionPerformed(evt);
			}
			
			EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoCuentaBanco();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoCuentaBanco")) {
				closingInternalFrameEstadoCuentaBanco();
				
			} else if(sTipo.equals("jButtonCancelarEstadoCuentaBanco")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoCuentaBanco = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoCuentaBancoBeanSwingJInternalFrame jInternalFrameParent=(EstadoCuentaBancoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoCuentaBanco.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoCuentaBancoActionPerformed(null);
			}
			
			EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadocuentabanco,new Object(),this.estadocuentabancoParameterGeneral,this.estadocuentabancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoCuentaBanco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoCuentaBanco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoCuentaBanco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadocuentabanco)) {
			if(!esControlTabla) {
				if(EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoCuentaBanco(this.estadocuentabanco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuentaBanco(this.estadocuentabanco);			
				}
				
				if(this.estadocuentabancoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoCuentaBanco(this.estadocuentabanco,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadocuentabancoReturnGeneral=estadocuentabancoLogic.procesarEventosEstadoCuentaBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadocuentabancoLogic.getEstadoCuentaBancos(),this.estadocuentabanco,this.estadocuentabancoParameterGeneral,this.isEsNuevoEstadoCuentaBanco,classes);//this.estadocuentabancoLogic.getEstadoCuentaBanco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoCuentaBanco(this.estadocuentabancoReturnGeneral,this.estadocuentabancoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadocuentabancoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoCuentaBanco(classes,this.estadocuentabancoReturnGeneral,this.estadocuentabancoBean,false);
					}
						
					if(this.estadocuentabancoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoCuentaBanco(this.estadocuentabancoReturnGeneral.getEstadoCuentaBanco());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoCuentaBanco(this.estadocuentabancoReturnGeneral.getEstadoCuentaBanco());	
					}
						
					if(this.estadocuentabancoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoCuentaBanco(this.estadocuentabancoReturnGeneral.getEstadoCuentaBanco(),classes);//this.estadocuentabancoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoCuentaBanco(this.estadocuentabanco,classes);//this.estadocuentabancoBean);									
				}
			
				if(EstadoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoCuentaBanco(this.estadocuentabanco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCuentaBanco(this.estadocuentabanco);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadocuentabancoAnterior!=null) {
						this.estadocuentabanco=this.estadocuentabancoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadocuentabancoReturnGeneral=estadocuentabancoLogic.procesarEventosEstadoCuentaBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadocuentabancoLogic.getEstadoCuentaBancos(),this.estadocuentabanco,this.estadocuentabancoParameterGeneral,this.isEsNuevoEstadoCuentaBanco,classes);//this.estadocuentabancoLogic.getEstadoCuentaBanco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadocuentabancoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadocuentabancoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadocuentabancoReturnGeneral.getEstadoCuentaBanco(),estadocuentabancoLogic.getEstadoCuentaBancos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadocuentabancoReturnGeneral.getEstadoCuentaBanco(),this.estadocuentabancos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoCuentaBanco.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoCuentaBanco.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoCuentaBanco();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoCuentaBanco() throws Exception {
		
		EstadoCuentaBancoModel estadocuentabancoModel=(EstadoCuentaBancoModel)this.jTableDatosEstadoCuentaBanco.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadocuentabancoModel.estadocuentabancos=this.estadocuentabancoLogic.getEstadoCuentaBancos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadocuentabancoModel.estadocuentabancos=this.estadocuentabancos;
		}
		
		
		((EstadoCuentaBancoModel) this.jTableDatosEstadoCuentaBanco.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoCuentaBanco() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadocuentabancoAnterior(),this.estadocuentabancoLogic.getEstadoCuentaBancos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadocuentabancoAnterior(),this.estadocuentabancos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoCuentaBanco();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoCuentaBanco(EstadoCuentaBanco estadocuentabanco,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
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
										
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadocuentabanco,new Object(),generalEntityParameterGeneral,this.estadocuentabancoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadocuentabancoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoCuentaBancoConstantesFunciones.getClassesRelationshipsOfEstadoCuentaBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoCuentaBancoConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoCuentaBanco(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoCuentaBanco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadocuentabanco,new Object(),generalEntityParameterGeneral,this.estadocuentabancoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoCuentaBanco(EstadoCuentaBancoBean estadocuentabancoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoCuentaBanco(ArrayList<Classe> classes,EstadoCuentaBancoReturnGeneral estadocuentabancoReturnGeneral,EstadoCuentaBancoBean estadocuentabancoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoCuentaBanco(EstadoCuentaBanco estadocuentabanco,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadocuentabanco)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoCuentaBanco = new EstadoCuentaBancoDetalleFormJInternalFrame(jDesktopPane,this.estadocuentabancoSessionBean.getConGuardarRelaciones(),this.estadocuentabancoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoCuentaBanco);
		this.jInternalFrameDetalleFormEstadoCuentaBanco.setVisible(false);
		this.jInternalFrameDetalleFormEstadoCuentaBanco.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoCuentaBanco.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoCuentaBanco.estadocuentabancoLogic=this.estadocuentabancoLogic;
		
		this.cargarCombosFrameForeignKeyEstadoCuentaBanco("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoCuentaBanco();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoCuentaBanco();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoCuentaBanco("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoCuentaBanco();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoCuentaBanco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoCuentaBanco"));
		
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonModificarEstadoCuentaBanco.addActionListener(new ButtonActionListener(this,"ModificarEstadoCuentaBanco"));

		
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonModificarToolBarEstadoCuentaBanco.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoCuentaBanco"));
					
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jMenuItemModificarEstadoCuentaBanco.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoCuentaBanco"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonActualizarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"ActualizarEstadoCuentaBanco"));
		
		
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonActualizarToolBarEstadoCuentaBanco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoCuentaBanco"));
						
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jMenuItemActualizarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoCuentaBanco"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonEliminarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"EliminarEstadoCuentaBanco"));
		
		
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonEliminarToolBarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoCuentaBanco"));
								
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jMenuItemEliminarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoCuentaBanco"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonCancelarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"CancelarEstadoCuentaBanco"));
		
		
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonCancelarToolBarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoCuentaBanco"));
					
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jMenuItemCancelarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoCuentaBanco"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jMenuItemDetalleCerrarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoCuentaBanco"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonGuardarCambiosToolBarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoCuentaBanco"));
		
		
		
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonGuardarCambiosToolBarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoCuentaBanco"));
		
		
		
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jComboBoxTiposAccionesFormularioEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoCuentaBanco"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonidEstadoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoCuentaBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtoncodigoEstadoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoCuentaBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonnombreEstadoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoCuentaBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtones_defectoEstadoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoEstadoCuentaBancoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jTabbedPaneRelacionesEstadoCuentaBanco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoCuentaBanco"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoCuentaBanco"));
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoCuentaBanco"));
		}
		
		this.jTableDatosEstadoCuentaBanco.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoCuentaBanco"));
		
		this.jTableDatosEstadoCuentaBanco.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoCuentaBanco"));
		
		this.jButtonNuevoEstadoCuentaBanco.addActionListener(new ButtonActionListener(this,"NuevoEstadoCuentaBanco"));
		
		this.jButtonDuplicarEstadoCuentaBanco.addActionListener(new ButtonActionListener(this,"DuplicarEstadoCuentaBanco"));
		
		this.jButtonCopiarEstadoCuentaBanco.addActionListener(new ButtonActionListener(this,"CopiarEstadoCuentaBanco"));
		
		this.jButtonVerFormEstadoCuentaBanco.addActionListener(new ButtonActionListener(this,"VerFormEstadoCuentaBanco"));
		
		
		this.jButtonNuevoToolBarEstadoCuentaBanco.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoCuentaBanco"));
			
		this.jButtonDuplicarToolBarEstadoCuentaBanco.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoCuentaBanco"));
			
		this.jMenuItemNuevoEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoCuentaBanco"));
			
		this.jMenuItemDuplicarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoCuentaBanco"));		
		
		
		this.jButtonNuevoRelacionesEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoCuentaBanco"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoCuentaBanco.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoCuentaBanco"));
			
		this.jMenuItemNuevoRelacionesEstadoCuentaBanco.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoCuentaBanco"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonModificarEstadoCuentaBanco.addActionListener(new ButtonActionListener(this,"ModificarEstadoCuentaBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonModificarToolBarEstadoCuentaBanco.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoCuentaBanco"));
			
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jMenuItemModificarEstadoCuentaBanco.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoCuentaBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonActualizarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"ActualizarEstadoCuentaBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonActualizarToolBarEstadoCuentaBanco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoCuentaBanco"));
				
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jMenuItemActualizarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoCuentaBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonEliminarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"EliminarEstadoCuentaBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonEliminarToolBarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoCuentaBanco"));
						
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jMenuItemEliminarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoCuentaBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonCancelarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"CancelarEstadoCuentaBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonCancelarToolBarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoCuentaBanco"));
			
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jMenuItemCancelarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoCuentaBanco"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoCuentaBanco"));		
		
		
		this.jButtonCerrarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"CerrarEstadoCuentaBanco"));
		
		
		this.jButtonCerrarToolBarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoCuentaBanco"));
			
		this.jMenuItemCerrarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoCuentaBanco"));
			
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jMenuItemDetalleCerrarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoCuentaBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonGuardarCambiosEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoCuentaBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonGuardarCambiosToolBarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoCuentaBanco"));
		}
		
		this.jButtonCopiarToolBarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoCuentaBanco"));
			
		this.jButtonVerFormToolBarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoCuentaBanco"));
		
		this.jMenuItemGuardarCambiosEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoCuentaBanco"));
			
		this.jMenuItemCopiarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoCuentaBanco"));		
		
		this.jMenuItemVerFormEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoCuentaBanco"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoCuentaBanco"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoCuentaBanco"));
			
		this.jMenuItemGuardarCambiosTablaEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoCuentaBanco"));		
		
		
		
		this.jButtonRecargarInformacionEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoCuentaBanco"));
					
		this.jButtonRecargarInformacionToolBarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoCuentaBanco"));
		
		this.jMenuItemRecargarInformacionEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoCuentaBanco"));		
		
		
		
		this.jButtonAnterioresEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"AnterioresEstadoCuentaBanco"));
		
		
		this.jButtonAnterioresToolBarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoCuentaBanco"));
		
		this.jMenuItemAnterioresEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoCuentaBanco"));		
		
		
		this.jButtonSiguientesEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"SiguientesEstadoCuentaBanco"));
		
		
		this.jButtonSiguientesToolBarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoCuentaBanco"));
			
		this.jMenuItemSiguientesEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoCuentaBanco"));
			
		this.jMenuItemAbrirOrderByEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoCuentaBanco"));
			
		this.jMenuItemMostrarOcultarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoCuentaBanco"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoCuentaBanco"));
			
		this.jMenuItemDetalleMostarOcultarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoCuentaBanco"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoCuentaBanco"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoCuentaBanco"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoCuentaBanco"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoCuentaBanco.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoCuentaBanco"));

		this.jCheckBoxSeleccionadosEstadoCuentaBanco.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoCuentaBanco"));
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jComboBoxTiposAccionesFormularioEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoCuentaBanco"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoCuentaBanco"));
			
		this.jComboBoxTiposAccionesEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoCuentaBanco"));
					
		this.jComboBoxTiposSeleccionarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoCuentaBanco"));
			
		this.jTextFieldValorCampoGeneralEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoCuentaBanco"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonidEstadoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoCuentaBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtoncodigoEstadoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoCuentaBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonnombreEstadoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoCuentaBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtones_defectoEstadoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoEstadoCuentaBancoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoCuentaBanco!=null) {
				this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoCuentaBanco"));
				this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoCuentaBanco"));
				this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoCuentaBanco"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoCuentaBanco"));				
			//this.jButtonGenerarReporteDinamicoEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoCuentaBanco"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoCuentaBanco"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoCuentaBanco!=null) {
				this.jInternalFrameImportacionEstadoCuentaBanco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoCuentaBanco"));
				this.jInternalFrameImportacionEstadoCuentaBanco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoCuentaBanco"));
				this.jInternalFrameImportacionEstadoCuentaBanco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoCuentaBanco"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoCuentaBanco"));
			
			this.jButtonAbrirOrderByToolBarEstadoCuentaBanco.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoCuentaBanco"));			
			
			if(this.jInternalFrameOrderByEstadoCuentaBanco!=null) {
				this.jInternalFrameOrderByEstadoCuentaBanco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoCuentaBanco"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCuentaBanco.jTabbedPaneRelacionesEstadoCuentaBanco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoCuentaBanco"));
		
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
            		closingInternalFrameEstadoCuentaBanco();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoCuentaBanco.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoCuentaBanco = (JInternalFrameBase)event.getSource();
	            	
	            EstadoCuentaBancoBeanSwingJInternalFrame jInternalFrameParent=(EstadoCuentaBancoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoCuentaBanco.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoCuentaBancoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoCuentaBanco.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoCuentaBancoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoCuentaBanco.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoCuentaBanco.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoCuentaBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoCuentaBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoCuentaBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoCuentaBanco";
		inputMap = this.jButtonNuevoEstadoCuentaBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoCuentaBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoCuentaBancoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoCuentaBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoCuentaBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoCuentaBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoCuentaBanco";
		inputMap = this.jButtonNuevoRelacionesEstadoCuentaBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoCuentaBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoCuentaBancoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoCuentaBanco";
		inputMap = this.jButtonModificarEstadoCuentaBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoCuentaBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoCuentaBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoCuentaBanco";
		inputMap = this.jButtonActualizarEstadoCuentaBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoCuentaBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoCuentaBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoCuentaBanco";
		inputMap = this.jButtonEliminarEstadoCuentaBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoCuentaBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoCuentaBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoCuentaBanco";
		inputMap = this.jButtonCancelarEstadoCuentaBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoCuentaBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoCuentaBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoCuentaBanco";
		inputMap = this.jButtonCerrarEstadoCuentaBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoCuentaBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoCuentaBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonGuardarCambiosEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoCuentaBanco";
		inputMap = this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonGuardarCambiosEstadoCuentaBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonGuardarCambiosEstadoCuentaBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoCuentaBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoCuentaBanco.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoCuentaBancoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoCuentaBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoCuentaBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoCuentaBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoCuentaBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoCuentaBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoCuentaBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonidEstadoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoCuentaBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtoncodigoEstadoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoCuentaBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtonnombreEstadoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoCuentaBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jButtones_defectoEstadoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoEstadoCuentaBancoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoCuentaBancoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoCuentaBanco.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoCuentaBanco(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoCuentaBanco estadocuentabancoAux:this.estadocuentabancoLogic.getEstadoCuentaBancos()) {
					estadocuentabancoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoCuentaBanco estadocuentabancoAux:estadocuentabancos) {
					estadocuentabancoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoCuentaBancoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoCuentaBanco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoCuentaBanco estadocuentabancoAux:this.estadocuentabancoLogic.getEstadoCuentaBancos()) {
						estadocuentabancoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoCuentaBanco estadocuentabancoAux:estadocuentabancos) {
						estadocuentabancoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoCuentaBanco estadocuentabancoAux:this.estadocuentabancoLogic.getEstadoCuentaBancos()) {
					
						if(sTipoSeleccionar.equals(EstadoCuentaBancoConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							estadocuentabancoAux.setes_defecto(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoCuentaBanco estadocuentabancoAux:estadocuentabancos) {
						
						if(sTipoSeleccionar.equals(EstadoCuentaBancoConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							estadocuentabancoAux.setes_defecto(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoCuentaBanco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoCuentaBanco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoCuentaBanco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoCuentaBanco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoCuentaBancoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoCuentaBanco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoCuentaBanco.getSelectedRows();
			
			EstadoCuentaBanco estadocuentabancoLocal=new EstadoCuentaBanco();
			
			//this.seleccionarTodosEstadoCuentaBanco(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadocuentabancoLocal =(EstadoCuentaBanco) this.estadocuentabancoLogic.getEstadoCuentaBancos().toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadocuentabancoLocal =(EstadoCuentaBanco) this.estadocuentabancos.toArray()[this.jTableDatosEstadoCuentaBanco.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadocuentabancoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoCuentaBanco estadocuentabancoAux:this.estadocuentabancoLogic.getEstadoCuentaBancos()) {
						estadocuentabancoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoCuentaBanco estadocuentabancoAux:estadocuentabancos) {
						estadocuentabancoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoCuentaBanco(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoCuentaBanco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoCuentaBanco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoCuentaBanco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoCuentaBancoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoCuentaBancoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoCuentaBancoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoCuentaBanco(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoCuentaBanco.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoCuentaBanco estadocuentabancoAux:this.estadocuentabancoLogic.getEstadoCuentaBancos()) {
				
						if(sTipoSeleccionar.equals(EstadoCuentaBancoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadocuentabancoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoCuentaBancoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadocuentabancoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoCuentaBanco estadocuentabancoAux:estadocuentabancos) {
					
						if(sTipoSeleccionar.equals(EstadoCuentaBancoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadocuentabancoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoCuentaBancoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadocuentabancoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoCuentaBanco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoCuentaBancoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoCuentaBanco(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoCuentaBanco=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoCuentaBanco.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoCuentaBanco.jComboBoxTiposAccionesFormularioEstadoCuentaBanco.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoCuentaBanco) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoCuentaBanco(conSplash);
				
					this.generarReporteEstadoCuentaBancosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoCuentaBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoCuentaBanco.jComboBoxTiposAccionesFormularioEstadoCuentaBanco.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoCuentaBancosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoCuentaBanco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoCuentaBancosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoCuentaBanco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoCuentaBancosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoCuentaBanco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoCuentaBanco();
				
				this.exportarEstadoCuentaBancosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoCuentaBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoCuentaBanco.jComboBoxTiposAccionesFormularioEstadoCuentaBanco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoCuentaBancos();
				//this.importarEstadoCuentaBancos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoCuentaBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoCuentaBanco.jComboBoxTiposAccionesFormularioEstadoCuentaBanco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoCuentaBanco();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoCuentaBancosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoCuentaBanco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Cuenta Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoCuentaBanco();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoCuentaBanco)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoCuentaBanco(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoCuentaBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoCuentaBanco.jComboBoxTiposAccionesFormularioEstadoCuentaBanco.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoCuentaBanco();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoCuentaBanco(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoCuentaBancoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoCuentaBanco();
			
			if(this.jInternalFrameDetalleFormEstadoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoCuentaBanco> estadocuentabancosSeleccionados=new ArrayList<EstadoCuentaBanco>();		
			EstadoCuentaBanco estadocuentabanco=new EstadoCuentaBanco();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoCuentaBanco(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoCuentaBanco.getSelectedItem();
			
			
			
			
			estadocuentabancosSeleccionados=this.getEstadoCuentaBancosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadocuentabancosSeleccionados.size()==1) {
				for(EstadoCuentaBanco estadocuentabancoAux:estadocuentabancosSeleccionados) {
					estadocuentabanco=estadocuentabancoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoCuentaBanco();
			
      		//this.finishProcessEstadoCuentaBanco(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoCuentaBancoReturnGeneral() throws Exception {
		if(this.estadocuentabancoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadocuentabancoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadocuentabancoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadocuentabancoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadocuentabancoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadocuentabancoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoCuentaBanco(false);
		}
		
		if(this.estadocuentabancoReturnGeneral.getConRetornoLista() || this.estadocuentabancoReturnGeneral.getConRetornoObjeto()) {
			if(this.estadocuentabancoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadocuentabancoLogic.setEstadoCuentaBancos(this.estadocuentabancoReturnGeneral.getEstadoCuentaBancos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadocuentabancoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadocuentabancoLogic.setEstadoCuentaBanco(this.estadocuentabancoReturnGeneral.getEstadoCuentaBanco());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoCuentaBanco(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoCuentaBanco() throws Exception {
		
		
	}
	
	public ArrayList<EstadoCuentaBanco> getEstadoCuentaBancosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoCuentaBanco> estadocuentabancosSeleccionados=new ArrayList<EstadoCuentaBanco>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoCuentaBanco) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoCuentaBanco estadocuentabancoAux:estadocuentabancoLogic.getEstadoCuentaBancos()) {
					if(estadocuentabancoAux.getIsSelected()) {
						estadocuentabancosSeleccionados.add(estadocuentabancoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoCuentaBanco estadocuentabancoAux:this.estadocuentabancos) {
					if(estadocuentabancoAux.getIsSelected()) {
						estadocuentabancosSeleccionados.add(estadocuentabancoAux);				
					}
				}
			}
			
			if(estadocuentabancosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadocuentabancosSeleccionados.addAll(this.estadocuentabancoLogic.getEstadoCuentaBancos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadocuentabancosSeleccionados.addAll(this.estadocuentabancos);				
					}
				}
			}
		} else {
			estadocuentabancosSeleccionados.add(this.estadocuentabanco);
		}
		
		return estadocuentabancosSeleccionados;
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
	
	public void generarReporteEstadoCuentaBancosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoCuentaBancosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoCuentaBancosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoCuentaBancosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoCuentaBancosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Cuenta Banco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoCuentaBancosSeleccionados() throws Exception {
		ArrayList<EstadoCuentaBanco> estadocuentabancosSeleccionados=new ArrayList<EstadoCuentaBanco>();		
		
		estadocuentabancosSeleccionados=this.getEstadoCuentaBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoCuentaBancos("Todos",estadocuentabancosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoCuentaBancosSeleccionados() throws Exception {
		ArrayList<EstadoCuentaBanco> estadocuentabancosSeleccionados=new ArrayList<EstadoCuentaBanco>();		
		
		estadocuentabancosSeleccionados=this.getEstadoCuentaBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoCuentaBancos("Todos",estadocuentabancosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoCuentaBancosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoCuentaBanco> estadocuentabancosSeleccionados=new ArrayList<EstadoCuentaBanco>();
		
		estadocuentabancosSeleccionados=this.getEstadoCuentaBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoCuentaBancos("Todos",estadocuentabancosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoCuentaBancosSeleccionados() throws Exception {
		ArrayList<EstadoCuentaBanco> estadocuentabancosSeleccionados=new ArrayList<EstadoCuentaBanco>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoCuentaBanco();
		
		
		estadocuentabancosSeleccionados=this.getEstadoCuentaBancosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoCuentaBanco();
		
		
		//this.generarReporteEstadoCuentaBancos("Todos",estadocuentabancosSeleccionados ,estadocuentabancoImplementable,estadocuentabancoImplementableHome);
	}
	
	public void mostrarImportacionEstadoCuentaBancos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoCuentaBanco();
		
		this.abrirFrameImportacionEstadoCuentaBanco();		
		
			
		//this.generarReporteEstadoCuentaBancos("Todos",estadocuentabancosSeleccionados ,estadocuentabancoImplementable,estadocuentabancoImplementableHome);
	}
	
	public void importarEstadoCuentaBancos() throws Exception {		
	
	}
	
	public void exportarEstadoCuentaBancosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoCuentaBancosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoCuentaBancosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoCuentaBancosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Cuenta Banco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoCuentaBancosSeleccionados() throws Exception {
		ArrayList<EstadoCuentaBanco> estadocuentabancosSeleccionados=new ArrayList<EstadoCuentaBanco>();		
		
		estadocuentabancosSeleccionados=this.getEstadoCuentaBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocuentabanco."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoCuentaBanco(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoCuentaBanco estadocuentabancoAux:estadocuentabancosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoCuentaBanco(estadocuentabancoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadocuentabancoAux.setsDetalleGeneralEntityReporte(estadocuentabancoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoCuentaBanco(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoCuentaBancoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoCuentaBancoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoCuentaBancoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoCuentaBancoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoCuentaBancoConstantesFunciones.LABEL_ESDEFECTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoCuentaBanco(EstadoCuentaBanco estadocuentabanco,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadocuentabanco.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadocuentabanco.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadocuentabanco.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadocuentabanco.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadocuentabanco.getes_defecto().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoCuentaBancosSeleccionados() throws Exception {
		ArrayList<EstadoCuentaBanco> estadocuentabancosSeleccionados=new ArrayList<EstadoCuentaBanco>();		
		
		estadocuentabancosSeleccionados=this.getEstadoCuentaBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocuentabanco.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoCuentaBancos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoCuentaBanco(row);				
				iRow++;
			}				
			
			for(EstadoCuentaBanco estadocuentabancoAux:estadocuentabancosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoCuentaBanco(estadocuentabancoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoCuentaBancosSeleccionados() throws Exception {
		ArrayList<EstadoCuentaBanco> estadocuentabancosSeleccionados=new ArrayList<EstadoCuentaBanco>();		
		
		estadocuentabancosSeleccionados=this.getEstadoCuentaBancosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocuentabanco.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadocuentabancos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadocuentabanco");
			//elementRoot.appendChild(element);
		
			for(EstadoCuentaBanco estadocuentabancoAux:estadocuentabancosSeleccionados) {
				element = document.createElement("estadocuentabanco");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoCuentaBanco(estadocuentabancoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoCuentaBanco(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoCuentaBancoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoCuentaBancoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoCuentaBancoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoCuentaBancoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoCuentaBancoConstantesFunciones.LABEL_ESDEFECTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoCuentaBanco(EstadoCuentaBanco estadocuentabanco,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadocuentabanco.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadocuentabanco.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadocuentabanco.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(estadocuentabanco.getes_defecto());				
	}
	
	public void setFilaDatosExportarXmlEstadoCuentaBanco(EstadoCuentaBanco estadocuentabanco,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoCuentaBancoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadocuentabanco.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoCuentaBancoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadocuentabanco.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoCuentaBancoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadocuentabanco.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoCuentaBancoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadocuentabanco.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementes_defecto = document.createElement(EstadoCuentaBancoConstantesFunciones.ESDEFECTO);
		elementes_defecto.appendChild(document.createTextNode(estadocuentabanco.getes_defecto().toString().trim()));
		element.appendChild(elementes_defecto);
	}
	
	public void generarReporteGroupGenericoEstadoCuentaBancosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoCuentaBanco> estadocuentabancosSeleccionados=new ArrayList<EstadoCuentaBanco>();
		
		estadocuentabancosSeleccionados=this.getEstadoCuentaBancosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoCuentaBanco(estadocuentabancosSeleccionados);
		
		this.generarReporteEstadoCuentaBancos("Todos",estadocuentabancosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoCuentaBanco(ArrayList<EstadoCuentaBanco> estadocuentabancosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoCuentaBanco estadocuentabancoAux:estadocuentabancosSeleccionados) {
				estadocuentabancoAux.setsDetalleGeneralEntityReporte(estadocuentabancoAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoCuentaBancoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadocuentabancoAux.setsDescripcionGeneralEntityReporte1(estadocuentabancoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoCuentaBancoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadocuentabancoAux.setsDescripcionGeneralEntityReporte1(estadocuentabancoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(EstadoCuentaBancoConstantesFunciones.LABEL_ESDEFECTO)) {
					existe=true;
					estadocuentabancoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(estadocuentabancoAux.getes_defecto()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoCuentaBanco(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoCuentaBanco=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaActualizarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaEliminarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaCancelarEstadoCuentaBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCuentaBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCuentaBanco=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoCuentaBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco=false;
			this.isVisibilidadCeldaModificarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaActualizarEstadoCuentaBanco=true;
			this.isVisibilidadCeldaEliminarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaCancelarEstadoCuentaBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCuentaBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCuentaBanco=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoCuentaBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco=false;
			this.isVisibilidadCeldaModificarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaActualizarEstadoCuentaBanco=true;
			this.isVisibilidadCeldaEliminarEstadoCuentaBanco=true;
			this.isVisibilidadCeldaCancelarEstadoCuentaBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCuentaBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCuentaBanco=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoCuentaBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco=false;
			this.isVisibilidadCeldaModificarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaActualizarEstadoCuentaBanco=true;
			this.isVisibilidadCeldaEliminarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaCancelarEstadoCuentaBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCuentaBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCuentaBanco=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoCuentaBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco=true;
			this.isVisibilidadCeldaModificarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaActualizarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaEliminarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaCancelarEstadoCuentaBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCuentaBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCuentaBanco=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoCuentaBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco=false;
			this.isVisibilidadCeldaActualizarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaEliminarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaCancelarEstadoCuentaBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCuentaBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCuentaBanco=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoCuentaBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco=false;
			this.isVisibilidadCeldaModificarEstadoCuentaBanco=true;
			this.isVisibilidadCeldaActualizarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaEliminarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaCancelarEstadoCuentaBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCuentaBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCuentaBanco=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoCuentaBancoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoCuentaBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco=true;
		} else {
			this.actualizarEstadoPanelsEstadoCuentaBanco(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoCuentaBanco=false;
			//this.isVisibilidadCeldaVerFormEstadoCuentaBanco=false;
			this.isVisibilidadCeldaDuplicarEstadoCuentaBanco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadocuentabancoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoCuentaBanco=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCuentaBanco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
			if(!estadocuentabancoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco=false;												
			}
			
			this.jButtonCerrarEstadoCuentaBanco.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoCuentaBanco=false;
		}
		
		if(!this.permiteMantenimiento(this.estadocuentabanco)) {
			this.isVisibilidadCeldaActualizarEstadoCuentaBanco=false;
			this.isVisibilidadCeldaEliminarEstadoCuentaBanco=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoCuentaBanco() {
	}
	
	public void actualizarEstadoPanelsEstadoCuentaBanco(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoCuentaBanco!=null) {
				this.jScrollPanelDatosEdicionEstadoCuentaBanco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoCuentaBanco!=null) {
				this.jScrollPanelDatosEstadoCuentaBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoCuentaBanco!=null) {
				this.jPanelPaginacionEstadoCuentaBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoCuentaBanco!=null) {
				this.jPanelParametrosReportesEstadoCuentaBanco.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoCuentaBanco!=null) {
				this.jScrollPanelDatosEdicionEstadoCuentaBanco.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoCuentaBanco!=null) {
				this.jScrollPanelDatosEstadoCuentaBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoCuentaBanco!=null) {
				this.jPanelPaginacionEstadoCuentaBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoCuentaBanco!=null) {
				this.jPanelParametrosReportesEstadoCuentaBanco.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoCuentaBanco!=null) {
				this.jScrollPanelDatosEdicionEstadoCuentaBanco.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoCuentaBanco!=null) {
				this.jScrollPanelDatosEstadoCuentaBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoCuentaBanco!=null) {
				this.jPanelPaginacionEstadoCuentaBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoCuentaBanco!=null) {
				this.jPanelParametrosReportesEstadoCuentaBanco.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoCuentaBanco!=null) {
				this.jScrollPanelDatosEdicionEstadoCuentaBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoCuentaBanco!=null) {
				this.jScrollPanelDatosEstadoCuentaBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoCuentaBanco!=null) {
				this.jPanelPaginacionEstadoCuentaBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoCuentaBanco!=null) {
				this.jPanelParametrosReportesEstadoCuentaBanco.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoCuentaBanco!=null) {
				this.jScrollPanelDatosEdicionEstadoCuentaBanco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoCuentaBanco!=null) {
				this.jScrollPanelDatosEstadoCuentaBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoCuentaBanco!=null) {
				this.jPanelPaginacionEstadoCuentaBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoCuentaBanco!=null) {
				this.jPanelParametrosReportesEstadoCuentaBanco.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoCuentaBanco!=null) {
				this.jScrollPanelDatosEdicionEstadoCuentaBanco.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoCuentaBanco!=null) {
				this.jScrollPanelDatosEstadoCuentaBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoCuentaBanco!=null) {
				this.jPanelPaginacionEstadoCuentaBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoCuentaBanco!=null) {
				this.jPanelParametrosReportesEstadoCuentaBanco.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoCuentaBanco!=null) {
				this.jScrollPanelDatosEdicionEstadoCuentaBanco.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoCuentaBanco!=null) {
				this.jScrollPanelDatosEstadoCuentaBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoCuentaBanco!=null) {
				this.jPanelPaginacionEstadoCuentaBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoCuentaBanco!=null) {
				this.jPanelParametrosReportesEstadoCuentaBanco.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoCuentaBancoSessionBean estadocuentabancoSessionBean=new EstadoCuentaBancoSessionBean();
		
		if(this.estadocuentabancoSessionBean==null) {
			this.estadocuentabancoSessionBean=new EstadoCuentaBancoSessionBean();
		}
		
		this.estadocuentabancoSessionBean.setsUltimaBusquedaEstadoCuentaBanco(this.getsAccionBusqueda());
		this.estadocuentabancoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadocuentabancoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoCuentaBancoSessionBean estadocuentabancoSessionBean=new EstadoCuentaBancoSessionBean();
		
		if(this.estadocuentabancoSessionBean==null) {
			this.estadocuentabancoSessionBean=new EstadoCuentaBancoSessionBean();
		}
		
		if(this.estadocuentabancoSessionBean.getsUltimaBusquedaEstadoCuentaBanco()!=null&&!this.estadocuentabancoSessionBean.getsUltimaBusquedaEstadoCuentaBanco().equals("")) {
			this.setsAccionBusqueda(estadocuentabancoSessionBean.getsUltimaBusquedaEstadoCuentaBanco());
			this.setiNumeroPaginacion(estadocuentabancoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadocuentabancoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadocuentabancoSessionBean.setsUltimaBusquedaEstadoCuentaBanco("");
		this.estadocuentabancoSessionBean.setiNumeroPaginacion(EstadoCuentaBancoConstantesFunciones.INUMEROPAGINACION);
		this.estadocuentabancoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoCuentaBanco(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoCuentaBanco() {
		this.updateBorderResaltarBusquedasFormularioEstadoCuentaBanco();
		this.updateVisibilidadBusquedasFormularioEstadoCuentaBanco();
		this.updateHabilitarBusquedasFormularioEstadoCuentaBanco();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoCuentaBanco() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoCuentaBanco() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoCuentaBanco() {
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
	
	public void updateControlesFormularioEstadoCuentaBanco() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoCuentaBanco();
		this.updateVisibilidadResaltarControlesFormularioEstadoCuentaBanco();
		this.updateHabilitarResaltarControlesFormularioEstadoCuentaBanco();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoCuentaBanco() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadocuentabancoConstantesFunciones.resaltaridEstadoCuentaBanco!=null && this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldidEstadoCuentaBanco.setBorder(this.estadocuentabancoConstantesFunciones.resaltaridEstadoCuentaBanco);}
		if(this.estadocuentabancoConstantesFunciones.resaltarcodigoEstadoCuentaBanco!=null && this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldcodigoEstadoCuentaBanco.setBorder(this.estadocuentabancoConstantesFunciones.resaltarcodigoEstadoCuentaBanco);}
		if(this.estadocuentabancoConstantesFunciones.resaltarnombreEstadoCuentaBanco!=null && this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextAreanombreEstadoCuentaBanco.setBorder(this.estadocuentabancoConstantesFunciones.resaltarnombreEstadoCuentaBanco);}
		if(this.estadocuentabancoConstantesFunciones.resaltares_defectoEstadoCuentaBanco!=null && this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {this.jInternalFrameDetalleFormEstadoCuentaBanco.jCheckBoxes_defectoEstadoCuentaBanco.setBorderPainted(true);this.jInternalFrameDetalleFormEstadoCuentaBanco.jCheckBoxes_defectoEstadoCuentaBanco.setBorder(this.estadocuentabancoConstantesFunciones.resaltares_defectoEstadoCuentaBanco);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoCuentaBanco() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {
	
		//this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldidEstadoCuentaBanco.setVisible(this.estadocuentabancoConstantesFunciones.mostraridEstadoCuentaBanco);
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jPanelidEstadoCuentaBanco.setVisible(this.estadocuentabancoConstantesFunciones.mostraridEstadoCuentaBanco);
		//this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldcodigoEstadoCuentaBanco.setVisible(this.estadocuentabancoConstantesFunciones.mostrarcodigoEstadoCuentaBanco);
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jPanelcodigoEstadoCuentaBanco.setVisible(this.estadocuentabancoConstantesFunciones.mostrarcodigoEstadoCuentaBanco);
		//this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextAreanombreEstadoCuentaBanco.setVisible(this.estadocuentabancoConstantesFunciones.mostrarnombreEstadoCuentaBanco);
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jPanelnombreEstadoCuentaBanco.setVisible(this.estadocuentabancoConstantesFunciones.mostrarnombreEstadoCuentaBanco);
		//this.jInternalFrameDetalleFormEstadoCuentaBanco.jCheckBoxes_defectoEstadoCuentaBanco.setVisible(this.estadocuentabancoConstantesFunciones.mostrares_defectoEstadoCuentaBanco);
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jPaneles_defectoEstadoCuentaBanco.setVisible(this.estadocuentabancoConstantesFunciones.mostrares_defectoEstadoCuentaBanco);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoCuentaBanco() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoCuentaBanco!=null) {
	
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldidEstadoCuentaBanco.setEnabled(this.estadocuentabancoConstantesFunciones.activaridEstadoCuentaBanco);
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextFieldcodigoEstadoCuentaBanco.setEnabled(this.estadocuentabancoConstantesFunciones.activarcodigoEstadoCuentaBanco);
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jTextAreanombreEstadoCuentaBanco.setEnabled(this.estadocuentabancoConstantesFunciones.activarnombreEstadoCuentaBanco);
		this.jInternalFrameDetalleFormEstadoCuentaBanco.jCheckBoxes_defectoEstadoCuentaBanco.setEnabled(this.estadocuentabancoConstantesFunciones.activares_defectoEstadoCuentaBanco);
		}
	}
	
		
}