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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.AnticipoClienteConstantesFunciones;
import com.bydan.erp.facturacion.util.AnticipoClienteParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.AnticipoClienteParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.AnticipoClienteBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class AnticipoClienteBeanSwingJInternalFrame extends AnticipoClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AnticipoClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<AnticipoCliente> anticipoclienteValidator = new ClassValidator<AnticipoCliente>(AnticipoCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public AnticipoCliente anticipocliente;	
	public AnticipoCliente anticipoclienteAux;
	public AnticipoCliente anticipoclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public AnticipoCliente anticipoclienteTotales;
	public Long idAnticipoClienteActual;
	public Long iIdNuevoAnticipoCliente=0L;
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

	public String sFinalQueryComboEstadoAntiCliente="";

	public List<EstadoAntiCliente> estadoanticlientesForeignKey;

	public List<EstadoAntiCliente> getestadoanticlientesForeignKey() {
		return estadoanticlientesForeignKey;
	}

	public void setestadoanticlientesForeignKey(List<EstadoAntiCliente> estadoanticlientesForeignKey) {
		this.estadoanticlientesForeignKey = estadoanticlientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoAntiCliente estadoanticlienteForeignKey;

	public EstadoAntiCliente getestadoanticlienteForeignKey() {
		return estadoanticlienteForeignKey;
	}

	public void setestadoanticlienteForeignKey(EstadoAntiCliente estadoanticlienteForeignKey) {
		this.estadoanticlienteForeignKey = estadoanticlienteForeignKey;
	}

	public String sFinalQueryComboTipoGrupoFormaPago="";

	public List<TipoGrupoFormaPago> tipogrupoformapagosForeignKey;

	public List<TipoGrupoFormaPago> gettipogrupoformapagosForeignKey() {
		return tipogrupoformapagosForeignKey;
	}

	public void settipogrupoformapagosForeignKey(List<TipoGrupoFormaPago> tipogrupoformapagosForeignKey) {
		this.tipogrupoformapagosForeignKey = tipogrupoformapagosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoGrupoFormaPago tipogrupoformapagoForeignKey;

	public TipoGrupoFormaPago gettipogrupoformapagoForeignKey() {
		return tipogrupoformapagoForeignKey;
	}

	public void settipogrupoformapagoForeignKey(TipoGrupoFormaPago tipogrupoformapagoForeignKey) {
		this.tipogrupoformapagoForeignKey = tipogrupoformapagoForeignKey;
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
	
	public Boolean isPermisoTodoAnticipoCliente;
	public Boolean isPermisoNuevoAnticipoCliente;
	public Boolean isPermisoActualizarAnticipoCliente;
	public Boolean isPermisoActualizarOriginalAnticipoCliente;
	public Boolean isPermisoEliminarAnticipoCliente;
	public Boolean isPermisoGuardarCambiosAnticipoCliente;
	public Boolean isPermisoConsultaAnticipoCliente;
	public Boolean isPermisoBusquedaAnticipoCliente;
	public Boolean isPermisoReporteAnticipoCliente;
	public Boolean isPermisoPaginacionMedioAnticipoCliente;
	public Boolean isPermisoPaginacionAltoAnticipoCliente;
	public Boolean isPermisoPaginacionTodoAnticipoCliente;
	public Boolean isPermisoCopiarAnticipoCliente;
	public Boolean isPermisoVerFormAnticipoCliente;
	public Boolean isPermisoDuplicarAnticipoCliente;
	public Boolean isPermisoOrdenAnticipoCliente;
	
	
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
	
	public AnticipoClienteParameterReturnGeneral anticipoclienteReturnGeneral;
	public AnticipoClienteParameterReturnGeneral anticipoclienteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAnticipoCliente=false;
	public Boolean esParaAccionDesdeFormularioAnticipoCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AnticipoClienteSessionBeanAdditional anticipoclienteSessionBeanAdditional=null;
	
	public AnticipoClienteSessionBeanAdditional getAnticipoClienteSessionBeanAdditional() {
		return this.anticipoclienteSessionBeanAdditional;
	}
	
	public void setAnticipoClienteSessionBeanAdditional(AnticipoClienteSessionBeanAdditional anticipoclienteSessionBeanAdditional) {
		try {
			this.anticipoclienteSessionBeanAdditional=anticipoclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AnticipoClienteBeanSwingJInternalFrameAdditional anticipoclienteBeanSwingJInternalFrameAdditional=null;
	//public class AnticipoClienteBeanSwingJInternalFrame
	
	public AnticipoClienteBeanSwingJInternalFrameAdditional getAnticipoClienteBeanSwingJInternalFrameAdditional() {
		return this.anticipoclienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setAnticipoClienteBeanSwingJInternalFrameAdditional(AnticipoClienteBeanSwingJInternalFrameAdditional anticipoclienteBeanSwingJInternalFrameAdditional) {
		try {
			this.anticipoclienteBeanSwingJInternalFrameAdditional=anticipoclienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AnticipoClienteLogic anticipoclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public AnticipoCliente anticipoclienteBean;
	public AnticipoClienteConstantesFunciones anticipoclienteConstantesFunciones;
	//public AnticipoClienteParameterReturnGeneral anticipoclienteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public EstadoAntiClienteLogic estadoanticlienteLogic;
	public TipoGrupoFormaPagoLogic tipogrupoformapagoLogic;
	
	//PARAMETROS
	
	
	//public List<AnticipoCliente> anticipoclientes;	
	//public List<AnticipoCliente> anticipoclientesEliminados;
	//public List<AnticipoCliente> anticipoclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAnticipoCliente=false;
	public Boolean isVisibilidadCeldaDuplicarAnticipoCliente=true;
	public Boolean isVisibilidadCeldaCopiarAnticipoCliente=true;
	public Boolean isVisibilidadCeldaVerFormAnticipoCliente=true;
	public Boolean isVisibilidadCeldaOrdenAnticipoCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAnticipoCliente=false;
	public Boolean isVisibilidadCeldaModificarAnticipoCliente=false;
	public Boolean isVisibilidadCeldaActualizarAnticipoCliente=false;
	public Boolean isVisibilidadCeldaEliminarAnticipoCliente=false;
	public Boolean isVisibilidadCeldaCancelarAnticipoCliente=false;
	public Boolean isVisibilidadCeldaGuardarAnticipoCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAnticipoCliente=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoAntiCliente=false;
	public Boolean isVisibilidadFK_IdTipoGrupoFormaPago=false;
	
	public Long getiIdNuevoAnticipoCliente() {
		return this.iIdNuevoAnticipoCliente;
	}

	public void setiIdNuevoAnticipoCliente(Long iIdNuevoAnticipoCliente) {
		this.iIdNuevoAnticipoCliente = iIdNuevoAnticipoCliente;
	}
	
	public Long getidAnticipoClienteActual() {
		return this.idAnticipoClienteActual;
	}

	public void setidAnticipoClienteActual(Long idAnticipoClienteActual) {
		this.idAnticipoClienteActual = idAnticipoClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public AnticipoCliente getanticipocliente() {
		return this.anticipocliente;
	}

	public void setanticipocliente(AnticipoCliente anticipocliente) {
		this.anticipocliente = anticipocliente;
	}
	
	public AnticipoCliente getanticipoclienteAux() {
		return this.anticipoclienteAux;
	}

	public void setanticipoclienteAux(AnticipoCliente anticipoclienteAux) {
		this.anticipoclienteAux = anticipoclienteAux;
	}				
	
	public AnticipoCliente getanticipoclienteAnterior() {
		return this.anticipoclienteAnterior;
	}

	public void setanticipoclienteAnterior(AnticipoCliente anticipoclienteAnterior) {
		this.anticipoclienteAnterior = anticipoclienteAnterior;
	}	
	
	public AnticipoCliente getanticipoclienteTotales() {
		return this.anticipoclienteTotales;
	}

	public void setanticipoclienteTotales(AnticipoCliente anticipoclienteTotales) {
		this.anticipoclienteTotales = anticipoclienteTotales;
	}	
	
	public AnticipoCliente getanticipoclienteBean() {
		return this.anticipoclienteBean;
	}

	public void setanticipoclienteBean(AnticipoCliente anticipoclienteBean) {
		this.anticipoclienteBean = anticipoclienteBean;
	}	
	
	public AnticipoClienteParameterReturnGeneral getanticipoclienteReturnGeneral() {
		return this.anticipoclienteReturnGeneral;
	}

	public void setanticipoclienteReturnGeneral(AnticipoClienteParameterReturnGeneral anticipoclienteReturnGeneral) {
		this.anticipoclienteReturnGeneral = anticipoclienteReturnGeneral;
	}	
	
	
	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estado_anti_clienteFK_IdEstadoAntiCliente=-1L;

	public Long getid_estado_anti_clienteFK_IdEstadoAntiCliente() {
		return this.id_estado_anti_clienteFK_IdEstadoAntiCliente;
	}

	public void setid_estado_anti_clienteFK_IdEstadoAntiCliente(Long id_estado_anti_clienteFK_IdEstadoAntiCliente) {
		this.id_estado_anti_clienteFK_IdEstadoAntiCliente = id_estado_anti_clienteFK_IdEstadoAntiCliente;
	}

	public Long id_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago=-1L;

	public Long getid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago() {
		return this.id_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago;
	}

	public void setid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago(Long id_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago) {
		this.id_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago = id_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public AnticipoClienteLogic getAnticipoClienteLogic()	{		
		return anticipoclienteLogic;
	}

	public void setAnticipoClienteLogic(AnticipoClienteLogic anticipoclienteLogic) {
		this.anticipoclienteLogic = anticipoclienteLogic;
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
	
	public Boolean getIsEsNuevoAnticipoCliente() {
		return isEsNuevoAnticipoCliente;
	}

	public void setIsEsNuevoAnticipoCliente(Boolean isEsNuevoAnticipoCliente) {
		this.isEsNuevoAnticipoCliente = isEsNuevoAnticipoCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioAnticipoCliente() {
		return esParaAccionDesdeFormularioAnticipoCliente;
	}
	
	public void setEsParaAccionDesdeFormularioAnticipoCliente(Boolean esParaAccionDesdeFormularioAnticipoCliente) {
		this.esParaAccionDesdeFormularioAnticipoCliente = esParaAccionDesdeFormularioAnticipoCliente;
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

			if(this.anticipoclienteSessionBean==null) {
				this.anticipoclienteSessionBean=new AnticipoClienteSessionBean();
			}

			if(!this.anticipoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(anticipoclienteSessionBean.getlidEmpresaActual());
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

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.anticipoclienteSessionBean==null) {
				this.anticipoclienteSessionBean=new AnticipoClienteSessionBean();
			}

			if(!this.anticipoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

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
					empleadoLogic.getEntityWithConnection(anticipoclienteSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosEstadoAntiClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadoanticlientesForeignKey=new ArrayList<EstadoAntiCliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoAntiClienteLogic estadoanticlienteLogic=new EstadoAntiClienteLogic();

			//estadoanticlienteLogic.getEstadoAntiClienteDataAccess().setIsForForeingKeyData(true);

			if(this.anticipoclienteSessionBean==null) {
				this.anticipoclienteSessionBean=new AnticipoClienteSessionBean();
			}

			if(!this.anticipoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEstadoAntiCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadoanticlienteLogic.getEstadoAntiClienteDataAccess().setIsForForeingKeyData(true);

					estadoanticlienteLogic.getTodosEstadoAntiClientesWithConnection(sFinalQuery,new Pagination());

					this.estadoanticlientesForeignKey=estadoanticlienteLogic.getEstadoAntiClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoAntiCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoanticlienteLogic.getEntityWithConnection(anticipoclienteSessionBean.getlidEstadoAntiClienteActual());
					this.estadoanticlientesForeignKey.add(estadoanticlienteLogic.getEstadoAntiCliente());
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

	public void cargarCombosTipoGrupoFormaPagosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipogrupoformapagosForeignKey=new ArrayList<TipoGrupoFormaPago>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoGrupoFormaPagoLogic tipogrupoformapagoLogic=new TipoGrupoFormaPagoLogic();

			//tipogrupoformapagoLogic.getTipoGrupoFormaPagoDataAccess().setIsForForeingKeyData(true);

			if(this.anticipoclienteSessionBean==null) {
				this.anticipoclienteSessionBean=new AnticipoClienteSessionBean();
			}

			if(!this.anticipoclienteSessionBean.getisBusquedaDesdeForeignKeySesionTipoGrupoFormaPago()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipogrupoformapagoLogic.getTipoGrupoFormaPagoDataAccess().setIsForForeingKeyData(true);

					tipogrupoformapagoLogic.getTodosTipoGrupoFormaPagosWithConnection(sFinalQuery,new Pagination());

					this.tipogrupoformapagosForeignKey=tipogrupoformapagoLogic.getTipoGrupoFormaPagos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoGrupoFormaPago(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogrupoformapagoLogic.getEntityWithConnection(anticipoclienteSessionBean.getlidTipoGrupoFormaPagoActual());
					this.tipogrupoformapagosForeignKey.add(tipogrupoformapagoLogic.getTipoGrupoFormaPago());
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

					if(this.anticipocliente!=null) {
						this.anticipocliente.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
						this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empresaAnticipoCliente.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaAnticipoCliente.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
						if(this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empresaAnticipoCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empresaAnticipoCliente.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaAnticipoClienteGenerico)throws Exception
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
				jComboBoxid_empresaAnticipoClienteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaAnticipoClienteGenerico!=null && jComboBoxid_empresaAnticipoClienteGenerico.getItemCount()>0) {
					jComboBoxid_empresaAnticipoClienteGenerico.setSelectedIndex(0);
				}
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

					if(this.anticipocliente!=null) {
						this.anticipocliente.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
						this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empleadoAnticipoCliente.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoAnticipoCliente.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
						if(this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empleadoAnticipoCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empleadoAnticipoCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoAnticipoClienteGenerico)throws Exception
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
				jComboBoxid_empleadoAnticipoClienteGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoAnticipoClienteGenerico!=null && jComboBoxid_empleadoAnticipoClienteGenerico.getItemCount()>0) {
					jComboBoxid_empleadoAnticipoClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoAntiClienteForeignKey(Long idEstadoAntiClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoAntiCliente  estadoanticlienteTemp=null;

			for(EstadoAntiCliente estadoanticlienteAux:estadoanticlientesForeignKey) {
				if(estadoanticlienteAux.getId()!=null && estadoanticlienteAux.getId().equals(idEstadoAntiClienteSeleccionado)) {
					estadoanticlienteTemp=estadoanticlienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadoanticlienteTemp!=null) {

					if(this.anticipocliente!=null) {
						this.anticipocliente.setEstadoAntiCliente(estadoanticlienteTemp);
					}

					if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
						this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_estado_anti_clienteAnticipoCliente.setSelectedItem(estadoanticlienteTemp);
					}
				} else {
					//jComboBoxid_estado_anti_clienteAnticipoCliente.setSelectedItem(estadoanticlienteTemp);
					if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
						if(this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_estado_anti_clienteAnticipoCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_estado_anti_clienteAnticipoCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoAntiCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadoanticlienteTemp!=null && jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente!=null) {
						jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente.setSelectedItem(estadoanticlienteTemp);
					} else {
						if(jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente!=null) {
							//jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente.setSelectedItem(estadoanticlienteTemp);
							if(jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente.getItemCount()>0) {
								jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente.setSelectedIndex(0);
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

	public String getActualEstadoAntiClienteForeignKeyDescripcion(Long idEstadoAntiClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoAntiCliente  estadoanticlienteTemp=null;

			for(EstadoAntiCliente estadoanticlienteAux:estadoanticlientesForeignKey) {
				if(estadoanticlienteAux.getId()!=null && estadoanticlienteAux.getId().equals(idEstadoAntiClienteSeleccionado)) {
					estadoanticlienteTemp=estadoanticlienteAux;
					break;
				}
			}


			sDescripcion=EstadoAntiClienteConstantesFunciones.getEstadoAntiClienteDescripcion(estadoanticlienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoAntiClienteForeignKeyGenerico(Long idEstadoAntiClienteSeleccionado,JComboBox jComboBoxid_estado_anti_clienteAnticipoClienteGenerico)throws Exception
	{
		try
		{
			EstadoAntiCliente  estadoanticlienteTemp=null;

			for(EstadoAntiCliente estadoanticlienteAux:estadoanticlientesForeignKey) {
				if(estadoanticlienteAux.getId()!=null && estadoanticlienteAux.getId().equals(idEstadoAntiClienteSeleccionado)) {
					estadoanticlienteTemp=estadoanticlienteAux;
					break;
				}
			}

			if(estadoanticlienteTemp!=null) {
				jComboBoxid_estado_anti_clienteAnticipoClienteGenerico.setSelectedItem(estadoanticlienteTemp);
			} else {
				if(jComboBoxid_estado_anti_clienteAnticipoClienteGenerico!=null && jComboBoxid_estado_anti_clienteAnticipoClienteGenerico.getItemCount()>0) {
					jComboBoxid_estado_anti_clienteAnticipoClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoGrupoFormaPagoForeignKey(Long idTipoGrupoFormaPagoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoGrupoFormaPago  tipogrupoformapagoTemp=null;

			for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagosForeignKey) {
				if(tipogrupoformapagoAux.getId()!=null && tipogrupoformapagoAux.getId().equals(idTipoGrupoFormaPagoSeleccionado)) {
					tipogrupoformapagoTemp=tipogrupoformapagoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipogrupoformapagoTemp!=null) {

					if(this.anticipocliente!=null) {
						this.anticipocliente.setTipoGrupoFormaPago(tipogrupoformapagoTemp);
					}

					if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
						this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.setSelectedItem(tipogrupoformapagoTemp);
					}
				} else {
					//jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.setSelectedItem(tipogrupoformapagoTemp);
					if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
						if(this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoGrupoFormaPago") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipogrupoformapagoTemp!=null && jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente!=null) {
						jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente.setSelectedItem(tipogrupoformapagoTemp);
					} else {
						if(jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente!=null) {
							//jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente.setSelectedItem(tipogrupoformapagoTemp);
							if(jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente.getItemCount()>0) {
								jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente.setSelectedIndex(0);
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

	public String getActualTipoGrupoFormaPagoForeignKeyDescripcion(Long idTipoGrupoFormaPagoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoGrupoFormaPago  tipogrupoformapagoTemp=null;

			for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagosForeignKey) {
				if(tipogrupoformapagoAux.getId()!=null && tipogrupoformapagoAux.getId().equals(idTipoGrupoFormaPagoSeleccionado)) {
					tipogrupoformapagoTemp=tipogrupoformapagoAux;
					break;
				}
			}


			sDescripcion=TipoGrupoFormaPagoConstantesFunciones.getTipoGrupoFormaPagoDescripcion(tipogrupoformapagoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoGrupoFormaPagoForeignKeyGenerico(Long idTipoGrupoFormaPagoSeleccionado,JComboBox jComboBoxid_tipo_grupo_forma_pagoAnticipoClienteGenerico)throws Exception
	{
		try
		{
			TipoGrupoFormaPago  tipogrupoformapagoTemp=null;

			for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagosForeignKey) {
				if(tipogrupoformapagoAux.getId()!=null && tipogrupoformapagoAux.getId().equals(idTipoGrupoFormaPagoSeleccionado)) {
					tipogrupoformapagoTemp=tipogrupoformapagoAux;
					break;
				}
			}

			if(tipogrupoformapagoTemp!=null) {
				jComboBoxid_tipo_grupo_forma_pagoAnticipoClienteGenerico.setSelectedItem(tipogrupoformapagoTemp);
			} else {
				if(jComboBoxid_tipo_grupo_forma_pagoAnticipoClienteGenerico!=null && jComboBoxid_tipo_grupo_forma_pagoAnticipoClienteGenerico.getItemCount()>0) {
					jComboBoxid_tipo_grupo_forma_pagoAnticipoClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(AnticipoCliente anticipocliente,JComboBox jComboBoxid_empresaAnticipoClienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaAnticipoClienteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empresaAnticipoCliente.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaAnticipoClienteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				anticipocliente.setid_empresa(empresaAux.getId());
				anticipocliente.setempresa_descripcion(AnticipoClienteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				anticipocliente.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(AnticipoCliente anticipocliente,JComboBox jComboBoxid_empleadoAnticipoClienteGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoAnticipoClienteGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empleadoAnticipoCliente.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoAnticipoClienteGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				anticipocliente.setid_empleado(empleadoAux.getId());
				anticipocliente.setempleado_descripcion(AnticipoClienteConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				anticipocliente.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoAntiClienteForeignKey(AnticipoCliente anticipocliente,JComboBox jComboBoxid_estado_anti_clienteAnticipoClienteGenerico)throws Exception
	{
		try
		{
			EstadoAntiCliente  estadoanticlienteAux=new EstadoAntiCliente();

			if(jComboBoxid_estado_anti_clienteAnticipoClienteGenerico==null) {
				estadoanticlienteAux=(EstadoAntiCliente)this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_estado_anti_clienteAnticipoCliente.getSelectedItem();
			} else {
				estadoanticlienteAux=(EstadoAntiCliente)jComboBoxid_estado_anti_clienteAnticipoClienteGenerico.getSelectedItem();
			}

			if(estadoanticlienteAux!=null && estadoanticlienteAux.getId()!=null) {
				anticipocliente.setid_estado_anti_cliente(estadoanticlienteAux.getId());
				anticipocliente.setestadoanticliente_descripcion(AnticipoClienteConstantesFunciones.getEstadoAntiClienteDescripcion(estadoanticlienteAux));
				anticipocliente.setEstadoAntiCliente(estadoanticlienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoGrupoFormaPagoForeignKey(AnticipoCliente anticipocliente,JComboBox jComboBoxid_tipo_grupo_forma_pagoAnticipoClienteGenerico)throws Exception
	{
		try
		{
			TipoGrupoFormaPago  tipogrupoformapagoAux=new TipoGrupoFormaPago();

			if(jComboBoxid_tipo_grupo_forma_pagoAnticipoClienteGenerico==null) {
				tipogrupoformapagoAux=(TipoGrupoFormaPago)this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.getSelectedItem();
			} else {
				tipogrupoformapagoAux=(TipoGrupoFormaPago)jComboBoxid_tipo_grupo_forma_pagoAnticipoClienteGenerico.getSelectedItem();
			}

			if(tipogrupoformapagoAux!=null && tipogrupoformapagoAux.getId()!=null) {
				anticipocliente.setid_tipo_grupo_forma_pago(tipogrupoformapagoAux.getId());
				anticipocliente.settipogrupoformapago_descripcion(AnticipoClienteConstantesFunciones.getTipoGrupoFormaPagoDescripcion(tipogrupoformapagoAux));
				anticipocliente.setTipoGrupoFormaPago(tipogrupoformapagoAux);			}
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

					if(!AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { 
							this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empresaAnticipoCliente.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empresaAnticipoCliente.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { 
					}

					if(!AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { 
							this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empleadoAnticipoCliente.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empleadoAnticipoCliente.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { 
					}

					if(!AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente.addItem(empleado);
							}
						}

						if(!AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoAntiClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoAntiCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { 
							this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_estado_anti_clienteAnticipoCliente.removeAllItems();

							for(EstadoAntiCliente estadoanticliente:this.estadoanticlientesForeignKey) {
								this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_estado_anti_clienteAnticipoCliente.addItem(estadoanticliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { 
					}

					if(!AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoAntiCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente.removeAllItems();

							for(EstadoAntiCliente estadoanticliente:this.estadoanticlientesForeignKey) {
								this.jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente.addItem(estadoanticliente);
							}
						}

						if(!AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoGrupoFormaPagosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoGrupoFormaPago=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { 
							this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.removeAllItems();

							for(TipoGrupoFormaPago tipogrupoformapago:this.tipogrupoformapagosForeignKey) {
								this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.addItem(tipogrupoformapago);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { 
					}

					if(!AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoGrupoFormaPago") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente.removeAllItems();

							for(TipoGrupoFormaPago tipogrupoformapago:this.tipogrupoformapagosForeignKey) {
								this.jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente.addItem(tipogrupoformapago);
							}
						}

						if(!AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
							this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empresaAnticipoCliente.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
							this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empresaAnticipoCliente.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEmpleadoForeignKey(Empleado empleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
							this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empleadoAnticipoCliente.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
							this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empleadoAnticipoCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoAntiClienteForeignKey(EstadoAntiCliente estadoanticliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
							this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_estado_anti_clienteAnticipoCliente.setSelectedItem(estadoanticliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
							this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_estado_anti_clienteAnticipoCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente.setSelectedItem(estadoanticliente);
						} else {
							this.jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoGrupoFormaPagoForeignKey(TipoGrupoFormaPago tipogrupoformapago,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
							this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.setSelectedItem(tipogrupoformapago);
						}
					} else {
						if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
							this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente.setSelectedItem(tipogrupoformapago);
						} else {
							this.jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesAnticipoCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			AnticipoClienteConstantesFunciones.refrescarForeignKeysDescripcionesAnticipoCliente(this.anticipoclienteLogic.getAnticipoClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			AnticipoClienteConstantesFunciones.refrescarForeignKeysDescripcionesAnticipoCliente(this.anticipoclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(EstadoAntiCliente.class));
		classes.add(new Classe(TipoGrupoFormaPago.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//anticipoclienteLogic.setAnticipoClientes(this.anticipoclientes);
			anticipoclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public AnticipoClienteParameterReturnGeneral getAnticipoClienteParameterGeneral() {
		return this.anticipoclienteParameterGeneral;
	}
	
	public void setAnticipoClienteParameterGeneral(AnticipoClienteParameterReturnGeneral anticipoclienteParameterGeneral) {
		this.anticipoclienteParameterGeneral = anticipoclienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAnticipoCliente() {
		return isPermisoTodoAnticipoCliente;
	}

	public void setIsPermisoTodoAnticipoCliente(Boolean isPermisoTodoAnticipoCliente) {
		this.isPermisoTodoAnticipoCliente = isPermisoTodoAnticipoCliente;
	}

	public Boolean getIsPermisoNuevoAnticipoCliente() {
		return isPermisoNuevoAnticipoCliente;
	}

	public void setIsPermisoNuevoAnticipoCliente(Boolean isPermisoNuevoAnticipoCliente) {
		this.isPermisoNuevoAnticipoCliente = isPermisoNuevoAnticipoCliente;
	}

	public Boolean getIsPermisoActualizarAnticipoCliente() {
		return isPermisoActualizarAnticipoCliente;
	}

	public void setIsPermisoActualizarAnticipoCliente(Boolean isPermisoActualizarAnticipoCliente) {
		this.isPermisoActualizarAnticipoCliente = isPermisoActualizarAnticipoCliente;
	}

	public Boolean getIsPermisoEliminarAnticipoCliente() {
		return isPermisoEliminarAnticipoCliente;
	}

	public void setIsPermisoEliminarAnticipoCliente(Boolean isPermisoEliminarAnticipoCliente) {
		this.isPermisoEliminarAnticipoCliente = isPermisoEliminarAnticipoCliente;
	}

	public Boolean getIsPermisoGuardarCambiosAnticipoCliente() {
		return isPermisoGuardarCambiosAnticipoCliente;
	}

	public void setIsPermisoGuardarCambiosAnticipoCliente(Boolean isPermisoGuardarCambiosAnticipoCliente) {
		this.isPermisoGuardarCambiosAnticipoCliente = isPermisoGuardarCambiosAnticipoCliente;
	}
	
	public Boolean getIsPermisoConsultaAnticipoCliente() {
		return isPermisoConsultaAnticipoCliente;
	}

	public void setIsPermisoConsultaAnticipoCliente(Boolean isPermisoConsultaAnticipoCliente) {
		this.isPermisoConsultaAnticipoCliente = isPermisoConsultaAnticipoCliente;
	}

	public Boolean getIsPermisoBusquedaAnticipoCliente() {
		return isPermisoBusquedaAnticipoCliente;
	}

	public void setIsPermisoBusquedaAnticipoCliente(Boolean isPermisoBusquedaAnticipoCliente) {
		this.isPermisoBusquedaAnticipoCliente = isPermisoBusquedaAnticipoCliente;
	}

	public Boolean getIsPermisoReporteAnticipoCliente() {
		return isPermisoReporteAnticipoCliente;
	}

	public void setIsPermisoReporteAnticipoCliente(Boolean isPermisoReporteAnticipoCliente) {
		this.isPermisoReporteAnticipoCliente = isPermisoReporteAnticipoCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioAnticipoCliente() {
		return isPermisoPaginacionMedioAnticipoCliente;
	}

	public void setIsPermisoPaginacionMedioAnticipoCliente(Boolean isPermisoPaginacionMedioAnticipoCliente) {
		this.isPermisoPaginacionMedioAnticipoCliente = isPermisoPaginacionMedioAnticipoCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoAnticipoCliente() {
		return isPermisoPaginacionTodoAnticipoCliente;
	}

	public void setIsPermisoPaginacionTodoAnticipoCliente(Boolean isPermisoPaginacionTodoAnticipoCliente) {
		this.isPermisoPaginacionTodoAnticipoCliente = isPermisoPaginacionTodoAnticipoCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoAnticipoCliente() {
		return isPermisoPaginacionAltoAnticipoCliente;
	}

	public void setIsPermisoPaginacionAltoAnticipoCliente(Boolean isPermisoPaginacionAltoAnticipoCliente) {
		this.isPermisoPaginacionAltoAnticipoCliente = isPermisoPaginacionAltoAnticipoCliente;
	}
	
	public Boolean getIsPermisoCopiarAnticipoCliente() {
		return isPermisoCopiarAnticipoCliente;
	}

	public void setIsPermisoCopiarAnticipoCliente(Boolean isPermisoCopiarAnticipoCliente) {
		this.isPermisoCopiarAnticipoCliente = isPermisoCopiarAnticipoCliente;
	}
	
	public Boolean getIsPermisoVerFormAnticipoCliente() {
		return isPermisoVerFormAnticipoCliente;
	}

	public void setIsPermisoVerFormAnticipoCliente(Boolean isPermisoVerFormAnticipoCliente) {
		this.isPermisoVerFormAnticipoCliente = isPermisoVerFormAnticipoCliente;
	}
	
	public Boolean getIsPermisoDuplicarAnticipoCliente() {
		return isPermisoDuplicarAnticipoCliente;
	}

	public void setIsPermisoDuplicarAnticipoCliente(Boolean isPermisoDuplicarAnticipoCliente) {
		this.isPermisoDuplicarAnticipoCliente = isPermisoDuplicarAnticipoCliente;
	}
	
	public Boolean getIsPermisoOrdenAnticipoCliente() {
		return isPermisoOrdenAnticipoCliente;
	}

	public void setIsPermisoOrdenAnticipoCliente(Boolean isPermisoOrdenAnticipoCliente) {
		this.isPermisoOrdenAnticipoCliente = isPermisoOrdenAnticipoCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAnticipoCliente() {
		return isVisibilidadCeldaNuevoAnticipoCliente;
	}

	public void setIsVisibilidadCeldaNuevoAnticipoCliente(Boolean isVisibilidadCeldaNuevoAnticipoCliente) {
		this.isVisibilidadCeldaNuevoAnticipoCliente = isVisibilidadCeldaNuevoAnticipoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAnticipoCliente() {
		return isVisibilidadCeldaDuplicarAnticipoCliente;
	}

	public void setIsVisibilidadCeldaDuplicarAnticipoCliente(Boolean isVisibilidadCeldaDuplicarAnticipoCliente) {
		this.isVisibilidadCeldaDuplicarAnticipoCliente = isVisibilidadCeldaDuplicarAnticipoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAnticipoCliente() {
		return isVisibilidadCeldaCopiarAnticipoCliente;
	}

	public void setIsVisibilidadCeldaCopiarAnticipoCliente(Boolean isVisibilidadCeldaCopiarAnticipoCliente) {
		this.isVisibilidadCeldaCopiarAnticipoCliente = isVisibilidadCeldaCopiarAnticipoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAnticipoCliente() {
		return isVisibilidadCeldaVerFormAnticipoCliente;
	}

	public void setIsVisibilidadCeldaVerFormAnticipoCliente(Boolean isVisibilidadCeldaVerFormAnticipoCliente) {
		this.isVisibilidadCeldaVerFormAnticipoCliente = isVisibilidadCeldaVerFormAnticipoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAnticipoCliente() {
		return isVisibilidadCeldaOrdenAnticipoCliente;
	}

	public void setIsVisibilidadCeldaOrdenAnticipoCliente(Boolean isVisibilidadCeldaOrdenAnticipoCliente) {
		this.isVisibilidadCeldaOrdenAnticipoCliente = isVisibilidadCeldaOrdenAnticipoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAnticipoCliente() {
		return isVisibilidadCeldaNuevoRelacionesAnticipoCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAnticipoCliente(Boolean isVisibilidadCeldaNuevoRelacionesAnticipoCliente) {
		this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente = isVisibilidadCeldaNuevoRelacionesAnticipoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAnticipoCliente() {
		return isVisibilidadCeldaModificarAnticipoCliente;
	}

	public void setIsVisibilidadCeldaModificarAnticipoCliente(Boolean isVisibilidadCeldaModificarAnticipoCliente) {
		this.isVisibilidadCeldaModificarAnticipoCliente = isVisibilidadCeldaModificarAnticipoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAnticipoCliente() {
		return isVisibilidadCeldaActualizarAnticipoCliente;
	}

	public void setIsVisibilidadCeldaActualizarAnticipoCliente(Boolean isVisibilidadCeldaActualizarAnticipoCliente) {
		this.isVisibilidadCeldaActualizarAnticipoCliente = isVisibilidadCeldaActualizarAnticipoCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarAnticipoCliente() {
		return isVisibilidadCeldaEliminarAnticipoCliente;
	}

	public void setIsVisibilidadCeldaEliminarAnticipoCliente(Boolean isVisibilidadCeldaEliminarAnticipoCliente) {
		this.isVisibilidadCeldaEliminarAnticipoCliente = isVisibilidadCeldaEliminarAnticipoCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarAnticipoCliente() {
		return isVisibilidadCeldaCancelarAnticipoCliente;
	}

	public void setIsVisibilidadCeldaCancelarAnticipoCliente(Boolean isVisibilidadCeldaCancelarAnticipoCliente) {
		this.isVisibilidadCeldaCancelarAnticipoCliente = isVisibilidadCeldaCancelarAnticipoCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarAnticipoCliente() {
		return isVisibilidadCeldaGuardarAnticipoCliente;
	}

	public void setIsVisibilidadCeldaGuardarAnticipoCliente(Boolean isVisibilidadCeldaGuardarAnticipoCliente) {
		this.isVisibilidadCeldaGuardarAnticipoCliente = isVisibilidadCeldaGuardarAnticipoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAnticipoCliente() {
		return isVisibilidadCeldaGuardarCambiosAnticipoCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAnticipoCliente(Boolean isVisibilidadCeldaGuardarCambiosAnticipoCliente) {
		this.isVisibilidadCeldaGuardarCambiosAnticipoCliente = isVisibilidadCeldaGuardarCambiosAnticipoCliente;
	}
		
	public AnticipoClienteSessionBean getanticipoclienteSessionBean() {
		return this.anticipoclienteSessionBean;
	}
	
	public void setanticipoclienteSessionBean(AnticipoClienteSessionBean anticipoclienteSessionBean) {
		this.anticipoclienteSessionBean=anticipoclienteSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstadoAntiCliente() {
		return this.isVisibilidadFK_IdEstadoAntiCliente;
	}

	public void setisVisibilidadFK_IdEstadoAntiCliente(Boolean isVisibilidadFK_IdEstadoAntiCliente) {
		this.isVisibilidadFK_IdEstadoAntiCliente=isVisibilidadFK_IdEstadoAntiCliente;
	}

	public Boolean getisVisibilidadFK_IdTipoGrupoFormaPago() {
		return this.isVisibilidadFK_IdTipoGrupoFormaPago;
	}

	public void setisVisibilidadFK_IdTipoGrupoFormaPago(Boolean isVisibilidadFK_IdTipoGrupoFormaPago) {
		this.isVisibilidadFK_IdTipoGrupoFormaPago=isVisibilidadFK_IdTipoGrupoFormaPago;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(AnticipoCliente anticipocliente)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(anticipocliente,null);
				this.setActualParaGuardarEmpleadoForeignKey(anticipocliente,null);
				this.setActualParaGuardarEstadoAntiClienteForeignKey(anticipocliente,null);
				this.setActualParaGuardarTipoGrupoFormaPagoForeignKey(anticipocliente,null);
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
	
	public void bugActualizarReferenciaActual(AnticipoCliente anticipocliente,AnticipoCliente anticipoclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAnticipoCliente(anticipocliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		anticipoclienteAux.setId(anticipocliente.getId());
		anticipoclienteAux.setVersionRow(anticipocliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessAnticipoCliente();
		
			int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(AnticipoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = anticipoclienteValidator.getInvalidValues(this.anticipocliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			anticipoclienteLogic.setDatosCliente(datosCliente);
			anticipoclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				anticipoclienteAux=new  AnticipoCliente();
				
				anticipoclienteAux.setIsNew(true);
				anticipoclienteAux.setIsChanged(true);
				
				anticipoclienteAux.setAnticipoClienteOriginal(this.anticipocliente);
				
				anticipoclienteAux.setId(this.anticipocliente.getId());	
				anticipoclienteAux.setVersionRow(this.anticipocliente.getVersionRow());	
				anticipoclienteAux.setid_empresa(this.anticipocliente.getid_empresa());	
				anticipoclienteAux.setid_empleado(this.anticipocliente.getid_empleado());	
				anticipoclienteAux.setid_estado_anti_cliente(this.anticipocliente.getid_estado_anti_cliente());	
				anticipoclienteAux.setid_tipo_grupo_forma_pago(this.anticipocliente.getid_tipo_grupo_forma_pago());	
				anticipoclienteAux.setfecha(this.anticipocliente.getfecha());	
				anticipoclienteAux.setvalor(this.anticipocliente.getvalor());	
				anticipoclienteAux.setdescripcion(this.anticipocliente.getdescripcion());	
				anticipoclienteAux.setvalor_adicional(this.anticipocliente.getvalor_adicional());	
				anticipoclienteAux.setvalor_prestamo(this.anticipocliente.getvalor_prestamo());	
				anticipoclienteAux.setingreso1(this.anticipocliente.getingreso1());	
				anticipoclienteAux.setingreso2(this.anticipocliente.getingreso2());	
				anticipoclienteAux.setingreso3(this.anticipocliente.getingreso3());	
				anticipoclienteAux.setingreso4(this.anticipocliente.getingreso4());	
				anticipoclienteAux.setingreso5(this.anticipocliente.getingreso5());	
				anticipoclienteAux.setdescuento1(this.anticipocliente.getdescuento1());	
				anticipoclienteAux.setdescuento2(this.anticipocliente.getdescuento2());	
				anticipoclienteAux.setdescuento3(this.anticipocliente.getdescuento3());	
				anticipoclienteAux.setdescuento4(this.anticipocliente.getdescuento4());	
				anticipoclienteAux.setdescuento5(this.anticipocliente.getdescuento5());	
				anticipoclienteAux.settipo_ingreso(this.anticipocliente.gettipo_ingreso());	
				anticipoclienteAux.settipo_descuento(this.anticipocliente.gettipo_descuento());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.anticipoclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.anticipoclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(anticipoclienteAux,anticipoclienteLogic.getAnticipoClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(anticipoclienteAux,anticipoclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.anticipoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.anticipoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						anticipoclienteLogic.saveAnticipoClientes();//WithConnection
						//anticipoclienteLogic.getSetVersionRowAnticipoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.anticipocliente,anticipoclienteAux);
					
					this.refrescarForeignKeysDescripcionesAnticipoCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.anticipoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								anticipoclienteLogic.saveAnticipoClienteRelaciones(anticipoclienteAux);//WithConnection
								//anticipoclienteLogic.getSetVersionRowAnticipoClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.anticipocliente,anticipoclienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.anticipoclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.anticipoclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(anticipoclienteAux,anticipoclienteLogic.getAnticipoClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(anticipoclienteAux,anticipoclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.anticipocliente,anticipoclienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				anticipoclienteAux=new  AnticipoCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.anticipoclienteSessionBean.getEsGuardarRelacionado() && this.anticipocliente.getId()>=0)) {
						
					anticipoclienteAux.setIsNew(false);
				}
				
				anticipoclienteAux.setIsDeleted(false);
			
				anticipoclienteAux.setId(this.anticipocliente.getId());	
				anticipoclienteAux.setVersionRow(this.anticipocliente.getVersionRow());	
				anticipoclienteAux.setid_empresa(this.anticipocliente.getid_empresa());	
				anticipoclienteAux.setid_empleado(this.anticipocliente.getid_empleado());	
				anticipoclienteAux.setid_estado_anti_cliente(this.anticipocliente.getid_estado_anti_cliente());	
				anticipoclienteAux.setid_tipo_grupo_forma_pago(this.anticipocliente.getid_tipo_grupo_forma_pago());	
				anticipoclienteAux.setfecha(this.anticipocliente.getfecha());	
				anticipoclienteAux.setvalor(this.anticipocliente.getvalor());	
				anticipoclienteAux.setdescripcion(this.anticipocliente.getdescripcion());	
				anticipoclienteAux.setvalor_adicional(this.anticipocliente.getvalor_adicional());	
				anticipoclienteAux.setvalor_prestamo(this.anticipocliente.getvalor_prestamo());	
				anticipoclienteAux.setingreso1(this.anticipocliente.getingreso1());	
				anticipoclienteAux.setingreso2(this.anticipocliente.getingreso2());	
				anticipoclienteAux.setingreso3(this.anticipocliente.getingreso3());	
				anticipoclienteAux.setingreso4(this.anticipocliente.getingreso4());	
				anticipoclienteAux.setingreso5(this.anticipocliente.getingreso5());	
				anticipoclienteAux.setdescuento1(this.anticipocliente.getdescuento1());	
				anticipoclienteAux.setdescuento2(this.anticipocliente.getdescuento2());	
				anticipoclienteAux.setdescuento3(this.anticipocliente.getdescuento3());	
				anticipoclienteAux.setdescuento4(this.anticipocliente.getdescuento4());	
				anticipoclienteAux.setdescuento5(this.anticipocliente.getdescuento5());	
				anticipoclienteAux.settipo_ingreso(this.anticipocliente.gettipo_ingreso());	
				anticipoclienteAux.settipo_descuento(this.anticipocliente.gettipo_descuento());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(anticipoclienteAux,anticipoclienteLogic.getAnticipoClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(anticipoclienteAux,anticipoclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.anticipoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.anticipoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						anticipoclienteLogic.saveAnticipoClientes();//WithConnection
						//anticipoclienteLogic.getSetVersionRowAnticipoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.anticipocliente,anticipoclienteAux);
					
					this.refrescarForeignKeysDescripcionesAnticipoCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.anticipoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								anticipoclienteLogic.saveAnticipoClienteRelaciones(anticipoclienteAux);//WithConnection
								//anticipoclienteLogic.getSetVersionRowAnticipoClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.anticipocliente,anticipoclienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.anticipoclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.anticipoclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(anticipoclienteAux,anticipoclienteLogic.getAnticipoClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(anticipoclienteAux,anticipoclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.anticipocliente,anticipoclienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				anticipoclienteAux=new  AnticipoCliente();
				
				anticipoclienteAux.setIsNew(false);
				anticipoclienteAux.setIsChanged(false);
				
				anticipoclienteAux.setIsDeleted(true);
				
				anticipoclienteAux.setId(this.anticipocliente.getId());	
				anticipoclienteAux.setVersionRow(this.anticipocliente.getVersionRow());	
				anticipoclienteAux.setid_empresa(this.anticipocliente.getid_empresa());	
				anticipoclienteAux.setid_empleado(this.anticipocliente.getid_empleado());	
				anticipoclienteAux.setid_estado_anti_cliente(this.anticipocliente.getid_estado_anti_cliente());	
				anticipoclienteAux.setid_tipo_grupo_forma_pago(this.anticipocliente.getid_tipo_grupo_forma_pago());	
				anticipoclienteAux.setfecha(this.anticipocliente.getfecha());	
				anticipoclienteAux.setvalor(this.anticipocliente.getvalor());	
				anticipoclienteAux.setdescripcion(this.anticipocliente.getdescripcion());	
				anticipoclienteAux.setvalor_adicional(this.anticipocliente.getvalor_adicional());	
				anticipoclienteAux.setvalor_prestamo(this.anticipocliente.getvalor_prestamo());	
				anticipoclienteAux.setingreso1(this.anticipocliente.getingreso1());	
				anticipoclienteAux.setingreso2(this.anticipocliente.getingreso2());	
				anticipoclienteAux.setingreso3(this.anticipocliente.getingreso3());	
				anticipoclienteAux.setingreso4(this.anticipocliente.getingreso4());	
				anticipoclienteAux.setingreso5(this.anticipocliente.getingreso5());	
				anticipoclienteAux.setdescuento1(this.anticipocliente.getdescuento1());	
				anticipoclienteAux.setdescuento2(this.anticipocliente.getdescuento2());	
				anticipoclienteAux.setdescuento3(this.anticipocliente.getdescuento3());	
				anticipoclienteAux.setdescuento4(this.anticipocliente.getdescuento4());	
				anticipoclienteAux.setdescuento5(this.anticipocliente.getdescuento5());	
				anticipoclienteAux.settipo_ingreso(this.anticipocliente.gettipo_ingreso());	
				anticipoclienteAux.settipo_descuento(this.anticipocliente.gettipo_descuento());	
				
				if(this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.anticipoclienteAux.getId()>=0) {	
						this.anticipoclientesEliminados.add(anticipoclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(anticipoclienteAux,anticipoclienteLogic.getAnticipoClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(anticipoclienteAux,anticipoclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.anticipoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.anticipoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						anticipoclienteLogic.saveAnticipoClientes();//WithConnection
						//anticipoclienteLogic.getSetVersionRowAnticipoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.anticipoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								anticipoclienteLogic.saveAnticipoClienteRelaciones(anticipoclienteAux);//WithConnection
								//anticipoclienteLogic.getSetVersionRowAnticipoClientes();//WithConnection
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
							if(this.anticipoclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.anticipoclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(anticipoclienteAux,anticipoclienteLogic.getAnticipoClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(anticipoclienteAux,anticipoclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getAnticipoClientes().addAll(this.anticipoclientesEliminados);
					
					anticipoclienteLogic.saveAnticipoClientes();//WithConnection
					//anticipoclienteLogic.getSetVersionRowAnticipoClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesAnticipoCliente();
				
				this.anticipoclientesEliminados= new ArrayList<AnticipoCliente>();		
			}
			
			if(this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Anticipo Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Anticipo Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.anticipocliente=anticipoclienteAux;
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
      		//this.finishProcessAnticipoCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(AnticipoCliente anticipoclienteLocal) throws Exception {
		
		if(this.anticipoclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(AnticipoCliente anticipoclienteLocal) throws Exception {	
		if(this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				anticipoclienteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				anticipoclienteLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoAntiClienteDetalleFormJInternalFrame.class)) {
				EstadoAntiClienteBeanSwingJInternalFrame estadoanticlienteBeanSwingJInternalFrameLocal=(EstadoAntiClienteBeanSwingJInternalFrame) ((EstadoAntiClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadoanticlienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoAntiCliente(estadoanticlienteBeanSwingJInternalFrameLocal.getestadoanticliente(),true);
				estadoanticlienteBeanSwingJInternalFrameLocal.actualizarLista(estadoanticlienteBeanSwingJInternalFrameLocal.estadoanticliente,this.estadoanticlientesForeignKey);

				estadoanticlienteBeanSwingJInternalFrameLocal.actualizarRelaciones(estadoanticlienteBeanSwingJInternalFrameLocal.estadoanticliente);

				anticipoclienteLocal.setEstadoAntiCliente(estadoanticlienteBeanSwingJInternalFrameLocal.estadoanticliente);

				this.addItemDefectoCombosForeignKeyEstadoAntiCliente();
				this.cargarCombosFrameEstadoAntiClientesForeignKey("Formulario");
				this.setActualEstadoAntiClienteForeignKey(estadoanticlienteBeanSwingJInternalFrameLocal.estadoanticliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoGrupoFormaPagoDetalleFormJInternalFrame.class)) {
				TipoGrupoFormaPagoBeanSwingJInternalFrame tipogrupoformapagoBeanSwingJInternalFrameLocal=(TipoGrupoFormaPagoBeanSwingJInternalFrame) ((TipoGrupoFormaPagoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipogrupoformapagoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoGrupoFormaPago(tipogrupoformapagoBeanSwingJInternalFrameLocal.gettipogrupoformapago(),true);
				tipogrupoformapagoBeanSwingJInternalFrameLocal.actualizarLista(tipogrupoformapagoBeanSwingJInternalFrameLocal.tipogrupoformapago,this.tipogrupoformapagosForeignKey);

				tipogrupoformapagoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipogrupoformapagoBeanSwingJInternalFrameLocal.tipogrupoformapago);

				anticipoclienteLocal.setTipoGrupoFormaPago(tipogrupoformapagoBeanSwingJInternalFrameLocal.tipogrupoformapago);

				this.addItemDefectoCombosForeignKeyTipoGrupoFormaPago();
				this.cargarCombosFrameTipoGrupoFormaPagosForeignKey("Formulario");
				this.setActualTipoGrupoFormaPagoForeignKey(tipogrupoformapagoBeanSwingJInternalFrameLocal.tipogrupoformapago.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAnticipoClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = anticipoclienteValidator.getInvalidValues(this.anticipocliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(AnticipoCliente anticipocliente,List<AnticipoCliente> anticipoclientes) throws Exception {
		try	{		
			AnticipoClienteConstantesFunciones.actualizarLista(anticipocliente,anticipoclientes,this.anticipoclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(AnticipoCliente anticipocliente,List<AnticipoCliente> anticipoclientes) throws Exception {
		try	{			
			AnticipoClienteConstantesFunciones.actualizarSelectedLista(anticipocliente,anticipoclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<AnticipoCliente> anticipoclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				anticipoclientesLocal=this.anticipoclienteLogic.getAnticipoClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				anticipoclientesLocal=this.anticipoclientes;
			}
			//ARCHITECTURE
		
			for(AnticipoCliente anticipoclienteLocal:anticipoclientesLocal) {
				if(this.permiteMantenimiento(anticipoclienteLocal) && anticipoclienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AnticipoClienteConstantesFunciones.getAnticipoClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelid_empresaAnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelid_empleadoAnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.IDESTADOANTICLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelid_estado_anti_clienteAnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.IDTIPOGRUPOFORMAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelid_tipo_grupo_forma_pagoAnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelfechaAnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelvalorAnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabeldescripcionAnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.VALORADICIONAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelvalor_adicionalAnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.VALORPRESTAMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelvalor_prestamoAnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.INGRESO1)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelingreso1AnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.INGRESO2)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelingreso2AnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.INGRESO3)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelingreso3AnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.INGRESO4)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelingreso4AnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.INGRESO5)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelingreso5AnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.DESCUENTO1)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabeldescuento1AnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.DESCUENTO2)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabeldescuento2AnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.DESCUENTO3)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabeldescuento3AnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.DESCUENTO4)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabeldescuento4AnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.DESCUENTO5)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabeldescuento5AnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.TIPOINGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabeltipo_ingresoAnticipoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnticipoClienteConstantesFunciones.TIPODESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabeltipo_descuentoAnticipoCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabelid_empresaAnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabelid_empleadoAnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabelid_estado_anti_clienteAnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabelid_tipo_grupo_forma_pagoAnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabelfechaAnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabelvalorAnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabeldescripcionAnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabelvalor_adicionalAnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabelvalor_prestamoAnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabelingreso1AnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabelingreso2AnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabelingreso3AnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabelingreso4AnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabelingreso5AnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabeldescuento1AnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabeldescuento2AnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabeldescuento3AnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabeldescuento4AnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabeldescuento5AnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabeltipo_ingresoAnticipoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnticipoCliente.jLabeltipo_descuentoAnticipoCliente,"");
		
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
		this.iIdNuevoAnticipoCliente--;	
		
		
		this.anticipoclienteAux=new AnticipoCliente();
		
		this.anticipoclienteAux.setId(this.iIdNuevoAnticipoCliente);
		this.anticipoclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.anticipoclienteLogic.getAnticipoClientes().add(this.anticipoclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.anticipoclientes.add(this.anticipoclienteAux);
		}
		//ARCHITECTURE
		
		this.anticipocliente=this.anticipoclienteAux;
		
		if(AnticipoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAnticipoCliente(this.anticipocliente);
			this.setVariablesObjetoActualToFormularioForeignKeyAnticipoCliente(this.anticipocliente);
		}
				
		//this.setDefaultControlesAnticipoCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAnticipoCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAnticipoCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAnticipoCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAnticipoCliente(this.anticipoclienteBean,this.anticipocliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(AnticipoClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.anticipoclienteSessionBean.getConGuardarRelaciones()) {
			classes=AnticipoClienteConstantesFunciones.getClassesRelationshipsOfAnticipoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.anticipoclienteReturnGeneral=anticipoclienteLogic.procesarEventosAnticipoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.anticipoclienteLogic.getAnticipoClientes(),this.anticipocliente,this.anticipoclienteParameterGeneral,this.isEsNuevoAnticipoCliente,classes);//this.anticipoclienteLogic.getAnticipoCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAnticipoCliente(this.anticipoclienteReturnGeneral,this.anticipoclienteBean,false);
		
		if(this.anticipoclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAnticipoCliente(this.anticipoclienteReturnGeneral.getAnticipoCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAnticipoCliente(this.anticipoclienteReturnGeneral.getAnticipoCliente());
		}
		
		if(this.anticipoclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAnticipoCliente(this.anticipoclienteReturnGeneral.getAnticipoCliente(),classes);//this.anticipoclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAnticipoCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAnticipoCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AnticipoClienteBeanSwingJInternalFrameAdditional.RecargarFormAnticipoCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAnticipoCliente(false);
						
			if(anticipoclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAnticipoCliente();
			}
			
			this.actualizarVisualTableDatosAnticipoCliente();
			
			this.jTableDatosAnticipoCliente.setRowSelectionInterval(this.getIndiceNuevoAnticipoCliente(), this.getIndiceNuevoAnticipoCliente());
			
			this.seleccionarFilaTablaAnticipoClienteActual();
						
			this.actualizarEstadoCeldasBotonesAnticipoCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAnticipoCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAnticipoCliente.jDateChooserfechaAnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activarfechaAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalorAnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activarvalorAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextAreadescripcionAnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activardescripcionAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalor_adicionalAnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activarvalor_adicionalAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalor_prestamoAnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activarvalor_prestamoAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso1AnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activaringreso1AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso2AnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activaringreso2AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso3AnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activaringreso3AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso4AnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activaringreso4AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso5AnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activaringreso5AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento1AnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activardescuento1AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento2AnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activardescuento2AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento3AnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activardescuento3AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento4AnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activardescuento4AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento5AnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activardescuento5AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldtipo_ingresoAnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activartipo_ingresoAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldtipo_descuentoAnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activartipo_descuentoAnticipoCliente);	
		//
		this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empresaAnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activarid_empresaAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empleadoAnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activarid_empleadoAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_estado_anti_clienteAnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activarid_estado_anti_clienteAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.setEnabled(isHabilitar && this.anticipoclienteConstantesFunciones.activarid_tipo_grupo_forma_pagoAnticipoCliente);
	};
	
	public void setDefaultControlesAnticipoCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAnticipoCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.anticipoclienteSessionBean.setConGuardarRelaciones(true);			
			this.anticipoclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAnticipoCliente.jTabbedPaneRelacionesAnticipoCliente.setVisible(true);
			
					
		} else {
			//this.anticipoclienteSessionBean.setConGuardarRelaciones(false);			
			this.anticipoclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAnticipoCliente.jTabbedPaneRelacionesAnticipoCliente.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoAnticipoCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AnticipoCliente anticipoclienteAux:this.anticipoclienteLogic.getAnticipoClientes()) {
				if(anticipoclienteAux.getId().equals(this.iIdNuevoAnticipoCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AnticipoCliente anticipoclienteAux:this.anticipoclientes) {
				if(anticipoclienteAux.getId().equals(this.iIdNuevoAnticipoCliente)) {
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
	
	public int getIndiceActualAnticipoCliente(AnticipoCliente anticipocliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AnticipoCliente anticipoclienteAux:this.anticipoclienteLogic.getAnticipoClientes()) {
				if(anticipoclienteAux.getId().equals(anticipocliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AnticipoCliente anticipoclienteAux:this.anticipoclientes) {
				if(anticipoclienteAux.getId().equals(anticipocliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAnticipoCliente(AnticipoCliente anticipoclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AnticipoCliente anticipoclienteAux:this.anticipoclienteLogic.getAnticipoClientes()) {
				if(anticipoclienteAux.getAnticipoClienteOriginal().getId().equals(anticipoclienteOriginal.getId())) {
					existe=true;
					anticipoclienteOriginal.setId(anticipoclienteAux.getId());
					anticipoclienteOriginal.setVersionRow(anticipoclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AnticipoCliente anticipoclienteAux:this.anticipoclientes) {
				if(anticipoclienteAux.getAnticipoClienteOriginal().getId().equals(anticipoclienteOriginal.getId())) {
					existe=true;
					anticipoclienteOriginal.setId(anticipoclienteAux.getId());
					anticipoclienteOriginal.setVersionRow(anticipoclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAnticipoCliente(Boolean esParaCancelar) throws Exception {
		anticipoclientesAux=new ArrayList<AnticipoCliente>();
		anticipoclienteAux=new AnticipoCliente();
		
		if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AnticipoCliente anticipoclienteAux:this.anticipoclienteLogic.getAnticipoClientes()) {
					if(anticipoclienteAux.getId()<0) {
						anticipoclientesAux.add(anticipoclienteAux);
					}		
				}
				this.iIdNuevoAnticipoCliente=0L;
				this.anticipoclienteLogic.getAnticipoClientes().removeAll(anticipoclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AnticipoCliente anticipoclienteAux:this.anticipoclientes) {
					if(anticipoclienteAux.getId()<0) {
						anticipoclientesAux.add(anticipoclienteAux);
					}		
				}
				this.iIdNuevoAnticipoCliente=0L;
				this.anticipoclientes.removeAll(anticipoclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAnticipoCliente 
					&& this.anticipoclienteLogic.getAnticipoClientes().size()>0
					) {
					anticipoclienteAux=this.anticipoclienteLogic.getAnticipoClientes().get(this.anticipoclienteLogic.getAnticipoClientes().size() - 1);
				
					if(anticipoclienteAux.getId()<0) {
						this.anticipoclienteLogic.getAnticipoClientes().remove(anticipoclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAnticipoCliente && this.anticipoclientes.size()>0) {
					anticipoclienteAux=this.anticipoclientes.get(this.anticipoclientes.size() - 1);
				
					if(anticipoclienteAux.getId()<0) {
						this.anticipoclientes.remove(anticipoclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAnticipoCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(anticipocliente.getId()<0) {
				this.anticipoclienteLogic.getAnticipoClientes().remove(this.anticipocliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(anticipocliente.getId()<0) {
				this.anticipoclientes.remove(this.anticipocliente);
			}
		}			
	}
	
	public void setEstadosInicialesAnticipoCliente(List<AnticipoCliente> anticipoclientesAux) throws Exception {
		AnticipoClienteConstantesFunciones.setEstadosInicialesAnticipoCliente(anticipoclientesAux);
	}
	
	public void setEstadosInicialesAnticipoCliente(AnticipoCliente anticipoclienteAux) throws Exception {
		AnticipoClienteConstantesFunciones.setEstadosInicialesAnticipoCliente(anticipoclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAnticipoClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAnticipoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAnticipoClienteActual()) {
				if(!this.isEsNuevoAnticipoCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAnticipoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAnticipoCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAnticipoClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Anticipo Cliente ?", "MANTENIMIENTO DE Anticipo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAnticipoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(AnticipoCliente anticipocliente) throws Exception {
		AnticipoClienteConstantesFunciones.seleccionarAsignar(this.anticipocliente,anticipocliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAnticipoCliente=this.isPermisoActualizarOriginalAnticipoCliente;
			
			
			this.seleccionarAsignar(anticipocliente);
			
			

			idEmpleadoActual=anticipocliente.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AnticipoClienteConstantesFunciones.quitarEspaciosAnticipoCliente(this.anticipocliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesAnticipoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.anticipoclienteSessionBean.setsFuncionBusquedaRapida(this.anticipoclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoAnticipoCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAnticipoCliente(esParaCancelar);				
				this.cancelarNuevoAnticipoCliente(esParaCancelar);								
			}
			
			this.anticipocliente=new AnticipoCliente();
			
			this.inicializarAnticipoCliente();
			
			this.actualizarEstadoCeldasBotonesAnticipoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAnticipoCliente() throws Exception {
		try {
			AnticipoClienteConstantesFunciones.inicializarAnticipoCliente(this.anticipocliente);
			
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
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.anticipoclienteLogic.getAnticipoClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAnticipoClientes(String sAccionBusqueda,List<AnticipoCliente> anticipoclientesParaReportes) throws Exception {
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
					sPathReporteFinal="AnticipoCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AnticipoClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AnticipoClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="AnticipoCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Anticipo Clientes");		
		parameters.put("busquedapor", AnticipoClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAnticipoCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AnticipoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AnticipoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAnticipoCliente=new JRBeanArrayDataSource(AnticipoClienteJInternalFrame.TraerAnticipoClienteBeans(anticipoclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAnticipoCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AnticipoClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AnticipoClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AnticipoClienteBean.TraerAnticipoClienteBeans(anticipoclientesParaReportes).toArray()));
							
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
				this.generarExcelReporteAnticipoClientes(sAccionBusqueda,sTipoArchivoReporte,anticipoclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAnticipoClientes(sAccionBusqueda,sTipoArchivoReporte,anticipoclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAnticipoClienteActionPerformed(null);
					//this.generarExcelReporteAnticipoClientes(sAccionBusqueda,sTipoArchivoReporte,anticipoclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAnticipoClientes(sAccionBusqueda,sTipoArchivoReporte,anticipoclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAnticipoClientes(sAccionBusqueda,sTipoArchivoReporte,anticipoclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAnticipoClientes(sAccionBusqueda,sTipoArchivoReporte,anticipoclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAnticipoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<AnticipoCliente> anticipoclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anticipocliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AnticipoClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAnticipoCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(AnticipoCliente anticipocliente : anticipoclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AnticipoClienteConstantesFunciones.generarExcelReporteDataAnticipoCliente("NORMAL",row,workbook,anticipocliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anticipo Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAnticipoCliente(String sTipo,Row row,Workbook workbook) {
		
		AnticipoClienteConstantesFunciones.generarExcelReporteHeaderAnticipoCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAnticipoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<AnticipoCliente> anticipoclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anticipocliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AnticipoClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(AnticipoCliente anticipocliente : anticipoclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AnticipoClienteConstantesFunciones.getAnticipoClienteDescripcion(anticipocliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_IDESTADOANTICLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_IDESTADOANTICLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.getestadoanticliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.gettipogrupoformapago_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_VALORADICIONAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_VALORADICIONAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.getvalor_adicional());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_VALORPRESTAMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_VALORPRESTAMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.getvalor_prestamo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_INGRESO1))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_INGRESO1);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.getingreso1());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_INGRESO2))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_INGRESO2);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.getingreso2());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_INGRESO3))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_INGRESO3);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.getingreso3());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_INGRESO4))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_INGRESO4);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.getingreso4());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_INGRESO5))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_INGRESO5);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.getingreso5());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO1))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO1);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.getdescuento1());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO2))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO2);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.getdescuento2());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO3))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO3);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.getdescuento3());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO4))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO4);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.getdescuento4());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO5))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO5);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.getdescuento5());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_TIPOINGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_TIPOINGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.gettipo_ingreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnticipoClienteConstantesFunciones.LABEL_TIPODESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_TIPODESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anticipocliente.gettipo_descuento());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anticipo Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAnticipoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<AnticipoCliente> anticipoclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<AnticipoCliente> anticipoclientesRespaldo=null;
		
		classes=AnticipoClienteConstantesFunciones.getClassesRelationshipsOfAnticipoCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.anticipoclienteLogic.setDatosCliente(this.datosCliente);
		this.anticipoclienteLogic.setDatosDeep(this.datosDeep);
		this.anticipoclienteLogic.setIsConDeep(true);
		
		anticipoclientesRespaldo=this.anticipoclienteLogic.getAnticipoClientes();
		
		this.anticipoclienteLogic.setAnticipoClientes(anticipoclientesParaReportes);	
		this.anticipoclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		anticipoclientesParaReportes=this.anticipoclienteLogic.getAnticipoClientes();
		this.anticipoclienteLogic.setAnticipoClientes(anticipoclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anticipocliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AnticipoClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAnticipoCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(AnticipoCliente anticipocliente : anticipoclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAnticipoCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AnticipoClienteConstantesFunciones.generarExcelReporteDataAnticipoCliente("NORMAL",row,workbook,anticipocliente,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(AnticipoClienteConstantesFunciones.getAnticipoClienteDescripcion(anticipocliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anticipo Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAnticipoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAnticipoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAnticipoCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAnticipoCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAnticipoCliente() throws Exception {		
		this.startProcessAnticipoCliente(true);
	}
	
	public void startProcessAnticipoCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasAnticipoCliente ,this.jPanelParametrosReportesAnticipoCliente, this.jScrollPanelDatosAnticipoCliente,this.jPanelPaginacionAnticipoCliente, this.jScrollPanelDatosEdicionAnticipoCliente, this.jPanelAccionesAnticipoCliente,this.jPanelAccionesFormularioAnticipoCliente,this.jmenuBarAnticipoCliente,this.jmenuBarDetalleAnticipoCliente,this.jTtoolBarAnticipoCliente,this.jTtoolBarDetalleAnticipoCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasAnticipoCliente=this.jTabbedPaneBusquedasAnticipoCliente; 
		
		final JPanel jPanelParametrosReportesAnticipoCliente=this.jPanelParametrosReportesAnticipoCliente;
		//final JScrollPane jScrollPanelDatosAnticipoCliente=this.jScrollPanelDatosAnticipoCliente;
		final JTable jTableDatosAnticipoCliente=this.jTableDatosAnticipoCliente;		
		final JPanel jPanelPaginacionAnticipoCliente=this.jPanelPaginacionAnticipoCliente;
		//final JScrollPane jScrollPanelDatosEdicionAnticipoCliente=this.jScrollPanelDatosEdicionAnticipoCliente;
		final JPanel jPanelAccionesAnticipoCliente=this.jPanelAccionesAnticipoCliente;
		
		JPanel jPanelCamposAuxiliarAnticipoCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAnticipoCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
			jPanelCamposAuxiliarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jPanelCamposAnticipoCliente;
			jPanelAccionesFormularioAuxiliarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jPanelAccionesFormularioAnticipoCliente;
		}
		
		final JPanel jPanelCamposAnticipoCliente=jPanelCamposAuxiliarAnticipoCliente;
		final JPanel jPanelAccionesFormularioAnticipoCliente=jPanelAccionesFormularioAuxiliarAnticipoCliente;
		
		
		final JMenuBar jmenuBarAnticipoCliente=this.jmenuBarAnticipoCliente;
		final JToolBar jTtoolBarAnticipoCliente=this.jTtoolBarAnticipoCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAnticipoCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAnticipoCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
			jmenuBarDetalleAuxiliarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jmenuBarDetalleAnticipoCliente;
			jTtoolBarDetalleAuxiliarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jTtoolBarDetalleAnticipoCliente;
		}
		
		final JMenuBar jmenuBarDetalleAnticipoCliente=jmenuBarDetalleAuxiliarAnticipoCliente;
		final JToolBar jTtoolBarDetalleAnticipoCliente=jTtoolBarDetalleAuxiliarAnticipoCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAnticipoCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAnticipoCliente;
			processRunnable.jTableDatos=jTableDatosAnticipoCliente;
			processRunnable.jPanelCampos=jPanelCamposAnticipoCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionAnticipoCliente;
			processRunnable.jPanelAcciones=jPanelAccionesAnticipoCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAnticipoCliente;
			
			
			processRunnable.jmenuBar=jmenuBarAnticipoCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAnticipoCliente;
			processRunnable.jTtoolBar=jTtoolBarAnticipoCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAnticipoCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAnticipoCliente ,jPanelParametrosReportesAnticipoCliente,jTableDatosAnticipoCliente, /*jScrollPanelDatosAnticipoCliente,*/jPanelCamposAnticipoCliente,jPanelPaginacionAnticipoCliente, /*jScrollPanelDatosEdicionAnticipoCliente,*/ jPanelAccionesAnticipoCliente,jPanelAccionesFormularioAnticipoCliente,jmenuBarAnticipoCliente,jmenuBarDetalleAnticipoCliente,jTtoolBarAnticipoCliente,jTtoolBarDetalleAnticipoCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAnticipoCliente ,jPanelParametrosReportesAnticipoCliente, jScrollPanelDatosAnticipoCliente,jPanelPaginacionAnticipoCliente, jScrollPanelDatosEdicionAnticipoCliente, jPanelAccionesAnticipoCliente,jPanelAccionesFormularioAnticipoCliente,jmenuBarAnticipoCliente,jmenuBarDetalleAnticipoCliente,jTtoolBarAnticipoCliente,jTtoolBarDetalleAnticipoCliente);
						
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
	
	public void finishProcessAnticipoCliente() {// throws Exception 
		this.finishProcessAnticipoCliente(true);
	}
	
	public void finishProcessAnticipoCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasAnticipoCliente ,this.jPanelParametrosReportesAnticipoCliente, this.jScrollPanelDatosAnticipoCliente,this.jPanelPaginacionAnticipoCliente, this.jScrollPanelDatosEdicionAnticipoCliente, this.jPanelAccionesAnticipoCliente,this.jPanelAccionesFormularioAnticipoCliente,this.jmenuBarAnticipoCliente,this.jmenuBarDetalleAnticipoCliente,this.jTtoolBarAnticipoCliente,this.jTtoolBarDetalleAnticipoCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasAnticipoCliente=this.jTabbedPaneBusquedasAnticipoCliente; 
		
		final JPanel jPanelParametrosReportesAnticipoCliente=this.jPanelParametrosReportesAnticipoCliente;
		//final JScrollPane jScrollPanelDatosAnticipoCliente=this.jScrollPanelDatosAnticipoCliente;
		final JTable jTableDatosAnticipoCliente=this.jTableDatosAnticipoCliente;		
		final JPanel jPanelPaginacionAnticipoCliente=this.jPanelPaginacionAnticipoCliente;
		//final JScrollPane jScrollPanelDatosEdicionAnticipoCliente=this.jScrollPanelDatosEdicionAnticipoCliente;
		final JPanel jPanelAccionesAnticipoCliente=this.jPanelAccionesAnticipoCliente;
		
		JPanel jPanelCamposAuxiliarAnticipoCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAnticipoCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
			jPanelCamposAuxiliarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jPanelCamposAnticipoCliente;
			jPanelAccionesFormularioAuxiliarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jPanelAccionesFormularioAnticipoCliente;
		}
		
		final JPanel jPanelCamposAnticipoCliente=jPanelCamposAuxiliarAnticipoCliente;
		final JPanel jPanelAccionesFormularioAnticipoCliente=jPanelAccionesFormularioAuxiliarAnticipoCliente;
		
		
		final JMenuBar jmenuBarAnticipoCliente=this.jmenuBarAnticipoCliente;		
		final JToolBar jTtoolBarAnticipoCliente=this.jTtoolBarAnticipoCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarAnticipoCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAnticipoCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
			jmenuBarDetalleAuxiliarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jmenuBarDetalleAnticipoCliente;
			jTtoolBarDetalleAuxiliarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jTtoolBarDetalleAnticipoCliente;		
		}
		
		final JMenuBar jmenuBarDetalleAnticipoCliente=jmenuBarDetalleAuxiliarAnticipoCliente;
		final JToolBar jTtoolBarDetalleAnticipoCliente=jTtoolBarDetalleAuxiliarAnticipoCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAnticipoCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAnticipoCliente;
			processRunnable.jTableDatos=jTableDatosAnticipoCliente;
			processRunnable.jPanelCampos=jPanelCamposAnticipoCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionAnticipoCliente;
			processRunnable.jPanelAcciones=jPanelAccionesAnticipoCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAnticipoCliente;
			
			
			processRunnable.jmenuBar=jmenuBarAnticipoCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAnticipoCliente;
			processRunnable.jTtoolBar=jTtoolBarAnticipoCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAnticipoCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAnticipoCliente ,jPanelParametrosReportesAnticipoCliente, jTableDatosAnticipoCliente,/*jScrollPanelDatosAnticipoCliente,*/jPanelCamposAnticipoCliente,jPanelPaginacionAnticipoCliente, /*jScrollPanelDatosEdicionAnticipoCliente,*/ jPanelAccionesAnticipoCliente,jPanelAccionesFormularioAnticipoCliente,jmenuBarAnticipoCliente,jmenuBarDetalleAnticipoCliente,jTtoolBarAnticipoCliente,jTtoolBarDetalleAnticipoCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAnticipoCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAnticipoCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAnticipoCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAnticipoCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAnticipoCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAnticipoCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAnticipoCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAnticipoCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAnticipoCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.anticipoclienteConstantesFunciones.getsFinalQueryAnticipoCliente();
		String  finalQueryPaginacionTodos=this.anticipoclienteConstantesFunciones.getsFinalQueryAnticipoCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AnticipoClienteConstantesFunciones.getArrayColumnasGlobalesNoAnticipoCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AnticipoClienteConstantesFunciones.getArrayColumnasGlobalesAnticipoCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AnticipoClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.anticipoclientesEliminados= new ArrayList<AnticipoCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAnticipoCliente();
		
				///*AnticipoClienteSessionBean*/this.anticipoclienteSessionBean=new AnticipoClienteSessionBean();
			
			if(this.anticipoclienteSessionBean==null) {
				this.anticipoclienteSessionBean=new AnticipoClienteSessionBean();
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
					this.iNumeroPaginacion=AnticipoClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AnticipoClienteConstantesFunciones.getClassesForeignKeysOfAnticipoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/anticipocliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			anticipoclientesAux= new ArrayList<AnticipoCliente>();
			
				
			anticipoclienteLogic.setDatosCliente(this.datosCliente);
			anticipoclienteLogic.setDatosDeep(this.datosDeep);
			anticipoclienteLogic.setIsConDeep(true);
			
			
			anticipoclienteLogic.getAnticipoClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					anticipoclienteLogic.getTodosAnticipoClientes(finalQueryGlobal,pagination);
					
					//anticipoclienteLogic.getTodosAnticipoClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(anticipoclienteLogic.getAnticipoClientes()==null|| anticipoclienteLogic.getAnticipoClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							anticipoclientesAux= new ArrayList<AnticipoCliente>();
							anticipoclientesAux.addAll(anticipoclienteLogic.getAnticipoClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							anticipoclientesAux= new ArrayList<AnticipoCliente>();
							anticipoclientesAux.addAll(anticipoclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							anticipoclienteLogic.getTodosAnticipoClientes(finalQueryGlobal+"",this.pagination);												
							
							//anticipoclienteLogic.getTodosAnticipoClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteAnticipoClientes("Todos",anticipoclienteLogic.getAnticipoClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							anticipoclienteLogic.setAnticipoClientes(new ArrayList<AnticipoCliente>());					
							anticipoclienteLogic.getAnticipoClientes().addAll(anticipoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							anticipoclientes=new ArrayList<AnticipoCliente>();
							anticipoclientes.addAll(anticipoclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idAnticipoCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idAnticipoCliente=this.idActual;
				
				} else if(this.idAnticipoClienteActual!=null && this.idAnticipoClienteActual!=0L) {
					idAnticipoCliente=idAnticipoClienteActual;
				}
				
					
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndicePorId(idAnticipoCliente);
				
				this.anticipoclientes=new ArrayList<AnticipoCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					anticipoclienteLogic.getEntity(idAnticipoCliente);
					
					//anticipoclienteLogic.getEntityWithConnection(idAnticipoCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					anticipoclienteLogic.setAnticipoClientes(new ArrayList<AnticipoCliente>());
					anticipoclienteLogic.getAnticipoClientes().add(anticipoclienteLogic.getAnticipoCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.anticipoclientes=new ArrayList<AnticipoCliente>();
					this.anticipoclientes.add(anticipocliente);
				}
				
				if(anticipoclienteLogic.getAnticipoCliente()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					anticipoclienteLogic.getAnticipoClientesFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=anticipoclienteLogic.getAnticipoClientes()==null||anticipoclienteLogic.getAnticipoClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=anticipoclientes==null|| anticipoclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						anticipoclientesAux=new ArrayList<AnticipoCliente>();
						anticipoclientesAux.addAll(anticipoclienteLogic.getAnticipoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							anticipoclientesAux=new ArrayList<AnticipoCliente>();
							anticipoclientesAux.addAll(anticipoclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							anticipoclienteLogic.getAnticipoClientesFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAnticipoClientes("FK_IdEmpleado",anticipoclienteLogic.getAnticipoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAnticipoClientes("FK_IdEmpleado",anticipoclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						anticipoclienteLogic.setAnticipoClientes(new ArrayList<AnticipoCliente>());
						anticipoclienteLogic.getAnticipoClientes().addAll(anticipoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							anticipoclientes=new ArrayList<AnticipoCliente>();
							anticipoclientes.addAll(anticipoclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					anticipoclienteLogic.getAnticipoClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=anticipoclienteLogic.getAnticipoClientes()==null||anticipoclienteLogic.getAnticipoClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=anticipoclientes==null|| anticipoclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						anticipoclientesAux=new ArrayList<AnticipoCliente>();
						anticipoclientesAux.addAll(anticipoclienteLogic.getAnticipoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							anticipoclientesAux=new ArrayList<AnticipoCliente>();
							anticipoclientesAux.addAll(anticipoclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							anticipoclienteLogic.getAnticipoClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAnticipoClientes("FK_IdEmpresa",anticipoclienteLogic.getAnticipoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAnticipoClientes("FK_IdEmpresa",anticipoclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						anticipoclienteLogic.setAnticipoClientes(new ArrayList<AnticipoCliente>());
						anticipoclienteLogic.getAnticipoClientes().addAll(anticipoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							anticipoclientes=new ArrayList<AnticipoCliente>();
							anticipoclientes.addAll(anticipoclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoAntiCliente")) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdEstadoAntiCliente(id_estado_anti_clienteFK_IdEstadoAntiCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					anticipoclienteLogic.getAnticipoClientesFK_IdEstadoAntiCliente(finalQueryGlobal,pagination,id_estado_anti_clienteFK_IdEstadoAntiCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdEstadoAntiCliente(id_estado_anti_clienteFK_IdEstadoAntiCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdEstadoAntiCliente(id_estado_anti_clienteFK_IdEstadoAntiCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=anticipoclienteLogic.getAnticipoClientes()==null||anticipoclienteLogic.getAnticipoClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=anticipoclientes==null|| anticipoclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						anticipoclientesAux=new ArrayList<AnticipoCliente>();
						anticipoclientesAux.addAll(anticipoclienteLogic.getAnticipoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							anticipoclientesAux=new ArrayList<AnticipoCliente>();
							anticipoclientesAux.addAll(anticipoclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							anticipoclienteLogic.getAnticipoClientesFK_IdEstadoAntiCliente(finalQueryGlobal,pagination,id_estado_anti_clienteFK_IdEstadoAntiCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdEstadoAntiCliente(id_estado_anti_clienteFK_IdEstadoAntiCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdEstadoAntiCliente(id_estado_anti_clienteFK_IdEstadoAntiCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAnticipoClientes("FK_IdEstadoAntiCliente",anticipoclienteLogic.getAnticipoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAnticipoClientes("FK_IdEstadoAntiCliente",anticipoclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						anticipoclienteLogic.setAnticipoClientes(new ArrayList<AnticipoCliente>());
						anticipoclienteLogic.getAnticipoClientes().addAll(anticipoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							anticipoclientes=new ArrayList<AnticipoCliente>();
							anticipoclientes.addAll(anticipoclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoGrupoFormaPago")) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdTipoGrupoFormaPago(id_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					anticipoclienteLogic.getAnticipoClientesFK_IdTipoGrupoFormaPago(finalQueryGlobal,pagination,id_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdTipoGrupoFormaPago(id_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdTipoGrupoFormaPago(id_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=anticipoclienteLogic.getAnticipoClientes()==null||anticipoclienteLogic.getAnticipoClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=anticipoclientes==null|| anticipoclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						anticipoclientesAux=new ArrayList<AnticipoCliente>();
						anticipoclientesAux.addAll(anticipoclienteLogic.getAnticipoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							anticipoclientesAux=new ArrayList<AnticipoCliente>();
							anticipoclientesAux.addAll(anticipoclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							anticipoclienteLogic.getAnticipoClientesFK_IdTipoGrupoFormaPago(finalQueryGlobal,pagination,id_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdTipoGrupoFormaPago(id_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AnticipoClienteConstantesFunciones.getDetalleIndiceFK_IdTipoGrupoFormaPago(id_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAnticipoClientes("FK_IdTipoGrupoFormaPago",anticipoclienteLogic.getAnticipoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAnticipoClientes("FK_IdTipoGrupoFormaPago",anticipoclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						anticipoclienteLogic.setAnticipoClientes(new ArrayList<AnticipoCliente>());
						anticipoclienteLogic.getAnticipoClientes().addAll(anticipoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							anticipoclientes=new ArrayList<AnticipoCliente>();
							anticipoclientes.addAll(anticipoclientesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAnticipoCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAnticipoCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=anticipoclienteLogic.getAnticipoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=anticipoclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=anticipoclienteLogic.getAnticipoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=anticipoclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(AnticipoCliente anticipocliente) {
		Boolean permite=true;
		
		if(this.anticipocliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AnticipoClienteConstantesFunciones.getOrderByListaAnticipoCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AnticipoClienteConstantesFunciones.getOrderByListaAnticipoCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AnticipoCliente anticipocliente:anticipoclienteLogic.getAnticipoClientes()) {
				if(anticipocliente.getsType().equals(Constantes2.S_TOTALES)) {
					anticipoclienteTotales=anticipocliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AnticipoCliente anticipocliente:this.anticipoclientes) {
				if(anticipocliente.getsType().equals(Constantes2.S_TOTALES)) {
					anticipoclienteTotales=anticipocliente;
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
			this.anticipoclienteAux=new AnticipoCliente();
			this.anticipoclienteAux.setsType(Constantes2.S_TOTALES);
			this.anticipoclienteAux.setIsNew(false);
			this.anticipoclienteAux.setIsChanged(false);
			this.anticipoclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				AnticipoClienteConstantesFunciones.TotalizarValoresFilaAnticipoCliente(this.anticipoclienteLogic.getAnticipoClientes(),this.anticipoclienteAux);
				
				this.anticipoclienteLogic.getAnticipoClientes().add(this.anticipoclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AnticipoClienteConstantesFunciones.TotalizarValoresFilaAnticipoCliente(this.anticipoclientes,this.anticipoclienteAux);
				
				this.anticipoclientes.add(this.anticipoclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		anticipoclienteTotales=new AnticipoCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.anticipoclienteLogic.getAnticipoClientes().remove(anticipoclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.anticipoclientes.remove(anticipoclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		anticipoclienteTotales=new AnticipoCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AnticipoCliente anticipocliente:anticipoclienteLogic.getAnticipoClientes()) {
				if(anticipocliente.getsType().equals(Constantes2.S_TOTALES)) {
					anticipoclienteTotales=anticipocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AnticipoClienteConstantesFunciones.TotalizarValoresFilaAnticipoCliente(this.anticipoclienteLogic.getAnticipoClientes(),anticipoclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AnticipoCliente anticipocliente:this.anticipoclientes) {
				if(anticipocliente.getsType().equals(Constantes2.S_TOTALES)) {
					anticipoclienteTotales=anticipocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AnticipoClienteConstantesFunciones.TotalizarValoresFilaAnticipoCliente(this.anticipoclientes,anticipoclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAnticipoClientesFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAnticipoClientesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAnticipoClientesFK_IdEstadoAntiCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoAntiCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAnticipoClientesFK_IdTipoGrupoFormaPago()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoGrupoFormaPago";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAnticipoClientesFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					anticipoclienteLogic.getAnticipoClientesFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAnticipoClientesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					anticipoclienteLogic.getAnticipoClientesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAnticipoClientesFK_IdEstadoAntiCliente(String sFinalQuery,Long id_estado_anti_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					anticipoclienteLogic.getAnticipoClientesFK_IdEstadoAntiCliente(sFinalQuery,this.pagination,id_estado_anti_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAnticipoClientesFK_IdTipoGrupoFormaPago(String sFinalQuery,Long id_tipo_grupo_forma_pago)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					anticipoclienteLogic.getAnticipoClientesFK_IdTipoGrupoFormaPago(sFinalQuery,this.pagination,id_tipo_grupo_forma_pago);
				
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
	
	public void inicializarPermisosAnticipoCliente() {
		this.isPermisoTodoAnticipoCliente=false;
		this.isPermisoNuevoAnticipoCliente=false;
		this.isPermisoActualizarAnticipoCliente=false;
		this.isPermisoActualizarOriginalAnticipoCliente=false;
		this.isPermisoEliminarAnticipoCliente=false;
		this.isPermisoGuardarCambiosAnticipoCliente=false;
		this.isPermisoConsultaAnticipoCliente=false;
		this.isPermisoBusquedaAnticipoCliente=false;
		this.isPermisoReporteAnticipoCliente=false;		
		this.isPermisoOrdenAnticipoCliente=false;		
		this.isPermisoPaginacionMedioAnticipoCliente=false;		
		this.isPermisoPaginacionAltoAnticipoCliente=false;
		this.isPermisoPaginacionTodoAnticipoCliente=false;
		this.isPermisoCopiarAnticipoCliente=false;		
		this.isPermisoVerFormAnticipoCliente=false;		
		this.isPermisoDuplicarAnticipoCliente=false;		
		this.isPermisoOrdenAnticipoCliente=false;		
	}
	
	public void setPermisosUsuarioAnticipoCliente(Boolean isPermiso) {
		this.isPermisoTodoAnticipoCliente=isPermiso;
		this.isPermisoNuevoAnticipoCliente=isPermiso;
		this.isPermisoActualizarAnticipoCliente=isPermiso;
		this.isPermisoActualizarOriginalAnticipoCliente=isPermiso;
		this.isPermisoEliminarAnticipoCliente=isPermiso;
		this.isPermisoGuardarCambiosAnticipoCliente=isPermiso;
		this.isPermisoConsultaAnticipoCliente=isPermiso;
		this.isPermisoBusquedaAnticipoCliente=isPermiso;
		this.isPermisoReporteAnticipoCliente=isPermiso;
		this.isPermisoOrdenAnticipoCliente=isPermiso;		
		this.isPermisoPaginacionMedioAnticipoCliente=isPermiso;		
		this.isPermisoPaginacionAltoAnticipoCliente=isPermiso;		
		this.isPermisoPaginacionTodoAnticipoCliente=isPermiso;		
		this.isPermisoCopiarAnticipoCliente=isPermiso;		
		this.isPermisoVerFormAnticipoCliente=isPermiso;		
		this.isPermisoDuplicarAnticipoCliente=isPermiso;
		this.isPermisoOrdenAnticipoCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAnticipoCliente(Boolean isPermiso) {
		//this.isPermisoTodoAnticipoCliente=isPermiso;
		this.isPermisoNuevoAnticipoCliente=isPermiso;
		this.isPermisoActualizarAnticipoCliente=isPermiso;
		this.isPermisoActualizarOriginalAnticipoCliente=isPermiso;
		this.isPermisoEliminarAnticipoCliente=isPermiso;
		this.isPermisoGuardarCambiosAnticipoCliente=isPermiso;
		//this.isPermisoConsultaAnticipoCliente=isPermiso;
		//this.isPermisoBusquedaAnticipoCliente=isPermiso;
		//this.isPermisoReporteAnticipoCliente=isPermiso;
		//this.isPermisoOrdenAnticipoCliente=isPermiso;		
		//this.isPermisoPaginacionMedioAnticipoCliente=isPermiso;		
		//this.isPermisoPaginacionAltoAnticipoCliente=isPermiso;		
		//this.isPermisoPaginacionTodoAnticipoCliente=isPermiso;		
		//this.isPermisoCopiarAnticipoCliente=isPermiso;		
		//this.isPermisoDuplicarAnticipoCliente=isPermiso;
		//this.isPermisoOrdenAnticipoCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAnticipoClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(AnticipoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebAnticipoCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAnticipoClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioAnticipoClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAnticipoClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAnticipoClienteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioAnticipoCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AnticipoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AnticipoClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAnticipoCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAnticipoCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAnticipoCliente=this.isPermisoActualizarAnticipoCliente;
			this.isPermisoEliminarAnticipoCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAnticipoCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAnticipoCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAnticipoCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAnticipoCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAnticipoCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAnticipoCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAnticipoCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAnticipoCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAnticipoCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAnticipoCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAnticipoCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAnticipoCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAnticipoCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAnticipoCliente.setToolTipText(this.jTableDatosAnticipoCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAnticipoCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAnticipoCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AnticipoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AnticipoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAnticipoCliente() throws Exception {
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
	public void inicializarCombosForeignKeyAnticipoClienteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.estadoanticlientesForeignKey=new ArrayList();
				this.tipogrupoformapagosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAnticipoClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AnticipoClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyAnticipoClienteListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoAntiClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoGrupoFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEstadoAntiClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadoanticlientesForeignKey==null||this.estadoanticlientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoAntiClienteConstantesFunciones.getArrayColumnasGlobalesEstadoAntiCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoAntiClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoAntiClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoAntiClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoGrupoFormaPagoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipogrupoformapagosForeignKey==null||this.tipogrupoformapagosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoGrupoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoGrupoFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGrupoFormaPagoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoGrupoFormaPagoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoGrupoFormaPagosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyAnticipoClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			AnticipoClienteParameterReturnGeneral anticipoclienteReturnGeneral=new AnticipoClienteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.anticipoclienteConstantesFunciones.cargarid_empresaAnticipoCliente)
					 || (this.esRecargarFks && this.anticipoclienteConstantesFunciones.cargarid_empresaAnticipoCliente)) {

					if(!this.anticipoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+anticipoclienteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.anticipoclienteConstantesFunciones.cargarid_empleadoAnticipoCliente)
					 || (this.esRecargarFks && this.anticipoclienteConstantesFunciones.cargarid_empleadoAnticipoCliente)) {

					if(!this.anticipoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+anticipoclienteSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalEstadoAntiCliente="";

				if(((this.estadoanticlientesForeignKey==null||this.estadoanticlientesForeignKey.size()<=0) && this.anticipoclienteConstantesFunciones.cargarid_estado_anti_clienteAnticipoCliente)
					 || (this.esRecargarFks && this.anticipoclienteConstantesFunciones.cargarid_estado_anti_clienteAnticipoCliente)) {

					if(!this.anticipoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEstadoAntiCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoAntiClienteConstantesFunciones.getArrayColumnasGlobalesEstadoAntiCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoAntiCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoAntiClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoAntiCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoAntiCliente, "");
						finalQueryGlobalEstadoAntiCliente+=EstadoAntiClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoAntiClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoAntiCliente=" WHERE " + ConstantesSql.ID + "="+anticipoclienteSessionBean.getlidEstadoAntiClienteActual();
					}
				} else {
					finalQueryGlobalEstadoAntiCliente="NONE";
				}


				String finalQueryGlobalTipoGrupoFormaPago="";

				if(((this.tipogrupoformapagosForeignKey==null||this.tipogrupoformapagosForeignKey.size()<=0) && this.anticipoclienteConstantesFunciones.cargarid_tipo_grupo_forma_pagoAnticipoCliente)
					 || (this.esRecargarFks && this.anticipoclienteConstantesFunciones.cargarid_tipo_grupo_forma_pagoAnticipoCliente)) {

					if(!this.anticipoclienteSessionBean.getisBusquedaDesdeForeignKeySesionTipoGrupoFormaPago()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoGrupoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoGrupoFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoGrupoFormaPago=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGrupoFormaPagoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoGrupoFormaPago=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoGrupoFormaPago, "");
						finalQueryGlobalTipoGrupoFormaPago+=TipoGrupoFormaPagoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoGrupoFormaPagosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoGrupoFormaPago=" WHERE " + ConstantesSql.ID + "="+anticipoclienteSessionBean.getlidTipoGrupoFormaPagoActual();
					}
				} else {
					finalQueryGlobalTipoGrupoFormaPago="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				anticipoclienteReturnGeneral=anticipoclienteLogic.cargarCombosLoteForeignKeyAnticipoCliente(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalEstadoAntiCliente,finalQueryGlobalTipoGrupoFormaPago);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=anticipoclienteReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=anticipoclienteReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalEstadoAntiCliente.equals("NONE")) {
				this.estadoanticlientesForeignKey=anticipoclienteReturnGeneral.getestadoanticlientesForeignKey();
			}

			if(!finalQueryGlobalTipoGrupoFormaPago.equals("NONE")) {
				this.tipogrupoformapagosForeignKey=anticipoclienteReturnGeneral.gettipogrupoformapagosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyAnticipoCliente()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyEstadoAntiCliente();
			this.addItemDefectoCombosForeignKeyTipoGrupoFormaPago();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.anticipoclienteSessionBean==null) {
				this.anticipoclienteSessionBean=new AnticipoClienteSessionBean();
			}

			if(!this.anticipoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.anticipoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyEstadoAntiCliente()throws Exception {
		try {

			if(!this.anticipoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEstadoAntiCliente()) {
				EstadoAntiCliente estadoanticliente=new EstadoAntiCliente();
				EstadoAntiClienteConstantesFunciones.setEstadoAntiClienteDescripcion(estadoanticliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadoanticliente.setId(null);

				if(!EstadoAntiClienteConstantesFunciones.ExisteEnLista(this.estadoanticlientesForeignKey,estadoanticliente,true)) {

					this.estadoanticlientesForeignKey.add(0,estadoanticliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoGrupoFormaPago()throws Exception {
		try {

			if(!this.anticipoclienteSessionBean.getisBusquedaDesdeForeignKeySesionTipoGrupoFormaPago()) {
				TipoGrupoFormaPago tipogrupoformapago=new TipoGrupoFormaPago();
				TipoGrupoFormaPagoConstantesFunciones.setTipoGrupoFormaPagoDescripcion(tipogrupoformapago,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipogrupoformapago.setId(null);

				if(!TipoGrupoFormaPagoConstantesFunciones.ExisteEnLista(this.tipogrupoformapagosForeignKey,tipogrupoformapago,true)) {

					this.tipogrupoformapagosForeignKey.add(0,tipogrupoformapago);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyAnticipoCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAnticipoCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAnticipoCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.anticipocliente.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAnticipoCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAnticipoCliente(AnticipoCliente anticipocliente)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(anticipocliente.getid_empleado(),false,"Formulario");
			this.setActualEstadoAntiClienteForeignKey(anticipocliente.getid_estado_anti_cliente(),false,"Formulario");
			this.setActualTipoGrupoFormaPagoForeignKey(anticipocliente.getid_tipo_grupo_forma_pago(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAnticipoCliente(AnticipoCliente anticipocliente,String sTipoEvento)throws Exception {	
		try {
			
			

				if(anticipocliente.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoAnticipoCliente")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(anticipocliente.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAnticipoCliente()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.anticipoclienteConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualEstadoAntiClienteForeignKey(this.anticipoclienteConstantesFunciones.getid_estado_anti_cliente(),false,"Formulario");
			this.setActualTipoGrupoFormaPagoForeignKey(this.anticipoclienteConstantesFunciones.getid_tipo_grupo_forma_pago(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAnticipoCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAnticipoCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAnticipoCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAnticipoCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAnticipoCliente()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEstadoAntiClientesForeignKey("Todos");
			this.cargarCombosFrameTipoGrupoFormaPagosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAnticipoCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoAntiClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoGrupoFormaPagosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAnticipoCliente()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empresaAnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empresaAnticipoCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empresaAnticipoCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empleadoAnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empleadoAnticipoCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empleadoAnticipoCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_estado_anti_clienteAnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_estado_anti_clienteAnticipoCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_estado_anti_clienteAnticipoCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public AnticipoClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AnticipoClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AnticipoClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.anticipoclienteSessionBean=new AnticipoClienteSessionBean(); 
		this.anticipoclienteConstantesFunciones=new AnticipoClienteConstantesFunciones(); 
		this.anticipoclienteBean=new AnticipoCliente();//(this.anticipoclienteConstantesFunciones); 		
		this.anticipoclienteReturnGeneral=new AnticipoClienteParameterReturnGeneral(); 
		
		this.anticipoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.anticipoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AnticipoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AnticipoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AnticipoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAnticipoCliente(true);
			
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
			
			this.anticipoclienteConstantesFunciones=new AnticipoClienteConstantesFunciones(); 
			this.anticipoclienteBean=new AnticipoCliente();//this.anticipoclienteConstantesFunciones); 			
			this.anticipoclienteReturnGeneral=new AnticipoClienteParameterReturnGeneral(); 
		
			AnticipoClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Anticipo Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.anticipocliente=new AnticipoCliente();
			this.anticipoclientes = new ArrayList<AnticipoCliente>();
			this.anticipoclientesAux = new ArrayList<AnticipoCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic=new AnticipoClienteLogic();
				this.anticipoclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.anticipoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.anticipoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAnticipoCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAnticipoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAnticipoCliente);	
					}
					
					if(this.jInternalFrameImportacionAnticipoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAnticipoCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAnticipoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAnticipoCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAnticipoCliente);
				this.jInternalFrameDetalleFormAnticipoCliente.setVisible(false);
				this.jInternalFrameDetalleFormAnticipoCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAnticipoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAnticipoCliente);
					this.jInternalFrameReporteDinamicoAnticipoCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoAnticipoCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAnticipoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAnticipoCliente);
					this.jInternalFrameImportacionAnticipoCliente.setVisible(false);
					this.jInternalFrameImportacionAnticipoCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAnticipoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAnticipoCliente);
					this.jInternalFrameOrderByAnticipoCliente.setVisible(false);
					this.jInternalFrameOrderByAnticipoCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAnticipoClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AnticipoClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.anticipoclienteReturnGeneral=new AnticipoClienteParameterReturnGeneral();
			
			this.anticipoclienteParameterGeneral=new AnticipoClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.anticipoclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AnticipoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AnticipoClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.anticipoclienteSessionBean.getEsGuardarRelacionado(),this.anticipoclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AnticipoClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.anticipoclienteSessionBean.getEsGuardarRelacionado(),this.anticipoclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAnticipoCliente=false;
			this.isVisibilidadCeldaDuplicarAnticipoCliente=true;
			this.isVisibilidadCeldaCopiarAnticipoCliente=true;
			this.isVisibilidadCeldaVerFormAnticipoCliente=true;
			this.isVisibilidadCeldaOrdenAnticipoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente=false;
			this.isVisibilidadCeldaModificarAnticipoCliente=false;
			this.isVisibilidadCeldaActualizarAnticipoCliente=false;
			this.isVisibilidadCeldaEliminarAnticipoCliente=false;
			this.isVisibilidadCeldaCancelarAnticipoCliente=false;
			this.isVisibilidadCeldaGuardarAnticipoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosAnticipoCliente=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoAntiCliente=true;
			this.isVisibilidadFK_IdTipoGrupoFormaPago=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAnticipoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAnticipoCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAnticipoCliente(false);
			
			this.setPermisosUsuarioAnticipoCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.anticipoclienteSessionBean.getEsGuardarRelacionado() && this.anticipoclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAnticipoClienteClasesRelacionadas();
			}
			
			if(this.anticipoclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAnticipoClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAnticipoCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAnticipoCliente();
			}
			
			if(!this.isPermisoBusquedaAnticipoCliente) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasAnticipoCliente.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioAnticipoCliente,this.isPermisoPaginacionMedioAnticipoCliente,this.isPermisoPaginacionTodoAnticipoCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AnticipoClienteConstantesFunciones.getTiposSeleccionarAnticipoCliente());
				
				this.tiposColumnasSelect=AnticipoClienteConstantesFunciones.getTiposSeleccionarAnticipoCliente(true);
				
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
			//if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAnticipoCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioAnticipoCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioAnticipoCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAnticipoCliente() ;
			
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
			this.empleadoLogic=new EmpleadoLogic();
			this.estadoanticlienteLogic=new EstadoAntiClienteLogic();
			this.tipogrupoformapagoLogic=new TipoGrupoFormaPagoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				anticipoclienteImplementable= (AnticipoClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AnticipoClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				anticipoclienteImplementableHome= (AnticipoClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AnticipoClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.anticipoclientes= new ArrayList<AnticipoCliente>();
			this.anticipoclientesEliminados= new ArrayList<AnticipoCliente>();
						
			this.isEsNuevoAnticipoCliente=false;
			this.esParaAccionDesdeFormularioAnticipoCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.estadoanticlientesForeignKey=new ArrayList<EstadoAntiCliente>() ;
			this.tipogrupoformapagosForeignKey=new ArrayList<TipoGrupoFormaPago>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAnticipoCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAnticipoCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AnticipoClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AnticipoClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAnticipoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAnticipoCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAnticipoCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAnticipoCliente();
			}
			
			AnticipoClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasAnticipoCliente.getTabCount(); i++) {
					this.jTabbedPaneBusquedasAnticipoCliente.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasAnticipoCliente.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAnticipoCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga AnticipoCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAnticipoCliente() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAnticipoCliente")) {
				iIndex=this.jInternalFrameDetalleFormAnticipoCliente.jTabbedPaneRelacionesAnticipoCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAnticipoCliente.jTabbedPaneRelacionesAnticipoCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAnticipoCliente();	
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
	
	public void cargarCombosForeignKeyAnticipoCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAnticipoCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAnticipoCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAnticipoClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAnticipoCliente();
		
		this.cargarCombosFrameForeignKeyAnticipoCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAnticipoCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAnticipoCliente();
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

	public void cargarCombosForeignKeyEstadoAntiCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoAntiClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoAntiCliente();
				this.cargarCombosFrameEstadoAntiClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoAntiCliente(this.estadoanticlientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoGrupoFormaPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoGrupoFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoGrupoFormaPago();
				this.cargarCombosFrameTipoGrupoFormaPagosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoGrupoFormaPago(this.tipogrupoformapagosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoAnticipoClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.anticipoclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAnticipoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
			
			
			if(jTableDatosAnticipoCliente.getRowCount()>=1) {
				jTableDatosAnticipoCliente.removeRowSelectionInterval(0, jTableDatosAnticipoCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoAnticipoCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAnticipoCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAnticipoCliente(true);			
			//this.anticipocliente=new AnticipoCliente();
			//this.anticipocliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAnticipoCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAnticipoCliente() ;
			
			if(AnticipoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAnticipoCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.anticipocliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.anticipocliente);				
			
			AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
			
			if(this.anticipoclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar AnticipoCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAnticipoClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<AnticipoCliente> anticipoclientesSeleccionados=new ArrayList<AnticipoCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAnticipoCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAnticipoCliente.getSelectedRows().length;			
			}
			
			anticipoclientesSeleccionados=this.getAnticipoClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAnticipoCliente--;			
				//AnticipoCliente anticipoclienteAux= new AnticipoCliente();			
				//anticipoclienteAux.setId(this.iIdNuevoAnticipoCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//AnticipoCliente anticipoclienteOrigen=new AnticipoCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(AnticipoCliente anticipoclienteOrigen : anticipoclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							anticipoclienteOrigen =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							anticipoclienteOrigen =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAnticipoCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.anticipocliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAnticipoCliente(anticipoclienteOrigen,this.anticipocliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.anticipoclienteLogic.getAnticipoClientes().add(this.anticipoclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.anticipoclientes.add(this.anticipoclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAnticipoCliente(false);
				
				this.jTableDatosAnticipoCliente.setRowSelectionInterval(this.getIndiceNuevoAnticipoCliente(), this.getIndiceNuevoAnticipoCliente());
				
				int iLastRow =  this.jTableDatosAnticipoCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAnticipoCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAnticipoCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAnticipoCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<AnticipoCliente> anticipoclientesSeleccionados=new ArrayList<AnticipoCliente>();									
		
			AnticipoCliente anticipoclienteOrigen=new AnticipoCliente();
			AnticipoCliente anticipoclienteDestino=new AnticipoCliente();
				
			anticipoclientesSeleccionados=this.getAnticipoClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAnticipoCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || anticipoclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAnticipoCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						anticipoclienteOrigen =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						anticipoclienteOrigen =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						anticipoclienteDestino =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						anticipoclienteDestino =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				anticipoclienteOrigen =anticipoclientesSeleccionados.get(0);
				anticipoclienteDestino =anticipoclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAnticipoCliente(anticipoclienteOrigen,anticipoclienteDestino,true,false);
				
				anticipoclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(anticipoclienteDestino,anticipoclienteLogic.getAnticipoClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(anticipoclienteDestino,anticipoclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAnticipoCliente(false);
				
				//this.jTableDatosAnticipoCliente.setRowSelectionInterval(this.getIndiceNuevoAnticipoCliente(), this.getIndiceNuevoAnticipoCliente());
				
				int iLastRow =  this.jTableDatosAnticipoCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAnticipoCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAnticipoCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAnticipoCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAnticipoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAnticipoCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAnticipoCliente.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasAnticipoCliente.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesAnticipoCliente.setVisible(!isVisible);
			this.jPanelPaginacionAnticipoCliente.setVisible(!isVisible);
			this.jPanelAccionesAnticipoCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAnticipoCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAnticipoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAnticipoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAnticipoCliente();
			
			this.abrirFrameOrderByAnticipoCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAnticipoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAnticipoCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAnticipoCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAnticipoCliente.isMaximum()) {
					this.jInternalFrameDetalleFormAnticipoCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAnticipoCliente.setSize(this.jInternalFrameDetalleFormAnticipoCliente.iWidthFormulario,this.jInternalFrameDetalleFormAnticipoCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAnticipoCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAnticipoCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAnticipoCliente.isMaximum()) {
						this.jInternalFrameDetalleFormAnticipoCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAnticipoCliente.jContentPaneDetalleAnticipoCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAnticipoCliente.jTabbedPaneRelacionesAnticipoCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAnticipoCliente.jContentPaneDetalleAnticipoCliente.getWidth(),AnticipoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAnticipoCliente.jTabbedPaneRelacionesAnticipoCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAnticipoCliente.jContentPaneDetalleAnticipoCliente.getWidth(),AnticipoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAnticipoCliente.jTabbedPaneRelacionesAnticipoCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAnticipoCliente.jContentPaneDetalleAnticipoCliente.getWidth(),AnticipoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAnticipoCliente.setVisible(true);
	        this.jInternalFrameDetalleFormAnticipoCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAnticipoCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAnticipoCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAnticipoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAnticipoCliente,false,this);
				} else {
					this.jInternalFrameOrderByAnticipoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAnticipoCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAnticipoCliente);
				this.jInternalFrameOrderByAnticipoCliente.setVisible(false);
				this.jInternalFrameOrderByAnticipoCliente.setSelected(false);
				
				this.jInternalFrameOrderByAnticipoCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAnticipoCliente"));
				
				this.inicializarActualizarBindingTablaOrderByAnticipoCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAnticipoCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAnticipoCliente==null) {
				
				this.jInternalFrameImportacionAnticipoCliente=new ImportacionJInternalFrame(AnticipoClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAnticipoCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAnticipoCliente);
				this.jInternalFrameImportacionAnticipoCliente.setVisible(false);
				this.jInternalFrameImportacionAnticipoCliente.setSelected(false);


				this.jInternalFrameImportacionAnticipoCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAnticipoCliente"));
				this.jInternalFrameImportacionAnticipoCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAnticipoCliente"));
				this.jInternalFrameImportacionAnticipoCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAnticipoCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAnticipoCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAnticipoCliente==null) {
				this.jInternalFrameReporteDinamicoAnticipoCliente=new ReporteDinamicoJInternalFrame(AnticipoClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAnticipoCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAnticipoCliente);
				this.jInternalFrameReporteDinamicoAnticipoCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoAnticipoCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAnticipoCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAnticipoCliente"));
				this.jInternalFrameReporteDinamicoAnticipoCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAnticipoCliente"));
				this.jInternalFrameReporteDinamicoAnticipoCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAnticipoCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAnticipoCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleAnticipoCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAnticipoCliente);
			
	       	this.jInternalFrameDetalleFormAnticipoCliente.setVisible(false);
	        this.jInternalFrameDetalleFormAnticipoCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormAnticipoCliente.dispose();
			//this.jInternalFrameDetalleFormAnticipoCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAnticipoCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAnticipoCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoAnticipoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAnticipoCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAnticipoCliente.setVisible(true);
	        this.jInternalFrameImportacionAnticipoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAnticipoCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAnticipoCliente.setVisible(true);
	        this.jInternalFrameOrderByAnticipoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAnticipoCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAnticipoCliente.setVisible(false);
	        this.jInternalFrameOrderByAnticipoCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAnticipoCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAnticipoCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoAnticipoCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAnticipoCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAnticipoCliente.setVisible(false);
	        this.jInternalFrameImportacionAnticipoCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAnticipoCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAnticipoCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAnticipoCliente(true);
			//this.isEsNuevoAnticipoCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAnticipoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAnticipoCliente(false) ;
			
			if(anticipoclienteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(AnticipoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAnticipoCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAnticipoCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAnticipoClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAnticipoCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAnticipoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAnticipoCliente(true);
			//this.isEsNuevoAnticipoCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.anticipocliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAnticipoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAnticipoCliente(false) ;
			
			if(AnticipoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAnticipoCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAnticipoCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.anticipoclienteConstantesFunciones.cargarid_empleadoAnticipoCliente) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingAnticipoCliente(false,false);
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
		TableColumn tableColumnEmpleado=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAnticipoCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoAntiCliente(List<EstadoAntiCliente> estadoanticlientesForeignKey)throws Exception{
		TableColumn tableColumnEstadoAntiCliente=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_IDESTADOANTICLIENTE));
		TableCellEditor tableCellEditorEstadoAntiCliente =tableColumnEstadoAntiCliente.getCellEditor();

		EstadoAntiClienteTableCell estadoanticlienteTableCellFk=(EstadoAntiClienteTableCell)tableCellEditorEstadoAntiCliente;

		if(estadoanticlienteTableCellFk!=null) {
			estadoanticlienteTableCellFk.setestadoanticlientesForeignKey(estadoanticlientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAnticipoCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadoanticlienteTableCellFk.setRowActual(intSelectedRow);
			//estadoanticlienteTableCellFk.setestadoanticlientesForeignKeyActual(estadoanticlientesForeignKey);
		//}


		if(estadoanticlienteTableCellFk!=null) {
			estadoanticlienteTableCellFk.RecargarEstadoAntiClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoGrupoFormaPago(List<TipoGrupoFormaPago> tipogrupoformapagosForeignKey)throws Exception{
		TableColumn tableColumnTipoGrupoFormaPago=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO));
		TableCellEditor tableCellEditorTipoGrupoFormaPago =tableColumnTipoGrupoFormaPago.getCellEditor();

		TipoGrupoFormaPagoTableCell tipogrupoformapagoTableCellFk=(TipoGrupoFormaPagoTableCell)tableCellEditorTipoGrupoFormaPago;

		if(tipogrupoformapagoTableCellFk!=null) {
			tipogrupoformapagoTableCellFk.settipogrupoformapagosForeignKey(tipogrupoformapagosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAnticipoCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipogrupoformapagoTableCellFk.setRowActual(intSelectedRow);
			//tipogrupoformapagoTableCellFk.settipogrupoformapagosForeignKeyActual(tipogrupoformapagosForeignKey);
		//}


		if(tipogrupoformapagoTableCellFk!=null) {
			tipogrupoformapagoTableCellFk.RecargarTipoGrupoFormaPagosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAnticipoCliente(false);
			
			//if(!this.isEsNuevoAnticipoCliente) {								
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AnticipoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				
			}
			
			if(this.permiteMantenimiento(this.anticipocliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAnticipoCliente=true;
					this.inicializarActualizarBindingTablaAnticipoCliente(false);
					this.isEsNuevoAnticipoCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAnticipoCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAnticipoCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAnticipoCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAnticipoCliente(false);
				
				this.habilitarDeshabilitarControlesAnticipoCliente(false);
			
												
				
				if(AnticipoClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAnticipoCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAnticipoClienteActionPerformed(evt,anticipoclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAnticipoCliente(this.anticipocliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAnticipoCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,anticipoclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.anticipocliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(AnticipoCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AnticipoCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				this.anticipocliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				this.anticipocliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.anticipocliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AnticipoClienteModel) this.jTableDatosAnticipoCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAnticipoCliente=true;
				this.inicializarActualizarBindingTablaAnticipoCliente(false);
				this.isEsNuevoAnticipoCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAnticipoCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAnticipoCliente(false);
				
				this.habilitarDeshabilitarControlesAnticipoCliente(false);
				
				
				
				if(AnticipoClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAnticipoCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAnticipoCliente.getRowCount()>=1) {
				jTableDatosAnticipoCliente.removeRowSelectionInterval(0, jTableDatosAnticipoCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAnticipoCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAnticipoCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAnticipoCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAnticipoCliente(false) ;
			
			this.isEsNuevoAnticipoCliente=false;
			
			if(AnticipoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAnticipoCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAnticipoCliente(false);
				
				//SI ES MANUAL
				if(AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAnticipoCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAnticipoCliente--;			
			//AnticipoCliente anticipoclienteAux= new AnticipoCliente();			
			//anticipoclienteAux.setId(this.iIdNuevoAnticipoCliente);
			
			if(this.jInternalFrameDetalleFormAnticipoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAnticipoCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
			
			this.anticipocliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.anticipoclienteLogic.getAnticipoClientes().add(this.anticipoclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.anticipoclientes.add(this.anticipoclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAnticipoCliente(false);
			
			this.jTableDatosAnticipoCliente.setRowSelectionInterval(this.getIndiceNuevoAnticipoCliente(), this.getIndiceNuevoAnticipoCliente());
			
			int iLastRow =  this.jTableDatosAnticipoCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAnticipoCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAnticipoCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAnticipoCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAnticipoCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAnticipoCliente(false);
			
			//SI ES MANUAL
			if(AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAnticipoCliente();
			}
			
			//this.abrirFrameTreeAnticipoCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Anticipo ClienteS ?", "MANTENIMIENTO DE Anticipo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionAnticipoCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralAnticipoCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.anticipoclienteReturnGeneral=anticipoclienteLogic.procesarImportacionAnticipoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.anticipoclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarAnticipoClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAnticipoCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAnticipoCliente.setFileImportacion(this.jInternalFrameImportacionAnticipoCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAnticipoCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAnticipoCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAnticipoCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAnticipoCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<AnticipoCliente> anticipoclientesSeleccionados=new ArrayList<AnticipoCliente>();		

		anticipoclientesSeleccionados=this.getAnticipoClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AnticipoClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AnticipoClienteBaseDesign.jrxml";
			
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
			
			this.generarReporteAnticipoClientes("Todos",anticipoclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anticipo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAnticipoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAnticipoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AnticipoClienteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_IDESTADOANTICLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoAntiCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoAntiCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoAntiCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoAntiCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoGrupoFormaPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoGrupoFormaPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoGrupoFormaPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoGrupoFormaPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_VALORADICIONAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorAdicional_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorAdicional_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorAdicional_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorAdicional_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_VALORPRESTAMO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorPrestamo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorPrestamo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorPrestamo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorPrestamo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO1:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_greso1_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_greso1_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_greso1_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_greso1_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO2:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_greso2_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_greso2_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_greso2_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_greso2_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO3:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_greso3_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_greso3_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_greso3_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_greso3_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO4:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_greso4_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_greso4_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_greso4_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_greso4_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO5:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_greso5_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_greso5_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_greso5_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_greso5_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO1:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento1_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento1_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento1_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento1_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO2:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento2_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento2_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento2_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento2_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO3:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento3_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento3_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento3_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento3_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO4:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento4_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento4_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento4_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento4_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO5:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento5_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento5_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento5_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento5_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_TIPOINGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_poIngreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_poIngreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_poIngreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_poIngreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnticipoClienteConstantesFunciones.LABEL_TIPODESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_poDescuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_poDescuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_poDescuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_poDescuento_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoAnticipoCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AnticipoClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_IDESTADOANTICLIENTE:
					sNombreCampoCategoria="id_estado_anti_cliente";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO:
					sNombreCampoCategoria="id_tipo_grupo_forma_pago";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_VALORADICIONAL:
					sNombreCampoCategoria="valor_adicional";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_VALORPRESTAMO:
					sNombreCampoCategoria="valor_prestamo";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO1:
					sNombreCampoCategoria="ingreso1";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO2:
					sNombreCampoCategoria="ingreso2";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO3:
					sNombreCampoCategoria="ingreso3";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO4:
					sNombreCampoCategoria="ingreso4";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO5:
					sNombreCampoCategoria="ingreso5";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO1:
					sNombreCampoCategoria="descuento1";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO2:
					sNombreCampoCategoria="descuento2";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO3:
					sNombreCampoCategoria="descuento3";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO4:
					sNombreCampoCategoria="descuento4";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO5:
					sNombreCampoCategoria="descuento5";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_TIPOINGRESO:
					sNombreCampoCategoria="tipo_ingreso";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_TIPODESCUENTO:
					sNombreCampoCategoria="tipo_descuento";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AnticipoClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_IDESTADOANTICLIENTE:
					sNombreCampoCategoriaValor="id_estado_anti_cliente";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO:
					sNombreCampoCategoriaValor="id_tipo_grupo_forma_pago";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_VALORADICIONAL:
					sNombreCampoCategoriaValor="valor_adicional";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_VALORPRESTAMO:
					sNombreCampoCategoriaValor="valor_prestamo";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO1:
					sNombreCampoCategoriaValor="ingreso1";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO2:
					sNombreCampoCategoriaValor="ingreso2";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO3:
					sNombreCampoCategoriaValor="ingreso3";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO4:
					sNombreCampoCategoriaValor="ingreso4";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO5:
					sNombreCampoCategoriaValor="ingreso5";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO1:
					sNombreCampoCategoriaValor="descuento1";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO2:
					sNombreCampoCategoriaValor="descuento2";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO3:
					sNombreCampoCategoriaValor="descuento3";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO4:
					sNombreCampoCategoriaValor="descuento4";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO5:
					sNombreCampoCategoriaValor="descuento5";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_TIPOINGRESO:
					sNombreCampoCategoriaValor="tipo_ingreso";
					break;

				case AnticipoClienteConstantesFunciones.LABEL_TIPODESCUENTO:
					sNombreCampoCategoriaValor="tipo_descuento";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAnticipoCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAnticipoCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AnticipoClienteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_IDESTADOANTICLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Anti Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_anti_cliente");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Grupo Forma Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_grupo_forma_pago");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_VALORADICIONAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Adicional",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_adicional");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_VALORPRESTAMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Prestamo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_prestamo");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO1:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ingreso1",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ingreso1");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO2:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ingreso2",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ingreso2");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO3:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ingreso3",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ingreso3");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO4:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ingreso4",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ingreso4");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO5:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ingreso5",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ingreso5");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO1:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento1",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento1");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO2:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento2",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento2");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO3:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento3",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento3");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO4:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento4",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento4");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO5:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento5",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento5");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_TIPOINGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Ingreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo_ingreso");
					break;

				case AnticipoClienteConstantesFunciones.LABEL_TIPODESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo_descuento");
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
	
	public void jButtonGenerarExcelReporteDinamicoAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<AnticipoCliente> anticipoclientesSeleccionados=new ArrayList<AnticipoCliente>();		
		
		anticipoclientesSeleccionados=this.getAnticipoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anticipocliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("AnticipoClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAnticipoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAnticipoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AnticipoClienteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_IDESTADOANTICLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_IDESTADOANTICLIENTE);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.getestadoanticliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.gettipogrupoformapago_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_VALORADICIONAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_VALORADICIONAL);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.getvalor_adicional());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_VALORPRESTAMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_VALORPRESTAMO);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.getvalor_prestamo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO1:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_INGRESO1);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.getingreso1());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO2:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_INGRESO2);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.getingreso2());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO3:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_INGRESO3);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.getingreso3());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO4:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_INGRESO4);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.getingreso4());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_INGRESO5:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_INGRESO5);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.getingreso5());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO1:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO1);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.getdescuento1());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO2:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO2);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.getdescuento2());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO3:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO3);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.getdescuento3());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO4:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO4);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.getdescuento4());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_DESCUENTO5:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO5);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.getdescuento5());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_TIPOINGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_TIPOINGRESO);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.gettipo_ingreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnticipoClienteConstantesFunciones.LABEL_TIPODESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_TIPODESCUENTO);
					iRow++;

					for(AnticipoCliente anticipocliente:anticipoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anticipocliente.gettipo_descuento());
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
			//	this.getFilaCabeceraExportarExcelAnticipoCliente(row);				
			//	iRow++;
			//}				
			
			//for(AnticipoCliente anticipoclienteAux:anticipoclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAnticipoCliente(anticipoclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anticipo Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.anticipoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAnticipoCliente(false);
			
			//SI ES MANUAL
			if(AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAnticipoCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAnticipoCliente(false);
			
			//SI ES MANUAL
			if(AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAnticipoCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAnticipoCliente(false);
			
			//SI ES MANUAL
			if(AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAnticipoCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAnticipoCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAnticipoCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAnticipoCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAnticipoCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAnticipoCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAnticipoCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosAnticipoCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosAnticipoCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAnticipoCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAnticipoCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAnticipoCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAnticipoCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAnticipoCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAnticipoCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAnticipoCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAnticipoCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AnticipoClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAnticipoCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAnticipoCliente();
		
		this.inicializarActualizarBindingBotonesManualAnticipoCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAnticipoCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAnticipoCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAnticipoCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAnticipoCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAnticipoCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAnticipoCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAnticipoCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAnticipoCliente.jCheckBoxPostAccionNuevoAnticipoCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAnticipoCliente.jCheckBoxPostAccionSinCerrarAnticipoCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAnticipoCliente.jCheckBoxPostAccionSinMensajeAnticipoCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAnticipoCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAnticipoCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAnticipoCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
				this.jInternalFrameDetalleFormAnticipoCliente.jCheckBoxPostAccionNuevoAnticipoCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAnticipoCliente.jCheckBoxPostAccionSinCerrarAnticipoCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAnticipoCliente.jCheckBoxPostAccionSinMensajeAnticipoCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAnticipoCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAnticipoCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxTiposAccionesFormularioAnticipoCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAnticipoCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAnticipoCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAnticipoCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAnticipoCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAnticipoCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAnticipoCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAnticipoCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAnticipoCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAnticipoCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAnticipoCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAnticipoCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAnticipoCliente() throws Exception {
		try	{
			if(AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAnticipoCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAnticipoCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxTiposAccionesFormularioAnticipoCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxTiposAccionesFormularioAnticipoCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAnticipoCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAnticipoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAnticipoCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAnticipoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAnticipoCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAnticipoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAnticipoCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAnticipoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAnticipoCliente.addItem(reporte);
			}
			
			
			if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAnticipoCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAnticipoCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAnticipoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAnticipoCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAnticipoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAnticipoCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxTiposAccionesFormularioAnticipoCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxTiposAccionesFormularioAnticipoCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAnticipoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAnticipoCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAnticipoCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAnticipoCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAnticipoCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAnticipoCliente!=null) {
				this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAnticipoCliente!=null) {
				this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAnticipoCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoAnticipoCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAnticipoCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAnticipoCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAnticipoCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAnticipoCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAnticipoCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=AnticipoClienteConstantesFunciones.getTiposSeleccionarAnticipoCliente(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=AnticipoClienteConstantesFunciones.getTiposSeleccionarAnticipoCliente(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoAnticipoCliente.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoAnticipoCliente.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=AnticipoClienteConstantesFunciones.getTiposSeleccionarAnticipoCliente(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAnticipoCliente.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoAnticipoCliente.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAnticipoCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente.getSelectedItem()!=null){this.id_estado_anti_clienteFK_IdEstadoAntiCliente=((EstadoAntiCliente)this.jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente.getSelectedItem()!=null){this.id_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago=((TipoGrupoFormaPago)this.jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAnticipoCliente(Boolean esInicializar) throws Exception {				
		if(AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAnticipoCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAnticipoCliente() throws Exception {
		this.inicializarActualizarBindingTablaAnticipoCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAnticipoCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAnticipoCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAnticipoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAnticipoCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAnticipoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAnticipoCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAnticipoClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAnticipoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAnticipoCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAnticipoCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAnticipoCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=anticipoclienteLogic.getAnticipoClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=anticipoclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AnticipoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAnticipoCliente.setModel(new AnticipoClienteModel(this.anticipoclienteLogic.getAnticipoClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAnticipoCliente.setModel(new AnticipoClienteModel(this.anticipoclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAnticipoCliente!=null && this.jInternalFrameOrderByAnticipoCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAnticipoCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO,anticipoclienteConstantesFunciones.resaltarSeleccionarAnticipoCliente,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO,anticipoclienteConstantesFunciones.resaltarSeleccionarAnticipoCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_ID));

		if(this.anticipoclienteConstantesFunciones.mostraridAnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticipoclienteConstantesFunciones.resaltaridAnticipoCliente,this.anticipoclienteConstantesFunciones.activaridAnticipoCliente,iSizeTabla,this,true,"idAnticipoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticipoclienteConstantesFunciones.resaltaridAnticipoCliente,this.anticipoclienteConstantesFunciones.activaridAnticipoCliente,this,true,"idAnticipoCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.anticipoclienteConstantesFunciones.mostrarid_empresaAnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.anticipoclienteConstantesFunciones.resaltarid_empresaAnticipoCliente,this,this.anticipoclienteConstantesFunciones.activarid_empresaAnticipoCliente,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.anticipoclienteConstantesFunciones.resaltarid_empresaAnticipoCliente,this,this.anticipoclienteConstantesFunciones.activarid_empresaAnticipoCliente,false,"id_empresaAnticipoCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.anticipoclienteConstantesFunciones.mostrarid_empleadoAnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.anticipoclienteConstantesFunciones.resaltarid_empleadoAnticipoCliente,this,this.anticipoclienteConstantesFunciones.activarid_empleadoAnticipoCliente,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.anticipoclienteConstantesFunciones.resaltarid_empleadoAnticipoCliente,this,this.anticipoclienteConstantesFunciones.activarid_empleadoAnticipoCliente,true,"id_empleadoAnticipoCliente","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_IDESTADOANTICLIENTE));

		if(this.anticipoclienteConstantesFunciones.mostrarid_estado_anti_clienteAnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_IDESTADOANTICLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoAntiClienteTableCell(this.estadoanticlientesForeignKey,this.anticipoclienteConstantesFunciones.resaltarid_estado_anti_clienteAnticipoCliente,this,this.anticipoclienteConstantesFunciones.activarid_estado_anti_clienteAnticipoCliente,iSizeTabla));
			tableColumn.setCellEditor(new EstadoAntiClienteTableCell(this.estadoanticlientesForeignKey,this.anticipoclienteConstantesFunciones.resaltarid_estado_anti_clienteAnticipoCliente,this,this.anticipoclienteConstantesFunciones.activarid_estado_anti_clienteAnticipoCliente,true,"id_estado_anti_clienteAnticipoCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO));

		if(this.anticipoclienteConstantesFunciones.mostrarid_tipo_grupo_forma_pagoAnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoGrupoFormaPagoTableCell(this.tipogrupoformapagosForeignKey,this.anticipoclienteConstantesFunciones.resaltarid_tipo_grupo_forma_pagoAnticipoCliente,this,this.anticipoclienteConstantesFunciones.activarid_tipo_grupo_forma_pagoAnticipoCliente,iSizeTabla));
			tableColumn.setCellEditor(new TipoGrupoFormaPagoTableCell(this.tipogrupoformapagosForeignKey,this.anticipoclienteConstantesFunciones.resaltarid_tipo_grupo_forma_pagoAnticipoCliente,this,this.anticipoclienteConstantesFunciones.activarid_tipo_grupo_forma_pagoAnticipoCliente,true,"id_tipo_grupo_forma_pagoAnticipoCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_FECHA));

		if(this.anticipoclienteConstantesFunciones.mostrarfechaAnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.anticipoclienteConstantesFunciones.resaltarfechaAnticipoCliente,this.anticipoclienteConstantesFunciones.activarfechaAnticipoCliente,iSizeTabla,this,true,"fechaAnticipoCliente","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.anticipoclienteConstantesFunciones.resaltarfechaAnticipoCliente,this.anticipoclienteConstantesFunciones.activarfechaAnticipoCliente,this,true,"fechaAnticipoCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_VALOR));

		if(this.anticipoclienteConstantesFunciones.mostrarvalorAnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticipoclienteConstantesFunciones.resaltarvalorAnticipoCliente,this.anticipoclienteConstantesFunciones.activarvalorAnticipoCliente,iSizeTabla,this,true,"valorAnticipoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticipoclienteConstantesFunciones.resaltarvalorAnticipoCliente,this.anticipoclienteConstantesFunciones.activarvalorAnticipoCliente,this,true,"valorAnticipoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_DESCRIPCION));

		if(this.anticipoclienteConstantesFunciones.mostrardescripcionAnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.anticipoclienteConstantesFunciones.resaltardescripcionAnticipoCliente,this.anticipoclienteConstantesFunciones.activardescripcionAnticipoCliente,iSizeTabla,this,true,"descripcionAnticipoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticipoclienteConstantesFunciones.resaltardescripcionAnticipoCliente,this.anticipoclienteConstantesFunciones.activardescripcionAnticipoCliente,this,true,"descripcionAnticipoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_VALORADICIONAL));

		if(this.anticipoclienteConstantesFunciones.mostrarvalor_adicionalAnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_VALORADICIONAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticipoclienteConstantesFunciones.resaltarvalor_adicionalAnticipoCliente,this.anticipoclienteConstantesFunciones.activarvalor_adicionalAnticipoCliente,iSizeTabla,this,true,"valor_adicionalAnticipoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticipoclienteConstantesFunciones.resaltarvalor_adicionalAnticipoCliente,this.anticipoclienteConstantesFunciones.activarvalor_adicionalAnticipoCliente,this,true,"valor_adicionalAnticipoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_VALORPRESTAMO));

		if(this.anticipoclienteConstantesFunciones.mostrarvalor_prestamoAnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_VALORPRESTAMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticipoclienteConstantesFunciones.resaltarvalor_prestamoAnticipoCliente,this.anticipoclienteConstantesFunciones.activarvalor_prestamoAnticipoCliente,iSizeTabla,this,true,"valor_prestamoAnticipoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticipoclienteConstantesFunciones.resaltarvalor_prestamoAnticipoCliente,this.anticipoclienteConstantesFunciones.activarvalor_prestamoAnticipoCliente,this,true,"valor_prestamoAnticipoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_INGRESO1));

		if(this.anticipoclienteConstantesFunciones.mostraringreso1AnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_INGRESO1,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticipoclienteConstantesFunciones.resaltaringreso1AnticipoCliente,this.anticipoclienteConstantesFunciones.activaringreso1AnticipoCliente,iSizeTabla,this,true,"ingreso1AnticipoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticipoclienteConstantesFunciones.resaltaringreso1AnticipoCliente,this.anticipoclienteConstantesFunciones.activaringreso1AnticipoCliente,this,true,"ingreso1AnticipoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_INGRESO2));

		if(this.anticipoclienteConstantesFunciones.mostraringreso2AnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_INGRESO2,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticipoclienteConstantesFunciones.resaltaringreso2AnticipoCliente,this.anticipoclienteConstantesFunciones.activaringreso2AnticipoCliente,iSizeTabla,this,true,"ingreso2AnticipoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticipoclienteConstantesFunciones.resaltaringreso2AnticipoCliente,this.anticipoclienteConstantesFunciones.activaringreso2AnticipoCliente,this,true,"ingreso2AnticipoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_INGRESO3));

		if(this.anticipoclienteConstantesFunciones.mostraringreso3AnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_INGRESO3,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticipoclienteConstantesFunciones.resaltaringreso3AnticipoCliente,this.anticipoclienteConstantesFunciones.activaringreso3AnticipoCliente,iSizeTabla,this,true,"ingreso3AnticipoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticipoclienteConstantesFunciones.resaltaringreso3AnticipoCliente,this.anticipoclienteConstantesFunciones.activaringreso3AnticipoCliente,this,true,"ingreso3AnticipoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_INGRESO4));

		if(this.anticipoclienteConstantesFunciones.mostraringreso4AnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_INGRESO4,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticipoclienteConstantesFunciones.resaltaringreso4AnticipoCliente,this.anticipoclienteConstantesFunciones.activaringreso4AnticipoCliente,iSizeTabla,this,true,"ingreso4AnticipoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticipoclienteConstantesFunciones.resaltaringreso4AnticipoCliente,this.anticipoclienteConstantesFunciones.activaringreso4AnticipoCliente,this,true,"ingreso4AnticipoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_INGRESO5));

		if(this.anticipoclienteConstantesFunciones.mostraringreso5AnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_INGRESO5,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticipoclienteConstantesFunciones.resaltaringreso5AnticipoCliente,this.anticipoclienteConstantesFunciones.activaringreso5AnticipoCliente,iSizeTabla,this,true,"ingreso5AnticipoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticipoclienteConstantesFunciones.resaltaringreso5AnticipoCliente,this.anticipoclienteConstantesFunciones.activaringreso5AnticipoCliente,this,true,"ingreso5AnticipoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_DESCUENTO1));

		if(this.anticipoclienteConstantesFunciones.mostrardescuento1AnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_DESCUENTO1,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticipoclienteConstantesFunciones.resaltardescuento1AnticipoCliente,this.anticipoclienteConstantesFunciones.activardescuento1AnticipoCliente,iSizeTabla,this,true,"descuento1AnticipoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticipoclienteConstantesFunciones.resaltardescuento1AnticipoCliente,this.anticipoclienteConstantesFunciones.activardescuento1AnticipoCliente,this,true,"descuento1AnticipoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_DESCUENTO2));

		if(this.anticipoclienteConstantesFunciones.mostrardescuento2AnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_DESCUENTO2,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticipoclienteConstantesFunciones.resaltardescuento2AnticipoCliente,this.anticipoclienteConstantesFunciones.activardescuento2AnticipoCliente,iSizeTabla,this,true,"descuento2AnticipoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticipoclienteConstantesFunciones.resaltardescuento2AnticipoCliente,this.anticipoclienteConstantesFunciones.activardescuento2AnticipoCliente,this,true,"descuento2AnticipoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_DESCUENTO3));

		if(this.anticipoclienteConstantesFunciones.mostrardescuento3AnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_DESCUENTO3,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticipoclienteConstantesFunciones.resaltardescuento3AnticipoCliente,this.anticipoclienteConstantesFunciones.activardescuento3AnticipoCliente,iSizeTabla,this,true,"descuento3AnticipoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticipoclienteConstantesFunciones.resaltardescuento3AnticipoCliente,this.anticipoclienteConstantesFunciones.activardescuento3AnticipoCliente,this,true,"descuento3AnticipoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_DESCUENTO4));

		if(this.anticipoclienteConstantesFunciones.mostrardescuento4AnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_DESCUENTO4,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticipoclienteConstantesFunciones.resaltardescuento4AnticipoCliente,this.anticipoclienteConstantesFunciones.activardescuento4AnticipoCliente,iSizeTabla,this,true,"descuento4AnticipoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticipoclienteConstantesFunciones.resaltardescuento4AnticipoCliente,this.anticipoclienteConstantesFunciones.activardescuento4AnticipoCliente,this,true,"descuento4AnticipoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_DESCUENTO5));

		if(this.anticipoclienteConstantesFunciones.mostrardescuento5AnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_DESCUENTO5,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticipoclienteConstantesFunciones.resaltardescuento5AnticipoCliente,this.anticipoclienteConstantesFunciones.activardescuento5AnticipoCliente,iSizeTabla,this,true,"descuento5AnticipoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticipoclienteConstantesFunciones.resaltardescuento5AnticipoCliente,this.anticipoclienteConstantesFunciones.activardescuento5AnticipoCliente,this,true,"descuento5AnticipoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_TIPOINGRESO));

		if(this.anticipoclienteConstantesFunciones.mostrartipo_ingresoAnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_TIPOINGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticipoclienteConstantesFunciones.resaltartipo_ingresoAnticipoCliente,this.anticipoclienteConstantesFunciones.activartipo_ingresoAnticipoCliente,iSizeTabla,this,true,"tipo_ingresoAnticipoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticipoclienteConstantesFunciones.resaltartipo_ingresoAnticipoCliente,this.anticipoclienteConstantesFunciones.activartipo_ingresoAnticipoCliente,this,true,"tipo_ingresoAnticipoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,AnticipoClienteConstantesFunciones.LABEL_TIPODESCUENTO));

		if(this.anticipoclienteConstantesFunciones.mostrartipo_descuentoAnticipoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnticipoClienteConstantesFunciones.LABEL_TIPODESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anticipoclienteConstantesFunciones.resaltartipo_descuentoAnticipoCliente,this.anticipoclienteConstantesFunciones.activartipo_descuentoAnticipoCliente,iSizeTabla,this,true,"tipo_descuentoAnticipoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anticipoclienteConstantesFunciones.resaltartipo_descuentoAnticipoCliente,this.anticipoclienteConstantesFunciones.activartipo_descuentoAnticipoCliente,this,true,"tipo_descuentoAnticipoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnticipoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.anticipoclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.anticipoclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAnticipoCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.anticipoclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.anticipoclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAnticipoCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAnticipoCliente && this.isPermisoGuardarCambiosAnticipoCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.anticipoclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.anticipoclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosAnticipoCliente.addColumn(tableColumn);
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
			
			this.jTableDatosAnticipoCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAnticipoCliente && this.isPermisoGuardarCambiosAnticipoCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAnticipoCliente && this.isPermisoGuardarCambiosAnticipoCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosAnticipoCliente.moveColumn(this.jTableDatosAnticipoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosAnticipoCliente.moveColumn(this.jTableDatosAnticipoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAnticipoCliente.moveColumn(this.jTableDatosAnticipoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAnticipoCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAnticipoCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAnticipoCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AnticipoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAnticipoCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAnticipoCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AnticipoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AnticipoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAnticipoCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAnticipoCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAnticipoCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=anticipoclienteLogic.getAnticipoClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=anticipoclientes.size()-1;
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
		//this.jTableDatosAnticipoCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAnticipoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAnticipoCliente();
			
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
				
				//this.isEsNuevoAnticipoCliente=false;
					
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
			
				if(this.anticipoclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAnticipoCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAnticipoCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAnticipoCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.anticipocliente.getsType().equals("DUPLICADO")
				   || this.anticipocliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAnticipoCliente=true;
				
				} else {
					this.isEsNuevoAnticipoCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.anticipocliente.getId()>=0 && !this.anticipocliente.getIsNew()) {						
						this.isEsNuevoAnticipoCliente=false;
						
					} else {
						this.isEsNuevoAnticipoCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAnticipoCliente(esRelaciones);						
				
				this.seleccionarAnticipoCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.anticipocliente.getId()<0) {
					this.isEsNuevoAnticipoCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAnticipoCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAnticipoCliente(evt,rowIndex);
				}	
				
				if(this.anticipoclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion AnticipoCliente: " + this.dDif); 
					}
				}								
				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAnticipoCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.anticipocliente)) {
					if(this.anticipocliente.getId()>0) {
						this.anticipocliente.setIsDeleted(true);
						
						this.anticipoclientesEliminados.add(this.anticipocliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.anticipoclienteLogic.getAnticipoClientes().remove(this.anticipocliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.anticipoclientes.remove(this.anticipocliente);				
					}
					
					
					((AnticipoClienteModel) this.jTableDatosAnticipoCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAnticipoCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAnticipoCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAnticipoCliente) {
			
			if(this.jInternalFrameDetalleFormAnticipoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAnticipoCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAnticipoCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AnticipoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAnticipoCliente(this.anticipocliente);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.anticipoclienteConstantesFunciones.cargarid_empresaAnticipoCliente || this.anticipoclienteConstantesFunciones.event_dependid_empresaAnticipoCliente) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.anticipocliente.getid_empresa());
									//this.inicializarActualizarBindingAnticipoCliente(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(anticipocliente.getEmpresa()!=null) {
							this.empresasForeignKey.add(anticipocliente.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.anticipocliente.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.anticipoclienteConstantesFunciones.cargarid_empleadoAnticipoCliente || this.anticipoclienteConstantesFunciones.event_dependid_empleadoAnticipoCliente) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.anticipocliente.getid_empleado());
									//this.inicializarActualizarBindingAnticipoCliente(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(anticipocliente.getEmpleado()!=null) {
							this.empleadosForeignKey.add(anticipocliente.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.anticipocliente.getid_empleado(),false,"Formulario");

					//EstadoAntiCliente
					if(!this.anticipoclienteConstantesFunciones.cargarid_estado_anti_clienteAnticipoCliente || this.anticipoclienteConstantesFunciones.event_dependid_estado_anti_clienteAnticipoCliente) {
						//this.cargarCombosEstadoAntiClientesForeignKeyLista(" where id="+this.anticipocliente.getid_estado_anti_cliente());
									//this.inicializarActualizarBindingAnticipoCliente(false,false);
						this.estadoanticlientesForeignKey=new ArrayList<EstadoAntiCliente>();

						if(anticipocliente.getEstadoAntiCliente()!=null) {
							this.estadoanticlientesForeignKey.add(anticipocliente.getEstadoAntiCliente());
						}

						this.addItemDefectoCombosForeignKeyEstadoAntiCliente();
						this.cargarCombosFrameEstadoAntiClientesForeignKey("Todos");
					}
					this.setActualEstadoAntiClienteForeignKey(this.anticipocliente.getid_estado_anti_cliente(),false,"Formulario");

					//TipoGrupoFormaPago
					if(!this.anticipoclienteConstantesFunciones.cargarid_tipo_grupo_forma_pagoAnticipoCliente || this.anticipoclienteConstantesFunciones.event_dependid_tipo_grupo_forma_pagoAnticipoCliente) {
						//this.cargarCombosTipoGrupoFormaPagosForeignKeyLista(" where id="+this.anticipocliente.getid_tipo_grupo_forma_pago());
									//this.inicializarActualizarBindingAnticipoCliente(false,false);
						this.tipogrupoformapagosForeignKey=new ArrayList<TipoGrupoFormaPago>();

						if(anticipocliente.getTipoGrupoFormaPago()!=null) {
							this.tipogrupoformapagosForeignKey.add(anticipocliente.getTipoGrupoFormaPago());
						}

						this.addItemDefectoCombosForeignKeyTipoGrupoFormaPago();
						this.cargarCombosFrameTipoGrupoFormaPagosForeignKey("Todos");
					}
					this.setActualTipoGrupoFormaPagoForeignKey(this.anticipocliente.getid_tipo_grupo_forma_pago(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAnticipoCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAnticipoCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAnticipoCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAnticipoCliente(AnticipoCliente anticipocliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAnticipoCliente(anticipocliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAnticipoCliente(AnticipoCliente anticipocliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAnticipoCliente(anticipocliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAnticipoCliente(anticipocliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAnticipoCliente(anticipocliente);
	}
	
	public void setVariablesObjetoActualToFormularioAnticipoCliente(AnticipoCliente anticipocliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAnticipoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAnticipoCliente.jLabelidAnticipoCliente.setText(anticipocliente.getId().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jDateChooserfechaAnticipoCliente.setDate(anticipocliente.getfecha());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalorAnticipoCliente.setText(anticipocliente.getvalor().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextAreadescripcionAnticipoCliente.setText(anticipocliente.getdescripcion());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalor_adicionalAnticipoCliente.setText(anticipocliente.getvalor_adicional().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalor_prestamoAnticipoCliente.setText(anticipocliente.getvalor_prestamo().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso1AnticipoCliente.setText(anticipocliente.getingreso1().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso2AnticipoCliente.setText(anticipocliente.getingreso2().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso3AnticipoCliente.setText(anticipocliente.getingreso3().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso4AnticipoCliente.setText(anticipocliente.getingreso4().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso5AnticipoCliente.setText(anticipocliente.getingreso5().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento1AnticipoCliente.setText(anticipocliente.getdescuento1().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento2AnticipoCliente.setText(anticipocliente.getdescuento2().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento3AnticipoCliente.setText(anticipocliente.getdescuento3().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento4AnticipoCliente.setText(anticipocliente.getdescuento4().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento5AnticipoCliente.setText(anticipocliente.getdescuento5().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldtipo_ingresoAnticipoCliente.setText(anticipocliente.gettipo_ingreso().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldtipo_descuentoAnticipoCliente.setText(anticipocliente.gettipo_descuento().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,AnticipoCliente anticipoclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,anticipoclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,AnticipoCliente anticipoclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				anticipoclienteLocal=this.anticipocliente;
			} else {
				anticipoclienteLocal=this.anticipoclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(anticipoclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAnticipoCliente(anticipoclienteLocal,true);
					
					if(anticipoclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(anticipoclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(anticipoclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAnticipoCliente(AnticipoCliente anticipocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAnticipoCliente(anticipocliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(anticipocliente);
	}
	
	public void setVariablesFormularioToObjetoActualAnticipoCliente(AnticipoCliente anticipocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAnticipoCliente(anticipocliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAnticipoCliente(AnticipoCliente anticipocliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAnticipoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAnticipoCliente.jLabelidAnticipoCliente.getText()==null || this.jInternalFrameDetalleFormAnticipoCliente.jLabelidAnticipoCliente.getText()=="" || this.jInternalFrameDetalleFormAnticipoCliente.jLabelidAnticipoCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormAnticipoCliente.jLabelidAnticipoCliente.setText("0");
			}

			if(conColumnasBase) {anticipocliente.setId(Long.parseLong(this.jInternalFrameDetalleFormAnticipoCliente.jLabelidAnticipoCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticipoClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelIdAnticipoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipocliente.setfecha(this.jInternalFrameDetalleFormAnticipoCliente.jDateChooserfechaAnticipoCliente.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticipoClienteConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelfechaAnticipoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipocliente.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalorAnticipoCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticipoClienteConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelvalorAnticipoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipocliente.setdescripcion(this.jInternalFrameDetalleFormAnticipoCliente.jTextAreadescripcionAnticipoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticipoClienteConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabeldescripcionAnticipoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipocliente.setvalor_adicional(Double.parseDouble(this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalor_adicionalAnticipoCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticipoClienteConstantesFunciones.LABEL_VALORADICIONAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelvalor_adicionalAnticipoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipocliente.setvalor_prestamo(Double.parseDouble(this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalor_prestamoAnticipoCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticipoClienteConstantesFunciones.LABEL_VALORPRESTAMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelvalor_prestamoAnticipoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipocliente.setingreso1(Double.parseDouble(this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso1AnticipoCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticipoClienteConstantesFunciones.LABEL_INGRESO1+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelingreso1AnticipoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipocliente.setingreso2(Double.parseDouble(this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso2AnticipoCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticipoClienteConstantesFunciones.LABEL_INGRESO2+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelingreso2AnticipoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipocliente.setingreso3(Double.parseDouble(this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso3AnticipoCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticipoClienteConstantesFunciones.LABEL_INGRESO3+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelingreso3AnticipoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipocliente.setingreso4(Double.parseDouble(this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso4AnticipoCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticipoClienteConstantesFunciones.LABEL_INGRESO4+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelingreso4AnticipoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipocliente.setingreso5(Double.parseDouble(this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso5AnticipoCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticipoClienteConstantesFunciones.LABEL_INGRESO5+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabelingreso5AnticipoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipocliente.setdescuento1(Double.parseDouble(this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento1AnticipoCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticipoClienteConstantesFunciones.LABEL_DESCUENTO1+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabeldescuento1AnticipoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipocliente.setdescuento2(Double.parseDouble(this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento2AnticipoCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticipoClienteConstantesFunciones.LABEL_DESCUENTO2+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabeldescuento2AnticipoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipocliente.setdescuento3(Double.parseDouble(this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento3AnticipoCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticipoClienteConstantesFunciones.LABEL_DESCUENTO3+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabeldescuento3AnticipoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipocliente.setdescuento4(Double.parseDouble(this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento4AnticipoCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticipoClienteConstantesFunciones.LABEL_DESCUENTO4+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabeldescuento4AnticipoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipocliente.setdescuento5(Double.parseDouble(this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento5AnticipoCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticipoClienteConstantesFunciones.LABEL_DESCUENTO5+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabeldescuento5AnticipoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipocliente.settipo_ingreso(Double.parseDouble(this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldtipo_ingresoAnticipoCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticipoClienteConstantesFunciones.LABEL_TIPOINGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabeltipo_ingresoAnticipoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anticipocliente.settipo_descuento(Double.parseDouble(this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldtipo_descuentoAnticipoCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnticipoClienteConstantesFunciones.LABEL_TIPODESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnticipoCliente.jLabeltipo_descuentoAnticipoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAnticipoCliente(AnticipoCliente anticipoclienteBean,AnticipoCliente anticipocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && anticipoclienteBean.getid_empleado()!=null && !anticipoclienteBean.getid_empleado().equals(-1L))) {anticipocliente.setid_empleado(anticipoclienteBean.getid_empleado());}
			if(conDefault || (!conDefault && anticipoclienteBean.getid_estado_anti_cliente()!=null && !anticipoclienteBean.getid_estado_anti_cliente().equals(-1L))) {anticipocliente.setid_estado_anti_cliente(anticipoclienteBean.getid_estado_anti_cliente());}
			if(conDefault || (!conDefault && anticipoclienteBean.getid_tipo_grupo_forma_pago()!=null && !anticipoclienteBean.getid_tipo_grupo_forma_pago().equals(-1L))) {anticipocliente.setid_tipo_grupo_forma_pago(anticipoclienteBean.getid_tipo_grupo_forma_pago());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAnticipoCliente(AnticipoCliente anticipoclienteOrigen,AnticipoCliente anticipocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && anticipoclienteOrigen.getId()!=null && !anticipoclienteOrigen.getId().equals(0L))) {anticipocliente.setId(anticipoclienteOrigen.getId());}}
			if(conDefault || (!conDefault && anticipoclienteOrigen.getid_empleado()!=null && !anticipoclienteOrigen.getid_empleado().equals(-1L))) {anticipocliente.setid_empleado(anticipoclienteOrigen.getid_empleado());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.getid_estado_anti_cliente()!=null && !anticipoclienteOrigen.getid_estado_anti_cliente().equals(-1L))) {anticipocliente.setid_estado_anti_cliente(anticipoclienteOrigen.getid_estado_anti_cliente());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.getid_tipo_grupo_forma_pago()!=null && !anticipoclienteOrigen.getid_tipo_grupo_forma_pago().equals(-1L))) {anticipocliente.setid_tipo_grupo_forma_pago(anticipoclienteOrigen.getid_tipo_grupo_forma_pago());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.getfecha()!=null && !anticipoclienteOrigen.getfecha().equals(new Date()))) {anticipocliente.setfecha(anticipoclienteOrigen.getfecha());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.getvalor()!=null && !anticipoclienteOrigen.getvalor().equals(0.0))) {anticipocliente.setvalor(anticipoclienteOrigen.getvalor());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.getdescripcion()!=null && !anticipoclienteOrigen.getdescripcion().equals(""))) {anticipocliente.setdescripcion(anticipoclienteOrigen.getdescripcion());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.getvalor_adicional()!=null && !anticipoclienteOrigen.getvalor_adicional().equals(0.0))) {anticipocliente.setvalor_adicional(anticipoclienteOrigen.getvalor_adicional());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.getvalor_prestamo()!=null && !anticipoclienteOrigen.getvalor_prestamo().equals(0.0))) {anticipocliente.setvalor_prestamo(anticipoclienteOrigen.getvalor_prestamo());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.getingreso1()!=null && !anticipoclienteOrigen.getingreso1().equals(0.0))) {anticipocliente.setingreso1(anticipoclienteOrigen.getingreso1());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.getingreso2()!=null && !anticipoclienteOrigen.getingreso2().equals(0.0))) {anticipocliente.setingreso2(anticipoclienteOrigen.getingreso2());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.getingreso3()!=null && !anticipoclienteOrigen.getingreso3().equals(0.0))) {anticipocliente.setingreso3(anticipoclienteOrigen.getingreso3());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.getingreso4()!=null && !anticipoclienteOrigen.getingreso4().equals(0.0))) {anticipocliente.setingreso4(anticipoclienteOrigen.getingreso4());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.getingreso5()!=null && !anticipoclienteOrigen.getingreso5().equals(0.0))) {anticipocliente.setingreso5(anticipoclienteOrigen.getingreso5());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.getdescuento1()!=null && !anticipoclienteOrigen.getdescuento1().equals(0.0))) {anticipocliente.setdescuento1(anticipoclienteOrigen.getdescuento1());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.getdescuento2()!=null && !anticipoclienteOrigen.getdescuento2().equals(0.0))) {anticipocliente.setdescuento2(anticipoclienteOrigen.getdescuento2());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.getdescuento3()!=null && !anticipoclienteOrigen.getdescuento3().equals(0.0))) {anticipocliente.setdescuento3(anticipoclienteOrigen.getdescuento3());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.getdescuento4()!=null && !anticipoclienteOrigen.getdescuento4().equals(0.0))) {anticipocliente.setdescuento4(anticipoclienteOrigen.getdescuento4());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.getdescuento5()!=null && !anticipoclienteOrigen.getdescuento5().equals(0.0))) {anticipocliente.setdescuento5(anticipoclienteOrigen.getdescuento5());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.gettipo_ingreso()!=null && !anticipoclienteOrigen.gettipo_ingreso().equals(0.0))) {anticipocliente.settipo_ingreso(anticipoclienteOrigen.gettipo_ingreso());}
			if(conDefault || (!conDefault && anticipoclienteOrigen.gettipo_descuento()!=null && !anticipoclienteOrigen.gettipo_descuento().equals(0.0))) {anticipocliente.settipo_descuento(anticipoclienteOrigen.gettipo_descuento());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAnticipoCliente(AnticipoCliente anticipocliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAnticipoCliente.jLabelidAnticipoCliente.setText(anticipocliente.getId().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jDateChooserfechaAnticipoCliente.setDate(anticipocliente.getfecha());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalorAnticipoCliente.setText(anticipocliente.getvalor().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextAreadescripcionAnticipoCliente.setText(anticipocliente.getdescripcion());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalor_adicionalAnticipoCliente.setText(anticipocliente.getvalor_adicional().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalor_prestamoAnticipoCliente.setText(anticipocliente.getvalor_prestamo().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso1AnticipoCliente.setText(anticipocliente.getingreso1().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso2AnticipoCliente.setText(anticipocliente.getingreso2().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso3AnticipoCliente.setText(anticipocliente.getingreso3().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso4AnticipoCliente.setText(anticipocliente.getingreso4().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso5AnticipoCliente.setText(anticipocliente.getingreso5().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento1AnticipoCliente.setText(anticipocliente.getdescuento1().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento2AnticipoCliente.setText(anticipocliente.getdescuento2().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento3AnticipoCliente.setText(anticipocliente.getdescuento3().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento4AnticipoCliente.setText(anticipocliente.getdescuento4().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento5AnticipoCliente.setText(anticipocliente.getdescuento5().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldtipo_ingresoAnticipoCliente.setText(anticipocliente.gettipo_ingreso().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldtipo_descuentoAnticipoCliente.setText(anticipocliente.gettipo_descuento().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAnticipoCliente(AnticipoClienteBean anticipoclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAnticipoCliente.jLabelidAnticipoCliente.setText(anticipoclienteBean.getId().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jDateChooserfechaAnticipoCliente.setDate(anticipoclienteBean.getfecha());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalorAnticipoCliente.setText(anticipoclienteBean.getvalor().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextAreadescripcionAnticipoCliente.setText(anticipoclienteBean.getdescripcion());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalor_adicionalAnticipoCliente.setText(anticipoclienteBean.getvalor_adicional().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalor_prestamoAnticipoCliente.setText(anticipoclienteBean.getvalor_prestamo().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso1AnticipoCliente.setText(anticipoclienteBean.getingreso1().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso2AnticipoCliente.setText(anticipoclienteBean.getingreso2().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso3AnticipoCliente.setText(anticipoclienteBean.getingreso3().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso4AnticipoCliente.setText(anticipoclienteBean.getingreso4().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso5AnticipoCliente.setText(anticipoclienteBean.getingreso5().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento1AnticipoCliente.setText(anticipoclienteBean.getdescuento1().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento2AnticipoCliente.setText(anticipoclienteBean.getdescuento2().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento3AnticipoCliente.setText(anticipoclienteBean.getdescuento3().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento4AnticipoCliente.setText(anticipoclienteBean.getdescuento4().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento5AnticipoCliente.setText(anticipoclienteBean.getdescuento5().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldtipo_ingresoAnticipoCliente.setText(anticipoclienteBean.gettipo_ingreso().toString());
			this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldtipo_descuentoAnticipoCliente.setText(anticipoclienteBean.gettipo_descuento().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAnticipoCliente(AnticipoClienteParameterReturnGeneral anticipoclienteReturnGeneral,AnticipoClienteBean anticipoclienteBean,Boolean conDefault) throws Exception { 
		try {
			AnticipoCliente anticipoclienteLocal=new AnticipoCliente();
			
			anticipoclienteLocal=anticipoclienteReturnGeneral.getAnticipoCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && anticipoclienteLocal.getId()!=null && !anticipoclienteLocal.getId().equals(0L))) {anticipoclienteBean.setId(anticipoclienteLocal.getId());}}
			if(conDefault || (!conDefault && anticipoclienteLocal.getid_empleado()!=null && !anticipoclienteLocal.getid_empleado().equals(-1L))) {anticipoclienteBean.setid_empleado(anticipoclienteLocal.getid_empleado());}
			if(conDefault || (!conDefault && anticipoclienteLocal.getid_estado_anti_cliente()!=null && !anticipoclienteLocal.getid_estado_anti_cliente().equals(-1L))) {anticipoclienteBean.setid_estado_anti_cliente(anticipoclienteLocal.getid_estado_anti_cliente());}
			if(conDefault || (!conDefault && anticipoclienteLocal.getid_tipo_grupo_forma_pago()!=null && !anticipoclienteLocal.getid_tipo_grupo_forma_pago().equals(-1L))) {anticipoclienteBean.setid_tipo_grupo_forma_pago(anticipoclienteLocal.getid_tipo_grupo_forma_pago());}
			if(conDefault || (!conDefault && anticipoclienteLocal.getfecha()!=null && !anticipoclienteLocal.getfecha().equals(new Date()))) {anticipoclienteBean.setfecha(anticipoclienteLocal.getfecha());}
			if(conDefault || (!conDefault && anticipoclienteLocal.getvalor()!=null && !anticipoclienteLocal.getvalor().equals(0.0))) {anticipoclienteBean.setvalor(anticipoclienteLocal.getvalor());}
			if(conDefault || (!conDefault && anticipoclienteLocal.getdescripcion()!=null && !anticipoclienteLocal.getdescripcion().equals(""))) {anticipoclienteBean.setdescripcion(anticipoclienteLocal.getdescripcion());}
			if(conDefault || (!conDefault && anticipoclienteLocal.getvalor_adicional()!=null && !anticipoclienteLocal.getvalor_adicional().equals(0.0))) {anticipoclienteBean.setvalor_adicional(anticipoclienteLocal.getvalor_adicional());}
			if(conDefault || (!conDefault && anticipoclienteLocal.getvalor_prestamo()!=null && !anticipoclienteLocal.getvalor_prestamo().equals(0.0))) {anticipoclienteBean.setvalor_prestamo(anticipoclienteLocal.getvalor_prestamo());}
			if(conDefault || (!conDefault && anticipoclienteLocal.getingreso1()!=null && !anticipoclienteLocal.getingreso1().equals(0.0))) {anticipoclienteBean.setingreso1(anticipoclienteLocal.getingreso1());}
			if(conDefault || (!conDefault && anticipoclienteLocal.getingreso2()!=null && !anticipoclienteLocal.getingreso2().equals(0.0))) {anticipoclienteBean.setingreso2(anticipoclienteLocal.getingreso2());}
			if(conDefault || (!conDefault && anticipoclienteLocal.getingreso3()!=null && !anticipoclienteLocal.getingreso3().equals(0.0))) {anticipoclienteBean.setingreso3(anticipoclienteLocal.getingreso3());}
			if(conDefault || (!conDefault && anticipoclienteLocal.getingreso4()!=null && !anticipoclienteLocal.getingreso4().equals(0.0))) {anticipoclienteBean.setingreso4(anticipoclienteLocal.getingreso4());}
			if(conDefault || (!conDefault && anticipoclienteLocal.getingreso5()!=null && !anticipoclienteLocal.getingreso5().equals(0.0))) {anticipoclienteBean.setingreso5(anticipoclienteLocal.getingreso5());}
			if(conDefault || (!conDefault && anticipoclienteLocal.getdescuento1()!=null && !anticipoclienteLocal.getdescuento1().equals(0.0))) {anticipoclienteBean.setdescuento1(anticipoclienteLocal.getdescuento1());}
			if(conDefault || (!conDefault && anticipoclienteLocal.getdescuento2()!=null && !anticipoclienteLocal.getdescuento2().equals(0.0))) {anticipoclienteBean.setdescuento2(anticipoclienteLocal.getdescuento2());}
			if(conDefault || (!conDefault && anticipoclienteLocal.getdescuento3()!=null && !anticipoclienteLocal.getdescuento3().equals(0.0))) {anticipoclienteBean.setdescuento3(anticipoclienteLocal.getdescuento3());}
			if(conDefault || (!conDefault && anticipoclienteLocal.getdescuento4()!=null && !anticipoclienteLocal.getdescuento4().equals(0.0))) {anticipoclienteBean.setdescuento4(anticipoclienteLocal.getdescuento4());}
			if(conDefault || (!conDefault && anticipoclienteLocal.getdescuento5()!=null && !anticipoclienteLocal.getdescuento5().equals(0.0))) {anticipoclienteBean.setdescuento5(anticipoclienteLocal.getdescuento5());}
			if(conDefault || (!conDefault && anticipoclienteLocal.gettipo_ingreso()!=null && !anticipoclienteLocal.gettipo_ingreso().equals(0.0))) {anticipoclienteBean.settipo_ingreso(anticipoclienteLocal.gettipo_ingreso());}
			if(conDefault || (!conDefault && anticipoclienteLocal.gettipo_descuento()!=null && !anticipoclienteLocal.gettipo_descuento().equals(0.0))) {anticipoclienteBean.settipo_descuento(anticipoclienteLocal.gettipo_descuento());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAnticipoClienteGenerico(Long idAnticipoClienteSeleccionado,JComboBox jComboBoxAnticipoCliente,List<AnticipoCliente> anticipoclientesLocal)throws Exception {
		try {
			AnticipoCliente  anticipoclienteTemp=null;

			for(AnticipoCliente anticipoclienteAux:anticipoclientesLocal) {
				if(anticipoclienteAux.getId()!=null && anticipoclienteAux.getId().equals(idAnticipoClienteSeleccionado)) {
					anticipoclienteTemp=anticipoclienteAux;
					break;
				}
			}

			jComboBoxAnticipoCliente.setSelectedItem(anticipoclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAnticipoClienteGenerico(JComboBox jComboBoxAnticipoCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAnticipoCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAnticipoCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAnticipoCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAnticipoCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAnticipoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAnticipoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			anticipocliente=(AnticipoCliente) anticipoclienteLogic.getAnticipoClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			anticipocliente =(AnticipoCliente) anticipoclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!anticipocliente.getIsNew() && !anticipocliente.getIsChanged() && !anticipocliente.getIsDeleted()) {
				sDescripcion=anticipocliente.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=anticipocliente.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!anticipocliente.getIsNew() && !anticipocliente.getIsChanged() && !anticipocliente.getIsDeleted()) {
				sDescripcion=anticipocliente.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=anticipocliente.getempleado_descripcion();
			}
		}

		if(sTipo.equals("EstadoAntiCliente")) {
			//sDescripcion=this.getActualEstadoAntiClienteForeignKeyDescripcion((Long)value);
			if(!anticipocliente.getIsNew() && !anticipocliente.getIsChanged() && !anticipocliente.getIsDeleted()) {
				sDescripcion=anticipocliente.getestadoanticliente_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoAntiClienteForeignKeyDescripcion((Long)value);
				sDescripcion=anticipocliente.getestadoanticliente_descripcion();
			}
		}

		if(sTipo.equals("TipoGrupoFormaPago")) {
			//sDescripcion=this.getActualTipoGrupoFormaPagoForeignKeyDescripcion((Long)value);
			if(!anticipocliente.getIsNew() && !anticipocliente.getIsChanged() && !anticipocliente.getIsDeleted()) {
				sDescripcion=anticipocliente.gettipogrupoformapago_descripcion();
			} else {
				//sDescripcion=this.getActualTipoGrupoFormaPagoForeignKeyDescripcion((Long)value);
				sDescripcion=anticipocliente.gettipogrupoformapago_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		AnticipoCliente anticipoclienteRow=new AnticipoCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			anticipoclienteRow=(AnticipoCliente) anticipoclienteLogic.getAnticipoClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			anticipoclienteRow=(AnticipoCliente) anticipoclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAnticipoCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAnticipoCliente.setVisible((this.isVisibilidadCeldaNuevoAnticipoCliente && this.isPermisoNuevoAnticipoCliente));			
			this.jButtonDuplicarAnticipoCliente.setVisible((this.isVisibilidadCeldaDuplicarAnticipoCliente && this.isPermisoDuplicarAnticipoCliente));			
			this.jButtonCopiarAnticipoCliente.setVisible((this.isVisibilidadCeldaCopiarAnticipoCliente && this.isPermisoCopiarAnticipoCliente));
			this.jButtonVerFormAnticipoCliente.setVisible((this.isVisibilidadCeldaVerFormAnticipoCliente && this.isPermisoVerFormAnticipoCliente));
			
			this.jButtonAbrirOrderByAnticipoCliente.setVisible((this.isVisibilidadCeldaOrdenAnticipoCliente && this.isPermisoOrdenAnticipoCliente));			
			
			this.jButtonNuevoRelacionesAnticipoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente && this.isPermisoNuevoAnticipoCliente));			
			this.jButtonNuevoGuardarCambiosAnticipoCliente.setVisible((this.isVisibilidadCeldaNuevoAnticipoCliente && this.isPermisoNuevoAnticipoCliente && this.isPermisoGuardarCambiosAnticipoCliente));
			
			if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonModificarAnticipoCliente.setVisible((this.isVisibilidadCeldaModificarAnticipoCliente && this.isPermisoActualizarAnticipoCliente));	
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonActualizarAnticipoCliente.setVisible((this.isVisibilidadCeldaActualizarAnticipoCliente && this.isPermisoActualizarAnticipoCliente));	
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonEliminarAnticipoCliente.setVisible((this.isVisibilidadCeldaEliminarAnticipoCliente && this.isPermisoEliminarAnticipoCliente));
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonCancelarAnticipoCliente.setVisible(this.isVisibilidadCeldaCancelarAnticipoCliente);							
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonGuardarCambiosAnticipoCliente.setVisible((this.isVisibilidadCeldaGuardarAnticipoCliente && this.isPermisoGuardarCambiosAnticipoCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaAnticipoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosAnticipoCliente && this.isPermisoGuardarCambiosAnticipoCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAnticipoCliente.setVisible((this.isVisibilidadCeldaNuevoAnticipoCliente && this.isPermisoNuevoAnticipoCliente));						
			this.jButtonDuplicarToolBarAnticipoCliente.setVisible((this.isVisibilidadCeldaDuplicarAnticipoCliente && this.isPermisoDuplicarAnticipoCliente));						
			this.jButtonCopiarToolBarAnticipoCliente.setVisible((this.isVisibilidadCeldaCopiarAnticipoCliente && this.isPermisoCopiarAnticipoCliente));			
			this.jButtonVerFormToolBarAnticipoCliente.setVisible((this.isVisibilidadCeldaVerFormAnticipoCliente && this.isPermisoVerFormAnticipoCliente));			
			this.jButtonAbrirOrderByToolBarAnticipoCliente.setVisible((this.isVisibilidadCeldaOrdenAnticipoCliente && this.isPermisoOrdenAnticipoCliente));
			this.jButtonNuevoRelacionesToolBarAnticipoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente && this.isPermisoNuevoAnticipoCliente));			
			this.jButtonNuevoGuardarCambiosToolBarAnticipoCliente.setVisible((this.isVisibilidadCeldaNuevoAnticipoCliente && this.isPermisoNuevoAnticipoCliente && this.isPermisoGuardarCambiosAnticipoCliente));			
			
			if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonModificarToolBarAnticipoCliente.setVisible((this.isVisibilidadCeldaModificarAnticipoCliente && this.isPermisoActualizarAnticipoCliente));	
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonActualizarToolBarAnticipoCliente.setVisible((this.isVisibilidadCeldaActualizarAnticipoCliente  && this.isPermisoActualizarAnticipoCliente));	
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonEliminarToolBarAnticipoCliente.setVisible((this.isVisibilidadCeldaEliminarAnticipoCliente && this.isPermisoEliminarAnticipoCliente));
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonCancelarToolBarAnticipoCliente.setVisible(this.isVisibilidadCeldaCancelarAnticipoCliente);				
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonGuardarCambiosToolBarAnticipoCliente.setVisible((this.isVisibilidadCeldaGuardarAnticipoCliente && this.isPermisoGuardarCambiosAnticipoCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAnticipoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosAnticipoCliente && this.isPermisoGuardarCambiosAnticipoCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAnticipoCliente.setVisible((this.isVisibilidadCeldaNuevoAnticipoCliente && this.isPermisoNuevoAnticipoCliente));			
			this.jMenuItemDuplicarAnticipoCliente.setVisible((this.isVisibilidadCeldaDuplicarAnticipoCliente && this.isPermisoDuplicarAnticipoCliente));			
			this.jMenuItemCopiarAnticipoCliente.setVisible((this.isVisibilidadCeldaCopiarAnticipoCliente && this.isPermisoCopiarAnticipoCliente));			
			this.jMenuItemVerFormAnticipoCliente.setVisible((this.isVisibilidadCeldaVerFormAnticipoCliente && this.isPermisoVerFormAnticipoCliente));			
			this.jMenuItemAbrirOrderByAnticipoCliente.setVisible((this.isVisibilidadCeldaOrdenAnticipoCliente && this.isPermisoOrdenAnticipoCliente));			
			//this.jMenuItemMostrarOcultarAnticipoCliente.setVisible((this.isVisibilidadCeldaOrdenAnticipoCliente && this.isPermisoOrdenAnticipoCliente));
			this.jMenuItemDetalleAbrirOrderByAnticipoCliente.setVisible((this.isVisibilidadCeldaOrdenAnticipoCliente && this.isPermisoOrdenAnticipoCliente));			
			//this.jMenuItemDetalleMostrarOcultarAnticipoCliente.setVisible((this.isVisibilidadCeldaOrdenAnticipoCliente && this.isPermisoOrdenAnticipoCliente));			
			this.jMenuItemNuevoRelacionesAnticipoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente && this.isPermisoNuevoAnticipoCliente));			
			this.jMenuItemNuevoGuardarCambiosAnticipoCliente.setVisible((this.isVisibilidadCeldaNuevoAnticipoCliente && this.isPermisoNuevoAnticipoCliente && this.isPermisoGuardarCambiosAnticipoCliente));									
			
			if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
			this.jInternalFrameDetalleFormAnticipoCliente.jMenuItemModificarAnticipoCliente.setVisible((this.isVisibilidadCeldaModificarAnticipoCliente && this.isPermisoActualizarAnticipoCliente));	
			this.jInternalFrameDetalleFormAnticipoCliente.jMenuItemActualizarAnticipoCliente.setVisible((this.isVisibilidadCeldaActualizarAnticipoCliente && this.isPermisoActualizarAnticipoCliente));	
			this.jInternalFrameDetalleFormAnticipoCliente.jMenuItemEliminarAnticipoCliente.setVisible((this.isVisibilidadCeldaEliminarAnticipoCliente && this.isPermisoEliminarAnticipoCliente));
			this.jInternalFrameDetalleFormAnticipoCliente.jMenuItemCancelarAnticipoCliente.setVisible(this.isVisibilidadCeldaCancelarAnticipoCliente);				
			}
			
			this.jMenuItemGuardarCambiosAnticipoCliente.setVisible((this.isVisibilidadCeldaGuardarAnticipoCliente && this.isPermisoGuardarCambiosAnticipoCliente));						
			this.jMenuItemGuardarCambiosTablaAnticipoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosAnticipoCliente && this.isPermisoGuardarCambiosAnticipoCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAnticipoCliente=this.jButtonNuevoAnticipoCliente.isVisible();
			this.isVisibilidadCeldaDuplicarAnticipoCliente=this.jButtonDuplicarAnticipoCliente.isVisible();
			this.isVisibilidadCeldaCopiarAnticipoCliente=this.jButtonCopiarAnticipoCliente.isVisible();
			this.isVisibilidadCeldaVerFormAnticipoCliente=this.jButtonVerFormAnticipoCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenAnticipoCliente=this.jButtonAbrirOrderByAnticipoCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente=this.jButtonNuevoRelacionesAnticipoCliente.isVisible();
			this.isVisibilidadCeldaModificarAnticipoCliente=this.jButtonModificarAnticipoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
			this.isVisibilidadCeldaActualizarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jButtonActualizarAnticipoCliente.isVisible();
			this.isVisibilidadCeldaEliminarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jButtonEliminarAnticipoCliente.isVisible();
			this.isVisibilidadCeldaCancelarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jButtonCancelarAnticipoCliente.isVisible();
			this.isVisibilidadCeldaGuardarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jButtonGuardarCambiosAnticipoCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAnticipoCliente=this.jButtonGuardarCambiosTablaAnticipoCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAnticipoCliente=this.jButtonNuevoToolBarAnticipoCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente=this.jButtonNuevoRelacionesToolBarAnticipoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
			this.isVisibilidadCeldaModificarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jButtonModificarToolBarAnticipoCliente.isVisible();
			this.isVisibilidadCeldaActualizarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jButtonActualizarToolBarAnticipoCliente.isVisible();
			this.isVisibilidadCeldaEliminarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jButtonEliminarToolBarAnticipoCliente.isVisible();
			this.isVisibilidadCeldaCancelarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jButtonCancelarToolBarAnticipoCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAnticipoCliente=this.jButtonGuardarCambiosToolBarAnticipoCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAnticipoCliente=this.jButtonGuardarCambiosTablaToolBarAnticipoCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAnticipoCliente=this.jMenuItemNuevoAnticipoCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente=this.jMenuItemNuevoRelacionesAnticipoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
			this.isVisibilidadCeldaModificarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jMenuItemModificarAnticipoCliente.isVisible();
			this.isVisibilidadCeldaActualizarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jMenuItemActualizarAnticipoCliente.isVisible();
			this.isVisibilidadCeldaEliminarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jMenuItemEliminarAnticipoCliente.isVisible();
			this.isVisibilidadCeldaCancelarAnticipoCliente=this.jInternalFrameDetalleFormAnticipoCliente.jMenuItemCancelarAnticipoCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAnticipoCliente=this.jMenuItemGuardarCambiosAnticipoCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAnticipoCliente=this.jMenuItemGuardarCambiosTablaAnticipoCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAnticipoCliente(Boolean esInicializar) {
		if(AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.anticipoclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAnticipoCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualAnticipoCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAnticipoCliente() {
		this.jButtonNuevoAnticipoCliente.setVisible(this.isPermisoNuevoAnticipoCliente);			
		this.jButtonDuplicarAnticipoCliente.setVisible(this.isPermisoDuplicarAnticipoCliente);			
		this.jButtonCopiarAnticipoCliente.setVisible(this.isPermisoCopiarAnticipoCliente);			
		this.jButtonVerFormAnticipoCliente.setVisible(this.isPermisoVerFormAnticipoCliente);			
		
		this.jButtonAbrirOrderByAnticipoCliente.setVisible(this.isPermisoOrdenAnticipoCliente);					
		
		this.jButtonNuevoRelacionesAnticipoCliente.setVisible(this.isPermisoNuevoAnticipoCliente);			
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonModificarAnticipoCliente.setVisible(this.isPermisoActualizarAnticipoCliente);	
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonActualizarAnticipoCliente.setVisible(this.isPermisoActualizarAnticipoCliente);	
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonEliminarAnticipoCliente.setVisible(this.isPermisoEliminarAnticipoCliente);
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonCancelarAnticipoCliente.setVisible(this.isVisibilidadCeldaCancelarAnticipoCliente);						
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonGuardarCambiosAnticipoCliente.setVisible(this.isPermisoGuardarCambiosAnticipoCliente);							
		}
		
		this.jButtonGuardarCambiosTablaAnticipoCliente.setVisible(this.isPermisoActualizarAnticipoCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAnticipoCliente() {
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonModificarAnticipoCliente.setVisible(this.isPermisoActualizarAnticipoCliente);	
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonActualizarAnticipoCliente.setVisible(this.isPermisoActualizarAnticipoCliente);	
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonEliminarAnticipoCliente.setVisible(this.isPermisoEliminarAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonCancelarAnticipoCliente.setVisible(this.isVisibilidadCeldaCancelarAnticipoCliente);							
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonGuardarCambiosAnticipoCliente.setVisible((this.isVisibilidadCeldaGuardarAnticipoCliente && this.isPermisoGuardarCambiosAnticipoCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAnticipoCliente() {
		if(AnticipoClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAnticipoCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAnticipoCliente() {
	}
	
	public void jTableDatosAnticipoClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAnticipoCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.anticipocliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaAnticipoClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebAnticipoCliente(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAnticipoCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAnticipoCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.anticipoclienteLogic.getConnexion());

				if(this.anticipocliente.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.anticipocliente.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAnticipoCliente=(TitledBorder)this.jScrollPanelDatosAnticipoCliente.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderAnticipoCliente.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaAnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.anticipocliente.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoAnticipoClienteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderAnticipoCliente=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosAnticipoCliente.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderAnticipoCliente=(TitledBorder)this.jScrollPanelDatosAnticipoCliente.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderAnticipoCliente.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoAnticipoClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebAnticipoCliente(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAnticipoCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAnticipoCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.anticipoclienteLogic.getConnexion());

				if(this.anticipocliente.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.anticipocliente.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAnticipoCliente=(TitledBorder)this.jScrollPanelDatosAnticipoCliente.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderAnticipoCliente.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoAnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.anticipocliente.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_anti_clienteAnticipoClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadoanticliente=true;

			idTienePermisoestadoanticliente=this.tienePermisosUsuarioEnPaginaWebAnticipoCliente(EstadoAntiClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadoanticliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAnticipoCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAnticipoCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);

				this.estadoanticlienteBeanSwingJInternalFrame=new EstadoAntiClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadoanticlienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadoanticlienteBeanSwingJInternalFrame.getEstadoAntiClienteLogic().setConnexion(this.anticipoclienteLogic.getConnexion());

				if(this.anticipocliente.getid_estado_anti_cliente()!=null) {
					this.estadoanticlienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadoanticlienteBeanSwingJInternalFrame.setIdActual(this.anticipocliente.getid_estado_anti_cliente());
					this.estadoanticlienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadoanticlienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadoanticlienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoAntiCliente();
				}

				JInternalFrameBase jinternalFrame =this.estadoanticlienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAnticipoCliente=(TitledBorder)this.jScrollPanelDatosAnticipoCliente.getBorder();
				TitledBorder titledBorderestadoanticliente=(TitledBorder)this.estadoanticlienteBeanSwingJInternalFrame.jScrollPanelDatosEstadoAntiCliente.getBorder();

				titledBorderestadoanticliente.setTitle(titledBorderAnticipoCliente.getTitle() + " -> Estado Anti Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_anti_clienteAnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getid_estado_anti_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_anti_cliente = "+this.anticipocliente.getid_estado_anti_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_grupo_forma_pagoAnticipoClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipogrupoformapago=true;

			idTienePermisotipogrupoformapago=this.tienePermisosUsuarioEnPaginaWebAnticipoCliente(TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipogrupoformapago) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAnticipoCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAnticipoCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);

				this.tipogrupoformapagoBeanSwingJInternalFrame=new TipoGrupoFormaPagoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipogrupoformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipogrupoformapagoBeanSwingJInternalFrame.getTipoGrupoFormaPagoLogic().setConnexion(this.anticipoclienteLogic.getConnexion());

				if(this.anticipocliente.getid_tipo_grupo_forma_pago()!=null) {
					this.tipogrupoformapagoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipogrupoformapagoBeanSwingJInternalFrame.setIdActual(this.anticipocliente.getid_tipo_grupo_forma_pago());
					this.tipogrupoformapagoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipogrupoformapagoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipogrupoformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoGrupoFormaPago();
				}

				JInternalFrameBase jinternalFrame =this.tipogrupoformapagoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAnticipoCliente=(TitledBorder)this.jScrollPanelDatosAnticipoCliente.getBorder();
				TitledBorder titledBordertipogrupoformapago=(TitledBorder)this.tipogrupoformapagoBeanSwingJInternalFrame.jScrollPanelDatosTipoGrupoFormaPago.getBorder();

				titledBordertipogrupoformapago.setTitle(titledBorderAnticipoCliente.getTitle() + " -> Tipo Grupo Forma Pago");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_grupo_forma_pagoAnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getid_tipo_grupo_forma_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_grupo_forma_pago = "+this.anticipocliente.getid_tipo_grupo_forma_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaAnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.anticipocliente.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorAnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.anticipocliente.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionAnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.anticipocliente.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_adicionalAnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getvalor_adicional()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_adicional = "+this.anticipocliente.getvalor_adicional().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_prestamoAnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getvalor_prestamo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_prestamo = "+this.anticipocliente.getvalor_prestamo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoningreso1AnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getingreso1()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ingreso1 = "+this.anticipocliente.getingreso1().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoningreso2AnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getingreso2()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ingreso2 = "+this.anticipocliente.getingreso2().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoningreso3AnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getingreso3()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ingreso3 = "+this.anticipocliente.getingreso3().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoningreso4AnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getingreso4()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ingreso4 = "+this.anticipocliente.getingreso4().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoningreso5AnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getingreso5()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ingreso5 = "+this.anticipocliente.getingreso5().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuento1AnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getdescuento1()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento1 = "+this.anticipocliente.getdescuento1().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuento2AnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getdescuento2()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento2 = "+this.anticipocliente.getdescuento2().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuento3AnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getdescuento3()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento3 = "+this.anticipocliente.getdescuento3().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuento4AnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getdescuento4()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento4 = "+this.anticipocliente.getdescuento4().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuento5AnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.getdescuento5()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento5 = "+this.anticipocliente.getdescuento5().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipo_ingresoAnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.gettipo_ingreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo_ingreso = "+this.anticipocliente.gettipo_ingreso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipo_descuentoAnticipoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.getanticipocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anticipocliente==null) {
						this.anticipocliente = new AnticipoCliente();
					}

					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);
				}

				if(this.anticipocliente.gettipo_descuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo_descuento = "+this.anticipocliente.gettipo_descuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnticipoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAnticipoCliente(false,false);

			this.getAnticipoClientesFK_IdEmpleado();

			this.inicializarActualizarBindingAnticipoCliente(false);

			//if(AnticipoClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAnticipoCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAnticipoCliente(false,false);

			this.getAnticipoClientesFK_IdEmpresa();

			this.inicializarActualizarBindingAnticipoCliente(false);

			//if(AnticipoClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAnticipoCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoAntiClienteAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAnticipoCliente(false,false);

			this.getAnticipoClientesFK_IdEstadoAntiCliente();

			this.inicializarActualizarBindingAnticipoCliente(false);

			//if(AnticipoClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAnticipoCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoGrupoFormaPagoAnticipoClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAnticipoCliente(false,false);

			this.getAnticipoClientesFK_IdTipoGrupoFormaPago();

			this.inicializarActualizarBindingAnticipoCliente(false);

			//if(AnticipoClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAnticipoCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anticipoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameAnticipoCliente() {
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
			this.jInternalFrameDetalleFormAnticipoCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormAnticipoCliente.dispose();
			this.jInternalFrameDetalleFormAnticipoCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAnticipoCliente!=null) {
			this.jInternalFrameReporteDinamicoAnticipoCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAnticipoCliente.dispose();
			this.jInternalFrameReporteDinamicoAnticipoCliente=null;
		}
		
		if(this.jInternalFrameImportacionAnticipoCliente!=null) {
			this.jInternalFrameImportacionAnticipoCliente.setVisible(false);	    			
			this.jInternalFrameImportacionAnticipoCliente.dispose();
			this.jInternalFrameImportacionAnticipoCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAnticipoCliente();
			
			AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoAnticipoCliente")) {
				jButtonNuevoAnticipoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAnticipoCliente")) {
				jButtonDuplicarAnticipoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAnticipoCliente")) {
				jButtonCopiarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormAnticipoCliente")) {
				jButtonVerFormAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAnticipoCliente")) {
				jButtonNuevoAnticipoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAnticipoCliente")) {
				jButtonDuplicarAnticipoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAnticipoCliente")) {
				jButtonNuevoAnticipoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAnticipoCliente")) {
				jButtonDuplicarAnticipoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAnticipoCliente")) {
				jButtonNuevoAnticipoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAnticipoCliente")) {
				jButtonNuevoAnticipoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAnticipoCliente")) {
				jButtonNuevoAnticipoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAnticipoCliente")) {
				jButtonModificarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAnticipoCliente")) {
				jButtonModificarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAnticipoCliente")) {
				jButtonModificarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAnticipoCliente")) {
				jButtonActualizarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAnticipoCliente")) {
				jButtonActualizarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAnticipoCliente")) {
				jButtonActualizarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarAnticipoCliente")) {
				jButtonEliminarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAnticipoCliente")) {
				jButtonEliminarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAnticipoCliente")) {
				jButtonEliminarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarAnticipoCliente")) {
				jButtonCancelarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAnticipoCliente")) {
				jButtonCancelarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAnticipoCliente")) {
				jButtonCancelarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarAnticipoCliente")) {
				jButtonCerrarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAnticipoCliente")) {
				jButtonCerrarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAnticipoCliente")) {
				jButtonCerrarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAnticipoCliente")) {
				jButtonMostrarOcultarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAnticipoCliente")) {
				jButtonCancelarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAnticipoCliente")) {
				jButtonGuardarCambiosAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAnticipoCliente")) {
				jButtonGuardarCambiosAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAnticipoCliente")) {
				jButtonCopiarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAnticipoCliente")) {
				jButtonVerFormAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAnticipoCliente")) {
				jButtonGuardarCambiosAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAnticipoCliente")) {
				jButtonCopiarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAnticipoCliente")) {
				jButtonVerFormAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAnticipoCliente")) {
				jButtonGuardarCambiosAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAnticipoCliente")) {
				jButtonGuardarCambiosAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAnticipoCliente")) {
				jButtonGuardarCambiosAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAnticipoCliente")) {
				jButtonRecargarInformacionAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAnticipoCliente")) {
				jButtonRecargarInformacionAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAnticipoCliente")) {
				jButtonRecargarInformacionAnticipoClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAnticipoCliente")) {
				jButtonAnterioresAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAnticipoCliente")) {
				jButtonAnterioresAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAnticipoCliente")) {
				jButtonAnterioresAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAnticipoCliente")) {
				jButtonSiguientesAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAnticipoCliente")) {
				jButtonSiguientesAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAnticipoCliente")) {
				jButtonSiguientesAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAnticipoCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByAnticipoCliente")) {
				jButtonAbrirOrderByAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAnticipoCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarAnticipoCliente")) {
				jButtonMostrarOcultarAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAnticipoCliente")) {
				jButtonNuevoGuardarCambiosAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAnticipoCliente")) {
				jButtonNuevoGuardarCambiosAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAnticipoCliente")) {
				jButtonNuevoGuardarCambiosAnticipoClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAnticipoCliente")) {
				jButtonCerrarReporteDinamicoAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAnticipoCliente")) {
				jButtonGenerarReporteDinamicoAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAnticipoCliente")) {
				
				jButtonGenerarExcelReporteDinamicoAnticipoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAnticipoCliente")) {
				jButtonCerrarImportacionAnticipoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAnticipoCliente")) {
				
				jButtonGenerarImportacionAnticipoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAnticipoCliente")) {
				
				jButtonAbrirImportacionAnticipoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAnticipoCliente")) {
				jComboBoxTiposAccionesAnticipoClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAnticipoCliente")) {
				jComboBoxTiposRelacionesAnticipoClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAnticipoCliente")) {
				jComboBoxTiposAccionesAnticipoClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAnticipoCliente")) {
				
				jComboBoxTiposSeleccionarAnticipoClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAnticipoCliente")) {
				jTextFieldValorCampoGeneralAnticipoClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAnticipoCliente")) {
				jButtonAbrirOrderByAnticipoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAnticipoCliente")) {
				jButtonAbrirOrderByAnticipoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAnticipoCliente")) {
				jButtonCerrarOrderByAnticipoClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAnticipoClienteBusqueda")) {
				this.jButtonidAnticipoClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAnticipoClienteUpdate")) {
				this.jButtonid_empresaAnticipoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAnticipoClienteBusqueda")) {
				this.jButtonid_empresaAnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoAnticipoCliente")) {
				this.jButtonid_empleadoAnticipoClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoAnticipoClienteUpdate")) {
				this.jButtonid_empleadoAnticipoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoAnticipoClienteBusqueda")) {
				this.jButtonid_empleadoAnticipoClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_anti_clienteAnticipoClienteUpdate")) {
				this.jButtonid_estado_anti_clienteAnticipoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_anti_clienteAnticipoClienteBusqueda")) {
				this.jButtonid_estado_anti_clienteAnticipoClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_grupo_forma_pagoAnticipoClienteUpdate")) {
				this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_grupo_forma_pagoAnticipoClienteBusqueda")) {
				this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaAnticipoClienteBusqueda")) {
				this.jButtonfechaAnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorAnticipoClienteBusqueda")) {
				this.jButtonvalorAnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionAnticipoClienteBusqueda")) {
				this.jButtondescripcionAnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_adicionalAnticipoClienteBusqueda")) {
				this.jButtonvalor_adicionalAnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_prestamoAnticipoClienteBusqueda")) {
				this.jButtonvalor_prestamoAnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingreso1AnticipoClienteBusqueda")) {
				this.jButtoningreso1AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingreso2AnticipoClienteBusqueda")) {
				this.jButtoningreso2AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingreso3AnticipoClienteBusqueda")) {
				this.jButtoningreso3AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingreso4AnticipoClienteBusqueda")) {
				this.jButtoningreso4AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingreso5AnticipoClienteBusqueda")) {
				this.jButtoningreso5AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento1AnticipoClienteBusqueda")) {
				this.jButtondescuento1AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento2AnticipoClienteBusqueda")) {
				this.jButtondescuento2AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento3AnticipoClienteBusqueda")) {
				this.jButtondescuento3AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento4AnticipoClienteBusqueda")) {
				this.jButtondescuento4AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento5AnticipoClienteBusqueda")) {
				this.jButtondescuento5AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_ingresoAnticipoClienteBusqueda")) {
				this.jButtontipo_ingresoAnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_descuentoAnticipoClienteBusqueda")) {
				this.jButtontipo_descuentoAnticipoClienteBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoAnticipoCliente")) {
				this.jButtonid_empleadoAnticipoClienteActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoAnticipoCliente")) {
				this.jButtonFK_IdEmpleadoAnticipoClienteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstadoAntiClienteAnticipoCliente")) {
				this.jButtonFK_IdEstadoAntiClienteAnticipoClienteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoGrupoFormaPagoAnticipoCliente")) {
				this.jButtonFK_IdTipoGrupoFormaPagoAnticipoClienteActionPerformed(evt);
			}
			
			;
			
			
			AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAnticipoCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnticipoClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipocliente);
				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
				
				


				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AnticipoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AnticipoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			AnticipoCliente anticipoclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				anticipoclienteLocal=this.anticipocliente;
			} else {
				anticipoclienteLocal=this.anticipoclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipocliente);
				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
							
				
				


				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AnticipoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AnticipoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnticipoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteAnterior =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anticipoclienteAnterior =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
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
			
			AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
			
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
			
			


			
			AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnticipoClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipocliente);
				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
								
						
				


				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AnticipoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AnticipoCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipocliente);
				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
								
				
				


				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AnticipoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AnticipoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnticipoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteAnterior =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anticipoclienteAnterior =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipocliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnticipoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteAnterior =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anticipoclienteAnterior =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnticipoClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.anticipocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipocliente);
				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
							
				
				


				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AnticipoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AnticipoCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnticipoClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipoclienteAnterior =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.anticipoclienteAnterior =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
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
			
			AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
			
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
			
			


			
			AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnticipoClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.anticipocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipocliente);
				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
								
				
				


				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AnticipoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AnticipoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnticipoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteAnterior =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anticipoclienteAnterior =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnticipoClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.anticipocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnticipoClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipocliente);
				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAnticipoCliente")) {
					jCheckBoxSeleccionarTodosAnticipoClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAnticipoCliente")) {
					jCheckBoxSeleccionadosAnticipoClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAnticipoCliente")) {
					
				}
				
				


				
				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AnticipoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AnticipoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipocliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.anticipocliente);
				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
												
				
				


				
				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AnticipoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AnticipoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnticipoClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anticipoclienteAnterior =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.anticipoclienteAnterior =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnticipoClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipocliente);
				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
				
				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
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
			
			AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
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
			
			


			
			AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnticipoClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipocliente);
				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AnticipoCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AnticipoCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anticipocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anticipocliente);
				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
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
				
				


				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AnticipoCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AnticipoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnticipoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anticipoclienteAnterior =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anticipoclienteAnterior =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAnticipoCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAnticipoClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAnticipoCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.anticipocliente =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.anticipocliente =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.anticipocliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAnticipoCliente")) {
				
				}
				
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAnticipoCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAnticipoCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAnticipoCliente")) {
			
			}
			
			AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAnticipoCliente();
			
			AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
			
			if(sTipo.equals("NuevoAnticipoCliente")) {
				jButtonNuevoAnticipoClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAnticipoCliente")) {
				jButtonDuplicarAnticipoClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAnticipoCliente")) {
				jButtonCopiarAnticipoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAnticipoCliente")) {
				jButtonVerFormAnticipoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAnticipoCliente")) {
				jButtonNuevoAnticipoClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAnticipoCliente")) {
				jButtonModificarAnticipoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAnticipoCliente")) {
				jButtonActualizarAnticipoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAnticipoCliente")) {
				jButtonEliminarAnticipoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAnticipoCliente")) {
				jButtonGuardarCambiosAnticipoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAnticipoCliente")) {
				jButtonCancelarAnticipoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAnticipoCliente")) {
				jButtonCerrarAnticipoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAnticipoCliente")) {
				jButtonGuardarCambiosAnticipoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAnticipoCliente")) {
				jButtonNuevoGuardarCambiosAnticipoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAnticipoCliente")) {
				jButtonAbrirOrderByAnticipoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAnticipoCliente")) {
				jButtonRecargarInformacionAnticipoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAnticipoCliente")) {
				jButtonAnterioresAnticipoClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAnticipoCliente")) {
				jButtonSiguientesAnticipoClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAnticipoClienteBusqueda")) {
				this.jButtonidAnticipoClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAnticipoClienteUpdate")) {
				this.jButtonid_empresaAnticipoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAnticipoClienteBusqueda")) {
				this.jButtonid_empresaAnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoAnticipoCliente")) {
				this.jButtonid_empleadoAnticipoClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoAnticipoClienteUpdate")) {
				this.jButtonid_empleadoAnticipoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoAnticipoClienteBusqueda")) {
				this.jButtonid_empleadoAnticipoClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_anti_clienteAnticipoClienteUpdate")) {
				this.jButtonid_estado_anti_clienteAnticipoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_anti_clienteAnticipoClienteBusqueda")) {
				this.jButtonid_estado_anti_clienteAnticipoClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_grupo_forma_pagoAnticipoClienteUpdate")) {
				this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_grupo_forma_pagoAnticipoClienteBusqueda")) {
				this.jButtonid_tipo_grupo_forma_pagoAnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaAnticipoClienteBusqueda")) {
				this.jButtonfechaAnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorAnticipoClienteBusqueda")) {
				this.jButtonvalorAnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionAnticipoClienteBusqueda")) {
				this.jButtondescripcionAnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_adicionalAnticipoClienteBusqueda")) {
				this.jButtonvalor_adicionalAnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_prestamoAnticipoClienteBusqueda")) {
				this.jButtonvalor_prestamoAnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingreso1AnticipoClienteBusqueda")) {
				this.jButtoningreso1AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingreso2AnticipoClienteBusqueda")) {
				this.jButtoningreso2AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingreso3AnticipoClienteBusqueda")) {
				this.jButtoningreso3AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingreso4AnticipoClienteBusqueda")) {
				this.jButtoningreso4AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingreso5AnticipoClienteBusqueda")) {
				this.jButtoningreso5AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento1AnticipoClienteBusqueda")) {
				this.jButtondescuento1AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento2AnticipoClienteBusqueda")) {
				this.jButtondescuento2AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento3AnticipoClienteBusqueda")) {
				this.jButtondescuento3AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento4AnticipoClienteBusqueda")) {
				this.jButtondescuento4AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento5AnticipoClienteBusqueda")) {
				this.jButtondescuento5AnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_ingresoAnticipoClienteBusqueda")) {
				this.jButtontipo_ingresoAnticipoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_descuentoAnticipoClienteBusqueda")) {
				this.jButtontipo_descuentoAnticipoClienteBusquedaActionPerformed(evt);
			}
			
			AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAnticipoCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAnticipoCliente")) {
				closingInternalFrameAnticipoCliente();
				
			} else if(sTipo.equals("jButtonCancelarAnticipoCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormAnticipoCliente = (JInternalFrameBase)evt.getSource();
	            	
	            AnticipoClienteBeanSwingJInternalFrame jInternalFrameParent=(AnticipoClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormAnticipoCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAnticipoClienteActionPerformed(null);
			}
			
			AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.anticipocliente,new Object(),this.anticipoclienteParameterGeneral,this.anticipoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAnticipoCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAnticipoCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAnticipoCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.anticipocliente)) {
			if(!esControlTabla) {
				if(AnticipoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);			
				}
				
				if(this.anticipoclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAnticipoCliente(this.anticipocliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.anticipoclienteReturnGeneral=anticipoclienteLogic.procesarEventosAnticipoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.anticipoclienteLogic.getAnticipoClientes(),this.anticipocliente,this.anticipoclienteParameterGeneral,this.isEsNuevoAnticipoCliente,classes);//this.anticipoclienteLogic.getAnticipoCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAnticipoCliente(this.anticipoclienteReturnGeneral,this.anticipoclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.anticipoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAnticipoCliente(classes,this.anticipoclienteReturnGeneral,this.anticipoclienteBean,false);
					}
						
					if(this.anticipoclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAnticipoCliente(this.anticipoclienteReturnGeneral.getAnticipoCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAnticipoCliente(this.anticipoclienteReturnGeneral.getAnticipoCliente());	
					}
						
					if(this.anticipoclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAnticipoCliente(this.anticipoclienteReturnGeneral.getAnticipoCliente(),classes);//this.anticipoclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAnticipoCliente(this.anticipocliente,classes);//this.anticipoclienteBean);									
				}
			
				if(AnticipoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAnticipoCliente(this.anticipocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAnticipoCliente(this.anticipocliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.anticipoclienteAnterior!=null) {
						this.anticipocliente=this.anticipoclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.anticipoclienteReturnGeneral=anticipoclienteLogic.procesarEventosAnticipoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.anticipoclienteLogic.getAnticipoClientes(),this.anticipocliente,this.anticipoclienteParameterGeneral,this.isEsNuevoAnticipoCliente,classes);//this.anticipoclienteLogic.getAnticipoCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.anticipoclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.anticipoclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.anticipoclienteReturnGeneral.getAnticipoCliente(),anticipoclienteLogic.getAnticipoClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.anticipoclienteReturnGeneral.getAnticipoCliente(),this.anticipoclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAnticipoCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosAnticipoCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAnticipoCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosAnticipoCliente() throws Exception {
		
		AnticipoClienteModel anticipoclienteModel=(AnticipoClienteModel)this.jTableDatosAnticipoCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			anticipoclienteModel.anticipoclientes=this.anticipoclienteLogic.getAnticipoClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			anticipoclienteModel.anticipoclientes=this.anticipoclientes;
		}
		
		
		((AnticipoClienteModel) this.jTableDatosAnticipoCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAnticipoCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getanticipoclienteAnterior(),this.anticipoclienteLogic.getAnticipoClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getanticipoclienteAnterior(),this.anticipoclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAnticipoCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAnticipoCliente(AnticipoCliente anticipocliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
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
										
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.anticipocliente,new Object(),generalEntityParameterGeneral,this.anticipoclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.anticipoclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AnticipoClienteConstantesFunciones.getClassesRelationshipsOfAnticipoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AnticipoClienteConstantesFunciones.getClassesRelationshipsFromStringsOfAnticipoCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAnticipoCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AnticipoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.anticipocliente,new Object(),generalEntityParameterGeneral,this.anticipoclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAnticipoCliente(AnticipoClienteBean anticipoclienteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAnticipoCliente(ArrayList<Classe> classes,AnticipoClienteReturnGeneral anticipoclienteReturnGeneral,AnticipoClienteBean anticipoclienteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAnticipoCliente(AnticipoCliente anticipocliente,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.anticipocliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAnticipoCliente = new AnticipoClienteDetalleFormJInternalFrame(jDesktopPane,this.anticipoclienteSessionBean.getConGuardarRelaciones(),this.anticipoclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.setVisible(false);
		this.jInternalFrameDetalleFormAnticipoCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormAnticipoCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAnticipoCliente.anticipoclienteLogic=this.anticipoclienteLogic;
		
		this.cargarCombosFrameForeignKeyAnticipoCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAnticipoCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAnticipoCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAnticipoCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAnticipoCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAnticipoCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAnticipoCliente"));
		
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonModificarAnticipoCliente.addActionListener(new ButtonActionListener(this,"ModificarAnticipoCliente"));

		
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonModificarToolBarAnticipoCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarAnticipoCliente"));
					
		this.jInternalFrameDetalleFormAnticipoCliente.jMenuItemModificarAnticipoCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarAnticipoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonActualizarAnticipoCliente.addActionListener (new ButtonActionListener(this,"ActualizarAnticipoCliente"));
		
		
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonActualizarToolBarAnticipoCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAnticipoCliente"));
						
		this.jInternalFrameDetalleFormAnticipoCliente.jMenuItemActualizarAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAnticipoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonEliminarAnticipoCliente.addActionListener (new ButtonActionListener(this,"EliminarAnticipoCliente"));
		
		
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonEliminarToolBarAnticipoCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarAnticipoCliente"));
								
		this.jInternalFrameDetalleFormAnticipoCliente.jMenuItemEliminarAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAnticipoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonCancelarAnticipoCliente.addActionListener (new ButtonActionListener(this,"CancelarAnticipoCliente"));
		
		
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonCancelarToolBarAnticipoCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarAnticipoCliente"));
					
		this.jInternalFrameDetalleFormAnticipoCliente.jMenuItemCancelarAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAnticipoCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAnticipoCliente.jMenuItemDetalleCerrarAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAnticipoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonGuardarCambiosToolBarAnticipoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAnticipoCliente"));
		
		
		
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonGuardarCambiosToolBarAnticipoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAnticipoCliente"));
		
		
		
		this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxTiposAccionesFormularioAnticipoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAnticipoCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonidAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idAnticipoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_empresaAnticipoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAnticipoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_empresaAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAnticipoClienteBusqueda"));
		//jButtonid_empleadoAnticipoCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoAnticipoClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_empleadoAnticipoCliente.addActionListener(new ButtonActionListener(this,"id_empleadoAnticipoCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_empleadoAnticipoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoAnticipoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_empleadoAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoAnticipoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_estado_anti_clienteAnticipoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_estado_anti_clienteAnticipoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_estado_anti_clienteAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_anti_clienteAnticipoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_tipo_grupo_forma_pagoAnticipoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_forma_pagoAnticipoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_tipo_grupo_forma_pagoAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_forma_pagoAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonfechaAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"fechaAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonvalorAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"valorAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtondescripcionAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonvalor_adicionalAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"valor_adicionalAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonvalor_prestamoAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"valor_prestamoAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtoningreso1AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"ingreso1AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtoningreso2AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"ingreso2AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtoningreso3AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"ingreso3AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtoningreso4AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"ingreso4AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtoningreso5AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"ingreso5AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtondescuento1AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descuento1AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtondescuento2AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descuento2AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtondescuento3AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descuento3AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtondescuento4AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descuento4AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtondescuento5AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descuento5AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtontipo_ingresoAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"tipo_ingresoAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtontipo_descuentoAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"tipo_descuentoAnticipoClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAnticipoCliente.jTabbedPaneRelacionesAnticipoCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAnticipoCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAnticipoCliente"));
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipoCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAnticipoCliente"));
		}
		
		this.jTableDatosAnticipoCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAnticipoCliente"));
		
		this.jTableDatosAnticipoCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAnticipoCliente"));
		
		this.jButtonNuevoAnticipoCliente.addActionListener(new ButtonActionListener(this,"NuevoAnticipoCliente"));
		
		this.jButtonDuplicarAnticipoCliente.addActionListener(new ButtonActionListener(this,"DuplicarAnticipoCliente"));
		
		this.jButtonCopiarAnticipoCliente.addActionListener(new ButtonActionListener(this,"CopiarAnticipoCliente"));
		
		this.jButtonVerFormAnticipoCliente.addActionListener(new ButtonActionListener(this,"VerFormAnticipoCliente"));
		
		
		this.jButtonNuevoToolBarAnticipoCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarAnticipoCliente"));
			
		this.jButtonDuplicarToolBarAnticipoCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAnticipoCliente"));
			
		this.jMenuItemNuevoAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAnticipoCliente"));
			
		this.jMenuItemDuplicarAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAnticipoCliente"));		
		
		
		this.jButtonNuevoRelacionesAnticipoCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAnticipoCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarAnticipoCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAnticipoCliente"));
			
		this.jMenuItemNuevoRelacionesAnticipoCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAnticipoCliente"));		
		
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonModificarAnticipoCliente.addActionListener(new ButtonActionListener(this,"ModificarAnticipoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonModificarToolBarAnticipoCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarAnticipoCliente"));
			
			this.jInternalFrameDetalleFormAnticipoCliente.jMenuItemModificarAnticipoCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarAnticipoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonActualizarAnticipoCliente.addActionListener (new ButtonActionListener(this,"ActualizarAnticipoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonActualizarToolBarAnticipoCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAnticipoCliente"));
				
			this.jInternalFrameDetalleFormAnticipoCliente.jMenuItemActualizarAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAnticipoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonEliminarAnticipoCliente.addActionListener (new ButtonActionListener(this,"EliminarAnticipoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonEliminarToolBarAnticipoCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarAnticipoCliente"));
						
			this.jInternalFrameDetalleFormAnticipoCliente.jMenuItemEliminarAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAnticipoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonCancelarAnticipoCliente.addActionListener (new ButtonActionListener(this,"CancelarAnticipoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonCancelarToolBarAnticipoCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarAnticipoCliente"));
			
			this.jInternalFrameDetalleFormAnticipoCliente.jMenuItemCancelarAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAnticipoCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAnticipoCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAnticipoCliente"));		
		
		
		this.jButtonCerrarAnticipoCliente.addActionListener (new ButtonActionListener(this,"CerrarAnticipoCliente"));
		
		
		this.jButtonCerrarToolBarAnticipoCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarAnticipoCliente"));
			
		this.jMenuItemCerrarAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAnticipoCliente"));
			
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipoCliente.jMenuItemDetalleCerrarAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAnticipoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonGuardarCambiosAnticipoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosAnticipoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonGuardarCambiosToolBarAnticipoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAnticipoCliente"));
		}
		
		this.jButtonCopiarToolBarAnticipoCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarAnticipoCliente"));
			
		this.jButtonVerFormToolBarAnticipoCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarAnticipoCliente"));
		
		this.jMenuItemGuardarCambiosAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAnticipoCliente"));
			
		this.jMenuItemCopiarAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAnticipoCliente"));		
		
		this.jMenuItemVerFormAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAnticipoCliente"));		
		
		
		this.jButtonGuardarCambiosTablaAnticipoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAnticipoCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAnticipoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAnticipoCliente"));
			
		this.jMenuItemGuardarCambiosTablaAnticipoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAnticipoCliente"));		
		
		
		
		this.jButtonRecargarInformacionAnticipoCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionAnticipoCliente"));
					
		this.jButtonRecargarInformacionToolBarAnticipoCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAnticipoCliente"));
		
		this.jMenuItemRecargarInformacionAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAnticipoCliente"));		
		
		
		
		this.jButtonAnterioresAnticipoCliente.addActionListener (new ButtonActionListener(this,"AnterioresAnticipoCliente"));
		
		
		this.jButtonAnterioresToolBarAnticipoCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAnticipoCliente"));
		
		this.jMenuItemAnterioresAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAnticipoCliente"));		
		
		
		this.jButtonSiguientesAnticipoCliente.addActionListener (new ButtonActionListener(this,"SiguientesAnticipoCliente"));
		
		
		this.jButtonSiguientesToolBarAnticipoCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAnticipoCliente"));
			
		this.jMenuItemSiguientesAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAnticipoCliente"));
			
		this.jMenuItemAbrirOrderByAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAnticipoCliente"));
			
		this.jMenuItemMostrarOcultarAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAnticipoCliente"));
			
		this.jMenuItemDetalleAbrirOrderByAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAnticipoCliente"));
			
		this.jMenuItemDetalleMostarOcultarAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAnticipoCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosAnticipoCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAnticipoCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAnticipoCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAnticipoCliente"));
			
		this.jMenuItemNuevoGuardarCambiosAnticipoCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAnticipoCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAnticipoCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAnticipoCliente"));

		this.jCheckBoxSeleccionadosAnticipoCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAnticipoCliente"));
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxTiposAccionesFormularioAnticipoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAnticipoCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesAnticipoCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesAnticipoCliente"));
			
		this.jComboBoxTiposAccionesAnticipoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesAnticipoCliente"));
					
		this.jComboBoxTiposSeleccionarAnticipoCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAnticipoCliente"));
			
		this.jTextFieldValorCampoGeneralAnticipoCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAnticipoCliente"));		
		
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonidAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idAnticipoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_empresaAnticipoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAnticipoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_empresaAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAnticipoClienteBusqueda"));
		//jButtonid_empleadoAnticipoCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoAnticipoClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_empleadoAnticipoCliente.addActionListener(new ButtonActionListener(this,"id_empleadoAnticipoCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_empleadoAnticipoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoAnticipoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_empleadoAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoAnticipoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_estado_anti_clienteAnticipoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_estado_anti_clienteAnticipoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_estado_anti_clienteAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_anti_clienteAnticipoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_tipo_grupo_forma_pagoAnticipoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_forma_pagoAnticipoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_tipo_grupo_forma_pagoAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_forma_pagoAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonfechaAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"fechaAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonvalorAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"valorAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtondescripcionAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonvalor_adicionalAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"valor_adicionalAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonvalor_prestamoAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"valor_prestamoAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtoningreso1AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"ingreso1AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtoningreso2AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"ingreso2AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtoningreso3AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"ingreso3AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtoningreso4AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"ingreso4AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtoningreso5AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"ingreso5AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtondescuento1AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descuento1AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtondescuento2AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descuento2AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtondescuento3AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descuento3AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtondescuento4AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descuento4AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtondescuento5AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descuento5AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtontipo_ingresoAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"tipo_ingresoAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtontipo_descuentoAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"tipo_descuentoAnticipoClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoAnticipoCliente.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoAnticipoCliente"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoAnticipoCliente.addActionListener(new ButtonActionListener(this,"id_empleadoAnticipoCliente"));

			this.jButtonFK_IdEstadoAntiClienteAnticipoCliente.addActionListener(new ButtonActionListener(this,"FK_IdEstadoAntiClienteAnticipoCliente"));

			this.jButtonFK_IdTipoGrupoFormaPagoAnticipoCliente.addActionListener(new ButtonActionListener(this,"FK_IdTipoGrupoFormaPagoAnticipoCliente"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAnticipoCliente!=null) {
				this.jInternalFrameReporteDinamicoAnticipoCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAnticipoCliente"));
				this.jInternalFrameReporteDinamicoAnticipoCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAnticipoCliente"));
				this.jInternalFrameReporteDinamicoAnticipoCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAnticipoCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoAnticipoCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAnticipoCliente"));				
			//this.jButtonGenerarReporteDinamicoAnticipoCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAnticipoCliente"));
			//this.jButtonGenerarExcelReporteDinamicoAnticipoCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAnticipoCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAnticipoCliente!=null) {
				this.jInternalFrameImportacionAnticipoCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAnticipoCliente"));
				this.jInternalFrameImportacionAnticipoCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAnticipoCliente"));
				this.jInternalFrameImportacionAnticipoCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAnticipoCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAnticipoCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByAnticipoCliente"));
			
			this.jButtonAbrirOrderByToolBarAnticipoCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAnticipoCliente"));			
			
			if(this.jInternalFrameOrderByAnticipoCliente!=null) {
				this.jInternalFrameOrderByAnticipoCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAnticipoCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnticipoCliente.jTabbedPaneRelacionesAnticipoCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAnticipoCliente"));
		
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
            		closingInternalFrameAnticipoCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAnticipoCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAnticipoCliente = (JInternalFrameBase)event.getSource();
	            	
	            AnticipoClienteBeanSwingJInternalFrame jInternalFrameParent=(AnticipoClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormAnticipoCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAnticipoClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAnticipoCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAnticipoClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAnticipoCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAnticipoCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAnticipoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAnticipoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAnticipoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAnticipoCliente";
		inputMap = this.jButtonNuevoAnticipoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAnticipoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAnticipoClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAnticipoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAnticipoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAnticipoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAnticipoCliente";
		inputMap = this.jButtonNuevoRelacionesAnticipoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAnticipoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAnticipoClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAnticipoCliente";
		inputMap = this.jButtonModificarAnticipoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAnticipoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAnticipoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAnticipoCliente";
		inputMap = this.jButtonActualizarAnticipoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAnticipoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAnticipoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAnticipoCliente";
		inputMap = this.jButtonEliminarAnticipoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAnticipoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAnticipoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAnticipoCliente";
		inputMap = this.jButtonCancelarAnticipoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAnticipoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAnticipoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAnticipoCliente";
		inputMap = this.jButtonCerrarAnticipoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAnticipoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAnticipoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonGuardarCambiosAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAnticipoCliente";
		inputMap = this.jInternalFrameDetalleFormAnticipoCliente.jButtonGuardarCambiosAnticipoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonGuardarCambiosAnticipoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAnticipoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAnticipoCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAnticipoClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAnticipoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAnticipoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAnticipoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAnticipoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAnticipoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAnticipoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonidAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idAnticipoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_empresaAnticipoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAnticipoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_empresaAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAnticipoClienteBusqueda"));
		//jButtonid_empleadoAnticipoCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoAnticipoClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_empleadoAnticipoCliente.addActionListener(new ButtonActionListener(this,"id_empleadoAnticipoCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_empleadoAnticipoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoAnticipoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_empleadoAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoAnticipoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_estado_anti_clienteAnticipoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_estado_anti_clienteAnticipoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_estado_anti_clienteAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_anti_clienteAnticipoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_tipo_grupo_forma_pagoAnticipoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_forma_pagoAnticipoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_tipo_grupo_forma_pagoAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_forma_pagoAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonfechaAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"fechaAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonvalorAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"valorAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtondescripcionAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonvalor_adicionalAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"valor_adicionalAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtonvalor_prestamoAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"valor_prestamoAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtoningreso1AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"ingreso1AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtoningreso2AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"ingreso2AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtoningreso3AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"ingreso3AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtoningreso4AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"ingreso4AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtoningreso5AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"ingreso5AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtondescuento1AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descuento1AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtondescuento2AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descuento2AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtondescuento3AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descuento3AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtondescuento4AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descuento4AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtondescuento5AnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"descuento5AnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtontipo_ingresoAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"tipo_ingresoAnticipoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnticipoCliente.jButtontipo_descuentoAnticipoClienteBusqueda.addActionListener(new ButtonActionListener(this,"tipo_descuentoAnticipoClienteBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoAnticipoCliente.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoAnticipoCliente"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoAnticipoCliente.addActionListener(new ButtonActionListener(this,"id_empleadoAnticipoCliente"));

		this.jButtonFK_IdEstadoAntiClienteAnticipoCliente.addActionListener(new ButtonActionListener(this,"FK_IdEstadoAntiClienteAnticipoCliente"));

		this.jButtonFK_IdTipoGrupoFormaPagoAnticipoCliente.addActionListener(new ButtonActionListener(this,"FK_IdTipoGrupoFormaPagoAnticipoCliente"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAnticipoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAnticipoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAnticipoClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAnticipoCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAnticipoCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(AnticipoCliente anticipoclienteAux:this.anticipoclienteLogic.getAnticipoClientes()) {
					anticipoclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AnticipoCliente anticipoclienteAux:anticipoclientes) {
					anticipoclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAnticipoClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAnticipoCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AnticipoCliente anticipoclienteAux:this.anticipoclienteLogic.getAnticipoClientes()) {
						anticipoclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AnticipoCliente anticipoclienteAux:anticipoclientes) {
						anticipoclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(AnticipoCliente anticipoclienteAux:this.anticipoclienteLogic.getAnticipoClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AnticipoCliente anticipoclienteAux:anticipoclientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAnticipoCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAnticipoCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAnticipoCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAnticipoClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAnticipoCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAnticipoCliente.getSelectedRows();
			
			AnticipoCliente anticipoclienteLocal=new AnticipoCliente();
			
			//this.seleccionarTodosAnticipoCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					anticipoclienteLocal =(AnticipoCliente) this.anticipoclienteLogic.getAnticipoClientes().toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					anticipoclienteLocal =(AnticipoCliente) this.anticipoclientes.toArray()[this.jTableDatosAnticipoCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				anticipoclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AnticipoCliente anticipoclienteAux:this.anticipoclienteLogic.getAnticipoClientes()) {
						anticipoclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AnticipoCliente anticipoclienteAux:anticipoclientes) {
						anticipoclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAnticipoCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAnticipoCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAnticipoCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAnticipoCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAnticipoClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAnticipoClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAnticipoClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAnticipoCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAnticipoCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AnticipoCliente anticipoclienteAux:this.anticipoclienteLogic.getAnticipoClientes()) {
				
						if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							anticipoclienteAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							anticipoclienteAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							anticipoclienteAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_VALORADICIONAL)) {
							existe=true;
							anticipoclienteAux.setvalor_adicional(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_VALORPRESTAMO)) {
							existe=true;
							anticipoclienteAux.setvalor_prestamo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_INGRESO1)) {
							existe=true;
							anticipoclienteAux.setingreso1(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_INGRESO2)) {
							existe=true;
							anticipoclienteAux.setingreso2(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_INGRESO3)) {
							existe=true;
							anticipoclienteAux.setingreso3(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_INGRESO4)) {
							existe=true;
							anticipoclienteAux.setingreso4(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_INGRESO5)) {
							existe=true;
							anticipoclienteAux.setingreso5(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO1)) {
							existe=true;
							anticipoclienteAux.setdescuento1(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO2)) {
							existe=true;
							anticipoclienteAux.setdescuento2(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO3)) {
							existe=true;
							anticipoclienteAux.setdescuento3(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO4)) {
							existe=true;
							anticipoclienteAux.setdescuento4(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO5)) {
							existe=true;
							anticipoclienteAux.setdescuento5(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_TIPOINGRESO)) {
							existe=true;
							anticipoclienteAux.settipo_ingreso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_TIPODESCUENTO)) {
							existe=true;
							anticipoclienteAux.settipo_descuento(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AnticipoCliente anticipoclienteAux:anticipoclientes) {
					
						if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							anticipoclienteAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							anticipoclienteAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							anticipoclienteAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_VALORADICIONAL)) {
							existe=true;
							anticipoclienteAux.setvalor_adicional(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_VALORPRESTAMO)) {
							existe=true;
							anticipoclienteAux.setvalor_prestamo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_INGRESO1)) {
							existe=true;
							anticipoclienteAux.setingreso1(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_INGRESO2)) {
							existe=true;
							anticipoclienteAux.setingreso2(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_INGRESO3)) {
							existe=true;
							anticipoclienteAux.setingreso3(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_INGRESO4)) {
							existe=true;
							anticipoclienteAux.setingreso4(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_INGRESO5)) {
							existe=true;
							anticipoclienteAux.setingreso5(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO1)) {
							existe=true;
							anticipoclienteAux.setdescuento1(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO2)) {
							existe=true;
							anticipoclienteAux.setdescuento2(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO3)) {
							existe=true;
							anticipoclienteAux.setdescuento3(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO4)) {
							existe=true;
							anticipoclienteAux.setdescuento4(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO5)) {
							existe=true;
							anticipoclienteAux.setdescuento5(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_TIPOINGRESO)) {
							existe=true;
							anticipoclienteAux.settipo_ingreso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_TIPODESCUENTO)) {
							existe=true;
							anticipoclienteAux.settipo_descuento(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAnticipoCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAnticipoClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAnticipoCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAnticipoCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAnticipoCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxTiposAccionesFormularioAnticipoCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAnticipoCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessAnticipoCliente(conSplash);
				
					this.generarReporteAnticipoClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAnticipoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxTiposAccionesFormularioAnticipoCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAnticipoClientesSeleccionados();
				//this.jComboBoxTiposAccionesAnticipoCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAnticipoClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesAnticipoCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAnticipoClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesAnticipoCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAnticipoCliente();
				
				this.exportarAnticipoClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAnticipoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxTiposAccionesFormularioAnticipoCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAnticipoClientes();
				//this.importarAnticipoClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAnticipoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxTiposAccionesFormularioAnticipoCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAnticipoCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAnticipoClientesSeleccionados();
				//this.jComboBoxTiposAccionesAnticipoCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Anticipo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAnticipoCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAnticipoCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAnticipoCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Anticipo Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAnticipoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxTiposAccionesFormularioAnticipoCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(AnticipoClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteAnticipoCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessAnticipoCliente(conSplash);
					
						//this.actualizarParametrosGeneralAnticipoCliente();
						
						this.generarReporteProcesoAccionAnticipoClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesAnticipoCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxTiposAccionesFormularioAnticipoCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AnticipoClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Anticipo ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Anticipo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessAnticipoCliente();
				
						this.actualizarParametrosGeneralAnticipoCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.anticipoclienteReturnGeneral=anticipoclienteLogic.procesarAccionAnticipoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.anticipoclienteLogic.getAnticipoClientes(),this.anticipoclienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAnticipoClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAnticipoCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxTiposAccionesFormularioAnticipoCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAnticipoCliente();
					
					AnticipoClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAnticipoClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAnticipoCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxTiposAccionesFormularioAnticipoCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAnticipoCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAnticipoClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAnticipoCliente();
			
			if(this.jInternalFrameDetalleFormAnticipoCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<AnticipoCliente> anticipoclientesSeleccionados=new ArrayList<AnticipoCliente>();		
			AnticipoCliente anticipocliente=new AnticipoCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAnticipoCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAnticipoCliente.getSelectedItem();
			
			
			
			
			anticipoclientesSeleccionados=this.getAnticipoClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(anticipoclientesSeleccionados.size()==1) {
				for(AnticipoCliente anticipoclienteAux:anticipoclientesSeleccionados) {
					anticipocliente=anticipoclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAnticipoCliente();
			
      		//this.finishProcessAnticipoCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAnticipoClienteReturnGeneral() throws Exception {
		if(this.anticipoclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.anticipoclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.anticipoclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.anticipoclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.anticipoclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.anticipoclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAnticipoCliente(false);
		}
		
		if(this.anticipoclienteReturnGeneral.getConRetornoLista() || this.anticipoclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.anticipoclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.anticipoclienteLogic.setAnticipoClientes(this.anticipoclienteReturnGeneral.getAnticipoClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.anticipoclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.anticipoclienteLogic.setAnticipoCliente(this.anticipoclienteReturnGeneral.getAnticipoCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingAnticipoCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralAnticipoCliente() throws Exception {
		
		
	}
	
	public ArrayList<AnticipoCliente> getAnticipoClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<AnticipoCliente> anticipoclientesSeleccionados=new ArrayList<AnticipoCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAnticipoCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(AnticipoCliente anticipoclienteAux:anticipoclienteLogic.getAnticipoClientes()) {
					if(anticipoclienteAux.getIsSelected()) {
						anticipoclientesSeleccionados.add(anticipoclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AnticipoCliente anticipoclienteAux:this.anticipoclientes) {
					if(anticipoclienteAux.getIsSelected()) {
						anticipoclientesSeleccionados.add(anticipoclienteAux);				
					}
				}
			}
			
			if(anticipoclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						anticipoclientesSeleccionados.addAll(this.anticipoclienteLogic.getAnticipoClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						anticipoclientesSeleccionados.addAll(this.anticipoclientes);				
					}
				}
			}
		} else {
			anticipoclientesSeleccionados.add(this.anticipocliente);
		}
		
		return anticipoclientesSeleccionados;
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
	
	public void generarReporteAnticipoClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAnticipoClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAnticipoClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAnticipoClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAnticipoClientesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Anticipo Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAnticipoClientesSeleccionados() throws Exception {
		ArrayList<AnticipoCliente> anticipoclientesSeleccionados=new ArrayList<AnticipoCliente>();		
		
		anticipoclientesSeleccionados=this.getAnticipoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAnticipoClientes("Todos",anticipoclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalAnticipoClientesSeleccionados() throws Exception {
		ArrayList<AnticipoCliente> anticipoclientesSeleccionados=new ArrayList<AnticipoCliente>();		
		
		anticipoclientesSeleccionados=this.getAnticipoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAnticipoClientes("Todos",anticipoclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAnticipoClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<AnticipoCliente> anticipoclientesSeleccionados=new ArrayList<AnticipoCliente>();
		
		anticipoclientesSeleccionados=this.getAnticipoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAnticipoClientes("Todos",anticipoclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAnticipoClientesSeleccionados() throws Exception {
		ArrayList<AnticipoCliente> anticipoclientesSeleccionados=new ArrayList<AnticipoCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAnticipoCliente();
		
		
		anticipoclientesSeleccionados=this.getAnticipoClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAnticipoCliente();
		
		
		//this.generarReporteAnticipoClientes("Todos",anticipoclientesSeleccionados ,anticipoclienteImplementable,anticipoclienteImplementableHome);
	}
	
	public void mostrarImportacionAnticipoClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAnticipoCliente();
		
		this.abrirFrameImportacionAnticipoCliente();		
		
			
		//this.generarReporteAnticipoClientes("Todos",anticipoclientesSeleccionados ,anticipoclienteImplementable,anticipoclienteImplementableHome);
	}
	
	public void importarAnticipoClientes() throws Exception {		
	
	}
	
	public void exportarAnticipoClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAnticipoClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAnticipoClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAnticipoClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Anticipo Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAnticipoClientesSeleccionados() throws Exception {
		ArrayList<AnticipoCliente> anticipoclientesSeleccionados=new ArrayList<AnticipoCliente>();		
		
		anticipoclientesSeleccionados=this.getAnticipoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anticipocliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAnticipoCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(AnticipoCliente anticipoclienteAux:anticipoclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAnticipoCliente(anticipoclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//anticipoclienteAux.setsDetalleGeneralEntityReporte(anticipoclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anticipo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAnticipoCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_IDESTADOANTICLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_VALORADICIONAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_VALORPRESTAMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_INGRESO1;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_INGRESO2;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_INGRESO3;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_INGRESO4;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_INGRESO5;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_DESCUENTO1;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_DESCUENTO2;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_DESCUENTO3;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_DESCUENTO4;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_DESCUENTO5;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_TIPOINGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnticipoClienteConstantesFunciones.LABEL_TIPODESCUENTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAnticipoCliente(AnticipoCliente anticipocliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=anticipocliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getestadoanticliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.gettipogrupoformapago_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getvalor_adicional().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getvalor_prestamo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getingreso1().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getingreso2().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getingreso3().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getingreso4().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getingreso5().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getdescuento1().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getdescuento2().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getdescuento3().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getdescuento4().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.getdescuento5().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.gettipo_ingreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anticipocliente.gettipo_descuento().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAnticipoClientesSeleccionados() throws Exception {
		ArrayList<AnticipoCliente> anticipoclientesSeleccionados=new ArrayList<AnticipoCliente>();		
		
		anticipoclientesSeleccionados=this.getAnticipoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anticipocliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("AnticipoClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAnticipoCliente(row);				
				iRow++;
			}				
			
			for(AnticipoCliente anticipoclienteAux:anticipoclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAnticipoCliente(anticipoclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anticipo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAnticipoClientesSeleccionados() throws Exception {
		ArrayList<AnticipoCliente> anticipoclientesSeleccionados=new ArrayList<AnticipoCliente>();		
		
		anticipoclientesSeleccionados=this.getAnticipoClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anticipocliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("anticipoclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("anticipocliente");
			//elementRoot.appendChild(element);
		
			for(AnticipoCliente anticipoclienteAux:anticipoclientesSeleccionados) {
				element = document.createElement("anticipocliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAnticipoCliente(anticipoclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anticipo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAnticipoCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_IDESTADOANTICLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_VALORADICIONAL);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_VALORPRESTAMO);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_INGRESO1);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_INGRESO2);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_INGRESO3);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_INGRESO4);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_INGRESO5);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO1);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO2);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO3);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO4);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_DESCUENTO5);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_TIPOINGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(AnticipoClienteConstantesFunciones.LABEL_TIPODESCUENTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAnticipoCliente(AnticipoCliente anticipocliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getestadoanticliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.gettipogrupoformapago_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getvalor_adicional());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getvalor_prestamo());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getingreso1());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getingreso2());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getingreso3());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getingreso4());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getingreso5());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getdescuento1());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getdescuento2());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getdescuento3());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getdescuento4());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.getdescuento5());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.gettipo_ingreso());
		cell = row.createCell(iColumn++);cell.setCellValue(anticipocliente.gettipo_descuento());				
	}
	
	public void setFilaDatosExportarXmlAnticipoCliente(AnticipoCliente anticipocliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AnticipoClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(anticipocliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AnticipoClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(anticipocliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(AnticipoClienteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(anticipocliente.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(AnticipoClienteConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(anticipocliente.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementestadoanticliente_descripcion = document.createElement(AnticipoClienteConstantesFunciones.IDESTADOANTICLIENTE);
		elementestadoanticliente_descripcion.appendChild(document.createTextNode(anticipocliente.getestadoanticliente_descripcion()));
		element.appendChild(elementestadoanticliente_descripcion);

		Element elementtipogrupoformapago_descripcion = document.createElement(AnticipoClienteConstantesFunciones.IDTIPOGRUPOFORMAPAGO);
		elementtipogrupoformapago_descripcion.appendChild(document.createTextNode(anticipocliente.gettipogrupoformapago_descripcion()));
		element.appendChild(elementtipogrupoformapago_descripcion);

		Element elementfecha = document.createElement(AnticipoClienteConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(anticipocliente.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementvalor = document.createElement(AnticipoClienteConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(anticipocliente.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementdescripcion = document.createElement(AnticipoClienteConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(anticipocliente.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementvalor_adicional = document.createElement(AnticipoClienteConstantesFunciones.VALORADICIONAL);
		elementvalor_adicional.appendChild(document.createTextNode(anticipocliente.getvalor_adicional().toString().trim()));
		element.appendChild(elementvalor_adicional);

		Element elementvalor_prestamo = document.createElement(AnticipoClienteConstantesFunciones.VALORPRESTAMO);
		elementvalor_prestamo.appendChild(document.createTextNode(anticipocliente.getvalor_prestamo().toString().trim()));
		element.appendChild(elementvalor_prestamo);

		Element elementingreso1 = document.createElement(AnticipoClienteConstantesFunciones.INGRESO1);
		elementingreso1.appendChild(document.createTextNode(anticipocliente.getingreso1().toString().trim()));
		element.appendChild(elementingreso1);

		Element elementingreso2 = document.createElement(AnticipoClienteConstantesFunciones.INGRESO2);
		elementingreso2.appendChild(document.createTextNode(anticipocliente.getingreso2().toString().trim()));
		element.appendChild(elementingreso2);

		Element elementingreso3 = document.createElement(AnticipoClienteConstantesFunciones.INGRESO3);
		elementingreso3.appendChild(document.createTextNode(anticipocliente.getingreso3().toString().trim()));
		element.appendChild(elementingreso3);

		Element elementingreso4 = document.createElement(AnticipoClienteConstantesFunciones.INGRESO4);
		elementingreso4.appendChild(document.createTextNode(anticipocliente.getingreso4().toString().trim()));
		element.appendChild(elementingreso4);

		Element elementingreso5 = document.createElement(AnticipoClienteConstantesFunciones.INGRESO5);
		elementingreso5.appendChild(document.createTextNode(anticipocliente.getingreso5().toString().trim()));
		element.appendChild(elementingreso5);

		Element elementdescuento1 = document.createElement(AnticipoClienteConstantesFunciones.DESCUENTO1);
		elementdescuento1.appendChild(document.createTextNode(anticipocliente.getdescuento1().toString().trim()));
		element.appendChild(elementdescuento1);

		Element elementdescuento2 = document.createElement(AnticipoClienteConstantesFunciones.DESCUENTO2);
		elementdescuento2.appendChild(document.createTextNode(anticipocliente.getdescuento2().toString().trim()));
		element.appendChild(elementdescuento2);

		Element elementdescuento3 = document.createElement(AnticipoClienteConstantesFunciones.DESCUENTO3);
		elementdescuento3.appendChild(document.createTextNode(anticipocliente.getdescuento3().toString().trim()));
		element.appendChild(elementdescuento3);

		Element elementdescuento4 = document.createElement(AnticipoClienteConstantesFunciones.DESCUENTO4);
		elementdescuento4.appendChild(document.createTextNode(anticipocliente.getdescuento4().toString().trim()));
		element.appendChild(elementdescuento4);

		Element elementdescuento5 = document.createElement(AnticipoClienteConstantesFunciones.DESCUENTO5);
		elementdescuento5.appendChild(document.createTextNode(anticipocliente.getdescuento5().toString().trim()));
		element.appendChild(elementdescuento5);

		Element elementtipo_ingreso = document.createElement(AnticipoClienteConstantesFunciones.TIPOINGRESO);
		elementtipo_ingreso.appendChild(document.createTextNode(anticipocliente.gettipo_ingreso().toString().trim()));
		element.appendChild(elementtipo_ingreso);

		Element elementtipo_descuento = document.createElement(AnticipoClienteConstantesFunciones.TIPODESCUENTO);
		elementtipo_descuento.appendChild(document.createTextNode(anticipocliente.gettipo_descuento().toString().trim()));
		element.appendChild(elementtipo_descuento);
	}
	
	public void generarReporteGroupGenericoAnticipoClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<AnticipoCliente> anticipoclientesSeleccionados=new ArrayList<AnticipoCliente>();
		
		anticipoclientesSeleccionados=this.getAnticipoClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAnticipoCliente(anticipoclientesSeleccionados);
		
		this.generarReporteAnticipoClientes("Todos",anticipoclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAnticipoCliente(ArrayList<AnticipoCliente> anticipoclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(AnticipoCliente anticipoclienteAux:anticipoclientesSeleccionados) {
				anticipoclienteAux.setsDetalleGeneralEntityReporte(anticipoclienteAux.toString());
			
				if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					anticipoclienteAux.setsDescripcionGeneralEntityReporte1(anticipoclienteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					anticipoclienteAux.setsDescripcionGeneralEntityReporte1(anticipoclienteAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_IDESTADOANTICLIENTE)) {
					existe=true;
					anticipoclienteAux.setsDescripcionGeneralEntityReporte1(anticipoclienteAux.getestadoanticliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO)) {
					existe=true;
					anticipoclienteAux.setsDescripcionGeneralEntityReporte1(anticipoclienteAux.gettipogrupoformapago_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					anticipoclienteAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(anticipoclienteAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(AnticipoClienteConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					anticipoclienteAux.setsDescripcionGeneralEntityReporte1(anticipoclienteAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnticipoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAnticipoCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAnticipoCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente=true;
				this.isVisibilidadCeldaGuardarCambiosAnticipoCliente=true;
			}
			
			this.isVisibilidadCeldaModificarAnticipoCliente=false;
			this.isVisibilidadCeldaActualizarAnticipoCliente=false;
			this.isVisibilidadCeldaEliminarAnticipoCliente=false;
			this.isVisibilidadCeldaCancelarAnticipoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnticipoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarAnticipoCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAnticipoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosAnticipoCliente=false;
			this.isVisibilidadCeldaModificarAnticipoCliente=false;
			this.isVisibilidadCeldaActualizarAnticipoCliente=true;
			this.isVisibilidadCeldaEliminarAnticipoCliente=false;
			this.isVisibilidadCeldaCancelarAnticipoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnticipoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarAnticipoCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAnticipoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosAnticipoCliente=false;
			this.isVisibilidadCeldaModificarAnticipoCliente=false;
			this.isVisibilidadCeldaActualizarAnticipoCliente=true;
			this.isVisibilidadCeldaEliminarAnticipoCliente=true;
			this.isVisibilidadCeldaCancelarAnticipoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnticipoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarAnticipoCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAnticipoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosAnticipoCliente=false;
			this.isVisibilidadCeldaModificarAnticipoCliente=false;
			this.isVisibilidadCeldaActualizarAnticipoCliente=true;
			this.isVisibilidadCeldaEliminarAnticipoCliente=false;
			this.isVisibilidadCeldaCancelarAnticipoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnticipoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarAnticipoCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAnticipoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente=true;
			this.isVisibilidadCeldaGuardarCambiosAnticipoCliente=true;
			this.isVisibilidadCeldaModificarAnticipoCliente=false;
			this.isVisibilidadCeldaActualizarAnticipoCliente=false;
			this.isVisibilidadCeldaEliminarAnticipoCliente=false;
			this.isVisibilidadCeldaCancelarAnticipoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnticipoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarAnticipoCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAnticipoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosAnticipoCliente=false;
			this.isVisibilidadCeldaActualizarAnticipoCliente=false;
			this.isVisibilidadCeldaEliminarAnticipoCliente=false;
			this.isVisibilidadCeldaCancelarAnticipoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnticipoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarAnticipoCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAnticipoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosAnticipoCliente=false;
			this.isVisibilidadCeldaModificarAnticipoCliente=true;
			this.isVisibilidadCeldaActualizarAnticipoCliente=false;
			this.isVisibilidadCeldaEliminarAnticipoCliente=false;
			this.isVisibilidadCeldaCancelarAnticipoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnticipoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarAnticipoCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AnticipoClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAnticipoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente=true;
			this.isVisibilidadCeldaGuardarCambiosAnticipoCliente=true;
		} else {
			this.actualizarEstadoPanelsAnticipoCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAnticipoCliente=false;
			//this.isVisibilidadCeldaVerFormAnticipoCliente=false;
			this.isVisibilidadCeldaDuplicarAnticipoCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!anticipoclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoAnticipoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosAnticipoCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(anticipoclienteSessionBean.getEsGuardarRelacionado()) {
			if(!anticipoclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente=false;												
			}
			
			this.jButtonCerrarAnticipoCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAnticipoCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.anticipocliente)) {
			this.isVisibilidadCeldaActualizarAnticipoCliente=false;
			this.isVisibilidadCeldaEliminarAnticipoCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAnticipoCliente() {
	}
	
	public void actualizarEstadoPanelsAnticipoCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAnticipoCliente!=null) {
				this.jScrollPanelDatosEdicionAnticipoCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAnticipoCliente!=null) {
				this.jTabbedPaneBusquedasAnticipoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAnticipoCliente!=null) {
				this.jScrollPanelDatosAnticipoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionAnticipoCliente!=null) {
				this.jPanelPaginacionAnticipoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAnticipoCliente!=null) {
				this.jPanelParametrosReportesAnticipoCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAnticipoCliente!=null) {
				this.jScrollPanelDatosEdicionAnticipoCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAnticipoCliente!=null) {
				this.jTabbedPaneBusquedasAnticipoCliente.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosAnticipoCliente!=null) {
				this.jScrollPanelDatosAnticipoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionAnticipoCliente!=null) {
				this.jPanelPaginacionAnticipoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAnticipoCliente!=null) {
				this.jPanelParametrosReportesAnticipoCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAnticipoCliente!=null) {
				this.jScrollPanelDatosEdicionAnticipoCliente.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAnticipoCliente!=null) {
				this.jTabbedPaneBusquedasAnticipoCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAnticipoCliente!=null) {
				this.jScrollPanelDatosAnticipoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionAnticipoCliente!=null) {
				this.jPanelPaginacionAnticipoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAnticipoCliente!=null) {
				this.jPanelParametrosReportesAnticipoCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAnticipoCliente!=null) {
				this.jScrollPanelDatosEdicionAnticipoCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAnticipoCliente!=null) {
				this.jTabbedPaneBusquedasAnticipoCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAnticipoCliente!=null) {
				this.jScrollPanelDatosAnticipoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionAnticipoCliente!=null) {
				this.jPanelPaginacionAnticipoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAnticipoCliente!=null) {
				this.jPanelParametrosReportesAnticipoCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAnticipoCliente!=null) {
				this.jScrollPanelDatosEdicionAnticipoCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAnticipoCliente!=null) {
				this.jTabbedPaneBusquedasAnticipoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAnticipoCliente!=null) {
				this.jScrollPanelDatosAnticipoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionAnticipoCliente!=null) {
				this.jPanelPaginacionAnticipoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAnticipoCliente!=null) {
				this.jPanelParametrosReportesAnticipoCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAnticipoCliente!=null) {
				this.jScrollPanelDatosEdicionAnticipoCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAnticipoCliente!=null) {
				this.jTabbedPaneBusquedasAnticipoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAnticipoCliente!=null) {
				this.jScrollPanelDatosAnticipoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionAnticipoCliente!=null) {
				this.jPanelPaginacionAnticipoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAnticipoCliente!=null) {
				this.jPanelParametrosReportesAnticipoCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAnticipoCliente!=null) {
				this.jScrollPanelDatosEdicionAnticipoCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAnticipoCliente!=null) {
				this.jTabbedPaneBusquedasAnticipoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAnticipoCliente!=null) {
				this.jScrollPanelDatosAnticipoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionAnticipoCliente!=null) {
				this.jPanelPaginacionAnticipoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAnticipoCliente!=null) {
				this.jPanelParametrosReportesAnticipoCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasAnticipoCliente!=null) {
					this.jTabbedPaneBusquedasAnticipoCliente.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesAnticipoCliente!=null) {
				this.jPanelParametrosReportesAnticipoCliente.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAnticipoCliente!=null) {
				this.jTabbedPaneBusquedasAnticipoCliente.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesAnticipoCliente!=null) {
				this.jPanelParametrosReportesAnticipoCliente.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAnticipoCliente.remove(jPanelFK_IdEmpleadoAnticipoCliente);}

			this.isVisibilidadFK_IdEstadoAntiCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoAntiCliente) {this.jTabbedPaneBusquedasAnticipoCliente.remove(jPanelFK_IdEstadoAntiClienteAnticipoCliente);}

			this.isVisibilidadFK_IdTipoGrupoFormaPago=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoGrupoFormaPago) {this.jTabbedPaneBusquedasAnticipoCliente.remove(jPanelFK_IdTipoGrupoFormaPagoAnticipoCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAnticipoCliente.remove(jPanelFK_IdEmpleadoAnticipoCliente);}

			this.isVisibilidadFK_IdEstadoAntiCliente=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstadoAntiCliente) {this.jTabbedPaneBusquedasAnticipoCliente.remove(jPanelFK_IdEstadoAntiClienteAnticipoCliente);}

			this.isVisibilidadFK_IdTipoGrupoFormaPago=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTipoGrupoFormaPago) {this.jTabbedPaneBusquedasAnticipoCliente.remove(jPanelFK_IdTipoGrupoFormaPagoAnticipoCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoAntiCliente(Boolean isParaEstadoAntiCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoAntiClienteNegation=!isParaEstadoAntiCliente;

			this.isVisibilidadFK_IdEmpleado=isParaEstadoAntiClienteNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAnticipoCliente.remove(jPanelFK_IdEmpleadoAnticipoCliente);}

			this.isVisibilidadFK_IdEstadoAntiCliente=isParaEstadoAntiCliente;
			if(!this.isVisibilidadFK_IdEstadoAntiCliente) {this.jTabbedPaneBusquedasAnticipoCliente.remove(jPanelFK_IdEstadoAntiClienteAnticipoCliente);}

			this.isVisibilidadFK_IdTipoGrupoFormaPago=isParaEstadoAntiClienteNegation;
			if(!this.isVisibilidadFK_IdTipoGrupoFormaPago) {this.jTabbedPaneBusquedasAnticipoCliente.remove(jPanelFK_IdTipoGrupoFormaPagoAnticipoCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoGrupoFormaPago(Boolean isParaTipoGrupoFormaPago){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoGrupoFormaPagoNegation=!isParaTipoGrupoFormaPago;

			this.isVisibilidadFK_IdEmpleado=isParaTipoGrupoFormaPagoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAnticipoCliente.remove(jPanelFK_IdEmpleadoAnticipoCliente);}

			this.isVisibilidadFK_IdEstadoAntiCliente=isParaTipoGrupoFormaPagoNegation;
			if(!this.isVisibilidadFK_IdEstadoAntiCliente) {this.jTabbedPaneBusquedasAnticipoCliente.remove(jPanelFK_IdEstadoAntiClienteAnticipoCliente);}

			this.isVisibilidadFK_IdTipoGrupoFormaPago=isParaTipoGrupoFormaPago;
			if(!this.isVisibilidadFK_IdTipoGrupoFormaPago) {this.jTabbedPaneBusquedasAnticipoCliente.remove(jPanelFK_IdTipoGrupoFormaPagoAnticipoCliente);}
		}
		
	}
	
	
	
	

	public String registrarSesionAnticipoClienteParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(anticipoclienteSessionBean==null) {
				anticipoclienteSessionBean=new AnticipoClienteSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(anticipoclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.anticipoclienteFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(AnticipoClienteConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionAnticipoCliente(true);
			//empleadoSessionBean.setlidAnticipoClienteActual(this.idAnticipoClienteActual);

			anticipoclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyAnticipoCliente(true);
			anticipoclienteSessionBean.setlIdAnticipoClienteActualForeignKey(this.idAnticipoClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//AnticipoClienteSessionBean anticipoclienteSessionBean=new AnticipoClienteSessionBean();
		
		if(this.anticipoclienteSessionBean==null) {
			this.anticipoclienteSessionBean=new AnticipoClienteSessionBean();
		}
		
		this.anticipoclienteSessionBean.setsUltimaBusquedaAnticipoCliente(this.getsAccionBusqueda());
		this.anticipoclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.anticipoclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			anticipoclienteSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			anticipoclienteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoAntiCliente")) {
			anticipoclienteSessionBean.setid_estado_anti_cliente(this.getid_estado_anti_clienteFK_IdEstadoAntiCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoGrupoFormaPago")) {
			anticipoclienteSessionBean.setid_tipo_grupo_forma_pago(this.getid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//AnticipoClienteSessionBean anticipoclienteSessionBean=new AnticipoClienteSessionBean();
		
		if(this.anticipoclienteSessionBean==null) {
			this.anticipoclienteSessionBean=new AnticipoClienteSessionBean();
		}
		
		if(this.anticipoclienteSessionBean.getsUltimaBusquedaAnticipoCliente()!=null&&!this.anticipoclienteSessionBean.getsUltimaBusquedaAnticipoCliente().equals("")) {
			this.setsAccionBusqueda(anticipoclienteSessionBean.getsUltimaBusquedaAnticipoCliente());
			this.setiNumeroPaginacion(anticipoclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(anticipoclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(anticipoclienteSessionBean.getid_empleado());
				anticipoclienteSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(anticipoclienteSessionBean.getid_empresa());
				anticipoclienteSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoAntiCliente")) {
				this.setid_estado_anti_clienteFK_IdEstadoAntiCliente(anticipoclienteSessionBean.getid_estado_anti_cliente());
				anticipoclienteSessionBean.setid_estado_anti_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoGrupoFormaPago")) {
				this.setid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago(anticipoclienteSessionBean.getid_tipo_grupo_forma_pago());
				anticipoclienteSessionBean.setid_tipo_grupo_forma_pago(-1L);
			}
		}
		
		this.anticipoclienteSessionBean.setsUltimaBusquedaAnticipoCliente("");
		this.anticipoclienteSessionBean.setiNumeroPaginacion(AnticipoClienteConstantesFunciones.INUMEROPAGINACION);
		this.anticipoclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaAnticipoCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAnticipoCliente() {
		this.updateBorderResaltarBusquedasFormularioAnticipoCliente();
		this.updateVisibilidadBusquedasFormularioAnticipoCliente();
		this.updateHabilitarBusquedasFormularioAnticipoCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioAnticipoCliente() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasAnticipoCliente.getComponents().length>0) {
	

		if(this.anticipoclienteConstantesFunciones.resaltarFK_IdEmpleadoAnticipoCliente!=null) {
			index= this.jTabbedPaneBusquedasAnticipoCliente.indexOfComponent(this.jPanelFK_IdEmpleadoAnticipoCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAnticipoCliente.getComponent(index);
				jPanel.setBorder(this.anticipoclienteConstantesFunciones.resaltarFK_IdEmpleadoAnticipoCliente);
			}
		}

		if(this.anticipoclienteConstantesFunciones.resaltarFK_IdEstadoAntiClienteAnticipoCliente!=null) {
			index= this.jTabbedPaneBusquedasAnticipoCliente.indexOfComponent(this.jPanelFK_IdEstadoAntiClienteAnticipoCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAnticipoCliente.getComponent(index);
				jPanel.setBorder(this.anticipoclienteConstantesFunciones.resaltarFK_IdEstadoAntiClienteAnticipoCliente);
			}
		}

		if(this.anticipoclienteConstantesFunciones.resaltarFK_IdTipoGrupoFormaPagoAnticipoCliente!=null) {
			index= this.jTabbedPaneBusquedasAnticipoCliente.indexOfComponent(this.jPanelFK_IdTipoGrupoFormaPagoAnticipoCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAnticipoCliente.getComponent(index);
				jPanel.setBorder(this.anticipoclienteConstantesFunciones.resaltarFK_IdTipoGrupoFormaPagoAnticipoCliente);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioAnticipoCliente() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasAnticipoCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAnticipoCliente.indexOfComponent(this.jPanelFK_IdEmpleadoAnticipoCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAnticipoCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.anticipoclienteConstantesFunciones.mostrarFK_IdEmpleadoAnticipoCliente);
			if(!this.anticipoclienteConstantesFunciones.mostrarFK_IdEmpleadoAnticipoCliente && index>-1) {
				this.jTabbedPaneBusquedasAnticipoCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasAnticipoCliente.indexOfComponent(this.jPanelFK_IdEstadoAntiClienteAnticipoCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAnticipoCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.anticipoclienteConstantesFunciones.mostrarFK_IdEstadoAntiClienteAnticipoCliente);
			if(!this.anticipoclienteConstantesFunciones.mostrarFK_IdEstadoAntiClienteAnticipoCliente && index>-1) {
				this.jTabbedPaneBusquedasAnticipoCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasAnticipoCliente.indexOfComponent(this.jPanelFK_IdTipoGrupoFormaPagoAnticipoCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAnticipoCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.anticipoclienteConstantesFunciones.mostrarFK_IdTipoGrupoFormaPagoAnticipoCliente);
			if(!this.anticipoclienteConstantesFunciones.mostrarFK_IdTipoGrupoFormaPagoAnticipoCliente && index>-1) {
				this.jTabbedPaneBusquedasAnticipoCliente.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioAnticipoCliente() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasAnticipoCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAnticipoCliente.indexOfComponent(this.jPanelFK_IdEmpleadoAnticipoCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAnticipoCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.anticipoclienteConstantesFunciones.activarFK_IdEmpleadoAnticipoCliente);
				this.jTabbedPaneBusquedasAnticipoCliente.setEnabledAt(index,this.anticipoclienteConstantesFunciones.activarFK_IdEmpleadoAnticipoCliente);
			}

			index= this.jTabbedPaneBusquedasAnticipoCliente.indexOfComponent(this.jPanelFK_IdEstadoAntiClienteAnticipoCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAnticipoCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.anticipoclienteConstantesFunciones.activarFK_IdEstadoAntiClienteAnticipoCliente);
				this.jTabbedPaneBusquedasAnticipoCliente.setEnabledAt(index,this.anticipoclienteConstantesFunciones.activarFK_IdEstadoAntiClienteAnticipoCliente);
			}

			index= this.jTabbedPaneBusquedasAnticipoCliente.indexOfComponent(this.jPanelFK_IdTipoGrupoFormaPagoAnticipoCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAnticipoCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.anticipoclienteConstantesFunciones.activarFK_IdTipoGrupoFormaPagoAnticipoCliente);
				this.jTabbedPaneBusquedasAnticipoCliente.setEnabledAt(index,this.anticipoclienteConstantesFunciones.activarFK_IdTipoGrupoFormaPagoAnticipoCliente);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaAnticipoCliente(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasAnticipoCliente.indexOfComponent(this.jPanelFK_IdEmpleadoAnticipoCliente);

			this.jTabbedPaneBusquedasAnticipoCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAnticipoCliente.getComponent(index);

			this.anticipoclienteConstantesFunciones.setResaltarFK_IdEmpleadoAnticipoCliente(resaltar);

			jPanel.setBorder(this.anticipoclienteConstantesFunciones.resaltarFK_IdEmpleadoAnticipoCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstadoAntiCliente")) {
			index= this.jTabbedPaneBusquedasAnticipoCliente.indexOfComponent(this.jPanelFK_IdEstadoAntiClienteAnticipoCliente);

			this.jTabbedPaneBusquedasAnticipoCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAnticipoCliente.getComponent(index);

			this.anticipoclienteConstantesFunciones.setResaltarFK_IdEstadoAntiClienteAnticipoCliente(resaltar);

			jPanel.setBorder(this.anticipoclienteConstantesFunciones.resaltarFK_IdEstadoAntiClienteAnticipoCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoGrupoFormaPago")) {
			index= this.jTabbedPaneBusquedasAnticipoCliente.indexOfComponent(this.jPanelFK_IdTipoGrupoFormaPagoAnticipoCliente);

			this.jTabbedPaneBusquedasAnticipoCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAnticipoCliente.getComponent(index);

			this.anticipoclienteConstantesFunciones.setResaltarFK_IdTipoGrupoFormaPagoAnticipoCliente(resaltar);

			jPanel.setBorder(this.anticipoclienteConstantesFunciones.resaltarFK_IdTipoGrupoFormaPagoAnticipoCliente);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarAnticipoCliente.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioAnticipoCliente() throws Exception {

		if(this.jInternalFrameDetalleFormAnticipoCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAnticipoCliente();
		this.updateVisibilidadResaltarControlesFormularioAnticipoCliente();
		this.updateHabilitarResaltarControlesFormularioAnticipoCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioAnticipoCliente() throws Exception {
		if(this.jInternalFrameDetalleFormAnticipoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.anticipoclienteConstantesFunciones.resaltaridAnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jLabelidAnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltaridAnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltarid_empresaAnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empresaAnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltarid_empresaAnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltarid_empleadoAnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empleadoAnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltarid_empleadoAnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltarid_estado_anti_clienteAnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_estado_anti_clienteAnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltarid_estado_anti_clienteAnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltarid_tipo_grupo_forma_pagoAnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltarid_tipo_grupo_forma_pagoAnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltarfechaAnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jDateChooserfechaAnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltarfechaAnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltarvalorAnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalorAnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltarvalorAnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltardescripcionAnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jTextAreadescripcionAnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltardescripcionAnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltarvalor_adicionalAnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalor_adicionalAnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltarvalor_adicionalAnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltarvalor_prestamoAnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalor_prestamoAnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltarvalor_prestamoAnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltaringreso1AnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso1AnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltaringreso1AnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltaringreso2AnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso2AnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltaringreso2AnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltaringreso3AnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso3AnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltaringreso3AnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltaringreso4AnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso4AnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltaringreso4AnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltaringreso5AnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso5AnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltaringreso5AnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltardescuento1AnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento1AnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltardescuento1AnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltardescuento2AnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento2AnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltardescuento2AnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltardescuento3AnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento3AnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltardescuento3AnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltardescuento4AnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento4AnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltardescuento4AnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltardescuento5AnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento5AnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltardescuento5AnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltartipo_ingresoAnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldtipo_ingresoAnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltartipo_ingresoAnticipoCliente);}
		if(this.anticipoclienteConstantesFunciones.resaltartipo_descuentoAnticipoCliente!=null && this.jInternalFrameDetalleFormAnticipoCliente!=null) {this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldtipo_descuentoAnticipoCliente.setBorder(this.anticipoclienteConstantesFunciones.resaltartipo_descuentoAnticipoCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAnticipoCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormAnticipoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
	
		//this.jInternalFrameDetalleFormAnticipoCliente.jLabelidAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostraridAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPanelidAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostraridAnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empresaAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrarid_empresaAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPanelid_empresaAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrarid_empresaAnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empleadoAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrarid_empleadoAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPanelid_empleadoAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrarid_empleadoAnticipoCliente);
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_empleadoAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrarid_empleadoAnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_estado_anti_clienteAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrarid_estado_anti_clienteAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPanelid_estado_anti_clienteAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrarid_estado_anti_clienteAnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrarid_tipo_grupo_forma_pagoAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPanelid_tipo_grupo_forma_pagoAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrarid_tipo_grupo_forma_pagoAnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jDateChooserfechaAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrarfechaAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPanelfechaAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrarfechaAnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalorAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrarvalorAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPanelvalorAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrarvalorAnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jTextAreadescripcionAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrardescripcionAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPaneldescripcionAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrardescripcionAnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalor_adicionalAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrarvalor_adicionalAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPanelvalor_adicionalAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrarvalor_adicionalAnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalor_prestamoAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrarvalor_prestamoAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPanelvalor_prestamoAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrarvalor_prestamoAnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso1AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostraringreso1AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPanelingreso1AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostraringreso1AnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso2AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostraringreso2AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPanelingreso2AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostraringreso2AnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso3AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostraringreso3AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPanelingreso3AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostraringreso3AnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso4AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostraringreso4AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPanelingreso4AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostraringreso4AnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso5AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostraringreso5AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPanelingreso5AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostraringreso5AnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento1AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrardescuento1AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPaneldescuento1AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrardescuento1AnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento2AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrardescuento2AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPaneldescuento2AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrardescuento2AnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento3AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrardescuento3AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPaneldescuento3AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrardescuento3AnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento4AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrardescuento4AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPaneldescuento4AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrardescuento4AnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento5AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrardescuento5AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPaneldescuento5AnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrardescuento5AnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldtipo_ingresoAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrartipo_ingresoAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPaneltipo_ingresoAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrartipo_ingresoAnticipoCliente);
		//this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldtipo_descuentoAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrartipo_descuentoAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jPaneltipo_descuentoAnticipoCliente.setVisible(this.anticipoclienteConstantesFunciones.mostrartipo_descuentoAnticipoCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAnticipoCliente() throws Exception {
		if(this.jInternalFrameDetalleFormAnticipoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAnticipoCliente!=null) {
	
		this.jInternalFrameDetalleFormAnticipoCliente.jLabelidAnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activaridAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empresaAnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activarid_empresaAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_empleadoAnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activarid_empleadoAnticipoCliente);
			this.jInternalFrameDetalleFormAnticipoCliente.jButtonid_empleadoAnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activarid_empleadoAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_estado_anti_clienteAnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activarid_estado_anti_clienteAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jComboBoxid_tipo_grupo_forma_pagoAnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activarid_tipo_grupo_forma_pagoAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jDateChooserfechaAnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activarfechaAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalorAnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activarvalorAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextAreadescripcionAnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activardescripcionAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalor_adicionalAnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activarvalor_adicionalAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldvalor_prestamoAnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activarvalor_prestamoAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso1AnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activaringreso1AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso2AnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activaringreso2AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso3AnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activaringreso3AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso4AnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activaringreso4AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldingreso5AnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activaringreso5AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento1AnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activardescuento1AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento2AnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activardescuento2AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento3AnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activardescuento3AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento4AnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activardescuento4AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFielddescuento5AnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activardescuento5AnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldtipo_ingresoAnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activartipo_ingresoAnticipoCliente);
		this.jInternalFrameDetalleFormAnticipoCliente.jTextFieldtipo_descuentoAnticipoCliente.setEnabled(this.anticipoclienteConstantesFunciones.activartipo_descuentoAnticipoCliente);
		}
	}
	
		
}