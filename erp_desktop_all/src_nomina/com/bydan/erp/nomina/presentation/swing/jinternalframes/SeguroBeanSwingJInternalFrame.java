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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.SeguroConstantesFunciones;
import com.bydan.erp.nomina.util.SeguroParameterReturnGeneral;
//import com.bydan.erp.nomina.util.SeguroParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.SeguroBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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




@SuppressWarnings("unused")
public class SeguroBeanSwingJInternalFrame extends SeguroJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SeguroBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Seguro> seguroValidator = new ClassValidator<Seguro>(Seguro.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Seguro seguro;	
	public Seguro seguroAux;
	public Seguro seguroAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Seguro seguroTotales;
	public Long idSeguroActual;
	public Long iIdNuevoSeguro=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpleado="";

	public List<Empleado> empleadosForeignKey;

	public List<Empleado> getempleadosForeignKey() {
		return empleadosForeignKey;
	}

	public void setempleadosForeignKey(List<Empleado> empleadosForeignKey) {
		this.empleadosForeignKey = empleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoForeignKey;

	public Empleado getempleadoForeignKey() {
		return empleadoForeignKey;
	}

	public void setempleadoForeignKey(Empleado empleadoForeignKey) {
		this.empleadoForeignKey = empleadoForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idEmpleadoActual=0L;

	public Long getidEmpleadoActual() {
		return idEmpleadoActual;
	}

	public void setidEmpleadoActual(Long idEmpleadoActual) {
		this.idEmpleadoActual= idEmpleadoActual;
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
	
	public Boolean isPermisoTodoSeguro;
	public Boolean isPermisoNuevoSeguro;
	public Boolean isPermisoActualizarSeguro;
	public Boolean isPermisoActualizarOriginalSeguro;
	public Boolean isPermisoEliminarSeguro;
	public Boolean isPermisoGuardarCambiosSeguro;
	public Boolean isPermisoConsultaSeguro;
	public Boolean isPermisoBusquedaSeguro;
	public Boolean isPermisoReporteSeguro;
	public Boolean isPermisoPaginacionMedioSeguro;
	public Boolean isPermisoPaginacionAltoSeguro;
	public Boolean isPermisoPaginacionTodoSeguro;
	public Boolean isPermisoCopiarSeguro;
	public Boolean isPermisoVerFormSeguro;
	public Boolean isPermisoDuplicarSeguro;
	public Boolean isPermisoOrdenSeguro;
	
	
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
	
	public SeguroParameterReturnGeneral seguroReturnGeneral;
	public SeguroParameterReturnGeneral seguroParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSeguro=false;
	public Boolean esParaAccionDesdeFormularioSeguro=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SeguroSessionBeanAdditional seguroSessionBeanAdditional=null;
	
	public SeguroSessionBeanAdditional getSeguroSessionBeanAdditional() {
		return this.seguroSessionBeanAdditional;
	}
	
	public void setSeguroSessionBeanAdditional(SeguroSessionBeanAdditional seguroSessionBeanAdditional) {
		try {
			this.seguroSessionBeanAdditional=seguroSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SeguroBeanSwingJInternalFrameAdditional seguroBeanSwingJInternalFrameAdditional=null;
	//public class SeguroBeanSwingJInternalFrame
	
	public SeguroBeanSwingJInternalFrameAdditional getSeguroBeanSwingJInternalFrameAdditional() {
		return this.seguroBeanSwingJInternalFrameAdditional;
	}
	
	public void setSeguroBeanSwingJInternalFrameAdditional(SeguroBeanSwingJInternalFrameAdditional seguroBeanSwingJInternalFrameAdditional) {
		try {
			this.seguroBeanSwingJInternalFrameAdditional=seguroBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SeguroLogic seguroLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Seguro seguroBean;
	public SeguroConstantesFunciones seguroConstantesFunciones;
	//public SeguroParameterReturnGeneral seguroReturnGeneral;
	
	//FK
	
	public EmpleadoLogic empleadoLogic;
	
	//PARAMETROS
	
	
	//public List<Seguro> seguros;	
	//public List<Seguro> segurosEliminados;
	//public List<Seguro> segurosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSeguro=false;
	public Boolean isVisibilidadCeldaDuplicarSeguro=true;
	public Boolean isVisibilidadCeldaCopiarSeguro=true;
	public Boolean isVisibilidadCeldaVerFormSeguro=true;
	public Boolean isVisibilidadCeldaOrdenSeguro=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSeguro=false;
	public Boolean isVisibilidadCeldaModificarSeguro=false;
	public Boolean isVisibilidadCeldaActualizarSeguro=false;
	public Boolean isVisibilidadCeldaEliminarSeguro=false;
	public Boolean isVisibilidadCeldaCancelarSeguro=false;
	public Boolean isVisibilidadCeldaGuardarSeguro=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSeguro=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	
	public Long getiIdNuevoSeguro() {
		return this.iIdNuevoSeguro;
	}

	public void setiIdNuevoSeguro(Long iIdNuevoSeguro) {
		this.iIdNuevoSeguro = iIdNuevoSeguro;
	}
	
	public Long getidSeguroActual() {
		return this.idSeguroActual;
	}

	public void setidSeguroActual(Long idSeguroActual) {
		this.idSeguroActual = idSeguroActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Seguro getseguro() {
		return this.seguro;
	}

	public void setseguro(Seguro seguro) {
		this.seguro = seguro;
	}
	
	public Seguro getseguroAux() {
		return this.seguroAux;
	}

	public void setseguroAux(Seguro seguroAux) {
		this.seguroAux = seguroAux;
	}				
	
	public Seguro getseguroAnterior() {
		return this.seguroAnterior;
	}

	public void setseguroAnterior(Seguro seguroAnterior) {
		this.seguroAnterior = seguroAnterior;
	}	
	
	public Seguro getseguroTotales() {
		return this.seguroTotales;
	}

	public void setseguroTotales(Seguro seguroTotales) {
		this.seguroTotales = seguroTotales;
	}	
	
	public Seguro getseguroBean() {
		return this.seguroBean;
	}

	public void setseguroBean(Seguro seguroBean) {
		this.seguroBean = seguroBean;
	}	
	
	public SeguroParameterReturnGeneral getseguroReturnGeneral() {
		return this.seguroReturnGeneral;
	}

	public void setseguroReturnGeneral(SeguroParameterReturnGeneral seguroReturnGeneral) {
		this.seguroReturnGeneral = seguroReturnGeneral;
	}	
	
	
	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SeguroLogic getSeguroLogic()	{		
		return seguroLogic;
	}

	public void setSeguroLogic(SeguroLogic seguroLogic) {
		this.seguroLogic = seguroLogic;
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
	
	public Boolean getIsEsNuevoSeguro() {
		return isEsNuevoSeguro;
	}

	public void setIsEsNuevoSeguro(Boolean isEsNuevoSeguro) {
		this.isEsNuevoSeguro = isEsNuevoSeguro;
	}

	public Boolean getEsParaAccionDesdeFormularioSeguro() {
		return esParaAccionDesdeFormularioSeguro;
	}
	
	public void setEsParaAccionDesdeFormularioSeguro(Boolean esParaAccionDesdeFormularioSeguro) {
		this.esParaAccionDesdeFormularioSeguro = esParaAccionDesdeFormularioSeguro;
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
	
	
	public void cargarCombosEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadosForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.seguroSessionBean==null) {
				this.seguroSessionBean=new SeguroSessionBean();
			}

			if(!this.seguroSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadosForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(seguroSessionBean.getlidEmpleadoActual());
					this.empleadosForeignKey.add(empleadoLogic.getEmpleado());
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

	
	
	public void setActualEmpleadoForeignKey(Long idEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoTemp!=null) {

					if(this.seguro!=null) {
						this.seguro.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormSeguro!=null) {
						this.jInternalFrameDetalleFormSeguro.jComboBoxid_empleadoSeguro.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoSeguro.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormSeguro!=null) {
						if(this.jInternalFrameDetalleFormSeguro.jComboBoxid_empleadoSeguro.getItemCount()>0) {
							this.jInternalFrameDetalleFormSeguro.jComboBoxid_empleadoSeguro.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoSeguro!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoSeguro.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoSeguro!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoSeguro.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoSeguro.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoSeguro.setSelectedIndex(0);
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

	public String getActualEmpleadoForeignKeyDescripcion(Long idEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoSeguroGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(empleadoTemp!=null) {
				jComboBoxid_empleadoSeguroGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoSeguroGenerico!=null && jComboBoxid_empleadoSeguroGenerico.getItemCount()>0) {
					jComboBoxid_empleadoSeguroGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(Seguro seguro,JComboBox jComboBoxid_empleadoSeguroGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoSeguroGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormSeguro.jComboBoxid_empleadoSeguro.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoSeguroGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				seguro.setid_empleado(empleadoAux.getId());
				seguro.setempleado_descripcion(SeguroConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				seguro.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SeguroJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSeguro!=null) { 
							this.jInternalFrameDetalleFormSeguro.jComboBoxid_empleadoSeguro.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormSeguro.jComboBoxid_empleadoSeguro.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSeguro!=null) { 
					}

					if(!SeguroJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SeguroJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoSeguro.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoSeguro.addItem(empleado);
							}
						}

						if(!SeguroJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpleadoForeignKey(Empleado empleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSeguro!=null) {
							this.jInternalFrameDetalleFormSeguro.jComboBoxid_empleadoSeguro.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormSeguro!=null) {
							this.jInternalFrameDetalleFormSeguro.jComboBoxid_empleadoSeguro.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoSeguro.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoSeguro.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesSeguro() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SeguroConstantesFunciones.refrescarForeignKeysDescripcionesSeguro(this.seguroLogic.getSeguros());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SeguroConstantesFunciones.refrescarForeignKeysDescripcionesSeguro(this.seguros);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empleado.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//seguroLogic.setSeguros(this.seguros);
			seguroLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SeguroParameterReturnGeneral getSeguroParameterGeneral() {
		return this.seguroParameterGeneral;
	}
	
	public void setSeguroParameterGeneral(SeguroParameterReturnGeneral seguroParameterGeneral) {
		this.seguroParameterGeneral = seguroParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSeguro() {
		return isPermisoTodoSeguro;
	}

	public void setIsPermisoTodoSeguro(Boolean isPermisoTodoSeguro) {
		this.isPermisoTodoSeguro = isPermisoTodoSeguro;
	}

	public Boolean getIsPermisoNuevoSeguro() {
		return isPermisoNuevoSeguro;
	}

	public void setIsPermisoNuevoSeguro(Boolean isPermisoNuevoSeguro) {
		this.isPermisoNuevoSeguro = isPermisoNuevoSeguro;
	}

	public Boolean getIsPermisoActualizarSeguro() {
		return isPermisoActualizarSeguro;
	}

	public void setIsPermisoActualizarSeguro(Boolean isPermisoActualizarSeguro) {
		this.isPermisoActualizarSeguro = isPermisoActualizarSeguro;
	}

	public Boolean getIsPermisoEliminarSeguro() {
		return isPermisoEliminarSeguro;
	}

	public void setIsPermisoEliminarSeguro(Boolean isPermisoEliminarSeguro) {
		this.isPermisoEliminarSeguro = isPermisoEliminarSeguro;
	}

	public Boolean getIsPermisoGuardarCambiosSeguro() {
		return isPermisoGuardarCambiosSeguro;
	}

	public void setIsPermisoGuardarCambiosSeguro(Boolean isPermisoGuardarCambiosSeguro) {
		this.isPermisoGuardarCambiosSeguro = isPermisoGuardarCambiosSeguro;
	}
	
	public Boolean getIsPermisoConsultaSeguro() {
		return isPermisoConsultaSeguro;
	}

	public void setIsPermisoConsultaSeguro(Boolean isPermisoConsultaSeguro) {
		this.isPermisoConsultaSeguro = isPermisoConsultaSeguro;
	}

	public Boolean getIsPermisoBusquedaSeguro() {
		return isPermisoBusquedaSeguro;
	}

	public void setIsPermisoBusquedaSeguro(Boolean isPermisoBusquedaSeguro) {
		this.isPermisoBusquedaSeguro = isPermisoBusquedaSeguro;
	}

	public Boolean getIsPermisoReporteSeguro() {
		return isPermisoReporteSeguro;
	}

	public void setIsPermisoReporteSeguro(Boolean isPermisoReporteSeguro) {
		this.isPermisoReporteSeguro = isPermisoReporteSeguro;
	}
	
	public Boolean getIsPermisoPaginacionMedioSeguro() {
		return isPermisoPaginacionMedioSeguro;
	}

	public void setIsPermisoPaginacionMedioSeguro(Boolean isPermisoPaginacionMedioSeguro) {
		this.isPermisoPaginacionMedioSeguro = isPermisoPaginacionMedioSeguro;
	}
	
	public Boolean getIsPermisoPaginacionTodoSeguro() {
		return isPermisoPaginacionTodoSeguro;
	}

	public void setIsPermisoPaginacionTodoSeguro(Boolean isPermisoPaginacionTodoSeguro) {
		this.isPermisoPaginacionTodoSeguro = isPermisoPaginacionTodoSeguro;
	}
	
	public Boolean getIsPermisoPaginacionAltoSeguro() {
		return isPermisoPaginacionAltoSeguro;
	}

	public void setIsPermisoPaginacionAltoSeguro(Boolean isPermisoPaginacionAltoSeguro) {
		this.isPermisoPaginacionAltoSeguro = isPermisoPaginacionAltoSeguro;
	}
	
	public Boolean getIsPermisoCopiarSeguro() {
		return isPermisoCopiarSeguro;
	}

	public void setIsPermisoCopiarSeguro(Boolean isPermisoCopiarSeguro) {
		this.isPermisoCopiarSeguro = isPermisoCopiarSeguro;
	}
	
	public Boolean getIsPermisoVerFormSeguro() {
		return isPermisoVerFormSeguro;
	}

	public void setIsPermisoVerFormSeguro(Boolean isPermisoVerFormSeguro) {
		this.isPermisoVerFormSeguro = isPermisoVerFormSeguro;
	}
	
	public Boolean getIsPermisoDuplicarSeguro() {
		return isPermisoDuplicarSeguro;
	}

	public void setIsPermisoDuplicarSeguro(Boolean isPermisoDuplicarSeguro) {
		this.isPermisoDuplicarSeguro = isPermisoDuplicarSeguro;
	}
	
	public Boolean getIsPermisoOrdenSeguro() {
		return isPermisoOrdenSeguro;
	}

	public void setIsPermisoOrdenSeguro(Boolean isPermisoOrdenSeguro) {
		this.isPermisoOrdenSeguro = isPermisoOrdenSeguro;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSeguro() {
		return isVisibilidadCeldaNuevoSeguro;
	}

	public void setIsVisibilidadCeldaNuevoSeguro(Boolean isVisibilidadCeldaNuevoSeguro) {
		this.isVisibilidadCeldaNuevoSeguro = isVisibilidadCeldaNuevoSeguro;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSeguro() {
		return isVisibilidadCeldaDuplicarSeguro;
	}

	public void setIsVisibilidadCeldaDuplicarSeguro(Boolean isVisibilidadCeldaDuplicarSeguro) {
		this.isVisibilidadCeldaDuplicarSeguro = isVisibilidadCeldaDuplicarSeguro;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSeguro() {
		return isVisibilidadCeldaCopiarSeguro;
	}

	public void setIsVisibilidadCeldaCopiarSeguro(Boolean isVisibilidadCeldaCopiarSeguro) {
		this.isVisibilidadCeldaCopiarSeguro = isVisibilidadCeldaCopiarSeguro;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSeguro() {
		return isVisibilidadCeldaVerFormSeguro;
	}

	public void setIsVisibilidadCeldaVerFormSeguro(Boolean isVisibilidadCeldaVerFormSeguro) {
		this.isVisibilidadCeldaVerFormSeguro = isVisibilidadCeldaVerFormSeguro;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSeguro() {
		return isVisibilidadCeldaOrdenSeguro;
	}

	public void setIsVisibilidadCeldaOrdenSeguro(Boolean isVisibilidadCeldaOrdenSeguro) {
		this.isVisibilidadCeldaOrdenSeguro = isVisibilidadCeldaOrdenSeguro;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSeguro() {
		return isVisibilidadCeldaNuevoRelacionesSeguro;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSeguro(Boolean isVisibilidadCeldaNuevoRelacionesSeguro) {
		this.isVisibilidadCeldaNuevoRelacionesSeguro = isVisibilidadCeldaNuevoRelacionesSeguro;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSeguro() {
		return isVisibilidadCeldaModificarSeguro;
	}

	public void setIsVisibilidadCeldaModificarSeguro(Boolean isVisibilidadCeldaModificarSeguro) {
		this.isVisibilidadCeldaModificarSeguro = isVisibilidadCeldaModificarSeguro;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSeguro() {
		return isVisibilidadCeldaActualizarSeguro;
	}

	public void setIsVisibilidadCeldaActualizarSeguro(Boolean isVisibilidadCeldaActualizarSeguro) {
		this.isVisibilidadCeldaActualizarSeguro = isVisibilidadCeldaActualizarSeguro;
	}

	public Boolean getIsVisibilidadCeldaEliminarSeguro() {
		return isVisibilidadCeldaEliminarSeguro;
	}

	public void setIsVisibilidadCeldaEliminarSeguro(Boolean isVisibilidadCeldaEliminarSeguro) {
		this.isVisibilidadCeldaEliminarSeguro = isVisibilidadCeldaEliminarSeguro;
	}

	public Boolean getIsVisibilidadCeldaCancelarSeguro() {
		return isVisibilidadCeldaCancelarSeguro;
	}

	public void setIsVisibilidadCeldaCancelarSeguro(Boolean isVisibilidadCeldaCancelarSeguro) {
		this.isVisibilidadCeldaCancelarSeguro = isVisibilidadCeldaCancelarSeguro;
	}

	public Boolean getIsVisibilidadCeldaGuardarSeguro() {
		return isVisibilidadCeldaGuardarSeguro;
	}

	public void setIsVisibilidadCeldaGuardarSeguro(Boolean isVisibilidadCeldaGuardarSeguro) {
		this.isVisibilidadCeldaGuardarSeguro = isVisibilidadCeldaGuardarSeguro;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSeguro() {
		return isVisibilidadCeldaGuardarCambiosSeguro;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSeguro(Boolean isVisibilidadCeldaGuardarCambiosSeguro) {
		this.isVisibilidadCeldaGuardarCambiosSeguro = isVisibilidadCeldaGuardarCambiosSeguro;
	}
		
	public SeguroSessionBean getseguroSessionBean() {
		return this.seguroSessionBean;
	}
	
	public void setseguroSessionBean(SeguroSessionBean seguroSessionBean) {
		this.seguroSessionBean=seguroSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSeguro(Seguro seguro)throws Exception {
		try {
			
				this.setActualParaGuardarEmpleadoForeignKey(seguro,null);
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
	
	public void bugActualizarReferenciaActual(Seguro seguro,Seguro seguroAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSeguro(seguro);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		seguroAux.setId(seguro.getId());
		seguroAux.setVersionRow(seguro.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSeguro();
		
			int intSelectedRow = this.jTableDatosSeguro.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguro =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.seguro =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSeguro(this.seguro,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSeguro(this.seguro);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = seguroValidator.getInvalidValues(this.seguro);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			seguroLogic.setDatosCliente(datosCliente);
			seguroLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				seguroAux=new  Seguro();
				
				seguroAux.setIsNew(true);
				seguroAux.setIsChanged(true);
				
				seguroAux.setSeguroOriginal(this.seguro);
				
				seguroAux.setId(this.seguro.getId());	
				seguroAux.setVersionRow(this.seguro.getVersionRow());	
				seguroAux.setid_empleado(this.seguro.getid_empleado());	
				seguroAux.setnombre(this.seguro.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.seguroSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.seguroSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(seguroAux,seguroLogic.getSeguros());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(seguroAux,seguros);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.seguroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.seguroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						seguroLogic.saveSeguros();//WithConnection
						//seguroLogic.getSetVersionRowSeguros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.seguro,seguroAux);
					
					this.refrescarForeignKeysDescripcionesSeguro();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.seguroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.seguroSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								seguroLogic.saveSeguroRelaciones(seguroAux);//WithConnection
								//seguroLogic.getSetVersionRowSeguros();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.seguro,seguroAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.seguroSessionBean.getEstaModoGuardarRelaciones() 
									|| this.seguroSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(seguroAux,seguroLogic.getSeguros());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(seguroAux,seguros);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.seguro,seguroAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				seguroAux=new  Seguro();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.seguroSessionBean.getEsGuardarRelacionado() 
					|| (this.seguroSessionBean.getEsGuardarRelacionado() && this.seguro.getId()>=0)) {
						
					seguroAux.setIsNew(false);
				}
				
				seguroAux.setIsDeleted(false);
			
				seguroAux.setId(this.seguro.getId());	
				seguroAux.setVersionRow(this.seguro.getVersionRow());	
				seguroAux.setid_empleado(this.seguro.getid_empleado());	
				seguroAux.setnombre(this.seguro.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(seguroAux,seguroLogic.getSeguros());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(seguroAux,seguros);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.seguroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.seguroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						seguroLogic.saveSeguros();//WithConnection
						//seguroLogic.getSetVersionRowSeguros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.seguro,seguroAux);
					
					this.refrescarForeignKeysDescripcionesSeguro();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.seguroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.seguroSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								seguroLogic.saveSeguroRelaciones(seguroAux);//WithConnection
								//seguroLogic.getSetVersionRowSeguros();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.seguro,seguroAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.seguroSessionBean.getEstaModoGuardarRelaciones() 
									|| this.seguroSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(seguroAux,seguroLogic.getSeguros());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(seguroAux,seguros);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.seguro,seguroAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				seguroAux=new  Seguro();
				
				seguroAux.setIsNew(false);
				seguroAux.setIsChanged(false);
				
				seguroAux.setIsDeleted(true);
				
				seguroAux.setId(this.seguro.getId());	
				seguroAux.setVersionRow(this.seguro.getVersionRow());	
				seguroAux.setid_empleado(this.seguro.getid_empleado());	
				seguroAux.setnombre(this.seguro.getnombre());	
				
				if(this.seguroSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.seguroAux.getId()>=0) {	
						this.segurosEliminados.add(seguroAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(seguroAux,seguroLogic.getSeguros());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(seguroAux,seguros);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.seguroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.seguroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						seguroLogic.saveSeguros();//WithConnection
						//seguroLogic.getSetVersionRowSeguros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.seguroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.seguroSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								seguroLogic.saveSeguroRelaciones(seguroAux);//WithConnection
								//seguroLogic.getSetVersionRowSeguros();//WithConnection
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
							if(this.seguroSessionBean.getEstaModoGuardarRelaciones() 
								|| this.seguroSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(seguroAux,seguroLogic.getSeguros());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(seguroAux,seguros);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguroLogic.getSeguros().addAll(this.segurosEliminados);
					
					seguroLogic.saveSeguros();//WithConnection
					//seguroLogic.getSetVersionRowSeguros();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesSeguro();
				
				this.segurosEliminados= new ArrayList<Seguro>();		
			}
			
			if(this.seguroSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.seguroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Seguro GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Seguro",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.seguro=seguroAux;
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
      		//this.finishProcessSeguro();
      	}
		
	}	
	
	public void actualizarRelaciones(Seguro seguroLocal) throws Exception {
		
		if(this.seguroSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Seguro seguroLocal) throws Exception {	
		if(this.seguroSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				seguroLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSeguroActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSeguro.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.seguro =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.seguro =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = seguroValidator.getInvalidValues(this.seguro);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Seguro seguro,List<Seguro> seguros) throws Exception {
		try	{		
			SeguroConstantesFunciones.actualizarLista(seguro,seguros,this.seguroSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Seguro seguro,List<Seguro> seguros) throws Exception {
		try	{			
			SeguroConstantesFunciones.actualizarSelectedLista(seguro,seguros);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Seguro> segurosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				segurosLocal=this.seguroLogic.getSeguros();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				segurosLocal=this.seguros;
			}
			//ARCHITECTURE
		
			for(Seguro seguroLocal:segurosLocal) {
				if(this.permiteMantenimiento(seguroLocal) && seguroLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SeguroConstantesFunciones.getSeguroLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SeguroConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSeguro.jLabelid_empleadoSeguro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SeguroConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSeguro.jLabelnombreSeguro,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSeguro!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSeguro.jLabelid_empleadoSeguro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSeguro.jLabelnombreSeguro,"");
		
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
		this.iIdNuevoSeguro--;	
		
		
		this.seguroAux=new Seguro();
		
		this.seguroAux.setId(this.iIdNuevoSeguro);
		this.seguroAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.seguroLogic.getSeguros().add(this.seguroAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.seguros.add(this.seguroAux);
		}
		//ARCHITECTURE
		
		this.seguro=this.seguroAux;
		
		if(SeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSeguro(this.seguro);
			this.setVariablesObjetoActualToFormularioForeignKeySeguro(this.seguro);
		}
				
		//this.setDefaultControlesSeguro();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySeguro();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySeguro();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySeguro();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSeguro(this.seguroBean,this.seguro,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSeguro(this.seguro);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SeguroConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.seguroSessionBean.getConGuardarRelaciones()) {
			classes=SeguroConstantesFunciones.getClassesRelationshipsOfSeguro(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.seguroReturnGeneral=seguroLogic.procesarEventosSegurosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.seguroLogic.getSeguros(),this.seguro,this.seguroParameterGeneral,this.isEsNuevoSeguro,classes);//this.seguroLogic.getSeguro()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSeguro(this.seguroReturnGeneral,this.seguroBean,false);
		
		if(this.seguroReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySeguro(this.seguroReturnGeneral.getSeguro());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSeguro(this.seguroReturnGeneral.getSeguro());
		}
		
		if(this.seguroReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSeguro(this.seguroReturnGeneral.getSeguro(),classes);//this.seguroBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSeguro(this.seguro,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySeguro();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySeguro();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SeguroBeanSwingJInternalFrameAdditional.RecargarFormSeguro(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSeguro(false);
						
			if(seguroSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SeguroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSeguro();
			}
			
			this.actualizarVisualTableDatosSeguro();
			
			this.jTableDatosSeguro.setRowSelectionInterval(this.getIndiceNuevoSeguro(), this.getIndiceNuevoSeguro());
			
			this.seleccionarFilaTablaSeguroActual();
						
			this.actualizarEstadoCeldasBotonesSeguro("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSeguro(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSeguro.jTextAreanombreSeguro.setEnabled(isHabilitar && this.seguroConstantesFunciones.activarnombreSeguro);	
		
		this.jInternalFrameDetalleFormSeguro.jComboBoxid_empleadoSeguro.setEnabled(isHabilitar && this.seguroConstantesFunciones.activarid_empleadoSeguro);
	};
	
	public void setDefaultControlesSeguro() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSeguro(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.seguroSessionBean.setConGuardarRelaciones(true);			
			this.seguroSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSeguro.jTabbedPaneRelacionesSeguro.setVisible(true);
			
					
		} else {
			//this.seguroSessionBean.setConGuardarRelaciones(false);			
			this.seguroSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSeguro.jTabbedPaneRelacionesSeguro.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSeguro() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Seguro seguroAux:this.seguroLogic.getSeguros()) {
				if(seguroAux.getId().equals(this.iIdNuevoSeguro)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Seguro seguroAux:this.seguros) {
				if(seguroAux.getId().equals(this.iIdNuevoSeguro)) {
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
	
	public int getIndiceActualSeguro(Seguro seguro,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Seguro seguroAux:this.seguroLogic.getSeguros()) {
				if(seguroAux.getId().equals(seguro.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Seguro seguroAux:this.seguros) {
				if(seguroAux.getId().equals(seguro.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSeguro(Seguro seguroOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Seguro seguroAux:this.seguroLogic.getSeguros()) {
				if(seguroAux.getSeguroOriginal().getId().equals(seguroOriginal.getId())) {
					existe=true;
					seguroOriginal.setId(seguroAux.getId());
					seguroOriginal.setVersionRow(seguroAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Seguro seguroAux:this.seguros) {
				if(seguroAux.getSeguroOriginal().getId().equals(seguroOriginal.getId())) {
					existe=true;
					seguroOriginal.setId(seguroAux.getId());
					seguroOriginal.setVersionRow(seguroAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSeguro(Boolean esParaCancelar) throws Exception {
		segurosAux=new ArrayList<Seguro>();
		seguroAux=new Seguro();
		
		if(!this.seguroSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Seguro seguroAux:this.seguroLogic.getSeguros()) {
					if(seguroAux.getId()<0) {
						segurosAux.add(seguroAux);
					}		
				}
				this.iIdNuevoSeguro=0L;
				this.seguroLogic.getSeguros().removeAll(segurosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Seguro seguroAux:this.seguros) {
					if(seguroAux.getId()<0) {
						segurosAux.add(seguroAux);
					}		
				}
				this.iIdNuevoSeguro=0L;
				this.seguros.removeAll(segurosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSeguro 
					&& this.seguroLogic.getSeguros().size()>0
					) {
					seguroAux=this.seguroLogic.getSeguros().get(this.seguroLogic.getSeguros().size() - 1);
				
					if(seguroAux.getId()<0) {
						this.seguroLogic.getSeguros().remove(seguroAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSeguro && this.seguros.size()>0) {
					seguroAux=this.seguros.get(this.seguros.size() - 1);
				
					if(seguroAux.getId()<0) {
						this.seguros.remove(seguroAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSeguro(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(seguro.getId()<0) {
				this.seguroLogic.getSeguros().remove(this.seguro);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(seguro.getId()<0) {
				this.seguros.remove(this.seguro);
			}
		}			
	}
	
	public void setEstadosInicialesSeguro(List<Seguro> segurosAux) throws Exception {
		SeguroConstantesFunciones.setEstadosInicialesSeguro(segurosAux);
	}
	
	public void setEstadosInicialesSeguro(Seguro seguroAux) throws Exception {
		SeguroConstantesFunciones.setEstadosInicialesSeguro(seguroAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSeguroActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSeguro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSeguroActual()) {
				if(!this.isEsNuevoSeguro) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSeguro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSeguro=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSeguroActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Seguro ?", "MANTENIMIENTO DE Seguro", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSeguro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Seguro seguro) throws Exception {
		SeguroConstantesFunciones.seleccionarAsignar(this.seguro,seguro);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSeguro=this.isPermisoActualizarOriginalSeguro;
			
			
			this.seleccionarAsignar(seguro);
			
			

			idEmpleadoActual=seguro.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SeguroConstantesFunciones.quitarEspaciosSeguro(this.seguro,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSeguro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.seguroSessionBean.setsFuncionBusquedaRapida(this.seguroSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarEmpleadoActual() throws Exception {
		try	{
			Empleado empleadoAux=new Empleado();

			if(this.idEmpleadoActual != null && this.idEmpleadoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(this.idEmpleadoActual);
					empleadoAux= empleadoLogic.getEmpleado();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				empleadosForeignKey=new ArrayList<Empleado>();
				empleadosForeignKey.add(empleadoAux);
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
			if(this.isEsNuevoSeguro) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSeguro(esParaCancelar);				
				this.cancelarNuevoSeguro(esParaCancelar);								
			}
			
			this.seguro=new Seguro();
			
			this.inicializarSeguro();
			
			this.actualizarEstadoCeldasBotonesSeguro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSeguro() throws Exception {
		try {
			SeguroConstantesFunciones.inicializarSeguro(this.seguro);
			
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
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.seguroLogic.getSeguros().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSeguros(String sAccionBusqueda,List<Seguro> segurosParaReportes) throws Exception {
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
					sPathReporteFinal="Seguro"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SeguroMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SeguroMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Seguro"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Seguros");		
		parameters.put("busquedapor", SeguroConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSeguro=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SeguroConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SeguroConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSeguro=new JRBeanArrayDataSource(SeguroJInternalFrame.TraerSeguroBeans(segurosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSeguro);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SeguroConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SeguroConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SeguroBean.TraerSeguroBeans(segurosParaReportes).toArray()));
							
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
				this.generarExcelReporteSeguros(sAccionBusqueda,sTipoArchivoReporte,segurosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSeguros(sAccionBusqueda,sTipoArchivoReporte,segurosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSeguroActionPerformed(null);
					//this.generarExcelReporteSeguros(sAccionBusqueda,sTipoArchivoReporte,segurosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSeguros(sAccionBusqueda,sTipoArchivoReporte,segurosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSeguros(sAccionBusqueda,sTipoArchivoReporte,segurosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSeguros(sAccionBusqueda,sTipoArchivoReporte,segurosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSeguros(String sAccionBusqueda,String sTipoArchivoReporte,List<Seguro> segurosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"seguro";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Seguros");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSeguro("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Seguro seguro : segurosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SeguroConstantesFunciones.generarExcelReporteDataSeguro("NORMAL",row,workbook,seguro,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.seguroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Seguro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSeguro(String sTipo,Row row,Workbook workbook) {
		
		SeguroConstantesFunciones.generarExcelReporteHeaderSeguro(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSeguros(String sAccionBusqueda,String sTipoArchivoReporte,List<Seguro> segurosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"seguro_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Seguros");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Seguro seguro : segurosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SeguroConstantesFunciones.getSeguroDescripcion(seguro));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SeguroConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SeguroConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(seguro.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SeguroConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SeguroConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(seguro.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.seguroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Seguro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSeguros(String sAccionBusqueda,String sTipoArchivoReporte,List<Seguro> segurosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Seguro> segurosRespaldo=null;
		
		classes=SeguroConstantesFunciones.getClassesRelationshipsOfSeguro(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.seguroLogic.setDatosCliente(this.datosCliente);
		this.seguroLogic.setDatosDeep(this.datosDeep);
		this.seguroLogic.setIsConDeep(true);
		
		segurosRespaldo=this.seguroLogic.getSeguros();
		
		this.seguroLogic.setSeguros(segurosParaReportes);	
		this.seguroLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		segurosParaReportes=this.seguroLogic.getSeguros();
		this.seguroLogic.setSeguros(segurosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"seguro_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Seguros");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSeguro("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Seguro seguro : segurosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSeguro("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SeguroConstantesFunciones.generarExcelReporteDataSeguro("NORMAL",row,workbook,seguro,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SeguroConstantesFunciones.getSeguroDescripcion(seguro));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.seguroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Seguro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSeguro.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSeguro.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSeguro.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSeguro.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSeguro() throws Exception {		
		this.startProcessSeguro(true);
	}
	
	public void startProcessSeguro(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSeguro ,this.jPanelParametrosReportesSeguro, this.jScrollPanelDatosSeguro,this.jPanelPaginacionSeguro, this.jScrollPanelDatosEdicionSeguro, this.jPanelAccionesSeguro,this.jPanelAccionesFormularioSeguro,this.jmenuBarSeguro,this.jmenuBarDetalleSeguro,this.jTtoolBarSeguro,this.jTtoolBarDetalleSeguro);		
		
		final JTabbedPane jTabbedPaneBusquedasSeguro=this.jTabbedPaneBusquedasSeguro; 
		
		final JPanel jPanelParametrosReportesSeguro=this.jPanelParametrosReportesSeguro;
		//final JScrollPane jScrollPanelDatosSeguro=this.jScrollPanelDatosSeguro;
		final JTable jTableDatosSeguro=this.jTableDatosSeguro;		
		final JPanel jPanelPaginacionSeguro=this.jPanelPaginacionSeguro;
		//final JScrollPane jScrollPanelDatosEdicionSeguro=this.jScrollPanelDatosEdicionSeguro;
		final JPanel jPanelAccionesSeguro=this.jPanelAccionesSeguro;
		
		JPanel jPanelCamposAuxiliarSeguro=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSeguro=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSeguro!=null) {
			jPanelCamposAuxiliarSeguro=this.jInternalFrameDetalleFormSeguro.jPanelCamposSeguro;
			jPanelAccionesFormularioAuxiliarSeguro=this.jInternalFrameDetalleFormSeguro.jPanelAccionesFormularioSeguro;
		}
		
		final JPanel jPanelCamposSeguro=jPanelCamposAuxiliarSeguro;
		final JPanel jPanelAccionesFormularioSeguro=jPanelAccionesFormularioAuxiliarSeguro;
		
		
		final JMenuBar jmenuBarSeguro=this.jmenuBarSeguro;
		final JToolBar jTtoolBarSeguro=this.jTtoolBarSeguro;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSeguro=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSeguro=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSeguro!=null) {
			jmenuBarDetalleAuxiliarSeguro=this.jInternalFrameDetalleFormSeguro.jmenuBarDetalleSeguro;
			jTtoolBarDetalleAuxiliarSeguro=this.jInternalFrameDetalleFormSeguro.jTtoolBarDetalleSeguro;
		}
		
		final JMenuBar jmenuBarDetalleSeguro=jmenuBarDetalleAuxiliarSeguro;
		final JToolBar jTtoolBarDetalleSeguro=jTtoolBarDetalleAuxiliarSeguro;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSeguro;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSeguro;
			processRunnable.jTableDatos=jTableDatosSeguro;
			processRunnable.jPanelCampos=jPanelCamposSeguro;
			processRunnable.jPanelPaginacion=jPanelPaginacionSeguro;
			processRunnable.jPanelAcciones=jPanelAccionesSeguro;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSeguro;
			
			
			processRunnable.jmenuBar=jmenuBarSeguro;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSeguro;
			processRunnable.jTtoolBar=jTtoolBarSeguro;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSeguro;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSeguro ,jPanelParametrosReportesSeguro,jTableDatosSeguro, /*jScrollPanelDatosSeguro,*/jPanelCamposSeguro,jPanelPaginacionSeguro, /*jScrollPanelDatosEdicionSeguro,*/ jPanelAccionesSeguro,jPanelAccionesFormularioSeguro,jmenuBarSeguro,jmenuBarDetalleSeguro,jTtoolBarSeguro,jTtoolBarDetalleSeguro);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSeguro ,jPanelParametrosReportesSeguro, jScrollPanelDatosSeguro,jPanelPaginacionSeguro, jScrollPanelDatosEdicionSeguro, jPanelAccionesSeguro,jPanelAccionesFormularioSeguro,jmenuBarSeguro,jmenuBarDetalleSeguro,jTtoolBarSeguro,jTtoolBarDetalleSeguro);
						
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
	
	public void finishProcessSeguro() {// throws Exception 
		this.finishProcessSeguro(true);
	}
	
	public void finishProcessSeguro(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSeguro ,this.jPanelParametrosReportesSeguro, this.jScrollPanelDatosSeguro,this.jPanelPaginacionSeguro, this.jScrollPanelDatosEdicionSeguro, this.jPanelAccionesSeguro,this.jPanelAccionesFormularioSeguro,this.jmenuBarSeguro,this.jmenuBarDetalleSeguro,this.jTtoolBarSeguro,this.jTtoolBarDetalleSeguro);		
		
		final JTabbedPane jTabbedPaneBusquedasSeguro=this.jTabbedPaneBusquedasSeguro; 
		
		final JPanel jPanelParametrosReportesSeguro=this.jPanelParametrosReportesSeguro;
		//final JScrollPane jScrollPanelDatosSeguro=this.jScrollPanelDatosSeguro;
		final JTable jTableDatosSeguro=this.jTableDatosSeguro;		
		final JPanel jPanelPaginacionSeguro=this.jPanelPaginacionSeguro;
		//final JScrollPane jScrollPanelDatosEdicionSeguro=this.jScrollPanelDatosEdicionSeguro;
		final JPanel jPanelAccionesSeguro=this.jPanelAccionesSeguro;
		
		JPanel jPanelCamposAuxiliarSeguro=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSeguro=new JPanel();
		
		if(this.jInternalFrameDetalleFormSeguro!=null) {
			jPanelCamposAuxiliarSeguro=this.jInternalFrameDetalleFormSeguro.jPanelCamposSeguro;
			jPanelAccionesFormularioAuxiliarSeguro=this.jInternalFrameDetalleFormSeguro.jPanelAccionesFormularioSeguro;
		}
		
		final JPanel jPanelCamposSeguro=jPanelCamposAuxiliarSeguro;
		final JPanel jPanelAccionesFormularioSeguro=jPanelAccionesFormularioAuxiliarSeguro;
		
		
		final JMenuBar jmenuBarSeguro=this.jmenuBarSeguro;		
		final JToolBar jTtoolBarSeguro=this.jTtoolBarSeguro;
				
		JMenuBar jmenuBarDetalleAuxiliarSeguro=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSeguro=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSeguro!=null) {
			jmenuBarDetalleAuxiliarSeguro=this.jInternalFrameDetalleFormSeguro.jmenuBarDetalleSeguro;
			jTtoolBarDetalleAuxiliarSeguro=this.jInternalFrameDetalleFormSeguro.jTtoolBarDetalleSeguro;		
		}
		
		final JMenuBar jmenuBarDetalleSeguro=jmenuBarDetalleAuxiliarSeguro;
		final JToolBar jTtoolBarDetalleSeguro=jTtoolBarDetalleAuxiliarSeguro;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSeguro;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSeguro;
			processRunnable.jTableDatos=jTableDatosSeguro;
			processRunnable.jPanelCampos=jPanelCamposSeguro;
			processRunnable.jPanelPaginacion=jPanelPaginacionSeguro;
			processRunnable.jPanelAcciones=jPanelAccionesSeguro;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSeguro;
			
			
			processRunnable.jmenuBar=jmenuBarSeguro;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSeguro;
			processRunnable.jTtoolBar=jTtoolBarSeguro;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSeguro;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSeguro ,jPanelParametrosReportesSeguro, jTableDatosSeguro,/*jScrollPanelDatosSeguro,*/jPanelCamposSeguro,jPanelPaginacionSeguro, /*jScrollPanelDatosEdicionSeguro,*/ jPanelAccionesSeguro,jPanelAccionesFormularioSeguro,jmenuBarSeguro,jmenuBarDetalleSeguro,jTtoolBarSeguro,jTtoolBarDetalleSeguro));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSeguro(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSeguro(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSeguro(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSeguro(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSeguro,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSeguro,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSeguro(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSeguro,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSeguro,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.seguroConstantesFunciones.getsFinalQuerySeguro();
		String  finalQueryPaginacionTodos=this.seguroConstantesFunciones.getsFinalQuerySeguro();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SeguroConstantesFunciones.getArrayColumnasGlobalesNoSeguro(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SeguroConstantesFunciones.getArrayColumnasGlobalesSeguro(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SeguroConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.segurosEliminados= new ArrayList<Seguro>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSeguro();
		
				///*SeguroSessionBean*/this.seguroSessionBean=new SeguroSessionBean();
			
			if(this.seguroSessionBean==null) {
				this.seguroSessionBean=new SeguroSessionBean();
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
					this.iNumeroPaginacion=SeguroConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SeguroConstantesFunciones.getClassesForeignKeysOfSeguro(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/seguro."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			segurosAux= new ArrayList<Seguro>();
			
				
			seguroLogic.setDatosCliente(this.datosCliente);
			seguroLogic.setDatosDeep(this.datosDeep);
			seguroLogic.setIsConDeep(true);
			
			
			seguroLogic.getSeguroDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					seguroLogic.getTodosSeguros(finalQueryGlobal,pagination);
					
					//seguroLogic.getTodosSegurosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(seguroLogic.getSeguros()==null|| seguroLogic.getSeguros().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							segurosAux= new ArrayList<Seguro>();
							segurosAux.addAll(seguroLogic.getSeguros());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							segurosAux= new ArrayList<Seguro>();
							segurosAux.addAll(seguros);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							seguroLogic.getTodosSeguros(finalQueryGlobal+"",this.pagination);												
							
							//seguroLogic.getTodosSegurosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSeguros("Todos",seguroLogic.getSeguros() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							seguroLogic.setSeguros(new ArrayList<Seguro>());					
							seguroLogic.getSeguros().addAll(segurosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							seguros=new ArrayList<Seguro>();
							seguros.addAll(segurosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSeguro=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSeguro=this.idActual;
				
				} else if(this.idSeguroActual!=null && this.idSeguroActual!=0L) {
					idSeguro=idSeguroActual;
				}
				
					
				this.sDetalleReporte=SeguroConstantesFunciones.getDetalleIndicePorId(idSeguro);
				
				this.seguros=new ArrayList<Seguro>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					seguroLogic.getEntity(idSeguro);
					
					//seguroLogic.getEntityWithConnection(idSeguro);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					seguroLogic.setSeguros(new ArrayList<Seguro>());
					seguroLogic.getSeguros().add(seguroLogic.getSeguro());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.seguros=new ArrayList<Seguro>();
					this.seguros.add(seguro);
				}
				
				if(seguroLogic.getSeguro()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=SeguroConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					seguroLogic.getSegurosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SeguroConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SeguroConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=seguroLogic.getSeguros()==null||seguroLogic.getSeguros().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=seguros==null|| seguros.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						segurosAux=new ArrayList<Seguro>();
						segurosAux.addAll(seguroLogic.getSeguros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							segurosAux=new ArrayList<Seguro>();
							segurosAux.addAll(seguros);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							seguroLogic.getSegurosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SeguroConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SeguroConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSeguros("FK_IdEmpleado",seguroLogic.getSeguros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSeguros("FK_IdEmpleado",seguros);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						seguroLogic.setSeguros(new ArrayList<Seguro>());
						seguroLogic.getSeguros().addAll(segurosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							seguros=new ArrayList<Seguro>();
							seguros.addAll(segurosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSeguro();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSeguro();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=seguroLogic.getSeguros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=seguros.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=seguroLogic.getSeguros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=seguros.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Seguro seguro) {
		Boolean permite=true;
		
		if(this.seguro.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SeguroConstantesFunciones.getOrderByListaSeguro();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SeguroConstantesFunciones.getOrderByListaSeguro();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Seguro seguro:seguroLogic.getSeguros()) {
				if(seguro.getsType().equals(Constantes2.S_TOTALES)) {
					seguroTotales=seguro;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Seguro seguro:this.seguros) {
				if(seguro.getsType().equals(Constantes2.S_TOTALES)) {
					seguroTotales=seguro;
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
			this.seguroAux=new Seguro();
			this.seguroAux.setsType(Constantes2.S_TOTALES);
			this.seguroAux.setIsNew(false);
			this.seguroAux.setIsChanged(false);
			this.seguroAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SeguroConstantesFunciones.TotalizarValoresFilaSeguro(this.seguroLogic.getSeguros(),this.seguroAux);
				
				this.seguroLogic.getSeguros().add(this.seguroAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SeguroConstantesFunciones.TotalizarValoresFilaSeguro(this.seguros,this.seguroAux);
				
				this.seguros.add(this.seguroAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		seguroTotales=new Seguro();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.seguroLogic.getSeguros().remove(seguroTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.seguros.remove(seguroTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		seguroTotales=new Seguro();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Seguro seguro:seguroLogic.getSeguros()) {
				if(seguro.getsType().equals(Constantes2.S_TOTALES)) {
					seguroTotales=seguro;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SeguroConstantesFunciones.TotalizarValoresFilaSeguro(this.seguroLogic.getSeguros(),seguroTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Seguro seguro:this.seguros) {
				if(seguro.getsType().equals(Constantes2.S_TOTALES)) {
					seguroTotales=seguro;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SeguroConstantesFunciones.TotalizarValoresFilaSeguro(this.seguros,seguroTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSegurosFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSegurosFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					seguroLogic.getSegurosFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
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
	
	public void inicializarPermisosSeguro() {
		this.isPermisoTodoSeguro=false;
		this.isPermisoNuevoSeguro=false;
		this.isPermisoActualizarSeguro=false;
		this.isPermisoActualizarOriginalSeguro=false;
		this.isPermisoEliminarSeguro=false;
		this.isPermisoGuardarCambiosSeguro=false;
		this.isPermisoConsultaSeguro=false;
		this.isPermisoBusquedaSeguro=false;
		this.isPermisoReporteSeguro=false;		
		this.isPermisoOrdenSeguro=false;		
		this.isPermisoPaginacionMedioSeguro=false;		
		this.isPermisoPaginacionAltoSeguro=false;
		this.isPermisoPaginacionTodoSeguro=false;
		this.isPermisoCopiarSeguro=false;		
		this.isPermisoVerFormSeguro=false;		
		this.isPermisoDuplicarSeguro=false;		
		this.isPermisoOrdenSeguro=false;		
	}
	
	public void setPermisosUsuarioSeguro(Boolean isPermiso) {
		this.isPermisoTodoSeguro=isPermiso;
		this.isPermisoNuevoSeguro=isPermiso;
		this.isPermisoActualizarSeguro=isPermiso;
		this.isPermisoActualizarOriginalSeguro=isPermiso;
		this.isPermisoEliminarSeguro=isPermiso;
		this.isPermisoGuardarCambiosSeguro=isPermiso;
		this.isPermisoConsultaSeguro=isPermiso;
		this.isPermisoBusquedaSeguro=isPermiso;
		this.isPermisoReporteSeguro=isPermiso;
		this.isPermisoOrdenSeguro=isPermiso;		
		this.isPermisoPaginacionMedioSeguro=isPermiso;		
		this.isPermisoPaginacionAltoSeguro=isPermiso;		
		this.isPermisoPaginacionTodoSeguro=isPermiso;		
		this.isPermisoCopiarSeguro=isPermiso;		
		this.isPermisoVerFormSeguro=isPermiso;		
		this.isPermisoDuplicarSeguro=isPermiso;
		this.isPermisoOrdenSeguro=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSeguro(Boolean isPermiso) {
		//this.isPermisoTodoSeguro=isPermiso;
		this.isPermisoNuevoSeguro=isPermiso;
		this.isPermisoActualizarSeguro=isPermiso;
		this.isPermisoActualizarOriginalSeguro=isPermiso;
		this.isPermisoEliminarSeguro=isPermiso;
		this.isPermisoGuardarCambiosSeguro=isPermiso;
		//this.isPermisoConsultaSeguro=isPermiso;
		//this.isPermisoBusquedaSeguro=isPermiso;
		//this.isPermisoReporteSeguro=isPermiso;
		//this.isPermisoOrdenSeguro=isPermiso;		
		//this.isPermisoPaginacionMedioSeguro=isPermiso;		
		//this.isPermisoPaginacionAltoSeguro=isPermiso;		
		//this.isPermisoPaginacionTodoSeguro=isPermiso;		
		//this.isPermisoCopiarSeguro=isPermiso;		
		//this.isPermisoDuplicarSeguro=isPermiso;
		//this.isPermisoOrdenSeguro=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSeguroClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SeguroJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSeguro(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSeguroClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSeguroClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSeguroClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSeguroClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSeguro() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SeguroJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.seguroSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SeguroConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSeguro=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSeguro=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSeguro=this.isPermisoActualizarSeguro;
			this.isPermisoEliminarSeguro=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSeguro=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSeguro=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSeguro=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSeguro=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSeguro=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSeguro=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSeguro=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSeguro=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSeguro=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSeguro=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSeguro=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSeguro=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSeguro=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.seguroSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSeguro.setToolTipText(this.jTableDatosSeguro.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSeguro(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSeguro(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SeguroJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SeguroJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSeguro() throws Exception {
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
	public void inicializarCombosForeignKeySeguroListas()throws Exception {
		try	{						
			
				this.empleadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySeguroListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SeguroJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySeguroListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeySeguroListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			SeguroParameterReturnGeneral seguroReturnGeneral=new SeguroParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.seguroConstantesFunciones.cargarid_empleadoSeguro)
					 || (this.esRecargarFks && this.seguroConstantesFunciones.cargarid_empleadoSeguro)) {

					if(!this.seguroSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+seguroSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				seguroReturnGeneral=seguroLogic.cargarCombosLoteForeignKeySeguro(finalQueryGlobalEmpleado);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=seguroReturnGeneral.getempleadosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySeguro()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpleado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {
			if(this.seguroSessionBean==null) {
				this.seguroSessionBean=new SeguroSessionBean();
			}

			if(!this.seguroSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				Empleado empleado=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleado.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadosForeignKey,empleado,true)) {

					this.empleadosForeignKey.add(0,empleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeySeguro()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySeguro(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySeguro()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySeguro();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySeguro(Seguro seguro)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(seguro.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySeguro(Seguro seguro,String sTipoEvento)throws Exception {	
		try {
			
			

				if(seguro.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoSeguro")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(seguro.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySeguro()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.seguroConstantesFunciones.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySeguro()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySeguro()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySeguro()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSeguro()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySeguro()throws Exception {
		try {
			

			this.cargarCombosFrameEmpleadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySeguro(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySeguro()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSeguro.jComboBoxid_empleadoSeguro!=null && this.jInternalFrameDetalleFormSeguro.jComboBoxid_empleadoSeguro.getItemCount()>0) {
				this.jInternalFrameDetalleFormSeguro.jComboBoxid_empleadoSeguro.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public SeguroBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SeguroBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SeguroBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.seguroSessionBean=new SeguroSessionBean(); 
		this.seguroConstantesFunciones=new SeguroConstantesFunciones(); 
		this.seguroBean=new Seguro();//(this.seguroConstantesFunciones); 		
		this.seguroReturnGeneral=new SeguroParameterReturnGeneral(); 
		
		this.seguroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.seguroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SeguroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SeguroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SeguroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSeguro(true);
			
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
			
			this.seguroConstantesFunciones=new SeguroConstantesFunciones(); 
			this.seguroBean=new Seguro();//this.seguroConstantesFunciones); 			
			this.seguroReturnGeneral=new SeguroParameterReturnGeneral(); 
		
			SeguroBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Seguro Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.seguro=new Seguro();
			this.seguros = new ArrayList<Seguro>();
			this.segurosAux = new ArrayList<Seguro>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic=new SeguroLogic();
				this.seguroLogic.getNewConnexionToDeep("");
			}
			
			//this.seguroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.seguroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSeguro);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSeguro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSeguro);	
					}
					
					if(this.jInternalFrameImportacionSeguro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSeguro);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySeguro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySeguro);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSeguro!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSeguro);
				this.jInternalFrameDetalleFormSeguro.setVisible(false);
				this.jInternalFrameDetalleFormSeguro.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSeguro!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSeguro);
					this.jInternalFrameReporteDinamicoSeguro.setVisible(false);
					this.jInternalFrameReporteDinamicoSeguro.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSeguro!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSeguro);
					this.jInternalFrameImportacionSeguro.setVisible(false);
					this.jInternalFrameImportacionSeguro.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySeguro!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySeguro);
					this.jInternalFrameOrderBySeguro.setVisible(false);
					this.jInternalFrameOrderBySeguro.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSeguroActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SeguroConstantesFunciones.INUMEROPAGINACION;
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
			
			this.seguroReturnGeneral=new SeguroParameterReturnGeneral();
			
			this.seguroParameterGeneral=new SeguroParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.seguroLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.seguroSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SeguroJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.seguroSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SeguroConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.seguroSessionBean.getEsGuardarRelacionado(),this.seguroSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SeguroConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.seguroSessionBean.getEsGuardarRelacionado(),this.seguroSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSeguro=false;
			this.isVisibilidadCeldaDuplicarSeguro=true;
			this.isVisibilidadCeldaCopiarSeguro=true;
			this.isVisibilidadCeldaVerFormSeguro=true;
			this.isVisibilidadCeldaOrdenSeguro=true;
			this.isVisibilidadCeldaNuevoRelacionesSeguro=false;
			this.isVisibilidadCeldaModificarSeguro=false;
			this.isVisibilidadCeldaActualizarSeguro=false;
			this.isVisibilidadCeldaEliminarSeguro=false;
			this.isVisibilidadCeldaCancelarSeguro=false;
			this.isVisibilidadCeldaGuardarSeguro=false;
			this.isVisibilidadCeldaGuardarCambiosSeguro=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSeguro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSeguro();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSeguro(false);
			
			this.setPermisosUsuarioSeguro();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.seguroSessionBean.getEsGuardarRelacionado() 
				|| (this.seguroSessionBean.getEsGuardarRelacionado() && this.seguroSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSeguroClasesRelacionadas();
			}
			
			if(this.seguroSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSeguroClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SeguroJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSeguro();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSeguro();
			}
			
			if(!this.isPermisoBusquedaSeguro) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSeguro.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.seguroSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSeguro,this.isPermisoPaginacionMedioSeguro,this.isPermisoPaginacionTodoSeguro);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SeguroConstantesFunciones.getTiposSeleccionarSeguro());
				
				this.tiposColumnasSelect=SeguroConstantesFunciones.getTiposSeleccionarSeguro(true);
				
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
			//if(!this.seguroSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSeguro();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioSeguro(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioSeguro(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSeguro() ;
			
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
			
			this.empleadoLogic=new EmpleadoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				seguroImplementable= (SeguroImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SeguroConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				seguroImplementableHome= (SeguroImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SeguroConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.seguros= new ArrayList<Seguro>();
			this.segurosEliminados= new ArrayList<Seguro>();
						
			this.isEsNuevoSeguro=false;
			this.esParaAccionDesdeFormularioSeguro=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySeguro(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSeguro();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.seguroSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SeguroBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SeguroConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSeguro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSeguro(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSeguro!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSeguro();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSeguro();
			}
			
			SeguroBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSeguro.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSeguro.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSeguro.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSeguro(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Seguro: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSeguro() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSeguro")) {
				iIndex=this.jInternalFrameDetalleFormSeguro.jTabbedPaneRelacionesSeguro.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSeguro.jTabbedPaneRelacionesSeguro.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSeguro.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSeguro();	
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
	
	public void cargarCombosForeignKeySeguro(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySeguro(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySeguro(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySeguroListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySeguro();
		
		this.cargarCombosFrameForeignKeySeguro();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySeguro();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySeguro();
		}
	}
	
	

	public void cargarCombosForeignKeyEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleado(this.empleadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoSeguroActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.seguroSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSeguro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
			
			
			if(jTableDatosSeguro.getRowCount()>=1) {
				jTableDatosSeguro.removeRowSelectionInterval(0, jTableDatosSeguro.getRowCount()-1);						
			}
			
			this.isEsNuevoSeguro=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSeguro(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSeguro(true);			
			//this.seguro=new Seguro();
			//this.seguro.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSeguro(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSeguro() ;
			
			if(SeguroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSeguro(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.seguro);	
			this.actualizarInformacion("INFO_PADRE",false,this.seguro);				
			
			SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
			
			if(this.seguroSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Seguro: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSeguroActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Seguro> segurosSeleccionados=new ArrayList<Seguro>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSeguro.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSeguro.getSelectedRows().length;			
			}
			
			segurosSeleccionados=this.getSegurosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSeguro--;			
				//Seguro seguroAux= new Seguro();			
				//seguroAux.setId(this.iIdNuevoSeguro);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Seguro seguroOrigen=new Seguro();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Seguro seguroOrigen : segurosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSeguro.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							seguroOrigen =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							seguroOrigen =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSeguro();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.seguro.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSeguro(seguroOrigen,this.seguro,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSeguro(this.seguro);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.seguroLogic.getSeguros().add(this.seguroAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.seguros.add(this.seguroAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSeguro(false);
				
				this.jTableDatosSeguro.setRowSelectionInterval(this.getIndiceNuevoSeguro(), this.getIndiceNuevoSeguro());
				
				int iLastRow =  this.jTableDatosSeguro.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSeguro.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSeguro.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSeguro(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Seguro> segurosSeleccionados=new ArrayList<Seguro>();									
		
			Seguro seguroOrigen=new Seguro();
			Seguro seguroDestino=new Seguro();
				
			segurosSeleccionados=this.getSegurosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSeguro.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || segurosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSeguro.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						seguroOrigen =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						seguroOrigen =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						seguroDestino =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						seguroDestino =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				seguroOrigen =segurosSeleccionados.get(0);
				seguroDestino =segurosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSeguro(seguroOrigen,seguroDestino,true,false);
				
				seguroDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(seguroDestino,seguroLogic.getSeguros());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(seguroDestino,seguros);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSeguro(false);
				
				//this.jTableDatosSeguro.setRowSelectionInterval(this.getIndiceNuevoSeguro(), this.getIndiceNuevoSeguro());
				
				int iLastRow =  this.jTableDatosSeguro.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSeguro.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSeguro.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSeguro(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSeguro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSeguro.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSeguro.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSeguro.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSeguro.setVisible(!isVisible);
			this.jPanelPaginacionSeguro.setVisible(!isVisible);
			this.jPanelAccionesSeguro.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSeguro();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSeguro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSeguro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySeguroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySeguro();
			
			this.abrirFrameOrderBySeguro();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySeguroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySeguro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSeguro(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSeguro);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSeguro.isMaximum()) {
					this.jInternalFrameDetalleFormSeguro.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSeguro.setSize(this.jInternalFrameDetalleFormSeguro.iWidthFormulario,this.jInternalFrameDetalleFormSeguro.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSeguro.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSeguro.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSeguro.isMaximum()) {
						this.jInternalFrameDetalleFormSeguro.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSeguro.jContentPaneDetalleSeguro.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSeguro.jTabbedPaneRelacionesSeguro.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSeguro.jContentPaneDetalleSeguro.getWidth(),SeguroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSeguro.jTabbedPaneRelacionesSeguro.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSeguro.jContentPaneDetalleSeguro.getWidth(),SeguroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSeguro.jTabbedPaneRelacionesSeguro.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSeguro.jContentPaneDetalleSeguro.getWidth(),SeguroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSeguro.setVisible(true);
	        this.jInternalFrameDetalleFormSeguro.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySeguro() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySeguro==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySeguro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySeguro,false,this);
				} else {
					this.jInternalFrameOrderBySeguro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySeguro,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySeguro);
				this.jInternalFrameOrderBySeguro.setVisible(false);
				this.jInternalFrameOrderBySeguro.setSelected(false);
				
				this.jInternalFrameOrderBySeguro.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySeguro"));
				
				this.inicializarActualizarBindingTablaOrderBySeguro();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSeguro() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSeguro==null) {
				
				this.jInternalFrameImportacionSeguro=new ImportacionJInternalFrame(SeguroConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSeguro);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSeguro);
				this.jInternalFrameImportacionSeguro.setVisible(false);
				this.jInternalFrameImportacionSeguro.setSelected(false);


				this.jInternalFrameImportacionSeguro.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSeguro"));
				this.jInternalFrameImportacionSeguro.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSeguro"));
				this.jInternalFrameImportacionSeguro.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSeguro"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSeguro() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSeguro==null) {
				this.jInternalFrameReporteDinamicoSeguro=new ReporteDinamicoJInternalFrame(SeguroConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSeguro);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSeguro);
				this.jInternalFrameReporteDinamicoSeguro.setVisible(false);
				this.jInternalFrameReporteDinamicoSeguro.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSeguro.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSeguro"));
				this.jInternalFrameReporteDinamicoSeguro.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSeguro"));
				this.jInternalFrameReporteDinamicoSeguro.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSeguro"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSeguro();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleSeguro() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSeguro);
			
	       	this.jInternalFrameDetalleFormSeguro.setVisible(false);
	        this.jInternalFrameDetalleFormSeguro.setSelected(false);
			
			//this.jInternalFrameDetalleFormSeguro.dispose();
			//this.jInternalFrameDetalleFormSeguro=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSeguro() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSeguro.setVisible(true);
	        this.jInternalFrameReporteDinamicoSeguro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSeguro() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSeguro.setVisible(true);
	        this.jInternalFrameImportacionSeguro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySeguro() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySeguro.setVisible(true);
	        this.jInternalFrameOrderBySeguro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySeguro() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySeguro.setVisible(false);
	        this.jInternalFrameOrderBySeguro.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSeguro() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSeguro.setVisible(false);
	        this.jInternalFrameReporteDinamicoSeguro.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSeguro() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSeguro.setVisible(false);
	        this.jInternalFrameImportacionSeguro.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSeguro(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSeguro(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSeguro.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSeguro(true);
			//this.isEsNuevoSeguro=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguro =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.seguro =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSeguro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSeguro(false) ;
			
			if(seguroSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SeguroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSeguro(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSeguro(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSeguroActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSeguro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguro =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.seguro =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSeguro(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSeguro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSeguro.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSeguro(true);
			//this.isEsNuevoSeguro=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguro =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.seguro =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.seguro.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSeguro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSeguro(false) ;
			
			if(SeguroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSeguro(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSeguro(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.seguroConstantesFunciones.cargarid_empleadoSeguro) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingSeguro(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosSeguro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSeguro,SeguroConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSeguro.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSeguro(false);
			
			//if(!this.isEsNuevoSeguro) {								
				int intSelectedRow = this.jTableDatosSeguro.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguro =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.seguro =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSeguro(this.seguro,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSeguro(this.seguro);
				
			}
			
			if(this.permiteMantenimiento(this.seguro)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.seguroSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSeguro=true;
					this.inicializarActualizarBindingTablaSeguro(false);
					this.isEsNuevoSeguro=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSeguro=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSeguro=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSeguro(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSeguro(false);
				
				this.habilitarDeshabilitarControlesSeguro(false);
			
												
				
				if(SeguroJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSeguro();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSeguroActionPerformed(evt,seguroSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSeguro(this.seguro,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSeguro.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,seguroSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.seguro.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Seguro.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguro.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSeguro.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguro =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				this.seguro.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.seguro =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				this.seguro.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.seguro)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.seguroSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SeguroModel) this.jTableDatosSeguro.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSeguro=true;
				this.inicializarActualizarBindingTablaSeguro(false);
				this.isEsNuevoSeguro=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSeguro(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSeguro(false);
				
				this.habilitarDeshabilitarControlesSeguro(false);
				
				
				
				if(SeguroJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSeguro();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSeguroActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSeguro.getRowCount()>=1) {
				jTableDatosSeguro.removeRowSelectionInterval(0, jTableDatosSeguro.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSeguro(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSeguro(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSeguro(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSeguro(false) ;
			
			this.isEsNuevoSeguro=false;
			
			if(SeguroJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSeguro();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSeguroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSeguro(false);
				
				//SI ES MANUAL
				if(SeguroJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSeguro();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSeguroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSeguro--;			
			//Seguro seguroAux= new Seguro();			
			//seguroAux.setId(this.iIdNuevoSeguro);
			
			if(this.jInternalFrameDetalleFormSeguro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSeguro();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSeguro(this.seguro);
			
			this.seguro.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.seguroLogic.getSeguros().add(this.seguroAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.seguros.add(this.seguroAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSeguro(false);
			
			this.jTableDatosSeguro.setRowSelectionInterval(this.getIndiceNuevoSeguro(), this.getIndiceNuevoSeguro());
			
			int iLastRow =  this.jTableDatosSeguro.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSeguro.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSeguro.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSeguro(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSeguroActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSeguro(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSeguro(false);
			
			//SI ES MANUAL
			if(SeguroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSeguro();
			}
			
			//this.abrirFrameTreeSeguro();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSeguroActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE SeguroS ?", "MANTENIMIENTO DE Seguro", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSeguro.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSeguro();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.seguroReturnGeneral=seguroLogic.procesarImportacionSegurosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.seguroParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSeguroReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSeguroActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSeguro.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSeguro.setFileImportacion(this.jInternalFrameImportacionSeguro.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSeguro.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSeguro.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSeguro.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSeguro.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSeguroActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Seguro> segurosSeleccionados=new ArrayList<Seguro>();		

		segurosSeleccionados=this.getSegurosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSeguro.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSeguro.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SeguroBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SeguroBaseDesign.jrxml";
			
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
			
			this.generarReporteSeguros("Todos",segurosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.seguroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Seguro",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSeguro.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSeguro.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SeguroConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SeguroConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoSeguro.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSeguro.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSeguro.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SeguroConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case SeguroConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSeguro.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SeguroConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case SeguroConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSeguro.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSeguro.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SeguroConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case SeguroConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoSeguroActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Seguro> segurosSeleccionados=new ArrayList<Seguro>();		
		
		segurosSeleccionados=this.getSegurosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"seguro";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Seguros");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSeguro.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSeguro.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SeguroConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SeguroConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(Seguro seguro:segurosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(seguro.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SeguroConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SeguroConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Seguro seguro:segurosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(seguro.getnombre());
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
			//	this.getFilaCabeceraExportarExcelSeguro(row);				
			//	iRow++;
			//}				
			
			//for(Seguro seguroAux:segurosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSeguro(seguroAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.seguroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Seguro",JOptionPane.INFORMATION_MESSAGE);
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
				this.seguroLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSeguro(false);
			
			//SI ES MANUAL
			if(SeguroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSeguro();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSeguroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSeguro(false);
			
			//SI ES MANUAL
			if(SeguroJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSeguro();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSeguroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSeguro(false);
			
			//SI ES MANUAL
			if(SeguroJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSeguro();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSeguro() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSeguro.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSeguro.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSeguro.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSeguro.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSeguro.setMinimumSize(dimensionMinimum);
		this.jTableDatosSeguro.setMaximumSize(dimensionMaximum);
		this.jTableDatosSeguro.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSeguro(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSeguro(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSeguro(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSeguro(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSeguro(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.seguroSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSeguro(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSeguro(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSeguro(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SeguroJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SeguroJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSeguro() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSeguro();
		
		this.inicializarActualizarBindingBotonesManualSeguro(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.seguroSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSeguro();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSeguro() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSeguro(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSeguro(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSeguro.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSeguro.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSeguro.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSeguro!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSeguro.jCheckBoxPostAccionNuevoSeguro.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSeguro.jCheckBoxPostAccionSinCerrarSeguro.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSeguro.jCheckBoxPostAccionSinMensajeSeguro.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSeguro.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSeguro.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSeguro.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSeguro!=null) {
				this.jInternalFrameDetalleFormSeguro.jCheckBoxPostAccionNuevoSeguro.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSeguro.jCheckBoxPostAccionSinCerrarSeguro.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSeguro.jCheckBoxPostAccionSinMensajeSeguro.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSeguro.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSeguro.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSeguro!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSeguro.jComboBoxTiposAccionesFormularioSeguro.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSeguro.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSeguro!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSeguro.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSeguro.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSeguro.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSeguro.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSeguro.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSeguro!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSeguro.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSeguro.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSeguro.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSeguro(Boolean esInicializar) throws Exception {
		try	{	
			if(SeguroJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSeguro(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSeguro() throws Exception {
		try	{
			if(SeguroJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSeguro();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSeguro() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSeguro.jComboBoxTiposAccionesFormularioSeguro.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSeguro.jComboBoxTiposAccionesFormularioSeguro.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSeguro() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSeguro.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSeguro.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSeguro.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSeguro.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSeguro.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSeguro.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSeguro.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSeguro.addItem(reporte);
			}
			
			
			if(!this.seguroSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSeguro.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSeguro.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSeguro.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSeguro.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSeguro.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSeguro.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSeguro!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSeguro.jComboBoxTiposAccionesFormularioSeguro.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSeguro.jComboBoxTiposAccionesFormularioSeguro.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSeguro.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSeguro.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSeguro.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSeguro();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSeguro() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSeguro!=null) {
				this.jInternalFrameReporteDinamicoSeguro.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSeguro.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSeguro!=null) {
				this.jInternalFrameReporteDinamicoSeguro.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSeguro.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSeguro!=null) {
				
				if(this.jInternalFrameReporteDinamicoSeguro.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSeguro.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSeguro.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSeguro.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSeguro.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSeguro.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSeguro()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoSeguro.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoSeguro.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSeguro(Boolean esInicializar) throws Exception {				
		if(SeguroJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSeguro();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSeguro() throws Exception {
		this.inicializarActualizarBindingTablaSeguro(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySeguro() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySeguro.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySeguro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySeguro.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SeguroPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySeguro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySeguro.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SeguroPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSeguroOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSeguroOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SeguroPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySeguro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySeguro.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SeguroPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySeguro.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSeguro(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=seguroLogic.getSeguros().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=seguros.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSeguro.setModel(new SeguroModel(this.seguroLogic.getSeguros(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSeguro.setModel(new SeguroModel(this.seguros,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySeguro!=null && this.jInternalFrameOrderBySeguro.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySeguro();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSeguro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSeguro,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SeguroPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SeguroConstantesFunciones.SCLASSWEBTITULO,seguroConstantesFunciones.resaltarSeleccionarSeguro,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SeguroConstantesFunciones.SCLASSWEBTITULO,seguroConstantesFunciones.resaltarSeleccionarSeguro,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSeguro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSeguro,SeguroConstantesFunciones.LABEL_ID));

		if(this.seguroConstantesFunciones.mostraridSeguro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SeguroConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.seguroConstantesFunciones.resaltaridSeguro,this.seguroConstantesFunciones.activaridSeguro,this,true,"idSeguro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.seguroConstantesFunciones.resaltaridSeguro,this.seguroConstantesFunciones.activaridSeguro,this,true,"idSeguro","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSeguro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSeguro,SeguroConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.seguroConstantesFunciones.mostrarid_empleadoSeguro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SeguroConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.seguroConstantesFunciones.resaltarid_empleadoSeguro,this,this.seguroConstantesFunciones.activarid_empleadoSeguro));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.seguroConstantesFunciones.resaltarid_empleadoSeguro,this,this.seguroConstantesFunciones.activarid_empleadoSeguro,true,"id_empleadoSeguro","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new SeguroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSeguro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSeguro,SeguroConstantesFunciones.LABEL_NOMBRE));

		if(this.seguroConstantesFunciones.mostrarnombreSeguro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SeguroConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.seguroConstantesFunciones.resaltarnombreSeguro,this.seguroConstantesFunciones.activarnombreSeguro,this,true,"nombreSeguro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.seguroConstantesFunciones.resaltarnombreSeguro,this.seguroConstantesFunciones.activarnombreSeguro,this,true,"nombreSeguro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SeguroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.seguroSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.seguroSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.seguroSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSeguro.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.seguroSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.seguroSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSeguro.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSeguro && this.isPermisoGuardarCambiosSeguro) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.seguroSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.seguroSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSeguro.addColumn(tableColumn);
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
			
			this.jTableDatosSeguro.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSeguro && this.isPermisoGuardarCambiosSeguro) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSeguro && this.isPermisoGuardarCambiosSeguro) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSeguro.moveColumn(this.jTableDatosSeguro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSeguro.moveColumn(this.jTableDatosSeguro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSeguro.moveColumn(this.jTableDatosSeguro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSeguro.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSeguro.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSeguro,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSeguro.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSeguro.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSeguro.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSeguro.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSeguro.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=seguroLogic.getSeguros().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=seguros.size()-1;
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
		//this.jTableDatosSeguro.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSeguro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSeguro();
			
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
				
				//this.isEsNuevoSeguro=false;
					
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
			
				if(this.seguroSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSeguro==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSeguro.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSeguro.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguro =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.seguro =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.seguro.getsType().equals("DUPLICADO")
				   || this.seguro.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSeguro=true;
				
				} else {
					this.isEsNuevoSeguro=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.seguroSessionBean.getEsGuardarRelacionado()) {
					if(this.seguro.getId()>=0 && !this.seguro.getIsNew()) {						
						this.isEsNuevoSeguro=false;
						
					} else {
						this.isEsNuevoSeguro=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSeguro(esRelaciones);						
				
				this.seleccionarSeguro(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.seguro.getId()<0) {
					this.isEsNuevoSeguro=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSeguro(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSeguro(evt,rowIndex);
				}	
				
				if(this.seguroSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Seguro: " + this.dDif); 
					}
				}								
				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSeguro(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.seguro)) {
					if(this.seguro.getId()>0) {
						this.seguro.setIsDeleted(true);
						
						this.segurosEliminados.add(this.seguro);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.seguroLogic.getSeguros().remove(this.seguro);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.seguros.remove(this.seguro);				
					}
					
					
					((SeguroModel) this.jTableDatosSeguro.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSeguro(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSeguro(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSeguro) {
			
			if(this.jInternalFrameDetalleFormSeguro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSeguro.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSeguro.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguro =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.seguro =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSeguro(this.seguro);
				}
				
				//ARCHITECTURE
				try {
					

					//Empleado
					if(!this.seguroConstantesFunciones.cargarid_empleadoSeguro || this.seguroConstantesFunciones.event_dependid_empleadoSeguro) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.seguro.getid_empleado());
									//this.inicializarActualizarBindingSeguro(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(seguro.getEmpleado()!=null) {
							this.empleadosForeignKey.add(seguro.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.seguro.getid_empleado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSeguro("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSeguro(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSeguro() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSeguro(Seguro seguro) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSeguro(seguro,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSeguro(Seguro seguro,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSeguro(seguro);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySeguro(seguro,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySeguro(seguro);
	}
	
	public void setVariablesObjetoActualToFormularioSeguro(Seguro seguro) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSeguro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSeguro.jLabelidSeguro.setText(seguro.getId().toString());
			this.jInternalFrameDetalleFormSeguro.jTextAreanombreSeguro.setText(seguro.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Seguro seguroLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,seguroLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Seguro seguroLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				seguroLocal=this.seguro;
			} else {
				seguroLocal=this.seguroAnterior;
			}
		}
		
		if(this.permiteMantenimiento(seguroLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSeguro(seguroLocal,true);
					
					if(seguroSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(seguroLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.seguroSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(seguroLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSeguro(Seguro seguro,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSeguro(seguro,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSeguro(seguro);
	}
	
	public void setVariablesFormularioToObjetoActualSeguro(Seguro seguro,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSeguro(seguro,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSeguro(Seguro seguro,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSeguro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSeguro.jLabelidSeguro.getText()==null || this.jInternalFrameDetalleFormSeguro.jLabelidSeguro.getText()=="" || this.jInternalFrameDetalleFormSeguro.jLabelidSeguro.getText()=="Id") {
				this.jInternalFrameDetalleFormSeguro.jLabelidSeguro.setText("0");
			}

			if(conColumnasBase) {seguro.setId(Long.parseLong(this.jInternalFrameDetalleFormSeguro.jLabelidSeguro.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SeguroConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSeguro.jLabelIdSeguro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			seguro.setnombre(this.jInternalFrameDetalleFormSeguro.jTextAreanombreSeguro.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SeguroConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSeguro.jLabelnombreSeguro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSeguro(Seguro seguroBean,Seguro seguro,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && seguroBean.getid_empleado()!=null && !seguroBean.getid_empleado().equals(-1L))) {seguro.setid_empleado(seguroBean.getid_empleado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSeguro(Seguro seguroOrigen,Seguro seguro,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && seguroOrigen.getId()!=null && !seguroOrigen.getId().equals(0L))) {seguro.setId(seguroOrigen.getId());}}
			if(conDefault || (!conDefault && seguroOrigen.getid_empleado()!=null && !seguroOrigen.getid_empleado().equals(-1L))) {seguro.setid_empleado(seguroOrigen.getid_empleado());}
			if(conDefault || (!conDefault && seguroOrigen.getnombre()!=null && !seguroOrigen.getnombre().equals(""))) {seguro.setnombre(seguroOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSeguro(Seguro seguro) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSeguro.jLabelidSeguro.setText(seguro.getId().toString());
			this.jInternalFrameDetalleFormSeguro.jTextAreanombreSeguro.setText(seguro.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSeguro(SeguroBean seguroBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSeguro.jLabelidSeguro.setText(seguroBean.getId().toString());
			this.jInternalFrameDetalleFormSeguro.jTextAreanombreSeguro.setText(seguroBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSeguro(SeguroParameterReturnGeneral seguroReturnGeneral,SeguroBean seguroBean,Boolean conDefault) throws Exception { 
		try {
			Seguro seguroLocal=new Seguro();
			
			seguroLocal=seguroReturnGeneral.getSeguro();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && seguroLocal.getId()!=null && !seguroLocal.getId().equals(0L))) {seguroBean.setId(seguroLocal.getId());}}
			if(conDefault || (!conDefault && seguroLocal.getid_empleado()!=null && !seguroLocal.getid_empleado().equals(-1L))) {seguroBean.setid_empleado(seguroLocal.getid_empleado());}
			if(conDefault || (!conDefault && seguroLocal.getnombre()!=null && !seguroLocal.getnombre().equals(""))) {seguroBean.setnombre(seguroLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSeguroGenerico(Long idSeguroSeleccionado,JComboBox jComboBoxSeguro,List<Seguro> segurosLocal)throws Exception {
		try {
			Seguro  seguroTemp=null;

			for(Seguro seguroAux:segurosLocal) {
				if(seguroAux.getId()!=null && seguroAux.getId().equals(idSeguroSeleccionado)) {
					seguroTemp=seguroAux;
					break;
				}
			}

			jComboBoxSeguro.setSelectedItem(seguroTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSeguroGenerico(JComboBox jComboBoxSeguro,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSeguro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSeguro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSeguro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSeguro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSeguro.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSeguro.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSeguro.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSeguro.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSeguro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSeguro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			seguro=(Seguro) seguroLogic.getSeguros().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			seguro =(Seguro) seguros.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!seguro.getIsNew() && !seguro.getIsChanged() && !seguro.getIsDeleted()) {
				sDescripcion=seguro.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=seguro.getempleado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Seguro seguroRow=new Seguro();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			seguroRow=(Seguro) seguroLogic.getSeguros().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			seguroRow=(Seguro) seguros.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSeguro(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSeguro.setVisible((this.isVisibilidadCeldaNuevoSeguro && this.isPermisoNuevoSeguro));			
			this.jButtonDuplicarSeguro.setVisible((this.isVisibilidadCeldaDuplicarSeguro && this.isPermisoDuplicarSeguro));			
			this.jButtonCopiarSeguro.setVisible((this.isVisibilidadCeldaCopiarSeguro && this.isPermisoCopiarSeguro));
			this.jButtonVerFormSeguro.setVisible((this.isVisibilidadCeldaVerFormSeguro && this.isPermisoVerFormSeguro));
			
			this.jButtonAbrirOrderBySeguro.setVisible((this.isVisibilidadCeldaOrdenSeguro && this.isPermisoOrdenSeguro));			
			
			this.jButtonNuevoRelacionesSeguro.setVisible((this.isVisibilidadCeldaNuevoRelacionesSeguro && this.isPermisoNuevoSeguro));			
			this.jButtonNuevoGuardarCambiosSeguro.setVisible((this.isVisibilidadCeldaNuevoSeguro && this.isPermisoNuevoSeguro && this.isPermisoGuardarCambiosSeguro));
			
			if(this.jInternalFrameDetalleFormSeguro!=null) {
			this.jInternalFrameDetalleFormSeguro.jButtonModificarSeguro.setVisible((this.isVisibilidadCeldaModificarSeguro && this.isPermisoActualizarSeguro));	
			this.jInternalFrameDetalleFormSeguro.jButtonActualizarSeguro.setVisible((this.isVisibilidadCeldaActualizarSeguro && this.isPermisoActualizarSeguro));	
			this.jInternalFrameDetalleFormSeguro.jButtonEliminarSeguro.setVisible((this.isVisibilidadCeldaEliminarSeguro && this.isPermisoEliminarSeguro));
			this.jInternalFrameDetalleFormSeguro.jButtonCancelarSeguro.setVisible(this.isVisibilidadCeldaCancelarSeguro);							
			this.jInternalFrameDetalleFormSeguro.jButtonGuardarCambiosSeguro.setVisible((this.isVisibilidadCeldaGuardarSeguro && this.isPermisoGuardarCambiosSeguro));			
			
			}
						
			this.jButtonGuardarCambiosTablaSeguro.setVisible((this.isVisibilidadCeldaGuardarCambiosSeguro && this.isPermisoGuardarCambiosSeguro));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSeguro.setVisible((this.isVisibilidadCeldaNuevoSeguro && this.isPermisoNuevoSeguro));						
			this.jButtonDuplicarToolBarSeguro.setVisible((this.isVisibilidadCeldaDuplicarSeguro && this.isPermisoDuplicarSeguro));						
			this.jButtonCopiarToolBarSeguro.setVisible((this.isVisibilidadCeldaCopiarSeguro && this.isPermisoCopiarSeguro));			
			this.jButtonVerFormToolBarSeguro.setVisible((this.isVisibilidadCeldaVerFormSeguro && this.isPermisoVerFormSeguro));			
			this.jButtonAbrirOrderByToolBarSeguro.setVisible((this.isVisibilidadCeldaOrdenSeguro && this.isPermisoOrdenSeguro));
			this.jButtonNuevoRelacionesToolBarSeguro.setVisible((this.isVisibilidadCeldaNuevoRelacionesSeguro && this.isPermisoNuevoSeguro));			
			this.jButtonNuevoGuardarCambiosToolBarSeguro.setVisible((this.isVisibilidadCeldaNuevoSeguro && this.isPermisoNuevoSeguro && this.isPermisoGuardarCambiosSeguro));			
			
			if(this.jInternalFrameDetalleFormSeguro!=null) {
			this.jInternalFrameDetalleFormSeguro.jButtonModificarToolBarSeguro.setVisible((this.isVisibilidadCeldaModificarSeguro && this.isPermisoActualizarSeguro));	
			this.jInternalFrameDetalleFormSeguro.jButtonActualizarToolBarSeguro.setVisible((this.isVisibilidadCeldaActualizarSeguro  && this.isPermisoActualizarSeguro));	
			this.jInternalFrameDetalleFormSeguro.jButtonEliminarToolBarSeguro.setVisible((this.isVisibilidadCeldaEliminarSeguro && this.isPermisoEliminarSeguro));
			this.jInternalFrameDetalleFormSeguro.jButtonCancelarToolBarSeguro.setVisible(this.isVisibilidadCeldaCancelarSeguro);				
			this.jInternalFrameDetalleFormSeguro.jButtonGuardarCambiosToolBarSeguro.setVisible((this.isVisibilidadCeldaGuardarSeguro && this.isPermisoGuardarCambiosSeguro));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSeguro.setVisible((this.isVisibilidadCeldaGuardarCambiosSeguro && this.isPermisoGuardarCambiosSeguro));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSeguro.setVisible((this.isVisibilidadCeldaNuevoSeguro && this.isPermisoNuevoSeguro));			
			this.jMenuItemDuplicarSeguro.setVisible((this.isVisibilidadCeldaDuplicarSeguro && this.isPermisoDuplicarSeguro));			
			this.jMenuItemCopiarSeguro.setVisible((this.isVisibilidadCeldaCopiarSeguro && this.isPermisoCopiarSeguro));			
			this.jMenuItemVerFormSeguro.setVisible((this.isVisibilidadCeldaVerFormSeguro && this.isPermisoVerFormSeguro));			
			this.jMenuItemAbrirOrderBySeguro.setVisible((this.isVisibilidadCeldaOrdenSeguro && this.isPermisoOrdenSeguro));			
			//this.jMenuItemMostrarOcultarSeguro.setVisible((this.isVisibilidadCeldaOrdenSeguro && this.isPermisoOrdenSeguro));
			this.jMenuItemDetalleAbrirOrderBySeguro.setVisible((this.isVisibilidadCeldaOrdenSeguro && this.isPermisoOrdenSeguro));			
			//this.jMenuItemDetalleMostrarOcultarSeguro.setVisible((this.isVisibilidadCeldaOrdenSeguro && this.isPermisoOrdenSeguro));			
			this.jMenuItemNuevoRelacionesSeguro.setVisible((this.isVisibilidadCeldaNuevoRelacionesSeguro && this.isPermisoNuevoSeguro));			
			this.jMenuItemNuevoGuardarCambiosSeguro.setVisible((this.isVisibilidadCeldaNuevoSeguro && this.isPermisoNuevoSeguro && this.isPermisoGuardarCambiosSeguro));									
			
			if(this.jInternalFrameDetalleFormSeguro!=null) {
			this.jInternalFrameDetalleFormSeguro.jMenuItemModificarSeguro.setVisible((this.isVisibilidadCeldaModificarSeguro && this.isPermisoActualizarSeguro));	
			this.jInternalFrameDetalleFormSeguro.jMenuItemActualizarSeguro.setVisible((this.isVisibilidadCeldaActualizarSeguro && this.isPermisoActualizarSeguro));	
			this.jInternalFrameDetalleFormSeguro.jMenuItemEliminarSeguro.setVisible((this.isVisibilidadCeldaEliminarSeguro && this.isPermisoEliminarSeguro));
			this.jInternalFrameDetalleFormSeguro.jMenuItemCancelarSeguro.setVisible(this.isVisibilidadCeldaCancelarSeguro);				
			}
			
			this.jMenuItemGuardarCambiosSeguro.setVisible((this.isVisibilidadCeldaGuardarSeguro && this.isPermisoGuardarCambiosSeguro));						
			this.jMenuItemGuardarCambiosTablaSeguro.setVisible((this.isVisibilidadCeldaGuardarCambiosSeguro && this.isPermisoGuardarCambiosSeguro));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSeguro=this.jButtonNuevoSeguro.isVisible();
			this.isVisibilidadCeldaDuplicarSeguro=this.jButtonDuplicarSeguro.isVisible();
			this.isVisibilidadCeldaCopiarSeguro=this.jButtonCopiarSeguro.isVisible();
			this.isVisibilidadCeldaVerFormSeguro=this.jButtonVerFormSeguro.isVisible();
			
			this.isVisibilidadCeldaOrdenSeguro=this.jButtonAbrirOrderBySeguro.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSeguro=this.jButtonNuevoRelacionesSeguro.isVisible();
			this.isVisibilidadCeldaModificarSeguro=this.jButtonModificarSeguro.isVisible();
			
			if(this.jInternalFrameDetalleFormSeguro!=null) {
			this.isVisibilidadCeldaActualizarSeguro=this.jInternalFrameDetalleFormSeguro.jButtonActualizarSeguro.isVisible();
			this.isVisibilidadCeldaEliminarSeguro=this.jInternalFrameDetalleFormSeguro.jButtonEliminarSeguro.isVisible();
			this.isVisibilidadCeldaCancelarSeguro=this.jInternalFrameDetalleFormSeguro.jButtonCancelarSeguro.isVisible();
			this.isVisibilidadCeldaGuardarSeguro=this.jInternalFrameDetalleFormSeguro.jButtonGuardarCambiosSeguro.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSeguro=this.jButtonGuardarCambiosTablaSeguro.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSeguro=this.jButtonNuevoToolBarSeguro.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSeguro=this.jButtonNuevoRelacionesToolBarSeguro.isVisible();
			
			if(this.jInternalFrameDetalleFormSeguro!=null) {
			this.isVisibilidadCeldaModificarSeguro=this.jInternalFrameDetalleFormSeguro.jButtonModificarToolBarSeguro.isVisible();
			this.isVisibilidadCeldaActualizarSeguro=this.jInternalFrameDetalleFormSeguro.jButtonActualizarToolBarSeguro.isVisible();
			this.isVisibilidadCeldaEliminarSeguro=this.jInternalFrameDetalleFormSeguro.jButtonEliminarToolBarSeguro.isVisible();
			this.isVisibilidadCeldaCancelarSeguro=this.jInternalFrameDetalleFormSeguro.jButtonCancelarToolBarSeguro.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSeguro=this.jButtonGuardarCambiosToolBarSeguro.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSeguro=this.jButtonGuardarCambiosTablaToolBarSeguro.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSeguro=this.jMenuItemNuevoSeguro.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSeguro=this.jMenuItemNuevoRelacionesSeguro.isVisible();
			
			if(this.jInternalFrameDetalleFormSeguro!=null) {
			this.isVisibilidadCeldaModificarSeguro=this.jInternalFrameDetalleFormSeguro.jMenuItemModificarSeguro.isVisible();
			this.isVisibilidadCeldaActualizarSeguro=this.jInternalFrameDetalleFormSeguro.jMenuItemActualizarSeguro.isVisible();
			this.isVisibilidadCeldaEliminarSeguro=this.jInternalFrameDetalleFormSeguro.jMenuItemEliminarSeguro.isVisible();
			this.isVisibilidadCeldaCancelarSeguro=this.jInternalFrameDetalleFormSeguro.jMenuItemCancelarSeguro.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSeguro=this.jMenuItemGuardarCambiosSeguro.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSeguro=this.jMenuItemGuardarCambiosTablaSeguro.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSeguro(Boolean esInicializar) {
		if(SeguroJInternalFrame.ISBINDING_MANUAL) {			
			if(this.seguroSessionBean.getConGuardarRelaciones()) {
				//if(this.seguroSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSeguro();
			}
			
			this.inicializarActualizarBindingBotonesManualSeguro(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSeguro() {
		this.jButtonNuevoSeguro.setVisible(this.isPermisoNuevoSeguro);			
		this.jButtonDuplicarSeguro.setVisible(this.isPermisoDuplicarSeguro);			
		this.jButtonCopiarSeguro.setVisible(this.isPermisoCopiarSeguro);			
		this.jButtonVerFormSeguro.setVisible(this.isPermisoVerFormSeguro);			
		
		this.jButtonAbrirOrderBySeguro.setVisible(this.isPermisoOrdenSeguro);					
		
		this.jButtonNuevoRelacionesSeguro.setVisible(this.isPermisoNuevoSeguro);			
		
		if(this.jInternalFrameDetalleFormSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguro.jButtonModificarSeguro.setVisible(this.isPermisoActualizarSeguro);	
			this.jInternalFrameDetalleFormSeguro.jButtonActualizarSeguro.setVisible(this.isPermisoActualizarSeguro);	
			this.jInternalFrameDetalleFormSeguro.jButtonEliminarSeguro.setVisible(this.isPermisoEliminarSeguro);
			this.jInternalFrameDetalleFormSeguro.jButtonCancelarSeguro.setVisible(this.isVisibilidadCeldaCancelarSeguro);						
			this.jInternalFrameDetalleFormSeguro.jButtonGuardarCambiosSeguro.setVisible(this.isPermisoGuardarCambiosSeguro);							
		}
		
		this.jButtonGuardarCambiosTablaSeguro.setVisible(this.isPermisoActualizarSeguro);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSeguro() {
		this.jInternalFrameDetalleFormSeguro.jButtonModificarSeguro.setVisible(this.isPermisoActualizarSeguro);	
		this.jInternalFrameDetalleFormSeguro.jButtonActualizarSeguro.setVisible(this.isPermisoActualizarSeguro);	
		this.jInternalFrameDetalleFormSeguro.jButtonEliminarSeguro.setVisible(this.isPermisoEliminarSeguro);
		this.jInternalFrameDetalleFormSeguro.jButtonCancelarSeguro.setVisible(this.isVisibilidadCeldaCancelarSeguro);							
		this.jInternalFrameDetalleFormSeguro.jButtonGuardarCambiosSeguro.setVisible((this.isVisibilidadCeldaGuardarSeguro && this.isPermisoGuardarCambiosSeguro));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSeguro() {
		if(SeguroJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSeguro();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSeguro() {
	}
	
	public void jTableDatosSeguroListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSeguro(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSeguroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSeguro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSeguro(this.getseguro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSeguro(this.seguro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.seguro =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.seguro =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.seguro==null) {
						this.seguro = new Seguro();
					}

					this.setVariablesFormularioToObjetoActualSeguro(this.seguro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSeguro(this.seguro);
				}

				if(this.seguro.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.seguro.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSeguro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoSeguroActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="Empleado";

			if(!this.sFinalQueryGeneral_empleado.equals("")) {
				this.empleadoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_empleado);
				this.empleadoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.empleadoBeanSwingJInternalFrame.procesarBusqueda(this.empleadoBeanSwingJInternalFrame.sAccionBusqueda);
				this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingEmpleado(false);
			}

			if(!this.sFinalQueryComboEmpleado.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderSeguro=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosSeguro.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderSeguro=(TitledBorder)this.jScrollPanelDatosSeguro.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderSeguro.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoSeguroUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebSeguro(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSeguro.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSeguro.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSeguro.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguro =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.seguro =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSeguro(this.getseguro(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSeguro(this.seguro);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.seguroLogic.getConnexion());

				if(this.seguro.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.seguro.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSeguro=(TitledBorder)this.jScrollPanelDatosSeguro.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderSeguro.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoSeguroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSeguro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSeguro(this.getseguro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSeguro(this.seguro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.seguro =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.seguro =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.seguro==null) {
						this.seguro = new Seguro();
					}

					this.setVariablesFormularioToObjetoActualSeguro(this.seguro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSeguro(this.seguro);
				}

				if(this.seguro.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.seguro.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSeguro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreSeguroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSeguro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSeguro(this.getseguro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSeguro(this.seguro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.seguro =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.seguro =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.seguro==null) {
						this.seguro = new Seguro();
					}

					this.setVariablesFormularioToObjetoActualSeguro(this.seguro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSeguro(this.seguro);
				}

				if(this.seguro.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.seguro.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSeguro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguroLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoSeguroActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSeguro(false,false);

			this.getSegurosFK_IdEmpleado();

			this.inicializarActualizarBindingSeguro(false);

			//if(SeguroBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSeguro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguroLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSeguro() {
		if(this.jInternalFrameDetalleFormSeguro!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSeguro!=null) {
			this.jInternalFrameDetalleFormSeguro.setVisible(false);	    			
			this.jInternalFrameDetalleFormSeguro.dispose();
			this.jInternalFrameDetalleFormSeguro=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSeguro!=null) {
			this.jInternalFrameReporteDinamicoSeguro.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSeguro.dispose();
			this.jInternalFrameReporteDinamicoSeguro=null;
		}
		
		if(this.jInternalFrameImportacionSeguro!=null) {
			this.jInternalFrameImportacionSeguro.setVisible(false);	    			
			this.jInternalFrameImportacionSeguro.dispose();
			this.jInternalFrameImportacionSeguro=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSeguro();
			
			SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
			
			
			if(sTipo.equals("NuevoSeguro")) {
				jButtonNuevoSeguroActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSeguro")) {
				jButtonDuplicarSeguroActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSeguro")) {
				jButtonCopiarSeguroActionPerformed(evt);
			} else if(sTipo.equals("VerFormSeguro")) {
				jButtonVerFormSeguroActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSeguro")) {
				jButtonNuevoSeguroActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSeguro")) {
				jButtonDuplicarSeguroActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSeguro")) {
				jButtonNuevoSeguroActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSeguro")) {
				jButtonDuplicarSeguroActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSeguro")) {
				jButtonNuevoSeguroActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSeguro")) {
				jButtonNuevoSeguroActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSeguro")) {
				jButtonNuevoSeguroActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSeguro")) {
				jButtonModificarSeguroActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSeguro")) {
				jButtonModificarSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSeguro")) {
				jButtonModificarSeguroActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSeguro")) {
				jButtonActualizarSeguroActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSeguro")) {
				jButtonActualizarSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSeguro")) {
				jButtonActualizarSeguroActionPerformed(evt);
			} else if(sTipo.equals("EliminarSeguro")) {
				jButtonEliminarSeguroActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSeguro")) {
				jButtonEliminarSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSeguro")) {
				jButtonEliminarSeguroActionPerformed(evt);
			} else if(sTipo.equals("CancelarSeguro")) {
				jButtonCancelarSeguroActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSeguro")) {
				jButtonCancelarSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSeguro")) {
				jButtonCancelarSeguroActionPerformed(evt);
			} else if(sTipo.equals("CerrarSeguro")) {
				jButtonCerrarSeguroActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSeguro")) {
				jButtonCerrarSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSeguro")) {
				jButtonCerrarSeguroActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSeguro")) {
				jButtonMostrarOcultarSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSeguro")) {
				jButtonCancelarSeguroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSeguro")) {
				jButtonGuardarCambiosSeguroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSeguro")) {
				jButtonGuardarCambiosSeguroActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSeguro")) {
				jButtonCopiarSeguroActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSeguro")) {
				jButtonVerFormSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSeguro")) {
				jButtonGuardarCambiosSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSeguro")) {
				jButtonCopiarSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSeguro")) {
				jButtonVerFormSeguroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSeguro")) {
				jButtonGuardarCambiosSeguroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSeguro")) {
				jButtonGuardarCambiosSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSeguro")) {
				jButtonGuardarCambiosSeguroActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSeguro")) {
				jButtonRecargarInformacionSeguroActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSeguro")) {
				jButtonRecargarInformacionSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSeguro")) {
				jButtonRecargarInformacionSeguroActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSeguro")) {
				jButtonAnterioresSeguroActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSeguro")) {
				jButtonAnterioresSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSeguro")) {
				jButtonAnterioresSeguroActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSeguro")) {
				jButtonSiguientesSeguroActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSeguro")) {
				jButtonSiguientesSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSeguro")) {
				jButtonSiguientesSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySeguro") || sTipo.equals("MenuItemDetalleAbrirOrderBySeguro")) {
				jButtonAbrirOrderBySeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSeguro") || sTipo.equals("MenuItemDetalleMostrarOcultarSeguro")) {
				jButtonMostrarOcultarSeguroActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSeguro")) {
				jButtonNuevoGuardarCambiosSeguroActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSeguro")) {
				jButtonNuevoGuardarCambiosSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSeguro")) {
				jButtonNuevoGuardarCambiosSeguroActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSeguro")) {
				jButtonCerrarReporteDinamicoSeguroActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSeguro")) {
				jButtonGenerarReporteDinamicoSeguroActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSeguro")) {
				
				jButtonGenerarExcelReporteDinamicoSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSeguro")) {
				jButtonCerrarImportacionSeguroActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSeguro")) {
				
				jButtonGenerarImportacionSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSeguro")) {
				
				jButtonAbrirImportacionSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSeguro")) {
				jComboBoxTiposAccionesSeguroActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSeguro")) {
				jComboBoxTiposRelacionesSeguroActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSeguro")) {
				jComboBoxTiposAccionesSeguroActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSeguro")) {
				
				jComboBoxTiposSeleccionarSeguroActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSeguro")) {
				jTextFieldValorCampoGeneralSeguroActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySeguro")) {
				jButtonAbrirOrderBySeguroActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSeguro")) {
				jButtonAbrirOrderBySeguroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySeguro")) {
				jButtonCerrarOrderBySeguroActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSeguroBusqueda")) {
				this.jButtonidSeguroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoSeguro")) {
				this.jButtonid_empleadoSeguroActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoSeguroUpdate")) {
				this.jButtonid_empleadoSeguroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoSeguroBusqueda")) {
				this.jButtonid_empleadoSeguroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSeguroBusqueda")) {
				this.jButtonnombreSeguroBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoSeguro")) {
				this.jButtonid_empleadoSeguroActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoSeguro")) {
				this.jButtonFK_IdEmpleadoSeguroActionPerformed(evt);
			}
			
			;
			
			
			SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSeguro();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSeguroActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguro);
				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
				
				


				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Seguro seguroLocal=null;
			
			if(!this.getEsControlTabla()) {
				seguroLocal=this.seguro;
			} else {
				seguroLocal=this.seguroAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguro);
				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
							
				
				


				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSeguroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSeguro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguroAnterior =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.seguroAnterior =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
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
			
			SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
			
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
			
			


			
			SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSeguroActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguro);
				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
								
						
				


				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguro.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguro);
				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
								
				
				


				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSeguroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSeguro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguroAnterior =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.seguroAnterior =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguro);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSeguroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSeguro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguroAnterior =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.seguroAnterior =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSeguroActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.seguro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.seguro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguro);
				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
							
				
				


				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguro.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSeguroActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSeguro.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.seguroAnterior =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.seguroAnterior =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
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
			
			SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
			
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
			
			


			
			SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSeguroActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.seguro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.seguro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguro);
				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
								
				
				


				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSeguroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSeguro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguroAnterior =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.seguroAnterior =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSeguroActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.seguro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.seguro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSeguroActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguro);
				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSeguro")) {
					jCheckBoxSeleccionarTodosSeguroItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSeguro")) {
					jCheckBoxSeleccionadosSeguroItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSeguro")) {
					
				}
				
				


				
				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.seguro);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.seguro);
				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
												
				
				


				
				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSeguroActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSeguro.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.seguroAnterior =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.seguroAnterior =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSeguroActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguro);
				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
				
				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
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
			
			SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
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
			
			


			
			SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSeguroActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguro);
				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguro.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguro.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguro);
				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
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
				
				


				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguro.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSeguroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSeguro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguroAnterior =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.seguroAnterior =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSeguro")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSeguroListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSeguro.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.seguro =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.seguro =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.seguro);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSeguro")) {
				
				}
				
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSeguro")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSeguro.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSeguro")) {
			
			}
			
			SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSeguro();
			
			SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
			
			if(sTipo.equals("NuevoSeguro")) {
				jButtonNuevoSeguroActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSeguro")) {
				jButtonDuplicarSeguroActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSeguro")) {
				jButtonCopiarSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSeguro")) {
				jButtonVerFormSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSeguro")) {
				jButtonNuevoSeguroActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSeguro")) {
				jButtonModificarSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSeguro")) {
				jButtonActualizarSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSeguro")) {
				jButtonEliminarSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSeguro")) {
				jButtonGuardarCambiosSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSeguro")) {
				jButtonCancelarSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSeguro")) {
				jButtonCerrarSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSeguro")) {
				jButtonGuardarCambiosSeguroActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSeguro")) {
				jButtonNuevoGuardarCambiosSeguroActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySeguro")) {
				jButtonAbrirOrderBySeguroActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSeguro")) {
				jButtonRecargarInformacionSeguroActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSeguro")) {
				jButtonAnterioresSeguroActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSeguro")) {
				jButtonSiguientesSeguroActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSeguroBusqueda")) {
				this.jButtonidSeguroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoSeguro")) {
				this.jButtonid_empleadoSeguroActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoSeguroUpdate")) {
				this.jButtonid_empleadoSeguroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoSeguroBusqueda")) {
				this.jButtonid_empleadoSeguroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSeguroBusqueda")) {
				this.jButtonnombreSeguroBusquedaActionPerformed(evt);
			}
			
			SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSeguro();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSeguro")) {
				closingInternalFrameSeguro();
				
			} else if(sTipo.equals("jButtonCancelarSeguro")) {
				JInternalFrameBase jInternalFrameDetalleFormSeguro = (JInternalFrameBase)evt.getSource();
	            	
	            SeguroBeanSwingJInternalFrame jInternalFrameParent=(SeguroBeanSwingJInternalFrame)jInternalFrameDetalleFormSeguro.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSeguroActionPerformed(null);
			}
			
			SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.seguro,new Object(),this.seguroParameterGeneral,this.seguroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSeguro(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSeguro(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSeguro(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.seguro)) {
			if(!esControlTabla) {
				if(SeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSeguro(this.seguro,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSeguro(this.seguro);			
				}
				
				if(this.seguroSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSeguro(this.seguro,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.seguroReturnGeneral=seguroLogic.procesarEventosSegurosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.seguroLogic.getSeguros(),this.seguro,this.seguroParameterGeneral,this.isEsNuevoSeguro,classes);//this.seguroLogic.getSeguro()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSeguro(this.seguroReturnGeneral,this.seguroBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.seguroSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSeguro(classes,this.seguroReturnGeneral,this.seguroBean,false);
					}
						
					if(this.seguroReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySeguro(this.seguroReturnGeneral.getSeguro());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSeguro(this.seguroReturnGeneral.getSeguro());	
					}
						
					if(this.seguroReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSeguro(this.seguroReturnGeneral.getSeguro(),classes);//this.seguroBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSeguro(this.seguro,classes);//this.seguroBean);									
				}
			
				if(SeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSeguro(this.seguro,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSeguro(this.seguro);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.seguroAnterior!=null) {
						this.seguro=this.seguroAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.seguroReturnGeneral=seguroLogic.procesarEventosSegurosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.seguroLogic.getSeguros(),this.seguro,this.seguroParameterGeneral,this.isEsNuevoSeguro,classes);//this.seguroLogic.getSeguro()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.seguroSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.seguroSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.seguroReturnGeneral.getSeguro(),seguroLogic.getSeguros());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.seguroReturnGeneral.getSeguro(),this.seguros);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSeguro.repaint();
				
				//((AbstractTableModel) this.jTableDatosSeguro.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSeguro();
			}
		}
	}
	
	public void actualizarVisualTableDatosSeguro() throws Exception {
		
		SeguroModel seguroModel=(SeguroModel)this.jTableDatosSeguro.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			seguroModel.seguros=this.seguroLogic.getSeguros();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			seguroModel.seguros=this.seguros;
		}
		
		
		((SeguroModel) this.jTableDatosSeguro.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSeguro() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getseguroAnterior(),this.seguroLogic.getSeguros());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getseguroAnterior(),this.seguros);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSeguro();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSeguro(Seguro seguro,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
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
										
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.seguro,new Object(),generalEntityParameterGeneral,this.seguroReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.seguroSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SeguroConstantesFunciones.getClassesRelationshipsOfSeguro(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SeguroConstantesFunciones.getClassesRelationshipsFromStringsOfSeguro(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSeguro(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.seguro,new Object(),generalEntityParameterGeneral,this.seguroReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSeguro(SeguroBean seguroBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSeguro(ArrayList<Classe> classes,SeguroReturnGeneral seguroReturnGeneral,SeguroBean seguroBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSeguro(Seguro seguro,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.seguro)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSeguro = new SeguroDetalleFormJInternalFrame(jDesktopPane,this.seguroSessionBean.getConGuardarRelaciones(),this.seguroSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSeguro);
		this.jInternalFrameDetalleFormSeguro.setVisible(false);
		this.jInternalFrameDetalleFormSeguro.setSelected(false);						
		
		this.jInternalFrameDetalleFormSeguro.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSeguro.seguroLogic=this.seguroLogic;
		
		this.cargarCombosFrameForeignKeySeguro("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSeguro();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSeguro();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySeguro("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySeguro();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSeguro.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSeguro"));
		
		this.jInternalFrameDetalleFormSeguro.jButtonModificarSeguro.addActionListener(new ButtonActionListener(this,"ModificarSeguro"));

		
		this.jInternalFrameDetalleFormSeguro.jButtonModificarToolBarSeguro.addActionListener(new ButtonActionListener(this,"ModificarToolBarSeguro"));
					
		this.jInternalFrameDetalleFormSeguro.jMenuItemModificarSeguro.addActionListener(new ButtonActionListener(this,"MenuItemModificarSeguro"));		
		
		
		
		this.jInternalFrameDetalleFormSeguro.jButtonActualizarSeguro.addActionListener (new ButtonActionListener(this,"ActualizarSeguro"));
		
		
		this.jInternalFrameDetalleFormSeguro.jButtonActualizarToolBarSeguro.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSeguro"));
						
		this.jInternalFrameDetalleFormSeguro.jMenuItemActualizarSeguro.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSeguro"));		
		
		
		
		this.jInternalFrameDetalleFormSeguro.jButtonEliminarSeguro.addActionListener (new ButtonActionListener(this,"EliminarSeguro"));
		
		
		this.jInternalFrameDetalleFormSeguro.jButtonEliminarToolBarSeguro.addActionListener (new ButtonActionListener(this,"EliminarToolBarSeguro"));
								
		this.jInternalFrameDetalleFormSeguro.jMenuItemEliminarSeguro.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSeguro"));		
		
		
		
		this.jInternalFrameDetalleFormSeguro.jButtonCancelarSeguro.addActionListener (new ButtonActionListener(this,"CancelarSeguro"));
		
		
		this.jInternalFrameDetalleFormSeguro.jButtonCancelarToolBarSeguro.addActionListener (new ButtonActionListener(this,"CancelarToolBarSeguro"));
					
		this.jInternalFrameDetalleFormSeguro.jMenuItemCancelarSeguro.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSeguro"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSeguro.jMenuItemDetalleCerrarSeguro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSeguro"));		
		
		
		
		this.jInternalFrameDetalleFormSeguro.jButtonGuardarCambiosToolBarSeguro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSeguro"));
		
		
		
		this.jInternalFrameDetalleFormSeguro.jButtonGuardarCambiosToolBarSeguro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSeguro"));
		
		
		
		this.jInternalFrameDetalleFormSeguro.jComboBoxTiposAccionesFormularioSeguro.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSeguro"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSeguro.jButtonidSeguroBusqueda.addActionListener(new ButtonActionListener(this,"idSeguroBusqueda"));
		//jButtonid_empleadoSeguro.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoSeguroActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormSeguro.jButtonid_empleadoSeguro.addActionListener(new ButtonActionListener(this,"id_empleadoSeguro"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSeguro.jButtonid_empleadoSeguroUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoSeguroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSeguro.jButtonid_empleadoSeguroBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoSeguroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSeguro.jButtonnombreSeguroBusqueda.addActionListener(new ButtonActionListener(this,"nombreSeguroBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSeguro.jTabbedPaneRelacionesSeguro.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSeguro"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSeguro"));
		
		if(this.jInternalFrameDetalleFormSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguro.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSeguro"));
		}
		
		this.jTableDatosSeguro.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSeguro"));
		
		this.jTableDatosSeguro.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSeguro"));
		
		this.jButtonNuevoSeguro.addActionListener(new ButtonActionListener(this,"NuevoSeguro"));
		
		this.jButtonDuplicarSeguro.addActionListener(new ButtonActionListener(this,"DuplicarSeguro"));
		
		this.jButtonCopiarSeguro.addActionListener(new ButtonActionListener(this,"CopiarSeguro"));
		
		this.jButtonVerFormSeguro.addActionListener(new ButtonActionListener(this,"VerFormSeguro"));
		
		
		this.jButtonNuevoToolBarSeguro.addActionListener(new ButtonActionListener(this,"NuevoToolBarSeguro"));
			
		this.jButtonDuplicarToolBarSeguro.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSeguro"));
			
		this.jMenuItemNuevoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSeguro"));
			
		this.jMenuItemDuplicarSeguro.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSeguro"));		
		
		
		this.jButtonNuevoRelacionesSeguro.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSeguro"));
		
		
		this.jButtonNuevoRelacionesToolBarSeguro.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSeguro"));
			
		this.jMenuItemNuevoRelacionesSeguro.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSeguro"));		
		
		
		if(this.jInternalFrameDetalleFormSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguro.jButtonModificarSeguro.addActionListener(new ButtonActionListener(this,"ModificarSeguro"));
		}
		
		
		if(this.jInternalFrameDetalleFormSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguro.jButtonModificarToolBarSeguro.addActionListener(new ButtonActionListener(this,"ModificarToolBarSeguro"));
			
			this.jInternalFrameDetalleFormSeguro.jMenuItemModificarSeguro.addActionListener(new ButtonActionListener(this,"MenuItemModificarSeguro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSeguro!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSeguro.jButtonActualizarSeguro.addActionListener (new ButtonActionListener(this,"ActualizarSeguro"));
		}
		
		
		if(this.jInternalFrameDetalleFormSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguro.jButtonActualizarToolBarSeguro.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSeguro"));
				
			this.jInternalFrameDetalleFormSeguro.jMenuItemActualizarSeguro.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSeguro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguro.jButtonEliminarSeguro.addActionListener (new ButtonActionListener(this,"EliminarSeguro"));
		}
		
		
		if(this.jInternalFrameDetalleFormSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguro.jButtonEliminarToolBarSeguro.addActionListener (new ButtonActionListener(this,"EliminarToolBarSeguro"));
						
			this.jInternalFrameDetalleFormSeguro.jMenuItemEliminarSeguro.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSeguro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguro.jButtonCancelarSeguro.addActionListener (new ButtonActionListener(this,"CancelarSeguro"));
		}
		
		
		if(this.jInternalFrameDetalleFormSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguro.jButtonCancelarToolBarSeguro.addActionListener (new ButtonActionListener(this,"CancelarToolBarSeguro"));
			
			this.jInternalFrameDetalleFormSeguro.jMenuItemCancelarSeguro.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSeguro"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSeguro.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSeguro"));		
		
		
		this.jButtonCerrarSeguro.addActionListener (new ButtonActionListener(this,"CerrarSeguro"));
		
		
		this.jButtonCerrarToolBarSeguro.addActionListener (new ButtonActionListener(this,"CerrarToolBarSeguro"));
			
		this.jMenuItemCerrarSeguro.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSeguro"));
			
		if(this.jInternalFrameDetalleFormSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguro.jMenuItemDetalleCerrarSeguro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSeguro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguro.jButtonGuardarCambiosSeguro.addActionListener (new ButtonActionListener(this,"GuardarCambiosSeguro"));
		}
		
		
		if(this.jInternalFrameDetalleFormSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguro.jButtonGuardarCambiosToolBarSeguro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSeguro"));
		}
		
		this.jButtonCopiarToolBarSeguro.addActionListener (new ButtonActionListener(this,"CopiarToolBarSeguro"));
			
		this.jButtonVerFormToolBarSeguro.addActionListener (new ButtonActionListener(this,"VerFormToolBarSeguro"));
		
		this.jMenuItemGuardarCambiosSeguro.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSeguro"));
			
		this.jMenuItemCopiarSeguro.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSeguro"));		
		
		this.jMenuItemVerFormSeguro.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSeguro"));		
		
		
		this.jButtonGuardarCambiosTablaSeguro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSeguro"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSeguro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSeguro"));
			
		this.jMenuItemGuardarCambiosTablaSeguro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSeguro"));		
		
		
		
		this.jButtonRecargarInformacionSeguro.addActionListener (new ButtonActionListener(this,"RecargarInformacionSeguro"));
					
		this.jButtonRecargarInformacionToolBarSeguro.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSeguro"));
		
		this.jMenuItemRecargarInformacionSeguro.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSeguro"));		
		
		
		
		this.jButtonAnterioresSeguro.addActionListener (new ButtonActionListener(this,"AnterioresSeguro"));
		
		
		this.jButtonAnterioresToolBarSeguro.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSeguro"));
		
		this.jMenuItemAnterioresSeguro.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSeguro"));		
		
		
		this.jButtonSiguientesSeguro.addActionListener (new ButtonActionListener(this,"SiguientesSeguro"));
		
		
		this.jButtonSiguientesToolBarSeguro.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSeguro"));
			
		this.jMenuItemSiguientesSeguro.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSeguro"));
			
		this.jMenuItemAbrirOrderBySeguro.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySeguro"));
			
		this.jMenuItemMostrarOcultarSeguro.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSeguro"));
			
		this.jMenuItemDetalleAbrirOrderBySeguro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySeguro"));
			
		this.jMenuItemDetalleMostarOcultarSeguro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSeguro"));		
		
		
		this.jButtonNuevoGuardarCambiosSeguro.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSeguro"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSeguro.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSeguro"));
			
		this.jMenuItemNuevoGuardarCambiosSeguro.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSeguro"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSeguro.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSeguro"));

		this.jCheckBoxSeleccionadosSeguro.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSeguro"));
		
		if(this.jInternalFrameDetalleFormSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguro.jComboBoxTiposAccionesFormularioSeguro.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSeguro"));
		}
		
		
		this.jComboBoxTiposRelacionesSeguro.addActionListener (new ButtonActionListener(this,"TiposRelacionesSeguro"));
			
		this.jComboBoxTiposAccionesSeguro.addActionListener (new ButtonActionListener(this,"TiposAccionesSeguro"));
					
		this.jComboBoxTiposSeleccionarSeguro.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSeguro"));
			
		this.jTextFieldValorCampoGeneralSeguro.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSeguro"));		
		
		
		if(this.jInternalFrameDetalleFormSeguro!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSeguro.jButtonidSeguroBusqueda.addActionListener(new ButtonActionListener(this,"idSeguroBusqueda"));
		//jButtonid_empleadoSeguro.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoSeguroActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormSeguro.jButtonid_empleadoSeguro.addActionListener(new ButtonActionListener(this,"id_empleadoSeguro"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSeguro.jButtonid_empleadoSeguroUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoSeguroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSeguro.jButtonid_empleadoSeguroBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoSeguroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSeguro.jButtonnombreSeguroBusqueda.addActionListener(new ButtonActionListener(this,"nombreSeguroBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoSeguro.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoSeguro"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoSeguro.addActionListener(new ButtonActionListener(this,"id_empleadoSeguro"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSeguro!=null) {
				this.jInternalFrameReporteDinamicoSeguro.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSeguro"));
				this.jInternalFrameReporteDinamicoSeguro.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSeguro"));
				this.jInternalFrameReporteDinamicoSeguro.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSeguro"));
			}
			
			//this.jButtonCerrarReporteDinamicoSeguro.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSeguro"));				
			//this.jButtonGenerarReporteDinamicoSeguro.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSeguro"));
			//this.jButtonGenerarExcelReporteDinamicoSeguro.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSeguro"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSeguro!=null) {
				this.jInternalFrameImportacionSeguro.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSeguro"));
				this.jInternalFrameImportacionSeguro.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSeguro"));
				this.jInternalFrameImportacionSeguro.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSeguro"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySeguro.addActionListener (new ButtonActionListener(this,"AbrirOrderBySeguro"));
			
			this.jButtonAbrirOrderByToolBarSeguro.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSeguro"));			
			
			if(this.jInternalFrameOrderBySeguro!=null) {
				this.jInternalFrameOrderBySeguro.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySeguro"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSeguro!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguro.jTabbedPaneRelacionesSeguro.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSeguro"));
		
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
            		closingInternalFrameSeguro();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSeguro.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSeguro = (JInternalFrameBase)event.getSource();
	            	
	            SeguroBeanSwingJInternalFrame jInternalFrameParent=(SeguroBeanSwingJInternalFrame)jInternalFrameDetalleFormSeguro.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSeguroActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSeguro.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSeguroListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSeguro.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSeguro.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSeguroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSeguroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSeguroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSeguro";
		inputMap = this.jButtonNuevoSeguro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSeguro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSeguroActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSeguroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSeguroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSeguroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSeguro";
		inputMap = this.jButtonNuevoRelacionesSeguro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSeguro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSeguroActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSeguro";
		inputMap = this.jButtonModificarSeguro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSeguro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSeguroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSeguro";
		inputMap = this.jButtonActualizarSeguro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSeguro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSeguroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSeguro";
		inputMap = this.jButtonEliminarSeguro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSeguro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSeguroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSeguro";
		inputMap = this.jButtonCancelarSeguro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSeguro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSeguroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSeguro";
		inputMap = this.jButtonCerrarSeguro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSeguro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSeguroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSeguro.jButtonGuardarCambiosSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSeguro";
		inputMap = this.jInternalFrameDetalleFormSeguro.jButtonGuardarCambiosSeguro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSeguro.jButtonGuardarCambiosSeguro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSeguroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSeguro.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSeguroItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSeguro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSeguroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSeguro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSeguroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSeguro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSeguroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSeguro.jButtonidSeguroBusqueda.addActionListener(new ButtonActionListener(this,"idSeguroBusqueda"));
		//jButtonid_empleadoSeguro.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoSeguroActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormSeguro.jButtonid_empleadoSeguro.addActionListener(new ButtonActionListener(this,"id_empleadoSeguro"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSeguro.jButtonid_empleadoSeguroUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoSeguroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSeguro.jButtonid_empleadoSeguroBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoSeguroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSeguro.jButtonnombreSeguroBusqueda.addActionListener(new ButtonActionListener(this,"nombreSeguroBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoSeguro.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoSeguro"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoSeguro.addActionListener(new ButtonActionListener(this,"id_empleadoSeguro"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSeguroActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSeguro.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSeguro(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Seguro seguroAux:this.seguroLogic.getSeguros()) {
					seguroAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Seguro seguroAux:seguros) {
					seguroAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSeguroItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSeguro(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Seguro seguroAux:this.seguroLogic.getSeguros()) {
						seguroAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Seguro seguroAux:seguros) {
						seguroAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Seguro seguroAux:this.seguroLogic.getSeguros()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Seguro seguroAux:seguros) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSeguro(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSeguro.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSeguro.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSeguro,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSeguroItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSeguro(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSeguro.getSelectedRows();
			
			Seguro seguroLocal=new Seguro();
			
			//this.seleccionarTodosSeguro(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					seguroLocal =(Seguro) this.seguroLogic.getSeguros().toArray()[this.jTableDatosSeguro.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					seguroLocal =(Seguro) this.seguros.toArray()[this.jTableDatosSeguro.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				seguroLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Seguro seguroAux:this.seguroLogic.getSeguros()) {
						seguroAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Seguro seguroAux:seguros) {
						seguroAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSeguro(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSeguro.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSeguro.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSeguro,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSeguroItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSeguroParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSeguroActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSeguro(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSeguro.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Seguro seguroAux:this.seguroLogic.getSeguros()) {
				
						if(sTipoSeleccionar.equals(SeguroConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							seguroAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Seguro seguroAux:seguros) {
					
						if(sTipoSeleccionar.equals(SeguroConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							seguroAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSeguro(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSeguroActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSeguro(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSeguro=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSeguro.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSeguro.jComboBoxTiposAccionesFormularioSeguro.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSeguro) {				
					conSplash=true;//false;										
					
					//this.startProcessSeguro(conSplash);
				
					this.generarReporteSegurosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSeguro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSeguro.jComboBoxTiposAccionesFormularioSeguro.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSegurosSeleccionados();
				//this.jComboBoxTiposAccionesSeguro.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSegurosSeleccionados(false);
				//this.jComboBoxTiposAccionesSeguro.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSegurosSeleccionados(true);
				//this.jComboBoxTiposAccionesSeguro.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSeguro();
				
				this.exportarSegurosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSeguro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSeguro.jComboBoxTiposAccionesFormularioSeguro.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSeguros();
				//this.importarSeguros();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSeguro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSeguro.jComboBoxTiposAccionesFormularioSeguro.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSeguro();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSegurosSeleccionados();
				//this.jComboBoxTiposAccionesSeguro.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Seguro", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSeguro();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSeguro)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySeguro(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Seguro",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSeguro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSeguro.jComboBoxTiposAccionesFormularioSeguro.setSelectedIndex(0);					
				}	
			} 			
			else if(SeguroBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSeguro) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSeguro(conSplash);
					
						//this.actualizarParametrosGeneralSeguro();
						
						this.generarReporteProcesoAccionSegurosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSeguro.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSeguro.jComboBoxTiposAccionesFormularioSeguro.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SeguroBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO SeguroS SELECCIONADOS?", "MANTENIMIENTO DE Seguro", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSeguro();
				
						this.actualizarParametrosGeneralSeguro();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.seguroReturnGeneral=seguroLogic.procesarAccionSegurosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.seguroLogic.getSeguros(),this.seguroParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSeguroReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSeguro.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSeguro.jComboBoxTiposAccionesFormularioSeguro.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSeguro();
					
					SeguroBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSeguroReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSeguro.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSeguro.jComboBoxTiposAccionesFormularioSeguro.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSeguro(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSeguroActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSeguro();
			
			if(this.jInternalFrameDetalleFormSeguro==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Seguro> segurosSeleccionados=new ArrayList<Seguro>();		
			Seguro seguro=new Seguro();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSeguro(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSeguro.getSelectedItem();
			
			
			
			
			segurosSeleccionados=this.getSegurosSeleccionados(true);
			//this.sTipoAccion;
			
			if(segurosSeleccionados.size()==1) {
				for(Seguro seguroAux:segurosSeleccionados) {
					seguro=seguroAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSeguro();
			
      		//this.finishProcessSeguro(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSeguroReturnGeneral() throws Exception {
		if(this.seguroReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.seguroReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.seguroReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.seguroReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.seguroReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.seguroReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSeguro(false);
		}
		
		if(this.seguroReturnGeneral.getConRetornoLista() || this.seguroReturnGeneral.getConRetornoObjeto()) {
			if(this.seguroReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.seguroLogic.setSeguros(this.seguroReturnGeneral.getSeguros());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.seguroReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.seguroLogic.setSeguro(this.seguroReturnGeneral.getSeguro());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSeguro(false);
		}
	}
	
	public void actualizarParametrosGeneralSeguro() throws Exception {
		
		
	}
	
	public ArrayList<Seguro> getSegurosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Seguro> segurosSeleccionados=new ArrayList<Seguro>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSeguro) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Seguro seguroAux:seguroLogic.getSeguros()) {
					if(seguroAux.getIsSelected()) {
						segurosSeleccionados.add(seguroAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Seguro seguroAux:this.seguros) {
					if(seguroAux.getIsSelected()) {
						segurosSeleccionados.add(seguroAux);				
					}
				}
			}
			
			if(segurosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						segurosSeleccionados.addAll(this.seguroLogic.getSeguros());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						segurosSeleccionados.addAll(this.seguros);				
					}
				}
			}
		} else {
			segurosSeleccionados.add(this.seguro);
		}
		
		return segurosSeleccionados;
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
	
	public void generarReporteSegurosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSegurosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSegurosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSegurosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSegurosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Seguro",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSegurosSeleccionados() throws Exception {
		ArrayList<Seguro> segurosSeleccionados=new ArrayList<Seguro>();		
		
		segurosSeleccionados=this.getSegurosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSeguros("Todos",segurosSeleccionados);
		
	}	
	
	public void generarReporteNormalSegurosSeleccionados() throws Exception {
		ArrayList<Seguro> segurosSeleccionados=new ArrayList<Seguro>();		
		
		segurosSeleccionados=this.getSegurosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSeguros("Todos",segurosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSegurosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Seguro> segurosSeleccionados=new ArrayList<Seguro>();
		
		segurosSeleccionados=this.getSegurosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSeguros("Todos",segurosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSegurosSeleccionados() throws Exception {
		ArrayList<Seguro> segurosSeleccionados=new ArrayList<Seguro>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSeguro();
		
		
		segurosSeleccionados=this.getSegurosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSeguro();
		
		
		//this.generarReporteSeguros("Todos",segurosSeleccionados ,seguroImplementable,seguroImplementableHome);
	}
	
	public void mostrarImportacionSeguros() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSeguro();
		
		this.abrirFrameImportacionSeguro();		
		
			
		//this.generarReporteSeguros("Todos",segurosSeleccionados ,seguroImplementable,seguroImplementableHome);
	}
	
	public void importarSeguros() throws Exception {		
	
	}
	
	public void exportarSegurosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSegurosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSegurosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSegurosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Seguro",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSegurosSeleccionados() throws Exception {
		ArrayList<Seguro> segurosSeleccionados=new ArrayList<Seguro>();		
		
		segurosSeleccionados=this.getSegurosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"seguro."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSeguro(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Seguro seguroAux:segurosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSeguro(seguroAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//seguroAux.setsDetalleGeneralEntityReporte(seguroAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.seguroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Seguro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSeguro(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SeguroConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SeguroConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SeguroConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SeguroConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSeguro(Seguro seguro,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=seguro.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=seguro.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=seguro.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=seguro.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSegurosSeleccionados() throws Exception {
		ArrayList<Seguro> segurosSeleccionados=new ArrayList<Seguro>();		
		
		segurosSeleccionados=this.getSegurosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"seguro.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Seguros");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSeguro(row);				
				iRow++;
			}				
			
			for(Seguro seguroAux:segurosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSeguro(seguroAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.seguroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Seguro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSegurosSeleccionados() throws Exception {
		ArrayList<Seguro> segurosSeleccionados=new ArrayList<Seguro>();		
		
		segurosSeleccionados=this.getSegurosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"seguro.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("seguros");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("seguro");
			//elementRoot.appendChild(element);
		
			for(Seguro seguroAux:segurosSeleccionados) {
				element = document.createElement("seguro");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSeguro(seguroAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.seguroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Seguro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSeguro(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SeguroConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SeguroConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SeguroConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(SeguroConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSeguro(Seguro seguro,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(seguro.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(seguro.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(seguro.getnombre());				
	}
	
	public void setFilaDatosExportarXmlSeguro(Seguro seguro,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SeguroConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(seguro.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SeguroConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(seguro.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempleado_descripcion = document.createElement(SeguroConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(seguro.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementnombre = document.createElement(SeguroConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(seguro.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoSegurosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Seguro> segurosSeleccionados=new ArrayList<Seguro>();
		
		segurosSeleccionados=this.getSegurosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSeguro(segurosSeleccionados);
		
		this.generarReporteSeguros("Todos",segurosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSeguro(ArrayList<Seguro> segurosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Seguro seguroAux:segurosSeleccionados) {
				seguroAux.setsDetalleGeneralEntityReporte(seguroAux.toString());
			
				if(sTipoSeleccionar.equals(SeguroConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					seguroAux.setsDescripcionGeneralEntityReporte1(seguroAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SeguroConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					seguroAux.setsDescripcionGeneralEntityReporte1(seguroAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSeguro(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSeguro=true;
				this.isVisibilidadCeldaNuevoRelacionesSeguro=true;
				this.isVisibilidadCeldaGuardarCambiosSeguro=true;
			}
			
			this.isVisibilidadCeldaModificarSeguro=false;
			this.isVisibilidadCeldaActualizarSeguro=false;
			this.isVisibilidadCeldaEliminarSeguro=false;
			this.isVisibilidadCeldaCancelarSeguro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSeguro=true;
				} else {
					this.isVisibilidadCeldaGuardarSeguro=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSeguro=false;
			this.isVisibilidadCeldaNuevoRelacionesSeguro=false;
			this.isVisibilidadCeldaGuardarCambiosSeguro=false;
			this.isVisibilidadCeldaModificarSeguro=false;
			this.isVisibilidadCeldaActualizarSeguro=true;
			this.isVisibilidadCeldaEliminarSeguro=false;
			this.isVisibilidadCeldaCancelarSeguro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSeguro=true;
				} else {
					this.isVisibilidadCeldaGuardarSeguro=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSeguro=false;
			this.isVisibilidadCeldaNuevoRelacionesSeguro=false;
			this.isVisibilidadCeldaGuardarCambiosSeguro=false;
			this.isVisibilidadCeldaModificarSeguro=false;
			this.isVisibilidadCeldaActualizarSeguro=true;
			this.isVisibilidadCeldaEliminarSeguro=true;
			this.isVisibilidadCeldaCancelarSeguro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSeguro=true;
				} else {
					this.isVisibilidadCeldaGuardarSeguro=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSeguro=false;
			this.isVisibilidadCeldaNuevoRelacionesSeguro=false;
			this.isVisibilidadCeldaGuardarCambiosSeguro=false;
			this.isVisibilidadCeldaModificarSeguro=false;
			this.isVisibilidadCeldaActualizarSeguro=true;
			this.isVisibilidadCeldaEliminarSeguro=false;
			this.isVisibilidadCeldaCancelarSeguro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSeguro=false;
				} else {
					this.isVisibilidadCeldaGuardarSeguro=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSeguro=true;
			this.isVisibilidadCeldaNuevoRelacionesSeguro=true;
			this.isVisibilidadCeldaGuardarCambiosSeguro=true;
			this.isVisibilidadCeldaModificarSeguro=false;
			this.isVisibilidadCeldaActualizarSeguro=false;
			this.isVisibilidadCeldaEliminarSeguro=false;
			this.isVisibilidadCeldaCancelarSeguro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSeguro=true;
				} else {
					this.isVisibilidadCeldaGuardarSeguro=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSeguro=false;
			this.isVisibilidadCeldaNuevoRelacionesSeguro=false;
			this.isVisibilidadCeldaGuardarCambiosSeguro=false;
			this.isVisibilidadCeldaActualizarSeguro=false;
			this.isVisibilidadCeldaEliminarSeguro=false;
			this.isVisibilidadCeldaCancelarSeguro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSeguro=false;
				} else {
					this.isVisibilidadCeldaGuardarSeguro=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSeguro=false;
			this.isVisibilidadCeldaNuevoRelacionesSeguro=false;
			this.isVisibilidadCeldaGuardarCambiosSeguro=false;
			this.isVisibilidadCeldaModificarSeguro=true;
			this.isVisibilidadCeldaActualizarSeguro=false;
			this.isVisibilidadCeldaEliminarSeguro=false;
			this.isVisibilidadCeldaCancelarSeguro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSeguro=false;
				} else {
					this.isVisibilidadCeldaGuardarSeguro=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SeguroJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSeguro=true;
			this.isVisibilidadCeldaNuevoRelacionesSeguro=true;
			this.isVisibilidadCeldaGuardarCambiosSeguro=true;
		} else {
			this.actualizarEstadoPanelsSeguro(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSeguro=false;
			//this.isVisibilidadCeldaVerFormSeguro=false;
			this.isVisibilidadCeldaDuplicarSeguro=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!seguroSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSeguro=false;
		} else {
			this.isVisibilidadCeldaNuevoSeguro=false;
			this.isVisibilidadCeldaGuardarCambiosSeguro=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(seguroSessionBean.getEsGuardarRelacionado()) {
			if(!seguroSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSeguro=false;												
			}
			
			this.jButtonCerrarSeguro.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSeguro=false;
		}
		
		if(!this.permiteMantenimiento(this.seguro)) {
			this.isVisibilidadCeldaActualizarSeguro=false;
			this.isVisibilidadCeldaEliminarSeguro=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSeguro() {
	}
	
	public void actualizarEstadoPanelsSeguro(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSeguro!=null) {
				this.jScrollPanelDatosEdicionSeguro.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSeguro!=null) {
				this.jTabbedPaneBusquedasSeguro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSeguro!=null) {
				this.jScrollPanelDatosSeguro.setVisible(true);
			}
			
			if(this.jPanelPaginacionSeguro!=null) {
				this.jPanelPaginacionSeguro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSeguro!=null) {
				this.jPanelParametrosReportesSeguro.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSeguro!=null) {
				this.jScrollPanelDatosEdicionSeguro.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSeguro!=null) {
				this.jTabbedPaneBusquedasSeguro.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSeguro!=null) {
				this.jScrollPanelDatosSeguro.setVisible(false);
			}
			
			if(this.jPanelPaginacionSeguro!=null) {
				this.jPanelPaginacionSeguro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSeguro!=null) {
				this.jPanelParametrosReportesSeguro.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSeguro!=null) {
				this.jScrollPanelDatosEdicionSeguro.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSeguro!=null) {
				this.jTabbedPaneBusquedasSeguro.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSeguro!=null) {
				this.jScrollPanelDatosSeguro.setVisible(false);
			}
			
			if(this.jPanelPaginacionSeguro!=null) {
				this.jPanelPaginacionSeguro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSeguro!=null) {
				this.jPanelParametrosReportesSeguro.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSeguro!=null) {
				this.jScrollPanelDatosEdicionSeguro.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSeguro!=null) {
				this.jTabbedPaneBusquedasSeguro.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSeguro!=null) {
				this.jScrollPanelDatosSeguro.setVisible(false);
			}
			
			if(this.jPanelPaginacionSeguro!=null) {
				this.jPanelPaginacionSeguro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSeguro!=null) {
				this.jPanelParametrosReportesSeguro.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSeguro!=null) {
				this.jScrollPanelDatosEdicionSeguro.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSeguro!=null) {
				this.jTabbedPaneBusquedasSeguro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSeguro!=null) {
				this.jScrollPanelDatosSeguro.setVisible(true);
			}
			
			if(this.jPanelPaginacionSeguro!=null) {
				this.jPanelPaginacionSeguro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSeguro!=null) {
				this.jPanelParametrosReportesSeguro.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSeguro!=null) {
				this.jScrollPanelDatosEdicionSeguro.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSeguro!=null) {
				this.jTabbedPaneBusquedasSeguro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSeguro!=null) {
				this.jScrollPanelDatosSeguro.setVisible(true);
			}
			
			if(this.jPanelPaginacionSeguro!=null) {
				this.jPanelPaginacionSeguro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSeguro!=null) {
				this.jPanelParametrosReportesSeguro.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSeguro!=null) {
				this.jScrollPanelDatosEdicionSeguro.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSeguro!=null) {
				this.jTabbedPaneBusquedasSeguro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSeguro!=null) {
				this.jScrollPanelDatosSeguro.setVisible(true);
			}
			
			if(this.jPanelPaginacionSeguro!=null) {
				this.jPanelPaginacionSeguro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSeguro!=null) {
				this.jPanelParametrosReportesSeguro.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.seguroSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSeguro!=null) {
					this.jTabbedPaneBusquedasSeguro.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSeguro!=null) {
				this.jPanelParametrosReportesSeguro.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.seguroSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSeguro!=null) {
				this.jTabbedPaneBusquedasSeguro.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSeguro!=null) {
				this.jPanelParametrosReportesSeguro.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSeguro.remove(jPanelFK_IdEmpleadoSeguro);}
		}
		
	}
	
	
	
	

	public String registrarSesionSeguroParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(seguroSessionBean==null) {
				seguroSessionBean=new SeguroSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(seguroSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.seguroFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(SeguroConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionSeguro(true);
			//empleadoSessionBean.setlidSeguroActual(this.idSeguroActual);

			seguroSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeySeguro(true);
			seguroSessionBean.setlIdSeguroActualForeignKey(this.idSeguroActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SeguroSessionBean seguroSessionBean=new SeguroSessionBean();
		
		if(this.seguroSessionBean==null) {
			this.seguroSessionBean=new SeguroSessionBean();
		}
		
		this.seguroSessionBean.setsUltimaBusquedaSeguro(this.getsAccionBusqueda());
		this.seguroSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.seguroSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			seguroSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SeguroSessionBean seguroSessionBean=new SeguroSessionBean();
		
		if(this.seguroSessionBean==null) {
			this.seguroSessionBean=new SeguroSessionBean();
		}
		
		if(this.seguroSessionBean.getsUltimaBusquedaSeguro()!=null&&!this.seguroSessionBean.getsUltimaBusquedaSeguro().equals("")) {
			this.setsAccionBusqueda(seguroSessionBean.getsUltimaBusquedaSeguro());
			this.setiNumeroPaginacion(seguroSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(seguroSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(seguroSessionBean.getid_empleado());
				seguroSessionBean.setid_empleado(-1L);
			}
		}
		
		this.seguroSessionBean.setsUltimaBusquedaSeguro("");
		this.seguroSessionBean.setiNumeroPaginacion(SeguroConstantesFunciones.INUMEROPAGINACION);
		this.seguroSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSeguro(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSeguro() {
		this.updateBorderResaltarBusquedasFormularioSeguro();
		this.updateVisibilidadBusquedasFormularioSeguro();
		this.updateHabilitarBusquedasFormularioSeguro();
	}
	
	public void updateBorderResaltarBusquedasFormularioSeguro() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSeguro.getComponents().length>0) {
	

		if(this.seguroConstantesFunciones.resaltarFK_IdEmpleadoSeguro!=null) {
			index= this.jTabbedPaneBusquedasSeguro.indexOfComponent(this.jPanelFK_IdEmpleadoSeguro);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSeguro.getComponent(index);
				jPanel.setBorder(this.seguroConstantesFunciones.resaltarFK_IdEmpleadoSeguro);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSeguro() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSeguro.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSeguro.indexOfComponent(this.jPanelFK_IdEmpleadoSeguro);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSeguro.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.seguroConstantesFunciones.mostrarFK_IdEmpleadoSeguro);
			if(!this.seguroConstantesFunciones.mostrarFK_IdEmpleadoSeguro && index>-1) {
				this.jTabbedPaneBusquedasSeguro.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSeguro() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSeguro.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSeguro.indexOfComponent(this.jPanelFK_IdEmpleadoSeguro);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSeguro.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.seguroConstantesFunciones.activarFK_IdEmpleadoSeguro);
				this.jTabbedPaneBusquedasSeguro.setEnabledAt(index,this.seguroConstantesFunciones.activarFK_IdEmpleadoSeguro);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSeguro(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasSeguro.indexOfComponent(this.jPanelFK_IdEmpleadoSeguro);

			this.jTabbedPaneBusquedasSeguro.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSeguro.getComponent(index);

			this.seguroConstantesFunciones.setResaltarFK_IdEmpleadoSeguro(resaltar);

			jPanel.setBorder(this.seguroConstantesFunciones.resaltarFK_IdEmpleadoSeguro);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSeguro.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSeguro() throws Exception {

		if(this.jInternalFrameDetalleFormSeguro==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSeguro();
		this.updateVisibilidadResaltarControlesFormularioSeguro();
		this.updateHabilitarResaltarControlesFormularioSeguro();
		
	}
	
	public void updateBorderResaltarControlesFormularioSeguro() throws Exception {
		if(this.jInternalFrameDetalleFormSeguro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.seguroConstantesFunciones.resaltaridSeguro!=null && this.jInternalFrameDetalleFormSeguro!=null) {this.jInternalFrameDetalleFormSeguro.jLabelidSeguro.setBorder(this.seguroConstantesFunciones.resaltaridSeguro);}
		if(this.seguroConstantesFunciones.resaltarid_empleadoSeguro!=null && this.jInternalFrameDetalleFormSeguro!=null) {this.jInternalFrameDetalleFormSeguro.jComboBoxid_empleadoSeguro.setBorder(this.seguroConstantesFunciones.resaltarid_empleadoSeguro);}
		if(this.seguroConstantesFunciones.resaltarnombreSeguro!=null && this.jInternalFrameDetalleFormSeguro!=null) {this.jInternalFrameDetalleFormSeguro.jTextAreanombreSeguro.setBorder(this.seguroConstantesFunciones.resaltarnombreSeguro);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSeguro() throws Exception {		
		if(this.jInternalFrameDetalleFormSeguro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSeguro!=null) {
	
		//this.jInternalFrameDetalleFormSeguro.jLabelidSeguro.setVisible(this.seguroConstantesFunciones.mostraridSeguro);
		this.jInternalFrameDetalleFormSeguro.jPanelidSeguro.setVisible(this.seguroConstantesFunciones.mostraridSeguro);
		//this.jInternalFrameDetalleFormSeguro.jComboBoxid_empleadoSeguro.setVisible(this.seguroConstantesFunciones.mostrarid_empleadoSeguro);
		this.jInternalFrameDetalleFormSeguro.jPanelid_empleadoSeguro.setVisible(this.seguroConstantesFunciones.mostrarid_empleadoSeguro);
			this.jInternalFrameDetalleFormSeguro.jButtonid_empleadoSeguro.setVisible(this.seguroConstantesFunciones.mostrarid_empleadoSeguro);
		//this.jInternalFrameDetalleFormSeguro.jTextAreanombreSeguro.setVisible(this.seguroConstantesFunciones.mostrarnombreSeguro);
		this.jInternalFrameDetalleFormSeguro.jPanelnombreSeguro.setVisible(this.seguroConstantesFunciones.mostrarnombreSeguro);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSeguro() throws Exception {
		if(this.jInternalFrameDetalleFormSeguro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSeguro!=null) {
	
		this.jInternalFrameDetalleFormSeguro.jLabelidSeguro.setEnabled(this.seguroConstantesFunciones.activaridSeguro);
		this.jInternalFrameDetalleFormSeguro.jComboBoxid_empleadoSeguro.setEnabled(this.seguroConstantesFunciones.activarid_empleadoSeguro);
			this.jInternalFrameDetalleFormSeguro.jButtonid_empleadoSeguro.setEnabled(this.seguroConstantesFunciones.activarid_empleadoSeguro);
		this.jInternalFrameDetalleFormSeguro.jTextAreanombreSeguro.setEnabled(this.seguroConstantesFunciones.activarnombreSeguro);
		}
	}
	
		
}